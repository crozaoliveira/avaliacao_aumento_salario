package avaliacao3005;

import java.util.Scanner;

public class Avaliacao3005 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Variáveis
        String funcionario;
        String cargo = "";
        int salario = 0;
        int tempoServico = 0;
        int codigoCargo = 0;
        int porcentagemAumento = 0;
        int valorAumento = 0;
        int novoSalario = 0;
        int novoCalculo;

        //Loop leitura de dados
        while (true) {
            System.out.print("Nome Funcionário: ");
            funcionario = leia.next();

            System.out.print("Salário: ");
            salario = leia.nextInt();

            System.out.print("Código do cargo: ");
            codigoCargo = leia.nextInt();

            System.out.print("Tempo de Serviço em anos: ");
            tempoServico = leia.nextInt();

            //Condições do Gerente
            if (codigoCargo == 101) {
                cargo = "Gerente";
                if (tempoServico < 1) {
                    porcentagemAumento = 0;
                }
                if (tempoServico >= 1) {
                    porcentagemAumento = 10;
                }
                if (tempoServico >= 2) {
                    porcentagemAumento = 20;
                }
                if (tempoServico >= 3) {
                    porcentagemAumento = 25;
                }
            }

            //Condições do Engenheiro
            if (codigoCargo == 102) {
                cargo = "Engenheiro";
                if (tempoServico < 1) {
                    porcentagemAumento = 0;
                }
                if (tempoServico >= 1) {
                    porcentagemAumento = 15;
                }
                if (tempoServico >= 2) {
                    porcentagemAumento = 30;
                }
                if (tempoServico >= 3) {
                    porcentagemAumento = 35;
                }
            }

            //Condições do Técnico
            if (codigoCargo == 103) {
                cargo = "Técnico";
                if (tempoServico < 1) {
                    porcentagemAumento = 0;
                }
                if (tempoServico >= 1) {
                    porcentagemAumento = 5;
                }
                if (tempoServico >= 2) {
                    porcentagemAumento = 10;
                }
                if (tempoServico >= 3) {
                    porcentagemAumento = 15;
                }

                //Condições de funcionários sem cargo cadastrado.    
            } else if (codigoCargo != 101 && codigoCargo != 102
                    && codigoCargo != 103) {
                cargo = "Cargo não cadastrado.";
                if (tempoServico < 3) {
                    porcentagemAumento = 0;
                } else {
                    porcentagemAumento = 35;
                }
            }

            //Cálculo Aumento.
            valorAumento = (salario * porcentagemAumento) / 100;
            novoSalario = salario + valorAumento;

            //Impressão
            System.out.println();
            System.out.println("Nome do Funcionário: " + funcionario);
            System.out.println("Código do cargo: " + codigoCargo);
            System.out.println("Cargo: " + cargo);
            System.out.println("Tempo de serviço: " + tempoServico
                    + " ano(s).");
            System.out.println("Salário anterior: " + salario + "R$");
            System.out.println("Porcentagem de aumento:"
                    + " " + porcentagemAumento + "%");
            System.out.println("Novo salário: " + novoSalario + "R$");
            System.out.println("Diferença de aumento: " + valorAumento + "R$");
            System.out.println();

            //Realizar novo Cálculo?
            System.out.println("Deseja realizar novo cálculo? ");
            System.out.println("Digite '1' para Sim ou '2' para Não ");
            novoCalculo = leia.nextInt();
            if (novoCalculo == 1) {
                System.out.println();
            }
            if (novoCalculo == 2) {
                System.out.println("Obrigado pela Prefência.");
                break;
            }
        }
    }
}
