// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

public final class OverlayLayoutBinding {
    public final MaterialCardView overlayCard;
    public final LinearLayout linear1;
    public final LinearLayout linear2;
    public final ImageView dragHandle;
    public final View view3;
    public final ImageView lockToggle;
    public final ImageView closeButton;
    public final TextView fpsValue;
    public final TextView fpsLabel;
    public final LinearLayout ramRow;
    public final TextView textview1;
    public final TextView ramValue;
    public final LinearLayout cpuRow;
    public final TextView textview2;
    public final TextView cpuValue;
    public final LinearLayout batteryRow;
    public final TextView textview3;
    public final TextView batteryValue;
    public final LinearLayout tempRow;
    public final TextView textview4;
    public final TextView tempValue;
    public final LinearLayout networkRow;
    public final TextView textview5;
    public final TextView networkValue;
    public final LinearLayout refreshRateRow;
    public final TextView textview6;
    public final TextView refreshRateValue;
    public final LinearLayout resolutionRow;
    public final TextView textview7;
    public final TextView resolutionValue;

    private OverlayLayoutBinding(MaterialCardView overlayCard, LinearLayout linear1, LinearLayout linear2, ImageView dragHandle, View view3, ImageView lockToggle, ImageView closeButton, TextView fpsValue, TextView fpsLabel, LinearLayout ramRow, TextView textview1, TextView ramValue, LinearLayout cpuRow, TextView textview2, TextView cpuValue, LinearLayout batteryRow, TextView textview3, TextView batteryValue, LinearLayout tempRow, TextView textview4, TextView tempValue, LinearLayout networkRow, TextView textview5, TextView networkValue, LinearLayout refreshRateRow, TextView textview6, TextView refreshRateValue, LinearLayout resolutionRow, TextView textview7, TextView resolutionValue) {
        this.overlayCard = overlayCard;
        this.linear1 = linear1;
        this.linear2 = linear2;
        this.dragHandle = dragHandle;
        this.view3 = view3;
        this.lockToggle = lockToggle;
        this.closeButton = closeButton;
        this.fpsValue = fpsValue;
        this.fpsLabel = fpsLabel;
        this.ramRow = ramRow;
        this.textview1 = textview1;
        this.ramValue = ramValue;
        this.cpuRow = cpuRow;
        this.textview2 = textview2;
        this.cpuValue = cpuValue;
        this.batteryRow = batteryRow;
        this.textview3 = textview3;
        this.batteryValue = batteryValue;
        this.tempRow = tempRow;
        this.textview4 = textview4;
        this.tempValue = tempValue;
        this.networkRow = networkRow;
        this.textview5 = textview5;
        this.networkValue = networkValue;
        this.refreshRateRow = refreshRateRow;
        this.textview6 = textview6;
        this.refreshRateValue = refreshRateValue;
        this.resolutionRow = resolutionRow;
        this.textview7 = textview7;
        this.resolutionValue = resolutionValue;
    }

    public MaterialCardView getRoot() {
        return overlayCard;
    }

    public static OverlayLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OverlayLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.overlay_layout, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static OverlayLayoutBinding bind(View view) {
        MaterialCardView overlayCard = (MaterialCardView) view;
        LinearLayout linear1 = findChildViewById(view, R.id.linear1);
        LinearLayout linear2 = findChildViewById(view, R.id.linear2);
        ImageView dragHandle = findChildViewById(view, R.id.dragHandle);
        View view3 = findChildViewById(view, R.id.view3);
        ImageView lockToggle = findChildViewById(view, R.id.lockToggle);
        ImageView closeButton = findChildViewById(view, R.id.closeButton);
        TextView fpsValue = findChildViewById(view, R.id.fpsValue);
        TextView fpsLabel = findChildViewById(view, R.id.fpsLabel);
        LinearLayout ramRow = findChildViewById(view, R.id.ramRow);
        TextView textview1 = findChildViewById(view, R.id.textview1);
        TextView ramValue = findChildViewById(view, R.id.ramValue);
        LinearLayout cpuRow = findChildViewById(view, R.id.cpuRow);
        TextView textview2 = findChildViewById(view, R.id.textview2);
        TextView cpuValue = findChildViewById(view, R.id.cpuValue);
        LinearLayout batteryRow = findChildViewById(view, R.id.batteryRow);
        TextView textview3 = findChildViewById(view, R.id.textview3);
        TextView batteryValue = findChildViewById(view, R.id.batteryValue);
        LinearLayout tempRow = findChildViewById(view, R.id.tempRow);
        TextView textview4 = findChildViewById(view, R.id.textview4);
        TextView tempValue = findChildViewById(view, R.id.tempValue);
        LinearLayout networkRow = findChildViewById(view, R.id.networkRow);
        TextView textview5 = findChildViewById(view, R.id.textview5);
        TextView networkValue = findChildViewById(view, R.id.networkValue);
        LinearLayout refreshRateRow = findChildViewById(view, R.id.refreshRateRow);
        TextView textview6 = findChildViewById(view, R.id.textview6);
        TextView refreshRateValue = findChildViewById(view, R.id.refreshRateValue);
        LinearLayout resolutionRow = findChildViewById(view, R.id.resolutionRow);
        TextView textview7 = findChildViewById(view, R.id.textview7);
        TextView resolutionValue = findChildViewById(view, R.id.resolutionValue);

        if (linear1 == null || linear2 == null || dragHandle == null || view3 == null || lockToggle == null || closeButton == null || fpsValue == null || fpsLabel == null || ramRow == null || textview1 == null || ramValue == null || cpuRow == null || textview2 == null || cpuValue == null || batteryRow == null || textview3 == null || batteryValue == null || tempRow == null || textview4 == null || tempValue == null || networkRow == null || textview5 == null || networkValue == null || refreshRateRow == null || textview6 == null || refreshRateValue == null || resolutionRow == null || textview7 == null || resolutionValue == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new OverlayLayoutBinding(overlayCard, linear1, linear2, dragHandle, view3, lockToggle, closeButton, fpsValue, fpsLabel, ramRow, textview1, ramValue, cpuRow, textview2, cpuValue, batteryRow, textview3, batteryValue, tempRow, textview4, tempValue, networkRow, textview5, networkValue, refreshRateRow, textview6, refreshRateValue, resolutionRow, textview7, resolutionValue);
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