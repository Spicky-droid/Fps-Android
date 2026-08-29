// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class ItemAppUsageBinding {
    public final LinearLayout rootView;
    public final TextView usageAppName;
    public final TextView usageDetail;

    private ItemAppUsageBinding(LinearLayout rootView, TextView usageAppName, TextView usageDetail) {
        this.rootView = rootView;
        this.usageAppName = usageAppName;
        this.usageDetail = usageDetail;
    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static ItemAppUsageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemAppUsageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.item_app_usage, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static ItemAppUsageBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;
        TextView usageAppName = findChildViewById(view, R.id.usageAppName);
        TextView usageDetail = findChildViewById(view, R.id.usageDetail);

        if (usageAppName == null || usageDetail == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new ItemAppUsageBinding(rootView, usageAppName, usageDetail);
    }

    private static <T extends View> T findChildViewById(View rootView, int id) {
         if (rootView instanceof ViewGroup) {
              ViewGroup rootViewGroup = (ViewGroup) rootView;
              for (int i = 0; i < rootViewGroup.getChildCount(); i++) {
                   T view = rootViewGroup.getChildAt(i).findViewById(id);
                   if (view != null) return view;
              }
         }
         return null;
    }
}