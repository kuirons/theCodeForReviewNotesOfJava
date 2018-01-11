import jdk.internal.dynalink.beans.StaticClass;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by khx on 17-10-11.
 */
public class DirList {
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter(){
            private Pattern pattern;
            {
                pattern=Pattern.compile(regex);
            }
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }
    public static void main(String[] args) {
        File path=new File("./src");
        String[] list;
        if(args.length==0){
            list=path.list();
        }
        else{
            list=path.list(filter("java"));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String fileName :
             list) {
            System.out.println(fileName);
        }
    }
}

