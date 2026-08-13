            package p000;

            import java.lang.invoke.VarHandle;
            
/* 18 */    public final class Oo0IO1lIl0o1 implements OlooOo {
                public Oo0IOoOi01 I00000oIO;
                public boolean I00000oOI;

                @Override
                public final void I00000oOI() {
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I00000oIO;
/* 4 */             oo0IOoOi01.I00100o1O0lo(null);
/* 7 */             oo0IOoOi01.I00100l0(null);
/* 11 */            oo0IOoOi01.I001IIilI0O(true);
                }

                @Override
                public final void I0000Il00O() {
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I00000oIO;
/* 4 */             oo0IOoOi01.I00100o1O0lo(null);
/* 7 */             oo0IOoOi01.I00100l0(null);
/* 11 */            oo0IOoOi01.I001IIilI0O(true);
                }

                @Override
                public final void I0000O() {
                    Oo0il0olo1l oo0il0olo1lI0000O;
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I00000oIO;
/* 3 */             boolean z = this.I00000oOI;
/* 12 */            oo0IOoOi01.I00100o1O0lo(z ? Io11Oll.I00iiI : Io11Oll.I00iiO);
/* 19 */            long jI00000oIO = Oiil1O.I00000oIO(oo0IOoOi01.I000OiO(z));
/* 23 */            O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 25 */            if (o0oIlOolIO == null || (oo0il0olo1lI0000O = o0oIlOolIO.I0000O()) == null) {
/* 110 */               return;
                    }
/* 34 */            long jI0000oI00 = oo0il0olo1lI0000O.I0000oI00(jI00000oIO);
/* 38 */            oo0IOoOi01.I000oI1ioi = jI0000oI00;
/* 44 */            oo0IOoOi01.I00100l0(OIOlIiiioi.I00000oIO(jI0000oI00));
/* 49 */            oo0IOoOi01.I00100o1O0lo = 0L;
/* 52 */            oo0IOoOi01.I00111O = -1;
/* 54 */            O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 56 */            if (o0oIlOolIO2 != null) {
/* 62 */                o0oIlOolIO2.I00100o1O0lo.setValue(Boolean.TRUE);
                    }
/* 66 */            oo0IOoOi01.I001IIilI0O(false);
                }

                @Override
                public final void I0000oI00(long j) {
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I00000oIO;
/* 5 */             long jI000II = OIOlIiiioi.I000II(oo0IOoOi01.I00100o1O0lo, j);
/* 9 */             oo0IOoOi01.I00100o1O0lo = jI000II;
/* 21 */            oo0IOoOi01.I00100l0(OIOlIiiioi.I00000oIO(OIOlIiiioi.I000II(oo0IOoOi01.I000oI1ioi, jI000II)));
/* 24 */            Oo0OI01Il oo0OI01IlI000l1 = oo0IOoOi01.I000l1();
/* 32 */            long j2 = oo0IOoOi01.I000II().I00000oIO;
/* 34 */            boolean z = this.I00000oOI;
/* 36 */            OiiOloi1o oiiOloi1o = loIOiIO1O1.I00l0OO0IO;
/* 40 */            Io1I10ool0 io1I10ool0 = new Io1I10ool0();
/* 45 */            io1I10ool0.I00000oIO = 9;
/* 47 */            VarHandle.storeStoreFence();
/* 52 */            oo0IOoOi01.I001IO000(oo0OI01IlI000l1, j2, false, z, oiiOloi1o, true, io1I10ool0);
/* 56 */            oo0IOoOi01.I001IIilI0O(false);
                }

                @Override
/* 19 */        public final void onCancel() {
                }

                @Override
/* 36 */        public final void I00000oIO(long j, OiiOloi1o oiiOloi1o) {
                }
            }
