package org.word.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wenc
 * @create 2019-07-02 9:08
 */
public class DateUtil {

    /**
     * getFormatDate  yyyy-mm-dd hh:MM:ss
     *
     * @return
     */
    public static String getFormatCurrentDate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateFormat = simpleDateFormat.format(date);
        return currentDateFormat;
    }
}