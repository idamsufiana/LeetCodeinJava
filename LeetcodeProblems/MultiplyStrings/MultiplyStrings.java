import java.math.BigInteger;

public class MultiplyStrings {

    static String multiply(String num1, String num2) {

        BigInteger satu = new BigInteger(num1);
        BigInteger dua= new BigInteger(num2);
        BigInteger out = satu.multiply(dua);

        return String.valueOf(out); 
        
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println(multiply("2","3"));
    }
    
}
