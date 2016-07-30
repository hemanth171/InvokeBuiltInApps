package com.hemanth.invokebuiltinapps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by hemanth on 29/07/16.
 */
public class TopFragment extends Fragment implements View.OnClickListener {

    private static EditText topText;
    private static EditText bottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        view.findViewById(R.id.button).setOnClickListener(this);
    }

    private void initViews(View view){
        topText = (EditText) view.findViewById(R.id.topText);
        bottomText = (EditText) view.findViewById(R.id.bottomText);
    }

    @Override
    public void onClick(View view) {
        ((Container) getActivity()).createMeme(topText.getText().toString(), bottomText.getText().toString());
    }
}
