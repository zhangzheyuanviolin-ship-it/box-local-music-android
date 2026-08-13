            package p000;

            import android.graphics.SurfaceTexture;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.DynamicRangeProfiles;
            import android.media.MediaCodec;
            import android.os.Build;
            import android.util.Log;
            import android.util.Range;
            import android.util.Size;
            import android.view.SurfaceHolder;
            import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
            import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
            import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
            import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
            import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            
            public final class IIlioOio1 {
                public final IIl1Iloio I00000oIO;
                public final IOi0Olo0Ol I00000oOI;
                public final IIlIi0lIii I0000Il00O;
                public final IIo0OlO I0000O;
                public final i0I11I I0000oI00;
                public final OloOIoiI1 I0001Ioi1lo;
                public final IIlo0i0ll I000II;
                public final IIoO11o I000O01llI0;
                public final IIlio101Io I000OOo1O;
                public final I0IIiO0iI I000OiO;
                public final DynamicRangeProfiles I000iOII;

                public IIlioOio1(IIl1Iloio iIl1Iloio, IOi0Olo0Ol iOi0Olo0Ol, IIlIi0lIii iIlIi0lIii, IIo0OlO iIo0OlO, i0I11I i0i11i, OloOIoiI1 oloOIoiI1, IIlo0i0ll iIlo0i0ll, IIoO11o iIoO11o, IIlio101Io iIlio101Io) {
/* 4 */             this.I00000oIO = iIl1Iloio;
/* 6 */             this.I00000oOI = iOi0Olo0Ol;
/* 8 */             this.I0000Il00O = iIlIi0lIii;
/* 10 */            this.I0000O = iIo0OlO;
/* 12 */            this.I0000oI00 = i0i11i;
/* 14 */            this.I0001Ioi1lo = oloOIoiI1;
/* 16 */            this.I000II = iIlo0i0ll;
/* 18 */            this.I000O01llI0 = iIoO11o;
/* 20 */            this.I000OOo1O = iIlio101Io;
/* 25 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(5);
/* 36 */            i0IIiO0iI.I00iiI = (CloseCameraDeviceOnCameraGraphCloseQuirk) IiOoli.I00000oIO(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            this.I000OiO = i0IIiO0iI;
/* 43 */            DynamicRangeProfiles dynamicRangeProfilesI0000Il00O = null;
/* 43 */            Oi1ol0llI oi1ol0llI = null;
/* 44 */            if (iIlo0i0ll != null) {
/* 54 */                DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
/* 56 */                if (dynamicRangeProfiles != null) {
/* 65 */                    IIOOoll iIOOoll = new IIOOoll(12);
/* 68 */                    iIOOoll.I00iiI = dynamicRangeProfiles;
/* 70 */                    VarHandle.storeStoreFence();
/* 75 */                    oi1ol0llI = new Oi1ol0llI(iIOOoll, 9);
                        }
/* 86 */                dynamicRangeProfilesI0000Il00O = ((IioI0ol1O0) (oi1ol0llI == null ? IioI11.I00iOIl : oi1ol0llI).I00iiI).I0000Il00O();
                    }
/* 90 */            this.I000iOII = dynamicRangeProfilesI0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:142:0x0342  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0400  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01db  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01f9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIlioOI I00000oIO(int i, OillooOlI oillooOlI, boolean z, Io101ll1ol io101ll1ol, Integer num, Map map, Map map2) {
                    boolean z2;
                    ArrayList arrayList;
                    LinkedHashMap linkedHashMap;
                    int i2;
                    LinkedHashMap linkedHashMap2;
                    IIo1lioOolol iIo1lioOololI000l1;
                    ArrayList arrayList2;
                    String str;
                    OIlIOlIi oIlIOlIi;
                    OIlIOlIi oIlIOlIi2;
                    String str2;
                    OIlIOlIi oIlIOlIi3;
                    OIlIOlIi oIlIOlIi4;
                    l1I0oI l1i0oi;
                    int i3;
                    OIlIOo oIlIOo;
                    OIlIOoOil oIlIOoOil;
                    Iterator it;
                    int i4;
                    OIlIOoOil oIlIOoOil2;
                    OIlIOo oIlIOo2;
                    long[] jArr;
                    l1I0oI l1i0oi2;
/* 7 */             l1I0oI l1i0oi3 = l1I0oI.I00ilO0;
/* 10 */            Integer num2 = 0;
/* 19 */            boolean z3 = i == 2;
/* 22 */            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 27 */            ArrayList arrayList3 = new ArrayList();
/* 32 */            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 37 */            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
/* 42 */            if (oillooOlI != null) {
/* 44 */                IIoo00iOol0 iIoo00iOol0 = oillooOlI.I000II;
/* 46 */                IIlio101Io iIlio101Io = this.I000OOo1O;
/* 48 */                if (iIlio101Io != null) {
/* 64 */                    ((IIlo0I1io1O0) iIlio101Io.I00iiI).I00000oIO.I00000oIO = IOOi0Ool1i.I00iIi0i1o(oillooOlI.I0000Il00O);
/* 82 */                    ((I1OooIoiIO) ((I1I0i0Ilo1Oi) iIlio101Io.I00iiO).I00iiO).I00000oIO = IOOi0Ool1i.I00iIi0i1o(oillooOlI.I0000O);
                        }
/* 84 */                int i5 = iIoo00iOol0.I0000Il00O;
/* 87 */                if (i5 == -1) {
/* 90 */                    i5 = 1;
                        }
/* 101 */               linkedHashMap4.putAll(this.I0001Ioi1lo.I00000oIO(Oi0OO1IIl1.I00000oIO(i5)));
/* 110 */               linkedHashMap4.putAll(iOil1io0i00.I00000oOI(iIoo00iOol0.I00000oOI));
/* 113 */               if (i == 2) {
/* 119 */                   linkedHashMap4.put(IIloiOIOoo.I00000oIO, num);
                        }
/* 135 */               String str3 = (String) oillooOlI.I000II.I00000oOI.I00000oOI(IIl0oI.I00li1OI, null);
/* 139 */               Iterator it2 = oillooOlI.I00000oIO.iterator();
/* 143 */               IIo1lioOolol iIo1lioOolol = null;
/* 148 */               while (it2.hasNext()) {
/* 156 */                   I1lIlOi1OI0 i1lIlOi1OI0 = (I1lIlOi1OI0) it2.next();
/* 158 */                   l1I0oI l1i0oi4 = l1i0oi3;
/* 160 */                   IiIO1ol1i1o0 iiIO1ol1i1o0 = i1lIlOi1OI0.I00000oIO;
/* 162 */                   int i6 = i5;
/* 164 */                   int i7 = i1lIlOi1OI0.I0000O;
/* 166 */                   String str4 = str3;
/* 173 */                   String str5 = str3 == null ? null : str4;
/* 175 */                   Iio1oiI iio1oiI = i1lIlOi1OI0.I0000oI00;
/* 177 */                   boolean z4 = z3;
/* 179 */                   int i8 = i1lIlOi1OI0.I0000Il00O;
/* 181 */                   Iterator it3 = it2;
/* 185 */                   OIlII1I1 oIlII1I1 = new OIlII1I1();
/* 188 */                   ArrayList arrayList4 = arrayList3;
/* 190 */                   LinkedHashMap linkedHashMap6 = linkedHashMap4;
/* 194 */                   oIlII1I1.I00000oIO = 1L;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   DynamicRangeProfiles dynamicRangeProfiles = this.I000iOII;
/* 201 */                   if (dynamicRangeProfiles != null) {
/* 203 */                       Long lI00000oIO = IioI0IoOi.I00000oIO(iio1oiI, dynamicRangeProfiles);
/* 207 */                       if (lI00000oIO != null) {
/* 209 */                           long jLongValue = lI00000oIO.longValue();
/* 215 */                           oIlII1I1 = new OIlII1I1();
/* 218 */                           oIlII1I1.I00000oIO = jLongValue;
/* 220 */                           VarHandle.storeStoreFence();
                                } else if (l11I11lO.I0000O(6, "CXCP")) {
/* 247 */                           Log.e("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + iio1oiI);
                                }
                            }
/* 223 */                   OIlII1I1 oIlII1I12 = oIlII1I1;
/* 251 */                   Size size = iiIO1ol1i1o0.I000O01llI0;
/* 253 */                   int i9 = iiIO1ol1i1o0.I000OOo1O;
/* 255 */                   if (str5 == null) {
/* 257 */                       str2 = null;
                            } else {
/* 260 */                       IIllI0o.I00000oOI(str5);
/* 263 */                       str2 = str5;
                            }
/* 265 */                   if (i8 == 0) {
/* 290 */                       oIlIOlIi3 = new OIlIOlIi();
/* 293 */                       oIlIOlIi3.I00000oIO = 1;
/* 295 */                       VarHandle.storeStoreFence();
                            } else if (i8 != 1) {
/* 270 */                       oIlIOlIi4 = null;
/* 299 */                       if (z) {
/* 340 */                           l1i0oi = l1i0oi4;
                                } else {
/* 303 */                           Class cls = i1lIlOi1OI0.I00000oIO.I000OiO;
/* 311 */                           if (O0000Ioio00.I0000O(cls, MediaCodec.class)) {
/* 313 */                               l1i0oi2 = l1I0oI.I00l0OO0IO;
                                    } else if (O0000Ioio00.I0000O(cls, SurfaceHolder.class)) {
/* 326 */                               l1i0oi2 = l1I0oI.I00io1l;
                                    } else {
/* 335 */                               if (O0000Ioio00.I0000O(cls, SurfaceTexture.class)) {
/* 337 */                                   l1i0oi2 = l1I0oI.I00ioIO;
                                        }
/* 340 */                               l1i0oi = l1i0oi4;
                                    }
/* 315 */                           l1i0oi = l1i0oi2;
                                }
/* 342 */                       if (z4) {
/* 344 */                           IIlo0i0ll iIlo0i0ll = this.I000II;
/* 352 */                           Long l = (Long) map.get(iiIO1ol1i1o0);
/* 354 */                           i3 = i9;
/* 356 */                           if (l != null) {
/* 358 */                               long jLongValue2 = l.longValue();
/* 364 */                               oIlIOo2 = new OIlIOo();
/* 367 */                               oIlIOo2.I00000oIO = jLongValue2;
/* 369 */                               VarHandle.storeStoreFence();
                                    } else {
/* 373 */                               oIlIOo2 = null;
                                    }
/* 374 */                           if (oIlIOo2 == null || iIlo0i0ll == null || (jArr = (long[]) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || !I1IoiO1l.I0000O(oIlIOo2.I00000oIO, jArr)) {
/* 405 */                               if (l11I11lO.I0000O(5, "CXCP")) {
/* 434 */                                   Log.w("CXCP", "Expected stream use case for " + iiIO1ol1i1o0 + ", " + oIlIOo2 + " cannot be set!");
                                        }
/* 437 */                               oIlIOo2 = null;
                                    }
/* 438 */                           oIlIOo = oIlIOo2;
                                } else {
/* 441 */                           i3 = i9;
/* 443 */                           oIlIOo = null;
                                }
/* 445 */                       if (z4) {
/* 453 */                           Long l2 = (Long) map2.get(iiIO1ol1i1o0);
/* 455 */                           if (l2 != null) {
/* 457 */                               long jLongValue3 = l2.longValue();
/* 463 */                               oIlIOoOil2 = new OIlIOoOil();
/* 466 */                               oIlIOoOil2.I00000oIO = jLongValue3;
/* 468 */                               VarHandle.storeStoreFence();
                                    } else {
/* 472 */                               oIlIOoOil2 = null;
                                    }
/* 473 */                           oIlIOoOil = oIlIOoOil2;
                                } else {
/* 478 */                           oIlIOoOil = null;
                                }
/* 484 */                       OIlI1io oIlI1ioI0000Il00O = lolOiIoiillI.I0000Il00O(size, i3, str2, l1i0oi, oIlIOlIi4, oIlII1I12, oIlIOo, oIlIOoOil, 544);
/* 496 */                       it = IOOi0Ool1i.I00OI1(i1lIlOi1OI0.I00000oOI, iiIO1ol1i1o0).iterator();
/* 504 */                       while (it.hasNext()) {
/* 510 */                           IiIO1ol1i1o0 iiIO1ol1i1o02 = (IiIO1ol1i1o0) it.next();
/* 512 */                           IIo1lioOolol iIo1lioOololI000l12 = loilIl10Ii.I000l1(oIlI1ioI0000Il00O);
/* 516 */                           linkedHashMap5.put(iIo1lioOololI000l12, iiIO1ol1i1o02);
/* 520 */                           if (i7 != -1) {
/* 530 */                               List list = (List) linkedHashMap3.get(Integer.valueOf(i7));
/* 532 */                               if (list == null) {
/* 542 */                                   i4 = i7;
/* 548 */                                   linkedHashMap3.put(Integer.valueOf(i7), IOOi1I.I000OiO(iIo1lioOololI000l12));
                                        } else {
/* 552 */                                   i4 = i7;
/* 554 */                                   list.add(iIo1lioOololI000l12);
                                        }
                                    } else {
/* 558 */                               i4 = i7;
                                    }
/* 564 */                           if (O0000Ioio00.I0000O(iiIO1ol1i1o02, iiIO1ol1i1o0) && this.I0000oI00.I000O01llI0(iiIO1ol1i1o02, oillooOlI)) {
/* 574 */                               iIo1lioOolol = iIo1lioOololI000l12;
                                    }
/* 575 */                           i7 = i4;
                                }
/* 578 */                       str3 = str4;
/* 580 */                       l1i0oi3 = l1i0oi4;
/* 582 */                       i5 = i6;
/* 584 */                       z3 = z4;
/* 586 */                       it2 = it3;
/* 588 */                       arrayList3 = arrayList4;
/* 590 */                       linkedHashMap4 = linkedHashMap6;
                            } else {
/* 275 */                       oIlIOlIi3 = new OIlIOlIi();
/* 279 */                       oIlIOlIi3.I00000oIO = 2;
/* 281 */                       VarHandle.storeStoreFence();
                            }
/* 284 */                   oIlIOlIi4 = oIlIOlIi3;
/* 299 */                   if (z) {
                            }
/* 342 */                   if (z4) {
                            }
/* 445 */                   if (z4) {
                            }
/* 484 */                   OIlI1io oIlI1ioI0000Il00O2 = lolOiIoiillI.I0000Il00O(size, i3, str2, l1i0oi, oIlIOlIi4, oIlII1I12, oIlIOo, oIlIOoOil, 544);
/* 496 */                   it = IOOi0Ool1i.I00OI1(i1lIlOi1OI0.I00000oOI, iiIO1ol1i1o0).iterator();
/* 504 */                   while (it.hasNext()) {
                            }
/* 578 */                   str3 = str4;
/* 580 */                   l1i0oi3 = l1i0oi4;
/* 582 */                   i5 = i6;
/* 584 */                   z3 = z4;
/* 586 */                   it2 = it3;
/* 588 */                   arrayList3 = arrayList4;
/* 590 */                   linkedHashMap4 = linkedHashMap6;
                        }
/* 595 */               int i10 = i5;
/* 597 */               z2 = z3;
/* 599 */               ArrayList arrayList5 = arrayList3;
/* 601 */               linkedHashMap = linkedHashMap4;
/* 605 */               if (oillooOlI.I000OOo1O == null || iIo1lioOolol == null) {
/* 637 */                   arrayList = arrayList5;
                        } else {
/* 619 */                   int i11 = ((OIlI1io) IOOi0Ool1i.I00OilO00Il(iIo1lioOolol.I00000oIO)).I00000oOI;
/* 621 */                   Ioo000i1Io ioo000i1Io = new Ioo000i1Io();
/* 624 */                   ioo000i1Io.I00000oIO = iIo1lioOolol;
/* 626 */                   ioo000i1Io.I00000oOI = i11;
/* 628 */                   VarHandle.storeStoreFence();
/* 631 */                   arrayList = arrayList5;
/* 633 */                   arrayList.add(ioo000i1Io);
                        }
/* 639 */               i2 = i10;
                    } else {
/* 642 */               z2 = z3;
/* 644 */               arrayList = arrayList3;
/* 645 */               linkedHashMap = linkedHashMap4;
/* 647 */               i2 = 1;
                    }
/* 648 */           IIo0OlO iIo0OlO = this.I0000O;
/* 660 */           if (iIo0OlO.I00000oIO().I00000oIO(CaptureSessionStuckQuirk.class)) {
/* 663 */               l11I11lO.I0000O(3, "CXCP");
                    }
/* 679 */           boolean zI000l1 = OlOolloIIOl0.I000l1(Build.MODEL.toLowerCase(Locale.getDefault()), "cph", false);
/* 713 */           boolean z5 = ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.I000OiO.I00iiI) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.I0000Il00O || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.I0000oI00 || CloseCameraDeviceOnCameraGraphCloseQuirk.I00000oIO || CloseCameraDeviceOnCameraGraphCloseQuirk.I00000oOI)) ? z2 : true : false;
/* 735 */           boolean z6 = (!z2 || IiOoli.I00000oIO(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && IiOoli.I00000oIO(DisableAbortCapturesOnStopQuirk.class) == null;
/* 742 */           boolean zI00000oIO = iIo0OlO.I00000oIO().I00000oIO(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class);
/* 748 */           IIlilI0i0ii iIlilI0i0ii = IIlilI0i0ii.I00iOIl;
/* 750 */           IIi0oIl iIi0oIl = new IIi0oIl();
/* 753 */           iIi0oIl.I00iOIl = zI00000oIO ? 1 : 0;
/* 757 */           IIliOiI iIliOiI = new IIliOiI();
/* 760 */           iIliOiI.I00000oIO = z6;
/* 762 */           iIliOiI.I00000oOI = iIi0oIl;
/* 764 */           iIliOiI.I0000Il00O = zI000l1 ? 1 : 0;
/* 767 */           iIliOiI.I0000O = true;
/* 769 */           iIliOiI.I0000oI00 = z5;
/* 771 */           iIliOiI.I0001Ioi1lo = true;
/* 773 */           VarHandle.storeStoreFence();
/* 776 */           if (oillooOlI != null) {
/* 778 */               IIoo00iOol0 iIoo00iOol02 = oillooOlI.I000II;
/* 788 */               Integer num3 = (Integer) iIoo00iOol02.I00000oOI.I00000oOI(OolIl0ii1.I00OIo, num2);
/* 790 */               Objects.requireNonNull(num3);
/* 793 */               int iIntValue = num3.intValue();
/* 805 */               Integer num4 = (Integer) iIoo00iOol02.I00000oOI.I00000oOI(OolIl0ii1.I00OOll1, num2);
/* 807 */               Objects.requireNonNull(num4);
/* 810 */               int iIntValue2 = num4.intValue();
/* 815 */               if (iIntValue != 1 && iIntValue2 != 1) {
/* 835 */                   num2 = iIntValue == 2 ? 2 : iIntValue2 == 2 ? 1 : null;
                        }
                    }
/* 845 */           Range rangeI00000oIO = oillooOlI != null ? oillooOlI.I000II.I00000oIO() : null;
/* 852 */           if (O0000Ioio00.I0000O(rangeI00000oIO, I1lIoOIi.I000O01llI0)) {
/* 855 */               rangeI00000oIO = null;
                    }
/* 858 */           O1OOII o1ooii = new O1OOII();
/* 861 */           if (z2) {
/* 867 */               o1ooii.put(IIloiOIOoo.I0000Il00O, Boolean.TRUE);
                    }
/* 870 */           if (num2 != null) {
/* 882 */               o1ooii.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
                    }
/* 889 */           o1ooii.put(IIloiOIOoo.I00000oOI, "android.hardware.camera2.CaptureRequest.setTag.CX");
/* 892 */           if (rangeI00000oIO != null) {
/* 896 */               o1ooii.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeI00000oIO);
                    }
/* 899 */           O1OOII o1ooiiI00000oOI = o1ooii.I00000oOI();
/* 903 */           if (rangeI00000oIO != null) {
/* 907 */               linkedHashMap2 = linkedHashMap;
/* 909 */               linkedHashMap2.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeI00000oIO);
                    } else {
/* 913 */               linkedHashMap2 = linkedHashMap;
                    }
/* 915 */           if (num2 != null) {
/* 919 */               linkedHashMap2.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
                    }
/* 922 */           if (oillooOlI != null) {
/* 938 */               String str6 = (String) oillooOlI.I000II.I00000oOI.I00000oOI(IIl0oI.I00li1OI, null);
/* 940 */               I1lIlOi1OI0 i1lIlOi1OI02 = oillooOlI.I00000oOI;
/* 942 */               if (i1lIlOi1OI02 != null) {
/* 944 */                   IiIO1ol1i1o0 iiIO1ol1i1o03 = i1lIlOi1OI02.I00000oIO;
/* 946 */                   if (str6 == null) {
/* 948 */                       str6 = null;
                            }
/* 949 */                   int i12 = i1lIlOi1OI02.I0000Il00O;
/* 951 */                   Size size2 = iiIO1ol1i1o03.I000O01llI0;
/* 953 */                   int i13 = iiIO1ol1i1o03.I000OOo1O;
/* 955 */                   if (str6 == null) {
/* 957 */                       str = null;
                            } else {
/* 960 */                       IIllI0o.I00000oOI(str6);
/* 963 */                       str = str6;
                            }
/* 965 */                   if (i12 == 0) {
/* 990 */                       oIlIOlIi = new OIlIOlIi();
/* 993 */                       oIlIOlIi.I00000oIO = 1;
/* 995 */                       VarHandle.storeStoreFence();
                            } else if (i12 != 1) {
/* 970 */                       oIlIOlIi2 = null;
/* 1017 */                      iIo1lioOololI000l1 = loilIl10Ii.I000l1(lolOiIoiillI.I0000Il00O(size2, i13, str, null, oIlIOlIi2, null, null, null, 1000));
/* 1021 */                      linkedHashMap5.put(iIo1lioOololI000l1, iiIO1ol1i1o03);
                            } else {
/* 975 */                       oIlIOlIi = new OIlIOlIi();
/* 979 */                       oIlIOlIi.I00000oIO = 2;
/* 981 */                       VarHandle.storeStoreFence();
                            }
/* 984 */                   oIlIOlIi2 = oIlIOlIi;
/* 1017 */                  iIo1lioOololI000l1 = loilIl10Ii.I000l1(lolOiIoiillI.I0000Il00O(size2, i13, str, null, oIlIOlIi2, null, null, null, 1000));
/* 1021 */                  linkedHashMap5.put(iIo1lioOololI000l1, iiIO1ol1i1o03);
                        } else {
/* 1025 */                  iIo1lioOololI000l1 = null;
                        }
                    }
/* 1026 */          IIoO11o iIoO11o = this.I000O01llI0;
/* 1028 */          if (iIoO11o != null) {
/* 1034 */              arrayList2 = null;
/* 1039 */              if (iIoO11o.I00iOIl.I00000oOI(IIl0001IOo.I00000oIO, null) != null) {
/* 1042 */                  OIiilo1Ool0o.I00000oIO();
/* 1034 */                  return null;
                        }
                    } else {
/* 1046 */              arrayList2 = null;
                    }
/* 1049 */          String str7 = this.I0000Il00O.I00iiI;
/* 1057 */          List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(linkedHashMap5.keySet());
/* 1067 */          List listI00iIi0i1o2 = IOOi0Ool1i.I00iIi0i1o(linkedHashMap3.values());
/* 1079 */          ArrayList arrayList6 = arrayList.isEmpty() ? arrayList2 : arrayList;
/* 1095 */          List listI000O01llI0 = IOOi1I.I000O01llI0(this.I00000oIO, this.I00000oOI);
/* 1099 */          List listI000OOo1O = IOOi1I.I000OOo1O(io101ll1ol);
/* 1105 */          Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 1117 */          i1i0olI i1i0oli = new i1i0olI(13);
/* 1120 */          O1liO1 o1liO1 = new O1liO1();
/* 1123 */          o1liO1.I00000oIO = i1i0oli;
/* 1125 */          VarHandle.storeStoreFence();
/* 1128 */          IIliIi1O0OiO iIliIi1O0OiO = new IIliIi1O0OiO();
/* 1131 */          iIliIi1O0OiO.I00000oIO = str7;
/* 1133 */          iIliIi1O0OiO.I00000oOI = listI00iIi0i1o;
/* 1135 */          iIliIi1O0OiO.I0000Il00O = listI00iIi0i1o2;
/* 1137 */          iIliIi1O0OiO.I0000O = arrayList6;
/* 1139 */          iIliIi1O0OiO.I0000oI00 = iIo1lioOololI000l1;
/* 1141 */          iIliIi1O0OiO.I0001Ioi1lo = i2;
/* 1143 */          iIliIi1O0OiO.I000II = linkedHashMap2;
/* 1145 */          iIliIi1O0OiO.I000O01llI0 = i;
/* 1147 */          iIliIi1O0OiO.I000OOo1O = o1ooiiI00000oOI;
/* 1149 */          iIliIi1O0OiO.I000OiO = listI000O01llI0;
/* 1151 */          iIliIi1O0OiO.I000iOII = listI000OOo1O;
/* 1153 */          iIliIi1O0OiO.I000l1 = il011I1OiO0I;
/* 1155 */          iIliIi1O0OiO.I000lI = o1liO1;
/* 1159 */          iIliIi1O0OiO.I000o00OoI0I = iIliOiI;
/* 1161 */          VarHandle.storeStoreFence();
/* 1166 */          Map mapI000iOII = O1Oii0O0loo.I000iOII(linkedHashMap5);
/* 1170 */          IIlioOI iIlioOI = new IIlioOI();
/* 1173 */          iIlioOI.I00000oIO = iIliIi1O0OiO;
/* 1175 */          iIlioOI.I00000oOI = mapI000iOII;
/* 1177 */          VarHandle.storeStoreFence();
/* 2665 */          return iIlioOI;
                }

                public final String toString() {
/* 24 */            return "CameraGraphConfigProvider<" + ((Object) IIllI0o.I0000Il00O(this.I0000Il00O.I00iiI)) + '>';
                }
            }
