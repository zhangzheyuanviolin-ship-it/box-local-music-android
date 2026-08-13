            package p000;
            
/* 18 */    public class IlllollI extends IIiO0l1Oiloi implements Illl0OO0l, O0Iill {
                public final int I00io1l;

                public IlllollI(int i, int i2, Class cls, Object obj, String str, String str2) {
/* 14 */            super(obj, cls, str, str2, (i2 & 1) == 1);
/* 17 */            this.I00io1l = i;
                }

                @Override
                public final O0IOl1llI1I I001IO000() {
/* 3 */             return OOoOl0i.I00000oIO.I00000oIO(this);
                }

                @Override
                public final O0IOl1llI1I I001lIiIIo1O() {
/* 1 */             O0IOl1llI1I o0IOl1llI1II0000O = I0000O();
/* 5 */             if (o0IOl1llI1II0000O != this) {
/* 7 */                 return (O0Iill) o0IOl1llI1II0000O;
                    }
/* 29 */            throw new Ii01OOool();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 54 */                return true;
                    }
/* 6 */             if (obj instanceof IlllollI) {
/* 8 */                 IlllollI illlollI = (IlllollI) obj;
                        return this.I00iio.equals(illlollI.I00iio) && this.I00ilI0I1.equals(illlollI.I00ilI0I1) && O0000Ioio00.I0000O(this.I00iiI, illlollI.I00iiI) && O0000Ioio00.I0000O(I001l0I00(), illlollI.I001l0I00());
                    }
/* 58 */            if (obj instanceof O0Iill) {
/* 64 */                return obj.equals(I0000O());
                    }
/* 69 */            return false;
                }

                @Override
                public final int getArity() {
/* 1 */             return this.I00io1l;
                }

                public final int hashCode() {
/* 32 */            return this.I00ilI0I1.hashCode() + Oi010OO0.I000O01llI0(I001l0I00() == null ? 0 : I001l0I00().hashCode() * 31, 31, this.I00iio);
                }

                public final String toString() {
/* 1 */             O0IOl1llI1I o0IOl1llI1II0000O = I0000O();
/* 5 */             if (o0IOl1llI1II0000O != this) {
/* 7 */                 return o0IOl1llI1II0000O.toString();
                    }
/* 14 */            String str = this.I00iio;
                    return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : IlIi0I0.I000lI("function ", str, " (Kotlin reflection is not available)");
                }

/* 19 */        public IlllollI(int i, Class cls, String str, String str2, int i2) {
/* 20 */            this(i, i2, cls, IIiO01.I00iiI, str, str2);
                }
            }
