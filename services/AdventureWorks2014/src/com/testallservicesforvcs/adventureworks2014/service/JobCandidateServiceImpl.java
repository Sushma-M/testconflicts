/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testallservicesforvcs.adventureworks2014.JobCandidate;


/**
 * ServiceImpl object for domain model class JobCandidate.
 *
 * @see JobCandidate
 */
@Service("AdventureWorks2014.JobCandidateService")
@Validated
public class JobCandidateServiceImpl implements JobCandidateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobCandidateServiceImpl.class);


    @Autowired
    @Qualifier("AdventureWorks2014.JobCandidateDao")
    private WMGenericDao<JobCandidate, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<JobCandidate, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
	public JobCandidate create(JobCandidate jobCandidate) {
        LOGGER.debug("Creating a new JobCandidate with information: {}", jobCandidate);
        return this.wmGenericDao.create(jobCandidate);
    }

	@Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public JobCandidate getById(Integer jobcandidateId) throws EntityNotFoundException {
        LOGGER.debug("Finding JobCandidate by id: {}", jobcandidateId);
        JobCandidate jobCandidate = this.wmGenericDao.findById(jobcandidateId);
        if (jobCandidate == null){
            LOGGER.debug("No JobCandidate found with id: {}", jobcandidateId);
            throw new EntityNotFoundException(String.valueOf(jobcandidateId));
        }
        return jobCandidate;
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public JobCandidate findById(Integer jobcandidateId) {
        LOGGER.debug("Finding JobCandidate by id: {}", jobcandidateId);
        return this.wmGenericDao.findById(jobcandidateId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
	@Override
	public JobCandidate update(JobCandidate jobCandidate) throws EntityNotFoundException {
        LOGGER.debug("Updating JobCandidate with information: {}", jobCandidate);


        this.wmGenericDao.update(jobCandidate);

        Integer jobcandidateId = jobCandidate.getJobCandidateId();

        return this.wmGenericDao.findById(jobcandidateId);
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
	@Override
	public JobCandidate delete(Integer jobcandidateId) throws EntityNotFoundException {
        LOGGER.debug("Deleting JobCandidate with id: {}", jobcandidateId);
        JobCandidate deleted = this.wmGenericDao.findById(jobcandidateId);
        if (deleted == null) {
            LOGGER.debug("No JobCandidate found with id: {}", jobcandidateId);
            throw new EntityNotFoundException(String.valueOf(jobcandidateId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public Page<JobCandidate> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all JobCandidates");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<JobCandidate> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all JobCandidates");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service AdventureWorks2014 for table JobCandidate to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

