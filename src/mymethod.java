
    public class mymethod {
        static void myMethod(String fname) {
            System.out.println(fname + " Refsnes");
        }
        static int myMethod1(int x) {
            return 5 + x;
        }
        static String mymethod2(String name){
            return  name+"hii";
        }





        public static void main(String[] args) {
            myMethod("Liam");
            myMethod("Jenny");
            myMethod("Anja");
            System.out.println(myMethod1(2));
            System.out.println(mymethod2("pavani"));
            System.out.println(mymethod2("sagar"));
        }
    }

