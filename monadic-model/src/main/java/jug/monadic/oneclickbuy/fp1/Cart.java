package jug.monadic.oneclickbuy.fp1;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(allParameters=true)
public interface Cart {
	List<Item> items();
}
