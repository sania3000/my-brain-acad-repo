package ua.zp.braincad.sania3000.lab9.reader;

import ua.zp.braincad.sania3000.lab9.api.Reader;

public class Ebook implements Reader {

    String ebookName="Мурзилка";
    @Override
    public void read(){
        System.out.println("Название електронной книги"+ ebookName);
    }
}
