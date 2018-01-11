/**
 * Created by khx on 17-9-7.
 */
public class initializationAndClean {
    public class Color{
        private String color;
        Color(String color){
            this.color=color;
        }

        public void getColor() {
            System.out.println(color);
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public void test(){
        Color c=new Color("red");
        c.getColor();
    }

    public void changeColor(){
        
    }
}
