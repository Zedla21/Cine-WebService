package com.black.out.cine.controller;

import com.black.out.cine.dao.Funcion;
import com.black.out.cine.model.FuncionesRepository;
import com.black.out.cine.model.ReCaptchaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FuncionController {

    // esto se utiliza para el recaptcha
    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    FuncionesRepository funcionesRepository;

    @PostMapping("/funcion")
    public ResponseEntity<Funcion> crearFuncion(@RequestBody Funcion funcion){
        try{
            Funcion f = funcionesRepository.save(funcion);
            return  new ResponseEntity<>(f, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/funciones")
    public ResponseEntity<List<Funcion>> crearFunciones(@RequestBody List<Funcion> funciones){
        try{
            List<Funcion> f = funcionesRepository.saveAll(funciones);
            return  new ResponseEntity<>(f, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("funcion/{id}")
    public ResponseEntity<Optional<Funcion>> getFuncion(@PathVariable Long id){
        try{
            Optional<Funcion> funcion = funcionesRepository.findById(id);
            return new ResponseEntity<>(funcion, HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/test")
    public String getString(){
        return "{\r\n" +
                "	\"contextTest\":123\r\n" +
                "}";
    }

    /*@PostMapping("/recaptcha")
    public ResponseEntity<String> getRecaptcha(@RequestParam(name = "g-recaptcha-response") String captcha){
        try {
            String url = "https://www.google.com/recaptcha/api/siteverify";
            String params = "?secret=6LeBjAIkAAAAAOfqS6QbQCN4qgPq_8psXk58_a-E&response=" + captcha;
            String secretKey = "6LeBjAIkAAAAAOfqS6QbQCN4qgPq_8psXk58_a-E";

            ReCaptchaResponse reCaptchaResponse = restTemplate.exchange(url + params, HttpMethod.POST, null, ReCaptchaResponse.class).getBody();
            if (reCaptchaResponse.getSuccess()) {
                return new ResponseEntity<>("Aprobado!!", HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>("Desaprobado!!", HttpStatus.CONFLICT);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
