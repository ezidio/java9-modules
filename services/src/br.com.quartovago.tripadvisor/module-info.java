module br.com.quartovago.tripadvisor {
   requires br.com.quartovago.api;

   provides br.com.quartovago.api.HotelService with br.com.quartovago.tripadvisor.TripAdvisorHotelService;
}
