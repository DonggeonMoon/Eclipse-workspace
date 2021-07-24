package test11.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import test11.dao.DAO;
import test11.dto.TestDTO;

@Controller
public class TestController {
	
	@Autowired
	DAO dao;
	
	@RequestMapping("/testList")
	public String testList(Model model) {
		List<TestDTO> list = dao.selectAll(); 
		model.addAttribute("list", list);
		return "testList";
	}
	
	@RequestMapping("/testRead")
	public String testRead(Model model, int boardno) {
		model.addAttribute("data", dao.selectOne(boardno));
		return "testRead";
	}
	
	@RequestMapping("/testInsert")
	public String testInsert() {
		return "testForm";
	}
	
	@RequestMapping("/insertOk")
	public String testInsert2(@ModelAttribute TestDTO dto) {
		dao.insertOne(dto);
		return "redirect:/testList";
	}
	
	@RequestMapping("/testUpdate")
	public String testUpdate(Model model, int boardno) {
		model.addAttribute("data", dao.selectOne(boardno));
		return "testUpdate";
	}

	@RequestMapping("/updateOk")
	public String testUpdate2(@ModelAttribute TestDTO dto) {
		dao.updateOne(dto);
		return "redirect:/testList";
	}
	
	@RequestMapping(value="/testDelete", method=RequestMethod.GET)
	public String testDelete(@RequestParam int boardno) {
		dao.deleteOne(boardno);
		return "redirect:/testList";
	}
}
