package com.custometoast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by AnkurYadav on 11/18/2016.
 */

public class MaterialToast {

    Activity activity;
    public MaterialToast(Activity activity) {

        this.activity=activity;
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void show(String message, Drawable drawable, int color, int gravity) {
        LayoutInflater layoutInflater = (LayoutInflater)activity.getApplicationContext().getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View viewHolder = View.inflate(activity, R.layout.material_toast, null);

        LinearLayout outerLayout=(LinearLayout)viewHolder.findViewById(R.id.outerLayout);
        outerLayout.setBackground(drawable);

        TextView toastTitle=(TextView)viewHolder.findViewById(R.id.toastTitle);
        toastTitle.setTextColor(color);
        toastTitle.setText(message);
        toastTitle.setTypeface(CustomeText.apply(activity));

        Toast toastObject = new Toast(activity);
        toastObject.setDuration(Toast.LENGTH_SHORT);
        toastObject.setGravity(gravity, 0, 0);
        toastObject.setView(viewHolder);
        toastObject.show();

    }

}
