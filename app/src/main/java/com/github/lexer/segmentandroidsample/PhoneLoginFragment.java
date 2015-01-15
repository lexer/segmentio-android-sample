package com.github.lexer.segmentandroidsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.segment.analytics.Analytics;
import com.segment.analytics.Properties;

/**
 * Created by zakharov on 1/13/15.
 */
public class PhoneLoginFragment extends Fragment {

    private Analytics analytics;

    public PhoneLoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        analytics = Analytics.with(getActivity());
        analytics.screen("landing", "phone_login");

        View view = inflater.inflate(R.layout.fragment_phone_login, container, false);

        Button submitButton = (Button) view.findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analytics.track("tap", new Properties()
                                .putValue("element", "submit_button")
                                .putValue("screen", "phone_login")
                );
            }
        });

        return view;
    }
}

