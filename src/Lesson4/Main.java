package Lesson4;

public class Main {
    public static void main(String[] args) {
        doPhoneBook();
  Words wordsArray = new Words (createArrayWords());
  wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Maksimov","89197006566");
        phoneBook.addElementPhoneBook("Maksimov","89197006573");
        phoneBook.addElementPhoneBook("Maksimov","89197006677");

        phoneBook.addElementPhoneBook("Lent","8982462");
        phoneBook.addElementPhoneBook("Lent","8 982 462");
        phoneBook.addElementPhoneBook("Lent","8982 462");


        System.out.println("Maksimov: " + phoneBook.getPhonesByName("Maksimov"));
        System.out.println("Lent: " + phoneBook.getPhonesByName("Lent"));
        System.out.println("Olganova: " + phoneBook.getPhonesByName("Olganova"));
        System.out.println("Nikitina: " + phoneBook.getPhonesByName("Nikitina"));
    }


    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Apple";
        strings[1] = "Avocado";
        strings[2] = "Plum";
        strings[3] = "Pear";
        strings[4] = "Grapes";
        strings[5] = "Mango";
        strings[6] = "Plum";
        strings[7] = "Lime";
        strings[8] = "Banana";
        strings[9] = "Pear";
        return strings;
    }

}

