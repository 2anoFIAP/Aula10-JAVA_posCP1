package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class MainTv {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Informe um canal: ");
            int canalEscolhido = scan.nextInt();
            System.out.print("Informe o nivel do volume: ");
            int volumeEscolhido = scan.nextInt();
            tv.setCanal(canalEscolhido);
            tv.setVolume(volumeEscolhido);

            System.out.println("1-Trocar Canal: \n2-Trocar Volume: \n3-Aumentar: \n4-Diminuir: ");
            int opcao = scan.nextInt();
            switch(opcao) {
                case 1:
                    System.out.print("Digite o novo canal: ");
                    int novoCanal = scan.nextInt();
                    tv.setCanal(novoCanal);
                    break;
                case 2:
                    System.out.print("Digite o novo nivel de Volume: ");
                    int novoVolume = scan.nextInt();
                    tv.setVolume(novoVolume);
                    break;
                case 3:
                    tv.aumentarVolume();
                    System.out.print("Volume Aumentado");
                    break;
                case 4:
                    tv.diminuirVolume();
                    System.out.print("Volume diminuido.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.printf("Canal atual: %d %nVolume atual: %d%n", tv.getCanal(), tv.getVolume());
        } catch (Exception e) {
            System.out.println("Formato Invalido!");
        }

    }
}
