module br.com.quartovago.main {
   requires java.logging;
    requires br.com.quartovago.api;
    requires br.com.quartovago.booking;
    requires br.com.quartovago.tripadvisor;

    uses br.com.quartovago.api.HotelService;
}
