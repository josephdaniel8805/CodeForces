import java.util.*;
 
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            int count1=0,count2=0,a1=a,b1=b;
            boolean flag=false;
            double pow=0;
            while(true){
                if(!flag){
                    a-=Math.pow(2,pow);
                    flag=true;
                    if(a<0){
                        break;
                    }
                }else{
                    b-=Math.pow(2,pow);
                    flag=false;
                    if(b<0){
                        break;
                    }
                }
                count1++;
                pow++;
            }
            flag=true;pow=0;
            while(true){
                if(!flag){
                    a1-=Math.pow(2,pow);
                    flag=true;
                    if(a1<0){
                        break;
                    }
                }else{
                    b1-=Math.pow(2,pow);
                    flag=false;
                    if(b1<0){
                        break;
                    }
                }
                count2++;
                pow++;
            }
            System.out.println(Math.max(count1,count2));
        }
    }    
}
