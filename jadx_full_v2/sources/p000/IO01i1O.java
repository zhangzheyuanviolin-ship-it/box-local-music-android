            package p000;

            import java.util.List;
            
            public final class IO01i1O extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final List I00iiI;
                public final boolean I00iiO;
                public final IO01o11o0lI0 I00iio;
                public final boolean I00ilI0I1;
                public final boolean I00ilO0;
                public final int I00io1l;
                public AutoCloseable I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO01i1O(List list, IOoil1iiIilo iOoil1iiIilo, boolean z, IO01o11o0lI0 iO01o11o0lI0, boolean z2, boolean z3, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = list;
/* 3 */             this.I00iiO = z;
/* 5 */             this.I00iio = iO01o11o0lI0;
/* 7 */             this.I00ilI0I1 = z2;
/* 9 */             this.I00ilO0 = z3;
/* 11 */            this.I00io1l = i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new IO01i1O(this.I00iiI, iOoil1iiIilo, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IO01i1O) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
                
                    if (r1.I0010I0i(1000000000, r12) == r0) goto L49;
                 */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AutoCloseable autoCloseable;
                    Throwable th;
                    AutoCloseable autoCloseable2;
                    IIll1i iIll1i;
                    boolean z;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             int i2 = this.I00io1l;
/* 15 */            if (i == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                l11I11lO.I0000O(3, "CXCP");
/* 59 */                List list = this.I00iiI;
/* 63 */                this.I00iOIl = 1;
/* 69 */                if (iOOlOiI.I00000oOI(list, this) != ii0111o) {
                        }
/* 169 */               return ii0111o;
                    }
/* 17 */            if (i != 1) {
/* 19 */                if (i == 2) {
/* 45 */                    lIoii1l01l0i.I00000oOI(obj);
/* 115 */                   autoCloseable = (AutoCloseable) obj;
                            try {
/* 118 */                       iIll1i = (IIll1i) autoCloseable;
/* 120 */                       z = i2 == 0;
/* 123 */                       this.I00ioIO = autoCloseable;
/* 125 */                       this.I00iOIl = 3;
/* 131 */                       if (iIll1i.I001l0I00(z) != ii0111o) {
/* 134 */                           autoCloseable2 = autoCloseable;
/* 135 */                           iOOl00.I00000oIO(autoCloseable2, null);
/* 173 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 169 */                       return ii0111o;
                            } catch (Throwable th2) {
/* 141 */                       th = th2;
/* 142 */                       autoCloseable2 = autoCloseable;
/* 143 */                       throw th;
                            }
                        }
/* 21 */                if (i != 3) {
/* 23 */                    if (i != 4) {
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                        return null;
                            }
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
/* 170 */                   l11I11lO.I0000O(3, "CXCP");
/* 173 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 36 */                autoCloseable2 = this.I00ioIO;
                        try {
/* 38 */                    lIoii1l01l0i.I00000oOI(obj);
/* 135 */                   iOOl00.I00000oIO(autoCloseable2, null);
/* 173 */                   return OoiIlOl1iI.I00000oIO;
                        } catch (Throwable th3) {
/* 42 */                    th = th3;
                            try {
/* 143 */                       throw th;
                            } catch (Throwable th4) {
/* 145 */                       iOOl00.I00000oIO(autoCloseable2, th);
/* 148 */                       throw th4;
                            }
                        }
                    }
/* 49 */            lIoii1l01l0i.I00000oOI(obj);
/* 72 */            l11I11lO.I0000O(3, "CXCP");
/* 75 */            boolean z2 = this.I00iiO;
/* 77 */            IO01o11o0lI0 iO01o11o0lI0 = this.I00iio;
/* 79 */            if (z2) {
/* 81 */                l11I11lO.I0000O(3, "CXCP");
/* 9 */                 iO01o11o0lI0.I0000Il00O.I0000Il00O(0, true, (6 & 4) == 0);
/* 90 */                l11I11lO.I0000O(3, "CXCP");
                    }
/* 95 */            if (!this.I00ilI0I1) {
/* 151 */               if (this.I00ilO0 && i2 == 0) {
/* 155 */                   l11I11lO.I0000O(3, "CXCP");
/* 158 */                   this.I00iOIl = 4;
                        }
/* 173 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 97 */            l11I11lO.I0000O(3, "CXCP");
/* 102 */           IIll0oO iIll0oOI00000oIO = iO01o11o0lI0.I000OOo1O.I00000oIO();
/* 106 */           this.I00iOIl = 2;
/* 108 */           obj = iIll0oOI00000oIO.I0000Il00O(this);
/* 112 */           if (obj != ii0111o) {
/* 115 */               autoCloseable = (AutoCloseable) obj;
/* 118 */               iIll1i = (IIll1i) autoCloseable;
/* 120 */               if (i2 == 0) {
                        }
/* 123 */               this.I00ioIO = autoCloseable;
/* 125 */               this.I00iOIl = 3;
/* 131 */               if (iIll1i.I001l0I00(z) != ii0111o) {
                        }
                    }
/* 169 */           return ii0111o;
                }
            }
