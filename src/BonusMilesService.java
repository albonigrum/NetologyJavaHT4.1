public class BonusMilesService {
    final int BONUS_PARAMETER = 20;

    int calculate(int cost) {
        return cost / BONUS_PARAMETER;
    }
}
