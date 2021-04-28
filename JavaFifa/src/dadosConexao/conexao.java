package dadosConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexao {
    private static final String drive = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/wlfifa";
    private static final String usuario = "root";
    private static final String senha= "010498";
    
    public static Connection getConnection(){
        try {
            Class.forName(drive);
            return DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException ErroSql) {
            throw new RuntimeException("Erro! "
                    + "Não foi possível conectar" + ErroSql);
        }
    }
    
    public static void closeConnection(Connection con) {
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException ErroSql) {
            throw new RuntimeException("Erro! Não "
                    + "foi possível fechar a conexão" + ErroSql);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pstm) {
        closeConnection(con);
        try {
            if(pstm != null){
                pstm.close();
            }
        } catch (SQLException ErroSql) {
            throw new RuntimeException("Erro! Não "
                    + "foi possível fechar o PreparedStatement" + ErroSql);
        }
    }
    
    public static void closeConnection(Connection con, ResultSet rs) {
        closeConnection(con);
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ErroSql) {
            throw new RuntimeException("Erro! Não "
                    + "foi possível fechar o ResultSet" + ErroSql);
        }
    }
}
