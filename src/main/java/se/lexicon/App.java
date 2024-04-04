package se.lexicon;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        // Ex 1-2
        // create an arraylist
        ArrayList<String> weekdays = new ArrayList<String>();
        weekdays.add("monday");
        weekdays.add("tuesday");
        weekdays.add("wednesday");
        weekdays.add("thursday");
        weekdays.add("friday");
        weekdays.add("saturday");
        weekdays.add("sunday");

        System.out.println(weekdays);

        for (String element : weekdays){
            System.out.println(element);
        }

        // create iterator
        Iterator step = weekdays.iterator();
        while(step.hasNext()){
            System.out.println(step.next());
        }

        // Ex 3-4

        ArrayList<String> weekdays2 = new ArrayList<String>();
        weekdays2.add("monday");
        weekdays2.add("tuesday");
        weekdays2.add("wednesday");
        weekdays2.add("friday");
        weekdays2.add("saturday");
        weekdays2.add("sunday");

        System.out.println(weekdays2);

        weekdays2.add(3,"thursday");

        System.out.println(weekdays2);

        List<String> workweek = weekdays2.subList(0,3);

        System.out.println(workweek);

        // Ex 5-8

        HashSet<String> daysSet = new HashSet<String>();
        daysSet.add("monday");
        daysSet.add("tuesday");
        daysSet.add("wednesday");
        daysSet.add("thursday");
        daysSet.add("friday");
        daysSet.add("saturday");
        daysSet.add("sunday");

        System.out.println(daysSet);

        ArrayList<String> daysList = new ArrayList<String>(daysSet);

        System.out.println(daysList);

        Collections.sort(daysList);
        System.out.println(daysList);

        TreeSet<String> sortedSet = new TreeSet<String>(daysSet);
        System.out.println(sortedSet);

        //Ex 9-11
        HashMap<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Volvo");
        cars.put(2, "BMW");
        cars.put(3, "Tesla");
        cars.put(4, "Skoda");
        cars.put(5, "Audi");

        System.out.println(cars);

        for (Integer key : cars.keySet()) {
            System.out.println(key);
        }

        Iterator<Map.Entry<Integer, String>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getValue());
        }

        //Ex 12

        Car c1 = new Car(1, "Volvo", "Combi");
        Car c2 = new Car(2, "Audi", "Sedan");
        Car c3 = new Car(3, "Skoda", "Coupe");
        Car c4 = new Car(4, "BMW", "Sport");

        System.out.println(c4.toString());
        HashMap<Integer, Car> cars2 = new HashMap<Integer, Car>();
        cars2.put(1, c1);
        cars2.put(2, c2);
        cars2.put(3, c3);
        cars2.put(4, c4);

        System.out.println(cars2);

        for (Car car : cars2.values()) {
            System.out.println(car.getBrand());
        }

        // Ch 1

        HashSet<String> daysOfWeek = new HashSet<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        HashSet<String> weekendDays = new HashSet<String>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        daysOfWeek.retainAll(weekendDays);
        System.out.println(daysOfWeek);

        // Ch 2

        HashMap<String, String> emailInfo = new HashMap<String, String>();
        emailInfo.put("Thomas", "ts@home.com");
        emailInfo.put("Lasse", "lk@away.com");
        emailInfo.put("Oskar", "os@gmail.com");
        emailInfo.put("Sten", "sa@sjovy.com");

        HashSet<String> emailKeys = new HashSet<String>();
        emailKeys.addAll(emailInfo.keySet());
        System.out.println(emailKeys);

        // Ch 3
        SuperHero hero1 = new SuperHero(1, "Tarzan", 42);
        SuperHero hero2 = new SuperHero(2, "Fridolf", 52);
        SuperHero hero3 = new SuperHero(3, "Fnatte", 12);
        ArrayList<SuperHero> myHeros = new ArrayList<SuperHero>();
        myHeros.add(hero1);
        myHeros.add(hero2);
        myHeros.add(hero3);
        for (SuperHero hero : myHeros){
            System.out.println(hero);
        }
        Collections.sort(myHeros);
        for (SuperHero hero : myHeros){
            System.out.println(hero);
        }

        // Ch 4

        int[] numbers = new int[] {1,4,4,2,7,6};
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            myNumbers.add(number);
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>(myNumbers);
        myNumbers.clear();
        myNumbers.addAll(uniqueNumbers);

        for (Integer number : myNumbers) {
            System.out.println(number);
        }



    }

}
