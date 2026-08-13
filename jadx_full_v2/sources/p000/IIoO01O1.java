            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
/* 91 */    public final class IIoO01O1 implements OolIii00oi1 {
                public final OI0oiliol10O I00iOIl;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public IIoO01O1(int i) {
/* 88 */            this(OI0oiliol10O.I000OOo1O());
                    switch (i) {
                        case 1:
/* 91 */                    return;
                        default:
/* 4 */                     OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 11 */                    this.I00iOIl = oI0oiliol10OI000OOo1O;
/* 13 */                    I1ioiI i1ioiI = OloIIlI1o10.I00IioO0OiOi;
/* 20 */                    Class cls = (Class) oI0oiliol10OI000OOo1O.I00000oOI(i1ioiI, null);
/* 24 */                    if (cls != null && !cls.equals(IIoIloi0.class)) {
/* 37 */                        OoOil11Ol1o.I0010o("Invalid target class configuration for ", this, ": ", cls);
/* 40 */                        throw null;
                            }
/* 41 */                    oI0oiliol10OI000OOo1O.I0010I0i(i1ioiI, IIoIloi0.class);
/* 44 */                    I1ioiI i1ioiI2 = OloIIlI1o10.I00IOO;
/* 50 */                    if (oI0oiliol10OI000OOo1O.I00000oOI(i1ioiI2, null) == null) {
/* 80 */                        oI0oiliol10OI000OOo1O.I0010I0i(i1ioiI2, IIoIloi0.class.getCanonicalName() + "-" + UUID.randomUUID());
/* 83 */                        return;
                            }
/* 83 */                    return;
                    }
                }

                @Override
                public Ioi0OoiI I00100o1O0lo() {
/* 5 */             OIil0iio0 oIil0iio0I0001Ioi1lo = OIil0iio0.I0001Ioi1lo(this.I00iOIl);
/* 9 */             Ioi0OoiI ioi0OoiI = new Ioi0OoiI();
/* 12 */            ioi0OoiI.I00iOIl = oIil0iio0I0001Ioi1lo;
/* 14 */            VarHandle.storeStoreFence();
/* 20 */            return ioi0OoiI;
                }

                @Override
                public OI0oiliol10O I000o00OoI0I() {
/* 1 */             return this.I00iOIl;
                }

/* 92 */        public IIoO01O1(OI0oiliol10O oI0oiliol10O) {
/* 94 */            this.I00iOIl = oI0oiliol10O;
/* 95 */            I1ioiI i1ioiI = OloIIlI1o10.I00IioO0OiOi;
/* 96 */            Class cls = (Class) oI0oiliol10O.I00000oOI(i1ioiI, null);
/* 97 */            if (cls != null && !cls.equals(Ioi01I0.class)) {
/* 98 */                OoOil11Ol1o.I0010o("Invalid target class configuration for ", this, ": ", cls);
                        throw null;
                    }
/* 100 */           oI0oiliol10O.I0010I0i(OolIl0ii1.I00OIl, OolO01iOo0O.I00iiO);
/* 101 */           oI0oiliol10O.I0010I0i(i1ioiI, Ioi01I0.class);
/* 102 */           I1ioiI i1ioiI2 = OloIIlI1o10.I00IOO;
                    if (oI0oiliol10O.I00000oOI(i1ioiI2, null) == null) {
/* 104 */               oI0oiliol10O.I0010I0i(i1ioiI2, Ioi01I0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                }
            }
