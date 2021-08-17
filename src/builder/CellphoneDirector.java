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
public class CellphoneDirector {
    
    private CellphoneBuilder cellphonebuilder;
    
    public void consCellphone(){
        cellphonebuilder.createCellphone();
        cellphonebuilder.buildBrand();
        cellphonebuilder.buildModel();
        cellphonebuilder.buildProcessors();
        cellphonebuilder.buildCameras();
    }
    
    public void setCellphoneBuilder(CellphoneBuilder cb){
        cellphonebuilder = cb;
    }
    public Cellphone getCellphone(){
        return cellphonebuilder.getCellphone();
    }
}
