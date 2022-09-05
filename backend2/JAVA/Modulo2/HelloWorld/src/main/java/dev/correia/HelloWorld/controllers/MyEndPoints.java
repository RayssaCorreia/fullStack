package dev.correia.HelloWorld.controllers;

import dev.correia.HelloWorld.models.Device;
import dev.correia.HelloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/test")
public class MyEndPoints {

    @Autowired
    private MyService myService;

    @GetMapping// http://localhost:8080/test
    public List<Device> myFirstGet(){
        return myService.getAllDevices();
    }

    @GetMapping("/v1/{mac}") // http://localhost:8080/test/<id>
    public String  endpointWithParameter(@PathVariable String mac){
        System.out.println(mac);
        return  "Hello World " + mac;
    }

    @GetMapping("/v1") // http://localhost:8080/test/v1?value=5
    public String endpointWithQuery(@RequestParam Integer value){
        System.out.println(value);
        return  "Hello World " + value;
    }

    @PostMapping // http://localhost:8080/test
    public Device myFirstPost(@RequestBody Device device){

        return myService.save(device);
    }

//    @DeleteMapping("/{mac}") // http://localhost:8080/test?mac=
//    public Device myFirstDelete(@RequestParam String mac){
//
//        return myService.deleteMacAddress(mac);
//    }
//
//    @PutMapping("/{mac}") // http://localhost:8080/test?mac=
//    public Device myFirstPut(@RequestParam String mac){
//
//        return myService.putMacAddress(mac);
//    }

}
