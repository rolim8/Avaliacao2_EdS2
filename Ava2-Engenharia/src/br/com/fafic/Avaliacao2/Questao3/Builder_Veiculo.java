package br.com.fafic.Avaliacao2.Questao3;

public class Builder_Veiculo implements Builder<Builder_Veiculo, Veiculo> {
    private String custom_vehicle_brand, component1, component2;

    public Builder_Veiculo (String custom_vehicle_brand){
        this.custom_vehicle_brand = custom_vehicle_brand;
    }

    @Override
    public Builder_Veiculo component1(String component1) {
        this.component1 = component1;
        return this;
    }

    @Override
    public Builder_Veiculo component2(String component2) {
        this.component2 = component2;
        return this;
    }

    @Override
    public Veiculo create() {
        return new Veiculo(custom_vehicle_brand, component1, component2);
    }
}
