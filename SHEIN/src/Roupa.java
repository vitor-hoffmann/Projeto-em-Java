public class Roupa extends Produto{

    private String tecido;
    private String tipo;
    
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Roupa(String nome_produto, String categoria, double preco_produto, String cor, String descricao_produto,
			String origem, String tamanho, int id_produto, boolean favoritado, String tecido, String tipo,int quantidade_disponivel) {
		super(nome_produto, categoria, preco_produto, cor, descricao_produto, origem, tamanho, id_produto, favoritado,quantidade_disponivel);
		this.tecido = tecido;
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "\n Produto: " +super.toString()+" Tecido: "+getTecido()+"\n"+" Tipo: "+getTipo()+"\n";
	}
}
