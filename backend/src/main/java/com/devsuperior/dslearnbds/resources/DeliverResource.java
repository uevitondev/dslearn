package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliverResource {

    @Autowired
    private DeliverService deliverService;

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCategory(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto) {
        deliverService.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }
}
