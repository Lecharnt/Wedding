public class Person{
    private final String firstNam;
    private final String lastNam;
    public Person(String firstNam, String lastNam){
        this.firstNam = firstNam;
        this.lastNam = lastNam;
    }
    public String getfirstNam(){
        return firstNam;
    }
    public String getlastNam(){
        return lastNam;
    }
}