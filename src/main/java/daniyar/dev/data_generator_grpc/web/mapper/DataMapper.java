package daniyar.dev.data_generator_grpc.web.mapper;


import daniyar.dev.data_generator_grpc.model.Data;
import daniyar.dev.data_generator_grpc.web.dto.DataDTO;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDTO>{
}
