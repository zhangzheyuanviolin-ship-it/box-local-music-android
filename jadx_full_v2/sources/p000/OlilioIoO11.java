            package p000;

            import android.content.Context;
            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.media.MediaRecorder;
            import android.os.Build;
            import android.util.Log;
            import android.util.Range;
            import android.util.Rational;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
            import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
            import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
            import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
            import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            public final class OlilioIoO11 {
                public final IIlo0i0ll I00000oIO;
                public final Il0IIIo1I I00000oOI;
                public final IlIIIi I0000Il00O;
                public final String I0000O;
                public final int I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public final ArrayList I000II;
                public final ArrayList I000O01llI0;
                public final ArrayList I000OOo1O;
                public final ArrayList I000OiO;
                public final ArrayList I000iOII;
                public final LinkedHashMap I000l1;
                public final ArrayList I000lI;
                public final ArrayList I000o00OoI0I;
                public final boolean I000oI1ioi;
                public final boolean I00100l0;
                public final boolean I00100o1O0lo;
                public final boolean I0010I0i;
                public final boolean I0010o;
                public final boolean I00111O;
                public final boolean I001IIilI0O;
                public I1lO00O00I1 I001IO000;
                public final ArrayList I001i1O0Ol;
                public final OlOIOo0 I001i1lo1io;
                public final IiiIlilOO I001iOo1i0O;
                public final Oi0Oooi I001l0I00;
                public final IOO0o0I1l I001lIiIIo1O;
                public final I0oO0iO1l0lo I001lllioOl;
                public final Io1iOil0oli I001lloI;

                /* JADX WARN: Removed duplicated region for block: B:47:0x03a4  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OlilioIoO11(Context context, IIlo0i0ll iIlo0i0ll, Il0IIIo1I il0IIIo1I, IlIIIi ilIIIi) {
                    ArrayList arrayList;
/* 8 */             this.I00000oIO = iIlo0i0ll;
/* 12 */            this.I00000oOI = il0IIIo1I;
/* 16 */            this.I0000Il00O = ilIIIi;
/* 19 */            IIioli iIioli = (IIioli) iIlo0i0ll;
/* 21 */            String str = iIioli.I00iOIl;
/* 23 */            this.I0000O = str;
/* 31 */            Integer num = (Integer) iIioli.I0000O(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
/* 41 */            int iIntValue = num != null ? num.intValue() : 2;
/* 42 */            this.I0000oI00 = iIntValue;
/* 46 */            ArrayList arrayList2 = new ArrayList();
/* 49 */            this.I0001Ioi1lo = arrayList2;
/* 53 */            ArrayList arrayList3 = new ArrayList();
/* 56 */            this.I000II = arrayList3;
/* 60 */            ArrayList arrayList4 = new ArrayList();
/* 63 */            this.I000O01llI0 = arrayList4;
/* 67 */            ArrayList arrayList5 = new ArrayList();
/* 70 */            this.I000OOo1O = arrayList5;
/* 74 */            ArrayList arrayList6 = new ArrayList();
/* 77 */            this.I000OiO = arrayList6;
/* 84 */            this.I000iOII = new ArrayList();
/* 91 */            this.I000l1 = new LinkedHashMap();
/* 95 */            ArrayList arrayList7 = new ArrayList();
/* 98 */            this.I000lI = arrayList7;
/* 105 */           this.I000o00OoI0I = new ArrayList();
/* 107 */           IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 109 */           iIlo0OOlI.getClass();
/* 112 */           iIlo0OOlI.getClass();
/* 121 */           int[] iArr = (int[]) iIioli.I0000O(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
/* 127 */           boolean zI0000oI00 = I1IoiO1l.I0000oI00(iArr == null ? IIlo0OOlI.I00000oOI : iArr, 2);
/* 131 */           this.I00111O = zI0000oI00;
/* 138 */           this.I001i1O0Ol = new ArrayList();
/* 144 */           this.I001i1lo1io = I000OiO();
/* 152 */           ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) IiOoli.I00000oIO(ExtraSupportedSurfaceCombinationsQuirk.class);
/* 162 */           this.I001iOo1i0O = IiiIlilOO.I000II.I000l1(context);
/* 171 */           Oi0Oooi oi0Oooi = new Oi0Oooi(18, false);
/* 182 */           oi0Oooi.I00iiI = (ExtraCroppingQuirk) IiOoli.I00000oIO(ExtraCroppingQuirk.class);
/* 184 */           VarHandle.storeStoreFence();
/* 187 */           this.I001l0I00 = oi0Oooi;
/* 196 */           this.I001lIiIIo1O = new IOO0o0I1l(16);
/* 200 */           I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(iIlo0i0ll);
/* 203 */           this.I001lllioOl = i0oO0iO1l0lo;
/* 207 */           Io1iOil0oli io1iOil0oli = new Io1iOil0oli();
/* 210 */           io1iOil0oli.I00000oIO = iIlo0i0ll;
/* 214 */           Io1iOIIOI io1iOIIOI = new Io1iOIIOI(false ? 1 : 0);
/* 217 */           io1iOIIOI.I00iiI = io1iOil0oli;
/* 219 */           VarHandle.storeStoreFence();
/* 227 */           io1iOil0oli.I00000oOI = new OllO00oiil(io1iOIIOI);
/* 232 */           Io1iOIIOI io1iOIIOI2 = new Io1iOIIOI(1);
/* 235 */           io1iOIIOI2.I00iiI = io1iOil0oli;
/* 237 */           VarHandle.storeStoreFence();
/* 245 */           io1iOil0oli.I0000Il00O = new OllO00oiil(io1iOIIOI2);
/* 250 */           Io1iOIIOI io1iOIIOI3 = new Io1iOIIOI(2);
/* 253 */           io1iOIIOI3.I00iiI = io1iOil0oli;
/* 255 */           VarHandle.storeStoreFence();
/* 263 */           io1iOil0oli.I0000O = new OllO00oiil(io1iOIIOI3);
/* 268 */           Io1iOIIOI io1iOIIOI4 = new Io1iOIIOI(3);
/* 271 */           io1iOIIOI4.I00iiI = io1iOil0oli;
/* 273 */           VarHandle.storeStoreFence();
/* 281 */           io1iOil0oli.I0000oI00 = new OllO00oiil(io1iOIIOI4);
/* 283 */           VarHandle.storeStoreFence();
/* 286 */           this.I001lloI = io1iOil0oli;
/* 294 */           int[] iArr2 = (int[]) iIioli.I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 296 */           if (iArr2 != null) {
/* 303 */               this.I000oI1ioi = I1IoiO1l.I0000oI00(iArr2, 3);
/* 310 */               this.I00100l0 = I1IoiO1l.I0000oI00(iArr2, 6);
/* 318 */               this.I0010o = I1IoiO1l.I0000oI00(iArr2, 16);
/* 325 */               this.I001IIilI0O = I1IoiO1l.I0000oI00(iArr2, 1);
                    }
/* 327 */           boolean z = this.I000oI1ioi;
/* 329 */           boolean z2 = this.I00100l0;
/* 331 */           OllO00oiil ollO00oiil = Io11Oi.I00000oIO;
/* 335 */           ArrayList arrayList8 = new ArrayList();
/* 342 */           ArrayList arrayList9 = new ArrayList();
/* 349 */           Olill00lIoo olill00lIoo = new Olill00lIoo();
/* 352 */           OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 356 */           Olilol olilol = Olilol.I00iOIl;
/* 358 */           Olill0O0OOIO olill0O0OOIO = Olill0O0OOIO.I00lli11;
/* 362 */           OlOOI001 olOOI0012 = Olio00O.I0000oI00;
/* 370 */           olill00lIoo.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO, olOOI0012));
/* 373 */           arrayList9.add(olill00lIoo);
/* 378 */           Olill00lIoo olill00lIoo2 = new Olill00lIoo();
/* 381 */           Olilol olilol2 = Olilol.I00iiO;
/* 389 */           olill00lIoo2.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0012));
/* 392 */           arrayList9.add(olill00lIoo2);
/* 397 */           Olill00lIoo olill00lIoo3 = new Olill00lIoo();
/* 400 */           Olilol olilol3 = Olilol.I00iiI;
/* 408 */           olill00lIoo3.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, olOOI0012));
/* 411 */           arrayList9.add(olill00lIoo3);
/* 416 */           Olill00lIoo olill00lIoo4 = new Olill00lIoo();
/* 419 */           Olill0O0OOIO olill0O0OOIO2 = Olill0O0OOIO.I00ilO0;
/* 427 */           IlIi0I0.I00111O(olill00lIoo4, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol2, olill0O0OOIO, olOOI0012);
/* 430 */           Olill00lIoo olill00lIooI000OOo1O = IlIi0I0.I000OOo1O(arrayList9, olill00lIoo4);
/* 438 */           IlIi0I0.I00111O(olill00lIooI000OOo1O, loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO2, olOOI0012), olilol2, olill0O0OOIO, olOOI0012);
/* 441 */           Olill00lIoo olill00lIooI000OOo1O2 = IlIi0I0.I000OOo1O(arrayList9, olill00lIooI000OOo1O);
/* 449 */           IlIi0I0.I00111O(olill00lIooI000OOo1O2, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol, olill0O0OOIO2, olOOI0012);
/* 452 */           Olill00lIoo olill00lIooI000OOo1O3 = IlIi0I0.I000OOo1O(arrayList9, olill00lIooI000OOo1O2);
/* 460 */           IlIi0I0.I00111O(olill00lIooI000OOo1O3, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO2, olOOI0012);
/* 463 */           Olill00lIoo olill00lIooI000OOo1O4 = IlIi0I0.I000OOo1O(arrayList9, olill00lIooI000OOo1O3);
/* 471 */           IlIi0I0.I00111O(olill00lIooI000OOo1O4, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO2, olOOI0012);
/* 478 */           olill00lIooI000OOo1O4.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0012));
/* 481 */           arrayList9.add(olill00lIooI000OOo1O4);
/* 484 */           arrayList8.addAll(arrayList9);
/* 487 */           if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3 || iIntValue == 4) {
/* 505 */               ArrayList arrayList10 = new ArrayList();
/* 510 */               Olill00lIoo olill00lIoo5 = new Olill00lIoo();
/* 517 */               olill00lIoo5.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012));
/* 520 */               Olill0O0OOIO olill0O0OOIO3 = Olill0O0OOIO.I00ll1;
/* 522 */               arrayList = arrayList2;
/* 528 */               olill00lIoo5.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO3, olOOI0012));
/* 531 */               arrayList10.add(olill00lIoo5);
/* 536 */               Olill00lIoo olill00lIoo6 = new Olill00lIoo();
/* 543 */               IlIi0I0.I00111O(olill00lIoo6, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO3, olOOI0012);
/* 546 */               Olill00lIoo olill00lIooI000OOo1O5 = IlIi0I0.I000OOo1O(arrayList10, olill00lIoo6);
/* 554 */               IlIi0I0.I00111O(olill00lIooI000OOo1O5, loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO3, olOOI0012);
/* 557 */               Olill00lIoo olill00lIooI000OOo1O6 = IlIi0I0.I000OOo1O(arrayList10, olill00lIooI000OOo1O5);
/* 565 */               IlIi0I0.I00111O(olill00lIooI000OOo1O6, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol, olill0O0OOIO3, olOOI0012);
/* 572 */               olill00lIooI000OOo1O6.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO3, olOOI0012));
/* 575 */               arrayList10.add(olill00lIooI000OOo1O6);
/* 580 */               Olill00lIoo olill00lIoo7 = new Olill00lIoo();
/* 587 */               IlIi0I0.I00111O(olill00lIoo7, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO3, olOOI0012);
/* 594 */               olill00lIoo7.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO3, olOOI0012));
/* 597 */               arrayList10.add(olill00lIoo7);
/* 602 */               Olill00lIoo olill00lIoo8 = new Olill00lIoo();
/* 609 */               IlIi0I0.I00111O(olill00lIoo8, loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO2, olOOI0012);
/* 616 */               olill00lIoo8.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0012));
/* 619 */               arrayList10.add(olill00lIoo8);
/* 622 */               arrayList8.addAll(arrayList10);
                    } else {
/* 498 */               arrayList = arrayList2;
                    }
/* 626 */           if (iIntValue == 1 || iIntValue == 3) {
/* 634 */               ArrayList arrayList11 = new ArrayList();
/* 639 */               Olill00lIoo olill00lIoo9 = new Olill00lIoo();
/* 646 */               IlIi0I0.I00111O(olill00lIoo9, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol, olill0O0OOIO, olOOI0012);
/* 649 */               Olill00lIoo olill00lIooI000OOo1O7 = IlIi0I0.I000OOo1O(arrayList11, olill00lIoo9);
/* 657 */               IlIi0I0.I00111O(olill00lIooI000OOo1O7, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO, olOOI0012);
/* 660 */               Olill00lIoo olill00lIooI000OOo1O8 = IlIi0I0.I000OOo1O(arrayList11, olill00lIooI000OOo1O7);
/* 668 */               IlIi0I0.I00111O(olill00lIooI000OOo1O8, loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO2, olOOI0012), olilol3, olill0O0OOIO, olOOI0012);
/* 671 */               Olill00lIoo olill00lIooI000OOo1O9 = IlIi0I0.I000OOo1O(arrayList11, olill00lIooI000OOo1O8);
/* 679 */               IlIi0I0.I00111O(olill00lIooI000OOo1O9, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0012), olilol, olill0O0OOIO2, olOOI0012);
/* 686 */               olill00lIooI000OOo1O9.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0012));
/* 689 */               arrayList11.add(olill00lIooI000OOo1O9);
/* 694 */               Olill00lIoo olill00lIoo10 = new Olill00lIoo();
/* 697 */               Olill0O0OOIO olill0O0OOIO4 = Olill0O0OOIO.I00iiO;
/* 703 */               IlIi0I0.I00111O(olill00lIoo10, loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO4, olOOI0012), olilol, olill0O0OOIO2, olOOI0012);
/* 710 */               olill00lIoo10.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, olOOI0012));
/* 713 */               arrayList11.add(olill00lIoo10);
/* 718 */               Olill00lIoo olill00lIoo11 = new Olill00lIoo();
/* 721 */               Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO4, olill00lIoo11, olilol3, olill0O0OOIO2);
/* 728 */               olill00lIoo11.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, Olio00O.I0000oI00));
/* 731 */               arrayList11.add(olill00lIoo11);
/* 734 */               arrayList8.addAll(arrayList11);
                    }
/* 737 */           if (z) {
/* 741 */               ArrayList arrayList12 = new ArrayList();
/* 746 */               Olill00lIoo olill00lIoo12 = new Olill00lIoo();
/* 749 */               Olilol olilol4 = Olilol.I00ilI0I1;
/* 751 */               Olill00lIoo olill00lIooI000o00OoI0I = Oi010OO0.I000o00OoI0I(olilol4, olill0O0OOIO, olill00lIoo12, arrayList12, olill00lIoo12);
/* 755 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000o00OoI0I, olilol4, olill0O0OOIO);
/* 758 */               Olill00lIoo olill00lIooI000OOo1O10 = IlIi0I0.I000OOo1O(arrayList12, olill00lIooI000o00OoI0I);
/* 762 */               Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO2, olill00lIooI000OOo1O10, olilol4, olill0O0OOIO);
/* 765 */               Olill00lIoo olill00lIooI000OOo1O11 = IlIi0I0.I000OOo1O(arrayList12, olill00lIooI000OOo1O10);
/* 769 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000OOo1O11, olilol, olill0O0OOIO2);
/* 772 */               Olill00lIoo olill00lIooI000o00OoI0I2 = Oi010OO0.I000o00OoI0I(olilol4, olill0O0OOIO, olill00lIooI000OOo1O11, arrayList12, olill00lIooI000OOo1O11);
/* 776 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000o00OoI0I2, olilol3, olill0O0OOIO2);
/* 779 */               Olill00lIoo olill00lIooI000o00OoI0I3 = Oi010OO0.I000o00OoI0I(olilol4, olill0O0OOIO, olill00lIooI000o00OoI0I2, arrayList12, olill00lIooI000o00OoI0I2);
/* 783 */               Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO2, olill00lIooI000o00OoI0I3, olilol3, olill0O0OOIO2);
/* 786 */               Olill00lIoo olill00lIooI000o00OoI0I4 = Oi010OO0.I000o00OoI0I(olilol4, olill0O0OOIO, olill00lIooI000o00OoI0I3, arrayList12, olill00lIooI000o00OoI0I3);
/* 790 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000o00OoI0I4, olilol2, olill0O0OOIO);
/* 793 */               Olill00lIoo olill00lIooI000o00OoI0I5 = Oi010OO0.I000o00OoI0I(olilol4, olill0O0OOIO, olill00lIooI000o00OoI0I4, arrayList12, olill00lIooI000o00OoI0I4);
/* 797 */               Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO2, olill00lIooI000o00OoI0I5, olilol2, olill0O0OOIO);
/* 804 */               olill00lIooI000o00OoI0I5.I00000oIO(loIOiIO1O1.I000iOII(olilol4, olill0O0OOIO, Olio00O.I0000oI00));
/* 807 */               arrayList12.add(olill00lIooI000o00OoI0I5);
/* 810 */               arrayList8.addAll(arrayList12);
                    }
/* 813 */           if (z2 && iIntValue == 0) {
/* 819 */               ArrayList arrayList13 = new ArrayList();
/* 824 */               Olill00lIoo olill00lIoo13 = new Olill00lIoo();
/* 827 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIoo13, olilol, olill0O0OOIO);
/* 830 */               Olill00lIoo olill00lIooI000OOo1O12 = IlIi0I0.I000OOo1O(arrayList13, olill00lIoo13);
/* 834 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000OOo1O12, olilol3, olill0O0OOIO);
/* 837 */               Olill00lIoo olill00lIooI000OOo1O13 = IlIi0I0.I000OOo1O(arrayList13, olill00lIooI000OOo1O12);
/* 841 */               Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO2, olill00lIooI000OOo1O13, olilol3, olill0O0OOIO);
/* 844 */               arrayList13.add(olill00lIooI000OOo1O13);
/* 847 */               arrayList8.addAll(arrayList13);
                    }
/* 851 */           if (iIntValue == 3) {
/* 855 */               ArrayList arrayList14 = new ArrayList();
/* 860 */               Olill00lIoo olill00lIoo14 = new Olill00lIoo();
/* 867 */               olill00lIoo14.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, Olio00O.I0000oI00));
/* 870 */               Olill0O0OOIO olill0O0OOIO5 = Olill0O0OOIO.I00iiO;
/* 872 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO5, olill00lIoo14, olilol3, olill0O0OOIO);
/* 875 */               Olilol olilol5 = Olilol.I00ilI0I1;
/* 877 */               Olill00lIoo olill00lIooI000o00OoI0I6 = Oi010OO0.I000o00OoI0I(olilol5, olill0O0OOIO, olill00lIoo14, arrayList14, olill00lIoo14);
/* 881 */               Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000o00OoI0I6, olilol, olill0O0OOIO5);
/* 884 */               Oi010OO0.I001lIiIIo1O(olilol2, olill0O0OOIO, olill00lIooI000o00OoI0I6, olilol5, olill0O0OOIO);
/* 887 */               arrayList14.add(olill00lIooI000o00OoI0I6);
/* 890 */               arrayList8.addAll(arrayList14);
                    }
/* 893 */           arrayList3.addAll(arrayList8);
/* 896 */           Collection collection = Il01100l.I00iOIl;
                    Collection collectionSingletonList = collection;
/* 898 */           if (extraSupportedSurfaceCombinationsQuirk != null) {
/* 900 */               Olill00lIoo olill00lIoo15 = ExtraSupportedSurfaceCombinationsQuirk.I00000oIO;
/* 902 */               String str2 = Build.DEVICE;
/* 910 */               if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
/* 942 */                   ArrayList arrayList15 = new ArrayList();
                            collectionSingletonList = arrayList15;
/* 951 */                   if (O0000Ioio00.I0000O(str, "1")) {
/* 955 */                       arrayList15.add(ExtraSupportedSurfaceCombinationsQuirk.I00000oIO);
                                collectionSingletonList = arrayList15;
                            }
                        } else if (!ilO10l0.I00000oIO()) {
                            collectionSingletonList = collection;
/* 931 */                   if (ilO10l0.I00000oOI()) {
/* 935 */                       collectionSingletonList = Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.I00000oOI);
                            }
                        }
                    }
/* 960 */           arrayList3.addAll(collectionSingletonList);
/* 965 */           if (this.I0010o) {
/* 969 */               ArrayList arrayList16 = new ArrayList();
/* 974 */               Olill00lIoo olill00lIoo16 = new Olill00lIoo();
/* 977 */               Olill0O0OOIO olill0O0OOIO6 = Olill0O0OOIO.I00o0l1o1o0;
/* 979 */               Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO6, olill00lIoo16, olilol, olill0O0OOIO2);
/* 982 */               Olill0O0OOIO olill0O0OOIO7 = Olill0O0OOIO.I00ll1;
/* 984 */               Olill00lIoo olill00lIooI000o00OoI0I7 = Oi010OO0.I000o00OoI0I(olilol, olill0O0OOIO7, olill00lIoo16, arrayList16, olill00lIoo16);
/* 988 */               Oi010OO0.I001lIiIIo1O(olilol2, olill0O0OOIO6, olill00lIooI000o00OoI0I7, olilol, olill0O0OOIO2);
/* 991 */               Olill00lIoo olill00lIooI000o00OoI0I8 = Oi010OO0.I000o00OoI0I(olilol, olill0O0OOIO7, olill00lIooI000o00OoI0I7, arrayList16, olill00lIooI000o00OoI0I7);
/* 995 */               Olilol olilol6 = Olilol.I00ilI0I1;
/* 997 */               Oi010OO0.I001lIiIIo1O(olilol6, olill0O0OOIO6, olill00lIooI000o00OoI0I8, olilol, olill0O0OOIO2);
/* 1000 */              Olill00lIoo olill00lIooI000o00OoI0I9 = Oi010OO0.I000o00OoI0I(olilol, olill0O0OOIO7, olill00lIooI000o00OoI0I8, arrayList16, olill00lIooI000o00OoI0I8);
/* 1004 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO6, olill00lIooI000o00OoI0I9, olilol, olill0O0OOIO2);
/* 1007 */              Olill00lIoo olill00lIooI000o00OoI0I10 = Oi010OO0.I000o00OoI0I(olilol2, olill0O0OOIO, olill00lIooI000o00OoI0I9, arrayList16, olill00lIooI000o00OoI0I9);
/* 1011 */              Oi010OO0.I001lIiIIo1O(olilol2, olill0O0OOIO6, olill00lIooI000o00OoI0I10, olilol, olill0O0OOIO2);
/* 1014 */              Olill00lIoo olill00lIooI000o00OoI0I11 = Oi010OO0.I000o00OoI0I(olilol2, olill0O0OOIO, olill00lIooI000o00OoI0I10, arrayList16, olill00lIooI000o00OoI0I10);
/* 1018 */              Oi010OO0.I001lIiIIo1O(olilol6, olill0O0OOIO6, olill00lIooI000o00OoI0I11, olilol, olill0O0OOIO2);
/* 1021 */              Olill00lIoo olill00lIooI000o00OoI0I12 = Oi010OO0.I000o00OoI0I(olilol2, olill0O0OOIO, olill00lIooI000o00OoI0I11, arrayList16, olill00lIooI000o00OoI0I11);
/* 1025 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO6, olill00lIooI000o00OoI0I12, olilol, olill0O0OOIO2);
/* 1028 */              Olill00lIoo olill00lIooI000o00OoI0I13 = Oi010OO0.I000o00OoI0I(olilol3, olill0O0OOIO, olill00lIooI000o00OoI0I12, arrayList16, olill00lIooI000o00OoI0I12);
/* 1032 */              Oi010OO0.I001lIiIIo1O(olilol2, olill0O0OOIO6, olill00lIooI000o00OoI0I13, olilol, olill0O0OOIO2);
/* 1035 */              Olill00lIoo olill00lIooI000o00OoI0I14 = Oi010OO0.I000o00OoI0I(olilol3, olill0O0OOIO, olill00lIooI000o00OoI0I13, arrayList16, olill00lIooI000o00OoI0I13);
/* 1039 */              Oi010OO0.I001lIiIIo1O(olilol6, olill0O0OOIO6, olill00lIooI000o00OoI0I14, olilol, olill0O0OOIO2);
/* 1042 */              Olill00lIoo olill00lIooI000o00OoI0I15 = Oi010OO0.I000o00OoI0I(olilol3, olill0O0OOIO, olill00lIooI000o00OoI0I14, arrayList16, olill00lIooI000o00OoI0I14);
/* 1046 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO6, olill00lIooI000o00OoI0I15, olilol, olill0O0OOIO2);
/* 1049 */              Olill00lIoo olill00lIooI000o00OoI0I16 = Oi010OO0.I000o00OoI0I(olilol6, olill0O0OOIO, olill00lIooI000o00OoI0I15, arrayList16, olill00lIooI000o00OoI0I15);
/* 1053 */              Oi010OO0.I001lIiIIo1O(olilol2, olill0O0OOIO6, olill00lIooI000o00OoI0I16, olilol, olill0O0OOIO2);
/* 1056 */              Olill00lIoo olill00lIooI000o00OoI0I17 = Oi010OO0.I000o00OoI0I(olilol6, olill0O0OOIO, olill00lIooI000o00OoI0I16, arrayList16, olill00lIooI000o00OoI0I16);
/* 1060 */              Oi010OO0.I001lIiIIo1O(olilol6, olill0O0OOIO6, olill00lIooI000o00OoI0I17, olilol, olill0O0OOIO2);
/* 1067 */              olill00lIooI000o00OoI0I17.I00000oIO(loIOiIO1O1.I000iOII(olilol6, olill0O0OOIO, Olio00O.I0000oI00));
/* 1070 */              arrayList16.add(olill00lIooI000o00OoI0I17);
/* 1073 */              arrayList5.addAll(arrayList16);
                    }
/* 1082 */          boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
/* 1086 */          this.I00100o1O0lo = zHasSystemFeature;
/* 1088 */          if (zHasSystemFeature) {
/* 1092 */              ArrayList arrayList17 = new ArrayList();
/* 1097 */              Olill00lIoo olill00lIoo17 = new Olill00lIoo();
/* 1100 */              Olill0O0OOIO olill0O0OOIO8 = Olill0O0OOIO.I00l0I0l0lO1;
/* 1102 */              Olill00lIoo olill00lIooI000o00OoI0I18 = Oi010OO0.I000o00OoI0I(olilol3, olill0O0OOIO8, olill00lIoo17, arrayList17, olill00lIoo17);
/* 1106 */              Olill00lIoo olill00lIooI000o00OoI0I19 = Oi010OO0.I000o00OoI0I(olilol, olill0O0OOIO8, olill00lIooI000o00OoI0I18, arrayList17, olill00lIooI000o00OoI0I18);
/* 1110 */              Olill00lIoo olill00lIooI000o00OoI0I20 = Oi010OO0.I000o00OoI0I(olilol2, olill0O0OOIO8, olill00lIooI000o00OoI0I19, arrayList17, olill00lIooI000o00OoI0I19);
/* 1114 */              Olill0O0OOIO olill0O0OOIO9 = Olill0O0OOIO.I00ilI0I1;
/* 1116 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO9, olill00lIooI000o00OoI0I20, olilol2, olill0O0OOIO8);
/* 1119 */              Olill00lIoo olill00lIooI000OOo1O14 = IlIi0I0.I000OOo1O(arrayList17, olill00lIooI000o00OoI0I20);
/* 1123 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO9, olill00lIooI000OOo1O14, olilol2, olill0O0OOIO8);
/* 1126 */              Olill00lIoo olill00lIooI000OOo1O15 = IlIi0I0.I000OOo1O(arrayList17, olill00lIooI000OOo1O14);
/* 1130 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO9, olill00lIooI000OOo1O15, olilol3, olill0O0OOIO8);
/* 1133 */              Olill00lIoo olill00lIooI000OOo1O16 = IlIi0I0.I000OOo1O(arrayList17, olill00lIooI000OOo1O15);
/* 1137 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO9, olill00lIooI000OOo1O16, olilol, olill0O0OOIO8);
/* 1140 */              Olill00lIoo olill00lIooI000OOo1O17 = IlIi0I0.I000OOo1O(arrayList17, olill00lIooI000OOo1O16);
/* 1144 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO9, olill00lIooI000OOo1O17, olilol3, olill0O0OOIO8);
/* 1147 */              Olill00lIoo olill00lIooI000OOo1O18 = IlIi0I0.I000OOo1O(arrayList17, olill00lIooI000OOo1O17);
/* 1151 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO9, olill00lIooI000OOo1O18, olilol, olill0O0OOIO8);
/* 1154 */              arrayList17.add(olill00lIooI000OOo1O18);
/* 1159 */              arrayList.addAll(arrayList17);
                    }
/* 1166 */          if (i0oO0iO1l0lo.I00iiI) {
/* 1170 */              Olill00lIoo olill00lIoo18 = new Olill00lIoo();
/* 1177 */              olill00lIoo18.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO, Olio00O.I0000oI00));
/* 1182 */              Olill00lIoo olill00lIoo19 = new Olill00lIoo();
/* 1189 */              olill00lIoo19.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, Olio00O.I0000oI00));
/* 1194 */              Olill00lIoo olill00lIoo20 = new Olill00lIoo();
/* 1201 */              olill00lIoo20.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, Olio00O.I0000oI00));
/* 1208 */              olill00lIoo20.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, Olio00O.I0000oI00));
/* 1213 */              Olill00lIoo olill00lIoo21 = new Olill00lIoo();
/* 1220 */              olill00lIoo21.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, Olio00O.I0000oI00));
/* 1227 */              olill00lIoo21.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, Olio00O.I0000oI00));
/* 1232 */              Olill00lIoo olill00lIoo22 = new Olill00lIoo();
/* 1239 */              olill00lIoo22.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO2, Olio00O.I0000oI00));
/* 1246 */              olill00lIoo22.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, Olio00O.I0000oI00));
/* 1251 */              Olill00lIoo olill00lIoo23 = new Olill00lIoo();
/* 1258 */              olill00lIoo23.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, Olio00O.I0000oI00));
/* 1261 */              Olill0O0OOIO olill0O0OOIO10 = Olill0O0OOIO.I00ll1;
/* 1267 */              olill00lIoo23.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO10, Olio00O.I0000oI00));
/* 1272 */              Olill00lIoo olill00lIoo24 = new Olill00lIoo();
/* 1275 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIoo24, olilol, olill0O0OOIO10);
/* 1282 */              olill00lIoo24.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO10, Olio00O.I0000oI00));
/* 1287 */              Olill00lIoo olill00lIoo25 = new Olill00lIoo();
/* 1290 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIoo25, olilol, olill0O0OOIO10);
/* 1297 */              olill00lIoo25.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO10, Olio00O.I0000oI00));
/* 1312 */              arrayList7.addAll(IOOi1I.I000O01llI0(olill00lIoo18, olill00lIoo19, olill00lIoo20, olill00lIoo21, olill00lIoo22, olill00lIoo23, olill00lIoo24, olill00lIoo25));
                    }
/* 1315 */          if (zI0000oI00) {
/* 1319 */              ArrayList arrayList18 = new ArrayList();
/* 1324 */              Olill00lIoo olill00lIoo26 = new Olill00lIoo();
/* 1327 */              Olill0O0OOIO olill0O0OOIO11 = Olill0O0OOIO.I00l0I0l0lO1;
/* 1329 */              Olill00lIoo olill00lIooI000o00OoI0I21 = Oi010OO0.I000o00OoI0I(olilol, olill0O0OOIO11, olill00lIoo26, arrayList18, olill00lIoo26);
/* 1333 */              Olill00lIoo olill00lIooI000o00OoI0I22 = Oi010OO0.I000o00OoI0I(olilol3, olill0O0OOIO11, olill00lIooI000o00OoI0I21, arrayList18, olill00lIooI000o00OoI0I21);
/* 1337 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO11, olill00lIooI000o00OoI0I22, olilol2, olill0O0OOIO);
/* 1340 */              Olill00lIoo olill00lIooI000OOo1O19 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000o00OoI0I22);
/* 1344 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO11, olill00lIooI000OOo1O19, olilol2, olill0O0OOIO);
/* 1347 */              Olill00lIoo olill00lIooI000OOo1O20 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000OOo1O19);
/* 1351 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO11, olill00lIooI000OOo1O20, olilol3, olill0O0OOIO);
/* 1354 */              Olill00lIoo olill00lIooI000OOo1O21 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000OOo1O20);
/* 1358 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO11, olill00lIooI000OOo1O21, olilol3, olill0O0OOIO);
/* 1361 */              Olill00lIoo olill00lIooI000OOo1O22 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000OOo1O21);
/* 1365 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000OOo1O22, olilol, olill0O0OOIO11);
/* 1368 */              Olill00lIoo olill00lIooI000OOo1O23 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000OOo1O22);
/* 1372 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO2, olill00lIooI000OOo1O23, olilol, olill0O0OOIO11);
/* 1375 */              Olill00lIoo olill00lIooI000OOo1O24 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000OOo1O23);
/* 1379 */              Oi010OO0.I001lIiIIo1O(olilol, olill0O0OOIO2, olill00lIooI000OOo1O24, olilol3, olill0O0OOIO11);
/* 1382 */              Olill00lIoo olill00lIooI000OOo1O25 = IlIi0I0.I000OOo1O(arrayList18, olill00lIooI000OOo1O24);
/* 1386 */              Oi010OO0.I001lIiIIo1O(olilol3, olill0O0OOIO2, olill00lIooI000OOo1O25, olilol3, olill0O0OOIO11);
/* 1389 */              arrayList18.add(olill00lIooI000OOo1O25);
/* 1394 */              arrayList6.addAll(arrayList18);
                    }
/* 1397 */          I1ioiI i1ioiI = OlOOIoOO0OI.I00000oIO;
/* 1407 */          long[] jArr = (long[]) iIioli.I0000O(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
/* 1417 */          boolean z3 = (jArr == null || jArr.length == 0) ? false : true;
/* 1418 */          this.I0010I0i = z3;
/* 1420 */          if (z3) {
/* 1424 */              Olill00lIoo olill00lIoo27 = new Olill00lIoo();
/* 1427 */              Olill0O0OOIO olill0O0OOIO12 = Olill0O0OOIO.I00l0I0l0lO1;
/* 1429 */              OlOOI001 olOOI0013 = OlOOI001.I00ilO0;
/* 1435 */              olill00lIoo27.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO12, olOOI0013));
/* 1440 */              Olill00lIoo olill00lIoo28 = new Olill00lIoo();
/* 1447 */              olill00lIoo28.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO12, olOOI0013));
/* 1452 */              Olill00lIoo olill00lIoo29 = new Olill00lIoo();
/* 1455 */              Olill0O0OOIO olill0O0OOIO13 = Olill0O0OOIO.I00ll1;
/* 1457 */              OlOOI001 olOOI0014 = OlOOI001.I00iio;
/* 1463 */              olill00lIoo29.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO13, olOOI0014));
/* 1468 */              Olill00lIoo olill00lIoo30 = new Olill00lIoo();
/* 1475 */              olill00lIoo30.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO13, olOOI0014));
/* 1480 */              Olill00lIoo olill00lIoo31 = new Olill00lIoo();
/* 1483 */              OlOOI001 olOOI0015 = OlOOI001.I00ilI0I1;
/* 1489 */              olill00lIoo31.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0015));
/* 1494 */              Olill00lIoo olill00lIoo32 = new Olill00lIoo();
/* 1501 */              olill00lIoo32.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, olOOI0015));
/* 1506 */              Olill00lIoo olill00lIoo33 = new Olill00lIoo();
/* 1509 */              OlOOI001 olOOI0016 = OlOOI001.I00iiO;
/* 1517 */              olill00lIoo33.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016));
/* 1524 */              olill00lIoo33.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0015));
/* 1529 */              Olill00lIoo olill00lIoo34 = new Olill00lIoo();
/* 1538 */              olill00lIoo34.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016));
/* 1545 */              olill00lIoo34.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO, olOOI0015));
/* 1550 */              Olill00lIoo olill00lIoo35 = new Olill00lIoo();
/* 1559 */              olill00lIoo35.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016));
/* 1566 */              olill00lIoo35.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO13, olOOI0014));
/* 1571 */              Olill00lIoo olill00lIoo36 = new Olill00lIoo();
/* 1580 */              olill00lIoo36.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016));
/* 1587 */              olill00lIoo36.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO13, olOOI0014));
/* 1592 */              Olill00lIoo olill00lIoo37 = new Olill00lIoo();
/* 1601 */              olill00lIoo37.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016));
/* 1608 */              olill00lIoo37.I00000oIO(loIOiIO1O1.I000iOII(olilol3, olill0O0OOIO2, olOOI0016));
/* 1613 */              Olill00lIoo olill00lIoo38 = new Olill00lIoo();
/* 1622 */              IlIi0I0.I00111O(olill00lIoo38, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016), olilol, olill0O0OOIO13, olOOI0014);
/* 1629 */              olill00lIoo38.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO13, olOOI0015));
/* 1634 */              Olill00lIoo olill00lIoo39 = new Olill00lIoo();
/* 1643 */              IlIi0I0.I00111O(olill00lIoo39, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016), olilol3, olill0O0OOIO13, olOOI0014);
/* 1650 */              olill00lIoo39.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO13, olOOI0015));
/* 1655 */              Olill00lIoo olill00lIoo40 = new Olill00lIoo();
/* 1662 */              IlIi0I0.I00111O(olill00lIoo40, loIOiIO1O1.I000iOII(olilol, olill0O0OOIO2, olOOI0016), olilol3, olill0O0OOIO2, olOOI0016);
/* 1669 */              olill00lIoo40.I00000oIO(loIOiIO1O1.I000iOII(olilol2, olill0O0OOIO, olOOI0015));
/* 1698 */              arrayList4.addAll(IOOi1I.I000O01llI0(olill00lIoo27, olill00lIoo28, olill00lIoo29, olill00lIoo30, olill00lIoo31, olill00lIoo32, olill00lIoo33, olill00lIoo34, olill00lIoo35, olill00lIoo36, olill00lIoo37, olill00lIoo38, olill00lIoo39, olill00lIoo40));
                    }
/* 1701 */          I00000oOI();
                }

                /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Range I0000Il00O(Range range, int i, Range[] rangeArr) {
/* 5 */             Range range2 = I1lIoOIi.I000O01llI0;
/* 13 */            if (O0000Ioio00.I0000O(range, range2) || rangeArr == null) {
/* 18 */                return range2;
                    }
/* 57 */            Range range3 = new Range(Integer.valueOf(Math.min(((Number) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Number) range.getUpper()).intValue(), i)));
/* 62 */            int iI000O01llI0 = 0;
/* 63 */            for (Range range4 : rangeArr) {
/* 77 */                if (i >= ((Number) range4.getLower()).intValue()) {
/* 87 */                    if (O0000Ioio00.I0000O(range2, I1lIoOIi.I000O01llI0)) {
/* 89 */                        range2 = range4;
                            }
/* 94 */                    if (range4.equals(range3)) {
/* 96 */                        return range4;
                            }
                            try {
/* 103 */                       int iI000O01llI02 = I000O01llI0(range4.intersect(range3));
/* 107 */                       if (iI000O01llI0 == 0) {
/* 109 */                           range2 = range4;
/* 110 */                           iI000O01llI0 = iI000O01llI02;
                                } else if (iI000O01llI02 >= iI000O01llI0) {
/* 119 */                           double dI000O01llI0 = I000O01llI0(range2.intersect(range3));
/* 128 */                           double dI000O01llI02 = I000O01llI0(range4.intersect(range3));
/* 138 */                           double dI000O01llI03 = dI000O01llI02 / I000O01llI0(range4);
/* 145 */                           double dI000O01llI04 = dI000O01llI0 / I000O01llI0(range2);
/* 151 */                           if (dI000O01llI02 > dI000O01llI0) {
/* 155 */                               if (dI000O01llI03 >= 0.5d || dI000O01llI03 >= dI000O01llI04) {
/* 206 */                                   range2 = range4;
                                        }
/* 211 */                               iI000O01llI0 = I000O01llI0(range3.intersect(range2));
                                    } else if (dI000O01llI02 == dI000O01llI0) {
/* 168 */                               if (dI000O01llI03 > dI000O01llI04 || (dI000O01llI03 == dI000O01llI04 && ((Number) range4.getLower()).intValue() > ((Number) range2.getLower()).intValue())) {
/* 206 */                                   range2 = range4;
                                        }
/* 211 */                               iI000O01llI0 = I000O01llI0(range3.intersect(range2));
                                    } else {
/* 200 */                               if (dI000O01llI04 < 0.5d && dI000O01llI03 > dI000O01llI04) {
                                        }
/* 211 */                               iI000O01llI0 = I000O01llI0(range3.intersect(range2));
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
/* 216 */                       if (iI000O01llI0 == 0 && (I000II(range4, range3) < I000II(range2, range3) || (I000II(range4, range3) == I000II(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || I000O01llI0(range4) < I000O01llI0(range2))))) {
/* 273 */                           range2 = range4;
                                }
                            }
                        }
                    }
/* 408 */           return range2;
                }

                public static Size I0000oI00(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
                    Object objI00000oIO;
                    try {
/* 4 */                 if (i == 34) {
/* 6 */                     if (streamConfigurationMap != null) {
/* 10 */                        objI00000oIO = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                            }
/* 17 */                    objI00000oIO = null;
                        } else {
/* 19 */                    if (streamConfigurationMap != null) {
/* 21 */                        objI00000oIO = streamConfigurationMap.getOutputSizes(i);
                            }
/* 17 */                    objI00000oIO = null;
                        }
                    } catch (Throwable th) {
/* 26 */                objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                    }
/* 32 */            if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 34 */                objI00000oIO = null;
                    }
/* 35 */            Size[] sizeArr = (Size[]) objI00000oIO;
/* 38 */            if (sizeArr == null) {
/* 75 */                sizeArr = null;
                    } else if (rational != null) {
/* 44 */                ArrayList arrayList = new ArrayList();
/* 49 */                for (Size size : sizeArr) {
/* 57 */                    if (I1O0oI0ol.I00000oIO(rational, size)) {
/* 59 */                        arrayList.add(size);
                            }
                        }
/* 72 */                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
                    }
/* 76 */            if (sizeArr == null || sizeArr.length == 0) {
/* 3 */                 return null;
                    }
/* 84 */            IOi101 iOi101 = new IOi101(false);
/* 97 */            Size size2 = (Size) Collections.max(Arrays.asList(sizeArr), iOi101);
/* 99 */            Size size3 = Ol0ilIo.I00000oIO;
/* 101 */           if (z) {
/* 105 */               Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
/* 109 */               if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
/* 126 */                   size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), iOi101);
                        }
                    }
/* 142 */           return (Size) Collections.max(IOOi1I.I000O01llI0(size2, size3), iOi101);
                }

                public static int I000II(Range range, Range range2) {
/* 9 */             if (!range.contains((Range) range2.getUpper()) && !range.contains((Range) range2.getLower())) {
                        return ((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue() ? ((Number) range.getLower()).intValue() - ((Number) range2.getUpper()).intValue() : ((Number) range2.getLower()).intValue() - ((Number) range.getUpper()).intValue();
                    }
/* 89 */            I000II.I000iOII("Ranges must not intersect");
/* 92 */            return 0;
                }

                public static int I000O01llI0(Range range) {
/* 22 */            return (((Number) range.getUpper()).intValue() - ((Number) range.getLower()).intValue()) + 1;
                }

                public static Range I000o00OoI0I(Range range, Range range2, boolean z) {
/* 1 */             Range range3 = I1lIoOIi.I000O01llI0;
/* 7 */             if (O0000Ioio00.I0000O(range2, range3) && O0000Ioio00.I0000O(range, range3)) {
/* 15 */                return range3;
                    }
/* 20 */            if (O0000Ioio00.I0000O(range2, range3)) {
/* 22 */                return range;
                    }
/* 27 */            if (O0000Ioio00.I0000O(range, range3)) {
/* 29 */                return range2;
                    }
/* 30 */            if (z) {
/* 38 */                lII1OI11o1I.I0000oI00("All targetFrameRate should be the same if strict fps is required", O0000Ioio00.I0000O(range, range2));
/* 41 */                return range;
                    }
                    try {
/* 42 */                return range2.intersect(range);
                    } catch (IllegalArgumentException unused) {
/* 98 */                return range2;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final boolean I00000oIO(OliliiIIiil oliliiIIiil, ArrayList arrayList, Map map, List list, List list2) {
                    boolean z;
                    Integer num;
                    boolean z2;
                    String str;
                    ArrayList arrayList2;
                    boolean z3;
                    List list3;
                    boolean z4;
                    boolean z5;
                    Size size;
                    Iterator it;
                    OolOiI0I oolOiI0I;
                    Integer num2;
/* 14 */            Oooi0I oooi0I = oliliiIIiil.I0000O;
/* 16 */            boolean z6 = oliliiIIiil.I000O01llI0;
/* 18 */            LinkedHashMap linkedHashMap = this.I000l1;
/* 26 */            if (linkedHashMap.containsKey(oliliiIIiil)) {
/* 32 */                list3 = (List) linkedHashMap.get(oliliiIIiil);
/* 34 */                num = 2;
/* 36 */                z2 = z6;
/* 24 */                str = "Required value was null.";
/* 40 */                z4 = 0;
                    } else {
/* 46 */                ArrayList arrayList3 = new ArrayList();
/* 49 */                int i = oliliiIIiil.I00000oIO;
/* 51 */                if (z6) {
/* 53 */                    OllO00oiil ollO00oiil = Io11Oi.I00000oIO;
/* 57 */                    ArrayList arrayList4 = new ArrayList();
/* 64 */                    if (Build.VERSION.SDK_INT >= 35) {
/* 70 */                        z = false;
/* 70 */                        z = false;
/* 70 */                        z = false;
/* 76 */                        Object objI0000O = ((IIioli) this.I00000oIO).I0000O(CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION);
/* 80 */                        if (objI0000O == null) {
/* 129 */                           I000II.I000iOII("Required value was null.");
/* 70 */                            return false;
                                }
/* 84 */                        int iIntValue = ((Number) objI0000O).intValue();
/* 88 */                        if (iIntValue >= 35 && oooi0I != Oooi0I.I00iio) {
/* 104 */                           arrayList4.addAll((List) Io11Oi.I00000oIO.getValue());
                                }
/* 109 */                       if (iIntValue >= 36 && oooi0I != Oooi0I.I00ilI0I1) {
/* 125 */                           arrayList4.addAll((List) Io11Oi.I00000oOI.getValue());
                                }
                            } else {
/* 133 */                       z = false;
                            }
/* 135 */                   arrayList3.addAll(arrayList4);
/* 138 */                   num = 2;
/* 140 */                   z2 = z6;
/* 24 */                    str = "Required value was null.";
                        } else {
/* 146 */                   z = false;
/* 146 */                   z = false;
/* 146 */                   z = false;
/* 146 */                   z = false;
/* 146 */                   z = false;
/* 146 */                   z = false;
/* 146 */                   z3 = false;
/* 146 */                   z = false;
/* 146 */                   z = false;
/* 150 */                   if (oliliiIIiil.I0000oI00) {
/* 152 */                       ArrayList arrayList5 = this.I000o00OoI0I;
/* 158 */                       if (arrayList5.isEmpty()) {
/* 160 */                           OllO00oiil ollO00oiil2 = Io11Oi.I00000oIO;
/* 164 */                           ArrayList arrayList6 = new ArrayList();
/* 169 */                           Olill00lIoo olill00lIoo = new Olill00lIoo();
/* 172 */                           OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 174 */                           Olilol olilol = Olilol.I00iio;
/* 176 */                           Olill0O0OOIO olill0O0OOIO = Olill0O0OOIO.I00lli11;
/* 178 */                           z2 = z6;
/* 180 */                           OlOOI001 olOOI0012 = Olio00O.I0000oI00;
/* 24 */                            str = "Required value was null.";
/* 188 */                           olill00lIoo.I00000oIO(loIOiIO1O1.I000iOII(olilol, olill0O0OOIO, olOOI0012));
/* 191 */                           arrayList6.add(olill00lIoo);
/* 196 */                           Olill00lIoo olill00lIoo2 = new Olill00lIoo();
/* 201 */                           num = 2;
/* 209 */                           IlIi0I0.I00111O(olill00lIoo2, loIOiIO1O1.I000iOII(Olilol.I00iOIl, Olill0O0OOIO.I00ilO0, olOOI0012), olilol, olill0O0OOIO, olOOI0012);
/* 212 */                           arrayList6.add(olill00lIoo2);
/* 215 */                           arrayList5.addAll(arrayList6);
                                } else {
/* 219 */                           num = 2;
/* 221 */                           z2 = z6;
/* 24 */                            str = "Required value was null.";
                                }
/* 225 */                       if (i == 0) {
/* 227 */                           arrayList3.addAll(arrayList5);
                                }
                            } else {
/* 232 */                       num = 2;
/* 234 */                       z2 = z6;
/* 24 */                        str = "Required value was null.";
/* 240 */                       if (oliliiIIiil.I0001Ioi1lo) {
/* 242 */                           ArrayList arrayList7 = this.I000iOII;
/* 248 */                           if (arrayList7.isEmpty()) {
/* 250 */                               Io1iOil0oli io1iOil0oli = this.I001lloI;
/* 264 */                               if (((Boolean) io1iOil0oli.I00000oOI.getValue()).booleanValue()) {
/* 267 */                                   arrayList7.clear();
/* 277 */                                   Size size2 = (Size) io1iOil0oli.I0000Il00O.getValue();
/* 279 */                                   if (size2 != null) {
/* 283 */                                       I1lO00O00I1 i1lO00O00I1I000lI = I000lI(34);
/* 287 */                                       OllO00oiil ollO00oiil3 = Io11Oi.I00000oIO;
/* 291 */                                       ArrayList arrayList8 = new ArrayList();
/* 294 */                                       OlOOI001 olOOI0013 = Olio00O.I0000oI00;
/* 303 */                                       Olio00O olio00OI000o00OoI0I = loIOiIO1O1.I000o00OoI0I(34, size2, i1lO00O00I1I000lI, 0, OliloO1OOO.I00iiI, Olio00O.I0000oI00);
/* 309 */                                       Olill00lIoo olill00lIoo3 = new Olill00lIoo();
/* 312 */                                       olill00lIoo3.I00000oIO(olio00OI000o00OoI0I);
/* 315 */                                       arrayList8.add(olill00lIoo3);
/* 320 */                                       Olill00lIoo olill00lIoo4 = new Olill00lIoo();
/* 323 */                                       olill00lIoo4.I00000oIO(olio00OI000o00OoI0I);
/* 326 */                                       olill00lIoo4.I00000oIO(olio00OI000o00OoI0I);
/* 329 */                                       arrayList8.add(olill00lIoo4);
/* 332 */                                       arrayList7.addAll(arrayList8);
                                            }
                                        }
                                    }
/* 335 */                           arrayList3.addAll(arrayList7);
                                } else {
/* 339 */                           int i2 = oliliiIIiil.I00000oOI;
/* 343 */                           if (i2 == 8) {
/* 346 */                               if (i != 1) {
/* 348 */                                   ArrayList arrayList9 = this.I000II;
/* 351 */                                   if (i != 2) {
/* 355 */                                       if (oooi0I == Oooi0I.I00ilI0I1) {
/* 357 */                                           arrayList9 = this.I000OiO;
                                                }
/* 359 */                                       arrayList3.addAll(arrayList9);
                                            } else {
/* 365 */                                       arrayList3.addAll(this.I000OOo1O);
/* 368 */                                       arrayList3.addAll(arrayList9);
                                            }
                                        } else {
/* 372 */                                   arrayList2 = this.I0001Ioi1lo;
/* 387 */                                   linkedHashMap.put(oliliiIIiil, arrayList2);
/* 390 */                                   list3 = arrayList2;
                                            z4 = z3;
                                        }
                                    } else if (i2 == 10 && i == 0) {
/* 383 */                               arrayList3.addAll(this.I000lI);
                                    }
                                }
                            }
                        }
/* 386 */               arrayList2 = arrayList3;
                        z3 = z;
/* 387 */               linkedHashMap.put(oliliiIIiil, arrayList2);
/* 390 */               list3 = arrayList2;
                        z4 = z3;
                    }
/* 391 */           List list4 = list3;
/* 395 */           if ((list4 instanceof Collection) && list4.isEmpty()) {
/* 406 */               z5 = z4;
                    } else {
/* 409 */               Iterator it2 = list4.iterator();
/* 417 */               while (it2.hasNext()) {
/* 429 */                   if (((Olill00lIoo) it2.next()).I0000Il00O(arrayList) != null) {
/* 431 */                       z5 = true;
                                break;
                            }
                        }
/* 406 */               z5 = z4;
                    }
/* 432 */           if (!z5 || !z2) {
/* 841 */               return z5;
                    }
/* 438 */           Oilloi0llol1 oilloi0llol1 = new Oilloi0llol1();
/* 441 */           Iterator it3 = arrayList.iterator();
/* 445 */           int i3 = z4;
/* 451 */           while (it3.hasNext()) {
/* 453 */               Object next = it3.next();
/* 457 */               int i4 = i3 + 1;
/* 459 */               if (i3 < 0) {
/* 800 */                   IOOi1I.I000lI();
/* 803 */                   throw null;
                        }
/* 461 */               Olio00O olio00O = (Olio00O) next;
/* 465 */               I1lO00O00I1 i1lO00O00I1I000lI2 = I000lI(olio00O.I0000O);
/* 469 */               Map map2 = i1lO00O00I1I000lI2.I0001Ioi1lo;
/* 471 */               int i5 = olio00O.I0000O;
/* 473 */               Olill0O0OOIO olill0O0OOIO2 = olio00O.I00000oOI;
/* 475 */               int iOrdinal = olill0O0OOIO2.ordinal();
/* 482 */               if (iOrdinal != 3) {
                            switch (iOrdinal) {
                                case 9:
/* 544 */                           size = i1lO00O00I1I000lI2.I0000oI00;
                                    break;
                                case 10:
/* 541 */                           size = (Size) map2.get(Integer.valueOf(i5));
                                    break;
                                case 11:
/* 530 */                           size = (Size) map2.get(Integer.valueOf(i5));
                                    break;
                                case 12:
/* 519 */                           size = (Size) map2.get(Integer.valueOf(i5));
                                    break;
                                case 13:
/* 508 */                           size = (Size) i1lO00O00I1I000lI2.I000OOo1O.get(Integer.valueOf(i5));
                                    break;
                                case 14:
/* 494 */                           I000II.I001IO000("Not supported config size");
/* 497 */                           return z4;
                                default:
/* 487 */                           size = olill0O0OOIO2.I00iiI;
                                    break;
                            }
                        } else {
/* 547 */                   size = i1lO00O00I1I000lI2.I0000Il00O;
                        }
/* 564 */               OolIl0ii1 oolIl0ii1 = (OolIl0ii1) list.get(((Number) list2.get(i3)).intValue());
/* 568 */               Object obj = map.get(olio00O);
/* 572 */               if (obj == null) {
/* 794 */                   I000II.I000iOII(str);
/* 797 */                   return z4;
                        }
/* 574 */               Iio1oiI iio1oiI = (Iio1oiI) obj;
/* 582 */               IlIIII0 ilIIII0 = new IlIIII0(oolIl0ii1.I000o00OoI0I(), size);
/* 587 */               OolOiI0I.I00iiI.getClass();
/* 594 */               int iOrdinal2 = oolIl0ii1.I0010o().ordinal();
/* 598 */               if (iOrdinal2 != 0) {
/* 600 */                   it = it3;
/* 626 */                   oolOiI0I = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? OolOiI0I.I00ioIO : OolOiI0I.I00io1l : OolOiI0I.I00ilO0 : OolOiI0I.I00ilI0I1 : OolOiI0I.I00iiO;
                        } else {
/* 629 */                   it = it3;
/* 631 */                   oolOiI0I = OolOiI0I.I00iio;
                        }
/* 633 */               Class cls = oolOiI0I.I00iOIl;
/* 635 */               if (cls != null) {
/* 637 */                   ilIIII0.I000OiO = cls;
                        }
/* 639 */               OilliIo0l0OI oilliIo0l0OII0000O = OilliIo0l0OI.I0000O(oolIl0ii1, size);
/* 643 */               I0oiil10Ili i0oiil10Ili = oilliIo0l0OII0000O.I00000oOI;
/* 646 */               oilliIo0l0OII0000O.I00000oOI(ilIIII0, iio1oiI, -1);
/* 649 */               Range range = oliliiIIiil.I000OOo1O;
/* 657 */               if (O0000Ioio00.I0000O(range, I1lIoOIi.I000O01llI0)) {
/* 660 */                   range = null;
                        }
/* 662 */               if (range == null) {
/* 664 */                   range = Ill01oIIO0.I00000oIO;
                        }
/* 672 */               ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(IIoo00iOol0.I000O01llI0, range);
/* 677 */               if (oooi0I == Oooi0I.I00ilI0I1) {
/* 685 */                   num2 = num;
/* 687 */                   ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(OolIl0ii1.I00OIo, num2);
                        } else {
/* 691 */                   num2 = num;
/* 695 */                   if (oooi0I == Oooi0I.I00iio) {
/* 703 */                       ((OI0oiliol10O) i0oiil10Ili.I00iio).I0010I0i(OolIl0ii1.I00OOll1, num2);
                            }
                        }
/* 710 */               oilloi0llol1.I00000oIO(oilliIo0l0OII0000O.I0000Il00O());
/* 713 */               boolean zI0000Il00O = oilloi0llol1.I0000Il00O();
/* 721 */               StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
/* 724 */               sb.append(oolIl0ii1);
/* 729 */               sb.append(" with ");
/* 732 */               sb.append(olio00O);
/* 737 */               sb.append(" due to [");
/* 753 */               sb.append(!oilloi0llol1.I000lI ? "Template is not set" : oilloi0llol1.I000l1.toString());
/* 758 */               sb.append("]; surfaceConfigList = ");
/* 761 */               sb.append(arrayList);
/* 766 */               sb.append(", featureSettings = ");
/* 769 */               sb.append(oliliiIIiil);
/* 774 */               sb.append(", newUseCaseConfigs = ");
/* 777 */               sb.append(list);
/* 784 */               lII1OI11o1I.I0000oI00(sb.toString(), zI0000Il00O);
/* 787 */               i3 = i4;
/* 788 */               num = num2;
/* 790 */               it3 = it;
                    }
/* 804 */           OillooOlI oillooOlII00000oOI = oilloi0llol1.I00000oOI();
/* 810 */           boolean zI0000Il00O2 = this.I0000Il00O.I0000Il00O(oillooOlII00000oOI);
/* 820 */           Iterator it4 = oillooOlII00000oOI.I00000oOI().iterator();
/* 828 */           while (it4.hasNext()) {
/* 836 */               ((IiIO1ol1i1o0) it4.next()).I00000oIO();
                    }
/* 840 */           return zI0000Il00O2;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI() {
                    Object objI00000oIO;
                    Size sizeI000OOo1O;
/* 3 */             Size sizeI0000Il00O = this.I001iOo1i0O.I0000Il00O();
                    try {
/* 9 */                 Integer.parseInt(this.I0000O);
/* 12 */                sizeI000OOo1O = I000OOo1O();
                    } catch (NumberFormatException unused) {
                    }
/* 16 */            if (sizeI000OOo1O == null) {
/* 26 */                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.I001i1lo1io.I0000Il00O.I00iOIl;
/* 29 */                if (streamConfigurationMap != null) {
                            try {
/* 33 */                        objI00000oIO = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                            } catch (Throwable th) {
/* 39 */                        objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                            }
                        } else {
/* 44 */                    objI00000oIO = null;
                        }
/* 47 */                if (objI00000oIO instanceof Oi10Ii1i1lo) {
/* 49 */                    objI00000oIO = null;
                        }
/* 50 */                Size[] sizeArr = (Size[]) objI00000oIO;
/* 52 */                if (sizeArr == null) {
/* 54 */                    sizeI000OOo1O = null;
/* 98 */                    if (sizeI000OOo1O == null) {
/* 101 */                       sizeI000OOo1O = Ol0ilIo.I0000Il00O;
                            }
                        } else {
/* 62 */                    Arrays.sort(sizeArr, new IOi101(true));
/* 67 */                    for (Size size : sizeArr) {
/* 71 */                        int width = size.getWidth();
/* 75 */                        Size size2 = Ol0ilIo.I0000oI00;
/* 81 */                        if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
/* 93 */                            sizeI000OOo1O = size;
                                    break;
                                }
                            }
/* 54 */                    sizeI000OOo1O = null;
/* 98 */                    if (sizeI000OOo1O == null) {
                            }
                        }
                    }
/* 140 */           this.I001IO000 = I1lO00O00I1.I00000oIO(Ol0ilIo.I00000oOI, new LinkedHashMap(), sizeI0000Il00O, new LinkedHashMap(), sizeI000OOo1O, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: RuntimeException -> 0x009c, TryCatch #0 {RuntimeException -> 0x009c, blocks: (B:26:0x007a, B:28:0x0080, B:34:0x0091, B:36:0x0097), top: B:54:0x007a }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I0000O(int i, Size size, boolean z, int i2) {
                    long outputMinFrameDuration;
                    Oi00IilOloo0 oi00IilOloo0;
/* 1 */             int iIntValue = 0;
/* 2 */             if (!z) {
                        try {
/* 123 */                   oi00IilOloo0 = I000OiO().I0000Il00O;
                        } catch (RuntimeException e) {
/* 162 */                   if (l11I11lO.I0000O(5, "CXCP")) {
/* 186 */                       Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                            }
                        }
/* 127 */               if (i == 4101) {
/* 129 */                   oi00IilOloo0.getClass();
/* 143 */                   if (!(IiOoli.I00000oIO(PixelJpegRSupportedQuirk.class) != null)) {
/* 148 */                       StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) oi00IilOloo0.I00iOIl;
/* 150 */                       if (streamConfigurationMap != null) {
/* 152 */                           outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(i, size);
                                }
/* 192 */                       if (outputMinFrameDuration <= 0) {
/* 249 */                           iIntValue = (int) (1.0E9d / outputMinFrameDuration);
                                } else if (!this.I001IIilI0O) {
/* 238 */                           iIntValue = Integer.MAX_VALUE;
                                } else if (l11I11lO.I0000O(5, "CXCP")) {
/* 234 */                           Log.w("CXCP", "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + i + ", size = " + size);
                                }
                            }
/* 189 */                   outputMinFrameDuration = 0;
/* 192 */                   if (outputMinFrameDuration <= 0) {
                            }
                        }
                    } else {
/* 6 */                 if (i != 34) {
/* 110 */                   I000II.I001IO000("Check failed.");
/* 1 */                     return 0;
                        }
/* 10 */                List listI0000Il00O = this.I001lloI.I0000Il00O(size);
/* 21 */                if (listI0000Il00O.isEmpty()) {
/* 24 */                    listI0000Il00O = null;
                        }
/* 25 */                if (listI0000Il00O == null) {
/* 43 */                    l11I11lO.I0000oI00("HighSpeedResolver", "No supported high speed  fps for " + size);
                        } else {
/* 50 */                    Iterator it = listI0000Il00O.iterator();
/* 58 */                    if (!it.hasNext()) {
/* 104 */                       IoOOl0iOl1io.I00000oOI();
/* 1 */                         return 0;
                            }
/* 70 */                    Integer num = (Integer) ((Range) it.next()).getUpper();
/* 76 */                    while (it.hasNext()) {
/* 88 */                        Integer num2 = (Integer) ((Range) it.next()).getUpper();
/* 94 */                        if (num.compareTo(num2) < 0) {
/* 96 */                            num = num2;
                                }
                            }
/* 98 */                    iIntValue = num.intValue();
                        }
                    }
/* 250 */           return Math.min(i2, iIntValue);
                }

                public final List I0001Ioi1lo(OliliiIIiil oliliiIIiil, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
/* 1 */             I1ioiI i1ioiI = OlOOIoOO0OI.I00000oIO;
/* 6 */             if (oliliiIIiil.I00000oIO == 0 && oliliiIIiil.I00000oOI == 8 && !oliliiIIiil.I0001Ioi1lo) {
/* 20 */                Iterator it = this.I000O01llI0.iterator();
/* 28 */                while (it.hasNext()) {
/* 36 */                    List listI0000Il00O = ((Olill00lIoo) it.next()).I0000Il00O(arrayList);
/* 40 */                    if (listI0000Il00O != null) {
/* 42 */                        I1ioiI i1ioiI2 = OlOOIoOO0OI.I00000oIO;
/* 47 */                        int size = listI0000Il00O.size();
/* 51 */                        boolean z = false;
/* 52 */                        int i = 0;
                                while (true) {
/* 54 */                            if (i >= size) {
/* 169 */                               z = true;
                                        break;
                                    }
/* 64 */                            long j = ((Olio00O) listI0000Il00O.get(i)).I0000Il00O.I00iOIl;
/* 70 */                            boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i));
/* 74 */                            OolO01iOo0O oolO01iOo0O = OolO01iOo0O.I00ilI0I1;
/* 76 */                            if (zContainsKey) {
/* 88 */                                List list = ((I1ilio0iOl) linkedHashMap.get(Integer.valueOf(i))).I0000oI00;
/* 94 */                                if (list.size() == 1) {
/* 101 */                                   oolO01iOo0O = (OolO01iOo0O) list.get(0);
                                        }
/* 107 */                               if (!OlOOIoOO0OI.I00000oOI(oolO01iOo0O, j, list)) {
                                            break;
                                        }
/* 160 */                               i++;
                                    } else {
/* 118 */                               if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
/* 165 */                                   I000II.I000O01llI0("SurfaceConfig does not map to any use case");
/* 5 */                                     return null;
                                        }
/* 128 */                               OolIl0ii1 oolIl0ii1 = (OolIl0ii1) linkedHashMap2.get(Integer.valueOf(i));
/* 157 */                               if (!OlOOIoOO0OI.I00000oOI(oolIl0ii1.I0010o(), j, oolIl0ii1.I0010o() == oolO01iOo0O ? (List) ((OlOO1OiIIi0) oolIl0ii1).I0000O(OlOO1OiIIi0.I00iiI) : Il01100l.I00iOIl)) {
                                            break;
                                        }
/* 160 */                               i++;
                                    }
                                }
/* 174 */                       O1l110o o1l110o = new O1l110o(29);
/* 177 */                       o1l110o.I00iiI = this;
/* 179 */                       o1l110o.I00iiO = listI0000Il00O;
/* 181 */                       VarHandle.storeStoreFence();
/* 186 */                       OllO00oiil ollO00oiil = new OllO00oiil(o1l110o);
/* 189 */                       if (z && ((Boolean) ollO00oiil.getValue()).booleanValue()) {
/* 203 */                           return listI0000Il00O;
                                }
                            }
                        }
                    }
/* 5 */             return null;
                }

                public final Size I000OOo1O() {
                    I1l01l0lllO i1l01l0lllOI00000oOI;
/* 53 */            Iterator it = IOOi1I.I000O01llI0(1, 13, 10, 8, 12, 6, 5, 4).iterator();
/* 61 */            while (it.hasNext()) {
/* 69 */                int iIntValue = ((Number) it.next()).intValue();
/* 73 */                Il0IIIo1I il0IIIo1I = this.I00000oOI;
/* 79 */                if (il0IIIo1I.I00000oIO(iIntValue) && (i1l01l0lllOI00000oOI = il0IIIo1I.I00000oOI(iIntValue)) != null) {
/* 87 */                    List list = i1l01l0lllOI00000oOI.I0000O;
/* 96 */                    if (!list.isEmpty()) {
/* 103 */                       I1l01ooO i1l01ooO = (I1l01ooO) list.get(0);
/* 111 */                       return new Size(i1l01ooO.I0000oI00, i1l01ooO.I0001Ioi1lo);
                            }
                        }
                    }
/* 115 */           return null;
                }

                public final OlOIOo0 I000OiO() {
/* 1 */             CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
/* 3 */             IIlo0i0ll iIlo0i0ll = this.I00000oIO;
/* 12 */            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((IIioli) iIlo0i0ll).I0000O(key);
/* 14 */            if (streamConfigurationMap != null) {
/* 23 */                return new OlOIOo0(streamConfigurationMap, new OIl1o01(iIlo0i0ll));
                    }
/* 29 */            I000II.I000iOII("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
/* 32 */            return null;
                }

                public final ArrayList I000iOII(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
/* 3 */             ArrayList arrayList3 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                I1ilio0iOl i1ilio0iOl = (I1ilio0iOl) it.next();
/* 24 */                arrayList3.add(i1ilio0iOl.I00000oIO);
/* 38 */                linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), i1ilio0iOl);
                    }
/* 44 */            Iterator it2 = list.iterator();
/* 48 */            int i2 = 0;
/* 53 */            while (it2.hasNext()) {
/* 55 */                int i3 = i2 + 1;
/* 62 */                Size size = (Size) it2.next();
/* 78 */                OolIl0ii1 oolIl0ii1 = (OolIl0ii1) list2.get(((Number) arrayList2.get(i2)).intValue());
/* 80 */                int iI000o00OoI0I = oolIl0ii1.I000o00OoI0I();
/* 84 */                OlOOI001 olOOI001I00100o1O0lo = oolIl0ii1.I00100o1O0lo();
/* 88 */                OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 108 */               arrayList3.add(loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I, size, I000lI(iI000o00OoI0I), i, z ? OliloO1OOO.I00iOIl : OliloO1OOO.I00iiI, olOOI001I00100o1O0lo));
/* 123 */               linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), oolIl0ii1);
/* 126 */               i2 = i3;
                    }
/* 1750 */          return arrayList3;
                }

                public final I1lO00O00I1 I000l1() {
/* 1 */             I1lO00O00I1 i1lO00O00I1 = this.I001IO000;
/* 3 */             if (i1lO00O00I1 != null) {
/* 5 */                 return i1lO00O00I1;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("surfaceSizeDefinition");
/* 20 */            throw null;
                }

                public final I1lO00O00I1 I000lI(int i) {
                    Size sizeI0000oI00;
/* 1 */             Integer numValueOf = Integer.valueOf(i);
/* 5 */             ArrayList arrayList = this.I001i1O0Ol;
/* 11 */            if (!arrayList.contains(numValueOf)) {
/* 21 */                I00100o1O0lo(I000l1().I00000oOI, Ol0ilIo.I0000O, i);
/* 32 */                I00100o1O0lo(I000l1().I0000O, Ol0ilIo.I0001Ioi1lo, i);
/* 42 */                I00100l0(I000l1().I0001Ioi1lo, i, null);
/* 53 */                I00100l0(I000l1().I000II, i, I1O0oI0ol.I00000oIO);
/* 64 */                I00100l0(I000l1().I000O01llI0, i, I1O0oI0ol.I0000Il00O);
/* 71 */                Map map = I000l1().I000OOo1O;
/* 75 */                if (this.I0010o) {
/* 88 */                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((IIioli) this.I00000oIO).I0000O(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION);
/* 90 */                    if (streamConfigurationMap != null && (sizeI0000oI00 = I0000oI00(streamConfigurationMap, i, true, null)) != null) {
/* 104 */                       map.put(Integer.valueOf(i), sizeI0000oI00);
                            }
                        }
/* 111 */               arrayList.add(Integer.valueOf(i));
                    }
/* 114 */           return I000l1();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:208:0x05eb A[PHI: r9 r22 r26
                  0x05eb: PHI (r9v10 int) = (r9v9 int), (r9v9 int), (r9v15 int), (r9v16 int) binds: [B:196:0x05c1, B:198:0x05cd, B:204:0x05da, B:207:0x05e6] A[DONT_GENERATE, DONT_INLINE]
                  0x05eb: PHI (r22v4 boolean) = (r22v3 boolean), (r22v3 boolean), (r22v3 boolean), (r22v5 boolean) binds: [B:196:0x05c1, B:198:0x05cd, B:204:0x05da, B:207:0x05e6] A[DONT_GENERATE, DONT_INLINE]
                  0x05eb: PHI (r26v3 java.util.List) = (r26v2 java.util.List), (r26v2 java.util.List), (r26v5 java.util.List), (r26v6 java.util.List) binds: [B:196:0x05c1, B:198:0x05cd, B:204:0x05da, B:207:0x05e6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:225:0x0635  */
                /* JADX WARN: Removed duplicated region for block: B:303:0x081b  */
                /* JADX WARN: Removed duplicated region for block: B:311:0x0834  */
                /* JADX WARN: Removed duplicated region for block: B:342:0x08bf  */
                /* JADX WARN: Removed duplicated region for block: B:359:0x08ff  */
                /* JADX WARN: Removed duplicated region for block: B:385:0x099f  */
                /* JADX WARN: Removed duplicated region for block: B:387:0x09ac  */
                /* JADX WARN: Type inference failed for: r37v0 */
                /* JADX WARN: Type inference failed for: r37v1, types: [int] */
                /* JADX WARN: Type inference failed for: r37v10 */
                /* JADX WARN: Type inference failed for: r37v9 */
                /* JADX WARN: Type inference failed for: r4v51, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v52 */
                /* JADX WARN: Type inference failed for: r4v53 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oll0IO000Ii I000oI1ioi(OliliiIIiil oliliiIIiil, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
                    String str;
                    boolean z;
                    String str2;
                    IIlo0i0ll iIlo0i0ll;
                    LinkedHashMap linkedHashMap2;
                    boolean z2;
                    ArrayList arrayList3;
                    boolean z3;
                    OliliiIIiil oliliiIIiil2;
                    LinkedHashMap linkedHashMap3;
                    LinkedHashMap linkedHashMap4;
                    List listI0001Ioi1lo;
                    ArrayList arrayList4;
                    List list2;
                    LinkedHashMap linkedHashMap5;
                    LinkedHashMap linkedHashMap6;
                    IIlo0i0ll iIlo0i0ll2;
                    ?? r37;
                    Io1iOil0oli io1iOil0oli;
                    String str3;
                    String str4;
                    List<OolIl0ii1> list3;
                    LinkedHashMap linkedHashMap7;
                    List list4;
                    List list5;
                    Olili0011II olili0011II;
                    Iterator it;
                    Iterator it2;
                    long[] jArr;
                    int size;
                    int i;
                    LinkedHashMap linkedHashMap8;
                    boolean z4;
                    boolean z5;
                    Iterator it3;
                    int i2;
                    Iio1oiI iio1oiI;
                    ?? arrayList5;
                    Size size2;
                    ArrayList<Size> arrayList6;
                    Size sizeI00000oOI;
/* 3 */             OliliiIIiil oliliiIIiil3 = oliliiIIiil;
/* 7 */             Map map2 = map;
/* 11 */            boolean z6 = oliliiIIiil3.I0001Ioi1lo;
/* 14 */            String str5 = "CXCP";
/* 20 */            if (l11I11lO.I0000O(3, "CXCP")) {
/* 22 */                Objects.toString(oliliiIIiil3);
                    }
/* 25 */            boolean z7 = oliliiIIiil3.I000II;
/* 27 */            Range range = oliliiIIiil3.I000OOo1O;
/* 29 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 31 */            String str6 = ". New configs: ";
/* 33 */            String str7 = this.I0000O;
/* 35 */            String str8 = "No supported surface combination is found for camera device - Id : ";
/* 40 */            if (z7) {
/* 238 */               str = str7;
/* 239 */               z = z7;
/* 35 */                str2 = "No supported surface combination is found for camera device - Id : ";
                    } else {
/* 46 */                ArrayList arrayList7 = new ArrayList();
/* 49 */                Iterator it4 = arrayList.iterator();
/* 57 */                while (it4.hasNext()) {
/* 69 */                    arrayList7.add(((I1ilio0iOl) it4.next()).I00000oIO);
                        }
/* 75 */                IOi101 iOi101 = new IOi101(false);
/* 90 */                for (OolIl0ii1 oolIl0ii1 : map2.keySet()) {
/* 106 */                   String str9 = str8;
/* 104 */                   List list6 = (List) map2.get(oolIl0ii1);
/* 112 */                   if (list6 == null || list6.isEmpty()) {
/* 165 */                       IoOOl0iOl1io.I000O01llI0("No available output size is found for ", 46, oolIl0ii1);
/* 37 */                        return null;
                            }
/* 126 */                   Size size3 = (Size) Collections.min(list6, iOi101);
/* 128 */                   int iI000o00OoI0I = oolIl0ii1.I000o00OoI0I();
/* 132 */                   OlOOI001 olOOI001I00100o1O0lo = oolIl0ii1.I00100o1O0lo();
/* 136 */                   OlOOI001 olOOI001 = Olio00O.I0000oI00;
/* 154 */                   arrayList7.add(loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I, size3, I000lI(iI000o00OoI0I), oliliiIIiil3.I00000oIO, OliloO1OOO.I00iiI, olOOI001I00100o1O0lo));
/* 157 */                   str8 = str9;
                        }
/* 176 */               str = str7;
/* 180 */               z = z7;
/* 182 */               str2 = str8;
/* 188 */               if (!I00000oIO(oliliiIIiil3, arrayList7, Il011I1OiO0I.I00iOIl, il01100l, il01100l)) {
/* 237 */                   throw new IllegalArgumentException((str2 + str + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + ". New configs: " + list + ". GroupableFeature settings: " + oliliiIIiil3 + '.').toString());
                        }
                    }
/* 246 */           LinkedHashMap linkedHashMap9 = new LinkedHashMap();
/* 253 */           Iterator it5 = map2.keySet().iterator();
                    Map map3 = map2;
/* 261 */           while (it5.hasNext()) {
/* 267 */               OolIl0ii1 oolIl0ii12 = (OolIl0ii1) it5.next();
/* 271 */               ArrayList arrayList8 = new ArrayList();
/* 274 */               Iterator it6 = it5;
/* 278 */               LinkedHashMap linkedHashMap10 = new LinkedHashMap();
/* 295 */               for (Size size4 : (List) map3.get(oolIl0ii12)) {
/* 301 */                   Il01100l il01100l2 = il01100l;
/* 307 */                   int iI000o00OoI0I2 = oolIl0ii12.I000o00OoI0I();
/* 311 */                   int iI001i1O0Ol = oolIl0ii12.I001i1O0Ol(size4);
/* 315 */                   OlOOI001 olOOI001I00100o1O0lo2 = oolIl0ii12.I00100o1O0lo();
/* 319 */                   OlOOI001 olOOI0012 = Olio00O.I0000oI00;
/* 349 */                   String str10 = str6;
/* 355 */                   Olill0O0OOIO olill0O0OOIO = loIOiIO1O1.I000o00OoI0I(iI000o00OoI0I2, size4, I000lI(iI000o00OoI0I2), oliliiIIiil3.I00000oIO, oliliiIIiil3.I000O01llI0 ? OliloO1OOO.I00iOIl : OliloO1OOO.I00iiI, olOOI001I00100o1O0lo2).I00000oOI;
/* 357 */                   String str11 = str;
/* 359 */                   Range range2 = I1lIoOIi.I000O01llI0;
/* 371 */                   int iI0000O = O0000Ioio00.I0000O(range, range2) ? Integer.MAX_VALUE : I0000O(iI000o00OoI0I2, size4, z6, iI001i1O0Ol);
/* 375 */                   if (!z || (olill0O0OOIO != Olill0O0OOIO.I00o101lO && (O0000Ioio00.I0000O(range, range2) || iI0000O >= ((Number) range.getUpper()).intValue()))) {
/* 404 */                       Set linkedHashSet = (Set) linkedHashMap10.get(olill0O0OOIO);
/* 406 */                       if (linkedHashSet == null) {
/* 410 */                           linkedHashSet = new LinkedHashSet();
/* 413 */                           linkedHashMap10.put(olill0O0OOIO, linkedHashSet);
                                }
/* 424 */                       if (!linkedHashSet.contains(Integer.valueOf(iI0000O))) {
/* 426 */                           arrayList8.add(size4);
/* 433 */                           linkedHashSet.add(Integer.valueOf(iI0000O));
                                }
                            }
/* 440 */                   str6 = str10;
/* 442 */                   str = str11;
/* 444 */                   il01100l = il01100l2;
                        }
/* 454 */               linkedHashMap9.put(oolIl0ii12, arrayList8);
/* 459 */               map3 = map;
/* 461 */               it5 = it6;
                    }
/* 467 */           Il01100l il01100l3 = il01100l;
/* 469 */           String str12 = str;
/* 471 */           String str13 = str6;
/* 475 */           ArrayList arrayList9 = new ArrayList();
/* 478 */           Iterator it7 = arrayList2.iterator();
                    while (true) {
/* 482 */               boolean zHasNext = it7.hasNext();
/* 486 */               iIlo0i0ll = this.I00000oIO;
/* 488 */               if (!zHasNext) {
                            break;
                        }
/* 496 */               int iIntValue = ((Number) it7.next()).intValue();
/* 508 */               List<Size> list7 = (List) linkedHashMap9.get(list.get(iIntValue));
/* 516 */               int iI000o00OoI0I3 = ((OolIl0ii1) list.get(iIntValue)).I000o00OoI0I();
/* 522 */               this.I001lIiIIo1O.getClass();
/* 591 */               Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) IiOoli.I00000oIO(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new IIo0OlO(iIlo0i0ll, this.I001i1lo1io).I00000oIO().I00000oOI(AspectRatioLegacyApi21Quirk.class)) == null) || (size2 = (Size) I000lI(Barcode.FORMAT_QR_CODE).I0001Ioi1lo.get(Integer.valueOf(Barcode.FORMAT_QR_CODE))) == null) ? null : new Rational(size2.getWidth(), size2.getHeight());
/* 593 */               if (rational == null) {
/* 599 */                   arrayList6 = new ArrayList(list7);
                        } else {
/* 605 */                   ArrayList arrayList10 = new ArrayList();
/* 610 */                   ArrayList arrayList11 = new ArrayList();
/* 621 */                   for (Size size5 : list7) {
/* 633 */                       if (I1O0oI0ol.I00000oIO(rational, size5)) {
/* 635 */                           arrayList10.add(size5);
                                } else {
/* 639 */                           arrayList11.add(size5);
                                }
                            }
/* 644 */                   arrayList11.addAll(0, arrayList10);
/* 647 */                   arrayList6 = arrayList11;
                        }
/* 648 */               OlOOI001 olOOI0013 = Olio00O.I0000oI00;
/* 660 */               Olilol olilol = (Olilol) Olio00O.I000O01llI0.get(Integer.valueOf(iI000o00OoI0I3));
/* 662 */               if (olilol == null) {
/* 664 */                   olilol = Olilol.I00iOIl;
                        }
/* 672 */               if (((ExtraCroppingQuirk) this.I001l0I00.I00iiI) != null && (sizeI00000oOI = ExtraCroppingQuirk.I00000oOI(olilol)) != null) {
/* 684 */                   ArrayList arrayList12 = new ArrayList();
/* 687 */                   arrayList12.add(sizeI00000oOI);
/* 698 */                   for (Size size6 : arrayList6) {
/* 710 */                       if (!O0000Ioio00.I0000O(size6, sizeI00000oOI)) {
/* 712 */                           arrayList12.add(size6);
                                }
                            }
/* 716 */                   arrayList6 = arrayList12;
                        }
/* 717 */               arrayList9.add(arrayList6);
                    }
/* 724 */           LinkedHashMap linkedHashMap11 = new LinkedHashMap();
/* 729 */           LinkedHashMap linkedHashMap12 = new LinkedHashMap();
/* 732 */           Io1iOil0oli io1iOil0oli2 = this.I001lloI;
/* 734 */           if (z6) {
/* 736 */               io1iOil0oli2.getClass();
/* 743 */               if (arrayList9.isEmpty()) {
/* 745 */                   arrayList5 = il01100l3;
                        } else {
/* 752 */                   List listI00000oIO = Io1iOil0oli.I00000oIO(arrayList9);
/* 766 */                   arrayList5 = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 769 */                   Iterator it8 = listI00000oIO.iterator();
/* 777 */                   while (it8.hasNext()) {
/* 783 */                       Size size7 = (Size) it8.next();
/* 787 */                       int size8 = arrayList9.size();
/* 791 */                       Iterator it9 = it8;
/* 795 */                       ArrayList arrayList13 = new ArrayList(size8);
/* 798 */                       LinkedHashMap linkedHashMap13 = linkedHashMap11;
/* 801 */                       for (int i3 = 0; i3 < size8; i3++) {
/* 803 */                           arrayList13.add(size7);
                                }
/* 809 */                       arrayList5.add(arrayList13);
/* 812 */                       it8 = it9;
/* 814 */                       linkedHashMap11 = linkedHashMap13;
                            }
                        }
/* 747 */               linkedHashMap2 = linkedHashMap11;
/* 749 */               z2 = true;
/* 817 */               arrayList3 = arrayList5;
                    } else {
/* 821 */               linkedHashMap2 = linkedHashMap11;
/* 823 */               z2 = true;
/* 825 */               Iterator it10 = arrayList9.iterator();
/* 829 */               int size9 = 1;
/* 835 */               while (it10.hasNext()) {
/* 847 */                   size9 *= ((List) it10.next()).size();
                        }
/* 849 */               if (size9 == 0) {
/* 2709 */                  I000II.I000iOII("Failed to find supported resolutions.");
/* 37 */                    return null;
                        }
/* 853 */               ArrayList arrayList14 = new ArrayList();
/* 857 */               for (int i4 = 0; i4 < size9; i4++) {
/* 864 */                   arrayList14.add(new ArrayList());
                        }
/* 881 */               int size10 = size9 / ((List) arrayList9.get(0)).size();
/* 883 */               int size11 = arrayList9.size();
/* 887 */               int i5 = size9;
/* 889 */               int i6 = 0;
/* 890 */               while (i6 < size11) {
/* 896 */                   int i7 = size10;
/* 900 */                   List list8 = (List) arrayList9.get(i6);
/* 902 */                   int i8 = size11;
/* 904 */                   int i9 = 0;
/* 905 */                   while (i9 < size9) {
/* 927 */                       ((List) arrayList14.get(i9)).add(list8.get((i9 % i5) / i7));
/* 930 */                       i9++;
/* 932 */                       arrayList14 = arrayList14;
/* 934 */                       size9 = size9;
                            }
/* 937 */                   ArrayList arrayList15 = arrayList14;
/* 939 */                   int i10 = size9;
/* 947 */                   if (i6 < arrayList9.size() - 1) {
/* 961 */                       size10 = i7 / ((List) arrayList9.get(i6 + 1)).size();
/* 963 */                       i5 = i7;
                            } else {
/* 966 */                       size10 = i7;
                            }
/* 968 */                   i6++;
/* 970 */                   size11 = i8;
/* 972 */                   arrayList14 = arrayList15;
/* 974 */                   size9 = i10;
                        }
/* 977 */               arrayList3 = arrayList14;
                    }
/* 979 */           I1ioiI i1ioiI = OlOOIoOO0OI.I00000oIO;
/* 981 */           Iterator it11 = arrayList.iterator();
                    while (true) {
/* 989 */               if (it11.hasNext()) {
/* 995 */                   I1ilio0iOl i1ilio0iOl = (I1ilio0iOl) it11.next();
/* 1012 */                  if (OlOOIoOO0OI.I0000Il00O(i1ilio0iOl.I0001Ioi1lo, (OolO01iOo0O) i1ilio0iOl.I0000oI00.get(0))) {
                                break;
                            }
                        } else {
/* 1018 */                  Iterator it12 = list.iterator();
/* 1026 */                  while (it12.hasNext()) {
/* 1032 */                      OolIl0ii1 oolIl0ii13 = (OolIl0ii1) it12.next();
/* 1042 */                      if (OlOOIoOO0OI.I0000Il00O(oolIl0ii13, oolIl0ii13.I0010o())) {
                                }
                            }
/* 1045 */                  z3 = false;
                        }
                    }
/* 1014 */          z3 = z2;
/* 1048 */          if (!this.I0010I0i || z3) {
/* 1127 */              oliliiIIiil2 = oliliiIIiil3;
/* 1128 */              linkedHashMap3 = linkedHashMap12;
/* 1129 */              linkedHashMap4 = linkedHashMap2;
/* 1131 */              listI0001Ioi1lo = null;
                    } else {
/* 1052 */              Iterator it13 = arrayList3.iterator();
/* 1056 */              listI0001Ioi1lo = null;
                        while (true) {
/* 1062 */                  if (!it13.hasNext()) {
/* 1112 */                      oliliiIIiil2 = oliliiIIiil3;
/* 1113 */                      linkedHashMap3 = linkedHashMap12;
/* 1114 */                      linkedHashMap4 = linkedHashMap2;
                                break;
                            }
/* 1071 */                  OliliiIIiil oliliiIIiil4 = oliliiIIiil3;
/* 1079 */                  oliliiIIiil2 = oliliiIIiil4;
/* 1080 */                  LinkedHashMap linkedHashMap14 = linkedHashMap2;
/* 1088 */                  linkedHashMap4 = linkedHashMap14;
/* 1089 */                  linkedHashMap3 = linkedHashMap12;
/* 1090 */                  listI0001Ioi1lo = I0001Ioi1lo(oliliiIIiil2, I000iOII(oliliiIIiil4.I00000oIO, arrayList, (List) it13.next(), list, arrayList2, linkedHashMap14, linkedHashMap12, false), linkedHashMap4, linkedHashMap3);
/* 1094 */                  if (listI0001Ioi1lo != null) {
                                break;
                            }
/* 1098 */                  linkedHashMap4.clear();
/* 1101 */                  linkedHashMap3.clear();
/* 1106 */                  linkedHashMap2 = linkedHashMap4;
/* 1108 */                  linkedHashMap12 = linkedHashMap3;
/* 1109 */                  oliliiIIiil3 = oliliiIIiil2;
                        }
/* 1121 */              if (l11I11lO.I0000O(3, "CXCP")) {
/* 1123 */                  Objects.toString(listI0001Ioi1lo);
                        }
                    }
/* 1133 */          Iterator it14 = arrayList.iterator();
/* 1137 */          int iMin = Integer.MAX_VALUE;
/* 1144 */          while (it14.hasNext()) {
/* 1150 */              I1ilio0iOl i1ilio0iOl2 = (I1ilio0iOl) it14.next();
/* 1162 */              iMin = Math.min(iMin, I0000O(i1ilio0iOl2.I00000oOI, i1ilio0iOl2.I0000Il00O, z6, i1ilio0iOl2.I000OiO));
                    }
/* 1167 */          Iterator it15 = arrayList3.iterator();
/* 1171 */          List list9 = null;
/* 1173 */          List list10 = null;
/* 1175 */          int i11 = Integer.MAX_VALUE;
/* 1178 */          int i12 = Integer.MAX_VALUE;
/* 1181 */          boolean z8 = false;
/* 1183 */          boolean z9 = false;
                    while (true) {
/* 1191 */              if (!it15.hasNext()) {
/* 1593 */                  arrayList4 = arrayList2;
/* 1595 */                  list2 = listI0001Ioi1lo;
/* 1597 */                  linkedHashMap5 = linkedHashMap4;
/* 1599 */                  linkedHashMap6 = linkedHashMap3;
/* 1601 */                  iIlo0i0ll2 = iIlo0i0ll;
/* 1603 */                  r37 = z6;
/* 1605 */                  io1iOil0oli = io1iOil0oli2;
/* 1607 */                  str3 = str5;
/* 1609 */                  str4 = str2;
/* 1611 */                  list3 = list;
/* 1613 */                  linkedHashMap7 = linkedHashMap;
/* 1617 */                  list4 = list9;
/* 1619 */                  list5 = list10;
                            break;
                        }
/* 1197 */              List<Size> list11 = (List) it15.next();
/* 1199 */              int i13 = i12;
/* 1202 */              LinkedHashMap linkedHashMap15 = new LinkedHashMap();
/* 1210 */              LinkedHashMap linkedHashMap16 = new LinkedHashMap();
/* 1221 */              linkedHashMap6 = linkedHashMap3;
/* 1223 */              iIlo0i0ll2 = iIlo0i0ll;
/* 1225 */              linkedHashMap5 = linkedHashMap4;
/* 1227 */              int i14 = i11;
/* 1229 */              list3 = list;
/* 1231 */              io1iOil0oli = io1iOil0oli2;
/* 1233 */              str4 = str2;
/* 1237 */              list2 = listI0001Ioi1lo;
/* 1239 */              int i15 = iMin;
/* 1242 */              arrayList4 = arrayList2;
/* 1244 */              ArrayList arrayListI000iOII = I000iOII(oliliiIIiil2.I00000oIO, arrayList, list11, list3, arrayList4, linkedHashMap15, linkedHashMap16, oliliiIIiil2.I000O01llI0);
/* 1259 */              int iMin2 = i15;
/* 1260 */              int i16 = 0;
/* 1265 */              for (Size size12 : list11) {
/* 1267 */                  int i17 = i16 + 1;
/* 1291 */                  OolIl0ii1 oolIl0ii14 = (OolIl0ii1) list3.get(((Number) arrayList4.get(i16)).intValue());
/* 1307 */                  iMin2 = Math.min(iMin2, I0000O(oolIl0ii14.I000o00OoI0I(), size12, z6, oolIl0ii14.I001i1O0Ol(size12)));
/* 1311 */                  i16 = i17;
/* 1313 */                  str5 = str5;
                        }
/* 1316 */              str3 = str5;
/* 1342 */              boolean z10 = (O0000Ioio00.I0000O(range, I1lIoOIi.I000O01llI0) || iMin2 >= i15 || iMin2 >= ((Number) range.getUpper()).intValue()) ? z2 : false;
/* 1346 */              LinkedHashMap linkedHashMap17 = new LinkedHashMap();
/* 1349 */              Iterator it16 = arrayListI000iOII.iterator();
/* 1353 */              int i18 = 0;
/* 1359 */              while (it16.hasNext()) {
/* 1361 */                  Object next = it16.next();
/* 1365 */                  int i19 = i18 + 1;
/* 1367 */                  if (i18 < 0) {
/* 1435 */                      IOOi1I.I000lI();
/* 1438 */                      throw null;
                            }
/* 1369 */                  boolean z11 = z10;
/* 1373 */                  Olio00O olio00O = (Olio00O) next;
/* 1375 */                  boolean z12 = z6;
/* 1385 */                  I1ilio0iOl i1ilio0iOl3 = (I1ilio0iOl) linkedHashMap15.get(Integer.valueOf(i18));
/* 1387 */                  if (i1ilio0iOl3 == null || (iio1oiI = i1ilio0iOl3.I0000O) == null) {
/* 1403 */                      Object obj = linkedHashMap16.get(Integer.valueOf(i18));
/* 1407 */                      i2 = i15;
/* 1411 */                      Object obj2 = linkedHashMap.get(obj);
/* 1415 */                      if (obj2 == null) {
/* 1431 */                          I000II.I000iOII("Required value was null.");
/* 37 */                            return null;
                                }
/* 1417 */                      iio1oiI = (Iio1oiI) obj2;
                            } else {
/* 1394 */                      i2 = i15;
                            }
/* 1419 */                  linkedHashMap17.put(olio00O, iio1oiI);
/* 1422 */                  i15 = i2;
/* 1424 */                  z6 = z12;
/* 1426 */                  i18 = i19;
/* 1428 */                  z10 = z11;
                        }
/* 1439 */              boolean z13 = z10;
/* 1441 */              boolean z14 = z6;
/* 1443 */              int i20 = i15;
/* 1445 */              linkedHashMap7 = linkedHashMap;
/* 1447 */              O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 1452 */              I0iI0llll1 i0iI0llll1 = new I0iI0llll1(6);
/* 1455 */              i0iI0llll1.I00ilI0I1 = this;
/* 1457 */              i0iI0llll1.I00ilO0 = oliliiIIiil2;
/* 1459 */              i0iI0llll1.I00io1l = arrayListI000iOII;
/* 1461 */              i0iI0llll1.I00iiI = linkedHashMap17;
/* 1463 */              i0iI0llll1.I00iiO = list3;
/* 1465 */              i0iI0llll1.I00iio = arrayList4;
/* 1467 */              VarHandle.storeStoreFence();
/* 1470 */              O0ioIllo0i1 o0ioIllo0i1I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, i0iI0llll1);
/* 1474 */              if (z8 || !((Boolean) o0ioIllo0i1I00000oIO.getValue()).booleanValue()) {
/* 1516 */                  if (list2 != null || z9 || I0001Ioi1lo(oliliiIIiil2, arrayListI000iOII, linkedHashMap15, linkedHashMap16) == null) {
/* 1590 */                      i11 = i14;
/* 1591 */                      i12 = i13;
                            } else {
/* 1529 */                      if (i13 != Integer.MAX_VALUE && i13 >= iMin2) {
/* 1538 */                          i12 = i13;
                                } else {
/* 1534 */                          i12 = iMin2;
/* 1535 */                          list10 = list11;
                                }
/* 1539 */                      if (!z13) {
/* 1576 */                          i11 = i14;
                                } else {
/* 1541 */                          if (z8) {
/* 1543 */                              i12 = iMin2;
/* 1544 */                              i11 = i14;
/* 1545 */                              list4 = list9;
/* 1547 */                              list5 = list11;
                                        r37 = z14;
                                        break;
                                    }
/* 1550 */                          z9 = z2;
/* 1552 */                          i12 = iMin2;
/* 1553 */                          i11 = i14;
/* 1554 */                          str2 = str4;
/* 1556 */                          io1iOil0oli2 = io1iOil0oli;
/* 1558 */                          listI0001Ioi1lo = list2;
/* 1560 */                          iIlo0i0ll = iIlo0i0ll2;
/* 1562 */                          linkedHashMap4 = linkedHashMap5;
/* 1564 */                          linkedHashMap3 = linkedHashMap6;
/* 1566 */                          list10 = list11;
/* 1568 */                          iMin = i20;
/* 1570 */                          z6 = z14 ? 1 : 0;
/* 1572 */                          str5 = str3;
                                }
                            }
/* 1577 */                  str2 = str4;
/* 1579 */                  io1iOil0oli2 = io1iOil0oli;
/* 1581 */                  listI0001Ioi1lo = list2;
/* 1583 */                  iIlo0i0ll = iIlo0i0ll2;
/* 1585 */                  linkedHashMap4 = linkedHashMap5;
/* 1587 */                  linkedHashMap3 = linkedHashMap6;
/* 1568 */                  iMin = i20;
/* 1570 */                  z6 = z14 ? 1 : 0;
/* 1572 */                  str5 = str3;
                        } else {
/* 1491 */                  if (i14 == Integer.MAX_VALUE || i14 < iMin2) {
/* 1496 */                      i14 = iMin2;
/* 1497 */                      list9 = list11;
                            }
/* 1499 */                  if (z13) {
/* 1501 */                      if (z9) {
/* 1503 */                          i11 = iMin2;
/* 1504 */                          i12 = i13;
/* 1505 */                          list5 = list10;
/* 1507 */                          list4 = list11;
                                    r37 = z14;
                                    break;
                                }
/* 1511 */                      z8 = z2;
/* 1513 */                      i14 = iMin2;
/* 1514 */                      list9 = list11;
/* 1516 */                      if (list2 != null) {
/* 1590 */                          i11 = i14;
/* 1591 */                          i12 = i13;
/* 1577 */                          str2 = str4;
/* 1579 */                          io1iOil0oli2 = io1iOil0oli;
/* 1581 */                          listI0001Ioi1lo = list2;
/* 1583 */                          iIlo0i0ll = iIlo0i0ll2;
/* 1585 */                          linkedHashMap4 = linkedHashMap5;
/* 1587 */                          linkedHashMap3 = linkedHashMap6;
                                }
/* 1568 */                      iMin = i20;
/* 1570 */                      z6 = z14 ? 1 : 0;
/* 1572 */                      str5 = str3;
                            }
                        }
                    }
/* 1621 */          if (list4 != null && (!z || O0000Ioio00.I0000O(range, I1lIoOIi.I000O01llI0) || (i11 != Integer.MAX_VALUE && i11 >= ((Number) range.getUpper()).intValue()))) {
/* 1656 */              olili0011II = new Olili0011II();
/* 1659 */              olili0011II.I00000oIO = list4;
/* 1661 */              olili0011II.I00000oOI = list5;
/* 1663 */              olili0011II.I0000Il00O = i11;
/* 1665 */              olili0011II.I0000O = i12;
/* 1670 */              olili0011II.I0000oI00 = Integer.MAX_VALUE;
/* 1672 */              VarHandle.storeStoreFence();
                    } else {
/* 1623 */              olili0011II = null;
                    }
/* 1675 */          if (olili0011II == null) {
/* 2661 */              StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O(str4, str12, " and Hardware level: ");
/* 2667 */              sbI001IIilI0O.append(this.I0000oI00);
/* 2672 */              sbI001IIilI0O.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
/* 2677 */              sbI001IIilI0O.append(arrayList);
/* 2682 */              sbI001IIilI0O.append(str13);
/* 2685 */              sbI001IIilI0O.append(list3);
/* 2690 */              sbI001IIilI0O.append('.');
/* 2706 */              throw new IllegalArgumentException(sbI001IIilI0O.toString().toString());
                    }
/* 1677 */          int i21 = olili0011II.I0000Il00O;
/* 1679 */          List list12 = olili0011II.I00000oIO;
/* 1688 */          if (l11I11lO.I0000O(3, str3)) {
/* 1690 */              Objects.toString(olili0011II);
                    }
/* 1695 */          LinkedHashMap linkedHashMap18 = new LinkedHashMap();
/* 1698 */          Range rangeI0000Il00O = I1lIoOIi.I000O01llI0;
/* 1704 */          if (O0000Ioio00.I0000O(range, rangeI0000Il00O)) {
/* 1802 */              Io1iOil0oli io1iOil0oli3 = io1iOil0oli;
/* 1804 */              if (r37 != 0) {
/* 1812 */                  rangeI0000Il00O = I0000Il00O(Io1iOil0oli.I0001Ioi1lo, i21, io1iOil0oli3.I00000oOI(list12));
                        }
                    } else {
/* 1725 */              Range[] rangeArrI00000oOI = r37 != 0 ? io1iOil0oli.I00000oOI(list12) : (Range[]) ((IIioli) iIlo0i0ll2).I0000O(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
/* 1727 */              Range rangeI0000Il00O2 = I0000Il00O(range, i21, rangeArrI00000oOI);
/* 1731 */              if ((z || oliliiIIiil2.I000OiO) && !rangeI0000Il00O2.equals(range)) {
/* 1749 */                  StringBuilder sb = new StringBuilder("Target FPS range ");
/* 1752 */                  sb.append(range);
/* 1757 */                  sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
/* 1760 */                  sb.append(i21);
/* 1765 */                  sb.append(". Calculated best FPS range for device: ");
/* 1768 */                  sb.append(rangeI0000Il00O2);
/* 1771 */                  String string = Arrays.toString(rangeArrI00000oOI);
/* 1777 */                  sb.append(". Device supported FPS ranges: ");
/* 1780 */                  sb.append(string);
/* 1785 */                  sb.append('.');
/* 1801 */                  throw new IllegalArgumentException(sb.toString().toString());
                        }
/* 1743 */              rangeI0000Il00O = rangeI0000Il00O2;
                    }
/* 1822 */          int i22 = 0;
/* 1829 */          for (OolIl0ii1 oolIl0ii15 : list3) {
/* 1831 */              int i23 = i22 + 1;
/* 1853 */              IOiOol0 iOiOol0I00000oIO = I1lIoOIi.I00000oIO((Size) list12.get(arrayList4.indexOf(Integer.valueOf(i22))));
/* 1861 */              iOiOol0I00000oIO.I00ilI0I1 = Integer.valueOf((int) r37);
/* 1863 */              Object obj3 = linkedHashMap7.get(oolIl0ii15);
/* 1867 */              if (obj3 == null) {
/* 1983 */                  I000II.I001IO000("Required value was null.");
/* 37 */                    return null;
                        }
/* 1871 */              iOiOol0I00000oIO.I00iio = (Iio1oiI) obj3;
/* 1873 */              I1ioiI i1ioiI2 = OlOOIoOO0OI.I00000oIO;
/* 1875 */              OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 1879 */              I1ioiI i1ioiI3 = IIl0oI.I00l0I0l0lO1;
/* 1885 */              if (oolIl0ii15.I000O01llI0(i1ioiI3)) {
/* 1891 */                  oI0oiliol10OI000OOo1O.I0010I0i(i1ioiI3, oolIl0ii15.I0000O(i1ioiI3));
                        }
/* 1894 */              I1ioiI i1ioiI4 = OolIl0ii1.I00OI1;
/* 1900 */              if (oolIl0ii15.I000O01llI0(i1ioiI4)) {
/* 1906 */                  oI0oiliol10OI000OOo1O.I0010I0i(i1ioiI4, oolIl0ii15.I0000O(i1ioiI4));
                        }
/* 1909 */              I1ioiI i1ioiI5 = Ioi1iI0IiOl.I00iiI;
/* 1915 */              if (oolIl0ii15.I000O01llI0(i1ioiI5)) {
/* 1921 */                  oI0oiliol10OI000OOo1O.I0010I0i(i1ioiI5, oolIl0ii15.I0000O(i1ioiI5));
                        }
/* 1924 */              I1ioiI i1ioiI6 = IoiIOIliOIi1.I00100o1O0lo;
/* 1930 */              if (oolIl0ii15.I000O01llI0(i1ioiI6)) {
/* 1936 */                  oI0oiliol10OI000OOo1O.I0010I0i(i1ioiI6, oolIl0ii15.I0000O(i1ioiI6));
                        }
/* 1946 */              iOiOol0I00000oIO.I00io1l = new IIl0oI(oI0oiliol10OI000OOo1O, 8);
/* 1954 */              iOiOol0I00000oIO.I00ioIO = Boolean.valueOf(oliliiIIiil2.I0000Il00O);
/* 1962 */              if (!O0000Ioio00.I0000O(rangeI0000Il00O, I1lIoOIi.I000O01llI0)) {
/* 1964 */                  if (rangeI0000Il00O == null) {
/* 1969 */                      IOOlIIilOl0.I000II("Null expectedFrameRateRange");
/* 37 */                        return null;
                            }
/* 1966 */                  iOiOol0I00000oIO.I00ilO0 = rangeI0000Il00O;
                        }
/* 1977 */              linkedHashMap18.put(oolIl0ii15, iOiOol0I00000oIO.I0000O());
/* 1980 */              i22 = i23;
                    }
/* 1989 */          LinkedHashMap linkedHashMap19 = new LinkedHashMap();
/* 1992 */          if (list2 != null) {
/* 1994 */              List list13 = olili0011II.I00000oOI;
/* 1998 */              if (i21 == olili0011II.I0000O && list12.size() == list13.size()) {
/* 2014 */                  ArrayList arrayListI00ilO0 = IOOi0Ool1i.I00ilO0(list12, list13);
/* 2022 */                  if (arrayListI00ilO0.isEmpty()) {
/* 2053 */                      I1ioiI i1ioiI7 = OlOOIoOO0OI.I00000oIO;
/* 2063 */                      ArrayList arrayList16 = new ArrayList(linkedHashMap18.keySet());
/* 2066 */                      it = arrayList.iterator();
/* 2074 */                      while (it.hasNext()) {
/* 2084 */                          if (((I1ilio0iOl) it.next()).I0001Ioi1lo == null) {
/* 2087 */                              I000II.I001IO000("Required value was null.");
/* 37 */                                return null;
                                    }
                                }
/* 2091 */                      it2 = arrayList16.iterator();
/* 2099 */                      while (it2.hasNext()) {
/* 2107 */                          Object obj4 = linkedHashMap18.get((OolIl0ii1) it2.next());
/* 2111 */                          if (obj4 == null) {
/* 2124 */                              I000II.I001IO000("Required value was null.");
/* 37 */                                return null;
                                    }
/* 2117 */                          if (((I1lIoOIi) obj4).I0001Ioi1lo == null) {
/* 2120 */                              I000II.I001IO000("Required value was null.");
/* 37 */                                return null;
                                    }
                                }
/* 2138 */                      jArr = (long[]) ((IIioli) iIlo0i0ll2).I0000O(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
/* 2142 */                      if (jArr != null || jArr.length == 0) {
/* 2464 */                          I1ioiI i1ioiI8 = OlOOIoOO0OI.I00000oIO;
/* 2470 */                          size = list2.size();
/* 2474 */                          i = 0;
/* 2475 */                          while (i < size) {
/* 2477 */                              List list14 = list2;
/* 2487 */                              long j = ((Olio00O) list14.get(i)).I0000Il00O.I00iOIl;
/* 2493 */                              LinkedHashMap linkedHashMap20 = linkedHashMap5;
/* 2499 */                              if (linkedHashMap20.containsKey(Integer.valueOf(i))) {
/* 2509 */                                  I1ilio0iOl i1ilio0iOl4 = (I1ilio0iOl) linkedHashMap20.get(Integer.valueOf(i));
/* 2517 */                                  IIl0oI iIl0oII00000oIO = OlOOIoOO0OI.I00000oIO(i1ilio0iOl4.I0001Ioi1lo, Long.valueOf(j));
/* 2521 */                                  if (iIl0oII00000oIO != null) {
/* 2525 */                                      IOiOol0 iOiOol0I00000oIO2 = I1lIoOIi.I00000oIO(i1ilio0iOl4.I0000Il00O);
/* 2535 */                                      iOiOol0I00000oIO2.I00ilI0I1 = Integer.valueOf(i1ilio0iOl4.I000II);
/* 2537 */                                      Range range3 = i1ilio0iOl4.I000O01llI0;
/* 2539 */                                      if (range3 == null) {
/* 2565 */                                          IOOlIIilOl0.I000II("Null expectedFrameRateRange");
/* 37 */                                            return null;
                                                }
/* 2541 */                                      iOiOol0I00000oIO2.I00ilO0 = range3;
/* 2543 */                                      Iio1oiI iio1oiI2 = i1ilio0iOl4.I0000O;
/* 2545 */                                      if (iio1oiI2 == null) {
/* 2561 */                                          IOOlIIilOl0.I000II("Null dynamicRange");
/* 37 */                                            return null;
                                                }
/* 2547 */                                      iOiOol0I00000oIO2.I00iio = iio1oiI2;
/* 2549 */                                      iOiOol0I00000oIO2.I00io1l = iIl0oII00000oIO;
/* 2555 */                                      linkedHashMap19.put(i1ilio0iOl4, iOiOol0I00000oIO2.I0000O());
                                            }
/* 2558 */                                  linkedHashMap8 = linkedHashMap6;
                                        } else {
/* 2573 */                                  linkedHashMap8 = linkedHashMap6;
/* 2579 */                                  if (!linkedHashMap8.containsKey(Integer.valueOf(i))) {
/* 2634 */                                      I000II.I000O01llI0("SurfaceConfig does not map to any use case");
/* 37 */                                        return null;
                                            }
/* 2589 */                                  OolIl0ii1 oolIl0ii16 = (OolIl0ii1) linkedHashMap8.get(Integer.valueOf(i));
/* 2595 */                                  I1lIoOIi i1lIoOIi = (I1lIoOIi) linkedHashMap18.get(oolIl0ii16);
/* 2603 */                                  IIl0oI iIl0oII00000oIO2 = OlOOIoOO0OI.I00000oIO(i1lIoOIi.I0001Ioi1lo, Long.valueOf(j));
/* 2607 */                                  if (iIl0oII00000oIO2 != null) {
/* 2609 */                                      IOiOol0 iOiOol0I00000oOI = i1lIoOIi.I00000oOI();
/* 2613 */                                      iOiOol0I00000oOI.I00io1l = iIl0oII00000oIO2;
/* 2619 */                                      linkedHashMap18.put(oolIl0ii16, iOiOol0I00000oOI.I0000O());
                                            }
                                        }
/* 2622 */                              i++;
/* 2624 */                              list2 = list14;
/* 2626 */                              linkedHashMap5 = linkedHashMap20;
/* 2628 */                              linkedHashMap6 = linkedHashMap8;
                                    }
                                } else {
/* 2151 */                          HashSet hashSet = new HashSet();
/* 2156 */                          for (long j2 : jArr) {
/* 2164 */                              hashSet.add(Long.valueOf(j2));
                                    }
/* 2172 */                          LinkedHashSet linkedHashSet2 = new LinkedHashSet();
/* 2175 */                          Iterator it17 = arrayList.iterator();
/* 2185 */                          if (it17.hasNext()) {
/* 2191 */                              I1ilio0iOl i1ilio0iOl5 = (I1ilio0iOl) it17.next();
/* 2193 */                              IOlOo1ll1l1 iOlOo1ll1l1 = i1ilio0iOl5.I0001Ioi1lo;
/* 2195 */                              I1ioiI i1ioiI9 = IIl0oI.I00l0I0l0lO1;
/* 2201 */                              if (iOlOo1ll1l1.I000O01llI0(i1ioiI9) && ((Number) i1ilio0iOl5.I0001Ioi1lo.I0000O(i1ioiI9)).longValue() != 0) {
/* 2224 */                                  z5 = z2;
/* 2226 */                                  z4 = false;
/* 2230 */                                  it3 = arrayList16.iterator();
/* 2238 */                                  while (it3.hasNext()) {
/* 2244 */                                      OolIl0ii1 oolIl0ii17 = (OolIl0ii1) it3.next();
/* 2246 */                                      I1ioiI i1ioiI10 = IIl0oI.I00l0I0l0lO1;
/* 2254 */                                      if (oolIl0ii17.I000O01llI0(i1ioiI10)) {
/* 2271 */                                          long jLongValue = ((Number) oolIl0ii17.I0000O(i1ioiI10)).longValue();
/* 2277 */                                          if (jLongValue != 0) {
/* 2286 */                                              if (z4) {
/* 2298 */                                                  I000II.I000iOII("Either all use cases must have non-default stream use case assigned or none should have it");
/* 37 */                                                    return null;
                                                        }
/* 2292 */                                              linkedHashSet2.add(Long.valueOf(jLongValue));
/* 2295 */                                              z5 = z2;
                                                    } else if (z5) {
/* 2282 */                                              I000II.I000iOII("Either all use cases must have non-default stream use case assigned or none should have it");
/* 37 */                                                return null;
                                                    }
                                                } else if (z5) {
/* 2261 */                                          I000II.I000iOII("Either all use cases must have non-default stream use case assigned or none should have it");
/* 37 */                                            return null;
                                                }
/* 2258 */                                      z4 = z2;
                                            }
/* 2302 */                                  if (z4) {
/* 2304 */                                      Iterator it18 = linkedHashSet2.iterator();
/* 2312 */                                      while (it18.hasNext()) {
/* 2332 */                                          if (!hashSet.contains(Long.valueOf(((Number) it18.next()).longValue()))) {
/* 2464 */                                              I1ioiI i1ioiI82 = OlOOIoOO0OI.I00000oIO;
/* 2470 */                                              size = list2.size();
/* 2474 */                                              i = 0;
/* 2475 */                                              while (i < size) {
                                                        }
                                                    }
                                                }
/* 2336 */                                      Iterator it19 = arrayList.iterator();
/* 2344 */                                      while (it19.hasNext()) {
/* 2350 */                                          I1ilio0iOl i1ilio0iOl6 = (I1ilio0iOl) it19.next();
/* 2352 */                                          IOlOo1ll1l1 iOlOo1ll1l12 = i1ilio0iOl6.I0001Ioi1lo;
/* 2362 */                                          IIl0oI iIl0oII00000oIO3 = OlOOIoOO0OI.I00000oIO(iOlOo1ll1l12, (Long) iOlOo1ll1l12.I0000O(IIl0oI.I00l0I0l0lO1));
/* 2366 */                                          if (iIl0oII00000oIO3 != null) {
/* 2370 */                                              IOiOol0 iOiOol0I00000oIO3 = I1lIoOIi.I00000oIO(i1ilio0iOl6.I0000Il00O);
/* 2380 */                                              iOiOol0I00000oIO3.I00ilI0I1 = Integer.valueOf(i1ilio0iOl6.I000II);
/* 2382 */                                              Range range4 = i1ilio0iOl6.I000O01llI0;
/* 2384 */                                              if (range4 == null) {
/* 2408 */                                                  IOOlIIilOl0.I000II("Null expectedFrameRateRange");
/* 37 */                                                    return null;
                                                        }
/* 2386 */                                              iOiOol0I00000oIO3.I00ilO0 = range4;
/* 2388 */                                              Iio1oiI iio1oiI3 = i1ilio0iOl6.I0000O;
/* 2390 */                                              if (iio1oiI3 == null) {
/* 2404 */                                                  IOOlIIilOl0.I000II("Null dynamicRange");
/* 37 */                                                    return null;
                                                        }
/* 2392 */                                              iOiOol0I00000oIO3.I00iio = iio1oiI3;
/* 2394 */                                              iOiOol0I00000oIO3.I00io1l = iIl0oII00000oIO3;
/* 2400 */                                              linkedHashMap19.put(i1ilio0iOl6, iOiOol0I00000oIO3.I0000O());
                                                    }
                                                }
/* 2412 */                                      Iterator it20 = arrayList16.iterator();
/* 2420 */                                      while (it20.hasNext()) {
/* 2426 */                                          OolIl0ii1 oolIl0ii18 = (OolIl0ii1) it20.next();
/* 2432 */                                          I1lIoOIi i1lIoOIi2 = (I1lIoOIi) linkedHashMap18.get(oolIl0ii18);
/* 2434 */                                          IOlOo1ll1l1 iOlOo1ll1l13 = i1lIoOIi2.I0001Ioi1lo;
/* 2444 */                                          IIl0oI iIl0oII00000oIO4 = OlOOIoOO0OI.I00000oIO(iOlOo1ll1l13, (Long) iOlOo1ll1l13.I0000O(IIl0oI.I00l0I0l0lO1));
/* 2448 */                                          if (iIl0oII00000oIO4 != null) {
/* 2450 */                                              IOiOol0 iOiOol0I00000oOI2 = i1lIoOIi2.I00000oOI();
/* 2454 */                                              iOiOol0I00000oOI2.I00io1l = iIl0oII00000oIO4;
/* 2460 */                                              linkedHashMap18.put(oolIl0ii18, iOiOol0I00000oOI2.I0000O());
                                                    }
                                                }
                                            }
                                        } else {
/* 2203 */                                  z4 = z2;
                                        }
                                    } else {
/* 2228 */                              z4 = false;
                                    }
/* 2205 */                          z5 = false;
/* 2230 */                          it3 = arrayList16.iterator();
/* 2238 */                          while (it3.hasNext()) {
                                    }
/* 2302 */                          if (z4) {
                                    }
                                }
                            } else {
/* 2025 */                      Iterator it21 = arrayListI00ilO0.iterator();
/* 2033 */                      while (it21.hasNext()) {
/* 2039 */                          OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it21.next();
/* 2049 */                          if (!O0000Ioio00.I0000O(oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI)) {
                                        break;
                                    }
                                }
/* 2053 */                      I1ioiI i1ioiI72 = OlOOIoOO0OI.I00000oIO;
/* 2063 */                      ArrayList arrayList162 = new ArrayList(linkedHashMap18.keySet());
/* 2066 */                      it = arrayList.iterator();
/* 2074 */                      while (it.hasNext()) {
                                }
/* 2091 */                      it2 = arrayList162.iterator();
/* 2099 */                      while (it2.hasNext()) {
                                }
/* 2138 */                      jArr = (long[]) ((IIioli) iIlo0i0ll2).I0000O(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
/* 2142 */                      if (jArr != null) {
/* 2464 */                          I1ioiI i1ioiI822 = OlOOIoOO0OI.I00000oIO;
/* 2470 */                          size = list2.size();
/* 2474 */                          i = 0;
/* 2475 */                          while (i < size) {
                                    }
                                }
                            }
                        }
                    }
/* 2640 */          int i24 = olili0011II.I0000oI00;
/* 2642 */          Oll0IO000Ii oll0IO000Ii = new Oll0IO000Ii();
/* 2645 */          oll0IO000Ii.I00000oIO = linkedHashMap18;
/* 2647 */          oll0IO000Ii.I00000oOI = linkedHashMap19;
/* 2649 */          oll0IO000Ii.I0000Il00O = i24;
/* 2651 */          VarHandle.storeStoreFence();
/* 2654 */          return oll0IO000Ii;
                }

                public final void I00100l0(Map map, int i, Rational rational) {
/* 10 */            Size sizeI0000oI00 = I0000oI00((StreamConfigurationMap) this.I001i1lo1io.I0000Il00O.I00iOIl, i, true, rational);
/* 14 */            if (sizeI0000oI00 != null) {
/* 20 */                map.put(Integer.valueOf(i), sizeI0000oI00);
                    }
                }

                public final void I00100o1O0lo(Map map, Size size, int i) {
/* 3 */             if (this.I00100o1O0lo) {
/* 16 */                Size sizeI0000oI00 = I0000oI00((StreamConfigurationMap) this.I001i1lo1io.I0000Il00O.I00iOIl, i, false, null);
/* 20 */                Integer numValueOf = Integer.valueOf(i);
/* 24 */                if (sizeI0000oI00 != null) {
/* 47 */                    size = (Size) Collections.min(IOOi1I.I000O01llI0(size, sizeI0000oI00), new IOi101(false));
                        }
/* 49 */                map.put(numValueOf, size);
                    }
                }

                public final void I0010I0i(OliliiIIiil oliliiIIiil) {
/* 1 */             int i = oliliiIIiil.I00000oIO;
/* 3 */             boolean z = oliliiIIiil.I000II;
/* 15 */            String str = this.I0000O;
/* 19 */            if (i != 0 && oliliiIIiil.I0000oI00) {
/* 43 */                I000II.I0010I0i(IIl001iO0Io.I00100l0(IIlIOloOOO.I001IIilI0O("Camera device Id is ", str, ". Ultra HDR is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
/* 46 */                return;
                    }
/* 47 */            if (i != 0 && oliliiIIiil.I00000oOI == 10) {
/* 73 */                I000II.I0010I0i(IIl001iO0Io.I00100l0(IIlIOloOOO.I001IIilI0O("Camera device Id is ", str, ". 10 bit dynamic range is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
/* 76 */                return;
                    }
/* 77 */            if (i != 0 && z) {
/* 99 */                I000II.I0010I0i(IIl001iO0Io.I00100l0(IIlIOloOOO.I001IIilI0O("Camera device Id is ", str, ". feature combination is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
/* 102 */               return;
                    }
/* 103 */           boolean z2 = oliliiIIiil.I0001Ioi1lo;
/* 105 */           if (z2 && z) {
/* 112 */               I000II.I000iOII("High-speed session is not supported with feature combination");
                    } else {
/* 116 */               if (!z2 || ((Boolean) this.I001lloI.I00000oOI.getValue()).booleanValue()) {
/* 168 */                   return;
                        }
/* 137 */               I000II.I000iOII("High-speed session is not supported on this device.");
                    }
                }
            }
