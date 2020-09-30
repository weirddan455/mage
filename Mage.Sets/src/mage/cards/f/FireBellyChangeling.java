
package mage.cards.f;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.LimitedTimesPerTurnActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.ChangelingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Zone;

/**
 *
 * @author FenrisulfrX
 */
public final class FireBellyChangeling extends CardImpl {

    public FireBellyChangeling(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{1}{R}");
        this.subtype.add(SubType.SHAPESHIFTER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // Changeling
        this.setIsAllCreatureTypes(true);
        this.addAbility(ChangelingAbility.getInstance());

        // {R}: Fire-Belly Changeling gets +1/+0 until end of turn. Activate this ability no more than twice each turn.
        this.addAbility(new LimitedTimesPerTurnActivatedAbility(Zone.BATTLEFIELD,
                new BoostSourceEffect(1, 0, Duration.EndOfTurn), new ManaCostsImpl("{R}"), 2));
    }

    public FireBellyChangeling(final FireBellyChangeling card) {
        super(card);
    }

    @Override
    public FireBellyChangeling copy() {
        return new FireBellyChangeling(this);
    }
}
