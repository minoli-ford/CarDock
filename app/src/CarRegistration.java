package com.example.cardock;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Arrays;

public class CarRegistration extends AppCompatActivity {

    EditText name, model, details, brand, year, price, fuel;
    RadioButton individual, company;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_registration);

        name = findViewById(R.id.regCarName);
        model = findViewById(R.id.regCarModel);
        details = findViewById(R.id.regCarDetails);
        brand = findViewById(R.id.regCarBrand);
        year = findViewById(R.id.regCarYear);
        price = findViewById(R.id.regCarPrice);
        fuel = findViewById(R.id.regCarFuel);
        individual = findViewById(R.id.individualRadio);
        company = findViewById(R.id.tradingRadio);
        register = findViewById(R.id.regbtn);

        Car car = new Car();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString();
                String Model = model.getText().toString();
                String Details = details.getText().toString();
                String Brand = brand.getText().toString();
                String Year = year.getText().toString();
                String Price = price.getText().toString();
                String Fuel = fuel.getText().toString();

                if(TextUtils.isEmpty(Name))
                    name.setError("Enter name");
                else if (TextUtils.isEmpty(Model))
                    model.setError("Enter model");
                else if(TextUtils.isEmpty(Details))
                    details.setError("Enter details");
                else if (TextUtils.isEmpty(Brand))
                    brand.setError("Enter brand");
                else if(TextUtils.isEmpty(Year))
                    year.setError("Enter year");
                else if(TextUtils.isEmpty(Price))
                    price.setError("Enter price");
                else if(TextUtils.isEmpty(Fuel))
                    fuel.setError("Enter fuel type");
                else
                {
                    car.addCar(Name,Model,Details,Brand,Year,Fuel,Price,MainActivity.name);
                    //once the car is registered successfully it can be viewed in the terminal
                    System.out.println(Arrays.deepToString(Car.Cars.toArray()));

                    Toast.makeText(CarRegistration.this, "Added successfully!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}