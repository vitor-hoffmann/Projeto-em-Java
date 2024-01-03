public abstract class Medida {
 
    private double busto;
    private double cintura;
    private double quadril;
    private double braco;
    private double comprimento_perna;

    public String retornar_tamanho(){
        
        double[] medidasPadrao = {102, 102, 100, 16, 110}; 
        double proximidadeBusto = 100 - (Math.abs(medidasPadrao[0] - busto) / medidasPadrao[0]) * 100;
        double proximidadeCintura = 100 - (Math.abs(medidasPadrao[1] - cintura) / medidasPadrao[1]) * 100;
        double proximidadeQuadril = 100 - (Math.abs(medidasPadrao[2] - quadril) / medidasPadrao[2]) * 100;
        double proximidadeBraco = 100 - (Math.abs(medidasPadrao[3] - braco) / medidasPadrao[3]) * 100;
        double proximidadePerna = 100 - (Math.abs(medidasPadrao[4] - comprimento_perna) / medidasPadrao[4]) * 100;
        double mediaProximidade = (proximidadeBusto + proximidadeCintura + proximidadeQuadril + proximidadeBraco + proximidadePerna) / 5;

        if (busto == 0 || cintura == 0 || quadril == 0 || braco == 0 || comprimento_perna == 0) {
            return "Nao há medidas";
        }

        else if (mediaProximidade >= 85) {
            return "GG";
        } else if (mediaProximidade >= 70) {
            return "G";
        } else if (mediaProximidade >= 50) {
            return "M";
        } else if (mediaProximidade >= 30) {
            return "P";
        } else {
            return "PP";
        }
    }

    public double getBusto() {
        return busto;
    }
    public void setBusto(double busto) {
        this.busto = busto;
    }
    public double getCintura() {
        return cintura;
    }
    public void setCintura(double cintura) {
        this.cintura = cintura;
    }
    public double getQuadril() {
        return quadril;
    }
    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }
    public double getBraco() {
        return braco;
    }
    public void setBraco(double braco) {
        this.braco = braco;
    }
    public double getComprimento_perna() {
        return comprimento_perna;
    }
    public void setComprimento_perna(double comprimento_perna) {
        this.comprimento_perna = comprimento_perna;
    }

    public String visualizarMedidas() {
        return "\nComprimento do busto: " + busto +"\n"+"Medida da cintura: " + cintura + "\n" + "Medida do quadril: " + quadril + "\n" + 
        "Comprimento do braco: " + braco + "\n" + "Comprimento da perna: " + comprimento_perna;
    }
}