package com.jackie_cafe.servicecenter.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jackie_cafe.servicecenter.repository.NoticeDAO;
import com.jackie_cafe.servicecenter.repository.NoticeVO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
	
	@Resource(name = "noticeDAO")
	private NoticeDAO noticeDAO;

	@Override
	public List<Map<String, Object>> selectNoticeList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.selectNoticeList(map);
	}

	@Override
	public Integer insertNotice(NoticeVO vo) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.insertNotice(vo);
	}

	@Override
	public NoticeVO getBoardContents(int IDX) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getBoardContents(IDX);
	}

}
