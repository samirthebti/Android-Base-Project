package com.xmartlabs.template.ui;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;

import com.annimon.stream.Objects;
import com.annimon.stream.Stream;
import com.xmartlabs.template.R;

import java.util.Locale;

import lombok.Getter;

/**
 * Created by santiago on 22/10/15.
 */
public enum DrawerItemType {
  // You should change the styles definition if you change this enum.
  ABOVE(R.layout.item_drawer_above),
  DIVIDER(R.layout.item_drawer_divider),
  BELOW(R.layout.item_drawer_below);

  @Getter
  @LayoutRes
  private final int layoutResId;

  DrawerItemType(@LayoutRes int layoutResId) {
    this.layoutResId = layoutResId;
  }

  public int getValue() {
    return ordinal();
  }

  @NonNull
  public static DrawerItemType fromInteger(int value) {
    return Stream.of(values())
        .filter(drawerItemType -> Objects.equals(drawerItemType.getValue(), value))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException(String.format(Locale.getDefault(),
            "Invalid drawer item type value: %d", value)));
  }
}
