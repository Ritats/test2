package com.example.com.test.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class TouchTextView extends TextView {

	public TouchTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		
		if(getText().equals(getContext().getString(R.string.text1)))
		{
			Log.i("Test", "onTouchEvent , text 1");
		}else if(getText().equals(getContext().getString(R.string.text2)))
		{
			Log.d("Test", "onTouchEvent , text 2");
		}else if(getText().equals(getContext().getString(R.string.text3)))
		{
			Log.w("Test", "onTouchEvent , text 3");
		}
		return super.onTouchEvent(event);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {

		if(getText().equals(getContext().getString(R.string.text1)))
		{
			Log.i("Test", "dispatchTouchEvent , text 1");
		}else if(getText().equals(getContext().getString(R.string.text2)))
		{
			Log.d("Test", "dispatchTouchEvent , text 2");
		}else if(getText().equals(getContext().getString(R.string.text3)))
		{
			Log.w("Test", "dispatchTouchEvent , text 3");
		}
		
		return super.dispatchTouchEvent(event);
	}
}
