package ua.zp.braincad.sania3000.lab10;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {


     class PhoneNumber {
        private String name;
        private String phone;

        PhoneNumber ( String name, String phone ) {
            this.name = name;
            this.phone = phone;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public String getPhone () {
            return phone;
        }

        public void setPhone ( String phone ) {
            this.phone = phone;
        }

        @Override
        public String toString () {
            return "PhoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    PhoneNumber[] phoneNumbers = new PhoneNumber[10];



    public void addPhoneNumber ( String name, String phone ) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = new PhoneNumber(name, phone);
                return;
            }
        }
    }

    public void printPhoneBook () {
        for (int i = 0; i < phoneNumbers.length; i++) {
            System.out.println(phoneNumbers[i]);
        }

    }

    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare ( PhoneNumber o1, PhoneNumber o2 ) {
            int c = o1.getName().compareToIgnoreCase(o2.getName());
                return c;
            }
        });
    }

public void sortByNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare ( PhoneNumber o1, PhoneNumber o2 ) {
                int c = o1.getPhone().compareToIgnoreCase(o2.getPhone());
                return c;
            }
        });
}

}


