package base;

public class HealthcareBlock extends Block {
    protected String patientId;

    public HealthcareBlock(String patientId, String data, String previousHash) {
        super(data, previousHash);
        this.patientId = patientId;
        this.hash = calculateHash();
    }

    @Override
    protected String calculateHash() {
        return super.calculateHash() + patientId;
    }

    public String getPatientId() {
        return patientId;
    }
}