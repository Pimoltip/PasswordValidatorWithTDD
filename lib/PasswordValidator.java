package lib;

public class PasswordValidator {

    /**
     * การสร้างPasswordให้แข็งแรง โดยการแยกประเภท
     * @param ค่าPassword ที่รับเข้ามาทั้งหมด โดยไม่เป็น null or empty
     * @return แสดงค่าออกมาเป็นPasswordที่มีข้อความระบุว่าเป็นpassword รูปแบบไหน INVALID,WEAK,MEDIUM,STRONG
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        //INVALID
        if (password==null || password.length()<8)
            return PasswordStrength.INVALID;

        boolean hasLower = false;
        boolean hasUppper = false;
        boolean Number = false;
        
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
                hasLower = true;
            else if(Character.isUpperCase(c))
                hasUppper = true;
            else if(Character.isDigit(c))
                Number = true;
        }
        if(hasLower && hasUppper && Number)     
            return PasswordStrength.STRONG ;
        else if(hasLower && !hasUppper) 
            return PasswordStrength.WEAK ;
        else if(hasLower && hasUppper) 
            return PasswordStrength.MEDIUM ;

    return null ;

    }
}