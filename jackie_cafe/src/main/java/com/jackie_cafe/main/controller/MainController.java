package com.jackie_cafe.main.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jackie_cafe.main.repository.MenuVO;
import com.jackie_cafe.main.service.MainService;

@Controller
public class MainController {
	
	@Resource(name="mainService")
	private MainService mainService;
	
	
	@RequestMapping("/main/menu.do")
	public String menu(Model model, MenuVO vo) throws Exception {
		List<MenuVO> list = mainService.selectMajorMenu(vo);
		model.addAttribute(list);
		return "/main/menu";
	}
	
	@RequestMapping("/main/menu2.do")
	public ModelAndView menu2 (Map<String,Object> commandMap, HttpServletRequest req) throws Exception {
		ModelAndView mv = new ModelAndView("/main/menu");
		List<Map<String,Object>> list = mainService.selectMinorMenu(commandMap);
		mv.addObject("list", list);
		req.setAttribute("minor", list);
		return mv;
	}

}
