package se.ju23.typespeeder.interfaces;
/*Zakaria Jaouhari, Emanuel Sleyman
2024-02-8
 */
import org.springframework.data.jpa.repository.JpaRepository;
import se.ju23.typespeeder.logic.Gametask;

import java.util.List;
import java.util.Optional;

public interface iGameTask extends JpaRepository <Gametask,Long>{

    Optional findById(long task_id);

    List<Gametask> findByLanguage(Object language);

    List<Gametask> findGametaskByTaskType(int taskType);

    Optional findByName(String name);

}
