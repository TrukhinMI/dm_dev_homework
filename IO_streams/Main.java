package csv;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Thing> things = new ArrayList<>();
        File fileThings = Path.of("hwResources", "items-name.csv").toFile();
        try (BufferedReader br = new BufferedReader(new FileReader(fileThings))){
            String line = br.readLine();
            while ((line = br.readLine()) != null){
                String[] string = line.split(",");
                things.add(new Thing(Integer.parseInt(string[0]), string[1], string[2]));
            }
        }


        List<Price> prices = new ArrayList<>();
        File filePrice = Path.of("hwResources", "items-price.csv").toFile();
        try (BufferedReader br = new BufferedReader(new FileReader(filePrice))){
            String line = br.readLine();
            while ((line = br.readLine()) != null){
                String[] string = line.split(",");
                prices.add(new Price(Integer.parseInt(string[0]), Double.parseDouble(string[1])));
            }
        }

//        Map<Integer, PriceThing> priceThingMap = new HashMap<>();
//        for (Thing thing : things) {
//            for (Price price : prices) {
//                if (thing.getId() == price.getId()) {
//                    priceThingMap.put(thing.getId(), new PriceThing(thing.getId(), thing.getName(), price.getPrice()));
//                }
//            }
//        }
//
//               }

//        Set<PriceThing> priceThingSet = new LinkedHashSet<>();
//        for (Thing thing : things) {
//            for (Price price : prices) {
////                if (thing.getId() == price.getId()) {
//                    priceThingSet.add(new PriceThing(thing.getId(), thing.getName(), price.getPrice()));
////                }
//            }
//        }

//        for (PriceThing priceThing : priceThingSet){
//            System.out.println(priceThing);
//        }




        File file = Path.of("hwResources", "result.csv").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file,true))){
            fileWriter.append("ID,NAME,PRICE");
            fileWriter.newLine();
            for (Thing thing : things){
                for (Price price : prices){
                    if (thing.getId() == price.getId()){
                        fileWriter.append(thing.getId() + "," + thing.getName() + "," + price.getPrice());
                        fileWriter.newLine();
                    }
                }
            }
        }



//        File fileError = Path.of("hwResources", "errors.csv").toFile();
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileError,true))){
//            fileWriter.append("ID");
//            fileWriter.newLine();
//            for (Thing thing : things){
//                for (Price price : prices){
//                    if (thing.getId() != price.getId()){
//                        fileWriter.append(String.valueOf(thing.getId()));
//                        fileWriter.newLine();
//                        break;
//                    }
//                }
//            }
//        }

    }
}

