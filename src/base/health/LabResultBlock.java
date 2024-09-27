package base.health;

import base.HealthcareBlock;

public class LabResultBlock extends HealthcareBlock {
    protected final String testName;
    protected final String result;

    public LabResultBlock(String patientId, String testName, String result, String previousHash) {
        super(patientId, "Lab Result", previousHash);
        this.testName = testName;
        this.result = result;
    }

    public String getTestName() {
        return testName;
    }

    public String getResult() {
        return result;
    }
}