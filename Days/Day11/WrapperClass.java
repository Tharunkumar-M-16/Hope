package Days.Day11;

public class WrapperClass {
    public static void main(String[] args) {
        Byte byteValue = Byte.valueOf((byte) 10);
        Short shortValue = Short.valueOf((short) 20);
        Integer intValue = Integer.valueOf(30);
        Long longValue = Long.valueOf(40L);
        Float floatValue = Float.valueOf(50.5f);
        Double doubleValue = Double.valueOf(60.6);
        Character charValue = Character.valueOf('A');
        Boolean boolValue = Boolean.valueOf(true);

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Integer: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);

        int number = intValue;
        double decimal = doubleValue;
        char letter = charValue;
        boolean status = boolValue;

        System.out.println("int value: " + number);
        System.out.println("double value: " + decimal);
        System.out.println("char value: " + letter);
        System.out.println("boolean value: " + status);
    }
}
