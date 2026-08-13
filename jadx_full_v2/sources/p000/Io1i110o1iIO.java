            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class Io1i110o1iIO extends O1ooOo implements IOlIil1, O0iOoioOoI, OIOilOIi1 {
                public Oo0lloOiiIOI I00o0iI0io1;
                public int I00o0l1o1o0;
                public int I00o101lO;
                public boolean I00oI0i;
                public int I00oII;
                public int I00oIiI10;
                public Oo0lloOiiIOI I00oO101o;
                public OoOlliI1lo I00oOio10iI1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) throws IOException {
/* 3 */             if (this.I00oI0i) {
/* 17 */                I010l1O(o1iOIoOiO0, I010lI0oi(), (IliO0o11i01) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I000iOII));
/* 21 */                this.I00oI0i = false;
                    }
/* 23 */            int i = this.I00oII;
/* 42 */            int iI0000Il00O = i != -1 ? lIiioliIlo.I0000Il00O(i, IOo0oO11ll1O.I000iOII(j), IOo0oO11ll1O.I000OOo1O(j)) : IOo0oO11ll1O.I000iOII(j);
/* 47 */            int i2 = this.I00oIiI10;
/* 78 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, 0, 0, iI0000Il00O, i2 != -1 ? lIiioliIlo.I0000Il00O(i2, IOo0oO11ll1O.I000iOII(j), IOo0oO11ll1O.I000OOo1O(j)) : IOo0oO11ll1O.I000OOo1O(j), 3));
/* 82 */            int i3 = oO1I0001000iI001lllioOl.I00iOIl;
/* 84 */            int i4 = oO1I0001000iI001lllioOl.I00iiI;
/* 89 */            I0li0o i0li0o = new I0li0o(5);
/* 92 */            i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 94 */            VarHandle.storeStoreFence();
/* 99 */            return o1iOIoOiO0.I001i1lo1io(i3, i4, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                @Override
                public final void I0000O() {
/* 2 */             this.I00oI0i = true;
/* 4 */             l0o11Oi.I00000oOI(this);
                }

                @Override
                public final void I00OI1() {
/* 13 */            this.I00oO101o = lOlilIi0I.I00000oIO(this.I00o0iI0io1, il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll);
/* 16 */            this.I00oI0i = true;
/* 18 */            l0o11Oi.I00000oOI(this);
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) throws IOException {
/* 1 */             I010l1ol111(o1IiO0l);
/* 4 */             int i2 = this.I00oII;
/* 6 */             int i3 = this.I00oIiI10;
/* 8 */             if (i2 == i3) {
/* 10 */                return i3;
                    }
/* 11 */            int iI0000Il00O = o1iIo0ll.I0000Il00O(i);
/* 15 */            int i4 = this.I00oII;
/* 17 */            int i5 = this.I00oIiI10;
/* 19 */            if (iI0000Il00O < i4) {
/* 21 */                iI0000Il00O = i4;
                    }
                    return iI0000Il00O > i5 ? i5 : iI0000Il00O;
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) throws IOException {
/* 1 */             I010l1ol111(o1IiO0l);
/* 4 */             int i2 = this.I00oII;
/* 8 */             if (i2 == this.I00oIiI10) {
/* 10 */                return i2;
                    }
/* 11 */            int iI00OI1 = o1iIo0ll.I00OI1(i);
/* 15 */            int i3 = this.I00oII;
/* 17 */            int i4 = this.I00oIiI10;
/* 19 */            if (iI00OI1 < i3) {
/* 21 */                iI00OI1 = i3;
                    }
                    return iI00OI1 > i4 ? i4 : iI00OI1;
                }

                @Override
                public final void I00ilO0() {
/* 4 */             if (this.I00oOio10iI1 != null) {
/* 8 */                 Io1i0ilOOloO io1i0ilOOloO = new Io1i0ilOOloO(1);
/* 11 */                io1i0ilOOloO.I00iiI = this;
/* 13 */                VarHandle.storeStoreFence();
/* 16 */                l1ioloOOl00l.I00000oIO(this, io1i0ilOOloO);
                    }
/* 19 */            this.I00oI0i = true;
/* 21 */            l0o11Oi.I00000oOI(this);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 7 */             IliO0o11i01 iliO0o11i01 = (IliO0o11i01) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I000iOII);
/* 21 */            this.I00oO101o = lOlilIi0I.I00000oIO(this.I00o0iI0io1, il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll);
/* 29 */            IliO1o11o iliO1o11o = I010lI0oi().I00000oIO.I0001Ioi1lo;
/* 37 */            IlilIIiIiO ililIIiIiO = I010lI0oi().I00000oIO.I0000Il00O;
/* 39 */            if (ililIIiIiO == null) {
/* 41 */                ililIIiIiO = IlilIIiIiO.I00ioIO;
                    }
/* 49 */            Ilil10i ilil10i = I010lI0oi().I00000oIO.I0000O;
/* 57 */            int i = ilil10i != null ? ilil10i.I00000oIO : 0;
/* 64 */            Ilil10oOo ilil10oOo = I010lI0oi().I00000oIO.I0000oI00;
/* 80 */            this.I00oOio10iI1 = ((IliOI01OIIII) iliO0o11i01).I00000oOI(iliO1o11o, ililIIiIiO, i, ilil10oOo != null ? ilil10oOo.I00000oIO : 65535);
/* 84 */            Io1i0ilOOloO io1i0ilOOloO = new Io1i0ilOOloO(0);
/* 87 */            io1i0ilOOloO.I00iiI = this;
/* 89 */            VarHandle.storeStoreFence();
/* 92 */            l1ioloOOl00l.I00000oIO(this, io1i0ilOOloO);
/* 96 */            this.I00oI0i = true;
                }

                @Override
                public final void I010I0() {
/* 2 */             this.I00oO101o = null;
/* 4 */             this.I00oOio10iI1 = null;
/* 7 */             this.I00oI0i = false;
                }

                public final void I010l1O(O1iOIoOiO0 o1iOIoOiO0, Oo0lloOiiIOI oo0lloOiiIOI, IliO0o11i01 iliO0o11i01) throws IOException {
/* 3 */             I0oilIol11i i0oilIol11iI00000oOI = Oo001ol1Olli.I00000oOI(oo0lloOiiIOI, o1iOIoOiO0, iliO0o11i01, 3, true);
/* 8 */             float fI0000Il00O = i0oilIol11iI00000oOI.I0000Il00O(0);
/* 12 */            float fI0000Il00O2 = i0oilIol11iI00000oOI.I0000Il00O(1);
/* 17 */            float fI0000Il00O3 = i0oilIol11iI00000oOI.I0000Il00O(2);
/* 27 */            this.I00oII = illoi1i0olIl.I00000oIO(fI0000Il00O, fI0000Il00O2, fI0000Il00O3, this.I00o0l1o1o0, 1);
/* 38 */            this.I00oIiI10 = illoi1i0olIl.I00000oIO(fI0000Il00O, fI0000Il00O2, fI0000Il00O3, this.I00o101lO, Integer.MAX_VALUE);
                }

                public final void I010l1ol111(O1IiO0l o1IiO0l) throws IOException {
/* 4 */             if (this.I00oI0i) {
/* 18 */                I010l1O(o1IiO0l, I010lI0oi(), (IliO0o11i01) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I000iOII));
/* 21 */                this.I00oI0i = false;
                    }
/* 23 */            int i = this.I00oII;
/* 29 */            this.I00oII = i >= 0 ? i : 0;
/* 31 */            int i2 = this.I00oIiI10;
/* 34 */            if (i2 == -1) {
/* 37 */                i2 = Integer.MAX_VALUE;
                    }
/* 40 */            this.I00oIiI10 = i2;
                }

                public final Oo0lloOiiIOI I010lI0oi() {
/* 1 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00oO101o;
/* 3 */             if (oo0lloOiiIOI != null) {
/* 5 */                 return oo0lloOiiIOI;
                    }
/* 20 */            throw IlIi0I0.I0000oI00("Resolved style is not set.");
                }
            }
