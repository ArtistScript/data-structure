package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: Solution56 <br/>
 * Function:  <br/>
 * Date: 2019-08-19 16:59<br/>
 *
 */
public class Solution56 {
    class Itrl{
        int start;
        int end;
        Itrl(int s_,int e_){
            start=s_;
            end=e_;
        }
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0) return intervals;
        Itrl[] itrls=new Itrl[intervals.length];
        List<Itrl> res=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            itrls[i]=new Itrl(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(itrls, new Comparator<Itrl>() {
            @Override
            public int compare(Itrl o1, Itrl o2) {
                if(o1.start>o2.start) return 1;
                else if(o1.start<o2.start) return -1;
                else return 0;
            }
        });
        int end=itrls[0].end;
        int start=itrls[0].start;
        for(int i=0;i<itrls.length;i++){
            if(itrls[i].start>end){
                res.add(new Itrl(start,end));
                start=itrls[i].start;
            }

            end=Math.max(end,itrls[i].end);
            if(i==itrls.length-1){
                res.add(new Itrl(start,end));
            }
        }
        int[][] resa=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            resa[i][0]=res.get(i).start;
            resa[i][1]=res.get(i).end;
        }
        return resa;
    }
}
