            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.Configuration;
            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.inputmethodservice.InputMethodService;
            import android.os.Build;
            import android.util.Log;
            import android.util.Range;
            import android.util.Size;
            import android.view.View;
            import android.view.WindowManager;
            import androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
            import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
            import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
            import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
            import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
            import androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
            import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
            import androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk;
            import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
            import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
            import androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
            import androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk;
            import androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk;
            import androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
            import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
            import androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
            import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
            import androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk;
            import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
            import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
            import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
            import androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk;
            import androidx.work.impl.WorkDatabase;
            import com.google.ai.edge.litertlm.Conversation;
            import com.google.ai.edge.litertlm.Engine;
            import com.google.ai.edge.litertlm.EngineConfig;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class I0OIOO00l0O implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;

                public I0OIOO00l0O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:136:0x038f  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x03c2  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0407  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x043a  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x048e  */
                /* JADX WARN: Removed duplicated region for block: B:327:0x06a3  */
                /* JADX WARN: Removed duplicated region for block: B:355:0x070b  */
                /* JADX WARN: Removed duplicated region for block: B:366:0x072b  */
                /* JADX WARN: Removed duplicated region for block: B:378:0x075c  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x02cd  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    Object[] objArr;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    boolean z10;
/* 3 */             int i = this.I00iOIl;
/* 8 */             int i2 = 0;
/* 8 */             z = false;
/* 8 */             z = false;
/* 8 */             z = false;
/* 8 */             boolean z11 = false;
/* 10 */            Range range = null;
/* 10 */            context = null;
/* 10 */            Context context = null;
/* 10 */            range = null;
/* 10 */            range = null;
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 2306 */                  Range[] rangeArr = (Range[]) ((IIioli) ((IIlo0i0ll) this.I00iiI)).I0000O(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
/* 2308 */                  if (rangeArr != null && rangeArr.length != 0) {
/* 2315 */                      int length = rangeArr.length;
/* 2316 */                      while (i2 < length) {
/* 2318 */                          Range range2 = rangeArr[i2];
/* 2324 */                          Integer numValueOf = (Integer) range2.getUpper();
/* 2330 */                          Integer numValueOf2 = (Integer) range2.getLower();
/* 2344 */                          if (((Number) range2.getUpper()).intValue() >= 1000) {
/* 2357 */                              numValueOf = Integer.valueOf(((Number) range2.getUpper()).intValue() / 1000);
                                    }
/* 2371 */                          if (((Number) range2.getLower()).intValue() >= 1000) {
/* 2384 */                              numValueOf2 = Integer.valueOf(((Number) range2.getLower()).intValue() / 1000);
                                    }
/* 2390 */                          Range range3 = new Range(numValueOf2, numValueOf);
/* 2397 */                          Integer num = (Integer) range3.getUpper();
/* 2399 */                          if (num != null && num.intValue() == 30 && (range == null || ((Number) range3.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
/* 2436 */                              range = range3;
                                    }
/* 2437 */                          i2++;
                                }
                            }
/* 2440 */                  return range;
                        case 1:
/* 2289 */                  return OoI0l01O.I00000oIO(((OoI0l01O) ((Iio0oiOoI0) this.I00iiI).I00ilI0I1.getValue()).I00000oIO);
                        case 2:
/* 2271 */                  il001oo1.I00000oOI(((I0olOi00O) this.I00iiI).I00iiO, null);
/* 2274 */                  return ooiIlOl1iI;
                        case 3:
/* 2261 */                  il1ollIO0I.I00000oIO((I0oo10O) this.I00iiI);
/* 2264 */                  return ooiIlOl1iI;
                        case 4:
/* 2252 */                  return ((Olol1IOOol0) this.I00iiI).I00O10llo();
                        case 5:
/* 2247 */                  return ooiIlOl1iI;
                        case 6:
/* 2242 */                  return iOO1OO.I00000oIO((Object[]) this.I00iiI);
                        case 7:
/* 2233 */                  return String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((OIool0l11) this.I00iiI).I000II() / 1000.0f)}, 1));
                        case 8:
/* 2203 */                  return new i0i0iII(((I1o1Ii0I) this.I00iiI).I00000oIO, i0i0iII.I000iOII, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O);
                        case 9:
/* 2186 */                  return (I1111OO10i) this.I00iiI;
                        case 10:
/* 2177 */                  Engine engine = new Engine(new EngineConfig((String) ((I1I0i0Ilo1Oi) this.I00iiI).I00iiI, null, null, null, null, null, null, 126, null));
/* 2180 */                  engine.initialize();
/* 2183 */                  return engine;
                        case 11:
/* 2143 */                  Conversation conversation = (Conversation) this.I00iiI;
                            try {
/* 2145 */                      conversation.cancelProcess();
                            } catch (Throwable unused) {
                            }
                            try {
/* 2148 */                      conversation.close();
                            } catch (Throwable unused2) {
                            }
/* 2151 */                  return ooiIlOl1iI;
                        case 12:
/* 2138 */                  return (OOo0IO) this.I00iiI;
                        case 13:
/* 2113 */                  Size[] sizeArrI00000oIO = ((CamcorderProfileResolutionQuirk) this.I00iiI).I00000oIO.I00000oIO(34);
/* 2124 */                  Object objAsList = sizeArrI00000oIO != null ? Arrays.asList(sizeArrI00000oIO) : Il01100l.I00iOIl;
/* 2130 */                  if (l11I11lO.I0000O(3, "CXCP")) {
/* 2132 */                      objAsList.toString();
                            }
/* 2135 */                  return objAsList;
                        case 14:
/* 2102 */                  return (IIlOil01ol) ((IIl01i0I) this.I00iiI).I0000O.get();
                        case 15:
/* 482 */                   IIo0OlO iIo0OlO = (IIo0OlO) this.I00iiI;
/* 484 */                   OOil0O0OoI oOil0O0OoI = OOil0O0OoI.I0000Il00O;
/* 486 */                   oOil0O0OoI.getClass();
                            try {
/* 495 */                       Object obj = ((AtomicReference) oOil0O0OoI.I00000oIO.I00iio).get();
/* 501 */                       if (obj instanceof I1lIo10011) {
/* 2082 */                          throw null;
                                }
/* 509 */                       OOil00Iill oOil00Iill = (OOil00Iill) iIllIoiiIO.I0000O(obj).I00iiI;
/* 513 */                       ArrayList arrayList = new ArrayList();
/* 516 */                       IIlo0i0ll iIlo0i0ll = iIo0OlO.I00000oIO;
/* 518 */                       if (iIlo0i0ll == null) {
/* 525 */                           if (l11I11lO.I0000O(6, "CXCP")) {
/* 529 */                               Log.e("CXCP", "Failed to enable quirks: camera metadata injection failed");
                                    }
/* 534 */                           return new OOil0lI(arrayList);
                                }
/* 541 */                       IIlo0i0ll.I000OiO.getClass();
/* 554 */                       if (oOil00Iill.I00000oIO(AeFpsRangeLegacyQuirk.class, IIlo0OOlI.I00000oOI(iIlo0i0ll))) {
/* 558 */                           AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = new AeFpsRangeLegacyQuirk();
/* 563 */                           I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(i2);
/* 566 */                           i0OIOO00l0O.I00iiI = iIlo0i0ll;
/* 568 */                           VarHandle.storeStoreFence();
/* 576 */                           aeFpsRangeLegacyQuirk.I00000oIO = new OllO00oiil(i0OIOO00l0O);
/* 578 */                           VarHandle.storeStoreFence();
/* 581 */                           arrayList.add(aeFpsRangeLegacyQuirk);
                                }
/* 592 */                       if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
/* 596 */                           Build.BRAND.equalsIgnoreCase("Samsung");
                                }
/* 605 */                       if (oOil00Iill.I00000oIO(AfRegionFlipHorizontallyQuirk.class, false)) {
/* 612 */                           arrayList.add(new AfRegionFlipHorizontallyQuirk());
                                }
/* 615 */                       IIlo0OOlI.I00000oOI(iIlo0i0ll);
/* 624 */                       if (oOil00Iill.I00000oIO(AspectRatioLegacyApi21Quirk.class, false)) {
/* 631 */                           arrayList.add(new AspectRatioLegacyApi21Quirk());
                                }
/* 644 */                       if (oOil00Iill.I00000oIO(CamcorderProfileResolutionQuirk.class, IIlo0OOlI.I00000oOI(iIlo0i0ll))) {
/* 648 */                           OlOIOo0 olOIOo0 = iIo0OlO.I00000oOI;
/* 650 */                           CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = new CamcorderProfileResolutionQuirk();
/* 653 */                           camcorderProfileResolutionQuirk.I00000oIO = olOIOo0;
/* 659 */                           I0OIOO00l0O i0OIOO00l0O2 = new I0OIOO00l0O(13);
/* 662 */                           i0OIOO00l0O2.I00iiI = camcorderProfileResolutionQuirk;
/* 664 */                           VarHandle.storeStoreFence();
/* 672 */                           camcorderProfileResolutionQuirk.I00000oOI = new OllO00oiil(i0OIOO00l0O2);
/* 674 */                           VarHandle.storeStoreFence();
/* 677 */                           arrayList.add(camcorderProfileResolutionQuirk);
                                }
/* 694 */                       if (CameraNoResponseWhenEnablingFlashQuirk.I00000oIO.contains(Build.MODEL.toUpperCase(Locale.ROOT))) {
/* 705 */                           Integer num2 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 718 */                           z = num2 != null && num2.intValue() == 1;
                                }
/* 725 */                       if (oOil00Iill.I00000oIO(CameraNoResponseWhenEnablingFlashQuirk.class, z)) {
/* 732 */                           arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
                                }
/* 741 */                       if (oOil00Iill.I00000oIO(CaptureSessionStuckQuirk.class, false)) {
/* 748 */                           arrayList.add(new CaptureSessionStuckQuirk());
                                }
/* 757 */                       if (oOil00Iill.I00000oIO(CloseCaptureSessionOnVideoQuirk.class, true)) {
/* 764 */                           arrayList.add(new CloseCaptureSessionOnVideoQuirk());
                                }
/* 777 */                       if (oOil00Iill.I00000oIO(ConfigureSurfaceToSecondarySessionFailQuirk.class, IIlo0OOlI.I00000oOI(iIlo0i0ll))) {
/* 784 */                           arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
                                }
/* 793 */                       if (oOil00Iill.I00000oIO(FinalizeSessionOnCloseQuirk.class, true)) {
/* 800 */                           arrayList.add(new FinalizeSessionOnCloseQuirk());
                                }
/* 805 */                       Iterator it = FlashTooSlowQuirk.I00000oIO.iterator();
                                while (true) {
/* 813 */                           if (it.hasNext()) {
/* 833 */                               if (OlOolloIIOl0.I000l1(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
/* 844 */                                   Integer num3 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 846 */                                   if (num3 != null && num3.intValue() == 1) {
/* 855 */                                       z2 = true;
                                            }
                                        }
                                    }
                                }
/* 857 */                       z2 = false;
/* 864 */                       if (oOil00Iill.I00000oIO(FlashTooSlowQuirk.class, z2)) {
/* 871 */                           arrayList.add(new FlashTooSlowQuirk());
                                }
/* 874 */                       List list = ImageCaptureFailWithAutoFlashQuirk.I00000oIO;
/* 876 */                       String str = Build.MODEL;
/* 878 */                       Locale locale = Locale.ROOT;
/* 888 */                       if (list.contains(str.toLowerCase(locale))) {
/* 899 */                           Integer num4 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 912 */                           z3 = num4 != null && num4.intValue() == 0;
                                }
/* 919 */                       if (oOil00Iill.I00000oIO(ImageCaptureFailWithAutoFlashQuirk.class, z3)) {
/* 926 */                           arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
                                }
/* 939 */                       if (ImageCaptureFlashNotFireQuirk.I00000oOI.contains(str.toLowerCase(locale))) {
/* 950 */                           Integer num5 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 963 */                           objArr = num5 != null && num5.intValue() == 0;
                                }
/* 988 */                       if (oOil00Iill.I00000oIO(ImageCaptureFlashNotFireQuirk.class, objArr == true || ImageCaptureFlashNotFireQuirk.I00000oIO.contains(str.toLowerCase(locale)))) {
/* 995 */                           arrayList.add(new ImageCaptureFlashNotFireQuirk());
                                }
/* 1008 */                      if (ImageCaptureWashedOutImageQuirk.I00000oIO.contains(str.toUpperCase(locale))) {
/* 1019 */                          Integer num6 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 1032 */                          z4 = num6 != null && num6.intValue() == 1;
                                }
/* 1039 */                      if (oOil00Iill.I00000oIO(ImageCaptureWashedOutImageQuirk.class, z4)) {
/* 1046 */                          arrayList.add(new ImageCaptureWashedOutImageQuirk());
                                }
/* 1059 */                      if (ImageCaptureWithFlashUnderexposureQuirk.I00000oIO.contains(str.toLowerCase(locale))) {
/* 1070 */                          Integer num7 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 1083 */                          z5 = num7 != null && num7.intValue() == 1;
                                }
/* 1090 */                      if (oOil00Iill.I00000oIO(ImageCaptureWithFlashUnderexposureQuirk.class, z5)) {
/* 1097 */                          arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
                                }
/* 1118 */                      if (oOil00Iill.I00000oIO(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.I00000oIO.contains(Build.DEVICE.toLowerCase(locale)))) {
/* 1125 */                          arrayList.add(new JpegHalCorruptImageQuirk());
                                }
/* 1128 */                      JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = JpegCaptureDownsizingQuirk.I00000oIO;
/* 1130 */                      jpegCaptureDownsizingQuirk.getClass();
/* 1143 */                      if (JpegCaptureDownsizingQuirk.I00000oOI.contains(str.toLowerCase(locale))) {
/* 1154 */                          Integer num8 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 1167 */                          z6 = num8 != null && num8.intValue() == 0;
                                }
/* 1174 */                      if (oOil00Iill.I00000oIO(JpegCaptureDownsizingQuirk.class, z6)) {
/* 1176 */                          arrayList.add(jpegCaptureDownsizingQuirk);
                                }
/* 1181 */                      IIlo0i0ll.I000OiO.getClass();
/* 1194 */                      if (oOil00Iill.I00000oIO(PreviewOrientationIncorrectQuirk.class, IIlo0OOlI.I00000oOI(iIlo0i0ll))) {
/* 1201 */                          arrayList.add(new PreviewOrientationIncorrectQuirk());
                                }
/* 1210 */                      if (oOil00Iill.I00000oIO(TextureViewIsClosedQuirk.class, false)) {
/* 1217 */                          arrayList.add(new TextureViewIsClosedQuirk());
                                }
/* 1222 */                      Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.I00000oIO.iterator();
                                while (true) {
/* 1230 */                          if (it2.hasNext()) {
/* 1250 */                              if (Build.MODEL.toUpperCase(Locale.ROOT).equals((String) it2.next())) {
/* 1261 */                                  Integer num9 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 1263 */                                  if (num9 != null && num9.intValue() == 0) {
/* 1272 */                                      z7 = true;
                                            }
                                        }
                                    }
                                }
/* 1274 */                      z7 = false;
/* 1281 */                      if (oOil00Iill.I00000oIO(TorchFlashRequiredFor3aUpdateQuirk.class, z7)) {
/* 1288 */                          arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk());
                                }
/* 1291 */                      String str2 = Build.MANUFACTURER;
/* 1456 */                      if (oOil00Iill.I00000oIO(YuvImageOnePixelShiftQuirk.class, ((str2.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "MotoG3".equalsIgnoreCase(Build.MODEL)) || ((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-G532F".equalsIgnoreCase(Build.MODEL)) || (((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-J700F".equalsIgnoreCase(Build.MODEL)) || (((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-A920F".equalsIgnoreCase(Build.MODEL)) || (((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "SM-J415F".equalsIgnoreCase(Build.MODEL)) || ((str2.equalsIgnoreCase("Xiaomi") || Build.BRAND.equalsIgnoreCase("Xiaomi")) && "Mi A1".equalsIgnoreCase(Build.MODEL))))))) {
/* 1463 */                          arrayList.add(new YuvImageOnePixelShiftQuirk());
                                }
/* 1629 */                      if (oOil00Iill.I00000oIO(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ((str2.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (((str2.equalsIgnoreCase("Oppo") || Build.BRAND.equalsIgnoreCase("Oppo")) && "A37F".equalsIgnoreCase(Build.MODEL)) || ((str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
/* 1636 */                          arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
                                }
/* 1663 */                      if (oOil00Iill.I00000oIO(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, str2.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei"))) {
/* 1670 */                          arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
                                }
/* 1677 */                      if (str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
/* 1689 */                          IIlo0i0ll.I000OiO.getClass();
/* 1700 */                          z8 = IIlo0OOlI.I00000oOI(iIlo0i0ll);
                                }
/* 1707 */                      if (oOil00Iill.I00000oIO(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, z8)) {
/* 1714 */                          arrayList.add(new QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
                                }
/* 1721 */                      if (ioIiii1.I00000oIO() || ioIiii1.I00000oOI() || ioIiii1.I0000O() || ioIiii1.I0000Il00O()) {
/* 1836 */                          z9 = true;
                                } else {
/* 1741 */                          String str3 = Build.MODEL;
/* 1745 */                          "pixel 4 xl".equalsIgnoreCase(str3);
/* 1752 */                          if ((!str2.equalsIgnoreCase("Motorola") && !Build.BRAND.equalsIgnoreCase("Motorola")) || !"moto e13".equalsIgnoreCase(str3)) {
/* 1775 */                              if (str2.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) {
/* 1785 */                                  String str4 = Build.DEVICE;
/* 1793 */                                  if (!"gta8".equalsIgnoreCase(str4) && !"gta8wifi".equalsIgnoreCase(str4)) {
/* 1808 */                                      if (((!str2.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) || !OlOolloIIOl0.I000l1(str3, "SM-A536", false)) && !il1Io00o.I00000oIO()) {
/* 1834 */                                          z9 = false;
                                                }
                                            }
                                        }
                                    }
                                }
/* 1843 */                      if (oOil00Iill.I00000oIO(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z9)) {
/* 1850 */                          arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                                }
/* 1853 */                      String str5 = Build.MODEL;
/* 1861 */                      if ("Pixel 8".equalsIgnoreCase(str5)) {
/* 1872 */                          Integer num10 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 1885 */                          z10 = num10 != null && num10.intValue() == 0;
                                }
/* 1892 */                      if (oOil00Iill.I00000oIO(TemporalNoiseQuirk.class, z10)) {
/* 1899 */                          arrayList.add(new TemporalNoiseQuirk());
                                }
/* 1954 */                      if (oOil00Iill.I00000oIO(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.I00000oIO.contains(str5.toLowerCase(Locale.ROOT)) || il1Io00o.I00000oIO() || ((str2.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "FIG-LX1".equalsIgnoreCase(str5)))) {
/* 1961 */                          arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                                }
/* 1974 */                      if (oOil00Iill.I00000oIO(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, iO1oiilli.I00000oIO())) {
/* 1981 */                          arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
                                }
/* 1984 */                      List list2 = UltraWideFlashCaptureUnderexposureQuirk.I00000oIO;
/* 1990 */                      if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 2002 */                          Iterator it3 = list2.iterator();
                                    while (true) {
/* 2010 */                              if (it3.hasNext()) {
/* 2030 */                                  if (OlOolloIIOl0.I000l1(Build.MODEL.toLowerCase(Locale.ROOT), (String) it3.next(), false)) {
/* 2040 */                                      Integer num11 = (Integer) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_FACING);
/* 2042 */                                      if (num11 != null && num11.intValue() == 1) {
/* 2051 */                                          z11 = true;
                                                }
                                            }
                                        }
                                    }
                                }
/* 2058 */                      if (oOil00Iill.I00000oIO(UltraWideFlashCaptureUnderexposureQuirk.class, z11)) {
/* 2065 */                          arrayList.add(new UltraWideFlashCaptureUnderexposureQuirk());
                                }
/* 2070 */                      OOil0lI oOil0lI = new OOil0lI(arrayList);
/* 2073 */                      OOil0lI.I0000O(oOil0lI);
/* 2078 */                      l11I11lO.I0000O(3, "CameraQuirks");
/* 2081 */                      return oOil0lI;
                            } catch (InterruptedException | ExecutionException e) {
/* 2091 */                      throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
                            }
                        case 16:
/* 458 */                   i01IlOO i01iloo = (i01IlOO) this.I00iiI;
/* 460 */                   WorkDatabase workDatabase = i01iloo.I0000Il00O;
/* 466 */                   I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(16);
/* 469 */                   i0iOo0oioiO.I00iiI = workDatabase;
/* 471 */                   i0iOo0oioiO.I00iiO = i01iloo;
/* 473 */                   VarHandle.storeStoreFence();
/* 476 */                   workDatabase.I0010I0i(i0iOo0oioiO);
/* 479 */                   return ooiIlOl1iI;
                        case 17:
/* 453 */                   return (OolIOoI1IiO) ((IO01o11o0lI0) this.I00iiI).I000O01llI0.get();
                        case PoseLandmark.RIGHT_PINKY:
/* 440 */                   return (IO01o11o0lI0) ((IO01oI0l101o) this.I00iiI).I00000oIO.get();
                        case PoseLandmark.LEFT_INDEX:
/* 425 */                   return "Initializing MCP client with capabilities: " + ((IOIo001i1o) this.I00iiI).I00100l0;
                        case PoseLandmark.RIGHT_INDEX:
/* 404 */                   return IIl001iO0Io.I000o00OoI0I("Failed to initialize client: ", ((Throwable) this.I00iiI).getMessage());
                        case PoseLandmark.LEFT_THUMB:
/* 389 */                   return ((Iterable) this.I00iiI).iterator();
                        case PoseLandmark.RIGHT_THUMB:
/* 375 */                   IllOOo00lI illOOo00lI = ((IOOoIo0) this.I00iiI).I010i10l;
/* 377 */                   if (illOOo00lI != null) {
/* 379 */                       illOOo00lI.invoke();
                            }
/* 382 */                   return Boolean.TRUE;
                        case PoseLandmark.LEFT_HIP:
/* 139 */                   IOl10lI1 iOl10lI1 = (IOl10lI1) this.I00iiI;
/* 143 */                   boolean zI0000Il00O = IooOl0ol01.I0000Il00O(0L, 0L);
/* 147 */                   View view = iOl10lI1.I00000oIO;
/* 149 */                   if (!zI0000Il00O) {
/* 366 */                       return new IiO0iOIIl(0L, iOIl1O.I00000oIO(view.getContext()).I00100o1O0lo(l000O1l.I00000oOI(0L)));
                            }
/* 151 */                   Context context2 = view.getContext();
/* 155 */                   Context baseContext = context2;
/* 158 */                   while (baseContext instanceof ContextWrapper) {
/* 162 */                       if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
/* 164 */                           context = baseContext;
/* 197 */                           if (context == null) {
                                    }
                                } else {
/* 176 */                           ContextWrapper contextWrapper = (ContextWrapper) baseContext;
/* 182 */                           if (contextWrapper.getBaseContext() == null) {
/* 197 */                               if (context == null) {
/* 298 */                                   Configuration configuration = context2.getResources().getConfiguration();
/* 302 */                                   IiIoooOi1 iiIoooOi1I00000oIO = iOIl1O.I00000oIO(context2);
/* 312 */                                   long jI00000oIO = il1llI.I00000oIO(configuration.screenWidthDp, configuration.screenHeightDp);
/* 316 */                                   long jI00oI0i = iiIoooOi1I00000oIO.I00oI0i(jI00000oIO);
/* 343 */                                   return new IiO0iOIIl((((int) Float.intBitsToFloat((int) (jI00oI0i & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (jI00oI0i >> 32))) << 32), jI00000oIO);
                                        }
/* 201 */                               i00oiO1iiI1.I00000oIO.getClass();
/* 204 */                               i00o0I i00o0i = i00o0I.I00000oIO;
/* 206 */                               i00o0I i00o0i2 = i00o0I.I00000oIO;
/* 231 */                               WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
/* 237 */                               Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
/* 245 */                               windowManager.getCurrentWindowMetrics().getDensity();
/* 250 */                               II1i0o0 iI1i0o0 = new II1i0o0(bounds);
/* 275 */                               long jHeight = (iI1i0o0.I0000Il00O().height() & 4294967295L) | (iI1i0o0.I0000Il00O().width() << 32);
/* 290 */                               return new IiO0iOIIl(jHeight, iOIl1O.I00000oIO(context).I00100o1O0lo(l000O1l.I00000oOI(jHeight)));
                                    }
/* 185 */                           baseContext = contextWrapper.getBaseContext();
                                }
                            }
/* 197 */                   if (context == null) {
                            }
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 132 */                   return ((O0oIlOolIO) this.I00iiI).I0000O();
                        case PoseLandmark.LEFT_KNEE:
/* 124 */                   return new Oo0I110i((OIilII) this.I00iiI, 0.0f);
                        case PoseLandmark.RIGHT_KNEE:
/* 113 */                   ((Oloo01) this.I00iiI).close();
/* 116 */                   return ooiIlOl1iI;
                        case 27:
/* 76 */                    IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiI;
/* 84 */                    IiIooOOOI iiIooOOOI = (IiIooOOOI) iiloOlIoIool.I0000Il00O.getValue();
/* 86 */                    if (iiIooOOOI != null) {
/* 88 */                        OoIoO0I0oOI ooIoO0I0oOI = OII0IoiI.I00000oIO;
/* 96 */                        return Float.valueOf(iiIooOOOI.I00i0ilIl0i(400.0f));
                            }
/* 105 */                   OIiilo1Ool0o.I0010o(iiloOlIoIool, "The density on DrawerState (", ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?");
/* 10 */                    return null;
                        case PoseLandmark.RIGHT_ANKLE:
/* 69 */                    return OoI0l01O.I00000oIO(((OoI0l01O) ((Il1iiO) this.I00iiI).I00iio.getValue()).I00000oIO);
                        default:
/* 20 */                    OlO0OIIl1 olO0OIIl1 = ((IlI1loI1lO1) this.I00iiI).I00000oOI;
/* 51 */                    olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, null, null, Il01100l.I00iOIl, null, 0.0f, false, false, false, 2015));
/* 54 */                    return ooiIlOl1iI;
                    }
                }
            }
