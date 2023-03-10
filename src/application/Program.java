package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Program {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria de java");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri??o bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devAmanda = new Dev();
		devAmanda.setNome("Amanda");
		devAmanda.inscreverBootcamp(bootcamp);
		System.out.println("Conte?dos Inscritos Amanda: " + devAmanda.getConteudosInscritos());
		devAmanda.progredir();
		devAmanda.progredir();
		System.out.println("-");
		System.out.println("Conte?dos Inscritos Amanda: " + devAmanda.getConteudosInscritos());
		System.out.println("Conte?dos Conclu?dos Amanda: " + devAmanda.getConteudosConcluidos());
		System.out.println("XP: " + devAmanda.calcularTotalXp());

		System.out.println("------");

		Dev devArley = new Dev();
		devArley.setNome("Arley");
		devArley.inscreverBootcamp(bootcamp);
		System.out.println("Conte?dos Inscritos Arley: " + devArley.getConteudosInscritos());
		devArley.progredir();
		devArley.progredir();
		devArley.progredir();
		System.out.println("-");
		System.out.println("Conte?dos Inscritos Arley: " + devArley.getConteudosInscritos());
		System.out.println("Conte?dos Conclu?dos Arley: " + devArley.getConteudosConcluidos());
		System.out.println("XP:" + devArley.calcularTotalXp());

	}
}
