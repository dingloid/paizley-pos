package grayteam.paizley_pos.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import grayteam.paizley_pos.R;

/**
 * Created by Winston on 10/21/17.
 */

public class OpenOrdersFragment extends Fragment {

    String TAG ="OpenOrdersFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: open order frag created");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.open_order_fragment, container, false);




        return rootView;
    }
}
