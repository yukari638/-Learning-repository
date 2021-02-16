package com.example.demo.dto;

import lombok.Data;

/*
 * データを格納する箱
 * ヒーロー情報　リクエストデータ
 */

@Data
public class HeroForm {

	/*
	 * ID　自動で入る。
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
	 * ヒーローパワー
	 */
	private String power;
	
	/*
	 * ヒーローBan種族
	 */
	private String typeBan;
	
}
