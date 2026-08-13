            package p000;

            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            
            public final class IOiIll1 implements OiIoOil {
                public final int I00000oIO;
                public Ill0oOi0 I00000oOI;

                public IOiIll1(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Bundle I00000oIO() {
                    Ill1OlOOl ill1OlOOlI00100o1O0lo;
                    switch (this.I00000oIO) {
                        case 0:
/* 33 */                    Ill0oOi0 ill0oOi0 = this.I00000oOI;
/* 37 */                    Bundle bundle = new Bundle();
/* 40 */                    IOiO1IOloOiO iOiO1IOloOiO = ill0oOi0.I00ioIO;
/* 42 */                    iOiO1IOloOiO.getClass();
/* 47 */                    LinkedHashMap linkedHashMap = iOiO1IOloOiO.I00000oOI;
/* 58 */                    bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
/* 74 */                    bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
/* 86 */                    bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iOiO1IOloOiO.I0000O));
/* 98 */                    bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iOiO1IOloOiO.I000II));
/* 101 */                   return bundle;
                        default:
/* 6 */                     Ill0oOi0 ill0oOi02 = this.I00000oOI;
/* 18 */                    do {
/* 8 */                         ill1OlOOlI00100o1O0lo = ill0oOi02.I00100o1O0lo();
/* 12 */                        O0oOi0I o0oOi0I = O0oOi0I.I00iOIl;
/* 18 */                    } while (Ill0oOi0.I0010I0i(ill1OlOOlI00100o1O0lo));
/* 24 */                    ill0oOi02.I00oOio10iI1.I010iIIOlo(O0oOOiI0.ON_STOP);
/* 29 */                    return new Bundle();
                    }
                }
            }
