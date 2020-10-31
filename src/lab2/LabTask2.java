/*   Created by IntelliJ IDEA.
 *   Author: Priyanshi Jaiswal
 *   Date: 23-07-2020
 *   Time: 18:15
 *   File: LabTask2.java
 */

package lab2;

//Task 2 - Create a program in Java to create local variables with the var keyword. Assign the value of all 8 primitive data types to 8 variables.

public class LabTask2 {
    public static void main(String[] args) {
        // About Myself
        var membersInFamily = (byte) 10;          //byte
        var numderOfFriends = (short) 250;        //short
        var classRollNo = 53;                     //int
        var universityRollNo = 191500608;         //long
        var height = 5.34f;                       //float
        var distance = 750.65d;                   //double
        var letter = "P";                         //char
        var alwaysFun = true;                     //bool

        System.out.println(" Number of Members in My Family is " + membersInFamily);
        System.out.println(" Number of friends is " + numderOfFriends);
        System.out.println(" My Class Roll Number is " + classRollNo);
        System.out.println(" My University Roll Number is " + universityRollNo);
        System.out.println(" My Height is approx " + height);
        System.out.println(" Distance from My Home Town to College is appprox " + distance);
        System.out.println(" My Name starts with Letter " + letter);
        System.out.println(" Do I always in Fun Mood " + alwaysFun);
    }
}
