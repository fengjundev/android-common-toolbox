package com.feng.android.common.util;

import android.content.Context;
import android.widget.Toast;

public final class T {

    private static T instance;
    private Toast mToast;

    private T(Context context) {
        if (null == mToast) {
            mToast = Toast.makeText(context.getApplicationContext(), "", Toast.LENGTH_LONG);
            //mToast.setGravity(Gravity.CENTER, 0, 0);
        }
    }

    public static T getInstance(Context context) {
        if (null == instance) {
            instance = new T(context.getApplicationContext());
        }
        return instance;
    }

    /**
     * toast show
     *
     * @param text
     */
    public void l(String text) {
        if (null == mToast) {
            return;
        }
        mToast.setText(text);
        mToast.setDuration(Toast.LENGTH_LONG);
        //mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }

    /**
     * toast show
     *
     * @param context
     * @param text
     */
    public void l(int textID) {
        if (null == mToast) {
            return;
        }
        mToast.setText(textID);
        //mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.setDuration(Toast.LENGTH_LONG);
        mToast.show();
    }

    /**
     * toast show
     *
     * @param context
     * @param text
     */
    public void s(String text) {
        if (null == mToast) {
            return;
        }
        mToast.setText(text);
        //mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.show();
    }

    /**
     * toast show
     *
     * @param context
     * @param text
     */
    public void s(int textID) {
        if (null == mToast) {
            return;
        }
        mToast.setText(textID);
        //mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.show();
    }

    /**
     * toast cancel ( Normally, it can be used when we exit the application )
     */
    public void cancel() {
        if (null == mToast) {
            return;
        }
        mToast.cancel();
    }
}
