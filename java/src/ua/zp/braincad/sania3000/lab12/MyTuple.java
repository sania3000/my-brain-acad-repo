package ua.zp.braincad.sania3000.lab12;

public class MyTuple<A,B,C> {
A somefield;
B somefield1;
C somefield2;

    public MyTuple ( A somefield, B somefield1, C somefield2 ) {
        this.somefield = somefield;
        this.somefield1 = somefield1;
        this.somefield2 = somefield2;
    }

    public A getSomefield () {
        return somefield;
    }

    public B getSomefield1 () {
        return somefield1;
    }

    public C getSomefield2 () {
        return somefield2;
    }
}
