            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.os.Looper;
            import android.util.Log;
            import android.util.Pair;
            import android.util.Rational;
            import android.util.Size;
            import android.view.Surface;
            import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
            import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
            import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
            import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Ioi1Io1o extends Ool10o {
                public static final Ioi11I1 I001lloI = new Ioi11I1();
                public int I0010I0i;
                public AtomicReference I0010o;
                public int I00111O;
                public int I001IIilI0O;
                public Rational I001IO000;
                public OiOOoiOOo I001i1O0Ol;
                public OilliIo0l0OI I001i1lo1io;
                public I1ii1o0 I001iOo1i0O;
                public Olo1I1 I001l0I00;
                public Oilll1I I001lIiIIo1O;
                public IIloOI I001lllioOl;

                public static boolean I00IioO0OiOi(int i, List list) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 29 */                if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return false;
                }

                @Override
                public final OolIl0ii1 I000II(boolean z, OolO0o0O10I oolO0o0O10I) {
/* 3 */             I001lloI.getClass();
/* 6 */             Ioi1iI0IiOl ioi1iI0IiOl = Ioi11I1.I00000oIO;
/* 14 */            IOlOo1ll1l1 iOlOo1ll1l1I00000oIO = oolO0o0O10I.I00000oIO(ioi1iI0IiOl.I0010o(), this.I0010I0i);
/* 18 */            if (z) {
/* 20 */                iOlOo1ll1l1I00000oIO = IOlOo1ll1l1.I00100l0(iOlOo1ll1l1I00000oIO, ioi1iI0IiOl);
                    }
/* 24 */            if (iOlOo1ll1l1I00000oIO == null) {
/* 26 */                return null;
                    }
/* 34 */            return ((Oi0Oooi) I000l1(iOlOo1ll1l1I00000oIO)).I00100o1O0lo();
                }

                @Override
                public final Set I000iOII() {
/* 3 */             HashSet hashSet = new HashSet();
/* 11 */            hashSet.add(4);
/* 20 */            return hashSet;
                }

                @Override
                public final OolIii00oi1 I000l1(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 7 */             return new Oi0Oooi(OI0oiliol10O.I000iOII(iOlOo1ll1l1));
                }

                @Override
                public final boolean I000lI() {
/* 1 */             return true;
                }

                @Override
                public final void I0010o() {
/* 7 */             lII1OI11o1I.I0000O("Attached camera cannot be null", I0000O());
/* 15 */            if (I00IOO() == 3) {
/* 17 */                IIllOo0 iIllOo0I0000O = I0000O();
/* 33 */                if ((iIllOo0I0000O != null ? iIllOo0I0000O.I0000Il00O().I000iOII() : -1) == 0) {
/* 55 */                    return;
                        }
/* 38 */                I000II.I000iOII("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
                    }
                }

                @Override
                public final void I00111O() {
/* 4 */             l11I11lO.I0000O(3, "ImageCapture");
/* 7 */             I00Io1lO();
/* 16 */            I0000oI00().I0001Ioi1lo(this.I001i1O0Ol);
                }

                @Override
                public final OolIl0ii1 I001IIilI0O(IIllOioOlolI iIllOioOlolI, OolIii00oi1 oolIii00oi1) {
/* 15 */            Integer numValueOf = Integer.valueOf(Barcode.FORMAT_QR_CODE);
/* 19 */            HashSet<Io1100oIo> hashSet = this.I000O01llI0;
/* 21 */            boolean z = false;
/* 22 */            if (hashSet != null) {
/* 32 */                for (Io1100oIo io1100oIo : hashSet) {
                        }
/* 51 */                oolIii00oi1.I000o00OoI0I().I0010I0i(Ioi1iI0IiOl.I00ilO0, 0);
                    }
/* 66 */            if (iIllOioOlolI.I0010o().I00000oIO(SoftwareJpegEncodingPreferredQuirk.class)) {
/* 68 */                Boolean bool = Boolean.FALSE;
/* 70 */                OI0oiliol10O oI0oiliol10OI000o00OoI0I = oolIii00oi1.I000o00OoI0I();
/* 74 */                I1ioiI i1ioiI = Ioi1iI0IiOl.I00ioIO;
/* 76 */                Boolean bool2 = Boolean.TRUE;
/* 86 */                if (bool.equals(oI0oiliol10OI000o00OoI0I.I00000oOI(i1ioiI, bool2))) {
/* 90 */                    l11I11lO.I0000oI00("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
                        } else {
/* 96 */                    l11I11lO.I0000Il00O("ImageCapture", "Requesting software JPEG due to device quirk.");
/* 103 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(i1ioiI, bool2);
                        }
                    }
/* 106 */           OI0oiliol10O oI0oiliol10OI000o00OoI0I2 = oolIii00oi1.I000o00OoI0I();
/* 110 */           Boolean bool3 = Boolean.TRUE;
/* 112 */           I1ioiI i1ioiI2 = Ioi1iI0IiOl.I00ioIO;
/* 114 */           Boolean bool4 = Boolean.FALSE;
/* 126 */           if (bool3.equals(oI0oiliol10OI000o00OoI0I2.I00000oOI(i1ioiI2, bool4))) {
/* 132 */               if (I0000O() != null) {
/* 143 */                   I0000O().I000OOo1O().I001IIilI0O();
                        }
/* 152 */               Integer num = (Integer) oI0oiliol10OI000o00OoI0I2.I00000oOI(Ioi1iI0IiOl.I00ilI0I1, null);
/* 154 */               if (num == null || num.intValue() == 256) {
/* 168 */                   z = true;
                        } else {
/* 164 */                   l11I11lO.I0000oI00("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                        }
/* 169 */               if (!z) {
/* 173 */                   l11I11lO.I0000oI00("ImageCapture", "Unable to support software JPEG. Disabling.");
/* 176 */                   oI0oiliol10OI000o00OoI0I2.I0010I0i(i1ioiI2, bool4);
                        }
                    }
/* 189 */           Integer num2 = (Integer) oolIii00oi1.I000o00OoI0I().I00000oOI(Ioi1iI0IiOl.I00ilI0I1, null);
/* 191 */           if (num2 != null) {
/* 197 */               if (I0000O() != null) {
/* 208 */                   I0000O().I000OOo1O().I001IIilI0O();
                        }
/* 228 */               oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, Integer.valueOf(z ? 35 : num2.intValue()));
                    } else {
/* 233 */               OI0oiliol10O oI0oiliol10OI000o00OoI0I3 = oolIii00oi1.I000o00OoI0I();
/* 237 */               I1ioiI i1ioiI3 = Ioi1iI0IiOl.I00ilO0;
/* 252 */               if (Objects.equals(oI0oiliol10OI000o00OoI0I3.I00000oOI(i1ioiI3, null), 2)) {
/* 260 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 32);
                        } else if (Objects.equals(oolIii00oi1.I000o00OoI0I().I00000oOI(i1ioiI3, null), 3)) {
/* 290 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 32);
/* 299 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I0010I0i, numValueOf);
                        } else if (Objects.equals(oolIii00oi1.I000o00OoI0I().I00000oOI(i1ioiI3, null), 1)) {
/* 334 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 4101);
/* 345 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I0010o, Iio1oiI.I0000Il00O);
                        } else if (z) {
/* 357 */                   oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 35);
                        } else {
/* 371 */                   List list = (List) oolIii00oi1.I000o00OoI0I().I00000oOI(IoiIli1i0Oil.I001lIiIIo1O, null);
/* 373 */                   if (list == null || I00IioO0OiOi(Barcode.FORMAT_QR_CODE, list)) {
/* 397 */                       oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, numValueOf);
                            } else if (I00IioO0OiOi(35, list)) {
/* 413 */                       oolIii00oi1.I000o00OoI0I().I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 35);
                            }
                        }
                    }
/* 416 */           return oolIii00oi1.I00100o1O0lo();
                }

                @Override
                public final void I001i1O0Ol() {
/* 1 */             OiOOoiOOo oiOOoiOOo = this.I001i1O0Ol;
/* 3 */             oiOOoiOOo.I0000Il00O();
/* 6 */             oiOOoiOOo.I00000oOI();
/* 9 */             Olo1I1 olo1I1 = this.I001l0I00;
/* 11 */            if (olo1I1 != null) {
/* 13 */                olo1I1.I00000oOI();
                    }
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
/* 10 */            l11I11lO.I0000O(3, "ImageCapture");
/* 21 */            OilliIo0l0OI oilliIo0l0OII00IO1oi11O = I00IO1oi11O(I0001Ioi1lo(), (Ioi1iI0IiOl) this.I000OOo1O, i1lIoOIi);
/* 25 */            this.I001i1lo1io = oilliIo0l0OII00IO1oi11O;
/* 35 */            I00II0Ol1O0l(List.of(oilliIo0l0OII00IO1oi11O.I0000Il00O()));
/* 38 */            I00100l0();
/* 106 */           return i1lIoOIi;
                }

                @Override
                public final void I001l0I00() {
/* 1 */             OiOOoiOOo oiOOoiOOo = this.I001i1O0Ol;
/* 3 */             oiOOoiOOo.I0000Il00O();
/* 6 */             oiOOoiOOo.I00000oOI();
/* 9 */             Olo1I1 olo1I1 = this.I001l0I00;
/* 11 */            if (olo1I1 != null) {
/* 13 */                olo1I1.I00000oOI();
                    }
/* 17 */            I00IO1(false);
/* 25 */            I0000oI00().I0001Ioi1lo(null);
                }

                public final void I00IO1(boolean z) {
                    Olo1I1 olo1I1;
/* 1 */             lOllIO.I00000oIO();
/* 4 */             Oilll1I oilll1I = this.I001lIiIIo1O;
/* 7 */             if (oilll1I != null) {
/* 9 */                 oilll1I.I00000oOI();
/* 12 */                this.I001lIiIIo1O = null;
                    }
/* 14 */            I1ii1o0 i1ii1o0 = this.I001iOo1i0O;
/* 16 */            if (i1ii1o0 != null) {
/* 18 */                i1ii1o0.I00111O();
/* 21 */                this.I001iOo1i0O = null;
                    }
/* 23 */            if (!z && (olo1I1 = this.I001l0I00) != null) {
/* 29 */                olo1I1.I00000oOI();
/* 32 */                this.I001l0I00 = null;
                    }
/* 38 */            I0000oI00().I00000oOI();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x020a  */
                /* JADX WARN: Type inference failed for: r0v72, types: [IIl1Ol] */
                /* JADX WARN: Type inference failed for: r3v20, types: [IIl1Ol] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OilliIo0l0OI I00IO1oi11O(String str, Ioi1iI0IiOl ioi1iI0IiOl, I1lIoOIi i1lIoOIi) {
                    int i;
                    boolean zContains;
                    int iIntValue;
                    I1ii1o0 i1ii1o0;
                    boolean z;
                    boolean z2;
                    IIoo0Iol iIoo0Iol;
                    IIl1i10oO iIl1i10oO;
                    IIl1Ol iIl1OlI00000oIO;
                    O1li1Il o1li1Il;
                    IoiO1ilO ioiO1ilO;
                    IoilI00 ioilI00;
                    int i2;
                    IIl1i10oO iIl1i10oOI00000oIO;
                    O1li1Il o1li1Il2;
/* 18 */            lOllIO.I00000oIO();
/* 21 */            Objects.toString(i1lIoOIi);
/* 24 */            Size size = i1lIoOIi.I00000oIO;
/* 26 */            IIllOo0 iIllOo0I0000O = I0000O();
/* 30 */            Objects.requireNonNull(iIllOo0I0000O);
/* 33 */            boolean zI00100o1O0lo = iIllOo0I0000O.I00100o1O0lo();
                    boolean z3 = !zI00100o1O0lo;
/* 41 */            HashSet hashSet = null;
/* 42 */            if (this.I001iOo1i0O != null) {
/* 44 */                lII1OI11o1I.I0000oI00(null, z3);
/* 49 */                this.I001iOo1i0O.I00111O();
                    }
/* 56 */            IIllOioOlolI iIllOioOlolII0000Il00O = I0000O().I0000Il00O();
/* 74 */            if (iIllOioOlolII0000Il00O instanceof I0IiOl1oIloO) {
/* 94 */                IOlOo1ll1l1 iOlOo1ll1l1I00000oIO = ((OolO0o0O10I) ((I0IiOl1oIloO) iIllOioOlolII0000Il00O).I00iiO.I00000oOI(IIlIi00.I0000oI00, OolO0o0O10I.I00000oIO)).I00000oIO(OolO01iOo0O.I00iOIl, 1);
/* 98 */                if (iOlOo1ll1l1I00000oIO != null) {
/* 100 */                   I1ioiI i1ioiI = IoiIli1i0Oil.I001lIiIIo1O;
/* 102 */                   OIil0iio0 oIil0iio0 = (OIil0iio0) iOlOo1ll1l1I00000oIO;
/* 110 */                   if (oIil0iio0.I00iOIl.containsKey(i1ioiI)) {
/* 115 */                       hashSet = new HashSet();
/* 118 */                       hashSet.add(0);
/* 127 */                       Iterator it = ((List) oIil0iio0.I0000O(i1ioiI)).iterator();
                                while (true) {
/* 135 */                           if (!it.hasNext()) {
                                        break;
                                    }
/* 151 */                           if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
/* 153 */                               hashSet.add(1);
                                        break;
                                    }
                                }
                            } else {
/* 157 */                       hashSet = null;
                            }
                        }
                    }
/* 158 */           if (hashSet != null) {
/* 160 */               i = 2;
                    } else {
/* 165 */               hashSet = new HashSet();
/* 168 */               hashSet.add(0);
/* 171 */               if (iIllOioOlolII0000Il00O != null) {
/* 180 */                   i = 2;
/* 186 */                   zContains = iIllOioOlolII0000Il00O.I001IO000().contains(4101);
                        } else {
/* 191 */                   i = 2;
/* 193 */                   zContains = false;
                        }
/* 194 */               if (zContains) {
/* 196 */                   hashSet.add(1);
                        }
/* 199 */               if (iIllOioOlolII0000Il00O != null) {
/* 201 */                   IIllOioOlolI iIllOioOlolI = iIllOioOlolII0000Il00O;
/* 219 */                   boolean zContains2 = !iIllOioOlolI.I001IIilI0O().contains(3) ? false : iIllOioOlolI.I001IO000().contains(32);
/* 223 */                   if (zContains2) {
/* 229 */                       hashSet.add(Integer.valueOf(i));
/* 232 */                       hashSet.add(3);
                            }
                        }
                    }
/* 235 */           OolIl0ii1 oolIl0ii1 = this.I000OOo1O;
/* 237 */           I1ioiI i1ioiI2 = Ioi1iI0IiOl.I00ilO0;
/* 243 */           Integer num = (Integer) oolIl0ii1.I00000oOI(i1ioiI2, 0);
/* 245 */           num.getClass();
/* 248 */           boolean zContains3 = hashSet.contains(num);
/* 256 */           StringBuilder sb = new StringBuilder("The specified output format (");
/* 265 */           Integer num2 = (Integer) this.I000OOo1O.I00000oOI(i1ioiI2, 0);
/* 267 */           num2.getClass();
/* 274 */           sb.append(num2.intValue());
/* 279 */           sb.append(") is not supported by current configuration. Supported output formats: ");
/* 282 */           sb.append(hashSet);
/* 289 */           lII1OI11o1I.I00000oIO(sb.toString(), zContains3);
/* 308 */           if (((Boolean) this.I000OOo1O.I00000oOI(Ioi1iI0IiOl.I00ll1, Boolean.FALSE)).booleanValue()) {
/* 310 */               ioi1iI0IiOl.I000o00OoI0I();
/* 321 */               I0000O().I000OOo1O().I001IIilI0O();
                    }
/* 328 */           if (I0000O() != null) {
                        try {
/* 338 */                   I0000O().I0010o().I000oI1ioi();
                        } catch (Exception e) {
/* 347 */                   Log.e("ImageCapture", "getCameraCharacteristics failed", e);
                        }
                    }
/* 355 */           I1ii1o0 i1ii1o02 = new I1ii1o0(9, false);
/* 358 */           lOllIO.I00000oIO();
/* 361 */           i1ii1o02.I00iiI = ioi1iI0IiOl;
/* 370 */           IIoIO0l1001 iIoIO0l1001 = (IIoIO0l1001) ioi1iI0IiOl.I00000oOI(OolIl0ii1.I00IoO0, null);
/* 372 */           if (iIoIO0l1001 == null) {
/* 1386 */              IoOOl0iOl1io.I0010I0i("Implementation is missing option unpacker for ", (String) ioi1iI0IiOl.I00000oOI(OloIIlI1o10.I00IOO, ioi1iI0IiOl.toString()));
/* 365 */               return null;
                    }
/* 376 */           I0oiil10Ili i0oiil10Ili = new I0oiil10Ili();
/* 379 */           iIoIO0l1001.I00000oIO(ioi1iI0IiOl, i0oiil10Ili);
/* 386 */           i1ii1o02.I00iiO = i0oiil10Ili.I0001Ioi1lo();
/* 391 */           I0Oi111ii i0Oi111ii = new I0Oi111ii(6);
/* 394 */           i0Oi111ii.I00iiI = null;
/* 396 */           i0Oi111ii.I00io1l = null;
/* 398 */           i1ii1o02.I00iio = i0Oi111ii;
/* 412 */           Executor executor = (Executor) ioi1iI0IiOl.I00000oOI(O00IOo.I00II0Ol1O0l, O00Ii00o0.I00000oIO());
/* 414 */           Objects.requireNonNull(executor);
/* 417 */           OOil0lI oOil0lI = IiOol00iooil.I00000oIO;
/* 420 */           OoIlIoo1oiOo ooIlIoo1oiOo = new OoIlIoo1oiOo(3);
/* 431 */           if (IiOol00iooil.I00000oIO.I00000oOI(LowMemoryQuirk.class) != null) {
/* 437 */               ooIlIoo1oiOo.I00iiO = iOioo01l0.I00000oIO(executor);
                    } else {
/* 440 */               ooIlIoo1oiOo.I00iiO = executor;
                    }
/* 444 */           boolean zI00000oIO = oOil0lI.I00000oIO(IncorrectJpegMetadataQuirk.class);
/* 448 */           ooIlIoo1oiOo.I00iiI = zI00000oIO;
/* 450 */           VarHandle.storeStoreFence();
/* 453 */           i1ii1o02.I00ilI0I1 = ooIlIoo1oiOo;
/* 457 */           ArrayList arrayList = new ArrayList();
/* 474 */           if (((Integer) ioi1iI0IiOl.I00000oOI(IoiIOIliOIi1.I0010I0i, 0)).intValue() != 0) {
/* 476 */               arrayList.add(32);
/* 483 */               arrayList.add(Integer.valueOf(Barcode.FORMAT_QR_CODE));
                    } else {
/* 494 */               Integer num3 = (Integer) ioi1iI0IiOl.I00000oOI(Ioi1iI0IiOl.I00ilI0I1, null);
/* 496 */               if (num3 != null) {
/* 498 */                   iIntValue = num3.intValue();
                        } else {
/* 510 */                   Integer num4 = (Integer) ioi1iI0IiOl.I00000oOI(IoiIOIliOIi1.I00100o1O0lo, null);
/* 512 */                   if (num4 != null) {
/* 518 */                       iIntValue = 4101;
/* 520 */                       if (num4.intValue() != 4101) {
/* 536 */                           iIntValue = (num4 == null || num4.intValue() != 32) ? Barcode.FORMAT_QR_CODE : 32;
                                }
                            }
                        }
/* 542 */               arrayList.add(Integer.valueOf(iIntValue));
                    }
/* 545 */           int iI000o00OoI0I = ioi1iI0IiOl.I000o00OoI0I();
/* 556 */           if (ioi1iI0IiOl.I00000oOI(Ioi1iI0IiOl.I00io1l, null) != null) {
/* 1366 */              OIiilo1Ool0o.I00000oIO();
/* 551 */               return null;
                    }
/* 563 */           IioO0ilo1Ii iioO0ilo1Ii = new IioO0ilo1Ii(0);
/* 570 */           IioO0ilo1Ii iioO0ilo1Ii2 = new IioO0ilo1Ii(0);
/* 573 */           I1ioOiOI i1ioOiOI = new I1ioOiOI();
/* 581 */           i1ioOiOI.I00000oIO = new IIoo11l();
/* 584 */           i1ioOiOI.I0000oI00 = null;
/* 586 */           if (size == null) {
/* 1358 */              IOOlIIilOl0.I000II("Null size");
/* 1361 */              return null;
                    }
/* 588 */           i1ioOiOI.I0001Ioi1lo = size;
/* 590 */           i1ioOiOI.I000II = iI000o00OoI0I;
/* 592 */           i1ioOiOI.I000O01llI0 = arrayList;
/* 594 */           i1ioOiOI.I000OOo1O = z3;
/* 596 */           i1ioOiOI.I000OiO = iioO0ilo1Ii;
/* 598 */           i1ioOiOI.I000iOII = iioO0ilo1Ii2;
/* 600 */           VarHandle.storeStoreFence();
/* 603 */           i1ii1o02.I00ilO0 = i1ioOiOI;
/* 622 */           lII1OI11o1I.I0000oI00("CaptureNode does not support recreation yet.", ((I1ioOiOI) i0Oi111ii.I00ilO0) == null && ((OOlli1l1lOlI) i0Oi111ii.I00iiO) == null);
/* 625 */           i0Oi111ii.I00ilO0 = i1ioOiOI;
/* 630 */           IIl1i10oO iIl1i10oO2 = new IIl1i10oO(1);
/* 633 */           iIl1i10oO2.I00000oOI = i0Oi111ii;
/* 635 */           VarHandle.storeStoreFence();
/* 648 */           boolean z4 = arrayList.size() > 1;
/* 649 */           if (zI00100o1O0lo) {
/* 651 */               if (z4) {
/* 655 */                   z = z4;
/* 661 */                   z2 = zI00000oIO;
/* 667 */                   i1ii1o0 = i1ii1o02;
/* 672 */                   O1li1Il o1li1Il3 = new O1li1Il(size.getWidth(), size.getHeight(), Barcode.FORMAT_QR_CODE, 4);
/* 675 */                   IIl1i10oO iIl1i10oO3 = o1li1Il3.I00iiI;
/* 679 */                   IIl1Ol[] iIl1OlArr = new IIl1Ol[i];
/* 682 */                   iIl1OlArr[0] = iIl1i10oO2;
/* 686 */                   iIl1OlArr[1] = iIl1i10oO3;
/* 688 */                   ?? I00000oIO = iOil1li.I00000oIO(iIl1OlArr);
/* 694 */                   i2 = 0;
/* 710 */                   o1li1Il = new O1li1Il(size.getWidth(), size.getHeight(), 32, 4);
/* 722 */                   iIl1OlI00000oIO = iOil1li.I00000oIO(iIl1i10oO2, o1li1Il.I00iiI);
/* 726 */                   iIl1i10oOI00000oIO = I00000oIO;
/* 728 */                   o1li1Il2 = o1li1Il3;
                        } else {
/* 731 */                   i1ii1o0 = i1ii1o02;
/* 733 */                   z = z4;
/* 735 */                   z2 = zI00000oIO;
/* 740 */                   i2 = 0;
/* 754 */                   O1li1Il o1li1Il4 = new O1li1Il(size.getWidth(), size.getHeight(), iI000o00OoI0I, 4);
/* 757 */                   IIl1i10oO iIl1i10oO4 = o1li1Il4.I00iiI;
/* 759 */                   IIl1Ol[] iIl1OlArr2 = new IIl1Ol[i];
/* 761 */                   iIl1OlArr2[0] = iIl1i10oO2;
/* 763 */                   iIl1OlArr2[1] = iIl1i10oO4;
/* 765 */                   iIl1i10oOI00000oIO = iOil1li.I00000oIO(iIl1OlArr2);
/* 770 */                   iIl1OlI00000oIO = null;
/* 771 */                   o1li1Il = null;
                            o1li1Il2 = o1li1Il4;
                        }
/* 778 */               iIoo0Iol = new IIoo0Iol(i2);
/* 781 */               iIoo0Iol.I00000oOI = i0Oi111ii;
/* 783 */               VarHandle.storeStoreFence();
/* 786 */               iIl1i10oO = iIl1i10oOI00000oIO;
                        ioiO1ilO = o1li1Il2;
                    } else {
/* 789 */               i1ii1o0 = i1ii1o02;
/* 791 */               z = z4;
/* 793 */               z2 = zI00000oIO;
/* 806 */               I0oO0iO1l0lo i0oO0iO1l0loI00000oIO = ioOI11II.I00000oIO(size.getWidth(), size.getHeight(), iI000o00OoI0I, 4);
/* 812 */               IoloOio0I ioloOio0I = new IoloOio0I(20);
/* 815 */               ioloOio0I.I00iiI = i0oO0iO1l0loI00000oIO;
/* 817 */               VarHandle.storeStoreFence();
/* 820 */               i0Oi111ii.I00io1l = ioloOio0I;
/* 825 */               iIoo0Iol = new IIoo0Iol(1);
/* 828 */               iIoo0Iol.I00000oOI = i0Oi111ii;
/* 830 */               VarHandle.storeStoreFence();
/* 833 */               iIl1i10oO = iIl1i10oO2;
/* 835 */               iIl1OlI00000oIO = null;
/* 836 */               o1li1Il = null;
                        ioiO1ilO = ioloOio0I;
                    }
/* 837 */           i1ioOiOI.I00000oIO = iIl1i10oO;
/* 839 */           if (z && iIl1OlI00000oIO != null) {
/* 843 */               i1ioOiOI.I00000oOI = iIl1OlI00000oIO;
                    }
/* 845 */           Surface surface = ioiO1ilO.getSurface();
/* 849 */           Objects.requireNonNull(surface);
/* 861 */           lII1OI11o1I.I0000oI00("The surface is already set.", i1ioOiOI.I0000Il00O == null);
/* 869 */           i1ioOiOI.I0000Il00O = new IoilI00(surface, size, iI000o00OoI0I);
/* 876 */           i0Oi111ii.I00iiO = new OOlli1l1lOlI(ioiO1ilO);
/* 881 */           I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(3);
/* 884 */           i0IOIlIOIII.I00iiI = i0Oi111ii;
/* 886 */           VarHandle.storeStoreFence();
/* 893 */           ioiO1ilO.I000lI(i0IOIlIOIII, O1OIIoio0i1.I0000O());
/* 896 */           if (z && o1li1Il != null) {
/* 900 */               Surface surface2 = o1li1Il.getSurface();
/* 913 */               lII1OI11o1I.I0000oI00("The secondary surface is already set.", i1ioOiOI.I0000O == null);
/* 921 */               i1ioOiOI.I0000O = new IoilI00(surface2, size, iI000o00OoI0I);
/* 928 */               i0Oi111ii.I00iio = new OOlli1l1lOlI(o1li1Il);
/* 933 */               I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(3);
/* 936 */               i0IOIlIOIII2.I00iiI = i0Oi111ii;
/* 938 */               VarHandle.storeStoreFence();
/* 945 */               o1li1Il.I000lI(i0IOIlIOIII2, O1OIIoio0i1.I0000O());
                    }
/* 948 */           iioO0ilo1Ii.I00000oOI = iIoo0Iol;
/* 953 */           IIoo0Iol iIoo0Iol2 = new IIoo0Iol(2);
/* 956 */           iIoo0Iol2.I00000oOI = i0Oi111ii;
/* 958 */           VarHandle.storeStoreFence();
/* 961 */           iioO0ilo1Ii2.I00000oOI = iIoo0Iol2;
/* 968 */           IioO0ilo1Ii iioO0ilo1Ii3 = new IioO0ilo1Ii(0);
/* 973 */           IioO0ilo1Ii iioO0ilo1Ii4 = new IioO0ilo1Ii(0);
/* 976 */           I1lII0lO i1lII0lO = new I1lII0lO();
/* 979 */           i1lII0lO.I00000oIO = iioO0ilo1Ii3;
/* 981 */           i1lII0lO.I00000oOI = iioO0ilo1Ii4;
/* 983 */           i1lII0lO.I0000Il00O = iI000o00OoI0I;
/* 985 */           i1lII0lO.I0000O = arrayList;
/* 987 */           VarHandle.storeStoreFence();
/* 990 */           i0Oi111ii.I00ilI0I1 = i1lII0lO;
/* 992 */           ooIlIoo1oiOo.I00iio = i1lII0lO;
/* 996 */           OOIo00o1 oOIo00o1 = new OOIo00o1(0);
/* 999 */           oOIo00o1.I00000oOI = ooIlIoo1oiOo;
/* 1001 */          VarHandle.storeStoreFence();
/* 1004 */          iioO0ilo1Ii3.I00000oOI = oOIo00o1;
/* 1009 */          OOIo00o1 oOIo00o12 = new OOIo00o1(1);
/* 1012 */          oOIo00o12.I00000oOI = ooIlIoo1oiOo;
/* 1014 */          VarHandle.storeStoreFence();
/* 1017 */          iioO0ilo1Ii4.I00000oOI = oOIo00o12;
/* 1026 */          ooIlIoo1oiOo.I00ilI0I1 = new i1O01oOIoI0I(14);
/* 1030 */          iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 1035 */          Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 1044 */          oi00IilOloo0.I00iOIl = (IncorrectJpegMetadataQuirk) oOil0lI.I00000oOI(IncorrectJpegMetadataQuirk.class);
/* 1046 */          VarHandle.storeStoreFence();
/* 1049 */          iiolilo0iiil.I00iOIl = oi00IilOloo0;
/* 1051 */          VarHandle.storeStoreFence();
/* 1054 */          ooIlIoo1oiOo.I00ilO0 = iiolilo0iiil;
/* 1058 */          int i3 = 12;
/* 1063 */          ooIlIoo1oiOo.I00ioIO = new loIOiIO1O1(i3);
/* 1072 */          ooIlIoo1oiOo.I00io1l = new i1O01Ill(9);
/* 1079 */          ooIlIoo1oiOo.I00l0I0l0lO1 = new lolOiIoiillI(i3);
/* 1086 */          ooIlIoo1oiOo.I00li1OI = new iOloo0O0O(i3);
/* 1090 */          if (iI000o00OoI0I == 35 || z2) {
/* 1099 */              ooIlIoo1oiOo.I00l0OO0IO = new lolIo0(i3);
                    }
/* 1101 */          VarHandle.storeStoreFence();
/* 1108 */          this.I001iOo1i0O = i1ii1o0;
/* 1110 */          Olo1I1 olo1I1 = this.I001l0I00;
/* 1112 */          if (olo1I1 == null) {
/* 1129 */              Objects.requireNonNull((OolIii) this.I000OOo1O.I00000oOI(OolIl0ii1.I00Oio, new OolIii()));
/* 1132 */              IIloOI iIloOI = this.I001lllioOl;
/* 1136 */              Olo1I1 olo1I12 = new Olo1I1();
/* 1144 */              olo1I12.I00iOIl = new ArrayDeque();
/* 1147 */              olo1I12.I00ilO0 = false;
/* 1149 */              lOllIO.I00000oIO();
/* 1152 */              olo1I12.I00iiI = iIloOI;
/* 1159 */              olo1I12.I00ilI0I1 = new ArrayList();
/* 1161 */              VarHandle.storeStoreFence();
/* 1164 */              this.I001l0I00 = olo1I12;
/* 1166 */              olo1I1 = olo1I12;
                    }
/* 1167 */          I1ii1o0 i1ii1o03 = this.I001iOo1i0O;
/* 1169 */          lOllIO.I00000oIO();
/* 1172 */          olo1I1.I00iiO = i1ii1o03;
/* 1174 */          i1ii1o03.getClass();
/* 1177 */          lOllIO.I00000oIO();
/* 1182 */          I0Oi111ii i0Oi111ii2 = (I0Oi111ii) i1ii1o03.I00iio;
/* 1184 */          i0Oi111ii2.getClass();
/* 1187 */          lOllIO.I00000oIO();
/* 1201 */          lII1OI11o1I.I0000oI00("The ImageReader is not initialized.", ((OOlli1l1lOlI) i0Oi111ii2.I00iiO) != null);
/* 1206 */          OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) i0Oi111ii2.I00iiO;
                    synchronized (oOlli1l1lOlI.I00iiO) {
/* 1211 */              oOlli1l1lOlI.I00ilO0 = olo1I1;
                    }
/* 1214 */          I1ii1o0 i1ii1o04 = this.I001iOo1i0O;
/* 1224 */          OilliIo0l0OI oilliIo0l0OII0000O = OilliIo0l0OI.I0000O((Ioi1iI0IiOl) i1ii1o04.I00iiI, i1lIoOIi.I00000oIO);
/* 1230 */          I1ioOiOI i1ioOiOI2 = (I1ioOiOI) i1ii1o04.I00ilO0;
/* 1232 */          IoilI00 ioilI002 = i1ioOiOI2.I0000Il00O;
/* 1234 */          Objects.requireNonNull(ioilI002);
/* 1237 */          Iio1oiI iio1oiI = Iio1oiI.I0000O;
/* 1239 */          I1ii1o0 i1ii1o0I00000oIO = I1lIlOi1OI0.I00000oIO(ioilI002);
/* 1243 */          i1ii1o0I00000oIO.I00ilO0 = iio1oiI;
/* 1251 */          oilliIo0l0OII0000O.I00000oIO.add(i1ii1o0I00000oIO.I0010I0i());
/* 1261 */          if (i1ioOiOI2.I000O01llI0.size() > 1 && (ioilI00 = i1ioOiOI2.I0000O) != null) {
/* 1267 */              I1ii1o0 i1ii1o0I00000oIO2 = I1lIlOi1OI0.I00000oIO(ioilI00);
/* 1271 */              i1ii1o0I00000oIO2.I00ilO0 = iio1oiI;
/* 1279 */              oilliIo0l0OII0000O.I00000oIO.add(i1ii1o0I00000oIO2.I0010I0i());
                    }
/* 1282 */          IoilI00 ioilI003 = i1ioOiOI2.I0000oI00;
/* 1284 */          if (ioilI003 != null) {
/* 1294 */              oilliIo0l0OII0000O.I000OOo1O = I1lIlOi1OI0.I00000oIO(ioilI003).I0010I0i();
                    }
/* 1298 */          oilliIo0l0OII0000O.I000O01llI0 = i1lIoOIi.I0000O;
/* 1303 */          if (this.I0010I0i == 2 && !i1lIoOIi.I000II) {
/* 1313 */              I0000oI00().I0000Il00O(oilliIo0l0OII0000O);
                    }
/* 1316 */          IOlOo1ll1l1 iOlOo1ll1l1 = i1lIoOIi.I0001Ioi1lo;
/* 1318 */          if (iOlOo1ll1l1 != null) {
/* 1322 */              oilliIo0l0OII0000O.I00000oOI.I0000oI00(iOlOo1ll1l1);
                    }
/* 1325 */          Oilll1I oilll1I = this.I001lIiIIo1O;
/* 1327 */          if (oilll1I != null) {
/* 1329 */              oilll1I.I00000oOI();
                    }
/* 1337 */          Ioi10lIoII ioi10lIoII = new Ioi10lIoII(0);
/* 1340 */          ioi10lIoII.I00000oOI = this;
/* 1342 */          VarHandle.storeStoreFence();
/* 1345 */          Oilll1I oilll1I2 = new Oilll1I(ioi10lIoII);
/* 1348 */          this.I001lIiIIo1O = oilll1I2;
/* 1350 */          oilliIo0l0OII0000O.I0001Ioi1lo = oilll1I2;
/* 1352 */          return oilliIo0l0OII0000O;
                }

                public final int I00IOO() {
                    int iIntValue;
                    synchronized (this.I0010o) {
/* 4 */                 iIntValue = this.I001IIilI0O;
/* 7 */                 if (iIntValue == -1) {
/* 27 */                    iIntValue = ((Integer) ((Ioi1iI0IiOl) this.I000OOo1O).I00000oOI(Ioi1iI0IiOl.I00iiO, 2)).intValue();
                        }
                    }
/* 32 */            return iIntValue;
                }

                public final void I00IlilI0i0i(Executor executor, ioIOOi0 ioiooi0) {
                    int i;
                    int iRound;
                    int i2;
                    int i3;
                    int i4;
                    int iIntValue;
/* 15 */            if (Looper.getMainLooper() != Looper.myLooper()) {
/* 17 */                ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 25 */                I00ioIO i00ioIO = new I00ioIO(12);
/* 28 */                i00ioIO.I00iiI = this;
/* 30 */                i00ioIO.I00iiO = executor;
/* 32 */                i00ioIO.I00iio = ioiooi0;
/* 34 */                VarHandle.storeStoreFence();
/* 39 */                ((Io11oioo) scheduledExecutorServiceI0000O).execute(i00ioIO);
/* 42 */                return;
                    }
/* 43 */            lOllIO.I00000oIO();
/* 51 */            if (I00IOO() == 3 && this.I001i1O0Ol.I00000oIO == null) {
/* 62 */                I000II.I000iOII("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
/* 65 */                return;
                    }
/* 66 */            IIllOo0 iIllOo0I0000O = I0000O();
/* 70 */            Rect rect = null;
/* 71 */            if (iIllOo0I0000O == null || !this.I00000oIO) {
/* 491 */               ioiooi0.I00000oOI(new Ioi1lIO("Not bound to a valid Camera [" + this + "]", null, 4));
/* 900 */               return;
                    }
/* 103 */           boolean z = ((Integer) this.I000OOo1O.I00000oOI(IoiIOIliOIi1.I0010I0i, 0)).intValue() != 0;
/* 104 */           Olo1I1 olo1I1 = this.I001l0I00;
/* 106 */           Objects.requireNonNull(olo1I1);
/* 109 */           Rect rect2 = this.I000l1;
/* 111 */           Size sizeI0000Il00O = I0000Il00O();
/* 115 */           Objects.requireNonNull(sizeI0000Il00O);
/* 118 */           if (rect2 != null) {
/* 120 */               i = 2;
                    } else {
/* 124 */               Rational rational = this.I001IO000;
/* 126 */               if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
/* 277 */                   i = 2;
/* 289 */                   rect2 = new Rect(0, 0, sizeI0000Il00O.getWidth(), sizeI0000Il00O.getHeight());
                        } else {
/* 143 */                   IIllOo0 iIllOo0I0000O2 = I0000O();
/* 147 */                   Objects.requireNonNull(iIllOo0I0000O2);
/* 150 */                   int iI000OOo1O = I000OOo1O(iIllOo0I0000O2, false);
/* 168 */                   Rational rational2 = new Rational(this.I001IO000.getDenominator(), this.I001IO000.getNumerator());
/* 175 */                   if (!OoI0lIiO.I0000Il00O(iI000OOo1O)) {
/* 178 */                       rational2 = this.I001IO000;
                            }
/* 180 */                   if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
/* 263 */                       i = 2;
/* 269 */                       l11I11lO.I0000oI00("ImageUtil", "Invalid view ratio.");
                            } else {
/* 196 */                       int width = sizeI0000Il00O.getWidth();
/* 200 */                       int height = sizeI0000Il00O.getHeight();
                                float f = width;
                                float f2 = height;
/* 206 */                       float f3 = f / f2;
/* 208 */                       int numerator = rational2.getNumerator();
/* 212 */                       i = 2;
/* 214 */                       int denominator = rational2.getDenominator();
/* 224 */                       if (rational2.floatValue() > f3) {
/* 230 */                           int iRound2 = Math.round((f / numerator) * denominator);
/* 235 */                           i4 = (height - iRound2) / 2;
/* 237 */                           i3 = iRound2;
/* 238 */                           iRound = width;
/* 239 */                           i2 = 0;
                                } else {
/* 245 */                           iRound = Math.round((f2 / denominator) * numerator);
/* 250 */                           i2 = (width - iRound) / 2;
/* 252 */                           i3 = height;
/* 253 */                           i4 = 0;
                                }
/* 258 */                       rect = new Rect(i2, i4, iRound + i2, i3 + i4);
                            }
/* 272 */                   Objects.requireNonNull(rect);
/* 275 */                   rect2 = rect;
                        }
                    }
/* 292 */           Matrix matrix = this.I000lI;
/* 294 */           int iI000OOo1O2 = I000OOo1O(iIllOo0I0000O, false);
/* 298 */           int i5 = this.I0010I0i;
/* 302 */           Ioi1iI0IiOl ioi1iI0IiOl = (Ioi1iI0IiOl) this.I000OOo1O;
/* 304 */           I1ioiI i1ioiI = Ioi1iI0IiOl.I00l0OO0IO;
/* 310 */           if (ioi1iI0IiOl.I000O01llI0(i1ioiI)) {
/* 318 */               iIntValue = ((Integer) ioi1iI0IiOl.I0000O(i1ioiI)).intValue();
                    } else if (i5 == 0) {
/* 347 */               iIntValue = 100;
                    } else {
/* 325 */               if (i5 != 1 && i5 != i) {
/* 340 */                   I000II.I001IO000(IIlIOloOOO.I00100l0("CaptureMode ", i5, " is invalid"));
/* 343 */                   return;
                        }
/* 344 */               iIntValue = 95;
                    }
/* 349 */           int i6 = this.I0010I0i;
/* 355 */           List listUnmodifiableList = Collections.unmodifiableList(this.I001i1lo1io.I0000oI00);
/* 361 */           I1lO0I0 i1lO0I0 = new I1lO0I0();
/* 378 */           i1lO0I0.I00000oIO = ((CaptureFailedRetryQuirk) IiOol00iooil.I00000oIO.I00000oOI(CaptureFailedRetryQuirk.class)) != null ? 1 : 0;
/* 382 */           HashMap map = new HashMap();
/* 385 */           i1lO0I0.I00000oOI = map;
/* 387 */           if (executor == null) {
/* 462 */               IOOlIIilOl0.I000II("Null appExecutor");
/* 465 */               return;
                    }
/* 389 */           i1lO0I0.I0000Il00O = executor;
/* 391 */           i1lO0I0.I0000O = ioiooi0;
/* 393 */           i1lO0I0.I0000oI00 = rect2;
/* 395 */           if (matrix == null) {
/* 456 */               IOOlIIilOl0.I000II("Null sensorToBufferTransform");
/* 459 */               return;
                    }
/* 397 */           i1lO0I0.I0001Ioi1lo = matrix;
/* 399 */           i1lO0I0.I000II = iI000OOo1O2;
/* 401 */           i1lO0I0.I000O01llI0 = iIntValue;
/* 403 */           i1lO0I0.I000OOo1O = i6;
/* 405 */           i1lO0I0.I000OiO = z;
/* 407 */           if (listUnmodifiableList == null) {
/* 450 */               IOOlIIilOl0.I000II("Null sessionConfigCameraCaptureCallbacks");
/* 453 */               return;
                    }
/* 409 */           i1lO0I0.I000iOII = listUnmodifiableList;
/* 411 */           VarHandle.storeStoreFence();
/* 414 */           if (z) {
/* 422 */               Boolean bool = Boolean.FALSE;
/* 424 */               map.put(32, bool);
/* 433 */               map.put(Integer.valueOf(Barcode.FORMAT_QR_CODE), bool);
                    }
/* 436 */           lOllIO.I00000oIO();
/* 441 */           olo1I1.I00iOIl.offer(i1lO0I0);
/* 444 */           olo1I1.I0000Il00O();
                }

                public final void I00Io1lO() {
                    synchronized (this.I0010o) {
                        try {
/* 10 */                    if (this.I0010o.get() != null) {
/* 13 */                        return;
                            }
/* 24 */                    I0000oI00().I0000oI00(I00IOO());
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public final String toString() {
/* 7 */             return "ImageCapture:".concat(I000O01llI0());
                }
            }
