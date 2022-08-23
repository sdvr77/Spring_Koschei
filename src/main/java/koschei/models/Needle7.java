package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {
    
    private Deth8 deth;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }

    public Deth8 getDeth() {
        return deth;
    }

    @Autowired
    public void setDeth(Deth8 deth) {
        this.deth = deth;
    }
}
