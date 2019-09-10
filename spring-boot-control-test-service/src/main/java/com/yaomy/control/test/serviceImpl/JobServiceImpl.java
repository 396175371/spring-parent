package com.yaomy.control.test.serviceImpl;

import com.yaomy.control.aop.annotation.TargetDataSource;
import com.yaomy.control.test.mapper.JobMapper;
import com.yaomy.control.test.po.Job;
import com.yaomy.control.test.service.JobService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: Description
 * @Version: 1.0
 */
@Service
@Transactional
public class JobServiceImpl implements JobService {
   @Autowired
    private JobMapper jobMapper;
    @Override
    @TargetDataSource
    public Job findJob(String desc) {
        Job job1 = new Job();
        job1.setJobDesc("test测试12678");
       jobMapper.updateJob(job1);
        System.out.println("-------updateJob----------");
       Job job = jobMapper.findJob();
       String s = null;
       s.length();
        System.out.println(job);
       return job;
    }
}