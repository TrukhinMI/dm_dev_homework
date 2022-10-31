package csv;

public class PriceParse {
    public static Price parse(String line){
        String[] string = line.split(",");
        return new Price(Integer.parseInt(string[0]), Double.parseDouble(string[1]));
    }
}
