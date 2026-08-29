// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputLayout;

public final class FragmentAppearanceSettingsBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear13;
    public final TextView textview11;
    public final MaterialCardView previewCard;
    public final TextView previewText;
    public final TextView labelCornerRadius;
    public final Slider sliderCornerRadius;
    public final TextView labelTextSize;
    public final Slider sliderTextSize;
    public final TextView labelOpacity;
    public final Slider sliderOpacity;
    public final TextView labelWidth;
    public final Slider sliderWidth;
    public final TextView labelHeight;
    public final Slider sliderHeight;
    public final TextView textview12;
    public final TextInputLayout textInputLayout14;
    public final AutoCompleteTextView dropdownFont;
    public final TextView textview13;
    public final RecyclerView textColorList;
    public final TextView textview14;
    public final RecyclerView bgColorList;
    public final TextView textview15;
    public final ChipGroup presetChipGroup;

    private FragmentAppearanceSettingsBinding(NestedScrollView rootView, LinearLayout linear13, TextView textview11, MaterialCardView previewCard, TextView previewText, TextView labelCornerRadius, Slider sliderCornerRadius, TextView labelTextSize, Slider sliderTextSize, TextView labelOpacity, Slider sliderOpacity, TextView labelWidth, Slider sliderWidth, TextView labelHeight, Slider sliderHeight, TextView textview12, TextInputLayout textInputLayout14, AutoCompleteTextView dropdownFont, TextView textview13, RecyclerView textColorList, TextView textview14, RecyclerView bgColorList, TextView textview15, ChipGroup presetChipGroup) {
        this.rootView = rootView;
        this.linear13 = linear13;
        this.textview11 = textview11;
        this.previewCard = previewCard;
        this.previewText = previewText;
        this.labelCornerRadius = labelCornerRadius;
        this.sliderCornerRadius = sliderCornerRadius;
        this.labelTextSize = labelTextSize;
        this.sliderTextSize = sliderTextSize;
        this.labelOpacity = labelOpacity;
        this.sliderOpacity = sliderOpacity;
        this.labelWidth = labelWidth;
        this.sliderWidth = sliderWidth;
        this.labelHeight = labelHeight;
        this.sliderHeight = sliderHeight;
        this.textview12 = textview12;
        this.textInputLayout14 = textInputLayout14;
        this.dropdownFont = dropdownFont;
        this.textview13 = textview13;
        this.textColorList = textColorList;
        this.textview14 = textview14;
        this.bgColorList = bgColorList;
        this.textview15 = textview15;
        this.presetChipGroup = presetChipGroup;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static FragmentAppearanceSettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentAppearanceSettingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_appearance_settings, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static FragmentAppearanceSettingsBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear13 = findChildViewById(view, R.id.linear13);
        TextView textview11 = findChildViewById(view, R.id.textview11);
        MaterialCardView previewCard = findChildViewById(view, R.id.previewCard);
        TextView previewText = findChildViewById(view, R.id.previewText);
        TextView labelCornerRadius = findChildViewById(view, R.id.labelCornerRadius);
        Slider sliderCornerRadius = findChildViewById(view, R.id.sliderCornerRadius);
        TextView labelTextSize = findChildViewById(view, R.id.labelTextSize);
        Slider sliderTextSize = findChildViewById(view, R.id.sliderTextSize);
        TextView labelOpacity = findChildViewById(view, R.id.labelOpacity);
        Slider sliderOpacity = findChildViewById(view, R.id.sliderOpacity);
        TextView labelWidth = findChildViewById(view, R.id.labelWidth);
        Slider sliderWidth = findChildViewById(view, R.id.sliderWidth);
        TextView labelHeight = findChildViewById(view, R.id.labelHeight);
        Slider sliderHeight = findChildViewById(view, R.id.sliderHeight);
        TextView textview12 = findChildViewById(view, R.id.textview12);
        TextInputLayout textInputLayout14 = findChildViewById(view, R.id.text_input_layout14);
        AutoCompleteTextView dropdownFont = findChildViewById(view, R.id.dropdownFont);
        TextView textview13 = findChildViewById(view, R.id.textview13);
        RecyclerView textColorList = findChildViewById(view, R.id.textColorList);
        TextView textview14 = findChildViewById(view, R.id.textview14);
        RecyclerView bgColorList = findChildViewById(view, R.id.bgColorList);
        TextView textview15 = findChildViewById(view, R.id.textview15);
        ChipGroup presetChipGroup = findChildViewById(view, R.id.presetChipGroup);

        if (linear13 == null || textview11 == null || previewCard == null || previewText == null || labelCornerRadius == null || sliderCornerRadius == null || labelTextSize == null || sliderTextSize == null || labelOpacity == null || sliderOpacity == null || labelWidth == null || sliderWidth == null || labelHeight == null || sliderHeight == null || textview12 == null || textInputLayout14 == null || dropdownFont == null || textview13 == null || textColorList == null || textview14 == null || bgColorList == null || textview15 == null || presetChipGroup == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new FragmentAppearanceSettingsBinding(rootView, linear13, textview11, previewCard, previewText, labelCornerRadius, sliderCornerRadius, labelTextSize, sliderTextSize, labelOpacity, sliderOpacity, labelWidth, sliderWidth, labelHeight, sliderHeight, textview12, textInputLayout14, dropdownFont, textview13, textColorList, textview14, bgColorList, textview15, presetChipGroup);
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