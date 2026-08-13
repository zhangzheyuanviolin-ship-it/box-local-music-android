            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class Oiio1oll000 {
                public static final IoloOio0I I000l1 = OiIoloOl0.I00000oIO(new OiO01i(9), new OiIoloo(29));
                public boolean I00000oIO;
                public final ArrayList I00000oOI = new ArrayList();
                public final OI0lli1 I0000Il00O;
                public final AtomicLong I0000O;
                public Oiii0i1Oil1 I0000oI00;
                public I0oioiIIlo I0001Ioi1lo;
                public Oiili10iiO I000II;
                public OiiOol1OIOll I000O01llI0;
                public Oiii0i1Oil1 I000OOo1O;
                public Oiii0i1Oil1 I000OiO;
                public final OIooliIO0 I000iOII;

                public Oiio1oll000(long j) {
/* 11 */            OI0lli1 oI0lli1 = O1IO1IIIO0OO.I00000oIO;
/* 18 */            this.I0000Il00O = new OI0lli1();
/* 25 */            this.I0000O = new AtomicLong(j);
/* 33 */            this.I000iOII = lOO00IiI0li.I00000oIO(O1IO1IIIO0OO.I00000oIO);
                }

                public final OI0lli1 I00000oIO() {
/* 7 */             return (OI0lli1) this.I000iOII.getValue();
                }

                public final boolean I00000oOI(O0iOOo0Ii o0iOOo0Ii, long j, long j2, OiiOloi1o oiiOloi1o, boolean z) {
/* 1 */             Oiili10iiO oiili10iiO = this.I000II;
/* 3 */             if (oiili10iiO == null) {
/* 58 */                return true;
                    }
/* 5 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 9 */             OIOlIiiioi oIOlIiiioiI00000oIO = OIOlIiiioi.I00000oIO(j);
/* 13 */            OIOlIiiioi oIOlIiiioiI00000oIO2 = OIOlIiiioi.I00000oIO(j2);
/* 17 */            Boolean bool = Boolean.FALSE;
/* 19 */            Oiill0lI1il1 oiill0lI1il1 = oiili10iiO.I00iOIl;
/* 21 */            boolean zBooleanValue = boolValueOf.booleanValue();
/* 25 */            boolean zBooleanValue2 = bool.booleanValue();
/* 31 */            long jI00000oIO = oiill0lI1il1.I00000oIO(o0iOOo0Ii, oIOlIiiioiI00000oIO.I00000oIO);
/* 37 */            long jI00000oIO2 = oiill0lI1il1.I00000oIO(o0iOOo0Ii, oIOlIiiioiI00000oIO2.I00000oIO);
/* 41 */            oiill0lI1il1.I000o00OoI0I(zBooleanValue);
/* 53 */            return Boolean.valueOf(oiill0lI1il1.I0010o(jI00000oIO, jI00000oIO2, zBooleanValue2, oiiOloi1o)).booleanValue();
                }

                public final void I0000Il00O() {
/* 1 */             OiiOol1OIOll oiiOol1OIOll = this.I000O01llI0;
/* 3 */             if (oiiOol1OIOll != null) {
/* 5 */                 oiiOol1OIOll.invoke();
                    }
                }

                public final void I0000O(O0iOOo0Ii o0iOOo0Ii, long j, OiiOloi1o oiiOloi1o, boolean z) {
/* 1 */             I0oioiIIlo i0oioiIIlo = this.I0001Ioi1lo;
/* 3 */             if (i0oioiIIlo != null) {
/* 13 */                i0oioiIIlo.I000l1(Boolean.valueOf(z), o0iOOo0Ii, OIOlIiiioi.I00000oIO(j), oiiOloi1o);
                    }
                }

                public final ArrayList I0000oI00(O0iOOo0Ii o0iOOo0Ii) {
/* 1 */             boolean z = this.I00000oIO;
/* 3 */             ArrayList arrayList = this.I00000oOI;
/* 5 */             if (!z) {
/* 11 */                O1IIii o1IIii = new O1IIii(23);
/* 14 */                o1IIii.I00iiI = o0iOOo0Ii;
/* 16 */                VarHandle.storeStoreFence();
/* 22 */                IOi10O11O iOi10O11O = new IOi10O11O(3);
/* 25 */                iOi10O11O.I00iiI = o1IIii;
/* 27 */                VarHandle.storeStoreFence();
/* 30 */                IOOiOil.I000oI1ioi(arrayList, iOi10O11O);
/* 34 */                this.I00000oIO = true;
                    }
/* 77 */            return arrayList;
                }
            }
