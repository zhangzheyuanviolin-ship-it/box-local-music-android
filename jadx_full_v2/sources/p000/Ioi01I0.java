            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Size;
            import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            public final class Ioi01I0 extends Ool10o {
                public static final Ioi00Ioi0Oil I001lIiIIo1O = new Ioi00Ioi0Oil();
                public Object I0010I0i;
                public Ioi0O0l1Ol I0010o;
                public Executor I00111O;
                public IoOoo0ll I001IIilI0O;
                public Rect I001IO000;
                public Matrix I001i1O0Ol;
                public OilliIo0l0OI I001i1lo1io;
                public IoilI00 I001iOo1i0O;
                public Oilll1I I001l0I00;

                @Override
                public final OolIl0ii1 I000II(boolean z, OolO0o0O10I oolO0o0O10I) {
/* 3 */             I001lIiIIo1O.getClass();
/* 6 */             Ioi0OoiI ioi0OoiI = Ioi00Ioi0Oil.I00000oIO;
/* 13 */            IOlOo1ll1l1 iOlOo1ll1l1I00000oIO = oolO0o0O10I.I00000oIO(ioi0OoiI.I0010o(), 1);
/* 17 */            if (z) {
/* 19 */                iOlOo1ll1l1I00000oIO = IOlOo1ll1l1.I00100l0(iOlOo1ll1l1I00000oIO, ioi0OoiI);
                    }
/* 23 */            if (iOlOo1ll1l1I00000oIO == null) {
/* 25 */                return null;
                    }
/* 33 */            return ((IIoO01O1) I000l1(iOlOo1ll1l1I00000oIO)).I00100o1O0lo();
                }

                @Override
                public final OolIii00oi1 I000l1(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 7 */             return new IIoO01O1(OI0oiliol10O.I000iOII(iOlOo1ll1l1));
                }

                @Override
                public final OolIl0ii1 I001IIilI0O(IIllOioOlolI iIllOioOlolI, OolIii00oi1 oolIii00oi1) {
                    synchronized (this.I0010I0i) {
                    }
/* 5 */             return oolIii00oi1.I00100o1O0lo();
                }

                @Override
                public final I1lIoOIi I001i1lo1io(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 3 */             this.I001i1lo1io.I00000oIO(iOlOo1ll1l1);
/* 16 */            I00II0Ol1O0l(List.of(this.I001i1lo1io.I0000Il00O()));
/* 21 */            IOiOol0 iOiOol0I00000oOI = this.I000OiO.I00000oOI();
/* 25 */            iOiOol0I00000oOI.I00io1l = iOlOo1ll1l1;
/* 27 */            return iOiOol0I00000oOI.I0000O();
                }

                @Override
                public final I1lIoOIi I001iOo1i0O(I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 1 */             Objects.toString(i1lIoOIi);
/* 4 */             Objects.toString(i1lIoOIi2);
/* 10 */            l11I11lO.I0000O(3, "ImageAnalysis");
/* 15 */            Ioi0OoiI ioi0OoiI = (Ioi0OoiI) this.I000OOo1O;
/* 17 */            I0001Ioi1lo();
/* 20 */            OilliIo0l0OI oilliIo0l0OII00IO1 = I00IO1(ioi0OoiI, i1lIoOIi);
/* 24 */            this.I001i1lo1io = oilliIo0l0OII00IO1;
/* 34 */            I00II0Ol1O0l(List.of(oilliIo0l0OII00IO1.I0000Il00O()));
/* 37 */            return i1lIoOIi;
                }

                @Override
                public final void I001l0I00() {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             Oilll1I oilll1I = this.I001l0I00;
/* 7 */             if (oilll1I != null) {
/* 9 */                 oilll1I.I00000oOI();
/* 12 */                this.I001l0I00 = null;
                    }
/* 14 */            IoilI00 ioilI00 = this.I001iOo1i0O;
/* 16 */            if (ioilI00 != null) {
/* 18 */                ioilI00.I00000oIO();
/* 21 */                this.I001iOo1i0O = null;
                    }
                    synchronized (this.I0010I0i) {
/* 26 */                Ioi0O0l1Ol ioi0O0l1Ol = this.I0010o;
/* 29 */                ioi0O0l1Ol.I00oO101o = false;
/* 31 */                ioi0O0l1Ol.I0000O();
/* 34 */                this.I0010o = null;
                    }
                }

                @Override
                public final void I001lIiIIo1O(Matrix matrix) {
/* 1 */             super.I001lIiIIo1O(matrix);
                    synchronized (this.I0010I0i) {
                        try {
/* 7 */                     Ioi0O0l1Ol ioi0O0l1Ol = this.I0010o;
/* 9 */                     if (ioi0O0l1Ol != null) {
/* 11 */                        ioi0O0l1Ol.I000OOo1O(matrix);
                            }
/* 17 */                    this.I001i1O0Ol = matrix;
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I001lllioOl(Rect rect) {
/* 1 */             this.I000l1 = rect;
                    synchronized (this.I0010I0i) {
                        try {
/* 6 */                     Ioi0O0l1Ol ioi0O0l1Ol = this.I0010o;
/* 8 */                     if (ioi0O0l1Ol != null) {
/* 10 */                        ioi0O0l1Ol.I000OiO(rect);
                            }
/* 16 */                    this.I001IO000 = rect;
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OilliIo0l0OI I00IO1(Ioi0OoiI ioi0OoiI, I1lIoOIi i1lIoOIi) {
                    Ioi0O0l1Ol ioi0O0l1Ol;
                    boolean z;
/* 7 */             lOllIO.I00000oIO();
/* 10 */            Size size = i1lIoOIi.I00000oIO;
/* 22 */            Executor executor = (Executor) ioi0OoiI.I00000oOI(Oo0ol0l.I00IlilI0i0i, Io1iO1Ooo0l.I00000oIO());
/* 24 */            executor.getClass();
/* 73 */            int iIntValue = ((Integer) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00iiI, 0)).intValue() == 1 ? ((Integer) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00iiO, 6)).intValue() : 4;
/* 76 */            OOlli1l1lOlI oOlli1l1lOlI = null;
/* 81 */            if (ioi0OoiI.I00000oOI(Ioi0OoiI.I00iio, null) != null) {
/* 443 */               OIiilo1Ool0o.I00000oIO();
/* 76 */                return null;
                    }
/* 103 */           OOlli1l1lOlI oOlli1l1lOlI2 = new OOlli1l1lOlI(ioOI11II.I00000oIO(size.getWidth(), size.getHeight(), this.I000OOo1O.I000o00OoI0I(), iIntValue));
                    synchronized (this.I0010I0i) {
/* 109 */               I00IOO();
/* 112 */               ioi0O0l1Ol = this.I0010o;
                    }
/* 119 */           if (I0000O() != null) {
/* 155 */               z = ((Boolean) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00io1l, Boolean.FALSE)).booleanValue() && I000OOo1O(I0000O(), false) % 180 != 0;
                    }
/* 163 */           int height = z ? size.getHeight() : size.getWidth();
/* 174 */           int width = z ? size.getWidth() : size.getHeight();
/* 189 */           int i = I00IO1oi11O() == 2 ? 1 : 35;
/* 206 */           boolean z2 = this.I000OOo1O.I000o00OoI0I() == 35 && I00IO1oi11O() == 2;
/* 224 */           boolean z3 = this.I000OOo1O.I000o00OoI0I() == 35 && I00IO1oi11O() == 3;
/* 271 */           boolean z4 = this.I000OOo1O.I000o00OoI0I() == 35 && (!(I0000O() == null || I000OOo1O(I0000O(), false) == 0) || Boolean.TRUE.equals((Boolean) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00ilO0, null)));
/* 272 */           if (z2 || (z4 && !z3)) {
/* 288 */               oOlli1l1lOlI = new OOlli1l1lOlI(ioOI11II.I00000oIO(height, width, i, oOlli1l1lOlI2.I000oI1ioi()));
                    }
/* 291 */           if (oOlli1l1lOlI != null) {
                        synchronized (ioi0O0l1Ol.I00oIiI10) {
/* 296 */                   ioi0O0l1Ol.I00ioIO = oOlli1l1lOlI;
                        }
                    }
                    synchronized (this.I0010I0i) {
                        try {
/* 306 */                   IIllOo0 iIllOo0I0000O = I0000O();
/* 310 */                   if (iIllOo0I0000O != null) {
/* 319 */                       this.I0010o.I00iiI = I000OOo1O(iIllOo0I0000O, false);
                            }
                        } catch (Throwable th) {
/* 439 */                   throw th;
                        }
                    }
/* 325 */           oOlli1l1lOlI2.I000lI(ioi0O0l1Ol, executor);
/* 330 */           OilliIo0l0OI oilliIo0l0OII0000O = OilliIo0l0OI.I0000O(ioi0OoiI, i1lIoOIi.I00000oIO);
/* 334 */           IOlOo1ll1l1 iOlOo1ll1l1 = i1lIoOIi.I0001Ioi1lo;
/* 336 */           if (iOlOo1ll1l1 != null) {
/* 340 */               oilliIo0l0OII0000O.I00000oOI.I0000oI00(iOlOo1ll1l1);
                    }
/* 343 */           IoilI00 ioilI00 = this.I001iOo1i0O;
/* 345 */           if (ioilI00 != null) {
/* 347 */               ioilI00.I00000oIO();
                    }
/* 362 */           IoilI00 ioilI002 = new IoilI00(oOlli1l1lOlI2.getSurface(), size, this.I000OOo1O.I000o00OoI0I());
/* 365 */           this.I001iOo1i0O = ioilI002;
/* 369 */           ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(ioilI002.I0000oI00);
/* 376 */           Io11iII11ll io11iII11ll = new Io11iII11ll(1);
/* 379 */           io11iII11ll.I00iiI = oOlli1l1lOlI2;
/* 381 */           io11iII11ll.I00iiO = oOlli1l1lOlI;
/* 383 */           VarHandle.storeStoreFence();
/* 390 */           listenableFutureI0000oI00.addListener(io11iII11ll, O1OIIoio0i1.I0000O());
/* 395 */           oilliIo0l0OII0000O.I000O01llI0 = i1lIoOIi.I0000O;
/* 397 */           I00000oIO(oilliIo0l0OII0000O, i1lIoOIi);
/* 405 */           oilliIo0l0OII0000O.I00000oOI(this.I001iOo1i0O, i1lIoOIi.I0000Il00O, -1);
/* 408 */           Oilll1I oilll1I = this.I001l0I00;
/* 410 */           if (oilll1I != null) {
/* 412 */               oilll1I.I00000oOI();
                    }
/* 420 */           IoOoloIoi1l ioOoloIoi1l = new IoOoloIoi1l(0);
/* 423 */           ioOoloIoi1l.I00000oOI = this;
/* 425 */           ioOoloIoi1l.I0000Il00O = ioi0O0l1Ol;
/* 427 */           VarHandle.storeStoreFence();
/* 430 */           Oilll1I oilll1I2 = new Oilll1I(ioOoloIoi1l);
/* 433 */           this.I001l0I00 = oilll1I2;
/* 435 */           oilliIo0l0OII0000O.I0001Ioi1lo = oilll1I2;
/* 437 */           return oilliIo0l0OII0000O;
                }

                public final int I00IO1oi11O() {
/* 18 */            return ((Integer) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00ilI0I1, 1)).intValue();
                }

                public final void I00IOO() {
                    Ioi0O0l1Ol ioi0Oi1iIo;
                    IoOoo0ll ioOoo0ll;
                    synchronized (this.I0010I0i) {
                        try {
/* 6 */                     Ioi0OoiI ioi0OoiI = (Ioi0OoiI) this.I000OOo1O;
/* 26 */                    if (((Integer) ioi0OoiI.I00000oOI(Ioi0OoiI.I00iiI, 0)).intValue() == 1) {
/* 30 */                        ioi0Oi1iIo = new Ioi0Oi1iIo();
/* 33 */                        this.I0010o = ioi0Oi1iIo;
                            } else {
/* 51 */                        Executor executor = (Executor) ioi0OoiI.I00000oOI(Oo0ol0l.I00IlilI0i0i, Io1iO1Ooo0l.I00000oIO());
/* 53 */                        Ioi10iOOI ioi10iOOI = new Ioi10iOOI();
/* 61 */                        ioi10iOOI.I00ol1 = new Object();
/* 63 */                        ioi10iOOI.I00oOio10iI1 = executor;
/* 65 */                        VarHandle.storeStoreFence();
/* 68 */                        this.I0010o = ioi10iOOI;
/* 70 */                        ioi0Oi1iIo = ioi10iOOI;
                            }
/* 75 */                    ioi0Oi1iIo.I00iio = I00IO1oi11O();
/* 97 */                    this.I0010o.I00ilI0I1 = ((Boolean) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00io1l, Boolean.FALSE)).booleanValue();
/* 99 */                    IIllOo0 iIllOo0I0000O = I0000O();
/* 114 */                   Boolean bool = (Boolean) ((Ioi0OoiI) this.I000OOo1O).I00000oOI(Ioi0OoiI.I00ilO0, null);
/* 133 */                   boolean zI00000oIO = iIllOo0I0000O != null ? iIllOo0I0000O.I0010o().I0010o().I00000oIO(OnePixelShiftQuirk.class) : false;
/* 134 */                   Ioi0O0l1Ol ioi0O0l1Ol = this.I0010o;
/* 136 */                   if (bool != null) {
/* 139 */                       zI00000oIO = bool.booleanValue();
                            }
/* 143 */                   ioi0O0l1Ol.I00ilO0 = zI00000oIO;
/* 145 */                   if (iIllOo0I0000O != null) {
/* 153 */                       this.I0010o.I00iiI = I000OOo1O(iIllOo0I0000O, false);
                            }
/* 155 */                   Rect rect = this.I001IO000;
/* 157 */                   if (rect != null) {
/* 161 */                       this.I0010o.I000OiO(rect);
                            }
/* 164 */                   Matrix matrix = this.I001i1O0Ol;
/* 166 */                   if (matrix != null) {
/* 170 */                       this.I0010o.I000OOo1O(matrix);
                            }
/* 173 */                   Executor executor2 = this.I00111O;
/* 175 */                   if (executor2 != null && (ioOoo0ll = this.I001IIilI0O) != null) {
/* 181 */                       Ioi0O0l1Ol ioi0O0l1Ol2 = this.I0010o;
                                synchronized (ioi0O0l1Ol2.I00oIiI10) {
/* 186 */                           ioi0O0l1Ol2.I00iOIl = ioOoo0ll;
/* 188 */                           ioi0O0l1Ol2.I00io1l = executor2;
                                }
                            }
                        } finally {
                        }
                    }
                }

                public final void I00IioO0OiOi(Executor executor, IoOoo0ll ioOoo0ll) {
                    synchronized (this.I0010I0i) {
                        try {
/* 4 */                     Ioi0O0l1Ol ioi0O0l1Ol = this.I0010o;
/* 6 */                     if (ioi0O0l1Ol != null) {
/* 12 */                        I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(17);
/* 15 */                        i0IOIlIOIII.I00iiI = ioOoo0ll;
/* 17 */                        VarHandle.storeStoreFence();
                                synchronized (ioi0O0l1Ol.I00oIiI10) {
/* 23 */                            ioi0O0l1Ol.I00iOIl = i0IOIlIOIII;
/* 25 */                            ioi0O0l1Ol.I00io1l = executor;
                                }
                            }
/* 36 */                    if (this.I001IIilI0O == null) {
/* 38 */                        I00100l0();
                            }
/* 41 */                    this.I00111O = executor;
/* 43 */                    this.I001IIilI0O = ioOoo0ll;
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                public final String toString() {
/* 7 */             return "ImageAnalysis:".concat(I000O01llI0());
                }
            }
