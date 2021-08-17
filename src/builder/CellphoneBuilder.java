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
public abstract class CellphoneBuilder {
    protected Cellphone cellphone;
    
    public Cellphone getCellphone(){
        return cellphone;
    }
    
    public void createCellphone(){
        cellphone = new Cellphone();
    }
    
    public abstract void buildProcessors();
    
    public abstract void buildCameras();
    
    public abstract void buildBrand();
    
    public abstract void buildModel();
    
}
