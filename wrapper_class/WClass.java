package wrapper_class;

public class WClass {
    public static void main(String[] args) {
        int x = 10;

        // Auto-boxing: primitive to wrapper object
        Integer ibox = Integer.valueOf(x); 
        System.out.println("Autoboxing: " + ibox);

        // Auto-unboxing: wrapper object to primitive
        int unbox = ibox;
        System.out.println("Auto-Unboxing: " + unbox);
        
        System.out.println("-----------------------------------------------------");

        // Using constructor (deprecated)
        Integer intObj = new Integer(10); // Deprecated
        System.out.println("Deprecated using Constructor: " + intObj);

        // Using valueOf() method (recommended)
        Integer vintObj = Integer.valueOf(10);
        System.out.println("Use valueOf() method instead: " + vintObj);
        
        System.out.println("-----------------------------------------------------");

        // Convert String to int
        String str = "100";
        int istr = Integer.parseInt(str);
        System.out.println("Convert a string to an integer: " + (istr + 100));
        

        // Get primitive value from wrapper
        Integer objInt = 300;
        int primInt = objInt.intValue();
        System.out.println("The int value for a wrapperclass object: " + primInt);


        // Float wrapper object
        Float objFloat = 23.45f;
        float primFloat = objFloat.floatValue();
        System.out.println("The float value for a wrapperclass object: " + primFloat);
        
        System.out.println("-----------------------------------------------------");

        // compareTo()
        Integer a = 100;
        Integer b = 100;
        int result = a.compareTo(b);  // returns 0
        System.out.println("Comparing 2 wrapper class objects: " + result);
        
        System.out.println("-----------------------------------------------------");

        // equals()
        Integer obj1 = 100;
        Integer obj2 = 100;
        System.out.println("Checks value equality for WC objects: " + obj1.equals(obj2));
        
        System.out.println("-----------------------------------------------------");

        // toString()
        Integer a1 = 50;
        String s = a1.toString();  // "50"
        System.out.println("Converting the WC object to a String value: " + (s + 100)); // outputs "50100"
        
        System.out.println("-----------------------------------------------------");

        // Character class methods
        char c = 'A';
        System.out.println("Is Letter: " + Character.isLetter(c));  // true

        char ch = '2';
        System.out.println("Is Digit: " + Character.isDigit(ch));   // true

        char theChar = 'D';
        char lCase = Character.toLowerCase(theChar);
        System.out.println("To LowerCase: " + lCase);  // d

        char uCase = Character.toUpperCase(theChar);
        System.out.println("To UpperCase: " + uCase);  // D
        
        System.out.println("-----------------------------------------------------");

        boolean bool = Boolean.parseBoolean("true");  // true
        System.out.println("parseBoolean(true): " + bool);

        // valueOf(String s) - returns Boolean object
        Boolean boolValOf= Boolean.valueOf("false");  
        System.out.println("valueOf(false): " + boolValOf);
        
        // booleanValue() - returns primitive value from Boolean object
        boolean boolVal = boolValOf.booleanValue(); 
        System.out.println("booleanValue(): " + boolVal);
    }
}
