package com.sayhello.meetup;

import com.example.meetup.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginNow extends Fragment {
	static EditText contact, password;
	static String lcontact,lpassword;
	static Button login;
	
	public LoginNow(){
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.login,
				container, false);
		contact=(EditText)rootView.findViewById(R.id.loginno);
		password=(EditText)rootView.findViewById(R.id.loginpassword);
		login=(Button)rootView.findViewById(R.id.login);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lcontact=contact.getText().toString();
				lpassword=password.getText().toString();
				
			}
		});
				
		return rootView;
	}

}
