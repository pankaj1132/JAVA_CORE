class capitalCharacter {
    public static void main(String arg[]){
    char ch='l';
    if(ch>='A'&& ch<='Z'){
        System.out.println(ch);
    }
    else if(ch>='a' && ch<='z'){
        System.out.println((char)(ch-32));
    }
    else{
    System.out.println("invalid character");
    }
}
    
}