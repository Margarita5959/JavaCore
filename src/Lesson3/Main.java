package Lesson3;

import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
       Fruits();

        String[] array = {"father", "mother", "brother", "sister"};
        swapElement_Array(array, 1,2);
    }

   private static void swapElement_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray (array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void Fruits() {
        Box<Apple> appleBox = new Box<Apple>(1);
        Box<Orange> orangeBox = new Box<Orange>(1.5);
        Box<Apple> appleBox2 = new Box<Apple>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Вес appleBox: " + appleBox.getBoxWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Вес равный - " + appleBox.compare(orangeBox));
        System.out.println("----");

        appleBox.addFruits(appleBox2);

    }

}
