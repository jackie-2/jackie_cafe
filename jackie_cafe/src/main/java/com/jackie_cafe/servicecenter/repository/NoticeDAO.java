package com.jackie_cafe.servicecenter.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jackie_cafe.util.repository.AbstractDAO;

@Repository("noticeDAO")
public class NoticeDAO extends AbstractDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "notice.";
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectNoticeList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList(NAMESPACE+"selectNoticeList", map);
	}
	
	public Integer insertNotice(NoticeVO vo) throws Exception {
		return sqlSession.insert(NAMESPACE + "insertNotice", vo);
	}
	
	public NoticeVO getBoardContents(int IDX) throws Exception {
		return sqlSession.selectOne(NAMESPACE + "getBoardContents", IDX);
	}; 
	
}
