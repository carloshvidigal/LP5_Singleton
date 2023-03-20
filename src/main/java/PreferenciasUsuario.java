

public class PreferenciasUsuario {
    private String cor;
    private String fonte;
    private int tamanhoFonte;

    private static PreferenciasUsuario instance;
    private PreferenciasUsuario() {};

    public static PreferenciasUsuario getInstance() {
        if (instance == null) {
            instance = new PreferenciasUsuario();
        }
        return instance;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getfonte(){
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public int getTamanhoFonte(){
        return tamanhoFonte;
    }

    public void setTamanhoFonte(int tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }
}
