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

    @RequestMapping("divorcios/{primer_nombre}/{segundo_nombre}/{primer_apellido}" +
            "/{segundo_apellido}")
    public List<Divorcio> getMatrimoniosPorNombre(@PathVariable String primer_nombre,
                                           @PathVariable String segundo_nombre,
                                                    @PathVariable String primer_apellido, @PathVariable String segundo_apellido){
        return divorcioService.getDivorcioPorNombre(primer_nombre, segundo_nombre, primer_apellido,
                segundo_apellido);
    }

}
