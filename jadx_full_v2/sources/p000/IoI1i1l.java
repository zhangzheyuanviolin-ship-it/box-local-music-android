            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class IoI1i1l extends O1ooOo implements OoIOloiIii, OO1iloII0lOo, IOlIil1 {
                public Iil1iOI I00o0iI0io1;
                public OO1iIiOoO0 I00o0l1o1o0;
                public boolean I00o101lO;

                public IoI1i1l(I0olOlooIO0o i0olOlooIO0o, Iil1iOI iil1iOI) {
/* 4 */             this.I00o0iI0io1 = iil1iOI;
/* 6 */             this.I00o0l1o1o0 = i0olOlooIO0o;
                }

                @Override
                public final long I000oI1ioi() {
/* 3 */             if (this.I00o0iI0io1 == null) {
/* 38 */                return OoI01lI.I00000oIO;
                    }
/* 9 */             IiIooOOOI iiIooOOOI = il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
/* 11 */            int i = OoI01lI.I00000oOI;
/* 33 */            return lOo0111.I00000oIO(iiIooOOOI.I00l0OO0IO(10.0f), iiIooOOOI.I00l0OO0IO(40.0f), iiIooOOOI.I00l0OO0IO(10.0f), iiIooOOOI.I00l0OO0IO(40.0f));
                }

                @Override
                public final void I001l0I00(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l, long j) {
/* 3 */             if (oO1i0l == OO1i0l.I00iiI) {
/* 5 */                 List list = oO1Oooio101.I00000oIO;
/* 10 */                int size = list.size();
/* 15 */                for (int i = 0; i < size; i++) {
/* 29 */                    if (I010o0o0oO(((OO1il00lI) list.get(i)).I000OOo1O)) {
/* 31 */                        int i2 = oO1Oooio101.I0001Ioi1lo;
/* 34 */                        if (i2 == 4) {
/* 37 */                            this.I00o101lO = true;
/* 39 */                            I010lI0oi();
/* 42 */                            return;
                                } else {
/* 44 */                            if (i2 == 5) {
/* 46 */                                I010oio1OO0();
/* 49 */                                return;
                                    }
/* 98 */                            return;
                                }
                            }
                        }
                    }
                }

                @Override
                public final void I00IO1oi11O() {
/* 1 */             I010oio1OO0();
                }

                @Override
                public final void I010I0() {
/* 1 */             I010oio1OO0();
                }

                public final void I010l1O() {
                    OO1iIiOoO0 oO1iIiOoO0;
/* 3 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 9 */             IoI0IiI0 ioI0IiI0 = new IoI0IiI0(2);
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            lOo1ii0o1.I0000Il00O(this, ioI0IiI0);
/* 20 */            IoI1i1l ioI1i1l = (IoI1i1l) oOo0ooi.I00iOIl;
/* 22 */            if (ioI1i1l == null || (oO1iIiOoO0 = ioI1i1l.I00o0l1o1o0) == null) {
/* 28 */                oO1iIiOoO0 = this.I00o0l1o1o0;
                    }
/* 30 */            I010l1ol111(oO1iIiOoO0);
                }

                public abstract void I010l1ol111(OO1iIiOoO0 oO1iIiOoO0);

                public final void I010lI0oi() {
/* 3 */             OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 7 */             oOo0l0ii10l.I00iOIl = true;
/* 11 */            Iil1oo1 iil1oo1 = new Iil1oo1(1);
/* 14 */            iil1oo1.I00iiI = oOo0l0ii10l;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            lOo1ii0o1.I0000oI00(this, iil1oo1);
/* 24 */            if (oOo0l0ii10l.I00iOIl) {
/* 26 */                I010l1O();
                    }
                }

                public abstract boolean I010o0o0oO(int i);

                public final void I010oio1OO0() {
/* 3 */             if (this.I00o101lO) {
/* 6 */                 this.I00o101lO = false;
/* 10 */                if (this.I00lll10) {
/* 14 */                    OOo0ooi oOo0ooi = new OOo0ooi();
/* 20 */                    I0lOo1lO i0lOo1lO = new I0lOo1lO(2);
/* 23 */                    i0lOo1lO.I00iiI = oOo0ooi;
/* 25 */                    VarHandle.storeStoreFence();
/* 28 */                    lOo1ii0o1.I0000Il00O(this, i0lOo1lO);
/* 33 */                    IoI1i1l ioI1i1l = (IoI1i1l) oOo0ooi.I00iOIl;
/* 35 */                    if (ioI1i1l != null) {
/* 37 */                        ioI1i1l.I010l1O();
                            } else {
/* 42 */                        I010l1ol111(null);
                            }
                        }
                    }
                }
            }
