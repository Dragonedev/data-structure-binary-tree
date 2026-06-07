package application;

import data_structure.BinaryTree;
import entities.Patient;

import java.util.Scanner;

public class BinaryTreeMain {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("\n<==============================>");
            System.out.println("|       HOSPITAL DA BAHIA      |");
            System.out.println("<==============================>\n");
            System.out.println("1 - Inserir paciente");
            System.out.println("2 - Buscar paciente por protocolo");
            System.out.println("3 - Remover paciente");
            System.out.println("4 - Exibir In-Order");
            System.out.println("5 - Exibir Pre-Order");
            System.out.println("6 - Exibir Post-Order");
            System.out.println("7 - Mostrar menor protocolo");
            System.out.println("8 - Mostrar maior protocolo");
            System.out.println("9 - Contar pacientes");
            System.out.println("10 - Altura da árvore");
            System.out.println("0 - Sair");
            System.out.print("Digite o código: ");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Protocolo: ");
                    int p = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Nome: ");
                    String name = sc.nextLine();

                    System.out.print("Idade: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Especialidade: ");
                    String spec = sc.nextLine();

                    Patient patient = new Patient(p, name, age, spec);
                    tree.insertPatient(patient);

                    System.out.println("Paciente inserido com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o protocolo: ");
                    int search = sc.nextInt();
                    tree.findPatientByProtocol(search);
                    break;

                case 3:
                    System.out.print("Digite o protocolo para remover: ");
                    int rem = sc.nextInt();

                    tree.removePatient(rem);

                    System.out.println("Remoção concluída!");
                    break;
                case 4:
                    tree.inOrder();
                    break;

                case 5:
                    tree.preOrder();
                    break;

                case 6:
                    tree.postOrder();
                    break;

                case 7:
                    tree.findMinPatient();
                    break;

                case 8:
                    tree.findMaxPatient();
                    break;

                case 9:
                    tree.countPatients();
                    break;

                case 10:
                    tree.treeHeight();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 0);

        sc.close();
    }
}
