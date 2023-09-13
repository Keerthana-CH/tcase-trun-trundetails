package com.nxtdiv.assgn2.tcasetruntrundetails.domain;

import jakarta.persistence.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class TestRun{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long testRunExecutedById;
    private Long testRunExecutedRelease;
    private LocalTime testStartTime;
    private LocalTime testEndTime;
    private Duration testRunDuration;
    private String testRunResult;
    private String release;
    private Long buildNumber;
    private String tag;
    private Boolean isDeleted;
    private Long lastViewedById;
    private LocalDate LastViewedDate;

    @ManyToOne
    @JoinColumn(name="testCase_id")
    private TestCase testCase;

    @OneToOne(mappedBy = "testRun")
    private TestRunDetails testRunDetails;

    public TestRun(Long id, Long testRunExecutedById, Long testRunExecutedRelease, LocalTime testStartTime, LocalTime testEndTime, Duration testRunDuration, String testRunResult, String release, Long buildNumber, String tag, Boolean isDeleted, Long lastViewedById, LocalDate lastViewedDate, TestCase testCase) {
        this.id = id;
        this.testRunExecutedById = testRunExecutedById;
        this.testRunExecutedRelease = testRunExecutedRelease;
        this.testStartTime = testStartTime;
        this.testEndTime = testEndTime;
        this.testRunDuration = testRunDuration;
        this.testRunResult = testRunResult;
        this.release = release;
        this.buildNumber = buildNumber;
        this.tag = tag;
        this.isDeleted = isDeleted;
        this.lastViewedById = lastViewedById;
        LastViewedDate = lastViewedDate;
        this.testCase = testCase;
    }

    public TestRun() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTestRunExecutedById() {
        return testRunExecutedById;
    }

    public void setTestRunExecutedById(Long testRunExecutedById) {
        this.testRunExecutedById = testRunExecutedById;
    }

    public Long getTestRunExecutedRelease() {
        return testRunExecutedRelease;
    }

    public void setTestRunExecutedRelease(Long testRunExecutedRelease) {
        this.testRunExecutedRelease = testRunExecutedRelease;
    }

    public LocalTime getTestStartTime() {
        return testStartTime;
    }

    public void setTestStartTime(LocalTime testStartTime) {
        this.testStartTime = testStartTime;
    }

    public LocalTime getTestEndTime() {
        return testEndTime;
    }

    public void setTestEndTime(LocalTime testEndTime) {
        this.testEndTime = testEndTime;
    }

    public Duration getTestRunDuration() {
        return testRunDuration;
    }

    public void setTestRunDuration(Duration testRunDuration) {
        this.testRunDuration = testRunDuration;
    }

    public String getTestRunResult() {
        return testRunResult;
    }

    public void setTestRunResult(String testRunResult) {
        this.testRunResult = testRunResult;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public Long getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Long getLastViewedById() {
        return lastViewedById;
    }

    public void setLastViewedById(Long lastViewedById) {
        this.lastViewedById = lastViewedById;
    }

    public LocalDate getLastViewedDate() {
        return LastViewedDate;
    }

    public void setLastViewedDate(LocalDate lastViewedDate) {
        LastViewedDate = lastViewedDate;
    }

    public TestCase getTestCase() {
        return testCase;
    }

    public void setTestCase(TestCase testCase) {
        this.testCase = testCase;
    }

    @Override
    public String toString() {
        return "TestRun{" +
                "id=" + id +
                ", testRunExecutedById=" + testRunExecutedById +
                ", testRunExecutedRelease=" + testRunExecutedRelease +
                ", testStartTime=" + testStartTime +
                ", testEndTime=" + testEndTime +
                ", testRunDuration=" + testRunDuration +
                ", testRunResult='" + testRunResult + '\'' +
                ", release='" + release + '\'' +
                ", buildNumber=" + buildNumber +
                ", tag='" + tag + '\'' +
                ", isDeleted=" + isDeleted +
                ", lastViewedById=" + lastViewedById +
                ", LastViewedDate=" + LastViewedDate +
                ", testCase=" + testCase +
                '}';
    }
}
