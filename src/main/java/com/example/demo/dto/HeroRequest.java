package com.example.demo.dto;

import lombok.Data;

/*
 * データを格納する箱
 * ヒーロー情報　リクエストデータ
 */

@Data
public class HeroRequest {

	/*
	 * ID
	 */
	private Integer id;
	
	/*
	 * ヒーロー名
	 */
	private String name;
	
	/*
	 * ヒーローパワー
	 */
	private String power;
}
