            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Olilii0i {
                public static final Olilii0i I00iOIl;
                public static final Olilii0i I00iiI;
                public static final Olilii0i I00iiO;
                public static final Olilii0i[] I00iio;

                static {
/* 6 */             Olilii0i olilii0i = new Olilii0i("WITHOUT_FEATURE_COMBO", 0);
/* 9 */             I00iOIl = olilii0i;
/* 16 */            Olilii0i olilii0i2 = new Olilii0i("WITH_FEATURE_COMBO", 1);
/* 19 */            I00iiI = olilii0i2;
/* 26 */            Olilii0i olilii0i3 = new Olilii0i("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
/* 29 */            I00iiO = olilii0i3;
/* 31 */            Olilii0i[] olilii0iArr = {olilii0i, olilii0i2, olilii0i3};
/* 35 */            I00iio = olilii0iArr;
/* 37 */            ilIII1o11.I00000oIO(olilii0iArr);
                }

                public static Olilii0i valueOf(String str) {
/* 7 */             return (Olilii0i) Enum.valueOf(Olilii0i.class, str);
                }

                public static Olilii0i[] values() {
/* 7 */             return (Olilii0i[]) I00iio.clone();
                }
            }
