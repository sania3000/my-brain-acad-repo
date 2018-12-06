package ua.zp.braincad.sania3000.lab9.reader;

import ua.zp.braincad.sania3000.lab9.api.Reader;

public class Journal implements Reader {
    String nameStatia = "Java";
    @Override
    public void read(){
        System.out.println("Название статьи журнала" + nameStatia);
    }
}
