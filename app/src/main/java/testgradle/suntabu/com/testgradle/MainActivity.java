package testgradle.suntabu.com.testgradle;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static String TAG = "SUNTABU : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] attrs = new int[]{
                android.R.attr.background,
                R.attr.keyTextSize,
                R.attr.keyTextColor,
                R.attr.hintTextColor,
                R.attr.hintTextSize,
                R.attr.hintLabelAlign,
                R.attr.hintLabelVAlign,
                R.attr.settingBackground,
        };

        TypedArray a = this.obtainStyledAttributes(R.style.Example, attrs);

        Log.d(TAG, "->" + a.getIndexCount() + "   of   " + a.length());
        String log = "";
        for (int i = 0; i < a.getIndexCount(); i++) {
            int j = a.getResourceId(a.getIndex(i), -1);
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                int type = a.getType(a.getIndex(i));


                log += Integer.toHexString(j) + "   t: " + Integer.toHexString(type) + "\n";
            }

        }

        Log.d(TAG, log);
    }
}
