package com.example.train_android_review;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.example.train_android_review.DsKhach;

public class MainActivity extends Activity {

	DsKhach dsKhach = new DsKhach();
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		
		Button tinhtien = (Button) findViewById(R.id.btntinhtt);
		Button tiep = (Button) findViewById(R.id.btntiep);
		Button thongke = (Button) findViewById(R.id.btnthongke);
		final CheckBox vip = (CheckBox) findViewById(R.id.chklavip);
		
		final EditText tkKhach= (EditText) findViewById(R.id.edittongsokh);
		final EditText tkVip= (EditText) findViewById(R.id.edittongsokhlavip);
		final EditText tkTien=(EditText) findViewById(R.id.edittongdt);
		
		final EditText hoten = (EditText) findViewById(R.id.edittenkh);
		final EditText soluong = (EditText) findViewById(R.id.editsoluongsach);

		final TextView thanhtien = (TextView) findViewById(R.id.txtthanhtien);
		
		tinhtien.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				String ten = String.valueOf(hoten+"");
				
				int nsosach = Integer.parseInt(soluong.getText()+"");
				Khach khach = new Khach();
				khach.setHoten(ten+"");
				khach.setSosach(nsosach);
				khach.setTongtien(khach.ttongtien());
				khach.setVip(vip.isChecked());
				thanhtien.setText(khach.ttongtien()+"");
				dsKhach.addKhach(khach);
			}
		});
		tiep.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				hoten.setText("");
				soluong.setText("");
				hoten.requestFocus();
				
			}
		});
		thongke.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			tkKhach.setText(dsKhach.tongkhach()+"");
			tkTien.setText(dsKhach.tongtien()+"");
			tkVip.setText(dsKhach.tongvip()+"");
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
