package central_tasks_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CentralTasksServiceApplication

fun main(args: Array<String>) {
	runApplication<CentralTasksServiceApplication>(*args)
}
