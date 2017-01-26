package beer.com.ondraw;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOverlay;
import android.widget.Button;
import android.widget.RelativeLayout;

import static android.R.attr.bitmap;

public class MainActivity extends AppCompatActivity{


    Button button;
    RelativeLayout relativeLayout;
    custom obj;
    ViewOverlay viewOverlay;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

        viewOverlay = relativeLayout.getOverlay();
        obj = new custom(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //adding custom drawable
                viewOverlay.add(obj);
            }
        });

        //obj.setBounds(relativeLayout.getWidth(), 0, relativeLayout.getWidth(), relativeLayout.getHeight());
        /*final ViewOverlay viewOverlay = button.getOverlay();
        final custom obj = new custom(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //obj.setBounds(button.getWidth(), 0, button.getWidth(), button.getHeight());
                viewOverlay.add(obj);
            }
        });

        //OtherCustomView  view = (OtherCustomView) findViewById(R.id.timeView);
        //view.setTitleText("Saurav");
        //view.setColor(R.color.colorPrimary);*/

    }
}
