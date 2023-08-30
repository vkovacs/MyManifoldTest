package ManifoldTest.extensions.java.lang.Double;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.example.Main;

import java.util.Locale;

@Extension
public class MyDoubleExtension {
  @Extension
    public static String asJsonString(@This Double thiz) {
      return String.format(Locale.US, "%.2f", thiz);
    }
}