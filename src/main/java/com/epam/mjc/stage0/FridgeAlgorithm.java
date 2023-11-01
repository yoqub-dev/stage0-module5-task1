package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm implements Fridge{

    private boolean isOpen = false;
    private boolean hasMilk = true;

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {

    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Fridge is closed.");
    }

    @Override
    public void open() {
        isOpen = true;
        System.out.println("Fridge is opened.");
    }

    @Override
    public void getMilk() {
        if (isOpen) {
            if (hasMilk) {
                System.out.println("Got the milk from the fridge!");
            } else {
                System.out.println("No milk in the fridge.");
            }
        } else {
            System.out.println("Fridge is not open. Cannot get milk.");
        }
    }
}
