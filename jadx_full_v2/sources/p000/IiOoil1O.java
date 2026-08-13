            package p000;

            import android.os.Build;
            import android.util.Pair;
            import androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
            import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
            import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
            import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
            import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
            import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
            import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
            import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
            import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
            import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
            import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
            import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
            import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
            import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
            import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
            import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
            import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
            import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
            import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
            import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
            import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
            import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
            import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
            import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
            import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
            import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
            import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
            import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
            import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
            import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
            import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            
            public final class IiOoil1O implements IOo1llI {
                public final int I00000oIO;

                public IiOoil1O(int i) {
/* 1 */             this.I00000oIO = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
                /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0280  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void accept(Object obj) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    switch (this.I00000oIO) {
                        case 0:
/* 1339 */                  OOil00Iill oOil00Iill = (OOil00Iill) obj;
/* 1345 */                  ArrayList arrayList = new ArrayList();
/* 1348 */                  String str = Build.BRAND;
/* 1396 */                  if (oOil00Iill.I00000oIO(ImageCaptureRotationOptionQuirk.class, ("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
/* 1403 */                      arrayList.add(new ImageCaptureRotationOptionQuirk());
                            }
/* 1412 */                  if (oOil00Iill.I00000oIO(SurfaceOrderQuirk.class, true)) {
/* 1419 */                      arrayList.add(new SurfaceOrderQuirk());
                            }
/* 1422 */                  HashSet hashSet = CaptureFailedRetryQuirk.I00000oIO;
/* 1424 */                  Locale locale = Locale.US;
/* 1426 */                  String upperCase = str.toUpperCase(locale);
/* 1430 */                  String str2 = Build.MODEL;
/* 1452 */                  if (oOil00Iill.I00000oIO(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.I00000oIO.contains(Pair.create(upperCase, str2.toUpperCase(locale))))) {
/* 1459 */                      arrayList.add(new CaptureFailedRetryQuirk());
                            }
/* 1478 */                  if (oOil00Iill.I00000oIO(LowMemoryQuirk.class, LowMemoryQuirk.I00000oIO.contains(str2.toUpperCase(locale)))) {
/* 1485 */                      arrayList.add(new LowMemoryQuirk());
                            }
/* 1488 */                  HashSet hashSet2 = LargeJpegImageQuirk.I00000oIO;
/* 1524 */                  if (oOil00Iill.I00000oIO(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str) || ("Vivo".equalsIgnoreCase(str) && LargeJpegImageQuirk.I00000oIO.contains(str2.toUpperCase(locale))))) {
/* 1531 */                      arrayList.add(new LargeJpegImageQuirk());
                            }
/* 1534 */                  HashSet hashSet3 = IncorrectJpegMetadataQuirk.I00000oIO;
/* 1565 */                  if (oOil00Iill.I00000oIO(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str) && IncorrectJpegMetadataQuirk.I00000oIO.contains(Build.DEVICE.toUpperCase(locale)))) {
/* 1572 */                      arrayList.add(new IncorrectJpegMetadataQuirk());
                            }
/* 1575 */                  HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.I00000oIO;
/* 1623 */                  if (oOil00Iill.I00000oIO(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str) && "cph2583".equalsIgnoreCase(str2)) || ("google".equalsIgnoreCase(str) && ImageCaptureFailedForSpecificCombinationQuirk.I00000oIO.contains(str2.toLowerCase())))) {
/* 1630 */                      arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                            }
/* 1633 */                  PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.I00000oIO;
/* 1635 */                  previewGreenTintQuirk.getClass();
/* 1662 */                  if (oOil00Iill.I00000oIO(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str) && "moto e20".equalsIgnoreCase(str2))) {
/* 1664 */                      arrayList.add(previewGreenTintQuirk);
                            }
/* 1670 */                  IiOol00iooil.I00000oIO = new OOil0lI(arrayList);
/* 1674 */                  OOil0lI.I0000O(IiOol00iooil.I00000oIO);
/* 1677 */                  l11I11lO.I0000O(3, "DeviceQuirks");
/* 1680 */                  return;
                        case 1:
/* 1262 */                  OOil00Iill oOil00Iill2 = (OOil00Iill) obj;
/* 1268 */                  ArrayList arrayList2 = new ArrayList();
/* 1277 */                  if (oOil00Iill2.I00000oIO(SurfaceViewStretchedQuirk.class, false)) {
/* 1284 */                      arrayList2.add(new SurfaceViewStretchedQuirk());
                            }
/* 1315 */                  if (oOil00Iill2.I00000oIO(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
/* 1322 */                      arrayList2.add(new SurfaceViewNotCroppedByParentQuirk());
                            }
/* 1328 */                  IiOolI1.I00000oIO = new OOil0lI(arrayList2);
/* 1332 */                  OOil0lI.I0000O(IiOolI1.I00000oIO);
/* 1335 */                  l11I11lO.I0000O(3, "DeviceQuirks");
/* 1338 */                  return;
                        case 2:
/* 18 */                    OOil00Iill oOil00Iill3 = (OOil00Iill) obj;
/* 24 */                    ArrayList arrayList3 = new ArrayList();
/* 29 */                    new PixelJpegRSupportedQuirk();
/* 38 */                    I1o1OoIiOlI i1o1OoIiOlI = (I1o1OoIiOlI) BackportedFixQuirk.I00000oIO.getValue();
/* 40 */                    O0i1iIO1 o0i1iIO1 = O0i1ii.I00000oIO;
/* 42 */                    i1o1OoIiOlI.getClass();
/* 101 */                   OlO1o0ol1ol olO1o0ol1ol = ((Boolean) o0i1iIO1.I0000Il00O.invoke()).booleanValue() ? (o0i1iIO1.I00000oOI.contains(Build.FINGERPRINT) || ((Set) ((OllO00oiil) i1o1OoIiOlI.I00000oIO.I00iiI).getValue()).contains(5)) ? OlO1o0ol1ol.I00iOIl : OlO1o0ol1ol.I00iiO : OlO1o0ol1ol.I00iiI;
/* 103 */                   int iOrdinal = olO1o0ol1ol.ordinal();
/* 107 */                   if (iOrdinal == 0) {
/* 116 */                       z = false;
                            } else if (iOrdinal == 1 || iOrdinal == 2) {
/* 123 */                       z = true;
                            } else {
/* 114 */                       if (iOrdinal != 3) {
/* 118 */                           I000II.I00000oIO();
/* 1254 */                          return;
                                }
/* 116 */                       z = false;
                            }
/* 131 */                   if (oOil00Iill3.I00000oIO(PixelJpegRSupportedQuirk.class, !z)) {
/* 138 */                       arrayList3.add(new PixelJpegRSupportedQuirk());
                            }
/* 190 */                   if (oOil00Iill3.I00000oIO(CloseCameraDeviceOnCameraGraphCloseQuirk.class, CloseCameraDeviceOnCameraGraphCloseQuirk.I00000oIO || CloseCameraDeviceOnCameraGraphCloseQuirk.I00000oOI || Build.MANUFACTURER.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo") || CloseCameraDeviceOnCameraGraphCloseQuirk.I0000Il00O || CloseCameraDeviceOnCameraGraphCloseQuirk.I0000oI00 || CloseCameraDeviceOnCameraGraphCloseQuirk.I0000O)) {
/* 197 */                       arrayList3.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
                            }
/* 200 */                   List list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.I00000oIO;
/* 202 */                   String str3 = Build.MODEL;
/* 204 */                   Locale locale2 = Locale.ROOT;
/* 220 */                   if (oOil00Iill3.I00000oIO(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(str3.toUpperCase(locale2)))) {
/* 227 */                       arrayList3.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                            }
/* 230 */                   String str4 = Build.MANUFACTURER;
/* 320 */                   if (oOil00Iill3.I00000oIO(ControlZoomRatioRangeAssertionErrorQuirk.class, ((str4.equalsIgnoreCase("Jio") || Build.BRAND.equalsIgnoreCase("Jio")) && OlOolloIIOl0.I000l1(str3, "LS1542QW", true)) || ((str4.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && (OlOolloIIOl0.I000l1(str3, "SM-A025", true) || str3.equalsIgnoreCase("SM-S124DL"))) || ((str4.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo")) && str3.equalsIgnoreCase("VIVO 2039")))) {
/* 327 */                       arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                            }
/* 330 */                   boolean z5 = DisableAbortCapturesOnStopQuirk.I00000oIO;
/* 338 */                   if (!str4.equalsIgnoreCase("Tecno")) {
/* 340 */                       String str5 = Build.BRAND;
/* 375 */                       z2 = str5.equalsIgnoreCase("Tecno") || str4.equalsIgnoreCase("Tecno-mobile") || str5.equalsIgnoreCase("Tecno-mobile") || DisableAbortCapturesOnStopQuirk.I00000oIO || DisableAbortCapturesOnStopQuirk.I00000oOI;
                            }
/* 382 */                   if (oOil00Iill3.I00000oIO(DisableAbortCapturesOnStopQuirk.class, z2)) {
/* 389 */                       arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                            }
/* 398 */                   if (!str4.equalsIgnoreCase("Samsung")) {
/* 400 */                       String str6 = Build.BRAND;
/* 424 */                       z3 = str6.equalsIgnoreCase("Samsung") || str4.equalsIgnoreCase("Xiaomi") || str6.equalsIgnoreCase("Xiaomi");
                            }
/* 431 */                   if (oOil00Iill3.I00000oIO(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z3)) {
/* 438 */                       arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                            }
/* 441 */                   Set set = FlashAvailabilityBufferUnderflowQuirk.I00000oIO;
/* 445 */                   Locale locale3 = Locale.US;
/* 447 */                   String lowerCase = str4.toLowerCase(locale3);
/* 451 */                   String lowerCase2 = str3.toLowerCase(locale3);
/* 455 */                   IlO1l1O11o ilO1l1O11o = new IlO1l1O11o();
/* 458 */                   ilO1l1O11o.I00000oIO = lowerCase;
/* 460 */                   ilO1l1O11o.I00000oOI = lowerCase2;
/* 462 */                   VarHandle.storeStoreFence();
/* 475 */                   if (oOil00Iill3.I00000oIO(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(ilO1l1O11o))) {
/* 482 */                       arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                            }
/* 518 */                   if (oOil00Iill3.I00000oIO(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.I00000oIO.contains(str3) && (str4.equalsIgnoreCase("Google") || Build.BRAND.equalsIgnoreCase("Google")))) {
/* 525 */                       arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                            }
/* 528 */                   List list2 = InvalidVideoProfilesQuirk.I00000oIO;
/* 536 */                   if ((str4.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && OlOolloIIOl0.I000l1(Build.ID, "TP1A", true)) {
/* 641 */                       z4 = true;
                            } else if (InvalidVideoProfilesQuirk.I00000oIO.contains(str3.toLowerCase(locale2))) {
/* 567 */                       String str7 = Build.ID;
/* 573 */                       if (!OlOolloIIOl0.I000l1(str7, "TP1A", true) && !OlOolloIIOl0.I000l1(str7, "TD1A", true)) {
/* 623 */                           if ((str4.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("Redmi")) | (str4.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi"))) {
/* 625 */                               String str8 = Build.ID;
/* 633 */                               if (OlOolloIIOl0.I000l1(str8, "TKQ1", true) || OlOolloIIOl0.I000l1(str8, "TP1A", true)) {
                                        }
                                    }
/* 649 */                           InvalidVideoProfilesQuirk.I0000Il00O.contains(str3.toLowerCase(locale2));
/* 658 */                           InvalidVideoProfilesQuirk.I00000oOI.contains(str3.toLowerCase(locale2));
/* 661 */                           z4 = false;
                                }
                            }
/* 668 */                   if (oOil00Iill3.I00000oIO(InvalidVideoProfilesQuirk.class, z4)) {
/* 675 */                       arrayList3.add(new InvalidVideoProfilesQuirk());
                            }
/* 742 */                   if (oOil00Iill3.I00000oIO(ExcludedSupportedSizesQuirk.class, ilIl0101i.I0000Il00O() || ilIl0101i.I0000O() || ilIl0101i.I00000oIO() || ilIl0101i.I000O01llI0() || ilIl0101i.I000II() || ilIl0101i.I0000oI00() || ilIl0101i.I0001Ioi1lo() || ilIl0101i.I00000oOI() || ilIl0101i.I000OOo1O())) {
/* 749 */                       arrayList3.add(new ExcludedSupportedSizesQuirk());
                            }
/* 752 */                   LinkedHashMap linkedHashMap = ExtraCroppingQuirk.I00000oIO;
/* 764 */                   if (oOil00Iill3.I00000oIO(ExtraCroppingQuirk.class, ilO0Io0l0oo.I00000oIO())) {
/* 771 */                       arrayList3.add(new ExtraCroppingQuirk());
                            }
/* 807 */                   if (oOil00Iill3.I00000oIO(ExtraSupportedOutputSizeQuirk.class, (str4.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e5 play".equalsIgnoreCase(str3))) {
/* 814 */                       arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                            }
/* 817 */                   Olill00lIoo olill00lIoo = ExtraSupportedSurfaceCombinationsQuirk.I00000oIO;
/* 819 */                   String str9 = Build.DEVICE;
/* 860 */                   if (oOil00Iill3.I00000oIO(ExtraSupportedSurfaceCombinationsQuirk.class, "heroqltevzw".equalsIgnoreCase(str9) || "heroqltetmo".equalsIgnoreCase(str9) || ilO10l0.I00000oIO() || ilO10l0.I00000oOI())) {
/* 867 */                       arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                            }
/* 870 */                   List list3 = Nexus4AndroidLTargetAspectRatioQuirk.I00000oIO;
/* 876 */                   if (!str4.equalsIgnoreCase("Google")) {
/* 880 */                       Build.BRAND.equalsIgnoreCase("Google");
                            }
/* 889 */                   if (oOil00Iill3.I00000oIO(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
/* 896 */                       arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                            }
/* 899 */                   List list4 = PreviewPixelHDRnetQuirk.I00000oIO;
/* 940 */                   if (oOil00Iill3.I00000oIO(PreviewPixelHDRnetQuirk.class, (str4.equalsIgnoreCase("Google") || Build.BRAND.equalsIgnoreCase("Google")) && PreviewPixelHDRnetQuirk.I00000oIO.contains(str9.toLowerCase(Locale.getDefault())))) {
/* 947 */                       arrayList3.add(new PreviewPixelHDRnetQuirk());
                            }
/* 983 */                   if (oOil00Iill3.I00000oIO(RepeatingStreamConstraintForVideoRecordingQuirk.class, (str4.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "mha-l29".equalsIgnoreCase(str3))) {
/* 990 */                       arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                            }
/* 1028 */                  if (oOil00Iill3.I00000oIO(StillCaptureFlashStopRepeatingQuirk.class, (str4.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && OlOolloIIOl0.I000l1(str3.toUpperCase(locale2), "SM-A716", false))) {
/* 1035 */                      arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                            }
/* 1054 */                  if (oOil00Iill3.I00000oIO(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.I00000oIO.contains(str3.toLowerCase(locale2)))) {
/* 1061 */                      arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                            }
/* 1064 */                  List list5 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.I00000oIO;
/* 1107 */                  if (oOil00Iill3.I00000oIO(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, (str4.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.I00000oIO.contains(Build.HARDWARE.toLowerCase(Locale.getDefault())))) {
/* 1114 */                      arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                            }
/* 1123 */                  if (oOil00Iill3.I00000oIO(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
/* 1130 */                      arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                            }
/* 1133 */                  List list6 = ZslDisablerQuirk.I00000oIO;
/* 1139 */                  if (((!str4.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) || !liIilIiO.I00000oIO(ZslDisablerQuirk.I00000oIO)) && ((!str4.equalsIgnoreCase("Xiaomi") && !Build.BRAND.equalsIgnoreCase("Xiaomi")) || !liIilIiO.I00000oIO(ZslDisablerQuirk.I00000oOI))) {
/* 1181 */                      z = false;
                            }
/* 1188 */                  if (oOil00Iill3.I00000oIO(ZslDisablerQuirk.class, z)) {
/* 1195 */                      arrayList3.add(new ZslDisablerQuirk());
                            }
/* 1214 */                  if (oOil00Iill3.I00000oIO(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.I00000oIO.containsKey(str3.toUpperCase(locale2)))) {
/* 1221 */                      arrayList3.add(new SmallDisplaySizeQuirk());
                            }
/* 1232 */                  if (oOil00Iill3.I00000oIO(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.I00000oOI)) {
/* 1236 */                      arrayList3.add(PreviewUnderExposureQuirk.I00000oIO);
                            }
/* 1242 */                  IiOoli.I00000oIO = new OOil0lI(arrayList3);
/* 1244 */                  OOil0lI oOil0lI = IiOoli.I00000oIO;
/* 1246 */                  if (oOil0lI == null) {
/* 1257 */                      O0000Ioio00.I000OOo1O("all");
/* 1261 */                      throw null;
                            }
/* 1248 */                  OOil0lI.I0000O(oOil0lI);
/* 1251 */                  l11I11lO.I0000O(3, "DeviceQuirks");
/* 1254 */                  return;
                        default:
/* 17 */                    return;
                    }
                }
            }
