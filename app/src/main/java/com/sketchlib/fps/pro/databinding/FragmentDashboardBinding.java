// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.sketchlib.fps.pro.RowStatItemBinding;

public final class FragmentDashboardBinding {
    public final NestedScrollView rootView;
    public final LinearLayout linear1;
    public final MaterialCardView cardview1;
    public final LinearLayout linear2;
    public final Chip statusChip;
    public final TextView fpsPreviewValue;
    public final TextView textview1;
    public final MaterialButton btnToggleOverlay;
    public final TextView textview2;
    public final MaterialCardView cardview2;
    public final LinearLayout linear3;
    public final TextView textview3;
    public final RowStatItemBinding rowRam;
    public final RowStatItemBinding rowCpu;
    public final RowStatItemBinding rowBattery;
    public final RowStatItemBinding rowTemp;
    public final RowStatItemBinding rowNetwork;
    public final RowStatItemBinding rowRefreshRate;
    public final RowStatItemBinding rowResolution;

    private FragmentDashboardBinding(NestedScrollView rootView, LinearLayout linear1, MaterialCardView cardview1, LinearLayout linear2, Chip statusChip, TextView fpsPreviewValue, TextView textview1, MaterialButton btnToggleOverlay, TextView textview2, MaterialCardView cardview2, LinearLayout linear3, TextView textview3, RowStatItemBinding rowRam, RowStatItemBinding rowCpu, RowStatItemBinding rowBattery, RowStatItemBinding rowTemp, RowStatItemBinding rowNetwork, RowStatItemBinding rowRefreshRate, RowStatItemBinding rowResolution) {
        this.rootView = rootView;
        this.linear1 = linear1;
        this.cardview1 = cardview1;
        this.linear2 = linear2;
        this.statusChip = statusChip;
        this.fpsPreviewValue = fpsPreviewValue;
        this.textview1 = textview1;
        this.btnToggleOverlay = btnToggleOverlay;
        this.textview2 = textview2;
        this.cardview2 = cardview2;
        this.linear3 = linear3;
        this.textview3 = textview3;
        this.rowRam = rowRam;
        this.rowCpu = rowCpu;
        this.rowBattery = rowBattery;
        this.rowTemp = rowTemp;
        this.rowNetwork = rowNetwork;
        this.rowRefreshRate = rowRefreshRate;
        this.rowResolution = rowResolution;
    }

    public NestedScrollView getRoot() {
        return rootView;
    }

    public static FragmentDashboardBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentDashboardBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.fragment_dashboard, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static FragmentDashboardBinding bind(View view) {
        NestedScrollView rootView = (NestedScrollView) view;
        LinearLayout linear1 = findChildViewById(view, R.id.linear1);
        MaterialCardView cardview1 = findChildViewById(view, R.id.cardview1);
        LinearLayout linear2 = findChildViewById(view, R.id.linear2);
        Chip statusChip = findChildViewById(view, R.id.statusChip);
        TextView fpsPreviewValue = findChildViewById(view, R.id.fpsPreviewValue);
        TextView textview1 = findChildViewById(view, R.id.textview1);
        MaterialButton btnToggleOverlay = findChildViewById(view, R.id.btnToggleOverlay);
        TextView textview2 = findChildViewById(view, R.id.textview2);
        MaterialCardView cardview2 = findChildViewById(view, R.id.cardview2);
        LinearLayout linear3 = findChildViewById(view, R.id.linear3);
        TextView textview3 = findChildViewById(view, R.id.textview3);
        RowStatItemBinding rowRam = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowRam));
        RowStatItemBinding rowCpu = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowCpu));
        RowStatItemBinding rowBattery = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowBattery));
        RowStatItemBinding rowTemp = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowTemp));
        RowStatItemBinding rowNetwork = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowNetwork));
        RowStatItemBinding rowRefreshRate = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowRefreshRate));
        RowStatItemBinding rowResolution = com.sketchlib.fps.pro.RowStatItemBinding.bind(findChildViewById(view, R.id.rowResolution));
        if (linear1 == null || cardview1 == null || linear2 == null || statusChip == null || fpsPreviewValue == null || textview1 == null || btnToggleOverlay == null || textview2 == null || cardview2 == null || linear3 == null || textview3 == null || rowRam == null || rowCpu == null || rowBattery == null || rowTemp == null || rowNetwork == null || rowRefreshRate == null || rowResolution == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new FragmentDashboardBinding(rootView, linear1, cardview1, linear2, statusChip, fpsPreviewValue, textview1, btnToggleOverlay, textview2, cardview2, linear3, textview3, rowRam, rowCpu, rowBattery, rowTemp, rowNetwork, rowRefreshRate, rowResolution);
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