package pl.coderslab.charity.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Donation {
    @Id
    private Long id;
    private Integer quantity;
    @ManyToMany
    private List<Category> categories;
    @ManyToOne
    private Institution institution;

}
