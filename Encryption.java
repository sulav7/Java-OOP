
public class Encryption {
    public static void main(String[] args) {
        String word, encryptedWord = "";
        String decryptedWord = "";

        word = "CRYPTOCURRENCY";
        int key = 3;
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);
                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptedWord += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key);

                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }

                encryptedWord += ch;
            } else {
                encryptedWord += ch;
            }

        }
        for (int i = 0; i < encryptedWord.length(); i++) {
            ch = encryptedWord.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);
                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }
                decryptedWord += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key);

                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }

                decryptedWord += ch;
            } else {
                decryptedWord += ch;
            }
        }
        System.out.println("Encrypted Message = " + encryptedWord);
        System.out.println("Decrypted Message = " + decryptedWord);
    }
}
