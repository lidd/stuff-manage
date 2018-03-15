package com.feifan.Repository;

import com.feifan.domain.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lidd on 2018/2/13.
 */
public interface PaperRepository extends JpaRepository<Paper, Long> {
}
