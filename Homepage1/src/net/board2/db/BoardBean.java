package net.board2.db;

import java.sql.Date;

public class BoardBean {
	private int BOARD_NUM;
	private String BOARD_NAME;
	private String BOARD_PASS;
	private String BOARD_SUBJECT;
	private String BOARD_CONTENT;
	private String BOARD_FILE;
	private int BOARD_RE_REF;
	private int BOARD_RE_LEV;
	private int BOARD_RE_SEQ;
	private int BOARD_READCOUNT;
	private Date BOARD_DATE;
	
	private int BOARD2RE_NUM;
	private String BOARD2RE_NAME;
	private String BOARD2RE_PASS;
	private String BOARD2RE_CONTENT;
	private Date BOARD2RE_DATE;
	
	
	public int getBOARD_NUM() {
		return BOARD_NUM;
	}
	public void setBOARD_NUM(int board_num) {
		BOARD_NUM = board_num;
	}
	public String getBOARD_NAME() {
		return BOARD_NAME;
	}
	public void setBOARD_NAME(String board_name) {
		BOARD_NAME = board_name;
	}
	public String getBOARD_PASS() {
		return BOARD_PASS;
	}
	public void setBOARD_PASS(String board_pass) {
		BOARD_PASS = board_pass;
	}
	public String getBOARD_SUBJECT() {
		return BOARD_SUBJECT;
	}
	public void setBOARD_SUBJECT(String board_subject) {
		BOARD_SUBJECT = board_subject;
	}
	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}
	public void setBOARD_CONTENT(String board_content) {
		BOARD_CONTENT = board_content;
	}
	public String getBOARD_FILE() {
		return BOARD_FILE;
	}
	public void setBOARD_FILE(String board_file) {
		BOARD_FILE = board_file;
	}
	public int getBOARD_RE_REF() {
		return BOARD_RE_REF;
	}
	public void setBOARD_RE_REF(int board_re_ref) {
		BOARD_RE_REF = board_re_ref;
	}
	public int getBOARD_RE_LEV() {
		return BOARD_RE_LEV;
	}
	public void setBOARD_RE_LEV(int board_re_lev) {
		BOARD_RE_LEV = board_re_lev;
	}
	public int getBOARD_RE_SEQ() {
		return BOARD_RE_SEQ;
	}
	public void setBOARD_RE_SEQ(int board_re_seq) {
		BOARD_RE_SEQ = board_re_seq;
	}
	public int getBOARD_READCOUNT() {
		return BOARD_READCOUNT;
	}
	public void setBOARD_READCOUNT(int board_readcount) {
		BOARD_READCOUNT = board_readcount;
	}
	public Date getBOARD_DATE() {
		return BOARD_DATE;
	}
	public void setBOARD_DATE(Date board_date) {
		BOARD_DATE = board_date;
	}
	
	
	public int getBOARD2RE_NUM() {
		return BOARD2RE_NUM;
	}
	public void setBOARD2RE_NUM(int board2re_num) {
		BOARD2RE_NUM = board2re_num;
	}
	public String getBOARD2RE_NAME() {
		return BOARD2RE_NAME;
	}
	public void setBOARD2RE_NAME(String board2re_name) {
		BOARD2RE_NAME = board2re_name;
	}
	public String getBOARD2RE_PASS() {
		return BOARD2RE_PASS;
	}
	public void setBOARD2RE_PASS(String board2re_pass) {
		BOARD2RE_PASS = board2re_pass;
	}
	public String getBOARD2RE_CONTENT() {
		return BOARD2RE_CONTENT;
	}
	public void setBOARD2RE_CONTENT(String board2re_content) {
		BOARD2RE_CONTENT = board2re_content;
	}
	public Date getBOARD2RE_DATE() {
		return BOARD2RE_DATE;
	}
	public void setBOARD2RE_DATE(Date board2re_date) {
		BOARD2RE_DATE = board2re_date;
	}

}