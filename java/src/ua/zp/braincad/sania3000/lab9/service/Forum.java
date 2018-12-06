package ua.zp.braincad.sania3000.lab9.service;

import ua.zp.braincad.sania3000.lab9.api.MessageSender;

/**
 * Some forum for some discussion
 */
public class Forum implements MessageSender {

    String theme;
    String author;


    @Override
    public void sendMessage ( String message ) {

    }

    public static void main ( String[] args ) {
        Forum myforum = new Forum();
        myforum.method("Дратути");
    }

}


