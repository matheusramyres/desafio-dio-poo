package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {

    }

    @Override
    public double calcularXP() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", cargaHoraria='" + data + "'" +
                "}";
    }

}
