
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PreferenciasUsuarioTest {

    @Test
    public void deveRetornarCor() {
        PreferenciasUsuario.setCor("Vermelho");
        assertEquals(PreferenciasUsuario.getCor(), "Vermelho");
    }

    @Test
    public void deveRetornarFonte() {
        PreferenciasUsuario.setFonte("Arial");
        assertEquals(PreferenciasUsuario.getfonte, "Arial");
    }

    @Test
    public void deveRetornarTamanhoFonte() {
        PreferenciasUsuario.setTamanhoFonte("12");
        assertEquals(PreferenciasUsuario.getTamanhoFonte, "12");
    }

}