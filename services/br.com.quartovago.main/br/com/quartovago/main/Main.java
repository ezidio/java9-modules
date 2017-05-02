package br.com.quartovago.main;

import java.util.logging.Logger;
import java.util.ServiceLoader;
import java.util.Iterator;
import br.com.quartovago.api.HotelService;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ServiceLoader<HotelService> services = ServiceLoader.load(HotelService.class);
        Iterator<HotelService> it = services.iterator();
        if (!it.hasNext())
            LOG.info("Não há servicos disponiveis");

        while (it.hasNext()) {
            String[] nomes = it.next().getNomes();
            for (int i = 0; i < nomes.length; i++) {
                LOG.info(nomes[i]);
            }
        }
    } 

}
