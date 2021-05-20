package accesodatos3;
// Generated 22-ene-2019 17:11:15 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Film generated by hbm2java
 */
public class Film  implements java.io.Serializable {


     private Short filmId;
     private Language languageByLanguageId;
     private Language languageByOriginalLanguageId;
     private String title;
     private String description;
     private Date releaseYear;
     private byte rentalDuration;
     private BigDecimal rentalRate;
     private Short length;
     private BigDecimal replacementCost;
     private String rating;
     private String specialFeatures;
     private Date lastUpdate;
     private Set filmCategories = new HashSet(0);

    public Film() {
    }

	
    public Film(Language languageByLanguageId, String title, byte rentalDuration, BigDecimal rentalRate, BigDecimal replacementCost, Date lastUpdate) {
        this.languageByLanguageId = languageByLanguageId;
        this.title = title;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
        this.lastUpdate = lastUpdate;
    }
    public Film(Language languageByLanguageId, Language languageByOriginalLanguageId, String title, String description, Date releaseYear, byte rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, String rating, String specialFeatures, Date lastUpdate, Set filmCategories) {
       this.languageByLanguageId = languageByLanguageId;
       this.languageByOriginalLanguageId = languageByOriginalLanguageId;
       this.title = title;
       this.description = description;
       this.releaseYear = releaseYear;
       this.rentalDuration = rentalDuration;
       this.rentalRate = rentalRate;
       this.length = length;
       this.replacementCost = replacementCost;
       this.rating = rating;
       this.specialFeatures = specialFeatures;
       this.lastUpdate = lastUpdate;
       this.filmCategories = filmCategories;
    }
   
    public Short getFilmId() {
        return this.filmId;
    }
    
    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }
    public Language getLanguageByLanguageId() {
        return this.languageByLanguageId;
    }
    
    public void setLanguageByLanguageId(Language languageByLanguageId) {
        this.languageByLanguageId = languageByLanguageId;
    }
    public Language getLanguageByOriginalLanguageId() {
        return this.languageByOriginalLanguageId;
    }
    
    public void setLanguageByOriginalLanguageId(Language languageByOriginalLanguageId) {
        this.languageByOriginalLanguageId = languageByOriginalLanguageId;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getReleaseYear() {
        return this.releaseYear;
    }
    
    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }
    public byte getRentalDuration() {
        return this.rentalDuration;
    }
    
    public void setRentalDuration(byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }
    
    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }
    public Short getLength() {
        return this.length;
    }
    
    public void setLength(Short length) {
        this.length = length;
    }
    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }
    
    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }
    public String getRating() {
        return this.rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getSpecialFeatures() {
        return this.specialFeatures;
    }
    
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getFilmCategories() {
        return this.filmCategories;
    }
    
    public void setFilmCategories(Set filmCategories) {
        this.filmCategories = filmCategories;
    }




}


