package org.plcopen.xml.tc60201;

import java.lang.reflect.Method;

public interface PlcNode {

    default void getChildNodes() {
        for (Method method : this.getClass()
                                 .getMethods()) {

            if(method.getName().startsWith("get")){

            }

        }
    }

}
