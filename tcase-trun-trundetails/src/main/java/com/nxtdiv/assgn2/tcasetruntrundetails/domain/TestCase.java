package com.nxtdiv.assgn2.tcasetruntrundetails.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TestCase {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Long createdByUserId;
    private LocalDate createdDate;
    private String testType;
    private Long testSuiteId;
    private Long testPlanId;
    private Long projectId;
    private String createdRelease;
    private LocalDate lastModifiedDate;
    private Boolean isDeleted;
    private Long lastModifiedByUserId;
    private LocalDate lastViewedDate;

    @OneToMany(mappedBy = "testCase")
    private Set<TestRun> testRuns = new HashSet<>();

    public TestCase() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public Long getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Long testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public Long getTestPlanId() {
        return testPlanId;
    }

    public void setTestPlanId(Long testPlanId) {
        this.testPlanId = testPlanId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getCreatedRelease() {
        return createdRelease;
    }

    public void setCreatedRelease(String createdRelease) {
        this.createdRelease = createdRelease;
    }

    public LocalDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Long getLastModifiedByUserId() {
        return lastModifiedByUserId;
    }

    public void setLastModifiedByUserId(Long lastModifiedByUserId) {
        this.lastModifiedByUserId = lastModifiedByUserId;
    }

    public LocalDate getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(LocalDate lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public Set<TestRun> getTestRuns() {
        return testRuns;
    }

    public void setTestRuns(Set<TestRun> testRuns) {
        this.testRuns = testRuns;
    }

    public TestCase(Long id, String name, String description, Long createdByUserId, LocalDate createdDate, String testType, Long testSuiteId, Long testPlanId, Long projectId, String createdRelease, LocalDate lastModifiedDate, Boolean isDeleted, Long lastModifiedByUserId, LocalDate lastViewedDate, Set<TestRun> testRuns) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdByUserId = createdByUserId;
        this.createdDate = createdDate;
        this.testType = testType;
        this.testSuiteId = testSuiteId;
        this.testPlanId = testPlanId;
        this.projectId = projectId;
        this.createdRelease = createdRelease;
        this.lastModifiedDate = lastModifiedDate;
        this.isDeleted = isDeleted;
        this.lastModifiedByUserId = lastModifiedByUserId;
        this.lastViewedDate = lastViewedDate;
        this.testRuns = testRuns;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdByUserId=" + createdByUserId +
                ", createdDate=" + createdDate +
                ", testType='" + testType + '\'' +
                ", testSuiteId=" + testSuiteId +
                ", testPlanId=" + testPlanId +
                ", projectId=" + projectId +
                ", createdRelease='" + createdRelease + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", isDeleted=" + isDeleted +
                ", lastModifiedByUserId=" + lastModifiedByUserId +
                ", lastViewedDate=" + lastViewedDate +
                ", testRuns=" + testRuns +
                '}';
    }
}
