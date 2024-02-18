package domain.car;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        validateLength(name);
        validateBlank(name);
        validateStartsOrEndsWithBlank(name);
    }

    private void validateLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format("자동차 이름은 %d 글자를 넘을 수 없습니다.", MAX_NAME_LENGTH));
        }
    }

    private void validateBlank(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 공백이나 스페이스일 수 없습니다.");
        }
    }

    private void validateStartsOrEndsWithBlank(String name) {
        if (!name.strip().equals(name)) {
            throw new IllegalArgumentException("자동차 이름은 공백으로 시작하거나 끝날 수 없습니다.");
        }
    }

    public String getName() {
        return name;
    }
}
