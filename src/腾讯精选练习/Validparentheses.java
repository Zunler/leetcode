/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ValidParentheses
 * Author:   pengzijun
 * Date:     2019/10/4 9:05 下午
 * Description: 有效括号
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈有效括号〉
 *
 * @author pengzijun
 * @create 2019/10/4
 * @since 1.0.0
 */
public class Validparentheses {
    public boolean isValid(String s) {
        char[] parentheses = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length; i++) {
            System.out.println(stack.size());
            if (parentheses[i] == '(' || parentheses[i] == '[' || parentheses[i] == '{') {
                stack.push(parentheses[i]);
            } else if (parentheses[i] == '}' || parentheses[i] == ']' || parentheses[i] == ')') {
              if(stack.isEmpty()){
                  return  false;
              }
              else{
                  switch (parentheses[i]) {
                      case '}':
                          if (stack.peek() == '{') {
                              stack.pop();
                          } else {
                              return false;
                          }
                          break;
                      case ')':
                          if (stack.peek() == '(') {
                              stack.pop();
                          } else {
                              return false;
                          }
                          break;

                      case ']':
                          if (stack.peek() == '[') {
                              stack.pop();
                          } else {
                              return false;
                          }
                          break;

                  }
              }

            }


        }
        if(!stack.isEmpty()){
            return false;

        }
        return true;

    }

    public static void main(String[] args) {
        Validparentheses validparentheses = new Validparentheses();
        System.out.println(validparentheses.isValid(""));

    }
}