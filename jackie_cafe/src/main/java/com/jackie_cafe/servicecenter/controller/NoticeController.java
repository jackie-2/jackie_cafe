package com.jackie_cafe.servicecenter.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jackie_cafe.servicecenter.repository.NoticeVO;
import com.jackie_cafe.servicecenter.service.NoticeService;

@Controller
public class NoticeController {
	
	@Resource(name="noticeService")
	private NoticeService noticeService;
	
	@RequestMapping("/servicecenter/notice.do")
	public ModelAndView noticeList (Map<String,Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/servicecenter/notice");
		List<Map<String,Object>> list = noticeService.selectNoticeList(commandMap);
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/servicecenter/notice_write.do")
	public String notice_write() throws Exception {
		return "/servicecenter/notice_write";
	}
	
	@RequestMapping(value = "/servicecenter/notice_detail.do", method = RequestMethod.GET)
	public String notice_detail(@ModelAttribute("NoticeVO") NoticeVO vo, @RequestParam("IDX") int IDX, Model model) throws Exception {
		NoticeVO noticeContents = noticeService.getBoardContents(IDX);
		model.addAttribute("noticeContents", noticeContents);
		return "/servicecenter/notice_detail";
	}
	
	@RequestMapping("/servicecenter/notice_insert.do")
	public String notice_insert (Model model, NoticeVO vo) throws Exception {
		int Insert = noticeService.insertNotice(vo);
		model.addAttribute(Insert);
		return "redirect:/servicecenter/notice.do";
	}

}
