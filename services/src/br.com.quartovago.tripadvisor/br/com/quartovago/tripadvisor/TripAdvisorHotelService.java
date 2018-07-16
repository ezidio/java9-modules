package br.com.quartovago.tripadvisor;

import br.com.quartovago.api.HotelService;

public class TripAdvisorHotelService implements HotelService {

    public String[] getNomes() {
        return new String[] {"Hotel 1 - Trip Advisor", "Hotel 2 - Trip Advisor", "Hotel 3 - Trip Advisor"};
    }
}
