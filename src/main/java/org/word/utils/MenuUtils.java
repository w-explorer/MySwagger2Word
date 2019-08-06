package org.word.utils;

/**
 * @author wenc
 * @descrpition 把属于同一个类的请求分类整理到一起
 * @create 2019-08-06 10:39
 */
public class MenuUtils {
    public static Integer count = 0;
    public static String menuStr = "null";
    public static  boolean isMenu(String tags){
        if(menuStr.equals(tags)){
            count++;
        }
        else {
            menuStr = tags;
            count = 0;
        }
        if(count==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
