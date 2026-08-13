            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IliOI01OIIII implements IliO0o11i01 {
                public I0oIIIl00 I00000oIO;
                public OO1IoI1IIIlo I00000oOI;
                public OoOlO1O0o I0000Il00O;
                public IliOlliiOO I0000O;
                public O1OIll00i I0000oI00;
                public Iil1olo I0001Ioi1lo;

                public final OoOlliI1lo I00000oIO(OoOlII ooOlII) {
/* 1 */             OoOlO1O0o ooOlO1O0o = this.I0000Il00O;
/* 6 */             IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(6);
/* 9 */             iiioilIl1Il.I00iiI = this;
/* 11 */            iiioilIl1Il.I00iiO = ooOlII;
/* 13 */            VarHandle.storeStoreFence();
                    synchronized (((looil0O1Io1) ooOlO1O0o.I00iiI)) {
/* 29 */                OoOlliI1lo ooOlliI1lo = (OoOlliI1lo) ((O1Il00) ooOlO1O0o.I00iiO).I0000Il00O(ooOlII);
/* 31 */                if (ooOlliI1lo != null) {
/* 37 */                    if (ooOlliI1lo.I0000Il00O()) {
/* 40 */                        return ooOlliI1lo;
                            }
                        }
                        try {
/* 59 */                    OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(24);
/* 62 */                    oiOi011iI1ol.I00iiI = ooOlO1O0o;
/* 64 */                    oiOi011iI1ol.I00iiO = ooOlII;
/* 66 */                    VarHandle.storeStoreFence();
/* 73 */                    OoOlliI1lo ooOlliI1lo2 = (OoOlliI1lo) iiioilIl1Il.invoke(oiOi011iI1ol);
                            synchronized (((looil0O1Io1) ooOlO1O0o.I00iiI)) {
/* 88 */                        if (((O1Il00) ooOlO1O0o.I00iiO).I0000Il00O(ooOlII) == null && ooOlliI1lo2.I0000Il00O()) {
/* 100 */                           ((O1Il00) ooOlO1O0o.I00iiO).I0000O(ooOlII, ooOlliI1lo2);
                                }
                            }
/* 107 */                   return ooOlliI1lo2;
                        } catch (Exception e) {
/* 113 */                   IoOOl0iOl1io.I000l1("Could not load font", e);
/* 116 */                   return null;
                        }
                    }
                }

                public final OoOlliI1lo I00000oOI(IliO1o11o iliO1o11o, IlilIIiIiO ililIIiIiO, int i, int i2) {
/* 3 */             OO1IoI1IIIlo oO1IoI1IIIlo = this.I00000oOI;
/* 5 */             oO1IoI1IIIlo.getClass();
/* 19 */            return I00000oIO(new OoOlII(iliO1o11o, oO1IoI1IIIlo.I00000oIO(ililIIiIiO), i, i2, null));
                }
            }
