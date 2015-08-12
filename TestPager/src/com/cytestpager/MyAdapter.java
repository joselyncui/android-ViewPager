package com.cytestpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends PagerAdapter {
	public int MAX_COUNT = Integer.MAX_VALUE;
	private int count = 5;
	private Context context;
	private LayoutInflater inflater;

	public MyAdapter(Context context) {
		this.context = context;
		this.inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return MAX_COUNT;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	@Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v = inflater.inflate(R.layout.sliding_item, null);
        TextView textView = (TextView) v.findViewById(R.id.textview);
        textView.setText(position%count+"");
        container.addView(v);
        return v;
    }

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View)object);;
	}
}
