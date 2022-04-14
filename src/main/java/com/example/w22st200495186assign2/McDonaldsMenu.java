package com.example.w22st200495186assign2;

import java.util.ArrayList;

public class McDonaldsMenu {

    /**
     * Initializing the instance variables
     */
    private String LimitedTimeHappyMealTheme;
    private static ArrayList<FoodItem> mcDonaldsMenu;


    /**
     * Intializing the constructor
     * @param limitedTimeHappyMealTheme
     */
    public McDonaldsMenu(String limitedTimeHappyMealTheme) {

        setLimitedTimeHappyMealTheme(limitedTimeHappyMealTheme);

        mcDonaldsMenu = new ArrayList<>();
    }

    /**
     * Getting the limited time happy meal theme
     * @return
     */
    public String getLimitedTimeHappyMealTheme() {
        return LimitedTimeHappyMealTheme;
    }

    /**
     * setting the limited time happymeal theme
     * @param limitedTimeHappyMealTheme
     */
    public void setLimitedTimeHappyMealTheme(String limitedTimeHappyMealTheme) {

        limitedTimeHappyMealTheme = limitedTimeHappyMealTheme.trim();

        if(limitedTimeHappyMealTheme.length() >= 2) {
            this.LimitedTimeHappyMealTheme = limitedTimeHappyMealTheme;
        }
        else{
            throw new IllegalArgumentException(limitedTimeHappyMealTheme +" should have at least 2 characters");
        }
    }

    /**
     * getting the FoodItem type array list
     * @return
     */
    public static ArrayList<FoodItem> getMcDonaldsMenu() {
        return mcDonaldsMenu;
    }

    /**
     * setting the FoodItem type array list
     * @param mcDonaldsMenu
     */
    public void setMcDonaldsMenu(ArrayList<FoodItem> mcDonaldsMenu) {
        this.mcDonaldsMenu = mcDonaldsMenu;
    }

    /**
     *method to add FoodItem type objects
     * @param foodItem
     */
    public void addFoodItem(FoodItem foodItem) {

        mcDonaldsMenu.add(foodItem);
    }

    /**
     * Method to get number of food items
     * @return
     */
    public int getNumOfFoodItems() {

        return mcDonaldsMenu.size();
    }

    /**
     * getting the cheapest food item
     * @return
     */
    public FoodItem getCheapestFoodItem() {

        FoodItem cheapest = null;

        if(mcDonaldsMenu.size() > 0) {

            cheapest = mcDonaldsMenu.get(0);

            for(FoodItem foodItem : mcDonaldsMenu){

                if(cheapest.getPrice() > foodItem.getPrice()) {

                    cheapest = foodItem;
                }
            }
        }
        return cheapest;
    }

    /**
     * Getting the most expensive food item
     * @return
     */
    public FoodItem getMostExpensiveFoodItem() {

        FoodItem mostExpensive = null;

        if(mcDonaldsMenu.size() > 0) {

            mostExpensive = mcDonaldsMenu.get(0);

            for(FoodItem foodItem : mcDonaldsMenu){

                if(mostExpensive.getPrice() < foodItem.getPrice()) {

                    mostExpensive = foodItem;
                }
            }
        }
        return mostExpensive;
    }
}
