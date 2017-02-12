package jug.swarm.swarmdemo.cdi;

import javaslang.control.Try;

import java.security.SecureRandom;
import java.util.function.Supplier;

import javax.inject.Inject;

@SlowGenerator
public class SlowNamesGenerator implements Supplier<String> {

  @Inject
  SecureRandom rnd;

  @Inject
  @Generator
  Supplier<String> namesGenerator;

  @Override
  public String get() {
    if(rnd.nextInt(2) == 0) {
      throw new IllegalStateException("random error");
    }
    Try.run(() -> Thread.sleep(rnd.nextInt(3000)));
    return namesGenerator.get();
  }

}
