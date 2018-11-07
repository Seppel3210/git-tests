public class BinCalc
{
    public static void main(String[]args)
    {
        int input;
        try {
            input = Integer.parseInt(args[0]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Please input an intger");
	    return;
        }
        String out = "";
        do {
            out = (input & 1) + out;
            input >>>= 1;
        } while(input != 0);
        System.out.println(out);
    }
}
