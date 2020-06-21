package pl.coderslab.charity.interfaces;

import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.entities.Donation;

import java.util.List;

public interface DonationService {
    Long countTotalQuantity();

    Long countAllDonations();


    List<Donation> findAll();
}
