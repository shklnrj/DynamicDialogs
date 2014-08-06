package com.subtlecreation.dynamicdialouges;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment{

	public SecondFragment() {
	}
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View secondFragment = inflater.inflate(R.layout.second_dialouge, container, false);
		return secondFragment;
	}
}
