/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author kareem
 */

public class DebugListener implements PhaseListener{

    @Override
    public void beforePhase(PhaseEvent event) {
    
        System.out.println("before phase -> "+event.getPhaseId());
    }
    
    @Override
    public void afterPhase(PhaseEvent event) {
    
        System.out.println("after phase -> "+event.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {

        return PhaseId.ANY_PHASE ;
    }
    
    
}
