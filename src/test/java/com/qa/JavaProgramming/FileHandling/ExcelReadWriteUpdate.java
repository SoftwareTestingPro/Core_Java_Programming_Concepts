package com.qa.JavaProgramming.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadWriteUpdate {
	
	public String XLSXFilePath = System.getProperty("user.dir") + "/target/employeeXLSX.xlsx";
	public String ModifiedXLSXFilePath = System.getProperty("user.dir") + "/target/employeeXLSX-updated.xlsx";

	@Test
	public void CreateExcel() throws IOException {
		// Employee data to be written to the Excel file
		String[][] employeeData = { { "ID", "Name", "Position" }, { "1", "John Doe", "Developer" },
				{ "2", "Jane Smith", "Designer" }, { "3", "Mike Johnson", "Manager" } };

		// Create a new Workbook
		Workbook workbook = new XSSFWorkbook();

		// Create a new Sheet
		Sheet sheet = workbook.createSheet("Employees");

		// Iterate through the employee data and write it to the sheet
		int rowCount = 0;

		for (String[] employee : employeeData) {
			Row row = sheet.createRow(rowCount++);
			int columnCount = 0;

			for (String field : employee) {
				Cell cell = row.createCell(columnCount++);
				cell.setCellValue(field);
			}
		}

		// Write the output to a file
		FileOutputStream fos = new FileOutputStream(XLSXFilePath);
		workbook.write(fos);
		workbook.close();
		System.out.println("Excel file created successfully at " + XLSXFilePath);
	}

	@Test
	public void ReadExcel() throws IOException {
		CreateExcel();
		// Create a FileInputStream to read the Excel file
		FileInputStream fis = new FileInputStream(new File(XLSXFilePath));

		// Create a Workbook object to represent the Excel file
		Workbook workbook = new XSSFWorkbook(fis);

		// Get the first sheet from the workbook
		Sheet sheet = workbook.getSheetAt(0);

		// Iterate through each row in the sheet
		for (Row row : sheet) {
			// Iterate through each cell in the row
			for (Cell cell : row) {
				// Print the cell value
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "\t");
					break;
				default:
					System.out.print("UNKNOWN\t");
				}
			}
			System.out.println();
		}

		// Close the workbook and the FileInputStream
		workbook.close();
		fis.close();
	}

	@Test
	public void ModifyExcel() throws IOException {
		CreateExcel();
		// Open the Excel file
		FileInputStream fis = new FileInputStream(XLSXFilePath);
		Workbook workbook = new XSSFWorkbook(fis);

		// Get the first sheet
		Sheet sheet = workbook.getSheetAt(0);

		// Modify the value in cell B2 (row 1, column 1)
		Row row = sheet.getRow(1);
		if (row == null) {
			row = sheet.createRow(1);
		}
		Cell cell = row.getCell(1);
		if (cell == null) {
			cell = row.createCell(1);
		}
		cell.setCellValue("Johnathan Doe");

		// Modify the value in cell C3 (row 2, column 2)
		row = sheet.getRow(2);
		if (row == null) {
			row = sheet.createRow(2);
		}
		cell = row.getCell(2);
		if (cell == null) {
			cell = row.createCell(2);
		}
		cell.setCellValue("Lead Designer");

		// Close the input stream
		fis.close();

		// Write the changes back to the file
		FileOutputStream fos = new FileOutputStream(ModifiedXLSXFilePath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("Excel file modified successfully. Create new file at "+ModifiedXLSXFilePath);
	}
}