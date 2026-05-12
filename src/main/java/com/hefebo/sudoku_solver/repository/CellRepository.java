package com.hefebo.sudoku_solver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hefebo.sudoku_solver.model.Cell;

public interface CellRepository extends JpaRepository <Cell, Long> {
    Optional<Cell> findByRowAndColumn(Integer row, Integer column);

    //Optional<Integer> findValueByRowAndColumn(Integer row, Integer column);

    @Query("SELECT c.value FROM Cell c WHERE c.row = :row AND c.column = :column")
    Optional<Integer> findValueByRowAndColumn(Integer row, Integer column);
}
