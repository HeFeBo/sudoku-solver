package com.hefebo.sudoku_solver.mapper;

import org.springframework.stereotype.Component;

import com.hefebo.sudoku_solver.Dto.CellRequest;
import com.hefebo.sudoku_solver.Dto.CellResponse;
import com.hefebo.sudoku_solver.model.Cell;

@Component
public class CellMapper {
    public CellResponse toResponse(Cell entity){
        return new CellResponse(
            entity.getId(),
            entity.getRow(),
            entity.getColumn(),
            entity.getValue()
        );
    }

    public Cell toEntity(CellRequest request){
        return new Cell(
            request.getRow(),
            request.getColumn(),
            request.getValue()
        );
    }
}
