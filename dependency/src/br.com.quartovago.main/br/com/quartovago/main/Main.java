package br.com.quartovago.main;

import java.util.logging.Logger;
import java.util.ServiceLoader;
import java.util.Iterator;
import br.com.quartovago.api.HotelService;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        HotelService service = new HotelService();
        String[] nomes = service.getNomes();
        for (int i = 0; i < nomes.length; i++) {
            LOG.info(nomes[i]);
        }
    }

}
