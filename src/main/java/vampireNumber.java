import java.util.ArrayList;

/**
 * Created by khx on 17-9-3.
 */
public class vampireNumber {
    private int beginNum;
    private int endNum;

    vampireNumber(int bNum,int eNum){
        beginNum=bNum;
        endNum=eNum;
    }

    public void doWork(){
        for (int i = beginNum; i < endNum ; i++) {
            if(judgeTheNumWhetherVampireNum(i)){
                System.out.println(i+" is a vampire number");
            }
        }
    }

    private boolean judgeTheNumWhetherVampireNum(int i) {
        if(!judgeTheNumWhetherEndWithTwoZero(i)){
            ArrayList<Integer> num=SplitTheNumIntoTwoPart(i);
            return whetherExistTwoNumMeetTheRequirement(num,i);
        }
        return false;
    }

    private boolean judgeTheNumWhetherEndWithTwoZero(int i) {
        String s=Integer.toString(i);
        String s1=s.substring(s.length()-2,s.length());
        return s1.equals("00");
    }

    private boolean whetherExistTwoNumMeetTheRequirement(ArrayList<Integer> num,int i) {
        for (Integer j :
                num) {
            for (Integer k :
                    num) {
                if(j.intValue()!=k.intValue()?i==(j.intValue()*k.intValue()):false){
                    return true;
                }
            }
        }
        return false;
    }

    private ArrayList<Integer> SplitTheNumIntoTwoPart(int i) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        String s=Integer.toString(i);
        for (int j = 0; j <s.length(); j++) {
            for (int k = 0; k < s.length(); k++) {
                if(k!=j){
                    result.add(Integer.valueOf(""+s.charAt(j)+s.charAt(k)));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        vampireNumber test=new vampireNumber(1000,9999);
        test.doWork();
    }
}
