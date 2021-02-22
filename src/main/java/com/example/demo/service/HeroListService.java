package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.Hero;
import com.example.demo.dto.HeroForm;
import com.example.demo.mapper.HeroMapper;

/*
 * ヒーローリストに関わるサービスクラスです。
 * 
 *  @author yukari
 */

@Service
public class HeroListService {
	
	/* ヒーロー登録情報一覧のリポジトリ */
	@Autowired
	private HeroMapper mapper;
	
	/*
	 * ヒーロー登録情報一覧を全件検索して取得します。
	 * 
	 * @return ヒーロー登録情報の全件取得
	 */
	public List<Hero> searchAll() {
		return mapper.selectAll();
	}
	
	/*
	 * ヒーロー情報を登録します。
	 * 
	 * @param heroForm 登録するヒーロー情報
	 */
	@Transactional
	public void register(HeroForm heroForm) {
		mapper.insert(heroForm);
	}
	
}
