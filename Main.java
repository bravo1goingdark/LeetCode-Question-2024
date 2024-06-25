public class Main {
    public static void main(String[] args) {
        char[] ch = new char[]{'a','b','c','d'};
        String[] str = new String[]{"ei","zf","ei","am"};
        String[] dictionary = {"abcd", "acbd", "adbc", "badc", "dacb", "cadb", "cbda", "abad"};

        Encrypter en = new Encrypter(ch,str , dictionary);
        System.out.println(en.decrypt(en.encrypt("cadb")));
    }
}
