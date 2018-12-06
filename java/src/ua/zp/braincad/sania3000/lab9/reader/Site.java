package ua.zp.braincad.sania3000.lab9.reader;

import ua.zp.braincad.sania3000.lab9.api.Reader;

public class Site implements Reader {
    String siteName = "Новости";
    @Override
    public void read(){
        System.out.println("Название сайта"+ siteName);
    }
}
