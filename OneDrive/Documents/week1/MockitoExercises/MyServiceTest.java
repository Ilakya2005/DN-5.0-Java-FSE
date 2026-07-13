package MockitoExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub Method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Use Mock
        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        // Verify Result
        assertEquals("Mock Data", result);
    }
}