            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            
            public final class OOIIOiolI extends Ool10o {
                public static final OOIIOi I001iOo1i0O = new OOIIOi();
                public static final ScheduledExecutorService I001l0I00 = O1OIIoio0i1.I0000O();
                public OOIIOiIoll0 I0010I0i;
                public Executor I0010o;
                public OilliIo0l0OI I00111O;
                public IoilI00 I001IIilI0O;
                public OlioOil I001IO000;
                public Oll0I0l1i1 I001i1O0Ol;
                public Oilll1I I001i1lo1io;

                @Override
                public final OolIl0ii1 I000II(boolean z, OolO0o0O10I oolO0o0O10I) {
/* 3 */             I001iOo1i0O.getClass();
/* 6 */             OOIIOlolo1 oOIIOlolo1 = OOIIOi.I00000oIO;
/* 13 */            IOlOo1ll1l1 iOlOo1ll1l1I00000oIO = oolO0o0O10I.I00000oIO(oOIIOlolo1.I0010o(), 1);
/* 17 */            if (z) {
/* 19 */                iOlOo1ll1l1I00000oIO = IOlOo1ll1l1.I00100l0(iOlOo1ll1l1I00000oIO, oOIIOlolo1);
                    }
/* 23 */            if (iOlOo1ll1l1I00000oIO == null) {
/* 25 */                return null;
                    }
/* 33 */            return ((IIl0lo1oi) I000l1(iOlOo1ll1l1I00000oIO)).I0000Il00O();
                }

                @Override
                public final Set I000iOII() {
/* 3 */             HashSet hashSet = new HashSet();
/* 11 */            hashSet.add(1);
/* 20 */            return hashSet;
                }

                @Override
                public final OolIii00oi1 I000l1(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 8 */             return new IIl0lo1oi(OI0oiliol10O.I000iOII(iOlOo1ll1l1), 1);
                }

                @Override
                public final OolIl0ii1 I001IIilI0O(IIllOioOlolI iIllOioOlolI, OolIii00oi1 oolIii00oi1) {
/* 13 */            oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 34);
/* 16 */            return oolIii00oi1.I00100o1O0lo();
                }

                @Override
                public final I1lIoOIi I001i1lo1io(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 3 */             this.I00111O.I00000oIO(iOlOo1ll1l1);
/* 16 */            I00II0Ol1O0l(List.of(this.I00111O.I0000Il00O()));
/* 21 */            IOiOol0 iOiOol0I00000oOI = this.I000OiO.I00000oOI();
/* 25 */            iOiOol0I00000oOI.I00io1l = iOlOo1ll1l1;
/* 27 */            return iOiOol0I00000oOI.I0000O();
                }

                @Override
                public final I1lIoOIi I001iOo1i0O(I1lIoOIi i1lIoOIi, I1lIoOIi i1lIoOIi2) {
/* 1 */             Objects.toString(i1lIoOIi);
/* 4 */             Objects.toString(i1lIoOIi2);
/* 10 */            l11I11lO.I0000O(3, "Preview");
/* 17 */            I00IOO((OOIIOlolo1) this.I000OOo1O, i1lIoOIi);
/* 37 */            return i1lIoOIi;
                }

                @Override
                public final void I001l0I00() {
/* 1 */             I00IO1();
                }

                @Override
                public final void I001lllioOl(Rect rect) {
/* 1 */             this.I000l1 = rect;
/* 3 */             IIllOo0 iIllOo0I0000O = I0000O();
/* 7 */             OlioOil olioOil = this.I001IO000;
/* 9 */             if (iIllOo0I0000O == null || olioOil == null) {
/* 77 */                return;
                    }
/* 17 */            int iI000OOo1O = I000OOo1O(iIllOo0I0000O, I000o00OoI0I(iIllOo0I0000O));
/* 38 */            int iIntValue = ((Integer) ((IoiIli1i0Oil) this.I000OOo1O).I00000oOI(IoiIli1i0Oil.I001IO000, -1)).intValue();
/* 44 */            Olio11 olio11 = new Olio11();
/* 47 */            olio11.I00iOIl = olioOil;
/* 49 */            olio11.I00iiI = iI000OOo1O;
/* 51 */            olio11.I00iiO = iIntValue;
/* 53 */            VarHandle.storeStoreFence();
/* 56 */            lOllIO.I0000Il00O(olio11);
                }

                public final void I00IO1() {
/* 1 */             Oilll1I oilll1I = this.I001i1lo1io;
/* 4 */             if (oilll1I != null) {
/* 6 */                 oilll1I.I00000oOI();
/* 9 */                 this.I001i1lo1io = null;
                    }
/* 11 */            IoilI00 ioilI00 = this.I001IIilI0O;
/* 13 */            if (ioilI00 != null) {
/* 15 */                ioilI00.I00000oIO();
/* 18 */                this.I001IIilI0O = null;
                    }
/* 20 */            OlioOil olioOil = this.I001IO000;
/* 22 */            if (olioOil != null) {
/* 24 */                olioOil.I00000oOI();
/* 27 */                this.I001IO000 = null;
                    }
/* 29 */            Oll0I0l1i1 oll0I0l1i1 = this.I001i1O0Ol;
/* 31 */            if (oll0I0l1i1 != null) {
                        synchronized (oll0I0l1i1.I00000oIO) {
/* 36 */                    oll0I0l1i1.I000lI = null;
/* 38 */                    oll0I0l1i1.I000o00OoI0I = null;
                        }
                    }
/* 45 */            this.I001i1O0Ol = null;
                }

                public final void I00IO1oi11O(OOIIOiIoll0 oOIIOiIoll0) {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             if (oOIIOiIoll0 == null) {
/* 7 */                 this.I0010I0i = null;
/* 10 */                this.I0000oI00 = 2;
/* 12 */                I0010I0i();
                    } else {
/* 16 */                this.I0010I0i = oOIIOiIoll0;
/* 20 */                this.I0010o = I001l0I00;
/* 26 */                if (I0000Il00O() != null) {
/* 34 */                    I00IOO((OOIIOlolo1) this.I000OOo1O, this.I000OiO);
/* 37 */                    I00100o1O0lo();
                        }
/* 40 */                I00100l0();
                    }
                }

                public final void I00IOO(OOIIOlolo1 oOIIOlolo1, I1lIoOIi i1lIoOIi) {
                    Rect rect;
/* 8 */             lOllIO.I00000oIO();
/* 11 */            IIllOo0 iIllOo0I0000O = I0000O();
/* 15 */            Objects.requireNonNull(iIllOo0I0000O);
/* 18 */            I00IO1();
/* 24 */            int i = 1;
/* 31 */            lII1OI11o1I.I0000oI00(null, this.I001IO000 == null);
/* 36 */            Matrix matrix = this.I000lI;
/* 38 */            boolean zI00100o1O0lo = iIllOo0I0000O.I00100o1O0lo();
/* 42 */            Size size = i1lIoOIi.I00000oIO;
/* 44 */            Rect rect2 = this.I000l1;
/* 46 */            if (rect2 != null) {
/* 48 */                rect = rect2;
                    } else {
/* 62 */                rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
                    }
/* 66 */            Objects.requireNonNull(rect);
/* 73 */            int iI000OOo1O = I000OOo1O(iIllOo0I0000O, I000o00OoI0I(iIllOo0I0000O));
/* 79 */            IoiIli1i0Oil ioiIli1i0Oil = (IoiIli1i0Oil) this.I000OOo1O;
/* 81 */            I1ioiI i1ioiI = IoiIli1i0Oil.I001IO000;
/* 111 */           OlioOil olioOil = new OlioOil(1, 34, i1lIoOIi, matrix, zI00100o1O0lo, rect, iI000OOo1O, ((Integer) ioiIli1i0Oil.I00000oOI(i1ioiI, -1)).intValue(), iIllOo0I0000O.I00100o1O0lo() && I000o00OoI0I(iIllOo0I0000O));
/* 114 */           this.I001IO000 = olioOil;
/* 120 */           I0100i i0100i = new I0100i(29);
/* 123 */           i0100i.I00iiI = this;
/* 125 */           VarHandle.storeStoreFence();
/* 128 */           lOllIO.I00000oIO();
/* 131 */           olioOil.I00000oIO();
/* 136 */           olioOil.I000lI.add(i0100i);
/* 141 */           Oll0I0l1i1 oll0I0l1i1I0000O = this.I001IO000.I0000O(iIllOo0I0000O, true);
/* 145 */           this.I001i1O0Ol = oll0I0l1i1I0000O;
/* 149 */           this.I001IIilI0O = oll0I0l1i1I0000O.I000iOII;
/* 153 */           if (this.I0010I0i != null) {
/* 155 */               IIllOo0 iIllOo0I0000O2 = I0000O();
/* 159 */               OlioOil olioOil2 = this.I001IO000;
/* 161 */               if (iIllOo0I0000O2 != null && olioOil2 != null) {
/* 169 */                   int iI000OOo1O2 = I000OOo1O(iIllOo0I0000O2, I000o00OoI0I(iIllOo0I0000O2));
/* 183 */                   int iIntValue = ((Integer) ((IoiIli1i0Oil) this.I000OOo1O).I00000oOI(i1ioiI, -1)).intValue();
/* 189 */                   Olio11 olio11 = new Olio11();
/* 192 */                   olio11.I00iOIl = olioOil2;
/* 194 */                   olio11.I00iiI = iI000OOo1O2;
/* 196 */                   olio11.I00iiO = iIntValue;
/* 198 */                   VarHandle.storeStoreFence();
/* 201 */                   lOllIO.I0000Il00O(olio11);
                        }
/* 204 */               OOIIOiIoll0 oOIIOiIoll0 = this.I0010I0i;
/* 206 */               oOIIOiIoll0.getClass();
/* 209 */               Oll0I0l1i1 oll0I0l1i1 = this.I001i1O0Ol;
/* 211 */               oll0I0l1i1.getClass();
/* 214 */               Executor executor = this.I0010o;
/* 220 */               Io11iII11ll io11iII11ll = new Io11iII11ll(10);
/* 223 */               io11iII11ll.I00iiI = oOIIOiIoll0;
/* 225 */               io11iII11ll.I00iiO = oll0I0l1i1;
/* 227 */               VarHandle.storeStoreFence();
/* 230 */               executor.execute(io11iII11ll);
                    }
/* 235 */           OilliIo0l0OI oilliIo0l0OII0000O = OilliIo0l0OI.I0000O(oOIIOlolo1, i1lIoOIi.I00000oIO);
/* 239 */           I0oiil10Ili i0oiil10Ili = oilliIo0l0OII0000O.I00000oOI;
/* 243 */           oilliIo0l0OII0000O.I000O01llI0 = i1lIoOIi.I0000O;
/* 245 */           I00000oIO(oilliIo0l0OII0000O, i1lIoOIi);
/* 248 */           int iI001l0I00 = oOIIOlolo1.I001l0I00();
/* 252 */           if (iI001l0I00 != 0 && iI001l0I00 != 0) {
/* 266 */               ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(OolIl0ii1.I00OIo, Integer.valueOf(iI001l0I00));
                    }
/* 269 */           IOlOo1ll1l1 iOlOo1ll1l1 = i1lIoOIi.I0001Ioi1lo;
/* 271 */           if (iOlOo1ll1l1 != null) {
/* 273 */               i0oiil10Ili.I0000oI00(iOlOo1ll1l1);
                    }
/* 278 */           if (this.I0010I0i != null) {
/* 300 */               oilliIo0l0OII0000O.I00000oOI(this.I001IIilI0O, i1lIoOIi.I0000Il00O, ((Integer) ((IoiIli1i0Oil) this.I000OOo1O).I00000oOI(IoiIli1i0Oil.I001i1O0Ol, -1)).intValue());
                    }
/* 303 */           Oilll1I oilll1I = this.I001i1lo1io;
/* 305 */           if (oilll1I != null) {
/* 307 */               oilll1I.I00000oOI();
                    }
/* 314 */           Ioi10lIoII ioi10lIoII = new Ioi10lIoII(i);
/* 317 */           ioi10lIoII.I00000oOI = this;
/* 319 */           VarHandle.storeStoreFence();
/* 322 */           Oilll1I oilll1I2 = new Oilll1I(ioi10lIoII);
/* 325 */           this.I001i1lo1io = oilll1I2;
/* 327 */           oilliIo0l0OII0000O.I0001Ioi1lo = oilll1I2;
/* 329 */           this.I00111O = oilliIo0l0OII0000O;
/* 339 */           I00II0Ol1O0l(List.of(oilliIo0l0OII0000O.I0000Il00O()));
                }

                public final String toString() {
/* 7 */             return "Preview:".concat(I000O01llI0());
                }
            }
