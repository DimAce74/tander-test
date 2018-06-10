package ru.tander.logist.domain;

/**
 * Маршрут.
 *
 * @author Dmitrii Goncharov
 */
public interface Route {
    /**
     * Возвращает ИД маршрута.
     *
     * @return ИД маршрута
     */
    Integer getId();

    /**
     * Посчитано ли время на маршрут.
     *
     * @return true, если посчитано
     */
    Boolean getIsReady();

    /**
     * Время на маршрут в минутах.
     *
     * @return время на маршрут в минутах
     */
    Integer getTime();
}
