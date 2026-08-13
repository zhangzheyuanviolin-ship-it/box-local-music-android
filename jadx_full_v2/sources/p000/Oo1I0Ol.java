            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oo1I0Ol {
                public static final Oo1I0Ol[] I00iOIl;

                static {
/* 49 */            Oo1I0Ol[] oo1I0OlArr = {new Oo1I0Ol("SUNFLOWER", 0), new Oo1I0Ol("DAISY", 1), new Oo1I0Ol("ROSE", 2), new Oo1I0Ol("SPECIAL", 3), new Oo1I0Ol("WATERING_CAN", 4), new Oo1I0Ol("SCYTHE", 5)};
/* 53 */            I00iOIl = oo1I0OlArr;
/* 55 */            ilIII1o11.I00000oIO(oo1I0OlArr);
                }

                public static Oo1I0Ol valueOf(String str) {
/* 7 */             return (Oo1I0Ol) Enum.valueOf(Oo1I0Ol.class, str);
                }

                public static Oo1I0Ol[] values() {
/* 7 */             return (Oo1I0Ol[]) I00iOIl.clone();
                }
            }
