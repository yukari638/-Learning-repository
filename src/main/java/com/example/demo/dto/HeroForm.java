package com.example.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/*
 * データを格納する箱
 * ヒーロー情報　フォームデータ
 */

public class HeroForm {

	//フィールド
	
	/* ID　自動で入る */
	private Integer id;
	
	/* ヒーロー名 */
	@NotBlank
	@Size(min=1, max=20, message="必須項目です。20文字以内で入力してください")
	private String name;
	
	/* ヒーローパワー名 */
	@Size(max=20, message="20文字以内で入力してください")
	private String powerName;
	
	/* ヒーローパワー発動型、コスト */
	@Size(max=5, message="５文字以内で入力してください")
	private String powerActivate;
	
	/* ヒーローパワー内容 */
	@Size(max=100, message="100文字以内で入力してください")
	private String power;
	
	/* ヒーローBan種族 */
	@Size(max=10, message="10文字以内で入力してください")
	private String typeBan;
	
	
	//メソッド
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String getPowerActivate() {
		return powerActivate;
	}

	public void setPowerActivate(String powerActivate) {
		this.powerActivate = powerActivate;
	}
	
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
	
	public String getTypeBan() {
		return typeBan;
	}

	public void setTypeBan(String typeBan) {
		this.typeBan = typeBan;
	}	
}
