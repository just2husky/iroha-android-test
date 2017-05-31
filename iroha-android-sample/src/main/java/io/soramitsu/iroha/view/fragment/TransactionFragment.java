package io.soramitsu.iroha.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.soramitsu.iroha.R;

/**
 * Created by m on 2017/5/31.
 */

public class TransactionFragment extends Fragment {
    public static final String TAG = TransactionFragment.class.getSimpleName();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transaction, container, false);
        return view;
    }
}
