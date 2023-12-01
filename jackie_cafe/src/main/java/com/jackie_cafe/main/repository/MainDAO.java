package com.jackie_cafe.main.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jackie_cafe.util.repository.AbstractDAO;

@Repository("mainDAO")
public class MainDAO extends AbstractDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE ="main.";
	
	public List<MenuVO> selectMajorMenu(MenuVO vo) throws Exception {
		return sqlSession.selectList(NAMESPACE + "selectMajorMenu");
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectMinorMenu(Map<String,Object> commandMap) throws Exception {
		//return sqlSession.selectList(NAMESPACE + "selectMinorMenu", commandMap);
		return (List<Map<String, Object>>)selectList(NAMESPACE+"selectMinorMenu", commandMap);
	}

}
