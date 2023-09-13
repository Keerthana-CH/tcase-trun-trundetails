package com.nxtdiv.assgn2.tcasetruntrundetails.clr;

import com.nxtdiv.assgn2.tcasetruntrundetails.domain.TestCase;
import com.nxtdiv.assgn2.tcasetruntrundetails.repositories.TestCaseRepository;
import com.nxtdiv.assgn2.tcasetruntrundetails.repositories.TestRunDetailsRepository;
import com.nxtdiv.assgn2.tcasetruntrundetails.repositories.TestRunRepository;
import org.springframework.boot.CommandLineRunner;

public class CommonClr implements CommandLineRunner {

    private final TestCaseRepository caseRepository;
    private final TestRunRepository runRepository;
    private final TestRunDetailsRepository runDetailsRepository;

    public CommonClr(TestCaseRepository caseRepository, TestRunRepository runRepository, TestRunDetailsRepository runDetailsRepository) {
        this.caseRepository = caseRepository;
        this.runRepository = runRepository;
        this.runDetailsRepository = runDetailsRepository;
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
