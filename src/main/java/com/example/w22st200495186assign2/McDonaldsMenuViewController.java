package com.example.w22st200495186assign2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class McDonaldsMenuViewController implements Initializable {

    @FXML
    private Label caloriesLabel;

    @FXML
    private TextField caloriesTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextArea descriptionTextBox;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField priceTextField;

    @FXML
    private Label spicyLevelLabel;

    @FXML
    private TextField spicyLevelTextField;

    @FXML
    private Button submitButton;

    @FXML
    private ListView<FoodItem> listView;

    @FXML
    private Button selectButton;

    ObservableList list = FXCollections.observableArrayList();

    private McDonaldsMenu theMenu;
    private ListView<String> itemList;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        theMenu = new McDonaldsMenu("Teen Titans Go!");

        FoodItem foodItem01 = new FoodItem("Mc Double",400,2.29,3,"A slice of melted processed cheddar cheese between two 100% Canadian beef patties, topped with pickles, onions, ketchup and mustard on a toasted bun.");
        FoodItem foodItem02 = new FoodItem("Big Mac",493,5.69,4,"Two 100% beef patties, a slice of cheese, lettuce, onion and pickles. And the sauce. That unbeatable, tasty Big Mac® sauce. You know you want to.");
        FoodItem foodItem03 = new FoodItem("Mc Chicken",369,5.39,1,"Crispy coated chicken with lettuce and our sandwich sauce, in a soft, sesame-topped bun. A true classic.");
        FoodItem foodItem04 = new FoodItem("Mc Junior",370,1.99,1,"You don’t need to compromise with the great taste of a Junior Chicken sandwich, made with chicken raised on Canadian farms, at a price you can always feel good about.");
        FoodItem foodItem05 = new FoodItem("Quarter Pounder cheese",507,5.69,3,"A quarter-pound patty of 100% beef, with two slices of cheese, onions, pickles, mustard and a dollop of tomato ketchup in a sesame seed bun. Irresistible.\n" +
                "\n");

        theMenu.addFoodItem(foodItem01);
        theMenu.addFoodItem(foodItem02);
        theMenu.addFoodItem(foodItem03);
        theMenu.addFoodItem(foodItem04);
        theMenu.addFoodItem(foodItem05);

        viewNextItem();

        submitButton.setOnAction(this::addNewItem);

        listView.getItems().addAll(McDonaldsMenu.getMcDonaldsMenu());

        selectButton.setOnAction(this::listViewSelectedItem);

    }

    @FXML
    void viewNextItem() {

        ArrayList<FoodItem> temporary = theMenu.getMcDonaldsMenu();
        FoodItem currentFoodItem = null;

        if(temporary.size() > 0 ) {

            currentFoodItem = temporary.remove(0);
        }
        else {
            throw new IndexOutOfBoundsException("The program is over");
        }


        nameLabel.setText(currentFoodItem.getName());
        priceLabel.setText(String.valueOf(currentFoodItem.getPrice()));
        caloriesLabel.setText(String.valueOf(currentFoodItem.getCalories()));
        spicyLevelLabel.setText(String.valueOf(currentFoodItem.getSpicyLevel()));
        descriptionTextArea.setText(currentFoodItem.getDescription());
    }

    @FXML
    void addNewItem(ActionEvent event) {

        FoodItem newFood = new FoodItem();

        newFood.setName(nameTextField.getText());
        String priceAsAString = priceTextField.getText();
        newFood.setPrice(Double.parseDouble(priceAsAString));
        String caloriesAsAString = caloriesTextField.getText();
        newFood.setCalories(Double.parseDouble(caloriesAsAString));
        String spicyLevelAsAString = spicyLevelTextField.getText();
        newFood.setSpicyLevel(Double.parseDouble(spicyLevelAsAString));
        newFood.setDescription(descriptionTextBox.getText());

        theMenu.addFoodItem(newFood);

        nameTextField.clear();
        priceTextField.clear();
        caloriesTextField.clear();
        spicyLevelTextField.clear();
        descriptionTextBox.clear();

        listView.getItems().addAll(newFood);
    }

    public void listViewSelectedItem(ActionEvent event) {

        FoodItem currentFoodItem = listView.getSelectionModel().getSelectedItem();

        nameLabel.setText(currentFoodItem.getName());
        priceLabel.setText(String.valueOf(currentFoodItem.getPrice()));
        caloriesLabel.setText(String.valueOf(currentFoodItem.getCalories()));
        spicyLevelLabel.setText(String.valueOf(currentFoodItem.getSpicyLevel()));
        descriptionTextArea.setText(currentFoodItem.getDescription());
    }
}
