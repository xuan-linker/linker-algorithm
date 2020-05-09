package com.xlccc.basic;

/**
 * @Author Linker
 * @Date 2020/5/9 9:55 下午
 * @Version 1.0
 * TODO:单源最短路径
 */
public class Dijkstra {
    public static void main(String[] args) {

        //存顶点到每个点的距离数据
        int[][] e = new int[10][10];
        //存储1号顶点到其他点的初始距离
        int[] dis = new int[7];
        //记录哪些点已知最短路径
        int[] book = new int[7];
        final int max = 9999999;

        //顶点数
        int n = 6;
        //边数
        int m = 9;
        //最小值
        int min;

        //初始化二维数组e
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    e[i][j] = 0;
                } else {
                    e[i][j] = max;
                }
            }
        }

        //初始化边数据(m条有向边)
        e[1][2] = 1;
        e[1][3] = 12;
        e[2][3] = 9;
        e[2][4] = 3;
        e[3][5] = 5;
        e[4][3] = 4;
        e[4][5] = 13;
        e[4][6] = 15;
        e[5][6] = 4;

        //初始化dis 初始化book
        for (int i = 1; i <= n; i++) {
            dis[i] = e[1][i];
            book[i] = 0;
        }

        //将顶点先标记为已经在已知最短路径集合中
        book[1] = 1;
        //
        int tempj = 0;

        //核心算法部分
        for (int i = 1; i <= n; i++) {
            min = max;
            //找到离1号顶点最近的顶点，
            //每次循环结束都能确定一个离1号点最近的点
            for (int j = 1; j <= n; j++) {
                if (book[j] == 0 && dis[j] < min) {
                    min = dis[j];
                    tempj = j;
                }
            }
            //标记找到的顶点j为已确定最小路径的点
            book[tempj] = 1;
            //已tempj顶点为起点（此时tempj离1点最小路径已确定）
            //对每个点进行一次比较
            for (int v = 1; v <= n ; v++) {
                //当tempj到v顶点的距离小于无穷大并且1号点到tempj顶点的距离
                //加上tempj点到v点的距离小于，1号点到v点的距离
                //说明已经找到一条比1-v更短的路径1-tempj-v，更新最小值dis[v]
                if (e[tempj][v] < max && dis[v] > dis[tempj] + e[tempj][v]){
                    dis[v] = dis[tempj] + e[tempj][v];
                }
            }
        }
        for (int i = 1; i <=n ; i++) {
            System.out.println("1号点到"+i+"号顶点的最短路径为:"+dis[i]+"");
        }
    }
}
