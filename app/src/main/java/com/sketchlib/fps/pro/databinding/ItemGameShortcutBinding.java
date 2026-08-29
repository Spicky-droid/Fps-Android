// Generated file. Do not modify.
package com.sketchlib.fps.pro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class ItemGameShortcutBinding {
    public final LinearLayout rootView;
    public final ImageView gameIcon;
    public final TextView gameName;

    private ItemGameShortcutBinding(LinearLayout rootView, ImageView gameIcon, TextView gameName) {
        this.rootView = rootView;
        this.gameIcon = gameIcon;
        this.gameName = gameName;
    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static ItemGameShortcutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemGameShortcutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.item_game_shortcut, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static ItemGameShortcutBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;
        ImageView gameIcon = findChildViewById(view, R.id.gameIcon);
        TextView gameName = findChildViewById(view, R.id.gameName);

        if (gameIcon == null || gameName == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new ItemGameShortcutBinding(rootView, gameIcon, gameName);
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