package co.mobilemakers.madlibs;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;


public class ResultsActivity extends ActionBarActivity {

    TextView mTv, mTv2, mTv3, mTv4, mTv5, mTv6, mTv7, mTv8, mTv9, mTv10;
    Random style = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        String[] results = getIntent().getStringArrayExtra(Intent.EXTRA_TEXT);
        findWidgets();
        setupWidgets(results);
    }

    private void setupWidgets(String[] results) {
        mTv.setText(results[0]);
        mTv2.setText(results[1]);
        mTv3.setText(results[2]);
        mTv4.setText(results[3]);
        mTv5.setText(results[4]);
        mTv6.setText(results[5]);
        mTv7.setText(results[6]);
        mTv8.setText(results[7]);
        mTv9.setText(results[8]);
        mTv10.setText(results[9]);
        randomStyle();
    }

    private void randomStyle() {
        mTv.setTypeface(null, style.nextInt(4));
        mTv2.setTypeface(null, style.nextInt(4));
        mTv3.setTypeface(null, style.nextInt(4));
        mTv4.setTypeface(null, style.nextInt(4));
        mTv5.setTypeface(null, style.nextInt(4));
        mTv6.setTypeface(null, style.nextInt(4));
        mTv7.setTypeface(null, style.nextInt(4));
        mTv8.setTypeface(null, style.nextInt(4));
        mTv9.setTypeface(null, style.nextInt(4));
        mTv10.setTypeface(null, style.nextInt(4));
        mTv.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv2.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv3.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv4.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv5.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv6.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv7.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv8.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv9.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
        mTv10.setTextColor(Color.rgb(style.nextInt(256),style.nextInt(256),style.nextInt(256)));
    }


    private void findWidgets() {
        mTv = (TextView) findViewById(R.id.textView);
        mTv2 = (TextView) findViewById(R.id.textView2);
        mTv3 = (TextView) findViewById(R.id.textView3);
        mTv4 = (TextView) findViewById(R.id.textView4);
        mTv5 = (TextView) findViewById(R.id.textView5);
        mTv6 = (TextView) findViewById(R.id.textView6);
        mTv7 = (TextView) findViewById(R.id.textView7);
        mTv8 = (TextView) findViewById(R.id.textView8);
        mTv9 = (TextView) findViewById(R.id.textView9);
        mTv10 = (TextView) findViewById(R.id.textView10);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_results, menu);
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
}
