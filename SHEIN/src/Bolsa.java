public class Bolsa extends Produto{
    private String material;
    private String tamanho_alca;
    
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getTamanho_alca() {
		return tamanho_alca;
	}
	public void setTamanho_alca(String tamanho_alca) {
		this.tamanho_alca = tamanho_alca;
	}
	
	public Bolsa(String nome_produto, String categoria, double preco_produto, String cor, String descricao_produto,
			String origem, String tamanho, int id_produto, boolean favoritado, String material, String tamanho_alca,int quantidade_disponivel) {
		super(nome_produto, categoria, preco_produto, cor, descricao_produto, origem, tamanho, id_produto, favoritado,quantidade_disponivel);
		this.material = material;
		this.tamanho_alca = tamanho_alca;
	}
	
    public String toString() {
		return "\n Produto: "+super.toString()+" Material: "+getMaterial()+"\n"+" Tamanho da Alça: "+getTamanho_alca()+"\n\n";//+
				//", Quantidade: "+Estoque.quantidade_estoque(produtos, nome_produto);
	}
}
