package dev.correia.HelloWorld.services;

import dev.correia.HelloWorld.models.Device;

import java.util.List;

// contrato quando for implementar seguir isso aqui
public interface MyService {
    Device save(Device device);
    Device getDeviceByMac(String macAddress);
    List <Device> getAllDevices (); // uma lista de devices

//    Device deleteMacAddress (String macAddress);
//    Device putMacAddress (String macAddress);
}
