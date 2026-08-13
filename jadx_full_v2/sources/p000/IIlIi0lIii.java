            package p000;
            
            public final class IIlIi0lIii implements lo11I0lO {
                public static final IIlIi0lIii I00iiO;
                public static final IIlIi0lIii I00iio;
                public static final IIlIi0lIii I00ilI0I1;
                public static final IIlIi0lIii I00ilO0;
                public static final IIlIi0lIii I00io1l;
                public final int I00iOIl;
                public final String I00iiI;

                static {
/* 5 */             int i = 1;
/* 9 */             I00iiO = new IIlIi0lIii("TINK", i);
/* 18 */            I00iio = new IIlIi0lIii("CRUNCHY", i);
/* 27 */            I00ilI0I1 = new IIlIi0lIii("NO_PREFIX", i);
/* 33 */            int i2 = 2;
/* 37 */            I00ilO0 = new IIlIi0lIii("FLAT", i2);
/* 46 */            I00io1l = new IIlIi0lIii("HALF_OPENED", i2);
                }

                public IIlIi0lIii(String str, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = str;
                }

                public String toString() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iiI;
                    switch (i) {
                        case 1:
                        case 2:
/* 13 */                    return str;
                        default:
/* 8 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
/* 20 */            throw new llIIooI0iolO(this.I00iiI, 25);
                }
            }
