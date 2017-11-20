package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jack on 11/14/17.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
