            package p000;
            
            public final class Oo0IOII implements OI0IIiI1lIol {
                public boolean I00000oIO;
                public Oo0lI00l I00000oOI;
                public Oo0IOoOi01 I0000Il00O;

                @Override
                public final boolean I00000oIO(long j) {
                    O0oIlOolIO o0oIlOolIO;
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000Il00O;
/* 7 */             if (!oo0IOoOi01.I000OOo1O() || oo0IOoOi01.I000l1().I00000oIO.I00iiI.length() == 0 || (o0oIlOolIO = oo0IOoOi01.I0000O) == null || o0oIlOolIO.I0000O() == null) {
/* 49 */                return false;
                    }
/* 44 */            I0001Ioi1lo(oo0IOoOi01.I000l1(), j, false, loIOiIO1O1.I00io1l);
/* 47 */            return true;
                }

                @Override
                public final void I00000oOI() {
/* 3 */             if (this.I00000oIO) {
/* 9 */                 this.I0000Il00O.I000o00OoI0I(this.I00000oOI);
                    }
                }

                @Override
                public final boolean I0000Il00O(long j, OiiOloi1o oiiOloi1o, int i) {
                    O0oIlOolIO o0oIlOolIO;
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000Il00O;
/* 7 */             if (!oo0IOoOi01.I000OOo1O() || oo0IOoOi01.I000l1().I00000oIO.I00iiI.length() == 0 || (o0oIlOolIO = oo0IOoOi01.I0000O) == null || o0oIlOolIO.I0000O() == null) {
/* 76 */                return false;
                    }
/* 35 */            Ili1lII ili1lII = oo0IOoOi01.I000l1;
/* 37 */            if (ili1lII != null) {
/* 39 */                Ili1lII.I00000oIO(ili1lII);
                    }
/* 42 */            oo0IOoOi01.I000oI1ioi = j;
/* 45 */            oo0IOoOi01.I00111O = -1;
/* 48 */            oo0IOoOi01.I0000oI00(true);
/* 60 */            long jI0001Ioi1lo = I0001Ioi1lo(oo0IOoOi01.I000l1(), oo0IOoOi01.I000oI1ioi, true, oiiOloi1o);
/* 65 */            if (i >= 2) {
/* 67 */                this.I00000oIO = true;
/* 73 */                this.I00000oOI = Oo0lI00l.I00000oIO(jI0001Ioi1lo);
                    }
/* 47 */            return true;
                }

                @Override
                public final boolean I0000O(long j, OiiOloi1o oiiOloi1o) {
                    O0oIlOolIO o0oIlOolIO;
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000Il00O;
/* 7 */             if (!oo0IOoOi01.I000OOo1O() || oo0IOoOi01.I000l1().I00000oIO.I00iiI.length() == 0 || (o0oIlOolIO = oo0IOoOi01.I0000O) == null || o0oIlOolIO.I0000O() == null) {
/* 48 */                return false;
                    }
/* 43 */            I0001Ioi1lo(oo0IOoOi01.I000l1(), j, false, oiiOloi1o);
/* 46 */            return true;
                }

                @Override
                public final boolean I0000oI00(long j) {
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000Il00O;
/* 3 */             O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 5 */             if (o0oIlOolIO == null || o0oIlOolIO.I0000O() == null || !oo0IOoOi01.I000OOo1O()) {
/* 45 */                return false;
                    }
/* 22 */            oo0IOoOi01.I00111O = -1;
/* 24 */            Ili1lII ili1lII = oo0IOoOi01.I000l1;
/* 26 */            if (ili1lII != null) {
/* 28 */                Ili1lII.I00000oIO(ili1lII);
                    }
/* 40 */            I0001Ioi1lo(oo0IOoOi01.I000l1(), j, false, loIOiIO1O1.I00io1l);
/* 43 */            return true;
                }

                public final long I0001Ioi1lo(Oo0OI01Il oo0OI01Il, long j, boolean z, OiiOloi1o oiiOloi1o) {
/* 1 */             Oo0IOoOi01 oo0IOoOi01 = this.I0000Il00O;
/* 10 */            long jI001IO000 = oo0IOoOi01.I001IO000(oo0OI01Il, j, z, false, oiiOloi1o, false, null);
/* 20 */            if (!Oo0lI00l.I00000oOI(jI001IO000, this.I00000oOI)) {
/* 23 */                this.I00000oIO = false;
                    }
/* 36 */            oo0IOoOi01.I0010I0i(Oo0lI00l.I0000O(jI001IO000) ? Io11Oo11oO.I00iiO : Io11Oo11oO.I00iiI);
/* 204 */           return jI001IO000;
                }
            }
