            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
/* 191 */   public final class IIl0lo1oi implements Il1iool, OolIii00oi1 {
                public final int I00iOIl;
                public final OI0oiliol10O I00iiI;

                public IIl0lo1oi(OI0oiliol10O oI0oiliol10O, int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 2:
/* 119 */                   this.I00iiI = oI0oiliol10O;
/* 121 */                   I1ioiI i1ioiI = OloIIlI1o10.I00IioO0OiOi;
/* 127 */                   Class cls = (Class) oI0oiliol10O.I00000oOI(i1ioiI, null);
/* 131 */                   if (cls != null && !cls.equals(OlOO1Io010o.class)) {
/* 140 */                       OoOil11Ol1o.I0010o("Invalid target class configuration for ", this, ": ", cls);
/* 143 */                       throw null;
                            }
/* 148 */                   oI0oiliol10O.I0010I0i(OolIl0ii1.I00OIl, OolO01iOo0O.I00ilI0I1);
/* 151 */                   oI0oiliol10O.I0010I0i(i1ioiI, OlOO1Io010o.class);
/* 154 */                   I1ioiI i1ioiI2 = OloIIlI1o10.I00IOO;
/* 160 */                   if (oI0oiliol10O.I00000oOI(i1ioiI2, null) == null) {
/* 188 */                       oI0oiliol10O.I0010I0i(i1ioiI2, OlOO1Io010o.class.getCanonicalName() + "-" + UUID.randomUUID());
/* 191 */                       return;
                            }
/* 191 */                   return;
                        default:
/* 16 */                    this.I00iiI = oI0oiliol10O;
/* 18 */                    I1ioiI i1ioiI3 = OloIIlI1o10.I00IioO0OiOi;
/* 24 */                    Class cls2 = (Class) oI0oiliol10O.I00000oOI(i1ioiI3, null);
/* 28 */                    if (cls2 != null && !cls2.equals(OOIIOiolI.class)) {
/* 37 */                        OoOil11Ol1o.I0010o("Invalid target class configuration for ", this, ": ", cls2);
/* 40 */                        throw null;
                            }
/* 45 */                    oI0oiliol10O.I0010I0i(OolIl0ii1.I00OIl, OolO01iOo0O.I00iiI);
/* 48 */                    oI0oiliol10O.I0010I0i(i1ioiI3, OOIIOiolI.class);
/* 51 */                    I1ioiI i1ioiI4 = OloIIlI1o10.I00IOO;
/* 57 */                    if (oI0oiliol10O.I00000oOI(i1ioiI4, null) == null) {
/* 85 */                        oI0oiliol10O.I0010I0i(i1ioiI4, OOIIOiolI.class.getCanonicalName() + "-" + UUID.randomUUID());
                            }
/* 88 */                    I1ioiI i1ioiI5 = IoiIli1i0Oil.I001i1O0Ol;
/* 105 */                   if (((Integer) oI0oiliol10O.I00000oOI(i1ioiI5, -1)).intValue() == -1) {
/* 112 */                       oI0oiliol10O.I0010I0i(i1ioiI5, 2);
/* 115 */                       return;
                            }
/* 115 */                   return;
                    }
                }

                public IIl0oI I00000oIO() {
/* 11 */            return new IIl0oI(OIil0iio0.I0001Ioi1lo(this.I00iiI), 8);
                }

                public OOIIOiolI I00000oOI() {
/* 1 */             OOIIOlolo1 oOIIOlolo1I0000Il00O = I0000Il00O();
/* 5 */             IoiIli1i0Oil.I001lllioOl(oOIIOlolo1I0000Il00O);
/* 10 */            OOIIOiolI oOIIOiolI = new OOIIOiolI(oOIIOlolo1I0000Il00O);
/* 15 */            oOIIOiolI.I0010o = OOIIOiolI.I001l0I00;
/* 20 */            return oOIIOiolI;
                }

                public OOIIOlolo1 I0000Il00O() {
/* 5 */             OIil0iio0 oIil0iio0I0001Ioi1lo = OIil0iio0.I0001Ioi1lo(this.I00iiI);
/* 9 */             OOIIOlolo1 oOIIOlolo1 = new OOIIOlolo1();
/* 12 */            oOIIOlolo1.I00iOIl = oIil0iio0I0001Ioi1lo;
/* 14 */            VarHandle.storeStoreFence();
/* 20 */            return oOIIOlolo1;
                }

                public void I0000O(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 13 */            for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 31 */                this.I00iiI.I000lI(i1ioiI, iOlOo1ll1l1.I000OiO(i1ioiI), iOlOo1ll1l1.I0000O(i1ioiI));
                    }
                }

                @Override
                public final OI0oiliol10O I000o00OoI0I() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OI0oiliol10O oI0oiliol10O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 10 */                    throw null;
                        case 1:
                        default:
/* 8 */                     return oI0oiliol10O;
                    }
                }

                @Override
                public OolIl0ii1 I00100o1O0lo() {
                    switch (this.I00iOIl) {
                        case 1:
/* 18 */                    return I0000Il00O();
                        default:
/* 14 */                    return new OlOO1OiIIi0(OIil0iio0.I0001Ioi1lo(this.I00iiI));
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 192 */       public IIl0lo1oi(int i) {
/* 195 */           this(OI0oiliol10O.I000OOo1O(), 1);
                    this.I00iOIl = i;
                    switch (i) {
                        case 1:
                            break;
                        default:
/* 194 */                   this.I00iiI = OI0oiliol10O.I000OOo1O();
                            break;
                    }
                }
            }
