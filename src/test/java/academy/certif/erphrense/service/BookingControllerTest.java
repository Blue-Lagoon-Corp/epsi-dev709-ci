package academy.certif.erphrense.service;

import academy.certif.erphrense.controller.BookingController;
import academy.certif.erphrense.provider.CancelableProvider;
import mock.MockTicketProvider;
import org.junit.BeforeClass;

public class BookingControllerTest {

    private static MockTicketProvider ticketProvider;

    private static BookingController bookingController;

    private static BookingService bookingService;

    @BeforeClass
    public static void init() {
        BookingControllerTest.ticketProvider = new MockTicketProvider();
        BookingControllerTest.bookingController = new BookingController(bookingService);
    }
}
