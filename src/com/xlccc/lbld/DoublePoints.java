package com.xlccc.lbld;

import com.xlccc.lbld.Base1.*;

/**
 * 双指针
 */
public class DoublePoints {
    /**
     * 链表不含有环，直接判断即可
     *
     * @param head
     * @return
     */
    boolean hasCycleSimple(ListNode head) {
        while (head != null) {
            head = head.next;
        }
        return false;
    }

    /**
     * 如果不含有环，快指针最终遇到null，说明链表不含有环
     * 如果含邮环，快指针最终会超慢指针一圈，和慢指针相遇
     *
     * @param head
     * @return
     */
    boolean hasCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 已知链表含有环，返回这个环的起始位置
     * 设slow走了k步，fast走了2k步，两者相遇
     * 设环的起点距离相遇点为m
     * 那么head距离环起点为k-m
     * 已知 fast-slow=k ，k为环的长度（2k，k在同一点相遇，差值k为环长度）
     * 将其中一个节点置于head，另一个保持同速度继续前进
     *
     * @param head
     * @return
     */
    ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 寻找链表的中点
     * 如果链表长度是奇数，slow恰巧停在中点
     * 如果链表长度是偶数，slow最终位置是中间偏右
     */
    ListNode findMid(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow就在中间位置
        return slow;
    }

    /**
     * 寻找链表倒数第k个元素
     * 快指针先走k步，
     * 快慢指针同速走
     * 快指针到达链表末尾null
     * 慢指针为倒数第k个元素
     */
    ListNode backwardNode(ListNode head, int k) {
        ListNode fast, slow;
        fast = slow = head;
        while (k-- > 0) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    /**
     * 双指针在二分查找里的应用
     *
     * @param nums
     * @param target
     * @return
     */
    int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 求两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    void reserve(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
//            swap(nums[left],nums[right]);
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }


}
