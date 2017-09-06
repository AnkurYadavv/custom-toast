# custom-toast
Customized toast

This project allowing you to create a custom Toast in android through simplest way.

Gradle
------
```
dependencies {
    ...
    compile 'com.customtoast:CustomToastLib:1.0.0'
}
```

JAVA
-----

```java
MaterialToast materialToast=new MaterialToast(MainActivity.this);
                materialToast.show("Custom Toast", ContextCompat.getDrawable(MainActivity.this,R.drawable.toast_drawable),
                        ContextCompat.getColor(MainActivity.this,R.color.colorAccent),
                        Gravity.CENTER_HORIZONTAL);
                        
```                      
  
Parameter
---------
* **toast_drawable**
    * It's a drawable xml shape that can be customized acording to requirements. Just create a xml file in drawable folder and paste the below code.
  
XML
-----
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle" >
    <solid android:color="@color/white" >
    </solid>
    <stroke
        android:dashWidth="2dp"
        android:width="1dp"
        android:color="@color/colorAccent" >
    </stroke>
    <padding
        android:bottom="4dp"
        android:left="4dp"
        android:right="4dp"
        android:top="4dp" >
    </padding>
    <corners android:radius="40dp"></corners>
</shape>

```

                        
