package com.lc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ClassName: Solution71 <br/>
 * Function:  <br/>
 * Date: 2019-09-03 14:52<br/>
 *
 */
public class Solution71 {
    public String simplifyPath(String path) {
        String entity[]=path.split("/+",1);
        List<String> files=new ArrayList<>();
        for(String et:entity){
            if(et.equals(".")) continue;
            else if(et.equals("..")&&files.size()>0) files.remove(files.size()-1);
            else if(et.equals("..")&&files.size()==0) continue;
            else if(et.length()==0) continue;
            else files.add(et);
        }
        StringBuilder canonical=new StringBuilder();
        canonical.append("/");
        for(int i=0;i<files.size();i++){
            canonical.append(files.get(i));
            if(i<files.size()-1) canonical.append("/");
        }
        return canonical.toString();
    }
}
