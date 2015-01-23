package co.mobilemakers.madlibs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button mButton;
    EditText mEditRelative1, mEditRelative2, mEditAdjective1,
            mEditAdjective2, mEditAdjective3, mEditNamePerson,
            mEditVerbEd, mEditVerbIng, mEditName, mEditBody;
    TextWatcher generalTextWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        createTextWatcher();
        setupWidgets();
    }

    private void createTextWatcher(){
        generalTextWatcher = new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                mButton.setEnabled(setButtonStatus());
            }

        };
    }

    private String[] getText() {
        return new String[]{mEditRelative1.getText().toString(),
                mEditRelative2.getText().toString(),
                mEditAdjective1.getText().toString(),
                mEditAdjective2.getText().toString(),
                mEditAdjective3.getText().toString(),
                mEditNamePerson.getText().toString(),
                mEditVerbEd.getText().toString(),
                mEditVerbIng.getText().toString(),
                mEditName.getText().toString(),
                mEditBody.getText().toString()};
    }

    private void setupWidgets() {
        mButton.setEnabled(false);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, getText());
                startActivity(intent);
            }
        });

        mEditAdjective1.addTextChangedListener(generalTextWatcher);
        mEditRelative1.addTextChangedListener(generalTextWatcher);
        mEditRelative2.addTextChangedListener(generalTextWatcher);
        mEditAdjective1.addTextChangedListener(generalTextWatcher);
        mEditAdjective2.addTextChangedListener(generalTextWatcher);
        mEditAdjective3.addTextChangedListener(generalTextWatcher);
        mEditNamePerson.addTextChangedListener(generalTextWatcher);
        mEditVerbEd.addTextChangedListener(generalTextWatcher);
        mEditVerbIng.addTextChangedListener(generalTextWatcher);
        mEditName.addTextChangedListener(generalTextWatcher);
        mEditBody.addTextChangedListener(generalTextWatcher);
    }


    private boolean setButtonStatus(){
        return !(mEditRelative1.getText().toString().isEmpty()
                || mEditRelative2.getText().toString().isEmpty()
                || mEditAdjective1.getText().toString().isEmpty()
                || mEditAdjective2.getText().toString().isEmpty()
                || mEditAdjective3.getText().toString().isEmpty()
                || mEditNamePerson.getText().toString().isEmpty()
                || mEditVerbEd.getText().toString().isEmpty()
                || mEditVerbIng.getText().toString().isEmpty()
                || mEditName.getText().toString().isEmpty()
                || mEditBody.getText().toString().isEmpty());
    }

    private void findWidgets() {
        mEditAdjective1 = (EditText) findViewById(R.id.edit_adjective1);
        mEditAdjective2 = (EditText) findViewById(R.id.edit_adjective2);
        mEditAdjective3 = (EditText) findViewById(R.id.edit_adjective3);
        mEditRelative1 = (EditText) findViewById(R.id.edit_relative1);
        mEditRelative2 = (EditText) findViewById(R.id.edit_relative2);
        mEditVerbEd = (EditText) findViewById(R.id.edit_verb_ed);
        mEditVerbIng = (EditText) findViewById(R.id.edit_verb_ing);
        mEditNamePerson = (EditText) findViewById(R.id.edit_name_person);
        mEditName = (EditText) findViewById(R.id.edit_name);
        mEditBody = (EditText) findViewById(R.id.edit_body);

        mButton = (Button) findViewById(R.id.button);
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

}
