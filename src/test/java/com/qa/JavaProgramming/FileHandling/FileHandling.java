package com.qa.JavaProgramming.FileHandling;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.File;
import javax.xml.transform.OutputKeys;

public class FileHandling {

	public String XMLfilePath = System.getProperty("user.dir") + "/target/employeeXML.xml";
	public String ModifiedXMLFilePath = System.getProperty("user.dir") + "/target/employeeXML-updated.xml";

	@Test
	public void CreateXML() throws Exception {
		// Create a new Document
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		Document doc = documentFactory.newDocumentBuilder().newDocument();

		// Root element
		Element root = doc.createElement("employees");
		doc.appendChild(root);

		// Employee 1
		Element employee1 = doc.createElement("employee");
		employee1.setAttribute("id", "1");

		Element name1 = doc.createElement("name");
		name1.appendChild(doc.createTextNode("John Doe"));
		employee1.appendChild(name1);

		Element position1 = doc.createElement("position");
		position1.appendChild(doc.createTextNode("Developer"));
		employee1.appendChild(position1);

		root.appendChild(employee1);

		// Employee 2
		Element employee2 = doc.createElement("employee");
		employee2.setAttribute("id", "2");

		Element name2 = doc.createElement("name");
		name2.appendChild(doc.createTextNode("Jane Smith"));
		employee2.appendChild(name2);

		Element position2 = doc.createElement("position");
		position2.appendChild(doc.createTextNode("Designer"));
		employee2.appendChild(position2);

		root.appendChild(employee2);

		// Create the XML file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		DOMSource domSource = new DOMSource(doc);
		StreamResult streamResult = new StreamResult(new File(XMLfilePath));

		transformer.transform(domSource, streamResult);
		System.out.println("XML file created successfully at " + XMLfilePath);
	}

	@Test
	public void ReadXML() throws Exception {
		CreateXML();
		// Specify the file path as a File object
		File xmlFile = new File(XMLfilePath);
		System.out.println("Reading XML file at location : " + xmlFile);

		// Create a DocumentBuilder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Parse the XML file
		Document document = builder.parse(xmlFile);

		// Access elements by tag name
		NodeList nodeList = document.getElementsByTagName("employee");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			System.out.println("Element Content: " + node.getTextContent());
		}
	}

	@Test
	public void ModifyXML() throws Exception {
		CreateXML();
		// Load the XML file
		File inputFile = new File(XMLfilePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();

		// Get the employee with id="2"
		NodeList nList = doc.getElementsByTagName("employee");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getAttribute("id").equals("2")) {
					// Modify the name element
					Node nameNode = eElement.getElementsByTagName("name").item(0);
					nameNode.setTextContent("Jane Doe");
				}
			}
		}

		// Write the modified XML back to the file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(ModifiedXMLFilePath));
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(source, result);
		System.out.println("XML file modified successfully. Access modified file at " + ModifiedXMLFilePath);
	}
}