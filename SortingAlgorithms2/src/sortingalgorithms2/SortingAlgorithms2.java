package sortingalgorithms2;

import java.util.*;

public class SortingAlgorithms2 {

    public static void main(String[] args) {

        Random randomizer = new Random();

        String[] names_StringArray = {"Aaron", "Abigail", "Alexander", "Alice", "Benjamin", "Brianna", "Caleb", "Charlotte", "Daniel",
            "Diana", "Elijah", "Emma", "Gabriel", "Grace", "Hannah", "Isaac", "Isabella", "Jacob", "Jasmine", "Joshua", "Katherine",
            "Kevin", "Leah", "Liam", "Lucas", "Madison", "Mathew", "Mia", "Nathan", "Noah", "Olivia", "Owen", "Patrick", "Penelope",
            "Quentin", "Rachel", "Samuel", "Sarah", "Sophia", "Steven", "Thomas", "Tristan", "Uriel", "Vanessa", "Victor", "Willian",
            "Xander", "Yasmine", "Zachary", "Zoe"};

        String[] randomizedNames_StringArray = new String[names_StringArray.length];

        // puts the names into a randomized array
        for (String name_String : names_StringArray) {

            while (true) {

                int chosenRandomIndex = randomizer.nextInt(names_StringArray.length);
                if (randomizedNames_StringArray[chosenRandomIndex] == null) {

                    randomizedNames_StringArray[chosenRandomIndex] = name_String;
                    break;

                }

            }

        }

        printOutArray(randomizedNames_StringArray, "Unasorted/ Randomized");

        // merge sort
        mergeSort(randomizedNames_StringArray);
    }

    static void mergeSort(String[] stringArray) {
        
        merge(stringArray, 0, stringArray.length);
        
    }
    
    static void merge(String[] stringArray, int low, int high) {

        if (high - low == 1) {
            return;
        }

        int mid = low + (high - low) / 2;
        merge(stringArray, low, mid);
        merge(stringArray, mid, high);

        mergeSort()
        
    }

    private static void printOutArray(String[] stringArray, String sortingType) {

        System.out.println("Sorting type: " + sortingType);
        linebreak(0);

        int rowCount = 0;
        for (String stringArray1 : stringArray) {
            System.out.printf("%s, ", stringArray1);
            if (rowCount < 3) {
                rowCount++;
            } else {
                System.out.println();
                rowCount = 0;
            }
        }

        System.out.println();
        linebreak(2);
    }

    public static void linebreak(int type) {

        switch (type) {

            case 0 -> {
                System.out.println("------------------------------------------------------------");
                System.out.println();
            }

            case 1 -> {
                System.out.println("------------------------------");
                System.out.println();
            }

            case 2 -> {
                System.out.println("------------------------------------------------------------");
                System.out.println("------------------------------------------------------------");
                System.out.println();
            }

            case 3 -> {
                System.out.println("------------------------------");
                System.out.println("------------------------------");
                System.out.println("------------------------------");
                System.out.println();
            }

            case 4 ->
                System.out.println();

        }

    }

}
