public class LCMMethod {
    public static int lcm_method(int num1 ,int num2){
        int lcm=1;
        for(int i=1;i<=num1*num2 ; i++ ){
            if(i%num1==0 && i%num2==0){
                    lcm=i;
                    break;
            }
        }
        return lcm; 
    }
        public static void main(String arg[]){
        System.out.println(lcm_method(10, 50));
        }
}
