package com.hefebo.sudoku_solver.service;

import java.util.List;

import com.hefebo.sudoku_solver.Dto.CellRequest;
import com.hefebo.sudoku_solver.Dto.CellResponse;

public interface CellService {
    void initializeEmptyCells();
    void SearchUniqueCellValueForAllCells();//0
    CellResponse saveCell(CellRequest request);
    CellResponse getCell(int row, int column);
    Integer getCellValue(int row, int column);
    void _determineFixedValuesForEmptyCells();//0.1
    void _findAPossibleNonRepeatedValueAndAssignItToTheCell(int row, int column);//0.2
    List<Integer> _getPossibleValuesForCell(int row, int column);//0.2.1
    List<Integer> _getPossibleValuesForRow(int row);//0.2.1.1
    List<Integer> _getValuesPerBox(int row, int column);//0.2.1.2
    List<Integer> _getRowBoxAndColumnBox(int row, int column);//0.2.2 //0.2.1.2.1
}
