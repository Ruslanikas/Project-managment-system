package lt.projectmanagement.doa;

import org.springframework.data.repository.CrudRepository;

import lt.projectmanagement.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
