package PracticeTest.May;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Lab15May25_SplitAndJoinProject {
    public static void main(String[] args) throws IOException {
        File f= new File(".");
        String d = f.getCanonicalPath();
        String[] parts= d.split("\\\\");
        System.out.println("Complete path"+ d);
        for( int i =0;i<= parts.length-1;i++){
            System.out.println(parts[i]);
        }

    }
}
