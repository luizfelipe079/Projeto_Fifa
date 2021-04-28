package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Wl_Fifa;
import dadosConexao.conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FifaDao {
    // Adicionando uma nova WL
    public void add(Wl_Fifa Wl_Fifa){
        Connection con = conexao.getConnection();
        PreparedStatement pstm = null;
        
        try {
            pstm = con.prepareStatement("insert into wl (vitorias, derrotas, penaltis) values (?, ?, ?)");
            pstm.setInt(1,Wl_Fifa.getVitorias());
            pstm.setInt(2,Wl_Fifa.getDerrotas());
            pstm.setInt(3, Wl_Fifa.getPenaltis());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Adicionado com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar ao Banco", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        finally{
            conexao.closeConnection(con, pstm);
        }
    }
}
