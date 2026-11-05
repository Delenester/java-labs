package org.example8;

class Tree extends Plant {
    private int age;

    public Tree(String name, double height, String type, int age) {
        super(name, height, type);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void grow() {
        System.out.println("Растет быстро");
    }
}
