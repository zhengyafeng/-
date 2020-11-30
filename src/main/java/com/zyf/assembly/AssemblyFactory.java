package com.zyf.assembly;

import com.zyf.core.AssemblyLink;

public interface AssemblyFactory extends AssemblyLink {


    void registerStation(Assembly assembly);

    Assembly getAssembly(String assemblyName);


}
