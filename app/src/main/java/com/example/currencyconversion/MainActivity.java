package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    String [] listCurrency = {
        "USD", "VND", "EUR","JPY","CNY","KRW","RUB", "SGD","CAD","EGP"//Ai Cập
    };
    TextView from, amount, result;
    TextView to;
    Double var1, var2;
    Button one, two, three, four, five, six, seven, eight, nine, zero, go, space, delete, comma, point;
    Spinner spinnerIn, spinnerOut;
    double usd2vnd = 23177;
    double usd2eur = 0.84324;
    double usd2jpy = 104.69;
    double usd2cny = 6.6868;
    double usd2krw = 1128.73;
    double usd2rub = 76.1198;
    double usd2sgd = 1.3584;
    double usd2cad = 1.3127;
    double usd2egp = 15.712;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        from = (TextView) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);

        amount = (TextView) findViewById(R.id.amount);
        result = (TextView) findViewById(R.id.result);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        space = (Button) findViewById(R.id.space);
        go = (Button) findViewById(R.id.go);
        delete = (Button) findViewById(R.id.delete);
        comma = (Button) findViewById(R.id.comma);
        point = (Button) findViewById(R.id.point);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        comma.setOnClickListener(this);
        point.setOnClickListener(this);
        delete.setOnClickListener(this);



        spinnerIn = (Spinner) findViewById(R.id.spinnerIn);
        spinnerOut = (Spinner) findViewById(R.id.spinnerOut);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listCurrency
        );
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        spinnerIn.setAdapter(adapter1);
        spinnerOut.setAdapter(adapter1);

        spinnerIn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.one){
            amount.setText(amount.getText()+"1");
        }
        else if (id == R.id.two){
            amount.setText(amount.getText()+"2");
        }
        else if (id == R.id.three){
            amount.setText(amount.getText()+"3");
        }
        else if (id == R.id.four){
            amount.setText(amount.getText()+"4");
        }
        else if (id == R.id.five){
            amount.setText(amount.getText()+"5");
        }
        else if (id == R.id.six){
            amount.setText(amount.getText()+"6");
        }
        else if (id == R.id.seven){
            amount.setText(amount.getText()+"7");
        }
        else if (id == R.id.eight){
            amount.setText(amount.getText()+"8");
        }
        else if (id == R.id.nine){
            amount.setText(amount.getText()+"9");
        }
        else if (id == R.id.zero){
            amount.setText(amount.getText()+"0");
        }
        else if (id == R.id.comma){
            amount.setText(amount.getText()+".");
        }
        else if (id == R.id.point){
            amount.setText(amount.getText()+".");
        }
        else if(id==R.id.delete){
            amount.setText("");
        }
        else if (id == R.id.go){
            var1 = Double.parseDouble(amount.getText().toString());
//USD
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "USD")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1*usd2egp;
                result.setText(var2.toString());
            }

//VND
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2vnd*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2vnd*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2vnd*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2vnd*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2vnd*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2vnd*usd2sgd;
                result.setText(var2.toString());
            }if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2vnd*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "VND")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2vnd*usd2egp;
                result.setText(var2.toString());
            }

//EUR
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2eur*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2eur*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2eur*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2eur*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2eur*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2eur*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2eur*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EUR")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2eur*usd2egp;
                result.setText(var2.toString());
            }

//JPY
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2jpy*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2jpy*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2jpy*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2jpy*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2jpy*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2jpy*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2jpy*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "JPY")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2jpy*usd2egp;
                result.setText(var2.toString());
            }

//CNY
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2cny*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2cny*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2cny*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2cny*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2cny*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2cny*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2cny*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CNY")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2cny*usd2egp;
                result.setText(var2.toString());
            }

//KRW
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2krw*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2krw*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2krw*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2krw*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2krw*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2krw*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2krw*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "KRW")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2krw*usd2egp;
                result.setText(var2.toString());
            }


//RUB
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2rub*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2rub*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2rub*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2rub*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2rub*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2rub*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2rub*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "RUB")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2rub*usd2egp;
                result.setText(var2.toString());
            }

//SGD
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2sgd*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2sgd*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2sgd*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2sgd*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2sgd*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2sgd*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2sgd*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "SGD")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2sgd*usd2egp;
                result.setText(var2.toString());
            }

//CAD
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2cad*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2cad*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2cad*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2cad*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2cad*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2cad*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2cad*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "CAD")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1/usd2cad*usd2egp;
                result.setText(var2.toString());
            }

//EGP
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "USD")){
                var2 = var1/usd2egp;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "VND")){
                var2 = var1/usd2egp*usd2vnd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "EUR")){
                var2 = var1/usd2egp*usd2eur;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "JPY")){
                var2 = var1/usd2egp*usd2jpy;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "CNY")){
                var2 = var1/usd2egp*usd2cny;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "KRW")){
                var2 = var1/usd2egp*usd2krw;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "RUB")){
                var2 = var1/usd2egp*usd2rub;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "SGD")){
                var2 = var1/usd2egp*usd2sgd;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "CAD")){
                var2 = var1/usd2egp*usd2cad;
                result.setText(var2.toString());
            }
            if((spinnerIn.getSelectedItem().toString() == "EGP")&&(spinnerOut.getSelectedItem().toString() == "EGP")){
                var2 = var1;
                result.setText(var2.toString());
            }
        }
    }
}