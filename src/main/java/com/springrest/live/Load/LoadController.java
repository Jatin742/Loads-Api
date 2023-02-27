package com.springrest.live.Load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@RestController
public class LoadController {
    
    @Autowired
    private LoadService loadService;
    
    @PostMapping("/load")
    public String addload(@RequestBody Load load){
        return loadService.addload(load);
    }
    @GetMapping("/load")
    public List<Load> getloads(@RequestParam (name="shipperId") String shipperId){
        return loadService.getloads(shipperId);
    }
    @GetMapping("/load/{loadId}")
    public Load getload(@PathVariable long loadId){
        return loadService.getload(loadId);
    }
    @PutMapping("/load/{loadId}")
    public String putload(@PathVariable long loadId,@RequestBody Load load){
        return loadService.putload(loadId,load);
    }
    @DeleteMapping("/load/{loadId}")
    public String deleteload(@PathVariable long loadId){
        return loadService.deleteload(loadId);
    }
}
