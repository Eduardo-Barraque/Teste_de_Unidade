public class Resultados {
    private int Triglicerides;
    private int Colesterol_Total;
    private int Colesterol_HDL;
    private int Colesterol_LDL;
    private int Colesterol_VLDL;
    private int Glicose;

    public void setTriglicerides(int triglicerides) {Triglicerides = triglicerides;}

    public void setColesterol_Total(int colesterol_Total) {Colesterol_Total = colesterol_Total;}

    public void setColesterol_HDL(int colesterol_HDL) {Colesterol_HDL = colesterol_HDL;}

    public void setColesterol_LDL(int colesterol_LDL) {Colesterol_LDL = colesterol_LDL;}

    public void setColesterol_VLDL(int colesterol_VLDL) {Colesterol_VLDL = colesterol_VLDL;}

    public void setGlicose(int glicose) {Glicose = glicose;}

    private void verificarValorInvalido(int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valores iguais ou abaixo de zero são invalidos");
        }
    }

    public String VerificarTriglicerides(){

        int Nivel_Desejavel = 150;
        int Nivel_Limitrofe = 199;
        int Nivel_Alto = 499;

        this.verificarValorInvalido(this.Triglicerides);

        if(this.Triglicerides < Nivel_Desejavel ){
            return "Nivel Desejavel de Trigliceride";
        }
        else {
            if (this.Triglicerides <= Nivel_Limitrofe){
                return "Nivel Limitrofe de Trigliceride";
            }
            else {
                if (this.Triglicerides <= Nivel_Alto){
                    return "Nivel Alto de Trigliceride";
                }
                else {
                    return "Nivel Muito Alto de Trigliceride";
                }
            }
        }
    }
    public String VerificarColesterolTotal(){

        int Nivel_Desejavel = 200;
        int Nivel_Limitrofe = 239;

        this.verificarValorInvalido(this.Colesterol_Total);

        if(this.Triglicerides < Nivel_Desejavel ){
            return "Nivel Desejavel de Colesterol Total";
        }
        else {
            if (this.Triglicerides <= Nivel_Limitrofe){
                return "Nivel Limitrofe de Colesterol Total";
            }
            else {
                return "Nivel Elevado de Colesterol Total";
            }

        }
    }
    public String VerificarColesterolHDL(){

        int Nivel_Baixo = 40;
        int Nivel_Normal = 60;

        this.verificarValorInvalido(this.Colesterol_HDL);

        if(this.Colesterol_HDL < Nivel_Baixo ){
            return "Nivel Baixo de Colesterol HDL";
        }
        else {
            if (this.Colesterol_HDL <= Nivel_Normal){
                return "Nivel Normal de Colesterol HDL";
            }
            else {
                return "Nivel Desejavel de Colesterol HDL";
            }

        }
    }
    public String VerificarColesterolLDL(){

        int Nivel_Otimo = 100;
        int Nivel_Desejavel = 129;
        int Nivel_Limitrofe = 159;
        int Nivel_Alto = 189;

        this.verificarValorInvalido(this.Colesterol_LDL);

        if(this.Colesterol_LDL < Nivel_Otimo ){
            return "Nivel Ótimo de Colesterol LDL";
        }
        else {
            if (this.Colesterol_LDL <= Nivel_Desejavel){
                return "Nivel Desejavel de Colesterol LDL";
            }
            else {
                if (this.Colesterol_LDL <= Nivel_Limitrofe){
                    return "Nivel Limitrofe de Colesterol LDL";
                }
                else {
                    if (this.Colesterol_LDL <= Nivel_Alto){
                        return "Nivel Alto de Colesterol LDL";
                    }
                    else {
                        return "Nivel Muito alto de Colesterol LDL";
                    }
                }
            }
        }
    }
    public String VerificarColesterolVLDL(){

        int Nivel_desejavel = 30;
        int Nivel_limitrofe = 40;

        this.verificarValorInvalido(this.Colesterol_VLDL);

        if(this.Colesterol_VLDL < Nivel_desejavel ){
            return "Nivel desejável de Colesterol VLDL";
        }
        else {
            if (this.Colesterol_VLDL <= Nivel_limitrofe){
                return "Nivel Limítrofe de Colesterol VLDL";
            }
            else {
                return "Nivel Elevado de Colesterol VLDL";
            }
        }
    }
    public String VerificarGlicose(){

        int Hipoglicemia = 60;
        int Nivel_Desejavel = 99;
        int Glicemia_de_jejum_inapropriada = 125;

        this.verificarValorInvalido(this.Glicose);

        if(this.Glicose < Hipoglicemia ){
            return "Nivel de Glicose indica Hipoglicemia";
        }
        else {
            if (this.Glicose <= Nivel_Desejavel){
                return "Nivel de Glicose indica Glicemia de jejum inapropriada";
            }
            else {
                if (this.Glicose <= Glicemia_de_jejum_inapropriada){
                    return "Nivel Alto de Glicose";
                }
                else {
                    return "Nivel de Glicose indica Diabetes";
                }
            }
        }
    }
}
