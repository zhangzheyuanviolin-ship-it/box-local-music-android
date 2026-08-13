            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class lOoI1o0 {
                public static final lOoI1o0 I00iOIl;
                public static final lOoI1o0[] I00iiI;

                static {
/* 6 */             lOoI1o0 looi1o0 = new lOoI1o0("DEFAULT", 0);
/* 9 */             I00iOIl = looi1o0;
/* 31 */            I00iiI = new lOoI1o0[]{looi1o0, new lOoI1o0("SIGNED", 1), new lOoI1o0("FIXED", 2)};
                }

                public static lOoI1o0[] values() {
/* 7 */             return (lOoI1o0[]) I00iiI.clone();
                }
            }
