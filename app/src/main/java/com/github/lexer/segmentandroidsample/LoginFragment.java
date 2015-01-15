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
 * A placeholder fragment containing a simple view.
 */
public class LoginFragment extends Fragment {

    private Analytics analytics;

    public LoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        analytics = Analytics.with(getActivity());
        analytics.screen("landing", "login");

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button loginButton = (Button) view.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analytics.track("tap", new Properties()
                        .putValue("element", "login_button")
                        .putValue("screen", "login")
                );

                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new PhoneLoginFragment())
                        .commit();
            }
        });

        return view;
    }
}
