package com.hefebo.sudoku_solver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hefebo.sudoku_solver.Dto.CellRequest;
import com.hefebo.sudoku_solver.Dto.CellResponse;
import com.hefebo.sudoku_solver.service.CellService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cells")
public class CellController {
    private final CellService cellService;

    public CellController(CellService cellService) {
        this.cellService = cellService;
    }

    @PostMapping("/initialize")
    public ResponseEntity<Void> initializeEmptyCells() {
        cellService.initializeEmptyCells();
        return ResponseEntity.status(200).build();
    }
    
    @PostMapping("/solve")
    public ResponseEntity<Void> solveSudoku() {
        cellService.SearchUniqueCellValueForAllCells();
        return ResponseEntity.status(200).build();
    }

    @PostMapping
    public ResponseEntity<CellResponse> saveCell(@Valid @RequestBody CellRequest request) {
        CellResponse response = cellService.saveCell(request);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{row}/{column}")
    public ResponseEntity<CellResponse> getCell(@PathVariable int row, @PathVariable int column) {
        CellResponse response = cellService.getCell(row, column);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/value/{row}/{column}")
    public ResponseEntity<Integer> getCellValue(@PathVariable int row, @PathVariable int column) {
        Integer value = cellService.getCellValue(row, column);
        return ResponseEntity.ok(value);
    }
}
