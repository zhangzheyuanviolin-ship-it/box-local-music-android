            package p000;

            import android.accessibilityservice.AccessibilityServiceInfo;
            import android.content.res.Resources;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.Log;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function3;
            
            public final class I0ll1oo extends I01lloolio1l implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
                public static final OI0l1iiooO I010l10O;
                public I0lio1O01i01 I00iio;
                public int I00ilI0I1;
                public I0liooi I00ilO0;
                public AccessibilityManager I00io1l;
                public long I00ioIO;
                public List I00l0I0l0lO1;
                public I0ll0IlI1lo I00l0OO0IO;
                public int I00li1OI;
                public int I00ll1;
                public I01oII0IOOO I00lli11;
                public I01oII0IOOO I00lll10;
                public boolean I00o0iI0io1;
                public OI0l1oli1I I00o0l1o1o0;
                public OI0l1oli1I I00o101lO;
                public OlIIioolI I00oI0i;
                public OlIIioolI I00oII;
                public int I00oIiI10;
                public Integer I00oO101o;
                public I1Io1oIoo I00oOio10iI1;
                public IIIII1OI1 I00ol1;
                public boolean I00olI;
                public I0ll0oIl I00oli;
                public OI0l1oli1I I00oliIiO01i;
                public OI0lOIOi1l I00oo1iO0ll;
                public OI0l1iIo1 I00ooIo0;
                public OI0l1iIo1 I00ooiO1I;
                public String I00oooO;
                public String I0100i;
                public OlilOlOiI I0100o111I;
                public OI0l1oli1I I010101Oo1lO;
                public Oil000oIIO I010I0;
                public boolean I010II;
                public OI0l1iIo1 I010OIo1l;
                public I0100i I010i10l;
                public ArrayList I010iIIOlo;
                public I0liooi I010ioo;

                static {
/* 3 */             int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
/* 8 */             OI0l1iiooO oI0l1iiooO = IooIo0.I00000oIO;
/* 12 */            OI0l1iiooO oI0l1iiooO2 = new OI0l1iiooO(32);
/* 15 */            int i = oI0l1iiooO2.I00000oOI;
/* 17 */            if (i < 0) {
/* 49 */                lO00l0o.I00000oOI("");
/* 53 */                throw null;
                    }
/* 19 */            int i2 = i + 32;
/* 21 */            oI0l1iiooO2.I00000oOI(i2);
/* 24 */            int[] iArr2 = oI0l1iiooO2.I00000oIO;
/* 26 */            int i3 = oI0l1iiooO2.I00000oOI;
/* 28 */            if (i != i3) {
/* 30 */                I1IoiO1l.I000O01llI0(i2, i, i3, iArr2, iArr2);
                    }
/* 36 */            I1IoiO1l.I000l1(i, 0, 12, iArr, iArr2);
                    oI0l1iiooO2.I00000oOI += 32;
/* 44 */            I010l10O = oI0l1iiooO2;
                }

                public static String I000oI1ioi(Oil000 oil000) {
                    I1111OO10i i1111OO10i;
/* 2 */             if (oil000 != null) {
/* 5 */                 OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 7 */                 OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 9 */                 Oil0IoooOio oil0IoooOio = Oil0I1O.I00000oIO;
/* 15 */                if (oI10I1IoI0Ol.I0000Il00O(oil0IoooOio)) {
/* 27 */                    return O10lllI0o0.I00000oIO((List) oiioiIIlooo.I000OOo1O(oil0IoooOio), ",", null, 62);
                        }
/* 32 */                Oil0IoooOio oil0IoooOio2 = Oil0I1O.I00IO1oi11O;
/* 38 */                if (oI10I1IoI0Ol.I0000Il00O(oil0IoooOio2)) {
/* 40 */                    Object objI000II = oI10I1IoI0Ol.I000II(oil0IoooOio2);
/* 44 */                    if (objI000II == null) {
/* 46 */                        objI000II = null;
                            }
/* 47 */                    I1111OO10i i1111OO10i2 = (I1111OO10i) objI000II;
/* 49 */                    if (i1111OO10i2 != null) {
/* 51 */                        return i1111OO10i2.I00iiI;
                            }
                        } else {
/* 56 */                    Object objI000II2 = oI10I1IoI0Ol.I000II(Oil0I1O.I001lloI);
/* 60 */                    if (objI000II2 == null) {
/* 62 */                        objI000II2 = null;
                            }
/* 63 */                    List list = (List) objI000II2;
/* 65 */                    if (list != null && (i1111OO10i = (I1111OO10i) IOOi0Ool1i.I00II0Ol1O0l(list)) != null) {
/* 75 */                        return i1111OO10i.I00iiI;
                            }
                        }
                    }
/* 1 */             return null;
                }

                public static final boolean I0010o(OiOi0l oiOi0l, float f) {
/* 1 */             IllOOo00lI illOOo00lI = oiOi0l.I00000oIO;
/* 6 */             if (f >= 0.0f || ((Number) illOOo00lI.invoke()).floatValue() <= 0.0f) {
                        return f > 0.0f && ((Number) illOOo00lI.invoke()).floatValue() < ((Number) oiOi0l.I00000oOI.invoke()).floatValue();
                    }
/* 52 */            return true;
                }

                public static final boolean I00111O(OiOi0l oiOi0l) {
/* 1 */             IllOOo00lI illOOo00lI = oiOi0l.I00000oIO;
/* 16 */            if (((Number) illOOo00lI.invoke()).floatValue() > 0.0f) {
/* 18 */                return true;
                    }
/* 26 */            ((Number) illOOo00lI.invoke()).floatValue();
/* 37 */            ((Number) oiOi0l.I00000oOI.invoke()).floatValue();
/* 40 */            return false;
                }

                public static final boolean I001IIilI0O(OiOi0l oiOi0l) {
/* 1 */             IllOOo00lI illOOo00lI = oiOi0l.I00000oIO;
/* 27 */            if (((Number) illOOo00lI.invoke()).floatValue() < ((Number) oiOi0l.I00000oOI.invoke()).floatValue()) {
/* 29 */                return true;
                    }
/* 37 */            ((Number) illOOo00lI.invoke()).floatValue();
/* 40 */            return false;
                }

                public static void I001lIiIIo1O(I0ll1oo i0ll1oo, int i, int i2, Integer num, int i3) {
/* 4 */             if ((i3 & 4) != 0) {
/* 6 */                 num = null;
                    }
/* 7 */             i0ll1oo.I001l0I00(i, i2, num, null);
                }

                public static Rect I00IOO(l1lOoiII1l l1looiii1l, float f, float f2) {
/* 3 */             if (!(l1looiii1l instanceof OIioiIl) && !(l1looiii1l instanceof OIiolOlo1iI)) {
/* 10 */                return null;
                    }
/* 12 */            OOo0IO oOo0IOI00000oIO = l1looiii1l.I00000oIO();
/* 34 */            return new Rect((int) (oOo0IOI00000oIO.I00000oIO + f), (int) (oOo0IOI00000oIO.I00000oOI + f2), (int) (oOo0IOI00000oIO.I0000Il00O + f), (int) (oOo0IOI00000oIO.I0000O + f2));
                }

                public static float[] I00IlilI0i0i(l1lOoiII1l l1looiii1l) {
/* 3 */             if (!(l1looiii1l instanceof OIiolOlo1iI)) {
/* 105 */               return null;
                    }
/* 7 */             OiI101I1oIi oiI101I1oIi = ((OIiolOlo1iI) l1looiii1l).I00000oIO;
/* 9 */             long j = oiI101I1oIi.I000O01llI0;
/* 11 */            long j2 = oiI101I1oIi.I000II;
/* 13 */            long j3 = oiI101I1oIi.I0001Ioi1lo;
/* 15 */            long j4 = oiI101I1oIi.I0000oI00;
/* 78 */            return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
                }

                public static Region I00Io1lO(l1lOoiII1l l1looiii1l, float f, float f2) {
/* 4 */             if (l1looiii1l instanceof OIio1O0ll0I) {
/* 8 */                 OIio1O0ll0I oIio1O0ll0I = (OIio1O0ll0I) l1looiii1l;
/* 14 */                OOo0IO oOo0IOI000OOo1O = oIio1O0ll0I.I00000oIO().I000OOo1O(f, f2);
/* 40 */                Region region = new Region(new Rect((int) (oOo0IOI000OOo1O.I00000oIO + 0.0f), (int) (oOo0IOI000OOo1O.I00000oOI + 0.0f), (int) (oOo0IOI000OOo1O.I0000Il00O + 0.0f), (int) (oOo0IOI000OOo1O.I0000O + 0.0f)));
/* 45 */                Region region2 = new Region();
/* 48 */                I0ol0lI i0ol0lI = oIio1O0ll0I.I00000oIO;
/* 52 */                if (i0ol0lI instanceof I0ol0lI) {
/* 54 */                    Path path = i0ol0lI.I00000oIO;
/* 56 */                    path.offset(f, f2);
/* 59 */                    region2.setPath(path, region);
/* 62 */                    return region2;
                        }
/* 65 */                OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
                    }
/* 3 */             return null;
                }

                public static CharSequence I00Io1o110i(CharSequence charSequence) {
/* 5 */             if (charSequence.length() != 0) {
/* 12 */                int i = 100000;
/* 15 */                if (charSequence.length() > 100000) {
/* 29 */                    if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
/* 41 */                        i = 99999;
                            }
/* 43 */                    return charSequence.subSequence(0, i);
                        }
                    }
/* 17 */            return charSequence;
                }

                @Override
                public final IIloOI I00000oIO(View view) {
/* 1 */             return this.I00l0OO0IO;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(int i, I01oII0IOOO i01oII0IOOO, String str, Bundle bundle) {
                    Oil000 oil000;
                    RectF[] rectFArr;
                    int i2;
                    int i3;
                    Oo0iil0o0oI oo0iil0o0oI;
                    I0lio1O01i01 i0lio1O01i01;
/* 9 */             I0lio1O01i01 i0lio1O01i012 = this.I00iio;
/* 13 */            AccessibilityNodeInfo accessibilityNodeInfo = i01oII0IOOO.I00000oIO;
/* 23 */            Oil00l oil00l = (Oil00l) I000o00OoI0I().I00000oOI(i);
/* 25 */            if (oil00l == null || (oil000 = oil00l.I00000oIO) == null) {
/* 1182 */              return;
                    }
/* 33 */            O0iiOioolIi o0iiOioolIi = oil000.I0000Il00O;
/* 35 */            OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 37 */            OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIlooo.I00iOIl;
/* 39 */            String strI000oI1ioi = I000oI1ioi(oil000);
/* 50 */            if (O0000Ioio00.I0000O(str, this.I00oooO)) {
/* 54 */                int iI0000O = this.I00ooIo0.I0000O(i);
/* 58 */                if (iI0000O != -1) {
/* 64 */                    accessibilityNodeInfo.getExtras().putInt(str, iI0000O);
/* 67 */                    return;
                        }
/* 1182 */              return;
                    }
/* 74 */            if (O0000Ioio00.I0000O(str, this.I0100i)) {
/* 78 */                int iI0000O2 = this.I00ooiO1I.I0000O(i);
/* 82 */                if (iI0000O2 != -1) {
/* 88 */                    accessibilityNodeInfo.getExtras().putInt(str, iI0000O2);
/* 91 */                    return;
                        }
/* 1182 */              return;
                    }
/* 98 */            if (oI10I1IoI0Ol.I0000Il00O(Oiioi1IoIIli.I00000oIO) && bundle != null && O0000Ioio00.I0000O(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
/* 112 */               int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
/* 118 */               int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
/* 122 */               if (i5 > 0 && i4 >= 0) {
/* 136 */                   if (i4 < (strI000oI1ioi != null ? strI000oI1ioi.length() : Integer.MAX_VALUE)) {
/* 140 */                       Oo0iil0o0oI oo0iil0o0oII00000oOI = lO1i1O.I00000oOI(oiioiIIlooo);
/* 144 */                       if (oo0iil0o0oII00000oOI == null) {
/* 146 */                           rectFArr = null;
                                } else {
/* 153 */                           Iollol0oI iollol0oI = (Iollol0oI) o0iiOioolIi.I010101Oo1lO.I00iio;
/* 159 */                           if (!iollol0oI.I011iIOio.I00lll10) {
/* 162 */                               iollol0oI = null;
                                    }
/* 163 */                           if (iollol0oI != null) {
/* 167 */                               long jI00Iooi00oi = iollol0oI.I00Iooi00oi(0L);
/* 171 */                               OOo0IO oOo0IOI000II = oil000.I000II();
/* 175 */                               RectF[] rectFArr2 = new RectF[i5];
/* 177 */                               int i6 = 0;
/* 178 */                               while (i6 < i5) {
/* 180 */                                   int i7 = i4 + i6;
/* 192 */                                   if (i7 >= oo0iil0o0oII00000oOI.I00000oIO.I00000oIO.I00iiI.length()) {
/* 194 */                                       i2 = i4;
/* 196 */                                       i3 = i5;
/* 198 */                                       oo0iil0o0oI = oo0iil0o0oII00000oOI;
/* 200 */                                       i0lio1O01i01 = i0lio1O01i012;
                                            } else {
/* 207 */                                       OOo0IO oOo0IOI000OiO = oo0iil0o0oII00000oOI.I00000oOI(i7).I000OiO(jI00Iooi00oi);
/* 223 */                                       if ((oOo0IOI000OiO.I000O01llI0(oOo0IOI000II) ? oOo0IOI000OiO.I0001Ioi1lo(oOo0IOI000II) : null) != null) {
/* 251 */                                           long jI00100o1O0lo = i0lio1O01i012.I00100o1O0lo((Float.floatToRawIntBits(r10.I00000oIO) << 32) | (Float.floatToRawIntBits(r10.I00000oOI) & 4294967295L));
/* 268 */                                           i2 = i4;
/* 270 */                                           i3 = i5;
/* 278 */                                           long jI00100o1O0lo2 = i0lio1O01i012.I00100o1O0lo((Float.floatToRawIntBits(r10.I0000O) & 4294967295L) | (Float.floatToRawIntBits(r10.I0000Il00O) << 32));
/* 286 */                                           int i8 = (int) (jI00100o1O0lo >> 32);
/* 295 */                                           int i9 = (int) (jI00100o1O0lo2 >> 32);
/* 306 */                                           int i10 = (int) (jI00100o1O0lo & 4294967295L);
/* 311 */                                           oo0iil0o0oI = oo0iil0o0oII00000oOI;
/* 313 */                                           i0lio1O01i01 = i0lio1O01i012;
/* 316 */                                           int i11 = (int) (jI00100o1O0lo2 & 4294967295L);
/* 352 */                                           rectFArr2[i6] = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                                                }
                                            }
/* 354 */                                   i6++;
/* 356 */                                   i4 = i2;
/* 358 */                                   i5 = i3;
/* 360 */                                   oo0iil0o0oII00000oOI = oo0iil0o0oI;
/* 362 */                                   i0lio1O01i012 = i0lio1O01i01;
                                        }
/* 365 */                               rectFArr = rectFArr2;
                                    }
                                }
/* 366 */                       if (rectFArr == null) {
/* 1182 */                          return;
                                }
/* 376 */                       accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
/* 379 */                       return;
                            }
                        }
/* 384 */               Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
/* 387 */               return;
                    }
/* 389 */           Oil0IoooOio oil0IoooOio = Oil0I1O.I001lIiIIo1O;
/* 395 */           if (oI10I1IoI0Ol.I0000Il00O(oil0IoooOio) && bundle != null && O0000Ioio00.I0000O(str, "androidx.compose.ui.semantics.testTag")) {
/* 407 */               Object objI000II = oI10I1IoI0Ol.I000II(oil0IoooOio);
/* 416 */               String str2 = (String) (objI000II == null ? null : objI000II);
/* 418 */               if (str2 != null) {
/* 424 */                   accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
/* 427 */                   return;
                        }
/* 1182 */              return;
                    }
/* 434 */           if (O0000Ioio00.I0000O(str, "androidx.compose.ui.semantics.id")) {
/* 442 */               accessibilityNodeInfo.getExtras().putInt(str, oil000.I0001Ioi1lo);
/* 445 */               return;
                    }
/* 458 */           if (O0000Ioio00.I0000O(str, "androidx.compose.ui.semantics.shapeType")) {
/* 462 */               Object objI000II2 = oI10I1IoI0Ol.I000II(Oil0I1O.I00O10llo);
/* 471 */               OioOIi1o0I oioOIi1o0I = (OioOIi1o0I) (objI000II2 == null ? null : objI000II2);
/* 473 */               if (oioOIi1o0I != null) {
/* 477 */                   Rect rect = new Rect();
/* 480 */                   accessibilityNodeInfo.getBoundsInScreen(rect);
/* 483 */                   OOo0IO oOo0IOI00100l0 = I00100l0(oil000, rect, oioOIi1o0I);
/* 487 */                   float f = oOo0IOI00100l0.I00000oOI;
/* 489 */                   float f2 = oOo0IOI00100l0.I00000oIO;
/* 501 */                   l1lOoiII1l l1looiii1lI00000oIO = oioOIi1o0I.I00000oIO(oOo0IOI00100l0.I0000O(), o0iiOioolIi.I00oo1iO0ll, i0lio1O01i012.getDensity());
/* 507 */                   if (l1looiii1lI00000oIO instanceof OIioiIl) {
/* 514 */                       accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
/* 525 */                       accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", I00IOO(l1looiii1lI00000oIO, f2, f));
/* 528 */                       return;
                            } else if (l1looiii1lI00000oIO instanceof OIiolOlo1iI) {
/* 538 */                       accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
/* 549 */                       accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", I00IOO(l1looiii1lI00000oIO, f2, f));
/* 560 */                       accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I00IlilI0i0i(l1looiii1lI00000oIO));
/* 563 */                       return;
                            } else if (!(l1looiii1lI00000oIO instanceof OIio1O0ll0I)) {
/* 588 */                       I000II.I00000oIO();
/* 591 */                       return;
                            } else {
/* 573 */                       accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
/* 584 */                       accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", I00Io1lO(l1looiii1lI00000oIO, f2, f));
/* 587 */                       return;
                            }
                        }
/* 1182 */              return;
                    }
/* 596 */           if (O0000Ioio00.I0000O(str, "androidx.compose.ui.semantics.shapeRect")) {
/* 600 */               Object objI000II3 = oI10I1IoI0Ol.I000II(Oil0I1O.I00O10llo);
/* 609 */               OioOIi1o0I oioOIi1o0I2 = (OioOIi1o0I) (objI000II3 == null ? null : objI000II3);
/* 611 */               if (oioOIi1o0I2 != null) {
/* 615 */                   Rect rect2 = new Rect();
/* 618 */                   accessibilityNodeInfo.getBoundsInScreen(rect2);
/* 621 */                   OOo0IO oOo0IOI00100l02 = I00100l0(oil000, rect2, oioOIi1o0I2);
/* 643 */                   Rect rectI00IOO = I00IOO(oioOIi1o0I2.I00000oIO(oOo0IOI00100l02.I0000O(), o0iiOioolIi.I00oo1iO0ll, i0lio1O01i012.getDensity()), oOo0IOI00100l02.I00000oIO, oOo0IOI00100l02.I00000oOI);
/* 647 */                   if (rectI00IOO != null) {
/* 653 */                       accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectI00IOO);
/* 656 */                       return;
                            }
/* 1182 */                  return;
                        }
/* 1182 */              return;
                    }
/* 661 */           if (O0000Ioio00.I0000O(str, "androidx.compose.ui.semantics.shapeCorners")) {
/* 665 */               Object objI000II4 = oI10I1IoI0Ol.I000II(Oil0I1O.I00O10llo);
/* 674 */               OioOIi1o0I oioOIi1o0I3 = (OioOIi1o0I) (objI000II4 == null ? null : objI000II4);
/* 676 */               if (oioOIi1o0I3 != null) {
/* 680 */                   Rect rect3 = new Rect();
/* 683 */                   accessibilityNodeInfo.getBoundsInScreen(rect3);
/* 704 */                   float[] fArrI00IlilI0i0i = I00IlilI0i0i(oioOIi1o0I3.I00000oIO(I00100l0(oil000, rect3, oioOIi1o0I3).I0000O(), o0iiOioolIi.I00oo1iO0ll, i0lio1O01i012.getDensity()));
/* 708 */                   if (fArrI00IlilI0i0i != null) {
/* 714 */                       accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI00IlilI0i0i);
/* 717 */                       return;
                            }
/* 1182 */                  return;
                        }
/* 1182 */              return;
                    }
/* 722 */           if (O0000Ioio00.I0000O(str, "androidx.compose.ui.semantics.shapeRegion")) {
/* 726 */               Object objI000II5 = oI10I1IoI0Ol.I000II(Oil0I1O.I00O10llo);
/* 735 */               OioOIi1o0I oioOIi1o0I4 = (OioOIi1o0I) (objI000II5 == null ? null : objI000II5);
/* 737 */               if (oioOIi1o0I4 != null) {
/* 741 */                   Rect rect4 = new Rect();
/* 744 */                   accessibilityNodeInfo.getBoundsInScreen(rect4);
/* 747 */                   OOo0IO oOo0IOI00100l03 = I00100l0(oil000, rect4, oioOIi1o0I4);
/* 769 */                   Region regionI00Io1lO = I00Io1lO(oioOIi1o0I4.I00000oIO(oOo0IOI00100l03.I0000O(), o0iiOioolIi.I00oo1iO0ll, i0lio1O01i012.getDensity()), oOo0IOI00100l03.I00000oIO, oOo0IOI00100l03.I00000oOI);
/* 773 */                   if (regionI00Io1lO != null) {
/* 779 */                       accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionI00Io1lO);
                            }
                        }
                    }
                }

                public final Rect I0001Ioi1lo(Oil00l oil00l) {
/* 1 */             IooO1IOlo iooO1IOlo = oil00l.I00000oOI;
/* 15 */            return I00IioO0OiOi(iooO1IOlo.I00000oIO, iooO1IOlo.I00000oOI, iooO1IOlo.I0000Il00O, iooO1IOlo.I0000O);
                }

                /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(r7, r1) == r2) goto L47;
                 */
                /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:24:0x0051, B:28:0x0061, B:30:0x0069, B:32:0x0072, B:39:0x0090, B:42:0x009f, B:43:0x00a7, B:44:0x00aa, B:45:0x00ab, B:20:0x003f, B:23:0x0046, B:33:0x0077, B:35:0x007c, B:38:0x008d), top: B:52:0x0022, inners: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c4 -> B:14:0x002f). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(IOoilo iOoilo) throws Throwable {
                    I0ll10i i0ll10i;
                    OI0lOIOi1l oI0lOIOi1l;
                    IIII0iI10 it;
                    OI0lOIOi1l oI0lOIOi1l2;
                    Object objI00000oOI;
/* 1 */             I1Io1oIoo i1Io1oIoo = this.I00oOio10iI1;
/* 5 */             if (iOoilo instanceof I0ll10i) {
/* 8 */                 i0ll10i = (I0ll10i) iOoilo;
/* 10 */                int i = i0ll10i.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    i0ll10i.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    i0ll10i = new I0ll10i(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = i0ll10i.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = i0ll10i.I00ilI0I1;
                    try {
/* 35 */                if (i2 == 0) {
/* 68 */                    lIoii1l01l0i.I00000oOI(obj);
/* 73 */                    oI0lOIOi1l = new OI0lOIOi1l();
/* 78 */                    it = this.I00ol1.iterator();
/* 82 */                    i0ll10i.I00iOIl = oI0lOIOi1l;
/* 84 */                    i0ll10i.I00iiI = it;
/* 86 */                    i0ll10i.I00ilI0I1 = 1;
/* 88 */                    objI00000oOI = it.I00000oOI(i0ll10i);
/* 92 */                    if (objI00000oOI != ii0111o) {
                            }
                        } else if (i2 == 1) {
/* 60 */                    it = i0ll10i.I00iiI;
/* 62 */                    oI0lOIOi1l2 = i0ll10i.I00iOIl;
/* 64 */                    lIoii1l01l0i.I00000oOI(obj);
/* 104 */                   if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
/* 39 */                    if (i2 != 2) {
/* 55 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 58 */                        return null;
                            }
/* 41 */                    it = i0ll10i.I00iiI;
/* 43 */                    oI0lOIOi1l2 = i0ll10i.I00iOIl;
/* 45 */                    lIoii1l01l0i.I00000oOI(obj);
/* 48 */                    oI0lOIOi1l = oI0lOIOi1l2;
/* 82 */                    i0ll10i.I00iOIl = oI0lOIOi1l;
/* 84 */                    i0ll10i.I00iiI = it;
/* 86 */                    i0ll10i.I00ilI0I1 = 1;
/* 88 */                    objI00000oOI = it.I00000oOI(i0ll10i);
/* 92 */                    if (objI00000oOI != ii0111o) {
/* 199 */                       return ii0111o;
                            }
/* 96 */                    oI0lOIOi1l2 = oI0lOIOi1l;
/* 97 */                    obj = objI00000oOI;
/* 104 */                   if (((Boolean) obj).booleanValue()) {
/* 200 */                       i1Io1oIoo.clear();
/* 203 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 106 */                   it.I0000Il00O();
/* 113 */                   if (I00100o1O0lo()) {
/* 117 */                       Trace.beginSection("Compose:semantics:boundUpdates");
                                try {
/* 120 */                           int i3 = i1Io1oIoo.I00iiO;
/* 123 */                           for (int i4 = 0; i4 < i3; i4++) {
/* 129 */                               O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) i1Io1oIoo.I00iiI[i4];
/* 131 */                               I00II0oii1o(o0iiOioolIi, oI0lOIOi1l2);
/* 134 */                               I00IO1(o0iiOioolIi);
                                    }
/* 142 */                           oI0lOIOi1l2.I00000oOI();
/* 145 */                           Trace.endSection();
/* 150 */                           Handler handler = this.I00iio.getHandler();
/* 156 */                           if (!this.I010II && handler != null) {
/* 160 */                               this.I010II = true;
/* 164 */                               handler.post(this.I010i10l);
                                    }
                                } finally {
                                }
                            }
/* 172 */                   i1Io1oIoo.clear();
/* 177 */                   this.I00o0l1o1o0.I0000Il00O();
/* 182 */                   this.I00o101lO.I0000Il00O();
/* 185 */                   long j = this.I00ioIO;
/* 187 */                   i0ll10i.I00iOIl = oI0lOIOi1l2;
/* 189 */                   i0ll10i.I00iiI = it;
/* 191 */                   i0ll10i.I00ilI0I1 = 2;
                        }
                    } catch (Throwable th) {
/* 206 */               i1Io1oIoo.clear();
/* 437 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I000O01llI0(int i, long j, boolean z) {
                    Oil0IoooOio oil0IoooOio;
                    int i2;
/* 21 */            if (O0000Ioio00.I0000O(Looper.getMainLooper().getThread(), Thread.currentThread())) {
/* 27 */                IooIolI iooIolII000o00OoI0I = I000o00OoI0I();
/* 40 */                if (!OIOlIiiioi.I0000O(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
/* 67 */                    if (z) {
/* 69 */                        oil0IoooOio = Oil0I1O.I001i1O0Ol;
                            } else {
/* 72 */                        if (z) {
/* 315 */                           I000II.I00000oIO();
/* 313 */                           return false;
                                }
/* 74 */                        oil0IoooOio = Oil0I1O.I001IO000;
                            }
/* 76 */                    Object[] objArr = iooIolII000o00OoI0I.I0000Il00O;
/* 78 */                    long[] jArr = iooIolII000o00OoI0I.I00000oIO;
                            int length = jArr.length - 2;
/* 83 */                    if (length >= 0) {
/* 85 */                        int i3 = 0;
/* 86 */                        boolean z2 = false;
                                while (true) {
/* 87 */                            long j2 = jArr[i3];
/* 101 */                           if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 108 */                               int i4 = 8;
/* 110 */                               int i5 = 8 - ((~(i3 - length)) >>> 31);
/* 112 */                               int i6 = 0;
/* 113 */                               while (i6 < i5) {
/* 122 */                                   if ((255 & j2) < 128) {
/* 129 */                                       Oil00l oil00l = (Oil00l) objArr[(i3 << 3) + i6];
/* 133 */                                       IooO1IOlo iooO1IOlo = oil00l.I00000oOI;
/* 135 */                                       float f = iooO1IOlo.I00000oIO;
/* 138 */                                       i2 = i4;
/* 140 */                                       float f2 = iooO1IOlo.I00000oOI;
/* 143 */                                       float f3 = iooO1IOlo.I0000Il00O;
/* 146 */                                       float f4 = iooO1IOlo.I0000O;
/* 158 */                                       float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 171 */                                       float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 210 */                                       if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
/* 219 */                                           Object objI000II = oil00l.I00000oIO.I0000O.I00iOIl.I000II(oil0IoooOio);
/* 223 */                                           if (objI000II == null) {
/* 225 */                                               objI000II = null;
                                                    }
/* 226 */                                           OiOi0l oiOi0l = (OiOi0l) objI000II;
/* 228 */                                           if (oiOi0l != null) {
/* 231 */                                               IllOOo00lI illOOo00lI = oiOi0l.I00000oIO;
/* 233 */                                               if (i < 0) {
/* 248 */                                                   if (((Number) illOOo00lI.invoke()).floatValue() > 0.0f) {
/* 250 */                                                       z2 = true;
                                                            }
                                                        } else if (((Number) illOOo00lI.invoke()).floatValue() < ((Number) oiOi0l.I00000oOI.invoke()).floatValue()) {
                                                        }
                                                    }
                                                }
                                            } else {
/* 279 */                                       i2 = i4;
                                            }
/* 283 */                                   j2 >>= i2;
/* 285 */                                   i6++;
/* 289 */                                   i4 = i2;
                                        }
/* 297 */                               if (i5 != i4) {
/* 300 */                                   return z2;
                                        }
                                    }
/* 303 */                           if (i3 == length) {
/* 312 */                               return z2;
                                    }
/* 305 */                           i3++;
                                }
                            }
                        }
                    }
/* 23 */            return false;
                }

                public final void I000OOo1O() {
/* 3 */             Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
                    try {
/* 10 */                if (I00100o1O0lo()) {
/* 24 */                    I001i1lo1io(this.I00iio.getSemanticsOwner().I00000oIO(), this.I010I0);
                        }
/* 27 */                Trace.endSection();
/* 32 */                Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
                        try {
/* 39 */                    I00II0Ol1O0l(I000o00OoI0I());
/* 42 */                    Trace.endSection();
/* 47 */                    Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                            try {
/* 50 */                        I00IoIO0lI();
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }

                public final AccessibilityEvent I000OiO(int i, int i2) {
                    Oil00l oil00l;
/* 1 */             AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
/* 6 */             accessibilityEventObtain.setEnabled(true);
/* 11 */            accessibilityEventObtain.setClassName("android.view.View");
/* 14 */            I0lio1O01i01 i0lio1O01i01 = this.I00iio;
/* 24 */            accessibilityEventObtain.setPackageName(i0lio1O01i01.getContext().getPackageName());
/* 27 */            accessibilityEventObtain.setSource(i0lio1O01i01, i);
/* 34 */            if (I00100o1O0lo() && (oil00l = (Oil00l) I000o00OoI0I().I00000oOI(i)) != null) {
/* 48 */                Oil000 oil000 = oil00l.I00000oIO;
/* 60 */                accessibilityEventObtain.setPassword(oil000.I0000O.I00iOIl.I0000Il00O(Oil0I1O.I00IoO0));
/* 69 */                Object objI000II = oil000.I0000O.I00iOIl.I000II(Oil0I1O.I000oI1ioi);
/* 73 */                if (objI000II == null) {
/* 75 */                    objI000II = null;
                        }
/* 82 */                accessibilityEventObtain.setAccessibilityDataSensitive(O0000Ioio00.I0000O(objI000II, Boolean.TRUE));
                    }
/* 106 */           return accessibilityEventObtain;
                }

                public final AccessibilityEvent I000iOII(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
/* 3 */             AccessibilityEvent accessibilityEventI000OiO = I000OiO(i, 8192);
/* 7 */             if (num != null) {
/* 13 */                accessibilityEventI000OiO.setFromIndex(num.intValue());
                    }
/* 16 */            if (num2 != null) {
/* 22 */                accessibilityEventI000OiO.setToIndex(num2.intValue());
                    }
/* 25 */            if (num3 != null) {
/* 31 */                accessibilityEventI000OiO.setItemCount(num3.intValue());
                    }
/* 34 */            if (charSequence != null) {
/* 40 */                accessibilityEventI000OiO.getText().add(charSequence);
                    }
/* 399 */           return accessibilityEventI000OiO;
                }

                public final int I000l1(Oil000 oil000) {
/* 1 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 11 */            if (!oiioiIIlooo.I00iOIl.I0000Il00O(Oil0I1O.I00000oIO)) {
/* 13 */                Oil0IoooOio oil0IoooOio = Oil0I1O.I00IOO;
/* 21 */                if (oiioiIIlooo.I00iOIl.I0000Il00O(oil0IoooOio)) {
/* 37 */                    return (int) (((Oo0lI00l) oiioiIIlooo.I000OOo1O(oil0IoooOio)).I00000oIO & 4294967295L);
                        }
                    }
/* 39 */            return this.I00oIiI10;
                }

                public final int I000lI(Oil000 oil000) {
/* 1 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 11 */            if (!oiioiIIlooo.I00iOIl.I0000Il00O(Oil0I1O.I00000oIO)) {
/* 13 */                Oil0IoooOio oil0IoooOio = Oil0I1O.I00IOO;
/* 21 */                if (oiioiIIlooo.I00iOIl.I0000Il00O(oil0IoooOio)) {
/* 34 */                    return (int) (((Oo0lI00l) oiioiIIlooo.I000OOo1O(oil0IoooOio)).I00000oIO >> 32);
                        }
                    }
/* 36 */            return this.I00oIiI10;
                }

                public final IooIolI I000o00OoI0I() {
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00iio;
/* 5 */             if (this.I00olI) {
/* 8 */                 this.I00olI = false;
/* 25 */                this.I00oliIiO01i = iO0o00ili.I00000oIO(i0lio1O01i01.getSemanticsOwner(), new I01OoIoio00O(17));
/* 31 */                if (I00100o1O0lo()) {
/* 33 */                    OI0l1oli1I oI0l1oli1I = this.I00oliIiO01i;
/* 35 */                    OI0l1iIo1 oI0l1iIo1 = this.I00ooIo0;
/* 37 */                    OI0l1iIo1 oI0l1iIo12 = this.I00ooiO1I;
/* 43 */                    Resources resources = i0lio1O01i01.getContext().getResources();
/* 47 */                    oI0l1iIo1.I00000oIO();
/* 50 */                    oI0l1iIo12.I00000oIO();
/* 58 */                    Oil00l oil00l = (Oil00l) oI0l1oli1I.I00000oOI(-1);
/* 65 */                    Oil000 oil000 = oil00l != null ? oil00l.I00000oIO : null;
/* 70 */                    IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(10);
/* 73 */                    iIOIlOoI111.I00iiI = oI0l1oli1I;
/* 75 */                    VarHandle.storeStoreFence();
/* 82 */                    IIOIlOoI111 iIOIlOoI1112 = new IIOIlOoI111(11);
/* 85 */                    iIOIlOoI1112.I00iiI = resources;
/* 87 */                    VarHandle.storeStoreFence();
/* 94 */                    ArrayList arrayListI00000oOI = Oil0i0I1I.I00000oOI(oil000, iIOIlOoI111, iIOIlOoI1112, Collections.singletonList(oil000));
/* 98 */                    int iI000II = IOOi1I.I000II(arrayListI00000oOI);
/* 102 */                   int i = 1;
/* 103 */                   if (1 <= iI000II) {
                                while (true) {
/* 113 */                           int i2 = ((Oil000) arrayListI00000oOI.get(i - 1)).I0001Ioi1lo;
/* 121 */                           int i3 = ((Oil000) arrayListI00000oOI.get(i)).I0001Ioi1lo;
/* 123 */                           oI0l1iIo1.I0001Ioi1lo(i2, i3);
/* 126 */                           oI0l1iIo12.I0001Ioi1lo(i3, i2);
/* 129 */                           if (i == iI000II) {
                                        break;
                                    }
/* 131 */                           i++;
                                }
                            }
                        }
                    }
/* 134 */           return this.I00oliIiO01i;
                }

                /* JADX WARN: Removed duplicated region for block: B:36:0x007a A[LOOP:0: B:4:0x001b->B:36:0x007a, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EDGE_INSN: B:47:0x007d->B:37:0x007d BREAK  A[LOOP:0: B:4:0x001b->B:36:0x007a], SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OOo0IO I00100l0(Oil000 oil000, Rect rect, OioOIi1o0I oioOIi1o0I) {
/* 3 */             I0ll10oi i0ll10oi = new I0ll10oi();
/* 6 */             i0ll10oi.I00iiI = oioOIi1o0I;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            O0iiOioolIi o0iiOioolIi = oil000.I0000Il00O;
/* 17 */            O1ooOo o1ooOo = (O1ooOo) o0iiOioolIi.I010101Oo1lO.I00io1l;
/* 23 */            IiIill0O0li1 iiIill0O0li1 = null;
/* 26 */            if ((o1ooOo.I00iio & 8) != 0) {
                        loop0: while (true) {
/* 28 */                    if (o1ooOo == null) {
                                break;
                            }
/* 34 */                    if ((o1ooOo.I00iiO & 8) != 0) {
/* 36 */                        O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 37 */                        OI110O0 oi110o0 = null;
/* 38 */                        while (o1ooOoI0000Il00O != null) {
/* 42 */                            if (o1ooOoI0000Il00O instanceof OiiooOl) {
/* 47 */                                ((OiiooOl) o1ooOoI0000Il00O).I00oOio10iI1(i0ll10oi);
/* 52 */                                if (i0ll10oi.I00iOIl) {
/* 54 */                                    iiIill0O0li1 = o1ooOoI0000Il00O;
                                            break loop0;
                                        }
                                    } else if ((o1ooOoI0000Il00O.I00iiO & 8) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 71 */                                int i = 0;
/* 72 */                                for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 78 */                                    if ((o1ooOo2.I00iiO & 8) != 0) {
/* 80 */                                        i++;
/* 82 */                                        if (i == 1) {
/* 84 */                                            o1ooOoI0000Il00O = o1ooOo2;
                                                } else {
/* 86 */                                            if (oi110o0 == null) {
/* 94 */                                                oi110o0 = new OI110O0(new O1ooOo[16]);
                                                    }
/* 97 */                                            if (o1ooOoI0000Il00O != null) {
/* 99 */                                                oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 102 */                                               o1ooOoI0000Il00O = null;
                                                    }
/* 103 */                                           oi110o0.I00000oOI(o1ooOo2);
                                                }
                                            }
                                        }
/* 109 */                               if (i == 1) {
                                        }
                                    }
/* 112 */                           o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                }
/* 121 */                       if ((o1ooOo.I00iio & 8) != 0) {
                                    break;
                                }
/* 123 */                       o1ooOo = o1ooOo.I00ilO0;
                            } else if ((o1ooOo.I00iio & 8) != 0) {
                            }
                        }
                    }
/* 126 */           IiIill0O0li1 iiIill0O0li12 = (OiiooOl) iiIill0O0li1;
/* 128 */           if (iiIill0O0li12 == null || !((O1ooOo) iiIill0O0li12).I00iOIl.I00lll10) {
/* 199 */               return l0o0IlOil1.I00000oOI((OIIlIII0Ili) o0iiOioolIi.I010101Oo1lO.I00ilI0I1, false);
                    }
/* 139 */           OIIlIII0Ili oIIlIII0IliI000II = il0lI1i1olii.I000II(iiIill0O0li12);
/* 147 */           OOo0IO oOo0IOI00IoiI = l0o0IlOil1.I0000Il00O(oIIlIII0IliI000II).I00IoiI(oIIlIII0IliI000II, false);
/* 159 */           Rect rectI00IioO0OiOi = I00IioO0OiOi(oOo0IOI00IoiI.I00000oIO, oOo0IOI00IoiI.I00000oOI, oOo0IOI00IoiI.I0000Il00O, oOo0IOI00IoiI.I0000O);
/* 167 */           float f = rectI00IioO0OiOi.left - rect.left;
/* 173 */           float f2 = rectI00IioO0OiOi.top - rect.top;
/* 189 */           return new OOo0IO(f, f2, rectI00IioO0OiOi.width() + f, rectI00IioO0OiOi.height() + f2);
                }

                public final boolean I00100o1O0lo() {
/* 1 */             AccessibilityManager accessibilityManager = this.I00io1l;
/* 7 */             if (!accessibilityManager.isEnabled()) {
/* 30 */                return false;
                    }
/* 9 */             List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.I00l0I0l0lO1;
/* 11 */            if (enabledAccessibilityServiceList == null) {
/* 14 */                enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
/* 18 */                this.I00l0I0l0lO1 = enabledAccessibilityServiceList;
                    }
                    return !enabledAccessibilityServiceList.isEmpty();
                }

                public final void I0010I0i(O0iiOioolIi o0iiOioolIi) {
/* 7 */             if (this.I00oOio10iI1.add(o0iiOioolIi)) {
/* 13 */                this.I00ol1.I000lI(OoiIlOl1iI.I00000oIO);
                    }
                }

                public final void I001IO000(OiOilOo0io oiOilOo0io) {
/* 7 */             if (oiOilOo0io.I00iiI.contains(oiOilOo0io)) {
/* 12 */                OIlOIi0 snapshotObserver = this.I00iio.getSnapshotObserver();
/* 16 */                I0liooi i0liooi = this.I010ioo;
/* 22 */                I01ii1IIl i01ii1IIl = new I01ii1IIl(8);
/* 25 */                i01ii1IIl.I00iiI = oiOilOo0io;
/* 27 */                i01ii1IIl.I00iiO = this;
/* 29 */                VarHandle.storeStoreFence();
/* 34 */                snapshotObserver.I00000oIO.I0000oI00(oiOilOo0io, i0liooi, i01ii1IIl);
                    }
                }

                public final int I001i1O0Ol(int i) {
/* 13 */            if (i == this.I00iio.getSemanticsOwner().I00000oIO().I0001Ioi1lo) {
/* 15 */                return -1;
                    }
/* 29 */            return i;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001i1lo1io(Oil000 oil000, Oil000oIIO oil000oIIO) {
/* 7 */             int[] iArr = IooOIoI.I00000oIO;
/* 11 */            OI0lOIOi1l oI0lOIOi1l = new OI0lOIOi1l();
/* 18 */            List listI000OOo1O = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 19 */            O0iiOioolIi o0iiOioolIi = oil000.I0000Il00O;
/* 24 */            int size = listI000OOo1O.size();
/* 30 */            for (int i = 0; i < size; i++) {
/* 36 */                Oil000 oil0002 = (Oil000) listI000OOo1O.get(i);
/* 38 */                IooIolI iooIolII000o00OoI0I = I000o00OoI0I();
/* 42 */                int i2 = oil0002.I0001Ioi1lo;
/* 48 */                if (iooIolII000o00OoI0I.I00000oIO(i2)) {
/* 56 */                    if (!oil000oIIO.I00000oOI.I0000Il00O(i2)) {
/* 58 */                        I0010I0i(o0iiOioolIi);
/* 61 */                        return;
                            }
/* 62 */                    oI0lOIOi1l.I00000oIO(i2);
                        }
                    }
/* 68 */            OI0lOIOi1l oI0lOIOi1l2 = oil000oIIO.I00000oOI;
/* 70 */            int[] iArr2 = oI0lOIOi1l2.I00000oOI;
/* 72 */            long[] jArr = oI0lOIOi1l2.I00000oIO;
                    int length = jArr.length - 2;
/* 77 */            if (length >= 0) {
/* 79 */                int i3 = 0;
                        while (true) {
/* 80 */                    long j = jArr[i3];
/* 94 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 103 */                       int i4 = 8 - ((~(i3 - length)) >>> 31);
/* 106 */                       for (int i5 = 0; i5 < i4; i5++) {
/* 115 */                           if ((255 & j) < 128 && !oI0lOIOi1l.I0000Il00O(iArr2[(i3 << 3) + i5])) {
/* 128 */                               I0010I0i(o0iiOioolIi);
/* 131 */                               return;
                                    }
/* 132 */                           j >>= 8;
                                }
/* 136 */                       if (i4 != 8) {
                                    break;
                                } else if (i3 == length) {
                                    break;
                                } else {
/* 140 */                           i3++;
                                }
                            }
                        }
                    }
/* 18 */            List listI000OOo1O2 = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 150 */           int size2 = listI000OOo1O2.size();
/* 154 */           for (int i6 = 0; i6 < size2; i6++) {
/* 160 */               Oil000 oil0003 = (Oil000) listI000OOo1O2.get(i6);
/* 170 */               Oil000oIIO oil000oIIO2 = (Oil000oIIO) this.I010101Oo1lO.I00000oOI(oil0003.I0001Ioi1lo);
/* 172 */               if (oil000oIIO2 != null && I000o00OoI0I().I00000oIO(oil0003.I0001Ioi1lo)) {
/* 186 */                   I001i1lo1io(oil0003, oil000oIIO2);
                        }
                    }
                }

                public final boolean I001iOo1i0O(AccessibilityEvent accessibilityEvent) {
/* 6 */             if (!I00100o1O0lo()) {
/* 5 */                 return false;
                    }
/* 15 */            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
/* 27 */                this.I00o0iI0io1 = true;
                    }
                    try {
/* 37 */                return ((Boolean) this.I00ilO0.invoke(accessibilityEvent)).booleanValue();
                    } finally {
/* 45 */                this.I00o0iI0io1 = false;
                    }
                }

                public final boolean I001l0I00(int i, int i2, Integer num, List list) {
/* 3 */             if (i == Integer.MIN_VALUE || !I00100o1O0lo()) {
/* 44 */                return false;
                    }
/* 12 */            AccessibilityEvent accessibilityEventI000OiO = I000OiO(i, i2);
/* 16 */            if (num != null) {
/* 22 */                accessibilityEventI000OiO.setContentChangeTypes(num.intValue());
                    }
/* 25 */            if (list != null) {
/* 36 */                accessibilityEventI000OiO.setContentDescription(O10lllI0o0.I00000oIO(list, ",", null, 62));
                    }
/* 39 */            return I001iOo1i0O(accessibilityEventI000OiO);
                }

                public final void I001lllioOl(int i, int i2, String str) {
/* 7 */             AccessibilityEvent accessibilityEventI000OiO = I000OiO(I001i1O0Ol(i), 32);
/* 11 */            accessibilityEventI000OiO.setContentChangeTypes(i2);
/* 14 */            if (str != null) {
/* 20 */                accessibilityEventI000OiO.getText().add(str);
                    }
/* 23 */            I001iOo1i0O(accessibilityEventI000OiO);
                }

                public final void I001lloI(int i) {
/* 1 */             I0ll0oIl i0ll0oIl = this.I00oli;
/* 3 */             if (i0ll0oIl != null) {
/* 5 */                 Oil000 oil000 = i0ll0oIl.I00000oIO;
/* 9 */                 if (i != oil000.I0001Ioi1lo) {
/* 11 */                    return;
                        }
/* 23 */                if (SystemClock.uptimeMillis() - i0ll0oIl.I0001Ioi1lo <= 1000) {
/* 33 */                    AccessibilityEvent accessibilityEventI000OiO = I000OiO(I001i1O0Ol(oil000.I0001Ioi1lo), 131072);
/* 39 */                    accessibilityEventI000OiO.setFromIndex(i0ll0oIl.I0000O);
/* 44 */                    accessibilityEventI000OiO.setToIndex(i0ll0oIl.I0000oI00);
/* 49 */                    accessibilityEventI000OiO.setAction(i0ll0oIl.I00000oOI);
/* 54 */                    accessibilityEventI000OiO.setMovementGranularity(i0ll0oIl.I0000Il00O);
/* 65 */                    accessibilityEventI000OiO.getText().add(I000oI1ioi(oil000));
/* 68 */                    I001iOo1i0O(accessibilityEventI000OiO);
                        }
                    }
/* 72 */            this.I00oli = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:280:0x0610  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00II0Ol1O0l(IooIolI iooIolI) {
                    Integer num;
                    ArrayList arrayList;
                    int[] iArr;
                    long[] jArr;
                    int i;
                    Integer num2;
                    int i2;
                    int i3;
                    Integer num3;
                    ArrayList arrayList2;
                    int[] iArr2;
                    long[] jArr2;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    Integer num4;
                    OiioiIIlooo oiioiIIlooo;
                    Oil000 oil000;
                    int i8;
                    int i9;
                    int i10;
                    OI10I1IoI0Ol oI10I1IoI0Ol;
                    O0iiOioolIi o0iiOioolIi;
                    int i11;
                    OiioiIIlooo oiioiIIlooo2;
                    Integer num5;
                    ArrayList arrayList3;
                    long j;
                    int i12;
                    int i13;
                    O0iiOioolIi o0iiOioolIi2;
                    Oil000 oil0002;
                    Integer num6;
                    int i14;
                    OI10I1IoI0Ol oI10I1IoI0Ol2;
                    int i15;
                    boolean z;
                    IlliIlI illiIlI;
                    int i16;
                    int i17;
                    String str;
                    Integer num7;
                    int i18;
                    int i19;
                    int i20;
                    Integer num8;
                    AccessibilityEvent accessibilityEventI000iOII;
                    O0iiOioolIi o0iiOioolIi3;
/* 3 */             IooIolI iooIolI2 = iooIolI;
/* 7 */             Integer num9 = 64;
/* 13 */            ArrayList arrayList4 = this.I010iIIOlo;
/* 15 */            ArrayList arrayList5 = new ArrayList(arrayList4);
/* 18 */            arrayList4.clear();
/* 21 */            int[] iArr3 = iooIolI2.I00000oOI;
/* 23 */            long[] jArr3 = iooIolI2.I00000oIO;
/* 26 */            int i21 = 2;
                    int length = jArr3.length - 2;
/* 29 */            int i22 = 0;
/* 30 */            Integer num10 = 0;
/* 34 */            if (length < 0) {
/* 2856 */              return;
                    }
/* 36 */            int i23 = 0;
                    while (true) {
/* 37 */                long j2 = jArr3[i23];
/* 39 */                int i24 = i21;
/* 41 */                int i25 = length;
/* 58 */                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 65 */                    int i26 = 8;
/* 67 */                    int i27 = 8 - ((~(i23 - i25)) >>> 31);
/* 69 */                    long j3 = j2;
/* 71 */                    int i28 = i22;
/* 72 */                    while (i28 < i27) {
/* 82 */                        if ((j3 & 255) < 128) {
/* 87 */                            int i29 = iArr3[(i23 << 3) + i28];
/* 95 */                            Oil000oIIO oil000oIIO = (Oil000oIIO) this.I010101Oo1lO.I00000oOI(i29);
/* 97 */                            if (oil000oIIO == null) {
/* 1553 */                              i3 = i28;
/* 1555 */                              num3 = num9;
/* 1557 */                              arrayList2 = arrayList5;
/* 1559 */                              iArr2 = iArr3;
/* 1561 */                              jArr2 = jArr3;
/* 1563 */                              i4 = i26;
/* 1564 */                              i5 = i27;
/* 1566 */                              i6 = i22;
/* 1567 */                              i7 = i23;
/* 1569 */                              num4 = num10;
                                    } else {
/* 101 */                               OiioiIIlooo oiioiIIlooo3 = oil000oIIO.I00000oIO;
/* 103 */                               OI10I1IoI0Ol oI10I1IoI0Ol3 = oiioiIIlooo3.I00iOIl;
/* 111 */                               Oil00l oil00l = (Oil00l) iooIolI2.I00000oOI(i29);
/* 113 */                               int i30 = i26;
/* 120 */                               Oil000 oil0003 = oil00l != null ? oil00l.I00000oIO : null;
/* 121 */                               if (oil0003 == null) {
/* 1552 */                                  throw IIlIOloOOO.I000OOo1O("no value for specified key");
                                        }
/* 123 */                               O0iiOioolIi o0iiOioolIi4 = oil0003.I0000Il00O;
/* 125 */                               OiioiIIlooo oiioiIIlooo4 = oil0003.I0000O;
/* 127 */                               iArr2 = iArr3;
/* 129 */                               int i31 = oil0003.I0001Ioi1lo;
/* 131 */                               jArr2 = jArr3;
/* 133 */                               OI10I1IoI0Ol oI10I1IoI0Ol4 = oiioiIIlooo4.I00iOIl;
/* 135 */                               i7 = i23;
/* 137 */                               Object[] objArr = oI10I1IoI0Ol4.I00000oOI;
/* 141 */                               Object[] objArr2 = oI10I1IoI0Ol4.I0000Il00O;
/* 145 */                               long[] jArr4 = oI10I1IoI0Ol4.I00000oIO;
/* 147 */                               i3 = i28;
                                        int length2 = jArr4.length - 2;
/* 154 */                               if (length2 >= 0) {
/* 156 */                                   O0iiOioolIi o0iiOioolIi5 = o0iiOioolIi4;
/* 158 */                                   i5 = i27;
/* 160 */                                   int i32 = 0;
/* 161 */                                   i9 = 0;
                                            while (true) {
/* 163 */                                       long j4 = jArr4[i32];
/* 165 */                                       Oil000 oil0004 = oil0003;
/* 167 */                                       int i33 = i32;
/* 177 */                                       if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 184 */                                           int i34 = 8 - ((~(i33 - length2)) >>> 31);
/* 186 */                                           int i35 = 0;
/* 187 */                                           while (i35 < i34) {
/* 193 */                                               if ((j4 & 255) < 128) {
/* 197 */                                                   int i36 = (i33 << 3) + i35;
/* 199 */                                                   Object obj = objArr[i36];
/* 201 */                                                   int i37 = length2;
/* 203 */                                                   Object obj2 = objArr2[i36];
/* 205 */                                                   oiioiIIlooo2 = oiioiIIlooo3;
/* 209 */                                                   Oil0IoooOio oil0IoooOio = (Oil0IoooOio) obj;
/* 211 */                                                   j = j4;
/* 213 */                                                   Oil0IoooOio oil0IoooOio2 = Oil0I1O.I001IO000;
/* 219 */                                                   if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio2) || O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I001i1O0Ol)) {
/* 234 */                                                       OiOilOo0io oiOilOo0ioI00000oIO = lO1i1O.I00000oIO(i29, arrayList5);
/* 238 */                                                       if (oiOilOo0ioI00000oIO != null) {
/* 240 */                                                           arrayList3 = arrayList5;
/* 242 */                                                           z = false;
                                                                } else {
/* 246 */                                                           oiOilOo0ioI00000oIO = new OiOilOo0io();
/* 249 */                                                           oiOilOo0ioI00000oIO.I00iOIl = i29;
/* 251 */                                                           oiOilOo0ioI00000oIO.I00iiI = arrayList4;
/* 253 */                                                           arrayList3 = arrayList5;
/* 256 */                                                           oiOilOo0ioI00000oIO.I00iiO = null;
/* 258 */                                                           oiOilOo0ioI00000oIO.I00iio = null;
/* 260 */                                                           oiOilOo0ioI00000oIO.I00ilI0I1 = null;
/* 262 */                                                           oiOilOo0ioI00000oIO.I00ilO0 = null;
/* 264 */                                                           VarHandle.storeStoreFence();
/* 267 */                                                           z = true;
                                                                }
/* 268 */                                                       arrayList4.add(oiOilOo0ioI00000oIO);
                                                            } else {
/* 230 */                                                       arrayList3 = arrayList5;
/* 232 */                                                       z = false;
                                                            }
/* 271 */                                                   if (z) {
/* 304 */                                                       Oil0IoooOio oil0IoooOio3 = Oil0I1O.I0000O;
/* 310 */                                                       if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio3)) {
/* 312 */                                                           String str2 = (String) obj2;
/* 314 */                                                           boolean zI0000Il00O = oI10I1IoI0Ol3.I0000Il00O(oil0IoooOio3);
/* 318 */                                                           int i38 = i30;
/* 320 */                                                           if (zI0000Il00O) {
/* 322 */                                                               I001lllioOl(i29, i38, str2);
                                                                    }
                                                                } else {
/* 326 */                                                           int i39 = i30;
/* 334 */                                                           if (O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I00000oOI)) {
/* 342 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num9, i39);
/* 349 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num10, i39);
                                                                    } else if (O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I00Io1o110i)) {
/* 375 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, 8192, 8);
/* 382 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num10, 8);
                                                                    } else if (O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I00IoiI)) {
/* 406 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, 3072, 8);
                                                                    } else if (O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I0000Il00O)) {
/* 424 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num9, 8);
/* 431 */                                                               I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num10, 8);
                                                                    } else {
/* 436 */                                                               Oil0IoooOio oil0IoooOio4 = Oil0I1O.I00Io1lO;
/* 445 */                                                               if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio4)) {
/* 449 */                                                                   Object objI000II = oI10I1IoI0Ol4.I000II(Oil0I1O.I001l0I00);
/* 453 */                                                                   if (objI000II == null) {
/* 455 */                                                                       objI000II = null;
                                                                            }
/* 456 */                                                                   Oi1o00lo oi1o00lo = (Oi1o00lo) objI000II;
/* 458 */                                                                   if (oi1o00lo != null && oi1o00lo.I00000oIO == 4) {
/* 479 */                                                                       Object objI000II2 = oI10I1IoI0Ol4.I000II(oil0IoooOio4);
/* 483 */                                                                       if (objI000II2 == null) {
/* 485 */                                                                           objI000II2 = null;
                                                                                }
/* 492 */                                                                       if (O0000Ioio00.I0000O(objI000II2, Boolean.TRUE)) {
/* 498 */                                                                           AccessibilityEvent accessibilityEventI000OiO = I000OiO(I001i1O0Ol(i29), 4);
/* 504 */                                                                           oil0002 = oil0004;
/* 508 */                                                                           i13 = i35;
/* 510 */                                                                           O0iiOioolIi o0iiOioolIi6 = o0iiOioolIi5;
/* 513 */                                                                           Oil000 oil0005 = new Oil000(oil0002.I00000oIO, true, o0iiOioolIi6, oiioiIIlooo4);
/* 524 */                                                                           Object objI000II3 = oil0005.I000iOII().I00iOIl.I000II(Oil0I1O.I00000oIO);
/* 528 */                                                                           if (objI000II3 == null) {
/* 530 */                                                                               objI000II3 = null;
                                                                                    }
/* 531 */                                                                           List list = (List) objI000II3;
/* 539 */                                                                           o0iiOioolIi3 = o0iiOioolIi6;
/* 549 */                                                                           String strI00000oIO = list != null ? O10lllI0o0.I00000oIO(list, ",", null, 62) : null;
/* 558 */                                                                           Object objI000II4 = oil0005.I000iOII().I00iOIl.I000II(Oil0I1O.I001lloI);
/* 562 */                                                                           if (objI000II4 == null) {
/* 564 */                                                                               objI000II4 = null;
                                                                                    }
/* 565 */                                                                           List list2 = (List) objI000II4;
/* 567 */                                                                           i12 = i34;
/* 580 */                                                                           String strI00000oIO2 = list2 != null ? O10lllI0o0.I00000oIO(list2, ",", null, 62) : null;
/* 581 */                                                                           if (strI00000oIO != null) {
/* 583 */                                                                               accessibilityEventI000OiO.setContentDescription(strI00000oIO);
                                                                                    }
/* 586 */                                                                           if (strI00000oIO2 != null) {
/* 592 */                                                                               accessibilityEventI000OiO.getText().add(strI00000oIO2);
                                                                                    }
/* 595 */                                                                           I001iOo1i0O(accessibilityEventI000OiO);
                                                                                } else {
/* 601 */                                                                           i12 = i34;
/* 603 */                                                                           i13 = i35;
/* 605 */                                                                           o0iiOioolIi3 = o0iiOioolIi5;
/* 607 */                                                                           oil0002 = oil0004;
/* 618 */                                                                           I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num10, 8);
                                                                                }
                                                                            } else {
/* 460 */                                                                       i12 = i34;
/* 462 */                                                                       i13 = i35;
/* 464 */                                                                       o0iiOioolIi3 = o0iiOioolIi5;
/* 466 */                                                                       oil0002 = oil0004;
/* 626 */                                                                       I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num9, 8);
/* 633 */                                                                       I001lIiIIo1O(this, I001i1O0Ol(i29), Barcode.FORMAT_PDF417, num10, 8);
                                                                            }
/* 636 */                                                                   num6 = num10;
/* 637 */                                                                   oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 638 */                                                                   num5 = num9;
/* 640 */                                                                   i15 = i37;
/* 642 */                                                                   o0iiOioolIi2 = o0iiOioolIi3;
                                                                        } else {
/* 650 */                                                                   i12 = i34;
/* 652 */                                                                   i13 = i35;
/* 654 */                                                                   o0iiOioolIi2 = o0iiOioolIi5;
/* 656 */                                                                   oil0002 = oil0004;
/* 666 */                                                                   if (O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I00000oIO)) {
/* 678 */                                                                       I001l0I00(I001i1O0Ol(i29), Barcode.FORMAT_PDF417, 4, (List) obj2);
/* 681 */                                                                       num6 = num10;
/* 682 */                                                                       oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 683 */                                                                       num5 = num9;
/* 685 */                                                                       i15 = i37;
                                                                            } else {
/* 688 */                                                                       Oil0IoooOio oil0IoooOio5 = Oil0I1O.I00IO1oi11O;
/* 701 */                                                                       String str3 = "";
/* 703 */                                                                       if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio5)) {
/* 711 */                                                                           if (oI10I1IoI0Ol4.I0000Il00O(Oiioi1IoIIli.I000iOII)) {
/* 713 */                                                                               Object objI000II5 = oI10I1IoI0Ol3.I000II(oil0IoooOio5);
/* 717 */                                                                               if (objI000II5 == null) {
/* 719 */                                                                                   objI000II5 = null;
                                                                                        }
/* 720 */                                                                               I1111OO10i i1111OO10i = (I1111OO10i) objI000II5;
/* 722 */                                                                               if (i1111OO10i == null) {
/* 701 */                                                                                   i1111OO10i = "";
                                                                                        }
/* 727 */                                                                               Object objI000II6 = oI10I1IoI0Ol4.I000II(oil0IoooOio5);
/* 731 */                                                                               if (objI000II6 == null) {
/* 733 */                                                                                   objI000II6 = null;
                                                                                        }
/* 734 */                                                                               CharSequence charSequence = (I1111OO10i) objI000II6;
/* 736 */                                                                               if (charSequence == null) {
/* 701 */                                                                                   charSequence = "";
                                                                                        }
/* 741 */                                                                               CharSequence charSequenceI00Io1o110i = I00Io1o110i(charSequence);
/* 745 */                                                                               int length3 = i1111OO10i.length();
/* 749 */                                                                               int length4 = charSequence.length();
/* 753 */                                                                               Integer num11 = num10;
/* 759 */                                                                               int i40 = length3 > length4 ? length4 : length3;
/* 760 */                                                                               num5 = num9;
/* 762 */                                                                               int i41 = 0;
                                                                                        while (true) {
/* 763 */                                                                                   i18 = i40;
/* 765 */                                                                                   if (i41 >= i40) {
/* 787 */                                                                                       i19 = length3;
                                                                                                break;
                                                                                            }
/* 771 */                                                                                   i19 = length3;
/* 777 */                                                                                   if (i1111OO10i.charAt(i41) != charSequence.charAt(i41)) {
                                                                                                break;
                                                                                            }
/* 780 */                                                                                   i41++;
/* 782 */                                                                                   i40 = i18;
/* 784 */                                                                                   length3 = i19;
                                                                                        }
/* 789 */                                                                               int i42 = 0;
                                                                                        while (true) {
/* 792 */                                                                                   if (i42 >= i18 - i41) {
/* 817 */                                                                                       i20 = i42;
                                                                                                break;
                                                                                            }
/* 803 */                                                                                   i20 = i42;
/* 811 */                                                                                   if (i1111OO10i.charAt((i19 - 1) - i42) != charSequence.charAt((length4 - 1) - i20)) {
                                                                                                break;
                                                                                            } else {
/* 814 */                                                                                       i42 = i20 + 1;
                                                                                            }
                                                                                        }
/* 821 */                                                                               int i43 = (i19 - i20) - i41;
/* 824 */                                                                               int i44 = (length4 - i20) - i41;
/* 825 */                                                                               Oil0IoooOio oil0IoooOio6 = Oil0I1O.I00IoO0;
/* 827 */                                                                               boolean zI0000Il00O2 = oI10I1IoI0Ol3.I0000Il00O(oil0IoooOio6);
/* 831 */                                                                               boolean zI0000Il00O3 = oI10I1IoI0Ol4.I0000Il00O(oil0IoooOio6);
/* 839 */                                                                               boolean zI0000Il00O4 = oI10I1IoI0Ol3.I0000Il00O(Oil0I1O.I00IO1oi11O);
/* 852 */                                                                               boolean z2 = zI0000Il00O4 && !zI0000Il00O2 && zI0000Il00O3;
/* 863 */                                                                               boolean z3 = zI0000Il00O4 && zI0000Il00O2 && !zI0000Il00O3;
/* 865 */                                                                               if (z2 || z3) {
/* 904 */                                                                                   int iI001i1O0Ol = I001i1O0Ol(i29);
/* 908 */                                                                                   Integer numValueOf = Integer.valueOf(length4);
/* 915 */                                                                                   i14 = i29;
/* 916 */                                                                                   oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 918 */                                                                                   num8 = num11;
/* 920 */                                                                                   accessibilityEventI000iOII = I000iOII(iI001i1O0Ol, num8, num11, numValueOf, charSequenceI00Io1o110i);
                                                                                        } else {
/* 876 */                                                                                   accessibilityEventI000iOII = I000OiO(I001i1O0Ol(i29), 16);
/* 880 */                                                                                   accessibilityEventI000iOII.setFromIndex(i41);
/* 883 */                                                                                   accessibilityEventI000iOII.setRemovedCount(i43);
/* 886 */                                                                                   accessibilityEventI000iOII.setAddedCount(i44);
/* 889 */                                                                                   accessibilityEventI000iOII.setBeforeText(i1111OO10i);
/* 896 */                                                                                   accessibilityEventI000iOII.getText().add(charSequenceI00Io1o110i);
/* 899 */                                                                                   i14 = i29;
/* 900 */                                                                                   oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 901 */                                                                                   num8 = num11;
                                                                                        }
/* 926 */                                                                               accessibilityEventI000iOII.setClassName("android.widget.EditText");
/* 933 */                                                                               if (Build.VERSION.SDK_INT >= 37) {
/* 935 */                                                                                   I0ll01oOo1.I00000oOI(oil0002, accessibilityEventI000iOII);
                                                                                        }
/* 938 */                                                                               I001iOo1i0O(accessibilityEventI000iOII);
/* 941 */                                                                               if (z2 || z3) {
/* 957 */                                                                                   num7 = num8;
/* 959 */                                                                                   long j5 = ((Oo0lI00l) oiioiIIlooo4.I000OOo1O(Oil0I1O.I00IOO)).I00000oIO;
/* 966 */                                                                                   accessibilityEventI000iOII.setFromIndex((int) (j5 >> 32));
/* 972 */                                                                                   accessibilityEventI000iOII.setToIndex((int) (j5 & 4294967295L));
/* 975 */                                                                                   I001iOo1i0O(accessibilityEventI000iOII);
                                                                                        } else {
/* 946 */                                                                                   num7 = num8;
                                                                                        }
                                                                                    } else {
/* 984 */                                                                               num7 = num10;
/* 986 */                                                                               oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 987 */                                                                               num5 = num9;
/* 989 */                                                                               i14 = i29;
/* 1002 */                                                                              I001lIiIIo1O(this, I001i1O0Ol(i14), Barcode.FORMAT_PDF417, Integer.valueOf(i24), 8);
                                                                                    }
/* 978 */                                                                           i15 = i37;
/* 980 */                                                                           num6 = num7;
                                                                                } else {
/* 1006 */                                                                          Integer num12 = num10;
/* 1008 */                                                                          oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 1009 */                                                                          num5 = num9;
/* 1011 */                                                                          i14 = i29;
/* 1012 */                                                                          Oil0IoooOio oil0IoooOio7 = Oil0I1O.I00IOO;
/* 1018 */                                                                          if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio7)) {
/* 1020 */                                                                              Object objI000II7 = oI10I1IoI0Ol4.I000II(oil0IoooOio5);
/* 1024 */                                                                              if (objI000II7 == null) {
/* 1026 */                                                                                  objI000II7 = null;
                                                                                        }
/* 1027 */                                                                              I1111OO10i i1111OO10i2 = (I1111OO10i) objI000II7;
/* 1029 */                                                                              if (i1111OO10i2 != null && (str = i1111OO10i2.I00iiI) != null) {
/* 1036 */                                                                                  str3 = str;
                                                                                        }
/* 1044 */                                                                              long j6 = ((Oo0lI00l) oiioiIIlooo4.I000OOo1O(oil0IoooOio7)).I00000oIO;
/* 1080 */                                                                              num6 = num12;
/* 1086 */                                                                              I001iOo1i0O(I000iOII(I001i1O0Ol(i14), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), I00Io1o110i(str3)));
/* 1089 */                                                                              I001lloI(i31);
/* 299 */                                                                               i15 = i37;
                                                                                    } else {
/* 1094 */                                                                              i15 = i37;
/* 1096 */                                                                              num6 = num12;
/* 1102 */                                                                              if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio2) || O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I001i1O0Ol)) {
/* 1327 */                                                                                  I0010I0i(o0iiOioolIi2);
/* 1330 */                                                                                  OiOilOo0io oiOilOo0ioI00000oIO2 = lO1i1O.I00000oIO(i14, arrayList4);
/* 1334 */                                                                                  Object objI000II8 = oI10I1IoI0Ol4.I000II(oil0IoooOio2);
/* 1338 */                                                                                  if (objI000II8 == null) {
/* 1340 */                                                                                      objI000II8 = null;
                                                                                            }
/* 1343 */                                                                                  oiOilOo0ioI00000oIO2.I00ilI0I1 = (OiOi0l) objI000II8;
/* 1347 */                                                                                  Object objI000II9 = oI10I1IoI0Ol4.I000II(Oil0I1O.I001i1O0Ol);
/* 1351 */                                                                                  if (objI000II9 == null) {
/* 1353 */                                                                                      objI000II9 = null;
                                                                                            }
/* 1356 */                                                                                  oiOilOo0ioI00000oIO2.I00ilO0 = (OiOi0l) objI000II9;
/* 1358 */                                                                                  I001IO000(oiOilOo0ioI00000oIO2);
                                                                                        } else if (O0000Ioio00.I0000O(oil0IoooOio, Oil0I1O.I000l1)) {
/* 1129 */                                                                                  if (((Boolean) obj2).booleanValue()) {
/* 1135 */                                                                                      i17 = 8;
/* 1141 */                                                                                      I001iOo1i0O(I000OiO(I001i1O0Ol(i31), 8));
                                                                                            } else {
/* 1145 */                                                                                      i17 = 8;
                                                                                            }
/* 1153 */                                                                                  I001lIiIIo1O(this, I001i1O0Ol(i31), Barcode.FORMAT_PDF417, num6, i17);
                                                                                        } else {
/* 1158 */                                                                                  Oil0IoooOio oil0IoooOio8 = Oiioi1IoIIli.I001i1lo1io;
/* 1164 */                                                                                  if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio8)) {
/* 1170 */                                                                                      List list3 = (List) oiioiIIlooo4.I000OOo1O(oil0IoooOio8);
/* 1172 */                                                                                      Object objI000II10 = oI10I1IoI0Ol2.I000II(oil0IoooOio8);
/* 1176 */                                                                                      if (objI000II10 == null) {
/* 1178 */                                                                                          objI000II10 = null;
                                                                                                }
/* 1179 */                                                                                      List list4 = (List) objI000II10;
/* 1181 */                                                                                      if (list4 != null) {
/* 1183 */                                                                                          OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 1187 */                                                                                          OI10IIO oi10iio2 = new OI10IIO();
/* 1197 */                                                                                          if (list3.size() > 0) {
/* 1247 */                                                                                              list3.get(0).getClass();
/* 1250 */                                                                                              OIiilo1Ool0o.I00000oIO();
/* 1253 */                                                                                              return;
                                                                                                    }
/* 1201 */                                                                                          OI10IIO oi10iio3 = new OI10IIO();
/* 1211 */                                                                                          if (list4.size() > 0) {
/* 1235 */                                                                                              list4.get(0).getClass();
/* 1238 */                                                                                              OIiilo1Ool0o.I00000oIO();
/* 1241 */                                                                                              return;
                                                                                                    }
/* 1224 */                                                                                          i16 = (i9 == 0 && oi10iio2.equals(oi10iio3)) ? 0 : 1;
                                                                                                } else {
/* 1268 */                                                                                          i16 = (i9 == 0 && list3.isEmpty()) ? 0 : 1;
                                                                                                }
/* 1226 */                                                                                      i9 = i16;
                                                                                            } else if (i9 == 0 && (obj2 instanceof I01lOOlO0o)) {
/* 1277 */                                                                                      I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) obj2;
/* 1279 */                                                                                      Object objI000II11 = oI10I1IoI0Ol2.I000II(oil0IoooOio);
/* 1283 */                                                                                      if (objI000II11 == null) {
/* 1285 */                                                                                          objI000II11 = null;
                                                                                                }
/* 1286 */                                                                                      if (i01lOOlO0o != objI000II11) {
/* 1291 */                                                                                          if (objI000II11 instanceof I01lOOlO0o) {
/* 1294 */                                                                                              String str4 = i01lOOlO0o.I00000oIO;
/* 1296 */                                                                                              I01lOOlO0o i01lOOlO0o2 = (I01lOOlO0o) objI000II11;
/* 1298 */                                                                                              IlliIlI illiIlI2 = i01lOOlO0o2.I00000oOI;
/* 1306 */                                                                                              if (O0000Ioio00.I0000O(str4, i01lOOlO0o2.I00000oIO) && (((illiIlI = i01lOOlO0o.I00000oOI) != null || illiIlI2 == null) && (illiIlI == null || illiIlI2 != null))) {
                                                                                                        }
                                                                                                    }
/* 1324 */                                                                                          i9 = 1;
                                                                                                }
/* 1321 */                                                                                      i9 = 0;
                                                                                            } else {
/* 1324 */                                                                                      i9 = 1;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
/* 645 */                                                               i14 = i29;
                                                                    }
                                                                }
/* 286 */                                                       num5 = num9;
/* 288 */                                                       i12 = i34;
/* 290 */                                                       i13 = i35;
/* 292 */                                                       o0iiOioolIi2 = o0iiOioolIi5;
/* 294 */                                                       oil0002 = oil0004;
/* 296 */                                                       num6 = num10;
/* 297 */                                                       i14 = i29;
/* 298 */                                                       oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 299 */                                                       i15 = i37;
                                                            } else {
/* 273 */                                                       Object objI000II12 = oI10I1IoI0Ol3.I000II(oil0IoooOio);
/* 277 */                                                       if (objI000II12 == null) {
/* 279 */                                                           objI000II12 = null;
                                                                }
/* 284 */                                                       if (O0000Ioio00.I0000O(obj2, objI000II12)) {
/* 286 */                                                           num5 = num9;
/* 288 */                                                           i12 = i34;
/* 290 */                                                           i13 = i35;
/* 292 */                                                           o0iiOioolIi2 = o0iiOioolIi5;
/* 294 */                                                           oil0002 = oil0004;
/* 296 */                                                           num6 = num10;
/* 297 */                                                           i14 = i29;
/* 298 */                                                           oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 299 */                                                           i15 = i37;
                                                                }
                                                            }
                                                        } else {
/* 1364 */                                                  oiioiIIlooo2 = oiioiIIlooo3;
/* 1366 */                                                  num5 = num9;
/* 1368 */                                                  arrayList3 = arrayList5;
/* 1370 */                                                  j = j4;
/* 1372 */                                                  i12 = i34;
/* 1374 */                                                  i13 = i35;
/* 1376 */                                                  o0iiOioolIi2 = o0iiOioolIi5;
/* 1378 */                                                  oil0002 = oil0004;
/* 1380 */                                                  num6 = num10;
/* 1381 */                                                  i14 = i29;
/* 1382 */                                                  oI10I1IoI0Ol2 = oI10I1IoI0Ol3;
/* 1384 */                                                  i15 = length2;
                                                        }
/* 1390 */                                              i29 = i14;
/* 1391 */                                              oil0004 = oil0002;
/* 1393 */                                              o0iiOioolIi5 = o0iiOioolIi2;
/* 1395 */                                              oI10I1IoI0Ol3 = oI10I1IoI0Ol2;
/* 1386 */                                              j4 = j >> 8;
/* 1398 */                                              arrayList5 = arrayList3;
/* 1400 */                                              num9 = num5;
/* 1388 */                                              i35 = i13 + 1;
/* 1403 */                                              length2 = i15;
/* 1404 */                                              i30 = 8;
/* 1406 */                                              num10 = num6;
/* 1407 */                                              i34 = i12;
/* 1409 */                                              oiioiIIlooo3 = oiioiIIlooo2;
                                                    }
/* 1413 */                                          oiioiIIlooo = oiioiIIlooo3;
/* 1415 */                                          oI10I1IoI0Ol = oI10I1IoI0Ol3;
/* 1416 */                                          num3 = num9;
/* 1418 */                                          arrayList2 = arrayList5;
/* 1420 */                                          int i45 = i34;
/* 1423 */                                          o0iiOioolIi = o0iiOioolIi5;
/* 1425 */                                          oil000 = oil0004;
/* 1427 */                                          i6 = 0;
/* 1428 */                                          num4 = num10;
/* 1429 */                                          i8 = i29;
/* 1430 */                                          i11 = length2;
/* 1431 */                                          if (i45 != i30) {
                                                        break;
                                                    }
                                                } else {
/* 1436 */                                          num4 = num10;
/* 1437 */                                          oiioiIIlooo = oiioiIIlooo3;
/* 1439 */                                          oI10I1IoI0Ol = oI10I1IoI0Ol3;
/* 1440 */                                          num3 = num9;
/* 1442 */                                          arrayList2 = arrayList5;
/* 1444 */                                          o0iiOioolIi = o0iiOioolIi5;
/* 1446 */                                          oil000 = oil0004;
/* 1448 */                                          i6 = 0;
/* 1449 */                                          i11 = length2;
/* 1450 */                                          i8 = i29;
                                                }
/* 1452 */                                      if (i33 == i11) {
                                                    break;
                                                }
/* 1456 */                                      i29 = i8;
/* 1457 */                                      o0iiOioolIi5 = o0iiOioolIi;
/* 1459 */                                      oI10I1IoI0Ol3 = oI10I1IoI0Ol;
/* 1460 */                                      oiioiIIlooo3 = oiioiIIlooo;
/* 1462 */                                      num9 = num3;
/* 1464 */                                      i30 = 8;
/* 1454 */                                      i32 = i33 + 1;
/* 1467 */                                      length2 = i11;
/* 1468 */                                      num10 = num4;
/* 1469 */                                      oil0003 = oil000;
/* 1470 */                                      arrayList5 = arrayList2;
                                            }
                                        } else {
/* 1474 */                                  oiioiIIlooo = oiioiIIlooo3;
/* 1476 */                                  num3 = num9;
/* 1478 */                                  arrayList2 = arrayList5;
/* 1480 */                                  i5 = i27;
/* 1482 */                                  oil000 = oil0003;
/* 1483 */                                  i6 = 0;
/* 1484 */                                  num4 = num10;
/* 1485 */                                  i8 = i29;
/* 1486 */                                  i9 = 0;
                                        }
/* 1488 */                              if (i9 == 0) {
/* 1490 */                                  Iterator it = oiioiIIlooo.iterator();
                                            while (true) {
/* 1498 */                                      if (!it.hasNext()) {
/* 1526 */                                          i10 = i6;
                                                    break;
                                                }
/* 1522 */                                      if (!oil000.I000iOII().I00iOIl.I0000Il00O((Oil0IoooOio) ((Map.Entry) it.next()).getKey())) {
/* 1524 */                                          i10 = 1;
                                                    break;
                                                }
                                            }
/* 1527 */                                  i9 = i10;
                                        }
/* 1529 */                              if (i9 != 0) {
/* 1537 */                                  i4 = 8;
/* 1539 */                                  I001lIiIIo1O(this, I001i1O0Ol(i8), Barcode.FORMAT_PDF417, num4, 8);
                                        } else {
/* 1543 */                                  i4 = 8;
                                        }
                                    }
                                }
/* 1570 */                      j3 >>= i4;
/* 1572 */                      i28 = i3 + 1;
/* 1574 */                      iooIolI2 = iooIolI;
/* 1576 */                      i26 = i4;
/* 1577 */                      num10 = num4;
/* 1578 */                      iArr3 = iArr2;
/* 1580 */                      jArr3 = jArr2;
/* 1582 */                      i23 = i7;
/* 1584 */                      i27 = i5;
/* 1586 */                      arrayList5 = arrayList2;
/* 1588 */                      num9 = num3;
/* 1590 */                      i22 = i6;
                            }
/* 1593 */                  num = num9;
/* 1595 */                  arrayList = arrayList5;
/* 1597 */                  iArr = iArr3;
/* 1599 */                  jArr = jArr3;
/* 1603 */                  i = i22;
/* 1604 */                  int i46 = i23;
/* 1606 */                  num2 = num10;
/* 1607 */                  if (i27 != i26) {
/* 2856 */                      return;
                            } else {
/* 1609 */                      i2 = i46;
                            }
                        } else {
/* 1614 */                  num = num9;
/* 1616 */                  arrayList = arrayList5;
/* 1618 */                  iArr = iArr3;
/* 1620 */                  jArr = jArr3;
/* 1622 */                  i = i22;
/* 1623 */                  num2 = num10;
/* 1624 */                  i2 = i23;
                        }
/* 1626 */              if (i2 == i25) {
/* 2856 */                  return;
                        }
/* 1628 */              i23 = i2 + 1;
/* 1630 */              iooIolI2 = iooIolI;
/* 1632 */              length = i25;
/* 1633 */              num10 = num2;
/* 1634 */              i21 = i24;
/* 1636 */              iArr3 = iArr;
/* 1638 */              jArr3 = jArr;
/* 1640 */              arrayList5 = arrayList;
/* 1642 */              num9 = num;
/* 1644 */              i22 = i;
                    }
                }

                public final void I00II0oii1o(O0iiOioolIi o0iiOioolIi, OI0lOIOi1l oI0lOIOi1l) {
                    OiioiIIlooo oiioiIIloooI001i1lo1io;
                    HashMap<O0iiOioolIi, I10I1li0> layoutNodeToHolder;
/* 5 */             if (o0iiOioolIi.I00Io1lO()) {
/* 11 */                I10OIIo androidViewsHandler$ui = this.I00iio.getAndroidViewsHandler$ui();
/* 16 */                if (androidViewsHandler$ui == null || (layoutNodeToHolder = androidViewsHandler$ui.getLayoutNodeToHolder()) == null || !layoutNodeToHolder.containsKey(o0iiOioolIi)) {
/* 40 */                    O0iiOioolIi o0iiOioolIi2 = null;
/* 41 */                    if (!o0iiOioolIi.I010101Oo1lO.I000iOII(8)) {
/* 44 */                        o0iiOioolIi = o0iiOioolIi.I001IO000();
                                while (true) {
/* 48 */                            if (o0iiOioolIi == null) {
/* 64 */                                o0iiOioolIi = null;
                                        break;
                                    } else if (o0iiOioolIi.I010101Oo1lO.I000iOII(8)) {
                                        break;
                                    } else {
/* 59 */                                o0iiOioolIi = o0iiOioolIi.I001IO000();
                                    }
                                }
                            }
/* 65 */                    if (o0iiOioolIi == null || (oiioiIIloooI001i1lo1io = o0iiOioolIi.I001i1lo1io()) == null) {
/* 332 */                       return;
                            }
/* 76 */                    if (!oiioiIIloooI001i1lo1io.I00iiO) {
/* 78 */                        O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
                                while (true) {
/* 82 */                            if (o0iiOioolIiI001IO000 != null) {
/* 84 */                                OiioiIIlooo oiioiIIloooI001i1lo1io2 = o0iiOioolIiI001IO000.I001i1lo1io();
/* 88 */                                if (oiioiIIloooI001i1lo1io2 != null && oiioiIIloooI001i1lo1io2.I00iiO) {
/* 94 */                                    o0iiOioolIi2 = o0iiOioolIiI001IO000;
                                            break;
                                        }
/* 96 */                                o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                                    } else {
                                        break;
                                    }
                                }
/* 101 */                       if (o0iiOioolIi2 != null) {
/* 103 */                           o0iiOioolIi = o0iiOioolIi2;
                                }
                            }
/* 104 */                   int i = o0iiOioolIi.I00iiI;
/* 110 */                   if (oI0lOIOi1l.I00000oIO(i)) {
/* 123 */                       I001lIiIIo1O(this, I001i1O0Ol(i), Barcode.FORMAT_PDF417, 1, 8);
                            }
                        }
                    }
                }

                public final void I00IO1(O0iiOioolIi o0iiOioolIi) {
                    HashMap<O0iiOioolIi, I10I1li0> layoutNodeToHolder;
/* 5 */             if (o0iiOioolIi.I00Io1lO()) {
/* 10 */                I10OIIo androidViewsHandler$ui = this.I00iio.getAndroidViewsHandler$ui();
/* 14 */                if (androidViewsHandler$ui == null || (layoutNodeToHolder = androidViewsHandler$ui.getLayoutNodeToHolder()) == null || !layoutNodeToHolder.containsKey(o0iiOioolIi)) {
/* 30 */                    int i = o0iiOioolIi.I00iiI;
/* 38 */                    OiOi0l oiOi0l = (OiOi0l) this.I00o0l1o1o0.I00000oOI(i);
/* 46 */                    OiOi0l oiOi0l2 = (OiOi0l) this.I00o101lO.I00000oOI(i);
/* 48 */                    if (oiOi0l == null && oiOi0l2 == null) {
/* 52 */                        return;
                            }
/* 55 */                    AccessibilityEvent accessibilityEventI000OiO = I000OiO(i, Barcode.FORMAT_AZTEC);
/* 59 */                    if (oiOi0l != null) {
/* 74 */                        accessibilityEventI000OiO.setScrollX((int) ((Number) oiOi0l.I00000oIO.invoke()).floatValue());
/* 90 */                        accessibilityEventI000OiO.setMaxScrollX((int) ((Number) oiOi0l.I00000oOI.invoke()).floatValue());
                            }
/* 93 */                    if (oiOi0l2 != null) {
/* 108 */                       accessibilityEventI000OiO.setScrollY((int) ((Number) oiOi0l2.I00000oIO.invoke()).floatValue());
/* 124 */                       accessibilityEventI000OiO.setMaxScrollY((int) ((Number) oiOi0l2.I00000oOI.invoke()).floatValue());
                            }
/* 127 */                   I001iOo1i0O(accessibilityEventI000OiO);
                        }
                    }
                }

                public final boolean I00IO1oi11O(Oil000 oil000, int i, int i2, boolean z) {
                    String strI000oI1ioi;
/* 1 */             OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 3 */             int i3 = oil000.I0001Ioi1lo;
/* 5 */             Oil0IoooOio oil0IoooOio = Oiioi1IoIIli.I000OiO;
/* 14 */            if (oiioiIIlooo.I00iOIl.I0000Il00O(oil0IoooOio) && iOIl0OoO.I00000oIO(oil000)) {
/* 32 */                Function3 function3 = (Function3) ((I01lOOlO0o) oil000.I0000O.I000OOo1O(oil0IoooOio)).I00000oOI;
/* 34 */                if (function3 != null) {
/* 54 */                    return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
                        }
                    } else if ((i != i2 || i2 != this.I00oIiI10) && (strI000oI1ioi = I000oI1ioi(oil000)) != null) {
/* 73 */                if (i < 0 || i != i2 || i2 > strI000oI1ioi.length()) {
/* 84 */                    i = -1;
                        }
/* 85 */                this.I00oIiI10 = i;
/* 92 */                boolean z2 = strI000oI1ioi.length() > 0;
/* 138 */               I001iOo1i0O(I000iOII(I001i1O0Ol(i3), z2 ? Integer.valueOf(this.I00oIiI10) : null, z2 ? Integer.valueOf(this.I00oIiI10) : null, z2 ? Integer.valueOf(strI000oI1ioi.length()) : null, strI000oI1ioi));
/* 141 */               I001lloI(i3);
/* 91 */                return true;
                    }
/* 13 */            return false;
                }

                public final Rect I00IioO0OiOi(float f, float f2, float f3, float f4) {
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00iio;
/* 23 */            long jI00100o1O0lo = i0lio1O01i01.I00100o1O0lo((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
/* 40 */            long jI00100o1O0lo2 = i0lio1O01i01.I00100o1O0lo((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
/* 48 */            int i = (int) (jI00100o1O0lo >> 32);
/* 55 */            int i2 = (int) (jI00100o1O0lo2 >> 32);
/* 72 */            int i3 = (int) (jI00100o1O0lo & 4294967295L);
/* 78 */            int i4 = (int) (jI00100o1O0lo2 & 4294967295L);
/* 132 */           return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
                }

                /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
                
                    r28 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
                
                    if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
                
                    r25 = -1;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IoIO0lI() {
                    long j;
                    long j2;
                    long j3;
                    char c;
                    long[] jArr;
                    long[] jArr2;
                    long j4;
                    int i;
                    int i2;
                    int iNumberOfTrailingZeros;
                    char c2;
/* 3 */             OI0l1oli1I oI0l1oli1I = this.I010101Oo1lO;
/* 7 */             OI0lOIOi1l oI0lOIOi1l = new OI0lOIOi1l();
/* 10 */            OI0lOIOi1l oI0lOIOi1l2 = this.I00oo1iO0ll;
/* 12 */            int[] iArr = oI0lOIOi1l2.I00000oOI;
/* 14 */            long[] jArr3 = oI0lOIOi1l2.I00000oIO;
                    int length = jArr3.length - 2;
/* 19 */            int i3 = 8;
/* 21 */            if (length >= 0) {
/* 23 */                int i4 = 0;
/* 24 */                j = 128;
/* 26 */                j2 = 255;
                        while (true) {
/* 28 */                    long j5 = jArr3[i4];
/* 30 */                    char c3 = 7;
/* 31 */                    j3 = -9187201950435737472L;
/* 43 */                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 50 */                        int i5 = 8 - ((~(i4 - length)) >>> 31);
/* 52 */                        int i6 = 0;
/* 53 */                        while (i6 < i5) {
/* 59 */                            if ((j5 & 255) < 128) {
/* 64 */                                int i7 = iArr[(i4 << 3) + i6];
/* 66 */                                c2 = c3;
/* 76 */                                Oil00l oil00l = (Oil00l) I000o00OoI0I().I00000oOI(i7);
/* 85 */                                Oil000 oil000 = oil00l != null ? oil00l.I00000oIO : null;
/* 87 */                                if (oil000 != null) {
/* 99 */                                    if (!oil000.I0000O.I00iOIl.I0000Il00O(Oil0I1O.I0000O)) {
/* 101 */                                       oI0lOIOi1l.I00000oIO(i7);
/* 108 */                                       Oil000oIIO oil000oIIO = (Oil000oIIO) oI0l1oli1I.I00000oOI(i7);
/* 110 */                                       if (oil000oIIO != null) {
/* 118 */                                           Object objI000II = oil000oIIO.I00000oIO.I00iOIl.I000II(Oil0I1O.I0000O);
/* 122 */                                           str = objI000II != 0 ? objI000II : null;
                                                }
/* 133 */                                       I001lllioOl(i7, 32, str);
                                            }
                                        }
                                    } else {
/* 137 */                               c2 = c3;
                                    }
/* 139 */                           j5 >>= 8;
/* 140 */                           i6++;
/* 142 */                           c3 = c2;
                                }
/* 145 */                       c = c3;
/* 147 */                       if (i5 != 8) {
                                    break;
                                }
                            } else {
/* 150 */                       c = 7;
                            }
/* 152 */                   if (i4 == length) {
                                break;
                            } else {
/* 154 */                       i4++;
                            }
                        }
                    } else {
/* 158 */               j = 128;
/* 160 */               j2 = 255;
/* 162 */               j3 = -9187201950435737472L;
/* 167 */               c = 7;
                    }
/* 169 */           int[] iArr2 = oI0lOIOi1l.I00000oOI;
/* 171 */           long[] jArr4 = oI0lOIOi1l.I00000oIO;
                    int length2 = jArr4.length - 2;
/* 176 */           if (length2 >= 0) {
/* 178 */               int i8 = 0;
                        while (true) {
/* 179 */                   long j6 = jArr4[i8];
/* 189 */                   if ((((~j6) << c) & j6 & j3) != j3) {
/* 196 */                       int i9 = 8 - ((~(i8 - length2)) >>> 31);
/* 198 */                       int i10 = 0;
/* 199 */                       while (i10 < i9) {
/* 205 */                           if ((j6 & j2) < j) {
/* 210 */                               int i11 = iArr2[(i8 << 3) + i10];
/* 219 */                               int iHashCode = Integer.hashCode(i11) * (-862048943);
/* 222 */                               int i12 = iHashCode ^ (iHashCode << 16);
/* 223 */                               int i13 = i12 & 127;
/* 225 */                               int i14 = oI0lOIOi1l2.I0000Il00O;
/* 229 */                               int i15 = (i12 >>> 7) & i14;
/* 230 */                               i = i3;
/* 232 */                               int i16 = 0;
                                        while (true) {
/* 234 */                                   long[] jArr5 = oI0lOIOi1l2.I00000oIO;
/* 236 */                                   int i17 = i15 >> 3;
/* 240 */                                   jArr2 = jArr4;
/* 242 */                                   int i18 = (i15 & 7) << 3;
/* 256 */                                   j4 = j6;
/* 265 */                                   long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
/* 267 */                                   int i19 = i14;
/* 276 */                                   long j8 = (i13 * 72340172838076673L) ^ j7;
/* 282 */                                   long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                            while (true) {
/* 288 */                                       if (j9 == 0) {
                                                    break;
                                                }
/* 298 */                                       iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
/* 300 */                                       int i20 = i19;
/* 306 */                                       if (oI0lOIOi1l2.I00000oOI[iNumberOfTrailingZeros] == i11) {
                                                    break;
                                                }
/* 315 */                                       j9 &= j9 - 1;
/* 317 */                                       i19 = i20;
                                            }
/* 341 */                                   i16 += 8;
/* 345 */                                   i15 = (i15 + i16) & i2;
/* 347 */                                   jArr4 = jArr2;
/* 349 */                                   i14 = i2;
/* 351 */                                   j6 = j4;
                                        }
/* 308 */                               int i21 = iNumberOfTrailingZeros;
/* 335 */                               if (i21 >= 0) {
/* 337 */                                   oI0lOIOi1l2.I000II(i21);
                                        }
                                    } else {
/* 354 */                               jArr2 = jArr4;
/* 356 */                               j4 = j6;
/* 358 */                               i = i3;
                                    }
/* 360 */                           j6 = j4 >> i;
/* 362 */                           i10++;
/* 364 */                           i3 = i;
/* 366 */                           jArr4 = jArr2;
                                }
/* 370 */                       jArr = jArr4;
/* 373 */                       if (i9 != i3) {
                                    break;
                                }
                            } else {
/* 376 */                       jArr = jArr4;
                            }
/* 378 */                   if (i8 == length2) {
                                break;
                            }
/* 380 */                   i8++;
/* 382 */                   jArr4 = jArr;
/* 384 */                   i3 = 8;
                        }
                    }
/* 388 */           oI0l1oli1I.I0000Il00O();
/* 391 */           IooIolI iooIolII000o00OoI0I = I000o00OoI0I();
/* 395 */           int[] iArr3 = iooIolII000o00OoI0I.I00000oOI;
/* 397 */           Object[] objArr = iooIolII000o00OoI0I.I0000Il00O;
/* 399 */           long[] jArr6 = iooIolII000o00OoI0I.I00000oIO;
                    int length3 = jArr6.length - 2;
/* 404 */           if (length3 >= 0) {
/* 406 */               int i22 = 0;
                        while (true) {
/* 407 */                   long j10 = jArr6[i22];
/* 417 */                   if ((((~j10) << c) & j10 & j3) != j3) {
/* 426 */                       int i23 = 8 - ((~(i22 - length3)) >>> 31);
/* 429 */                       for (int i24 = 0; i24 < i23; i24++) {
/* 435 */                           if ((j10 & j2) < j) {
/* 439 */                               int i25 = (i22 << 3) + i24;
/* 440 */                               int i26 = iArr3[i25];
/* 446 */                               Oil000 oil0002 = ((Oil00l) objArr[i25]).I00000oIO;
/* 448 */                               OiioiIIlooo oiioiIIlooo = oil0002.I0000O;
/* 450 */                               Oil0IoooOio oil0IoooOio = Oil0I1O.I0000O;
/* 458 */                               if (oiioiIIlooo.I00iOIl.I0000Il00O(oil0IoooOio) && oI0lOIOi1l2.I00000oIO(i26)) {
/* 476 */                                   I001lllioOl(i26, 16, (String) oil0002.I0000O.I000OOo1O(oil0IoooOio));
                                        }
/* 488 */                               oI0l1oli1I.I000OOo1O(i26, new Oil000oIIO(oil0002, I000o00OoI0I()));
                                    }
/* 493 */                           j10 >>= 8;
                                }
/* 499 */                       if (i23 != 8) {
                                    break;
                                }
                            }
/* 504 */                   if (i22 == length3) {
                                break;
                            } else {
/* 506 */                       i22++;
                            }
                        }
                    }
/* 528 */           this.I010I0 = new Oil000oIIO(this.I00iio.getSemanticsOwner().I00000oIO(), I000o00OoI0I());
                }

                @Override
                public final void onAccessibilityStateChanged(boolean z) {
/* 2 */             this.I00l0I0l0lO1 = null;
                }

                @Override
                public final void onTouchExplorationStateChanged(boolean z) {
/* 2 */             this.I00l0I0l0lO1 = null;
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 1 */             AccessibilityManager accessibilityManager = this.I00io1l;
/* 7 */             if (accessibilityManager.isEnabled()) {
/* 10 */                this.I00l0I0l0lO1 = null;
                    }
/* 12 */            accessibilityManager.addAccessibilityStateChangeListener(this);
/* 15 */            accessibilityManager.addTouchExplorationStateChangeListener(this);
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 9 */             this.I00iio.getHandler().removeCallbacks(this.I010i10l);
/* 12 */            AccessibilityManager accessibilityManager = this.I00io1l;
/* 14 */            accessibilityManager.removeAccessibilityStateChangeListener(this);
/* 17 */            accessibilityManager.removeTouchExplorationStateChangeListener(this);
                }
            }
