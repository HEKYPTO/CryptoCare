package base.health.lab;

import base.health.LabResultBlock;

public class ImagingResultBlock extends LabResultBlock {
    private final String imageUrl;

    public ImagingResultBlock(String patientId, String imagingType, String result, String imageUrl, String previousHash) {
        super(patientId, imagingType, result, previousHash);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
