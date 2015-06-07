package com.dolmuz.jean.sunshine_app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;


public class DetailActivity extends ActionBarActivity {

//    private ShareActionProvider mShareActionProvider;
//    private String mForecastStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);

//        //locate the share menu item
//        MenuItem item = menu.findItem(R.id.action_share);
//
//        //get and store the shareaction provider
//        mShareActionProvider = (ShareActionProvider) item.getActionProvider();

        return true;
    }

//    private void setShareIntent(Intent shareIntent){
//        if(mShareActionProvider != null){
//            mShareActionProvider.setShareIntent(shareIntent);
//        }
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
