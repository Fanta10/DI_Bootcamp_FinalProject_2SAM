package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.HistoriqueMateriel;
import com.adaci.formation.SAM.services.historique_materiel.HistoriqueMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/historiqueMateriel")
@CrossOrigin
public class HistoriqueMaterielController {
    @Autowired
    HistoriqueMaterielService historiqueMaterielService;
    public ResponseEntity<List<HistoriqueMateriel>> getAll(){
        return new ResponseEntity<>(historiqueMaterielService.getAll(), HttpStatus.CREATED);
    }
    public ResponseEntity<HistoriqueMateriel> create(@RequestBody HistoriqueMateriel historiqueMateriel){
        return new ResponseEntity<>(historiqueMaterielService.create(historiqueMateriel), HttpStatus.CREATED);
    }
    public String delete(long id){
        historiqueMaterielService.delete(id);
        return "deleted";
    }
    //public Res
}
