package Carro;

public class Carro {

	 Motor motor = new Motor ();
	 
	 void acelerar() { 
		 
		 if (motor.fatorInjecao < 2.6) { 
			 motor.fatorInjecao += 0.4;
	 }
	 }
		 void frear () {
			 if ( motor.fatorInjecao > 0.5) { 
				 motor.fatorInjecao -= 0.4;
			 }
		 }
		 void ligar() {
			 motor.Ligado = true;
		 }
		 void desligar () {
			 motor.Ligado = false;
		 }
		 boolean estaLigado() {
			 return motor.Ligado;
		 }
		 int nitrox () {
				if(motor.giros() >= 6000)
					motor.fatorInjecao += 0.5;
				return motor.giros();
					

			}
		 }

