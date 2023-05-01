/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emrah
 */
public class DijitalSaat {
    int hour, minutes, seconds;
    
    DijitalSaat(){ // saati baştan başlatmak için tanımladık
        hour = 0; minutes = 0; seconds = 0;
    }
    
    DijitalSaat(int h, int m, int s) { // saate kendimizi ayarlamak için tanımladık
        hour = h; minutes = m; seconds = s;
    }
    
    void ilerlet() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hour++;
                if (hour == 24) {
                    hour=0;
                }
            }
        }
    }
}
