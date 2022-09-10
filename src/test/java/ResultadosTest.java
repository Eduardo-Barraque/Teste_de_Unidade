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
    /* ------------------------------------------------------------------------------------------------- */
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
    /* ------------------------------------------------------------------------------------------------- */
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

    /* ------------------------------------------------------------------------------------------------- */
    @Test
    public void deveRetornarValorInvalidoColesterolLDL(){
        try{
            Resultados resultados = new  Resultados();
            resultados.setColesterol_LDL(0);
            resultados.VerificarColesterolLDL();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valores iguais ou abaixo de zero são invalidos", e.getMessage());
        }
    }

    @Test
    public void deveRetornarColesterolLDLOtimo(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_LDL(99);
        assertEquals("Nivel Ótimo de Colesterol LDL", resultados.VerificarColesterolLDL());
    }
    @Test
    public void deveRetornarColesterolLDLDesejavel(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_LDL(129);
        assertEquals("Nivel Desejavel de Colesterol LDL", resultados.VerificarColesterolLDL());
    }
    @Test
    public void deveRetornarColesterolLDLLimitrofe(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_LDL(159);
        assertEquals("Nivel Limitrofe de Colesterol LDL", resultados.VerificarColesterolLDL());
    }
    @Test
    public void deveRetornarColesterolLDLAlto(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_LDL(189);
        assertEquals("Nivel Alto de Colesterol LDL", resultados.VerificarColesterolLDL());
    }
    @Test
    public void deveRetornarColesterolLDLMuitoAlto(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_LDL(190);
        assertEquals("Nivel Muito alto de Colesterol LDL", resultados.VerificarColesterolLDL());
    }
    /* ------------------------------------------------------------------------------------------------- */
    @Test
    public void deveRetornarValorInvalidoColesterolVLDL(){
        try{
            Resultados resultados = new  Resultados();
            resultados.setColesterol_VLDL(0);
            resultados.VerificarColesterolVLDL();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valores iguais ou abaixo de zero são invalidos", e.getMessage());
        }
    }

    @Test
    public void deveRetornarColesterolVLDLDesejavel(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_VLDL(29);
        assertEquals("Nivel desejável de Colesterol VLDL", resultados.VerificarColesterolVLDL());
    }
    @Test
    public void deveRetornarColesterolVLDLLimitrofe(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_VLDL(40);
        assertEquals("Nivel Limítrofe de Colesterol VLDL", resultados.VerificarColesterolVLDL());
    }
    @Test
    public void deveRetornarColesterolVLDLElevado(){
        Resultados resultados = new  Resultados();
        resultados.setColesterol_VLDL(41);
        assertEquals("Nivel Elevado de Colesterol VLDL", resultados.VerificarColesterolVLDL());
    }
    /* ------------------------------------------------------------------------------------------------- */

    @Test
    public void deveRetornarValorInvalidoGlicose(){
        try{
            Resultados resultados = new  Resultados();
            resultados.setGlicose(0);
            resultados.VerificarGlicose();
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Valores iguais ou abaixo de zero são invalidos", e.getMessage());
        }
    }

    @Test
    public void deveRetornarGlicoseHipoglicemia(){
        Resultados resultados = new  Resultados();
        resultados.setGlicose(59);
        assertEquals("Nivel de Glicose indica Hipoglicemia", resultados.VerificarGlicose());
    }
    @Test
    public void deveRetornarGlicoseDesejavel(){
        Resultados resultados = new  Resultados();
        resultados.setGlicose(99);
        assertEquals("Nivel de Desejavel de Glicose", resultados.VerificarGlicose());
    }
    @Test
    public void deveRetornarGlicoseAlto(){
        Resultados resultados = new  Resultados();
        resultados.setGlicose(125);
        assertEquals("Nivel de Glicose indica Glicemia de jejum inapropriada", resultados.VerificarGlicose());
    }
    @Test
    public void deveRetornarGlicoseMuitoAlto(){
        Resultados resultados = new  Resultados();
        resultados.setGlicose(126);
        assertEquals("Nivel de Glicose indica Diabetes", resultados.VerificarGlicose());
    }
}
