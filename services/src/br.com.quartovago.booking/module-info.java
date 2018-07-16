module br.com.quartovago.booking {
   requires br.com.quartovago.api;
   exports br.com.quartovago.booking;


   provides br.com.quartovago.api.HotelService with br.com.quartovago.booking.BookingHotelService;
}
