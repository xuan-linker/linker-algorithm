package com.xlccc.lbld;

import java.util.*;

public class BFS_Lee752 {


    private String plusOne(String s, int j) {
        char[] ch = s.toCharArray();

        if (ch[j] == '9') {
            ch[j] = '0';
        } else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    private String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        } else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

    public void bfs(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        q.offer("0000");

        while (q.size() > 0) {
            for (int i = 0; i < q.size(); i++) {
                String cur = q.poll();
                System.out.println(cur);

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    String down = minusOne(cur, j);
                    q.offer(up);
                    q.offer(down);
                }
            }
            /*增加步数*/
            return;
        }

    }

    /**
     * 交替广度遍历从而获得结果
     *
     * @param deadends
     * @param target
     * @return
     */
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        Set<String> dead = new HashSet<>();
        for (String d : deadends
        ) {
            dead.add(d);
        }
        Set<String> visited = new HashSet<>();
        q.offer("0000");
        visited.add("0000");

        int step = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                if (dead.contains(cur)) {
                    //直接跳过此次dead
                    continue;
                }
                if (cur.equals(target)) {
                    return step;
                }

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    String down = minusOne(cur, j);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    if (!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }

            }
            /*增加步数*/
            step++;
        }
        return -1;
    }

    /**
     * q1遍历广度得到的数据
     * 如果q2包含q1的数据，说明上下打通，直接返回step
     *
     * @param deadends
     * @param target
     * @return
     */
    public int openLockWithTwoDirection(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();
        for (String dead : deadends
        ) {
            deads.add(dead);
        }
        Set<String> visited = new HashSet<>();

        //使用集合不用队列可以快速判断元素是否存在
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        int step = 0;
        q1.add("0000");
        q2.add(target);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            Set<String> temp = new HashSet<>();
            /*将q1的节点开始扩散*/
            for (String cur : q1
            ) {
                if (deads.contains(cur)) {
                    continue;
                }
                //判断成立条件
                if (q2.contains(cur)) {
                    return step;
                }
                visited.add(cur);

                for (int i = 0; i < 4; i++) {
                    String up = plusOne(cur, i);
                    String down = minusOne(cur, i);
                    if (!visited.contains(up)) {
                        temp.add(up);
                    }
                    if (!visited.contains(down)) {
                        temp.add(down);
                    }
                }
            }
            q1 = q2;
            q2 = temp;
            step++;

        }
        return -1;
    }

    public static void main(String[] args) {
        BFS_Lee752 bfs = new BFS_Lee752();
//        String[] nums = {"1111"};
//        bfs.bfs(nums, "2222");
        String[] deadNum = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        int result = bfs.openLockWithTwoDirection(deadNum, target);
        System.out.println(result);
    }
}
