/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-25
 * Time: 14:01
 */
public class TestDemo2 {
    class Solution {
        public double myPow(double x,int n) {
            //base!=0,n>0;
            //base！=0.n<0;
            //base=0;n</= 0;
            if(x==0.0&& n<0){
                return 0;
            }
            long m = Math.abs((long)n);//取绝对值
            double result =calculate(x,m);
            if(n < 0)  return 1 / result;
            return result;
        }
        public double calculate(double base,long absn){
            double result = 1.0;
            for(int i = 1;i<=absn;i++){
                result*=base;
            }
            return result;
        }
// if(n == 0)  return 1;
//            long m = Math.abs((long)n);
//             double num =calculate(x,m);
//             if(n < 0)  return 1 / num;
//             return num;
//         }
//         public double calculate(double x,long n){

//             if(n == 1)  return x;
//             double a = calculate(x,n/2);
//             if(n % 2 == 0){
//                 return a * a;
//             }
//             return a * a * x;
//         }
    }

    class Solution {
        public double myPow(double x, int n) {
            long m = Math.abs((long)n);
            double num =calculate(x,m);
            if(n < 0)  return 1 / num;
            return num;
        }
        public double calculate(double x,long n){
            if(n == 0)  return 1;
            if(n == 1)  return x;
            double a = calculate(x,n/2);
            if(n % 2 == 0){
                return a * a;
            }
            return a * a * x;
        }
    }
}
