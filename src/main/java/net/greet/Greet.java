package net.greet;

import java.util.HashMap;
import java.util.Scanner;

public class Greet {

    HashMap <String, Integer> greeter = new HashMap<>();  // hashMap is used to store data in (key, value) pairs

    public void greet(String name, String language){

        if (!greeter.containsKey(name)){   // checks if there isn't a name than it will add the name(key) and the value (1)
            greeter.put(name, 1);
        }
        else if(greeter.containsKey(name)){   // checks if there is a name and if there is it will only increment the value
            greeter.put(name, greeter.get(name) + 1);
        }

        System.out.println(Languages.valueOf(language).getLang() + name);
    }



    public static void main(String args[]) {

        Greet greet = new Greet();

        Scanner myObj = new Scanner(System.in); // Scanner is used to read user input of the primitive types
        System.out.println("Greet Someone");
        String name = myObj.nextLine();

       String[] enteredName = name.split(" ");  // Splits string array by checking the spaces

//        System.out.println(enteredName);

       String command = "";
       String userName = "";
       String language = "";

       if(enteredName.length == 1){
           command = enteredName[0];
       }
       else if(enteredName.length == 2){
           command = enteredName[0];
           userName = enteredName[1];
       }
       else if (enteredName.length == 3){
           command = enteredName[0];
           userName = enteredName[1];
           language = enteredName[2];
       }


       if(command.equals("greet")){
           greet.greet(userName, language);

           System.out.println();
       }
    }
}
