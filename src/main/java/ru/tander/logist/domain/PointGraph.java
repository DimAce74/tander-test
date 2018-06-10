package ru.tander.logist.domain;

/**
 * Граф точек маршрута.
 *
 * @author Dmitrii Goncharov
 */
public interface PointGraph {
    /**
     * Возвращает ИД первой точки.
     *
     * @return ИД первой точки
     */
    Integer getIdPointOne();

    /**
     * Возвращает ИД второй точки.
     *
     * @return ИД второй точки
     */
    Integer getIdPointSecond();

    /**
     * Возвращает время на преодоление расстояния между двумя точками.
     *
     * @return время на преодоление расстояния между двумя точками
     */
    Integer getTime();
}
