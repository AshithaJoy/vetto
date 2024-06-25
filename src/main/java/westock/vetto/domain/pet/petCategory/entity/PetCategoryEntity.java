package westock.vetto.domain.pet.petCategory.entity;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javafx.scene.image.Image;
import lombok.Data;

@Data
public class PetCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID PetCategoryUuid;

    private String petCategoryName;

    private Image petCategoryImage;
    
}

//1:M relaionship with petBreedUuid