/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ContainerWithMostWater
 * Author:   pengzijun
 * Date:     2019/10/4 6:42 下午
 * Description: 装最多水的容器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

/**
 * 〈一句话功能简述〉<br>
 * 〈装最多水的容器〉
 *
 * @author pengzijun
 * @create 2019/10/4
 * @since 1.0.0
 */
public class ContainerWithMostWater {
    public int maxArea1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int current = (j - i) * (height[i] > height[j] ?height[j] : height[i]);
               // System.out.println(current);
                if (current > max) {
                    max = current;
                }


            }

        }


        return max;


    }
    public int maxArea(int[] height) {
        int high=height.length-1;
        int low=0;
        int maxarea=0;

        while(low<high){
            int current = (high - low) * (height[high] > height[low] ?height[low] : height[high]);
            if(current>maxarea){
                maxarea=current;
            }
            if (height[high] > height[low]) {
                low++;
            } else {
                high--;
            }

        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

        System.out.println(containerWithMostWater.maxArea(input));


    }
}