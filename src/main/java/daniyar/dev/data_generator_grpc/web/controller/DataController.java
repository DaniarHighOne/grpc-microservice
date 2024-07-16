package daniyar.dev.data_generator_grpc.web.controller;


import daniyar.dev.data_generator_grpc.model.Data;
import daniyar.dev.data_generator_grpc.model.test.DataTestOptions;
import daniyar.dev.data_generator_grpc.service.GRPCDataService;
import daniyar.dev.data_generator_grpc.service.TestDataService;
import daniyar.dev.data_generator_grpc.web.dto.DataDTO;
import daniyar.dev.data_generator_grpc.web.dto.DataTestOptionsDTO;
import daniyar.dev.data_generator_grpc.web.mapper.DataMapper;
import daniyar.dev.data_generator_grpc.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final GRPCDataService grpcDataService;
    private final TestDataService testDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void sendData(@RequestBody DataDTO dataDTO ) {
        Data data = dataMapper.toEntity(dataDTO);
        grpcDataService.send(data);
    }
    //for test moments
    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDTO dataTestOptionsDTO){
        DataTestOptions dataTestOptions = dataTestOptionsMapper.toEntity(dataTestOptionsDTO);
        testDataService.sendMessages(dataTestOptions);
    }
}
