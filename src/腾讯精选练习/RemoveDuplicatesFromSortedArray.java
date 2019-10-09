/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: RemoveDuplicatesFromSortedArray
 * Author:   pengzijun
 * Date:     2019/10/9 9:54 上午
 * Description: 删除数组中重复元素
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 腾讯精选练习;

/**
 * 〈一句话功能简述〉<br>
 * 〈删除数组中重复元素〉
 *
 * @author pengzijun
 * @create 2019/10/9
 * @since 1.0.0
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int tag =-999;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] != tag) {
                tag = nums[i];
            } else {

                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j + 1];

                }
                size--;
                i--;

            }

        }

        return size;
    }
//有点慢啊，评论又说双指针，所以双指针是啥 碰到好几次了
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println("remain:"+removeDuplicatesFromSortedArray.removeDuplicates(nums));

    }
}