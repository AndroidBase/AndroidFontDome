package org.xiangbalao.androidfontdome;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;


public class IconTextView extends TextView {

	public IconTextView(Context context) {
		super(context);

	}

	public IconTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		style(context);
	}

	public IconTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		style(context);
	}

	private void style(Context context) {
		Typeface tf = Typeface.createFromAsset(context.getAssets(),
				"fonts/icomoon.ttf");
		setTypeface(tf);
	}

 

}
