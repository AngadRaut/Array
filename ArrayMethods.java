package May.Arrays;

import java.util.Arrays;
class Methods{
    void methods(){
        String[] arrayMethods={ "a","b","c","d","e","f","g"};
        System.out.println("to string = "+Arrays.toString(arrayMethods));
        System.out.println("aslist "+Arrays.asList(arrayMethods));
    }
    void intArray(){
        int [] intArray={3,454,44,335,5,434,5345,2342,344,};
        System.out.println("tostring = "+ Arrays.asList(intArray));
    }
}
public class ArrayMethods  {
    public static void main(String [] args){
        Methods obj  = new Methods();
        obj.intArray();
    }
}
