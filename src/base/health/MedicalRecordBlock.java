package base.health;

import base.HealthcareBlock;

public class MedicalRecordBlock extends HealthcareBlock {
    private final String diagnosis;

    public MedicalRecordBlock(String patientId, String diagnosis, String previousHash) {
        super(patientId, "Medical Record", previousHash);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
