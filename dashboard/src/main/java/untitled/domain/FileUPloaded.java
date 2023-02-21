package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileUPloaded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private Date createTime;
    private String type;
    private String userid;
    private String path;
    private String field;
}
