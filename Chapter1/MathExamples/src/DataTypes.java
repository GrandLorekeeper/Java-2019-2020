public class DataTypes {
    /* This is to show different data types and their sizes.
     */
    public static void main(String[] args){
        short b;
        b = -129;
        System.out.println(b);

        final double RATE = .75;

        double totAmount = 23.7;
        int num = 5;
        double num2;
        num = (int)totAmount;
        totAmount = num;
        int a = 25;
        num2 = a + 3/4 - 12 * (9 - 6);
        System.out.println(num2);

        boolean answer = 3 > 4;
        System.out.println(answer);

        String code = "AD";
        System.out.println(code);
    }
}
