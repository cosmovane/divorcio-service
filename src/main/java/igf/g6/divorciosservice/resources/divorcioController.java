package igf.g6.divorciosservice.resources;

import igf.g6.divorciosservice.models.Divorcio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class divorcioController {
    @Autowired
    private divorcioService divorcioService;

    @RequestMapping("/divorcios")
    public List<Divorcio> getAllDivorcios(){
        return divorcioService.getAllDivorcios();
    }

    @RequestMapping("/divorcios/{id}")
    public Divorcio getDivorcio(@PathVariable String id){
        return divorcioService.getDivorcio(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/divorcios")
    public void addDivorcio(@RequestBody Divorcio matrimonio){
        divorcioService.addDivorcio(matrimonio);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/divorcios/{id}")
    public void updateDivorcio(@RequestBody Divorcio matrimonio, @PathVariable String id){
        divorcioService.updateDivorcio(matrimonio);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/divorcios/{id}")
    public void deleteDivorcio(@PathVariable String id){
        divorcioService.deleteDivorcio(id);
    }

    @RequestMapping("divorcios/{nombre1Esposo}/{nombre2Esposo}/{apellido1Esposo}" +
            "/{apellido2Esposo}/{nombre1Esposa}/{nombre2Esposa}/{apellido1Esposa}/{apellido2Esposa}")
    public List<Divorcio> getMatrimoniosPorNombre(@PathVariable String nombre1Esposo,@PathVariable String nombre2Esposo,
                                                    @PathVariable String apellido1Esposo, @PathVariable String apellido2Esposo,
                                                  @PathVariable String nombre1Esposa,@PathVariable String nombre2Esposa,
                                                  @PathVariable String apellido1Esposa, @PathVariable String apellido2Esposa){
        return divorcioService.getDivorcioPorNombre(nombre1Esposo, nombre2Esposo, apellido1Esposo, apellido2Esposo, nombre1Esposa, nombre2Esposa, apellido1Esposa, apellido2Esposa);
    }

}
