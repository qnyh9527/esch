package com.zcec.fm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginAction {
	@RequestMapping("/loginon")
	public String loginOn(){
		return "success";
	}
	@RequestMapping("/login")
	@ResponseBody
	public String login(){
		return "success";
	}
}
