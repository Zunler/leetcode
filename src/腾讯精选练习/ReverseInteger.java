/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ReverseInteger
 * Author:   pengzijun
 * Date:     2019/9/29 9:42 下午
 * Description: 反转整数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

import java.math.BigInteger;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反转整数〉
 *
 * @author pengzijun
 * @create 2019/9/29
 * @since 1.0.0
 */
public class ReverseInteger {
    public int reverse(int x) {
        try {
            int flag=x>=0?1:0;
            char[] array=Integer.toString(Math.abs(x)).toCharArray();
            char[] re=new char[array.length];
            for (int i = 0; i < array.length; i++) {
                re[array.length-1-i]=array[i];

            }

            return flag==1?-Integer.parseInt(String.valueOf(re)):Integer.parseInt(String.valueOf(re));

        }
        catch (Exception e){
            return 0;
        }

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger=new ReverseInteger();
        System.out.println(Long.valueOf("9646324351"));
        System.out.println(reverseInteger.reverse(1534236469));
    }
}