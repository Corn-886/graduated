package sql;

import util.DBHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Corn on 2017/4/29.
 */
public class selectone {
    static String sql = null;
    static DBHelper db1 = null;
    static ResultSet ret = null;
    public static void main(String[] args) throws SQLException, InterruptedException {
        System.out.println("条数1开始"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        sql = "select * from feedback_operation_log  where oid='297e72f8448be03a01448be5c8a90012'";//SQL语句
        db1 = new DBHelper(sql);//创建DBHelper对象
        ret = db1.pst.executeQuery();//执行语句，得到结果集
        System.out.println("1结束"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        ret.close();
        db1.close();//关闭连接
        Thread.sleep(5000);//暂停5秒

        System.out.println("2开始"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        sql = "select * from feedback_alarm_config where alerm_id='402880f8598761e2015987b846f30018'";//SQL语句
        db1 = new DBHelper(sql);//创建DBHelper对象
        ret = db1.pst.executeQuery();//执行语句，得到结果集
        System.out.println("条数2结束"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        ret.close();
        db1.close();//关闭连接

        Thread.sleep(5000);//暂停5秒


        System.out.println("3开始"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        sql = "select * from at_km_cagegory where category_id='4028827c45871e540145878bf90e002e'";//SQL语句
        db1 = new DBHelper(sql);//创建DBHelper对象
        ret = db1.pst.executeQuery();//执行语句，得到结果集
        ret.close();
        db1.close();//关闭连接
        System.out.println("3结束"+new SimpleDateFormat("ssSSS") .format(new Date() ));
        Thread.sleep(5000);//暂停5秒

        System.out.println("计算完成");
    }
}
