package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class LottoMaker {
    public Lotto createLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        return new Lotto(numbers);
    }
}