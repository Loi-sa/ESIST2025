public class Tasksheet115 {
//    Change the variables in the first section, so that each if statement resolves as true.

    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = a+"!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}