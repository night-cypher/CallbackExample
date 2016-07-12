package com.example.questdot.callbackexample;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by HP on 13/6/2016.
 */
public class DiyToggle extends View {

    private Bitmap mBackground;


    private OnToggleClickListener onToggleClickListener;

    public DiyToggle(Context context) {
        super(context);
    }

    public DiyToggle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DiyToggle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


   /* public void setBackground(int resId) {
        mBackground = BitmapFactory.decodeResource(getResources(), resId);
    }*/

   /* @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth = mBackground.getWidth();
        int measuredHeight = mBackground.getHeight();
        setMeasuredDimension(measuredWidth, measuredHeight);
    }*/


  /*  @Override
    protected void onDraw(Canvas canvas) {

        if (mBackground != null) {
            canvas.drawBitmap(mBackground, 0, 0, null);
        }

    }*/


    public void setToggleClickListener(OnToggleClickListener onToggleClickListener){
        if(onToggleClickListener != null){
            this.onToggleClickListener = onToggleClickListener;
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if(action==MotionEvent.ACTION_UP){
            onToggleClickListener.onDoClick();
        }
        return true;
    }
}