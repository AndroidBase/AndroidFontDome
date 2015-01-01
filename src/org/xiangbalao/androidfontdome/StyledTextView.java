package org.xiangbalao.androidfontdome;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class StyledTextView extends TextView {

	public StyledTextView(Context context) {
		super(context);

	}

	public StyledTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		style(context);
	}

	public StyledTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		style(context);
	}

	private void style(Context context) {
		Typeface tf = Typeface.createFromAsset(context.getAssets(),
				"fonts/roboto.ttf");
		setTypeface(tf);
	}

}
