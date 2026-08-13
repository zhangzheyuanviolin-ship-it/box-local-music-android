            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.TimeUnit;
            
            public final class IIlO0OOI1lI implements IIlO1O0lOl {
                public IIloIoOOiO0l I00000oOI;
                public IlOI0O11011l I0000Il00O;
                public Ili1i1o00Oo I0000O;
                public OlOI1O I0000oI00;
                public OoI00O0l I0001Ioi1lo;
                public O1Iioo1 I000II;
                public i0I11I I000O01llI0;
                public IIiloliili1I I000OOo1O;
                public OolOO1oOoo I000OiO;
                public OolOi0i I000iOII;

                @Override
                public final void I00000oOI() {
/* 3 */             this.I000O01llI0.I00000oOI();
                }

                @Override
                public final void I0000Il00O(OilliIo0l0OI oilliIo0l0OI) {
/* 3 */             this.I000O01llI0.I0000Il00O(oilliIo0l0OI);
                }

                @Override
                public final void I0000O(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 1 */             IIiloliili1I iIiloliili1I = this.I000OOo1O;
/* 5 */             O1OIll00i o1OIll00i = new O1OIll00i();
/* 11 */            IIoIil iIoIil = new IIoIil(1);
/* 14 */            iIoIil.I00iiI = o1OIll00i;
/* 16 */            iIoIil.I00iiO = iOlOo1ll1l1;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            iOlOo1ll1l1.I00000oIO(iIoIil);
/* 36 */            IIloOI iIloOI = new IIloOI(OIil0iio0.I0001Ioi1lo((OI0oiliol10O) o1OIll00i.I00iiI), 8);
/* 39 */            IIio0010i1l iIio0010i1l = iIiloliili1I.I00000oIO;
/* 41 */            iIio0010i1l.I00000oIO(iIloOI);
/* 46 */            IOi10loi iOi10loiI00000oOI = iIio0010i1l.I00000oOI(iIiloliili1I.I0000O, true);
/* 53 */            IIoIil iIoIil2 = new IIoIil(3);
/* 56 */            iIoIil2.I00iiI = iOi10loiI00000oOI;
/* 60 */            iIoIil2.I00iiO = "addCaptureRequestOptions";
/* 62 */            VarHandle.storeStoreFence();
/* 69 */            iIllIoiiIO.I0000oI00(iOiiloIII0O.I00000oIO(iIoIil2));
                }

                @Override
                public final void I0000oI00(int i) {
/* 3 */             boolean z = true;
/* 4 */             this.I0000Il00O.I0000O(i, true);
/* 7 */             i0I11I i0i11i = this.I000O01llI0;
/* 9 */             if (i != 1 && i != 0) {
/* 14 */                z = false;
                    }
/* 15 */            i0i11i.I0000oI00(z);
                }

                @Override
                public final void I0001Ioi1lo(Ioi11lOIIO0O ioi11lOIIO0O) {
/* 3 */             this.I0000Il00O.I000O01llI0 = ioi11lOIIO0O;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v3 */
                /* JADX WARN: Type inference failed for: r8v4, types: [IOoil1iiIilo, Ii00l101O, Ii01I10, java.util.concurrent.CancellationException] */
                /* JADX WARN: Type inference failed for: r8v8 */
                @Override
                public final ListenableFuture I000II(IioiI0IIIIO iioiI0IIIIO) {
                    IIiOiI0il iIiOiI0ilI00000oIO;
                    List list;
                    List listI00IioO0OiOi;
                    List list2;
                    int i;
                    int i2;
                    ?? r8;
                    long j;
                    Object objI0000Il00O;
                    O11ooiIoo0l o11ooiIoo0l;
/* 5 */             Ili1i1o00Oo ili1i1o00Oo = this.I0000O;
/* 7 */             OolOi0i oolOi0i = ili1i1o00Oo.I0000O;
/* 11 */            Integer num = ili1i1o00Oo.I000OiO;
/* 13 */            Integer num2 = ili1i1o00Oo.I000OOo1O;
/* 17 */            Integer num3 = ili1i1o00Oo.I000O01llI0;
/* 19 */            i0I0OoIIOO01 i0i0ooiioo01 = ili1i1o00Oo.I0000oI00;
/* 24 */            IOi10loi iOi10loi = new IOi10loi();
/* 27 */            Ool1lo ool1lo = ili1i1o00Oo.I0001Ioi1lo;
/* 29 */            if (ool1lo != null) {
/* 31 */                OlIl0i olIl0i = ili1i1o00Oo.I00100l0;
/* 34 */                if (olIl0i != null) {
/* 36 */                    olIl0i.I000II(null);
                        }
/* 39 */                OlIl0i olIl0i2 = ili1i1o00Oo.I00100o1O0lo;
/* 41 */                if (olIl0i2 != null) {
/* 43 */                    olIl0i2.I000II(null);
                        }
/* 46 */                IOi10loi iOi10loi2 = ili1i1o00Oo.I000oI1ioi;
/* 48 */                if (iOi10loi2 != null) {
/* 50 */                    IIl001iO0Io.I001l0I00("Cancelled by another startFocusAndMetering()", iOi10loi2);
                        }
/* 53 */                IOi10loi iOi10loi3 = ili1i1o00Oo.I000o00OoI0I;
/* 55 */                if (iOi10loi3 != null) {
/* 57 */                    IIl001iO0Io.I001l0I00("Cancelled by another startFocusAndMetering()", iOi10loi3);
                        }
/* 60 */                ili1i1o00Oo.I000o00OoI0I = iOi10loi;
/* 85 */                List listI00000oIO = ili0liIiOiil.I00000oIO((List) iioiI0IIIIO.I0000Il00O, num2.intValue(), i0i0ooiioo01.I000lI(), ili1i1o00Oo.I0000Il00O(), 2, ili1i1o00Oo.I00000oOI);
/* 112 */               List listI00000oIO2 = ili0liIiOiil.I00000oIO((List) iioiI0IIIIO.I00000oOI, num3.intValue(), i0i0ooiioo01.I000lI(), ili1i1o00Oo.I0000Il00O(), 1, ili1i1o00Oo.I00000oOI);
/* 139 */               List listI00000oIO3 = ili0liIiOiil.I00000oIO((List) iioiI0IIIIO.I0000O, num.intValue(), i0i0ooiioo01.I000lI(), ili1i1o00Oo.I0000Il00O(), 4, ili1i1o00Oo.I00000oOI);
/* 147 */               if (listI00000oIO.isEmpty() && listI00000oIO2.isEmpty() && listI00000oIO3.isEmpty()) {
/* 168 */                   iOi10loi.I00iIO(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
/* 171 */                   iIiOiI0ilI00000oIO = iiolOOio1.I00000oIO(iOi10loi);
/* 481 */                   return iIllIoiiIO.I0000oI00(iIiOiI0ilI00000oIO);
                        }
/* 179 */               List list3 = listI00000oIO2;
/* 186 */               if (!list3.isEmpty()) {
/* 188 */                   OlO01I1 olO01I1 = ili1i1o00Oo.I0000Il00O;
                            synchronized (olO01I1.I0000O) {
/* 197 */                       olO01I1.I000l1 = 1;
                            }
/* 200 */                   olO01I1.I0001Ioi1lo();
                        }
/* 211 */               if (num2.intValue() > 0) {
/* 213 */                   List listI00IioO0OiOi2 = listI00000oIO;
/* 219 */                   if (listI00IioO0OiOi2.isEmpty()) {
/* 223 */                       listI00IioO0OiOi2 = I1IoiO1l.I00IioO0OiOi(IIliIll10O.I00000oIO);
                            }
/* 227 */                   list = listI00IioO0OiOi2;
                        } else {
/* 230 */                   list = null;
                        }
/* 235 */               if (num3.intValue() > 0) {
/* 250 */                   listI00IioO0OiOi = list3.isEmpty() ? I1IoiO1l.I00IioO0OiOi(IIliIll10O.I00000oIO) : list3;
                        } else {
/* 256 */                   listI00IioO0OiOi = null;
                        }
/* 261 */               if (num.intValue() > 0) {
/* 263 */                   List listI00IioO0OiOi3 = listI00000oIO3;
/* 269 */                   if (listI00IioO0OiOi3.isEmpty()) {
/* 273 */                       listI00IioO0OiOi3 = I1IoiO1l.I00IioO0OiOi(IIliIll10O.I00000oIO);
                            }
/* 279 */                   list2 = listI00IioO0OiOi3;
                        } else {
/* 281 */                   list2 = null;
                        }
/* 287 */               if (listI00000oIO2.isEmpty() || !ili1i1o00Oo.I000iOII) {
/* 293 */                   i = 3;
/* 294 */                   i2 = 1;
/* 295 */                   r8 = 0;
/* 296 */                   j = 0;
/* 298 */                   List list4 = list;
/* 390 */                   l11I11lO.I0000O(3, "CXCP");
/* 393 */                   objI0000Il00O = ool1lo.I0000Il00O(list4, listI00IioO0OiOi, list2);
                        } else {
/* 300 */                   j = 0;
/* 302 */                   long j2 = iioiI0IIIIO.I00000oIO;
/* 308 */                   if (j2 <= 0 || j2 >= 5000) {
/* 315 */                       j2 = 5000;
                            }
/* 316 */                   l11I11lO.I0000O(3, "CXCP");
/* 323 */                   if (num3.intValue() > 0) {
/* 327 */                       o11ooiIoo0l = new O11ooiIoo0l();
/* 330 */                       o11ooiIoo0l.I00000oIO = 1;
/* 332 */                       VarHandle.storeStoreFence();
                            } else {
/* 336 */                       o11ooiIoo0l = null;
                            }
/* 337 */                   List list5 = I0OIi10lO0iO.I00000oOI;
/* 339 */                   ArrayList arrayList = ili1i1o00Oo.I000l1;
/* 341 */                   int i3 = 0;
/* 342 */                   if (arrayList != null && (arrayList.contains(I0OIi10lO0iO.I00000oIO(1)) || arrayList.contains(I0OIi10lO0iO.I00000oIO(1)))) {
/* 355 */                       i3 = 1;
                            }
/* 368 */                   I0OIi10lO0iO i0OIi10lO0iOI00000oIO = I0OIi10lO0iO.I00000oIO(i3);
/* 376 */                   long jConvert = TimeUnit.NANOSECONDS.convert(j2, TimeUnit.MILLISECONDS);
/* 380 */                   i = 3;
/* 381 */                   i2 = 1;
/* 382 */                   r8 = 0;
/* 385 */                   objI0000Il00O = ool1lo.I00000oIO(list, listI00IioO0OiOi, list2, o11ooiIoo0l, i0OIi10lO0iOI00000oIO, jConvert);
                        }
/* 401 */               boolean z = (list3.isEmpty() ? 1 : 0) ^ i2;
/* 404 */               I0oo10oIOO i0oo10oIOO = new I0oo10oIOO(i2);
/* 407 */               i0oo10oIOO.I00iiO = iOi10loi;
/* 409 */               i0oo10oIOO.I00iio = objI0000Il00O;
/* 411 */               i0oo10oIOO.I00ilI0I1 = ili1i1o00Oo;
/* 413 */               i0oo10oIOO.I00iiI = z;
/* 415 */               VarHandle.storeStoreFence();
/* 420 */               ((O011OOl11) objI0000Il00O).I00iiI(i0oo10oIOO);
/* 423 */               OlIl0i olIl0i3 = ili1i1o00Oo.I00100l0;
/* 425 */               if (olIl0i3 != 0) {
/* 427 */                   olIl0i3.I000II(r8);
                        }
/* 441 */               ili1i1o00Oo.I00100l0 = iOi1II01i0.I0000O(oolOi0i.I0000oI00, r8, r8, new IIillIIO(iOi10loi, r8, i2), i);
/* 443 */               long j3 = iioiI0IIIIO.I00000oIO;
/* 447 */               if (j3 > j) {
/* 449 */                   OlIl0i olIl0i4 = ili1i1o00Oo.I00100o1O0lo;
/* 451 */                   if (olIl0i4 != 0) {
/* 453 */                       olIl0i4.I000II(r8);
                            }
/* 469 */                   ili1i1o00Oo.I00100o1O0lo = iOi1II01i0.I0000O(oolOi0i.I0000oI00, r8, r8, new I00oO101o(j3, ili1i1o00Oo, ool1lo, iOi10loi, (IOoil1iiIilo) null), i);
                        }
                    } else {
/* 474 */               IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
                    }
/* 477 */           iIiOiI0ilI00000oIO = iiolOOio1.I00000oIO(iOi10loi);
/* 481 */           return iIllIoiiIO.I0000oI00(iIiOiI0ilI00000oIO);
                }

                @Override
                public final ListenableFuture I000O01llI0(ArrayList arrayList, int i, int i2) {
/* 1 */             OlOI1O olOI1O = this.I0000oI00;
/* 5 */             IOi10loi iOi10loi = new IOi10loi();
/* 23 */            iOi1II01i0.I0000O(olOI1O.I00000oOI.I0000oI00, null, null, new IO1OIi1110(arrayList, i, i2, iOi10loi, olOI1O, null), 3);
/* 30 */            return iIllIoiiIO.I0000oI00(iiolOOio1.I00000oIO(iOi10loi));
                }

                @Override
                public final ListenableFuture I000OOo1O(boolean z) {
                    Integer num;
/* 1 */             IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 5 */             IIlo0i0ll iIlo0i0ll = this.I00000oOI.I00000oOI;
/* 7 */             iIlo0OOlI.getClass();
/* 18 */            int[] iArr = (int[]) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
/* 29 */            if (!(iArr == null ? false : I1IoiO1l.I0000oI00(iArr, 6)) || ((num = (Integer) this.I000II.I0001Ioi1lo.I0000O()) != null && num.intValue() == -1)) {
/* 100 */               return iIllIoiiIO.I0000oI00(iIllIoiiIO.I000II(Illo1O1o.I00000oIO(iiolOOio1.I00000oIO(OoI00O0l.I00000oIO(this.I0001Ioi1lo, z, 6))), new IOOlIIilOl0(17), Iii11l.I00000oIO()));
                    }
/* 54 */            l11I11lO.I0000O(3, "CXCP");
/* 67 */            return new Ioil1IIo(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"), 1);
                }

                @Override
                public final IOlOo1ll1l1 I000OiO() {
                    IIloOI iIloOI;
/* 3 */             IIio0010i1l iIio0010i1l = this.I000OOo1O.I00000oIO;
                    synchronized (iIio0010i1l.I00iOIl) {
/* 10 */                IIl0oI iIl0oII00000oIO = iIio0010i1l.I00iiO.I00000oIO();
/* 16 */                O1OIll00i o1OIll00i = new O1OIll00i();
/* 22 */                IIoIil iIoIil = new IIoIil(1);
/* 25 */                iIoIil.I00iiI = o1OIll00i;
/* 27 */                iIoIil.I00iiO = iIl0oII00000oIO;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                iIl0oII00000oIO.I00000oIO(iIoIil);
/* 47 */                iIloOI = new IIloOI(OIil0iio0.I0001Ioi1lo((OI0oiliol10O) o1OIll00i.I00iiI), 8);
                    }
/* 51 */            return iIloOI;
                }

                @Override
                public final void I000iOII() {
/* 1 */             IIiloliili1I iIiloliili1I = this.I000OOo1O;
/* 3 */             IIio0010i1l iIio0010i1l = iIiloliili1I.I00000oIO;
                    synchronized (iIio0010i1l.I00iOIl) {
/* 14 */                iIio0010i1l.I00iiO = new IIl0lo1oi(0);
                    }
/* 24 */            IOi10loi iOi10loiI00000oOI = iIiloliili1I.I00000oIO.I00000oOI(iIiloliili1I.I0000O, true);
/* 31 */            IIoIil iIoIil = new IIoIil(3);
/* 34 */            iIoIil.I00iiI = iOi10loiI00000oOI;
/* 36 */            iIoIil.I00iiO = "clearCaptureRequestOptions";
/* 38 */            VarHandle.storeStoreFence();
/* 45 */            iIllIoiiIO.I0000oI00(iOiiloIII0O.I00000oIO(iIoIil));
                }

                @Override
                public final ListenableFuture I000l1(int i) {
/* 3 */             Ool1i0ll ool1i0llI000O01llI0 = this.I000OiO.I000O01llI0();
/* 7 */             int i2 = 1;
/* 8 */             if (ool1i0llI000O01llI0 == null) {
/* 19 */                return new Ioil1IIo(new I1o1lOlooI1("Camera is not active.", 1), 1);
                    }
/* 25 */            IIOlO1ii iIOlO1ii = this.I000iOII.I0000oI00;
/* 29 */            o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(i2);
/* 32 */            o00io0iiooo0.I00iiO = iIOlO1ii;
/* 34 */            o00io0iiooo0.I00iio = ool1i0llI000O01llI0;
/* 36 */            o00io0iiooo0.I00iiI = i;
/* 38 */            o00io0iiooo0.I00ilI0I1 = this;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            return iOiiloIII0O.I00000oIO(o00io0iiooo0);
                }
            }
