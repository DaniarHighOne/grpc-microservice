package daniyar.dev.data_generator_grpc.web.mapper;

import java.util.List;

public interface Mappable<E, D> {

    E toEntity(D d);

    List<E> toEntity(List<D> d);

    D toDto(E e);

    List<D> toDto(List<E> e);
}
