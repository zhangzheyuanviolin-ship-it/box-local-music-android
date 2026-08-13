            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class i01lIlOi {
                public static final i01lIlOi I00iiO;
                public static final i01lIlOi I00iio;
                public static final i01lIlOi I00ilI0I1;
                public static final i01lIlOi I00ilO0;
                public static final i01lIlOi[] I00io1l;
                public static final Il0li01oOil I00ioIO;
                public final char I00iOIl;
                public final char I00iiI;

                static {
/* 10 */            i01lIlOi i01liloi = new i01lIlOi("OBJ", 0, '{', '}');
/* 13 */            I00iiO = i01liloi;
/* 24 */            i01lIlOi i01liloi2 = new i01lIlOi("LIST", 1, '[', ']');
/* 27 */            I00iio = i01liloi2;
/* 34 */            i01lIlOi i01liloi3 = new i01lIlOi("MAP", 2, '{', '}');
/* 37 */            I00ilI0I1 = i01liloi3;
/* 44 */            i01lIlOi i01liloi4 = new i01lIlOi("POLY_OBJ", 3, '[', ']');
/* 47 */            I00ilO0 = i01liloi4;
/* 49 */            i01lIlOi[] i01liloiArr = {i01liloi, i01liloi2, i01liloi3, i01liloi4};
/* 53 */            I00io1l = i01liloiArr;
/* 59 */            I00ioIO = ilIII1o11.I00000oIO(i01liloiArr);
                }

                public i01lIlOi(String str, int i, char c, char c2) {
/* 4 */             this.I00iOIl = c;
/* 6 */             this.I00iiI = c2;
                }

                public static i01lIlOi valueOf(String str) {
/* 7 */             return (i01lIlOi) Enum.valueOf(i01lIlOi.class, str);
                }

                public static i01lIlOi[] values() {
/* 7 */             return (i01lIlOi[]) I00io1l.clone();
                }
            }
