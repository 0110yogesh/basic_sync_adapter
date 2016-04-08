package com.sachinshinde.lollipopappcompatskeleton.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sachinshinde.lollipopappcompatskeleton.R;

/**
 * Created by Yogesh on 8/4/16.
 * Bookmypacket.com
 * yogesh.upadhyay@bookmypacket.com
 */
public class Non_payment_fragment extends Fragment {
    private static final String KEY_POSITION = "position";
    View progress;
    public static Non_payment_fragment newInstance(int position) {
        Non_payment_fragment frag = new Non_payment_fragment();
        Bundle args = new Bundle();

        args.putInt(KEY_POSITION, position);
        frag.setArguments(args);

        return (frag);
    }
    public static String getTitle(int position) {
        return "Non payment";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.non_paymentlayout, null);
        return result;

    }
}
