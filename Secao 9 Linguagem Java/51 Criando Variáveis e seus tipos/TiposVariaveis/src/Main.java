//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // byte	8 bits	-128 a 127
        byte numberByte = 127;
        System.out.println(numberByte);

        //short	16 bits	-32.768 a 32.767
        short numberShort = 32767;
        System.out.println(numberShort);

        //int	32 bits	-2.147.483.648 a 2.147.483.647
        int numberInt = 2147483547;
        System.out.println(numberInt);

        //long	64 bits	-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long numberLong = 152365954L;
        System.out.println(numberLong);

        // ------- Numbers with decimal places ---------

        // float	32 bits	-3.40292347E+38 a +3.40292347E+38
        float numberFloat = 1545646654;
        System.out.println(numberFloat);

        //double	64 bits	-1.79769313486231570E+308 a +1.79769313486231570E+308
        double numberDouble = 15.45678925365;
        System.out.println(numberDouble);

    }
}