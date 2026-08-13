            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.util.Rational;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            
            public final class OilliIo0l0OI extends OilliIlOO {
                public static OilliIo0l0OI I0000O(OolIl0ii1 oolIl0ii1, Size size) {
/* 10 */            if (((IIoIO1li) oolIl0ii1.I00000oOI(OolIl0ii1.I00IoIO0lI, null)) == null) {
/* 424 */               IoOOl0iOl1io.I0010I0i("Implementation is missing option unpacker for ", (String) oolIl0ii1.I00000oOI(OloIIlI1o10.I00IOO, oolIl0ii1.toString()));
/* 3 */                 return null;
                    }
/* 14 */            OilliIo0l0OI oilliIo0l0OI = new OilliIo0l0OI();
/* 23 */            OillooOlI oillooOlI = (OillooOlI) oolIl0ii1.I00000oOI(OolIl0ii1.I00Io1lO, null);
/* 25 */            OIil0iio0 oIil0iio0 = OIil0iio0.I00iiO;
/* 33 */            int i = OillooOlI.I00000oIO().I000II.I0000Il00O;
/* 35 */            ArrayList arrayList = oilliIo0l0OI.I0000O;
/* 37 */            ArrayList arrayList2 = oilliIo0l0OI.I0000Il00O;
/* 39 */            I0oiil10Ili i0oiil10Ili = oilliIo0l0OI.I00000oOI;
/* 41 */            if (oillooOlI != null) {
/* 43 */                IIoo00iOol0 iIoo00iOol0 = oillooOlI.I000II;
/* 45 */                i = iIoo00iOol0.I0000Il00O;
/* 61 */                for (CameraDevice.StateCallback stateCallback : oillooOlI.I0000Il00O) {
/* 73 */                    if (!arrayList2.contains(stateCallback)) {
/* 76 */                        arrayList2.add(stateCallback);
                            }
                        }
/* 90 */                for (CameraCaptureSession.StateCallback stateCallback2 : oillooOlI.I0000O) {
/* 102 */                   if (!arrayList.contains(stateCallback2)) {
/* 105 */                       arrayList.add(stateCallback2);
                            }
                        }
/* 113 */               i0oiil10Ili.I0000Il00O(iIoo00iOol0.I0000O);
/* 116 */               oIil0iio0 = iIoo00iOol0.I00000oOI;
                    }
/* 122 */           i0oiil10Ili.I00iio = OI0oiliol10O.I000iOII(oIil0iio0);
/* 126 */           int i2 = 8;
/* 128 */           if (oolIl0ii1 instanceof OOIIOlolo1) {
/* 130 */               Rational rational = OOIIiI1ii.I00000oIO;
/* 140 */               if (((PreviewPixelHDRnetQuirk) IiOoli.I00000oIO(PreviewPixelHDRnetQuirk.class)) != null && !O0000Ioio00.I0000O(OOIIiI1ii.I00000oIO, new Rational(size.getWidth(), size.getHeight()))) {
/* 165 */                   OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 180 */                   oI0oiliol10OI000OOo1O.I0010I0i(iOil1io0i00.I00000oIO(CaptureRequest.TONEMAP_MODE), 2);
/* 192 */                   i0oiil10Ili.I0000oI00(new IIl0oI(OIil0iio0.I0001Ioi1lo(oI0oiliol10OI000OOo1O), i2));
                        }
                    }
/* 213 */           i0oiil10Ili.I00iiI = ((Number) oolIl0ii1.I00000oOI(IIl0oI.I00ilI0I1, Integer.valueOf(i))).intValue();
/* 221 */           CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) oolIl0ii1.I00000oOI(IIl0oI.I00ilO0, null);
/* 223 */           if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
/* 232 */               arrayList2.add(stateCallback3);
                    }
/* 241 */           CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) oolIl0ii1.I00000oOI(IIl0oI.I00io1l, null);
/* 243 */           if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
/* 252 */               arrayList.add(stateCallback4);
                    }
/* 261 */           CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) oolIl0ii1.I00000oOI(IIl0oI.I00ioIO, null);
/* 263 */           if (captureCallback != null) {
/* 267 */               IIoIIOi1O iIoIIOi1O = new IIoIIOi1O();
/* 270 */               iIoIIOi1O.I00000oIO = captureCallback;
/* 272 */               VarHandle.storeStoreFence();
/* 275 */               i0oiil10Ili.I0000O(iIoIIOi1O);
/* 278 */               ArrayList arrayList3 = oilliIo0l0OI.I0000oI00;
/* 284 */               if (!arrayList3.contains(iIoIIOi1O)) {
/* 286 */                   arrayList3.add(iIoIIOi1O);
                        }
                    }
/* 289 */           int iI001l0I00 = oolIl0ii1.I001l0I00();
/* 293 */           if (iI001l0I00 != 0 && iI001l0I00 != 0) {
/* 307 */               ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(OolIl0ii1.I00OIo, Integer.valueOf(iI001l0I00));
                    }
/* 310 */           int iI00111O = oolIl0ii1.I00111O();
/* 314 */           if (iI00111O != 0 && iI00111O != 0) {
/* 328 */               ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(OolIl0ii1.I00OOll1, Integer.valueOf(iI00111O));
                    }
/* 331 */           OI0oiliol10O oI0oiliol10OI000OOo1O2 = OI0oiliol10O.I000OOo1O();
/* 335 */           I1ioiI i1ioiI = IIl0oI.I00li1OI;
/* 341 */           String str = (String) oolIl0ii1.I00000oOI(i1ioiI, null);
/* 343 */           if (str != null) {
/* 345 */               oI0oiliol10OI000OOo1O2.I0010I0i(i1ioiI, str);
                    }
/* 348 */           I1ioiI i1ioiI2 = IIl0oI.I00l0I0l0lO1;
/* 354 */           Long l = (Long) oolIl0ii1.I00000oOI(i1ioiI2, null);
/* 356 */           if (l != null) {
/* 366 */               oI0oiliol10OI000OOo1O2.I0010I0i(i1ioiI2, Long.valueOf(l.longValue()));
                    }
/* 369 */           i0oiil10Ili.I0000oI00(oI0oiliol10OI000OOo1O2);
/* 374 */           O1OIll00i o1OIll00i = new O1OIll00i();
/* 380 */           IIoIil iIoIil = new IIoIil(1);
/* 383 */           iIoIil.I00iiI = o1OIll00i;
/* 385 */           iIoIil.I00iiO = oolIl0ii1;
/* 387 */           VarHandle.storeStoreFence();
/* 390 */           oolIl0ii1.I00000oIO(iIoIil);
/* 406 */           i0oiil10Ili.I0000oI00(new IIloOI(OIil0iio0.I0001Ioi1lo((OI0oiliol10O) o1OIll00i.I00iiI), i2));
/* 409 */           return oilliIo0l0OI;
                }

                public final void I00000oIO(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 3 */             this.I00000oOI.I0000oI00(iOlOo1ll1l1);
                }

                public final void I00000oOI(IiIO1ol1i1o0 iiIO1ol1i1o0, Iio1oiI iio1oiI, int i) {
/* 1 */             I1ii1o0 i1ii1o0I00000oIO = I1lIlOi1OI0.I00000oIO(iiIO1ol1i1o0);
/* 5 */             if (iio1oiI == null) {
/* 36 */                IOOlIIilOl0.I000II("Null dynamicRange");
/* 98 */                return;
                    }
/* 7 */             i1ii1o0I00000oIO.I00ilO0 = iio1oiI;
/* 13 */            i1ii1o0I00000oIO.I00iio = Integer.valueOf(i);
/* 21 */            this.I00000oIO.add(i1ii1o0I00000oIO.I0010I0i());
/* 30 */            ((HashSet) this.I00000oOI.I00iiO).add(iiIO1ol1i1o0);
                }

                public final OillooOlI I0000Il00O() {
/* 45 */            return new OillooOlI(new ArrayList(this.I00000oIO), new ArrayList(this.I0000Il00O), new ArrayList(this.I0000O), new ArrayList(this.I0000oI00), this.I00000oOI.I0001Ioi1lo(), this.I0001Ioi1lo, this.I000II, this.I000O01llI0, this.I000OOo1O);
                }
            }
