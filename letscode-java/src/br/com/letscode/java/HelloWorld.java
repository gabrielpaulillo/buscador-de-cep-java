package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args) {
        String nome = "Gabriel";

//        ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

//        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao = "";

        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if(agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() < 24) {
            saudacao = "boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());
    }
}
