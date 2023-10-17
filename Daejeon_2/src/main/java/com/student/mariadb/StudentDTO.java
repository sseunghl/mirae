package com.student.mariadb;

public class StudentDTO {
	private int bunho;
	private String name;
	private int kor;
	private int mat;
	private int eng;
	private String schoolcode;
	
	public String getSchoolcode() {
		return schoolcode;
	}
	public void setSchoolcode(String schoolcode) {
		this.schoolcode = schoolcode;
	}
	public int getBunho() {
		return bunho;
	}
	public void setBunho(int bunho) {
		this.bunho = bunho;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
