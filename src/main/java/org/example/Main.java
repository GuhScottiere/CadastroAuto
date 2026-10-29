package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        int opcao = 0;

        while(opcao != 3){
            System.out.println("Bem vindos Vamos cadastrar Carro");
            System.out.println("1 Cadastrar Carro");
            System.out.println("2 mostrar Carros Cadastrados");
            System.out.println("3 Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    Carro carroCadastrados = new Carro();
                    System.out.println("informe o nome do carro");
                    String nome = sc.next();
                    carroCadastrados.setModelo(nome);

                    System.out.println("Informe a cor do carro");
                    String cor = sc.next();
                    carroCadastrados.setCor(cor);

                    System.out.println("Informe o ano do carro");
                    int ano = sc.nextInt();
                    carroCadastrados.setAnoFabricacao(ano);

                    System.out.println();
                    System.out.println("Informe a montadora do carro");
                    String montadora = sc.next();
                    carroCadastrados.setMontadora(Montadora.valueOf(montadora));

                    System.out.println("Informe a motor do carro");
                    String motor = sc.next();
                    carroCadastrados.setMotor(Motor.valueOf(motor));
                    carros.add(carroCadastrados);
                    break;

                    case 2:
                        if (carros.isEmpty()) {
                            System.out.println("Nenhum carro foi encontrado");
                        }else {
                            System.out.println(carros.toString());

                        }
                        break;
                        case 3:
                            System.out.println("Saindo da aplicação");
                            break;
                            default:
                                System.out.println("Nenhuma opção valida");



            }
        }

            sc.close();
    }
}