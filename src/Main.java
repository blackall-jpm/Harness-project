import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		HttpClientSSETest sse = new HttpClientSSETest();
		try {
			sse.receiveEvents();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/* … The code being measured starts … */
		System.out.println("/* … The code being measured starts … */");  

		// sleep for 5 seconds
		//TimeUnit.SECONDS.sleep(5);
		try {
			TimeUnit.SECONDS.sleep(5);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* … The code being measured ends … */
		System.out.println("/* … The code being measured ends … */");  

		long endTime = System.nanoTime();

		// get the difference between the two nano time valuess
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
	}

}