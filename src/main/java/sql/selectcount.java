package sql;

import util.DBHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Corn on 2017/4/29.
 */
public class selectcount {
    static String sql = null;
    static DBHelper db1 = null;
    static ResultSet ret = null;
    public static void main(String[] args) throws SQLException, InterruptedException {
        System.out.println("条数1开始"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        sql = "select count(*) from feedback_operation_log";//SQL语句
        db1 = new DBHelper(sql);//创建DBHelper对象
        ret = db1.pst.executeQuery();//执行语句，得到结果集
        System.out.println("1结束"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        ret.close();
        db1.close();//关闭连接

        Thread.sleep(5000);//暂停5秒
        System.out.println("2开始"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        sql = "select count(*) from feedback_alarm_config";//SQL语句
        db1 = new DBHelper(sql);//创建DBHelper对象
        ret = db1.pst.executeQuery();//执行语句，得到结果集
        System.out.println("2结束"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        ret.close();
        db1.close();//关闭连接

        Thread.sleep(5000);//暂停5秒


        System.out.println("3开始"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        sql = "select count(*) from at_km_cagegory";//SQL语句
        db1 = new DBHelper(sql);//创建DBHelper对象
        ret = db1.pst.executeQuery();//执行语句，得到结果集
        System.out.println("3结束"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        ret.close();
        db1.close();//关闭连接

        Thread.sleep(5000);//暂停5秒

        System.out.println("计算完成");
    }
}
