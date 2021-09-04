package de.deitelhoff.m167.studymag.examples.chapter2;

public class Main {

    public static void main(String[] args) {
        try {
            outputArray();
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Index-Überlauf!");
        } catch (Exception e) {
            System.out.println(e);
        }

        //try {
            checkMonth(13);
        //} catch (MonthException e) {
        //  System.out.println("Fehlerhafter Monat! " + e.getMonth());
        //}

        System.out.println("Programmende");
    }

    public static void outputArray() throws Exception {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i <= 6; i++) {
            System.out.println(array[i]);
        }
    }

    public static void checkMonth (int month) throws MonthException {
        if (month < 1 || month > 12) {
            throw new MonthException(month);
        }
    }
}
