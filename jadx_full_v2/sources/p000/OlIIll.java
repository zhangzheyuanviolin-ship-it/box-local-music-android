            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public class OlIIll {
                public static final OlIIll I00iiI;
                public static final OlIIll I00iiO;
                public static final OlIIll I00iio;
                public static final OlIIlioi0O I00ilI0I1;
                public static final OlIIll[] I00ilO0;
                public final Object I00iOIl;

                static {
/* 7 */             OlIIll olIIll = new OlIIll("NULL", 0, null);
/* 10 */            I00iiI = olIIll;
/* 22 */            OlIIll olIIll2 = new OlIIll("INDEX", 1, -1);
/* 25 */            I00iiO = olIIll2;
/* 34 */            OlIIll olIIll3 = new OlIIll("FALSE", 2, Boolean.FALSE);
/* 37 */            I00iio = olIIll3;
/* 44 */            OlIIlioi0O olIIlioi0O = new OlIIlioi0O("MAP_GET_OR_DEFAULT", 3, null);
/* 47 */            I00ilI0I1 = olIIlioi0O;
/* 50 */            OlIIll[] olIIllArr = {olIIll, olIIll2, olIIll3, olIIlioi0O};
/* 60 */            I00ilO0 = olIIllArr;
/* 62 */            ilIII1o11.I00000oIO(olIIllArr);
                }

                public OlIIll(String str, int i, Object obj) {
/* 4 */             this.I00iOIl = obj;
                }

                public static OlIIll valueOf(String str) {
/* 7 */             return (OlIIll) Enum.valueOf(OlIIll.class, str);
                }

                public static OlIIll[] values() {
/* 7 */             return (OlIIll[]) I00ilO0.clone();
                }
            }
