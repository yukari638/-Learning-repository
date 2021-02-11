package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Hero;
import com.example.demo.mapper.HeroMapper;

/*
 *ヒーロー情報 Controller
 */

@Controller
public class HeroController {

	@Autowired
	HeroMapper heroMapper;
	
	@GetMapping(value = "/")
	public String heroList(Model model) {
		List<Hero> list = heroMapper.selectAll();
		model.addAttribute("list", list);
		return "index";
	}
	
}
