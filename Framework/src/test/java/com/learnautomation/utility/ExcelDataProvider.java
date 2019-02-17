package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	// Método construtor da classe
	public ExcelDataProvider() {

		// Classe para leitura de um arquivo
		File src = new File("./TestData/Data.xlsx");
		// Classe para obter dados externos (nesse caso, os dados serão lidos no caminho
		// "src")
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis); // Classe para ler arquivos
		} catch (Exception e) {
			System.out.println("Não foi possível ler o arquivo Excel" + e.getMessage());
		}

	}

	public String getStringData(int indexDaPlanilha, int row, int column) {

		return wb.getSheetAt(indexDaPlanilha).getRow(row).getCell(column).getStringCellValue();

	}

	public String getStringData(String nomeDaPlanilha, int row, int column) {

		return wb.getSheet(nomeDaPlanilha).getRow(row).getCell(column).getStringCellValue();

	}

	public double getNumericData(String nomeDaPlanilha, int row, int column) {

		return wb.getSheet(nomeDaPlanilha).getRow(row).getCell(column).getNumericCellValue();

	}

}
