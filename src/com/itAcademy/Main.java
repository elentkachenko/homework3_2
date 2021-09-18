package com.itAcademy;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan", "Engineer", "ivivan@mailbox.com",
                "8923123", 30000, 30);
        persArray[1] = new Person("Alex", "Accountant", "alexey@mail.com",
                "3652417", 20000, 46);
        persArray[2] = new Person("Masha", "Designer", "mashadesign@mail.com",
                "5487962", 24000, 25);
        persArray[3] = new Person("Dmitriy", "CEO", "dmitriyceo@mail.com",
                "2255667", 47000, 41);
        persArray[4] = new Person("Maya", "Product manager", "mayapm@mail.com",
                "7856214", 35000, 31);

        String personString = persArray.toString();
        System.out.println(String.format(String.valueOf(persArray[2])));

        System.out.println("Сотрудники старше 40 лет:");
        for (Person person : persArray)
            if (person.getAge() > 40) {
                System.out.println(person);
            }
    }
}
