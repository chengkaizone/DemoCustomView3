package com.example.leeyou.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by leeyou on 2016/1/26.
 */
public class FontView extends View {

    private Paint mPaint;
    private Paint.FontMetrics mFontMetrics;

    private static final String TEXT = "这就是一行测试字符串∩O(∩_∩)O嗯!(╥╯^╰╥)~(๑•́ ₃ •̀๑)ε(┬┬﹏┬┬)3┭┮﹏┭┮(◐_◑)(⊙o⊙)…";

    public FontView(Context context) {
        super(context);
    }

    public FontView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setTextSize(50);
        mPaint.setColor(Color.BLACK);

        mFontMetrics = mPaint.getFontMetrics();

        Log.e("FontView", "ascent：" + mFontMetrics.ascent);
        Log.e("FontView", "descent：" + mFontMetrics.descent);
        Log.e("FontView", "leading：" + mFontMetrics.leading);
        Log.e("FontView", "top：" + mFontMetrics.top);
        Log.e("FontView", "bottom：" + mFontMetrics.bottom);
    }

    public FontView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(TEXT, 0, Math.abs(mFontMetrics.top), mPaint);
    }
}
