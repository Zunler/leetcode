/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PalinDromeNumber
 * Author:   pengzijun
 * Date:     2019/9/29 10:22 下午
 * Description: 回文数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

/**
 * 〈一句话功能简述〉<br> 
 * 〈回文数〉
 *
 * @author pengzijun
 * @create 2019/9/29
 * @since 1.0.0
 */
public class PalinDromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
        char[] num=String.valueOf(x).toCharArray();
        int mid=num.length/2;
        for(int i=0;i<=mid;i++){
            if(num[i]!=num[num.length-1-i]){
                return  false;
            }
        }
        return true;
        }
    }

    public static void main(String[] args) {
        PalinDromeNumber palinDromeNumber=new PalinDromeNumber();
        System.out.println(palinDromeNumber.isPalindrome(10));
    }
}