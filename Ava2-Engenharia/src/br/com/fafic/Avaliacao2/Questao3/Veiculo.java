package br.com.fafic.Avaliacao2.Questao3;

public class Veiculo {
    private String custom_Vehicle_Brand, component1, component2;

    public Veiculo(String marca_do_veiculo_customizado, String componente_1, String componente_2) {
        this.custom_Vehicle_Brand = custom_Vehicle_Brand;
        this.component1 = component1;
        this.component2 = component2;
    }

    public String getMarca_do_veiculo_customizado() {
        return custom_Vehicle_Brand;
    }

    public void setMarca_do_veiculo_customizado(String marca_do_veiculo_customizado) {
        this.custom_Vehicle_Brand = custom_Vehicle_Brand;
    }

    public String getComponente_1() {
        return component1;
    }

    public void setComponente_1(String componente_1) {
        this.component1 = component1;
    }

    public String getComponente_2() {
        return component2;
    }

    public void setComponente_2(String componente_2) {
        this.component2 = component2;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "Marca do veiculo customizado = " + custom_Vehicle_Brand 
                + ", componente 1 = " + component1 
                + ", componente 2 = " + component2 
                + '}';
    }
}
