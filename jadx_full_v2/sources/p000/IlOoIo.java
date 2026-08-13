            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.util.Log;
            import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
/* 44 */    public class IlOoIo implements OloOIoiI1 {
                public final boolean I00iOIl;
                public final boolean I00iiI;

                public IlOoIo(OOil0lI oOil0lI) {
                    boolean z;
/* 10 */            Iterator it = oOil0lI.I0000Il00O(CaptureIntentPreviewQuirk.class).iterator();
                    while (true) {
/* 18 */                if (!it.hasNext()) {
/* 34 */                    z = false;
                            break;
                        } else if (((CaptureIntentPreviewQuirk) it.next()).I00000oIO()) {
/* 32 */                    z = true;
                            break;
                        }
                    }
/* 35 */            this.I00iOIl = z;
/* 43 */            this.I00iiI = oOil0lI.I00000oIO(ImageCaptureFailedForVideoSnapshotQuirk.class);
                }

                @Override
                public Map I00000oIO(Oi0OO1IIl1 oi0OO1IIl1) {
                    return (oi0OO1IIl1 != null && oi0OO1IIl1.I00000oIO == 3 && this.I00iOIl) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1) : (oi0OO1IIl1 != null && oi0OO1IIl1.I00000oIO == 4 && this.I00iiI) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2) : Il011I1OiO0I.I00iOIl;
                }

                public OoIllIioi1l I00000oOI(IoiOloi ioiOloi) {
/* 3 */             return new OoIllIioi1l(ioiOloi);
                }

                /* JADX WARN: Removed duplicated region for block: B:133:0x01a2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OoIllIioi1l I0000Il00O(IoiOloi ioiOloi) throws IOException {
                    OlliIl0 olliIl0I0001Ioi1lo;
                    OlliIl0 olliIl0;
                    OlliIl0 iii10I010;
/* 3 */             OoIllIioi1l ooIllIioi1lI00000oOI = I00000oOI(ioiOloi);
/* 11 */            ooIllIioi1lI00000oOI.I00Ol00(ioiOloi.I001i1lo1io());
/* 14 */            int iI00OIl = ioiOloi.I00OIl();
/* 18 */            ioiOloi.I00OIl();
/* 21 */            ioiOloi.I00OIl();
/* 24 */            ioiOloi.I00OIl();
/* 27 */            int i = 0;
                    while (true) {
/* 43 */                if (i >= iI00OIl) {
                            break;
                        }
/* 50 */                String strI00Io1lO = ioiOloi.I00Io1lO(4, IO1IOO01oiO.I00000oIO);
/* 58 */                int i2 = i;
/* 64 */                if (strI00Io1lO.equals("cmap")) {
/* 68 */                    iii10I010 = new IOOIOIO(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("glyf")) {
/* 82 */                    iii10I010 = new Io0OiOiol0O(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("head")) {
/* 96 */                    iii10I010 = new Io1Iiiii0(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("hhea")) {
/* 108 */                   iii10I010 = new IoI1IIo00Io1(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("hmtx")) {
/* 120 */                   iii10I010 = new IoI1Iii(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("loca")) {
/* 132 */                   iii10I010 = new Iol0Oi0Oo11(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("maxp")) {
/* 144 */                   iii10I010 = new O1i0IIiliO1o(ooIllIioi1lI00000oOI);
                        } else if (strI00Io1lO.equals("name")) {
/* 156 */                   OI1O0i010o oI1O0i010o = new OI1O0i010o(ooIllIioi1lI00000oOI);
/* 159 */                   oI1O0i010o.I000O01llI0 = null;
                            iii10I010 = oI1O0i010o;
                        } else if (strI00Io1lO.equals("OS/2")) {
/* 172 */                   OIOi01l oIOi01l = new OIOi01l(ooIllIioi1lI00000oOI);
/* 179 */                   oIOi01l.I000OOo1O = new byte[10];
/* 181 */                   oIOi01l.I000OiO = 0L;
/* 183 */                   oIOi01l.I000iOII = 0L;
                            iii10I010 = oIOi01l;
                        } else if (strI00Io1lO.equals("post")) {
/* 194 */                   OO1o0oIoil oO1o0oIoil = new OO1o0oIoil(ooIllIioi1lI00000oOI);
/* 197 */                   oO1o0oIoil.I000II = null;
                            iii10I010 = oO1o0oIoil;
                        } else if (strI00Io1lO.equals("DSIG")) {
/* 211 */                   iii10I010 = new Iii10I010(ooIllIioi1lI00000oOI);
                        } else {
/* 222 */                   if (strI00Io1lO.equals("kern")) {
/* 227 */                       olliIl0I0001Ioi1lo = new O0O11IOl1Io(ooIllIioi1lI00000oOI, 0);
                            } else if (strI00Io1lO.equals("vhea")) {
/* 242 */                       olliIl0I0001Ioi1lo = new OooOlii(ooIllIioi1lI00000oOI);
                            } else if (strI00Io1lO.equals("vmtx")) {
/* 256 */                       olliIl0I0001Ioi1lo = new OooOo0O01(ooIllIioi1lI00000oOI);
                            } else if (strI00Io1lO.equals("VORG")) {
/* 271 */                       olliIl0I0001Ioi1lo = new O0O11IOl1Io(ooIllIioi1lI00000oOI, 1);
                            } else if (strI00Io1lO.equals("GSUB")) {
/* 285 */                       Io0OiI0l0Iio io0OiI0l0Iio = new Io0OiI0l0Iio(ooIllIioi1lI00000oOI);
/* 293 */                       io0OiI0l0Iio.I000OOo1O = new HashMap();
/* 300 */                       io0OiI0l0Iio.I000OiO = new HashMap();
/* 302 */                       VarHandle.storeStoreFence();
                                olliIl0I0001Ioi1lo = io0OiI0l0Iio;
                            } else {
/* 306 */                       olliIl0I0001Ioi1lo = I0001Ioi1lo(ooIllIioi1lI00000oOI, strI00Io1lO);
                            }
/* 310 */                   olliIl0I0001Ioi1lo.I00000oIO = strI00Io1lO;
/* 312 */                   ioiOloi.I00IoiI();
/* 319 */                   olliIl0I0001Ioi1lo.I00000oOI = ioiOloi.I00IoiI();
/* 321 */                   long jI00IoiI = ioiOloi.I00IoiI();
/* 325 */                   olliIl0I0001Ioi1lo.I0000Il00O = jI00IoiI;
/* 329 */                   olliIl0 = (jI00IoiI == 0 || strI00Io1lO.equals("glyf")) ? olliIl0I0001Ioi1lo : null;
/* 339 */                   if (olliIl0 != null) {
/* 354 */                       if (olliIl0.I00000oOI + olliIl0.I0000Il00O > ooIllIioi1lI00000oOI.I00iio.I000l1()) {
/* 408 */                           Log.w("PdfBox-Android", "Skip table '" + olliIl0.I00000oIO + "' which goes past the file size; offset: " + olliIl0.I00000oOI + ", size: " + olliIl0.I0000Il00O + ", font size: " + ooIllIioi1lI00000oOI.I00iio.I000l1());
                                } else {
/* 416 */                           ooIllIioi1lI00000oOI.I00iiO.put(olliIl0.I00000oIO, olliIl0);
                                }
                            }
/* 419 */                   i = i2 + 1;
                        }
                        olliIl0I0001Ioi1lo = iii10I010;
/* 310 */               olliIl0I0001Ioi1lo.I00000oIO = strI00Io1lO;
/* 312 */               ioiOloi.I00IoiI();
/* 319 */               olliIl0I0001Ioi1lo.I00000oOI = ioiOloi.I00IoiI();
/* 321 */               long jI00IoiI2 = ioiOloi.I00IoiI();
/* 325 */               olliIl0I0001Ioi1lo.I0000Il00O = jI00IoiI2;
/* 329 */               if (jI00IoiI2 == 0) {
                        }
/* 339 */               if (olliIl0 != null) {
                        }
/* 419 */               i = i2 + 1;
                    }
/* 428 */           if (!this.I00iiI) {
/* 444 */               for (OlliIl0 olliIl02 : ooIllIioi1lI00000oOI.I00iiO.values()) {
/* 454 */                   if (!olliIl02.I0000O) {
/* 456 */                       ooIllIioi1lI00000oOI.I00OOll1(olliIl02);
                            }
                        }
/* 464 */               boolean zContainsKey = ooIllIioi1lI00000oOI.I00iiO.containsKey("CFF ");
/* 477 */               boolean z = (this instanceof OIOi0Oli) && zContainsKey;
/* 482 */               if (ooIllIioi1lI00000oOI.I001i1lo1io() == null) {
/* 629 */                   IioIoO10iOiI.I000OOo1O("'head' table is mandatory");
/* 28 */                    return null;
                        }
/* 490 */               if (((IoI1IIo00Io1) ooIllIioi1lI00000oOI.I00IOO("hhea")) == null) {
/* 623 */                   IioIoO10iOiI.I000OOo1O("'hhea' table is mandatory");
/* 28 */                    return null;
                        }
/* 498 */               if (((O1i0IIiliO1o) ooIllIioi1lI00000oOI.I00IOO("maxp")) == null) {
/* 617 */                   IioIoO10iOiI.I000OOo1O("'maxp' table is mandatory");
/* 28 */                    return null;
                        }
/* 506 */               if (((OO1o0oIoil) ooIllIioi1lI00000oOI.I00IOO("post")) == null && !this.I00iOIl) {
/* 515 */                   IioIoO10iOiI.I000OOo1O("'post' table is mandatory");
/* 28 */                    return null;
                        }
/* 519 */               if (!z) {
/* 526 */                   String str = zContainsKey ? "; this an OpenType CFF font, but we expected a TrueType font here" : "";
/* 534 */                   if (((Iol0Oi0Oo11) ooIllIioi1lI00000oOI.I00IOO("loca")) == null) {
/* 559 */                       IioIoO10iOiI.I000OOo1O("'loca' table is mandatory".concat(str));
/* 28 */                        return null;
                            }
/* 540 */                   if (ooIllIioi1lI00000oOI.I00100l0() == null) {
/* 549 */                       IioIoO10iOiI.I000OOo1O("'glyf' table is mandatory".concat(str));
/* 28 */                        return null;
                            }
                        }
/* 569 */               if (((OI1O0i010o) ooIllIioi1lI00000oOI.I00IOO("name")) == null && !this.I00iOIl) {
/* 578 */                   IioIoO10iOiI.I000OOo1O("'name' table is mandatory");
/* 28 */                    return null;
                        }
/* 588 */               if (((IoI1Iii) ooIllIioi1lI00000oOI.I00IOO("hmtx")) == null) {
/* 611 */                   IioIoO10iOiI.I000OOo1O("'hmtx' table is mandatory");
/* 28 */                    return null;
                        }
/* 592 */               if (!this.I00iOIl && ((IOOIOIO) ooIllIioi1lI00000oOI.I00IOO("cmap")) == null) {
/* 605 */                   IioIoO10iOiI.I000OOo1O("'cmap' table is mandatory");
/* 28 */                    return null;
                        }
                    }
/* 966 */           return ooIllIioi1lI00000oOI;
                }

                public OoIllIioi1l I0000O(File file) throws IOException {
/* 3 */             OOilOo101lI oOilOo101lI = new OOilOo101lI(file);
                    try {
/* 6 */                 return I0000Il00O(oOilOo101lI);
                    } catch (IOException e) {
/* 12 */                oOilOo101lI.close();
/* 49 */                throw e;
                    }
                }

                public OoIllIioi1l I0000oI00(InputStream inputStream) throws IOException {
/* 3 */             O1ilII o1ilII = new O1ilII();
/* 7 */             o1ilII.I00iOIl = null;
/* 10 */            o1ilII.I00iiI = 0;
                    try {
/* 18 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
/* 23 */                byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
                        while (true) {
/* 25 */                    int i = inputStream.read(bArr);
/* 30 */                    if (i == -1) {
/* 42 */                        o1ilII.I00iOIl = byteArrayOutputStream.toByteArray();
/* 44 */                        inputStream.close();
/* 47 */                        return I0000Il00O(o1ilII);
                            }
/* 32 */                    byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
/* 52 */                inputStream.close();
/* 186 */               throw th;
                    }
                }

                public OlliIl0 I0001Ioi1lo(OoIllIioi1l ooIllIioi1l, String str) {
/* 3 */             return new OlliIl0(ooIllIioi1l);
                }

/* 45 */        public IlOoIo(boolean z, boolean z2) {
/* 46 */            this.I00iOIl = z;
                    this.I00iiI = z2;
                }
            }
