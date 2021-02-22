package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.HeroForm;
import com.example.demo.service.HeroListService;

/**
 * @author yukari
 *
 * ヒーロー新規登録画面のコントローラー
 */

@Controller
@RequestMapping("/hero/add")
public class RegisterController {

	@Autowired
	private HeroListService service;
	
	/**
	 * ヒーロー新規登録画面を表示
	 * @param model Model
	 * @return ヒーロー情報一覧画面
	 */
	@GetMapping
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
	@PostMapping
    public String heroCreate(@Validated @ModelAttribute HeroForm heroForm, BindingResult result, Model model) {
		//入力値のエラー判断
		if (result.hasErrors()) {
			return "/hero/add";
		}
		// ヒーロー情報の登録
		service.register(heroForm);
		return "redirect:/";
	}
}
