package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.Date;

/**
 * Created by Jack on 12/10/17.
 */

public class DatePickerActivity extends SingleFragmentActivity {

    private static Date dateObj;

    protected Fragment createFragment() {
        return new DatePickerFragment().newInstance(dateObj);
    }

    public static Intent newIntent(Context packageContext, Date date) {
        Intent intent = new Intent(packageContext, DatePickerActivity.class);

        dateObj = date;

        return intent;
    }

}
