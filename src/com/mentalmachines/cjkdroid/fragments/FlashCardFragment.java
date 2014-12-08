package com.mentalmachines.cjkdroid.fragments;

import com.mentalmachines.cjkdroid.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FlashCardFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */

	public static final String ARG_SECTION_NUMBER = "section_number";

	public FlashCardFragment() {}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		final View view = inflater.inflate(R.layout.flash_card_fragment_layout, container, false);


		return view;
		
	}
}