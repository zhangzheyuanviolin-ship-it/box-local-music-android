            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraManager;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.os.Vibrator;
            import android.os.VibratorManager;
            import android.speech.SpeechRecognizer;
            import android.speech.tts.TextToSpeech;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.Range;
            import android.util.Rational;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
            import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
            import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
            import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
            import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.text.TextRecognition;
            import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class Ii10Oil1 implements OOiIoli {
                public final int I00000oIO;
                public final int I00000oOI;
                public final Object I0000Il00O;
                public final Object I0000O;

                public Ii10Oil1(Object obj, int i, int i2, Object obj2) {
/* 1 */             this.I00000oIO = i2;
/* 3 */             this.I0000Il00O = obj;
/* 5 */             this.I0000O = obj2;
/* 7 */             this.I00000oOI = i;
                }

                private final Object I00000oIO() throws NumberFormatException {
                    String str;
                    Size[] outputSizes;
                    Size[] sizeArr;
                    Integer num;
                    ArrayList arrayList;
                    Object next;
                    String str2;
/* 3 */             int i = -1;
/* 8 */             boolean z = false;
/* 8 */             z = false;
/* 8 */             z = false;
/* 8 */             boolean z2 = false;
/* 8 */             z = false;
/* 8 */             boolean z3 = false;
/* 8 */             z = false;
/* 8 */             boolean z4 = false;
/* 13 */            int i2 = this.I00000oOI;
/* 20 */            ArrayList arrayList2 = null;
/* 21 */            int iIntValue = 1;
                    switch (i2) {
                        case 0:
/* 2987 */                  IIlIi0lIii iIlIi0lIii = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 2989 */                  iIlIi0lIii.getClass();
/* 3002 */                  OolOO1oOoo oolOO1oOoo = (OolOO1oOoo) ((Ii10i0iO1) this.I0000O).I00IOO.get();
/* 3014 */                  IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) ((Ii10i0iO1) this.I0000O).I00IO1.get();
/* 3026 */                  IIlO1O0lOl iIlO1O0lOl = (IIlO1O0lOl) ((Ii10i0iO1) this.I0000O).I00IioO0OiOi.get();
/* 3038 */                  OolOi0i oolOi0i = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 3050 */                  IIo0ll0o iIo0ll0o = (IIo0ll0o) ((Ii10i0iO1) this.I0000O).I001iOo1i0O.get();
/* 3052 */                  IIlll1OOiIO1 iIlll1OOiIO1 = new IIlll1OOiIO1();
/* 3055 */                  iIlll1OOiIO1.I00iOIl = oolOO1oOoo;
/* 3057 */                  iIlll1OOiIO1.I00iiI = iIllOioOlolI;
/* 3059 */                  iIlll1OOiIO1.I00iiO = iIlO1O0lOl;
/* 3061 */                  iIlll1OOiIO1.I00iio = oolOi0i;
/* 3063 */                  iIlll1OOiIO1.I00ilI0I1 = iIo0ll0o;
/* 3065 */                  String str3 = iIlIi0lIii.I00iiI;
/* 3067 */                  iIlll1OOiIO1.I00ilO0 = str3;
/* 3071 */                  iIlll1OOiIO1.I00io1l = IIlIool0Oi0O.I00000oIO;
/* 3073 */                  I1OollilIo i1OollilIo = IIllo10oO.I00000oIO;
/* 3075 */                  i1OollilIo.getClass();
/* 3084 */                  iIlll1OOiIO1.I00ioIO = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 3092 */                  iIlll1OOiIO1.I00l0I0l0lO1 = iOOOIOoiIlII.I00000oIO(false);
/* 3098 */                  if (!l11I11lO.I0000O(3, "CXCP")) {
/* 3110 */                      VarHandle.storeStoreFence();
/* 3113 */                      return iIlll1OOiIO1;
                            }
/* 3100 */                  iIlll1OOiIO1.toString();
/* 3103 */                  IIllI0o.I0000Il00O(str3);
/* 3106 */                  VarHandle.storeStoreFence();
/* 3109 */                  return iIlll1OOiIO1;
                        case 1:
/* 2343 */                  I0Oi111ii i0Oi111ii = ((Ii10Ioo00l) this.I0000Il00O).I00000oIO;
/* 2347 */                  IIloOiil iIloOiil = (IIloOiil) i0Oi111ii.I00iio;
/* 2351 */                  IIlOO01iI iIlOO01iI = (IIlOO01iI) i0Oi111ii.I00ilO0;
/* 2353 */                  lII11l.I00000oOI(iIlOO01iI);
/* 2360 */                  Ii10Ioo00l ii10Ioo00l = (Ii10Ioo00l) this.I0000Il00O;
/* 2364 */                  Ii10i0iO1 ii10i0iO1 = (Ii10i0iO1) this.I0000O;
/* 2368 */                  IIlio101Io iIlio101Io = new IIlio101Io(9);
/* 2371 */                  iIlio101Io.I00iiI = ii10Ioo00l;
/* 2373 */                  iIlio101Io.I00iiO = ii10i0iO1;
/* 2375 */                  VarHandle.storeStoreFence();
/* 2384 */                  i0I11I i0i11i = (i0I11I) ii10i0iO1.I0001Ioi1lo.get();
/* 2396 */                  O1Iioo1 o1Iioo1 = (O1Iioo1) ((Ii10i0iO1) this.I0000O).I000o00OoI0I.get();
/* 2400 */                  Ii10i0iO1 ii10i0iO12 = (Ii10i0iO1) this.I0000O;
/* 2402 */                  ii10i0iO12.getClass();
/* 2407 */                  Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 2412 */                  ArrayList arrayList3 = new ArrayList(9);
/* 2415 */                  oi00IilOloo0.I00iOIl = arrayList3;
/* 2417 */                  VarHandle.storeStoreFence();
/* 2426 */                  oi00IilOloo0.I0010o(ii10i0iO12.I00100l0.get());
/* 2435 */                  oi00IilOloo0.I0010o(ii10i0iO12.I0010I0i.get());
/* 2444 */                  oi00IilOloo0.I0010o(ii10i0iO12.I0010o.get());
/* 2453 */                  oi00IilOloo0.I0010o(ii10i0iO12.I000l1.get());
/* 2462 */                  oi00IilOloo0.I0010o(ii10i0iO12.I00111O.get());
/* 2471 */                  oi00IilOloo0.I0010o(ii10i0iO12.I00100o1O0lo.get());
/* 2480 */                  oi00IilOloo0.I0010o(ii10i0iO12.I000o00OoI0I.get());
/* 2489 */                  oi00IilOloo0.I0010o(ii10i0iO12.I001IIilI0O.get());
/* 2498 */                  oi00IilOloo0.I0010o(ii10i0iO12.I001IO000.get());
/* 2530 */                  Set setSingleton = arrayList3.isEmpty() ? Collections.EMPTY_SET : arrayList3.size() == 1 ? Collections.singleton(arrayList3.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList3));
/* 2544 */                  IIiloliili1I iIiloliili1I = (IIiloliili1I) ((Ii10i0iO1) this.I0000O).I001i1lo1io.get();
/* 2556 */                  IIo0ll0o iIo0ll0o2 = (IIo0ll0o) ((Ii10i0iO1) this.I0000O).I001iOo1i0O.get();
/* 2560 */                  Ii10i0iO1 ii10i0iO13 = (Ii10i0iO1) this.I0000O;
/* 2562 */                  IiIio01lo iiIio01lo = ii10i0iO13.I001l0I00;
/* 2564 */                  OOiIoli oOiIoli = ii10i0iO13.I00IO1;
/* 2572 */                  Il0IIIo1I il0IIIo1I = (Il0IIIo1I) ii10i0iO13.I00II0Ol1O0l.get();
/* 2584 */                  IIloIoOOiO0l iIloIoOOiO0l = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 2594 */                  IIoO11o iIoO11o = (IIoO11o) ((Ii10Ioo00l) this.I0000Il00O).I00000oIO.I00io1l;
/* 2608 */                  IIlioOio1 iIlioOio1 = (IIlioOio1) ((Ii10i0iO1) this.I0000O).I00IO1oi11O.get();
/* 2618 */                  Context context = (Context) ((Ii10Ioo00l) this.I0000Il00O).I00000oIO.I00iiI;
/* 2624 */                  IiiIlilOO iiiIlilOOI000l1 = IiiIlilOO.I000II.I000l1(context);
/* 2628 */                  OolOO1oOoo oolOO1oOoo2 = new OolOO1oOoo();
/* 2631 */                  oolOO1oOoo2.I00000oIO = iIloOiil;
/* 2633 */                  oolOO1oOoo2.I00000oOI = iIlOO01iI;
/* 2635 */                  oolOO1oOoo2.I0000Il00O = iIlio101Io;
/* 2637 */                  oolOO1oOoo2.I0000O = i0i11i;
/* 2639 */                  oolOO1oOoo2.I0000oI00 = o1Iioo1;
/* 2641 */                  oolOO1oOoo2.I0001Ioi1lo = setSingleton;
/* 2643 */                  oolOO1oOoo2.I000II = iIiloliili1I;
/* 2645 */                  oolOO1oOoo2.I000O01llI0 = iIo0ll0o2;
/* 2647 */                  oolOO1oOoo2.I000OOo1O = iiIio01lo;
/* 2649 */                  oolOO1oOoo2.I000OiO = oOiIoli;
/* 2651 */                  oolOO1oOoo2.I000iOII = il0IIIo1I;
/* 2653 */                  oolOO1oOoo2.I000l1 = iIloIoOOiO0l;
/* 2655 */                  oolOO1oOoo2.I000lI = iIoO11o;
/* 2659 */                  oolOO1oOoo2.I000o00OoI0I = iIlioOio1;
/* 2666 */                  oolOO1oOoo2.I000oI1ioi = new Object();
/* 2673 */                  oolOO1oOoo2.I00100l0 = new LinkedHashSet();
/* 2680 */                  oolOO1oOoo2.I00100o1O0lo = new LinkedHashSet();
/* 2683 */                  oolOO1oOoo2.I0010o = true;
/* 2685 */                  oolOO1oOoo2.I00111O = true;
/* 2692 */                  oolOO1oOoo2.I001IIilI0O = new LinkedHashSet();
/* 2701 */                  O1ll0lOll1l o1ll0lOll1l = new O1ll0lOll1l(new O1ll0OooIO());
/* 2704 */                  Size size = O1ll11ooo.I00000oIO;
/* 2716 */                  StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((IIioli) iIloIoOOiO0l.I00000oOI).I0000O(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
/* 2718 */                  if (streamConfigurationMap == null) {
/* 17 */                        str = "CXCP";
/* 2727 */                      if (l11I11lO.I0000O(6, str)) {
/* 2731 */                          Log.e(str, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
                                }
/* 2734 */                      outputSizes = null;
                            } else {
/* 17 */                        str = "CXCP";
/* 2740 */                      outputSizes = streamConfigurationMap.getOutputSizes(34);
                            }
/* 2744 */                  if (outputSizes != null && outputSizes.length != 0) {
/* 2753 */                      Size size2 = OlilOlooi1o.I00000oIO;
/* 2763 */                      if (((RepeatingStreamConstraintForVideoRecordingQuirk) IiOoli.I00000oIO(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
/* 2765 */                          sizeArr = outputSizes;
                                } else {
/* 2769 */                          ArrayList arrayList4 = new ArrayList();
/* 2774 */                          for (Size size3 : outputSizes) {
/* 2786 */                              if (OlilOlooi1o.I00000oOI.compare(size3, OlilOlooi1o.I00000oIO) >= 0) {
/* 2788 */                                  arrayList4.add(size3);
                                        }
                                    }
/* 2801 */                          sizeArr = (Size[]) arrayList4.toArray(new Size[0]);
                                }
/* 2804 */                      if (sizeArr.length != 0) {
/* 2819 */                          outputSizes = sizeArr;
                                } else if (l11I11lO.I0000O(5, str)) {
/* 2815 */                          Log.w(str, "No supported output size list, fallback to current list");
                                }
/* 2822 */                      if (outputSizes.length > 1) {
/* 2828 */                          IliIiio1 iliIiio1 = new IliIiio1(24);
/* 2832 */                          if (outputSizes.length > 1) {
/* 2834 */                              Arrays.sort(outputSizes, iliIiio1);
                                    }
                                }
/* 2837 */                      Size sizeI0000Il00O = iiiIlilOOI000l1.I0000Il00O();
/* 2855 */                      long jMin = Math.min(307200L, sizeI0000Il00O.getWidth() * sizeI0000Il00O.getHeight());
/* 2859 */                      int length = outputSizes.length;
/* 2860 */                      int i3 = 0;
/* 2861 */                      Size size4 = null;
                                while (true) {
/* 2862 */                          if (i3 < length) {
/* 2864 */                              Size size5 = outputSizes[i3];
/* 2876 */                              long width = size5.getWidth() * size5.getHeight();
/* 2879 */                              if (width == jMin) {
/* 2881 */                                  size = size5;
                                        } else if (width <= jMin) {
/* 2890 */                                  i3++;
/* 2892 */                                  size4 = size5;
                                        } else if (size4 == null) {
                                        }
                                    }
                                }
/* 2898 */                      size = size4 == null ? outputSizes[0] : size4;
                            }
/* 2900 */                  o1ll0lOll1l.I0010I0i = size;
/* 2907 */                  o1ll0lOll1l.I0010o = new Object();
/* 2909 */                  VarHandle.storeStoreFence();
/* 2912 */                  oolOO1oOoo2.I001IO000 = o1ll0lOll1l;
/* 2927 */                  oolOO1oOoo2.I001i1O0Ol = new OlilioIoO11(context, oolOO1oOoo2.I000l1.I00000oOI, oolOO1oOoo2.I000iOII, IlIIIi.I00100l0);
/* 2938 */                  oolOO1oOoo2.I001i1lo1io = new I0oO0iO1l0lo(oolOO1oOoo2.I000l1.I00000oOI);
/* 2944 */                  Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(18);
/* 2947 */                  ol1OiIli00Ii.I00iiI = oolOO1oOoo2;
/* 2949 */                  VarHandle.storeStoreFence();
/* 2952 */                  oolOO1oOoo2.I001iOo1i0O = ol1OiIli00Ii;
/* 2959 */                  oolOO1oOoo2.I001lIiIIo1O = new ArrayList();
/* 2965 */                  Set setI00iiO = IOOi0Ool1i.I00iiO(oolOO1oOoo2.I0001Ioi1lo);
/* 2971 */                  setI00iiO.add(oolOO1oOoo2.I000II);
/* 2974 */                  oolOO1oOoo2.I001lllioOl = setI00iiO;
/* 2976 */                  VarHandle.storeStoreFence();
/* 2979 */                  return oolOO1oOoo2;
                        case 2:
/* 2257 */                  IIloIoOOiO0l iIloIoOOiO0l2 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 2261 */                  i0I11Oo1 i0i11oo1 = new i0I11Oo1();
/* 2266 */                  i0i11oo1.I00000oIO = iIloIoOOiO0l2.I00000oOI;
/* 2272 */                  OlOi0iollo olOi0iollo = new OlOi0iollo(19);
/* 2275 */                  olOi0iollo.I00iiI = i0i11oo1;
/* 2277 */                  VarHandle.storeStoreFence();
/* 2285 */                  i0i11oo1.I00000oOI = new OllO00oiil(olOi0iollo);
/* 2291 */                  OoOil11Ol1o ooOil11Ol1o = new OoOil11Ol1o();
/* 2296 */                  o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(8);
/* 2304 */                  o00io0iiooo0.I00iio = new Object();
/* 2306 */                  o00io0iiooo0.I00iiI = 3;
/* 2313 */                  o00io0iiooo0.I00iiO = new ArrayDeque(3);
/* 2315 */                  o00io0iiooo0.I00ilI0I1 = ooOil11Ol1o;
/* 2317 */                  VarHandle.storeStoreFence();
/* 2320 */                  i0i11oo1.I0000Il00O = o00io0iiooo0;
/* 2331 */                  i0i11oo1.I0001Ioi1lo = IiOoli.I00000oIO(ZslDisablerQuirk.class) != null;
/* 2333 */                  VarHandle.storeStoreFence();
/* 2336 */                  return i0i11oo1;
                        case 3:
/* 2219 */                  IIlIi0lIii iIlIi0lIii2 = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 2221 */                  iIlIi0lIii2.getClass();
/* 2234 */                  IIlo0i0ll iIlo0i0ll = (IIlo0i0ll) ((Ii10i0iO1) this.I0000O).I0000O.get();
/* 2236 */                  IIloIoOOiO0l iIloIoOOiO0l3 = new IIloIoOOiO0l();
/* 2239 */                  iIloIoOOiO0l3.I00000oIO = iIlIi0lIii2;
/* 2241 */                  iIloIoOOiO0l3.I00000oOI = iIlo0i0ll;
/* 2243 */                  VarHandle.storeStoreFence();
/* 2246 */                  return iIloIoOOiO0l3;
                        case 4:
/* 2185 */                  IIloOiil iIloOiil2 = (IIloOiil) ((Ii10Ioo00l) this.I0000Il00O).I00000oIO.I00iio;
/* 2191 */                  IIlIi0lIii iIlIi0lIii3 = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 2193 */                  iIlIi0lIii3.getClass();
/* 2208 */                  return iIloOiil2.I00000oOI().I0000Il00O().I0000Il00O.I00000oIO(iIlIi0lIii3.I00iiI);
                        case 5:
/* 2063 */                  IIlo0i0ll iIlo0i0ll2 = (IIlo0i0ll) ((Ii10i0iO1) this.I0000O).I0000O.get();
/* 2075 */                  OlO01I1 olO01I1 = (OlO01I1) ((Ii10i0iO1) this.I0000O).I000l1.get();
/* 2087 */                  OolOi0i oolOi0i2 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 2099 */                  IOi0Olo0Ol iOi0Olo0Ol = (IOi0Olo0Ol) ((Ii10i0iO1) this.I0000O).I000lI.get();
/* 2101 */                  O1Iioo1 o1Iioo12 = new O1Iioo1();
/* 2104 */                  o1Iioo12.I00000oIO = olO01I1;
/* 2106 */                  o1Iioo12.I00000oOI = oolOi0i2;
/* 2108 */                  if (iIlo0i0ll2 != null) {
/* 2112 */                      IIlo0i0ll.I000OiO.getClass();
/* 2123 */                      int[] iArr = (int[]) ((IIioli) iIlo0i0ll2).I0000O(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
/* 2133 */                      if (iArr == null ? false : I1IoiO1l.I0000oI00(iArr, 6)) {
/* 2135 */                          z4 = true;
                                }
                            }
/* 2136 */                  o1Iioo12.I0000O = z4;
/* 2143 */                  o1Iioo12.I0001Ioi1lo = new OI0lOii0I(obj);
/* 2150 */                  o1Iioo12.I000II = new AtomicInteger(-1);
/* 2152 */                  if (!z4) {
/* 2173 */                      VarHandle.storeStoreFence();
/* 2176 */                      return o1Iioo12;
                            }
/* 2156 */                  O1Iiol1lIl o1Iiol1lIl = new O1Iiol1lIl();
/* 2159 */                  o1Iiol1lIl.I00iOIl = o1Iioo12;
/* 2161 */                  VarHandle.storeStoreFence();
/* 2166 */                  iOi0Olo0Ol.I00000oIO(o1Iiol1lIl, oolOi0i2.I0000O);
/* 2169 */                  VarHandle.storeStoreFence();
/* 2172 */                  return o1Iioo12;
                        case 6:
/* 1968 */                  IIloIoOOiO0l iIloIoOOiO0l4 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 2006 */                  I1iil1I00 i1iil1I00 = (IiOoli.I00000oIO(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !((IIo0OlO) ((Ii10i0iO1) this.I0000O).I000OiO.get()).I00000oIO().I00000oIO(ImageCaptureFailWithAutoFlashQuirk.class)) ? Iioi0lilII.I00ilI0I1 : l1I0oI.I00iiO;
/* 2018 */                  OolOi0i oolOi0i3 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 2020 */                  OlO01I1 olO01I12 = new OlO01I1();
/* 2023 */                  olO01I12.I00000oIO = iIloIoOOiO0l4;
/* 2025 */                  olO01I12.I00000oOI = i1iil1I00;
/* 2027 */                  olO01I12.I0000Il00O = oolOi0i3;
/* 2034 */                  olO01I12.I0000O = new Object();
/* 2041 */                  olO01I12.I0001Ioi1lo = new ArrayList();
/* 2043 */                  olO01I12.I000O01llI0 = 2;
/* 2045 */                  olO01I12.I000OOo1O = 1;
/* 2047 */                  VarHandle.storeStoreFence();
/* 2050 */                  return olO01I12;
                        case 7:
/* 1952 */                  return new IIo0OlO((IIlo0i0ll) ((Ii10i0iO1) this.I0000O).I0000O.get(), (OlOIOo0) ((Ii10i0iO1) this.I0000O).I000OOo1O.get());
                        case 8:
/* 1922 */                  return new OlOIOo0((StreamConfigurationMap) ((Ii10i0iO1) this.I0000O).I000II.get(), (OIl1o01) ((Ii10i0iO1) this.I0000O).I000O01llI0.get());
                        case 9:
/* 1880 */                  IIlo0i0ll iIlo0i0ll3 = (IIlo0i0ll) ((Ii10i0iO1) this.I0000O).I0000O.get();
/* 1882 */                  if (iIlo0i0ll3 != null) {
/* 1892 */                      return (StreamConfigurationMap) ((IIioli) iIlo0i0ll3).I0000O(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                            }
/* 20 */                    return null;
                        case 10:
/* 1852 */                  IIlo0i0ll iIlo0i0ll4 = (IIlo0i0ll) ((Ii10i0iO1) this.I0000O).I0000O.get();
/* 1866 */                  return new OIl1o01(iIlo0i0ll4);
                        case 11:
/* 1713 */                  IIlIi0lIii iIlIi0lIii4 = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 1715 */                  iIlIi0lIii4.getClass();
/* 1728 */                  Executor executor = ((I1ioIOoI1o0) ((Ii10Ioo00l) this.I0000Il00O).I00000oIO.I00iiO).I00000oIO;
/* 1767 */                  IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(lOi1li0o0.I00000oIO(), ilIl1O1ii0Oo.I00000oIO(executor)).I00ioIO(new Ii00oll("CXCP-UseCase-" + iIlIi0lIii4.I00iiI)));
/* 1773 */                  OolOi0i oolOi0i4 = new OolOi0i();
/* 1776 */                  oolOi0i4.I00000oIO = iIOlO1iiI00000oIO;
/* 1784 */                  new Handler(Looper.getMainLooper());
/* 1791 */                  oolOi0i4.I00000oOI = iOioo01l0.I00000oIO(executor);
/* 1798 */                  oolOi0i4.I0000Il00O = new ThreadLocal();
/* 1802 */                  I0lOoloIoi i0lOoloIoi = new I0lOoloIoi(1);
/* 1805 */                  i0lOoloIoi.I00iiI = oolOi0i4;
/* 1807 */                  VarHandle.storeStoreFence();
/* 1810 */                  oolOi0i4.I0000O = i0lOoloIoi;
/* 1834 */                  oolOi0i4.I0000oI00 = il001oo1.I00000oIO(iIOlO1iiI00000oIO.I00iiI.I00ioIO(lOi1li0o0.I00000oIO()).I00ioIO(ilIl1O1ii0Oo.I00000oIO(i0lOoloIoi)));
/* 1836 */                  VarHandle.storeStoreFence();
/* 1839 */                  return oolOi0i4;
                        case 12:
/* 1705 */                  return new IOi0Olo0Ol();
                        case 13:
/* 1679 */                  Il10IO1II1Io il10IO1II1Io = (Il10IO1II1Io) ((Ii10i0iO1) this.I0000O).I000oI1ioi.get();
/* 1681 */                  Il10101 il10101 = new Il10101();
/* 1684 */                  il10101.I00000oIO = il10IO1II1Io;
/* 1697 */                  il10101.I00000oOI = new Il10IiO(il10IO1II1Io.I0000O, 0, il10IO1II1Io.I0000Il00O, il10IO1II1Io.I0000oI00);
/* 1699 */                  VarHandle.storeStoreFence();
/* 1702 */                  return il10101;
                        case 14:
/* 1562 */                  IIloIoOOiO0l iIloIoOOiO0l5 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 1574 */                  OolOi0i oolOi0i5 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 1586 */                  IOi0Olo0Ol iOi0Olo0Ol2 = (IOi0Olo0Ol) ((Ii10i0iO1) this.I0000O).I000lI.get();
/* 1588 */                  Il10IO1II1Io il10IO1II1Io2 = new Il10IO1II1Io();
/* 1591 */                  il10IO1II1Io2.I00000oIO = oolOi0i5;
/* 1593 */                  il10IO1II1Io2.I00000oOI = iOi0Olo0Ol2;
/* 1595 */                  IIlo0i0ll iIlo0i0ll5 = iIloIoOOiO0l5.I00000oOI;
/* 1597 */                  CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
/* 1599 */                  Object obj = Il100ioI1I.I00000oIO;
/* 1601 */                  IIioli iIioli = (IIioli) iIlo0i0ll5;
/* 1603 */                  Object objI0000O = iIioli.I0000O(key);
/* 1607 */                  if (objI0000O != null) {
/* 1610 */                      obj = objI0000O;
                            }
/* 1611 */                  Range range = (Range) obj;
/* 1613 */                  il10IO1II1Io2.I0000Il00O = range;
/* 1619 */                  Integer num2 = (Integer) range.getUpper();
/* 1621 */                  if ((num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0)) {
/* 1645 */                      z3 = true;
                            }
/* 1646 */                  il10IO1II1Io2.I0000O = z3;
/* 1661 */                  il10IO1II1Io2.I0000oI00 = !z3 ? Rational.ZERO : (Rational) iIioli.I0000O(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
/* 1663 */                  VarHandle.storeStoreFence();
/* 1666 */                  return il10IO1II1Io2;
                        case 15:
/* 1459 */                  IIloIoOOiO0l iIloIoOOiO0l6 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 1471 */                  OlO01I1 olO01I13 = (OlO01I1) ((Ii10i0iO1) this.I0000O).I000l1.get();
/* 1483 */                  OolOi0i oolOi0i6 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 1495 */                  OoI00O0l ooI00O0l = (OoI00O0l) ((Ii10i0iO1) this.I0000O).I00100o1O0lo.get();
/* 1524 */                  OolOl0lI oolOl0lI = ((IIo0OlO) ((Ii10i0iO1) this.I0000O).I000OiO.get()).I00000oIO().I00000oIO(TorchFlashRequiredFor3aUpdateQuirk.class) ? loilIl10Ii.I00ioIO : i1i0olI.I00ilO0;
/* 1526 */                  IlOI0O11011l ilOI0O11011l = new IlOI0O11011l();
/* 1529 */                  ilOI0O11011l.I00000oIO = iIloIoOOiO0l6;
/* 1531 */                  ilOI0O11011l.I00000oOI = olO01I13;
/* 1533 */                  ilOI0O11011l.I0000Il00O = oolOi0i6;
/* 1535 */                  ilOI0O11011l.I0000O = ooI00O0l;
/* 1537 */                  ilOI0O11011l.I0000oI00 = oolOl0lI;
/* 1539 */                  ilOI0O11011l.I000II = 2;
/* 1543 */                  iiiO1IOliI0.I00000oIO(OoiIlOl1iI.I00000oIO);
/* 1546 */                  VarHandle.storeStoreFence();
/* 1549 */                  return ilOI0O11011l;
                        case 16:
/* 1314 */                  IIloIoOOiO0l iIloIoOOiO0l7 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 1326 */                  OlO01I1 olO01I14 = (OlO01I1) ((Ii10i0iO1) this.I0000O).I000l1.get();
/* 1340 */                  OoI00O0l ooI00O0l2 = new OoI00O0l();
/* 1343 */                  ooI00O0l2.I00000oIO = olO01I14;
/* 1349 */                  ooI00O0l2.I0000Il00O = ilOi0i1o.I00000oIO(iIloIoOOiO0l7);
/* 1356 */                  ooI00O0l2.I0000oI00 = new OI0lOii0I(obj);
/* 1358 */                  IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 1360 */                  IIlo0i0ll iIlo0i0ll6 = iIloIoOOiO0l7.I00000oOI;
/* 1362 */                  iIlo0OOlI.getClass();
/* 1365 */                  int i4 = Build.VERSION.SDK_INT;
/* 1369 */                  if (i4 >= 35) {
/* 1382 */                      Integer num3 = (Integer) ((IIioli) iIlo0i0ll6).I0000O(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
/* 1384 */                      if (num3 != null && num3.intValue() > 1) {
/* 1392 */                          z2 = true;
                                }
                            }
/* 1393 */                  ooI00O0l2.I0001Ioi1lo = z2;
/* 1395 */                  if (i4 >= 35) {
/* 1408 */                      Integer num4 = (Integer) ((IIioli) iIlo0i0ll6).I0000O(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
/* 1410 */                      if (num4 != null) {
/* 1412 */                          iIntValue = num4.intValue();
                                }
                            }
/* 1416 */                  ooI00O0l2.I000II = iIntValue;
/* 1418 */                  if (i4 >= 35) {
                            }
/* 1441 */                  ooI00O0l2.I000O01llI0 = new OI0lOii0I(Integer.valueOf(iIntValue));
/* 1443 */                  VarHandle.storeStoreFence();
/* 1446 */                  return ooI00O0l2;
                        case 17:
/* 1062 */                  IIloIoOOiO0l iIloIoOOiO0l8 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 1091 */                  O1ll0I0i0OO o1ll0I0i0OO = ((IIo0OlO) ((Ii10i0iO1) this.I0000O).I000OiO.get()).I00000oIO().I00000oIO(AfRegionFlipHorizontallyQuirk.class) ? loIOiIO1O1.I00ilI0I1 : i1O01Ill.I00ilO0;
/* 1103 */                  OlO01I1 olO01I15 = (OlO01I1) ((Ii10i0iO1) this.I0000O).I000l1.get();
/* 1115 */                  OolOi0i oolOi0i7 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 1121 */                  i0I0OoIIOO01 i0i0ooiioo01I00000oOI = ((Ii10i0iO1) this.I0000O).I00000oOI();
/* 1125 */                  Ili1i1o00Oo ili1i1o00Oo = new Ili1i1o00Oo();
/* 1128 */                  ili1i1o00Oo.I00000oIO = iIloIoOOiO0l8;
/* 1130 */                  ili1i1o00Oo.I00000oOI = o1ll0I0i0OO;
/* 1132 */                  ili1i1o00Oo.I0000Il00O = olO01I15;
/* 1134 */                  ili1i1o00Oo.I0000O = oolOi0i7;
/* 1136 */                  ili1i1o00Oo.I0000oI00 = i0i0ooiioo01I00000oOI;
/* 1138 */                  IIlo0i0ll iIlo0i0ll7 = iIloIoOOiO0l8.I00000oOI;
/* 1143 */                  IIioli iIioli2 = (IIioli) iIlo0i0ll7;
/* 1145 */                  Object objI0000O2 = iIioli2.I0000O(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
/* 1149 */                  if (objI0000O2 == null) {
/* 1151 */                      objI0000O2 = obj;
                            }
/* 1154 */                  ili1i1o00Oo.I000O01llI0 = (Integer) objI0000O2;
/* 1158 */                  Object objI0000O3 = iIioli2.I0000O(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
/* 1162 */                  if (objI0000O3 == null) {
/* 1164 */                      objI0000O3 = obj;
                            }
/* 1167 */                  ili1i1o00Oo.I000OOo1O = (Integer) objI0000O3;
/* 1171 */                  Object objI0000O4 = iIioli2.I0000O(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
/* 1181 */                  ili1i1o00Oo.I000OiO = (Integer) (objI0000O4 != null ? objI0000O4 : 0);
/* 1185 */                  IIlo0i0ll.I000OiO.getClass();
/* 1192 */                  ili1i1o00Oo.I000iOII = IIlo0OOlI.I00000oIO(iIlo0i0ll7);
/* 1202 */                  int[] iArr2 = (int[]) ((IIioli) iIlo0i0ll7).I0000O(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
/* 1204 */                  if (iArr2 != null) {
/* 1209 */                      arrayList = new ArrayList(iArr2.length);
/* 1214 */                      for (int i5 : iArr2) {
/* 1218 */                          List list = I0OIi10lO0iO.I00000oOI;
/* 1224 */                          arrayList.add(iOIOlooOl.I00000oIO(i5));
                                }
                            } else {
/* 1230 */                      arrayList = null;
                            }
/* 1231 */                  ili1i1o00Oo.I000l1 = arrayList;
/* 1245 */                  int[] iArr3 = (int[]) ((IIioli) ili1i1o00Oo.I00000oIO.I00000oOI).I0000O(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
/* 1247 */                  if (iArr3 != null) {
/* 1252 */                      ArrayList arrayList5 = new ArrayList(iArr3.length);
/* 1256 */                      for (int i6 : iArr3) {
/* 1264 */                          Iterator it = I0i10OI0o.I00000oOI.iterator();
                                    while (true) {
/* 1272 */                              if (it.hasNext()) {
/* 1274 */                                  next = it.next();
/* 1283 */                                  if (((I0i10OI0o) next).I00000oIO == i6) {
                                                break;
                                            }
                                        } else {
/* 1286 */                                  next = null;
                                        }
                                    }
/* 1289 */                          arrayList5.add((I0i10OI0o) next);
                                }
/* 1295 */                      arrayList2 = arrayList5;
                            }
/* 1296 */                  ili1i1o00Oo.I000lI = arrayList2;
/* 1298 */                  VarHandle.storeStoreFence();
/* 1301 */                  return ili1i1o00Oo;
                        case PoseLandmark.RIGHT_PINKY:
/* 1011 */                  IlOI0O11011l ilOI0O11011l2 = (IlOI0O11011l) ((Ii10i0iO1) this.I0000O).I0010I0i.get();
/* 1023 */                  OolOi0i oolOi0i8 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 1025 */                  OlOI1O olOI1O = new OlOI1O();
/* 1028 */                  olOI1O.I00000oIO = ilOI0O11011l2;
/* 1030 */                  olOI1O.I00000oOI = oolOi0i8;
/* 1037 */                  olOI1O.I0000Il00O = new OI1I0OoOl();
/* 1044 */                  olOI1O.I0000oI00 = new LinkedList();
/* 1046 */                  VarHandle.storeStoreFence();
/* 1049 */                  return olOI1O;
                        case PoseLandmark.LEFT_INDEX:
/* 986 */                   Oooi11I0 oooi11I0 = new Oooi11I0();
/* 993 */                   oooi11I0.I00000oIO = iOOOIOoiIlII.I00000oOI(0);
/* 995 */                   VarHandle.storeStoreFence();
/* 998 */                   return oooi11I0;
                        case PoseLandmark.RIGHT_INDEX:
/* 925 */                   i0I0OoIIOO01 i0i0ooiioo01I00000oOI2 = ((Ii10i0iO1) this.I0000O).I00000oOI();
/* 929 */                   i0I0io000 i0i0io000 = new i0I0io000();
/* 932 */                   i0i0io000.I00000oIO = i0i0ooiioo01I00000oOI2;
/* 938 */                   i0i0io000.I00000oOI = i0i0ooiioo01I00000oOI2.I0000O();
/* 944 */                   i0i0io000.I0000Il00O = i0i0ooiioo01I00000oOI2.I00000oIO();
/* 948 */                   i0I0i1o i0i0i1o = new i0I0i1o(false ? 1 : 0);
/* 951 */                   i0i0i1o.I00iiI = i0i0io000;
/* 953 */                   VarHandle.storeStoreFence();
/* 961 */                   i0i0io000.I0000O = new OllO00oiil(i0i0i1o);
/* 965 */                   i0I0i1o i0i0i1o2 = new i0I0i1o(iIntValue);
/* 968 */                   i0i0i1o2.I00iiI = i0i0io000;
/* 970 */                   VarHandle.storeStoreFence();
/* 978 */                   i0i0io000.I0000oI00 = new OllO00oiil(i0i0i1o2);
/* 980 */                   VarHandle.storeStoreFence();
/* 983 */                   return i0i0io000;
                        case PoseLandmark.LEFT_THUMB:
/* 878 */                   IIio0010i1l iIio0010i1l = (IIio0010i1l) ((Ii10i0iO1) this.I0000O).I001i1O0Ol.get();
/* 890 */                   OolOi0i oolOi0i9 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 902 */                   IOi0Olo0Ol iOi0Olo0Ol3 = (IOi0Olo0Ol) ((Ii10i0iO1) this.I0000O).I000lI.get();
/* 906 */                   IIiloliili1I iIiloliili1I2 = new IIiloliili1I();
/* 909 */                   iIiloliili1I2.I00000oIO = iIio0010i1l;
/* 911 */                   iIiloliili1I2.I00000oOI = oolOi0i9;
/* 913 */                   iIiloliili1I2.I0000Il00O = iOi0Olo0Ol3;
/* 915 */                   VarHandle.storeStoreFence();
/* 918 */                   return iIiloliili1I2;
                        case PoseLandmark.RIGHT_THUMB:
/* 840 */                   IIio0010i1l iIio0010i1l2 = new IIio0010i1l();
/* 848 */                   iIio0010i1l2.I00iOIl = new Object();
/* 855 */                   iIio0010i1l2.I00iiI = new Object();
/* 862 */                   iIio0010i1l2.I00iiO = new IIl0lo1oi(0);
/* 864 */                   VarHandle.storeStoreFence();
/* 867 */                   return iIio0010i1l2;
                        case PoseLandmark.LEFT_HIP:
/* 777 */                   IIo0ll0o iIo0ll0o3 = new IIo0ll0o();
/* 785 */                   iIo0ll0o3.I00000oIO = new Object();
/* 791 */                   IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(17, z);
/* 799 */                   ioIlOo1o0IIl.I00iiI = new OI0lOii0I();
/* 806 */                   ioIlOo1o0IIl.I00iiO = new HashMap();
/* 808 */                   VarHandle.storeStoreFence();
/* 811 */                   iIo0ll0o3.I00000oOI = ioIlOo1o0IIl;
/* 818 */                   iIo0ll0o3.I0000Il00O = new OI0lOii0I();
/* 820 */                   IIllOlooI iIllOlooI = IIllOlooI.I00iiO;
/* 822 */                   iIo0ll0o3.I0000oI00 = iIllOlooI;
/* 829 */                   iIo0ll0o3.I000O01llI0 = new LinkedHashMap();
/* 831 */                   iIo0ll0o3.I0000Il00O(iIllOlooI, null);
/* 834 */                   VarHandle.storeStoreFence();
/* 837 */                   return iIo0ll0o3;
                        case PoseLandmark.RIGHT_HIP:
/* 518 */                   IIloIoOOiO0l iIloIoOOiO0l9 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 524 */                   IIlIi0lIii iIlIi0lIii5 = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 526 */                   iIlIi0lIii5.getClass();
/* 539 */                   IIo0ll0o iIo0ll0o4 = (IIo0ll0o) ((Ii10i0iO1) this.I0000O).I001iOo1i0O.get();
/* 563 */                   IIl1Iloio iIl1Iloio = (IIl1Iloio) ((Ii10i0iO1) this.I0000O).I001lllioOl.get();
/* 587 */                   IIo0OlO iIo0OlO = (IIo0OlO) ((Ii10i0iO1) this.I0000O).I000OiO.get();
/* 611 */                   OlOIOo0 olOIOo0 = (OlOIOo0) ((Ii10i0iO1) this.I0000O).I000OOo1O.get();
/* 629 */                   OlOO1i11110 olOO1i11110 = ((Ii10i0iO1) this.I0000O).I00000oOI;
/* 631 */                   IIllO1o iIllO1o = new IIllO1o();
/* 634 */                   iIllO1o.I00iOIl = iIloIoOOiO0l9;
/* 636 */                   iIllO1o.I00iiI = iIlIi0lIii5;
/* 638 */                   iIllO1o.I00iiO = iIo0ll0o4;
/* 640 */                   iIllO1o.I00iio = iIl1Iloio;
/* 642 */                   iIllO1o.I00ilI0I1 = iIo0OlO;
/* 644 */                   iIllO1o.I00ilO0 = olOIOo0;
/* 652 */                   Object objI0000O5 = ((IIioli) iIloIoOOiO0l9.I00000oOI).I0000O(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
/* 660 */                   Integer num5 = (Integer) (objI0000O5 != null ? objI0000O5 : -1);
/* 667 */                   if (num5.intValue() == 2) {
/* 669 */                       str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                            } else if (num5.intValue() == 4) {
/* 678 */                       str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                            } else if (num5.intValue() == 0) {
/* 687 */                       str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
                            } else if (num5.intValue() == 1) {
/* 696 */                       str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
                            } else if (num5.intValue() == 3) {
/* 705 */                       str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                            } else {
/* 718 */                       str2 = "Unknown value: " + num5;
                            }
/* 726 */                   if (l11I11lO.I0000O(4, "CXCP")) {
/* 734 */                       Log.i("CXCP", "Device Level: ".concat(str2));
                            }
/* 739 */                   IIllIOi11 iIllIOi11 = new IIllIOi11(false ? 1 : 0);
/* 742 */                   iIllIOi11.I00iiI = iIllO1o;
/* 744 */                   VarHandle.storeStoreFence();
/* 752 */                   iIllO1o.I00io1l = new OllO00oiil(iIllIOi11);
/* 756 */                   IIllIOi11 iIllIOi112 = new IIllIOi11(iIntValue);
/* 759 */                   iIllIOi112.I00iiI = iIllO1o;
/* 761 */                   VarHandle.storeStoreFence();
/* 769 */                   iIllO1o.I00ioIO = new OllO00oiil(iIllIOi112);
/* 771 */                   VarHandle.storeStoreFence();
/* 774 */                   return iIllO1o;
                        case PoseLandmark.LEFT_KNEE:
/* 502 */                   return new IIlO1ii();
                        case PoseLandmark.RIGHT_KNEE:
/* 448 */                   return new IIl1Iloio();
                        case 27:
/* 372 */                   String str4 = (String) ((Ii10i0iO1) this.I0000O).I001lloI.get();
/* 388 */                   OOil0lI oOil0lII00000oIO = ((IIo0OlO) ((Ii10i0iO1) this.I0000O).I000OiO.get()).I00000oIO();
/* 392 */                   Il0IIO il0IIO = new Il0IIO();
/* 395 */                   il0IIO.I00000oOI = str4;
/* 397 */                   il0IIO.I0000Il00O = oOil0lII00000oIO;
/* 404 */                   il0IIO.I0001Ioi1lo = new LinkedHashMap();
                            try {
/* 406 */                       i = Integer.parseInt(str4);
/* 410 */                       z = true;
                            } catch (NumberFormatException unused) {
/* 435 */                       l11I11lO.I0000oI00("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + il0IIO.I00000oOI + ", unable to create EncoderProfilesProviderAdapter.");
                            }
/* 438 */                   il0IIO.I0000O = z;
/* 440 */                   il0IIO.I0000oI00 = i;
/* 442 */                   VarHandle.storeStoreFence();
/* 445 */                   return il0IIO;
                        case PoseLandmark.RIGHT_ANKLE:
/* 351 */                   IIlIi0lIii iIlIi0lIii6 = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 353 */                   iIlIi0lIii6.getClass();
/* 356 */                   String str5 = iIlIi0lIii6.I00iiI;
/* 358 */                   lII11l.I00000oOI(str5);
/* 361 */                   return str5;
                        case PoseLandmark.LEFT_HEEL:
/* 334 */                   IIlOlol0liO iIlOlol0liOI00000oIO = ((Ii10Ioo00l) this.I0000Il00O).I00000oIO();
/* 338 */                   Iooool iooool = new Iooool();
/* 341 */                   iooool.I00000oIO = iIlOlol0liOI00000oIO;
/* 343 */                   VarHandle.storeStoreFence();
/* 346 */                   return iooool;
                        case 30:
/* 229 */                   IIl1Iloio iIl1Iloio2 = (IIl1Iloio) ((Ii10i0iO1) this.I0000O).I001lllioOl.get();
/* 242 */                   IOi0Olo0Ol iOi0Olo0Ol4 = (IOi0Olo0Ol) ((Ii10i0iO1) this.I0000O).I000lI.get();
/* 248 */                   IIlIi0lIii iIlIi0lIii7 = ((Ii10i0iO1) this.I0000O).I00000oIO;
/* 250 */                   iIlIi0lIii7.getClass();
/* 265 */                   IIo0OlO iIo0OlO2 = (IIo0OlO) ((Ii10i0iO1) this.I0000O).I000OiO.get();
/* 279 */                   i0I11I i0i11i2 = (i0I11I) ((Ii10i0iO1) this.I0000O).I0001Ioi1lo.get();
/* 285 */                   OloOIoiI1 oloOIoiI1I00000oIO = ((Ii10i0iO1) this.I0000O).I00000oIO();
/* 301 */                   IIlo0i0ll iIlo0i0ll8 = (IIlo0i0ll) ((Ii10i0iO1) this.I0000O).I0000O.get();
/* 307 */                   I0Oi111ii i0Oi111ii2 = ((Ii10Ioo00l) this.I0000Il00O).I00000oIO;
/* 313 */                   IIoO11o iIoO11o2 = (IIoO11o) i0Oi111ii2.I00io1l;
/* 319 */                   IIlio101Io iIlio101Io2 = (IIlio101Io) i0Oi111ii2.I00ilI0I1;
/* 321 */                   lII11l.I00000oOI(iIlio101Io2);
/* 324 */                   return new IIlioOio1(iIl1Iloio2, iOi0Olo0Ol4, iIlIi0lIii7, iIo0OlO2, i0i11i2, oloOIoiI1I00000oIO, iIlo0i0ll8, iIoO11o2, iIlio101Io2);
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 43 */                    IIloIoOOiO0l iIloIoOOiO0l10 = (IIloIoOOiO0l) ((Ii10i0iO1) this.I0000O).I0000oI00.get();
/* 67 */                    IlOI0O11011l ilOI0O11011l3 = (IlOI0O11011l) ((Ii10i0iO1) this.I0000O).I0010I0i.get();
/* 79 */                    Ili1i1o00Oo ili1i1o00Oo2 = (Ili1i1o00Oo) ((Ii10i0iO1) this.I0000O).I0010o.get();
/* 91 */                    OlOI1O olOI1O2 = (OlOI1O) ((Ii10i0iO1) this.I0000O).I00111O.get();
/* 103 */                   OoI00O0l ooI00O0l3 = (OoI00O0l) ((Ii10i0iO1) this.I0000O).I00100o1O0lo.get();
/* 115 */                   O1Iioo1 o1Iioo13 = (O1Iioo1) ((Ii10i0iO1) this.I0000O).I000o00OoI0I.get();
/* 139 */                   i0I11I i0i11i3 = (i0I11I) ((Ii10i0iO1) this.I0000O).I0001Ioi1lo.get();
/* 151 */                   IIiloliili1I iIiloliili1I3 = (IIiloliili1I) ((Ii10i0iO1) this.I0000O).I001i1lo1io.get();
/* 163 */                   OolOO1oOoo oolOO1oOoo3 = (OolOO1oOoo) ((Ii10i0iO1) this.I0000O).I00IOO.get();
/* 175 */                   OolOi0i oolOi0i10 = (OolOi0i) ((Ii10i0iO1) this.I0000O).I000iOII.get();
/* 189 */                   IIlO0OOI1lI iIlO0OOI1lI = new IIlO0OOI1lI();
/* 192 */                   iIlO0OOI1lI.I00000oOI = iIloIoOOiO0l10;
/* 194 */                   iIlO0OOI1lI.I0000Il00O = ilOI0O11011l3;
/* 196 */                   iIlO0OOI1lI.I0000O = ili1i1o00Oo2;
/* 198 */                   iIlO0OOI1lI.I0000oI00 = olOI1O2;
/* 200 */                   iIlO0OOI1lI.I0001Ioi1lo = ooI00O0l3;
/* 202 */                   iIlO0OOI1lI.I000II = o1Iioo13;
/* 204 */                   iIlO0OOI1lI.I000O01llI0 = i0i11i3;
/* 206 */                   iIlO0OOI1lI.I000OOo1O = iIiloliili1I3;
/* 208 */                   iIlO0OOI1lI.I000OiO = oolOO1oOoo3;
/* 210 */                   iIlO0OOI1lI.I000iOII = oolOi0i10;
/* 212 */                   VarHandle.storeStoreFence();
/* 215 */                   return iIlO0OOI1lI;
                        default:
/* 30 */                    throw new AssertionError(i2);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0371  */
                /* JADX WARN: Type inference failed for: r0v146 */
                /* JADX WARN: Type inference failed for: r0v147 */
                /* JADX WARN: Type inference failed for: r0v75 */
                /* JADX WARN: Type inference failed for: r0v76, types: [l1I0oI] */
                /* JADX WARN: Type inference failed for: r0v80 */
                /* JADX WARN: Type inference failed for: r0v81, types: [OIlI1I] */
                /* JADX WARN: Type inference failed for: r10v33, types: [boolean] */
                /* JADX WARN: Type inference failed for: r10v34 */
                /* JADX WARN: Type inference failed for: r10v35 */
                /* JADX WARN: Type inference failed for: r10v41, types: [boolean] */
                /* JADX WARN: Type inference failed for: r10v42 */
                /* JADX WARN: Type inference failed for: r10v43 */
                /* JADX WARN: Type inference failed for: r11v38, types: [boolean] */
                /* JADX WARN: Type inference failed for: r11v39 */
                /* JADX WARN: Type inference failed for: r11v40 */
                /* JADX WARN: Type inference failed for: r4v21, types: [Il01100l] */
                /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v30, types: [java.util.ArrayList] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I00000oOI() {
                    IIoo0Io1I iIoo0Io1I;
                    ?? arrayList;
                    ArrayList arrayListI00O10llo;
                    Iterator it;
                    LinkedHashMap linkedHashMap;
                    ?? r0;
                    Integer num;
/* 3 */             int i = this.I00000oOI;
/* 5 */             int i2 = 2;
/* 6 */             int i3 = 4;
/* 7 */             int i4 = 3;
/* 8 */             IOoil1iiIilo iOoil1iiIilo = null;
/* 10 */            int i5 = 0;
                    switch (i) {
                        case 0:
/* 3195 */                  IIliIi1O0OiO iIliIi1O0OiO = (IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI;
/* 3197 */                  lII11l.I00000oOI(iIliIi1O0OiO);
/* 3212 */                  IIlo0i0ll iIlo0i0ll = (IIlo0i0ll) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000Il00O).get();
/* 3226 */                  Io0oi0 io0oi0 = (Io0oi0) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I00100o1O0lo).get();
/* 3240 */                  Io0oi0 io0oi02 = (Io0oi0) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I00100o1O0lo).get();
/* 3254 */                  OlOO00iI0lI olOO00iI0lI = (OlOO00iI0lI) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I0010I0i).get();
/* 3268 */                  OlioOlO1 olioOlO1 = (OlioOlO1) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000oI00).get();
/* 3282 */                  IIioIlI0 iIioIlI0 = (IIioIlI0) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I0010o).get();
/* 3296 */                  IllI1oI illI1oI = (IllI1oI) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000O01llI0).get();
/* 3310 */                  IllI1OilO0O illI1OilO0O = (IllI1OilO0O) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0001Ioi1lo).get();
/* 3322 */                  I1iIilO0io01 i1iIilO0io01 = (I1iIilO0io01) ((Ii10oo) this.I0000Il00O).I0010I0i.get();
/* 3334 */                  IIll0Oilo iIll0Oilo = (IIll0Oilo) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiO;
/* 3336 */                  lII11l.I00000oOI(iIll0Oilo);
/* 3419 */                  return new IIll0oO(iIliIi1O0OiO, iIlo0i0ll, io0oi0, io0oi02, olOO00iI0lI, olioOlO1, iIioIlI0, illI1oI, illI1OilO0O, i1iIilO0io01, iIll0Oilo, (IIll10) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000l1).get(), (IIll1I0) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000lI).get(), (Io0olIl) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000OiO).get(), (Ii0110) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000iOII).get(), (IOol1Ol) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000oI1ioi).get());
                        case 1:
/* 3155 */                  IIliIi1O0OiO iIliIi1O0OiO2 = (IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI;
/* 3157 */                  lII11l.I00000oOI(iIliIi1O0OiO2);
/* 3178 */                  return ((IIil1o0olooo) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I00000oOI).get()).I0000Il00O.I00000oIO(iIliIi1O0OiO2.I00000oIO);
                        case 2:
/* 3110 */                  IIl10ilil1 iIl10ilil1 = (IIl10ilil1) ((Ii10oo) this.I0000Il00O).I001i1O0Ol.get();
/* 3124 */                  lII11l.I00000oOI((IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI);
/* 3139 */                  IIil1o0olooo iIil1o0olooo = iIl10ilil1.I0000O;
/* 3141 */                  lII11l.I00000oOI(iIil1o0olooo);
/* 3144 */                  return iIil1o0olooo;
                        case 3:
/* 2633 */                  Oo10IliO00O oo10IliO00O = (Oo10IliO00O) ((Ii10oo) this.I0000Il00O).I0001Ioi1lo.get();
/* 2645 */                  IIll0Oilo iIll0Oilo2 = (IIll0Oilo) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiO;
/* 2647 */                  lII11l.I00000oOI(iIll0Oilo2);
/* 2660 */                  IIliIi1O0OiO iIliIi1O0OiO3 = (IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI;
/* 2662 */                  lII11l.I00000oOI(iIliIi1O0OiO3);
/* 2677 */                  O10ol1o1O o10ol1o1O = (O10ol1o1O) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000O).get();
/* 2691 */                  List list = (List) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000OOo1O).get();
/* 2707 */                  Io0oi0 io0oi03 = new Io0oi0();
/* 2710 */                  io0oi03.I00000oIO = iIll0Oilo2;
/* 2712 */                  io0oi03.I00000oOI = iIliIi1O0OiO3;
/* 2716 */                  io0oi03.I0000O = iIliIi1O0OiO3.I000iOII;
/* 2718 */                  Map map = iIliIi1O0OiO3.I000OOo1O;
/* 2720 */                  Map map2 = iIliIi1O0OiO3.I000l1;
/* 2722 */                  O1lOllO o1lOllO = IIloiOIOoo.I0000Il00O;
/* 2724 */                  Object obj = map.get(o1lOllO);
/* 2728 */                  Boolean bool = Boolean.TRUE;
/* 2734 */                  if (O0000Ioio00.I0000O(obj, bool) || O0000Ioio00.I0000O(map2.get(o1lOllO), bool)) {
/* 2763 */                      Log.i("CXCP", o1lOllO + " is set to true, ignoring GraphState3A parameters.");
                            }
/* 2768 */                  IIi0oIl iIi0oIl = iIliIi1O0OiO3.I000o00OoI0I.I00000oOI;
/* 2778 */                  Set set = (Set) IIl10I1.I0000Il00O.get(Build.MANUFACTURER);
/* 2780 */                  if (set != null) {
/* 2784 */                      set.contains(Build.DEVICE);
                            }
/* 2787 */                  IIlilI0i0ii iIlilI0i0ii = IIlilI0i0ii.I00iOIl;
/* 2793 */                  int iMax = Math.max(0, iIi0oIl.I00iOIl);
/* 2797 */                  if (iMax != 0) {
                                long j = iMax;
/* 2802 */                      iIoo0Io1I = new IIoo0Io1I();
/* 2805 */                      iIoo0Io1I.I00iOIl = j;
/* 2811 */                      if (j <= 0) {
/* 2825 */                          I000II.I000iOII("Failed requirement.");
/* 8 */                             return null;
                                }
/* 2817 */                      iIoo0Io1I.I00iiI = iOOOIOoiIlII.I0000Il00O();
/* 2819 */                      VarHandle.storeStoreFence();
                            } else {
/* 2829 */                      iIoo0Io1I = null;
                            }
/* 2841 */                  ArrayList arrayListI00O10llo2 = IOOi0Ool1i.I00O10llo(list, IOOi1I.I000OOo1O(iIoo0Io1I));
/* 2849 */                  ArrayList arrayListI001IIilI0O = I1IoiO1l.I001IIilI0O(new Object[]{o10ol1o1O, iIoo0Io1I});
/* 2853 */                  Ii0110 ii0110 = oo10IliO00O.I00000oIO;
/* 2855 */                  Ii00lIOoi ii00lIOoi = oo10IliO00O.I0001Ioi1lo;
/* 2857 */                  Io0oO1OiI io0oO1OiI = new Io0oO1OiI();
/* 2860 */                  io0oO1OiI.I00iOIl = iIll0Oilo2;
/* 2862 */                  io0oO1OiI.I00iiI = map;
/* 2864 */                  io0oO1OiI.I00iiO = map2;
/* 2866 */                  io0oO1OiI.I00iio = arrayListI001IIilI0O;
/* 2868 */                  io0oO1OiI.I00ilI0I1 = ii0110;
/* 2881 */                  IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(ii00lIOoi, new Ii00oll("CXCP-GraphLoop")));
/* 2885 */                  io0oO1OiI.I00ilO0 = iIOlO1iiI00000oIO;
/* 2891 */                  Class<Io0oO1OiI> cls = Io0oO1OiI.class;
/* 2897 */                  int i6 = 0;
/* 2905 */                  I00oII i00oII = new I00oII(1, io0oO1OiI, cls, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i6, 5);
/* 2920 */                  IliI1Ii1II iliI1Ii1II = new IliI1Ii1II(2, io0oO1OiI, cls, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i6, 2);
/* 2927 */                  o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 2930 */                  o01l1iooo0.I00iOIl = i00oII;
/* 2932 */                  o01l1iooo0.I00iiI = iliI1Ii1II;
/* 2936 */                  I1Ool1IoO110 i1Ool1IoO110I00000oIO = iOOOIOoiIlII.I00000oIO(false);
/* 2942 */                  OIoO1Ol oIoO1Ol = new OIoO1Ol(i3);
/* 2945 */                  oIoO1Ol.I00iiI = o01l1iooo0;
/* 2947 */                  VarHandle.storeStoreFence();
/* 2959 */                  o01l1iooo0.I00iiO = iOl1iOi0I.I00000oIO(Integer.MAX_VALUE, null, oIoO1Ol, 2);
/* 2966 */                  o01l1iooo0.I00iio = new I1Il0loi();
/* 2968 */                  VarHandle.storeStoreFence();
/* 2975 */                  if (!i1Ool1IoO110I00000oIO.I00000oIO()) {
/* 3096 */                      I000II.I001IO000("ProcessingQueue cannot be re-started!");
/* 8 */                         return null;
                            }
/* 2990 */                  if (iOi1II01i0.I0000O(iIOlO1iiI00000oIO, null, null, new O1iOlO(o01l1iooo0, iOoil1iiIilo, i4), 3).isCancelled()) {
/* 2992 */                      o01l1iooo0.I00100l0(null);
                            }
/* 2995 */                  io0oO1OiI.I00io1l = o01l1iooo0;
/* 3002 */                  io0oO1OiI.I00ioIO = new Object();
/* 3004 */                  Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 3006 */                  io0oO1OiI.I00ll1 = il011I1OiO0I;
/* 3012 */                  io0oO1OiI.I00lll10 = iOOOIOoiIlII.I00000oIO(true);
/* 3014 */                  io0oO1OiI.I00o0l1o1o0 = il011I1OiO0I;
/* 3016 */                  io0oO1OiI.I00o101lO = il011I1OiO0I;
/* 3018 */                  io0oO1OiI.I00oI0i = map2;
/* 3020 */                  io0oO1OiI.I00oII = arrayListI00O10llo2;
/* 3022 */                  VarHandle.storeStoreFence();
/* 3025 */                  io0oi03.I0000Il00O = io0oO1OiI;
/* 3027 */                  if (iIoo0Io1I != null) {
/* 3031 */                      if (iIoo0Io1I.I00iiO != null) {
/* 3074 */                          I000II.I001IO000("GraphLoop has already been set!");
/* 3077 */                          return null;
                                }
/* 3033 */                      iIoo0Io1I.I00iiO = io0oO1OiI;
/* 3036 */                      io0oO1OiI.I00IioO0OiOi(false);
/* 3068 */                      Log.w("CXCP", "Capture processing has been disabled for " + io0oO1OiI + " until " + iIoo0Io1I.I00iOIl + " frames have been completed.");
                            }
/* 3086 */                  io0oi03.I0000oI00 = OlO0iOl0il.I00000oIO(Io100Oi.I00000oOI);
/* 3088 */                  VarHandle.storeStoreFence();
/* 3091 */                  return io0oi03;
                        case 4:
/* 2603 */                  O10ol1o1O o10ol1o1O2 = new O10ol1o1O();
/* 2611 */                  o10ol1o1O2.I00iOIl = new CopyOnWriteArrayList();
/* 2613 */                  VarHandle.storeStoreFence();
/* 2616 */                  return o10ol1o1O2;
                        case 5:
/* 2546 */                  IIliIi1O0OiO iIliIi1O0OiO4 = (IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI;
/* 2548 */                  lII11l.I00000oOI(iIliIi1O0OiO4);
/* 2563 */                  O10ol1o1O o10ol1o1O3 = (O10ol1o1O) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000O).get();
/* 2577 */                  IllI1oI illI1oI2 = (IllI1oI) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000O01llI0).get();
/* 2583 */                  ArrayList arrayListI000OiO = IOOi1I.I000OiO(o10ol1o1O3);
/* 2587 */                  arrayListI000OiO.add(o10ol1o1O3);
/* 2590 */                  arrayListI000OiO.add(illI1oI2);
/* 2597 */                  arrayListI000OiO.addAll(iIliIi1O0OiO4.I000OiO);
/* 2600 */                  return arrayListI000OiO;
                        case 6:
/* 2180 */                  OlOO00iI0lI olOO00iI0lI2 = (OlOO00iI0lI) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I0010I0i).get();
/* 2194 */                  IllI1OilO0O illI1OilO0O2 = (IllI1OilO0O) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0001Ioi1lo).get();
/* 2208 */                  IIlo0i0ll iIlo0i0ll2 = (IIlo0i0ll) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000Il00O).get();
/* 2232 */                  Integer num2 = (Integer) ((IIioli) iIlo0i0ll2).I0000O(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
/* 2234 */                  i = (num2 == null || num2.intValue() != 1) ? 0 : 1;
/* 2250 */                  IllI1oI illI1oI3 = new IllI1oI();
/* 2253 */                  illI1oI3.I00iOIl = olOO00iI0lI2;
/* 2255 */                  illI1oI3.I00iiI = illI1OilO0O2;
/* 2266 */                  illI1oI3.I00iiO = new OIl1l01(IOO1lioOO.I0000Il00O, OIl1lOoO1.I00000oOI);
/* 2268 */                  O1OOII o1ooii = olOO00iI0lI2.I00ilI0I1;
/* 2278 */                  LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(o1ooii.I00l0I0l0lO1));
/* 2287 */                  Object it2 = ((O1OOIoo01I) o1ooii.entrySet()).iterator();
/* 2298 */                  if (!((OlloI01I) it2).hasNext()) {
/* 2464 */                      illI1oI3.I00iio = linkedHashMap2;
/* 2466 */                      Set setKeySet = linkedHashMap2.keySet();
/* 2480 */                      ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 2483 */                      Iterator it3 = setKeySet.iterator();
/* 2491 */                      while (it3.hasNext()) {
/* 2501 */                          IIo1loI0 iIo1loI0I00000oIO = olOO00iI0lI2.I00000oIO(((OlOO0I1) it3.next()).I00000oIO);
/* 2505 */                          if (iIo1loI0I00000oIO == null) {
/* 2511 */                              I000II.I001IO000("Required value was null.");
/* 8 */                                 return null;
                                    }
/* 2507 */                          arrayList2.add(iIo1loI0I00000oIO);
                                }
/* 2519 */                      illI1oI3.I00ilI0I1 = IOOi0Ool1i.I00iio(arrayList2);
/* 2528 */                      illI1oI3.I00ilO0 = new IioIoO10iOiI(20);
/* 2530 */                      VarHandle.storeStoreFence();
/* 2533 */                      return illI1oI3;
                            }
/* 2306 */                  Map.Entry entry = (Map.Entry) ((O1OIoioOO1lo) it2).next();
/* 2308 */                  entry.getKey();
/* 2317 */                  int i7 = ((OlOO0I1) entry.getKey()).I00000oIO;
/* 2323 */                  IoiO1O1 ioiO1O1 = (IoiO1O1) entry.getValue();
/* 2325 */                  IIo1loI0 iIo1loI0I00000oIO2 = olOO00iI0lI2.I00000oIO(i7);
/* 2329 */                  if (iIo1loI0I00000oIO2 == null) {
/* 2460 */                      I000II.I001IO000("Required value was null.");
/* 8 */                         return null;
                            }
/* 2335 */                  List list2 = olOO00iI0lI2.I0000Il00O(i7).I00000oIO;
/* 2337 */                  if (i != 0) {
/* 2339 */                      List list3 = list2;
/* 2343 */                      if ((list3 instanceof Collection) && list3.isEmpty()) {
/* 2374 */                          throw null;
                                }
/* 2354 */                      Iterator it4 = list3.iterator();
/* 2362 */                      while (it4.hasNext()) {
/* 2370 */                          ((OIlI1io) it4.next()).getClass();
                                }
/* 2374 */                      throw null;
                            }
/* 2375 */                  List list4 = list2;
/* 2379 */                  if (!(list4 instanceof Collection) || !list4.isEmpty()) {
/* 2391 */                      Iterator it5 = list4.iterator();
/* 2399 */                      while (it5.hasNext()) {
/* 2407 */                          ((OIlI1io) it5.next()).getClass();
                                }
                            }
/* 2411 */                  OIl1lOoO1 oIl1lOoO1 = OIl1lOoO1.I00000oOI;
/* 2415 */                  O1OOII o1ooii2 = new O1OOII();
/* 2420 */                  Iterator it6 = iIo1loI0I00000oIO2.I00000oOI.iterator();
/* 2428 */                  while (it6.hasNext()) {
/* 2449 */                      o1ooii2.put(OIl1lI0ll101.I00000oIO(((OlOIo0l1O0Ol) it6.next()).I00000oIO), new OIl1l01(IOO1lioOO.I00000oOI, oIl1lOoO1));
                            }
/* 2453 */                  o1ooii2.I00000oOI();
/* 2456 */                  ioiO1O1.getClass();
/* 2459 */                  throw null;
                        case 7:
/* 754 */                   IIlo0i0ll iIlo0i0ll3 = (IIlo0i0ll) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000Il00O).get();
/* 766 */                   IIliIi1O0OiO iIliIi1O0OiO5 = (IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI;
/* 768 */                   lII11l.I00000oOI(iIliIi1O0OiO5);
/* 773 */                   Ii10oo ii10oo = (Ii10oo) this.I0000Il00O;
/* 783 */                   IIloOI iIloOI = ii10oo.I00000oIO;
/* 789 */                   lII11l.I00000oOI((IIloIII11) iIloOI.I00iiI);
/* 796 */                   lII11l.I00000oOI((IIloIII11) iIloOI.I00iiI);
/* 803 */                   Object obj2 = ((Ii10lIo0l1) this.I0000O).I0010o;
/* 807 */                   OlOO00iI0lI olOO00iI0lI3 = new OlOO00iI0lI();
/* 810 */                   olOO00iI0lI3.I00iOIl = iIliIi1O0OiO5;
/* 814 */                   ArrayList arrayList3 = new ArrayList();
/* 819 */                   LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 824 */                   ArrayList arrayList4 = new ArrayList();
/* 829 */                   LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 834 */                   if (iIliIi1O0OiO5.I000O01llI0 == 0) {
/* 838 */                       IIlo0i0ll.I000OiO.getClass();
/* 845 */                       if (!IIlo0OOlI.I00000oOI(iIlo0i0ll3)) {
/* 847 */                           CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
/* 849 */                           IIioli iIioli = (IIioli) iIlo0i0ll3;
/* 855 */                           Integer num3 = (Integer) iIioli.I0000O(key);
/* 857 */                           if ((num3 != null && num3.intValue() == 0) || ((num = (Integer) iIioli.I0000O(key)) != null && num.intValue() == 4)) {
/* 882 */                               i = 0;
                                    }
                                }
                            }
/* 885 */                   LinkedHashMap linkedHashMap5 = new LinkedHashMap();
/* 898 */                   for (List<IIo1lioOolol> list5 : iIliIi1O0OiO5.I0000Il00O) {
/* 913 */                       if (list5.isEmpty()) {
/* 1063 */                          IOoil1iiIilo iOoil1iiIilo2 = iOoil1iiIilo;
/* 1065 */                          I000II.I001IO000("Check failed.");
/* 1068 */                          return iOoil1iiIilo2;
                                }
/* 915 */                       IIliIi1O0OiO iIliIi1O0OiO6 = olOO00iI0lI3.I00iOIl;
/* 917 */                       I1OollilIo i1OollilIo = OlOO00iI0lI.I00lli11;
/* 919 */                       List list6 = iIliIi1O0OiO6.I00000oOI;
/* 925 */                       ArrayList arrayList5 = new ArrayList();
/* 928 */                       Iterator it7 = list6.iterator();
/* 936 */                       while (it7.hasNext()) {
/* 952 */                           IOOii0O10Io0.I00100l0(arrayList5, ((IIo1lioOolol) it7.next()).I00000oIO);
/* 955 */                           iOoil1iiIilo = iOoil1iiIilo;
                                }
/* 958 */                       IOoil1iiIilo iOoil1iiIilo3 = iOoil1iiIilo;
/* 962 */                       ArrayList arrayList6 = new ArrayList();
/* 965 */                       Iterator it8 = arrayList5.iterator();
/* 973 */                       while (it8.hasNext()) {
/* 975 */                           it8.next();
                                }
/* 981 */                       ArrayList arrayList7 = new ArrayList();
/* 984 */                       Iterator it9 = arrayList6.iterator();
/* 992 */                       if (it9.hasNext()) {
/* 1062 */                          throw IIlIOloOOO.I000lI(it9);
                                }
/* 994 */                       i1OollilIo.getClass();
/* 999 */                       int iIncrementAndGet = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 1011 */                      while (arrayList7.contains(Integer.valueOf(iIncrementAndGet))) {
/* 1015 */                          iIncrementAndGet = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
                                }
/* 1028 */                      for (IIo1lioOolol iIo1lioOolol : list5) {
/* 1040 */                          if (linkedHashMap5.containsKey(iIo1lioOolol)) {
/* 1050 */                              I000II.I001IO000("Check failed.");
/* 1053 */                              return iOoil1iiIilo3;
                                    }
/* 1046 */                          linkedHashMap5.put(iIo1lioOolol, Integer.valueOf(iIncrementAndGet));
                                }
/* 1054 */                      iOoil1iiIilo = iOoil1iiIilo3;
                            }
/* 1069 */                  IOoil1iiIilo iOoil1iiIilo4 = iOoil1iiIilo;
/* 1075 */                  Iterator it10 = olOO00iI0lI3.I00iOIl.I00000oOI.iterator();
/* 1083 */                  while (it10.hasNext()) {
/* 1089 */                      IIo1lioOolol iIo1lioOolol2 = (IIo1lioOolol) it10.next();
/* 1093 */                      Iterator it11 = iIo1lioOolol2.I00000oIO.iterator();
/* 1101 */                      while (it11.hasNext()) {
/* 1107 */                          OIlI1io oIlI1io = (OIlI1io) it11.next();
/* 1113 */                          if (!linkedHashMap3.containsKey(oIlI1io)) {
/* 1116 */                              I1OollilIo i1OollilIo2 = OlOO00iI0lI.I00ll1;
/* 1118 */                              i1OollilIo2.getClass();
/* 1123 */                              int iIncrementAndGet2 = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo2);
/* 1127 */                              Size size = oIlI1io.I00000oIO;
/* 1129 */                              int i8 = oIlI1io.I00000oOI;
/* 1131 */                              int i9 = i5;
/* 1133 */                              String str = oIlI1io.I0000Il00O;
/* 1135 */                              if (str == null) {
/* 1139 */                                  str = olOO00iI0lI3.I00iOIl.I00000oIO;
                                        }
/* 1147 */                              Integer num4 = (Integer) linkedHashMap5.get(iIo1lioOolol2);
/* 1149 */                              if (i != 0) {
/* 1151 */                                  it = it10;
/* 1161 */                                  ?? r02 = oIlI1io instanceof OIlI1I ? (OIlI1I) oIlI1io : iOoil1iiIilo4;
/* 1163 */                                  if (r02 != 0) {
/* 1167 */                                      linkedHashMap = linkedHashMap5;
/* 1165 */                                      r0 = r02.I000OOo1O;
                                            }
/* 1178 */                                  OIlIOlIi oIlIOlIi = oIlI1io.I0000O;
/* 1180 */                                  IIo1lioOolol iIo1lioOolol3 = iIo1lioOolol2;
/* 1182 */                                  OIlII1I1 oIlII1I1 = oIlI1io.I0000oI00;
/* 1184 */                                  Iterator it12 = it11;
/* 1186 */                                  OIlIOo oIlIOo = oIlI1io.I0001Ioi1lo;
/* 1188 */                                  int i10 = i;
/* 1190 */                                  OIlIOoOil oIlIOoOil = oIlI1io.I000II;
/* 1192 */                                  ArrayList arrayList8 = arrayList4;
/* 1194 */                                  List list7 = oIlI1io.I000O01llI0;
/* 1196 */                                  LinkedHashMap linkedHashMap6 = linkedHashMap4;
/* 1200 */                                  OlOIo0 olOIo0 = new OlOIo0();
/* 1203 */                                  olOIo0.I00000oIO = iIncrementAndGet2;
/* 1205 */                                  olOIo0.I00000oOI = size;
/* 1207 */                                  olOIo0.I0000Il00O = i8;
/* 1209 */                                  olOIo0.I0000O = str;
/* 1211 */                                  olOIo0.I0000oI00 = num4;
/* 1213 */                                  olOIo0.I0001Ioi1lo = r0;
/* 1215 */                                  olOIo0.I000II = oIlIOlIi;
/* 1217 */                                  olOIo0.I000O01llI0 = oIlII1I1;
/* 1219 */                                  olOIo0.I000OOo1O = oIlIOo;
/* 1221 */                                  olOIo0.I000OiO = oIlIOoOil;
/* 1223 */                                  olOIo0.I000iOII = list7;
/* 1230 */                                  olOIo0.I000l1 = new ArrayList();
/* 1232 */                                  VarHandle.storeStoreFence();
/* 1235 */                                  linkedHashMap3.put(oIlI1io, olOIo0);
/* 1238 */                                  arrayList3.add(olOIo0);
/* 1241 */                                  it10 = it;
/* 1243 */                                  i5 = i9;
/* 1245 */                                  linkedHashMap5 = linkedHashMap;
/* 1247 */                                  iIo1lioOolol2 = iIo1lioOolol3;
/* 1249 */                                  it11 = it12;
/* 1251 */                                  i = i10;
/* 1253 */                                  arrayList4 = arrayList8;
/* 1255 */                                  linkedHashMap4 = linkedHashMap6;
                                        } else {
/* 1175 */                                  it = it10;
                                        }
/* 1170 */                              linkedHashMap = linkedHashMap5;
/* 1172 */                              r0 = iOoil1iiIilo4;
/* 1178 */                              OIlIOlIi oIlIOlIi2 = oIlI1io.I0000O;
/* 1180 */                              IIo1lioOolol iIo1lioOolol32 = iIo1lioOolol2;
/* 1182 */                              OIlII1I1 oIlII1I12 = oIlI1io.I0000oI00;
/* 1184 */                              Iterator it122 = it11;
/* 1186 */                              OIlIOo oIlIOo2 = oIlI1io.I0001Ioi1lo;
/* 1188 */                              int i102 = i;
/* 1190 */                              OIlIOoOil oIlIOoOil2 = oIlI1io.I000II;
/* 1192 */                              ArrayList arrayList82 = arrayList4;
/* 1194 */                              List list72 = oIlI1io.I000O01llI0;
/* 1196 */                              LinkedHashMap linkedHashMap62 = linkedHashMap4;
/* 1200 */                              OlOIo0 olOIo02 = new OlOIo0();
/* 1203 */                              olOIo02.I00000oIO = iIncrementAndGet2;
/* 1205 */                              olOIo02.I00000oOI = size;
/* 1207 */                              olOIo02.I0000Il00O = i8;
/* 1209 */                              olOIo02.I0000O = str;
/* 1211 */                              olOIo02.I0000oI00 = num4;
/* 1213 */                              olOIo02.I0001Ioi1lo = r0;
/* 1215 */                              olOIo02.I000II = oIlIOlIi2;
/* 1217 */                              olOIo02.I000O01llI0 = oIlII1I12;
/* 1219 */                              olOIo02.I000OOo1O = oIlIOo2;
/* 1221 */                              olOIo02.I000OiO = oIlIOoOil2;
/* 1223 */                              olOIo02.I000iOII = list72;
/* 1230 */                              olOIo02.I000l1 = new ArrayList();
/* 1232 */                              VarHandle.storeStoreFence();
/* 1235 */                              linkedHashMap3.put(oIlI1io, olOIo02);
/* 1238 */                              arrayList3.add(olOIo02);
/* 1241 */                              it10 = it;
/* 1243 */                              i5 = i9;
/* 1245 */                              linkedHashMap5 = linkedHashMap;
/* 1247 */                              iIo1lioOolol2 = iIo1lioOolol32;
/* 1249 */                              it11 = it122;
/* 1251 */                              i = i102;
/* 1253 */                              arrayList4 = arrayList82;
/* 1255 */                              linkedHashMap4 = linkedHashMap62;
                                    }
                                }
                            }
/* 1259 */                  int i11 = i5;
/* 1261 */                  ArrayList arrayList9 = arrayList4;
/* 1263 */                  LinkedHashMap linkedHashMap7 = linkedHashMap4;
/* 1267 */                  LinkedHashMap linkedHashMap8 = new LinkedHashMap();
/* 1276 */                  int size2 = olOO00iI0lI3.I00iOIl.I00000oOI.size();
/* 1280 */                  int i12 = i11;
                            while (true) {
/* 1282 */                      IIliIi1O0OiO iIliIi1O0OiO7 = olOO00iI0lI3.I00iOIl;
/* 1284 */                      if (i12 >= size2) {
/* 1508 */                          ArrayList arrayList10 = arrayList3;
/* 1510 */                          ArrayList arrayList11 = arrayList9;
/* 1512 */                          LinkedHashMap linkedHashMap9 = linkedHashMap7;
/* 1514 */                          ArrayList<Ioo000i1Io> arrayList12 = iIliIi1O0OiO7.I0000O;
/* 1516 */                          if (arrayList12 != null) {
/* 1526 */                              arrayList = new ArrayList(IOOi1I.I0000O(arrayList12, 10));
/* 1537 */                              for (Ioo000i1Io ioo000i1Io : arrayList12) {
/* 1547 */                                  I1OollilIo i1OollilIo3 = OlOO00iI0lI.I00li1OI;
/* 1549 */                                  i1OollilIo3.getClass();
/* 1554 */                                  int iIncrementAndGet3 = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo3);
/* 1558 */                                  ioo000i1Io.getClass();
/* 1561 */                                  int i13 = ioo000i1Io.I00000oOI;
/* 1563 */                                  OlOIloo1i olOIloo1i = new OlOIloo1i();
/* 1566 */                                  olOIloo1i.I00000oIO = iIncrementAndGet3;
/* 1568 */                                  olOIloo1i.I00000oOI = i13;
/* 1570 */                                  VarHandle.storeStoreFence();
/* 1573 */                                  arrayList.add(olOIloo1i);
                                        }
                                    } else {
/* 1577 */                              arrayList = Il01100l.I00iOIl;
                                    }
/* 1579 */                          olOO00iI0lI3.I00ilO0 = arrayList;
/* 1583 */                          ArrayList arrayList13 = new ArrayList();
/* 1588 */                          ArrayList arrayList14 = new ArrayList();
/* 1591 */                          Iterator it13 = arrayList11.iterator();
/* 1601 */                          while (it13.hasNext()) {
/* 1603 */                              Object next = it13.next();
/* 1610 */                              ArrayList arrayList15 = ((IIo1loI0) next).I00000oOI;
/* 1616 */                              if (!arrayList15.isEmpty()) {
/* 1619 */                                  Iterator it14 = arrayList15.iterator();
/* 1627 */                                  while (it14.hasNext()) {
/* 1635 */                                      OIlIOo oIlIOo3 = ((OlOIo0l1O0Ol) it14.next()).I000II;
/* 1648 */                                      if ((oIlIOo3 == null ? i11 : OIlIOo.I00000oIO(oIlIOo3.I00000oIO, 1L)) != 0) {
/* 1650 */                                          arrayList13.add(next);
                                                }
                                            }
                                        }
/* 1654 */                              arrayList14.add(next);
                                    }
/* 1662 */                          if (arrayList13.isEmpty()) {
/* 1672 */                              ArrayList arrayList16 = new ArrayList();
/* 1677 */                              ArrayList arrayList17 = new ArrayList();
/* 1680 */                              Iterator it15 = arrayList11.iterator();
/* 1688 */                              while (it15.hasNext()) {
/* 1690 */                                  Object next2 = it15.next();
/* 1697 */                                  ArrayList arrayList18 = ((IIo1loI0) next2).I00000oOI;
/* 1703 */                                  if (!arrayList18.isEmpty()) {
/* 1706 */                                      Iterator it16 = arrayList18.iterator();
/* 1714 */                                      while (it16.hasNext()) {
/* 1732 */                                          if (IOOi0Ool1i.I001i1O0Ol(OlOO00iI0lI.I00lll10, ((OlOIo0l1O0Ol) it16.next()).I000O01llI0)) {
/* 1734 */                                              arrayList16.add(next2);
                                                    }
                                                }
                                            }
/* 1738 */                                  arrayList17.add(next2);
                                        }
/* 1746 */                              if (arrayList16.isEmpty()) {
/* 1763 */                                  ArrayList arrayList19 = new ArrayList();
/* 1768 */                                  ArrayList arrayList20 = new ArrayList();
/* 1771 */                                  Iterator it17 = arrayList11.iterator();
/* 1779 */                                  while (it17.hasNext()) {
/* 1781 */                                      Object next3 = it17.next();
/* 1788 */                                      ArrayList arrayList21 = ((IIo1loI0) next3).I00000oOI;
/* 1794 */                                      if (!arrayList21.isEmpty()) {
/* 1797 */                                          Iterator it18 = arrayList21.iterator();
/* 1805 */                                          while (it18.hasNext()) {
/* 1825 */                                              if (OlOO00iI0lI.I00o0l1o1o0.contains(OlOIOoII1i.I00000oIO(((OlOIo0l1O0Ol) it18.next()).I0000Il00O))) {
/* 1827 */                                                  arrayList19.add(next3);
                                                        }
                                                    }
                                                }
/* 1831 */                                      arrayList20.add(next3);
                                            }
/* 1854 */                                  arrayListI00O10llo = !arrayList19.isEmpty() ? IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00Ol1ll1(arrayList19, OlOO00iI0lI.I00o101lO), arrayList20) : arrayList11;
                                        } else {
/* 1756 */                                  arrayListI00O10llo = IOOi0Ool1i.I00O10llo(IOOi0Ool1i.I00Ol1ll1(arrayList16, OlOO00iI0lI.I00o0iI0io1), arrayList17);
                                        }
                                    } else {
/* 1664 */                              arrayListI00O10llo = IOOi0Ool1i.I00O10llo(arrayList13, arrayList14);
                                    }
/* 1857 */                          ArrayList arrayList22 = new ArrayList();
/* 1862 */                          ArrayList arrayList23 = new ArrayList();
/* 1873 */                          for (Object obj3 : arrayListI00O10llo) {
/* 1882 */                              ArrayList arrayList24 = ((IIo1loI0) obj3).I00000oOI;
/* 1888 */                              if (!arrayList24.isEmpty()) {
/* 1891 */                                  Iterator it19 = arrayList24.iterator();
/* 1899 */                                  while (it19.hasNext()) {
/* 1907 */                                      OIlIOo oIlIOo4 = ((OlOIo0l1O0Ol) it19.next()).I000II;
/* 1922 */                                      if ((oIlIOo4 == null ? i11 : OIlIOo.I00000oIO(oIlIOo4.I00000oIO, 3L)) != 0) {
/* 1924 */                                          arrayList22.add(obj3);
                                                }
                                            }
                                        }
/* 1928 */                              arrayList23.add(obj3);
                                    }
/* 1936 */                          if (arrayList22.isEmpty()) {
/* 1945 */                              ArrayList arrayList25 = new ArrayList();
/* 1950 */                              ArrayList arrayList26 = new ArrayList();
/* 1961 */                              for (Object obj4 : arrayListI00O10llo) {
/* 1970 */                                  ArrayList arrayList27 = ((IIo1loI0) obj4).I00000oOI;
/* 1976 */                                  if (!arrayList27.isEmpty()) {
/* 1979 */                                      Iterator it20 = arrayList27.iterator();
/* 1987 */                                      while (it20.hasNext()) {
/* 1995 */                                          OIlIOoOil oIlIOoOil3 = ((OlOIo0l1O0Ol) it20.next()).I000OOo1O;
/* 2008 */                                          if ((oIlIOoOil3 == null ? i11 : OIlIOoOil.I00000oIO(oIlIOoOil3.I00000oIO, 1L)) != 0) {
/* 2010 */                                              arrayList25.add(obj4);
                                                    }
                                                }
                                            }
/* 2014 */                                  arrayList26.add(obj4);
                                        }
/* 2022 */                              if (!arrayList25.isEmpty()) {
/* 2024 */                                  arrayListI00O10llo = IOOi0Ool1i.I00O10llo(arrayList26, arrayList25);
                                        }
                                    } else {
/* 1938 */                              arrayListI00O10llo = IOOi0Ool1i.I00O10llo(arrayList23, arrayList22);
                                    }
/* 2028 */                          olOO00iI0lI3.I00io1l = arrayListI00O10llo;
/* 2038 */                          ArrayList arrayList28 = new ArrayList(IOOi1I.I0000O(arrayListI00O10llo, 10));
/* 2041 */                          Iterator it21 = arrayListI00O10llo.iterator();
/* 2049 */                          while (it21.hasNext()) {
/* 2063 */                              arrayList28.add(OlOO0I1.I00000oIO(((IIo1loI0) it21.next()).I00000oIO));
                                    }
/* 2067 */                          IOOi0Ool1i.I00iio(arrayList28);
/* 2070 */                          olOO00iI0lI3.I00iiI = linkedHashMap9;
/* 2076 */                          II1liooilI iI1liooilI = new II1liooilI(10);
/* 2079 */                          iI1liooilI.I00iiI = olOO00iI0lI3;
/* 2081 */                          VarHandle.storeStoreFence();
/* 2090 */                          olOO00iI0lI3.I00iiO = IOOi0Ool1i.I00Ol1ll1(arrayList10, iI1liooilI);
/* 2092 */                          olOO00iI0lI3.I00iio = linkedHashMap8;
/* 2094 */                          ArrayList arrayList29 = olOO00iI0lI3.I00io1l;
/* 2098 */                          ArrayList arrayList30 = new ArrayList();
/* 2101 */                          Iterator it22 = arrayList29.iterator();
/* 2109 */                          while (it22.hasNext()) {
/* 2119 */                              IOOii0O10Io0.I00100l0(arrayList30, ((IIo1loI0) it22.next()).I00000oOI);
                                    }
/* 2123 */                          olOO00iI0lI3.I00ioIO = arrayList30;
/* 2127 */                          O1OOII o1ooii3 = new O1OOII();
/* 2134 */                          Iterator it23 = olOO00iI0lI3.I00iOIl.I00000oOI.iterator();
/* 2142 */                          while (it23.hasNext()) {
/* 2150 */                              ((IIo1lioOolol) it23.next()).getClass();
                                    }
/* 2158 */                          olOO00iI0lI3.I00ilI0I1 = o1ooii3.I00000oOI();
/* 2160 */                          VarHandle.storeStoreFence();
/* 2163 */                          return olOO00iI0lI3;
                                }
/* 1292 */                      IIo1lioOolol iIo1lioOolol4 = (IIo1lioOolol) iIliIi1O0OiO7.I00000oOI.get(i12);
/* 1294 */                      List list8 = iIo1lioOolol4.I00000oIO;
/* 1306 */                      ArrayList arrayList31 = new ArrayList(IOOi1I.I0000O(list8, 10));
/* 1309 */                      Iterator it24 = list8.iterator();
/* 1317 */                      while (it24.hasNext()) {
/* 1329 */                          OlOIo0 olOIo03 = (OlOIo0) linkedHashMap3.get((OIlI1io) it24.next());
/* 1333 */                          I1OollilIo i1OollilIo4 = OlOO00iI0lI.I00l0OO0IO;
/* 1335 */                          i1OollilIo4.getClass();
/* 1340 */                          int iIncrementAndGet4 = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo4);
/* 1344 */                          Size size3 = olOIo03.I00000oOI;
/* 1346 */                          int i14 = olOIo03.I0000Il00O;
/* 1348 */                          String str2 = olOIo03.I0000O;
/* 1350 */                          OIlIOlIi oIlIOlIi3 = olOIo03.I000II;
/* 1352 */                          int i15 = size2;
/* 1354 */                          OIlII1I1 oIlII1I13 = olOIo03.I000O01llI0;
/* 1356 */                          int i16 = i12;
/* 1358 */                          OIlIOo oIlIOo5 = olOIo03.I000OOo1O;
/* 1360 */                          Iterator it25 = it24;
/* 1362 */                          l1I0oI l1i0oi = olOIo03.I0001Ioi1lo;
/* 1364 */                          ArrayList arrayList32 = arrayList3;
/* 1366 */                          OIlIOoOil oIlIOoOil4 = olOIo03.I000OiO;
/* 1368 */                          OlOIo0l1O0Ol olOIo0l1O0Ol = new OlOIo0l1O0Ol();
/* 1371 */                          olOIo0l1O0Ol.I00000oIO = iIncrementAndGet4;
/* 1373 */                          olOIo0l1O0Ol.I00000oOI = size3;
/* 1375 */                          olOIo0l1O0Ol.I0000Il00O = i14;
/* 1377 */                          olOIo0l1O0Ol.I0000O = str2;
/* 1379 */                          olOIo0l1O0Ol.I0000oI00 = oIlIOlIi3;
/* 1381 */                          olOIo0l1O0Ol.I0001Ioi1lo = oIlII1I13;
/* 1383 */                          olOIo0l1O0Ol.I000II = oIlIOo5;
/* 1385 */                          olOIo0l1O0Ol.I000O01llI0 = l1i0oi;
/* 1387 */                          olOIo0l1O0Ol.I000OOo1O = oIlIOoOil4;
/* 1389 */                          VarHandle.storeStoreFence();
/* 1392 */                          linkedHashMap8.put(olOIo0l1O0Ol, olOIo03);
/* 1395 */                          arrayList31.add(olOIo0l1O0Ol);
/* 1398 */                          size2 = i15;
/* 1400 */                          i12 = i16;
/* 1402 */                          it24 = it25;
/* 1404 */                          arrayList3 = arrayList32;
                                }
/* 1407 */                      int i17 = size2;
/* 1409 */                      int i18 = i12;
/* 1411 */                      ArrayList arrayList33 = arrayList3;
/* 1415 */                      I1OollilIo i1OollilIo5 = OlOO00iI0lI.I00l0I0l0lO1;
/* 1417 */                      i1OollilIo5.getClass();
/* 1422 */                      int iIncrementAndGet5 = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo5);
/* 1426 */                      IIo1loI0 iIo1loI0 = new IIo1loI0();
/* 1429 */                      iIo1loI0.I00000oIO = iIncrementAndGet5;
/* 1431 */                      iIo1loI0.I00000oOI = arrayList31;
/* 1433 */                      VarHandle.storeStoreFence();
/* 1436 */                      LinkedHashMap linkedHashMap10 = linkedHashMap7;
/* 1438 */                      linkedHashMap10.put(iIo1lioOolol4, iIo1loI0);
/* 1441 */                      ArrayList arrayList34 = arrayList9;
/* 1443 */                      arrayList34.add(iIo1loI0);
/* 1446 */                      Iterator it26 = arrayList31.iterator();
/* 1454 */                      while (it26.hasNext()) {
/* 1462 */                          ((OlOIo0l1O0Ol) it26.next()).I000OiO = iIo1loI0;
                                }
/* 1467 */                      Iterator it27 = iIo1lioOolol4.I00000oIO.iterator();
/* 1475 */                      while (it27.hasNext()) {
/* 1491 */                          ((OlOIo0) linkedHashMap3.get((OIlI1io) it27.next())).I000l1.add(iIo1loI0);
                                }
/* 1497 */                      linkedHashMap7 = linkedHashMap10;
/* 1499 */                      arrayList9 = arrayList34;
/* 1501 */                      arrayList3 = arrayList33;
/* 1495 */                      i12 = i18 + 1;
/* 1504 */                      size2 = i17;
                            }
                            break;
                        case 8:
/* 530 */                   IIll0Oilo iIll0Oilo3 = (IIll0Oilo) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiO;
/* 532 */                   lII11l.I00000oOI(iIll0Oilo3);
/* 545 */                   IIliIi1O0OiO iIliIi1O0OiO8 = (IIliIi1O0OiO) ((IIlio101Io) ((Ii10lIo0l1) this.I0000O).I00000oIO).I00iiI;
/* 547 */                   lII11l.I00000oOI(iIliIi1O0OiO8);
/* 562 */                   IIil1o0olooo iIil1o0olooo2 = (IIil1o0olooo) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I00000oOI).get();
/* 588 */                   Io0oi0 io0oi04 = (Io0oi0) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I00100o1O0lo).get();
/* 602 */                   OlOO00iI0lI olOO00iI0lI4 = (OlOO00iI0lI) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I0010I0i).get();
/* 616 */                   OlioOlO1 olioOlO12 = (OlioOlO1) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000oI00).get();
/* 618 */                   Oi00IilOloo0 oi00IilOloo0 = iIil1o0olooo2.I0000oI00;
/* 622 */                   I0Oi111ii i0Oi111ii = new I0Oi111ii(i3);
/* 625 */                   i0Oi111ii.I00iiI = iIll0Oilo3;
/* 627 */                   i0Oi111ii.I00iiO = iIliIi1O0OiO8;
/* 629 */                   i0Oi111ii.I00iio = io0oi04;
/* 631 */                   i0Oi111ii.I00ilI0I1 = olOO00iI0lI4;
/* 633 */                   i0Oi111ii.I00ilO0 = olioOlO12;
/* 635 */                   i0Oi111ii.I00io1l = iIil1o0olooo2;
/* 637 */                   VarHandle.storeStoreFence();
/* 644 */                   Ii10oo ii10oo2 = (Ii10oo) oi00IilOloo0.I00iOIl;
/* 647 */                   IOiOol0 iOiOol0 = new IOiOol0(5);
/* 650 */                   iOiOol0.I00iiO = ii10oo2;
/* 652 */                   iOiOol0.I00iiI = i0Oi111ii;
/* 663 */                   iOiOol0.I00iio = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo2, i, i, iOiOol0));
/* 674 */                   iOiOol0.I00ilI0I1 = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo2, i2, i, iOiOol0));
/* 682 */                   iOiOol0.I00ilO0 = new Ii10Oil1(ii10oo2, 7, i, iOiOol0);
/* 691 */                   iOiOol0.I00io1l = new Ii10Oil1(ii10oo2, 8, i, iOiOol0);
/* 702 */                   iOiOol0.I00ioIO = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo2, i4, i, iOiOol0));
/* 709 */                   OOiIoli oOiIoliI00000oIO = Iiio0Ii.I00000oIO(new Ii10Oil1(ii10oo2, i5, i, iOiOol0));
/* 713 */                   VarHandle.storeStoreFence();
/* 722 */                   IIioIlI0 iIioIlI02 = (IIioIlI0) ((Iiio0Ii) oOiIoliI00000oIO).get();
                            synchronized (iIil1o0olooo2.I0001Ioi1lo) {
/* 729 */                       iIil1o0olooo2.I000II.add(iIioIlI02);
                            }
/* 733 */                   lII11l.I00000oOI(iIioIlI02);
/* 736 */                   return iIioIlI02;
                        case 9:
/* 411 */                   OlOO00iI0lI olOO00iI0lI5 = (OlOO00iI0lI) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I0010I0i).get();
/* 419 */                   IiIio01lo iiIio01lo = (IiIio01lo) ((Ii10lIo0l1) this.I0000O).I0010o;
/* 431 */                   IIoI1li1o1l iIoI1li1o1l = (IIoI1li1o1l) ((Ii10oo) this.I0000Il00O).I001l0I00.get();
/* 435 */                   O1OOII o1ooii4 = olOO00iI0lI5.I00ilI0I1;
/* 437 */                   OlioOlO1 olioOlO13 = new OlioOlO1();
/* 440 */                   olioOlO13.I00iOIl = olOO00iI0lI5;
/* 442 */                   olioOlO13.I00iiI = iiIio01lo;
/* 444 */                   olioOlO13.I00iiO = iIoI1li1o1l;
/* 446 */                   olioOlO13.I00iio = o1ooii4;
/* 453 */                   olioOlO13.I00ilI0I1 = new Object();
/* 457 */                   LinkedHashMap linkedHashMap11 = new LinkedHashMap();
/* 466 */                   Object it28 = ((O1OOIoo01I) o1ooii4.entrySet()).iterator();
/* 477 */                   while (((OlloI01I) it28).hasNext()) {
/* 486 */                       Map.Entry entry2 = (Map.Entry) ((O1OIoioOO1lo) it28).next();
/* 488 */                       Object key2 = entry2.getKey();
/* 498 */                       ((IoiO1O1) entry2.getValue()).getClass();
/* 501 */                       linkedHashMap11.put(key2, null);
                            }
/* 505 */                   olioOlO13.I00ilO0 = linkedHashMap11;
/* 512 */                   olioOlO13.I00io1l = new LinkedHashMap();
/* 514 */                   olioOlO13.I00ioIO = true;
/* 516 */                   VarHandle.storeStoreFence();
/* 519 */                   return olioOlO13;
                        case 10:
/* 378 */                   IllI1OilO0O illI1OilO0O3 = new IllI1OilO0O();
/* 386 */                   illI1OilO0O3.I00iOIl = new Object();
/* 393 */                   illI1OilO0O3.I00iiI = new I1Il0loi();
/* 395 */                   VarHandle.storeStoreFence();
/* 398 */                   return illI1OilO0O3;
                        case 11:
/* 316 */                   long j2 = Long.MAX_VALUE;
/* 321 */                   long j3 = Long.MAX_VALUE;
/* 323 */                   for (int i19 = 0; i19 < 3; i19++) {
/* 325 */                       long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
/* 329 */                       System.currentTimeMillis();
/* 336 */                       long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
/* 339 */                       if (jElapsedRealtimeNanos2 < j3) {
/* 341 */                           j3 = jElapsedRealtimeNanos2;
                                }
                            }
/* 345 */                   while (i5 < 3) {
/* 347 */                       long jNanoTime = System.nanoTime();
/* 351 */                       SystemClock.elapsedRealtimeNanos();
/* 358 */                       long jNanoTime2 = System.nanoTime() - jNanoTime;
/* 361 */                       if (jNanoTime2 < j2) {
/* 363 */                           j2 = jNanoTime2;
                                }
/* 364 */                       i5++;
                            }
/* 369 */                   OllOIo1i0 ollOIo1i0 = new OllOIo1i0();
/* 372 */                   VarHandle.storeStoreFence();
/* 375 */                   return ollOIo1i0;
                        case 12:
/* 297 */                   IIll10 iIll10 = new IIll10();
/* 305 */                   iIll10.I00000oIO = new Object();
/* 309 */                   new LinkedHashMap();
/* 312 */                   VarHandle.storeStoreFence();
/* 315 */                   return iIll10;
                        case 13:
/* 239 */                   Io0olIl io0olIl = new Io0olIl();
/* 247 */                   io0olIl.I00000oIO = new OI1I0OoOl();
/* 249 */                   VarHandle.storeStoreFence();
/* 252 */                   return io0olIl;
                        case 14:
/* 232 */                   return il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0((O010OIi) ((Ii10oo) this.I0000Il00O).I0000O.get()), iiollilo0IO1.I00000oIO(((Oo10IliO00O) ((Ii10oo) this.I0000Il00O).I0001Ioi1lo.get()).I0001Ioi1lo, new Ii00oll("CXCP-Graph"))));
                        case 15:
/* 167 */                   IIll1I0 iIll1I0 = new IIll1I0();
/* 175 */                   iIll1I0.I00000oIO = new Object();
/* 179 */                   new LinkedHashSet();
/* 182 */                   VarHandle.storeStoreFence();
/* 185 */                   return iIll1I0;
                        case 16:
/* 64 */                    Io0oi0 io0oi05 = (Io0oi0) ((IiIio01lo) ((Ii10lIo0l1) this.I0000O).I00100o1O0lo).get();
/* 78 */                    IIlo0i0ll iIlo0i0ll4 = (IIlo0i0ll) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000Il00O).get();
/* 92 */                    Io1010ilO io1010ilO = (Io1010ilO) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I000o00OoI0I).get();
/* 106 */                   O10ol1o1O o10ol1o1O4 = (O10ol1o1O) ((OOiIoli) ((Ii10lIo0l1) this.I0000O).I0000O).get();
/* 108 */                   IOol1Ol iOol1Ol = new IOol1Ol();
/* 111 */                   iOol1Ol.I00000oIO = io0oi05;
/* 113 */                   iOol1Ol.I00000oOI = iIlo0i0ll4;
/* 115 */                   iOol1Ol.I0000Il00O = io1010ilO;
/* 117 */                   iOol1Ol.I0000O = o10ol1o1O4;
/* 119 */                   VarHandle.storeStoreFence();
/* 122 */                   return iOol1Ol;
                        case 17:
/* 22 */                    Io1010ilO io1010ilO2 = new Io1010ilO();
/* 44 */                    io1010ilO2.I00000oIO = iOOOIOoiIlII.I0000O(new OlO011Oo(null, null, null, null, null, null, null, null, null, null));
/* 46 */                    VarHandle.storeStoreFence();
/* 49 */                    return io1010ilO2;
                        default:
/* 19 */                    throw new AssertionError(i);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:176:0x02cb A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:177:0x02c6 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0363 A[Catch: all -> 0x0373, TRY_LEAVE, TryCatch #0 {, blocks: (B:75:0x0325, B:79:0x032d, B:81:0x0341, B:83:0x0358, B:84:0x035b, B:86:0x0363), top: B:164:0x0325 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get() throws PackageManager.NameNotFoundException {
                    Object value;
                    II0I0ili0 iI0I0ili0;
                    ArrayList arrayList;
                    Object objI00000oIO;
                    int i;
                    Object obj;
/* 6 */             boolean z = false;
/* 6 */             boolean z2 = false;
/* 6 */             boolean z3 = false;
/* 6 */             boolean z4 = false;
/* 7 */             int i2 = 2;
/* 8 */             int i3 = 1;
/* 9 */             int i4 = 0;
/* 9 */             boolean z5 = false;
/* 9 */             boolean z6 = false;
/* 9 */             boolean z7 = false;
/* 9 */             boolean z8 = false;
/* 9 */             boolean z9 = false;
/* 9 */             boolean z10 = false;
                    switch (this.I00000oIO) {
                        case 0:
/* 2688 */                  return I00000oIO();
                        case 1:
/* 1817 */                  int i5 = this.I00000oOI;
                            switch (i5) {
                                case 0:
/* 2355 */                          Ii0110 ii0110 = (Ii0110) ((OOiIoli) ((IOiOol0) this.I0000O).I00iio).get();
/* 2367 */                          Oo10IliO00O oo10IliO00O = (Oo10IliO00O) ((Ii10oo) this.I0000Il00O).I0001Ioi1lo.get();
/* 2391 */                          IIliIi1O0OiO iIliIi1O0OiO = (IIliIi1O0OiO) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00iiO;
/* 2393 */                          lII11l.I00000oOI(iIliIi1O0OiO);
/* 2398 */                          IOiOol0 iOiOol0 = (IOiOol0) this.I0000O;
/* 2402 */                          I0Oi111ii i0Oi111ii = (I0Oi111ii) iOiOol0.I00iiI;
/* 2406 */                          Io0oi0 io0oi0 = (Io0oi0) i0Oi111ii.I00iio;
/* 2410 */                          OlioOlO1 olioOlO1 = (OlioOlO1) i0Oi111ii.I00ilO0;
/* 2420 */                          IIioo1 iIioo1 = (IIioo1) ((OOiIoli) iOiOol0.I00ilI0I1).get();
/* 2434 */                          IO0I000 io0i000 = (IO0I000) ((OOiIoli) ((IOiOol0) this.I0000O).I00ioIO).get();
/* 2438 */                          IOiOol0 iOiOol02 = (IOiOol0) this.I0000O;
/* 2444 */                          Ii10oo ii10oo = (Ii10oo) iOiOol02.I00iiO;
/* 2452 */                          Oo10IliO00O oo10IliO00O2 = (Oo10IliO00O) ii10oo.I0001Ioi1lo.get();
/* 2456 */                          I0Oi111ii i0Oi111ii2 = (I0Oi111ii) iOiOol02.I00iiI;
/* 2460 */                          IIliIi1O0OiO iIliIi1O0OiO2 = (IIliIi1O0OiO) i0Oi111ii2.I00iiO;
/* 2462 */                          lII11l.I00000oOI(iIliIi1O0OiO2);
/* 2467 */                          OlOO00iI0lI olOO00iI0lI = (OlOO00iI0lI) i0Oi111ii2.I00ilI0I1;
/* 2475 */                          IIl10I1 iIl10I1 = (IIl10I1) ii10oo.I00100l0.get();
/* 2483 */                          OlOl1I olOl1I = (OlOl1I) ii10oo.I000oI1ioi.get();
/* 2489 */                          I1ii1o0 i1ii1o0 = new I1ii1o0(18, z6 ? 1 : 0);
/* 2492 */                          i1ii1o0.I00iiI = oo10IliO00O2;
/* 2494 */                          i1ii1o0.I00iiO = iIliIi1O0OiO2;
/* 2496 */                          i1ii1o0.I00iio = olOO00iI0lI;
/* 2498 */                          i1ii1o0.I00ilI0I1 = iIl10I1;
/* 2500 */                          i1ii1o0.I00ilO0 = olOl1I;
/* 2502 */                          VarHandle.storeStoreFence();
/* 2515 */                          OOiOlo1l0I0o oOiOlo1l0I0o = (OOiOlo1l0I0o) ((Ii10oo) this.I0000Il00O).I001IIilI0O.get();
/* 2527 */                          IIoI1li1o1l iIoI1li1o1l = (IIoI1li1o1l) ((Ii10oo) this.I0000Il00O).I001l0I00.get();
/* 2551 */                          Olli1lO0o0i0 olli1lO0o0i0 = (Olli1lO0o0i0) ((Ii10oo) this.I0000Il00O).I000lI.get();
/* 2563 */                          IIll0Oilo iIll0Oilo = (IIll0Oilo) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00iiI;
/* 2565 */                          lII11l.I00000oOI(iIll0Oilo);
/* 2574 */                          I0Oi111ii i0Oi111ii3 = (I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI;
/* 2578 */                          IIil1o0olooo iIil1o0olooo = (IIil1o0olooo) i0Oi111ii3.I00io1l;
/* 2582 */                          OlOO00iI0lI olOO00iI0lI2 = (OlOO00iI0lI) i0Oi111ii3.I00ilI0I1;
/* 2596 */                          IIioIlI0 iIioIlI0 = new IIioIlI0();
/* 2599 */                          iIioIlI0.I00000oIO = ii0110;
/* 2601 */                          iIioIlI0.I00000oOI = oo10IliO00O;
/* 2603 */                          iIioIlI0.I0000Il00O = iIliIi1O0OiO;
/* 2605 */                          iIioIlI0.I0000O = io0oi0;
/* 2607 */                          iIioIlI0.I0000oI00 = olioOlO1;
/* 2609 */                          iIioIlI0.I0001Ioi1lo = iIioo1;
/* 2613 */                          iIioIlI0.I000II = io0i000;
/* 2615 */                          iIioIlI0.I000O01llI0 = i1ii1o0;
/* 2617 */                          iIioIlI0.I000OOo1O = oOiOlo1l0I0o;
/* 2619 */                          iIioIlI0.I000OiO = iIoI1li1o1l;
/* 2621 */                          iIioIlI0.I000iOII = olli1lO0o0i0;
/* 2623 */                          iIioIlI0.I000l1 = iIll0Oilo;
/* 2625 */                          iIioIlI0.I000lI = iIil1o0olooo;
/* 2627 */                          iIioIlI0.I000o00OoI0I = olOO00iI0lI2;
/* 2634 */                          iIioIlI0.I000oI1ioi = new Object();
/* 2637 */                          iIioIlI0.I00100l0 = true;
/* 2641 */                          iIioIlI0.I00100o1O0lo = IIlOIi0oI1Io.I0001Ioi1lo;
/* 2650 */                          iIioIlI0.I0010I0i = new IIo1O0l(iIliIi1O0OiO.I00000oIO);
/* 2657 */                          iIioIlI0.I001IO000 = new IOi10loi();
/* 2661 */                          IOoil1iiIilo iOoil1iiIilo = null;
/* 2670 */                          iIioIlI0.I001lIiIIo1O = iOi1II01i0.I0000O(ii0110, null, null, new IIio11lIO(iIioIlI0, iOoil1iiIilo, z5 ? 1 : 0), 3);
/* 2682 */                          iIioIlI0.I001lllioOl = iOi1II01i0.I0000O(ii0110, null, null, new IIio11lIO(iIioIlI0, iOoil1iiIilo, 1), 3);
/* 2684 */                          VarHandle.storeStoreFence();
/* 2687 */                          return iIioIlI0;
                                case 1:
/* 2335 */                          return il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0((O010OIi) ((Ii10oo) this.I0000Il00O).I0000O.get()), iiollilo0IO1.I00000oIO(((Oo10IliO00O) ((Ii10oo) this.I0000Il00O).I0001Ioi1lo.get()).I0001Ioi1lo, new Ii00oll("CXCP-Camera2Controller"))));
                                case 2:
/* 2137 */                          Ii10oo ii10oo2 = (Ii10oo) this.I0000Il00O;
/* 2139 */                          OOiIoli oOiIoli = ii10oo2.I000II;
/* 2147 */                          Oo10IliO00O oo10IliO00O3 = (Oo10IliO00O) ii10oo2.I0001Ioi1lo.get();
/* 2159 */                          IIliIi1O0OiO iIliIi1O0OiO3 = (IIliIi1O0OiO) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00iiO;
/* 2161 */                          lII11l.I00000oOI(iIliIi1O0OiO3);
/* 2174 */                          O010OIi o010OIi = (O010OIi) ((Ii10oo) this.I0000Il00O).I0000O.get();
/* 2178 */                          String str = iIliIi1O0OiO3.I00000oIO;
/* 2180 */                          IIioo1 iIioo12 = new IIioo1();
/* 2183 */                          iIioo12.I00iOIl = oo10IliO00O3;
/* 2185 */                          iIioo12.I00iiI = str;
/* 2193 */                          iIioo12.I00iiO = (CameraManager) oOiIoli.get();
/* 2217 */                          IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(iiollilo0IO1.I00000oIO(new Oliiii0(o010OIi), iiollilo0IO1.I00000oIO(oo10IliO00O3.I0001Ioi1lo, new Ii00oll("CXCP-CameraStatusMonitor"))));
/* 2221 */                          iIioo12.I00iio = iIOlO1iiI00000oIO;
/* 2227 */                          iIioo12.I00ilI0I1 = iOOOIOoiIlII.I00000oIO(false);
/* 2231 */                          OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(IIo1OOl.I00000oIO);
/* 2235 */                          iIioo12.I00ilO0 = olO0OIIl1I00000oIO;
/* 2241 */                          iIioo12.I00io1l = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 2244 */                          Oiolio oiolioI00000oOI = Oiolio0iO1.I00000oOI(0, 7, null);
/* 2248 */                          iIioo12.I00ioIO = oiolioI00000oOI;
/* 2255 */                          iIioo12.I00l0I0l0lO1 = new OOli00O001(oiolioI00000oOI, null);
/* 2268 */                          iIioo12.I00l0OO0IO = ilOl0O00Il0i.I00000oIO(new I00oI0i((Object) iIioo12, (IOoil1iiIilo) (z2 ? 1 : 0), 16));
/* 2281 */                          iIioo12.I00li1OI = iOi1II01i0.I0000O(iIOlO1iiI00000oIO, null, null, new I0II0OiI((Object) iIioo12, (IOoil1iiIilo) (z ? 1 : 0), 8), 3);
/* 2283 */                          VarHandle.storeStoreFence();
/* 2286 */                          return iIioo12;
                                case 3:
/* 2092 */                          IOiOol0 iOiOol03 = (IOiOol0) this.I0000O;
/* 2096 */                          Ii10Oil1 ii10Oil1 = (Ii10Oil1) iOiOol03.I00ilO0;
/* 2100 */                          Ii10Oil1 ii10Oil12 = (Ii10Oil1) iOiOol03.I00io1l;
/* 2108 */                          IIliIi1O0OiO iIliIi1O0OiO4 = (IIliIi1O0OiO) ((I0Oi111ii) iOiOol03.I00iiI).I00iiO;
/* 2110 */                          lII11l.I00000oOI(iIliIi1O0OiO4);
                                    return iIliIi1O0OiO4.I000O01llI0 == 2 ? (IO0I000) ii10Oil12.get() : (IO0I000) ii10Oil1.get();
                                case 4:
/* 2065 */                          I0Oi111ii i0Oi111ii4 = (I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI;
/* 2069 */                          OlOO00iI0lI olOO00iI0lI3 = (OlOO00iI0lI) i0Oi111ii4.I00ilI0I1;
/* 2073 */                          IIliIi1O0OiO iIliIi1O0OiO5 = (IIliIi1O0OiO) i0Oi111ii4.I00iiO;
/* 2075 */                          lII11l.I00000oOI(iIliIi1O0OiO5);
/* 2078 */                          I0oOoilo i0oOoilo = new I0oOoilo(z7 ? 1 : 0);
/* 2081 */                          i0oOoilo.I00000oOI = olOO00iI0lI3;
/* 2083 */                          i0oOoilo.I0000Il00O = iIliIi1O0OiO5;
/* 2085 */                          VarHandle.storeStoreFence();
/* 2687 */                          return i0oOoilo;
                                case 5:
/* 2021 */                          OlOO00iI0lI olOO00iI0lI4 = (OlOO00iI0lI) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00ilI0I1;
/* 2035 */                          I0oOoI0o i0oOoI0o = new I0oOoI0o();
/* 2038 */                          i0oOoI0o.I00000oIO = olOO00iI0lI4;
/* 2040 */                          VarHandle.storeStoreFence();
/* 2687 */                          return i0oOoI0o;
                                case 6:
/* 1984 */                          I0Oi111ii i0Oi111ii5 = (I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI;
/* 1988 */                          OlOO00iI0lI olOO00iI0lI5 = (OlOO00iI0lI) i0Oi111ii5.I00ilI0I1;
/* 1992 */                          IIliIi1O0OiO iIliIi1O0OiO6 = (IIliIi1O0OiO) i0Oi111ii5.I00iiO;
/* 1994 */                          lII11l.I00000oOI(iIliIi1O0OiO6);
/* 1997 */                          I0oOoilo i0oOoilo2 = new I0oOoilo(i3);
/* 2000 */                          i0oOoilo2.I00000oOI = olOO00iI0lI5;
/* 2002 */                          i0oOoilo2.I0000Il00O = iIliIi1O0OiO6;
/* 2004 */                          VarHandle.storeStoreFence();
/* 2687 */                          return i0oOoilo2;
                                case 7:
/* 1921 */                          Oo10IliO00O oo10IliO00O4 = (Oo10IliO00O) ((Ii10oo) this.I0000Il00O).I0001Ioi1lo.get();
/* 1933 */                          IIliIi1O0OiO iIliIi1O0OiO7 = (IIliIi1O0OiO) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00iiO;
/* 1935 */                          lII11l.I00000oOI(iIliIi1O0OiO7);
/* 1948 */                          OlOO00iI0lI olOO00iI0lI6 = (OlOO00iI0lI) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00ilI0I1;
/* 1950 */                          I0oii10il i0oii10il = new I0oii10il();
/* 1953 */                          i0oii10il.I00000oIO = oo10IliO00O4;
/* 1955 */                          i0oii10il.I00000oOI = iIliIi1O0OiO7;
/* 1957 */                          i0oii10il.I0000Il00O = olOO00iI0lI6;
/* 1959 */                          VarHandle.storeStoreFence();
/* 2687 */                          return i0oii10il;
                                case 8:
/* 1840 */                          Oo10IliO00O oo10IliO00O5 = (Oo10IliO00O) ((Ii10oo) this.I0000Il00O).I0001Ioi1lo.get();
/* 1852 */                          IIliIi1O0OiO iIliIi1O0OiO8 = (IIliIi1O0OiO) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00iiO;
/* 1854 */                          lII11l.I00000oOI(iIliIi1O0OiO8);
/* 1867 */                          OlOO00iI0lI olOO00iI0lI7 = (OlOO00iI0lI) ((I0Oi111ii) ((IOiOol0) this.I0000O).I00iiI).I00ilI0I1;
/* 1879 */                          IIl0oO iIl0oO = (IIl0oO) ((Ii10oo) this.I0000Il00O).I000o00OoI0I.get();
/* 1893 */                          I0oI01oi1Il i0oI01oi1Il = new I0oI01oi1Il();
/* 1896 */                          i0oI01oi1Il.I00000oIO = oo10IliO00O5;
/* 1898 */                          i0oI01oi1Il.I00000oOI = iIliIi1O0OiO8;
/* 1900 */                          i0oI01oi1Il.I0000Il00O = olOO00iI0lI7;
/* 1902 */                          i0oI01oi1Il.I0000O = iIl0oO;
/* 1904 */                          VarHandle.storeStoreFence();
/* 2687 */                          return i0oI01oi1Il;
                                default:
/* 1827 */                          throw new AssertionError(i5);
                            }
                        case 2:
/* 1812 */                  return I00000oOI();
                        default:
/* 13 */                    int i6 = this.I00000oOI;
                            switch (i6) {
                                case 0:
/* 1808 */                          return new I1iOI11ioi1();
                                case 1:
/* 1646 */                          Ii110ilOil ii110ilOil = (Ii110ilOil) this.I0000Il00O;
/* 1650 */                          Context context = ii110ilOil.I00000oIO.I00iOIl;
/* 1658 */                          Ii1liIllli0 ii1liIllli0 = (Ii1liIllli0) ii110ilOil.I000lI.get();
/* 1660 */                          II0IOO1i iI0IOO1i = new II0IOO1i();
/* 1663 */                          iI0IOO1i.I00000oOI = context;
/* 1665 */                          iI0IOO1i.I0000Il00O = ii1liIllli0;
/* 1681 */                          OlO0OIIl1 olO0OIIl1I00000oIO2 = OlO0iOl0il.I00000oIO(new II0I0ili0(Il01100l.I00iOIl, null, false, false, 0, 0, ""));
/* 1685 */                          iI0IOO1i.I0000O = olO0OIIl1I00000oIO2;
/* 1691 */                          iI0IOO1i.I0000oI00 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO2);
/* 1704 */                          List list = (List) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, z3 ? 1 : 0, i2));
/* 1706 */                          list.size();
/* 1796 */                          do {
/* 1709 */                              value = olO0OIIl1I00000oIO2.getValue();
/* 1721 */                              iI0I0ili0 = (II0I0ili0) olO0OIIl1I00000oIO2.getValue();
/* 1724 */                              List<II00OOlli> list2 = list;
/* 1734 */                              arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 1745 */                              for (II00OOlli iI00OOlli : list2) {
/* 1753 */                                  I01Io1ilOIIo i01Io1ilOIIo = OOl1i000OO.I00iOIl;
/* 1776 */                                  arrayList.add(new II00Ol1Ii(String.valueOf(OOl1i000OO.I00iOIl.I0000O().nextDouble()), iI00OOlli, z8 ? 1 : 0, 32));
                                        }
/* 1796 */                          } while (!olO0OIIl1I00000oIO2.I000iOII(value, II0I0ili0.I00000oIO(iI0I0ili0, arrayList, null, false, false, 0, 0, null, 126)));
/* 1798 */                          iI0IOO1i.I000O01llI0();
/* 1801 */                          VarHandle.storeStoreFence();
                                    obj = iI0IOO1i;
                                    break;
                                case 2:
/* 1637 */                          return new II10oli();
                                case 3:
/* 1452 */                          Context context2 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 1454 */                          II1o0111IO0 iI1o0111IO0 = new II1o0111IO0();
/* 1457 */                          iI1o0111IO0.I00000oOI = context2;
/* 1472 */                          OlO0OIIl1 olO0OIIl1I00000oIO3 = OlO0iOl0il.I00000oIO(new II1l1O1oi01(I1O1ioi1ll0O.I00iiI, false, "Starting…", "", false));
/* 1476 */                          iI1o0111IO0.I0000Il00O = olO0OIIl1I00000oIO3;
/* 1482 */                          iI1o0111IO0.I0000O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO3);
/* 1489 */                          iI1o0111IO0.I0000oI00 = new IIOo1i(i3);
/* 1493 */                          O1loO10Ii0I o1loO10Ii0I = new O1loO10Ii0I();
/* 1498 */                          o1loO10Ii0I.I0000O = Barcode.FORMAT_QR_CODE;
/* 1503 */                          o1loO10Ii0I.I0000oI00 = Float.MAX_VALUE;
/* 1505 */                          o1loO10Ii0I.I0001Ioi1lo = Float.MAX_VALUE;
/* 1507 */                          iI1o0111IO0.I0001Ioi1lo = o1loO10Ii0I;
/* 1513 */                          Oi0Oooi oi0Oooi = new Oi0Oooi(17, z10 ? 1 : 0);
/* 1522 */                          oi0Oooi.I00iiI = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
/* 1524 */                          VarHandle.storeStoreFence();
/* 1527 */                          iI1o0111IO0.I000II = oi0Oooi;
/* 1531 */                          I1OI0i1lo i1OI0i1lo = new I1OI0i1lo();
/* 1534 */                          Context applicationContext = context2.getApplicationContext();
/* 1538 */                          i1OI0i1lo.I00000oIO = applicationContext;
/* 1542 */                          i1OI0i1lo.I0001Ioi1lo = "";
/* 1544 */                          i1OI0i1lo.I000O01llI0 = true;
                                    try {
/* 1548 */                              Object systemService = applicationContext.getSystemService("vibrator_manager");
/* 1561 */                              VibratorManager vibratorManager = systemService instanceof VibratorManager ? (VibratorManager) systemService : null;
/* 1569 */                              objI00000oIO = vibratorManager != null ? vibratorManager.getDefaultVibrator() : null;
                                    } catch (Throwable th) {
/* 1571 */                              objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                                    }
/* 1583 */                          i1OI0i1lo.I000OOo1O = (Vibrator) (objI00000oIO instanceof Oi10Ii1i1lo ? null : objI00000oIO);
/* 1587 */                          Context context3 = i1OI0i1lo.I00000oIO;
/* 1591 */                          I1O1l01lOi i1O1l01lOi = new I1O1l01lOi(z9 ? 1 : 0);
/* 1594 */                          i1O1l01lOi.I00000oOI = i1OI0i1lo;
/* 1596 */                          VarHandle.storeStoreFence();
/* 1602 */                          i1OI0i1lo.I00000oOI = new TextToSpeech(context3, i1O1l01lOi);
/* 1604 */                          VarHandle.storeStoreFence();
/* 1607 */                          iI1o0111IO0.I000O01llI0 = i1OI0i1lo;
/* 1614 */                          iI1o0111IO0.I000OOo1O = new Oil1lO();
/* 1621 */                          iI1o0111IO0.I000OiO = new II1iIoli();
/* 1623 */                          iI1o0111IO0.I0010I0i = "";
/* 1628 */                          iI1o0111IO0.I001l0I00 = 0.3f;
/* 1630 */                          VarHandle.storeStoreFence();
                                    obj = iI1o0111IO0;
                                    break;
                                case 4:
/* 1398 */                          IO1loOo1o iO1loOo1o = (IO1loOo1o) ((Ii110ilOil) this.I0000Il00O).I00100l0.get();
/* 1400 */                          IO1OIo01l1 iO1OIo01l1 = new IO1OIo01l1();
/* 1403 */                          iO1OIo01l1.I00000oOI = iO1loOo1o;
/* 1407 */                          IlOil1ii allConversations = iO1loOo1o.I00000oIO.getAllConversations();
/* 1411 */                          IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(iO1OIo01l1);
/* 1415 */                          OlO00IIi olO00IIiI00000oIO = Ol00III.I00000oIO(2);
/* 1419 */                          Il01100l il01100l = Il01100l.I00iOIl;
/* 1425 */                          iO1OIo01l1.I0000Il00O = ilOoiIi101.I0000Il00O(allConversations, iOO11li1OoIII00000oIO, olO00IIiI00000oIO, il01100l);
/* 1427 */                          OlO0OIIl1 olO0OIIl1I00000oIO4 = OlO0iOl0il.I00000oIO(il01100l);
/* 1431 */                          iO1OIo01l1.I0000O = olO0OIIl1I00000oIO4;
/* 1437 */                          iO1OIo01l1.I0000oI00 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO4);
/* 1439 */                          VarHandle.storeStoreFence();
                                    obj = iO1OIo01l1;
                                    break;
                                case 5:
/* 1381 */                          return new Il111OOi1I();
                                case 6:
/* 1374 */                          return new IlI1loI1lO1();
                                case 7:
/* 1367 */                          return new Ili0IOilll10();
                                case 8:
/* 1294 */                          Context context4 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 1296 */                          Io1o01Ol0i01 io1o01Ol0i01 = new Io1o01Ol0i01();
/* 1306 */                          OlO0OIIl1 olO0OIIl1I00000oIO5 = OlO0iOl0il.I00000oIO(new Io1loIilO10I("", false));
/* 1310 */                          io1o01Ol0i01.I00000oOI = olO0OIIl1I00000oIO5;
/* 1316 */                          io1o01Ol0i01.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO5);
/* 1318 */                          SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context4);
/* 1322 */                          speechRecognizerCreateSpeechRecognizer.setRecognitionListener(io1o01Ol0i01);
/* 1325 */                          io1o01Ol0i01.I0000O = speechRecognizerCreateSpeechRecognizer;
/* 1331 */                          Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
/* 1338 */                          intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
/* 1345 */                          intent.putExtra("android.speech.extra.LANGUAGE", "en-US");
/* 1350 */                          intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
/* 1355 */                          intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
/* 1358 */                          io1o01Ol0i01.I0000oI00 = intent;
/* 1360 */                          VarHandle.storeStoreFence();
                                    obj = io1o01Ol0i01;
                                    break;
                                case 9:
/* 1281 */                          return new IoiIII();
                                case 10:
/* 1260 */                          IO1loOo1o iO1loOo1o2 = (IO1loOo1o) ((Ii110ilOil) this.I0000Il00O).I00100l0.get();
/* 1268 */                          Context context5 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 1270 */                          O111I0i1iOl o111I0i1iOl = new O111I0i1iOl();
/* 1273 */                          o111I0i1iOl.I0000O = iO1loOo1o2;
/* 1275 */                          o111I0i1iOl.I0000oI00 = context5;
                                    obj = o111I0i1iOl;
                                    break;
                                case 11:
/* 1229 */                          IO1loOo1o iO1loOo1o3 = (IO1loOo1o) ((Ii110ilOil) this.I0000Il00O).I00100l0.get();
/* 1237 */                          Context context6 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 1239 */                          O111Iil o111Iil = new O111Iil();
/* 1242 */                          o111Iil.I0000O = iO1loOo1o3;
/* 1244 */                          o111Iil.I0000oI00 = context6;
                                    obj = o111Iil;
                                    break;
                                case 12:
/* 1178 */                          IO1loOo1o iO1loOo1o4 = (IO1loOo1o) ((Ii110ilOil) this.I0000Il00O).I00100l0.get();
/* 1182 */                          Ii110ilOil ii110ilOil2 = (Ii110ilOil) this.I0000Il00O;
/* 1186 */                          Context context7 = ii110ilOil2.I00000oIO.I00iOIl;
/* 1208 */                          O11OliOlOII o11OliOlOII = new O11OliOlOII();
/* 1211 */                          o11OliOlOII.I0000O = iO1loOo1o4;
/* 1213 */                          o11OliOlOII.I0000oI00 = context7;
                                    obj = o11OliOlOII;
                                    break;
                                case 13:
/* 1161 */                          return new O11l1I();
                                case 14:
/* 986 */                           Ii1I1ooo10O0 ii1I1ooo10O0 = (Ii1I1ooo10O0) ((Ii110ilOil) this.I0000Il00O).I0010o.get();
/* 998 */                           Ii1I1ooo10O0 ii1I1ooo10O02 = (Ii1I1ooo10O0) ((Ii110ilOil) this.I0000Il00O).I0001Ioi1lo.get();
/* 1000 */                          O1i1O1I o1i1O1I = new O1i1O1I();
/* 1003 */                          o1i1O1I.I00000oOI = ii1I1ooo10O0;
/* 1005 */                          o1i1O1I.I0000Il00O = ii1I1ooo10O02;
/* 1014 */                          OlO0OIIl1 olO0OIIl1I00000oIO6 = OlO0iOl0il.I00000oIO(new O1i1IIoO1IIl(Il01100l.I00iOIl, false, null));
/* 1018 */                          o1i1O1I.I0000O = olO0OIIl1I00000oIO6;
/* 1024 */                          o1i1O1I.I0000oI00 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO6);
/* 1028 */                          IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(0);
/* 1039 */                          ioIlOo1o0IIl.I00II0Ol1O0l(OiIOOIOIo.I00000oOI, new IoI0IiI0(5));
/* 1046 */                          I0o1io0i1OO0 i0o1io0i1OO0 = new I0o1io0i1OO0();
/* 1056 */                          i0o1io0i1OO0.I00000oIO = new I01OoIoio00O(22);
/* 1065 */                          i0o1io0i1OO0.I00000oOI = new I01OoIoio00O(23);
/* 1067 */                          I0lOIOI11OIl i0lOIOI11OIl = new I0lOIOI11OIl();
/* 1070 */                          i0lOIOI11OIl.I00ilI0I1 = i0o1io0i1OO0;
/* 1078 */                          if (System.getProperty("kotlinx.io.pool.size.bytes") == null && O0000Ioio00.I0000O(System.getProperty("java.vm.name"), "Dalvik") && Runtime.getRuntime().maxMemory() > 10000000) {
/* 1111 */                              System.setProperty("kotlinx.io.pool.size.bytes", "2097152");
                                    }
/* 1128 */                          i0lOIOI11OIl.I00ilO0 = I1IoiO1l.I00IlilI0i0i(new IoIlloI[]{IoOO1000I.I00000oIO, OiIIlIl00I.I00000oIO});
/* 1130 */                          VarHandle.storeStoreFence();
/* 1138 */                          o1i1O1I.I0001Ioi1lo = new IoIlI1oli(i0lOIOI11OIl, ioIlOo1o0IIl);
/* 1151 */                          iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o1i1O1I), null, null, new I0II0OiI((Object) o1i1O1I, (IOoil1iiIilo) (z4 ? 1 : 0), 29), 3);
/* 1154 */                          VarHandle.storeStoreFence();
                                    obj = o1i1O1I;
                                    break;
                                case 15:
/* 969 */                           return new O1loIO();
                                case 16:
/* 916 */                           Context context8 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 918 */                           O1o10Iiio o1o10Iiio = new O1o10Iiio();
/* 921 */                           o1o10Iiio.I00000oOI = context8;
/* 936 */                           OlO0OIIl1 olO0OIIl1I00000oIO7 = OlO0iOl0il.I00000oIO(new O1o0lio(true, false, "", "", Il01100l.I00iOIl, false));
/* 940 */                           o1o10Iiio.I0000Il00O = olO0OIIl1I00000oIO7;
/* 946 */                           o1o10Iiio.I0000O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO7);
/* 950 */                           OlO0OIIl1 olO0OIIl1I00000oIO8 = OlO0iOl0il.I00000oIO(Boolean.FALSE);
/* 954 */                           o1o10Iiio.I0000oI00 = olO0OIIl1I00000oIO8;
/* 960 */                           o1o10Iiio.I0001Ioi1lo = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO8);
/* 962 */                           VarHandle.storeStoreFence();
                                    obj = o1o10Iiio;
                                    break;
                                case 17:
/* 903 */                           return new O1o1io0oi0ol();
                                case PoseLandmark.RIGHT_PINKY:
/* 420 */                           Ii1lo00I1 ii1lo00I1 = (Ii1lo00I1) ((Ii110ilOil) this.I0000Il00O).I001IIilI0O.get();
/* 432 */                           Ii1liIllli0 ii1liIllli02 = (Ii1liIllli0) ((Ii110ilOil) this.I0000Il00O).I000lI.get();
/* 444 */                           Ilo0lli0o ilo0lli0o = (Ilo0lli0o) ((Ii110ilOil) this.I0000Il00O).I00111O.get();
/* 450 */                           ((Ii11101IOi) this.I0000O).getClass();
/* 453 */                           Ioio0O ioio0OI00000oIO = Ii11101IOi.I00000oIO();
/* 463 */                           Context context9 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 465 */                           O1ol100o0O o1ol100o0O = new O1ol100o0O();
/* 468 */                           o1ol100o0O.I00000oOI = ii1lo00I1;
/* 470 */                           o1ol100o0O.I0000Il00O = ii1liIllli02;
/* 472 */                           o1ol100o0O.I0000O = ilo0lli0o;
/* 474 */                           o1ol100o0O.I0000oI00 = ioio0OI00000oIO;
/* 476 */                           o1ol100o0O.I0001Ioi1lo = context9;
/* 482 */                           o1ol100o0O.I000II = context9.getExternalFilesDir(null);
/* 486 */                           Il01100l il01100l2 = Il01100l.I00iOIl;
/* 488 */                           Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 497 */                           OlO0OIIl1 olO0OIIl1I00000oIO9 = OlO0iOl0il.I00000oIO(new O1oiOloOo(il01100l2, il011I1OiO0I, il011I1OiO0I, null, 32752));
/* 501 */                           o1ol100o0O.I000O01llI0 = olO0OIIl1I00000oIO9;
/* 507 */                           o1ol100o0O.I000OOo1O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO9);
/* 511 */                           I11OlOOlO0 i11OlOOlO0 = I11OlOOlO0.I00000oOI;
/* 513 */                           Intent intent2 = III11iool.I00000oIO;
/* 515 */                           PackageManager packageManager = context9.getPackageManager();
/* 521 */                           ArrayList arrayList2 = new ArrayList();
/* 524 */                           Intent intent3 = III11iool.I00000oIO;
/* 526 */                           ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent3, 0);
/* 537 */                           String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
/* 553 */                           for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent3, 131136)) {
/* 561 */                               IntentFilter intentFilter = resolveInfo.filter;
/* 563 */                               if (intentFilter != null && intentFilter.hasAction("android.intent.action.VIEW") && resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") && resolveInfo.filter.schemesIterator() != null && resolveInfo.filter.authoritiesIterator() == null) {
/* 603 */                                   Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
/* 607 */                                   boolean zEquals = false;
/* 608 */                                   boolean zEquals2 = false;
                                            while (true) {
/* 613 */                                       if (itSchemesIterator.hasNext()) {
/* 615 */                                           String next = itSchemesIterator.next();
/* 627 */                                           zEquals |= "http".equals(next);
/* 634 */                                           zEquals2 |= "https".equals(next);
/* 635 */                                           if (zEquals && zEquals2) {
                                                        try {
/* 645 */                                                   PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 64);
/* 651 */                                                   String str3 = resolveInfo.activityInfo.packageName;
/* 655 */                                                   Intent intent4 = new Intent();
/* 660 */                                                   intent4.setAction("android.support.customtabs.action.CustomTabsService");
/* 663 */                                                   intent4.setPackage(str3);
/* 670 */                                                   if (packageManager.resolveService(intent4, 0) != null) {
/* 674 */                                                       III11IO0 iii11io0 = new III11IO0(packageInfo, true);
/* 685 */                                                       if (resolveInfo.activityInfo.packageName.equals(str2)) {
/* 687 */                                                           arrayList2.add(0, iii11io0);
/* 690 */                                                           i = 1;
/* 698 */                                                           III11IO0 iii11io02 = new III11IO0(packageInfo, false);
/* 709 */                                                           if (resolveInfo.activityInfo.packageName.equals(str2)) {
/* 711 */                                                               arrayList2.add(i, iii11io02);
                                                                    } else {
/* 716 */                                                               arrayList2.add(iii11io02);
                                                                    }
                                                                } else {
/* 692 */                                                           arrayList2.add(iii11io0);
/* 695 */                                                           i = 0;
/* 698 */                                                           III11IO0 iii11io022 = new III11IO0(packageInfo, false);
/* 709 */                                                           if (resolveInfo.activityInfo.packageName.equals(str2)) {
                                                                    }
                                                                }
                                                            } else {
/* 695 */                                                       i = 0;
/* 698 */                                                       III11IO0 iii11io0222 = new III11IO0(packageInfo, false);
/* 709 */                                                       if (resolveInfo.activityInfo.packageName.equals(str2)) {
                                                                }
                                                            }
                                                        } catch (PackageManager.NameNotFoundException unused) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 721 */                           Iterator it = arrayList2.iterator();
/* 725 */                           III11IO0 iii11io03 = null;
                                    while (true) {
/* 730 */                               if (it.hasNext()) {
/* 736 */                                   III11IO0 iii11io04 = (III11IO0) it.next();
/* 744 */                                   if (iii11io04.I0000O.booleanValue()) {
/* 746 */                                       iii11io03 = iii11io04;
                                            } else if (iii11io03 == null) {
/* 750 */                                       iii11io03 = iii11io04;
                                            }
                                        }
                                    }
/* 755 */                           iOliil ioliil = new iOliil(4);
/* 760 */                           WeakReference weakReference = new WeakReference(context9);
/* 763 */                           ioliil.I00iiI = weakReference;
/* 770 */                           ioliil.I00iiO = new AtomicReference();
/* 774 */                           CountDownLatch countDownLatch = new CountDownLatch(1);
/* 777 */                           ioliil.I00iio = countDownLatch;
/* 779 */                           VarHandle.storeStoreFence();
/* 782 */                           I1ii1l10IO i1ii1l10IO = new I1ii1l10IO();
/* 785 */                           i1ii1l10IO.I00000oIO = false;
/* 787 */                           i1ii1l10IO.I00000oOI = context9;
/* 789 */                           i1ii1l10IO.I0000Il00O = ioliil;
/* 791 */                           i1ii1l10IO.I0000O = iii11io03;
/* 793 */                           if (iii11io03 != null && iii11io03.I0000O.booleanValue()) {
/* 803 */                               String str4 = iii11io03.I00000oIO;
                                        synchronized (ioliil) {
/* 810 */                                   if (((Ii0io10) ioliil.I00ilI0I1) == null) {
/* 816 */                                       Ii0io10 ii0io10 = new Ii0io10(i4);
/* 819 */                                       ii0io10.I00iiO = ioliil;
/* 821 */                                       VarHandle.storeStoreFence();
/* 824 */                                       ioliil.I00ilI0I1 = ii0io10;
/* 830 */                                       Context context10 = (Context) weakReference.get();
/* 832 */                                       if (context10 != null) {
/* 836 */                                           Ii0io10 ii0io102 = (Ii0io10) ioliil.I00ilI0I1;
/* 842 */                                           ii0io102.I00iiI = context10.getApplicationContext();
/* 848 */                                           Intent intent5 = new Intent("android.support.customtabs.action.CustomTabsService");
/* 855 */                                           if (!TextUtils.isEmpty(str4)) {
/* 857 */                                               intent5.setPackage(str4);
                                                    }
/* 866 */                                           if (!context10.bindService(intent5, ii0io102, 33)) {
/* 876 */                                               O1I1OO.I000OOo1O().I000l1(4, null, "Unable to bind custom tabs service", new Object[0]);
/* 879 */                                               countDownLatch.countDown();
                                                    }
                                                }
                                            }
                                        }
                                    }
/* 887 */                           VarHandle.storeStoreFence();
/* 890 */                           o1ol100o0O.I000OiO = i1ii1l10IO;
/* 894 */                           o1ol100o0O.I000iOII = "";
/* 896 */                           VarHandle.storeStoreFence();
                                    obj = o1ol100o0O;
                                    break;
                                case PoseLandmark.LEFT_INDEX:
/* 403 */                           return new OII1O1IIolI();
                                case PoseLandmark.RIGHT_INDEX:
/* 393 */                           Object oIOI1ii = new OIOI1ii();
/* 396 */                           VarHandle.storeStoreFence();
                                    obj = oIOI1ii;
                                    break;
                                case PoseLandmark.LEFT_THUMB:
/* 218 */                           Ii110ilOil ii110ilOil3 = (Ii110ilOil) this.I0000Il00O;
/* 222 */                           Context context11 = ii110ilOil3.I00000oIO.I00iOIl;
/* 230 */                           OOiool1 oOiool1 = (OOiool1) ii110ilOil3.I001i1O0Ol.get();
/* 242 */                           Oo0oIo00ioo oo0oIo00ioo = (Oo0oIo00ioo) ((Ii110ilOil) this.I0000Il00O).I00100o1O0lo.get();
/* 254 */                           OOl0lo oOl0lo = (OOl0lo) ((Ii110ilOil) this.I0000Il00O).I0010I0i.get();
/* 256 */                           OOl1OlI0 oOl1OlI0 = new OOl1OlI0();
/* 259 */                           oOl1OlI0.I00000oOI = context11;
/* 261 */                           oOl1OlI0.I0000Il00O = oOiool1;
/* 263 */                           oOl1OlI0.I0000O = oo0oIo00ioo;
/* 265 */                           oOl1OlI0.I0000oI00 = oOl0lo;
/* 269 */                           IlOil1ii ilOil1iiObserveAll = oOiool1.I0000Il00O.observeAll();
/* 275 */                           IlOl01I111 ilOl01I111 = new IlOl01I111(i2);
/* 278 */                           ilOl01I111.I00iiI = ilOil1iiObserveAll;
/* 280 */                           ilOl01I111.I00iiO = oOiool1;
/* 282 */                           VarHandle.storeStoreFence();
/* 285 */                           IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(oOl1OlI0);
/* 289 */                           OlO00IIi olO00IIiI00000oIO2 = Ol00III.I00000oIO(2);
/* 293 */                           Il01100l il01100l3 = Il01100l.I00iOIl;
/* 299 */                           oOl1OlI0.I0001Ioi1lo = ilOoiIi101.I0000Il00O(ilOl01I111, iOO11li1OoIII00000oIO2, olO00IIiI00000oIO2, il01100l3);
/* 301 */                           OlO0OIIl1 olO0OIIl1I00000oIO10 = OlO0iOl0il.I00000oIO(null);
/* 305 */                           oOl1OlI0.I000II = olO0OIIl1I00000oIO10;
/* 311 */                           oOl1OlI0.I000O01llI0 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO10);
/* 315 */                           OlO0OIIl1 olO0OIIl1I00000oIO11 = OlO0iOl0il.I00000oIO(OOl11o1IO0o.I00000oIO);
/* 319 */                           oOl1OlI0.I000OOo1O = olO0OIIl1I00000oIO11;
/* 325 */                           oOl1OlI0.I000OiO = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO11);
/* 327 */                           OlO0OIIl1 olO0OIIl1I00000oIO12 = OlO0iOl0il.I00000oIO(il01100l3);
/* 331 */                           oOl1OlI0.I000iOII = olO0OIIl1I00000oIO12;
/* 337 */                           oOl1OlI0.I000l1 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO12);
/* 341 */                           OlO0OIIl1 olO0OIIl1I00000oIO13 = OlO0iOl0il.I00000oIO(Boolean.FALSE);
/* 345 */                           oOl1OlI0.I000lI = olO0OIIl1I00000oIO13;
/* 351 */                           oOl1OlI0.I000o00OoI0I = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO13);
/* 353 */                           OlO0OIIl1 olO0OIIl1I00000oIO14 = OlO0iOl0il.I00000oIO(null);
/* 357 */                           oOl1OlI0.I000oI1ioi = olO0OIIl1I00000oIO14;
/* 363 */                           oOl1OlI0.I00100l0 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO14);
/* 372 */                           oOl1OlI0.I00100o1O0lo = new AtomicLong(0L);
/* 374 */                           VarHandle.storeStoreFence();
                                    obj = oOl1OlI0;
                                    break;
                                case PoseLandmark.RIGHT_THUMB:
/* 209 */                           return new OilIlo();
                                case PoseLandmark.LEFT_HIP:
/* 160 */                           Ii1liIllli0 ii1liIllli03 = (Ii1liIllli0) ((Ii110ilOil) this.I0000Il00O).I000lI.get();
/* 168 */                           Context context12 = ((Ii110ilOil) this.I0000Il00O).I00000oIO.I00iOIl;
/* 170 */                           Ol0o1OiOIIIl ol0o1OiOIIIl = new Ol0o1OiOIIIl();
/* 173 */                           ol0o1OiOIIIl.I00000oOI = ii1liIllli03;
/* 175 */                           ol0o1OiOIIIl.I0000Il00O = context12;
/* 179 */                           Il01100l il01100l4 = Il01100l.I00iOIl;
/* 191 */                           OlO0OIIl1 olO0OIIl1I00000oIO15 = OlO0iOl0il.I00000oIO(new Ol0loOOoo(false, il01100l4, false, null, null, false, il01100l4, null));
/* 195 */                           ol0o1OiOIIIl.I0000O = olO0OIIl1I00000oIO15;
/* 201 */                           ol0o1OiOIIIl.I0000oI00 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO15);
/* 203 */                           VarHandle.storeStoreFence();
                                    obj = ol0o1OiOIIIl;
                                    break;
                                case PoseLandmark.RIGHT_HIP:
/* 143 */                           return new OlI1IliO0I();
                                case PoseLandmark.LEFT_KNEE:
/* 136 */                           return new OlI1i0();
                                case PoseLandmark.RIGHT_KNEE:
/* 129 */                           return new Oliii00iliIi();
                                case 27:
/* 88 */                            Ii110ilOil ii110ilOil4 = (Ii110ilOil) this.I0000Il00O;
/* 90 */                            I0oIIIl00 i0oIIIl00 = ii110ilOil4.I00000oIO;
/* 100 */                           Object oo1I1Oil = new Oo1I1Oil();
/* 105 */                           Il01100l il01100l5 = Il01100l.I00iOIl;
/* 107 */                           Oo1I1II1I oo1I1II1I = new Oo1I1II1I();
/* 110 */                           oo1I1II1I.I00000oIO = il01100l5;
/* 112 */                           VarHandle.storeStoreFence();
/* 115 */                           OlO0iOl0il.I00000oIO(oo1I1II1I);
/* 120 */                           OlO0iOl0il.I00000oIO(Boolean.FALSE);
/* 123 */                           VarHandle.storeStoreFence();
                                    obj = oo1I1Oil;
                                    break;
                                case PoseLandmark.RIGHT_ANKLE:
/* 71 */                            Ii1liIllli0 ii1liIllli04 = (Ii1liIllli0) ((Ii110ilOil) this.I0000Il00O).I000lI.get();
/* 73 */                            OoI01iiOoo01 ooI01iiOoo01 = new OoI01iiOoo01();
/* 76 */                            ooI01iiOoo01.I00000oOI = ii1liIllli04;
/* 78 */                            VarHandle.storeStoreFence();
                                    obj = ooI01iiOoo01;
                                    break;
                                case PoseLandmark.LEFT_HEEL:
/* 54 */                            return new OoIO11oiiiil();
                                case 30:
/* 47 */                            return new OoIoI0iii0();
                                case PoseLandmark.LEFT_FOOT_INDEX:
/* 40 */                            return new Ool0lIIlll();
                                case 32:
/* 33 */                            return new i001ll1();
                                case 33:
/* 26 */                            return new i0I01lo();
                                default:
/* 23 */                            throw new AssertionError(i6);
                            }
/* 81 */                    return obj;
                    }
                }
            }
