
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
		public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

		public int getHora() {
		return hora;
	}

		public void setHora(int hora) {
		this.hora = hora;
	}

		public int getMinuto() {
		return minuto;
	}

		public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

		public int getSegundo() {
		return segundo;
	}

		public void setSegundo(int segundo) {
		this.segundo = segundo;
	}


		public void ExibirHoraUniversal() {
		System.out.println(hora+" : ", minuto+" : ", segundo+" : ");
	}

		public void ExibirHoraPadrao() {
								
			if (hora >11 && hora <=23) {
				int Hora = Hora - 12;
				System.out.println(hora+" : ", minuto+" : ", segundo+" : "+" PM");
			}
			else {
				System.out.println(hora+" : ", minuto+" : ", segundo+" : "+" AM");
			}
	}


}

