package com.example.cardock;

import java.util.ArrayList;

public class Car {
    private String carName;
    private String model;
    private String details;
    private String brand;
    private String year;
    private String fuelType;
    private String price;
    private String ownerName;

    public static ArrayList<String[]> Cars;
    private static final ArrayList<String[]> cars = new ArrayList<String[]>();

    public void addCar(String carName, String model, String details, String brand, String year, String fuelType, String price, String ownerName){

        String[] array = {carName, model, details, brand, year, fuelType, price, ownerName};
        cars.add(array);
        Cars = cars;

    }

    public void updateCar(){

    }

    public void deleteCar(){

    }

}
