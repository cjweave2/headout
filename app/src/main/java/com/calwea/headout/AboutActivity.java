package com.calwea.headout;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;

/**
 * Created by calwea on 12/23/2014.
 */

public class AboutActivity extends BaseActivity {

    public static final String TAG = "AboutActivity";
    TextView versionName;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        versionName.setText(R.string.about_version);
    }

    /**
     * on Resume
     */
    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbindDrawables(findViewById(R.id.showAboutRoot));
    }
}