            package org.chromium.support_lib_boundary;

            import android.content.Context;
            import android.webkit.WebView;
            import java.lang.annotation.ElementType;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.annotation.Target;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.function.BiConsumer;
            import java.util.function.Consumer;
            import p000.I000II;
            import p000.IlIi0I0;
            
            public interface WebViewBuilderBoundaryInterface {

                @Retention(RetentionPolicy.SOURCE)
                public @interface Baseline {
                    public static final int DEFAULT = 0;
                }

                public static class Config implements Consumer<BiConsumer<Integer, Object>> {
                    public String profileName;
                    public boolean restrictJavascriptInterface;
                    public int baseline = 0;
                    public final ArrayList I00000oIO = new ArrayList();
                    public final LinkedHashMap I00000oOI = new LinkedHashMap();
                    public final ArrayList I0000Il00O = new ArrayList();

                    @Override
                    public void accept(BiConsumer<Integer, Object> biConsumer) {
/* 12 */                biConsumer.accept(0, Integer.valueOf(this.baseline));
/* 26 */                biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
/* 53 */                biConsumer.accept(1, new Object[]{this.I00000oIO, new ArrayList(this.I00000oOI.keySet()), this.I0000Il00O});
/* 58 */                if (this.profileName != null) {
/* 67 */                    biConsumer.accept(3, this.profileName);
                        }
                    }

                    public void addJavascriptInterface(Object obj, String str, List<String> list) {
/* 1 */                 LinkedHashMap linkedHashMap = this.I00000oOI;
/* 7 */                 if (linkedHashMap.containsKey(str)) {
/* 33 */                    I000II.I000iOII(IlIi0I0.I000lI("A duplicate JavaScript interface was provided for \"", str, "\""));
/* 215 */                   return;
                        }
/* 11 */                this.I00000oIO.add(obj);
/* 16 */                linkedHashMap.put(str, Boolean.TRUE);
/* 21 */                this.I0000Il00O.add(list);
                    }
                }

                @Target({ElementType.TYPE_USE})
                @Retention(RetentionPolicy.SOURCE)
                public @interface ConfigField {
                    public static final int BASELINE = 0;
                    public static final int JAVASCRIPT_INTERFACE = 1;
                    public static final int PROFILE_NAME = 3;
                    public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
                }

                void applyTo(WebView webView, Consumer<BiConsumer<Integer, Object>> consumer);

                WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
            }
