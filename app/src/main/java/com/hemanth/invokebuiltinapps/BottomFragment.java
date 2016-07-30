package com.hemanth.invokebuiltinapps;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hemanth on 30/07/16.
 */
public class BottomFragment extends Fragment {

    private static TextView imageTopText;
    private static TextView imageBottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        intiViews(view);
    }

    private void intiViews(View view){
        imageTopText = (TextView) view.findViewById(R.id.imageTopText);
        imageBottomText = (TextView) view.findViewById(R.id.imageBottomText);
    }

    public void setImageText(String top, String bottom){
        imageTopText.setText(top);
        imageBottomText.setText(bottom);
    }
}
