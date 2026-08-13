            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Objects;
            
            public final class IlOI0O11011l implements Ool1II0ii {
                public IIloIoOOiO0l I00000oIO;
                public OlO01I1 I00000oOI;
                public OolOi0i I0000Il00O;
                public OoI00O0l I0000O;
                public OolOl0lI I0000oI00;
                public Ool1lo I0001Ioi1lo;
                public volatile int I000II;
                public volatile Ioi11lOIIO0O I000O01llI0;
                public IOi10loi I000OOo1O;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(long j, IOoilo iOoilo) throws Throwable {
                    IlO1l1OiiOoo ilO1l1OiiOoo;
                    IlOI0O11011l ilOI0O11011l;
                    IOi10loi iOi10loi;
                    long j2;
/* 3 */             if (iOoilo instanceof IlO1l1OiiOoo) {
/* 6 */                 ilO1l1OiiOoo = (IlO1l1OiiOoo) iOoilo;
/* 8 */                 int i = ilO1l1OiiOoo.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilO1l1OiiOoo.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilO1l1OiiOoo = new IlO1l1OiiOoo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ilO1l1OiiOoo.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilO1l1OiiOoo.I00ilI0I1;
/* 32 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(obj);
/* 59 */                IOi10loi iOi10loi2 = new IOi10loi();
/* 66 */                I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(9);
/* 69 */                i0IOIlIOIII.I00iiI = iOi10loi2;
/* 71 */                VarHandle.storeStoreFence();
/* 74 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 76 */                Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 81 */                ilOI0O11011l = this;
/* 83 */                IlO1lII ilO1lII = new IlO1lII(j, ilOI0O11011l, i0IOIlIOIII, null);
/* 86 */                ilO1l1OiiOoo.I00iiI = iOi10loi2;
/* 88 */                ilO1l1OiiOoo.I00iOIl = j;
/* 90 */                ilO1l1OiiOoo.I00ilI0I1 = 1;
/* 96 */                if (iOi1II01i0.I0000oI00(io11l1li, ilO1lII, ilO1l1OiiOoo) == ii0111o) {
/* 98 */                    return ii0111o;
                        }
/* 99 */                iOi10loi = iOi10loi2;
/* 100 */               j2 = j;
                    } else {
/* 34 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 36 */                long j3 = ilO1l1OiiOoo.I00iOIl;
/* 38 */                IOi10loi iOi10loi3 = ilO1l1OiiOoo.I00iiI;
/* 40 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                ilOI0O11011l = this;
/* 44 */                j2 = j3;
/* 45 */                iOi10loi = iOi10loi3;
                    }
/* 113 */           return iOi1II01i0.I00000oOI(ilOI0O11011l.I0000Il00O.I00000oIO, null, new I10I1l(iOi10loi, j2, (IOoil1iiIilo) null, 2), 3);
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             this.I0001Ioi1lo = ool1lo;
/* 6 */             I0000O(this.I000II, false);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(IOoilo iOoilo) throws Throwable {
                    IlO1llIOo0Io ilO1llIOo0Io;
                    int i;
/* 3 */             if (iOoilo instanceof IlO1llIOo0Io) {
/* 6 */                 ilO1llIOo0Io = (IlO1llIOo0Io) iOoilo;
/* 8 */                 int i2 = ilO1llIOo0Io.I00iio;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilO1llIOo0Io.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilO1llIOo0Io = new IlO1llIOo0Io(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ilO1llIOo0Io.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = ilO1llIOo0Io.I00iio;
/* 35 */            if (i3 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 55 */                l11I11lO.I0000O(3, "CXCP");
/* 58 */                int i4 = this.I000II;
/* 60 */                IOi10loi iOi10loiI00000oIO = this.I000OOo1O;
/* 62 */                if (iOi10loiI00000oIO == null) {
/* 67 */                    iOi10loiI00000oIO = iiiO1IOliI0.I00000oIO(OoiIlOl1iI.I00000oIO);
                        }
/* 71 */                ilO1llIOo0Io.I00iOIl = i4;
/* 73 */                ilO1llIOo0Io.I00iio = 1;
/* 79 */                if (iOi10loiI00000oIO.I001l0I00(ilO1llIOo0Io) == ii0111o) {
/* 81 */                    return ii0111o;
                        }
/* 82 */                i = i4;
                    } else {
/* 37 */                if (i3 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 50 */                    return null;
                        }
/* 39 */                i = ilO1llIOo0Io.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 83 */            l11I11lO.I0000O(3, "CXCP");
/* 88 */            return new Integer(i);
                }

                public final IOi10loi I0000O(int i, boolean z) {
/* 8 */             if (l11I11lO.I0000O(3, "CXCP")) {
/* 12 */                Objects.toString(this.I0001Ioi1lo);
                    }
/* 17 */            IOi10loi iOi10loi = new IOi10loi();
/* 22 */            if (this.I0001Ioi1lo == null) {
/* 69 */                IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
/* 106 */               return iOi10loi;
                    }
/* 24 */            this.I000II = i;
/* 26 */            IOi10loi iOi10loi2 = this.I000OOo1O;
/* 28 */            if (z) {
/* 30 */                if (iOi10loi2 != null) {
/* 34 */                    IIl001iO0Io.I001l0I00("There is a new flash mode being set or camera was closed", iOi10loi2);
                        }
/* 38 */                this.I000OOo1O = null;
                    } else if (iOi10loi2 != null) {
/* 43 */                iiolOOio1.I0000Il00O(iOi10loi, iOi10loi2);
                    }
/* 46 */            this.I000OOo1O = iOi10loi;
/* 48 */            OlO01I1 olO01I1 = this.I00000oOI;
                    synchronized (olO01I1.I0000O) {
/* 53 */                olO01I1.I000O01llI0 = i;
                    }
/* 60 */            iiolOOio1.I0000Il00O(olO01I1.I0001Ioi1lo(), iOi10loi);
/* 63 */            return iOi10loi;
                }

                /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
                
                    if (p000.iOOlOiI.I00000oIO(r7, r1) == r2) goto L42;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(IOoilo iOoilo) throws Throwable {
                    IlO1oI ilO1oI;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    IOi10loi iOi10loiI0001Ioi1lo;
                    IOi10loi iOi10loiI0000Il00O;
/* 5 */             if (iOoilo instanceof IlO1oI) {
/* 8 */                 ilO1oI = (IlO1oI) iOoilo;
/* 10 */                int i = ilO1oI.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ilO1oI.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ilO1oI = new IlO1oI(this, iOoilo);
                        }
                    }
/* 27 */            Object objI00000oIO = ilO1oI.I00iiO;
/* 29 */            Object obj = Ii0111o.I00iOIl;
/* 31 */            int i2 = ilO1oI.I00ilI0I1;
/* 36 */            if (i2 == 0) {
/* 61 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 66 */                arrayList = new ArrayList();
/* 69 */                ilO1oI.I00iOIl = arrayList;
/* 71 */                ilO1oI.I00iiI = arrayList;
/* 73 */                ilO1oI.I00ilI0I1 = 1;
/* 77 */                objI00000oIO = I00000oIO(3000L, ilO1oI);
/* 81 */                if (objI00000oIO != obj) {
/* 85 */                    arrayList2 = arrayList;
                        }
/* 190 */               return obj;
                    }
/* 38 */            if (i2 != 1) {
/* 40 */                if (i2 == 2) {
/* 42 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 191 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 49 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                return null;
                    }
/* 53 */            arrayList = ilO1oI.I00iiI;
/* 55 */            arrayList2 = ilO1oI.I00iOIl;
/* 57 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 86 */            arrayList.add(objI00000oIO);
/* 102 */           boolean z = iOiloi0oOI1.I00000oOI(this.I00000oIO.I00000oOI, 5) == 5;
/* 104 */           l11I11lO.I0000O(3, "CXCP");
/* 107 */           if (z) {
/* 111 */               OlO01I1 olO01I1 = this.I00000oOI;
                        synchronized (olO01I1.I0000O) {
/* 116 */                   olO01I1.I000OiO = true;
                        }
/* 119 */               iOi10loiI0001Ioi1lo = olO01I1.I0001Ioi1lo();
/* 123 */               l11I11lO.I0000O(3, "CXCP");
/* 133 */               iOi10loiI0001Ioi1lo.I00iiI(new Iil0iiOiI(10));
                    } else {
/* 109 */               iOi10loiI0001Ioi1lo = null;
                    }
/* 136 */           if (iOi10loiI0001Ioi1lo != null) {
/* 138 */               arrayList2.add(iOi10loiI0001Ioi1lo);
                    }
/* 143 */           boolean zI000OiO = this.I0000oI00.I000OiO();
/* 147 */           l11I11lO.I0000O(3, "CXCP");
/* 150 */           if (zI000OiO) {
/* 9 */                 iOi10loiI0000Il00O = this.I0000O.I0000Il00O(2, true, (6 & 4) == 0);
/* 160 */               l11I11lO.I0000O(3, "CXCP");
/* 170 */               iOi10loiI0000Il00O.I00iiI(new Iil0iiOiI(9));
                    } else {
/* 152 */               iOi10loiI0000Il00O = null;
                    }
/* 173 */           if (iOi10loiI0000Il00O != null) {
/* 175 */               arrayList2.add(iOi10loiI0000Il00O);
                    }
/* 178 */           ilO1oI.I00iOIl = null;
/* 180 */           ilO1oI.I00iiI = null;
/* 182 */           ilO1oI.I00ilI0I1 = 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(IOoilo iOoilo) throws Throwable {
                    IlO1ooO ilO1ooO;
/* 3 */             if (iOoilo instanceof IlO1ooO) {
/* 6 */                 ilO1ooO = (IlO1ooO) iOoilo;
/* 8 */                 int i = ilO1ooO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilO1ooO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilO1ooO = new IlO1ooO(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ilO1ooO.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilO1ooO.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 50 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 52 */                Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 58 */                I1iOI0oo i1iOI0oo = new I1iOI0oo(this, iOoil1iiIilo, 8);
/* 61 */                ilO1ooO.I00iiO = 1;
/* 67 */                if (iOi1II01i0.I0000oI00(io11l1li, i1iOI0oo, ilO1ooO) == ii0111o) {
/* 69 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 80 */            if (iOiloi0oOI1.I00000oOI(this.I00000oIO.I00000oOI, 5) == 5) {
/* 82 */                OlO01I1 olO01I1 = this.I00000oOI;
                        synchronized (olO01I1.I0000O) {
/* 87 */                    olO01I1.I000OiO = false;
                        }
/* 90 */                olO01I1.I0001Ioi1lo();
                    }
/* 103 */           if (this.I0000oI00.I000OiO()) {
/* 9 */                 this.I0000O.I0000Il00O(0, true, (6 & 4) == 0);
                    }
/* 111 */           return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final void reset() {
/* 2 */             this.I000II = 2;
/* 5 */             this.I000O01llI0 = null;
/* 7 */             IOi10loi iOi10loi = this.I000OOo1O;
/* 9 */             if (iOi10loi != null) {
/* 13 */                IIl001iO0Io.I001l0I00("There is a new flash mode being set or camera was closed", iOi10loi);
                    }
/* 16 */            this.I000OOo1O = null;
/* 19 */            I0000O(2, true);
                }
            }
