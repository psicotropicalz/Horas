public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc() {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            this.hora++;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 24) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    @Override
    public String toString() {
        return "⌚Hora: " + hora +":" + minuto;
    }
}
