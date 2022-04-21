package com.demoprojectgithub.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Controller {

	@PostMapping("/emp")
	public String employee() {
		return "pos work";

	}

}
