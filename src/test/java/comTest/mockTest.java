package comTest;

import com.PhoneBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames ="PhoneBook.java" )
public class mockTest {
	
	@Test
	public void testMethodForMocking(){

		System.out.println("into mock test");
		PhoneBook mockObj = PowerMockito.mock(PhoneBook.class); // Created  mock object for phoneBook class
		
		PowerMockito.when(mockObj.run()).thenReturn(10);  // mockibng a non-static method in PhoneBook
		
		
		
		PowerMockito.mockStatic(PhoneBook.class); 		// Making static methods in the phonebook ready to be mocked
		
		PowerMockito.when(PhoneBook.show("sfkdjng")).thenReturn(3500L);  // Mocking static methods in the PhoneBook
	}	
}
