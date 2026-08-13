            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1IiloI0il {
                public static final O1IiloI0il I00iOIl;
                public static final O1IiloI0il I00iiI;
                public static final O1IiloI0il I00iiO;
                public static final O1IiloI0il[] I00iio;

                static {
/* 6 */             O1IiloI0il o1IiloI0il = new O1IiloI0il("IsPlacedInLookahead", 0);
/* 9 */             I00iOIl = o1IiloI0il;
/* 16 */            O1IiloI0il o1IiloI0il2 = new O1IiloI0il("IsPlacedInApproach", 1);
/* 19 */            I00iiI = o1IiloI0il2;
/* 26 */            O1IiloI0il o1IiloI0il3 = new O1IiloI0il("IsNotPlaced", 2);
/* 29 */            I00iiO = o1IiloI0il3;
/* 31 */            O1IiloI0il[] o1IiloI0ilArr = {o1IiloI0il, o1IiloI0il2, o1IiloI0il3};
/* 35 */            I00iio = o1IiloI0ilArr;
/* 37 */            ilIII1o11.I00000oIO(o1IiloI0ilArr);
                }

                public static O1IiloI0il valueOf(String str) {
/* 7 */             return (O1IiloI0il) Enum.valueOf(O1IiloI0il.class, str);
                }

                public static O1IiloI0il[] values() {
/* 7 */             return (O1IiloI0il[]) I00iio.clone();
                }
            }
