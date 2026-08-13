            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IllO1ooiO {
                public static final IllO1ooiO I00iOIl;
                public static final IllO1ooiO I00iiI;
                public static final IllO1ooiO I00iiO;
                public static final IllO1ooiO I00iio;
                public static final IllO1ooiO I00ilI0I1;
                public static final IllO1ooiO[] I00ilO0;

                static {
/* 6 */             IllO1ooiO illO1ooiO = new IllO1ooiO("ON_CONFIGURE", 0);
/* 9 */             I00iOIl = illO1ooiO;
/* 16 */            IllO1ooiO illO1ooiO2 = new IllO1ooiO("ON_CREATE", 1);
/* 19 */            I00iiI = illO1ooiO2;
/* 26 */            IllO1ooiO illO1ooiO3 = new IllO1ooiO("ON_UPGRADE", 2);
/* 29 */            I00iiO = illO1ooiO3;
/* 36 */            IllO1ooiO illO1ooiO4 = new IllO1ooiO("ON_DOWNGRADE", 3);
/* 39 */            I00iio = illO1ooiO4;
/* 46 */            IllO1ooiO illO1ooiO5 = new IllO1ooiO("ON_OPEN", 4);
/* 49 */            I00ilI0I1 = illO1ooiO5;
/* 51 */            IllO1ooiO[] illO1ooiOArr = {illO1ooiO, illO1ooiO2, illO1ooiO3, illO1ooiO4, illO1ooiO5};
/* 55 */            I00ilO0 = illO1ooiOArr;
/* 57 */            ilIII1o11.I00000oIO(illO1ooiOArr);
                }

                public static IllO1ooiO valueOf(String str) {
/* 7 */             return (IllO1ooiO) Enum.valueOf(IllO1ooiO.class, str);
                }

                public static IllO1ooiO[] values() {
/* 7 */             return (IllO1ooiO[]) I00ilO0.clone();
                }
            }
