package com.sanket.designPattern.templates;

public abstract class BuildHouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildFurniture();
        System.out.println("House has been built");
    }

    public abstract void buildWalls();

    public abstract void buildFurniture();

    public abstract void buildPillars();

    public void buildFoundation(){
        System.out.println("Foundation Built! ");
    }



}
