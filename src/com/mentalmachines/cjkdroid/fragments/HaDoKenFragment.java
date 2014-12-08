package com.mentalmachines.cjkdroid.fragments;

import android.net.ParseException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mentalmachines.cjkdroid.R;
import com.mentalmachines.cjkdroid.SimpleWikiHelper;
import com.mentalmachines.cjkdroid.R.id;
import com.mentalmachines.cjkdroid.R.layout;
import com.mentalmachines.cjkdroid.SimpleWikiHelper.ApiException;

import de.tudarmstadt.ukp.wikipedia.parser.Link;
import de.tudarmstadt.ukp.wikipedia.parser.ParsedPage;
import de.tudarmstadt.ukp.wikipedia.parser.Section;
import de.tudarmstadt.ukp.wikipedia.parser.mediawiki.MediaWikiParser;
import de.tudarmstadt.ukp.wikipedia.parser.mediawiki.MediaWikiParserFactory;

public class HaDoKenFragment extends Fragment {
	/** Called when the activity is first created. */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final View view = inflater.inflate(R.layout.ha_do_ken_fragment, container, false);
		// String sResult = new String();
		final Button searchButton = (Button) view.findViewById(R.id.buttonSearch);
		searchButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// grab @+id/searchString and send this to the xml request handler
				final EditText searchText = (EditText) view.findViewById(R.id.editTextSearch);
				final TextView resultsText = (TextView) view.findViewById(R.id.textViewResults);
				String pageContent = null;
				
				// get a ParsedPage object
				MediaWikiParserFactory pf = new MediaWikiParserFactory();
				MediaWikiParser parser = pf.createParser();
				ParsedPage pp = parser.parse(pageContent);
				                
				// only the links to other Wikipedia language editions
				for (Link language : pp.getLanguages()) {
				    System.out.println(language.getTarget());
				}
				    
				//get the internal links of each section
				for (Section section : pp.getSections()){
				    System.out.println("Section: " + section.getTitle());

				    for (Link link : section.getLinks(Link.type.INTERNAL)) {
				        System.out.println("  " + link.getTarget());
				    }
				}

				try {
	                SimpleWikiHelper.prepareUserAgent(getActivity().getApplicationContext());
	                try {
						pageContent = SimpleWikiHelper.getPageContent("" + searchText.getText(), false);
					} catch (com.mentalmachines.cjkdroid.SimpleWikiHelper.ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                Log.w("HadoKen", pageContent);
	            } catch (ApiException e) {
	                Log.e("WordWidget", "Couldn't contact API", e);
	            } catch (ParseException e) {
	                Log.e("WordWidget", "Couldn't parse API response", e);
	            }
	            
				resultsText.setText(pageContent);
			}
		});
		return view;
	}
}