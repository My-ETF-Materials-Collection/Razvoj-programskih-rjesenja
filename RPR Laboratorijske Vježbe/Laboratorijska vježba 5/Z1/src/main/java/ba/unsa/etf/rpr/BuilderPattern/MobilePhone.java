package ba.unsa.etf.rpr.BuilderPattern;

public class MobilePhone {

    private String operativniSistem;
    private String procesor;
    private Double displayVelicina;
    private Integer baterija;
    private Integer megapixeli;

    public MobilePhone(String operativniSistem, String procesor, Double displayVelicina, Integer baterija, Integer megapixeli) {
        this.operativniSistem = operativniSistem;
        this.procesor = procesor;
        this.displayVelicina = displayVelicina;
        this.baterija = baterija;
        this.megapixeli = megapixeli;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "operativniSistem='" + operativniSistem + '\'' +
                ", procesor='" + procesor + '\'' +
                ", displayVelicina=" + displayVelicina +
                ", baterija=" + baterija +
                ", megapixeli=" + megapixeli +
                '}';
    }

    public String getOperativniSistem() {
        return operativniSistem;
    }

    public void setOperativniSistem(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public Double getDisplayVelicina() {
        return displayVelicina;
    }

    public void setDisplayVelicina(Double displayVelicina) {
        this.displayVelicina = displayVelicina;
    }

    public Integer getBaterija() {
        return baterija;
    }

    public void setBaterija(Integer baterija) {
        this.baterija = baterija;
    }

    public Integer getMegapixeli() {
        return megapixeli;
    }

    public void setMegapixeli(Integer megapixeli) {
        this.megapixeli = megapixeli;
    }
}