import java.util.ArrayList;

public class Pedido {

	private int valor;
    private Endereco endereco;
    private int cdg_comp;
    private Pagamento pagamento;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private boolean finalizado;
    private int qntdprod;

    public int getQntdprod() {
        return qntdprod;
    }
    public boolean isFinalizado() {
        return finalizado;
    }
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Endereco getendereco() {
        return endereco;
    }
    public void setendereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public int getCdg_comp() {
        return cdg_comp;
    }
    public void setCdg_comp(int cdg_comp) {
        this.cdg_comp = cdg_comp;
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public ArrayList<Produto> getProduto() {
        return produtos;
    }
    public void setProduto(ArrayList<Produto> produto) {
        this.produtos = produto;
    }

    public Pedido(int valor, Endereco endereco, int cdg_comp, Pagamento pagamento, ArrayList<Produto> produto, boolean finalizado) {
        this.valor = valor;
        this.endereco = endereco;
        this.cdg_comp = cdg_comp;
        this.pagamento = pagamento;
        this.produtos = produto;
        this.finalizado = finalizado;
    }
    public void adicionarProduto(Produto o){
        produtos.add(o);
        qntdprod++;
    }
    @Override
    public String toString() {
        return "Pedido: \n" + "Valor: " + valor + "\n"  + endereco.visualizarEndereco() + "\n" + "Código do pedido: " + cdg_comp + "\n" +"Forma de pagamento: "
                +"\n"+ pagamento + "\n" +" Produtos: " +"\n\n"+ produtos;
    }

    public String visualizarPedido() {
    	return "\n                             Pedido: \n\n" + "Valor: " + valor + "\n"  + endereco.visualizarEndereco() + "\n" + "Código do pedido: " + cdg_comp + "\n" +"Forma de pagamento: "
                +"\n"+ pagamento;
    }
    
    public boolean fecharPedido(){
        if(this.endereco != null && this.cdg_comp != 0 && this.pagamento != null && this.produtos != null){
            if (this.finalizado != true){
                this.finalizado = true;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean removerPedido(){
        this.valor = 0;
        this.endereco = null;
        this.cdg_comp = 0;
        this.pagamento = null;
        this.produtos = null;
        return true;
    }
}
