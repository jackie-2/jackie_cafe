package com.jackie_cafe.servicecenter.service;

import java.util.List;
import java.util.Map;

import com.jackie_cafe.servicecenter.repository.NoticeVO;

public interface NoticeService {
	List<Map<String, Object>> selectNoticeList(Map<String, Object> map) throws Exception;
	Integer insertNotice(NoticeVO vo) throws Exception;
	NoticeVO getBoardContents(int IDX) throws Exception;
}