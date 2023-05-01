/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emrah
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DijitalSaat ds = new DijitalSaat(14,59,59);
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
        ds.ilerlet();
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
        
        for (int i = 0; i < 10; i++) {
            ds.ilerlet();
        }
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
    }
    
}
