package westock.vetto.domain.pet.petProfile.entity;

import westock.vetto.domain.pet.petProfile.enums.PetGender;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import javafx.scene.image.Image;
import lombok.Data;

@Data
public class PetProfileEntity {
    
    public UUID petUuid;

    private String petCategory;

    private String petBreed;

    private String parentUuid;
    
    private String petname;

    private String petCurrentWeight;

    private Date petDOB;

    @Enumerated(EnumType.STRING)
    private PetGender PetGender;

    private Image petImage;
    
}

// M : M relationship with parentUuid
// BMI calculation - toshow good health/ underweight/ obese
