package com.nxtdiv.assgn2.tcasetruntrundetails.domain;

import jakarta.persistence.*;

@Entity
public class TestRunDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long capabilityId;
    private String screenshotLocation;
    private String recordingLocation;
    private String errors;
    private Long successStepCount;
    private Long failureStepCount;
    private Long totalStepCount;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "test_case_id",referencedColumnName = "test_case_id"),
            @JoinColumn(name = "test_run_id",referencedColumnName = "id")
    })
    private TestRun testRun;

    public TestRunDetails() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getCapabilityId() {
        return capabilityId;
    }

    public void setCapabilityId(Long capabilityId) {
        this.capabilityId = capabilityId;
    }

    public String getScreenshotLocation() {
        return screenshotLocation;
    }

    public void setScreenshotLocation(String screenshotLocation) {
        this.screenshotLocation = screenshotLocation;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public Long getSuccessStepCount() {
        return successStepCount;
    }

    public void setSuccessStepCount(Long successStepCount) {
        this.successStepCount = successStepCount;
    }

    public Long getFailureStepCount() {
        return failureStepCount;
    }

    public void setFailureStepCount(Long failureStepCount) {
        this.failureStepCount = failureStepCount;
    }

    public Long getTotalStepCount() {
        return totalStepCount;
    }

    public void setTotalStepCount(Long totalStepCount) {
        this.totalStepCount = totalStepCount;
    }

    public TestRun getTestRun() {
        return testRun;
    }

    public void setTestRun(TestRun testRun) {
        this.testRun = testRun;
    }

    public TestRunDetails(Long id, Long capabilityId, String screenshotLocation, String recordingLocation, String errors, Long successStepCount, Long failureStepCount, Long totalStepCount, TestRun testRun) {
        this.id = id;
        this.capabilityId = capabilityId;
        this.screenshotLocation = screenshotLocation;
        this.recordingLocation = recordingLocation;
        this.errors = errors;
        this.successStepCount = successStepCount;
        this.failureStepCount = failureStepCount;
        this.totalStepCount = totalStepCount;
        this.testRun = testRun;
    }

    @Override
    public String toString() {
        return "TestRunDetails{" +
                "id=" + id +
                ", capabilityId=" + capabilityId +
                ", screenshotLocation='" + screenshotLocation + '\'' +
                ", recordingLocation='" + recordingLocation + '\'' +
                ", errors='" + errors + '\'' +
                ", successStepCount=" + successStepCount +
                ", failureStepCount=" + failureStepCount +
                ", totalStepCount=" + totalStepCount +
                ", testRun=" + testRun +
                '}';
    }
}
