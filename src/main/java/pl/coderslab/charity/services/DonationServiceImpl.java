package pl.coderslab.charity.services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entities.Donation;
import pl.coderslab.charity.interfaces.DonationService;
import pl.coderslab.charity.repositories.DonationRepository;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService {
    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Long countTotalQuantity(){
        return  donationRepository.countAllByQuantity();
    }

    @Override
    public Long countAllDonations() {
        return donationRepository.count();
    }

    @Override
    public List<Donation> findAll(){
        return donationRepository.findAll();
    }
}
