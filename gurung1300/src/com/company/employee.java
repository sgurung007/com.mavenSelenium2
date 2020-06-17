package com.company;

public class employee<i1, i2> {
    private i1 name1;
    private i2 name2;

    public employee(i1 name1, i2 name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public i1 getName1() {
        return name1;
    }

    public void setName1(i1 name1) {
        this.name1 = name1;
    }

    public i2 getName2() {
        return name2;
    }

    public void setName2(i2 name2) {
        this.name2 = name2;
    }
}
