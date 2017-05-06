package br.com.exemplos.java9;


/**
 * Created by everton on 04/05/17.
 */
public class NomeGauchoGenerator implements NomeGenerator {

    String[] MES_GAUCHO = new String[] {
            "Vivente", "Piá", "Guri", "Xirú", "Magrão", "Patrão", "China", "Bagual", "Tropeiro", "Nego Véio", "Prenda", "Cusco"
    };

    String[] DIA_GAUCHO = new String[] {
            "Da Gauderiada", "Guaiaca", "Das Mateada", "Baiaquero", "Do Bolicho", "Guaipeca", "Dos Pampa", "Campeiro",
            "Xucro", "Missioneiro", "Buenacho", "Serrano", "Guampa Torta", "Jururu", "Macanudo", "Tabacudo", "Milongueiro",
            "das Indiada", "Tropeiro", "Guasca", "Da Charqueada", "Da Querencia", "Esgualepado", "Loco de Bom", "Fandangueiro",
            "Cuiudo", "da Ginetiada", "Cancheiro", "das Chinoca", "Atucanado"
    };


    public String of(int dia, int mes) {
        return  MES_GAUCHO[mes - 1] + " " + DIA_GAUCHO[dia - 1];
    }

}
