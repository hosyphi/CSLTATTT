package net.phy;

public class Main {

    public static void main(String[] args) {

        AES aes = AES.init("dam me", "123");
        long time1 = System.currentTimeMillis();
        String encryptedMessage = (aes.encrypt());
        long time2 = System.currentTimeMillis() - time1;
        
        long time3 = System.currentTimeMillis();
        AES decryptAes = AES.init(encryptedMessage.replaceAll(" ", ""), "123", true);
        //AES decryptAes = AES.init("", "");
        String decryptedMessage = decryptAes.decrypt();
        long time4 = System.currentTimeMillis() - time3;
        
        /*Tổng thời gian*/
        System.out.println("Thời gian mã hóa là: " + time2);
        System.out.println("Thời gian giải mã là: "+ time4);
        
    }

}
