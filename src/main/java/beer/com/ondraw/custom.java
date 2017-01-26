package beer.com.ondraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

/**
 * Created by 1405473 on 24-01-2017.
 */

public class custom extends Drawable {


    private Paint paint;
    private Context context;

    public custom(Context context) {
        this.context = context;
        initPaint();
    }

    private void initPaint() {

        paint = new Paint();
        paint.setColor(Color.parseColor("#4D000000"));
        //paint.setColor(Color.CYAN);
        paint.setAntiAlias(true);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        //canvas.drawColor(Color.parseColor("#CCFFFFFF"));
        //canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, 100, paint);

        //transparent screen
        canvas.drawColor(paint.getColor());

        //Big Rectangle
        paint.setColor(Color.parseColor("#2196F3"));
        canvas.drawRect(0, canvas.getHeight() - 200, canvas.getWidth(), canvas.getHeight(), paint);

        //Message Rectangle
        paint.setColor(Color.parseColor("#558B2F"));
        canvas.drawRect(10, 20, 150,170, paint);
        paint.setColor(Color.parseColor("#8BC34A"));
        canvas.drawRect(150, 20,770,170, paint);

        //small Rectangle
        paint.setColor(Color.parseColor("#1E88E5"));
        canvas.drawRect(0, canvas.getHeight() - 300, canvas.getWidth(), canvas.getHeight() - 200, paint);
        // Cross Circle
        paint.setColor(Color.parseColor("#EF5350"));
        canvas.drawCircle((canvas.getWidth() / 2), canvas.getHeight() - 400, 70, paint);

        // Circles inside Big Rectangle
        paint.setColor(Color.parseColor("#8BC34A"));
        canvas.drawCircle((canvas.getWidth() / 2) - 400, canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2) - 200, canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2), canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2) + 200, canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2) + 400, canvas.getHeight() - 100, 50, paint);
        //Stroke for small circles
        paint.setColor(Color.parseColor("#33691E"));
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth() / 2) - 400, canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2) - 200, canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2), canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2) + 200, canvas.getHeight() - 100, 50, paint);
        canvas.drawCircle((canvas.getWidth() / 2) + 400, canvas.getHeight() - 100, 50, paint);
        //Line between circles
        paint.setStrokeWidth(3);
        canvas.drawLine((canvas.getWidth() / 2) - 350, canvas.getHeight() - 100, (canvas.getWidth() / 2) - 250, canvas.getHeight() - 100, paint);
        canvas.drawLine((canvas.getWidth() / 2) - 150, canvas.getHeight() - 100, (canvas.getWidth() / 2) - 50, canvas.getHeight() - 100, paint);
        canvas.drawLine((canvas.getWidth() / 2) + 50, canvas.getHeight() - 100, (canvas.getWidth() / 2) + 150, canvas.getHeight() - 100, paint);
        canvas.drawLine((canvas.getWidth() / 2) + 250, canvas.getHeight() - 100, (canvas.getWidth() / 2) + 350, canvas.getHeight() - 100, paint);
        //Number in Circle
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
        canvas.drawText("1", (canvas.getWidth() / 2) - 415, canvas.getHeight() - 85, paint);
        canvas.drawText("2", (canvas.getWidth() / 2) - 215, canvas.getHeight() - 85, paint);
        canvas.drawText("3", (canvas.getWidth() / 2) - 15, canvas.getHeight() - 85, paint);
        canvas.drawText("4", (canvas.getWidth() / 2) + 185, canvas.getHeight() - 85, paint);
        canvas.drawText("5", (canvas.getWidth() / 2) + 385, canvas.getHeight() - 85, paint);
        //Text in small Rectangle
        paint.setTextSize(45);
        canvas.drawText("How to enable or disable images in article", (canvas.getWidth() / 2) - 430, canvas.getHeight() - 230, paint);

        //Text in MessageBox
        canvas.drawText("1/5", 40, 110, paint);

        //Cross in Circle
        paint.setTextSize(100);
        canvas.drawText("x", (canvas.getWidth() / 2) - 25, canvas.getHeight() - 375, paint);

        //Text in Message Box
        paint.setTextSize(30);
        paint.setColor(Color.BLACK);
        canvas.drawText("That's cool, but mostly noisy and scrolly and",160,110,paint);
        canvas.drawText("not super helpful.This plugin changes that.",160,145,paint);
        paint.setFakeBoldText(true);
        paint.setTextSize(35);
        canvas.drawText("CLICK ON HAMBURGER MENU", 160,60, paint);
    }

    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

}
