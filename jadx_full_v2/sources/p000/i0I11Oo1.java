            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.InputConfiguration;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.util.Log;
            import android.util.Size;
            import android.view.Surface;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
            public final class i0I11Oo1 implements i0I11I {
                public IIlo0i0ll I00000oIO;
                public OllO00oiil I00000oOI;
                public o00io0IiOOo0 I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public OOlli1l1lOlI I000II;
                public IoilI00 I000O01llI0;

                @Override
                public final boolean I00000oIO() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final void I00000oOI() throws Exception {
/* 1 */             I000OiO();
                }

                @Override
                public final void I0000Il00O(OilliIo0l0OI oilliIo0l0OI) throws Exception {
/* 1 */             OllO00oiil ollO00oiil = this.I00000oOI;
/* 3 */             I0oiil10Ili i0oiil10Ili = oilliIo0l0OI.I00000oOI;
/* 5 */             I000OiO();
/* 11 */            if (this.I0000O) {
/* 13 */                i0oiil10Ili.I00iiI = 1;
/* 15 */                return;
                    }
/* 18 */            if (this.I0001Ioi1lo) {
/* 20 */                i0oiil10Ili.I00iiI = 1;
/* 22 */                return;
                    }
/* 23 */            IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 25 */            IIlo0i0ll iIlo0i0ll = this.I00000oIO;
/* 27 */            iIlo0OOlI.getClass();
/* 38 */            int[] iArr = (int[]) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 40 */            if (iArr == null) {
/* 42 */                iArr = IIlo0OOlI.I00000oOI;
                    }
/* 51 */            if (!I1IoiO1l.I0000oI00(iArr, 4)) {
/* 57 */                if (l11I11lO.I0000O(4, "CXCP")) {
/* 61 */                    Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
                        }
/* 64 */                i0oiil10Ili.I00iiI = 1;
/* 66 */                return;
                    }
/* 85 */            Iterator it = I1IoiO1l.I00IioO0OiOi(((StreamConfigurationMap) ollO00oiil.getValue()).getInputSizes(34)).iterator();
/* 93 */            if (!it.hasNext()) {
/* 337 */               IoOOl0iOl1io.I00000oOI();
/* 437 */               return;
                    }
/* 95 */            Object next = it.next();
/* 103 */           if (it.hasNext()) {
/* 107 */               Size size = (Size) next;
/* 117 */               int height = size.getHeight() * size.getWidth();
/* 142 */               do {
/* 118 */                   Object next2 = it.next();
/* 123 */                   Size size2 = (Size) next2;
/* 133 */                   int height2 = size2.getHeight() * size2.getWidth();
/* 134 */                   if (height < height2) {
/* 136 */                       next = next2;
/* 137 */                       height = height2;
                            }
/* 142 */               } while (it.hasNext());
                    }
/* 144 */           Size size3 = (Size) next;
/* 147 */           if (size3 == null) {
/* 153 */               if (l11I11lO.I0000O(5, "CXCP")) {
/* 157 */                   Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
/* 160 */                   return;
                        }
/* 200 */               return;
                    }
/* 166 */           if (l11I11lO.I0000O(3, "CXCP")) {
/* 168 */               size3.toString();
                    }
/* 187 */           if (!I1IoiO1l.I0000oI00(((StreamConfigurationMap) ollO00oiil.getValue()).getValidOutputFormatsForInput(34), Barcode.FORMAT_QR_CODE)) {
/* 193 */               if (l11I11lO.I0000O(5, "CXCP")) {
/* 197 */                   Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
/* 200 */                   return;
                        }
/* 200 */               return;
                    }
/* 213 */           O1li1Il o1li1Il = new O1li1Il(size3.getWidth(), size3.getHeight(), 34, 9);
/* 218 */           OOlli1l1lOlI oOlli1l1lOlI = new OOlli1l1lOlI(o1li1Il);
/* 223 */           Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(9);
/* 226 */           olio1i0OI00i.I00iiI = this;
/* 228 */           VarHandle.storeStoreFence();
/* 235 */           o1li1Il.I000lI(olio1i0OI00i, O00Ii00o0.I00000oIO());
/* 240 */           Surface surface = oOlli1l1lOlI.getSurface();
/* 244 */           if (surface == null) {
/* 333 */               I000II.I001IO000("Required value was null.");
/* 336 */               return;
                    }
/* 259 */           IoilI00 ioilI00 = new IoilI00(surface, new Size(oOlli1l1lOlI.I0001Ioi1lo(), oOlli1l1lOlI.I0000O()), 34);
/* 264 */           ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(ioilI00.I0000oI00);
/* 270 */           IIoo0O0l11 iIoo0O0l11 = new IIoo0O0l11(3);
/* 273 */           iIoo0O0l11.I00iiI = oOlli1l1lOlI;
/* 275 */           VarHandle.storeStoreFence();
/* 282 */           listenableFutureI0000oI00.addListener(iIoo0O0l11, O1OIIoio0i1.I0000O());
/* 288 */           oilliIo0l0OI.I00000oOI(ioilI00, Iio1oiI.I0000O, -1);
/* 291 */           IIl1i10oO iIl1i10oO = o1li1Il.I00iiI;
/* 293 */           i0oiil10Ili.I0000O(iIl1i10oO);
/* 296 */           ArrayList arrayList = oilliIo0l0OI.I0000oI00;
/* 302 */           if (!arrayList.contains(iIl1i10oO)) {
/* 304 */               arrayList.add(iIl1i10oO);
                    }
/* 324 */           oilliIo0l0OI.I000II = new InputConfiguration(oOlli1l1lOlI.I0001Ioi1lo(), oOlli1l1lOlI.I0000O(), oOlli1l1lOlI.I0000Il00O());
/* 326 */           this.I000II = oOlli1l1lOlI;
/* 328 */           this.I000O01llI0 = ioilI00;
                }

                @Override
                public final boolean I0000O() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final void I0000oI00(boolean z) {
/* 1 */             this.I0000oI00 = z;
                }

                @Override
                public final void I0001Ioi1lo(boolean z) throws Exception {
/* 3 */             if (this.I0000O != z && z) {
/* 7 */                 I000OOo1O();
                    }
/* 10 */            this.I0000O = z;
                }

                @Override
                public final IoiO1IO1I1i I000II() {
                    try {
/* 7 */                 return (IoiO1IO1I1i) this.I0000Il00O.I00000oIO();
                    } catch (NoSuchElementException unused) {
/* 17 */                if (!l11I11lO.I0000O(5, "CXCP")) {
/* 24 */                    return null;
                        }
/* 21 */                Log.w("CXCP", "ZslControlImpl#dequeueImageFromBuffer: No such element");
/* 24 */                return null;
                    }
                }

                @Override
                public final boolean I000O01llI0(IiIO1ol1i1o0 iiIO1ol1i1o0, OillooOlI oillooOlI) {
/* 1 */             Size size = iiIO1ol1i1o0.I000O01llI0;
/* 3 */             InputConfiguration inputConfiguration = oillooOlI.I000OOo1O;
                    return inputConfiguration != null && iiIO1ol1i1o0.I000OOo1O == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
                }

                public final void I000OOo1O() throws Exception {
                    boolean zIsEmpty;
/* 1 */             o00io0IiOOo0 o00io0iiooo0 = this.I0000Il00O;
                    while (true) {
                        synchronized (o00io0iiooo0.I00iio) {
/* 10 */                    zIsEmpty = ((ArrayDeque) o00io0iiooo0.I00iiO).isEmpty();
                        }
/* 15 */                if (zIsEmpty) {
/* 27 */                    return;
                        } else {
/* 23 */                    ((IoiO1IO1I1i) o00io0iiooo0.I00000oIO()).close();
                        }
                    }
                }

                public final void I000OiO() throws Exception {
/* 1 */             IoilI00 ioilI00 = this.I000O01llI0;
/* 3 */             if (ioilI00 != null) {
/* 5 */                 OOlli1l1lOlI oOlli1l1lOlI = this.I000II;
/* 8 */                 if (oOlli1l1lOlI != null) {
/* 12 */                    ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(ioilI00.I0000oI00);
/* 19 */                    IIoo0O0l11 iIoo0O0l11 = new IIoo0O0l11(4);
/* 22 */                    iIoo0O0l11.I00iiI = oOlli1l1lOlI;
/* 24 */                    VarHandle.storeStoreFence();
/* 31 */                    listenableFutureI0000oI00.addListener(iIoo0O0l11, O1OIIoio0i1.I0000O());
/* 34 */                    oOlli1l1lOlI.I0000oI00();
/* 37 */                    this.I000II = null;
                        }
/* 39 */                ioilI00.I00000oIO();
/* 42 */                this.I000O01llI0 = null;
                    }
/* 44 */            I000OOo1O();
                }
            }
