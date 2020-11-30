package com.zyf.assembly;

import com.zyf.core.LinkNode;

import java.util.HashMap;
import java.util.Map;

public class DefaultAssemblyFactory implements AssemblyFactory{

    private Map<LinkNode,Assembly> assemblyMap = new HashMap<>();




    public void registerStation(Assembly assembly) {

    }

    public Assembly getAssembly(String assemblyName) {
        return null;
    }



    public void linkHead() {

    }

    public void linkTail() {

    }
}
