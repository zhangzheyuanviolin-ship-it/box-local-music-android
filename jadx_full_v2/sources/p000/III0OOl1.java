            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class III0OOl1 extends O1ooOo implements III010o1O, O0iOIlio1O {
                public IOoO1ol1 I00o0iI0io1;
                public boolean I00o0l1o1o0;

                public static final OOo0IO I010l1O(III0OOl1 iII0OOl1, OIIlIII0Ili oIIlIII0Ili, I01ii1IIl i01ii1IIl) {
                    OOo0IO oOo0IO;
/* 4 */             if (iII0OOl1.I00lll10 && iII0OOl1.I00o0l1o1o0) {
/* 12 */                OIIlIII0Ili oIIlIII0IliI000II = il0lI1i1olii.I000II(iII0OOl1);
/* 22 */                if (!oIIlIII0Ili.I0110OiO().I00lll10) {
/* 25 */                    oIIlIII0Ili = null;
                        }
/* 26 */                if (oIIlIII0Ili != null && (oOo0IO = (OOo0IO) i01ii1IIl.invoke()) != null) {
/* 47 */                    return oOo0IO.I000OiO(oIIlIII0IliI000II.I00IoiI(oIIlIII0Ili, false).I0000oI00());
                        }
                    }
/* 3 */             return null;
                }

                @Override
                public final void I000iOII(O0iOOo0Ii o0iOOo0Ii) {
/* 2 */             this.I00o0l1o1o0 = true;
                }

                @Override
                public final Object I00Iooi00oi(OIIlIII0Ili oIIlIII0Ili, I01ii1IIl i01ii1IIl, IOoilo iOoilo) {
/* 5 */             I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(9);
/* 8 */             i0iI0O1IoIoI.I00iiI = this;
/* 10 */            i0iI0O1IoIoI.I00iiO = oIIlIII0Ili;
/* 12 */            i0iI0O1IoIoI.I00iio = i01ii1IIl;
/* 14 */            VarHandle.storeStoreFence();
/* 27 */            Object objI0000Il00O = il001oo1.I0000Il00O(new I0O0Ooi10l(this, oIIlIII0Ili, i01ii1IIl, i0iI0O1IoIoI, (IOoil1iiIilo) null, 1), iOoilo);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }
            }
