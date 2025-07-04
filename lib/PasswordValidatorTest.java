package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw ="123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 :"+pw+" : FAILED : Expected INVALID but got " + result1);
        }

        // Test case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK ---
        pw = "abcdefghij";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {//ค่าที่คาดหวังให้เป็น
            System.out.println("Test Case 2 : "+pw+" : Passed :All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED : Expected WEAK but got " + result2);
        }

        // Test case 3: รหัสผ่านเป็นตัวเล็กและตัวใหญ่ MEDIUM ---
        pw = "Abcdefghij";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {//ค่าที่คาดหวังให้เป็น
            System.out.println("Test Case 3 : "+pw+" : Passed : Only lowercase and Uppercase password are MEDIUM.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED : Expected MEDIUM but got " + result3);
        }

        // Test case 4: รหัสผ่านทั้งหมดประกอบด้วยตัวใหญ่ ตัวเล็ก ตัวเลข STRONG ---
        pw = "ABcd12345";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {//ค่าที่คาดหวังให้เป็น
            System.out.println("Test Case 4 : "+pw+" : Passed :Have lowercase Uppercase and Number password are STRONG.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED : Expected STRONG but got " + result4);
        }
    }
}
