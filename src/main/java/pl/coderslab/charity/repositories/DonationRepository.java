package pl.coderslab.charity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.entities.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    @Query("select  sum(d.quantity) from Donation d")
    long countAllByQuantity();
}
