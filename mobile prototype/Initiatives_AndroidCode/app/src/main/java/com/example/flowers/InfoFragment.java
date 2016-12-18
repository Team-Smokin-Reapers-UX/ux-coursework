package com.example.flowers;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InfoFragment extends Fragment {

    private static final String KEY_CHECKED_BOX = "key_checked_box";

    private LinearLayout mInfoLinearLayout;
    private TextView mItemInfoText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int index = getArguments().getInt(ViewPagerFragment.KEY_GARDEN_INDEX);
        View view = inflater.inflate(R.layout.item_info, container, false);

        mInfoLinearLayout = (LinearLayout) view.findViewById(R.id.infoLayout);
        String info = Gardens.info[index];

        setUpTextViewCheckBox(info, mInfoLinearLayout);

        return view;
    }

    private void setUpTextViewCheckBox(String info, ViewGroup container) {

        mItemInfoText = new TextView(getActivity());
        mItemInfoText.setText(info);
        mItemInfoText.setTextSize(24f);
        mItemInfoText.setPadding(20, 20, 20, 20);
        container.addView(mItemInfoText);
    }
}
