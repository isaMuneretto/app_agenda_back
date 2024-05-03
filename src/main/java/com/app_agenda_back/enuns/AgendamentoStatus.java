package com.app_agenda_back.enuns;

public enum AgendamentoStatus {
    PENDENTE("Pendente"),
    CONCLUIDO("Concluído"),
    CANCELADO("Cancelado");

    private final String descricao;

    AgendamentoStatus(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }
}
