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
        int idadePaciente = scanner.nextInt();

        Paciente paciente = new Paciente(nomePaciente, emailPaciente, senhaPaciente, problemaPaciente, idadePaciente);

        // Lista de psicólogos da clinica
        Psicologo[] psicologos = {
            new Psicologo("Dra. Ana Silva", "ana@clinica.com", "senha123", "12345-CRP", "Terapia Cognitivo-Comportamental"),
            new Psicologo("Dr. João Souza", "joao@clinica.com", "senha456", "67890-CRP", "Psicanálise"),
            new Psicologo("Dra. Maria Oliveira", "maria@clinica.com", "senha789", "54321-CRP", "Terapia Humanista")
        };
        System.out.println("\n------------------Psicólogos Disponíveis------------------------\n");


        for (int i = 0; i < psicologos.length; i++) {
            System.out.println((i+1) + ". " + psicologos[i].getNome() + " | Especialidade: " + psicologos[i].getEspecialidade());
        }
        System.out.println("\nEscolha um psicólogo pelo número:");

        int escolha = scanner.nextInt();
        Psicologo psicologoEscolhido = psicologos[escolha - 1];
        System.out.println("Você escolheu: " + psicologoEscolhido.getNome() + " | Especialidade: " + psicologoEscolhido.getEspecialidade());
        scanner.nextLine();


        System.out.println("\n------------------Plano de tratamento------------------------\n");




        System.out.print("\nQual será seu plano de tratamento? ");
        String tratamento = scanner.nextLine();

        System.out.print("Quantas sessões? ");
        int sessoes = Integer.parseInt(scanner.nextLine());

        PlanoDeTratamento plano = new PlanoDeTratamento(tratamento, sessoes, psicologoEscolhido);
        paciente.adicionaPLano(plano);
        System.out.println("O plano de tratamento será acompanhado por: " + plano.getPsicologo().getNome());



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

        System.out.println("\n----------------------------------------------------------\n");

        System.out.println("\n Sessão realizada com sucesso!");

        System.out.println("\nProgresso do plano: " + Math.round(plano.verificarProgresso()) + "%");

        //Processo de fedback e pagamento
        System.out.print("Quantas estrelas você dá para esta sessão? ");

        int estrelas = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < estrelas; i++) {
            sessao.getRelatorio().adicionarEstrela();
        }

        System.out.println("Avaliação registrada com " + sessao.getRelatorio().getEstrela() + " estrelas.");

        //Pagamento
        System.out.print("Digite o valor da sessão: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o método de pagamento: ");
        String metodo = scanner.nextLine();

        System.out.println("\n-----------------Pagamento-------------------------\n");

        sessao.getPagamento().setPagamento(valor, metodo);
        sessao.getPagamento().pagar();

        System.out.println("\n---------------------------------------------------\n");

        //Sessão finalizada
        System.out.println("\nSistema finalizado. Obrigado, volte sempre!");

        scanner.close();



    }
}
