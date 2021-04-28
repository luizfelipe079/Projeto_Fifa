package modelo;
public class Wl_Fifa {
    private int id_wl, vitorias, derrotas, penaltis;

    public Wl_Fifa() {
    }

    public Wl_Fifa(int id_wl, int vitorias, int derrotas, int penaltis) {
        this.id_wl = id_wl;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.penaltis = penaltis;
    }

    public int getId_wl() {
        return id_wl;
    }

    public void setId_wl(int id_wl) {
        this.id_wl = id_wl;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(int penaltis) {
        this.penaltis = penaltis;
    }
    
    
}
