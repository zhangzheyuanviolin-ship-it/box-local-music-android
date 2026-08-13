            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Oili0O
            public final class Iol01oi1o {
                public static final Iol01iIilI Companion;
                public static final O0ioIllo0i1 I00iOIl;
                public static final Iol01oi1o[] I00iiI;

                static {
/* 25 */            Iol01oi1o[] iol01oi1oArr = {new Iol01oi1o("None", 0), new Iol01oi1o("ThisServer", 1), new Iol01oi1o("AllServers", 2)};
/* 29 */            I00iiI = iol01oi1oArr;
/* 31 */            ilIII1o11.I00000oIO(iol01oi1oArr);
/* 39 */            Companion = new Iol01iIilI();
/* 54 */            I00iOIl = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new Iloi111(15));
                }

                public static Iol01oi1o valueOf(String str) {
/* 7 */             return (Iol01oi1o) Enum.valueOf(Iol01oi1o.class, str);
                }

                public static Iol01oi1o[] values() {
/* 7 */             return (Iol01oi1o[]) I00iiI.clone();
                }
            }
