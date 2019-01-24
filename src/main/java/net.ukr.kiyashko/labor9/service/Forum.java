package net.ukr.kiyashko.labor9.service;

import net.ukr.kiyashko.labor9.api.MessageSender;

/**
 * Some forum for some discussion
 */
public class Forum implements MessageSender {

    String theme;
    String author;

    @Override
    public void sendMessage(String message) {

    }
}
