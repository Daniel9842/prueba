package edu.escuelaing.arsw.springWeb.htmlTemplates;
/**
 * this class saves templates of the html pages used
 * @author Daniel Santiago Ducuara Ardila
 *
 */
public class StringTemplates {
	
	private String indexHtml = "<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>"
			+ "<style type=\"text/css\">\r\n"
			+ "body {text-align:center; font-family:helvetica;background-color: yellow;}\r\n"
			+ ".titulo {color:blue;font-size:500%;}"
			+ ".instructions {color:red;font-size:300%;}"
			+ "</style>\r\n"
			+ "</head>"
			+ "<body>\r\n"
			+ "<h2 class='titulo'>Picas y Famas</h2>\r\n"
			+ "<form action=\"/index\">\r\n"
			+ "<h1 class='instructions'for=\"number\">Ingrese el número</h1><br><br>\r\n"
			+ "<input size=50 type=\"text\" id=\"number\" name=\"number\"><br><br>\r\n"
			+ "<input type=\"submit\" value=\"Comprobar\"><br><br>\r\n"
			+ "</form> \r\n"
			+ "</body> \r\n"
			+ "</html><br><br> \r\n" ;
	
	private String winHtml = "<!DOCTYPE html>\r\n"
			+ "<head>"
			+ "<style type=\"text/css\">\r\n"
			+ "body {text-align:center; font-family:helvetica;background-color: black;}\r\n"
			+ ".win {color:blue;font-size:1000%;}"
			+ "</style>\r\n"
			+ "</head>"
			+ "<body>\r\n"
			+ "<h2 class='win'>Ganaste!</h2>\r\n"
			+ "<form action=\"/index\">\r\n"
			+ "<input type=\"submit\" value=\"Volver a jugar\"><br><br>\r\n"
			+ "</form> \r\n"
			+ "</body> \r\n"
			+ "</html><br><br>\r\n";
	
	/**
	 * returns a string html page
	 * @return a string representing an html page
	 */
	public String getIndexHtml() {
		return indexHtml;
	}
	/**
	 * returns a string html page
	 * @return a string representing an html page
	 */
	public String getWinHtml() {
		return winHtml;
	}
}
