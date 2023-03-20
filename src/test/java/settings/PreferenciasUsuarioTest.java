package settings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PreferenciasUsuarioTest {

    @Test
    public void deveRetornarCor() {
        PreferenciasUsuario.getInstance().setCor("Arial");
        assertEquals(PreferenciasUsuario.getInstance().getCor(), "Arial");
    }

    @Test
    public void deveRetornarFonte() {
        PreferenciasUsuario.getInstance().setFonte("Arial");
        assertEquals(PreferenciasUsuario.getInstance().getfonte(), "Arial");
    }

    @Test
    public void deveRetornarTamanhoFonte() {
        PreferenciasUsuario.getInstance().setTamanhoFonte(12);
        assertEquals(PreferenciasUsuario.getInstance().getTamanhoFonte(), 12);
    }

}