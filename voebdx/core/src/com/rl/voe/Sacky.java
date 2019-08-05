package com.rl.voe;

import com.nilunder.bdx.*;

public class Sacky extends GameObject{

    public void main(){
        if (Bdx.keyboard.keyHit("space"))
            applyForce(0, 0, 300);
    }
    
}