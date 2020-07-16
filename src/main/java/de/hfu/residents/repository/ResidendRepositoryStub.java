package de.hfu.residents.repository;

import de.hfu.residents.domain.Resident;

import java.util.ArrayList;
import java.util.List;

public class ResidendRepositoryStub implements ResidentRepository {

    private ArrayList ResidentList = new ArrayList<Resident>();

    public void add(Resident resident){
        ResidentList.add(resident);
    }

    @Override
    public List<Resident> getResidents() {
        return ResidentList;
    }
}