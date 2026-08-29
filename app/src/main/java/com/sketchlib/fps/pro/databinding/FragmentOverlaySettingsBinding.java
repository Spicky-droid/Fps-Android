// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputLayout;

public final class FragmentOverlaySettingsBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear4;
    public final MaterialCardView cardview3;
    public final LinearLayout linear5;
    public final TextView statusText;
    public final LinearLayout linear6;
    public final MaterialButton btnStart;
    public final MaterialButton btnStop;
    public final MaterialCardView cardview4;
    public final LinearLayout linear7;
    public final LinearLayout linear8;
    public final LinearLayout linear9;
    public final TextView textview4;
    public final TextView textview5;
    public final MaterialSwitch switchLock;
    public final LinearLayout linear10;
    public final LinearLayout linear11;
    public final TextView textview6;
    public final TextView textview7;
    public final MaterialSwitch switchAutoStart;
    public final TextView textview8;
    public final TextView textview9;
    public final TextInputLayout textInputLayout12;
    public final AutoCompleteTextView dropdownRefreshInterval;
    public final TextView textview10;

    private FragmentOverlaySettingsBinding(NestedScrollView rootView, LinearLayout linear4, MaterialCardView cardview3, LinearLayout linear5, TextView statusText, LinearLayout linear6, MaterialButton btnStart, MaterialButton btnStop, MaterialCardView cardview4, LinearLayout linear7, LinearLayout linear8, LinearLayout linear9, TextView textview4, TextView textview5, MaterialSwitch switchLock, LinearLayout linear10, LinearLayout linear11, TextView textview6, TextView textview7, MaterialSwitch switchAutoStart, TextView textview8, TextView textview9, TextInputLayout textInputLayout12, AutoCompleteTextView dropdownRefreshInterval, TextView textview10) {
        this.rootView = rootView;
        this.linear4 = linear4;
        this.cardview3 = cardview3;
        this.linear5 = linear5;
        this.statusText = statusText;
        this.linear6 = linear6;
        this.btnStart = btnStart;
        this.btnStop = btnStop;
        this.cardview4 = cardview4;
        this.linear7 = linear7;
        this.linear8 = linear8;
        this.linear9 = linear9;
        this.textview4 = textview4;
        this.textview5 = textview5;
        this.switchLock = switchLock;
        this.linear10 = linear10;
        this.linear11 = linear11;
        this.textview6 = textview6;
        this.textview7 = textview7;
        this.switchAutoStart = switchAutoStart;
        this.textview8 = textview8;
        this.textview9 = textview9;
        this.textInputLayout12 = textInputLayout12;
        this.dropdownRefreshInterval = dropdownRefreshInterval;
        this.textview10 = textview10;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static FragmentOverlaySettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOverlaySettingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_overlay_settings, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static FragmentOverlaySettingsBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear4 = findChildViewById(view, R.id.linear4);
        MaterialCardView cardview3 = findChildViewById(view, R.id.cardview3);
        LinearLayout linear5 = findChildViewById(view, R.id.linear5);
        TextView statusText = findChildViewById(view, R.id.statusText);
        LinearLayout linear6 = findChildViewById(view, R.id.linear6);
        MaterialButton btnStart = findChildViewById(view, R.id.btnStart);
        MaterialButton btnStop = findChildViewById(view, R.id.btnStop);
        MaterialCardView cardview4 = findChildViewById(view, R.id.cardview4);
        LinearLayout linear7 = findChildViewById(view, R.id.linear7);
        LinearLayout linear8 = findChildViewById(view, R.id.linear8);
        LinearLayout linear9 = findChildViewById(view, R.id.linear9);
        TextView textview4 = findChildViewById(view, R.id.textview4);
        TextView textview5 = findChildViewById(view, R.id.textview5);
        MaterialSwitch switchLock = findChildViewById(view, R.id.switchLock);
        LinearLayout linear10 = findChildViewById(view, R.id.linear10);
        LinearLayout linear11 = findChildViewById(view, R.id.linear11);
        TextView textview6 = findChildViewById(view, R.id.textview6);
        TextView textview7 = findChildViewById(view, R.id.textview7);
        MaterialSwitch switchAutoStart = findChildViewById(view, R.id.switchAutoStart);
        TextView textview8 = findChildViewById(view, R.id.textview8);
        TextView textview9 = findChildViewById(view, R.id.textview9);
        TextInputLayout textInputLayout12 = findChildViewById(view, R.id.text_input_layout12);
        AutoCompleteTextView dropdownRefreshInterval = findChildViewById(view, R.id.dropdownRefreshInterval);
        TextView textview10 = findChildViewById(view, R.id.textview10);

        if (linear4 == null || cardview3 == null || linear5 == null || statusText == null || linear6 == null || btnStart == null || btnStop == null || cardview4 == null || linear7 == null || linear8 == null || linear9 == null || textview4 == null || textview5 == null || switchLock == null || linear10 == null || linear11 == null || textview6 == null || textview7 == null || switchAutoStart == null || textview8 == null || textview9 == null || textInputLayout12 == null || dropdownRefreshInterval == null || textview10 == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new FragmentOverlaySettingsBinding(rootView, linear4, cardview3, linear5, statusText, linear6, btnStart, btnStop, cardview4, linear7, linear8, linear9, textview4, textview5, switchLock, linear10, linear11, textview6, textview7, switchAutoStart, textview8, textview9, textInputLayout12, dropdownRefreshInterval, textview10);
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