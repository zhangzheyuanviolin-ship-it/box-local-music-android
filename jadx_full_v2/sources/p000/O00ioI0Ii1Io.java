            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public abstract class O00ioI0Ii1Io {
                public static final OI1Iio0ii1 I00000oIO = OI1Iio0ii1.I0000oI00("message");
                public static final OI1Iio0ii1 I00000oOI = OI1Iio0ii1.I0000oI00("allowedTargets");
                public static final OI1Iio0ii1 I0000Il00O = OI1Iio0ii1.I0000oI00("value");
                public static final Map I0000O = O1Oii0O0loo.I0000O(new OIoi0IIoi(OlIllOO11lOl.I00111O, O0I01I.I0000Il00O), new OIoi0IIoi(OlIllOO11lOl.I001i1O0Ol, O0I01I.I0000O), new OIoi0IIoi(OlIllOO11lOl.I001i1lo1io, O0I01I.I0001Ioi1lo));

                public static OO1o0I011 I00000oIO(Ill0IO ill0IO, O00l0Oi0o o00l0Oi0o, o01l1ioOo0 o01l1iooo0) {
                    OOo1O1i oOo1O1iI00000oIO;
                    OOo1O1i oOo1O1iI00000oIO2;
/* 1 */             Ill0IO ill0IO2 = OlIllOO11lOl.I000lI;
/* 7 */             if (ill0IO.equals(ill0IO2) && (oOo1O1iI00000oIO2 = o00l0Oi0o.I00000oIO(O0I01I.I0000oI00)) != null) {
/* 20 */                O00ll0iIIl o00ll0iIIl = new O00ll0iIIl(o01l1iooo0, oOo1O1iI00000oIO2, ill0IO2);
/* 38 */                o00ll0iIIl.I0001Ioi1lo = new O1I0II11i((O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO, I1lOO0Ii00.I00ioIO);
/* 40 */                VarHandle.storeStoreFence();
/* 43 */                return o00ll0iIIl;
                    }
/* 50 */            Ill0IO ill0IO3 = (Ill0IO) I0000O.get(ill0IO);
/* 52 */            if (ill0IO3 == null || (oOo1O1iI00000oIO = o00l0Oi0o.I00000oIO(ill0IO3)) == null) {
/* 66 */                return null;
                    }
/* 61 */            return I00000oOI(oOo1O1iI00000oIO, o01l1iooo0, false);
                }

                public static OO1o0I011 I00000oOI(OOo1O1i oOo1O1i, o01l1ioOo0 o01l1iooo0, boolean z) {
/* 7 */             O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I00000oIO;
/* 21 */            IOIOill iOIOillI00000oIO = OOo1Io0I0.I00000oIO(((IOIO10iOi1) l0O00Ol.I00000oIO(oOo1O1i.I00000oIO)).I001l0I00());
/* 25 */            Ill0IO ill0IO = O0I01I.I0000Il00O;
/* 46 */            if (iOIOillI00000oIO.equals(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()))) {
/* 52 */                O00o1O o00o1O = new O00o1O(o01l1iooo0, oOo1O1i, OlIllOO11lOl.I00111O);
/* 59 */                I01iiIii10O i01iiIii10O = new I01iiIii10O(24);
/* 62 */                i01iiIii10O.I00iiI = o00o1O;
/* 64 */                VarHandle.storeStoreFence();
/* 72 */                o00o1O.I0001Ioi1lo = new O1I0II11i(o1I0OloI, i01iiIii10O);
/* 74 */                VarHandle.storeStoreFence();
/* 77 */                return o00o1O;
                    }
/* 78 */            Ill0IO ill0IO2 = O0I01I.I0000O;
/* 99 */            if (iOIOillI00000oIO.equals(new IOIOill(ill0IO2.I00000oOI(), ill0IO2.I00000oIO.I000II()))) {
/* 105 */               O00o11l o00o11l = new O00o11l(o01l1iooo0, oOo1O1i, OlIllOO11lOl.I001i1O0Ol);
/* 112 */               I01iiIii10O i01iiIii10O2 = new I01iiIii10O(23);
/* 115 */               i01iiIii10O2.I00iiI = o00o11l;
/* 117 */               VarHandle.storeStoreFence();
/* 125 */               o00o11l.I0001Ioi1lo = new O1I0II11i(o1I0OloI, i01iiIii10O2);
/* 127 */               VarHandle.storeStoreFence();
/* 130 */               return o00o11l;
                    }
/* 131 */           Ill0IO ill0IO3 = O0I01I.I0001Ioi1lo;
/* 152 */           if (iOIOillI00000oIO.equals(new IOIOill(ill0IO3.I00000oOI(), ill0IO3.I00000oIO.I000II()))) {
/* 158 */               return new O00io0ii0(o01l1iooo0, oOo1O1i, OlIllOO11lOl.I001i1lo1io);
                    }
/* 162 */           Ill0IO ill0IO4 = O0I01I.I0000oI00;
/* 183 */           if (iOIOillI00000oIO.equals(new IOIOill(ill0IO4.I00000oOI(), ill0IO4.I00000oIO.I000II()))) {
/* 185 */               return null;
                    }
/* 189 */           return new O0l1OOlI0OiO(oOo1O1i, o01l1iooo0, z);
                }
            }
