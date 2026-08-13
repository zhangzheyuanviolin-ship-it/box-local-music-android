            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class il0OlIOI {
                public static final il0OlIOI I00iOIl;
                public static final il0OlIOI[] I00iiI;

                static {
/* 6 */             il0OlIOI il0olioi = new il0OlIOI("DEFAULT", 0);
/* 9 */             I00iOIl = il0olioi;
/* 31 */            I00iiI = new il0OlIOI[]{il0olioi, new il0OlIOI("SIGNED", 1), new il0OlIOI("FIXED", 2)};
                }

                public static il0OlIOI[] values() {
/* 7 */             return (il0OlIOI[]) I00iiI.clone();
                }
            }
