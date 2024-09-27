package base.health;

import base.HealthcareBlock;

public class PrescriptionBlock extends HealthcareBlock {
    private final String medication;
    private final String dosage;

    public PrescriptionBlock(String patientId, String medication, String dosage, String previousHash) {
        super(patientId, "Prescription", previousHash);
        this.medication = medication;
        this.dosage = dosage;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }
}