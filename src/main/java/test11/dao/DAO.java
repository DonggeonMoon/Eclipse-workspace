package test11.dao;

import java.util.List;

import test11.dto.TestDTO;

public interface DAO {
	
	public List<TestDTO> selectAll();
	public TestDTO selectOne(int no);
	public void insertOne(TestDTO dto);
	public void updateOne(TestDTO dto);
	public void deleteOne(int no);
}
