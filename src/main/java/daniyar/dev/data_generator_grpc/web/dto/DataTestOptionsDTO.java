package daniyar.dev.data_generator_grpc.web.dto;

import daniyar.dev.data_generator_grpc.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDTO {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;

}
