            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Oili0O
            public final class Iiol0ol0oI {
                public static final Iiol0io0I0 Companion;
                public static final O0ioIllo0i1 I00iOIl;
                public static final Iiol0ol0oI I00iiI;
                public static final Iiol0ol0oI[] I00iiO;

                static {
/* 6 */             Iiol0ol0oI iiol0ol0oI = new Iiol0ol0oI("Accept", 0);
/* 9 */             I00iiI = iiol0ol0oI;
/* 27 */            Iiol0ol0oI[] iiol0ol0oIArr = {iiol0ol0oI, new Iiol0ol0oI("Decline", 1), new Iiol0ol0oI("Cancel", 2)};
/* 31 */            I00iiO = iiol0ol0oIArr;
/* 33 */            ilIII1o11.I00000oIO(iiol0ol0oIArr);
/* 41 */            Companion = new Iiol0io0I0();
/* 56 */            I00iOIl = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new IOlIlo1(21));
                }

                public static Iiol0ol0oI valueOf(String str) {
/* 7 */             return (Iiol0ol0oI) Enum.valueOf(Iiol0ol0oI.class, str);
                }

                public static Iiol0ol0oI[] values() {
/* 7 */             return (Iiol0ol0oI[]) I00iiO.clone();
                }
            }
