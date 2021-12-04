package Lesson3;

import java.util.ArrayList;

public class Box<F> {

    ArrayList<F> fruits = new ArrayList();
    private double weightFruit = 0.0;

    public <F> Box(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(Box<F> box){
        System.out.println("Before merging. Quantity box 1: " + fruits.size());
        System.out.println("Before merging. Quantity box 2: " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        box.fruits.trimToSize();
        System.out.println("After merging. Quantity box 1: " + fruits.size());
        System.out.println("After merging. Quantity box 2: " + box.fruits.size());
    }

}
