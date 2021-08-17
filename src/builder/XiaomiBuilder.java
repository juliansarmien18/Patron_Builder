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
public class XiaomiBuilder extends CellphoneBuilder{
    
    @Override
    public void buildProcessors() {
        Processor processor = new Processor();
        processor.setCores(8);
        processor.setPower("MediaTek Dimensity");
        cellphone.setProcessor(processor);
    }

    @Override
    public void buildCameras() {
        cellphone.setNum_cameras(3);
    }

    @Override
    public void buildBrand() {
        cellphone.setBrand("Xiaomi");
    }

    @Override
    public void buildModel() {
        cellphone.setModel("Note 10");
    }
    
}
