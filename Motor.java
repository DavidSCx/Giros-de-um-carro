package Carro;

public class Motor {
boolean Ligado = false;
double fatorInjecao = 1;


int giros() {
	if(!Ligado) {
		return 0;
	} else {
		return (int) Math.round(fatorInjecao * 3000);
		    }
	}

}
