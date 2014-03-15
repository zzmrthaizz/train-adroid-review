package com.example.train_android_review;

public class Khach {
//Construct
	public Khach() {
		// TODO Auto-generated constructor stub
	}
	public Khach(String hoten, int sosach,int tongtien, boolean vip) {
		this.hoten = hoten;
		this.sosach = sosach;
		this.tongtien = tongtien;
		this.vip = vip;
	}
	
//astract
private String hoten;
private int sosach;
private int tongtien;
private boolean vip;
//get,set
public int ttongtien() {
	if (this.vip == true) {
		this.tongtien = (int) ((this.sosach*2000)*0.9);
		return tongtien;
	}
	else {
		this.tongtien = this.sosach*2000;
		return tongtien;
	}
	
}

public String getHoten() {
	return hoten;
}
public boolean getVip() {
	return vip;
}
public void setVip(boolean vip) {
	this.vip = vip;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public int getSosach() {
	return sosach;
}
public void setSosach(int sosach) {
	this.sosach = sosach;
}
public int getTongtien() {
	return tongtien;
}
public void setTongtien(int tongtien) {
	this.tongtien = tongtien;
}

};

