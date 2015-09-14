package com.jnwan.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jnwan on 9/13/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
