package com.redis.om.spring.search.stream.actions;

import java.lang.reflect.Field;
import java.util.function.Consumer;

import com.redislabs.modules.rejson.Path;

public class ToggleAction<E>  extends BaseAbstractAction implements Consumer<E> {
  public ToggleAction(Field field) {
    super(field);
  }

  @Override
  public void accept(E entity) {
    json.toggle(getKey(entity), Path.of("." + field.getName()));
  }
}
