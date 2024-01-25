package ca.gmifflen.lunacyadditions.builders;

import ca.gmifflen.lunacyadditions.LunacyAdditions;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordBuilder {
  private int attackDamage;
  private float attackSpeed;
  private boolean isFireResistant = false;
  private Tier tier;

  public SwordBuilder attackDamage( int attackDamage ) {
    this.attackDamage = attackDamage - 1;
    return this;

  }

  public SwordBuilder attackSpeed( float attackSpeed ) {
    this.attackSpeed = attackSpeed - 4f;
    return this;

  }

  public SwordBuilder fireResistant( boolean isFireResistant ) {
    this.isFireResistant = isFireResistant;
    return this;

  }

  public SwordBuilder tier( Tier tier ) {
    this.tier = tier;
    return this;

  }

  public SwordItem build() {
    Item.Properties properties = new Item.Properties()
        .tab( LunacyAdditions.LUNACY_ADDITIONS_TAB );
    if( isFireResistant ) {
      properties.fireResistant();

    }
    return new SwordItem( tier, attackDamage, attackSpeed, properties );

  }
}
