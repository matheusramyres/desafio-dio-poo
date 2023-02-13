import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso CSS");
        curso1.setDescricao("Descrição curso CSS.");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(87);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Teologia");
        mentoria.setDescricao("Muito bom!");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Programação");
        bootcamp.setDescricao("Descrição Bootcamp.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("\n<--------------------DEV: " + devMatheus.getNome()
                + "-------------------------->\n");
        System.out.println("Conteúdos inscritos Matheus: " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println("Conteúdos Concluidos Matheus: " + devMatheus.getconteudosConcluidos());
        System.out.println("Conteúdos inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Calcular XP: " + devMatheus.calcularXP());

        System.out.println("\n");

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("<--------------------DEV: " + devJose.getNome()
                + "-------------------------->\n");
        System.out.println("Conteúdos inscritos José: " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("Conteúdos Concluidos José: " + devJose.getconteudosConcluidos());
        System.out.println("Conteúdos inscritos José: " + devJose.getConteudosInscritos());
        System.out.println("Calcular XP: " + devJose.calcularXP());

    }
}
