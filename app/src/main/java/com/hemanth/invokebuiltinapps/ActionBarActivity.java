package com.hemanth.invokebuiltinapps;

import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by hemanth on 18/07/16.
 */
public class ActionBarActivity extends FragmentActivity {

    public static Context myContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionbar);
        myContext = getApplicationContext();

        try {
            ActionBar actionbar = getActionBar();
            actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            actionbar.setDisplayShowTitleEnabled(true);

            ActionBar.Tab tab1 = actionbar.newTab().setText("Tab1");
            ActionBar.Tab tab2 = actionbar.newTab().setText("Tab2");
            /*ActionBar.Tab tab3 = actionbar.newTab().setText("Tab3");
            ActionBar.Tab tab4 = actionbar.newTab().setText("Tab4");*/

            Fragment fragment1 = new FirstFragment();
            Fragment fragment2 = new SecondFragment();

            tab1.setTabListener(new MyTabsListener(fragment1));
            tab2.setTabListener(new MyTabsListener(fragment2));

            actionbar.addTab(tab1);
            actionbar.selectTab(tab1);
            actionbar.addTab(tab2);
            /*actionbar.addTab(tab3);
            actionbar.addTab(tab4);*/
        } catch (Exception e) {
            Log.e("error from onCreate", e.toString());
            Log.e("error from onCreate", e.getStackTrace().toString());
        }
    }
}
