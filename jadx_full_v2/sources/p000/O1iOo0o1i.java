            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1iOo0o1i {
                public static final O1iOo0o1i I00iOIl;
                public static final O1iOo0o1i I00iiI;
                public static final O1iOo0o1i[] I00iiO;

                static {
/* 6 */             O1iOo0o1i o1iOo0o1i = new O1iOo0o1i("Width", 0);
/* 9 */             I00iOIl = o1iOo0o1i;
/* 16 */            O1iOo0o1i o1iOo0o1i2 = new O1iOo0o1i("Height", 1);
/* 19 */            I00iiI = o1iOo0o1i2;
/* 21 */            O1iOo0o1i[] o1iOo0o1iArr = {o1iOo0o1i, o1iOo0o1i2};
/* 25 */            I00iiO = o1iOo0o1iArr;
/* 27 */            ilIII1o11.I00000oIO(o1iOo0o1iArr);
                }

                public static O1iOo0o1i valueOf(String str) {
/* 7 */             return (O1iOo0o1i) Enum.valueOf(O1iOo0o1i.class, str);
                }

                public static O1iOo0o1i[] values() {
/* 7 */             return (O1iOo0o1i[]) I00iiO.clone();
                }
            }
