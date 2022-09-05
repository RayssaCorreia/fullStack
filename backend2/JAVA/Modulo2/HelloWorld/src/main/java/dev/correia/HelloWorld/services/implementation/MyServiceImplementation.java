package dev.correia.HelloWorld.services.implementation;

import dev.correia.HelloWorld.models.Device;
import dev.correia.HelloWorld.services.MyService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.delete;

@Service
public class MyServiceImplementation implements MyService {

    //MOCK minha lista, porque não tenho banco de dados

    private final List<Device> myDevice = new ArrayList<>();

    @Override
    public Device save(Device device) {

        // ########### EXEMPLO ########### //
        boolean contains = myDevice.contains(device);
        if(!contains) myDevice.add(device);
        return device;

        //para cada dispositivo dessa lista, chame de devicefound
//    myDevice.forEach(deviceFound ->{
//        if(deviceFound.getMacAddress().equalsIgnoreCase(device.getMacAddress())){
//            throw new RuntimeException("Device com o mesmo mac");
//        }
//    });
//        myDevice.add(device);
//        return device;
        // ########### ... ########### //

//        for (Device newDevice : myDevice) {
//            if (newDevice.getMacAddress() == myDevice.getMacAddress()) {
//                System.out.println("Mac já utilizado");
//            }
//        }
//        myDevice.add(device);
//        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress) {
        return null;
    }

    @Override
    public List<Device> getAllDevices() {
        return myDevice;
    }

//    @Override
//    public Device deleteMacAddress(String macAddress) {
//
//    //############## como deletar um objeto na lista em java #################
////        myDevice.forEach(macAddress ->{
////        if(macAddress.getMacAddress().equalsIgnoreCase(device.getMacAddress())){
////            throw new RuntimeException("Device com o mesmo mac");
////        }
////    });
//
////        for (Device  : DmyDevice) {
////            if (newDevice.getMacAddress() == myDevice.getMacAddress()) {
////                System.out.println("Mac já utilizado");
////            }
////        }
//
//        return null;
//    }
//
//    @Override
//    public Device putMacAddress(String macAddress) {
//        return null;
//    }

}
