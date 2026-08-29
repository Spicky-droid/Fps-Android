// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public final class FragmentPerformanceSettingsBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear15;
    public final MaterialCardView cardview5;
    public final LinearLayout linear16;
    public final TextView textview16;
    public final TextView textview17;
    public final MaterialButton btnCleanMemory;
    public final MaterialCardView cardview6;
    public final LinearLayout linear17;
    public final TextView textview18;
    public final TextView thermalStatusValue;
    public final MaterialCardView cardview7;
    public final LinearLayout linear18;
    public final LinearLayout linear19;
    public final TextView textview19;
    public final MaterialButton btnRefreshRecommendations;
    public final RecyclerView recommendationsList;
    public final MaterialCardView cardview8;
    public final LinearLayout linear20;
    public final TextView textview20;
    public final TextView textview21;
    public final MaterialButton btnGrantUsageAccess;
    public final RecyclerView recentAppsList;
    public final MaterialCardView cardview9;
    public final LinearLayout linear21;
    public final TextView textview22;
    public final TextView noGamesText;
    public final RecyclerView gamesList;

    private FragmentPerformanceSettingsBinding(NestedScrollView rootView, LinearLayout linear15, MaterialCardView cardview5, LinearLayout linear16, TextView textview16, TextView textview17, MaterialButton btnCleanMemory, MaterialCardView cardview6, LinearLayout linear17, TextView textview18, TextView thermalStatusValue, MaterialCardView cardview7, LinearLayout linear18, LinearLayout linear19, TextView textview19, MaterialButton btnRefreshRecommendations, RecyclerView recommendationsList, MaterialCardView cardview8, LinearLayout linear20, TextView textview20, TextView textview21, MaterialButton btnGrantUsageAccess, RecyclerView recentAppsList, MaterialCardView cardview9, LinearLayout linear21, TextView textview22, TextView noGamesText, RecyclerView gamesList) {
        this.rootView = rootView;
        this.linear15 = linear15;
        this.cardview5 = cardview5;
        this.linear16 = linear16;
        this.textview16 = textview16;
        this.textview17 = textview17;
        this.btnCleanMemory = btnCleanMemory;
        this.cardview6 = cardview6;
        this.linear17 = linear17;
        this.textview18 = textview18;
        this.thermalStatusValue = thermalStatusValue;
        this.cardview7 = cardview7;
        this.linear18 = linear18;
        this.linear19 = linear19;
        this.textview19 = textview19;
        this.btnRefreshRecommendations = btnRefreshRecommendations;
        this.recommendationsList = recommendationsList;
        this.cardview8 = cardview8;
        this.linear20 = linear20;
        this.textview20 = textview20;
        this.textview21 = textview21;
        this.btnGrantUsageAccess = btnGrantUsageAccess;
        this.recentAppsList = recentAppsList;
        this.cardview9 = cardview9;
        this.linear21 = linear21;
        this.textview22 = textview22;
        this.noGamesText = noGamesText;
        this.gamesList = gamesList;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static FragmentPerformanceSettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentPerformanceSettingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_performance_settings, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static FragmentPerformanceSettingsBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear15 = findChildViewById(view, R.id.linear15);
        MaterialCardView cardview5 = findChildViewById(view, R.id.cardview5);
        LinearLayout linear16 = findChildViewById(view, R.id.linear16);
        TextView textview16 = findChildViewById(view, R.id.textview16);
        TextView textview17 = findChildViewById(view, R.id.textview17);
        MaterialButton btnCleanMemory = findChildViewById(view, R.id.btnCleanMemory);
        MaterialCardView cardview6 = findChildViewById(view, R.id.cardview6);
        LinearLayout linear17 = findChildViewById(view, R.id.linear17);
        TextView textview18 = findChildViewById(view, R.id.textview18);
        TextView thermalStatusValue = findChildViewById(view, R.id.thermalStatusValue);
        MaterialCardView cardview7 = findChildViewById(view, R.id.cardview7);
        LinearLayout linear18 = findChildViewById(view, R.id.linear18);
        LinearLayout linear19 = findChildViewById(view, R.id.linear19);
        TextView textview19 = findChildViewById(view, R.id.textview19);
        MaterialButton btnRefreshRecommendations = findChildViewById(view, R.id.btnRefreshRecommendations);
        RecyclerView recommendationsList = findChildViewById(view, R.id.recommendationsList);
        MaterialCardView cardview8 = findChildViewById(view, R.id.cardview8);
        LinearLayout linear20 = findChildViewById(view, R.id.linear20);
        TextView textview20 = findChildViewById(view, R.id.textview20);
        TextView textview21 = findChildViewById(view, R.id.textview21);
        MaterialButton btnGrantUsageAccess = findChildViewById(view, R.id.btnGrantUsageAccess);
        RecyclerView recentAppsList = findChildViewById(view, R.id.recentAppsList);
        MaterialCardView cardview9 = findChildViewById(view, R.id.cardview9);
        LinearLayout linear21 = findChildViewById(view, R.id.linear21);
        TextView textview22 = findChildViewById(view, R.id.textview22);
        TextView noGamesText = findChildViewById(view, R.id.noGamesText);
        RecyclerView gamesList = findChildViewById(view, R.id.gamesList);

        if (linear15 == null || cardview5 == null || linear16 == null || textview16 == null || textview17 == null || btnCleanMemory == null || cardview6 == null || linear17 == null || textview18 == null || thermalStatusValue == null || cardview7 == null || linear18 == null || linear19 == null || textview19 == null || btnRefreshRecommendations == null || recommendationsList == null || cardview8 == null || linear20 == null || textview20 == null || textview21 == null || btnGrantUsageAccess == null || recentAppsList == null || cardview9 == null || linear21 == null || textview22 == null || noGamesText == null || gamesList == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new FragmentPerformanceSettingsBinding(rootView, linear15, cardview5, linear16, textview16, textview17, btnCleanMemory, cardview6, linear17, textview18, thermalStatusValue, cardview7, linear18, linear19, textview19, btnRefreshRecommendations, recommendationsList, cardview8, linear20, textview20, textview21, btnGrantUsageAccess, recentAppsList, cardview9, linear21, textview22, noGamesText, gamesList);
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