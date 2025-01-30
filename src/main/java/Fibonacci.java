public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(calculate(8));
    }

    public static int calculate(int num) {
        if(num == 0) {
            return 0;
        }
        if(num == 1) {
            return 1;
        }
        return calculate(num - 1) + calculate(num - 2);
    }

    public static int binetFormula(int num) {
        // inefficient for large numbers due to float precision issues
        double firstTerm = Math.pow((( 1 + Math.sqrt(5) ) / 2), num);
        double secondTerm = Math.pow((( 1 - Math.sqrt(5) ) / 2), num);
        return (int)((firstTerm - secondTerm)/Math.sqrt(5));
    }
}
