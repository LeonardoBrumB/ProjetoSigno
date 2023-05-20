package projetosigno;

import java.util.Calendar;
import java.util.Scanner;

public class ProjetoSigno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int n = 1, sexo, dia, mes, ano, idade, erro = 0, sorte, cor;
        String nome;

        while (n != 0) {
            System.out.println("Digite seu nome completo:                 Digite 0 para terminar.");
            nome = ler.nextLine();

            if (8 >= nome.length()) {
                System.out.println("Legal se o seu nome fosse verdadeiro");
            }
            System.out.println("Sexo: " + "\nDigite 1 - Feminino" 
                    + "\nDigite 2 - Masculino " 
                    + "\nDigite 0 para terminar.");
            sexo = ler.nextInt();

            if (sexo == 0) {
                return;
            } else if (sexo != 1) {
                sexo = 2;
            }
            System.out.println("Dia de nascimento:               Digite 0 para terminar.");
            dia = ler.nextInt();
            if (dia == 0) {
                return;
            } else if (dia < 1 || dia > 31) {
                System.out.println("Dia inválido!");
                erro++;
            }
            System.out.println("Mês de nascimento:              Digite 0 para terminar.");
            mes = ler.nextInt();
            if (mes == 0) {
                return;
            } else if (mes < 1 || mes > 12) {
                System.out.println("Mês inválido!");
                erro++;
            }
            System.out.println("Ano de nascimento:              Digite 0 para terminar.");
            ano = ler.nextInt();
            if (ano == 0) {
                return;
            } else if (ano <= 1900 || ano > 2023) {
                System.out.println("Ano inválido!");
                erro++;
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia == 31) {
                    System.out.println("Data de nascimento inválida!");
                    erro++;
                }
            }
            if (!(ano % 4 == 0)) {
                if (mes == 2) {
                    if (dia == 29) {
                        System.out.println("Data de nascimento inválida!");
                        erro++;
                    }
                }
            }
            idade = ((c.get(Calendar.YEAR) * 365 + (c.get(Calendar.MONTH) + 1) * 12 + c.get(Calendar.DAY_OF_MONTH)) - (ano * 365 + mes * 12 + dia)) / 365;

            sorte = (int) 1 + (int) (Math.random() * 100);

            cor = (int) 1 + (int) (Math.random() * 10);
            System.out.println("\n"+"\n");
            if (erro > 0) {
                if (sexo == 1) {
                    System.out.println("Sra." + nome + ", nascida no dia " + dia + "/" + mes + "/" + ano);
                    System.out.println("Você tem " + idade + " anos - seu nº da sorte é " + sorte);
                    cor(cor);

                } else {
                    System.out.println("Sr." + nome + ", nascido no dia " + dia + "/" + mes + "/" + ano);
                    System.out.println("você tem " + idade + " anos - seu nº da sorte é " + sorte);
                    cor(cor);
                }
            }
            if (sexo == 1) {
                System.out.println("Sra." + nome + ", nascida no dia " + dia + "/" + mes + "/" + ano);
                signo(dia, mes);
                System.out.println("Você tem " + idade + " anos - seu nº da sorte é " + sorte);
                cor(cor);

            } else {
                System.out.println("Sr." + nome + ", nascido no dia " + dia + "/" + mes + "/" + ano);
                signo(dia, mes);
                System.out.println("Você tem " + idade + " anos - seu nº da sorte é " + sorte);
                cor(cor);
            }
            System.out.println("\n");
            System.out.println("Digite 0 para terminar: \nDigite qualquer valor para fazer novamente: ");
            n = ler.nextInt();
            if (n == 0) {
                return;
            } else {

            }

        }
    }

    public static void signo(int dia, int mes) {
        if (mes == 1 && dia > 20 && mes == 2 && dia < 19) {
            System.out.println("Seu signo é aquario");
        } else if (mes == 2 && dia > 18 || mes == 3 && dia < 20) {
            System.out.println("Seu signo é peixes");
        } else if (mes == 3 && dia > 19 || mes == 4 && dia < 21) {
            System.out.println("Seu signo é aries");
        } else if (mes == 4 && dia > 20 || mes == 5 && dia < 21) {
            System.out.println("Seu signo é touro");
        } else if (mes == 5 && dia > 20 || mes == 6 && dia < 21) {
            System.out.println("seu signo é gêmeos");
        } else if (mes == 6 && dia > 20 || mes == 7 && dia < 22) {
            System.out.println("Seu signo é câncer");
        } else if (mes == 7 && dia > 21 || mes == 8 && dia < 23) {
            System.out.println("seu signo é leão");
        } else if (mes == 8 && dia > 22 || mes == 9 && dia < 23) {
            System.out.println("Seu signo é virgem");
        } else if (mes == 9 && dia > 22 || mes == 10 && dia < 23) {
            System.out.println("Seu signo é libra");
        } else if (mes == 10 && dia > 22 || mes == 11 && dia < 22) {
            System.out.println("Seu signo é escorpião");
        } else if (mes == 11 && dia > 21 || mes == 12 && dia < 22) {
            System.out.println("Seu signo é sagitário");
        } else if (mes == 12 && dia > 21 || mes == 1 && dia < 22) {
            System.out.println("Seu signo é capricórnio");
        }
    }

    public static void cor(int cor) {
        switch (cor) {
            case 1:
                System.out.println("Sua cor é azul ");
                break;
            case 2:
                System.out.println("Sua cor é preto ");
                break;
            case 3:
                System.out.println("Sua cor é amarelo ");
                break;
            case 4:
                System.out.println("Sua cor é branco ");
                break;
            case 5:
                System.out.println("Sua cor é roxo ");
                break;
            case 6:
                System.out.println("Sua cor é rosa ");
                break;
            case 7:
                System.out.println("Sua cor é verde ");
                break;
            case 8:
                System.out.println("Sua cor é cinza ");
                break;
            case 9:
                System.out.println("Sua cor é marrom ");
                break;
            default:
                System.out.println("Sua cor é vermelha ");
                break;
        }

    }
}
