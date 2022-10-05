package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso expert java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("curso expert javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria de spring framework");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPamela = new Dev();
        devPamela.setNome("Pamela");
        devPamela.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Pamela: \n" + devPamela.getConteudosInscritos());

        devPamela.progredir();
        System.out.println("\nConteúdos concluídos Pamela: \n" + devPamela.getConteudosConcluidos());
        System.out.println("\nXP: " + devPamela.calcularTotalXp());

        Dev devAlef = new Dev();
        devAlef.setNome("Alef");
        devAlef.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Alef: \n" + devAlef.getConteudosInscritos());

        devAlef.progredir();
        devAlef.progredir();
        devAlef.progredir();
        System.out.println("\nConteúdos concluídos Alef: \n" + devAlef.getConteudosConcluidos());
        System.out.println("\nXP: " + devAlef.calcularTotalXp());

    }
}