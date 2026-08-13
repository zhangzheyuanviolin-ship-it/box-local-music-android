            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ol100II1 {
                public static final Ol100II1 I00iOIl;
                public static final Ol100II1 I00iiI;
                public static final Ol100II1[] I00iiO;

                static {
/* 6 */             Ol100II1 ol100II1 = new Ol100II1("THUMB", 0);
/* 9 */             I00iOIl = ol100II1;
/* 16 */            Ol100II1 ol100II12 = new Ol100II1("TRACK", 1);
/* 19 */            I00iiI = ol100II12;
/* 21 */            Ol100II1[] ol100II1Arr = {ol100II1, ol100II12};
/* 25 */            I00iiO = ol100II1Arr;
/* 27 */            ilIII1o11.I00000oIO(ol100II1Arr);
                }

                public static Ol100II1 valueOf(String str) {
/* 7 */             return (Ol100II1) Enum.valueOf(Ol100II1.class, str);
                }

                public static Ol100II1[] values() {
/* 7 */             return (Ol100II1[]) I00iiO.clone();
                }
            }
