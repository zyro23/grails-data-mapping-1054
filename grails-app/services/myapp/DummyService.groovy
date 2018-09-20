package myapp

import grails.gorm.transactions.Transactional

@Transactional
class DummyService {

	DummyDataService dummyDataService

}
