/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * VemployeeDepartmentHistory generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`vEmployeeDepartmentHistory`")
@IdClass(VemployeeDepartmentHistoryId.class)
public class VemployeeDepartmentHistory implements Serializable {

    private Integer businessEntityId;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String shift;
    private String department;
    private String groupName;
    private Date startDate;
    private Date endDate;

    @Id
    @Column(name = "`BusinessEntityID`", nullable = false, scale = 0, precision = 10)
    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    @Id
    @Column(name = "`Title`", nullable = true, length = 8)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Id
    @Column(name = "`FirstName`", nullable = false, length = 50)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @Column(name = "`MiddleName`", nullable = true, length = 50)
    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Id
    @Column(name = "`LastName`", nullable = false, length = 50)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Id
    @Column(name = "`Suffix`", nullable = true, length = 10)
    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Id
    @Column(name = "`Shift`", nullable = false, length = 50)
    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Id
    @Column(name = "`Department`", nullable = false, length = 50)
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Id
    @Column(name = "`GroupName`", nullable = false, length = 50)
    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Id
    @Column(name = "`StartDate`", nullable = false)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Id
    @Column(name = "`EndDate`", nullable = true)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VemployeeDepartmentHistory)) return false;
        final VemployeeDepartmentHistory vemployeeDepartmentHistory = (VemployeeDepartmentHistory) o;
        return Objects.equals(getBusinessEntityId(), vemployeeDepartmentHistory.getBusinessEntityId()) &&
                Objects.equals(getTitle(), vemployeeDepartmentHistory.getTitle()) &&
                Objects.equals(getFirstName(), vemployeeDepartmentHistory.getFirstName()) &&
                Objects.equals(getMiddleName(), vemployeeDepartmentHistory.getMiddleName()) &&
                Objects.equals(getLastName(), vemployeeDepartmentHistory.getLastName()) &&
                Objects.equals(getSuffix(), vemployeeDepartmentHistory.getSuffix()) &&
                Objects.equals(getShift(), vemployeeDepartmentHistory.getShift()) &&
                Objects.equals(getDepartment(), vemployeeDepartmentHistory.getDepartment()) &&
                Objects.equals(getGroupName(), vemployeeDepartmentHistory.getGroupName()) &&
                Objects.equals(getStartDate(), vemployeeDepartmentHistory.getStartDate()) &&
                Objects.equals(getEndDate(), vemployeeDepartmentHistory.getEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBusinessEntityId(),
                getTitle(),
                getFirstName(),
                getMiddleName(),
                getLastName(),
                getSuffix(),
                getShift(),
                getDepartment(),
                getGroupName(),
                getStartDate(),
                getEndDate());
    }
}

