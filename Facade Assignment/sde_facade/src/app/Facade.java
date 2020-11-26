package app;

public class Facade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public Facade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie (){
        this.popper.on();
        this.popper.pop();
        this.lights.dim(1);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amp.on();
        this.amp.setDvd(dvd);
        this.amp.setSurroundSound();
        this.amp.setVolume(5);
        this.dvd.on();
        this.dvd.play("How to get away with murder");

    }
    public void readyToWatch(){
        this.popper.off();
        this.lights.off();
        this.screen.up();
        this.projector.off();
        this.amp.off();
        this.dvd.stop();
        this.dvd.eject();
        this.dvd.off();
    }

    public void listenToMusic(){
        this.lights.on();
        this.amp.on();
        this.amp.setVolume(5);
        this.amp.setCd(cd);
        this.amp.setStereoSound();
        this.cd.on();
        this.cd.play("Dear mama");

    }

    public void finishedListening(){
        this.amp.off();
        this.amp.setCd(cd);
        this.cd.eject();
        this.cd.off();
    }


    public void listenToRadio(){
        this.tuner.on();
        this.tuner.setFrequency(32);
        this.amp.on();
        this.amp.setVolume(5);
        this.amp.setTuner(tuner);

    }
    public void finishedRadio() {
        this.tuner.off();
        this.amp.off();
    }
}
