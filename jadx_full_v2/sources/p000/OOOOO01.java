            package p000;
            
            public abstract class OOOOO01 extends IIiO0l1Oiloi implements O0O00I1Ili {
                public final boolean I00io1l;

                public OOOOO01(Object obj, Class cls, String str, String str2, int i) {
/* 16 */            super(obj, cls, str, str2, (i & 1) == 1);
/* 25 */            this.I00io1l = (i & 2) == 2;
                }

                @Override
                public final O0IOl1llI1I I0000O() {
                    return this.I00io1l ? this : super.I0000O();
                }

                @Override
                public final O0O00I1Ili I001lIiIIo1O() {
/* 3 */             if (this.I00io1l) {
/* 22 */                OoOil11Ol1o.I000OiO("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
/* 25 */                return null;
                    }
/* 5 */             O0IOl1llI1I o0IOl1llI1II0000O = I0000O();
/* 9 */             if (o0IOl1llI1II0000O != this) {
/* 11 */                return (O0O00I1Ili) o0IOl1llI1II0000O;
                    }
/* 19 */            throw new Ii01OOool();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 54 */                return true;
                    }
/* 6 */             if (obj instanceof OOOOO01) {
/* 8 */                 OOOOO01 ooooo01 = (OOOOO01) obj;
                        return I001l0I00().equals(ooooo01.I001l0I00()) && this.I00iio.equals(ooooo01.I00iio) && this.I00ilI0I1.equals(ooooo01.I00ilI0I1) && O0000Ioio00.I0000O(this.I00iiI, ooooo01.I00iiI);
                    }
/* 58 */            if (obj instanceof O0O00I1Ili) {
/* 64 */                return obj.equals(I0000O());
                    }
/* 69 */            return false;
                }

                public final int hashCode() {
/* 24 */            return this.I00ilI0I1.hashCode() + Oi010OO0.I000O01llI0(I001l0I00().hashCode() * 31, 31, this.I00iio);
                }

                public final String toString() {
/* 1 */             O0IOl1llI1I o0IOl1llI1II0000O = I0000O();
                    return o0IOl1llI1II0000O != this ? o0IOl1llI1II0000O.toString() : IIl001iO0Io.I00100l0(new StringBuilder("property "), this.I00iio, " (Kotlin reflection is not available)");
                }
            }
