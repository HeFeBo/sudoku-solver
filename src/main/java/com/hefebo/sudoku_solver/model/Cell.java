package com.hefebo.sudoku_solver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "row_index")
    private Integer row;

    @Column(name = "column_index")
    private Integer column;

    @Column(name = "cell_value")
    private Integer value;

    public Cell(Integer row, Integer column, Integer value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

}
    