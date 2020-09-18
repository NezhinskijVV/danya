import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Milk implements Milky {
    private final String milk;

    @Override
    public double getPercentage() {
        return 3.6;
    }
}
