            package p000;
            
            public final class IO0o1O0li0 implements OIOi0l1il {
                public static final IO0o1O0li0 I00iiO;
                public static final IO0o1O0li0 I00iio;
                public static final IO0o1O0li0 I00ilI0I1;
                public static final IO0o1O0li0 I00ilO0;
                public static final IO0o1O0li0 I00io1l;
                public static final IO0o1O0li0 I00ioIO;
                public final int I00iOIl;
                public final String I00iiI;

                static {
/* 5 */             int i = 0;
/* 9 */             I00iiO = new IO0o1O0li0("TINK", i);
/* 18 */            I00iio = new IO0o1O0li0("CRUNCHY", i);
/* 27 */            I00ilI0I1 = new IO0o1O0li0("NO_PREFIX", i);
/* 33 */            int i2 = 1;
/* 37 */            I00ilO0 = new IO0o1O0li0("ENABLED", i2);
/* 46 */            I00io1l = new IO0o1O0li0("DISABLED", i2);
/* 55 */            I00ioIO = new IO0o1O0li0("DESTROYED", i2);
                }

                public IO0o1O0li0(String str, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = str;
                }

                @Override
                public Object I00000oOI() {
/* 29 */            throw new O01Oo001(this.I00iiI);
                }

                public String toString() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             String str = this.I00iiI;
                    switch (i) {
                        case 0:
                        case 1:
/* 13 */                    return str;
                        default:
/* 8 */                     return super.toString();
                    }
                }
            }
