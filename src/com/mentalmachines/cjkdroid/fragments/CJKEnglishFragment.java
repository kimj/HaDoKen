package com.mentalmachines.cjkdroid.fragments;

import com.mentalmachines.cjkdroid.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class CJKEnglishFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";

	public CJKEnglishFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Create a new TextView and set its text to the fragment's section
		// number argument value.
		final View view = inflater.inflate(R.layout.cjk_english_fragment_layout, container, false);
		
		// TextView textView = view.findViewById(R.id.)
		// textView.setGravity(Gravity.CENTER);
		// textView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
		// return textView;
		return view;
	}
}