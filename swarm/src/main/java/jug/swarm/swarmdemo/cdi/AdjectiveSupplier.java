package jug.swarm.swarmdemo.cdi;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Adjectives @ApplicationScoped
public class AdjectiveSupplier implements Supplier<String> {

  @Inject
  SecureRandom rnd;

  final List<String> adjectives = Arrays.asList("admiring",
      "adoring",
      "affectionate",
      "agitated",
      "amazing",
      "angry",
      "awesome",
      "blissful",
      "boring",
      "brave",
      "clever",
      "cocky",
      "compassionate",
      "competent",
      "condescending",
      "confident",
      "cranky",
      "dazzling",
      "determined",
      "distracted",
      "dreamy",
      "eager",
      "ecstatic",
      "elastic",
      "elated",
      "elegant",
      "eloquent",
      "epic",
      "fervent",
      "festive",
      "flamboyant",
      "focused",
      "friendly",
      "frosty",
      "gallant",
      "gifted",
      "goofy",
      "gracious",
      "happy",
      "hardcore",
      "heuristic",
      "hopeful",
      "hungry",
      "infallible",
      "inspiring",
      "jolly",
      "jovial",
      "keen",
      "kickass",
      "kind",
      "laughing",
      "loving",
      "lucid",
      "mystifying",
      "modest",
      "musing",
      "naughty",
      "nervous",
      "nifty",
      "nostalgic",
      "objective",
      "optimistic",
      "peaceful",
      "pedantic",
      "pensive",
      "practical",
      "priceless",
      "quirky",
      "quizzical",
      "relaxed",
      "reverent",
      "romantic",
      "sad",
      "serene",
      "sharp",
      "silly",
      "sleepy",
      "stoic",
      "stupefied",
      "suspicious",
      "tender",
      "thirsty",
      "trusting",
      "unruffled",
      "upbeat",
      "vibrant",
      "vigilant",
      "wizardly",
      "wonderful",
      "xenodochial",
      "youthful",
      "zealous",
      "zen");

  @Override
  public String get() {
    return adjectives.get(rnd.nextInt(adjectives.size()));
  }

}
