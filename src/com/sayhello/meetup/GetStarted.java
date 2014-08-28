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



public class GetStarted extends Fragment {
	static EditText name, contact, password;	
	static Button submit;
	static String dname, dcontact, dpassword;
public GetStarted(){

}

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.registration,
				container, false);
		name=(EditText)rootView.findViewById(R.id.ename);
		contact=(EditText)rootView.findViewById(R.id.econtactno);
		password=(EditText)rootView.findViewById(R.id.epassword);
		submit=(Button)rootView.findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dname=name.getText().toString();
				dcontact=contact.getText().toString();
				dpassword=password.getText().toString();
				
			}
		});
		return rootView;
		
	
	}
}
