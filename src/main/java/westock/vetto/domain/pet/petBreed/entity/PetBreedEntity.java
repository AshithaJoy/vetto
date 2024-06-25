package westock.vetto.domain.pet.petBreed.entity;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javafx.scene.image.Image;
import lombok.Data;

@Data
public class PetBreedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID petBreedUuid;

    private String petCategoryUuid;

    private String petBreedName;

    private Image petBreedImage;

    
}
// m : 1 relationship with petCategoryId
// handel bmi equations 