            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oo0O01II extends O1ooOo implements IOlIil1, O0iOoioOoI {
                public Oo0lloOiiIOI I00o0iI0io1;
                public OoOlliI1lo I00o0l1o1o0;
                public Oo0IloIO I00o101lO;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             Oo0IloIO oo0IloIO = this.I00o101lO;
/* 3 */             if (oo0IloIO == null) {
/* 408 */               throw IlIi0I0.I0000oI00("Min size state is not set.");
                    }
/* 5 */             OIooliIO0 oIooliIO0 = oo0IloIO.I0001Ioi1lo;
/* 7 */             OoOlliI1lo ooOlliI1lo = this.I00o0l1o1o0;
/* 9 */             if (ooOlliI1lo == null) {
/* 117 */               throw IlIi0I0.I0000oI00("Font resolution state is not set.");
                    }
/* 11 */            Object value = ooOlliI1lo.getValue();
/* 21 */            if (!O0000Ioio00.I0000O(value, oo0IloIO.I0000oI00)) {
/* 23 */                oo0IloIO.I0000oI00 = value;
/* 27 */                oIooliIO0.setValue(Boolean.TRUE);
                    }
/* 40 */            if (((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 52 */                oo0IloIO.I000II = Oo001ol1Olli.I00000oIO(oo0IloIO.I0000O, oo0IloIO.I00000oOI, oo0IloIO.I0000Il00O);
/* 56 */                oIooliIO0.setValue(Boolean.FALSE);
                    }
/* 59 */            long j2 = oo0IloIO.I000II;
/* 84 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I0000oI00(j, IOo0olo.I00000oOI((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
/* 88 */            int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 90 */            int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 96 */            I0li0o i0li0o = new I0li0o(15);
/* 99 */            i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 101 */           VarHandle.storeStoreFence();
/* 106 */           return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                @Override
                public final void I0000O() {
/* 1 */             Oo0IloIO oo0IloIO = this.I00o101lO;
/* 3 */             if (oo0IloIO != null) {
/* 14 */                Oo0IloIO.I00000oIO(oo0IloIO, null, il0lI1i1olii.I000O01llI0(this).I00oliIiO01i, null, 29);
                    }
/* 17 */            l0o11Oi.I00000oOI(this);
                }

                @Override
                public final void I00OI1() {
/* 1 */             Oo0IloIO oo0IloIO = this.I00o101lO;
/* 3 */             if (oo0IloIO != null) {
/* 14 */                Oo0IloIO.I00000oIO(oo0IloIO, il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll, null, null, 30);
                    }
/* 17 */            l0o11Oi.I00000oOI(this);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 9 */             Oo0lloOiiIOI oo0lloOiiIOII00000oIO = lOlilIi0I.I00000oIO(this.I00o0iI0io1, il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll);
/* 19 */            IliO0o11i01 iliO0o11i01 = (IliO0o11i01) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I000iOII);
/* 21 */            I010l1O(oo0lloOiiIOII00000oIO, iliO0o11i01);
/* 30 */            O0iOOoiioO o0iOOoiioO = il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll;
/* 36 */            IiIooOOOI iiIooOOOI = il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
/* 38 */            OoOlliI1lo ooOlliI1lo = this.I00o0l1o1o0;
/* 40 */            if (ooOlliI1lo == null) {
/* 110 */               throw IlIi0I0.I0000oI00("Font resolution state is not set.");
                    }
/* 42 */            Object value = ooOlliI1lo.getValue();
/* 46 */            Oo0IloIO oo0IloIO = new Oo0IloIO();
/* 49 */            oo0IloIO.I00000oIO = o0iOOoiioO;
/* 51 */            oo0IloIO.I00000oOI = iiIooOOOI;
/* 53 */            oo0IloIO.I0000Il00O = iliO0o11i01;
/* 55 */            oo0IloIO.I0000O = oo0lloOiiIOII00000oIO;
/* 57 */            oo0IloIO.I0000oI00 = value;
/* 65 */            oo0IloIO.I0001Ioi1lo = lOO00IiI0li.I00000oIO(Boolean.TRUE);
/* 69 */            oo0IloIO.I000II = 0L;
/* 71 */            VarHandle.storeStoreFence();
/* 74 */            this.I00o101lO = oo0IloIO;
                }

                @Override
                public final void I010I0() {
/* 2 */             this.I00o0l1o1o0 = null;
/* 4 */             this.I00o101lO = null;
                }

                public final void I010l1O(Oo0lloOiiIOI oo0lloOiiIOI, IliO0o11i01 iliO0o11i01) {
/* 1 */             OlIIi1oIIOlo olIIi1oIIOlo = oo0lloOiiIOI.I00000oIO;
/* 3 */             IliO1o11o iliO1o11o = olIIi1oIIOlo.I0001Ioi1lo;
/* 5 */             IlilIIiIiO ililIIiIiO = olIIi1oIIOlo.I0000Il00O;
/* 7 */             if (ililIIiIiO == null) {
/* 9 */                 ililIIiIiO = IlilIIiIiO.I00ioIO;
                    }
/* 11 */            Ilil10i ilil10i = olIIi1oIIOlo.I0000O;
/* 18 */            int i = ilil10i != null ? ilil10i.I00000oIO : 0;
/* 19 */            Ilil10oOo ilil10oOo = olIIi1oIIOlo.I0000oI00;
/* 35 */            this.I00o0l1o1o0 = ((IliOI01OIIII) iliO0o11i01).I00000oOI(iliO1o11o, ililIIiIiO, i, ilil10oOo != null ? ilil10oOo.I00000oIO : 65535);
/* 37 */            l0o11Oi.I00000oOI(this);
                }
            }
