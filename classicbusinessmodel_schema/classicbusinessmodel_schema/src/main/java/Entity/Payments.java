package Entity;

import jakarta.persistence.*;

import java.util.Date;

public class Payments {
    @Entity
    @Table(name = "payments")
    public class Payment {

        @EmbeddedId
        private PaymentId id;

        private Date paymentDate;
        private Double amount;

        @ManyToOne
        @MapsId("customerNumber")
        @JoinColumn(name = "customerNumber")
        private Customer customer;
    }
}
