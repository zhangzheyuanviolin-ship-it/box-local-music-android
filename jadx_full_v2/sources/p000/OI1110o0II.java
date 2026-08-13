            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OI1110o0II {
                public static final OI1110o0II I00iOIl;
                public static final OI1110o0II[] I00iiI;

                static {
/* 6 */             OI1110o0II oI1110o0II = new OI1110o0II("Default", 0);
/* 9 */             I00iOIl = oI1110o0II;
/* 27 */            OI1110o0II[] oI1110o0IIArr = {oI1110o0II, new OI1110o0II("UserInput", 1), new OI1110o0II("PreventUserInput", 2)};
/* 31 */            I00iiI = oI1110o0IIArr;
/* 33 */            ilIII1o11.I00000oIO(oI1110o0IIArr);
                }

                public static OI1110o0II valueOf(String str) {
/* 7 */             return (OI1110o0II) Enum.valueOf(OI1110o0II.class, str);
                }

                public static OI1110o0II[] values() {
/* 7 */             return (OI1110o0II[]) I00iiI.clone();
                }
            }
