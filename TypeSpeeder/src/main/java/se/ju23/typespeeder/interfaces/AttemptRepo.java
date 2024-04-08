/*
Emanuel sleyman, Zakaria jaouhari
2024-02-08
*/
package se.ju23.typespeeder.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import se.ju23.typespeeder.logic.Attempt;

import java.util.List;
import java.util.Optional;


public interface AttemptRepo extends JpaRepository<Attempt, Long> {


    Optional<Attempt> findById(long userid);

    List<Attempt> findByTaskId(long taskId);

    @Query("SELECT MAX(a.attemptId) + 1 FROM Attempt a")
    Long getNextAttemptId();

    List<Attempt> findByUserId(Long playerid);

}
