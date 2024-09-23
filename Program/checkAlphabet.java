class checkAlphabet {
    public static void main(String arg[]){
    char a= 'p';
    if(a>=65 && a<=90){
        System.out.println("Alphabet upper");
    }
    else if(a>=97 && a<=122){
        System.out.println("Alphabet lower ");
    }
    else if(a>=48 && a<=57){
        System.out.println("Digit");
    }
    else{
        System.out.println("Special character");
    }
    System.out.println();
    }
}
