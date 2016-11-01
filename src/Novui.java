import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Shuric on 23.02.2016.
 */
public class Novui
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        int a = Integer.parseInt(sAge);
        if (a==1) System.out.println("понедельник");
        else if (a==2) System.out.println("вторник");
        else if (a==3) System.out.println("среда");
        else if (a==4) System.out.println("четверг");
        else if (a==5) System.out.println("пятница");
        else if (a==6) System.out.println("суббота");
        else if (a==7) System.out.println("воскресенье");
        else if (a<=0 ^ a >=8) System.out.println("такого дня недели не существует");
    }
}
