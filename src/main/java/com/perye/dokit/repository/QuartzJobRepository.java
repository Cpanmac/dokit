package com.perye.dokit.repository;

import com.perye.dokit.entity.QuartzJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface QuartzJobRepository extends JpaRepository<QuartzJob,Long>, JpaSpecificationExecutor<QuartzJob> {

    /**
     * 查询启用的任务
     * @return List
     */
    List<QuartzJob> findByIsPauseIsFalse();
}
