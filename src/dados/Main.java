package dados;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("\n------------------Bem vindo à clínica de saúde RS------------------------\n");

        System.out.print("Digite seu nome: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String emailPaciente = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaPaciente = scanner.nextLine();

        System.out.print("Qual o motivo da consulta: ");
        String problemaPaciente = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadePaciente = Integer.parseInt(scanner.nextLine());

        Paciente paciente = new Paciente(nomePaciente, emailPaciente, senhaPaciente, problemaPaciente, idadePaciente);

        System.out.println("\n-----------------Cadastro do Psicólogo-------------------------\n");

        System.out.print("Digite o nome do psicólogo: ");
        String nomePsicologo = scanner.nextLine();

        System.out.print("Digite o email: ");
        String emailPsicologo = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaPsicologo = scanner.nextLine();

        System.out.print("Digite o CRP do psicólogo: ");
        String crp = scanner.nextLine();

        System.out.print("Digite a especialidade: ");
        String especialidade = scanner.nextLine();

        Psicologo psicologo = new Psicologo(nomePsicologo, emailPsicologo, senhaPsicologo, crp, especialidade);

        System.out.println("\n------------------Plano de tratamento------------------------\n");

        System.out.print("Qual será seu plano de tratamento? ");
        String tratamento = scanner.nextLine();

        System.out.print("Quantas sessões? ");
        int sessoes = Integer.parseInt(scanner.nextLine());

        PlanoDeTratamento plano = new PlanoDeTratamento(tratamento, sessoes);
        paciente.adicionaPLano(plano);

        System.out.println("\n-----------------Criar uma sessão-------------------------\n");

        System.out.print("Digite a data e hora da sessão (YYYY-MM-DD HH:MM): ");
        String dataHoraStr = scanner.nextLine();
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraStr, formatador);

        System.out.print("Alguma observação para a sessão? ");
        String observacoes = scanner.nextLine();

        Sessao sessao = new Sessao(dataHora, observacoes);

        plano.adicionarSessaoRealizada(sessao);

        Agenda agenda = new Agenda();
        agenda.adicionar(sessao);

        System.out.println("\nProgresso do plano: " + plano.verificarProgresso() + "%");

        System.out.print("Quantas estrelas você dá para esta sessão? ");
        int estrelas = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < estrelas; i++) {
            sessao.getRelatorio().adicionarEstrela();
        }

        System.out.println("Avaliação registrada com " + sessao.getRelatorio().getEstrela() + " estrelas.");

        System.out.print("Digite o valor da sessão: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o método de pagamento: ");
        String metodo = scanner.nextLine();

        sessao.getPagamento().setPagamento(valor, metodo);
        sessao.getPagamento().pagar();

        System.out.println("\nSistema finalizado. Obrigado, volte sempre!");

        scanner.close();




    }
}
