package ua.zp.braincad.sania3000.lab9.reader;

import ua.zp.braincad.sania3000.lab9.api.Reader;

public class Main {
    public static void main ( String[] args ) {
        Book mybook = new Book();
        Journal myjournal = new Journal();
        Ebook myebook = new Ebook();
        Site mysite = new Site();
        Reader[] reader={mybook,myjournal,myebook,mysite};
        mybook.read();

    }
    public static void read1(){


    }
}
