            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class I0II0i00l {
                public I0lIllO I00000oIO;
                public Set I00000oOI;
                public OoooIIOo10 I0000Il00O;
                public OI10llOi I0000O;

                public final OI1I11lO1i I00000oIO() {
/* 1 */             OI10llOi oI10llOi = this.I0000O;
                    synchronized (oI10llOi.I00iiO) {
                        try {
/* 9 */                     if (oI10llOi.I00iiI) {
/* 8 */                         return null;
                            }
/* 16 */                    int i = oI10llOi.I00iOIl + 1;
/* 17 */                    oI10llOi.I00iOIl = i;
/* 19 */                    if (i == 1) {
/* 23 */                        OlIl0i olIl0i = (OlIl0i) oI10llOi.I00ilO0;
/* 25 */                        if (olIl0i != null) {
/* 27 */                            olIl0i.I000II(null);
                                }
/* 33 */                        oI10llOi.I00ilO0 = null;
                            }
/* 38 */                    OI1I11lO1i oI1I11lO1i = new OI1I11lO1i();
/* 41 */                    oI1I11lO1i.I0000Il00O = oI10llOi;
/* 48 */                    oI1I11lO1i.I00000oOI = iOOOIOoiIlII.I00000oIO(false);
/* 50 */                    VarHandle.storeStoreFence();
/* 53 */                    return oI1I11lO1i;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final Object I00000oOI(IOoilo iOoilo) {
/* 13 */            Object objI00000oOI = ilOoO00.I00000oOI(this.I00000oIO.I00111O, new I0I1oi(2, null, 1), iOoilo);
/* 17 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 19 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 21 */            if (objI00000oOI != ii0111o) {
/* 24 */                objI00000oOI = ooiIlOl1iI;
                    }
                    return objI00000oOI == ii0111o ? objI00000oOI : ooiIlOl1iI;
                }

                public final void I0000Il00O() {
/* 3 */             this.I0000O.I0000Il00O();
/* 8 */             this.I00000oIO.I00000oIO();
                }

                public final OoiIlOl1iI I0000O(OoooIIOo10 ooooIIOo10, OI1I11lO1i oI1I11lO1i) {
/* 1 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 3 */             OoooIIOo10 ooooIIOo102 = this.I0000Il00O;
/* 5 */             this.I0000Il00O = ooooIIOo10;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 8 */             if (ooooIIOo102 != null) {
/* 10 */                ooooIIOo102.I00000oIO(null);
                    }
/* 15 */            OlO0OIIl1 olO0OIIl1 = this.I00000oIO.I00111O;
                    synchronized (ooooIIOo10.I0000oI00) {
/* 22 */                if (ooooIIOo10.I0001Ioi1lo) {
/* 24 */                    oI1I11lO1i.I00000oOI();
                        } else {
/* 45 */                    ooooIIOo10.I000iOII = iOi1II01i0.I0000O(ooooIIOo10.I0000Il00O, null, null, new Ol110ii1I(olO0OIIl1, ooooIIOo10, iOoil1iiIilo, 13), 3);
/* 47 */                    ooooIIOo10.I000l1 = oI1I11lO1i;
                        }
                    }
/* 50 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 52 */            return ooiIlOl1iI;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
/* 16 */            sb.append((Object) IIllI0o.I0000Il00O(this.I00000oIO.I00000oIO));
/* 21 */            sb.append(")@");
/* 24 */            int iHashCode = hashCode();
/* 30 */            iOlI1lIi0.I00000oIO(16);
/* 37 */            sb.append(Integer.toString(iHashCode, 16));
/* 40 */            return sb.toString();
                }
            }
