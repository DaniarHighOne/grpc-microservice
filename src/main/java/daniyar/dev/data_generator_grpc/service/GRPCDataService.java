package daniyar.dev.data_generator_grpc.service;

import daniyar.dev.data_generator_grpc.model.Data;

import java.util.List;

public interface GRPCDataService {

    void send(Data data);

    void send(List<Data> data);

}
