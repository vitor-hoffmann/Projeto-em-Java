public class Pagamento {

    private String num_cartao;
    private String nome_titular;
    private String bandeira;
    private String vencimento;
    private int cod_seg;

    public boolean adicionarPagamento(String num_cartao, String nome_titular, String bandeira, String vencimento, int cod_seg) {
        StringBuilder num_format = new StringBuilder();
        
        int contador_letra = 0;
        for (int i = 0; i < num_cartao.length(); i++){
            char c = num_cartao.charAt(i);
            if (Character.isLetter(c)){
                contador_letra++;
            }
        }
        if (num_cartao != null && num_cartao.length() == 16 && contador_letra == 0){
            for (int i = 0; i < 16; i += 4) {
                if (i > 0) {
                    num_format.append("-");
                }
                num_format.append(num_cartao.substring(i, i + 4));
            }
            num_cartao = num_format.toString();
            this.num_cartao = num_cartao;
            this.nome_titular = nome_titular;
            this.bandeira = bandeira;
            this.vencimento = vencimento;
            this.cod_seg = cod_seg;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean excluirPagamento(Pagamento o){
        o.num_cartao = null;
        o.nome_titular = null;
        o.bandeira = null;
        o.vencimento = null;
        o.cod_seg = 0;
        return true;
    }

    @Override
    public String toString() {
        
        return "\nTitular: " + nome_titular +"\n"+"Numero do cartao: " + num_cartao +"\n" + "Bandeira: " + bandeira+"\n"
                + "Vencimento: " + vencimento +"\n" + "Codigo de seguranca: " + cod_seg;
    }

    public String getNum_cartao() {
        return num_cartao;
    }
    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }
    public String getNome_titular() {
        return nome_titular;
    }
    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public String getVencimento() {
        return vencimento;
    }
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    public int getCod_seg() {
        return cod_seg;
    }
    public void setCod_seg(int cod_seg) {
        this.cod_seg = cod_seg;
    }  
}
