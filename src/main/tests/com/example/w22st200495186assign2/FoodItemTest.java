package com.example.w22st200495186assign2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {

    private FoodItem foodItem;

    @BeforeEach
    void setUp() {
        foodItem = new FoodItem("Mc Double",400,2.29,3,"A slice of melted processed cheddar cheese between two 100% Canadian beef patties, topped with pickles, onions, ketchup and mustard on a toasted bun.");
    }

    @Test
    void setName() {
        assertEquals("Mc Double", foodItem.getName());
    }

    @Test
    void setNameNull() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setName("");
        });
    }

    @Test
    void setDescription() {
        assertEquals("A slice of melted processed cheddar cheese between two 100% Canadian beef patties, topped with pickles, onions, ketchup and mustard on a toasted bun."
                ,foodItem.getDescription());
    }

    @Test
    void setDescriptionNull() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setDescription("");
        });
    }

    @Test
    void setCalories() {
        assertEquals(400,foodItem.getCalories());
    }

    @Test
    void setCaloriesInvalid0() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setCalories(0);
        });
    }

    @Test
    void setCaloriesInvalidNegative() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setCalories(-5);
        });
    }

    @Test
    void setPrice() {
        assertEquals(2.29,foodItem.getPrice());
    }

    @Test
    void setPriceInvalid0() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setPrice(0);
        });
    }

    @Test
    void setPriceInvalidNegative() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setPrice(-5);
        });
    }

    @Test
    void setSpicyLevel() {
        assertEquals(3,foodItem.getSpicyLevel());
    }

    @Test
    void setSpicyLevelInvalid0() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setSpicyLevel(0);
        });
    }

    @Test
    void setSpicyLevelInvalidNegative() {

        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            foodItem.setSpicyLevel(-5);
        });
    }
}