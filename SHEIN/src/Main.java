import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Dados dados = new Dados();
        dados.gerarDADOS();
        Scanner scanner = new Scanner(System.in);

        int opcao, opcaoConta;
        String categoria;
        String nome;
        System.out.println("\nBem vindo a Shein\n");
        do {

            System.out.println("---------------MENU---------------");
            System.out.println("1. Visualizar Conta");
            System.out.println("2. Ver Todos os Produtos");
            System.out.println("3. Ver produtos por categoria");
            System.out.println("4. Ver produtos por nome");
            System.out.println("5. Cadastrar Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma Opcao: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o ID da conta: (1 - " + dados.getContas().size() + ")");
                    opcaoConta = scanner.nextInt();
                    exibirContas(dados.getContas(), dados.getCupons(), dados.getEnderecos(), dados.getPagamentos(),
                            dados.getPedidos(), opcaoConta, scanner, dados);
                    break;
                case 2:
                    dados.exibirProdutos();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Digite a categoria desejada: (Bolsa, Acessorio, Roupa)");
                    categoria = scanner.next();
                    categoria = categoria.substring(0, 1).toUpperCase() + categoria.substring(1).toLowerCase();
                    dados.exibirProdutoCategoria(categoria);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Digite o nome desejado: (Bolsa 1, Acessorio 1, Roupa 1...)");
                    nome = scanner.next().toString();
                    dados.exibirProdutoNome(nome);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Qual o seu nome? ");
                    String name = scanner.nextLine();
                    System.out.println("Qual o seu cpf? ");
                    String cpf = scanner.next();
                    System.out.println("Qual o seu email? ");
                    String email = scanner.next();
                    System.out.println("Qual o seu telefone? ");
                    String telefone = scanner.next();

                    Conta_Cliente conta = new Conta_Cliente(name, cpf, email, telefone, dados.getContas().size() + 1,
                            dados.getCupons(), null, null, null);
                    dados.getContas().add(conta);
                    break;
                case 0:
                    System.out.println("Saindo. Volte Sempre !");
                    break;
                default:
                    System.out.println("Opcao Invalida !");
            }
        } while (opcao != 0);
    }

    public static void adicionarEndereco(ArrayList<Conta_Cliente> contas, int opcaoConta) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu cep? ");
        String cep = scanner.next();

        System.out.println("Qual o seu Pais? ");
        String pais = scanner.next();

        System.out.println("Qual a sua cidade? ");
        String cidade = scanner.next();

        System.out.println("Qual o seu bairro? ");
        String bairro = scanner.next();

        System.out.println("Complemento? ");
        String compl = scanner.next();

        System.out.println("Qual o numero? ");
        int num = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next(); // Limpar a entrada inválida
        }
        num = scanner.nextInt();

        System.out.println("Qual o estado? ");
        String estado = scanner.next();

        System.out.println("Qual a quadra? ");
        String quadra = scanner.next();

        Endereco ender = new Endereco(cep, pais, cidade, bairro, compl, num, estado, quadra);

        contas.get(opcaoConta - 1).getEnderecos().add(ender);
        // scanner.close();
    }

    public static void adicionarPagamento(ArrayList<Conta_Cliente> contas, int opcaoConta) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o numero do cartao? ");
        String num = scanner.next();
        scanner.nextLine();
        System.out.println("Qual o nome do titular ");
        String nome = scanner.nextLine();

        System.out.println("Qual a bandeira? ");
        String band = scanner.next();

        System.out.println("Qual o vencimento? ");
        String ven = scanner.next();

        System.out.println("Qual o cod de segurança");
        int cod = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            scanner.next(); // Limpar a entrada inválida
        }
        cod = scanner.nextInt();
        Pagamento pag = new Pagamento();
        if (!pag.adicionarPagamento(num, nome, band, ven, cod)) {
            System.out.println("Ocorreu um erro");
        } else {
            contas.get(opcaoConta - 1).getPagamentos().add(pag);
            System.out.println("\nPagamento cadastrado com sucesso!");
        }
        // scanner.close();
    }

    public static void exibirContas(ArrayList<Conta_Cliente> contas, ArrayList<Cupom> cupons,
            ArrayList<Endereco> enderecos, ArrayList<Pagamento> pagamentos, ArrayList<Pedido> pedidos, int opcaoConta,
            Scanner scanner, Dados dados) {

        for (Conta_Cliente conta : contas) {
            if (opcaoConta == conta.getId_Conta()) {
                System.out.println(conta.infoConta());
                contas.get(opcaoConta - 1).setEnderecos(new ArrayList<>());

                int opcao1 = 0;
                do {

                    System.out.print("\n");

                    System.out.println("1. Visualizar Cupons");
                    System.out.println("2. Visualizar Enderecos");
                    System.out.println("3. Visualizar Pagamentos");
                    System.out.println("4. Ver todos os Pedidos");
                    System.out.println("5. Visualizar Pedido Atual");
                    System.out.println("6. Cadastrar Endereco");
                    System.out.println("7. Cadastrar Medidas");
                    System.out.println("8. Editar Endereco");
                    System.out.println("9. Visualizar Produtos");
                    System.out.println("10. Deletar Endereco");
                    System.out.println("11. Cadastrar Pagamento");
                    System.out.println("12. Editar Pagamento");
                    System.out.println("13. Deletar Pagamento");
                    System.out.println("14. Visualizar Medidas");
                    System.out.println("15. Favoritar Produto");
                    System.out.println("16. Visualizar Produtos Favoritados");
                    System.out.println("17. Adicionar produto ao Pedido");
                    System.out.println("18. Editar Pedido");
                    System.out.println("19. Editar Medidas");
                    System.out.println("20. Remover Medidas");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma Opcao: ");

                    // Scanner scanner = new Scanner(System.in);
                    opcao1 = scanner.nextInt();
                    System.out.print("\n");

                    switch (opcao1) {
                        case 1:
                            for (Cupom cupom : contas.get(opcaoConta).getCupons()) {
                                System.out.println(cupom.toString()); // cupom.toString()
                            }
                            ;
                            System.out.print("------------------------------------------------------------------\n");
                            break;
                        case 2:
                            for (Endereco endereco : contas.get(opcaoConta - 1).getEnderecos()) {
                                System.out.println(endereco.visualizarEndereco() + "ID do endereco: "
                                        + (contas.get(opcaoConta - 1).getEnderecos().indexOf(endereco) + 1));
                            }
                            // public static void crudEndereco();

                            System.out.print("------------------------------------------------------------------\n");
                            break;
                        case 3:
                            for (Pagamento pagamento : contas.get(opcaoConta).getPagamentos()) {
                                System.out.println(pagamento.toString());
                            }
                            System.out.print("------------------------------------------------------------------\n");
                            break;
                        case 4:
                            int ultimoElemento = 1;
                            for (Pedido pedido : contas.get(opcaoConta).getPedidos()) {

                                System.out.println(pedido.visualizarPedido());
                                System.out.println("\n                             Produtos Comprados");
                                for (Produto produto : pedido.getProduto()) {
                                    System.out.println("\nProduto: " + produto.getNome_produto().trim() + "\n"
                                            + "ID do Produto: " + produto.getId_produto());
                                }

                                if (pedidos.size() == ultimoElemento) {
                                    continue;
                                } else {
                                    System.out.print(
                                            "\n------------------------------------------------------------------\n");
                                }
                                ultimoElemento++;

                            }
                            ;
                            System.out.print("\n------------------------------------------------------------------\n");
                            break;
                        case 5:
                            try{
                                dados.getContas().get(opcaoConta-1).getPedidoatual().visualizarPedido();
                            }
                            catch(Exception e){
                                System.out.println("Erro ao visualizar contas!");
                            }
                        case 6:
                            adicionarEndereco(contas, opcaoConta);
                            System.out.println("\nEndereco cadastrado com sucesso!");
                            break;
                        case 7:
                            adicionarMedidas(scanner, contas, opcaoConta);
                            contas.get(opcaoConta - 1).setBraco(13);
                            break;
                        case 8:
                            int ender = 0;
                            for (Endereco endereco : contas.get(opcaoConta - 1).getEnderecos()) {
                                System.out.println(endereco.visualizarEndereco() + "ID do endereco: "
                                        + (contas.get(opcaoConta - 1).getEnderecos().indexOf(endereco) + 1) + "\n");
                            }
                            ;
                            System.out.println("------------------------------------------------------------------\n");
                            System.out.println("Qual o ID do endereço que você deseja editar? ");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Por favor, insira um número válido.");
                                scanner.next(); // Limpar a entrada inválida
                            }
                            ender = scanner.nextInt();
                            System.out.println("Qual o seu cep? ");
                            String cep = scanner.next();
                            System.out.println("Qual o seu Pais? ");
                            String pais = scanner.next();
                            System.out.println("Qual a sua cidade? ");
                            String cidade = scanner.next();
                            System.out.println("Qual o seu bairro? ");
                            String bairro = scanner.next();
                            System.out.println("Complemento? ");
                            String compl = scanner.next();
                            System.out.println("Qual o numero? ");
                            int num = 0;
                            while (!scanner.hasNextInt()) {
                                System.out.println("Por favor, insira um número válido.");
                                scanner.next(); // Limpar a entrada inválida
                            }
                            num = scanner.nextInt();
                            System.out.println("Qual o estado? ");
                            String estado = scanner.next();
                            System.out.println("Qual a quadra? ");
                            String quadra = scanner.next();
                            dados.getContas().get(opcaoConta - 1).getEnderecos().get(ender - 1).adicionarEndereco(cep,
                                    pais, cidade, bairro, compl, num, estado, quadra);
                            System.out.println("\nEndereco editado com sucesso!");
                            break;
                        case 9:
                            dados.exibirProdutos();
                            break;
                        case 10:
                            int enderid = 0;
                            for (Endereco endereco : contas.get(opcaoConta - 1).getEnderecos()) {
                                System.out.println(endereco.visualizarEndereco() + "ID do endereco: "
                                        + (contas.get(opcaoConta - 1).getEnderecos().indexOf(endereco) + 1) + "\n");
                            }
                            ;
                            System.out.println("------------------------------------------------------------------\n");
                            System.out.println("Qual o ID do endereço que você deseja excluir? ");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Por favor, insira um número válido.");
                                scanner.next(); // Limpar a entrada inválida
                            }
                            enderid = scanner.nextInt();
                            dados.getContas().get(opcaoConta - 1).getEnderecos().remove(enderid - 1);
                            break;
                        case 11:
                            adicionarPagamento(contas, opcaoConta);
                            break;
                        case 12:
                            int pag = 0;
                            for (Pagamento pagamento : contas.get(opcaoConta - 1).getPagamentos()) {
                                System.out.println(pagamento.toString() + "\nID do pagamento: "
                                        + (contas.get(opcaoConta - 1).getPagamentos().indexOf(pagamento) + 1) + "\n");
                            }
                            ;
                            System.out.println("------------------------------------------------------------------\n");
                            System.out.println("Qual o ID do pagamento que você deseja editar? ");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Por favor, insira um número válido.");
                                scanner.next(); // Limpar a entrada inválida
                            }
                            pag = scanner.nextInt();
                            System.out.println("Qual o numero do cartao? ");
                            String num1 = scanner.next();
                            scanner.nextLine();
                            System.out.println("Qual o nome do titular ");
                            String nome = scanner.nextLine();

                            System.out.println("Qual a bandeira? ");
                            String band = scanner.next();

                            System.out.println("Qual o vencimento? ");
                            String ven = scanner.next();

                            System.out.println("Qual o cod de segurança");
                            int cod = 0;
                            while (!scanner.hasNextInt()) {
                                System.out.println("Por favor, insira um número válido.");
                                scanner.next(); // Limpar a entrada inválida
                            }
                            cod = scanner.nextInt();
                            dados.getContas().get(opcaoConta - 1).getPagamentos().get(pag - 1).adicionarPagamento(num1, nome, band, ven, cod);
                            System.out.println("\nPagamento editado com sucesso!");
                            break;
                        case 13:
                            int pag1 = 0;
                            for (Pagamento pagamento : contas.get(opcaoConta - 1).getPagamentos()) {
                                System.out.println(pagamento.toString() + "\nID do pagamento: "
                                        + (contas.get(opcaoConta - 1).getPagamentos().indexOf(pagamento) + 1) + "\n");
                            }
                            ;
                            System.out.println("------------------------------------------------------------------\n");
                            System.out.println("Qual o ID do pagamento que você deseja editar? ");
                            while (!scanner.hasNextInt()) {
                                System.out.println("Por favor, insira um número válido.");
                                scanner.next(); // Limpar a entrada inválida
                            }
                            pag1 = scanner.nextInt();
                            try{
                                contas.get(opcaoConta-1).getPagamentos().remove(pag1-1);
                                System.out.println("\nPagamento deletado com sucesso!");
                            }
                            catch (Exception e){
                                System.out.println("Erro");
                            }
                            

                            break;
                        
                        case 14:
                            visualizarMedidas(contas, opcaoConta);
                            break;

                        case 15:
                            System.out.println("\nQual o nome do produto voce deseja favoritar? ");
                            String nome1 = "";
                            nome1 = scanner.next();
                            for (Produto produto : dados.getProdutos()){
                                if (produto.getNome_produto().equals(nome1)){
                                    if (produto.isFavoritado()){
                                        continue;
                                    }else {
                                        produto.setFavoritado(true);
                                    }
                                }
                            }
                            break;
                        case 16:
                            for (Produto produto : dados.getProdutos()){
                                if (produto.isFavoritado()){
                                    System.out.println(produto);
                                }
                            }   
                            break;
                        case 17:
                            System.out.println("Qual produto voce deseja adicionar no pedido? ");
                            String ped = "";
                            ped = scanner.next();
                            try{
                                for (int i = 0; i < dados.getProdutos().size(); i++){
                                    if (dados.getProdutos().get(i).getNome_produto().equals(ped)){
                                        dados.getContas().get(i).getPedidoatual().adicionarProduto(dados.getProdutos().get(i));
                                    }
                                }
                            }
                            catch(Exception e){
                                System.out.println("Erro ao adicionar o produto!");
                            }
                            break;
                        case 18:
                            dados.getContas().get(opcaoConta-1).getPedidoatual().visualizarPedido();
                            System.out.println("Qual produto voce deseja retirar do pedido? ");
                            String nex = "";
                            nex = scanner.next();
                            try{
                                for (int i = 0; i < dados.getContas().get(opcaoConta-1).getPedidoatual().getQntdprod(); i++){
                                    if (dados.getContas().get(opcaoConta-1).getPedidoatual().getProduto().get(i).getNome_produto().equals(nex)){
                                        dados.getContas().get(opcaoConta-1).getPedidoatual().getProduto().remove(i);
                                    }
                                }
                            }
                            catch(Exception e){
                                System.out.println("Erro ao remover produto!");
                            }
                            break;
                        case 19:
                            editarMedidas(contas, opcaoConta, scanner);
                            break;
                        case 20:
                            deletarMedidas(contas, opcaoConta, scanner);

                        case 0:
                            break;

                        default:
                            System.out.println("Opcao Invalida!");
                    }
                } while (opcao1 != 0);

                // System.out.println("----------------------------------------------------------------------------------------------");
                // System.out.println("Quantidade de Contas: "+contas.size());
            }
        }

    }

    public static void exibirPedidos(ArrayList<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.toString());
            System.out.println(
                    "----------------------------------------------------------------------------------------------");
        }
    }

    public static void adicionarMedidas(Scanner scanner, ArrayList<Conta_Cliente> contas, int opcaoConta) {

        Conta_Cliente contaAtual = contas.get(opcaoConta - 1);

        System.out.println("Insira a medida do seu busto em cm");
        double busto = scanner.nextDouble();
        contaAtual.setBusto(busto);

        System.out.println("Insira a medida da sua cintura em cm");
        double cintura = scanner.nextDouble();
        contaAtual.setCintura(cintura);

        System.out.println("Insira a medida do seu quadril em cm");
        double quadril = scanner.nextDouble();
        contaAtual.setQuadril(quadril);

        System.out.println("Insira o comprimento do seu braco em cm");
        double braco = scanner.nextDouble();
        contaAtual.setBraco(braco);

        System.out.println("Insira o comprimento da sua perna");
        double comprimento_perna = scanner.nextDouble();
        contaAtual.setComprimento_perna(comprimento_perna);

        
    }

    public static void visualizarMedidas(ArrayList<Conta_Cliente> contas, int opcaoConta) {
        Conta_Cliente contaAtual = contas.get(opcaoConta - 1);

        System.out.println(contaAtual.visualizarMedidas());

        System.out.println("\nSua medida aproximada é " + contaAtual.retornar_tamanho());
    };

    public static void editarMedidas(ArrayList<Conta_Cliente> contas, int opcaoConta, Scanner scanner) {
        Conta_Cliente contaAtual = contas.get(opcaoConta - 1);

        System.out.println(contaAtual.visualizarMedidas());

        System.out.println("Insira a nova medida do seu busto em cm");
        double busto = scanner.nextDouble();
        contaAtual.setBusto(busto);

        System.out.println("Insira a nova medida da sua cintura em cm");
        double cintura = scanner.nextDouble();
        contaAtual.setCintura(cintura);

        System.out.println("Insira a nova medida do seu quadril em cm");
        double quadril = scanner.nextDouble();
        contaAtual.setQuadril(quadril);

        System.out.println("Insira o novo comprimento do seu braço em cm");
        double braco = scanner.nextDouble();
        contaAtual.setBraco(braco);

        System.out.println("Insira o novo comprimento da sua perna");
        double comprimento_perna = scanner.nextDouble();
        contaAtual.setComprimento_perna(comprimento_perna);

        System.out.println("\nSua nova medida aproximada é " + contaAtual.retornar_tamanho());
    };

    public static void deletarMedidas(ArrayList<Conta_Cliente> contas, int opcaoConta, Scanner scanner) {
        Conta_Cliente contaAtual = contas.get(opcaoConta - 1);

        contaAtual.setBusto(0);
        contaAtual.setCintura(0);
        contaAtual.setQuadril(0);
        contaAtual.setBraco(0);
        contaAtual.setComprimento_perna(0);

        System.out.println("\nSuas medidas foram removidas.");
    };
}