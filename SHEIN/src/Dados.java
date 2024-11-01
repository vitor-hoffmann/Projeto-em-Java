import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dados {


    private ArrayList<String> primeiro_nome = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","Diana","Eva","Frank","Grace","Henry","Isabella","Jack","Kate","Liam","Mia","Noah","Olivia"));
    private ArrayList<String> segundo_nome = new ArrayList<>(Arrays.asList("Johnson","Smith","Williams","Brown","Davis","Miller","Wilson","Martinez","Thompson","Garcia","Rodriguez","Lopez","Lee","Perez","Scott"));
    private ArrayList<String> ddd = new ArrayList<>(Arrays.asList("11", "12", "13", "14", "15", "16", "17", "18", "19", "21", "22", "24", "27", "28","31", "32", "33", "34", "35", "37", "38", "41", "42", "43", "44", "45", "46", "47", "48","49", "51", "53", "54", "55", "61", "62", "63", "64", "65", "66", "67", "68", "69", "71","73", "74", "75", "77", "79", "81", "82", "83", "84", "85", "86", "87", "88", "89", "91","92", "93", "94", "95", "96", "97", "98", "99"));


    private ArrayList<String> nomes = new ArrayList<String>();
    private int qntd_nomes = 0;
    private ArrayList<String> CPFS = new ArrayList<String>();
    private int qntd_CPFS = 0;
    private ArrayList<String> emails = new ArrayList<String>();
    private int qntd_emails = 0;
    private ArrayList<String> telefones = new ArrayList<String>();
    private int qntd_telefones = 0;
    private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
    private int qntd_cupons = 0;
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    private int qntd_ids = 0;
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private int qntd_enderecos = 0;
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private int qntd_pagamentos = 0;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int qntd_produtos = 0;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private int qntd_pedidos = 0;
    private ArrayList<Conta_Cliente> contas = new ArrayList<Conta_Cliente>();
    private int qntd_contas = 0;


    public void gerarDADOS(){

        // gerar cpfs
        String cpftemp = "";
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 11; j++){
                Random rand = new Random();
                int numeroAleatorio = rand.nextInt(10);
                String numcpf = String.valueOf(numeroAleatorio);
                cpftemp+= numcpf;
                if (j == 2 || j == 5){
                    cpftemp += ".";
                }
                if (j == 8){
                    cpftemp += "-";
                }
            }
            CPFS.add(cpftemp);
            cpftemp = "";
            qntd_CPFS++;
        }


        // gerar nomes e emails
        String nometemp = "";
        String emailstemp = "";
        for (int i = 0; i < 15; i++){
            nometemp = "";
            emailstemp = "";
            Random rand = new Random();
            int numeroAleatorio1 = rand.nextInt(15);
            int numeroAleatorio2 = rand.nextInt(15);
            emailstemp += primeiro_nome.get(numeroAleatorio1);
            emailstemp += segundo_nome.get(numeroAleatorio2);
            emailstemp += "@gmail.com";
            nometemp += primeiro_nome.get(numeroAleatorio1);
            nometemp+= " ";
            nometemp += segundo_nome.get(numeroAleatorio2);
            nomes.add(nometemp);
            emails.add(emailstemp);
            qntd_emails++;
            qntd_nomes++;
        }


        //gerar telefones
        String telefonestemp = "";
        Random rand = new Random();
        for (int i = 0; i < 15; i++){
            telefonestemp = "";
            int numeroAleatorio3 = rand.nextInt(67);
            telefonestemp += "(";
            telefonestemp += ddd.get(numeroAleatorio3);
            telefonestemp += ")9";
            for (int j = 0; j < 8; j++){
                if (j == 4){
                    telefonestemp += "-";
                }
                int numeroAleatorio4 = rand.nextInt(10);
                telefonestemp += numeroAleatorio4;
            }
            telefones.add(telefonestemp);
            qntd_telefones++;
        }


        int idstemp = 0;
        
            //gerar cupons
            int d = 0;
            while (cupons.size() < 15){
                Cupom cupom = new Cupom("Cupom "+(d+1), (d+1)*2, "Descricao "+(d+1), d, d*3);
                cupons.add(cupom);
                d++;
                qntd_cupons++;
            }


            //gerar ids
            while (ids.size() < 15){
                Random random = new Random();
                idstemp = random.nextInt(1000);
                ids.add(idstemp);
                qntd_ids++;
            }


            //gerar enderecos
            /*int j = 0;
            while (enderecos.size() < 15){
                Endereco endereco = new Endereco("Cep "+(j+1), "Pais "+(j+1), "Cidade "+(j+1)
                    , "Bairro "+(j+1), "Complemento "+(j+1), j+1, "Estado "+(j+1), "Quadra "+(j+1));
                enderecos.add(endereco);
                j++;
                qntd_enderecos++;
            }*/


            //gerar pagamentos
            int ç = 0;
            while (pagamentos.size() < 15){
                Random random = new Random();
                Pagamento pagamento = new Pagamento();
                Random random1 = new Random();
                String numtemp = "";
                for (int m = 0; m < 16; m++){
                    numtemp += String.valueOf(random1.nextInt(10));                
                }
                pagamento.adicionarPagamento(numtemp, nomes.get(random.nextInt(15)), ""+(ç+1), ""+(ç+1), (ç+1));
                pagamentos.add(pagamento);
                ç++;
                qntd_pagamentos++;
            }
            

            //gerar produtos
            int z = 0;
            while (produtos.size() < 15){
                Random random = new Random();
                Bolsa bolsa = new Bolsa("Bolsa"+(z+1), "Bolsa", (z+1)*random.nextInt(20), String.valueOf((z+1)),String.valueOf((z+1)), String.valueOf((z+1))
                    ,String.valueOf((z+1)), z+1, false, String.valueOf((z+1)), String.valueOf((z+1)), (z+1)*random.nextInt(20));
                Acessorio acessorio = new Acessorio("Acessorio"+(z+1), "Acessorio", (z+1)*random.nextInt(20), String.valueOf((z+1)),String.valueOf((z+1)), String.valueOf((z+1))
                    ,String.valueOf((z+1)), z+1, false, String.valueOf((z+1)), ""+(z+1), (z+1)*random.nextInt(20));
                Roupa roupa = new Roupa("Roupa"+(z+1),"Roupa", (z+1)*random.nextInt(20), String.valueOf((z+1)),String.valueOf((z+1)), String.valueOf((z+1))
                    ,String.valueOf((z+1)), z+1, false, ""+(z+1), ""+(z+1), (z+1)*random.nextInt(20));
                produtos.add(bolsa);
                produtos.add(acessorio);
                produtos.add(roupa);
                z++;
                qntd_produtos += 3;
            }


            //gerar pedidos
            int l = 0;
            while (pedidos.size() < 15){
                int valor = 0;
                for (int k = 0; k < produtos.size(); k++){
                    valor += produtos.get(k).getPreco_produto();
                }
                valor *= rand.nextInt(2);
                Pedido pedido = new Pedido(valor, null, (l+1)*2
                , pagamentos.get(rand.nextInt(15)), produtos, true);
                pedidos.add(pedido);
                l++;
                qntd_pedidos++;
            }
            

            //gerar contas
            int v = 0;
            while (contas.size() < 15){
                Conta_Cliente conta = new Conta_Cliente(nomes.get(rand.nextInt(15)), CPFS.get(rand.nextInt(15)), emails.get(rand.nextInt(15))
                , telefones.get(rand.nextInt(15)), v+1, cupons, enderecos, pagamentos, pedidos);
                contas.add(conta);
                v++;
                qntd_contas++;
            }
    }
	
	//buscar prosutos por categoria
	public String buscarCategoria(String categoria) {
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getCategoria().equals(categoria)){
                return produtos.get(i).toString();
            }
        }
        return "Não foi encontrado";
    }

	
	//buscar produtos por nome
	public String buscarNome(String nome) {
		for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getNome_produto().equals(nome)){
                return produtos.get(i).toString();
            }
        }
        return "Não foi encontrado";
    }


    public String buscarFavoritos() {
		for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).isFavoritado()){
                return produtos.get(i).toString();
            }
        }
        return "Não foi encontrado";
    }
    
    public void exibirProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.toString() + "------------------------------------------------------------------------------------");
        }
    }
    public void exibirProdutoCategoria(String categoria){
        for (Produto produto : produtos){
            if (produto.getCategoria().equals(categoria)){
                System.out.println(produto.toString() + "------------------------------------------------------------------------------------");
            }
        }
    }
    public void exibirProdutoNome(String nome){
        for (Produto produto : produtos){
            if (produto.getNome_produto().equals(nome)){
                System.out.println(produto.toString() + "------------------------------------------------------------------------------------");
            }
        }
    }

    //getters
    public ArrayList<String> getNomes() {
        return nomes;
    }


    public ArrayList<String> getCPFS() {
        return CPFS;
    }


    public ArrayList<String> getEmails() {
        return emails;
    }


    public ArrayList<String> getTelefones() {
        return telefones;
    }


    public ArrayList<Cupom> getCupons() {
        return cupons;
    }


    public ArrayList<Integer> getIds() {
        return ids;
    }


    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }


    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }


    public ArrayList<Produto> getProdutos() {
        return produtos;
    }


    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }


    public ArrayList<Conta_Cliente> getContas() {
        return contas;
    }

    public ArrayList<String> getPrimeiro_nome() {
        return primeiro_nome;
    }

    public ArrayList<String> getSegundo_nome() {
        return segundo_nome;
    }

    public ArrayList<String> getDdd() {
        return ddd;
    }

    public int getQntd_nomes() {
        return qntd_nomes;
    }

    public int getQntd_CPFS() {
        return qntd_CPFS;
    }

    public int getQntd_emails() {
        return qntd_emails;
    }

    public int getQntd_telefones() {
        return qntd_telefones;
    }

    public int getQntd_cupons() {
        return qntd_cupons;
    }

    public int getQntd_ids() {
        return qntd_ids;
    }

    public int getQntd_enderecos() {
        return qntd_enderecos;
    }

    public int getQntd_pagamentos() {
        return qntd_pagamentos;
    }

    public int getQntd_produtos() {
        return qntd_produtos;
    }

    public int getQntd_pedidos() {
        return qntd_pedidos;
    }

    public int getQntd_contas() {
        return qntd_contas;
    }
}