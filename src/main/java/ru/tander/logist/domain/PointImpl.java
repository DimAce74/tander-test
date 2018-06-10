package ru.tander.logist.domain;

import lombok.Data;

/**
 * Реализация точки маршрута.
 *
 * @author Dmitrii Goncharov
 */
@Data
public class PointImpl implements Point {
    Integer id;
    Integer routeId;
}
