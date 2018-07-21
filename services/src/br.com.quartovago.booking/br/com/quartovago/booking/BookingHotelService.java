package br.com.quartovago.booking;

import br.com.quartovago.api.HotelService;

public class BookingHotelService implements HotelService {

    public String[] getNomes() {
        return new String[] {
                "Hotel 1 - Booking", "Hotel 2 - Booking", "Hotel 3 - Booking"};
    }
}
