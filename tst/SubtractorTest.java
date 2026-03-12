public class AdderTest {
   public void testAdd() {
     Subtractor subtractor = new Subtractor();
     int result = subtractor.subtract(2,1);
     assert(result==1);
   }
}
