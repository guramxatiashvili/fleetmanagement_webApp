package com.gurami.fleetmanagement.services;

import com.gurami.fleetmanagement.models.State;
import com.gurami.fleetmanagement.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    //This will return list of states
    public List<State> getStates(){
        return stateRepository.findAll();
    }
    //Save new state
    public void saveState(State state){
        stateRepository.save(state);
    }

    //get state by ID
    public Optional<State> findById(Integer id){
        return stateRepository.findById(id);
    }

    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }
}
