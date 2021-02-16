package com.example.demo.dto;

/*
 * データを格納する箱
 * ヒーロー情報　リクエストデータ
 */

public class HeroForm {

	/*
	 * ID　自動で入る。
	 */
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	/*
	 * ヒーロー名
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * ヒーローパワー名
	 */
	private String powerName;
	
	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	/*
	 * ヒーローパワー発動型、コスト
	 */
	private String powerActivate;
	
	public String getPowerActivate() {
		return powerActivate;
	}

	public void setPowerActivate(String powerActivate) {
		this.powerActivate = powerActivate;
	}

	/*
	 * ヒーローパワー内容
	 */
	private String power;
	
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	/*
	 * ヒーローBan種族
	 */
	private String typeBan;
	
	public String getTypeBan() {
		return typeBan;
	}

	public void setTypeBan(String typeBan) {
		this.typeBan = typeBan;
	}	
}
