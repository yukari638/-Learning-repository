package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.HeroForm;
import com.example.demo.entity.Hero;
import com.example.demo.mapper.HeroMapper;

/*
 *ヒーロー情報 Controller
 */

@Controller
public class HeroController {

	@Autowired
	HeroMapper heroMapper;
	
	/*
	 * ヒーロー情報一覧表示
	 */
	@GetMapping(value = "/index")
	public String heroList(Model model) {
		List<Hero> list = heroMapper.selectAll();
		model.addAttribute("list", list);
		return "index";
	}
	
	/**
	 * ヒーロー新規登録画面を表示
	 * @param model Model
	 * @return ヒーロー情報一覧画面
	 */
	@RequestMapping(value = "/hero/add", method = RequestMethod.GET)
	public String heroAdd(Model model) {
		model.addAttribute("heroForm", new HeroForm());
		return "hero/add";
	}
	
	/**
	 * ヒーロー新規登録
	 * @param heroForm リクエストデータ
	 * @param model Model
	 * @return ヒーロー情報一覧画面
	 */
	@RequestMapping(value="/hero/create", method=RequestMethod.POST)
    public String heroCreate(@ModelAttribute HeroForm heroForm, Model model) {
		// ヒーロー情報の登録
		heroMapper.insert(heroForm);
		return "redirect:/index";
	}
	
}
