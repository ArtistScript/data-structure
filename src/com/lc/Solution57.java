package com.lc;

/**
 * ClassName: Solution57 <br/>
 * Function:  <br/>
 * Date: 2019-08-20 14:51<br/>
 *
 */

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * 解法：找到start，end插入的位置，记录被合并的数组
 */
public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Pair<Integer,Integer>> vc=new ArrayList<>();
        int i=0;
        while(i<intervals.length&&intervals[i][1]<newInterval[0]){
            ((ArrayList) vc).add(new Pair<>(intervals[i][0],intervals[i][1]));
            i++;
        }
        while (i<intervals.length&&intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        ((ArrayList) vc).add(new Pair<>(newInterval[0],newInterval[1]));
        while (i<intervals.length){
            ((ArrayList) vc).add(new Pair<>(intervals[i][0],intervals[i][1]));
            i++;
        }
        int[][] re=new int[((ArrayList) vc).size()][2];
        i=0;
        for(Pair<Integer,Integer> pr:vc){
            re[i++]=new int[]{pr.getKey(),pr.getValue()};
        }
        return re;
    }
}
