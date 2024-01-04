package com.yourbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {


	@RequestMapping("/login")
	@ResponseBody
	public String logIn(HttpServletRequest req) {

		return "log in success";
	}
}