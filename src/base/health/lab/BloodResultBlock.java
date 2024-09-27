package base.health.lab;

import base.health.LabResultBlock;

public class BloodResultBlock extends LabResultBlock {
    private final String bloodType;
    private final int whiteBloodCellCount;
    private final int redBloodCellCount;

    public BloodResultBlock(String patientId, String testName, String result, String bloodType,
                                int whiteBloodCellCount, int redBloodCellCount, String previousHash) {
        super(patientId, testName, result, previousHash);
        this.bloodType = bloodType;
        this.whiteBloodCellCount = whiteBloodCellCount;
        this.redBloodCellCount = redBloodCellCount;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getWhiteBloodCellCount() {
        return whiteBloodCellCount;
    }

    public int getRedBloodCellCount() {
        return redBloodCellCount;
    }
}
