package test11.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test11.dto.TestDTO;

public class TestDao implements DAO {
	
	SqlSession ss;
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<TestDTO> selectAll() {
		return ss.selectList("selectAll");
	}
	@Override
	public TestDTO selectOne(int no) {
		return ss.selectOne("selectOne", no);
	}
	@Override
	public void insertOne(TestDTO dto) {
		ss.insert("insertOne", dto);
		
	}
	@Override
	public void updateOne(TestDTO dto) {
		ss.update("updateOne", dto);	
	}
	@Override
	public void deleteOne(int no) {
		ss.delete("deleteOne", no);		
	}
}
