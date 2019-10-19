
public class AutoCloseExample implements AutoCloseable{
	@Override
    public void close() throws Exception {
        System.out.println(" From Close -  AutoCloseable  ");
    }

    public void generalTest() {
        System.out.println(" GeneralTest ");
    }
    
    public static void main(String[] args) {
        try (AutoCloseExample r = new AutoCloseExample()) {
            r.generalTest();
        } catch(Exception e) {
            System.out.println("From Exception Block");
        } finally {
            System.out.println("From Final Block");
        }
    }
	
}
