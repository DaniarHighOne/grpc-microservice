package daniyar.dev.data_generator_grpc.service;

import daniyar.dev.data_generator_grpc.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions dataTestOptions);
}
