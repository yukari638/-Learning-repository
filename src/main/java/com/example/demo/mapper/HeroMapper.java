package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Hero;
import com.example.demo.dto.HeroForm;

/*
 * DBとのやりとり
 * xmlファイルに記載。
 */

@Mapper
public interface HeroMapper {
	
	//herosTable内全て検索、取得
	List<Hero> selectAll();
	
	//herosTableに新規登録
	void insert(HeroForm heroForm);

}
