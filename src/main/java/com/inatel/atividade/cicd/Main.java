package com.inatel.atividade.cicd;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        final SentimentoDiario sentimentoDiario = new SentimentoDiario();
        final DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();

        System.out.println("Sentimento do dia: ");
        System.out.println(sentimentoDiario.getSentimentoDoDia(diaDaSemana));
    }
}