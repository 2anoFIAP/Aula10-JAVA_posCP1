package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class MainTv {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        Scanner scan = new Scanner(System.in);
        int volume, canal, opcao;
        try {
            System.out.print("Informe um canal: ");
            tv.setCanal(scan.nextInt());
            System.out.print("Informe o nivel do volume: ");
            tv.setVolume(scan.nextInt());

            System.out.println("1-Trocar Canal: \n2-Trocar Volume: \n3-Aumentar: \n4-Diminuir: ");
            opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o novo canal: ");
                tv.setCanal(scan.nextInt());
            } else if (opcao == 2) {
                System.out.print("Digite o novo nivel de Volume: ");
                tv.setVolume(scan.nextInt());
            } else if (opcao == 3) {
                tv.aumentarVolume();
                System.out.print("Volume Aumentado");
            } else if (opcao == 4) {
                tv.diminuirVolume();
                System.out.print("Volume diminuido.");
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.printf("Canal atual: %d\nVolume atual: %d\n", tv.getCanal(), tv.getVolume());
        } catch (Exception e) {
            System.out.println("Formato Invalido!");
        }

    }
}
