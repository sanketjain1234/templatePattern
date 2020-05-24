package com.sanket.designPattern.house;

import com.sanket.designPattern.templates.BuildHouseTemplate;

public class ConcreteHouse extends BuildHouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Built Concrete walls");
    }

    @Override
    public void buildFurniture() {
        System.out.println("Built Mixed material furniture");
    }

    @Override
    public void buildPillars() {
        System.out.println("Built Concrete Pillars");
    }
}
