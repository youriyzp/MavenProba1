package net.ukr.kiyashko.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MyExternalizable implements Externalizable {
    private String userName;
    private String passWord;
    private Integer roll;

    public MyExternalizable() { }  //ОБЯЗАТЕЛЬНО (java.io.InvalidClassException)

    public MyExternalizable(String userName, String passWord, Integer roll) {
        this.userName = userName; this.passWord = passWord; this.roll = roll;
    }

    @Override
    public void writeExternal(ObjectOutput oo) throws IOException {
        oo.writeObject(userName);
        oo.writeObject(roll);
    }
    @Override
    public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
        userName = (String)oi.readObject();
        roll = (Integer)oi.readObject();
    }
}
