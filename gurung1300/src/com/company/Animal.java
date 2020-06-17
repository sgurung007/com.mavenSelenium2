package com.company;

public class Animal {
    private String nameAnimal;
    private String kingdomAnimal;
    private double heightAnimal;

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getKingdomAnimal() {
        return kingdomAnimal;
    }

    public void setKingdomAnimal(String kingdomAnimal) {
        this.kingdomAnimal = kingdomAnimal;
    }

    public double getHeightAnimal() {
        return heightAnimal;
    }

    public void setHeightAnimal(double heightAnimal) {
        this.heightAnimal = heightAnimal;
    }

    public Animal(String nameAnimal, String kingdomAnimal, double heightAnimal) {
        this.nameAnimal = nameAnimal;
        this.kingdomAnimal = kingdomAnimal;
        this.heightAnimal = heightAnimal;
    }
}
