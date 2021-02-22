package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Hero;
import com.example.demo.service.HeroListService;

/*
 *ヒーロー情報 Controller
 */

@Controller
@RequestMapping
public class HeroController {

	@Autowired
	private HeroListService service;
	
	/**
	 * トップページ
	 * 
	 * @param model 登録済みのヒーローリスト
	 * @return index.html ヒートーリストの表示
	 */
	@GetMapping
	public String heroList(Model model) {
		List<Hero> list = service.searchAll();
		model.addAttribute("list", list);
		return "index";
	}
	
}
