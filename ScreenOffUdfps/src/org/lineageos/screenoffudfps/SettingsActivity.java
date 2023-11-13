package org.lineageos.screenoffudfps;

import android.os.Bundle;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;
import com.android.settingslib.widget.R;

public class SettingsActivity extends CollapsingToolbarBaseActivity {

    private static final String TAG_SCREENOFFUDFPS = "screenoffudfps";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(R.id.content_frame,
                new SettingsFragment(), TAG_SCREENOFFUDFPS).commit();
    }
}
