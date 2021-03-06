package application;

import controller.ClienteController;
import controller.UsuarioController;
import controller.VeiculoSeguradoController;
import model.entities.Cliente;
import model.entities.Modelo;
import model.entities.Usuario;
import model.entities.VeiculoSegurado;
import model.exceptions.DateTime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClienteController clienteController = new ClienteController();
        UsuarioController usuarioController = new UsuarioController();
        VeiculoSeguradoController veiculoSeguradoController = new VeiculoSeguradoController();

        int opcao = 0;

        while (true) {
            System.out.println("\n==========================================");
            System.out.println("Digite a Operação que você deseja realizar");
            System.out.println(
                    "1 – Cadastrar Cliente\n" +
                            "2 – Cadastrar Veículo Segurado\n" +
                            "3 – Cadastrar Usuário\n" +
                            "4 – Listar todos os Clientes\n" +
                            "5 – Listar todos os Veículos Segurados\n" +
                            "6 – Listar todos os Usuários\n" +
                            "7 – Excluir Cliente\n" +
                            "8 – Excluir um Veículo Segurado\n" +
                            "9 – Excluir um Usuário\n" +
                            "10 – Pesquisar um Cliente\n" +
                            "11 – Pesquisar um Veículo Segurado\n" +
                            "12 – Pesquisar um Usuário\n" +
                            "0 – Sair"

            );
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Digito inválido, tente novamente");
            }
            switch (opcao) {
                case 1:
                    LocalDate data;
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();

                    try {
                        System.out.println("Digite a data de Nascimento: ");
                        data = parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                        System.out.println("Digite o endereço: ");
                        String endereco = sc.nextLine();

                        System.out.println("Digite o seu telefone: ");
                        String telefone = sc.nextLine();


                        System.out.println("Você deseja cadastrar um veículo agora? (S / N)");
                        char op = sc.nextLine().toUpperCase().charAt(0);

                        if (op == 'S') {
                            System.out.println("Quantos? ");
                            int qtd = sc.nextInt();
                            List<VeiculoSegurado> veiculos = new ArrayList<>();
                            for (int i = 1; i <= qtd; i++) {
                                System.out.println("Dados do Veículo " + i);
                                System.out.println("Digite a kilometragem: ");
                                double kilometragem = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Placa :");
                                String placa = sc.nextLine();

                                System.out.println("Dados do modelo: ");
                                System.out.println("Descrição: ");
                                String descricao = sc.nextLine();
                                veiculos.add(new VeiculoSegurado(kilometragem, placa, new Cliente(nome, data, endereco, telefone), new Modelo(descricao)));
                                veiculoSeguradoController.cadastrar(new VeiculoSegurado(kilometragem, placa, new Cliente(nome, data, endereco, telefone), new Modelo(descricao)));
                            }
                            clienteController.cadastrar(new Cliente(nome, data, endereco, telefone, veiculos));
                        } else if (op == 'N') {
                            clienteController.cadastrar(new Cliente(nome, data, endereco, telefone));
                            System.out.println("Cliente cadastrado com sucesso !!!");
                        } else {
                            System.out.println("Digito inválido");
                        }
                    } catch (DateTimeException e) {
//                    } catch (DateTimeException | InputMismatchException e) {
                        throw new DateTime("Formato da data Inválido");
                    } catch (InputMismatchException e) {
                        System.out.println("Dado inválido");
                    }

                    break;
                case 2:
                    String search;
                    Cliente cliente = new Cliente();
                    try {

                        System.out.println("Digite a kilometragem: ");
                        double kilometragem = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Placa :");
                        String placa = sc.nextLine();

                        System.out.println("Dados do modelo: ");
                        System.out.println("Descrição: ");
                        String descricao = sc.nextLine();

                        System.out.println("Digite o nome do cliente");
                        search = sc.nextLine();
                        cliente = clienteController.pesquisarPorNome(search);
                        if (cliente != null) {
                            veiculoSeguradoController.cadastrar(new VeiculoSegurado(kilometragem, placa, cliente, new Modelo(descricao)));
                            System.out.println("Veículo Segurado cadastrado com sucesso");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Dado inválido");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.println("Digite a data de Nascimento: ");
                    try {
                        data = parse(sc.nextLine()
                                , DateTimeFormatter.ofPattern("dd/MM/yyyy"));


                        System.out.println("Digite o identificador: ");
                        String identificador = sc.nextLine();
                        System.out.println("Digite a senha: ");
                        String senha = sc.nextLine();

                        usuarioController.cadastrar(new Usuario(nome, data, identificador, senha));
                    } catch (DateTimeException e) {
                        System.out.println("Formato de data inválido");
                    }
                    break;
                case 4:
                    clienteController.listar();
                    break;
                case 5:
                    veiculoSeguradoController.listar();
                    break;
                case 6:
                    usuarioController.listar();
                    break;
                case 7:
                    Cliente c = new Cliente();
                    System.out.println("Digite o nome do Cliente que você deseja remover");
                    search = sc.nextLine();
                    c = clienteController.pesquisarPorNome(search);
                    if (c != null) {
                        clienteController.remover(c);

                        System.out.println("Cliente removido com sucesso");
                    } else {
                        System.out.println("Não foi possível remover o cliente");
                    }
                    break;
                case 8:
                    VeiculoSegurado veic = new VeiculoSegurado();
                    System.out.println("Digite a placa do veículo que você deseja remover: ");
                    search = sc.nextLine();

                    veic = veiculoSeguradoController.pesquisarPorPlaca(search);
                    if (veic != null) {
                        System.out.println(veic.getCliente().toString());
                        veiculoSeguradoController.remover(veic);
                        System.out.println("Veiculo removido com sucesso");

                    } else {
                        System.out.println("Não foi possível remover");
                    }
                    break;
                case 9:
                    Usuario user = new Usuario();
                    System.out.println("Digite o nome do usuário que você deseja remover: ");
                    search = sc.nextLine();

                    user = usuarioController.pesquisarPorNome(search);
                    if (user != null) {
                        usuarioController.remover(user);
                        System.out.println("Usuário Removido com sucesso !");
                    } else {
                        System.out.println("Não foi possível remover");
                    }
                    break;
                case 10:
                    System.out.println("Digite o telefone do Cliente: ");
                    search = sc.nextLine();
                    clienteController.pesquisar(search);
                    break;
                case 11:
                    System.out.println("Digite a placa do veículo segurado: ");
                    search = sc.nextLine();
                    veiculoSeguradoController.pesquisar(search);
                    break;
                case 12:
                    System.out.println("Digite o identificador do usuario: ");
                    search = sc.nextLine();
                    usuarioController.pesquisar(search);
                    break;
                case 0:
                    System.out.println("Tchauzinho...");
                    System.exit(0);
                default:
                    System.out.println("Operação Errada, Digite novamente");
            }
        }
    }
}
