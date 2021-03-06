package com.example.android.medex;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.List;

public class WrongDialog extends Dialog implements View.OnClickListener {

    Activity mActivity;
    Button close;

    public WrongDialog(@NonNull Activity activity) {
        super(activity);
        this.mActivity = activity;
    }

    public WrongDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected WrongDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.failed_dialog);
        close = findViewById(R.id.btn_close);
        close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        dismiss();
        mActivity.getFragmentManager().popBackStackImmediate();
        FragmentTransaction fragmentTransaction = mActivity.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_window, new HomeFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, @Nullable Menu menu, int deviceId) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
