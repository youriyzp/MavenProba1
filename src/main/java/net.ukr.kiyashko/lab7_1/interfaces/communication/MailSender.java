package net.ukr.kiyashko.lab7_1.interfaces.communication;

public interface MailSender {

    String createMail(String mail);

    void sendMail(String mail);
}
