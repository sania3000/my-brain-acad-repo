package ua.zp.braincad.sania3000.lab13;

import java.util.*;


public class Main {
    public static void main ( String[] args ) {

            /*lab 2.15.1*/

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("Number_ " + i);
            System.out.println(list.get(i));
        }
            /*lab 2.15.2*/

        List<String> list1 =new LinkedList<>();
        Random random =new Random();

        for (int i = 0; i < 10; i++) {
            list1.add("Num_ "+random.nextInt(list.size()));
            System.out.println(list1.get(i));

        }
        System.out.println(" ");
                /*lab 2.15.3*/

        Collection<String> arrayList=new ArrayList<>();
        Collection<String> linkedList=new LinkedList<>();
        for (int i = 0; i < 10 ; i++) {
            String addNum="num_ " ;
            arrayList.add(addNum+i);
            linkedList.add(addNum+i);
            }
            Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            }
        }

        }





