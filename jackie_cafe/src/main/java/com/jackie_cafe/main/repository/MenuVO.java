package com.jackie_cafe.main.repository;

public class MenuVO {
	
	private String MAJOR_CATEGORY;
	private String MINOR_CATEGORY;
	private Integer MINOR_TURN;
	
	public String getMAJOR_CATEGORY() {
		return MAJOR_CATEGORY;
	}
	public void setMAJOR_CATEGORY(String mAJOR_CATEGORY) {
		MAJOR_CATEGORY = mAJOR_CATEGORY;
	}
	public String getMINOR_CATEGORY() {
		return MINOR_CATEGORY;
	}
	public void setMINOR_CATEGORY(String mINOR_CATEGORY) {
		MINOR_CATEGORY = mINOR_CATEGORY;
	}
	public Integer getMINOR_TURN() {
		return MINOR_TURN;
	}
	public void setMINOR_TURN(Integer mINOR_TURN) {
		MINOR_TURN = mINOR_TURN;
	}

}
