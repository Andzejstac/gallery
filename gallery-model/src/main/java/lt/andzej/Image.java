package lt.andzej;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {
    private String name;
    private String description;
    private byte[] data;
}