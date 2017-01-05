/**
 * Created by heebin on 2017-01-05.
 */
import java.util.*;
public class main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int output = 0;
        boolean num1 = false, num2 = false;
        a = sc.nextInt();

        if(a % 5 == 0){
            output = a / 5;
        }
        else if(a % 5 != 0 && a > 3){
            b = a;
            d = a;
            while(b >= 5){
                b = b - 5;
                c = c + 1;
                if(b % 3 == 0){
                    c = c + (b / 3);
                    num1 = true;
                    break;
                }
            }
            while(d > 3){
                d = d - 3;
                e = e + 1;
                if(d % 5 == 0){
                    e = e + (d / 5);
                    num2 = true;
                    break;
                } else if(d == 3){
                    e = e + 1;
                    num2 = true;
                    break;
                }
            }
            if(num1 == true && num2 == true){
                if(c < e){
                    output = c;
                } else{
                    output = e;
                }
            } else if(num1 == true && num2 == false){
                output = c;
            } else if(num1 == false && num2 == true){
                output = e;
            } else{
                output = -1;
            }
        } else if(a % 5 != 0 && a % 3 == 0){
            output = a / 3;
        }
        System.out.println(output);
    }
}
