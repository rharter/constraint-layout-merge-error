package com.ryanharter.constraintlayouttest;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;

public class CustomView extends ConstraintLayout {

  public CustomView(Context context) {
    this(context, null);
  }

  public CustomView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);

    LayoutInflater.from(context).inflate(R.layout.view_custom, this, true);
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int width = MeasureSpec.getSize(widthMeasureSpec);
    int height = MeasureSpec.getSize(heightMeasureSpec);
    int size = Math.min(width, height);
    widthMeasureSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
    heightMeasureSpec = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
  }
}
