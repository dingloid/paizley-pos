package grayteam.paizley_pos.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import grayteam.paizley_pos.R;

/**
 * Created by Winston on 10/21/17.
 */

public class MenuItemFragment extends Fragment{
    String TAG ="MenuItemFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: menu frag created");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu_item_fragment, container, false);




        return rootView;
    }


}
