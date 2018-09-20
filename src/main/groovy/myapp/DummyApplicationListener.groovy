package myapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class DummyApplicationListener {

	@Autowired
	DummyService dummyService

	@EventListener(ContextRefreshedEvent)
	void handleContextRefreshedEvent() {
		assert dummyService.dummyDataService
	}

}
