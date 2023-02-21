package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileUPloaded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
    private Date createTime;
    private String type;
    private String userid;
    private String path;
    private String field;

    public FileUPloaded(File aggregate) {
        super(aggregate);
    }

    public FileUPloaded() {
        super();
    }
}
