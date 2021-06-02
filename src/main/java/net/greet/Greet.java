package net.greet;

import java.util.HashMap;
import java.util.Scanner;


 public class Greet {


 public static void main(String args[]) {

        Greeter greet = new Greeter();

        Scanner myObj = new Scanner(System.in); // Scanner is used to read user input of the primitive types

      Boolean exit = true;

        while (exit) {
            System.out.print("Greet Someone ");
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
                greet.greetUser(userName, language);

            }

            else if (command.equals("counter")){
                System.out.println(greet.counter());
            }

            else if (command.equals("exit")){
                exit = false;
            }
        }


    }



}
