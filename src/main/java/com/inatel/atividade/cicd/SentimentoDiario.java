package com.inatel.atividade.cicd;

import java.time.DayOfWeek;

public class SentimentoDiario {

    public String getSentimentoDoDia(DayOfWeek diaDaSemana){
        switch (diaDaSemana){
            case MONDAY:
                return getSentimentoDeSegunda();
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                return getSentimentoDeMeioDeSemana();
            case FRIDAY:
                return getSentimentoDeSextaFeira();
            case SATURDAY:
            case SUNDAY:
                return getSentimentoDeFimDeSemana();
        }
        return null;
    }

    private String getSentimentoDeSegunda(){
        return "Coragem pra você aí, que to sem nenhuma hoje!";
    }

    private String getSentimentoDeMeioDeSemana(){
        return "Sextou? Não, pera...";
    }

    private String getSentimentoDeSextaFeira(){
        return "DEPLOY??? HOJE?? Sai fora, vou tomar uma cerveja!";
    }

    private String getSentimentoDeFimDeSemana(){
        return "Zzzzzz...";
    }
}