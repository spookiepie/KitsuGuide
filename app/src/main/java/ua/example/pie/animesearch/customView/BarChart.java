package ua.example.pie.animesearch.customView;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.content.Context;

import com.google.gson.Gson;

import ua.example.pie.animesearch.R;

import ua.example.pie.animesearch.model.SingleAnime;



/**
 * Created by HalfLaptop on 27.12.2016.
 */

public class BarChart extends View {


    Paint textPaint;
    Paint linePaint;
    Paint boxPaint1;
    String bar0;
    String bar1;
    String bar2;
    String bar3;
    String bar4;
    String bar5;




    // seeting text size depending on user's display density
    DisplayMetrics metrics = getResources().getDisplayMetrics();
    float scaleFactor = metrics.density;


    public BarChart (Context context, AttributeSet attrs){

        super(context, attrs);

        initialise();
    }
    public void setValues(String _00, String _10, String _20, String _30, String _40,
                          String _50){
        this.bar0 = _00;
        this.bar1 = _10;
        this.bar2 = _20;
        this.bar3 = _30;
        this.bar4 = _40;
        this.bar5 = _50;
    }

public void initialise () {
// Creating paint for text, lines and rectangles which will be displayed on graph
     textPaint = new Paint();
     linePaint = new Paint();
     boxPaint1 = new Paint();
    linePaint.setStrokeWidth(1);
    linePaint.setColor(ResourcesCompat.getColor(getResources(), R.color.colorGreyLight, null));
    textPaint.setColor(ResourcesCompat.getColor(getResources(), R.color.colorGreyLight, null));
    boxPaint1.setColor(ResourcesCompat.getColor(getResources(), R.color.violet, null));
    textPaint.setTextSize(10*scaleFactor);
}
    @Override
    protected void onDraw (Canvas canvas) {
     super.onDraw(canvas);

        int fullWidth = getWidth();
        int fullHeight = getHeight();
        int padding = (int) (20*scaleFactor);
        int maxBarHeight = fullHeight-2*padding;
        float barWidth = padding*1.7f;
        float betweenBars = padding*1.2f;
        canvas.drawLine(padding*2, fullHeight-padding, fullWidth-padding*0.5f , fullHeight-padding,
                linePaint);
        canvas.drawText("Stars", 4*scaleFactor, fullHeight-0.5f*padding , textPaint);
        canvas.drawText("Votes", 4*scaleFactor, 0.6f*padding , textPaint);
//check values for null to display them properly
        if (bar0 == null)
        {bar0 = "0";}

        int bar00height = Integer.parseInt(bar0);
        if (bar00height >= maxBarHeight){
            bar00height = maxBarHeight;
        }
        String bar00heightStr = bar0;
        int barBottom = fullHeight-padding;
        float bar00top = barBottom-bar00height;
        float val0pos = bar00top-padding*0.3f;
        canvas.drawRect(padding*2, bar00top, barWidth+padding*2 , barBottom, boxPaint1);
        canvas.drawText("0.0", padding*2, fullHeight-padding*0.5f, textPaint);
        canvas.drawText(bar00heightStr, padding*2, val0pos, textPaint);


        if (bar1 ==null)
        {bar1 ="0";}
        int bar10height = Integer.parseInt(bar1);
        if (bar10height >= maxBarHeight){
            bar10height = maxBarHeight;
        }
        String bar10heightStr = bar1;
        float bar10top = barBottom-bar10height;
        float va1pos = bar10top-padding*0.3f;
        canvas.drawRect(betweenBars+barWidth+padding*2, bar10top, padding*3+barWidth*2 , barBottom, boxPaint1);
        canvas.drawText("1.0", betweenBars+barWidth+padding*2, fullHeight-padding*0.5f, textPaint);
        canvas.drawText(bar10heightStr,betweenBars+barWidth+padding*2, va1pos, textPaint);

        if (bar2 ==null)
        {bar2 ="0";}
        int bar20height = Integer.parseInt(bar2);
        String bar20heightStr = bar2;
        float bar20top = barBottom-bar20height;
        float va2pos = bar20top-padding*0.3f;
        canvas.drawRect(betweenBars+padding*3+barWidth*2, bar20top, padding*4+barWidth*3 , barBottom, boxPaint1);
        canvas.drawText("2.0", betweenBars+padding*3+barWidth*2, fullHeight-padding*0.5f, textPaint);
        canvas.drawText(bar20heightStr,betweenBars+padding*3+barWidth*2, va2pos, textPaint);

        if (bar3 ==null)
        {bar3 ="0";}
        int bar30height = Integer.parseInt(bar3);
        if (bar30height >= maxBarHeight){
            bar30height = maxBarHeight;
        }
        String bar30heightStr = bar3;
        float bar30top = barBottom-bar30height;
        float va3pos = bar30top-padding*0.3f;
        canvas.drawRect(betweenBars+padding*4+barWidth*3 , bar30top, padding*5+barWidth*4 , barBottom, boxPaint1);
        canvas.drawText("3.0", betweenBars+padding*4+barWidth*3, fullHeight-padding*0.5f, textPaint);
        canvas.drawText(bar30heightStr,betweenBars+padding*4+barWidth*3, va3pos, textPaint);

        if (bar4 ==null)
        {bar4 ="0";}
        int bar40height = Integer.parseInt(bar4);
        if (bar40height >= maxBarHeight){
            bar40height = maxBarHeight;
        }
        String bar40heightStr = bar4;
        float bar40top = barBottom-bar40height;
        float va4pos = bar40top-padding*0.3f;
        canvas.drawRect(betweenBars+padding*5+barWidth*4, bar40top, padding*6+barWidth*5 , barBottom, boxPaint1);
        canvas.drawText("4.0", betweenBars+padding*5+barWidth*4, fullHeight-padding*0.5f, textPaint);
        canvas.drawText(bar40heightStr,betweenBars+padding*5+barWidth*4, va4pos, textPaint);

        if (bar5 ==null)
        {bar5 ="0";}
        int bar50height = Integer.parseInt(bar5);
        if (bar50height >= maxBarHeight){
            bar50height = maxBarHeight;
        }
        String bar50heightStr = bar5;
        float bar50top = barBottom-bar50height;
        float va5pos = bar50top-padding*0.3f;
        canvas.drawRect(betweenBars+padding*6+barWidth*5, bar50top, padding*7+barWidth*6 , barBottom, boxPaint1);
        canvas.drawText("5.0", betweenBars+padding*6+barWidth*5, fullHeight-padding*0.5f, textPaint);
        canvas.drawText(bar50heightStr,betweenBars+padding*6+barWidth*5, va5pos, textPaint);

 }
}
