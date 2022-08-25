package TryItOut;

public class MensClothingItem {
    // Field
    private MensClothingKind kind;
    private String name;

    // constructor
    public MensClothingItem(MensClothingKind kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    // setter and getter
    public MensClothingKind getKind() {
        return kind;
    }

    public void setKind(MensClothingKind kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
