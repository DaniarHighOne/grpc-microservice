package daniyar.dev.data_generator_grpc.web.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import daniyar.dev.data_generator_grpc.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class DataDTO {

    private Long sensorId;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp;
    private double measurement;
    private Data.MeasurementType measurementType;

}

