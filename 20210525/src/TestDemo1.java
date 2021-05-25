/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-25
 * Time: 14:02
 */
public class TestDemo1 {
    public class TestDemo1斐波那契数列 {
        public int fib(int n) {
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            return fib(n-1)+fib(n-2);
        }


}}
