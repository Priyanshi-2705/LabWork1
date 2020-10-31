/*   Created by IntelliJ IDEA.
 *   Author: Priyanshi Jaiswal
 *   Date: 23-07-2020
 *   Time: 18:59
 *   File: LabTask3.java
 */

package lab2;

//Task 3 - Create a program in Java to demonstrate declaration, initialization and usage of local variables.

public class LabTask3 {
    public static void main(String[] args) {
        String myName = "Priyanshi Jaiswal";    //Local variable for main() method
        int myRollNumber = 53;

        // We can use Local Variable under the main() method only.
        // We can use Local Variable only after declaration not before declaration.
        // If a variable is already defined in the scope then it will not be used next time in the same method.

        System.out.println(" My Name is " + myName);
        System.out.println(" My Class Roll Number is " + myRollNumber);
    }
}
