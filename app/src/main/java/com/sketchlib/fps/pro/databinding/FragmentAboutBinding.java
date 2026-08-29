// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

public final class FragmentAboutBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear23;
    public final TextView textview29;
    public final TextView versionText;
    public final TextView textview30;
    public final TextView textview31;
    public final TextView textview32;
    public final TextView textview33;
    public final TextView textview34;

    private FragmentAboutBinding(NestedScrollView rootView, LinearLayout linear23, TextView textview29, TextView versionText, TextView textview30, TextView textview31, TextView textview32, TextView textview33, TextView textview34) {
        this.rootView = rootView;
        this.linear23 = linear23;
        this.textview29 = textview29;
        this.versionText = versionText;
        this.textview30 = textview30;
        this.textview31 = textview31;
        this.textview32 = textview32;
        this.textview33 = textview33;
        this.textview34 = textview34;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static FragmentAboutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentAboutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_about, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static FragmentAboutBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear23 = findChildViewById(view, R.id.linear23);
        TextView textview29 = findChildViewById(view, R.id.textview29);
        TextView versionText = findChildViewById(view, R.id.versionText);
        TextView textview30 = findChildViewById(view, R.id.textview30);
        TextView textview31 = findChildViewById(view, R.id.textview31);
        TextView textview32 = findChildViewById(view, R.id.textview32);
        TextView textview33 = findChildViewById(view, R.id.textview33);
        TextView textview34 = findChildViewById(view, R.id.textview34);

        if (linear23 == null || textview29 == null || versionText == null || textview30 == null || textview31 == null || textview32 == null || textview33 == null || textview34 == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new FragmentAboutBinding(rootView, linear23, textview29, versionText, textview30, textview31, textview32, textview33, textview34);
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