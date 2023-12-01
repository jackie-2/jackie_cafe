package com.jackie_cafe.servicecenter.repository;

import java.sql.Timestamp;

public class NoticeVO {
	
	private int IDX;
	private String CATEGORY;
	private String TITLE;
	private String CONTENTS;
	private String ATCH_NM;
	private Timestamp CREAT_DT;
	private Timestamp LATEST_DT;
	private int HIT_CNT;
	
	public int getIDX() {
		return IDX;
	}
	public void setIDX(int iDX) {
		IDX = iDX;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENTS() {
		return CONTENTS;
	}
	public void setCONTENTS(String cONTENTS) {
		CONTENTS = cONTENTS;
	}
	public String getATCH_NM() {
		return ATCH_NM;
	}
	public void setATCH_NM(String aTCH_NM) {
		ATCH_NM = aTCH_NM;
	}
	public Timestamp getCREAT_DT() {
		return CREAT_DT;
	}
	public void setCREAT_DT(Timestamp cREAT_DT) {
		CREAT_DT = cREAT_DT;
	}
	public Timestamp getLATEST_DT() {
		return LATEST_DT;
	}
	public void setLATEST_DT(Timestamp lATEST_DT) {
		LATEST_DT = lATEST_DT;
	}
	public int getHIT_CNT() {
		return HIT_CNT;
	}
	public void setHIT_CNT(int hIT_CNT) {
		HIT_CNT = hIT_CNT;
	}
	
	
	
}
