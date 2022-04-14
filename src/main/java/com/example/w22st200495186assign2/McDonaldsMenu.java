package com.example.w22st200495186assign2;

import java.util.ArrayList;

public class McDonaldsMenu {

    private String LimitedTimeHappyMealTheme;
    private static ArrayList<FoodItem> mcDonaldsMenu;


    public McDonaldsMenu(String limitedTimeHappyMealTheme) {

        setLimitedTimeHappyMealTheme(limitedTimeHappyMealTheme);

        mcDonaldsMenu = new ArrayList<>();
    }

    public String getLimitedTimeHappyMealTheme() {
        return LimitedTimeHappyMealTheme;
    }

    public void setLimitedTimeHappyMealTheme(String limitedTimeHappyMealTheme) {

        limitedTimeHappyMealTheme = limitedTimeHappyMealTheme.trim();

        if(limitedTimeHappyMealTheme.length() >= 2) {
            this.LimitedTimeHappyMealTheme = limitedTimeHappyMealTheme;
        }
        else{
            throw new IllegalArgumentException(limitedTimeHappyMealTheme +" should have at least 2 characters");
        }
    }

    public static ArrayList<FoodItem> getMcDonaldsMenu() {
        return mcDonaldsMenu;
    }

    public void setMcDonaldsMenu(ArrayList<FoodItem> mcDonaldsMenu) {
        this.mcDonaldsMenu = mcDonaldsMenu;
    }

    public void addFoodItem(FoodItem foodItem) {

        mcDonaldsMenu.add(foodItem);
    }

    public int getNumOfFoodItems() {

        return mcDonaldsMenu.size();
    }

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
