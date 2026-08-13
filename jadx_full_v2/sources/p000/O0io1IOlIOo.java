            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0io1IOlIOo {
                public static final O0io1IOlIOo I00iOIl;
                public static final O0io1IOlIOo[] I00iiI;

                static {
/* 6 */             O0io1IOlIOo o0io1IOlIOo = new O0io1IOlIOo("Horizontal", 0);
/* 9 */             I00iOIl = o0io1IOlIOo;
/* 19 */            O0io1IOlIOo[] o0io1IOlIOoArr = {o0io1IOlIOo, new O0io1IOlIOo("Vertical", 1)};
/* 23 */            I00iiI = o0io1IOlIOoArr;
/* 25 */            ilIII1o11.I00000oIO(o0io1IOlIOoArr);
                }

                public static O0io1IOlIOo valueOf(String str) {
/* 7 */             return (O0io1IOlIOo) Enum.valueOf(O0io1IOlIOo.class, str);
                }

                public static O0io1IOlIOo[] values() {
/* 7 */             return (O0io1IOlIOo[]) I00iiI.clone();
                }
            }
