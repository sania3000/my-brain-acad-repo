package ua.zp.braincad.sania3000.lab10;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {

    MyPhone(){}

    public void switchOn(){
        System.out.print("Loading PhoneBook records...");
        MyPhoneBook myPhoneBook =new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Yasia","0509695912");
        myPhoneBook.addPhoneNumber("Vasia","0633696582");
        myPhoneBook.addPhoneNumber("David","0508615299");
        myPhoneBook.addPhoneNumber("Tom","0508615291");
        myPhoneBook.addPhoneNumber("Bob","0508615292");
        myPhoneBook.addPhoneNumber("Mike","0508615293");
        myPhoneBook.addPhoneNumber("Nick","0508615294");
        myPhoneBook.addPhoneNumber("Kate","0508615295");
        myPhoneBook.addPhoneNumber("Rin","0508615296");
        myPhoneBook.addPhoneNumber("Svet","0508615291");
        System.out.println("OK!");



    }

public void call(int a){


    System.out.println("Calling to:");
}


}
