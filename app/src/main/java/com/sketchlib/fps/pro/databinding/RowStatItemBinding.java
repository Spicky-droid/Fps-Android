// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class RowStatItemBinding {
    public final LinearLayout rootView;
    public final TextView statLabel;
    public final TextView statValue;

    private RowStatItemBinding(LinearLayout rootView, TextView statLabel, TextView statValue) {
        this.rootView = rootView;
        this.statLabel = statLabel;
        this.statValue = statValue;
    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static RowStatItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static RowStatItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.row_stat_item, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static RowStatItemBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;
        TextView statLabel = findChildViewById(view, R.id.statLabel);
        TextView statValue = findChildViewById(view, R.id.statValue);

        if (statLabel == null || statValue == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new RowStatItemBinding(rootView, statLabel, statValue);
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