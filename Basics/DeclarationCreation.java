package May.Arrays.Basics;

 /**  Arrays = > stores multiple values of same data type
 * */
public class DeclarationCreation {
    // main method
    public static void main(String[] args){
      // array declaration
        int[] a;
        String[] abc;
        double[] ab;

        // array creation => we have to specify size of an array
        a = new int[10];
        ab = new double[12];
        abc = new String[22];

        // declaration and creation of array in single line
        int[] b = new int[100];
        String[] c = new String[33];

        // creation and initialization
        int[] nm = { 6,5,6,5,7,8,6,7,7,6,5,6,4,4 } ;
        int[] h = new int[]{1,2,3,4,5,6,7,7};

        // while creating array if i put zero(0) value and negative value then
        int[] t = new int[0];  // program run as well as compile successfully
        int[] s = new int[-1]; // program compile but at runtime it shows it throws an exception
                               // i.e. NegativeArraySizeException
    }
}
