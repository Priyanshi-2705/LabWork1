/*   Created by IntelliJ IDEA.
 *   Author: Priyanshi Jaiswal
 *   Date: 23-07-2020
 *   Time: 17:48
 *   File: LabTask1.java
 */

package lab2;

//Task 1 - Create a program in Java that prints the range table.

public class LabTask1 {
    public static void main(String[] args) {

        System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "Data Type", "Size in Bits", "Size in Bytes", "Range");

        System.out.printf("%-20s\t%-20d\t%-20d\t%-20s\n", "byte", Byte.SIZE, Byte.SIZE / 8, " from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.printf("%-20s\t%-2d\t%-20d\t%-20s\n", "short", Short.SIZE, Short.SIZE / 8, " from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.printf("%-20s\t%-20d\t%-20d\t%-20s\n", "int", Integer.SIZE, Integer.SIZE / 8, " from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.printf("%-20s\t%-20d\t%-20d\t%-20s\n", "long", Long.SIZE, Long.SIZE / 8, " from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.printf("%-20s\t%-20d\t%-20d\t%-20s\n", "float", Float.SIZE, Float.SIZE / 8, " from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.printf("%-20s\t%-20d\t%-20d\t%-20s\n", "double", Double.SIZE, Double.SIZE / 8, " from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.printf("%-20s\t%-20d\t%-20d\t%-20s\n", "char", Character.SIZE, Character.SIZE / 8, " from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);

        System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\n", "boolean", "8", "1", " has " + Boolean.TRUE + " and " + Boolean.FALSE);
    }
}
