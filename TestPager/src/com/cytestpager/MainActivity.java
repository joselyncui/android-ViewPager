package com.cytestpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MainActivity extends Activity {
	private MyAdapter adapter;
	private ViewPager viewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		adapter = new MyAdapter(this);
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		
		viewPager.setPageMargin(30);//pager margin
		viewPager.setOffscreenPageLimit(3); //cache limit
        viewPager.setAdapter(new MyAdapter(this));
        viewPager.setCurrentItem(3*50);//set to make veiwpager can be slided to right at begin
	}
}
