package com.feifan.Repository;

import com.feifan.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lidd on 2018/2/13.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
