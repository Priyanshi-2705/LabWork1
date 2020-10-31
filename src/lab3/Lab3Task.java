/*   Created by IntelliJ IDEA.
 *   Author: Priyanshi Jaiswal
 *   Date: 28-07-2020
 *   Time: 17:31
 *   File: Lab3Task.java
 */

package lab3;

// TASK : Control Statements (if-else)

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("ENTER YOUR DISCOUNT_CODE:- ");
        String clientInputDiscountCode = scannerObject.nextLine();
        scannerObject.close();
        if ((clientInputDiscountCode.isEmpty()) || (clientInputDiscountCode.isBlank())) {
            System.out.println("The Coupon Code cannot be Blank or Empty.");
        } else if (clientInputDiscountCode.equalsIgnoreCase(DISCOUNT_CODE)) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else {
            System.out.println("Invalid DISCOUNT_CODE");
        }
    }
}
