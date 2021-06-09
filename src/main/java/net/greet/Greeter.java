package net.greet;

import java.util.HashMap;
import java.util.Map;

public class Greeter {


        HashMap<String, Integer> greeter = new HashMap<>();  // hashMap is used to store data in (key, value) pairs

        public void greetUser(String name, String language){

          name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

            if (!greeter.containsKey(name)){   // checks if there isn't a name than it will add the name(key) and the value (1)
                greeter.put(name, 1);
            }
            else if(greeter.containsKey(name)){   // checks if there is a name and if there is it will only increment the value
                greeter.put(name, greeter.get(name) + 1);
            }

            System.out.println(Languages.valueOf(language).getLang() + name);


        }

        public int counter(){
            int count = greeter.size();
            return count;

        }

        public void help(){

//            String listOfCommands = "Instructions For Commands/n"
//            String[] listOfCommands = {"COUNT should display the number of people greeted", "GREET should be able to greet a person in any of the three languages"};
//            System.out.println(Arrays.toString(listOfCommands));

            System.out.println("Instructions On How To Use Commands \n" +
                    "- greet followed by the name and the language the user is to be greeted in should greet a person in that chosen language \n" +
                    "- greeted should display a list of all users that has been greeted and how many time each user has been greeted \n" +
                    "- greetedUser followed by a username returns how many times that username have been greeted \n" +
                    "- counter returns a count of how many unique users has been greeted \n" +
                    "- clear deletes of all users greeted and the reset the greet counter to 0 \n" +
                    "- removeName followed by a username delete the greet counter for the specified user and decrement the greet counter by 1 \n" +
                    "- exit exits the application");
        }

        public void clear(){

            greeter.clear();
            System.out.println("Successfully Cleared");
        }

        public void removeName(String name){

            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

//
            if(greeter.get(name) > 0){
                if(greeter.containsKey(name)){
                 greeter.remove(name);
             }

            }

            System.out.println("Name Has Been Successfully Removed");
        }

        public void greeted(){
            for (Map.Entry<String, Integer> set :
                    greeter.entrySet()) {

                System.out.println("Name: " + set.getKey() +" \n"+ "Counter: " + set.getValue());
            }
        }

        public int greetedUser(String name){

            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

            int counterForUser = 0;

            if (greeter.containsKey(name)){
                counterForUser = greeter.get(name);
            }

            return counterForUser;

        }


    }

