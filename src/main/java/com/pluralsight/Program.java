package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        UserInterface user =  new UserInterface("src/main/resources/CarDealerShip.CSV");
        user.choiceMenu();
    }
}
