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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CellphoneDirector director = new CellphoneDirector();
        director.setCellphoneBuilder(new HuaweiBuilder());
        director.consCellphone();
        Cellphone Huawei = director.getCellphone(); 
        
        System.out.println("Nuevo celular");
        System.out.println("Marca: "+Huawei.getBrand());
        System.out.println("Modelo: "+Huawei.getModel());
        System.out.println("Camaras: "+Huawei.getNum_cameras());
        System.out.println("Procesador: "+Huawei.getProcessor().getPower());
        System.out.println("Numero de nucleos: "+Huawei.getProcessor().getCores());
        System.out.println("");
        
        director.setCellphoneBuilder(new XiaomiBuilder());
        director.consCellphone();
        Cellphone Xiaomi = director.getCellphone();
        
        System.out.println("Nuevo celular");
        System.out.println("Marca: "+Xiaomi.getBrand());
        System.out.println("Modelo: "+Xiaomi.getModel());
        System.out.println("Camaras: "+Xiaomi.getNum_cameras());
        System.out.println("Procesador: "+Xiaomi.getProcessor().getPower());
        System.out.println("Numero de nucleos: "+Xiaomi.getProcessor().getCores());
    }
    
}
