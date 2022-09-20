package com.qagenic;

import org.testng.annotations.Test;

public class CheckBoxTest extends Baseclass{

    String chekurl = "https://the-internet.herokuapp.com/checkboxes";

    @Test
    public void launch_checkurl(){
        launchApplication(chekurl);
 
    }
    
}
