package se.aresiel.ccatest;

import dev.onyxstudios.cca.api.v3.component.Component;
import net.minecraft.nbt.CompoundTag;


public class RandomIntComponent implements IntComponent {

    private int value = (int) (Math.random()*100);

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public void increment() {
        this.value++;
    }

    @Override
    public void readFromNbt(CompoundTag tag) {
        this.value = tag.getInt("randint");
    }

    @Override
    public void writeToNbt(CompoundTag tag) {
        tag.putInt("randint", this.value);
    }
}
