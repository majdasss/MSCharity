package ma.emsi.donationms.Repo;

import ma.emsi.donationms.Entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepo extends JpaRepository<Donation, Long> {
}
