package ru.tander.logist.domain;

import lombok.Data;

/**
 * Реализация графа точек маршрута.
 *
 * @author Dmitrii Goncharov
 */
@Data
public class PointGraphImpl implements PointGraph {
    private Integer idPointOne;
    private Integer idPointSecond;
    private Integer time;
}
