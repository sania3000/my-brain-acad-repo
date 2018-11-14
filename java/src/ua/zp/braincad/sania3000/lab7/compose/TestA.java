package ua.zp.braincad.sania3000.lab7.compose;

public class TestA {

    public void test() {
        System.out.println("test in A");
    }

    public void check() {
        System.out.println("check in A");
        test();
    }
}
