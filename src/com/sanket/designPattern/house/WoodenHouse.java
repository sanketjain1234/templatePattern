package com.sanket.designPattern.house;

import com.sanket.designPattern.templates.BuildHouseTemplate;

public class WoodenHouse extends BuildHouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Built Wooden walls");
    }

    @Override
    public void buildFurniture() {
        System.out.println("Built wooden furniture");
    }

    @Override
    public void buildPillars() {
        System.out.println("Built Wooden Pillars");
    }

}
