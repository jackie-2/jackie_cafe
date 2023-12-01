package com.jackie_cafe.main.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jackie_cafe.main.repository.MainDAO;
import com.jackie_cafe.main.repository.MenuVO;

@Service("mainService")
public class MainServiceImpl implements MainService {
	
	@Resource(name = "mainDAO")
	private MainDAO mainDAO;

	@Override
	public List<MenuVO> selectMajorMenu(MenuVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mainDAO.selectMajorMenu(vo);
	}

	@Override
	public List<Map<String, Object>> selectMinorMenu(Map<String,Object> commandMap) throws Exception {
		// TODO Auto-generated method stub
		return mainDAO.selectMinorMenu(commandMap);
	}
	
	
}
