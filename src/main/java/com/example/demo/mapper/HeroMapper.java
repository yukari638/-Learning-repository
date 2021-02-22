package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.HeroForm;
import com.example.demo.entity.Hero;

/*
 * DBとのやりとり
 * xmlファイルに記載。
 */

@Mapper
public interface HeroMapper {
	
	//herosTable内全てを取得
	List<Hero> selectAll();
	
	//Table:herosに新規登録
	void insert(HeroForm heroFrom);

}
