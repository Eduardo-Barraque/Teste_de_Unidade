import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResultadosTest {

    @Test
    public void deveRetornarValorInvalidoTrigliceride(){
        try{
            Resultados resultados = new  Resultados();
            resultados.setTriglicerides(0);
            resultados.VerificarTriglicerides();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valores iguais ou abaixo de zero são invalidos", e.getMessage());
        }
    }

    @Test
    public void deveRetornarTriglicerideDesejavel(){
        Resultados resultados = new  Resultados();
        resultados.setTriglicerides(149);
        assertEquals("Nivel Desejavel de Trigliceride", resultados.VerificarTriglicerides());
    }
    @Test
    public void deveRetornarTriglicerideLimitrofe(){
        Resultados resultados = new  Resultados();
        resultados.setTriglicerides(199);
        assertEquals("Nivel Limitrofe de Trigliceride", resultados.VerificarTriglicerides());
    }
    @Test
    public void deveRetornarTriglicerideAlto(){
        Resultados resultados = new  Resultados();
        resultados.setTriglicerides(499);
        assertEquals("Nivel Alto de Trigliceride", resultados.VerificarTriglicerides());
    }
    @Test
    public void deveRetornarTriglicerideMuitoAlto(){
        Resultados resultados = new  Resultados();
        resultados.setTriglicerides(500);
        assertEquals("Nivel Muito Alto de Trigliceride", resultados.VerificarTriglicerides());
    }

    @Test
    public void deveRetornarValorInvalidoColesterolTotal(){
        try{
            Resultados resultados = new  Resultados();
            resultados.setColesterol_Total(0);
            resultados.VerificarColesterolTotal();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valores iguais ou abaixo de zero são invalidos", e.getMessage());
        }
    }
    @Test
    public void deveRetornarColesterolTotalDesejavel(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_Total(199);
        assertEquals("Nivel Desejavel de Colesterol Total", resultados.VerificarColesterolTotal());
    }
    @Test
    public void deveRetornarColesterolTotalLimitrofe(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_Total(239);
        assertEquals("Nivel Limitrofe de Colesterol Total", resultados.VerificarColesterolTotal());
    }
    @Test
    public void deveRetornarColesterolTotalElevado(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_Total(240);
        assertEquals("Nivel Elevado de Colesterol Total", resultados.VerificarColesterolTotal());
    }

    @Test
    public void deveRetornarValorInvalidoColesterolHDL(){
        try{
            Resultados resultados = new  Resultados();
            resultados.setColesterol_HDL(0);
            resultados.VerificarColesterolHDL();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valores iguais ou abaixo de zero são invalidos", e.getMessage());
        }
    }

    @Test
    public void deveRetornarColesterolHDLBaixo(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_HDL(39);
        assertEquals("Nivel Baixo de Colesterol HDL", resultados.VerificarColesterolHDL());
    }
    @Test
    public void deveRetornarColesterolHDLNormal(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_HDL(60);
        assertEquals("Nivel Normal de Colesterol HDL", resultados.VerificarColesterolHDL());
    }
    @Test
    public void deveRetornarColesterolHDLDesejavel(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_HDL(61);
        assertEquals("Nivel Desejavel de Colesterol HDL", resultados.VerificarColesterolHDL());
    }
}
