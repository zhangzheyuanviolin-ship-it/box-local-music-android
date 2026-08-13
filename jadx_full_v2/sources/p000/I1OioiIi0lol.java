            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1OioiIi0lol {
                public static final I1OioiIi0lol I00iOIl;
                public static final I1OioiIi0lol I00iiI;
                public static final I1OioiIi0lol I00iiO;
                public static final I1OioiIi0lol[] I00iio;

                static {
/* 6 */             I1OioiIi0lol i1OioiIi0lol = new I1OioiIi0lol("LEFT", 0);
/* 9 */             I00iOIl = i1OioiIi0lol;
/* 16 */            I1OioiIi0lol i1OioiIi0lol2 = new I1OioiIi0lol("CENTER", 1);
/* 19 */            I00iiI = i1OioiIi0lol2;
/* 26 */            I1OioiIi0lol i1OioiIi0lol3 = new I1OioiIi0lol("RIGHT", 2);
/* 29 */            I00iiO = i1OioiIi0lol3;
/* 31 */            I1OioiIi0lol[] i1OioiIi0lolArr = {i1OioiIi0lol, i1OioiIi0lol2, i1OioiIi0lol3};
/* 35 */            I00iio = i1OioiIi0lolArr;
/* 37 */            ilIII1o11.I00000oIO(i1OioiIi0lolArr);
                }

                public static I1OioiIi0lol valueOf(String str) {
/* 7 */             return (I1OioiIi0lol) Enum.valueOf(I1OioiIi0lol.class, str);
                }

                public static I1OioiIi0lol[] values() {
/* 7 */             return (I1OioiIi0lol[]) I00iio.clone();
                }
            }
