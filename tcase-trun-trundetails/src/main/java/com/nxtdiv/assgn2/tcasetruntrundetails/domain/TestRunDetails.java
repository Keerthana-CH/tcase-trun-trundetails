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
    @JoinColumn(name = "testRun_id")
    private TestRun testRun;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
