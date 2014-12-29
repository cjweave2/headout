package com.calwea.headout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by calwea on 12/23/2014.
 */



/**
 * The base activity for all activities.
 * @author calwea
 *
 */
public class BaseActivity extends Activity{

    static BaseActivity instance;
    private static final String TAG = "BaseActivity";
    private static final int OPTIONS_MENU_HOME = 10;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
    }

    @Override
    public void onResume(){
        super.onResume();
        instance = this;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
//        if (instance != null) {
//            if(!(instance instanceof ShowTweetListActivity))
//                menu.add(1, OPTIONS_MENU_HOME, 1, "Home").setIcon(R.drawable.ic_menu_home);
//        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
//
//        Intent i;
//        switch(item.getItemId()){
//            case OPTIONS_MENU_HOME:
//                // show the timeline
//                i = new Intent(this, ShowTweetListActivity.class);
//                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
//                break;
//            default:
//                return false;
//        }
        return true;
    }

    /**
     * Turns the loading icon on and off
     * @param isLoading
     */
    public static void setLoading(final boolean isLoading) {

        if(instance!=null){
            try {
                instance.runOnUiThread(new Runnable() {
                    public void run() {
                        instance.setProgressBarIndeterminateVisibility(isLoading);
                    }
                });

            } catch (Exception ex) {
                Log.e(TAG,"error: ",ex);
            }

        } else {
            Log.v(TAG, "Cannot show loading icon");
        }
    }

    /**
     * Clean up the views
     * @param view
     */
    protected void unbindDrawables(View view) {

        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                unbindDrawables(((ViewGroup) view).getChildAt(i));
            }
            try{
                ((ViewGroup) view).removeAllViews();
            } catch(UnsupportedOperationException e){
                // No problem, nothing to do here
            }
        }
    }
}
