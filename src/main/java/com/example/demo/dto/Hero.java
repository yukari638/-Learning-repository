package com.example.demo.dto;

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
	 * ヒーローパワー名
	 */
	private String powerName;
	
	/*
	 * ヒーローパワー発動型、コスト
	 */
	private String powerActivate;
	
	/*
	 * ヒーローパワーの内容
	 */
	private String power;
	
	/*
	 * ヒーローBan種族
	 */
	private String typeBan;
	
}
