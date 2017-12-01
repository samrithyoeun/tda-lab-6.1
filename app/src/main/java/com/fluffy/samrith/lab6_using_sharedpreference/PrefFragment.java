package com.fluffy.samrith.lab6_using_sharedpreference;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

public class PrefFragment extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PreferenceManager.setDefaultValues(getActivity(),R.xml.myapppreference,false);

        // load the preference from an XML resource
        addPreferencesFromResource(R.xml.myapppreference);
    }
}
