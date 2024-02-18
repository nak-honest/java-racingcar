package domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("주어진 거리만큼 자동차를 움직일 수 있다.")
    @ParameterizedTest
    @ValueSource(ints = {0, 10, 100, 101})
    void carMoveTest(int distance) {
        // given
        Car car = Car.createOnStart("pobi");

        // when
        car.move(distance);

        // then
        assertThat(car.getPosition()).isEqualTo(distance);
    }
}
