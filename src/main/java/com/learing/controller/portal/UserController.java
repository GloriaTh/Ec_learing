package com.learing.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Gloria
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "login.do",method=RequestMethod.POST)
	public Object login(String username, String password) {
		return null;
	}
}
