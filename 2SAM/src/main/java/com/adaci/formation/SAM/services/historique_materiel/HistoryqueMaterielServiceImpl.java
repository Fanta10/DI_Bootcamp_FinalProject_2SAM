package com.adaci.formation.SAM.services.historique_materiel;

import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.models.HistoriqueMateriel;
import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.repository.HistoriqueMaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryqueMaterielServiceImpl implements HistoriqueMaterielService{
    @Autowired
    HistoriqueMaterielRepository historiqueMaterielRepository;
    @Override
    public List<HistoriqueMateriel> getAll() {
        return historiqueMaterielRepository.findAll();
    }

    @Override
    public HistoriqueMateriel create(HistoriqueMateriel historiqueMateriel) {
        return historiqueMaterielRepository.save(historiqueMateriel);
    }

    @Override
    public void delete(long id) {
        historiqueMaterielRepository.deleteById(id);

    }

    @Override
    public HistoriqueMateriel update(long id, HistoriqueMateriel historiqueMateriel) {
        return historiqueMaterielRepository.save(historiqueMateriel);
    }

    @Override
    public Optional<HistoriqueMateriel> getByEmploye(Employe employe) {
        return null;
    }

    @Override
    public Optional<HistoriqueMateriel> getByMateriel(Materiel materiel) {
        return historiqueMaterielRepository.findByMateriel(materiel);
    }
}
