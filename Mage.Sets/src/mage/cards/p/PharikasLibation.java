package mage.cards.p;

import mage.abilities.effects.common.SacrificeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.target.common.TargetOpponent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class PharikasLibation extends CardImpl {

    public PharikasLibation(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{2}{B}");

        // Choose one —
        // • Target opponent sacrifices a creature.
        this.getSpellAbility().addEffect(new SacrificeEffect(
                StaticFilters.FILTER_PERMANENT_CREATURE, 1, "Target opponent"
        ));
        this.getSpellAbility().addTarget(new TargetOpponent());

        // • Target opponent sacrifices an enchantment.
        this.getSpellAbility().addEffect(new SacrificeEffect(
                StaticFilters.FILTER_ENCHANTMENT_PERMANENT, 1, "Target opponent"
        ));
        this.getSpellAbility().addTarget(new TargetOpponent());
    }

    private PharikasLibation(final PharikasLibation card) {
        super(card);
    }

    @Override
    public PharikasLibation copy() {
        return new PharikasLibation(this);
    }
}