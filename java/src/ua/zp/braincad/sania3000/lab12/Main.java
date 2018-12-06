package ua.zp.braincad.sania3000.lab12;

public class Main {

    public static void main ( String[] args ) {

        MyTuple<String,Integer,Long> myTuple=new MyTuple<>("Дратути",2,3L);
        MyTuple<Double,String,String> myTuple1=new MyTuple<>(5.0,"Hello","World");

       Integer[] array1= {2,3,4,5,6};
       Double[] array2={2.0,3.0,4.0,5.5};
       String[]strings={"Дратути","Дотвиданиня","Hello","Bye"};

         MyTestMethod.calcNum(array1,3);
         MyTestMethod.calcNum(array2,2.0);
         MyTestMethod.calcSum(array1,3);

         MyMixer<Integer> myMixer=new MyMixer<>(array1);
         myMixer.shuffle();
         MyMixer<String>myMixer1=new MyMixer<>(strings);
         myMixer1.shuffle();
    }
}
