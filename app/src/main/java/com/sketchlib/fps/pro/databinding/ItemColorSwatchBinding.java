// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.View;

public final class ItemColorSwatchBinding {
    public final View swatchView;


    private ItemColorSwatchBinding(View swatchView) {
        this.swatchView = swatchView;

    }

    public View getRoot() {
        return swatchView;
    }

    public static ItemColorSwatchBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemColorSwatchBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.item_color_swatch, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static ItemColorSwatchBinding bind(View view) {
        View swatchView = (View) view;


        return new ItemColorSwatchBinding(swatchView);
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