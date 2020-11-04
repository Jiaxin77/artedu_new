package hci.artedu.utils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @ClassName DataUtils
 * @Description TODO
 * @Author jiaxin
 * @Date 2020/11/2 10:16 上午
 * @Version 1.0
 **/
public class DateUtils {
    /**
     * @Author jiaxin
     * @Description 获取系统时间并且转换为能存入mysql的datetime格式//TODO
     * @Date 10:16 上午 2020/11/2
     * @Param
     * @return timestamp（能存入mysql）
     **/

    public static Timestamp nowDateTime(){
        //获取系统当前时间，格式：Tue Jun 23 19:57:59 CST 2020
        Date date = new Date();
        //获取系统当前时间的时间戳，格式：1592913479942
        long dataTime = date.getTime();
        //把时间戳转换为能够存入MySQL的datetime的时间格式
        Timestamp timestamp = new Timestamp(dataTime);
        return timestamp;
    }



}
