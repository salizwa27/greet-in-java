package net.greet;

import java.util.HashMap;

public class Greeter {


        HashMap<String, Integer> greeter = new HashMap<>();  // hashMap is used to store data in (key, value) pairs

        public void greetUser(String name, String language){

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
    }

