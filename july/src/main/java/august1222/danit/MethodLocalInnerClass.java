package august1222.danit;



class MethodLocalInnerClass {
    int i = 1;
    static int j = 6;
    public static void m1() {
        int k = 2;
        class InnerMethodLocal {
            public static void main(String[] args) {
//                System.out.println(x); cannot access non-static field of MethodLOcalInnerClassDemo from static method m1()
                //but can instance method can access both static and non-static part, because it is like a variable declared in method;
//                System.out.println(i); //- cant acces from static m1()
//                System.out.println(j);
//                System.out.println(k);
                System.out.println("Inner class main method");
            }
        }

//
    }


}
