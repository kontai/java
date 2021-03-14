import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrDemo1 {
    public static void main(String[] args)
    {
//        StringDemo1();
        StringDemo2();

    }

    private static void StringDemo2()
    {
        List<String[]> list=new ArrayList<>();
        String[] str=new String[0];
        list.add(str);
        System.out.println(Arrays.toString(list.get(0)));
        System.out.println(str.length);
    }

    private static void StringDemo1()
    {
        String str = null;
        str ="In this episode of the Flipboard EDU Podcast, we speak with Brooke, who engages students of all ages with interesting historical facts. Her episodic themed history lessons are as engaging as they are informative. Her instructional delivery is so captivating that her TikTok channel has 600,000 followers. Her 60-second videos about Julius Caesar, the former emperor of Rome, became instant classics.\n" +
                "\n" +
                "On the show, she tells one of the best stories I ever heard about Julius Caesar. We also talk about Brooke’s inspiration for the videos and her aspiration to get her Ph.D. in history. She has already been featured in Time Magazine, Buzzfeed, and the History Channel. This future history professor’s resume is already impressive and she has the foundation to keep history alive for the next generation. \n" +
                "\n";
        String s=new String(str.getBytes(),0,str.getBytes().length);
        System.out.println( s);
        System.out.println(s.indexOf("//n"));
    }
}
