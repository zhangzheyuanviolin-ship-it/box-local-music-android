            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iiioii1il {
                public static final Iiioii1il I00iOIl;
                public static final Iiioii1il I00iiI;
                public static final Iiioii1il I00iiO;
                public static final Iiioii1il I00iio;
                public static final Iiioii1il[] I00ilI0I1;

                static {
/* 6 */             Iiioii1il iiioii1il = new Iiioii1il("Up", 0);
/* 9 */             I00iOIl = iiioii1il;
/* 16 */            Iiioii1il iiioii1il2 = new Iiioii1il("Drag", 1);
/* 19 */            I00iiI = iiioii1il2;
/* 26 */            Iiioii1il iiioii1il3 = new Iiioii1il("Timeout", 2);
/* 29 */            I00iiO = iiioii1il3;
/* 36 */            Iiioii1il iiioii1il4 = new Iiioii1il("Cancel", 3);
/* 39 */            I00iio = iiioii1il4;
/* 41 */            Iiioii1il[] iiioii1ilArr = {iiioii1il, iiioii1il2, iiioii1il3, iiioii1il4};
/* 45 */            I00ilI0I1 = iiioii1ilArr;
/* 47 */            ilIII1o11.I00000oIO(iiioii1ilArr);
                }

                public static Iiioii1il valueOf(String str) {
/* 7 */             return (Iiioii1il) Enum.valueOf(Iiioii1il.class, str);
                }

                public static Iiioii1il[] values() {
/* 7 */             return (Iiioii1il[]) I00ilI0I1.clone();
                }
            }
