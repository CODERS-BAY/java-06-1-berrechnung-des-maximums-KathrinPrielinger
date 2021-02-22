import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Erweiterung des Arrays:
        Scanner scanner = new Scanner(System.in);                   //Variable für den Scanner anlegen
        boolean hasQ = scanner.hasNext("q");                 //Methode, schaut nach, was im Scanner drinsteht

        int[] numbers = new int[0];                                 //leeres Array erstellen

        while (!scanner.hasNext("q")) {                      //solange nicht q eingegeben wird
            int number = scanner.nextInt();                       //Eingabe speichern und in number speichern
            System.out.println("you entered" + number);

            int[] newArray = new int[numbers.length + 1];           //neues Array mit 1 größer als vorher anlegen; Array immer rum 1 erweitern


            for (int i = 0; i < numbers.length; i++) {              //über alte Array drüber gehen, und dazu schreiben, was vorher dringestanden ist
                newArray[i] = numbers[i];                           //an jede Stelle im neuen Array kommt die Zahl rein die im alten Array an der gleichen Stelle gespeichert ist
            }

            newArray[numbers.length] = number;                  //neue Zahl an die letzte Stelle im neuen Array schreiben
            numbers = newArray;                                 //dem Array numbers habe ich ein neues Array mit neuer Länge zugewiesen
            System.out.println(number);
            System.out.println(Arrays.toString(newArray));
        }

        //Speichert die Zahlen des Arrays als Liste
        int max = Collections.max(Arrays.asList(numbers[numbers.length - 1]));


        System.out.println("Das Maximum ist:");
        System.out.println(max);

    }
}


//'q' Array das dynamisch wächst - zahlenweise einlesen

//scanner.hasNext("q"); Bedingung in while

       /*while(scanner.hasNext("q")) {
            break;
          while(true) {
              if (!scanner.hasNext(String.valueOf(false))) break;

    }

        //for (int i = 0; i < numbers.length; i++) {
          //  numbers[i] = scanner.nextInt();
            //System.out.println(numbers[i]);
       // }
        int max = Collections.max(Arrays.asList(numbers));

        System.out.println(Arrays.toString(numbers));
        System.out.println("Das Maximum ist:");
        System.out.println(max);

    }
}


        /*
            int max = Collections.max(Arrays.asList(numbers));


            double result = (numbers[0] + numbers[1] + numbers[2]) / numbers.length;
            System.out.println(Arrays.toString(numbers));
            System.out.println("Der Mittelwert ist:");
            System.out.format("%.2f", result);
        */
