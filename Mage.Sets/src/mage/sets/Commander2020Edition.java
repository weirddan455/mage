package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class Commander2020Edition extends ExpansionSet {

    private static final List<String> mutateNames = Arrays.asList(
            "Archipelagore",
            "Auspicious Starrix",
            "Brokkos, Apex of Forever",
            "Cavern Whisperer",
            "Chittering Harvester",
            "Cloudpiercer",
            "Cubwarden",
            "Dirge Bat",
            "Dreamtail Heron",
            "Everquill Phoenix",
            "Gemrazer",
            "Glowstone Recluse",
            "Huntmaster Liger",
            "Illuna, Apex of Wishes",
            "Insatiable Hemophage",
            "Lore Drakkis",
            "Migratory Greathorn",
            "Mindleecher",
            "Nethroi, Apex of Death",
            "Otrimi, the Ever-Playful",
            "Pouncing Shoreshark",
            "Sea-Dasher Octopus",
            "Snapdax, Apex of the Hunt",
            "Souvenir Snatcher",
            "Trumpeting Gnarr",
            "Vadrok, Apex of Thunder"
    );

    private static final Commander2020Edition instance = new Commander2020Edition();

    public static Commander2020Edition getInstance() {
        return instance;
    }

    private Commander2020Edition() {
        super("Commander 2020 Edition", "C20", ExpansionSet.buildDate(2020, 4, 24), SetType.SUPPLEMENTAL);
        this.blockName = "Command Zone";
        this.hasBasicLands = false; // remove when basics are available

        cards.add(new SetCardInfo("Ajani Unyielding", 201, Rarity.MYTHIC, mage.cards.a.AjaniUnyielding.class));
        cards.add(new SetCardInfo("Alesha, Who Smiles at Death", 143, Rarity.RARE, mage.cards.a.AleshaWhoSmilesAtDeath.class));
        cards.add(new SetCardInfo("Animist's Awakening", 166, Rarity.RARE, mage.cards.a.AnimistsAwakening.class));
        cards.add(new SetCardInfo("Arcane Signet", 237, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Astral Drift", 76, Rarity.RARE, mage.cards.a.AstralDrift.class));
        cards.add(new SetCardInfo("Avenging Huntbonder", 22, Rarity.RARE, mage.cards.a.AvengingHuntbonder.class));
        cards.add(new SetCardInfo("Boneyard Mycodrax", 40, Rarity.RARE, mage.cards.b.BoneyardMycodrax.class));
        cards.add(new SetCardInfo("Brallin, Skyshark Rider", 4, Rarity.MYTHIC, mage.cards.b.BrallinSkysharkRider.class));
        cards.add(new SetCardInfo("Call the Coppercoats", 23, Rarity.RARE, mage.cards.c.CallTheCoppercoats.class));
        cards.add(new SetCardInfo("Cazur, Ruthless Stalker", 5, Rarity.MYTHIC, mage.cards.c.CazurRuthlessStalker.class));
        cards.add(new SetCardInfo("Command Tower", 264, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 240, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Crop Rotation", 169, Rarity.COMMON, mage.cards.c.CropRotation.class));
        cards.add(new SetCardInfo("Cryptic Trilobite", 21, Rarity.RARE, mage.cards.c.CrypticTrilobite.class));
        cards.add(new SetCardInfo("Curious Herd", 59, Rarity.RARE, mage.cards.c.CuriousHerd.class));
        cards.add(new SetCardInfo("Daring Fiendbonder", 41, Rarity.RARE, mage.cards.d.DaringFiendbonder.class));
        cards.add(new SetCardInfo("Deadly Tempest", 131, Rarity.RARE, mage.cards.d.DeadlyTempest.class));
        cards.add(new SetCardInfo("Deflecting Swat", 50, Rarity.RARE, mage.cards.d.DeflectingSwat.class));
        cards.add(new SetCardInfo("Dismantling Wave", 25, Rarity.RARE, mage.cards.d.DismantlingWave.class));
        cards.add(new SetCardInfo("Dredge the Mire", 43, Rarity.RARE, mage.cards.d.DredgeTheMire.class));
        cards.add(new SetCardInfo("Eternal Dragon", 88, Rarity.RARE, mage.cards.e.EternalDragon.class));
        cards.add(new SetCardInfo("Fierce Guardianship", 35, Rarity.RARE, mage.cards.f.FierceGuardianship.class));
        cards.add(new SetCardInfo("Flawless Maneuver", 26, Rarity.RARE, mage.cards.f.FlawlessManeuver.class));
        cards.add(new SetCardInfo("Fluctuator", 241, Rarity.RARE, mage.cards.f.Fluctuator.class));
        cards.add(new SetCardInfo("Glademuse", 60, Rarity.RARE, mage.cards.g.Glademuse.class));
        cards.add(new SetCardInfo("Herald of the Forgotten", 27, Rarity.RARE, mage.cards.h.HeraldOfTheForgotten.class));
        cards.add(new SetCardInfo("Jace, Architect of Thought", 114, Rarity.MYTHIC, mage.cards.j.JaceArchitectOfThought.class));
        cards.add(new SetCardInfo("Jirina Kudro", 8, Rarity.MYTHIC, mage.cards.j.JirinaKudro.class));
        cards.add(new SetCardInfo("Kathril, Aspect Warper", 10, Rarity.MYTHIC, mage.cards.k.KathrilAspectWarper.class));
        cards.add(new SetCardInfo("Lifecrafter's Bestiary", 244, Rarity.RARE, mage.cards.l.LifecraftersBestiary.class));
        cards.add(new SetCardInfo("Masked Admirers", 163, Rarity.RARE, mage.cards.m.MaskedAdmirers.class));
        cards.add(new SetCardInfo("Nahiri, the Harbinger", 223, Rarity.MYTHIC, mage.cards.n.NahiriTheHarbinger.class));
        cards.add(new SetCardInfo("Netherborn Altar", 45, Rarity.RARE, mage.cards.n.NetherbornAltar.class));
        cards.add(new SetCardInfo("Nikara, Lair Scavenger", 3, Rarity.MYTHIC, mage.cards.n.NikaraLairScavenger.class));
        cards.add(new SetCardInfo("Nissa, Steward of Elements", 224, Rarity.MYTHIC, mage.cards.n.NissaStewardOfElements.class));
        cards.add(new SetCardInfo("Obscuring Haze", 61, Rarity.RARE, mage.cards.o.ObscuringHaze.class));
        cards.add(new SetCardInfo("Otrimi, the Ever-Playful", 12, Rarity.COMMON, mage.cards.o.OtrimiTheEverPlayful.class));
        cards.add(new SetCardInfo("Path of Ancestry", 298, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Rashmi, Eternities Crafter", 229, Rarity.RARE, mage.cards.r.RashmiEternitiesCrafter.class));
        cards.add(new SetCardInfo("Shabraz, the Skyshark", 14, Rarity.MYTHIC, mage.cards.s.ShabrazTheSkyshark.class));
        cards.add(new SetCardInfo("Shared Animosity", 158, Rarity.RARE, mage.cards.s.SharedAnimosity.class));
        cards.add(new SetCardInfo("Silent Arbiter", 250, Rarity.RARE, mage.cards.s.SilentArbiter.class));
        cards.add(new SetCardInfo("Silvar, Devourer of the Free", 15, Rarity.MYTHIC, mage.cards.s.SilvarDevourerOfTheFree.class));
        cards.add(new SetCardInfo("Sol Ring", 252, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Souvenir Snatcher", 38, Rarity.RARE, mage.cards.s.SouvenirSnatcher.class));
        cards.add(new SetCardInfo("The Locust God", 219, Rarity.MYTHIC, mage.cards.t.TheLocustGod.class));
        cards.add(new SetCardInfo("Trynn, Champion of Freedom", 1, Rarity.MYTHIC, mage.cards.t.TrynnChampionOfFreedom.class));
        cards.add(new SetCardInfo("Villainous Wealth", 233, Rarity.RARE, mage.cards.v.VillainousWealth.class));

        cards.removeIf(setCardInfo -> mutateNames.contains(setCardInfo.getName())); // remove when mutate is implemented
    }
}