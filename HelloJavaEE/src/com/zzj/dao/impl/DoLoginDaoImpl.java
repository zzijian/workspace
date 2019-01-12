package com.zzj.dao.impl;

import com.zzj.dao.DoLoginDao;
import com.zzj.pojo.User;

import java.sql.*;

public class DoLoginDaoImpl implements DoLoginDao {
    @Override
    public User checkLoginDao(String uname, String pwd) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //声明数据存储对象
        User user = null;

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/root?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true","root","1314789");
            //创建Sql命令
            String sql = "select * from user where uname=? and pwd=?";
            //创建Sql命令对象
            ps = conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1,uname);
            ps.setString(2,pwd);
            //执行
            rs = ps.executeQuery();
            //遍历执行结果
            while (rs.next()){
                user = new User();
                user.setUid(rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setPwd(rs.getString("pwd"));
            }
            //关闭资源
            //返回
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return user;
    }
}
