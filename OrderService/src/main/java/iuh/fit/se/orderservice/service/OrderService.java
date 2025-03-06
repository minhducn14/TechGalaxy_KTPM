package iuh.fit.se.orderservice.service;

import iuh.fit.se.orderservice.dto.request.OrderRequest;
import iuh.fit.se.orderservice.dto.request.OrderRequestV2;
import iuh.fit.se.orderservice.dto.response.OrderResponse;
import org.springframework.hateoas.PagedModel;

import java.util.List;

public interface OrderService {
    OrderResponse save(OrderRequest orderRequest);

    OrderResponse findById(String id);

    OrderResponse update(String id, OrderRequest orderRequest);

    PagedModel<OrderResponse> findAllOrders(int page, int size);

    List<OrderResponse> findAll();

    List<OrderResponse> findOrdersByCustomerId(String id);

    //    MK
    OrderResponse createOrders(OrderRequestV2 orderRequestV2);
}
