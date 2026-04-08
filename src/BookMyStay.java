//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class BookingReportService implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Reservation> bookingHistory = new ArrayList();

    public BookingReportService() {
    }

    public synchronized void addBookingToHistory(Reservation var1) {
        this.bookingHistory.add(var1);
    }

    public synchronized void generateBookingHistoryReport() {
        System.out.println("\n--- Booking History Report ---");
        if (this.bookingHistory.isEmpty()) {
            System.out.println("No bookings confirmed yet.");
        } else {
            System.out.println("Total Bookings Tracked: " + this.bookingHistory.size());

            for(int var1 = 0; var1 < this.bookingHistory.size(); ++var1) {
                Reservation var2 = (Reservation)this.bookingHistory.get(var1);
                String var3 = var2.isCancelled() ? " [CANCELLED]" : "";
                System.out.println(var1 + 1 + ". Booking: ID=" + var2.getReservationId() + ", Guest=" + var2.getGuestName() + ", Room=" + var2.getRoomType() + ", Allocated: " + var2.getAllocatedRoomId() + var3);
            }

        }
    }
}
