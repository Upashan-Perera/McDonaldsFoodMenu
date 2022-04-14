package com.example.w22st200495186assign2;

import java.util.ArrayList;

public class FoodItem {

    /**
     * Initializing the instance variables
     */
    private String name, description, imageLocation;
    private double calories, price, spicyLevel;
    private ArrayList<String> ingredients ;

    /**
     * This is the constructor for the foodItem class and this takes name, description, imagelocation, calories, price, spicylevel, ingredients as arguments
     * @param name
     * @param description
     //* @param imageLocation
     * @param calories
     * @param price
     * @param spicyLevel
     //* @param ingredients
    , ArrayList<String> ingredients, String imageLocation
     */
    public FoodItem(String name, double calories, double price, double spicyLevel, String description) {
        setName(name);
        setCalories(calories);
        setPrice(price);
        setSpicyLevel(spicyLevel);
        setIngredients(ingredients);
        setDescription(description);
        setImageLocation(imageLocation);
    }

    public FoodItem() {

    }

    /**
     * This is the getter method for name variable
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method for name variable
     * @param name
     */
    public void setName(String name) {

        name = name.trim();

        if(name.length() >= 2) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException(name +" should have at least 2 characters");
        }

    }

    /**
     * this is the getter method for description variable
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * this is the setter method for description variable
     * @param description
     */
    public void setDescription(String description) {

        description = description.trim();

        if(description.length() >= 2) {
            this.description = description;
        }
        else{
            throw new IllegalArgumentException(description +" is not long enough, please elaborate the food item you inserted");
        }
    }

    /**
     * this is the getter method for imagelocation variable
     * @return
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * this is the getter method for imagelocation variable
     * @param imageLocation
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    /**
     * this is the getter method for calories variable
     * @return
     */
    public double getCalories() {
        return calories;
    }

    /**
     * this is the getter method for calories variable
     * @param calories
     */
    public void setCalories(double calories) {

        if(calories > 0) {
            this.calories = calories;
        }
        else {
            throw new IllegalArgumentException(calories +" is not a valid input value");

        }

    }

    /**
     * This is the getter method for price variable
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * This is the getter method for price variable
     * @param price
     */
    public void setPrice(double price) {

        if(price > 0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException(price +" is not a valid input value");
        }

    }

    /**
     * this is the getter method for the spicyLevel variable
     * @return
     */
    public double getSpicyLevel() {
        return spicyLevel;
    }

    /**
     * this is the setter method for the spicyLevel variable
     * @param spicyLevel
     */
    public void setSpicyLevel(double spicyLevel) {

        if(spicyLevel > 0) {
            this.spicyLevel = spicyLevel;
        }
        else {
            throw new IllegalArgumentException(spicyLevel +" is not a valid input value");
        }

    }

    /**
     * This is the getter method for the arraylist
     * @return
     */
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    /**
     * this is the setter method for the arraylist
     * @param ingredients
     */
    public void setIngredients(ArrayList<String> ingredients) {

        ingredients = new ArrayList<>();
    }

    /**
     * this is the toString function returning some important values
     * @return
     */
    public String toString() {
        return String.format("%s-%.2f-$%.2f-%s-%.1f",name,calories,price,description,spicyLevel);
    }
}
