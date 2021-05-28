package javapractice.crypto;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Crypto {
    public static void main(String[] args) throws NoSuchAlgorithmException, CloneNotSupportedException {
        MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
        messageDigest.update("yxPX0fbIKHvjHo180".getBytes());
        MessageDigest clone1= (MessageDigest) messageDigest.clone();
        byte[] byteArray=clone1.digest();
        BigInteger bigInteger=new BigInteger(1,byteArray);
        StringBuilder builder=new StringBuilder(bigInteger.toString(16));
        while (builder.length()<32){
            builder.insert(0,'0');
        }
        System.out.println(builder);

    }
}
