package settings;

public class PreferenciasUsuario {

    private PreferenciasUsuario() {};
    private static PreferenciasUsuario instance = new PreferenciasUsuario();

    public static PreferenciasUsuario getInstance() {
        return instance;
    }
    private String cor;
    private String fonte;
    private int tamanhoFonte;


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
