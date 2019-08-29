package database;

import java.sql.*;  //导入 java.sql 包

public class Conn {
    Connection con; //声明 Connection 对象

    public Connection getConnection() { // 建立返回值为 Connection 的方法
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //加载数据库驱动类
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try { // 通过访问数据库的URL, 获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql:"
                    + "//127.0.0.1:3306/test", "root", "nirvana0401");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // 返回一个 Connection 对象
    }

    public static void main(String[] args) {
        Conn c = new Conn(); // 创建本类对象
        c.getConnection(); // 调用连接数据库的方法
    }
}
