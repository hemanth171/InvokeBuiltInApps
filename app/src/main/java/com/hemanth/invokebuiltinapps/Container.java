package com.hemanth.invokebuiltinapps;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by hemanth on 29/07/16.
 */
public class Container extends ActionBarActivity implements TopListenerView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);

        FragmentManager fragManager = getFragmentManager();
        Fragment topReplacingFragment = new TopFragment();
        Fragment bottomReplacingFragment = new BottomFragment();
        FragmentTransaction fragmentTransaction = fragManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        fragmentTransaction.replace(R.id.topContainer, topReplacingFragment, "topContainer");
        fragmentTransaction.replace(R.id.bottomContainer, bottomReplacingFragment, "bottomContainer");
        fragmentTransaction.commit();
    }

    @Override
    public void createMeme(String top, String bottom) {
        BottomFragment bottomFragment = new BottomFragment();
        bottomFragment.setImageText(top, bottom);
    }
}
