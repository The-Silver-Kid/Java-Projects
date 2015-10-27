package DevTSK.Util;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.apache.commons.lang3.ArrayUtils;

public class devCSV {
	
	public devCSV() {
	}

	public static final void main(String args[]){
		if (args.length < 1 || args.length > 1){
			System.err.println("Usage: classnamehere <Path to CSV>");
			return;
		}
			
		devCSV te = new devCSV();
		te.readCsvFile(args[1]);
	}
	
    private static final String [] FILE_HEADER_MAPPING = {"num"};
	
	private static final String ID = "num";
	
	public long[] readCsvFile(String strng) {
		FileReader fileReader = null;
		CSVParser csvFileParser = null;
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(FILE_HEADER_MAPPING);
        
        long[] data = new long[] {};
        
        try {
            fileReader = new FileReader(strng);
            csvFileParser = new CSVParser(fileReader, csvFileFormat);
            
            List<CSVRecord> csvRecords = csvFileParser.getRecords(); 
            
            for (int i = 0; i < csvRecords.size(); i++) {
            	CSVRecord record = (CSVRecord) csvRecords.get(i);
            	data = ArrayUtils.add(data, Integer.parseInt(record.get(ID)));	
			}
        } 
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                csvFileParser.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader/csvFileParser !!!");
                e.printStackTrace();
            }
        }
        return data;
	}

}