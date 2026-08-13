            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class iii1Ol {
                public static final iii1Ol I00iOIl;
                public static final iii1Ol[] I00iiI;

                static {
/* 6 */             iii1Ol iii1ol = new iii1Ol("DEFAULT", 0);
/* 9 */             I00iOIl = iii1ol;
/* 31 */            I00iiI = new iii1Ol[]{iii1ol, new iii1Ol("SIGNED", 1), new iii1Ol("FIXED", 2)};
                }

                public static iii1Ol[] values() {
/* 7 */             return (iii1Ol[]) I00iiI.clone();
                }
            }
