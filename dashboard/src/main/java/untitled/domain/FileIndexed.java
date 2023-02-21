package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private List<String> keyworkds;
    private String Field;
}
