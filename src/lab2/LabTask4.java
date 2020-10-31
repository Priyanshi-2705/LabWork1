/* Created by IntelliJ IDEA.
 *   Author: Priyanshi Jaiswal
 *   Date: 23-07-2020
 *   Time: 20:21
 *   File: LabTask4.java
 */

package lab2;

//Task 4 - Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.

class Student {
    static String studentName = "Priyanshi";    // Static Variable
    int studentRollNumber;                       // Non-Static Variable
    String collegeName;
}

public class LabTask4 {
    public static void main(String[] args) {
        Student a1 = new Student();
        a1.studentRollNumber = 53;
        a1.collegeName = "GLA University";

        System.out.println(a1.studentRollNumber);
        System.out.println(a1.collegeName);
        System.out.println(Student.studentName);
    }
}
