package com.mentalmachines.cjkdroid.fragments;

import com.mentalmachines.cjkdroid.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VerbConjugationFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Create a new TextView and set its text to the fragment's section
		// number argument value.
		
		final View view = inflater.inflate(R.layout.verb_conjugation_fragment_layout, container, false);

		return view;
	}
}