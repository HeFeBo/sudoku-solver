package com.hefebo.sudoku_solver.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CellResponse {
    private long id;
    private int row;
    private int column;
    private Integer value;
}
