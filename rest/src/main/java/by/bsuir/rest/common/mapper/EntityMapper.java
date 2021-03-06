package by.bsuir.rest.common.mapper;

public interface EntityMapper<D, E> {

    D toDto(E entity);

    E fromDto(D dto);
}
