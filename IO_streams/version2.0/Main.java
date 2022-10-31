package csv;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {


        Map<Integer, Item> itemsById = new HashMap<>();
        File fileItem = Path.of("hwResources", "items-name.csv").toFile();
        try (BufferedReader br = new BufferedReader(new FileReader(fileItem))){
            String line = br.readLine(); //строка что бы не вставлять в мой Map шапку файла (ID,NAME,DESCRIPTION)
            while ((line = br.readLine()) != null){ //если следующая строка не пустая то делаем код ниже
                Item item = ItemParse.parse(line);
                itemsById.put(item.getId(), item);
            }
        }




        Map<Integer, Price> priceById = new HashMap<>();
        File filePrice = Path.of("hwResources", "items-price.csv").toFile();
        try (BufferedReader br = new BufferedReader(new FileReader(filePrice))){
            String line = br.readLine(); //строка что бы не вставлять в мой Map шапку файла (ID,NAME,DESCRIPTION)
            while ((line = br.readLine()) != null){ //если следующая строка не пустая то делаем код ниже
                Price price = PriceParse.parse(line);
                priceById.put(price.getId(), price);
            }
        }


        //список для объединения вещей и прайса
        List<PriceItem> result = new ArrayList<>();
        for (Item item : itemsById.values()){
            Price price = priceById.get(item.getId());
            if (price != null){
                result.add(new PriceItem(item.getId(), item.getName(), price.getPrice()));
            }
        }

        //запись в файл список вещей и прайса
        File file = Path.of("hwResources", "result.csv").toFile();
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))){
            fileWriter.append("ID,NAME,PRICE");
            fileWriter.newLine();
            for (PriceItem priceItem : result){
                fileWriter.append(priceItem.getId() + "," + priceItem.getName() + "," + priceItem.getPrice());
                fileWriter.newLine();
            }
        }
    }
}

