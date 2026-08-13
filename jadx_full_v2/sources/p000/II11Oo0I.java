            package p000;
            
/* 10 */    public final class II11Oo0I extends IOo0i1 {
                public final int I00000oOI = 1;

                public II11Oo0I(double d) {
/* 8 */             super(Double.valueOf(d));
                }

                @Override
                public final O0iIl1 I00000oIO(OI0010oo1o oI0010oo1o) {
                    switch (this.I00000oOI) {
                        case 0:
/* 34 */                    O0i1lI0o1io o0i1lI0o1ioI0000O = oI0010oo1o.I0000O();
/* 38 */                    o0i1lI0o1ioI0000O.getClass();
/* 43 */                    return o0i1lI0o1ioI0000O.I0010o(OOIil01OI.I00ilO0);
                        case 1:
/* 20 */                    O0i1lI0o1io o0i1lI0o1ioI0000O2 = oI0010oo1o.I0000O();
/* 24 */                    o0i1lI0o1ioI0000O2.getClass();
/* 29 */                    return o0i1lI0o1ioI0000O2.I0010o(OOIil01OI.I00lli11);
                        default:
/* 6 */                     O0i1lI0o1io o0i1lI0o1ioI0000O3 = oI0010oo1o.I0000O();
/* 10 */                    o0i1lI0o1ioI0000O3.getClass();
/* 15 */                    return o0i1lI0o1ioI0000O3.I0010o(OOIil01OI.I00li1OI);
                    }
                }

                @Override
                public String toString() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             Object obj = this.I00000oIO;
                    switch (i) {
                        case 1:
/* 56 */                    return ((Number) obj).doubleValue() + ".toDouble()";
                        case 2:
/* 32 */                    return ((Number) obj).floatValue() + ".toFloat()";
                        default:
/* 8 */                     return super.toString();
                    }
                }

/* 11 */        public II11Oo0I(Object obj) {
                    super(obj);
                }

/* 12 */        public II11Oo0I(float f) {
/* 13 */            super(Float.valueOf(f));
                }
            }
