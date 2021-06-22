package edu.escuelaing.arsw.springWeb.springController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.escuelaing.arsw.springWeb.picasYfamas.Game;
import edu.escuelaing.arsw.springWeb.htmlTemplates.StringTemplates;
/**
 * this class controls which method will be written as html page
 * @author Daniel Santiago Ducuara Ardila
 *
 */
@RestController
public class controllerIndex {
	Game game = new Game();
	StringTemplates html = new StringTemplates();
	/**
	 * Class constructor controllerIndex
	 */
	public controllerIndex() {
		game.randomNumber();
	}
	/**
	 * this method sends the number to the game
	 * @param number what does the user choose to play
	 * @return a string representing an html page with the game running
	 */
	@GetMapping("/index")
	public String index(@RequestParam(value = "number", defaultValue = "0000") String number) {
		int nums[] = {Integer.parseInt(number.substring(0,1)),Integer.parseInt(number.substring(1,2)),Integer.parseInt(number.substring(2,3)),Integer.parseInt(number.substring(3,4))};
		game.resetPicasFamas();
		game.numbers(nums);
		return decider();
		
	}
	/**
	 * this method checks if the user wins the game or continues playing
	 * @return a string representing an html page with the game running
	 */
	public String decider() {
		if(game.getWin()==false) {
			return html.getIndexHtml()+ String.format("Tus resultados por ahora son: %s %s %s!","picas :"+ game.getPicas(),"famas :"+ game.getFamas(),"  El Último número que ingresaste fue :"+game.getNumbers());
		}else{
			game = new Game();
			game.resetGame();
			return html.getWinHtml();
		}
	}

}
