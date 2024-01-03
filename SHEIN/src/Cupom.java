public class Cupom {

    private String nome_cupom;
    private int desconto;
    private String desc_cupom;
    private int codigo;
    private int validade;

    public Cupom(String nome_cupom, int desconto, String desc_cupom, int codigo, int validade) {
        this.nome_cupom = nome_cupom;
        this.desconto = desconto;
        this.desc_cupom = desc_cupom;
        this.codigo = codigo;
        this.validade = validade;
    }
    @Override
    public String toString() {
        return "Cupom: " + nome_cupom + "\n" + "Desconto: " + desconto +"\n"+ "Descricao: " + desc_cupom+"\n" + "Codigo: "
        +codigo + "\n"+"Validade: " + validade + "\n";
    }

}
