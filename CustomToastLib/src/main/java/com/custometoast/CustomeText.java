package com.custometoast;

import android.app.Activity;
import android.graphics.Typeface;

/**
 * Created by AnkurYadav on 11/18/2016.
 */
public class CustomeText {
    public static Typeface apply(Activity context) {
        Typeface montserrat = Typeface.createFromAsset(context.getAssets(), "Montserrat-Regular.ttf");
        return montserrat;
    }
}
