package com.example.production_mes.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public String NowTime(){

        Date date=new Date();   //这里的时util包下的
        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //这是24时
        String Date=temp.format(date);
        return Date;
    }
}
