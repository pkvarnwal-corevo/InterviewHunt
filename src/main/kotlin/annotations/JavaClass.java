package annotations;

import java.util.Date;

public class JavaClass {


    public static void main(String[] args) {
        Session session = new Session("Prinsu", new Date());
        String name = session.getName();
        System.out.println(name);
    }
}

