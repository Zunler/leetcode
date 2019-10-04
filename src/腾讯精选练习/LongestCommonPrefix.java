/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LonestCommonPrefix
 * Author:   pengzijun
 * Date:     2019/9/29 10:38 下午
 * Description: 最长公共前缀
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

/**
 * 〈一句话功能简述〉<br>
 * 〈最长公共前缀〉
 *
 * @author pengzijun
 * @create 2019/9/29
 * @since 1.0.0
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {
        char[] prefix;
        int mini = strs[0].length();
        int count = 0;
        try {

            while (true) {
                for (int i = 0; i < strs.length; i++) {

                }
            }
        } catch (Exception e) {

        }
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < mini) {
                mini = strs[i].length();
            }


        }
        return "fuck";
    }

    public String longestCommonPrefix(String[] strs) {
        try{
            int minilen = strs[0].length();
            int index = 0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < minilen) {
                    minilen = strs[i].length();
                    index = i;

                }

            }
            int max = 0;
            char[] temp = strs[index].toCharArray();
            for (int i = 0; i < minilen; i++) {
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].toCharArray()[i] != temp[i]) {

                        return strs[index].substring(0, i);
                    }

                }
            }
            return strs[index];
        }
        catch (Exception e){
            return "";
        }

    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"abb","abc"};
        String[] strs2 = {"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs1));//突然发现这里这种最长最短匹配的，好多喜欢使用所谓的双指针法啊·
    }
}