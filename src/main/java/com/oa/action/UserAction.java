package com.oa.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oa.service.impl.IUserService;

@Controller
@RequestMapping("/index")
public class UserAction {
	@Resource
	private IUserService userService;
}
