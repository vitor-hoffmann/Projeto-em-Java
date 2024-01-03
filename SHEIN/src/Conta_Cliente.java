import java.util.*;

public class Conta_Cliente extends Medida{

    private String nome_conta;
    private String cpf;
    private String email;
    private String telefone;
    private int id_Conta;
    private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private Pedido pedidoatual;
    
    
    public Pedido getPedidoatual() {
        return pedidoatual;
    }
    public void setPedidoatual(Pedido pedidoatual) {
        this.pedidoatual = pedidoatual;
    }
    public int getId_Conta() {
		return id_Conta;
	}
	public void setId_Conta(int id_Conta) {
		this.id_Conta = id_Conta;
	}
	public String getNome_conta() {
        return nome_conta;
    }
    
	public Conta_Cliente(String nome_conta, String cpf, String email, String telefone, int id_Conta,
            ArrayList<Cupom> cupom, ArrayList<Endereco> enderecos, ArrayList<Pagamento> pagamentos, ArrayList<Pedido> pedidos) {
        this.nome_conta = nome_conta;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.id_Conta = id_Conta;
        this.cupons = cupom;
        this.enderecos = enderecos;
        this.pagamentos = pagamentos;
        this.pedidos = pedidos;
    }
    
    public boolean excluirConta(){
        try{
            this.nome_conta = null;
            this.cpf = null;
            this.email = null;
            this.telefone = null;
            this.id_Conta = 0;
            this.cupons = null;
            this.enderecos = null;
            this.pagamentos = null;
            this.pedidos = null;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public String infoConta() {
    	return "Nome: " + nome_conta +"\n"+ "CPF: " + cpf+"\n" + "e-mail: " + email +"\n"+ "Telefone: "
                + telefone +"\n"+ "ID: " + id_Conta;
    }
    
    
    @Override
    public String toString() {
        return "Nome: " + nome_conta +"\n"+ "CPF: " + cpf+"\n" + "e-mail: " + email +"\n"+ "Telefone: "
                + telefone +"\n"+ "ID: " + id_Conta +"\n"+ "Cupom: " + cupons+"\n" + "Enderecos: "
                + enderecos +"\n"+ "Pagamentos: " + pagamentos +"\n"+ "Pedidos: " + pedidos+"\n";
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public ArrayList<Cupom> getCupons() {
        return cupons;
    }
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}