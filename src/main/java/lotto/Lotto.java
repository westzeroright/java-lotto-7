package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
        sort();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Lotto{" +
                "numbers=" + numbers +
                '}';
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    private void sort() {
        Collections.sort(this.numbers);
    }
}
