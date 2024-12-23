package cw_day10;
class Clanguage {
    void printHello() {
        System.out.println("Hello from C Language!");
    }

    void pointers() {
        System.out.println("Pointers are used in C.");
    }
}

class CPP {
    void printHello() {
        System.out.println("Hello from C++!");
    }

    void oop() {
        System.out.println("C++ supports Object-Oriented Programming.");
    }
}

class Java {
    void printHello() {
        System.out.println("Hello from Java!");
    }

    void platformIndependent() {
        System.out.println("Java is platform-independent.");
    }
}

public class Main {
    public static void main(String[] args) {
        Clanguage c = new Clanguage();
        c.printHello();
        c.pointers();

        CPP cpp = new CPP();
        cpp.printHello();
        cpp.oop();

        Java java = new Java();
        java.printHello();
        java.platformIndependent();
    }
}
