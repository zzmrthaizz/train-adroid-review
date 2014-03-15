package com.example.train_android_review;
import java.util.ArrayList;

import com.example.train_android_review.Khach;

public class DsKhach {

	ArrayList<Khach>lsKhach = new ArrayList<Khach>();
	public void addKhach (Khach a) {
		lsKhach.add(a);
	}
	public int tongtien() {
		int s = 0;
		for (Khach khach:lsKhach){
			s = s+ khach.getTongtien();
		}
		return s;
	}
	public int tongkhach() {
		int s = 0;
		for (Khach khach:lsKhach){
			s = s+1;
		}
		return s;
	}public int tongvip() {
		int s = 0;
		for (Khach khach : lsKhach) {
			if (khach.getVip()) {
				s = s+1;
			}
		}
		return s;
	}
};
