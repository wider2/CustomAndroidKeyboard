package com.medeuz.customkeyboard;

import android.content.Intent;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Alexei on 8/3/2017.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, SimpleIME.class);
        intent.putExtra("task", "Поиграть с котом");
        startService(intent);

        KeyboardView kv = ((KeyboardView) findViewById(R.id.keyboardview));
        //mCustomKeyboard = new CustomKeyboard(getActivity(), v, kv.getId(), R.xml.hexkbd );
        //mCustomKeyboard.registerEditText(R.id.v_personal_id);

    }

}
