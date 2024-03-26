//This program for a Logical Operator
//in this program && ==> logical AND, || ==> logical OR ,! ==> logical NOT
// This program answer in 0 and 1 when condtion is true then output is 1 else print 0

class Logical_OP {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        boolean d;

        // "condition1 && condition2": true if both conditions are true
        d = (a < b && b < c);
        System.out.println("The output of a < b && b < c is: " + (d ? 1 : 0));

        // "condition1 || condition2": true if at least one condition is true
        d = (a > b || b < c);
        System.out.println("The output of a > b || b < c is: " + (d ? 1 : 0));

        // "!(condition)": true if the condition is false, false if the condition is true
        d = !(a > b);
        System.out.println("The output of !(a > b) is: " + (d ? 1 : 0));
    }
}

