// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class ItemRecommendationBinding {
    public final LinearLayout rootView;
    public final View view24;
    public final TextView recommendationText;

    private ItemRecommendationBinding(LinearLayout rootView, View view24, TextView recommendationText) {
        this.rootView = rootView;
        this.view24 = view24;
        this.recommendationText = recommendationText;
    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static ItemRecommendationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemRecommendationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.item_recommendation, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static ItemRecommendationBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;
        View view24 = findChildViewById(view, R.id.view24);
        TextView recommendationText = findChildViewById(view, R.id.recommendationText);

        if (view24 == null || recommendationText == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new ItemRecommendationBinding(rootView, view24, recommendationText);
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