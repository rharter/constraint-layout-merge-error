package com.ryanharter.constraintlayouttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

  RecyclerView list;
  CustomAdapter adapter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    list = (RecyclerView) findViewById(R.id.list);

    list.setLayoutManager(new GridLayoutManager(this, 2));
    list.setAdapter(adapter = new CustomAdapter());
    adapter.notifyDataSetChanged();
  }

  private class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    @Override public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      return new CustomViewHolder(new CustomView(parent.getContext()));
    }

    @Override public void onBindViewHolder(CustomViewHolder holder, int position) {
      holder.itemView.setBackgroundColor(0xff000000 | (0x0000000f << position));
    }

    @Override public int getItemCount() {
      return 10;
    }
  }

  private static class CustomViewHolder extends RecyclerView.ViewHolder {
    CustomViewHolder(View itemView) {
      super(itemView);
    }
  }
}
