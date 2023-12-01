package com.jackie_cafe.main.service;

import java.util.List;
import java.util.Map;

import com.jackie_cafe.main.repository.MenuVO;

public interface MainService {
	
	List<MenuVO> selectMajorMenu(MenuVO vo) throws Exception;
	List<Map<String, Object>> selectMinorMenu(Map<String,Object> commandMap) throws Exception;
}
