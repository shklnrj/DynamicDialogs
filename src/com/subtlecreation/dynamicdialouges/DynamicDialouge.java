package com.subtlecreation.dynamicdialouges;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DynamicDialouge extends DialogFragment{
	static DynamicDialouge newInstance(){
		return new DynamicDialouge();
	}
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View containerView = inflater.inflate(R.layout.container_dialouge, container);
		FragmentManager fm = getChildFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		int mathRandomValue = (int)(Math.random()*Integer.MAX_VALUE);
		/*
		 * Put your different conditions for generating different fragments here.
		 */				
		if((mathRandomValue)%2==0){
			ft.replace(R.id.container, new FirstFragment());
		}else{
			ft.replace(R.id.container, new SecondFragment());
		}
		ft.commit();
		return containerView;
	}
}
