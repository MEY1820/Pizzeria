package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Pizza pizza;
    TextView total;
    double price_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = new Pizza();
        total = findViewById(R.id.total);

    }

    public void radioClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.pequeña:
                if (checked)
                    pizza.setPizza_size_price(4.50);
                break;
            case R.id.mediana:
                if (checked)
                    pizza.setPizza_size_price(10.00);
                break;
            case R.id.grande:
                if (checked)
                    pizza.setPizza_size_price(15.00);
                break;
        }
            total.setText("Total:" + pizza.getPizza_size_price());
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view) .isChecked();
        switch (view.getId()){
            case R.id.jamon:
                if (checked)
                   pizza.setJamón_price(2.50);
                else
                   pizza .setJamón_price(0);
                break;

            case R.id.pollo:
                if (checked)
                    pizza.setPollo_price(2.50);
                else
                    pizza .setPollo_price(0);
                break;

            case R.id.piña:
                if (checked)
                    pizza.setPiña_price(3.00);
                else
                    pizza .setPiña_price(0);
                break;

            case R.id.carne:
                if (checked)
                    pizza.setCarne_price(3.00);
                else
                    pizza .setCarne_price(0);
                break;

            case R.id.peperoni:
                if (checked)
                    pizza.setPeperoni_price(2.00);
                else
                    pizza .setPeperoni_price(0);
                break;

            case R.id.hongos:
                if (checked)
                    pizza.setHongos_price(2.50);
                else
                    pizza .setHongos_price(0);
                break;

            case R.id.aceitunas:
                if (checked)
                    pizza.setAceitunas_price(2.50);
                else
                    pizza .setAceitunas_price(0);
                break;
        }
        total.setText("Total pagar:" + "$"+ total_calculate());
    }
    private  double total_calculate()
    {
        price_total = pizza.getPizza_size_price()+pizza.getCarne_price()+pizza.getHongos_price()+pizza.getPeperoni_price()+pizza.getJamón_price()+pizza.getPollo_price()+pizza.getAceitunas_price()+pizza.getPiña_price();
        return price_total;
    }
}
