package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cronograma {
    private LocalDate data;
    private List<String> atividades;

    public Cronograma(LocalDate data) {
        this.data = data;
        this.atividades = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<String> getAtividades() {
        return atividades;
    }

    public void adicionarAtividade(String atividade) {
        this.atividades.add(atividade);
    }

    public void removerAtividade(String atividade) {
        this.atividades.remove(atividade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cronograma that = (Cronograma) o;
        return Objects.equals(data, that.data) && Objects.equals(atividades, that.atividades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, atividades);
    }
}
