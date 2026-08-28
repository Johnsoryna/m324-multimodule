package ch.modul324.app;

import ch.modul324.greeter.Greeter;

/**
 * Einstiegspunkt der Anwendung. Die Klasse Greeter stammt aus dem Modul
 * greeter_lib, das als Git-Submodul aus einem eigenen Repository eingebunden ist.
 */
public class Main {

    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "M324";

        Greeter greeter = new Greeter();
        System.out.println(greeter.greet(name));
    }
}
