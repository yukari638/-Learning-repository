package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.Hero;

/*
 * DBとのやりとり
 * xmlファイルに記載。
 */

@Mapper
public interface HeroMapper {
	
	List<Hero> selectAll();

}
