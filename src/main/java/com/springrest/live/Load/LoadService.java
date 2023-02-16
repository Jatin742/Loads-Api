package com.springrest.live.Load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoadService {
    
    @Autowired
    private LoadRepository loadRepository;
    
    public String addload(Load load){
        loadRepository.save(load);
        return "Load details Added Successfully!";
    }
    public List<Load> getloads(String shipperId){
        return loadRepository.findByShipperId(shipperId);
    }
    public Load getload(long loadId){
        Load l=loadRepository.findById(loadId).orElse(null);
        return l;
    }
    public String putload(long loadId,Load load){
        Load l = loadRepository.findById(loadId).orElse(null);
    if (l == null) {
        return "Load Not Found";
    }
    l.setLoadingPoint(load.getLoadingPoint());
    l.setUnloadingPoint(load.getUnloadingPoint());
    l.setProductType(load.getProductType());
    l.setTruckType(load.getTruckType());
    l.setNoOfTrucks(load.getNoOfTrucks());
    l.setWeight(load.getWeight());
    l.setComment(load.getComment());
    l.setDate(load.getDate());
    loadRepository.save(l);
    return "Load Updated";
    
}

    public String deleteload(long loadId){
        Load l=loadRepository.findById(loadId).orElse(null);
        if(l==null){
            return "Load Not Found";
        }
        loadRepository.delete(l);
        return "Load Deleted";
    }
}
