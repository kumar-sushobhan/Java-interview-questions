package com.sushobhan.readCSV;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadCSVDataAndGroupByIDAndConvertToJson {

    /**
     * Read the transaction CSV data using Java8 stream
     * Group the transaction data by transaction ID
     * Convert the transaction data to JSON
     */
    public static void main(String[] args) {
        // Read the CSV file
        Path path = Path.of("path of CSV file");
        if (Files.exists(path)) {
            try {
                List<TransactionData> dataList = Files.lines(path)
                        .skip(1)
                        .map(line -> {
                            String[] csvData = line.split(",");
                            return new TransactionData(csvData[0], csvData[1], csvData[2], csvData[3], csvData[4], Long.parseLong(csvData[5]));
                        })
                        .toList();
                System.out.println(dataList);

                // Group data by transaction data by transaction ID
                Map<Long, List<TransactionData>> listMap = dataList.stream()
                        .collect(Collectors.groupingBy(TransactionData::getTransactionID, Collectors.toList()));
                System.out.println(listMap);

                // Convert to json object
                for (Map.Entry<Long, List<TransactionData>> entry : listMap.entrySet()) {
                    List<TransactionData> data = entry.getValue();
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    String jsonStringList = gson.toJson(data);
                    System.out.println(entry.getKey() + jsonStringList);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}
