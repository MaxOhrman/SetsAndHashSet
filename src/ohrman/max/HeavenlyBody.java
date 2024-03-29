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

    // Implementing our own equal method by overriding Java equals that has the body "return (this == obj);"
    // We now compare names of objects instead
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if(obj == null && (obj.getClass() !=this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }


    // We generate the hashcode for bucket comparison by getting the strings hashcode and adding a small
    // enough number to not cause trouble with the maximum size of Integer.MAX_VALUE
    // needed for making sure equal objects has equal hashCode.
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }


}
