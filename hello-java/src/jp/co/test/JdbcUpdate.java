package jp.co.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

    // MySQLの接続情報
    private static final String URL = "jdbc:mysql://localhost:3306/test_db"; // DBのURL
    private static final String USER = "root"; // DBのユーザー名
    private static final String PASSWORD = "123456"; // DBのパスワード

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
  
        try {
            // JDBCドライバのロード
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // データベースに接続
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // ステートメントを作成
            stmt = conn.createStatement();
            
            
            // 災害を防ぐため
            conn.setAutoCommit(false);
            
            
            // SQL実行
            String sql1 = "update t_money set money = money - 1000 where name='田中'";  //　★ t_moneyテーブルからデータを取得
            int cnt1 = stmt.executeUpdate(sql1);
            
            
            // SQL実行
            String sql2 = "update t_money set money = money + 1000 where name='佐藤'";  //　★ t_moneyテーブルからデータを取得
            int cnt2 = stmt.executeUpdate(sql2);
            
            conn.commit();
            
            stmt.close();
            conn.close();
            
        } catch (SQLException se) {

            try {
                conn.rollback();
            } catch (SQLException se2) {
                // TODO 自動生成された catch ブロック
                se2.printStackTrace();
            }
            se.printStackTrace();
        } catch (Exception e) {

            try {
                conn.rollback();
            } catch (SQLException e2) {
                // TODO 自動生成された catch ブロック
                e2.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            
            // エラー発生しても解放
            // 資源を解放
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
