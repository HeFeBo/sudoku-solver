package com.hefebo.sudoku_solver.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hefebo.sudoku_solver.Dto.CellRequest;
import com.hefebo.sudoku_solver.Dto.CellResponse;
import com.hefebo.sudoku_solver.mapper.CellMapper;
import com.hefebo.sudoku_solver.model.Cell;
import com.hefebo.sudoku_solver.repository.CellRepository;

@Service
public class CellServiceImpl implements CellService {
    private final CellMapper cellMapper;
    private final CellRepository cellRepository;

    public CellServiceImpl(CellMapper cellMapper, CellRepository cellRepository) {
        this.cellMapper = cellMapper;
        this.cellRepository = cellRepository;
    }

    ///// Este método inicializa todas las celdas del tablero de Sudoku estableciendo su valor a null. Recorre todas las celdas obtenidas del repositorio, establece su valor a null y las guarda nuevamente en el repositorio. Esto se utiliza para preparar el tablero antes de resolverlo.    
    @Override
    public void initializeEmptyCells(){
        List<Cell> cells = cellRepository.findAll();
        for(Cell cell : cells){
            cell.setValue(null);
            cellRepository.save(cell);
        }

        Cell cell_1 = cellRepository.findByRowAndColumn(1, 5).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_1.setValue(1);
        cellRepository.save(cell_1);
        Cell cell_2 = cellRepository.findByRowAndColumn(1, 6).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_2.setValue(5);
        cellRepository.save(cell_2);
        Cell cell_3 = cellRepository.findByRowAndColumn(1, 7).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_3.setValue(3);
        cellRepository.save(cell_3);
        Cell cell_4 = cellRepository.findByRowAndColumn(1, 8).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_4.setValue(7);
        cellRepository.save(cell_4);
        Cell cell_5 = cellRepository.findByRowAndColumn(2, 2).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_5.setValue(5);
        cellRepository.save(cell_5);
        Cell cell_6 = cellRepository.findByRowAndColumn(2, 3).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_6.setValue(8);
        cellRepository.save(cell_6);
        Cell cell_7 = cellRepository.findByRowAndColumn(2, 4).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_7.setValue(7);
        cellRepository.save(cell_7);
        Cell cell_8 = cellRepository.findByRowAndColumn(2, 6).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_8.setValue(3);
        cellRepository.save(cell_8);
        Cell cell_9 = cellRepository.findByRowAndColumn(2, 7).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_9.setValue(4);
        cellRepository.save(cell_9);    
        Cell cell_10 = cellRepository.findByRowAndColumn(3, 1).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_10.setValue(3);
        cellRepository.save(cell_10);
        Cell cell_11 = cellRepository.findByRowAndColumn(3, 2).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_11.setValue(4);
        cellRepository.save(cell_11);
        Cell cell_12 = cellRepository.findByRowAndColumn(3, 3).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_12.setValue(7);
        cellRepository.save(cell_12);
        Cell cell_13 = cellRepository.findByRowAndColumn(3, 5).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_13.setValue(2);
        cellRepository.save(cell_13);
        Cell cell_14 = cellRepository.findByRowAndColumn(3, 6).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_14.setValue(8);
        cellRepository.save(cell_14);
        Cell cell_15 = cellRepository.findByRowAndColumn(4, 1).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_15.setValue(5);
        cellRepository.save(cell_15);
        Cell cell_16 = cellRepository.findByRowAndColumn(4, 2).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_16.setValue(1);
        cellRepository.save(cell_16);
        Cell cell_17 = cellRepository.findByRowAndColumn(4, 4).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_17.setValue(6);
        cellRepository.save(cell_17);
        Cell cell_18 = cellRepository.findByRowAndColumn(4, 5).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_18.setValue(7);
        cellRepository.save(cell_18);
        Cell cell_19 = cellRepository.findByRowAndColumn(4, 9).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_19.setValue(4);
        cellRepository.save(cell_19);
        Cell cell_20 = cellRepository.findByRowAndColumn(5, 1).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_20.setValue(6);
        cellRepository.save(cell_20);
        Cell cell_21 = cellRepository.findByRowAndColumn(5, 4).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_21.setValue(8);
        cellRepository.save(cell_21);
        Cell cell_22 = cellRepository.findByRowAndColumn(5, 8).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_22.setValue(5);
        cellRepository.save(cell_22);
        Cell cell_23 = cellRepository.findByRowAndColumn(5, 9).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_23.setValue(7);
        cellRepository.save(cell_23);
        Cell cell_24 = cellRepository.findByRowAndColumn(6, 1).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_24.setValue(8);
        cellRepository.save(cell_24);
        Cell cell_25 = cellRepository.findByRowAndColumn(6, 6).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_25.setValue(9);
        cellRepository.save(cell_25);
        Cell cell_26 = cellRepository.findByRowAndColumn(6, 8).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_26.setValue(1);
        cellRepository.save(cell_26);
        Cell cell_27 = cellRepository.findByRowAndColumn(7, 1).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_27.setValue(4);
        cellRepository.save(cell_27);
        Cell cell_28 = cellRepository.findByRowAndColumn(7, 2).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_28.setValue(6);
        cellRepository.save(cell_28);
        Cell cell_29 = cellRepository.findByRowAndColumn(7, 3).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_29.setValue(9);
        cellRepository.save(cell_29);
        Cell cell_30 = cellRepository.findByRowAndColumn(7, 9).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_30.setValue(2);
        cellRepository.save(cell_30);
        Cell cell_31 = cellRepository.findByRowAndColumn(8, 2).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_31.setValue(8);
        cellRepository.save(cell_31);
        Cell cell_32 = cellRepository.findByRowAndColumn(8, 3).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_32.setValue(1);
        cellRepository.save(cell_32);
        Cell cell_33 = cellRepository.findByRowAndColumn(8, 4).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_33.setValue(3);
        cellRepository.save(cell_33);
        Cell cell_34 = cellRepository.findByRowAndColumn(9, 1).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_34.setValue(7);
        cellRepository.save(cell_34);
        Cell cell_35 = cellRepository.findByRowAndColumn(9, 2).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_35.setValue(3);
        cellRepository.save(cell_35);
        Cell cell_36 = cellRepository.findByRowAndColumn(9, 4).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_36.setValue(2);
        cellRepository.save(cell_36);
        Cell cell_37 = cellRepository.findByRowAndColumn(9, 7).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_37.setValue(1);
        cellRepository.save(cell_37);
        Cell cell_38 = cellRepository.findByRowAndColumn(9, 8).orElseThrow(() -> new RuntimeException("Cell not found"));
        cell_38.setValue(9);
        cellRepository.save(cell_38);
    }

    ///// Este método implementa la lógica para buscar un valor único para cada celda vacía en el tablero de Sudoku. Recorre todas las celdas del tablero y, para cada celda vacía, llama a los métodos auxiliares para determinar los valores posibles y asignar un valor si se encuentra uno que no se repite en su fila, columna o caja. El proceso se repite hasta que no se puedan encontrar más valores únicos.
    @Override
    public void SearchUniqueCellValueForAllCells(){
        boolean verifier = false;
        int iterationCounter = 0;
        int counter = 0;
        int firstCounter = 0;
        while(!verifier){
            iterationCounter++;
            _determineFixedValuesForEmptyCells();
            for(int i=1; i<=9; i++){
                for(int j=1; j<=9; j++){
                    if(getCellValue(i, j) == null){
                        _findAPossibleNonRepeatedValueAndAssignItToTheCell(i, j);
                    }
                }
            }
            List<Cell> cells = cellRepository.findAll();
            for(Cell cell : cells){
                if(cell.getValue() == null){
                    counter++;
                    verifier = true;
                    break;
                }
            }
            if(verifier){
                if(firstCounter == counter){
                    break;
                }
                firstCounter = counter;

                verifier = false;
            }else{
                verifier = true;
            }
        }
        System.out.println("Number of iterations: " + iterationCounter);
    }

    ///// Este método guarda una nueva celda en el repositorio. Recibe un objeto CellRequest, lo convierte a una entidad Cell utilizando el CellMapper, guarda la entidad en el repositorio y luego devuelve la respuesta como un objeto CellResponse.
    @Override
    public CellResponse saveCell(CellRequest request) {
        Cell cell = cellMapper.toEntity(request);
        Cell savedCell = cellRepository.save(cell);
        return cellMapper.toResponse(savedCell);
    }

    ////// Este método obtiene una celda específica, dada su fila y columna. Si la celda no existe, lanza una excepción.
    @Override
    public CellResponse getCell(int row, int column) {
        Cell cell = cellRepository.findByRowAndColumn(row, column)
                .orElseThrow(() -> new RuntimeException("Cell not found"));
        
        return cellMapper.toResponse(cell);
    }

    /////// Este método obtiene el valor de una celda específica, dada su fila y columna. Si la celda no existe, lanza una excepción.
    @Override
    public Integer getCellValue(int row, int column) {
        Integer value =cellRepository.findValueByRowAndColumn(row, column)
                .orElse(null);
        
        return value;
    }

    /////// Este método determina los valores fijos para las celdas vacías. Recorre todas las celdas del tablero y, para cada celda vacía, obtiene la lista de valores posibles. Si solo hay un valor posible, asigna ese valor a la celda y la guarda en el repositorio. El proceso se repite hasta que no se puedan determinar más valores fijos.
    @Override
    public void _determineFixedValuesForEmptyCells(){
        boolean cont = false;
        while(!cont){
            for(int i=1; i<=9; i++){
                for(int j=1; j<=9; j++){
                    if(getCellValue(i, j) == null){
                        List<Integer> possibleValues = _getPossibleValuesForCell(i, j);
                        if(possibleValues.size() == 1){
                            cont = true;
                            Cell cell = cellRepository.findByRowAndColumn(i, j)
                                    .orElseThrow(() -> new RuntimeException("Cell not found"));
                            cell.setValue(possibleValues.get(0));
                            cellRepository.save(cell);
                        }
                    }
                }
            }
            if(cont){
                cont = false;
            }else{
                cont = true;
            }
        }
    }

    ///// Este método busca un valor posible para una celda específica que no se repita en su fila, columna o caja. Para cada valor posible, cuenta cuántas veces ese valor aparece como posible en las celdas vacías de la misma fila, columna y caja. Si encuentra un valor que no se repite en al menos una de estas categorías, asigna ese valor a la celda.
    @Override
    public void _findAPossibleNonRepeatedValueAndAssignItToTheCell(int row, int column){
        List<Integer> possibleValues = _getPossibleValuesForCell(row, column);

        int rowBox = _getRowBoxAndColumnBox(row, column).get(0);
        int columnBox = _getRowBoxAndColumnBox(row, column).get(1);

        for(int i=0; i<possibleValues.size(); i++){
            int horizontalCounter = 0;
            int verticalCounter = 0;
            int boxCounter = 0;
            for(int j=1; j<=9; j++){
                if(getCellValue(row, j) == null && j != column){
                    List<Integer> possibleRowValues = _getPossibleValuesForCell(row, j);
                    for(Integer value : possibleRowValues){
                        if(possibleValues.get(i) == value){
                            horizontalCounter++;
                            break;
                        }
                    }
                }
              if(horizontalCounter > 0){
                    break;
                }
            }

            for(int j=1; j<=9; j++){
                if(getCellValue(j, column) == null && j != row){
                    List<Integer> possibleColumnValues = _getPossibleValuesForCell(j, column);
                    for(Integer value : possibleColumnValues){
                        if(possibleValues.get(i) == value){
                            verticalCounter++;
                            break;
                        }
                    }
                }
                if(verticalCounter > 0){
                    break;
                }
            }

            for(int j=rowBox; j<=rowBox+2; j++){
                for(int k=columnBox; k<=columnBox+2; k++){
                    if(getCellValue(j, k) == null && (j != row || k != column)){
                        List<Integer> possibleBoxValues = _getPossibleValuesForCell(j, k);
                        for(Integer value : possibleBoxValues){
                            if(possibleValues.get(i) == value){
                                boxCounter++;
                                break;
                            }
                        }
                    }
                    if(boxCounter > 0){
                        break;
                    }
                }
                if(boxCounter > 0){
                    break;
                }
                
            }

            
            if(horizontalCounter == 0 || verticalCounter == 0 || boxCounter == 0){
                Cell cell = cellRepository.findByRowAndColumn(row, column)
                        .orElseThrow(() -> new RuntimeException("Cell not found"));
                cell.setValue(possibleValues.get(i));
                cellRepository.save(cell);
                break;
            }
            
        }
    }

    /////// Este método obtiene los valores posibles para una celda específica, considerando las restricciones de la fila, columna y caja a la que pertenece la celda.
    @Override
    public List<Integer> _getPossibleValuesForCell(int row, int column) {
        List<Integer> possibleValues = _getPossibleValuesForRow(row);
        for(int i=1; i<=9; i++){
            Integer value = getCellValue(i, column);
            if (value != null){
                possibleValues.remove(value);
            }
        }

        List<Integer> boxValues = _getValuesPerBox(row, column);
        for (Integer value : boxValues) {
            possibleValues.remove(value);
        }

        return possibleValues;

    }

    //////// Este método obtiene los valores posibles para una fila específica, considerando los valores ya presentes en esa fila. Recorre las celdas de la fila y elimina los valores encontrados de la lista de posibles valores (1-9).  
    @Override
    public List<Integer> _getPossibleValuesForRow(int row) {
        List<Integer> possibleValues = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i=1; i<=9; i++){
            Integer value = getCellValue(row, i);
            if (value != null){
                possibleValues.remove(value);
            }
        }
        return possibleValues;
    }

    ////// Este método obtiene los valores presentes en la caja a la que pertenece la celda especificada por sus coordenadas (fila y columna). Calcula la posición de la caja y luego recorre las celdas dentro de esa caja para recopilar los valores presentes.
    @Override
    public List<Integer> _getValuesPerBox(int row, int column) {
        List<Integer> values = new ArrayList<>();
        int rowBox = _getRowBoxAndColumnBox(row, column).get(0);
        int columnBox = _getRowBoxAndColumnBox(row, column).get(1);

        for(int i = rowBox; i<=rowBox+2; i++){
            for(int j = columnBox; j<=columnBox+2; j++){
                Integer value = getCellValue(i, j);
                if (value != null){
                    values.add(value);
                }
            }
        }
        return values;
    }

    ////// Este método calcula la posición de la caja a la que pertenece una celda específica, dada su fila y columna. Devuelve una lista con las coordenadas de la caja (fila y columna).
    @Override
    public List<Integer> _getRowBoxAndColumnBox(int row, int column){
        int rowBox = row/3;
        int columnBox = column/3;
        switch (rowBox) {
            case 0:
                rowBox = 1;
                break;
            case 1:
                if(row == 3){
                    rowBox = 1;
                }else{
                    rowBox = 4;
                }
                break;
            case 2:
                if(row == 6){
                    rowBox = 4;
                }else{
                rowBox = 7;
                }
                break;
            case 3:
                rowBox = 7;
                break;    
            default:
                break;
        }
        switch (columnBox) {
            case 0:
                columnBox = 1;
                break;
            case 1:
                if(column == 3){
                    columnBox = 1;
                }else{
                columnBox = 4;
                }
                break;
            case 2:
                if(column == 6){
                    columnBox = 4;
                }else{
                columnBox = 7;
                }
                break;
            case 3:
                columnBox = 7;
                break;
            default:
                break;
        }
        return List.of(rowBox, columnBox);
    }

}
