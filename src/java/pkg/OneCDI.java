/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Model;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author kareem
 */

@Model
public class OneCDI {

    public void doTest()
    {
      System.out.println("do test");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(OneCDI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
