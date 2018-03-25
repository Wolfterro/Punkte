/*
The MIT License (MIT)

Copyright (c) 2018 Wolfgang Almeida <wolfgang.almeida@yahoo.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package io.github.wolfterro.punkte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button0;
    private Button buttonHalf;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button5;
    private Button button8;
    private Button button13;
    private Button button21;
    private Button button34;
    private Button button55;
    private Button button89;
    private Button button144;
    private Button button233;
    private Button buttonInfinite;
    private Button buttonQuestionMark;
    private ImageButton buttonCoffee;
    private ImageButton buttonCS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definindo os botões do aplicativo
        // ---------------------------------
        button0 = (Button)findViewById(R.id.button_0);
        buttonHalf = (Button)findViewById(R.id.button_half);
        button1 = (Button)findViewById(R.id.button_1);
        button2 = (Button)findViewById(R.id.button_2);
        button3 = (Button)findViewById(R.id.button_3);
        button5 = (Button)findViewById(R.id.button_5);
        button8 = (Button)findViewById(R.id.button_8);
        button13 = (Button)findViewById(R.id.button_13);
        button21 = (Button)findViewById(R.id.button_21);
        button34 = (Button)findViewById(R.id.button_34);
        button55 = (Button)findViewById(R.id.button_55);
        button89 = (Button)findViewById(R.id.button_89);
        button144 = (Button)findViewById(R.id.button_144);
        button233 = (Button)findViewById(R.id.button_233);
        buttonInfinite = (Button)findViewById(R.id.button_infinite);
        buttonQuestionMark = (Button)findViewById(R.id.button_question_mark);
        buttonCoffee = (ImageButton)findViewById(R.id.imageButton_coffee);
        buttonCS = (ImageButton)findViewById(R.id.imageButton_cs);

        // Definindo ações de clique para cada botão
        // -----------------------------------------
        button0.setOnClickListener(this);
        buttonHalf.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button5.setOnClickListener(this);
        button8.setOnClickListener(this);
        button13.setOnClickListener(this);
        button21.setOnClickListener(this);
        button34.setOnClickListener(this);
        button55.setOnClickListener(this);
        button89.setOnClickListener(this);
        button144.setOnClickListener(this);
        button233.setOnClickListener(this);
        buttonInfinite.setOnClickListener(this);
        buttonQuestionMark.setOnClickListener(this);
        buttonCoffee.setOnClickListener(this);
        buttonCS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        String intentKey = "VALUE";

        switch (v.getId()) {
            case R.id.button_0:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.zero));
                break;
            case R.id.button_half:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.half));
                break;
            case R.id.button_1:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.one));
                break;
            case R.id.button_2:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.two));
                break;
            case R.id.button_3:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.three));
                break;
            case R.id.button_5:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.five));
                break;
            case R.id.button_8:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.eight));
                break;
            case R.id.button_13:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.thirteen));
                break;
            case R.id.button_21:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.twenty_one));
                break;
            case R.id.button_34:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.thirty_four));
                break;
            case R.id.button_55:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.fifty_five));
                break;
            case R.id.button_89:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.eighty_nine));
                break;
            case R.id.button_144:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.one_hundred_fourty_four));
                break;
            case R.id.button_233:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.two_hundred_thirty_three));
                break;
            case R.id.button_infinite:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.infinite));
                break;
            case R.id.button_question_mark:
                intent = new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra(intentKey, getString(R.string.question_mark));
                break;
            case R.id.imageButton_coffee:
                intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra(intentKey, R.drawable.coffee_cup);
                break;
            case R.id.imageButton_cs:
                intent = new Intent(MainActivity.this, ImageActivity.class);
                intent.putExtra(intentKey, R.drawable.counter_strike_icon);
                break;
            default:
                break;
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}
