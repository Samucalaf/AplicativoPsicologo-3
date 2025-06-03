package dados;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Criando conta
        Paciente paciente = new Paciente("Samuel", "SamuelLaf@email.com", "12345");
        //fazendo login
        paciente.login("SamuelLaf@email.com", "12345");
        //ok.


    }
}
