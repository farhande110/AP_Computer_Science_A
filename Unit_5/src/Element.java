public class Element {
    public static int max_value = 0;
    private int value;
    public Element(int v){
        value = v;
        if(value > max_value){
            value = max_value;
        }
    }
}

