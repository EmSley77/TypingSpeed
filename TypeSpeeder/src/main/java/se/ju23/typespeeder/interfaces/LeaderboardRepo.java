/*Zakaria Jaouhari, Emanuel Sleyman
2024-02-08
 */
package se.ju23.typespeeder.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.ju23.typespeeder.databas.Leaderboard;

import java.util.List;
import java.util.Optional;

@Repository
public interface LeaderboardRepo extends JpaRepository<Leaderboard, Long> {

    Optional<Leaderboard> findById(Long id);

    List<Leaderboard> findByPlayerid(Long id);
}