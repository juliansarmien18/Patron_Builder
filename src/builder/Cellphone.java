/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author juliansarmien18
 */
public class Cellphone {
    private int num_cameras;
    private String brand;
    private String model;
    private Processor processor; 

    public int getNum_cameras() {
        return num_cameras;
    }

    public void setNum_cameras(int num_cameras) {
        this.num_cameras = num_cameras;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
