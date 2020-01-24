package application;

import controller.ClienteController;
import controller.UsuarioController;
import controller.VeiculoSeguradoController;
import model.entities.Cliente;
import model.entities.Modelo;
import model.entities.Usuario;
import model.entities.VeiculoSegurado;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Date data = new Date();
        SimpleDateFormat date = new SimpleDateFormat();

        while (true) {
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
            menu(sc.nextInt());
        }
//        Cliente cliente = new Cliente("Joao", date.getCalendar().getTime(), "RUA A", "55123456789");
//        clienteController.cadastrar(cliente);
//        clienteController.listar();
//        clienteController.pesquisar("55123456789");
//
//        Usuario usr = new Usuario("Cândido", date.getCalendar().getTime(), "1908", "1234");
//        usuarioController.cadastrar(usr);
//        usuarioController.listar();
//        usuarioController.pesquisar("1908");
//        usuarioController.remover(usr);
//        System.out.println();
//        usuarioController.listar();
//
//        VeiculoSegurado veiculo = new VeiculoSegurado(100.00, "ABCDFG", cliente, new Modelo());
//        VeiculoSegurado veiculo2 = new VeiculoSegurado(100.00, "ABCDFG", cliente, new Modelo());
//        veiculoSeguradoController.cadastrar(veiculo);
//        veiculoSeguradoController.cadastrar(veiculo2);
//        veiculoSeguradoController.listar();
//        System.out.println();
//        veiculoSeguradoController.remover(veiculo);
//        veiculoSeguradoController.listar();
//        veiculoSeguradoController.pesquisar("ABCDFG");

    }

    public static void menu(int op) {

        Scanner sc = new Scanner(System.in);

        ClienteController clienteController = new ClienteController();
        UsuarioController usuarioController = new UsuarioController();
        VeiculoSeguradoController veiculoSeguradoController = new VeiculoSeguradoController();

        sc.nextLine();
        switch (op) {
            case 1:
                System.out.println("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite a data de Nascimento: ");
                String data = sc.nextLine();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 0:
                System.out.println("Tchauzinho...");
                System.exit(0);
            default:
                System.out.println("Operação Errada, Digite novamente");
        }
        sc.close();
    }
}
