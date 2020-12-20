

public class Main {

    public static void main(String[] args) {
        
        AES aes = AES.init("anhyeuemnhiulemm", "llllkkkkjjjjoooo", true);
        long stTime = System.currentTimeMillis();
        String encryptedMessage = (aes.encrypt());
        long totallTimeToEncrypt = System.currentTimeMillis() - stTime;
        AES decryptAes = AES.init(encryptedMessage.replaceAll(" ", ""), "llllkkkkjjjjoooo", true);
        String decryptedMessage = decryptAes.decrypt();
        System.out.println("thời gian mã hóa là: "+ totallTimeToEncrypt);
    }


}
