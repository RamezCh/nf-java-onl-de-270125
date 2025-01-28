public class HelloWorld {

    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        String outPutSentence = "Hallo nf-java-onl-de-27015";
        System.out.println(outPutSentence);
        // Integer ist ein Ganzzahl 32-bit (-2.147.483.648 bis 2.147.483.647)
        int  myAge = 25;
        System.out.println("Ich bin " + myAge + " jahre alt.");
        // Byte ist ein Ganzzahl 8-bit (-128 bis 127 )
        // String ist ein Text, must use " "
        String myName = "Ramez";
        // char ist ein einzelnes Zeichen
        // double ist fúr Dezimalzahl 64-bit
        // float 32-bit Dezimalzahl
        // long - Ganzzahl 64-bit
        // boolean - Wahrheitswert (true/false)
        boolean isMature;
        isMature = myAge > 18;

        // Datentypen umwandeln
        System.out.println("sout tab or enter to get shortchut");
        System.out.println(isMature ? "He is mature" : "He is not mature yet");
        */

        System.out.println("Java is cool!");
        int a = 5, b = 3;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        System.out.println("\nInteger");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);

        System.out.println("\nDouble");
        // ctrl R finds occurrence and input under it, you can replace all occurrence as well
        double doubleA = 5.5;
        double doubleB = 3.2;
        System.out.println(doubleA + doubleB);
        System.out.println(doubleA - doubleB);
        System.out.println(doubleA * doubleB);
        System.out.println(doubleA / doubleB);
        System.out.println(doubleA > doubleB);
        System.out.println(doubleA < doubleB);
        System.out.println(doubleA == doubleB);

        // Right click shift F6 rename changes its name everywhere
        System.out.println("\nFloat");
        float floatA = 5.5f;
        float floatB = 3.2f;
        System.out.println(floatA + floatB);
        System.out.println(floatA - floatB);
        System.out.println(floatA * floatB);
        System.out.println(floatA / floatB);
        System.out.println(floatA > floatB);
        System.out.println(floatA < floatB);
        System.out.println(floatA == floatB);

    }

}
