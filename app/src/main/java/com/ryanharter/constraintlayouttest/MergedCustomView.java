package com.ryanharter.constraintlayouttest;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;

public class MergedCustomView extends ConstraintLayout {

  public MergedCustomView(Context context) {
    this(context, null);
  }

  public MergedCustomView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public MergedCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);

    LayoutInflater.from(context).inflate(R.layout.view_custom_merge, this, true);
  }
}
