package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class PlayerLotto {
    private final List<Lotto> lottos;

    public PlayerLotto() {
        this.lottos = new ArrayList<>();
    }

    public void publish(int quantity) {
        while (lottos.size() < quantity) {
            List<Integer> lottoNumber = Randoms.pickUniqueNumbersInRange(LottoConfig.MIN_LOTTO_NUMBER.getValue(),
                    LottoConfig.MAX_LOTTO_NUMBER.getValue(), LottoConfig.TOTAL_LOTTO_NUMBER.getValue());
            lottos.add(new Lotto(lottoNumber));
        }
    }

    public int getQuantity() {
        return lottos.size();
    }
}
