package jp.co.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc02 {

    // MySQLの接続情報
    private static final String URL = "jdbc:mysql://localhost:3306/test_db"; // DBのURL
    private static final String USER = "root"; // DBのユーザー名
    private static final String PASSWORD = "123456"; // DBのパスワード

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // JDBCドライバのロード
            Class.forName("com.mysql.cj.jdbc.Driver");

            // データベースに接続
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQLクエリを実行
            String sql = "SELECT name a,money yyy,now() now FROM t_money where name = ? "; // ★ t_moneyテーブルからデータを取得

            // ステートメントを作成
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "田中");
            System.out.println("Executing SQL: " + stmt.toString());
            
            ResultSet rs = stmt.executeQuery();

            // 結果を処理
            while (rs.next()) {
                String name = rs.getString("a");// ★
                int money = rs.getInt("yyy");// ★
                java.sql.Date now = rs.getDate("now");// ★
                System.out.println("名前: " + name + ", 残高: " + money + ", now:" + now);// ★
            }
            
            

            // 結果セットを閉じる
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // エラー発生しても解放
            // 資源を解放
            try {
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
