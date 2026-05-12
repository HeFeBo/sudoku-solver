package com.hefebo.sudoku_solver.Dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CellRequest {
    @Min(value = 1, message = "Row must be >= 1")
    @Max(value = 9, message = "Row must be <= 9")
    private int row;

    @Min(value = 1, message = "Column must be >= 1")
    @Max(value = 9, message = "Column must be <= 9")
    private int column;

    @Min(value = 1, message = "Value must be >= 1")
    @Max(value = 9, message = "Value must be <= 9")
    private Integer value;

}
