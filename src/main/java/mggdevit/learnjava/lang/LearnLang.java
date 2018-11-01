package mggdevit.learnjava.lang;

/**
 *
 * @author mgg-dev-it
 */
public abstract class LearnLang {

    public static void learn() {
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        System.out.println("8 primitive types");
        byte b = 127; //8 bit [-128 - +127]
        short sh = 32767; //16 bit [-32768 - 32767]
        int i = 2147483647; //32 bit [-2^31 - 2^31-1] [-2147483648 - 2147483647]
        long l = 9223372036854775807L; //64 bit [-2^63 - 2^63-1] [-9223372036854775808 - 9223372036854775807]
        float f = 0f; //32 bit
        double d = 0d; //64 bit
        boolean bo = false; //you should initialize, values are false and true
        char c; //16 bit Unicode ['\u0000' - '\uffff'] [0 -65535]
        System.out.println("byte = " + b);
        System.out.println("short = " + sh);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("boolean = " + bo);
    }
}
