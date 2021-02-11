package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

/*
 * ヒーロー登録情報 Entity
 */

@Getter
@Setter
public class Hero {

	/*
	 * ID
	 */
	private Integer id;
	
	/*
	 * ヒーロー名
	 */
	private String name;
	
	/*
	 * ヒーローパワーの内容
	 */
	private String power;
	
}
