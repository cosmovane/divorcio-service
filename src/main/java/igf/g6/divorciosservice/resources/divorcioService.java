package igf.g6.divorciosservice.resources;

import igf.g6.divorciosservice.models.Divorcio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class divorcioService {
    @Autowired
    private igf.g6.divorciosservice.interfaces.divorcioRepository divorcioRepository;

    public List<Divorcio> getAllDivorcios(){
        List<Divorcio> divorcios = new ArrayList<>();
        divorcioRepository.findAll().forEach(divorcios::add);
        return divorcios;
    }

    public Divorcio getDivorcio(String id){
        return divorcioRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public void addDivorcio(Divorcio divorcio){
        divorcioRepository.save(divorcio);
    }

    public void updateDivorcio(Divorcio divorcio){
        divorcioRepository.save(divorcio);
    }

    public void deleteDivorcio(String id){
        divorcioRepository.deleteById(Long.parseLong(id));
    }

    public List<Divorcio> getDivorcioPorNombre(String nombre1Esposo, String nombre2Esposo,
                                               String apellido1Esposo, String apellido2Esposo,
                                               String nombre1Esposa, String nombre2Esposa,
                                               String apellido1Esposa, String apellido2Esposa){
        List<Divorcio> divorcios = new ArrayList<>();
        divorcioRepository.findAll().forEach(divorcios::add);
        List<Divorcio> divorciosEncontrados = new ArrayList<>();

        for (int i=0; i<divorcios.size(); i++){
            if( (nombre1Esposa.equals(divorcios.get(i).getNombre1Esposa()) &&
                    nombre1Esposo.equals(divorcios.get(i).getNombre1Esposo())
                            && nombre2Esposa.equals(divorcios.get(i).getNombre2Esposa()) &&
                    nombre2Esposo.equals(divorcios.get(i).getNombre1Esposo()) &&
                            apellido1Esposa.equals(divorcios.get(i).getApellido1Esposa()) &&
                    apellido1Esposo.equals(divorcios.get(i).getApellido1Esposo()) &&
                            apellido2Esposa.equals(divorcios.get(i).getApellido2Esposa()) &&
                    apellido2Esposo.equals(divorcios.get(i).getApellido2Esposo()))){
                divorciosEncontrados.add(divorcios.get(i));
            }
        }
        return divorciosEncontrados;
    }
}
