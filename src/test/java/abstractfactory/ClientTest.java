package abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import dp1.creational.abstractfactory.AbstractFactory;
import dp1.creational.abstractfactory.Client;

public class ClientTest {
	private AbstractFactory factory = Mockito.mock(AbstractFactory.class);
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client(factory);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testWhenClientOperationCalledCreateProduct1AndCreateProduct2Called() {
		Mockito.doNothing().when(factory).createProduct1();
		Mockito.doNothing().when(factory).createProduct2();
//		client.operation();
		Mockito.verify(client, Mockito.times(1)).operation();
//		Mockito.verify(factory, Mockito.times(1)).createProduct2();
	}

}
