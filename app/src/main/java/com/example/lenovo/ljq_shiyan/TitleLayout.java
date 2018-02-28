package com.example.lenovo.ljq_shiyan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by lenovo on 2018/2/26.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context) {
        super(context);
    }

    public TitleLayout(final Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
      Button btn= findViewById(R.id.fanhui);
    Button btnx=  findViewById(R.id.xdit);
    btn.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
            ((Activity)getContext()).finish();
        }
    });
    btnx.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getContext(),Main2Activity.class);
        }
    });
    }

    public TitleLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
