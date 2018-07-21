module br.com.quartovago.booking {
    requires br.com.quartovago.api;
    provides br.com.quartovago.api.HotelService with br.com.quartovago.booking.BookingHotelService;
}
