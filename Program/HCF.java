public class HCF {
        public static void main(String arg[]){
        int hcf=1;
        int num1=40,num2=60;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0)
            hcf=i;
        }
        System.out.println(hcf);
        }
}
