package ru.tander.logist.domain;

import lombok.Data;

/**
 * Реализация маршрута.
 *
 * @author Dmitrii Goncharov
 */
@Data
public class RouteImpl implements Route {
    Integer id;
    Boolean isReady;
    Integer time;
}
