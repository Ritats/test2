package com.example.com.test.touch;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class TouchRelativeLayout extends RelativeLayout {

	public TouchRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		
		switch(getId())
		{
		case R.id.layout1:
			Log.i("Test", "onTouchEvent , layout 1");
			break;
		case R.id.layout2:
			Log.d("Test", "onTouchEvent , layout 2");
//			return true;
			break;
		case R.id.layout3:
			Log.w("Test", "onTouchEvent , layout 3");
			break;
		}		
		return super.onTouchEvent(event);
	}

	private float mTouchDown_x = 0;
	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {

		switch(event.getAction())
		{
			case MotionEvent.ACTION_DOWN: {
				mTouchDown_x = event.getX();
				break;
			}
			case MotionEvent.ACTION_MOVE: { 
				if(event.getX() - mTouchDown_x < -100)
				{
					
				}
				break;
			}
		}
		switch(getId())
		{
		case R.id.layout1:
			Log.i("Test", "dispatchTouchEvent , layout 1");
			break;
		case R.id.layout2:
			Log.d("Test", "dispatchTouchEvent , layout 2");
//			return true;
			break;
		case R.id.layout3:
			Log.w("Test", "dispatchTouchEvent , layout 3");
			break;
		}
		return super.dispatchTouchEvent(event);
	}
}
