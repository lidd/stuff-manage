package com.feifan.controller;

import com.feifan.Repository.OrderRepository;
import com.feifan.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Lidd on 2018/2/13.
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {

    @Resource
    private OrderRepository orderRepository;

    @RequestMapping("/add")
    public Object addOrder(Order order) {
        orderRepository.save(order);
        return order;
    }

    @RequestMapping("/datagrid")
    public Object datagrid(int page, @RequestParam(name = "rows") int size) {
        page--;
        Pageable dataPage = new PageRequest(page, size);
        Page<Order> datagrid = orderRepository.findAll(dataPage);
        return parse(datagrid);
    }

}
