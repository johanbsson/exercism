/**
 * Created by johan on 2017-02-18.
 */
public class SpaceAge {
    long age = 0;
    long seconds;
    float earthYears;
    public SpaceAge(long seconds) {
       this.seconds = seconds;
        earthYears = seconds /(float)31557600;
    }

    public long getSeconds() {
        return seconds;
    }

    public float onEarth() {
        //Earth: orbital period 365.25 Earth days, or 31557600 seconds
        return earthYears;
    }

    public float onMercury() {
        //Mercury: orbital period 0.2408467 Earth years
        return earthYears/0.2408467f;
    }

    public float onVenus() {
        //Venus: orbital period 0.61519726 Earth years
        return earthYears/0.61519726f;
    }

    public float onMars() {
        //Mars: orbital period 1.8808158 Earth years
        return earthYears/1.8808158f;
    }

    public float onJupiter() {
        //Jupiter: orbital period 11.862615 Earth years
        return earthYears/11.862615f;
    }

    public float onSaturn() {
        //Saturn: orbital period 29.447498 Earth years
        return earthYears/29.447498f;
    }

    public float onUranus() {
        //Uranus: orbital period 84.016846 Earth years
        return earthYears/84.016846f;
    }

    public float onNeptune() {
        //Neptune: orbital period 164.79132 Earth years
        return earthYears/164.79132f;
    }
}
