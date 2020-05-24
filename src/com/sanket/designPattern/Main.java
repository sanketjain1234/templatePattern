package com.sanket.designPattern;

import com.sanket.designPattern.house.ConcreteHouse;
import com.sanket.designPattern.house.WoodenHouse;
import com.sanket.designPattern.templates.BuildHouseTemplate;

public class Main {

    public static void main(String[] args) {

        BuildHouseTemplate concreteHouse = new ConcreteHouse();
        concreteHouse.buildHouse();

        BuildHouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();
    }
}
