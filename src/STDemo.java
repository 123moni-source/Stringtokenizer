//DemonstrateStringTokenizer.
import java.util.StringTokenizer;
public class STDemo {
    static String in= "A;"+"B;"+"C;"+"D;";

    public static void main(String[] args) {
        StringTokenizer st =new StringTokenizer(in,";");
        while(st.hasMoreElements())
        {
            String key =st.nextToken();
            String val=st.nextToken();
            System.out.println(key+"\t" + val);
        }
    }
}
