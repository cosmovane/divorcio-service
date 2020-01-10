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

    public List<Divorcio> getDivorcioPorNombre(String primer_nombre,
                                               String segundo_nombre,
                                                String primer_apellido, String segundo_apellido){
        List<Divorcio> divorcios = new ArrayList<>();
        divorcioRepository.findAll().forEach(divorcios::add);
        List<Divorcio> divorcioEncontrado = new ArrayList<>();

        for (int i=0; i<divorcios.size(); i++){
            if( (primer_nombre.equals(divorcios.get(i).getNombre1Esposa()) ||
                    primer_nombre.equals(divorcios.get(i).getNombre1Esposo()))
                            && (segundo_nombre.equals(divorcios.get(i).getNombre2Esposa()) ||
                    segundo_nombre.equals(divorcios.get(i).getNombre2Esposo())) &&
                    (primer_apellido.equals(divorcios.get(i).getApellido1Esposa()) ||
                    primer_apellido.equals(divorcios.get(i).getApellido1Esposo())) &&
                    (segundo_apellido.equals(divorcios.get(i).getApellido2Esposa()) ||
                    segundo_apellido.equals(divorcios.get(i).getApellido2Esposo()))){
                divorcioEncontrado.add(divorcios.get(i));
            }
        }
        return divorcioEncontrado;
    }
}
