package com.dintresearch.rroff.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Run the Spotify Streamer app.
     *
     * @param view Not used
     */
    public void runStreamer(View view) {
        showToast(R.string.streamer_toast);
    }

    /**
     * Run the Scores app.
     *
     * @param view Not used
     */
    public void runScores(View view) {
        showToast(R.string.scores_toast);
    }

    /**
     * Run the Library app.
     *
     * @param view Not used
     */
    public void runLibrary(View view) {
        showToast(R.string.library_toast);
    }

    /**
     * Run the Build It Bigger app.
     *
     * @param view Not used
     */
    public void runBuildItBigger(View view) {
        showToast(R.string.bigger_toast);
    }

    /**
     * Run the XYZ Reader app.
     *
     * @param view Not used
     */
    public void runXyzReader(View view) {
        showToast(R.string.reader_toast);
    }

    /**
     * Run the Capstone app.
     *
     * @param view Not used
     */
    public void runCapstone(View view) {
        showToast(R.string.capstone_toast);
    }

    /**
     * Displays a toast message in the app.
     *
     * @param resId Resource id of string resource
     */
    public void showToast(int resId) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, resId, duration);
        toast.show();
    }
}
