package csv;

public class ErrorParse {
    public static ErrorPriceItem parse(String line){
        String[] string = line.split(",");
        return new ErrorPriceItem(Integer.parseInt(string[0]));
    }
}
