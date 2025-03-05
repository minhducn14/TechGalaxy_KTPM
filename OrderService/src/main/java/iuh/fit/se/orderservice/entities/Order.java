package iuh.fit.se.orderservice.entities;


import iuh.fit.se.orderservice.entities.enumeration.OrderStatus;
import iuh.fit.se.orderservice.entities.enumeration.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Orders")
public class Order {

    @Id
    @UuidGenerator
    private String id;

    @Column(name = "customer_id", nullable = false)
    private String customerId;


    @Column(name = "system_user_id", nullable = false)
    private String systemUserId;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    @Column(length = 255)
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus orderStatus = OrderStatus.NEW;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(name = "payment_id", length = 50)
    private String vnp_TxnRef;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
