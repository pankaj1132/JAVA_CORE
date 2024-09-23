class LowerOrUpperAlphabet {
    public static void main(String arg[]) {
        char ch = 'A';
        while (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " " + (char) (ch + 32));
            ch++;
        }
    }
}