package ua.zp.braincad.sania3000.lab9.reader;

import ua.zp.braincad.sania3000.lab9.api.Reader;

public class Book implements Reader {
    String nameBook="Псы";
    @Override
    public void read(){
        System.out.println("Название книги"+ nameBook);
    }

}
