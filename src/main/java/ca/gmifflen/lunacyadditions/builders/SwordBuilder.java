package ca.gmifflen.lunacyadditions.builders;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordBuilder {
  private int attackDamage;
  private float attackSpeed;
  private boolean isFireResistant = false;
  private Tier tier;

    public SwordBuilder attackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
        return this;
    }

    public SwordBuilder attackSpeed(float attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }

    public SwordBuilder fireResistant(boolean isFireResistant) {
        this.isFireResistant = isFireResistant;
        return this;
    }

    public SwordBuilder tier( Tier tier) {
        this.tier = tier;
        return this;
    }

    public SwordItem build() {
      Item.Properties properties = new Item.Properties()
          .tab( CreativeModeTab.TAB_COMBAT );
      if( isFireResistant ) {
        properties.fireResistant();
      }
      return new SwordItem( tier, attackDamage, attackSpeed, properties );

    }
}
