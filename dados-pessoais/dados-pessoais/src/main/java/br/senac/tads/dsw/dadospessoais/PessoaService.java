package br.senac.tads.dsw.dadospessoais;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private Map<String, Pessoa> mapPessoas;

    public PessoaService(){
        mapPessoas = new HashMap<>();
        
        mapPessoas.put("fulano", new Pessoa("fulano", "fulano da silva", LocalDate.parse("2005-02-15"), "fulano@gmail.com", 
        "11 95548-9855", "1234", List.of("Java", "Spring Boot")));
        
        mapPessoas.put("ciclano", new Pessoa("ciclano", "ciclano de souza", LocalDate.parse("2000-02-18"), "ciclano@gmail.com", 
        "11 95548-5454", "1234", List.of("HTML", "CSS")));
       
        mapPessoas.put("beltrana", new Pessoa("beltrana", "beltrana pereira", LocalDate.parse("2005-04-21"), "beltrana@gmail.com", 
        "11 95548-1111", "1234", List.of("N8N", "IA Generativa")));
    }

    
    public List<Pessoa> findAll(){
        return new ArrayList<>(mapPessoas.values());
    } 

    public Pessoa findByUsername(String username){
        return mapPessoas.get(username);
    }

    public Pessoa addNew(Pessoa pessoa){
        return null;
    }

    public Pessoa update(String username, Pessoa pessoa){
        return null;
    }

    public void delete(String username){
        
    }
}
