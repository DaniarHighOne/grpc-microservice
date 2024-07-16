package daniyar.dev.data_generator_grpc.web.mapper;


import daniyar.dev.data_generator_grpc.model.test.DataTestOptions;
import daniyar.dev.data_generator_grpc.web.dto.DataTestOptionsDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDTO> {

}
