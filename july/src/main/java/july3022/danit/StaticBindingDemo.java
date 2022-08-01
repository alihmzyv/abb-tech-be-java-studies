package july3022.danit;

// Java Program to Illustrate Static Binding

// Main class

class Dad {
    private static final String me = "dad";

    protected String getMe() {
        return me;
    }

    public void printMe() {
        System.out.println(me);
    }
}

class Son extends Dad {
    private static final String me = "son";

    @Override
    protected String getMe() {
        return me;
    }
}

class StaticVariableOverriding {
    public static void main(String[] args) {
        Dad dad = new Son();
        dad.printMe();
    }
}


