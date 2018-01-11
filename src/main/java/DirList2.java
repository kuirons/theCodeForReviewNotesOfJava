import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList2 {
    public static FilenameFilter filenameFilter(final String regex){
        return new FilenameFilter() {
            private Pattern pattern=Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File file=new File("E:\\test");
        String[] list;
        if(args.length==0){
            list=file.list();
        }
        else{
            list=file.list(filenameFilter(args[0]));
        }
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
