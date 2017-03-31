package cn.chen.graphiteAndroid;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by chen on 2017/3/20.
 */

public class RotateTextView extends TextView {
    private  static  final  String  NAMESPACE = "http://myrotate.com/apk/res/myrotate";
    private  static  final  String  ATTR_ROTATE = "rotate";
    private  static  final  int  DEFAULTVALUE_DEGREES = 0;
    private  int  degrees ;
    public RotateTextView(Context context){
        super(context);
    }
    public  RotateTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        degrees = attrs.getAttributeIntValue(NAMESPACE, ATTR_ROTATE, DEFAULTVALUE_DEGREES);
    }
    public RotateTextView(Context context, AttributeSet attrs,int defStyle) {
        super(context, attrs,defStyle);
    }
    @Override
    protected  void  onDraw(Canvas canvas) {
        canvas.rotate(degrees,getMeasuredWidth()/2,getMeasuredHeight()/2);
        super.onDraw(canvas);
    }
}