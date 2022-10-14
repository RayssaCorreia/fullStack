package dev.rayssacorreia.Application.utils;



import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class Apputils {

    public ModelMappper modelMapper() {
        return new ModelMapper();
    }
}
