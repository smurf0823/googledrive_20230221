package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    IndexRepository indexRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUPloaded'"
    )
    public void wheneverFileUPloaded_MakeIndex(
        @Payload FileUPloaded fileUPloaded
    ) {
        FileUPloaded event = fileUPloaded;
        System.out.println(
            "\n\n##### listener MakeIndex : " + fileUPloaded + "\n\n"
        );

        // Sample Logic //
        Index.makeIndex(event);
    }
}
