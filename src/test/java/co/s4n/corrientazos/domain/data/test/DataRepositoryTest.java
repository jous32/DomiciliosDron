
package co.s4n.corrientazos.domain.data.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.s4n.corrientazos.domain.data.DataRepository;

public class DataRepositoryTest {
	
	private final String RESOURCES_TEST_PATH = "src/test/resources/";
	DataRepository dataRepository = new DataRepository();
	
	
	@Test
	public void readRoutesTest() {
		System.out.println("Test1");
		assertEquals(3, dataRepository.readRoutes(RESOURCES_TEST_PATH+"in01.txt").size());
	}
}
