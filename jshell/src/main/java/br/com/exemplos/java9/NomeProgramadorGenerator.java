package br.com.exemplos.java9;


/**
 * Created by everton on 04/05/17.
 */
public class NomeProgramadorGenerator implements NomeGenerator {


    String[] MES_PROGRAMADOR = new String[] {
            "Javeiro", "Especialista", "Pythoneiro", "Gerentão", "Estagiário", "Newbão", "CSharpeiro", "Harckerzão", "Scriptzeiro", "Nodezeiro", "Eclipseiro", "Seniorzão"
    };

    String[] DIA_PROGRAMADOR = new String[] {
            "das Gambi", "Sem Classe", "Dos Scripts", "Polimorfico", "dos Hello World", "dos Inner Join", "dos Algoritmos", "dos Turbo C", "da Matriz",
            "do HTML7", "das Structs", "dos Deadlock", "dos Group By", "dos Mobile", "do Rollback", "da Recursividade", "do Update sem Where",
            "das Strings", "das Triggers", "da Tela Azul", "da Herança", "das Includes", "dos Fluxogramas", "do RUP", "do Ponto e Virgula",
            "dos Cafés", "Desempregado", "do Teste de Mesa", "do Scrum", "do GoTo", "dos If Else"
    };


    @Override
    public String of(int dia, int mes) {
        return  MES_PROGRAMADOR[mes - 1] + " " + DIA_PROGRAMADOR[dia - 1];
    }
}
