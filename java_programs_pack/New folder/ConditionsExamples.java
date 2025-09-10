public class ConditionsExamples {
    static String greatest(int a,int b,int c){ if(a>b) return a>c?("a is big"):("c is big"); else return b>c?("b is greater"):("c is greater"); }
    static String temperature(int t){
        if(t<0) return "freezing weather";
        else if(t<10) return "Very cold weather";
        else if(t<20) return "Cold Weather";
        else if(t<30) return "Normal temperature";
        else if(t<40) return "hot temperature";
        else return "very Hot";
    }
    public static void main(String[] args){
        System.out.println(greatest(100,20,50));
        System.out.println(temperature(15));
    }
}
