package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Feladat: 1-100-ig hány szám osztható 3-al? Írjuk ki őket!
        System.out.println("1. task: " + getNumberOfNumbersDividableByThreeFromOneToOneHundred());

        //2. Feladat: 1-100-ig a 3-al osztható számok közül hány osztható 4-el is? Írjuk ki őket!
        System.out.println("2. task: " + getNumberOfNumbersDividableByThreeAndFourFromOneToOneHundred());

        //3. Feladat: Adott int array-ben rakjuk növekvő sorrendbe a számokat.
        int[] orderA = new int[]{1,2,3,4,5,6,7,9,8};
        int[] orderB = new int[]{3,10,2,1,6,7,109};
        int[] orderC = new int[]{9,8,7,6,5,4,3,2,1,0,-1,-3};
        int[] orderD = new int[]{1,2,3,4,5,6,7,8};
        int[] orderE = new int[]{};

        System.out.println("3.A task: " + orderIntArray(orderA));
        System.out.println("3.B task: " + orderIntArray(orderB));
        System.out.println("3.C task: " + orderIntArray(orderC));
        System.out.println("3.D task: " + orderIntArray(orderD));
        System.out.println("3.E task: " + orderIntArray(orderE));

        //4. Feladat: Adott String arrayben szerepel-e a Spy szó?
        String[] spyA = new String[]{"John", "Maria", "Spy", "Mario", "Spy"};
        String[] spyB = new String[]{"John", "Maria", "Mario"};
        String[] spyC = new String[]{"John", "Maria", "SPY", "Mario", "spy"};
        String[] spyD = new String[]{};

        System.out.println("4.A task: " + areThereSpies(spyA));
        System.out.println("4.B task: " + areThereSpies(spyB));
        System.out.println("4.C task: " + areThereSpies(spyC));
        System.out.println("4.D task: " + areThereSpies(spyD));

        //5. Feladat: Kémkereső -> Case insensitive hány kém van az arrayben?
        System.out.println("5.A task: " + howManySpiesCaseInsensitive(spyA));
        System.out.println("5.B task: " + howManySpiesCaseInsensitive(spyB));
        System.out.println("5.C task: " + howManySpiesCaseInsensitive(spyC));
        System.out.println("5.D task: " + howManySpiesCaseInsensitive(spyD));

        //6. Feladat: Mindenki aki nem kém az XYZ-vel kezdődik vagy végződik és van neve. Írjuk ki a nevük XYZ nélkül.
        String[] notSpyA = new String[]{"XYZPeter", "John", "MarkXYZ", "Bob"};
        String[] notSpyB = new String[]{"", "John", "XYZMarkXYZ", "XYZ"};
        String[] notSpyC = new String[]{"XYZPeter", "MarkXYZ", null};
        String[] notSpyD = new String[]{"XYZPeter", "MarkXYZ", "XYZJulia"};

        findNonSpies(notSpyA);
        findNonSpies(notSpyB);
        findNonSpies(notSpyC);
        findNonSpies(notSpyD);

        //7. Feladat: Adott int array 7 számmal. Döntsük el, hogy jó-e ez a hét nyaraláshoz. Jó hét -> Minden nap 25 fok vagy fölötte legyen.
        int[] week1 = new int[]{30, 27, 26, 28, 28, 30, 25};
        int[] week2 = new int[]{26, 20, 26, 31, 24, 30, 12};
        int[] week3 = new int[]{30, 27, 26, -28, 28, 3, 25};
        int[] week4 = new int[]{27, 27, 26, 28, 37, 33, 35};

        System.out.println("Week 1 is " + isItAGoodDayForVacation(week1) + "good for vacation!");
        System.out.println("Week 2 is " + isItAGoodDayForVacation(week2) + "good for vacation!");
        System.out.println("Week 3 is " + isItAGoodDayForVacation(week3) + "good for vacation!");
        System.out.println("Week 4 is " + isItAGoodDayForVacation(week4) + "good for vacation!");

        //8. Feladat: int[][]-ből válasszuk ki melyik a legjobb nyaraláshoz -> legtöbb olyan nap, amikor 25 fok fölötti az időjárás.
        int[][] month1 = new int[][]{new int[]{25, 25, 25, 25, 25, 25, 25}, new int[]{26, 27, 30, 23, 25, 25, 25}};
        int[][] month2 = new int[][]{new int[]{21, 26, 35, 27, 19, 20, 25}, new int[]{26, 27, 30, 23, 25, 25, 25},
                new int[]{30, 30, 30, 23, 27, 27, 23}};
        int[][] month3 = new int[][]{new int[]{19, 20, 22, 23, 0, 23, 21}, new int[]{21, 22, 20, 16, 14, 19, 20},
        new int[]{10, 14, 16, 10, 5, 19, 21}, new int[]{20, 22, 24, 20, 22, 21, 24}};

        System.out.println("1. The best week to go on a vacation is: " + findBestWeekForVacation(month1));
        System.out.println("2. The best week to go on a vacation is: " + findBestWeekForVacation(month2));
        System.out.println("3. The best week to go on a vacation is: " + findBestWeekForVacation(month3));

        //9. Feladat: Switch segítségével hányszor szerepel egy String array-ben 5 adott szó (alma, körte, banán, szilva, meggy)?
        String[] wordCounter1 = new String[]{"alma", "körte", "banán", "ananász", "paradicsom", "meggy", "banán", "alma"};
        String[] wordCounter2 = new String[]{"alma", "aLmA", "alma", "ananász", "ALMA", "meggy", "baNÁn", "AlmA"};
        String[] wordCounter3 = new String[]{"alma", "körte", null, "ananász", "körte",
                "körte", "meggy", "banán", "alma", "banán", "meggy", "meggy", "szilva", "szilva", "szilva"};

        countFruit(wordCounter1);
        countFruit(wordCounter2);
        countFruit(wordCounter3);

        //10. Feladat: Adott két int array. Írjuk ki azokat az elemeket, amik csak az egyik array-ben szerepelnek.
        int[] compare1 = new int[]{1,2,3,4,5};
        int[] compare2 = new int[]{1,2,3};
        findDifferences(compare1, compare2);

        int[] compare3 = new int[]{1,2,3};
        int[] compare4 = new int[]{1,2,3, 4, 5};
        findDifferences(compare3, compare4);

        int[] compare5 = new int[]{1,2,3};
        int[] compare6 = new int[]{4,5,6};
        findDifferences(compare5, compare6);

        int[] compare7 = new int[]{};
        int[] compare8 = new int[]{1,2,3};
        findDifferences(compare7, compare8);
    }

    //1. Feladat: 1-100-ig hány szám osztható 3-al? Írjuk ki őket!
    private static int getNumberOfNumbersDividableByThreeFromOneToOneHundred() {
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }

    //2. Feladat: 1-100-ig a 3-al osztható számok közül hány osztható 4-el is? Írjuk ki őket!
    private static int getNumberOfNumbersDividableByThreeAndFourFromOneToOneHundred() {
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }

    //3. Feladat: Adott int array-ben rakjuk növekvő sorrendbe a számokat.
    private static String orderIntArray(int[] array) {
        //Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }

    //4. Feladat: Adott String arrayben szerepel-e a Spy szó?
    private static boolean areThereSpies(String[] array) {
        //return String.valueOf(Arrays.asList(array).contains("Spy"));
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("Spy")){
                return true;
            }
        }
        return false;
    }

    //5. Feladat: Kémkereső -> Case insensitive hány kém van az arrayben?
    private static int howManySpiesCaseInsensitive(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase("Spy")){
                count++;
            }
        }
        return count;
    }

    //6. Feladat: Mindenki aki nem kém az XYZ-vel kezdődik vagy végződik és van neve. Írjuk ki a nevük XYZ nélkül.
    private static void findNonSpies(String[] array) {
        System.out.println("Find non spies: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null && (array[i].startsWith("XYZ") || array[i].endsWith("XYZ"))){
                array[i] = array[i].replaceAll("XYZ", "");
                if(array[i].length() > 0){
                    System.out.println(array[i]);
                }
            }
        }
    }

    //7. Adott int array 7 számmal. Döntsük el, hogy jó-e ez a hét nyaraláshoz. Jó hét -> Minden nap 25 fok vagy fölötte legyen.
    private static String isItAGoodDayForVacation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 25){
                return "not ";
            }
        }
        return "";
    }

    //8. Feladat: int[][]-ből válasszuk ki melyik a legjobb nyaraláshoz -> legtöbb olyan nap, amikor 25 fok fölötti az időjárás.
    private static int findBestWeekForVacation(int[][] weeks) {
        int indexOfBestWeek = 0;
        int numberOfGoodDays = 0;
        for(int i = 0; i < weeks.length; i++){
            int count = 0;
            for (int j = 0; j < weeks[i].length; j++){
                if(weeks[i][j] >= 25){ //magic number, hogyan tudnánk elkerülni? Mi lenne, ha bizonyos fok alatt negatívan számítana?
                    count++;
                }
            }
            if(count > numberOfGoodDays){
                indexOfBestWeek = i;
                numberOfGoodDays = count;
            }
        }
        return indexOfBestWeek;
    }

    //9. Feladat: Switch segítségével hányszor szerepel egy String array-ben 5 adott szó (alma, körte, banán, szilva, meggy)?
    private static void countFruit(String[] words) {
        int almaCount = 0;
        int korteCount = 0;
        int bananCount = 0;
        int szilvaCount = 0;
        int meggyCount = 0;

        for(int i = 0; i < words.length; i++){
            if(words[i] != null){
                switch (words[i]){
                    case "alma": almaCount++; break;
                    case "körte": korteCount++; break;
                    case "banán": bananCount++; break;
                    case "szilva": szilvaCount++; break;
                    case "meggy": meggyCount++; break;
                    default:;
                }
            }
        }

        System.out.println("Alma: " + almaCount + " korte: " + korteCount + " banan: " + bananCount +  " szilva: "
                + szilvaCount + " meggy: " + meggyCount);
    }

    //10. Feladat: Adott két int array. Írjuk ki azokat az elemeket, amik csak az egyik array-ben szerepelnek.
    private static void findDifferences(int[] array1, int[] array2) {
        String difference = "Differences: ";
        for (int i = 0; i < array1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                difference += array1[i] + " ";
            }
        }

        for (int i = 0; i < array2.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                difference += array2[i] + " ";
            }
        }

        System.out.println(difference);
    }
}