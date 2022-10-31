package csv;

public class ItemParse {
    public static Item parse(String line){
        String[] string = line.split(",");
        return new Item(Integer.parseInt(string[0]), string[1], string[2]);
    }
}
