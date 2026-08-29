// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public final class MainBinding {
    public final ConstraintLayout rootView;
    public final FrameLayout fragmentContainer;
    public final BottomNavigationView bottomNav;

    private MainBinding(ConstraintLayout rootView, FrameLayout fragmentContainer, BottomNavigationView bottomNav) {
        this.rootView = rootView;
        this.fragmentContainer = fragmentContainer;
        this.bottomNav = bottomNav;
    }

    public ConstraintLayout getRoot() {
        return rootView;
    }

    public static MainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.main, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static MainBinding bind(View view) {
        ConstraintLayout rootView = (ConstraintLayout) view;
        FrameLayout fragmentContainer = findChildViewById(view, R.id.fragmentContainer);
        BottomNavigationView bottomNav = findChildViewById(view, R.id.bottomNav);

        if (fragmentContainer == null || bottomNav == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new MainBinding(rootView, fragmentContainer, bottomNav);
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