package com.example.tp_api_rest.controllers;

import com.example.tp_api_rest.entities.Persona;
import com.example.tp_api_rest.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="api/v1/personas") //api/v1/nombreRecursoEnPlural --> esto es lo que voy a usar en postman, en este caso va a ser: http://localhost:8080/api/v1/personas  , para recuperar una especifica vamos al Get one en postman y despues de personas ponemos /nroIdBuscado
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{




}
