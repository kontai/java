package 異常;
public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            Integer db=Integer.parseInt("22.3");
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException("abc");
            System.out.println("In try block...");
            System.out.println(c3.getRadius());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
            System.out.println("In IllehalArtumentExcption Block..");
//如果異常處理器無法處理異常。或者只是希望調用者能注意到該異常，JAVA允許異常處理器重新拋出異常。
//            throw ex;
        }
        catch(RuntimeException ex)
        {
            System.out.println(ex);
            System.out.println("In RuntimeException Block..");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            System.out.println("In Exception Block..");
        }
            finally
        {
            System.out.println("In finally block...");
        }
        System.out.println("Number of objects created: " +
                CircleWithException.getNumberOfObjects());
    }
}

