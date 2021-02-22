package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.Hero;
import com.example.demo.dto.HeroForm;
import com.example.demo.service.HeroListService;

/*
 *ヒーロー情報 Controller
 */

@Controller
public class HeroController {

	@Autowired
	private HeroListService service;
	
	/*
	 * ヒーロー情報一覧表示
	 */
	@GetMapping(value = "/index")
	public String heroList(Model model) {
		List<Hero> list = service.searchAll();
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
	 * @param heroForm フォームデータ
	 * @param model Model
	 * @return ヒーロー情報一覧画面
	 */
	@RequestMapping(value="/hero/add", method=RequestMethod.POST)
    public String heroCreate(@Validated @ModelAttribute HeroForm heroForm, BindingResult result, Model model) {
		//入力値のエラー判断
		if (result.hasErrors()) {
			return "/hero/add";
		}
		// ヒーロー情報の登録
		service.register(heroForm);
		return "redirect:/index";
	}
	
}
