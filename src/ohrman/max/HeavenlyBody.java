package ohrman.max;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final Double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, Double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

}
