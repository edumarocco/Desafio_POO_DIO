package com.example.demo2;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescriçao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescriçao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduardo" + devEduardo.getConteudosInscritos());

        devEduardo.progredir();
        devEduardo.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Eduardo" + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXp());

        System.out.println("------------");

        Dev devBibiana = new Dev();
        devBibiana.setNome("Bibiana");
        devBibiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bibiana" + devBibiana.getConteudosInscritos());
        devBibiana.progredir();
        devBibiana.progredir();
        devBibiana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Bibiana" + devBibiana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Bibiana" + devBibiana.getConteudosConcluidos());
        System.out.println("XP:" + devBibiana.calcularTotalXp());



    }

}
