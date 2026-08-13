            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Trace;
            import android.util.LongSparseArray;
            import android.util.SparseArray;
            import android.util.SparseLongArray;
            import android.view.FocusFinder;
            import android.view.GestureDetector;
            import android.view.InputDevice;
            import android.view.KeyEvent;
            import android.view.MotionEvent;
            import android.view.PointerIcon;
            import android.view.ScrollCaptureTarget;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.ViewStructure;
            import android.view.ViewTreeObserver;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.view.animation.AnimationUtils;
            import android.view.autofill.AutofillId;
            import android.view.autofill.AutofillValue;
            import android.view.inputmethod.CursorAnchorInfo;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.translation.TranslationRequestValue;
            import android.view.translation.ViewTranslationRequest;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.Reference;
            import java.lang.ref.ReferenceQueue;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.function.Consumer;
            import kotlin.jvm.functions.Function1;
            
/* 4 */     public final class I0lio1O01i01 extends ViewGroup implements OIlO000O01, Oi1oilO, IiI00001oI, OIiloO, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, Ili1i0IO1I0l {
                public static Class I01O1I1;
                public static Method I01O1lIi;
                public static final OI0oiiIO0 I01OIo = new OI0oiiIO0();
                public static I0il01i00i I01OO1I;
                public static Method I01OOIlI;
                public IOl10lI1 I00iOIl;
                public long I00iiI;
                public boolean I00iiO;
                public Iol1IlIII10 I00iio;
                public O0oiioII1 I00ilI0I1;
                public O0oil001 I00ilO0;
                public IiiOlo1l1 I00io1l;
                public Oi10loIIo1l I00ioIO;
                public I1Il0loi I00l0I0l0lO1;
                public I0li0Io I00l0OO0IO;
                public OIooliIO0 I00li1OI;
                public View I00ll1;
                public Ili1ioOlo0oO I00lli11;
                public Ii00l101O I00lll10;
                public I0o11ooo00l1 I00o0iI0io1;
                public OIooliIO0 I00o0l1o1o0;
                public IiO0o1I I00o101lO;
                public Ioo0oO1 I00oI0i;
                public O0iiOioolIi I00oII;
                public OI0l1oli1I I00oIiI10;
                public OOo0Olol0o I00oO101o;
                public Oil01I0 I00oOio10iI1;
                public I0ll1oo I00ol1;
                public I0lo1oIo I00olI;
                public I0oIoiI0 I00oli;
                public I1lOlO0ioIl0 I00oliIiO01i;
                public OI0oiiIO0 I00oo1iO0ll;
                public OI0oiiIO0 I00ooIo0;
                public boolean I00ooiO1I;
                public boolean I00oooO;
                public OI01OO I0100i;
                public IOI0oloi01 I0100o111I;
                public OIooliIO0 I010101Oo1lO;
                public IiO0o1I I010I0;
                public I0lI1I10iIII I010II;
                public I0lII0loi I010OIo1l;
                public boolean I010i10l;
                public OIlOIi0 I010iIIOlo;
                public I10OIIo I010ioo;
                public IOo0oO11ll1O I010l10O;
                public boolean I010l1O;
                public O1iO111i I010l1ol111;
                public long I010lI0oi;
                public int[] I010o0o0oO;
                public float[] I010oio1OO0;
                public Matrix I01101IOlO;
                public float[] I01101olii;
                public float[] I0110OiO;
                public long I0110o;
                public boolean I0111i;
                public long I011IO1I11OI;
                public Function1 I011IOil;
                public Oo0Ooo1Oi I011Ill;
                public Oo0Oo0 I011Io0I1ioi;
                public AtomicReference I011Ol0;
                public IiIli1i1o I011iIOio;
                public OI10i0Il I011iO;
                public OIooliIO0 I011iiii0i;
                public IololIiII I011lIilI0lo;
                public O1ooilI0 I011lO1liO1O;
                public I100oiOlIo11 I011lOIoo0l;
                public MotionEvent I011olOoO;
                public long I01I01Oolii;
                public i000IO I01I0Iioooo0;
                public OI0oiiIO0 I01I1Oo0oll;
                public float I01II10;
                public float I01IO0oio;
                public float I01IO1il;
                public float I01Ii0ll10O;
                public I0lil01 I01IiOO;
                public I0li0Io I01Iio10lo;
                public boolean I01IlIoOI;
                public IlliIl1l11O I01Ilioliio;
                public IolIIo0o0Iio I01Ilo0i;
                public I0lOo0io I01Io000;
                public I0lOo0io I01Io001O;
                public boolean I01Io1;
                public boolean I01Io11IiiiO;
                public boolean I01Io1ilOIIo;
                public IIOOoll I01IoO;
                public View I01Iol;
                public I0liiOI I01O10iIoo1O;

                public static void I0000Il00O(ViewGroup viewGroup) {
/* 1 */             int childCount = viewGroup.getChildCount();
/* 6 */             for (int i = 0; i < childCount; i++) {
/* 8 */                 View childAt = viewGroup.getChildAt(i);
/* 14 */                if (childAt instanceof I0lio1O01i01) {
/* 18 */                    ((I0lio1O01i01) childAt).I001IIilI0O();
                        } else if (childAt instanceof ViewGroup) {
/* 28 */                    I0000Il00O((ViewGroup) childAt);
                        }
                    }
                }

                public static long I0000O(int i) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 5 */             int size = View.MeasureSpec.getSize(i);
/* 11 */            if (mode == Integer.MIN_VALUE) {
/* 36 */                return size;
                    }
/* 13 */            if (mode == 0) {
/* 32 */                return 2147483647L;
                    }
/* 17 */            if (mode == 1073741824) {
                        long j = size;
/* 24 */                return j | (j << 32);
                    }
/* 26 */            IOOlIIilOl0.I000iOII();
/* 29 */            return 0L;
                }

                public static final boolean I0001Ioi1lo(I0lio1O01i01 i0lio1O01i01, KeyEvent keyEvent) {
/* 1 */             return super.dispatchKeyEvent(keyEvent);
                }

                public static void I000OiO(O0iiOioolIi o0iiOioolIi) {
/* 1 */             o0iiOioolIi.I00IO1();
/* 4 */             OI110O0 oi110o0I001lIiIIo1O = o0iiOioolIi.I001lIiIIo1O();
/* 8 */             Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 10 */            int i = oi110o0I001lIiIIo1O.I00iiO;
/* 13 */            for (int i2 = 0; i2 < i; i2++) {
/* 19 */                I000OiO((O0iiOioolIi) objArr[i2]);
                    }
                }

                public static boolean I000l1() {
                    return Build.VERSION.SDK_INT >= 35;
                }

                public static boolean I000lI(MotionEvent motionEvent) {
/* 54 */            boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
/* 55 */            if (!z) {
/* 57 */                int pointerCount = motionEvent.getPointerCount();
/* 62 */                for (int i = 1; i < pointerCount; i++) {
/* 97 */                    z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !OI01Oio00.I00000oIO.I00000oIO(motionEvent, i);
/* 98 */                    if (z) {
                                break;
                            }
                        }
                    }
/* 168 */           return z;
                }

                private final IIoll1I0 getCanvasHolder() {
/* 3 */             return this.I00iOIl.I001IIilI0O;
                }

                private final boolean getDerivedIsAttached() {
/* 9 */             return ((Boolean) this.I00o101lO.getValue()).booleanValue();
                }

                /* JADX WARN: Multi-variable type inference failed */
                private final Oo0Ooo1Oi getLegacyTextInputServiceAndroid() {
/* 1 */             Oo0Ooo1Oi oo0Ooo1Oi = this.I011Ill;
/* 3 */             if (oo0Ooo1Oi != null) {
/* 245 */               return oo0Ooo1Oi;
                    }
/* 7 */             View view = getView();
/* 14 */            I0lOoloIoi i0lOoloIoi = new I0lOoloIoi(0);
/* 17 */            i0lOoloIoi.I00iiI = this;
/* 19 */            VarHandle.storeStoreFence();
/* 26 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(15, 0 == true ? 1 : 0);
/* 29 */            ioIlOo1o0IIl.I00iiI = view;
/* 31 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 36 */            IlIi0Il ilIi0Il = new IlIi0Il(4);
/* 39 */            ilIi0Il.I00iiI = ioIlOo1o0IIl;
/* 41 */            VarHandle.storeStoreFence();
/* 48 */            ioIlOo1o0IIl.I00iiO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, ilIi0Il);
/* 55 */            ioIlOo1o0IIl.I00iio = new Oi00IilOloo0(view);
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            Oo0Ooo1Oi oo0Ooo1Oi2 = new Oo0Ooo1Oi();
/* 63 */            oo0Ooo1Oi2.I00000oIO = view;
/* 65 */            oo0Ooo1Oi2.I00000oOI = ioIlOo1o0IIl;
/* 67 */            oo0Ooo1Oi2.I0000Il00O = i0lOoloIoi;
/* 71 */            int i = 7;
/* 75 */            oo0Ooo1Oi2.I0000oI00 = new Oo011oIOO1(i);
/* 84 */            oo0Ooo1Oi2.I0001Ioi1lo = new Oo011oIOO1(8);
/* 95 */            oo0Ooo1Oi2.I000II = new Oo0OI01Il(4, Oo0lI00l.I00000oOI, "");
/* 99 */            oo0Ooo1Oi2.I000O01llI0 = IoiiO1O1.I000II;
/* 106 */           oo0Ooo1Oi2.I000OOo1O = new ArrayList();
/* 110 */           OlOi0iollo olOi0iollo = new OlOi0iollo(i);
/* 113 */           olOi0iollo.I00iiI = oo0Ooo1Oi2;
/* 115 */           VarHandle.storeStoreFence();
/* 122 */           oo0Ooo1Oi2.I000OiO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, olOi0iollo);
/* 126 */           Ii0i1000 ii0i1000 = new Ii0i1000();
/* 129 */           ii0i1000.I00000oIO = this;
/* 131 */           ii0i1000.I00000oOI = ioIlOo1o0IIl;
/* 138 */           ii0i1000.I0000Il00O = new Object();
/* 142 */           ii0i1000.I000lI = I0ollliOo0.I00ooiO1I;
/* 149 */           ii0i1000.I00100l0 = new CursorAnchorInfo.Builder();
/* 155 */           ii0i1000.I00100o1O0lo = O1i010l1l.I00000oOI();
/* 162 */           ii0i1000.I0010I0i = new Matrix();
/* 164 */           VarHandle.storeStoreFence();
/* 167 */           oo0Ooo1Oi2.I000l1 = ii0i1000;
/* 178 */           oo0Ooo1Oi2.I000lI = new OI110O0(new Oo0OoOo00[16]);
/* 180 */           VarHandle.storeStoreFence();
/* 183 */           this.I011Ill = oo0Ooo1Oi2;
/* 245 */           return oo0Ooo1Oi2;
                }

                private final void setAttached(boolean z) {
/* 7 */             this.I00o0l1o1o0.setValue(Boolean.valueOf(z));
                }

                private void setDensity(IiIooOOOI iiIooOOOI) {
/* 3 */             this.I00li1OI.setValue(iiIooOOOI);
                }

                private void setLayoutDirection(O0iOOoiioO o0iOOoiioO) {
/* 3 */             this.I011iiii0i.setValue(o0iOOoiioO);
                }

                @Override
                public final void I00000oIO(IliIO10oO0 iliIO10oO0, IliIO10oO0 iliIO10oO02) {
                    IIlOoolol0ll iIlOoolol0ll;
                    boolean z;
                    IIlOoolol0ll iIlOoolol0ll2;
                    boolean z2;
/* 1 */             if (iliIO10oO0 != null) {
/* 4 */                 IliIO10oO0 iliIO10oO03 = iliIO10oO0;
/* 12 */                if (!iliIO10oO03.I00iOIl.I00lll10) {
/* 14 */                    IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                        }
/* 17 */                O1ooOo o1ooOo = iliIO10oO03.I00iOIl;
/* 19 */                O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0);
/* 23 */                OI10IIO oi10iio = null;
/* 24 */                ArrayList arrayList = null;
/* 31 */                while (o0iiOioolIiI000O01llI0 != null) {
/* 42 */                    if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 2097152) != 0) {
/* 44 */                        while (o1ooOo != null) {
/* 49 */                            if ((o1ooOo.I00iiO & 2097152) != 0) {
/* 51 */                                O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 52 */                                OI110O0 oi110o0 = null;
/* 53 */                                while (o1ooOoI0000Il00O != null) {
/* 57 */                                    if (o1ooOoI0000Il00O instanceof IolI11) {
/* 59 */                                        if (arrayList == null) {
/* 63 */                                            arrayList = new ArrayList();
                                                }
/* 66 */                                        arrayList.add(o1ooOoI0000Il00O);
/* 69 */                                        z2 = false;
                                            } else {
/* 71 */                                        z2 = true;
                                            }
/* 72 */                                    if (z2 && (o1ooOoI0000Il00O.I00iiO & 2097152) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 88 */                                        int i = 0;
/* 89 */                                        for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 94 */                                            if ((o1ooOo2.I00iiO & 2097152) != 0) {
/* 96 */                                                i++;
/* 98 */                                                if (i == 1) {
/* 100 */                                                   o1ooOoI0000Il00O = o1ooOo2;
                                                        } else {
/* 102 */                                                   if (oi110o0 == null) {
/* 108 */                                                       oi110o0 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 111 */                                                   if (o1ooOoI0000Il00O != null) {
/* 113 */                                                       oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 116 */                                                       o1ooOoI0000Il00O = null;
                                                            }
/* 117 */                                                   oi110o0.I00000oOI(o1ooOo2);
                                                        }
                                                    }
                                                }
/* 123 */                                       if (i == 1) {
                                                }
                                            }
/* 126 */                                   o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                        }
                                    }
/* 131 */                           o1ooOo = o1ooOo.I00ilI0I1;
                                }
                            }
/* 134 */                   o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 149 */                   o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll2 = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll2.I00ilO0;
                        }
/* 151 */               if (arrayList == null) {
/* 332 */                   return;
                        }
/* 155 */               if (iliIO10oO02 != null) {
/* 161 */                   if (!iliIO10oO02.I00iOIl.I00lll10) {
/* 163 */                       IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 166 */                   O1ooOo o1ooOo3 = iliIO10oO02.I00iOIl;
/* 168 */                   O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(iliIO10oO02);
/* 172 */                   OI10IIO oi10iio2 = null;
/* 173 */                   while (o0iiOioolIiI000O01llI02 != null) {
/* 184 */                       if ((((O1ooOo) o0iiOioolIiI000O01llI02.I010101Oo1lO.I00io1l).I00iio & 2097152) != 0) {
/* 186 */                           while (o1ooOo3 != null) {
/* 191 */                               if ((o1ooOo3.I00iiO & 2097152) != 0) {
/* 193 */                                   O1ooOo o1ooOoI0000Il00O2 = o1ooOo3;
/* 194 */                                   OI110O0 oi110o02 = null;
/* 195 */                                   while (o1ooOoI0000Il00O2 != null) {
/* 199 */                                       if (o1ooOoI0000Il00O2 instanceof IolI11) {
/* 201 */                                           if (oi10iio2 == null) {
/* 203 */                                               OI10IIO oi10iio3 = OiO11lliO.I00000oIO;
/* 207 */                                               oi10iio2 = new OI10IIO();
                                                    }
/* 210 */                                           oi10iio2.I00000oIO(o1ooOoI0000Il00O2);
/* 213 */                                           z = false;
                                                } else {
/* 215 */                                           z = true;
                                                }
/* 216 */                                       if (z && (o1ooOoI0000Il00O2.I00iiO & 2097152) != 0 && (o1ooOoI0000Il00O2 instanceof IiIioO0ol1oI)) {
/* 232 */                                           int i2 = 0;
/* 233 */                                           for (O1ooOo o1ooOo4 = ((IiIioO0ol1oI) o1ooOoI0000Il00O2).I00o0l1o1o0; o1ooOo4 != null; o1ooOo4 = o1ooOo4.I00ilO0) {
/* 238 */                                               if ((o1ooOo4.I00iiO & 2097152) != 0) {
/* 240 */                                                   i2++;
/* 242 */                                                   if (i2 == 1) {
/* 244 */                                                       o1ooOoI0000Il00O2 = o1ooOo4;
                                                            } else {
/* 246 */                                                       if (oi110o02 == null) {
/* 252 */                                                           oi110o02 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 255 */                                                       if (o1ooOoI0000Il00O2 != null) {
/* 257 */                                                           oi110o02.I00000oOI(o1ooOoI0000Il00O2);
/* 260 */                                                           o1ooOoI0000Il00O2 = null;
                                                                }
/* 261 */                                                       oi110o02.I00000oOI(o1ooOo4);
                                                            }
                                                        }
                                                    }
/* 267 */                                           if (i2 == 1) {
                                                    }
                                                }
/* 270 */                                       o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o02);
                                            }
                                        }
/* 275 */                               o1ooOo3 = o1ooOo3.I00ilI0I1;
                                    }
                                }
/* 278 */                       o0iiOioolIiI000O01llI02 = o0iiOioolIiI000O01llI02.I001IO000();
/* 293 */                       o1ooOo3 = (o0iiOioolIiI000O01llI02 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI02.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                            }
/* 295 */                   oi10iio = oi10iio2;
                        }
/* 296 */               int size = arrayList.size();
/* 301 */               for (int i3 = 0; i3 < size; i3++) {
/* 307 */                   IolI11 iolI11 = (IolI11) arrayList.get(i3);
/* 317 */                   if (!(oi10iio != null ? oi10iio.I0000Il00O(iolI11) : false)) {
/* 319 */                       iolI11.I00iIi0i1o();
                            }
                        }
                    }
                }

                public final void I00000oOI(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
                    int iI0000O;
/* 1 */             I0ll1oo i0ll1oo = this.I00ol1;
/* 10 */            if (O0000Ioio00.I0000O(str, i0ll1oo.I00oooO)) {
/* 14 */                int iI0000O2 = i0ll1oo.I00ooIo0.I0000O(i);
/* 18 */                if (iI0000O2 != -1) {
/* 24 */                    accessibilityNodeInfo.getExtras().putInt(str, iI0000O2);
/* 27 */                    return;
                        }
/* 98 */                return;
                    }
/* 34 */            if (!O0000Ioio00.I0000O(str, i0ll1oo.I0100i) || (iI0000O = i0ll1oo.I00ooiO1I.I0000O(i)) == -1) {
/* 98 */                return;
                    }
/* 48 */            accessibilityNodeInfo.getExtras().putInt(str, iI0000O);
                }

                public final OIlIooO I0000oI00(IlliIl1l11O illiIl1l11O, OIIl1io oIIl1io, Io10IOI io10IOI) {
                    OI110O0 oi110o0;
                    Reference referencePoll;
                    Object obj;
/* 1 */             if (io10IOI != null) {
/* 10 */                return new Io10OIiiOll(io10IOI, null, this, illiIl1l11O, oIIl1io);
                    }
/* 17 */            i000IO i000io = this.I01I0Iioooo0;
/* 36 */            do {
/* 21 */                ReferenceQueue referenceQueue = (ReferenceQueue) i000io.I00iiO;
/* 25 */                oi110o0 = (OI110O0) i000io.I00iiI;
/* 27 */                referencePoll = referenceQueue.poll();
/* 31 */                if (referencePoll != null) {
/* 33 */                    oi110o0.I000iOII(referencePoll);
                        }
/* 36 */            } while (referencePoll != null);
                    while (true) {
/* 38 */                int i = oi110o0.I00iiO;
/* 41 */                if (i == 0) {
/* 58 */                    obj = null;
                            break;
                        }
/* 51 */                obj = ((Reference) oi110o0.I000l1(i - 1)).get();
/* 55 */                if (obj != null) {
                            break;
                        }
                    }
/* 59 */            OIlIooO oIlIooO = (OIlIooO) obj;
/* 61 */            if (oIlIooO == null) {
/* 155 */               return new Io10OIiiOll(getGraphicsContext().I0000Il00O(), getGraphicsContext(), this, illiIl1l11O, oIIl1io);
                    }
/* 64 */            Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 66 */            Io10IIII io10IIII = io10OIiiOll.I00iiI;
/* 68 */            if (io10IIII == null) {
/* 137 */               throw IIlIOloOOO.I000OOo1O("currently reuse is only supported when we manage the layer lifecycle");
                    }
/* 74 */            if (!io10OIiiOll.I00iOIl.I0010o) {
/* 78 */                IolioOO1.I00000oIO("layer should have been released before reuse");
                    }
/* 85 */            io10OIiiOll.I00iOIl = io10IIII.I0000Il00O();
/* 88 */            io10OIiiOll.I00io1l = false;
/* 90 */            io10OIiiOll.I00iio = illiIl1l11O;
/* 92 */            io10OIiiOll.I00ilI0I1 = oIIl1io;
/* 94 */            io10OIiiOll.I00o101lO = false;
/* 96 */            io10OIiiOll.I00oI0i = false;
/* 99 */            io10OIiiOll.I00oII = true;
/* 103 */           O1i010l1l.I0000oI00(io10OIiiOll.I00ioIO);
/* 106 */           float[] fArr = io10OIiiOll.I00l0I0l0lO1;
/* 108 */           if (fArr != null) {
/* 110 */               O1i010l1l.I0000oI00(fArr);
                    }
/* 115 */           io10OIiiOll.I00o0iI0io1 = OoI0l01O.I00000oOI;
/* 117 */           io10OIiiOll.I00oIiI10 = false;
/* 124 */           io10OIiiOll.I00ilO0 = 9223372034707292159L;
/* 126 */           io10OIiiOll.I00o0l1o1o0 = null;
/* 128 */           io10OIiiOll.I00lll10 = 0;
/* 130 */           return oIlIooO;
                }

                public final void I000O01llI0(O0iiOioolIi o0iiOioolIi, boolean z) {
/* 3 */             this.I010l1ol111.I0001Ioi1lo(o0iiOioolIi, z);
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
                /* JADX WARN: Removed duplicated region for block: B:103:0x0147 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x015f A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:115:0x0171 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0174 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0183 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #2 {all -> 0x0078, blocks: (B:14:0x0036, B:16:0x0040, B:22:0x0050, B:38:0x007f, B:40:0x0083, B:41:0x0095, B:50:0x00a8, B:52:0x00ae, B:119:0x0183, B:120:0x018f, B:25:0x0058, B:31:0x0064, B:34:0x006c), top: B:146:0x0036 }] */
                /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x01a7 A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:121:0x0193, B:125:0x019f, B:127:0x01a7, B:129:0x01b1, B:128:0x01aa), top: B:144:0x0193 }] */
                /* JADX WARN: Removed duplicated region for block: B:128:0x01aa A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:121:0x0193, B:125:0x019f, B:127:0x01a7, B:129:0x01b1, B:128:0x01aa), top: B:144:0x0193 }] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00df A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00f0 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0110 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0122 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /* JADX WARN: Removed duplicated region for block: B:91:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x012c A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:54:0x00ba, B:56:0x00c1, B:64:0x00d2, B:69:0x00df, B:70:0x00e2, B:72:0x00e6, B:74:0x00ec, B:76:0x00f0, B:78:0x00f6, B:80:0x00fc, B:83:0x0104, B:84:0x0110, B:86:0x0116, B:88:0x011c, B:90:0x0122, B:92:0x0128, B:94:0x012c, B:95:0x0130, B:101:0x0143, B:103:0x0147, B:105:0x014e, B:112:0x015f, B:113:0x0169, B:115:0x0171, B:116:0x0174, B:117:0x017b), top: B:148:0x001c }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000OOo1O(MotionEvent motionEvent) throws Throwable {
                    int actionMasked;
                    MotionEvent motionEvent2;
                    I0lio1O01i01 i0lio1O01i01;
                    int i;
                    boolean z;
                    MotionEvent motionEvent3;
                    int iI00IO1oi11O;
                    Io1ioiI1 io1ioiI1;
                    I0lio1O01i01 i0lio1O01i012;
                    int pointerId;
                    boolean z2;
                    Io1ioiI1 io1ioiI12;
/* 1 */             I0lio1O01i01 i0lio1O01i013 = this;
/* 5 */             OI01OO oi01oo = i0lio1O01i013.I0100i;
/* 7 */             IOI0oloi01 iOI0oloi01 = i0lio1O01i013.I0100o111I;
/* 11 */            i0lio1O01i013.removeCallbacks(i0lio1O01i013.I01IiOO);
                    try {
/* 15 */                I001lllioOl(motionEvent);
/* 19 */                i0lio1O01i013.I0111i = true;
/* 21 */                i0lio1O01i013.I0010I0i(false);
/* 26 */                Trace.beginSection("AndroidOwner:onTouch");
                        try {
/* 29 */                    int actionMasked2 = motionEvent.getActionMasked();
/* 33 */                    MotionEvent motionEvent4 = i0lio1O01i013.I011olOoO;
/* 46 */                    boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
/* 53 */                    if (motionEvent4 != null) {
                                try {
/* 79 */                            if ((motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
/* 85 */                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
/* 87 */                                    motionEvent2 = motionEvent4;
/* 130 */                                   if (!iOI0oloi01.I00000oIO) {
/* 140 */                                       ((O1IOillioo0I) ((Oi0Oooi) iOI0oloi01.I0000O).I00iiI).I00000oIO();
/* 147 */                                       ((Io1ioiI1) iOI0oloi01.I0000Il00O).I0000Il00O();
                                            }
                                        } else if (motionEvent4.getActionMasked() != 10 && z3) {
/* 116 */                                   i0lio1O01i013.I00IOO(motionEvent4, 10, motionEvent4.getEventTime(), true);
/* 119 */                                   motionEvent2 = motionEvent4;
                                        }
/* 158 */                               if (motionEvent.getToolType(0) != 3) {
                                        }
/* 161 */                               if (z3) {
/* 191 */                                   i0lio1O01i01 = this;
/* 193 */                                   i = 9;
/* 221 */                                   if (actionMasked2 == 8) {
/* 222 */                                       if (motionEvent2 != null) {
                                                }
/* 227 */                                       motionEvent3 = i0lio1O01i01.I011olOoO;
/* 229 */                                       if (motionEvent3 != null) {
/* 237 */                                           MotionEvent motionEvent5 = i0lio1O01i01.I011olOoO;
/* 246 */                                           if (motionEvent5 == null) {
                                                    }
/* 251 */                                           if (motionEvent.getAction() == i) {
/* 277 */                                               if (motionEvent.getAction() == 0) {
/* 285 */                                                   MotionEvent motionEvent6 = i0lio1O01i01.I011olOoO;
/* 296 */                                                   if (motionEvent6 == null) {
                                                            }
/* 297 */                                                   MotionEvent motionEvent7 = i0lio1O01i01.I011olOoO;
                                                            if (motionEvent7 != null) {
                                                            }
/* 323 */                                                   if (x == motionEvent.getX()) {
/* 324 */                                                       MotionEvent motionEvent8 = i0lio1O01i01.I011olOoO;
/* 345 */                                                       if ((motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime()) {
                                                                }
/* 346 */                                                       if (!z2) {
/* 350 */                                                           if (pointerId >= 0) {
                                                                    }
/* 364 */                                                           io1ioiI12 = (Io1ioiI1) iOI0oloi01.I0000Il00O;
/* 368 */                                                           if (io1ioiI12.I0000O) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
/* 384 */                                       i0lio1O01i01.I011olOoO = MotionEvent.obtainNoHistory(motionEvent);
/* 386 */                                       if (z) {
                                                }
/* 400 */                                       iI00IO1oi11O = I00IO1oi11O(motionEvent);
/* 404 */                                       Trace.endSection();
/* 409 */                                       if ((iI00IO1oi11O & 4) == 0) {
/* 418 */                                           io1ioiI1 = (Io1ioiI1) iOI0oloi01.I0000Il00O;
/* 422 */                                           if (io1ioiI1.I0000O) {
                                                    }
/* 441 */                                           i0lio1O01i012 = this;
/* 445 */                                           i0lio1O01i012.I00IOO(motionEvent, 9, motionEvent.getEventTime(), true);
                                                }
/* 455 */                                       i0lio1O01i012.I0111i = false;
/* 457 */                                       return iI00IO1oi11O;
                                            }
                                        }
                                    } else {
/* 126 */                               motionEvent2 = motionEvent4;
/* 158 */                               boolean z4 = motionEvent.getToolType(0) != 3;
/* 161 */                               if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && I000o00OoI0I(motionEvent)) {
/* 184 */                                   i = 9;
/* 185 */                                   i0lio1O01i01 = this;
/* 187 */                                   i0lio1O01i01.I00IOO(motionEvent, 9, motionEvent.getEventTime(), true);
                                        } else {
/* 191 */                                   i0lio1O01i01 = this;
/* 193 */                                   i = 9;
                                        }
/* 221 */                               z = (actionMasked2 == 8 || (motionEvent.getButtonState() == 0) || motionEvent2 == null || motionEvent2.isFromSource(4098)) ? false : true;
/* 222 */                               if (motionEvent2 != null) {
/* 224 */                                   motionEvent2.recycle();
                                        }
/* 227 */                               motionEvent3 = i0lio1O01i01.I011olOoO;
/* 229 */                               if (motionEvent3 != null && motionEvent3.getAction() == 10) {
/* 237 */                                   MotionEvent motionEvent52 = i0lio1O01i01.I011olOoO;
/* 246 */                                   pointerId = motionEvent52 == null ? motionEvent52.getPointerId(0) : -1;
/* 251 */                                   if (motionEvent.getAction() == i || motionEvent.getHistorySize() != 0) {
/* 277 */                                       if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
/* 285 */                                           MotionEvent motionEvent62 = i0lio1O01i01.I011olOoO;
/* 296 */                                           float x = motionEvent62 == null ? motionEvent62.getX() : Float.NaN;
/* 297 */                                           MotionEvent motionEvent72 = i0lio1O01i01.I011olOoO;
/* 323 */                                           z2 = x == motionEvent.getX() || (motionEvent72 != null ? motionEvent72.getY() : Float.NaN) != motionEvent.getY();
/* 324 */                                           MotionEvent motionEvent82 = i0lio1O01i01.I011olOoO;
/* 345 */                                           boolean z5 = (motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime();
/* 346 */                                           if (!z2 || z5) {
/* 350 */                                               if (pointerId >= 0) {
/* 354 */                                                   oi01oo.I0000Il00O.delete(pointerId);
/* 359 */                                                   oi01oo.I00000oOI.delete(pointerId);
                                                        }
/* 364 */                                               io1ioiI12 = (Io1ioiI1) iOI0oloi01.I0000Il00O;
/* 368 */                                               if (io1ioiI12.I0000O) {
/* 377 */                                                   io1ioiI12.I000II.I00000oIO.I000II();
                                                        } else {
/* 370 */                                                   io1ioiI12.I0000O = true;
                                                        }
                                                    }
                                                }
                                            } else if (pointerId >= 0) {
/* 263 */                                       oi01oo.I0000Il00O.delete(pointerId);
/* 268 */                                       oi01oo.I00000oOI.delete(pointerId);
                                            }
                                        }
/* 384 */                               i0lio1O01i01.I011olOoO = MotionEvent.obtainNoHistory(motionEvent);
/* 386 */                               if (z) {
/* 397 */                                   i0lio1O01i01.I00IOO(motionEvent, 10, motionEvent.getEventTime(), true);
                                        }
/* 400 */                               iI00IO1oi11O = I00IO1oi11O(motionEvent);
                                        try {
/* 404 */                                   Trace.endSection();
/* 409 */                                   if ((iI00IO1oi11O & 4) == 0 && z) {
/* 418 */                                       io1ioiI1 = (Io1ioiI1) iOI0oloi01.I0000Il00O;
/* 422 */                                       if (io1ioiI1.I0000O) {
/* 431 */                                           io1ioiI1.I000II.I00000oIO.I000II();
                                                } else {
/* 424 */                                           io1ioiI1.I0000O = true;
                                                }
/* 441 */                                       i0lio1O01i012 = this;
/* 445 */                                       i0lio1O01i012.I00IOO(motionEvent, 9, motionEvent.getEventTime(), true);
                                            } else {
/* 411 */                                       i0lio1O01i012 = this;
                                            }
/* 455 */                                   i0lio1O01i012.I0111i = false;
/* 457 */                                   return iI00IO1oi11O;
                                        } catch (Throwable th) {
/* 451 */                                   th = th;
/* 452 */                                   i0lio1O01i013 = this;
                                        }
                                    }
                                } catch (Throwable th2) {
/* 121 */                           th = th2;
/* 458 */                           Trace.endSection();
/* 461 */                           throw th;
                                }
                            }
                        } catch (Throwable th3) {
/* 48 */                    th = th3;
                        }
                    } catch (Throwable th4) {
/* 449 */               th = th4;
                    }
/* 462 */           i0lio1O01i013.I0111i = false;
/* 1261 */          throw th;
                }

                public final void I000iOII(O0iiOioolIi o0iiOioolIi) {
/* 4 */             this.I010l1ol111.I0010I0i(o0iiOioolIi, false);
/* 7 */             OI110O0 oi110o0I001lIiIIo1O = o0iiOioolIi.I001lIiIIo1O();
/* 11 */            Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 13 */            int i = oi110o0I001lIiIIo1O.I00iiO;
/* 15 */            for (int i2 = 0; i2 < i; i2++) {
/* 21 */                I000iOII((O0iiOioolIi) objArr[i2]);
                    }
                }

                public final boolean I000o00OoI0I(MotionEvent motionEvent) {
/* 1 */             float x = motionEvent.getX();
/* 5 */             float y = motionEvent.getY();
                    return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
                }

                public final boolean I000oI1ioi(MotionEvent motionEvent) {
                    MotionEvent motionEvent2;
                    return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.I011olOoO) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
                }

                public final void I00100l0(float[] fArr) {
/* 5 */             I001lIiIIo1O();
/* 10 */            O1i010l1l.I000II(fArr, this.I01101olii);
/* 19 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.I011IO1I11OI >> 32));
/* 32 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.I011IO1I11OI & 4294967295L));
/* 36 */            float[] fArr2 = this.I010oio1OO0;
/* 38 */            O1i010l1l.I0000oI00(fArr2);
/* 41 */            O1i010l1l.I000O01llI0(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
/* 45 */            float fI00000oOI = I0lllI01iooo.I00000oOI(fArr2, 0, fArr, 0);
/* 50 */            float fI00000oOI2 = I0lllI01iooo.I00000oOI(fArr2, 0, fArr, 1);
/* 55 */            float fI00000oOI3 = I0lllI01iooo.I00000oOI(fArr2, 0, fArr, 2);
/* 60 */            float fI00000oOI4 = I0lllI01iooo.I00000oOI(fArr2, 0, fArr, 3);
/* 64 */            float fI00000oOI5 = I0lllI01iooo.I00000oOI(fArr2, 1, fArr, 0);
/* 68 */            float fI00000oOI6 = I0lllI01iooo.I00000oOI(fArr2, 1, fArr, 1);
/* 72 */            float fI00000oOI7 = I0lllI01iooo.I00000oOI(fArr2, 1, fArr, 2);
/* 76 */            float fI00000oOI8 = I0lllI01iooo.I00000oOI(fArr2, 1, fArr, 3);
/* 80 */            float fI00000oOI9 = I0lllI01iooo.I00000oOI(fArr2, 2, fArr, 0);
/* 84 */            float fI00000oOI10 = I0lllI01iooo.I00000oOI(fArr2, 2, fArr, 1);
/* 88 */            float fI00000oOI11 = I0lllI01iooo.I00000oOI(fArr2, 2, fArr, 2);
/* 92 */            float fI00000oOI12 = I0lllI01iooo.I00000oOI(fArr2, 2, fArr, 3);
/* 96 */            float fI00000oOI13 = I0lllI01iooo.I00000oOI(fArr2, 3, fArr, 0);
/* 100 */           float fI00000oOI14 = I0lllI01iooo.I00000oOI(fArr2, 3, fArr, 1);
/* 104 */           float fI00000oOI15 = I0lllI01iooo.I00000oOI(fArr2, 3, fArr, 2);
/* 108 */           float fI00000oOI16 = I0lllI01iooo.I00000oOI(fArr2, 3, fArr, 3);
/* 112 */           fArr[0] = fI00000oOI;
/* 114 */           fArr[1] = fI00000oOI2;
/* 116 */           fArr[2] = fI00000oOI3;
/* 118 */           fArr[3] = fI00000oOI4;
/* 121 */           fArr[4] = fI00000oOI5;
/* 124 */           fArr[5] = fI00000oOI6;
/* 127 */           fArr[6] = fI00000oOI7;
/* 130 */           fArr[7] = fI00000oOI8;
/* 134 */           fArr[8] = fI00000oOI9;
/* 138 */           fArr[9] = fI00000oOI10;
/* 142 */           fArr[10] = fI00000oOI11;
/* 146 */           fArr[11] = fI00000oOI12;
/* 150 */           fArr[12] = fI00000oOI13;
/* 154 */           fArr[13] = fI00000oOI14;
/* 158 */           fArr[14] = fI00000oOI15;
/* 162 */           fArr[15] = fI00000oOI16;
                }

                public final long I00100o1O0lo(long j) {
/* 1 */             I001lIiIIo1O();
/* 6 */             long jI0000Il00O = O1i010l1l.I0000Il00O(j, this.I01101olii);
/* 27 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.I011IO1I11OI >> 32)) + Float.intBitsToFloat((int) (jI0000Il00O >> 32));
/* 47 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.I011IO1I11OI & 4294967295L)) + Float.intBitsToFloat((int) (jI0000Il00O & 4294967295L));
/* 62 */            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                }

                public final void I0010I0i(boolean z) {
/* 1 */             O1iO111i o1iO111i = this.I010l1ol111;
/* 9 */             if (o1iO111i.I00000oOI.I001lllioOl() || ((OI110O0) o1iO111i.I0000oI00.I00iiI).I00iiO != 0) {
/* 25 */                Trace.beginSection("AndroidOwner:measureAndLayout");
                        try {
/* 39 */                    if (o1iO111i.I000iOII(z ? this.I01Io000 : this.I01Io001O)) {
/* 41 */                        requestLayout();
                            }
/* 45 */                    o1iO111i.I00000oIO(false);
/* 52 */                    getRectManager().I00000oIO();
/* 57 */                    if (this.I00oooO) {
/* 63 */                        getViewTreeObserver().dispatchOnGlobalLayout();
/* 66 */                        this.I00oooO = false;
                            }
                        } finally {
/* 73 */                    Trace.endSection();
                        }
                    }
                }

                public final void I0010o(O0iiOioolIi o0iiOioolIi, long j) {
/* 1 */             O1iO111i o1iO111i = this.I010l1ol111;
/* 5 */             Trace.beginSection("AndroidOwner:measureAndLayout");
                    try {
/* 8 */                 o1iO111i.I000l1(o0iiOioolIi, j);
/* 17 */                if (!o1iO111i.I00000oOI.I001lllioOl()) {
/* 20 */                    o1iO111i.I00000oIO(false);
/* 27 */                    getRectManager().I00000oIO();
/* 32 */                    this.I01Io001O.invoke();
/* 37 */                    if (this.I00oooO) {
/* 43 */                        getViewTreeObserver().dispatchOnGlobalLayout();
/* 46 */                        this.I00oooO = false;
                            }
                        }
                    } finally {
/* 53 */                Trace.endSection();
                    }
                }

                public final boolean I00111O(int i) {
/* 3 */             if (i != 7 && i != 8) {
/* 11 */                Integer numI0000Il00O = Ili11o0l.I0000Il00O(i);
/* 17 */                if (numI0000Il00O == null) {
/* 168 */                   throw IIlIOloOOO.I000OOo1O("Invalid focus direction");
                        }
/* 19 */                int iIntValue = numI0000Il00O.intValue();
/* 29 */                IliIO10oO0 iliIO10oO0I000II = ((Ili1ioOlo0oO) getFocusOwner()).I000II();
/* 33 */                if (iliIO10oO0I000II == null) {
/* 110 */                   I000II.I001IO000("findNextViewInEmbeddedView called when owner does not have anything focused.");
/* 2 */                     return false;
                        }
/* 35 */                Integer numI0000Il00O2 = Ili11o0l.I0000Il00O(i);
/* 39 */                if (numI0000Il00O2 == null) {
/* 107 */                   throw IIlIOloOOO.I000OOo1O("Invalid focus direction");
                        }
/* 41 */                int iIntValue2 = numI0000Il00O2.intValue();
/* 49 */                Oooio0iiI0 oooio0iiI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I000II).I00o0l1o1o0;
/* 59 */                View interopView = oooio0iiI0 != null ? oooio0iiI0.getInteropView() : null;
/* 74 */                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), iIntValue2);
/* 78 */                if (viewFindNextFocus == null || interopView == null || !I0lllI01iooo.I00000oIO(interopView, viewFindNextFocus)) {
/* 90 */                    viewFindNextFocus = null;
                        }
/* 91 */                if (viewFindNextFocus != null) {
/* 97 */                    return Ili11o0l.I00000oOI(viewFindNextFocus, Integer.valueOf(iIntValue), null);
                        }
                    }
/* 2 */             return false;
                }

                public final void I001IIilI0O() {
                    OI0oiiIO0 oI0oiiIO0;
                    Object[] objArr;
/* 5 */             if (this.I010i10l) {
/* 11 */                Ol1olI0o1I01 ol1olI0o1I01 = getSnapshotObserver().I00000oIO;
/* 17 */                OI1lOo oI1lOo = new OI1lOo(20);
                        synchronized (ol1olI0o1I01.I000II) {
                            try {
/* 23 */                        OI110O0 oi110o0 = ol1olI0o1I01.I0001Ioi1lo;
/* 25 */                        int i = oi110o0.I00iiO;
/* 27 */                        int i2 = 0;
/* 28 */                        int i3 = 0;
                                while (true) {
/* 29 */                            objArr = oi110o0.I00iOIl;
/* 31 */                            if (i2 >= i) {
                                        break;
                                    }
/* 35 */                            Ol1oi0lO0I ol1oi0lO0I = (Ol1oi0lO0I) objArr[i2];
/* 37 */                            ol1oi0lO0I.I0000O(oI1lOo);
/* 46 */                            if (!ol1oi0lO0I.I0001Ioi1lo.I000OiO()) {
/* 48 */                                i3++;
                                    } else if (i3 > 0) {
/* 53 */                                Object[] objArr2 = oi110o0.I00iOIl;
/* 59 */                                objArr2[i2 - i3] = objArr2[i2];
                                    }
/* 64 */                            i2++;
                                }
/* 67 */                        int i4 = i - i3;
/* 69 */                        Arrays.fill(objArr, i4, i, (Object) null);
/* 72 */                        oi110o0.I00iiO = i4;
                            } catch (Throwable th) {
/* 79 */                        throw th;
                            }
                        }
/* 75 */                this.I010i10l = false;
                    }
/* 80 */            I10OIIo i10OIIo = this.I010ioo;
/* 82 */            if (i10OIIo != null) {
/* 84 */                I0000Il00O(i10OIIo);
                    }
/* 87 */            I0lII0loi i0lII0loiM26getAutofillManager = m26getAutofillManager();
/* 91 */            if (i0lII0loiM26getAutofillManager != null) {
/* 93 */                OI0lOIOi1l oI0lOIOi1l = i0lII0loiM26getAutofillManager.I00ioIO;
/* 97 */                if (oI0lOIOi1l.I0000O == 0 && i0lII0loiM26getAutofillManager.I00l0I0l0lO1) {
/* 109 */                   i0lII0loiM26getAutofillManager.I00iOIl.I00oIiI10().commit();
/* 112 */                   i0lII0loiM26getAutofillManager.I00l0I0l0lO1 = false;
                        }
/* 116 */               if (oI0lOIOi1l.I0000O != 0) {
/* 119 */                   i0lII0loiM26getAutofillManager.I00l0I0l0lO1 = true;
                        }
                    }
/* 127 */           while (this.I01I1Oo0oll.I000OiO() && this.I01I1Oo0oll.I000II(0) != null) {
/* 139 */               int i5 = this.I01I1Oo0oll.I00000oOI;
/* 141 */               int i6 = 0;
                        while (true) {
/* 142 */                   oI0oiiIO0 = this.I01I1Oo0oll;
/* 144 */                   if (i6 < i5) {
/* 150 */                       IllOOo00lI illOOo00lI = (IllOOo00lI) oI0oiiIO0.I000II(i6);
/* 154 */                       this.I01I1Oo0oll.I000oI1ioi(i6, null);
/* 157 */                       if (illOOo00lI != null) {
/* 159 */                           illOOo00lI.invoke();
                                }
/* 162 */                       i6++;
                            }
                        }
/* 165 */               oI0oiiIO0.I000lI(0, i5);
                    }
                }

                public final void I001IO000(O0iiOioolIi o0iiOioolIi) {
/* 1 */             I0ll1oo i0ll1oo = this.I00ol1;
/* 4 */             i0ll1oo.I00olI = true;
/* 10 */            if (i0ll1oo.I00100o1O0lo()) {
/* 13 */                i0ll1oo.I0010I0i(o0iiOioolIi);
                    }
/* 16 */            I0lo1oIo i0lo1oIo = this.I00olI;
/* 18 */            i0lo1oIo.I00io1l = true;
/* 24 */            if (i0lo1oIo.I0000O()) {
/* 30 */                i0lo1oIo.I00ioIO.I000lI(OoiIlOl1iI.I00000oIO);
                    }
                }

                public final void I001i1O0Ol(O0iiOioolIi o0iiOioolIi, boolean z, boolean z2, boolean z3) {
                    O0iiOioolIi o0iiOioolIiI001IO000;
                    O0iiOioolIi o0iiOioolIiI001IO0002;
/* 1 */             O1iO111i o1iO111i = this.I010l1ol111;
/* 3 */             if (!z) {
/* 153 */               if (o1iO111i.I0010I0i(o0iiOioolIi, z2) && z3) {
/* 157 */                   I00II0oii1o(o0iiOioolIi);
/* 204 */                   return;
                        }
/* 204 */               return;
                    }
/* 5 */             IOO000ilo iOO000ilo = o1iO111i.I00000oOI;
/* 7 */             O0iiOioolIi o0iiOioolIi2 = o0iiOioolIi.I00l0I0l0lO1;
/* 9 */             O0iioO o0iioO = o0iiOioolIi.I010I0;
/* 11 */            if (o0iiOioolIi2 == null) {
/* 16 */                IolioOO1.I0000Il00O("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
                    }
/* 21 */            int iOrdinal = o0iioO.I0000O.ordinal();
/* 26 */            if (iOrdinal != 0) {
/* 28 */                if (iOrdinal == 1) {
/* 204 */                   return;
                        }
/* 31 */                if (iOrdinal != 2 && iOrdinal != 3) {
/* 37 */                    if (iOrdinal != 4) {
/* 134 */                       I000II.I00000oIO();
/* 137 */                       return;
                            }
/* 41 */                    if (!o0iioO.I0000oI00 || z2) {
/* 47 */                        o0iioO.I0000oI00 = true;
/* 51 */                        o0iioO.I00100l0.I00oOio10iI1 = true;
/* 55 */                        if (o0iiOioolIi.I010o0o0oO) {
/* 204 */                           return;
                                }
/* 68 */                        if ((O0000Ioio00.I0000O(o0iiOioolIi.I00IoIO0lI(), Boolean.TRUE) || O1iO111i.I000O01llI0(o0iiOioolIi)) && ((o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000()) == null || !o0iiOioolIiI001IO000.I010I0.I0000oI00)) {
/* 121 */                           iOO000ilo.I00000oIO(o0iiOioolIi, O001OIili.I00iOIl);
                                } else if ((o0iiOioolIi.I00Io1o110i() || O1iO111i.I000OOo1O(o0iiOioolIi)) && ((o0iiOioolIiI001IO0002 = o0iiOioolIi.I001IO000()) == null || !o0iiOioolIiI001IO0002.I00100o1O0lo())) {
/* 115 */                           iOO000ilo.I00000oIO(o0iiOioolIi, O001OIili.I00iiO);
                                }
/* 126 */                       if (o1iO111i.I0000O || !z3) {
/* 204 */                           return;
                                }
/* 130 */                       I00II0oii1o(o0iiOioolIi);
/* 133 */                       return;
                            }
/* 204 */                   return;
                        }
                    }
/* 145 */           o1iO111i.I000O01llI0.I00000oOI(new O1iIoll1(o0iiOioolIi, true, z2));
                }

                public final void I001i1lo1io(O0iiOioolIi o0iiOioolIi, boolean z, boolean z2) {
/* 1 */             O0iioO o0iioO = o0iiOioolIi.I010I0;
/* 3 */             O1iO111i o1iO111i = this.I010l1ol111;
/* 10 */            if (!z) {
/* 140 */               o1iO111i.getClass();
/* 145 */               int iOrdinal = o0iioO.I0000O.ordinal();
/* 149 */               if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
/* 408 */                   return;
                        }
/* 157 */               if (iOrdinal != 4) {
/* 256 */                   I000II.I00000oIO();
/* 408 */                   return;
                        }
/* 159 */               O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 174 */               boolean z3 = o0iiOioolIiI001IO000 == null || o0iiOioolIiI001IO000.I00Io1o110i();
/* 175 */               if (!z2) {
/* 181 */                   if (o0iiOioolIi.I00100o1O0lo()) {
/* 408 */                       return;
                            }
/* 187 */                   if (o0iiOioolIi.I00100l0() && o0iiOioolIi.I00Io1o110i() == z3 && o0iiOioolIi.I00Io1o110i() == o0iioO.I00100l0.I00oO101o) {
/* 408 */                       return;
                            }
                        }
/* 206 */               O1iO1i o1iO1i = o0iioO.I00100l0;
/* 208 */               o1iO1i.I00ol1 = true;
/* 210 */               o1iO1i.I00olI = true;
/* 214 */               if (!o0iiOioolIi.I010o0o0oO && o1iO1i.I00oO101o && z3) {
/* 223 */                   if ((o0iiOioolIiI001IO000 == null || !o0iiOioolIiI001IO000.I00100l0()) && (o0iiOioolIiI001IO000 == null || !o0iiOioolIiI001IO000.I00100o1O0lo())) {
/* 245 */                       o1iO111i.I00000oOI.I00000oIO(o0iiOioolIi, O001OIili.I00iio);
                            }
/* 250 */                   if (o1iO111i.I0000O) {
/* 408 */                       return;
                            }
/* 252 */                   I00II0oii1o(null);
/* 255 */                   return;
                        }
/* 408 */               return;
                    }
/* 12 */            IOO000ilo iOO000ilo = o1iO111i.I00000oOI;
/* 16 */            int iOrdinal2 = o0iioO.I0000O.ordinal();
/* 20 */            if (iOrdinal2 != 0) {
/* 22 */                if (iOrdinal2 == 1) {
/* 408 */                   return;
                        }
/* 24 */                if (iOrdinal2 != 2) {
/* 26 */                    if (iOrdinal2 == 3) {
/* 408 */                       return;
                            }
/* 28 */                    if (iOrdinal2 != 4) {
/* 31 */                        I000II.I00000oIO();
/* 34 */                        return;
                            }
                        }
                    }
/* 37 */            if ((o0iioO.I0000oI00 || o0iioO.I0001Ioi1lo) && !z2) {
/* 408 */               return;
                    }
/* 47 */            o0iioO.I0001Ioi1lo = true;
/* 49 */            o0iioO.I000II = true;
/* 51 */            O1iO1i o1iO1i2 = o0iioO.I00100l0;
/* 53 */            o1iO1i2.I00ol1 = true;
/* 55 */            o1iO1i2.I00olI = true;
/* 59 */            if (o0iiOioolIi.I010o0o0oO) {
/* 408 */               return;
                    }
/* 63 */            O0iiOioolIi o0iiOioolIiI001IO0002 = o0iiOioolIi.I001IO000();
/* 77 */            if (O0000Ioio00.I0000O(o0iiOioolIi.I00IoIO0lI(), Boolean.TRUE) && ((o0iiOioolIiI001IO0002 == null || !o0iiOioolIiI001IO0002.I010I0.I0000oI00) && (o0iiOioolIiI001IO0002 == null || !o0iiOioolIiI001IO0002.I010I0.I0001Ioi1lo))) {
/* 99 */                iOO000ilo.I00000oIO(o0iiOioolIi, O001OIili.I00iiI);
                    } else if (o0iiOioolIi.I00Io1o110i() && ((o0iiOioolIiI001IO0002 == null || !o0iiOioolIiI001IO0002.I00100l0()) && (o0iiOioolIiI001IO0002 == null || !o0iiOioolIiI001IO0002.I00100o1O0lo()))) {
/* 129 */               iOO000ilo.I00000oIO(o0iiOioolIi, O001OIili.I00iio);
                    }
/* 134 */           if (o1iO111i.I0000O) {
/* 408 */               return;
                    }
/* 136 */           I00II0oii1o(null);
                }

                public final void I001iOo1i0O() {
/* 1 */             I0ll1oo i0ll1oo = this.I00ol1;
/* 4 */             i0ll1oo.I00olI = true;
/* 8 */             Handler handler = i0ll1oo.I00iio.getHandler();
/* 16 */            if (i0ll1oo.I00100o1O0lo() && !i0ll1oo.I010II && handler != null) {
/* 24 */                i0ll1oo.I010II = true;
/* 28 */                handler.post(i0ll1oo.I010i10l);
                    }
/* 31 */            I0lo1oIo i0lo1oIo = this.I00olI;
/* 33 */            i0lo1oIo.I00io1l = true;
/* 37 */            Handler handler2 = i0lo1oIo.I00iOIl.getHandler();
/* 45 */            if (!i0lo1oIo.I0000O() || i0lo1oIo.I00lli11 || handler2 == null) {
/* 110 */               return;
                    }
/* 53 */            i0lo1oIo.I00lli11 = true;
/* 57 */            handler2.post(i0lo1oIo.I00lll10);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001l0I00(ViewStructure viewStructure) {
/* 1 */             I0lII0loi i0lII0loiM26getAutofillManager = m26getAutofillManager();
/* 5 */             if (i0lII0loiM26getAutofillManager != null) {
/* 9 */                 O0iiOioolIi o0iiOioolIi = i0lII0loiM26getAutofillManager.I00iiI.I00000oIO;
/* 11 */                AutofillId autofillId = i0lII0loiM26getAutofillManager.I00io1l;
/* 13 */                String str = i0lII0loiM26getAutofillManager.I00ilI0I1;
/* 15 */                OOo0Olol0o oOo0Olol0o = i0lII0loiM26getAutofillManager.I00iio;
/* 17 */                lI1oIi0I.I00000oIO(viewStructure, o0iiOioolIi, autofillId, str, oOo0Olol0o);
/* 20 */                Object[] objArr = OIOi1o0101.I00000oIO;
/* 25 */                OI0oiiIO0 oI0oiiIO0 = new OI0oiiIO0(2);
/* 28 */                oI0oiiIO0.I00000oOI(o0iiOioolIi);
/* 31 */                oI0oiiIO0.I00000oOI(viewStructure);
/* 38 */                while (oI0oiiIO0.I000OiO()) {
/* 48 */                    ViewStructure viewStructure2 = (ViewStructure) oI0oiiIO0.I000l1(oI0oiiIO0.I00000oOI - 1);
/* 59 */                    List listI000o00OoI0I = ((O0iiOioolIi) oI0oiiIO0.I000l1(oI0oiiIO0.I00000oOI - 1)).I000o00OoI0I();
/* 63 */                    int size = listI000o00OoI0I.size();
/* 68 */                    for (int i = 0; i < size; i++) {
/* 77 */                        O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) ((OI0oIOI) listI000o00OoI0I).get(i);
/* 81 */                        if (!o0iiOioolIi2.I010o0o0oO && o0iiOioolIi2.I00Io1lO() && o0iiOioolIi2.I00Io1o110i()) {
/* 96 */                            OiioiIIlooo oiioiIIloooI001i1lo1io = o0iiOioolIi2.I001i1lo1io();
/* 100 */                           if (oiioiIIloooI001i1lo1io != null) {
/* 102 */                               OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIloooI001i1lo1io.I00iOIl;
/* 110 */                               if (oI10I1IoI0Ol.I00000oOI(Oiioi1IoIIli.I000II) || oI10I1IoI0Ol.I00000oOI(Oiioi1IoIIli.I000O01llI0) || oI10I1IoI0Ol.I00000oOI(Oil0I1O.I0010I0i) || oI10I1IoI0Ol.I00000oOI(Oil0I1O.I0010o) || oI10I1IoI0Ol.I00000oOI(iO0o0l0oOo0.I0000Il00O)) {
/* 148 */                                   ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
/* 152 */                                   lI1oIi0I.I00000oIO(viewStructureNewChild, o0iiOioolIi2, autofillId, str, oOo0Olol0o);
/* 155 */                                   oI0oiiIO0.I00000oOI(o0iiOioolIi2);
/* 158 */                                   oI0oiiIO0.I00000oOI(viewStructureNewChild);
                                        } else {
/* 162 */                                   oI0oiiIO0.I00000oOI(o0iiOioolIi2);
/* 165 */                                   oI0oiiIO0.I00000oOI(viewStructure2);
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 171 */           I0lI1I10iIII i0lI1I10iIIIM25getAutofill = m25getAutofill();
/* 175 */           if (i0lI1I10iIIIM25getAutofill != null) {
/* 177 */               I1lOlO0ioIl0 i1lOlO0ioIl0 = i0lI1I10iIIIM25getAutofill.I00000oOI;
/* 179 */               LinkedHashMap linkedHashMap = i1lOlO0ioIl0.I00000oIO;
/* 181 */               LinkedHashMap linkedHashMap2 = i1lOlO0ioIl0.I00000oIO;
/* 187 */               if (linkedHashMap.isEmpty()) {
/* 437 */                   return;
                        }
/* 194 */               int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
/* 202 */               Iterator it = linkedHashMap2.entrySet().iterator();
/* 210 */               if (it.hasNext()) {
/* 217 */                   Map.Entry entry = (Map.Entry) it.next();
/* 225 */                   int iIntValue = ((Number) entry.getKey()).intValue();
/* 233 */                   if (entry.getValue() != null) {
/* 235 */                       OIiilo1Ool0o.I00000oIO();
/* 238 */                       return;
                            }
/* 239 */                   ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
/* 245 */                   viewStructureNewChild2.setAutofillId(i0lI1I10iIIIM25getAutofill.I0000Il00O, iIntValue);
/* 259 */                   viewStructureNewChild2.setId(iIntValue, i0lI1I10iIIIM25getAutofill.I00000oIO.getContext().getPackageName(), null, null);
/* 264 */                   IOoIooII0o.I00000oIO.getClass();
/* 271 */                   viewStructureNewChild2.setAutofillType(IOoIioO.I0000Il00O.I00000oOI);
/* 274 */                   throw null;
                        }
                    }
                }

                public final void I001lIiIIo1O() {
/* 1 */             int[] iArr = this.I010o0o0oO;
/* 5 */             if (this.I0111i) {
/* 110 */               return;
                    }
/* 7 */             long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
/* 15 */            if (jCurrentAnimationTimeMillis != this.I0110o) {
/* 17 */                this.I0110o = jCurrentAnimationTimeMillis;
/* 19 */                float[] fArr = this.I01101olii;
/* 25 */                IIi1oollolII.I00000oIO.I00000oIO(this, fArr, this.I01101IOlO, iArr);
/* 30 */                l00lO1OO0OI.I00000oIO(fArr, this.I0110OiO);
/* 33 */                ViewParent parent = getParent();
/* 37 */                View view = this;
/* 40 */                while (parent instanceof ViewGroup) {
/* 43 */                    view = (View) parent;
/* 48 */                    parent = ((ViewGroup) view).getParent();
                        }
/* 53 */                view.getLocationOnScreen(iArr);
/* 57 */                float f = iArr[0];
/* 61 */                float f2 = iArr[1];
/* 64 */                view.getLocationInWindow(iArr);
/* 67 */                float f3 = iArr[0];
/* 74 */                float f4 = f2 - iArr[1];
/* 95 */                this.I011IO1I11OI = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                    }
                }

                public final void I001lllioOl(MotionEvent motionEvent) {
/* 5 */             this.I0110o = AnimationUtils.currentAnimationTimeMillis();
/* 7 */             float[] fArr = this.I01101olii;
/* 15 */            IIi1oollolII.I00000oIO.I00000oIO(this, fArr, this.I01101IOlO, this.I010o0o0oO);
/* 20 */            l00lO1OO0OI.I00000oIO(fArr, this.I0110OiO);
/* 23 */            float x = motionEvent.getX();
/* 27 */            float y = motionEvent.getY();
/* 51 */            long jI0000Il00O = O1i010l1l.I0000Il00O((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), fArr);
/* 66 */            float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jI0000Il00O >> 32));
/* 77 */            float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jI0000Il00O & 4294967295L));
/* 91 */            this.I011IO1I11OI = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
                }

                public final boolean I001lloI() {
/* 5 */             if (isFocused()) {
/* 7 */                 return true;
                    }
/* 12 */            return super.requestFocus(130, null);
                }

                public final void I00II0Ol1O0l(IllOOo00lI illOOo00lI) {
/* 1 */             I1Il0loi i1Il0loi = this.I00l0I0l0lO1;
/* 3 */             boolean zIsEmpty = i1Il0loi.isEmpty();
/* 7 */             i1Il0loi.addLast(illOOo00lI);
/* 10 */            if (zIsEmpty) {
/* 12 */                Handler handler = getHandler();
/* 16 */                if (handler != null) {
/* 20 */                    handler.postAtFrontOfQueue(this.I00l0OO0IO);
                        } else {
/* 26 */                    I000II.I000iOII("schedule is called when outOfFrameExecutor is not available (view is detached)");
                        }
                    }
                }

                public final void I00II0oii1o(O0iiOioolIi o0iiOioolIi) {
/* 5 */             if (isLayoutRequested() || !isAttachedToWindow()) {
/* 168 */               return;
                    }
/* 13 */            if (o0iiOioolIi != null) {
/* 15 */                while (o0iiOioolIi != null && o0iiOioolIi.I0010I0i() == O0iiOi.I00iOIl) {
/* 27 */                    if (!this.I010l1O) {
/* 29 */                        O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
/* 33 */                        if (o0iiOioolIiI001IO000 == null) {
                                    break;
                                }
/* 41 */                        long j = ((Iollol0oI) o0iiOioolIiI001IO000.I010101Oo1lO.I00iio).I00iio;
/* 47 */                        if (IOo0oO11ll1O.I000O01llI0(j) && IOo0oO11ll1O.I000II(j)) {
                                    break;
                                }
                            }
/* 56 */                    o0iiOioolIi = o0iiOioolIi.I001IO000();
                        }
/* 65 */                if (o0iiOioolIi == getRoot()) {
/* 67 */                    requestLayout();
/* 70 */                    return;
                        }
                    }
/* 75 */            if (getWidth() == 0 || getHeight() == 0) {
/* 88 */                requestLayout();
                    } else {
/* 84 */                invalidate();
                    }
                }

                public final long I00IO1(long j) {
/* 1 */             I001lIiIIo1O();
/* 21 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.I011IO1I11OI >> 32));
/* 41 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.I011IO1I11OI & 4294967295L));
/* 58 */            return O1i010l1l.I0000Il00O((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.I0110OiO);
                }

                public final int I00IO1oi11O(MotionEvent motionEvent) {
                    Object obj;
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I0100o111I;
/* 3 */             OI01OO oi01oo = this.I0100i;
/* 8 */             if (this.I01Io1) {
/* 10 */                this.I01Io1 = false;
/* 14 */                O0oI1IIioO0 o0oI1IIioO0 = this.I00iOIl.I00111O;
/* 16 */                int metaState = motionEvent.getMetaState();
/* 20 */                o0oI1IIioO0.getClass();
/* 23 */                OIooliIO0 oIooliIO0 = i00IiooO.I00000oIO;
/* 27 */                OO1ioiIO1 oO1ioiIO1 = new OO1ioiIO1();
/* 30 */                oO1ioiIO1.I00000oIO = metaState;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                oIooliIO0.setValue(oO1ioiIO1);
                    }
/* 38 */            IoloOio0I ioloOio0II0000Il00O = oi01oo.I0000Il00O(motionEvent, this);
/* 42 */            int actionMasked = motionEvent.getActionMasked();
/* 46 */            if (ioloOio0II0000Il00O == null) {
/* 134 */               if (!iOI0oloi01.I00000oIO) {
/* 144 */                   ((O1IOillioo0I) ((Oi0Oooi) iOI0oloi01.I0000O).I00iiI).I00000oIO();
/* 151 */                   ((Io1ioiI1) iOI0oloi01.I0000Il00O).I0000Il00O();
                        }
/* 7 */                 return 0;
                    }
/* 50 */            ArrayList arrayList = (ArrayList) ioloOio0II0000Il00O.I00iiI;
                    int size = arrayList.size() - 1;
/* 60 */            if (size >= 0) {
                        while (true) {
                            int i = size - 1;
/* 64 */                    obj = arrayList.get(size);
/* 73 */                    if (((OO1il1IIii) obj).I0000oI00 && (actionMasked == 0 || actionMasked == 5)) {
                                break;
                            }
/* 80 */                    if (i < 0) {
                                break;
                            }
/* 83 */                    size = i;
                        }
/* 85 */                obj = null;
                    } else {
/* 85 */                obj = null;
                    }
/* 86 */            OO1il1IIii oO1il1IIii = (OO1il1IIii) obj;
/* 88 */            if (oO1il1IIii != null) {
/* 92 */                this.I00iiI = oO1il1IIii.I0000O;
                    }
/* 98 */            int iI0000O = iOI0oloi01.I0000O(ioloOio0II0000Il00O, this, I000o00OoI0I(motionEvent));
/* 102 */           ioloOio0II0000Il00O.I00iiO = null;
/* 104 */           if ((actionMasked != 0 && actionMasked != 5) || (iI0000O & 1) != 0) {
/* 112 */               return iI0000O;
                    }
/* 117 */           int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 123 */           oi01oo.I0000Il00O.delete(pointerId);
/* 128 */           oi01oo.I00000oOI.delete(pointerId);
/* 131 */           return iI0000O;
                }

                public final void I00IOO(MotionEvent motionEvent, int i, long j, boolean z) {
/* 7 */             int actionMasked = motionEvent.getActionMasked();
/* 11 */            int actionIndex = -1;
/* 13 */            if (actionMasked != 1) {
/* 16 */                if (actionMasked == 6) {
/* 19 */                    actionIndex = motionEvent.getActionIndex();
                        }
                    } else if (i != 9 && i != 10) {
/* 32 */                actionIndex = 0;
                    }
/* 42 */            int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
/* 43 */            if (pointerCount == 0) {
/* 45 */                return;
                    }
/* 46 */            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
/* 49 */            for (int i2 = 0; i2 < pointerCount; i2++) {
/* 56 */                pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
                    }
/* 61 */            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
/* 64 */            for (int i3 = 0; i3 < pointerCount; i3++) {
/* 71 */                pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
                    }
/* 76 */            int i4 = 0;
/* 77 */            while (i4 < pointerCount) {
/* 86 */                int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
/* 89 */                motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
/* 92 */                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
/* 94 */                motionEvent.getPointerCoords(i5, pointerCoords);
/* 97 */                float f = pointerCoords.x;
/* 121 */               long jI00100o1O0lo = I00100o1O0lo((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
/* 132 */               pointerCoords.x = Float.intBitsToFloat((int) (jI00100o1O0lo >> 32));
/* 140 */               pointerCoords.y = Float.intBitsToFloat((int) (jI00100o1O0lo & 4294967295L));
/* 142 */               i4++;
                    }
/* 209 */           MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
/* 222 */           this.I0100o111I.I0000O(this.I0100i.I0000Il00O(motionEventObtain, this), this, true);
/* 225 */           motionEventObtain.recycle();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IioO0OiOi(IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    I0lilOo1ooo0 i0lilOo1ooo0;
/* 3 */             if (iOoilo instanceof I0lilOo1ooo0) {
/* 6 */                 i0lilOo1ooo0 = (I0lilOo1ooo0) iOoilo;
/* 8 */                 int i = i0lilOo1ooo0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0lilOo1ooo0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0lilOo1ooo0 = new I0lilOo1ooo0(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = i0lilOo1ooo0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0lilOo1ooo0.I00iiO;
/* 32 */            if (i2 == 0) {
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                AtomicReference atomicReference = this.I011Ol0;
/* 55 */                I0lOl1 i0lOl1 = new I0lOl1(0);
/* 58 */                i0lOl1.I00iiI = this;
/* 60 */                VarHandle.storeStoreFence();
/* 63 */                i0lilOo1ooo0.I00iiO = 1;
/* 78 */                if (il001oo1.I0000Il00O(new O1o1iI(i0lOl1, atomicReference, illiIl1l11O, (IOoil1iiIilo) null, 9), i0lilOo1ooo0) == ii0111o) {
/* 80 */                    return;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 38 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return;
                        }
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 81 */            IOOlIIilOl0.I0000Il00O();
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IlilI0i0i() {
                    boolean z;
                    int i;
/* 3 */             int[] iArr = this.I010o0o0oO;
/* 5 */             getLocationOnScreen(iArr);
/* 8 */             long j = this.I010lI0oi;
/* 14 */            int i2 = (int) (j >> 32);
/* 21 */            int i3 = (int) (j & 4294967295L);
/* 23 */            int i4 = iArr[0];
/* 26 */            if (i2 != i4 || i3 != iArr[1] || this.I0110o < 0) {
/* 47 */                this.I010lI0oi = (4294967295L & iArr[1]) | (i4 << 32);
/* 52 */                if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
/* 87 */                    z = false;
                        } else {
/* 60 */                    OI110O0 oi110o0I001lIiIIo1O = getRoot().I001lIiIIo1O();
/* 64 */                    Object[] objArr = oi110o0I001lIiIIo1O.I00iOIl;
/* 66 */                    int i5 = oi110o0I001lIiIIo1O.I00iiO;
/* 69 */                    for (int i6 = 0; i6 < i5; i6++) {
/* 79 */                        ((O0iiOioolIi) objArr[i6]).I010I0.I00100l0.I00ooIo0();
                            }
/* 85 */                    z = true;
                        }
                    }
/* 88 */            I001lIiIIo1O();
/* 91 */            View rootView = this.I01Iol;
/* 93 */            if (rootView == null) {
/* 95 */                rootView = getRootView();
/* 99 */                this.I01Iol = rootView;
                    }
/* 101 */           OOo0Olol0o rectManager = getRectManager();
/* 105 */           long j2 = this.I010lI0oi;
/* 109 */           long jI00000oOI = ioolillioIIO.I00000oOI(this.I011IO1I11OI);
/* 113 */           float[] fArr = this.I01101olii;
/* 115 */           int width = rootView.getWidth();
/* 119 */           int height = rootView.getHeight();
/* 123 */           rectManager.getClass();
/* 130 */           if (fArr.length < 16) {
/* 132 */               i = 0;
                    } else {
/* 284 */               i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
                    }
/* 285 */           Oo10ili0oo0 oo10ili0oo0 = rectManager.I0000O;
/* 288 */           if ((i & 2) != 0) {
/* 292 */               fArr = null;
                    }
/* 305 */           rectManager.I000II = oo10ili0oo0.I00000oOI(j2, jI00000oOI, fArr, width, height) || rectManager.I000II;
/* 309 */           this.I010l1ol111.I00000oIO(z);
/* 316 */           getRectManager().I00000oIO();
                }

                public final void I00Io1lO(float f) {
/* 5 */             if (I000l1()) {
/* 10 */                if (f > 0.0f) {
/* 18 */                    if (Float.isNaN(this.I01II10) || f > this.I01II10) {
/* 26 */                        this.I01II10 = f;
/* 28 */                        return;
                            }
/* 77 */                    return;
                        }
/* 31 */                if (f < 0.0f) {
/* 39 */                    if (Float.isNaN(this.I01IO0oio) || f < this.I01IO0oio) {
/* 47 */                        this.I01IO0oio = f;
                            }
                        }
                    }
                }

                @Override
                public final void addFocusables(ArrayList arrayList, int i, int i2) {
/* 7 */             IliIO10oO0 iliIO10oO0 = ((Ili1ioOlo0oO) getFocusOwner()).I0000Il00O;
/* 11 */            if (!iliIO10oO0.I00lll10) {
/* 408 */               return;
                    }
/* 21 */            if (!iliIO10oO0.I00iOIl.I00lll10) {
/* 23 */                IolioOO1.I0000Il00O("visitSubtreeIf called on an unattached node");
                    }
/* 32 */            OI110O0 oi110o0 = new OI110O0(new O1ooOo[16]);
/* 35 */            O1ooOo o1ooOo = iliIO10oO0.I00iOIl;
/* 37 */            O1ooOo o1ooOo2 = o1ooOo.I00ilO0;
/* 39 */            if (o1ooOo2 == null) {
/* 41 */                il0lI1i1olii.I00000oIO(oi110o0, o1ooOo);
                    } else {
/* 45 */                oi110o0.I00000oOI(o1ooOo2);
                    }
                    while (true) {
/* 48 */                int i3 = oi110o0.I00iiO;
/* 50 */                if (i3 == 0) {
/* 408 */                   return;
                        }
/* 58 */                O1ooOo o1ooOo3 = (O1ooOo) oi110o0.I000l1(i3 - 1);
/* 64 */                if ((o1ooOo3.I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 67 */                    for (O1ooOo o1ooOo4 = o1ooOo3; o1ooOo4 != null && o1ooOo4.I00lll10; o1ooOo4 = o1ooOo4.I00ilO0) {
/* 77 */                        if ((o1ooOo4.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 80 */                            O1ooOo o1ooOoI0000Il00O = o1ooOo4;
/* 81 */                            OI110O0 oi110o02 = null;
/* 82 */                            while (o1ooOoI0000Il00O != null) {
/* 87 */                                int i4 = 0;
/* 88 */                                if (o1ooOoI0000Il00O instanceof IliIO10oO0) {
/* 90 */                                    IliIO10oO0 iliIO10oO02 = (IliIO10oO0) o1ooOoI0000Il00O;
/* 94 */                                    if (iliIO10oO02.I00lll10 && iliIO10oO02.I010lI0oi().I00000oIO) {
/* 104 */                                       super.addFocusables(arrayList, i, i2);
/* 113 */                                       IliIO10oO0 iliIO10oO03 = ((Ili1ioOlo0oO) getFocusOwner()).I0000Il00O;
/* 117 */                                       if (iliIO10oO03.I00lll10) {
/* 125 */                                           if (!iliIO10oO03.I00iOIl.I00lll10) {
/* 127 */                                               IolioOO1.I0000Il00O("visitSubtreeIf called on an unattached node");
                                                    }
/* 134 */                                           OI110O0 oi110o03 = new OI110O0(new O1ooOo[16]);
/* 137 */                                           O1ooOo o1ooOo5 = iliIO10oO03.I00iOIl;
/* 139 */                                           O1ooOo o1ooOo6 = o1ooOo5.I00ilO0;
/* 141 */                                           if (o1ooOo6 == null) {
/* 143 */                                               il0lI1i1olii.I00000oIO(oi110o03, o1ooOo5);
                                                    } else {
/* 147 */                                               oi110o03.I00000oOI(o1ooOo6);
                                                    }
                                                    while (true) {
/* 150 */                                               int i5 = oi110o03.I00iiO;
/* 152 */                                               if (i5 == 0) {
                                                            break;
                                                        }
/* 160 */                                               O1ooOo o1ooOo7 = (O1ooOo) oi110o03.I000l1(i5 - 1);
/* 166 */                                               if ((o1ooOo7.I00iio & Barcode.FORMAT_UPC_E) != 0) {
/* 169 */                                                   for (O1ooOo o1ooOo8 = o1ooOo7; o1ooOo8 != null && o1ooOo8.I00lll10; o1ooOo8 = o1ooOo8.I00ilO0) {
/* 179 */                                                       if ((o1ooOo8.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 181 */                                                           O1ooOo o1ooOoI0000Il00O2 = o1ooOo8;
/* 182 */                                                           OI110O0 oi110o04 = null;
/* 183 */                                                           while (o1ooOoI0000Il00O2 != null) {
/* 187 */                                                               if (o1ooOoI0000Il00O2 instanceof IliIO10oO0) {
/* 189 */                                                                   IliIO10oO0 iliIO10oO04 = (IliIO10oO0) o1ooOoI0000Il00O2;
/* 193 */                                                                   if (iliIO10oO04.I00lll10) {
/* 196 */                                                                       Ili1l01O ili1l01OI010lI0oi = iliIO10oO04.I010lI0oi();
/* 202 */                                                                       if (iliIO10oO04.I00lll10 && !iliIO10oO04.I00o0iI0io1 && ili1l01OI010lI0oi.I00000oIO) {
/* 408 */                                                                           return;
                                                                                }
                                                                            }
                                                                        } else if ((o1ooOoI0000Il00O2.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O2 instanceof IiIioO0ol1oI)) {
/* 229 */                                                                   int i6 = 0;
/* 230 */                                                                   for (O1ooOo o1ooOo9 = ((IiIioO0ol1oI) o1ooOoI0000Il00O2).I00o0l1o1o0; o1ooOo9 != null; o1ooOo9 = o1ooOo9.I00ilO0) {
/* 236 */                                                                       if ((o1ooOo9.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 238 */                                                                           i6++;
/* 240 */                                                                           if (i6 == 1) {
/* 242 */                                                                               o1ooOoI0000Il00O2 = o1ooOo9;
                                                                                    } else {
/* 244 */                                                                               if (oi110o04 == null) {
/* 250 */                                                                                   oi110o04 = new OI110O0(new O1ooOo[16]);
                                                                                        }
/* 253 */                                                                               if (o1ooOoI0000Il00O2 != null) {
/* 255 */                                                                                   oi110o04.I00000oOI(o1ooOoI0000Il00O2);
/* 258 */                                                                                   o1ooOoI0000Il00O2 = null;
                                                                                        }
/* 259 */                                                                               oi110o04.I00000oOI(o1ooOo9);
                                                                                    }
                                                                                }
                                                                            }
/* 265 */                                                                   if (i6 == 1) {
                                                                            }
                                                                        }
/* 268 */                                                               o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o04);
                                                                    }
                                                                }
                                                            }
                                                        }
/* 276 */                                               il0lI1i1olii.I00000oIO(oi110o03, o1ooOo7);
                                                    }
                                                }
/* 281 */                                       if (arrayList != null) {
/* 283 */                                           arrayList.remove(this);
/* 286 */                                           return;
                                                }
/* 408 */                                       return;
                                            }
                                        } else if ((o1ooOoI0000Il00O.I00iiO & Barcode.FORMAT_UPC_E) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 302 */                                   for (O1ooOo o1ooOo10 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo10 != null; o1ooOo10 = o1ooOo10.I00ilO0) {
/* 308 */                                       if ((o1ooOo10.I00iiO & Barcode.FORMAT_UPC_E) != 0) {
/* 310 */                                           i4++;
/* 312 */                                           if (i4 == 1) {
/* 314 */                                               o1ooOoI0000Il00O = o1ooOo10;
                                                    } else {
/* 316 */                                               if (oi110o02 == null) {
/* 322 */                                                   oi110o02 = new OI110O0(new O1ooOo[16]);
                                                        }
/* 325 */                                               if (o1ooOoI0000Il00O != null) {
/* 327 */                                                   oi110o02.I00000oOI(o1ooOoI0000Il00O);
/* 330 */                                                   o1ooOoI0000Il00O = null;
                                                        }
/* 331 */                                               oi110o02.I00000oOI(o1ooOo10);
                                                    }
                                                }
                                            }
/* 337 */                                   if (i4 == 1) {
                                            }
                                        }
/* 341 */                               o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o02);
                                    }
                                }
                            }
                        }
/* 351 */               il0lI1i1olii.I00000oIO(oi110o0, o1ooOo3);
                    }
                }

                @Override
                public final void addView(View view, int i) {
/* 1 */             ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 5 */             if (layoutParams == null) {
/* 7 */                 layoutParams = generateDefaultLayoutParams();
                    }
/* 12 */            addViewInLayout(view, i, layoutParams, true);
                }

                @Override
                public final void autofill(SparseArray sparseArray) {
                    OiioiIIlooo oiioiIIloooI001i1lo1io;
                    Function1 function1;
                    Function1 function12;
/* 1 */             I0lII0loi i0lII0loiM26getAutofillManager = m26getAutofillManager();
/* 6 */             if (i0lII0loiM26getAutofillManager != null) {
/* 8 */                 int size = sparseArray.size();
/* 13 */                for (int i = 0; i < size; i++) {
/* 15 */                    int iKeyAt = sparseArray.keyAt(i);
/* 23 */                    AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
/* 33 */                    O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) i0lII0loiM26getAutofillManager.I00iiI.I0000Il00O.I00000oOI(iKeyAt);
/* 35 */                    if (o0iiOioolIi != null && (oiioiIIloooI001i1lo1io = o0iiOioolIi.I001i1lo1io()) != null) {
/* 43 */                        OI10I1IoI0Ol oI10I1IoI0Ol = oiioiIIloooI001i1lo1io.I00iOIl;
/* 47 */                        Object objI000II = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000II);
/* 52 */                        if (objI000II == null) {
/* 54 */                            objI000II = null;
                                }
/* 55 */                        I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) objI000II;
/* 57 */                        if (i01lOOlO0o != null && (function12 = (Function1) i01lOOlO0o.I00000oOI) != null) {
                                }
/* 86 */                        Object objI000II2 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000O01llI0);
/* 94 */                        I01lOOlO0o i01lOOlO0o2 = (I01lOOlO0o) (objI000II2 != null ? objI000II2 : null);
/* 96 */                        if (i01lOOlO0o2 != null && (function1 = (Function1) i01lOOlO0o2.I00000oOI) != null) {
                                }
                            }
                        }
                    }
/* 118 */           I0lI1I10iIII i0lI1I10iIIIM25getAutofill = m25getAutofill();
/* 122 */           if (i0lI1I10iIIIM25getAutofill != null) {
/* 124 */               I1lOlO0ioIl0 i1lOlO0ioIl0 = i0lI1I10iIIIM25getAutofill.I00000oOI;
/* 132 */               if (i1lOlO0ioIl0.I00000oIO.isEmpty()) {
/* 437 */                   return;
                        }
/* 135 */               int size2 = sparseArray.size();
/* 139 */               for (int i2 = 0; i2 < size2; i2++) {
/* 141 */                   int iKeyAt2 = sparseArray.keyAt(i2);
/* 149 */                   AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
/* 155 */                   if (autofillValue2.isText()) {
/* 161 */                       autofillValue2.getTextValue().toString();
/* 174 */                       if (i1lOlO0ioIl0.I00000oIO.get(Integer.valueOf(iKeyAt2)) != null) {
/* 177 */                           OIiilo1Ool0o.I00000oIO();
/* 180 */                           return;
                                }
                            } else {
/* 185 */                       if (autofillValue2.isDate()) {
/* 225 */                           throw new OIO01O("An operation is not implemented: b/138604541: Add onFill() callback for date");
                                }
/* 191 */                       if (autofillValue2.isList()) {
/* 217 */                           throw new OIO01O("An operation is not implemented: b/138604541: Add onFill() callback for list");
                                }
/* 197 */                       if (autofillValue2.isToggle()) {
/* 209 */                           throw new OIO01O("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                                }
                            }
                        }
                    }
                }

                @Override
                public final boolean canScrollHorizontally(int i) {
/* 6 */             return this.I00ol1.I000O01llI0(i, this.I00iiI, false);
                }

                @Override
                public final boolean canScrollVertically(int i) {
/* 6 */             return this.I00ol1.I000O01llI0(i, this.I00iiI, true);
                }

                @Override
                public final void dispatchDraw(Canvas canvas) {
/* 1 */             OI0oiiIO0 oI0oiiIO0 = this.I00oo1iO0ll;
/* 7 */             if (!isAttachedToWindow()) {
/* 13 */                I000OiO(getRoot());
                    }
/* 17 */            I0010I0i(true);
/* 24 */            Ol1l1lI1Ili.I000O01llI0().I000lI();
/* 27 */            this.I00ooiO1I = true;
/* 31 */            Trace.beginSection("AndroidOwner:draw");
                    try {
/* 34 */                IIoll1I0 canvasHolder = getCanvasHolder();
/* 38 */                I0lIooIo1 i0lIooIo1 = canvasHolder.I00000oIO;
/* 40 */                Canvas canvas2 = i0lIooIo1.I00000oIO;
/* 42 */                i0lIooIo1.I00000oIO = canvas;
/* 49 */                getRoot().I000OOo1O(i0lIooIo1, null);
/* 54 */                canvasHolder.I00000oIO.I00000oIO = canvas2;
/* 61 */                if (oI0oiiIO0.I000OiO()) {
/* 63 */                    int i = oI0oiiIO0.I00000oOI;
/* 66 */                    for (int i2 = 0; i2 < i; i2++) {
/* 76 */                        ((Io10OIiiOll) ((OIlIooO) oI0oiiIO0.I000II(i2))).I000II();
                            }
                        }
/* 82 */                int i3 = OooioI0Oio.I00iOIl;
/* 84 */                oI0oiiIO0.I0000oI00();
/* 87 */                this.I00ooiO1I = false;
/* 89 */                Trace.endSection();
/* 92 */                OI0oiiIO0 oI0oiiIO02 = this.I00ooIo0;
/* 94 */                if (oI0oiiIO02 != null) {
/* 96 */                    oI0oiiIO0.I0000Il00O(oI0oiiIO02);
/* 99 */                    oI0oiiIO02.I0000oI00();
                        }
/* 106 */               if (I000l1()) {
/* 116 */                   if (Float.compare(this.I01II10, this.I01IO1il) != 0) {
/* 118 */                       float f = this.I01II10;
/* 120 */                       this.I01IO1il = f;
/* 122 */                       I11OiIoIOlOO.I00000oIO(this, f);
                            }
/* 125 */                   View view = this.I00ll1;
/* 127 */                   if (view != null) {
/* 137 */                       if (Float.compare(this.I01IO0oio, this.I01Ii0ll10O) != 0) {
/* 139 */                           float f2 = this.I01IO0oio;
/* 141 */                           this.I01Ii0ll10O = f2;
/* 143 */                           I11OiIoIOlOO.I00000oIO(view, f2);
                                }
/* 152 */                       if (!Float.isNaN(this.I01IO0oio)) {
/* 154 */                           view.invalidate();
/* 161 */                           drawChild(canvas, view, getDrawingTime());
                                }
                            }
/* 166 */                   this.I01II10 = Float.NaN;
/* 168 */                   this.I01IO0oio = Float.NaN;
                        }
                    } catch (Throwable th) {
/* 172 */               Trace.endSection();
/* 437 */               throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:218:0x0375  */
                /* JADX WARN: Removed duplicated region for block: B:219:0x037c  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0384  */
                /* JADX WARN: Removed duplicated region for block: B:223:0x03a6  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x03b8  */
                /* JADX WARN: Removed duplicated region for block: B:318:0x0510 A[PHI: r4
                  0x0510: PHI (r4v45 OI110O0) = (r4v67 OI110O0), (r4v68 OI110O0), (r4v69 OI110O0) binds: [B:299:0x04d2, B:301:0x04d6, B:316:0x0509] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r0v20 */
                /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
                /* JADX WARN: Type inference failed for: r0v26 */
                /* JADX WARN: Type inference failed for: r10v10 */
                /* JADX WARN: Type inference failed for: r10v7 */
                /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
                /* JADX WARN: Type inference failed for: r3v101 */
                /* JADX WARN: Type inference failed for: r3v104 */
                /* JADX WARN: Type inference failed for: r3v25 */
                /* JADX WARN: Type inference failed for: r3v26 */
                /* JADX WARN: Type inference failed for: r3v35 */
                /* JADX WARN: Type inference failed for: r3v36, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r3v49 */
                /* JADX WARN: Type inference failed for: r3v50 */
                /* JADX WARN: Type inference failed for: r3v59 */
                /* JADX WARN: Type inference failed for: r3v60, types: [O1ooOo] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                    int actionIndex;
                    int i;
                    IolIIo0o0Iio iolIIo0o0Iio;
                    String str;
                    int i2;
                    I00Ol00 i00Ol00;
                    String str2;
                    long j;
                    int i3;
                    int i4;
                    OI01OO oi01oo;
                    String str3;
                    int i5;
                    long jFloatToRawIntBits;
                    IolI11 iolI11;
                    IIlOoolol0ll iIlOoolol0ll;
                    boolean z;
                    IiIioO0ol1oI iiIioO0ol1oI;
                    IIlOoolol0ll iIlOoolol0ll2;
                    O1ooOo o1ooOoI0000Il00O;
                    IolI11 iolI112;
                    boolean z2;
                    int size;
                    int size2;
                    IIlOoolol0ll iIlOoolol0ll3;
                    boolean z3;
                    IiIioO0ol1oI iiIioO0ol1oI2;
                    IIlOoolol0ll iIlOoolol0ll4;
                    O1ooOo o1ooOoI0000Il00O2;
                    IolIIo0o0Iio iolIIo0o0Iio2;
                    boolean z4;
                    I0li1O0 i0li1O0;
                    int size3;
                    IIlOoolol0ll iIlOoolol0ll5;
                    boolean z5;
                    O1ooOo o1ooOoI0000Il00O3;
                    IIlOoolol0ll iIlOoolol0ll6;
/* 3 */             MotionEvent motionEvent2 = motionEvent;
/* 5 */             IolIIo0o0Iio iolIIo0o0Iio3 = this.I01Ilo0i;
/* 7 */             I0li0Io i0li0Io = this.I01Iio10lo;
/* 14 */            if (this.I01IlIoOI) {
/* 16 */                removeCallbacks(i0li0Io);
/* 23 */                if (motionEvent2.getActionMasked() == 8) {
/* 25 */                    this.I01IlIoOI = false;
                        } else {
/* 28 */                    i0li0Io.run();
                        }
                    }
/* 35 */            if (I000lI(motionEvent2) || !isAttachedToWindow()) {
/* 2063 */              return super.dispatchGenericMotionEvent(motionEvent);
                    }
/* 49 */            String str4 = "visitAncestors called on an unattached node";
/* 54 */            int i6 = 1;
/* 55 */            if (motionEvent2.getActionMasked() == 8) {
/* 63 */                if (!motionEvent2.isFromSource(4194304)) {
                            return (I000OOo1O(motionEvent) & 4) != 0;
                        }
/* 69 */                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
/* 75 */                motionEvent2.getAxisValue(26);
/* 78 */                getContext();
/* 81 */                viewConfiguration.getScaledVerticalScrollFactor();
/* 84 */                getContext();
/* 87 */                viewConfiguration.getScaledHorizontalScrollFactor();
/* 90 */                motionEvent2.getEventTime();
/* 93 */                motionEvent2.getDeviceId();
/* 100 */               Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) getFocusOwner();
/* 106 */               if (ili1ioOlo0oO.I0000O.I0000oI00) {
/* 112 */                   System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
/* 13 */                    return false;
                        }
/* 118 */               IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(ili1ioOlo0oO.I0000Il00O);
/* 122 */               if (iliIO10oO0I00000oIO != null) {
/* 128 */                   if (!iliIO10oO0I00000oIO.I00iOIl.I00lll10) {
/* 130 */                       IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 133 */                   O1ooOo o1ooOo = iliIO10oO0I00000oIO.I00iOIl;
/* 135 */                   O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I00000oIO);
                            loop0: while (true) {
/* 139 */                       if (o0iiOioolIiI000O01llI0 == null) {
/* 249 */                           o1ooOoI0000Il00O3 = null;
                                    break;
                                }
/* 151 */                       if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 16384) != 0) {
/* 153 */                           while (o1ooOo != null) {
/* 159 */                               if ((o1ooOo.I00iiO & 16384) != 0) {
/* 161 */                                   o1ooOoI0000Il00O3 = o1ooOo;
/* 162 */                                   OI110O0 oi110o0 = null;
/* 163 */                                   while (o1ooOoI0000Il00O3 != null) {
/* 167 */                                       if (o1ooOoI0000Il00O3 instanceof I0li1O0) {
                                                    break loop0;
                                                }
/* 174 */                                       if ((o1ooOoI0000Il00O3.I00iiO & 16384) != 0 && (o1ooOoI0000Il00O3 instanceof IiIioO0ol1oI)) {
/* 185 */                                           int i7 = 0;
/* 186 */                                           for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O3).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 192 */                                               if ((o1ooOo2.I00iiO & 16384) != 0) {
/* 194 */                                                   i7++;
/* 196 */                                                   if (i7 == 1) {
/* 198 */                                                       o1ooOoI0000Il00O3 = o1ooOo2;
                                                            } else {
/* 200 */                                                       if (oi110o0 == null) {
/* 206 */                                                           oi110o0 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 209 */                                                       if (o1ooOoI0000Il00O3 != null) {
/* 211 */                                                           oi110o0.I00000oOI(o1ooOoI0000Il00O3);
/* 214 */                                                           o1ooOoI0000Il00O3 = null;
                                                                }
/* 215 */                                                       oi110o0.I00000oOI(o1ooOo2);
                                                            }
                                                        }
                                                    }
/* 221 */                                           if (i7 == 1) {
                                                    }
                                                }
/* 224 */                                       o1ooOoI0000Il00O3 = il0lI1i1olii.I0000Il00O(oi110o0);
                                            }
                                        }
/* 229 */                               o1ooOo = o1ooOo.I00ilI0I1;
                                    }
                                }
/* 232 */                       o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 247 */                       o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll6 = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll6.I00ilO0;
                            }
/* 250 */                   i0li1O0 = (I0li1O0) o1ooOoI0000Il00O3;
                        } else {
/* 253 */                   i0li1O0 = null;
                        }
/* 254 */               if (i0li1O0 != null) {
/* 260 */                   if (!i0li1O0.I00iOIl.I00lll10) {
/* 262 */                       IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                            }
/* 267 */                   O1ooOo o1ooOo3 = i0li1O0.I00iOIl.I00ilI0I1;
/* 269 */                   O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(i0li1O0);
/* 273 */                   ArrayList arrayList = null;
/* 274 */                   while (o0iiOioolIiI000O01llI02 != null) {
/* 286 */                       if ((((O1ooOo) o0iiOioolIiI000O01llI02.I010101Oo1lO.I00io1l).I00iio & 16384) != 0) {
/* 288 */                           while (o1ooOo3 != null) {
/* 294 */                               if ((o1ooOo3.I00iiO & 16384) != 0) {
/* 296 */                                   O1ooOo o1ooOoI0000Il00O4 = o1ooOo3;
/* 297 */                                   OI110O0 oi110o02 = null;
/* 298 */                                   while (o1ooOoI0000Il00O4 != null) {
/* 302 */                                       if (o1ooOoI0000Il00O4 instanceof I0li1O0) {
/* 304 */                                           if (arrayList == null) {
/* 308 */                                               arrayList = new ArrayList();
                                                    }
/* 311 */                                           arrayList.add(o1ooOoI0000Il00O4);
/* 314 */                                           z5 = false;
                                                } else {
/* 316 */                                           z5 = true;
                                                }
/* 317 */                                       if (z5 && (o1ooOoI0000Il00O4.I00iiO & 16384) != 0 && (o1ooOoI0000Il00O4 instanceof IiIioO0ol1oI)) {
/* 334 */                                           int i8 = 0;
/* 335 */                                           for (O1ooOo o1ooOo4 = ((IiIioO0ol1oI) o1ooOoI0000Il00O4).I00o0l1o1o0; o1ooOo4 != null; o1ooOo4 = o1ooOo4.I00ilO0) {
/* 341 */                                               if ((o1ooOo4.I00iiO & 16384) != 0) {
/* 343 */                                                   i8++;
/* 345 */                                                   if (i8 == 1) {
/* 347 */                                                       o1ooOoI0000Il00O4 = o1ooOo4;
                                                            } else {
/* 349 */                                                       if (oi110o02 == null) {
/* 355 */                                                           oi110o02 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 358 */                                                       if (o1ooOoI0000Il00O4 != null) {
/* 360 */                                                           oi110o02.I00000oOI(o1ooOoI0000Il00O4);
/* 363 */                                                           o1ooOoI0000Il00O4 = null;
                                                                }
/* 364 */                                                       oi110o02.I00000oOI(o1ooOo4);
                                                            }
                                                        }
                                                    }
/* 370 */                                           if (i8 == 1) {
                                                    }
                                                }
/* 373 */                                       o1ooOoI0000Il00O4 = il0lI1i1olii.I0000Il00O(oi110o02);
                                            }
                                        }
/* 378 */                               o1ooOo3 = o1ooOo3.I00ilI0I1;
                                    }
                                }
/* 381 */                       o0iiOioolIiI000O01llI02 = o0iiOioolIiI000O01llI02.I001IO000();
/* 396 */                       o1ooOo3 = (o0iiOioolIiI000O01llI02 == null || (iIlOoolol0ll5 = o0iiOioolIiI000O01llI02.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll5.I00ilO0;
                            }
/* 398 */                   if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i9 = size3 - 1;
/* 415 */                           ((I0li1O0) arrayList.get(size3)).getClass();
/* 418 */                           if (i9 < 0) {
                                        break;
                                    }
/* 421 */                           size3 = i9;
                                }
                            }
/* 423 */                   O1ooOo o1ooOoI0000Il00O5 = i0li1O0.I00iOIl;
/* 425 */                   OI110O0 oi110o03 = null;
/* 426 */                   while (o1ooOoI0000Il00O5 != null) {
/* 430 */                       if (!(o1ooOoI0000Il00O5 instanceof I0li1O0) && (o1ooOoI0000Il00O5.I00iiO & 16384) != 0 && (o1ooOoI0000Il00O5 instanceof IiIioO0ol1oI)) {
/* 448 */                           int i10 = 0;
/* 449 */                           for (O1ooOo o1ooOo5 = ((IiIioO0ol1oI) o1ooOoI0000Il00O5).I00o0l1o1o0; o1ooOo5 != null; o1ooOo5 = o1ooOo5.I00ilO0) {
/* 455 */                               if ((o1ooOo5.I00iiO & 16384) != 0) {
/* 457 */                                   i10++;
/* 459 */                                   if (i10 == 1) {
/* 461 */                                       o1ooOoI0000Il00O5 = o1ooOo5;
                                            } else {
/* 463 */                                       if (oi110o03 == null) {
/* 469 */                                           oi110o03 = new OI110O0(new O1ooOo[16]);
                                                }
/* 472 */                                       if (o1ooOoI0000Il00O5 != null) {
/* 474 */                                           oi110o03.I00000oOI(o1ooOoI0000Il00O5);
/* 477 */                                           o1ooOoI0000Il00O5 = null;
                                                }
/* 478 */                                       oi110o03.I00000oOI(o1ooOo5);
                                            }
                                        }
                                    }
/* 484 */                           if (i10 == 1) {
                                    }
                                }
/* 487 */                       o1ooOoI0000Il00O5 = il0lI1i1olii.I0000Il00O(oi110o03);
                            }
/* 496 */                   if (!super.dispatchGenericMotionEvent(motionEvent)) {
/* 500 */                       O1ooOo o1ooOoI0000Il00O6 = i0li1O0.I00iOIl;
/* 502 */                       OI110O0 oi110o04 = null;
/* 503 */                       while (o1ooOoI0000Il00O6 != null) {
/* 507 */                           if (!(o1ooOoI0000Il00O6 instanceof I0li1O0) && (o1ooOoI0000Il00O6.I00iiO & 16384) != 0 && (o1ooOoI0000Il00O6 instanceof IiIioO0ol1oI)) {
/* 525 */                               int i11 = 0;
/* 526 */                               for (O1ooOo o1ooOo6 = ((IiIioO0ol1oI) o1ooOoI0000Il00O6).I00o0l1o1o0; o1ooOo6 != null; o1ooOo6 = o1ooOo6.I00ilO0) {
/* 532 */                                   if ((o1ooOo6.I00iiO & 16384) != 0) {
/* 534 */                                       i11++;
/* 536 */                                       if (i11 == 1) {
/* 538 */                                           o1ooOoI0000Il00O6 = o1ooOo6;
                                                } else {
/* 540 */                                           if (oi110o04 == null) {
/* 546 */                                               oi110o04 = new OI110O0(new O1ooOo[16]);
                                                    }
/* 549 */                                           if (o1ooOoI0000Il00O6 != null) {
/* 551 */                                               oi110o04.I00000oOI(o1ooOoI0000Il00O6);
/* 554 */                                               o1ooOoI0000Il00O6 = null;
                                                    }
/* 555 */                                           oi110o04.I00000oOI(o1ooOo6);
                                                }
                                            }
                                        }
/* 561 */                               if (i11 == 1) {
                                        }
                                    }
/* 564 */                           o1ooOoI0000Il00O6 = il0lI1i1olii.I0000Il00O(oi110o04);
                                }
/* 569 */                       if (arrayList != null) {
/* 571 */                           int size4 = arrayList.size();
/* 576 */                           for (int i12 = 0; i12 < size4; i12++) {
/* 584 */                               ((I0li1O0) arrayList.get(i12)).getClass();
                                    }
                                }
                            }
                        }
                    }
/* 606 */           if (!motionEvent2.isFromSource(2097152)) {
/* 2058 */              return super.dispatchGenericMotionEvent(motionEvent);
                    }
/* 608 */           OI01OO oi01oo2 = this.I0100i;
/* 610 */           Iol1IlIII10 iol1IlIII10 = this.I00iio;
/* 612 */           O1IOillioo0I o1IOillioo0I = oi01oo2.I0000oI00;
/* 614 */           SparseLongArray sparseLongArray = oi01oo2.I00000oOI;
/* 616 */           int actionMasked = motionEvent2.getActionMasked();
/* 620 */           oi01oo2.I00000oOI(motionEvent2);
/* 627 */           if (actionMasked == 3) {
/* 629 */               sparseLongArray.clear();
/* 634 */               oi01oo2.I0000Il00O.clear();
/* 637 */               iolIIo0o0Iio = iolIIo0o0Iio3;
/* 49 */                str = "visitAncestors called on an unattached node";
/* 641 */               i = 16;
/* 643 */               i00Ol00 = null;
                    } else {
/* 646 */               oi01oo2.I00000oIO(motionEvent2);
/* 650 */               if (actionMasked == 1) {
/* 668 */                   actionIndex = 0;
/* 669 */                   i = 16;
                        } else if (actionMasked != 6) {
/* 654 */                   i = 16;
/* 656 */                   actionIndex = -1;
                        } else {
/* 663 */                   i = 16;
/* 659 */                   actionIndex = motionEvent2.getActionIndex();
                        }
/* 681 */               boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
/* 683 */               int pointerCount = motionEvent2.getPointerCount();
/* 689 */               ArrayList arrayList2 = new ArrayList(pointerCount);
/* 692 */               int i13 = 0;
/* 693 */               while (i13 < pointerCount) {
/* 695 */                   int i14 = i6;
/* 697 */                   int pointerId = motionEvent2.getPointerId(i13);
/* 701 */                   int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
/* 707 */                   if (iIndexOfKey >= 0) {
/* 709 */                       long jValueAt = sparseLongArray.valueAt(iIndexOfKey);
/* 713 */                       str2 = str4;
/* 714 */                       i4 = pointerCount;
/* 716 */                       j = jValueAt;
/* 718 */                       i3 = actionMasked;
                            } else {
/* 721 */                       str2 = str4;
/* 722 */                       j = oi01oo2.I00000oIO;
/* 724 */                       i3 = actionMasked;
/* 726 */                       i4 = pointerCount;
/* 730 */                       oi01oo2.I00000oIO = j + 1;
/* 732 */                       sparseLongArray.put(pointerId, j);
                            }
/* 747 */                   SparseLongArray sparseLongArray2 = sparseLongArray;
/* 769 */                   long jFloatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent2.getX(i13)) << 32) | (Float.floatToRawIntBits(motionEvent2.getY(i13)) & 4294967295L);
/* 778 */                   ?? r10 = i13 != actionIndex ? i14 : 0;
/* 785 */                   OI01O0oi0 oI01O0oi0 = (OI01O0oi0) o1IOillioo0I.I00000oOI(j);
/* 793 */                   if (i13 == actionIndex) {
/* 795 */                       o1IOillioo0I.I0000oI00(j);
                            } else {
/* 805 */                       if (z6) {
/* 817 */                           oi01oo = oi01oo2;
/* 819 */                           str3 = str2;
/* 849 */                           long eventTime = 1 | ((motionEvent2.getEventTime() & 2147483647L) << i14) | (((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16)) << 32);
/* 851 */                           i5 = actionIndex;
/* 855 */                           OI01O0oi0 oI01O0oi02 = new OI01O0oi0();
/* 858 */                           oI01O0oi02.I00000oIO = eventTime;
/* 860 */                           VarHandle.storeStoreFence();
/* 863 */                           o1IOillioo0I.I0000O(j, oI01O0oi02);
                                }
/* 868 */                       Iol1IlIII10 iol1IlIII102 = iol1IlIII10;
/* 869 */                       O1IOillioo0I o1IOillioo0I2 = o1IOillioo0I;
/* 870 */                       long eventTime2 = motionEvent2.getEventTime();
/* 876 */                       float pressure = motionEvent2.getPressure(i13);
/* 880 */                       int i15 = i13;
/* 893 */                       long eventTime3 = oI01O0oi0 == null ? (oI01O0oi0.I00000oIO >> i14) & 2147483647L : motionEvent2.getEventTime();
/* 897 */                       IolIIo0o0Iio iolIIo0o0Iio4 = iolIIo0o0Iio3;
/* 899 */                       if (oI01O0oi0 == null) {
/* 905 */                           int i16 = (int) (oI01O0oi0.I00000oIO >>> 32);
/* 932 */                           jFloatToRawIntBits = (Float.floatToRawIntBits((short) (i16 >>> 16)) << 32) | (Float.floatToRawIntBits((short) (i16 & 65535)) & 4294967295L);
                                } else {
/* 935 */                           jFloatToRawIntBits = jFloatToRawIntBits2;
                                }
/* 936 */                       long j2 = jFloatToRawIntBits;
/* 953 */                       ?? r0 = (oI01O0oi0 != null || (oI01O0oi0.I00000oIO & 1) == 0) ? 0 : i14;
/* 954 */                       Iol1O1 iol1O1 = new Iol1O1();
/* 957 */                       iol1O1.I00000oIO = j;
/* 959 */                       iol1O1.I00000oOI = eventTime2;
/* 961 */                       iol1O1.I0000Il00O = jFloatToRawIntBits2;
/* 963 */                       iol1O1.I0000O = r10;
/* 965 */                       iol1O1.I0000oI00 = pressure;
/* 967 */                       iol1O1.I0001Ioi1lo = eventTime3;
/* 971 */                       iol1O1.I000II = j2;
/* 973 */                       iol1O1.I000O01llI0 = r0;
/* 975 */                       VarHandle.storeStoreFence();
/* 978 */                       arrayList2.add(iol1O1);
/* 981 */                       i13 = i15 + 1;
/* 985 */                       motionEvent2 = motionEvent;
/* 987 */                       sparseLongArray = sparseLongArray2;
/* 988 */                       i6 = i14;
/* 990 */                       actionMasked = i3;
/* 992 */                       pointerCount = i4;
/* 994 */                       iolIIo0o0Iio3 = iolIIo0o0Iio4;
/* 996 */                       actionIndex = i5;
/* 998 */                       iol1IlIII10 = iol1IlIII102;
/* 1000 */                      oi01oo2 = oi01oo;
/* 1002 */                      str4 = str3;
/* 1004 */                      o1IOillioo0I = o1IOillioo0I2;
                            }
/* 798 */                   oi01oo = oi01oo2;
/* 800 */                   str3 = str2;
/* 802 */                   i5 = actionIndex;
/* 868 */                   Iol1IlIII10 iol1IlIII1022 = iol1IlIII10;
/* 869 */                   O1IOillioo0I o1IOillioo0I22 = o1IOillioo0I;
/* 870 */                   long eventTime22 = motionEvent2.getEventTime();
/* 876 */                   float pressure2 = motionEvent2.getPressure(i13);
/* 880 */                   int i152 = i13;
/* 893 */                   if (oI01O0oi0 == null) {
                            }
/* 897 */                   IolIIo0o0Iio iolIIo0o0Iio42 = iolIIo0o0Iio3;
/* 899 */                   if (oI01O0oi0 == null) {
                            }
/* 936 */                   long j22 = jFloatToRawIntBits;
/* 953 */                   if (oI01O0oi0 != null) {
                            }
/* 954 */                   Iol1O1 iol1O12 = new Iol1O1();
/* 957 */                   iol1O12.I00000oIO = j;
/* 959 */                   iol1O12.I00000oOI = eventTime22;
/* 961 */                   iol1O12.I0000Il00O = jFloatToRawIntBits2;
/* 963 */                   iol1O12.I0000O = r10;
/* 965 */                   iol1O12.I0000oI00 = pressure2;
/* 967 */                   iol1O12.I0001Ioi1lo = eventTime3;
/* 971 */                   iol1O12.I000II = j22;
/* 973 */                   iol1O12.I000O01llI0 = r0;
/* 975 */                   VarHandle.storeStoreFence();
/* 978 */                   arrayList2.add(iol1O12);
/* 981 */                   i13 = i152 + 1;
/* 985 */                   motionEvent2 = motionEvent;
/* 987 */                   sparseLongArray = sparseLongArray2;
/* 988 */                   i6 = i14;
/* 990 */                   actionMasked = i3;
/* 992 */                   pointerCount = i4;
/* 994 */                   iolIIo0o0Iio3 = iolIIo0o0Iio42;
/* 996 */                   actionIndex = i5;
/* 998 */                   iol1IlIII10 = iol1IlIII1022;
/* 1000 */                  oi01oo2 = oi01oo;
/* 1002 */                  str4 = str3;
/* 1004 */                  o1IOillioo0I = o1IOillioo0I22;
                        }
/* 1011 */              iolIIo0o0Iio = iolIIo0o0Iio3;
/* 1013 */              str = str4;
/* 1016 */              int i17 = i6;
/* 1018 */              Iol1IlIII10 iol1IlIII103 = iol1IlIII10;
/* 1020 */              int i18 = actionMasked;
/* 1022 */              oi01oo2.I0000oI00(motionEvent2);
/* 1025 */              if (iol1IlIII103 != null) {
/* 1029 */                  i2 = iol1IlIII103.I00000oIO;
                        } else {
/* 1038 */                  if (!motionEvent2.isFromSource(2097152)) {
/* 2054 */                      I000II.I000iOII("MotionEvent must be a touch navigation source");
/* 2051 */                      return false;
                            }
/* 1040 */                  InputDevice device = motionEvent2.getDevice();
/* 1044 */                  if (device != null) {
/* 1047 */                      InputDevice.MotionRange motionRange = device.getMotionRange(0);
/* 1053 */                      InputDevice.MotionRange motionRange2 = device.getMotionRange(i17);
/* 1057 */                      if (motionRange == null || motionRange2 != null) {
/* 1063 */                          if (motionRange2 == null || motionRange != null) {
/* 1069 */                              if (motionRange != null && motionRange2 != null) {
/* 1073 */                                  float range = motionRange.getRange();
/* 1077 */                                  float range2 = motionRange2.getRange();
/* 1086 */                                  if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
/* 1102 */                                      if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                                }
                                            }
/* 1061 */                                  i2 = 1;
                                        }
/* 1115 */                              i2 = 0;
                                    }
/* 1067 */                          i2 = 2;
                                } else {
/* 1061 */                          i2 = 1;
                                }
                            } else {
/* 1115 */                      i2 = 0;
                            }
                        }
/* 1118 */              if (i18 == 0 || i18 == 1 || i18 == 2 || i18 != 5) {
                        }
/* 1134 */              i00Ol00 = new I00Ol00(1, (short) 0);
/* 1137 */              i00Ol00.I0000Il00O = arrayList2;
/* 1139 */              i00Ol00.I00000oOI = i2;
/* 1141 */              i00Ol00.I0000O = motionEvent2;
/* 1147 */              if (arrayList2.isEmpty()) {
/* 2047 */                  I000II.I000iOII("changes cannot be empty");
/* 2044 */                  return false;
                        }
/* 1149 */              VarHandle.storeStoreFence();
                    }
/* 1152 */          if (i00Ol00 == null) {
/* 1665 */              IolIIo0o0Iio iolIIo0o0Iio5 = iolIIo0o0Iio;
/* 1673 */              IliIO10oO0 iliIO10oO0I000II = ((Ili1ioOlo0oO) getFocusOwner()).I000II();
/* 1677 */              if (iliIO10oO0I000II != null) {
/* 1683 */                  if (!iliIO10oO0I000II.I00iOIl.I00lll10) {
/* 1685 */                      IolioOO1.I0000Il00O(str);
                            }
/* 1688 */                  O1ooOo o1ooOo7 = iliIO10oO0I000II.I00iOIl;
/* 1690 */                  O0iiOioolIi o0iiOioolIiI000O01llI03 = il0lI1i1olii.I000O01llI0(iliIO10oO0I000II);
                            loop26: while (true) {
/* 1694 */                      if (o0iiOioolIiI000O01llI03 == null) {
/* 1824 */                          iiIioO0ol1oI = 0;
                                    break;
                                }
/* 1704 */                      int i19 = 2097152;
/* 1708 */                      if ((((O1ooOo) o0iiOioolIiI000O01llI03.I010101Oo1lO.I00io1l).I00iio & 2097152) != 0) {
/* 1710 */                          while (o1ooOo7 != null) {
/* 1716 */                              if ((o1ooOo7.I00iiO & i19) != 0) {
/* 1718 */                                  iiIioO0ol1oI = o1ooOo7;
/* 1719 */                                  OI110O0 oi110o05 = null;
/* 1720 */                                  while (iiIioO0ol1oI != 0) {
/* 1724 */                                      if (iiIioO0ol1oI instanceof IolI11) {
                                                    break loop26;
                                                }
/* 1732 */                                      if ((iiIioO0ol1oI.I00iiO & i19) == 0 || !(iiIioO0ol1oI instanceof IiIioO0ol1oI)) {
/* 1796 */                                          o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o05);
                                                } else {
/* 1741 */                                          O1ooOo o1ooOo8 = iiIioO0ol1oI.I00o0l1o1o0;
/* 1744 */                                          OI110O0 oi110o06 = oi110o05;
/* 1745 */                                          O1ooOo o1ooOo9 = iiIioO0ol1oI;
/* 1746 */                                          int i20 = 0;
/* 1747 */                                          while (o1ooOo8 != null) {
/* 1753 */                                              if ((o1ooOo8.I00iiO & i19) != 0) {
/* 1755 */                                                  i20++;
/* 1758 */                                                  if (i20 == 1) {
/* 1760 */                                                      o1ooOo9 = o1ooOo8;
                                                            } else {
/* 1762 */                                                      if (oi110o06 == null) {
/* 1770 */                                                          oi110o06 = new OI110O0(new O1ooOo[16]);
                                                                }
/* 1773 */                                                      if (o1ooOo9 != null) {
/* 1775 */                                                          oi110o06.I00000oOI(o1ooOo9);
/* 1778 */                                                          o1ooOo9 = null;
                                                                }
/* 1779 */                                                      oi110o06.I00000oOI(o1ooOo8);
                                                            }
                                                        }
/* 1782 */                                              o1ooOo8 = o1ooOo8.I00ilO0;
/* 1784 */                                              i19 = 2097152;
                                                    }
/* 1788 */                                          if (i20 == 1) {
/* 1790 */                                              o1ooOoI0000Il00O = o1ooOo9;
/* 1791 */                                              oi110o05 = oi110o06;
                                                    } else {
/* 1795 */                                              oi110o05 = oi110o06;
/* 1796 */                                              o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o05);
                                                    }
                                                }
/* 1792 */                                      i19 = 2097152;
                                                iiIioO0ol1oI = o1ooOoI0000Il00O;
                                            }
                                        }
/* 1801 */                              o1ooOo7 = o1ooOo7.I00ilI0I1;
/* 1803 */                              i19 = 2097152;
                                    }
                                }
/* 1806 */                      o0iiOioolIiI000O01llI03 = o0iiOioolIiI000O01llI03.I001IO000();
/* 1821 */                      o1ooOo7 = (o0iiOioolIiI000O01llI03 == null || (iIlOoolol0ll2 = o0iiOioolIiI000O01llI03.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll2.I00ilO0;
                            }
/* 1825 */                  iolI11 = (IolI11) iiIioO0ol1oI;
                        } else {
/* 1828 */                  iolI11 = null;
                        }
/* 1829 */              if (iolI11 != null) {
/* 1832 */                  O1ooOo o1ooOo10 = (O1ooOo) iolI11;
/* 1838 */                  if (!o1ooOo10.I00iOIl.I00lll10) {
/* 1840 */                      IolioOO1.I0000Il00O(str);
                            }
/* 1845 */                  O1ooOo o1ooOo11 = o1ooOo10.I00iOIl.I00ilI0I1;
/* 1847 */                  O0iiOioolIi o0iiOioolIiI000O01llI04 = il0lI1i1olii.I000O01llI0(iolI11);
/* 1851 */                  ArrayList arrayList3 = null;
/* 1852 */                  while (o0iiOioolIiI000O01llI04 != null) {
/* 1862 */                      int i21 = 2097152;
/* 1866 */                      if ((((O1ooOo) o0iiOioolIiI000O01llI04.I010101Oo1lO.I00io1l).I00iio & 2097152) != 0) {
/* 1868 */                          while (o1ooOo11 != null) {
/* 1874 */                              if ((o1ooOo11.I00iiO & i21) != 0) {
/* 1876 */                                  O1ooOo o1ooOoI0000Il00O7 = o1ooOo11;
/* 1877 */                                  OI110O0 oi110o07 = null;
/* 1878 */                                  while (o1ooOoI0000Il00O7 != null) {
/* 1882 */                                      if (o1ooOoI0000Il00O7 instanceof IolI11) {
/* 1884 */                                          if (arrayList3 == null) {
/* 1888 */                                              arrayList3 = new ArrayList();
                                                    }
/* 1891 */                                          arrayList3.add(o1ooOoI0000Il00O7);
/* 1894 */                                          z = false;
                                                } else {
/* 1896 */                                          z = true;
                                                }
/* 1897 */                                      if (z) {
/* 1905 */                                          if ((o1ooOoI0000Il00O7.I00iiO & 2097152) != 0 && (o1ooOoI0000Il00O7 instanceof IiIioO0ol1oI)) {
/* 1917 */                                              OI110O0 oi110o08 = oi110o07;
/* 1918 */                                              O1ooOo o1ooOo12 = o1ooOoI0000Il00O7;
/* 1919 */                                              int i22 = 0;
/* 1920 */                                              for (O1ooOo o1ooOo13 = ((IiIioO0ol1oI) o1ooOoI0000Il00O7).I00o0l1o1o0; o1ooOo13 != null; o1ooOo13 = o1ooOo13.I00ilO0) {
/* 1926 */                                                  if ((o1ooOo13.I00iiO & 2097152) != 0) {
/* 1928 */                                                      i22++;
/* 1931 */                                                      if (i22 == 1) {
/* 1933 */                                                          o1ooOo12 = o1ooOo13;
                                                                } else {
/* 1937 */                                                          if (oi110o08 == null) {
/* 1945 */                                                              oi110o08 = new OI110O0(new O1ooOo[16]);
                                                                    }
/* 1951 */                                                          if (o1ooOo12 != null) {
/* 1953 */                                                              oi110o08.I00000oOI(o1ooOo12);
/* 1956 */                                                              o1ooOo12 = null;
                                                                    }
/* 1957 */                                                          oi110o08.I00000oOI(o1ooOo13);
                                                                }
                                                            }
                                                        }
/* 1966 */                                              if (i22 == 1) {
/* 1968 */                                                  o1ooOoI0000Il00O7 = o1ooOo12;
/* 1969 */                                                  oi110o07 = oi110o08;
                                                        } else {
/* 1971 */                                                  oi110o07 = oi110o08;
                                                        }
                                                    }
                                                }
/* 1980 */                                      o1ooOoI0000Il00O7 = il0lI1i1olii.I0000Il00O(oi110o07);
                                            }
                                        }
/* 1987 */                              i21 = 2097152;
/* 1989 */                              o1ooOo11 = o1ooOo11.I00ilI0I1;
                                    }
                                }
/* 1994 */                      o0iiOioolIiI000O01llI04 = o0iiOioolIiI000O01llI04.I001IO000();
/* 2010 */                      o1ooOo11 = (o0iiOioolIiI000O01llI04 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI04.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                            }
/* 2013 */                  iolI11.I00iIi0i1o();
/* 2016 */                  if (arrayList3 != null) {
/* 2018 */                      int size5 = arrayList3.size();
/* 2023 */                      for (int i23 = 0; i23 < size5; i23++) {
/* 2031 */                          ((IolI11) arrayList3.get(i23)).I00iIi0i1o();
                                }
                            }
                        }
/* 2038 */              iolIIo0o0Iio5.I00000oOI = 0;
/* 2041 */              iolIIo0o0Iio5.I00000oIO = true;
/* 2040 */              return true;
                    }
/* 1158 */          Ili1ioOlo0oO ili1ioOlo0oO2 = (Ili1ioOlo0oO) getFocusOwner();
/* 1164 */          if (ili1ioOlo0oO2.I0000O.I0000oI00) {
/* 1170 */              System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
                    } else {
/* 1176 */              IliIO10oO0 iliIO10oO0I000II2 = ili1ioOlo0oO2.I000II();
/* 1180 */              if (iliIO10oO0I000II2 != null) {
/* 1186 */                  if (!iliIO10oO0I000II2.I00iOIl.I00lll10) {
/* 1188 */                      IolioOO1.I0000Il00O(str);
                            }
/* 1191 */                  O1ooOo o1ooOo14 = iliIO10oO0I000II2.I00iOIl;
/* 1193 */                  O0iiOioolIi o0iiOioolIiI000O01llI05 = il0lI1i1olii.I000O01llI0(iliIO10oO0I000II2);
                            loop14: while (true) {
/* 1197 */                      if (o0iiOioolIiI000O01llI05 == null) {
/* 1329 */                          iiIioO0ol1oI2 = 0;
                                    break;
                                }
/* 1207 */                      int i24 = 2097152;
/* 1211 */                      if ((((O1ooOo) o0iiOioolIiI000O01llI05.I010101Oo1lO.I00io1l).I00iio & 2097152) != 0) {
/* 1213 */                          while (o1ooOo14 != null) {
/* 1219 */                              if ((o1ooOo14.I00iiO & i24) != 0) {
/* 1221 */                                  iiIioO0ol1oI2 = o1ooOo14;
/* 1222 */                                  OI110O0 oi110o09 = null;
/* 1223 */                                  while (iiIioO0ol1oI2 != 0) {
/* 1227 */                                      if (iiIioO0ol1oI2 instanceof IolI11) {
                                                    break loop14;
                                                }
                                                OI110O0 oi110o010 = oi110o09;
/* 1235 */                                      if ((iiIioO0ol1oI2.I00iiO & i24) != 0) {
                                                    oi110o010 = oi110o09;
/* 1239 */                                          if (iiIioO0ol1oI2 instanceof IiIioO0ol1oI) {
/* 1244 */                                              O1ooOo o1ooOo15 = iiIioO0ol1oI2.I00o0l1o1o0;
/* 1246 */                                              int i25 = 0;
                                                        o1ooOoI0000Il00O2 = iiIioO0ol1oI2;
                                                        oi110o010 = oi110o09;
/* 1247 */                                              while (o1ooOo15 != null) {
/* 1253 */                                                  if ((o1ooOo15.I00iiO & i24) != 0) {
/* 1255 */                                                      i25++;
                                                                oi110o010 = oi110o010;
/* 1258 */                                                      if (i25 == 1) {
/* 1260 */                                                          o1ooOoI0000Il00O2 = o1ooOo15;
                                                                } else {
/* 1262 */                                                          if (oi110o010 == null) {
/* 1270 */                                                              oi110o010 = new OI110O0(new O1ooOo[i]);
                                                                    }
/* 1273 */                                                          if (o1ooOoI0000Il00O2 != null) {
/* 1275 */                                                              oi110o010.I00000oOI(o1ooOoI0000Il00O2);
/* 1278 */                                                              o1ooOoI0000Il00O2 = null;
                                                                    }
/* 1279 */                                                          oi110o010.I00000oOI(o1ooOo15);
                                                                }
                                                            }
/* 1282 */                                                  o1ooOo15 = o1ooOo15.I00ilO0;
/* 1284 */                                                  i = 16;
/* 1286 */                                                  i24 = 2097152;
                                                            o1ooOoI0000Il00O2 = o1ooOoI0000Il00O2;
                                                            oi110o010 = oi110o010;
                                                        }
                                                        oi110o010 = oi110o010;
/* 1290 */                                              if (i25 != 1) {
/* 1297 */                                                  o1ooOoI0000Il00O2 = il0lI1i1olii.I0000Il00O(oi110o010);
                                                        }
                                                    }
                                                }
/* 1292 */                                      i = 16;
/* 1294 */                                      i24 = 2097152;
                                                iiIioO0ol1oI2 = o1ooOoI0000Il00O2;
                                                oi110o09 = oi110o010;
                                            }
                                        }
/* 1302 */                              o1ooOo14 = o1ooOo14.I00ilI0I1;
/* 1304 */                              i = 16;
/* 1306 */                              i24 = 2097152;
                                    }
                                }
/* 1309 */                      o0iiOioolIiI000O01llI05 = o0iiOioolIiI000O01llI05.I001IO000();
/* 1324 */                      o1ooOo14 = (o0iiOioolIiI000O01llI05 == null || (iIlOoolol0ll4 = o0iiOioolIiI000O01llI05.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll4.I00ilO0;
/* 1325 */                      i = 16;
                            }
/* 1330 */                  iolI112 = (IolI11) iiIioO0ol1oI2;
                        } else {
/* 1333 */                  iolI112 = null;
                        }
/* 1334 */              if (iolI112 != null) {
/* 1337 */                  O1ooOo o1ooOo16 = (O1ooOo) iolI112;
/* 1343 */                  if (!o1ooOo16.I00iOIl.I00lll10) {
/* 1345 */                      IolioOO1.I0000Il00O(str);
                            }
/* 1350 */                  O1ooOo o1ooOo17 = o1ooOo16.I00iOIl.I00ilI0I1;
/* 1352 */                  O0iiOioolIi o0iiOioolIiI000O01llI06 = il0lI1i1olii.I000O01llI0(iolI112);
/* 1356 */                  ArrayList arrayList4 = null;
/* 1357 */                  while (o0iiOioolIiI000O01llI06 != null) {
/* 1367 */                      int i26 = 2097152;
/* 1371 */                      if ((((O1ooOo) o0iiOioolIiI000O01llI06.I010101Oo1lO.I00io1l).I00iio & 2097152) != 0) {
/* 1373 */                          while (o1ooOo17 != null) {
/* 1379 */                              if ((o1ooOo17.I00iiO & i26) != 0) {
/* 1381 */                                  O1ooOo o1ooOoI0000Il00O8 = o1ooOo17;
/* 1382 */                                  OI110O0 oi110o011 = null;
/* 1383 */                                  while (o1ooOoI0000Il00O8 != null) {
/* 1387 */                                      if (o1ooOoI0000Il00O8 instanceof IolI11) {
/* 1389 */                                          if (arrayList4 == null) {
/* 1393 */                                              arrayList4 = new ArrayList();
                                                    }
/* 1396 */                                          arrayList4.add(o1ooOoI0000Il00O8);
/* 1399 */                                          z3 = false;
                                                } else {
/* 1401 */                                          z3 = true;
                                                }
/* 1402 */                                      if (z3) {
/* 1406 */                                          int i27 = 2097152;
/* 1410 */                                          if ((o1ooOoI0000Il00O8.I00iiO & 2097152) != 0 && (o1ooOoI0000Il00O8 instanceof IiIioO0ol1oI)) {
/* 1419 */                                              O1ooOo o1ooOo18 = ((IiIioO0ol1oI) o1ooOoI0000Il00O8).I00o0l1o1o0;
/* 1421 */                                              int i28 = 0;
/* 1422 */                                              while (o1ooOo18 != null) {
/* 1428 */                                                  if ((o1ooOo18.I00iiO & i27) != 0) {
/* 1430 */                                                      i28++;
/* 1433 */                                                      if (i28 == 1) {
/* 1435 */                                                          o1ooOoI0000Il00O8 = o1ooOo18;
                                                                } else {
/* 1437 */                                                          if (oi110o011 == null) {
/* 1445 */                                                              oi110o011 = new OI110O0(new O1ooOo[16]);
                                                                    }
/* 1448 */                                                          if (o1ooOoI0000Il00O8 != null) {
/* 1450 */                                                              oi110o011.I00000oOI(o1ooOoI0000Il00O8);
/* 1453 */                                                              o1ooOoI0000Il00O8 = null;
                                                                    }
/* 1454 */                                                          oi110o011.I00000oOI(o1ooOo18);
                                                                }
                                                            }
/* 1457 */                                                  o1ooOo18 = o1ooOo18.I00ilO0;
/* 1459 */                                                  i27 = 2097152;
                                                        }
/* 1463 */                                              if (i28 == 1) {
                                                        }
                                                    }
                                                }
/* 1466 */                                      o1ooOoI0000Il00O8 = il0lI1i1olii.I0000Il00O(oi110o011);
                                            }
                                        }
/* 1471 */                              o1ooOo17 = o1ooOo17.I00ilI0I1;
/* 1473 */                              i26 = 2097152;
                                    }
                                }
/* 1476 */                      o0iiOioolIiI000O01llI06 = o0iiOioolIiI000O01llI06.I001IO000();
/* 1492 */                      o1ooOo17 = (o0iiOioolIiI000O01llI06 == null || (iIlOoolol0ll3 = o0iiOioolIiI000O01llI06.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll3.I00ilO0;
                            }
/* 1495 */                  if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                                while (true) {
                                    int i29 = size2 - 1;
/* 1515 */                          ((IolI11) arrayList4.get(size2)).I0010o(i00Ol00, OO1i0l.I00iOIl);
/* 1518 */                          if (i29 < 0) {
                                        break;
                                    }
/* 1521 */                          size2 = i29;
                                }
                            }
/* 1525 */                  iolI112.I0010o(i00Ol00, OO1i0l.I00iOIl);
/* 1530 */                  iolI112.I0010o(i00Ol00, OO1i0l.I00iiI);
/* 1533 */                  if (arrayList4 != null) {
/* 1535 */                      int size6 = arrayList4.size();
/* 1540 */                      for (int i30 = 0; i30 < size6; i30++) {
/* 1550 */                          ((IolI11) arrayList4.get(i30)).I0010o(i00Ol00, OO1i0l.I00iiI);
                                }
                            }
/* 1556 */                  if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                                while (true) {
                                    int i31 = size - 1;
/* 1576 */                          ((IolI11) arrayList4.get(size)).I0010o(i00Ol00, OO1i0l.I00iiO);
/* 1579 */                          if (i31 < 0) {
                                        break;
                                    }
/* 1582 */                          size = i31;
                                }
                            }
/* 1586 */                  iolI112.I0010o(i00Ol00, OO1i0l.I00iiO);
                        }
/* 1591 */              ArrayList arrayList5 = (ArrayList) i00Ol00.I0000Il00O;
/* 1593 */              int size7 = arrayList5.size();
/* 1598 */              for (int i32 = 0; i32 < size7; i32++) {
/* 1608 */                  if (((Iol1O1) arrayList5.get(i32)).I000OOo1O) {
/* 1610 */                      z2 = true;
                                break;
                            }
                        }
                    }
/* 1173 */          z2 = false;
/* 1615 */          iolIIo0o0Iio.getClass();
/* 1620 */          MotionEvent motionEvent3 = (MotionEvent) i00Ol00.I0000O;
/* 1622 */          int action = motionEvent3.getAction();
/* 1626 */          if (action != 0) {
/* 1628 */              z4 = true;
/* 1629 */              if ((action == 1 || action == 2) && z2) {
/* 1639 */                  iolIIo0o0Iio2 = iolIIo0o0Iio;
/* 1642 */                  iolIIo0o0Iio2.I00000oOI = 0;
/* 1644 */                  iolIIo0o0Iio2.I00000oIO = true;
                        } else {
/* 1634 */                  iolIIo0o0Iio2 = iolIIo0o0Iio;
                        }
                    } else {
/* 1647 */              iolIIo0o0Iio2 = iolIIo0o0Iio;
/* 1650 */              z4 = true;
/* 1653 */              iolIIo0o0Iio2.I00000oOI = i00Ol00.I00000oOI;
/* 1655 */              iolIIo0o0Iio2.I00000oIO = false;
                    }
/* 1661 */          ((GestureDetector) iolIIo0o0Iio2.I0000O).onTouchEvent(motionEvent3);
/* 1664 */          return z4;
                }

                /* JADX WARN: Code restructure failed: missing block: B:75:0x015d, code lost:
                
                    if (I000oI1ioi(r24) == false) goto L76;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
                    boolean zDispatchGenericMotionEvent;
                    int actionMasked;
                    int iI001i1O0Ol;
/* 5 */             I0li0Io i0li0Io = this.I01Iio10lo;
/* 9 */             if (this.I01IlIoOI) {
/* 11 */                removeCallbacks(i0li0Io);
/* 14 */                i0li0Io.run();
                    }
/* 22 */            if (!I000lI(motionEvent) && isAttachedToWindow()) {
/* 32 */                I0ll1oo i0ll1oo = this.I00ol1;
/* 34 */                I0lio1O01i01 i0lio1O01i01 = i0ll1oo.I00iio;
/* 36 */                AccessibilityManager accessibilityManager = i0ll1oo.I00io1l;
/* 46 */                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
/* 54 */                    int action = motionEvent.getAction();
/* 67 */                    if (action == 7 || action == 9) {
/* 108 */                       float x = motionEvent.getX();
/* 112 */                       float y = motionEvent.getY();
/* 116 */                       i0lio1O01i01.I0010I0i(true);
/* 121 */                       Io1l0iI11iII io1l0iI11iII = new Io1l0iI11iII();
/* 150 */                       long jFloatToRawIntBits = (Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32);
/* 151 */                       IIlOoolol0ll iIlOoolol0ll = i0lio1O01i01.getRoot().I010101Oo1lO;
/* 155 */                       OIIlIII0Ili oIIlIII0Ili = (OIIlIII0Ili) iIlOoolol0ll.I00ilI0I1;
/* 157 */                       OI1lOo oI1lOo = OIIlIII0Ili.I0110o;
/* 175 */                       ((OIIlIII0Ili) iIlOoolol0ll.I00ilI0I1).I011Ill(OIIlIII0Ili.I011Ol0, oIIlIII0Ili.I010o0o0oO(jFloatToRawIntBits, true), io1l0iI11iII, 1, true);
/* 185 */                       for (int iI000II = IOOi1I.I000II(io1l0iI11iII); -1 < iI000II; iI000II--) {
/* 195 */                           O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0((O1ooOo) io1l0iI11iII.I00iOIl.I000II(iI000II));
/* 199 */                           I10OIIo androidViewsHandler$ui = i0lio1O01i01.getAndroidViewsHandler$ui();
/* 217 */                           if ((androidViewsHandler$ui != null ? androidViewsHandler$ui.getLayoutNodeToHolder().get(o0iiOioolIiI000O01llI0) : null) != null) {
                                        break;
                                    }
/* 230 */                           if (o0iiOioolIiI000O01llI0.I010101Oo1lO.I000iOII(8)) {
/* 235 */                               iI001i1O0Ol = i0ll1oo.I001i1O0Ol(o0iiOioolIiI000O01llI0.I00iiI);
/* 239 */                               Oil000 oil000I00000oIO = lO1OlOlOlli.I00000oIO(o0iiOioolIiI000O01llI0, false);
/* 247 */                               if (iO0o00ili.I0001Ioi1lo(oil000I00000oIO) && !lO1OoI1l1.I00000oIO(oil000I00000oIO)) {
                                            break;
                                        }
                                    }
                                }
/* 219 */                       iI001i1O0Ol = Integer.MIN_VALUE;
/* 259 */                       I10OIIo androidViewsHandler$ui2 = i0lio1O01i01.getAndroidViewsHandler$ui();
/* 270 */                       boolean zDispatchGenericMotionEvent2 = androidViewsHandler$ui2 != null ? androidViewsHandler$ui2.dispatchGenericMotionEvent(motionEvent) : false;
/* 271 */                       int i = i0ll1oo.I00ilI0I1;
/* 273 */                       if (i != iI001i1O0Ol) {
/* 278 */                           i0ll1oo.I00ilI0I1 = iI001i1O0Ol;
/* 284 */                           I0ll1oo.I001lIiIIo1O(i0ll1oo, iI001i1O0Ol, Barcode.FORMAT_ITF, null, 12);
/* 287 */                           I0ll1oo.I001lIiIIo1O(i0ll1oo, i, Barcode.FORMAT_QR_CODE, null, 12);
                                }
/* 293 */                       zDispatchGenericMotionEvent = iI001i1O0Ol == Integer.MIN_VALUE ? zDispatchGenericMotionEvent2 : true;
/* 294 */                       actionMasked = motionEvent.getActionMasked();
/* 298 */                       if (actionMasked == 7) {
                                }
                            } else if (action == 10) {
/* 78 */                        int i2 = i0ll1oo.I00ilI0I1;
/* 80 */                        if (i2 != Integer.MIN_VALUE) {
/* 82 */                            if (i2 != Integer.MIN_VALUE) {
/* 85 */                                i0ll1oo.I00ilI0I1 = Integer.MIN_VALUE;
/* 87 */                                I0ll1oo.I001lIiIIo1O(i0ll1oo, Integer.MIN_VALUE, Barcode.FORMAT_ITF, null, 12);
/* 90 */                                I0ll1oo.I001lIiIIo1O(i0ll1oo, i2, Barcode.FORMAT_QR_CODE, null, 12);
                                    }
/* 294 */                           actionMasked = motionEvent.getActionMasked();
/* 298 */                           if (actionMasked == 7) {
                                    }
                                } else {
/* 96 */                            I10OIIo androidViewsHandler$ui3 = i0lio1O01i01.getAndroidViewsHandler$ui();
/* 100 */                           if (androidViewsHandler$ui3 != null) {
/* 102 */                               zDispatchGenericMotionEvent = androidViewsHandler$ui3.dispatchGenericMotionEvent(motionEvent);
                                    }
/* 294 */                           actionMasked = motionEvent.getActionMasked();
/* 298 */                           if (actionMasked == 7) {
                                    }
                                }
                            }
                        } else {
/* 75 */                    zDispatchGenericMotionEvent = false;
/* 294 */                   actionMasked = motionEvent.getActionMasked();
/* 298 */                   if (actionMasked == 7) {
/* 302 */                       if (actionMasked == 10 && I000o00OoI0I(motionEvent)) {
/* 316 */                           if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
/* 325 */                               MotionEvent motionEvent2 = this.I011olOoO;
/* 327 */                               if (motionEvent2 != null) {
/* 329 */                                   motionEvent2.recycle();
                                        }
/* 336 */                               this.I011olOoO = MotionEvent.obtainNoHistory(motionEvent);
/* 338 */                               this.I01IlIoOI = true;
/* 342 */                               postDelayed(i0li0Io, 8L);
/* 345 */                               return zDispatchGenericMotionEvent;
                                    }
/* 352 */                           return zDispatchGenericMotionEvent;
                                }
/* 358 */                       if ((I000OOo1O(motionEvent) & 1) != 0 || zDispatchGenericMotionEvent) {
/* 45 */                            return true;
                                }
                            }
                        }
                    }
/* 21 */            return false;
                }

                @Override
                public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
/* 5 */             if (!isFocused()) {
/* 63 */                Ili1iIl focusOwner = getFocusOwner();
/* 70 */                I01ii1IIl i01ii1IIl = new I01ii1IIl(7);
/* 73 */                i01ii1IIl.I00iiI = this;
/* 75 */                i01ii1IIl.I00iiO = keyEvent;
/* 77 */                VarHandle.storeStoreFence();
/* 82 */                return ((Ili1ioOlo0oO) focusOwner).I0000oI00(keyEvent, i01ii1IIl);
                    }
/* 9 */             O0oI1IIioO0 o0oI1IIioO0 = this.I00iOIl.I00111O;
/* 11 */            int metaState = keyEvent.getMetaState();
/* 15 */            o0oI1IIioO0.getClass();
/* 18 */            OIooliIO0 oIooliIO0 = i00IiooO.I00000oIO;
/* 22 */            OO1ioiIO1 oO1ioiIO1 = new OO1ioiIO1();
/* 25 */            oO1ioiIO1.I00000oIO = metaState;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            oIooliIO0.setValue(oO1ioiIO1);
                    return ((Ili1ioOlo0oO) getFocusOwner()).I0000oI00(keyEvent, new O0o0Ol0(22)) || super.dispatchKeyEvent(keyEvent);
                }

                @Override
                public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                    IIlOoolol0ll iIlOoolol0ll;
/* 7 */             if (isFocused()) {
/* 13 */                Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) getFocusOwner();
/* 19 */                if (ili1ioOlo0oO.I0000O.I0000oI00) {
/* 25 */                    System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
                        } else {
/* 32 */                    IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(ili1ioOlo0oO.I0000Il00O);
/* 36 */                    if (iliIO10oO0I00000oIO != null) {
/* 42 */                        if (!iliIO10oO0I00000oIO.I00iOIl.I00lll10) {
/* 46 */                            IolioOO1.I0000Il00O("visitAncestors called on an unattached node");
                                }
/* 49 */                        O1ooOo o1ooOo = iliIO10oO0I00000oIO.I00iOIl;
/* 51 */                        O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(iliIO10oO0I00000oIO);
/* 55 */                        while (o0iiOioolIiI000O01llI0 != null) {
/* 69 */                            if ((((O1ooOo) o0iiOioolIiI000O01llI0.I010101Oo1lO.I00io1l).I00iio & 131072) != 0) {
/* 71 */                                while (o1ooOo != null) {
/* 76 */                                    if ((o1ooOo.I00iiO & 131072) != 0) {
/* 78 */                                        O1ooOo o1ooOoI0000Il00O = o1ooOo;
/* 79 */                                        OI110O0 oi110o0 = null;
/* 80 */                                        while (o1ooOoI0000Il00O != null) {
/* 85 */                                            if ((o1ooOoI0000Il00O.I00iiO & 131072) != 0 && (o1ooOoI0000Il00O instanceof IiIioO0ol1oI)) {
/* 96 */                                                int i = 0;
/* 97 */                                                for (O1ooOo o1ooOo2 = ((IiIioO0ol1oI) o1ooOoI0000Il00O).I00o0l1o1o0; o1ooOo2 != null; o1ooOo2 = o1ooOo2.I00ilO0) {
/* 102 */                                                   if ((o1ooOo2.I00iiO & 131072) != 0) {
/* 104 */                                                       i++;
/* 106 */                                                       if (i == 1) {
/* 108 */                                                           o1ooOoI0000Il00O = o1ooOo2;
                                                                } else {
/* 110 */                                                           if (oi110o0 == null) {
/* 118 */                                                               oi110o0 = new OI110O0(new O1ooOo[16]);
                                                                    }
/* 121 */                                                           if (o1ooOoI0000Il00O != null) {
/* 123 */                                                               oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 126 */                                                               o1ooOoI0000Il00O = null;
                                                                    }
/* 127 */                                                           oi110o0.I00000oOI(o1ooOo2);
                                                                }
                                                            }
                                                        }
/* 133 */                                               if (i == 1) {
                                                        }
                                                    }
/* 136 */                                           o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                                }
                                            }
/* 141 */                                   o1ooOo = o1ooOo.I00ilI0I1;
                                        }
                                    }
/* 144 */                           o0iiOioolIiI000O01llI0 = o0iiOioolIiI000O01llI0.I001IO000();
/* 159 */                           o1ooOo = (o0iiOioolIiI000O01llI0 == null || (iIlOoolol0ll = o0iiOioolIiI000O01llI0.I010101Oo1lO) == null) ? null : (Olo11IOO) iIlOoolol0ll.I00ilO0;
                                }
                            }
                        }
                    }
                    return super.dispatchKeyEventPreIme(keyEvent);
                }

                @Override
                public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
/* 2 */             this.I01Io1ilOIIo = true;
                    try {
/* 5 */                 super.dispatchProvideAutofillStructure(viewStructure, i);
/* 8 */                 this.I01Io1ilOIIo = false;
/* 10 */                I001l0I00(viewStructure);
                    } catch (Throwable th) {
/* 15 */                this.I01Io1ilOIIo = false;
/* 37 */                throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
                    IliIO10oO0 iliIO10oO0I000II;
/* 1 */             I0li0Io i0li0Io = this.I01Iio10lo;
/* 6 */             if (this.I01IlIoOI) {
/* 8 */                 removeCallbacks(i0li0Io);
/* 11 */                MotionEvent motionEvent2 = this.I011olOoO;
/* 17 */                if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
/* 40 */                    this.I01IlIoOI = false;
                        } else {
/* 43 */                    i0li0Io.run();
                        }
                    }
/* 50 */            if (!I000lI(motionEvent) && isAttachedToWindow()) {
/* 65 */                if (motionEvent.getActionMasked() == 2) {
/* 67 */                    I000oI1ioi(motionEvent);
                        }
/* 70 */                int iI000OOo1O = I000OOo1O(motionEvent);
/* 77 */                if ((iI000OOo1O & 2) != 0) {
/* 83 */                    getParent().requestDisallowInterceptTouchEvent(true);
                        }
/* 102 */               boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
/* 123 */               boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
/* 124 */               if (z && z2) {
/* 128 */                   Object parent = getParent();
/* 139 */                   View view = parent instanceof View ? (View) parent : null;
/* 140 */                   if (view != null) {
/* 145 */                       Object tag = view.getTag(R.id.auto_clear_focus_behavior_tag);
                                Object obj = tag;
/* 149 */                       if (tag == null) {
/* 153 */                           I1iiii1Olo1 i1iiii1Olo1 = new I1iiii1Olo1();
/* 156 */                           i1iiii1Olo1.I00000oIO = 1;
/* 158 */                           VarHandle.storeStoreFence();
                                    obj = i1iiii1Olo1;
                                }
/* 163 */                       I1iiii1Olo1 i1iiii1Olo12 = new I1iiii1Olo1();
/* 166 */                       i1iiii1Olo12.I00000oIO = 1;
/* 168 */                       VarHandle.storeStoreFence();
/* 175 */                       if (obj.equals(i1iiii1Olo12) && (iliIO10oO0I000II = ((Ili1ioOlo0oO) getFocusOwner()).I000II()) != null) {
/* 189 */                           OIIlIII0Ili oIIlIII0IliI000II = il0lI1i1olii.I000II(iliIO10oO0I000II);
/* 233 */                           if (!l0o0IlOil1.I0000Il00O(oIIlIII0IliI000II).I00IoiI(oIIlIII0IliI000II, true).I00000oIO((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
/* 239 */                               Ili1iIl.I00000oIO(getFocusOwner());
                                    }
                                }
                            }
                        }
/* 244 */               if ((iI000OOo1O & 1) != 0) {
/* 76 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    try {
/* 13 */                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
/* 17 */                declaredMethod.setAccessible(true);
/* 28 */                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
/* 34 */                if (objInvoke instanceof View) {
/* 36 */                    return (View) objInvoke;
                        }
/* 39 */                return null;
                    } catch (NoSuchMethodException unused) {
/* 39 */                return null;
                    }
                }

                @Override
                public final View focusSearch(View view, int i) {
                    OOo0IO oOo0IOI00000oIO;
/* 1 */             if (view == null || this.I010l1ol111.I0000Il00O) {
/* 146 */               return super.focusSearch(view, i);
                    }
/* 21 */            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
/* 26 */            if (viewFindNextFocus == null || !I0lllI01iooo.I00000oIO(this, viewFindNextFocus)) {
/* 35 */                viewFindNextFocus = null;
                    }
/* 36 */            if (view == this) {
/* 46 */                IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(((Ili1ioOlo0oO) getFocusOwner()).I0000Il00O);
/* 52 */                oOo0IOI00000oIO = iliIO10oO0I00000oIO != null ? iliI1i0.I00000oOI(iliIO10oO0I00000oIO) : null;
/* 56 */                if (oOo0IOI00000oIO == null) {
/* 58 */                    oOo0IOI00000oIO = Ili11o0l.I00000oIO(view, this);
                        }
                    } else {
/* 63 */                oOo0IOI00000oIO = Ili11o0l.I00000oIO(view, this);
                    }
/* 67 */            Ili0i1il0l0l ili0i1il0l0lI0000O = Ili11o0l.I0000O(i);
/* 76 */            int i2 = ili0i1il0l0lI0000O != null ? ili0i1il0l0lI0000O.I00000oIO : 6;
/* 79 */            OOo0ooi oOo0ooi = new OOo0ooi();
/* 82 */            Ili1iIl focusOwner = getFocusOwner();
/* 89 */            I0lOo1lO i0lOo1lO = new I0lOo1lO(0);
/* 92 */            i0lOo1lO.I00iiI = oOo0ooi;
/* 94 */            VarHandle.storeStoreFence();
/* 103 */           if (((Ili1ioOlo0oO) focusOwner).I0001Ioi1lo(i2, oOo0IOI00000oIO, i0lOo1lO) == null) {
/* 105 */               return view;
                    }
/* 106 */           Object obj = oOo0ooi.I00iOIl;
/* 108 */           if (obj == null) {
/* 110 */               if (viewFindNextFocus == null) {
/* 112 */                   return super.focusSearch(view, i);
                        }
                    } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || lOoOol0.I000II(iliI1i0.I00000oOI((IliIO10oO0) obj), Ili11o0l.I00000oIO(viewFindNextFocus, this), oOo0IOI00000oIO, i2)) {
/* 144 */               return this;
                    }
/* 145 */           return viewFindNextFocus;
                }

                public I01o0I getAccessibilityManager() {
/* 3 */             return this.I00iOIl.I000iOII;
                }

                public final I10OIIo getAndroidViewsHandler$ui() {
/* 1 */             return this.I010ioo;
                }

                public I1lOlO0ioIl0 getAutofillTree() {
/* 1 */             return this.I00oliIiO01i;
                }

                public IOO0IOIll getClipboard() {
/* 3 */             return this.I00iOIl.I000o00OoI0I;
                }

                public IOO0i0o1O0l getClipboardManager() {
/* 3 */             return this.I00iOIl.I000lI;
                }

                public final IOl10lI1 getComposeViewContext() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean getComposeViewContextIncrementedDuringInit$ui() {
/* 1 */             return this.I01Io11IiiiO;
                }

                public final Configuration getConfiguration() {
/* 7 */             return (Configuration) this.I010101Oo1lO.getValue();
                }

                public final I0lo1oIo getContentCaptureManager$ui() {
/* 1 */             return this.I00olI;
                }

                public Ii00l101O getCoroutineContext() {
/* 1 */             return this.I00lll10;
                }

                public IiIooOOOI getDensity() {
/* 7 */             return (IiIooOOOI) this.I00li1OI.getValue();
                }

                public OOo0IO getEmbeddedViewFocusRect() {
/* 6 */             if (isFocused()) {
/* 16 */                IliIO10oO0 iliIO10oO0I00000oIO = iliI1i0.I00000oIO(((Ili1ioOlo0oO) getFocusOwner()).I0000Il00O);
/* 20 */                if (iliIO10oO0I00000oIO != null) {
/* 22 */                    return iliI1i0.I00000oOI(iliIO10oO0I00000oIO);
                        }
/* 5 */                 return null;
                    }
/* 28 */            View viewFindFocus = findFocus();
/* 32 */            if (viewFindFocus != null) {
/* 34 */                return Ili11o0l.I00000oIO(viewFindFocus, this);
                    }
/* 5 */             return null;
                }

                public Ili1iIl getFocusOwner() {
/* 1 */             return this.I00lli11;
                }

                @Override
                public final void getFocusedRect(Rect rect) {
/* 1 */             OOo0IO embeddedViewFocusRect = getEmbeddedViewFocusRect();
/* 5 */             if (embeddedViewFocusRect != null) {
/* 13 */                rect.left = Math.round(embeddedViewFocusRect.I00000oIO);
/* 21 */                rect.top = Math.round(embeddedViewFocusRect.I00000oOI);
/* 29 */                rect.right = Math.round(embeddedViewFocusRect.I0000Il00O);
/* 37 */                rect.bottom = Math.round(embeddedViewFocusRect.I0000O);
/* 39 */                return;
                    }
/* 65 */            if (O0000Ioio00.I0000O(((Ili1ioOlo0oO) getFocusOwner()).I0001Ioi1lo(6, null, new I01OoIoio00O(16)), Boolean.TRUE)) {
/* 73 */                super.getFocusedRect(rect);
                    } else {
/* 69 */                rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                }

                public IliO0o11i01 getFontFamilyResolver() {
/* 7 */             return (IliO0o11i01) this.I011iO.getValue();
                }

                public IliIlo getFontLoader() {
/* 3 */             return this.I00iOIl.I000oI1ioi;
                }

                public final O0oiioII1 getFrameEndScheduler$ui() {
/* 1 */             return this.I00ilI0I1;
                }

                public Io10IIII getGraphicsContext() {
/* 1 */             return this.I00oli;
                }

                public Io1I0l getHapticFeedBack() {
/* 3 */             return this.I00iOIl.I00100o1O0lo;
                }

                public boolean getHasPendingMeasureOrLayout() {
                    return this.I010l1ol111.I00000oOI.I001lllioOl() || !this.I00l0I0l0lO1.isEmpty();
                }

                @Override
                public int getImportantForAutofill() {
/* 1 */             return 1;
                }

                public IololIiII getInputModeManager() {
/* 1 */             IololIiII iololIiII = this.I011lIilI0lo;
/* 3 */             if (iololIiII == null) {
/* 15 */                int i = isInTouchMode() ? 1 : 2;
/* 16 */                iololIiII = new IololIiII();
/* 21 */                IoloilolollO ioloilolollO = new IoloilolollO();
/* 24 */                ioloilolollO.I00000oIO = i;
/* 26 */                VarHandle.storeStoreFence();
/* 33 */                iololIiII.I00000oIO = lOO00IiI0li.I00000oIO(ioloilolollO);
/* 35 */                VarHandle.storeStoreFence();
/* 38 */                this.I011lIilI0lo = iololIiII;
                    }
/* 55 */            return iololIiII;
                }

                public final Ioo0oO1 getInsetsListener() {
/* 1 */             return this.I00oI0i;
                }

                public final long getLastMatrixRecalculationAnimationTime$ui() {
/* 1 */             return this.I0110o;
                }

                @Override
                public O0iOOoiioO getLayoutDirection() {
/* 7 */             return (O0iOOoiioO) this.I011iiii0i.getValue();
                }

                public O11oiiOIl0O getLocaleList() {
/* 7 */             return (O11oiiOIl0O) this.I010I0.getValue();
                }

                public long getMeasureIteration() {
/* 1 */             O1iO111i o1iO111i = this.I010l1ol111;
/* 5 */             if (!o1iO111i.I0000Il00O) {
/* 9 */                 IolioOO1.I00000oIO("measureIteration should be only used during the measure/layout pass");
                    }
/* 12 */            return o1iO111i.I000II;
                }

                public O1ooilI0 getModifierLocalManager() {
/* 1 */             return this.I011lO1liO1O;
                }

                public I0lio1O01i01 m30getOutOfFrameExecutor() {
/* 5 */             if (isAttachedToWindow()) {
/* 7 */                 return this;
                    }
/* 8 */             return null;
                }

                public OO11o0IO getPlacementScope() {
/* 1 */             OI1lOo oI1lOo = OO1I000OIiO.I00000oIO;
/* 6 */             O1IiOiiol o1IiOiiol = new O1IiOiiol(1);
/* 9 */             o1IiOiiol.I00iiO = this;
/* 11 */            VarHandle.storeStoreFence();
/* 20 */            return o1IiOiiol;
                }

                public final IlliIl1l11O getPlayNavigationSoundEffect$ui() {
/* 1 */             return this.I01Ilioliio;
                }

                public OO1iIl getPointerIconService() {
/* 1 */             return this.I01O10iIoo1O;
                }

                public final Iol1IlIII10 m23getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
/* 1 */             return this.I00iio;
                }

                public OOo0Olol0o getRectManager() {
/* 1 */             return this.I00oO101o;
                }

                public Oi10loIIo1l getRetainedValuesStore() {
/* 1 */             return this.I00ioIO;
                }

                public O0iiOioolIi getRoot() {
/* 1 */             return this.I00oII;
                }

                public final IiiOlo1l1 getSavedStateRegistry() {
                    boolean z;
/* 1 */             IiiOlo1l1 iiiOlo1l1 = this.I00io1l;
/* 3 */             if (iiiOlo1l1 != null) {
/* 245 */               return iiiOlo1l1;
                    }
/* 5 */             IOl10lI1 iOl10lI1 = this.I00iOIl;
/* 7 */             iOl10lI1.I0000oI00();
/* 10 */            OiIoOoIi01 oiIoOoIi01 = iOl10lI1.I0000oI00;
/* 16 */            View view = (View) getParent();
/* 21 */            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
/* 27 */            LinkedHashMap linkedHashMap = null;
/* 33 */            String strValueOf = tag instanceof String ? (String) tag : null;
/* 34 */            if (strValueOf == null) {
/* 40 */                strValueOf = String.valueOf(view.getId());
                    }
/* 46 */            String strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("SaveableStateRegistry:", strValueOf);
/* 50 */            I1I0i0Ilo1Oi i1I0i0Ilo1OiI000O01llI0 = oiIoOoIi01.I000O01llI0();
/* 54 */            Bundle bundleI00IO1oi11O = i1I0i0Ilo1OiI000O01llI0.I00IO1oi11O(strI000o00OoI0I);
/* 58 */            if (bundleI00IO1oi11O != null) {
/* 62 */                linkedHashMap = new LinkedHashMap();
/* 79 */                for (String str : bundleI00IO1oi11O.keySet()) {
/* 91 */                    linkedHashMap.put(str, bundleI00IO1oi11O.getParcelableArrayList(str));
                        }
                    }
/* 102 */           OiIl0IIi0 oiIl0IIi0I00000oIO = OiIl0oI.I00000oIO(linkedHashMap, new IO1I11OO(25));
/* 110 */           int i = 0;
/* 111 */           if (i1I0i0Ilo1OiI000O01llI0.I00O10llo(strI000o00OoI0I) != null) {
/* 113 */               z = false;
                    } else {
                        try {
/* 117 */                   Iiii00iIoO iiii00iIoO = new Iiii00iIoO(i);
/* 120 */                   iiii00iIoO.I00000oOI = oiIl0IIi0I00000oIO;
/* 122 */                   VarHandle.storeStoreFence();
/* 125 */                   i1I0i0Ilo1OiI000O01llI0.I00Ol00(strI000o00OoI0I, iiii00iIoO);
/* 128 */                   z = true;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
/* 133 */           Iiii11o0 iiii11o0 = new Iiii11o0(i);
/* 136 */           iiii11o0.I00iiI = z;
/* 138 */           iiii11o0.I00iiO = i1I0i0Ilo1OiI000O01llI0;
/* 140 */           iiii11o0.I00iio = strI000o00OoI0I;
/* 142 */           VarHandle.storeStoreFence();
/* 145 */           IiiOlo1l1 iiiOlo1l12 = new IiiOlo1l1();
/* 148 */           iiiOlo1l12.I00iOIl = oiIl0IIi0I00000oIO;
/* 150 */           iiiOlo1l12.I00iiI = iiii11o0;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           this.I00io1l = iiiOlo1l12;
/* 157 */           return iiiOlo1l12;
                }

                public final boolean getScrollCaptureInProgress() {
/* 1 */             IIOOoll iIOOoll = this.I01IoO;
/* 3 */             if (iIOOoll != null && ((Boolean) ((OIooliIO0) iIOOoll.I00iiI).getValue()).booleanValue()) {
/* 19 */                return true;
                    }
/* 27 */            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
/* 31 */                if (parent instanceof I0lio1O01i01) {
/* 35 */                    return ((I0lio1O01i01) parent).getScrollCaptureInProgress();
                        }
                    }
/* 45 */            return false;
                }

                public Oil01I0 getSemanticsOwner() {
/* 1 */             return this.I00oOio10iI1;
                }

                public O0iiliOio getSharedDrawScope() {
/* 3 */             return this.I00iOIl.I0010o;
                }

                public boolean getShowLayoutBounds() {
/* 3 */             return I11O1O0Oooi.I00000oIO.I00000oIO(this);
                }

                public OIlOIi0 getSnapshotObserver() {
/* 1 */             return this.I010iIIOlo;
                }

                public Ol1oolo getSoftwareKeyboardController() {
/* 1 */             IiIli1i1o iiIli1i1o = this.I011iIOio;
/* 3 */             if (iiIli1i1o != null) {
/* 55 */                return iiIli1i1o;
                    }
/* 7 */             Oo0Oo0 textInputService = getTextInputService();
/* 11 */            IiIli1i1o iiIli1i1o2 = new IiIli1i1o();
/* 14 */            iiIli1i1o2.I00000oIO = textInputService;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            this.I011iIOio = iiIli1i1o2;
/* 55 */            return iiIli1i1o2;
                }

                public Oo0Oo0 getTextInputService() {
/* 1 */             Oo0Oo0 oo0Oo0 = this.I011Io0I1ioi;
/* 3 */             if (oo0Oo0 != null) {
/* 20 */                return oo0Oo0;
                    }
/* 11 */            Oo0Oo0 oo0Oo02 = new Oo0Oo0(getLegacyTextInputServiceAndroid());
/* 14 */            this.I011Io0I1ioi = oo0Oo02;
/* 20 */            return oo0Oo02;
                }

                public Oo0lol1 getTextToolbar() {
/* 1 */             I100oiOlIo11 i100oiOlIo11 = this.I011lOIoo0l;
/* 3 */             if (i100oiOlIo11 != null) {
/* 20 */                return i100oiOlIo11;
                    }
/* 7 */             I100oiOlIo11 i100oiOlIo112 = new I100oiOlIo11();
/* 10 */            Oo0o1O1Iio[] oo0o1O1IioArr = Oo0o1O1Iio.I00iOIl;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            this.I011lOIoo0l = i100oiOlIo112;
/* 20 */            return i100oiOlIo112;
                }

                public final Oi1oiIo0lOl getUncaughtExceptionHandler$ui() {
/* 1 */             return null;
                }

                public Oooii1o1 getViewConfiguration() {
/* 3 */             return this.I00iOIl.I0010I0i;
                }

                public i00Ii11100lo getWindowInfo() {
/* 3 */             return this.I00iOIl.I00111O;
                }

                @Override
                public final void onAttachedToWindow() {
                    Oi10loIIo1l oi10loIIo1l;
                    Object obj;
/* 1 */             super.onAttachedToWindow();
/* 12 */            if (!getRoot().I00Io1lO()) {
/* 18 */                getRoot().I0000O(this);
                    }
/* 22 */            setAttached(true);
/* 27 */            this.I00oI0i.onViewAttachedToWindow(this);
/* 32 */            if (!this.I01Io11IiiiO) {
/* 36 */                this.I00iOIl.I0000Il00O();
                    }
/* 39 */            boolean z = false;
/* 40 */            this.I01Io11IiiiO = false;
/* 46 */            I000iOII(getRoot());
/* 53 */            I000OiO(getRoot());
/* 62 */            getSnapshotObserver().I00000oIO.I0001Ioi1lo();
/* 65 */            I0lio1O01i01 i0lio1O01i01M30getOutOfFrameExecutor = m30getOutOfFrameExecutor();
/* 69 */            if (i0lio1O01i01M30getOutOfFrameExecutor == null) {
/* 388 */               I000II.I001IO000("Expected the view to be attached to window.");
/* 743 */               return;
                    }
/* 73 */            I0lOo0io i0lOo0io = new I0lOo0io(i);
/* 76 */            i0lOo0io.I00iiI = this;
/* 78 */            VarHandle.storeStoreFence();
/* 81 */            i0lio1O01i01M30getOutOfFrameExecutor.I00II0Ol1O0l(i0lOo0io);
/* 86 */            this.I00iOIl.I0000oI00();
/* 89 */            IOl10lI1 iOl10lI1 = this.I00iOIl;
/* 91 */            iOl10lI1.I0000oI00();
/* 94 */            Oool1Ii0I oool1Ii0I = iOl10lI1.I0001Ioi1lo;
/* 96 */            O0oiioII1 o0oiioII1 = this.I00ilI0I1;
/* 99 */            if (oool1Ii0I == null || o0oiioII1 == null) {
/* 258 */               oi10loIIo1l = null;
                    } else {
/* 133 */               O0ol0i1 o0ol0i1 = (O0ol0i1) new Oool0iOoooIo(oool1Ii0I.I000II(), new Oool0iIO(), Ii0OIl0li.I00000oOI).I00000oIO(OOoOl0i.I00000oIO.I00000oOI(O0ol0i1.class));
/* 141 */               int id = ((View) getParent()).getId();
/* 145 */               OI0l1oli1I oI0l1oli1I = o0ol0i1.I00000oOI;
/* 147 */               Object objI00000oOI = oI0l1oli1I.I00000oOI(id);
/* 151 */               if (objI00000oOI == null) {
/* 155 */                   objI00000oOI = new OI0oiiIO0(1);
/* 158 */                   oI0l1oli1I.I000OOo1O(id, objI00000oOI);
                        }
/* 161 */               OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) objI00000oOI;
/* 163 */               Object[] objArr = oI0oiiIO0.I00000oIO;
/* 165 */               int i = oI0oiiIO0.I00000oOI;
/* 167 */               int i2 = 0;
                        while (true) {
/* 168 */                   if (i2 >= i) {
/* 183 */                       obj = null;
                                break;
                            }
/* 170 */                   obj = objArr[i2];
/* 177 */                   if (!((O0oil001) obj).I0000Il00O) {
                                break;
                            } else {
/* 180 */                       i2++;
                            }
                        }
/* 184 */               O0oil001 o0oil001 = (O0oil001) obj;
/* 186 */               if (o0oil001 == null) {
/* 190 */                   o0oil001 = new O0oil001();
/* 197 */                   O1OIiIOOoOO o1OIiIOOoOO = new O1OIiIOOoOO();
/* 200 */                   o1OIiIOOoOO.I00iOIl = true;
/* 207 */                   o1OIiIOOoOO.I00iio = new OI10I1IoI0Ol();
/* 209 */                   VarHandle.storeStoreFence();
/* 214 */                   Oi0Oooi oi0Oooi = new Oi0Oooi(14, z);
/* 217 */                   oi0Oooi.I00iiI = o1OIiIOOoOO;
/* 221 */                   if (!o1OIiIOOoOO.I00iiI) {
/* 226 */                       if (o1OIiIOOoOO.I00iiO) {
/* 230 */                           OO1oioOIl11.I00000oIO("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                                }
/* 233 */                       o1OIiIOOoOO.I00000oIO();
/* 236 */                       o1OIiIOOoOO.I00iiO = true;
                            }
/* 238 */                   VarHandle.storeStoreFence();
/* 241 */                   o0oil001.I00000oIO = oi0Oooi;
/* 243 */                   o0oil001.I00000oOI = oi0Oooi;
/* 245 */                   VarHandle.storeStoreFence();
/* 248 */                   oI0oiiIO0.I00000oOI(o0oil001);
                        }
/* 251 */               o0oil001.I0000Il00O = true;
/* 253 */               this.I00ilO0 = o0oil001;
/* 255 */               oi10loIIo1l = o0oil001.I00000oOI;
                    }
/* 259 */           if (oi10loIIo1l == null) {
/* 261 */               oi10loIIo1l = o0iOli.I00iio;
                    }
/* 263 */           this.I00ioIO = oi10loIIo1l;
/* 265 */           Function1 function1 = this.I011IOil;
/* 267 */           if (function1 != null) {
/* 271 */               function1.invoke(this.I00iOIl);
/* 274 */               this.I011IOil = null;
                    }
/* 276 */           IOl10lI1 iOl10lI12 = this.I00iOIl;
/* 278 */           iOl10lI12.I0000oI00();
/* 283 */           I01O1lIi i01O1lIiI000iOII = iOl10lI12.I0000O.I000iOII();
/* 287 */           i01O1lIiI000iOII.I00li1OI(this);
/* 292 */           i01O1lIiI000iOII.I00li1OI(this.I00olI);
/* 295 */           IololIiII inputModeManager = getInputModeManager();
/* 303 */           i = isInTouchMode() ? 1 : 2;
/* 307 */           OIooliIO0 oIooliIO0 = inputModeManager.I00000oIO;
/* 311 */           IoloilolollO ioloilolollO = new IoloilolollO();
/* 314 */           ioloilolollO.I00000oIO = i;
/* 316 */           VarHandle.storeStoreFence();
/* 319 */           oIooliIO0.setValue(ioloilolollO);
/* 326 */           getViewTreeObserver().addOnGlobalLayoutListener(this);
/* 333 */           getViewTreeObserver().addOnScrollChangedListener(this);
/* 340 */           getViewTreeObserver().addOnTouchModeChangeListener(this);
/* 345 */           I0llOooOO.I00000oIO.I00000oOI(this);
/* 348 */           I0lII0loi i0lII0loiM26getAutofillManager = m26getAutofillManager();
/* 352 */           if (i0lII0loiM26getAutofillManager != null) {
/* 362 */               ((Ili1ioOlo0oO) getFocusOwner()).I000II.I00000oOI(i0lII0loiM26getAutofillManager);
/* 371 */               getSemanticsOwner().I0000O.I00000oOI(i0lII0loiM26getAutofillManager);
                    }
/* 382 */           ((Ili1ioOlo0oO) getFocusOwner()).I000II.I00000oOI(this);
                }

                @Override
                public final boolean onCheckIsTextEditor() {
/* 7 */             Oilo1OII0 oilo1OII0 = (Oilo1OII0) this.I011Ol0.get();
/* 16 */            I0olOi00O i0olOi00O = (I0olOi00O) (oilo1OII0 != null ? oilo1OII0.I00000oOI : null);
/* 18 */            if (i0olOi00O == null) {
/* 24 */                return getLegacyTextInputServiceAndroid().I0000O;
                    }
/* 33 */            Oilo1OII0 oilo1OII02 = (Oilo1OII0) i0olOi00O.I00iio.get();
/* 39 */            IoloiIIo0l ioloiIIo0l = (IoloiIIo0l) (oilo1OII02 != null ? oilo1OII02.I00000oOI : null);
                    return ioloiIIo0l != null && (ioloiIIo0l.I0000oI00 ^ true);
                }

                @Override
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 4 */             Configuration configuration2 = getConfiguration();
/* 12 */            if (O0000Ioio00.I0000O(configuration2, configuration)) {
/* 77 */                return;
                    }
/* 19 */            setConfiguration(new Configuration(configuration));
/* 28 */            if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
/* 77 */                return;
                    }
/* 44 */            setDensity(iOIl1O.I00000oIO(getContext()));
                }

                /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x0191  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                    int i;
/* 11 */            Oilo1OII0 oilo1OII0 = (Oilo1OII0) this.I011Ol0.get();
/* 19 */            I0olOi00O i0olOi00O = (I0olOi00O) (oilo1OII0 != null ? oilo1OII0.I00000oOI : null);
/* 21 */            if (i0olOi00O != null) {
/* 482 */               Oilo1OII0 oilo1OII02 = (Oilo1OII0) i0olOi00O.I00iio.get();
/* 491 */               IoloiIIo0l ioloiIIo0l = (IoloiIIo0l) (oilo1OII02 != null ? oilo1OII02.I00000oOI : null);
/* 493 */               if (ioloiIIo0l == null) {
/* 474 */                   return null;
                        }
                        synchronized (ioloiIIo0l.I0000Il00O) {
/* 500 */                   if (ioloiIIo0l.I0000oI00) {
/* 474 */                       return null;
                            }
/* 506 */                   OOo010ill oOo010illI00000oIO = ioloiIIo0l.I00000oIO.I00000oIO(editorInfo);
/* 514 */                   Iil1olo iil1olo = new Iil1olo(29);
/* 517 */                   iil1olo.I00iiI = ioloiIIo0l;
/* 519 */                   VarHandle.storeStoreFence();
/* 524 */                   OIOOl1i101lO oIOOl1i101lO = new OIOOl1i101lO();
/* 527 */                   oIOOl1i101lO.I00000oIO = iil1olo;
/* 529 */                   oIOOl1i101lO.I00000oOI = oOo010illI00000oIO;
/* 531 */                   VarHandle.storeStoreFence();
/* 541 */                   ioloiIIo0l.I0000O.I00000oOI(new i000iilOi(oIOOl1i101lO));
/* 545 */                   return oIOOl1i101lO;
                        }
                    }
/* 23 */            Oo0Ooo1Oi legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
/* 29 */            if (!legacyTextInputServiceAndroid.I0000O) {
/* 31 */                return null;
                    }
/* 35 */            IoiiO1O1 ioiiO1O1 = legacyTextInputServiceAndroid.I000O01llI0;
/* 37 */            Oo0OI01Il oo0OI01Il = legacyTextInputServiceAndroid.I000II;
/* 39 */            int i2 = ioiiO1O1.I0000oI00;
/* 41 */            boolean z = ioiiO1O1.I00000oIO;
/* 46 */            int i3 = 4;
/* 48 */            int i4 = 3;
/* 50 */            if (i2 == 1) {
/* 56 */                i = z ? 6 : 0;
                    } else if (i2 == 0) {
/* 60 */                i = 1;
                    } else if (i2 == 2) {
/* 64 */                i = 2;
                    } else if (i2 == 6) {
/* 68 */                i = 5;
                    } else if (i2 == 5) {
/* 72 */                i = 7;
                    } else if (i2 == 3) {
/* 76 */                i = 3;
                    } else if (i2 == 4) {
/* 80 */                i = 4;
                    } else {
/* 82 */                if (i2 != 7) {
/* 470 */                   I000II.I001IO000("invalid ImeAction");
/* 466 */                   return null;
                        }
                    }
/* 85 */            editorInfo.imeOptions = i;
/* 89 */            int i5 = ioiiO1O1.I0000O;
/* 91 */            int i6 = 18;
/* 93 */            if (i5 == 1) {
/* 95 */                editorInfo.inputType = 1;
                    } else {
/* 100 */               if (i5 != 2) {
/* 110 */                   if (i5 == 3) {
/* 112 */                       editorInfo.inputType = 2;
/* 114 */                       i3 = 2;
                            } else {
/* 117 */                       if (i5 == 4) {
/* 119 */                           editorInfo.inputType = 3;
                                } else {
/* 124 */                           i4 = 17;
/* 126 */                           if (i5 == 5) {
/* 128 */                               editorInfo.inputType = 17;
                                    } else if (i5 == 6) {
/* 133 */                               i3 = 33;
/* 135 */                               editorInfo.inputType = 33;
                                    } else if (i5 == 7) {
/* 141 */                               i3 = 129;
/* 143 */                               editorInfo.inputType = 129;
                                    } else if (i5 == 8) {
/* 151 */                               editorInfo.inputType = 18;
/* 153 */                               i3 = 18;
                                    } else if (i5 == 9) {
/* 160 */                               i3 = 8194;
/* 162 */                               editorInfo.inputType = 8194;
                                    } else if (i5 == 10) {
/* 170 */                               i3 = 145;
/* 172 */                               editorInfo.inputType = 145;
                                    } else if (i5 == 11) {
/* 180 */                               i3 = 113;
/* 182 */                               editorInfo.inputType = 113;
                                    } else if (i5 == 12) {
/* 190 */                               i3 = 97;
/* 192 */                               editorInfo.inputType = 97;
                                    } else if (i5 == 13) {
/* 200 */                               i3 = 49;
/* 202 */                               editorInfo.inputType = 49;
                                    } else if (i5 == 14) {
/* 210 */                               i3 = 65;
/* 212 */                               editorInfo.inputType = 65;
                                    } else if (i5 == 15) {
/* 219 */                               i3 = 81;
/* 221 */                               editorInfo.inputType = 81;
                                    } else if (i5 == 16) {
/* 228 */                               i3 = 177;
/* 230 */                               editorInfo.inputType = 177;
                                    } else if (i5 == 17) {
/* 235 */                               i3 = 193;
/* 237 */                               editorInfo.inputType = 193;
                                    } else if (i5 == 18) {
/* 242 */                               editorInfo.inputType = 4;
                                    } else {
/* 247 */                               i3 = 20;
/* 249 */                               if (i5 == 19) {
/* 251 */                                   editorInfo.inputType = 20;
                                        } else if (i5 == 20) {
/* 256 */                                   i3 = 36;
/* 258 */                                   editorInfo.inputType = 36;
                                        } else if (i5 == 21) {
/* 265 */                                   i3 = 4098;
/* 267 */                                   editorInfo.inputType = 4098;
                                        } else if (i5 == 22) {
/* 274 */                                   i3 = 12290;
/* 276 */                                   editorInfo.inputType = 12290;
                                        } else if (i5 == 23) {
/* 283 */                                   i3 = 8210;
/* 285 */                                   editorInfo.inputType = 8210;
                                        } else if (i5 == 24) {
/* 292 */                                   i3 = 4114;
/* 294 */                                   editorInfo.inputType = 4114;
                                        } else {
/* 299 */                                   if (i5 != 25) {
/* 462 */                                       I000II.I001IO000("Invalid Keyboard Type");
/* 87 */                                        return null;
                                            }
/* 301 */                                   i3 = 12306;
/* 303 */                                   editorInfo.inputType = 12306;
                                        }
                                    }
                                }
/* 121 */                       i3 = i4;
                            }
/* 305 */                   if (!z && (i3 & 15) == 1) {
/* 313 */                       i3 |= 131072;
/* 314 */                       editorInfo.inputType = i3;
/* 316 */                       if (i2 == 1) {
/* 321 */                           editorInfo.imeOptions = 1073741824 | i;
                                }
                            }
/* 325 */                   if ((i3 & 15) == 1) {
/* 327 */                       int i7 = ioiiO1O1.I00000oOI;
/* 329 */                       if (i7 == 1) {
/* 331 */                           i3 |= Barcode.FORMAT_AZTEC;
/* 333 */                           editorInfo.inputType = i3;
                                } else if (i7 == 2) {
/* 338 */                           i3 |= 8192;
/* 340 */                           editorInfo.inputType = i3;
                                } else if (i7 == 3) {
/* 346 */                           i3 |= 16384;
/* 348 */                           editorInfo.inputType = i3;
                                }
/* 352 */                       if (ioiiO1O1.I0000Il00O) {
/* 358 */                           editorInfo.inputType = 32768 | i3;
                                }
                            }
/* 360 */                   long j = oo0OI01Il.I00000oOI;
/* 362 */                   int i8 = Oo0lI00l.I0000Il00O;
/* 369 */                   editorInfo.initialSelStart = (int) (j >> 32);
/* 378 */                   editorInfo.initialSelEnd = (int) (j & 4294967295L);
/* 385 */                   editorInfo.setInitialSurroundingSubText(oo0OI01Il.I00000oIO.I00iiI, 0);
                            editorInfo.imeOptions |= 33554432;
/* 399 */                   if (IiollO1llli.I0000O()) {
/* 406 */                       IiollO1llli.I00000oIO().I000OOo1O(editorInfo);
                            }
/* 409 */                   Oo0OI01Il oo0OI01Il2 = legacyTextInputServiceAndroid.I000II;
/* 413 */                   boolean z2 = legacyTextInputServiceAndroid.I000O01llI0.I0000Il00O;
/* 418 */                   Oi1ol0llI oi1ol0llI = new Oi1ol0llI(i6, false);
/* 421 */                   oi1ol0llI.I00iiI = legacyTextInputServiceAndroid;
/* 423 */                   VarHandle.storeStoreFence();
/* 428 */                   OOo010II0IOI oOo010II0IOI = new OOo010II0IOI();
/* 431 */                   oOo010II0IOI.I00000oIO = oi1ol0llI;
/* 433 */                   oOo010II0IOI.I00000oOI = z2;
/* 435 */                   oOo010II0IOI.I0000O = oo0OI01Il2;
/* 442 */                   oOo010II0IOI.I000II = new ArrayList();
/* 444 */                   oOo010II0IOI.I000O01llI0 = true;
/* 446 */                   VarHandle.storeStoreFence();
/* 456 */                   legacyTextInputServiceAndroid.I000OOo1O.add(new WeakReference(oOo010II0IOI));
/* 459 */                   return oOo010II0IOI;
                        }
/* 102 */               editorInfo.inputType = 1;
/* 106 */               i |= Integer.MIN_VALUE;
/* 107 */               editorInfo.imeOptions = i;
                    }
/* 97 */            i3 = 1;
/* 305 */           if (!z) {
/* 313 */               i3 |= 131072;
/* 314 */               editorInfo.inputType = i3;
/* 316 */               if (i2 == 1) {
                        }
                    }
/* 325 */           if ((i3 & 15) == 1) {
                    }
/* 360 */           long j2 = oo0OI01Il.I00000oOI;
/* 362 */           int i82 = Oo0lI00l.I0000Il00O;
/* 369 */           editorInfo.initialSelStart = (int) (j2 >> 32);
/* 378 */           editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
/* 385 */           editorInfo.setInitialSurroundingSubText(oo0OI01Il.I00000oIO.I00iiI, 0);
                    editorInfo.imeOptions |= 33554432;
/* 399 */           if (IiollO1llli.I0000O()) {
                    }
/* 409 */           Oo0OI01Il oo0OI01Il22 = legacyTextInputServiceAndroid.I000II;
/* 413 */           boolean z22 = legacyTextInputServiceAndroid.I000O01llI0.I0000Il00O;
/* 418 */           Oi1ol0llI oi1ol0llI2 = new Oi1ol0llI(i6, false);
/* 421 */           oi1ol0llI2.I00iiI = legacyTextInputServiceAndroid;
/* 423 */           VarHandle.storeStoreFence();
/* 428 */           OOo010II0IOI oOo010II0IOI2 = new OOo010II0IOI();
/* 431 */           oOo010II0IOI2.I00000oIO = oi1ol0llI2;
/* 433 */           oOo010II0IOI2.I00000oOI = z22;
/* 435 */           oOo010II0IOI2.I0000O = oo0OI01Il22;
/* 442 */           oOo010II0IOI2.I000II = new ArrayList();
/* 444 */           oOo010II0IOI2.I000O01llI0 = true;
/* 446 */           VarHandle.storeStoreFence();
/* 456 */           legacyTextInputServiceAndroid.I000OOo1O.add(new WeakReference(oOo010II0IOI2));
/* 459 */           return oOo010II0IOI2;
                }

                @Override
                public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
                    Oil000 oil000;
/* 1 */             I0lo1oIo i0lo1oIo = this.I00olI;
/* 3 */             i0lo1oIo.getClass();
/* 8 */             for (long j : jArr) {
/* 21 */                Oil00l oil00l = (Oil00l) i0lo1oIo.I0000Il00O().I00000oOI((int) j);
/* 23 */                if (oil00l != null && (oil000 = oil00l.I00000oIO) != null) {
/* 41 */                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(i0lo1oIo.I00iOIl.getAutofillId(), oil000.I0001Ioi1lo);
/* 50 */                    Object objI000II = oil000.I0000O.I00iOIl.I000II(Oil0I1O.I001lloI);
/* 55 */                    if (objI000II == null) {
/* 57 */                        objI000II = null;
                            }
/* 58 */                    List list = (List) objI000II;
/* 60 */                    if (list != null) {
/* 81 */                        builder.setValue("android:text", TranslationRequestValue.forText(new I1111OO10i(O10lllI0o0.I00000oIO(list, "\n", null, 62))));
/* 88 */                        consumer.accept(builder.build());
                            }
                        }
                    }
                }

                @Override
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 5 */             setAttached(false);
/* 10 */            this.I00oI0i.onViewDetachedFromWindow(this);
/* 13 */            View view = this.I00ll1;
/* 19 */            if (I000l1() && view != null) {
/* 23 */                removeView(view);
                    }
/* 26 */            OI0oiiIO0 oI0oiiIO0 = I01OIo;
                    synchronized (oI0oiiIO0) {
/* 29 */                oI0oiiIO0.I000iOII(this);
                    }
/* 35 */            this.I00iOIl.I00000oOI();
/* 42 */            Ol1olI0o1I01 ol1olI0o1I01 = getSnapshotObserver().I00000oIO;
/* 44 */            I0IOIlIOIII i0IOIlIOIII = ol1olI0o1I01.I000O01llI0;
/* 46 */            if (i0IOIlIOIII != null) {
/* 48 */                i0IOIlIOIII.I000II();
                    }
/* 51 */            ol1olI0o1I01.I00000oIO();
/* 54 */            IOl10lI1 iOl10lI1 = this.I00iOIl;
/* 56 */            iOl10lI1.I0000oI00();
/* 61 */            I01O1lIi i01O1lIiI000iOII = iOl10lI1.I0000O.I000iOII();
/* 67 */            i01O1lIiI000iOII.I00ooIo0(this.I00olI);
/* 70 */            i01O1lIiI000iOII.I00ooIo0(this);
/* 77 */            getViewTreeObserver().removeOnGlobalLayoutListener(this);
/* 84 */            getViewTreeObserver().removeOnScrollChangedListener(this);
/* 91 */            getViewTreeObserver().removeOnTouchModeChangeListener(this);
/* 94 */            O0oil001 o0oil001 = this.I00ilO0;
/* 96 */            if (o0oil001 != null) {
/* 98 */                o0oil001.I0000Il00O = false;
                    }
/* 101 */           this.I00ilO0 = null;
/* 105 */           I0llOooOO.I00000oIO.I00000oIO(this);
/* 108 */           I0lII0loi i0lII0loiM26getAutofillManager = m26getAutofillManager();
/* 112 */           if (i0lII0loiM26getAutofillManager != null) {
/* 120 */               getSemanticsOwner().I0000O.I000iOII(i0lII0loiM26getAutofillManager);
/* 131 */               ((Ili1ioOlo0oO) getFocusOwner()).I000II.I000iOII(i0lII0loiM26getAutofillManager);
                    }
/* 134 */           OOo0Olol0o rectManager = getRectManager();
/* 151 */           rectManager.I000II = rectManager.I0000O.I00000oOI(0L, 0L, null, 0, 0);
/* 157 */           getRectManager().I00000oIO();
/* 160 */           OOo0Olol0o rectManager2 = getRectManager();
/* 164 */           I0100i i0100i = rectManager2.I000OOo1O;
/* 166 */           if (i0100i != null) {
/* 170 */               rectManager2.I00000oOI.removeCallbacks(i0100i);
/* 173 */               rectManager2.I000OOo1O = null;
                    }
/* 183 */           ((Ili1ioOlo0oO) getFocusOwner()).I000II.I000iOII(this);
                }

                @Override
                public final void onFocusChanged(boolean z, int i, Rect rect) {
/* 1 */             super.onFocusChanged(z, i, rect);
/* 4 */             if (z || hasFocus()) {
/* 98 */                return;
                    }
/* 16 */            Ili1ioOlo0oO ili1ioOlo0oO = (Ili1ioOlo0oO) getFocusOwner();
/* 21 */            iliI01iIl.I0000oI00(ili1ioOlo0oO.I0000Il00O, true);
/* 28 */            if (ili1ioOlo0oO.I000II() != null) {
/* 30 */                IliIO10oO0 iliIO10oO0I000II = ili1ioOlo0oO.I000II();
/* 35 */                ili1ioOlo0oO.I000OiO(null);
/* 38 */                if (iliIO10oO0I000II != null) {
/* 44 */                    iliIO10oO0I000II.I010l1ol111(IliI0101O0Oi.I00iOIl, IliI0101O0Oi.I00iiO);
                        }
                    }
                }

                @Override
                public final void onGlobalLayout() {
/* 3 */             this.I0110o = 0L;
/* 5 */             I00IlilI0i0i();
                }

                @Override
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 3 */             Trace.beginSection("AndroidOwner:onLayout");
                    try {
/* 8 */                 this.I0110o = 0L;
/* 14 */                this.I010l1ol111.I000iOII(this.I01Io000);
/* 18 */                this.I010l10O = null;
/* 20 */                I00IlilI0i0i();
/* 23 */                I10OIIo i10OIIo = this.I010ioo;
/* 25 */                if (i10OIIo != null) {
/* 29 */                    Trace.beginSection("AndroidOwner:viewLayout");
/* 35 */                    i10OIIo.layout(0, 0, i3 - i, i4 - i2);
/* 38 */                    Trace.endSection();
                        }
                    } catch (Throwable th) {
/* 46 */                throw th;
                    } finally {
/* 52 */                Trace.endSection();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
                
                    r8 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
                
                    throw r8;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onMeasure(int i, int i2) {
/* 1 */             O1iO111i o1iO111i = this.I010l1ol111;
/* 5 */             Trace.beginSection("AndroidOwner:onMeasure");
                    try {
/* 16 */                if (!getRoot().I00Io1lO()) {
/* 22 */                    getRoot().I0000O(this);
                        }
/* 29 */                if (!isAttachedToWindow()) {
/* 35 */                    I000iOII(getRoot());
                        }
/* 38 */                long jI0000O = I0000O(i);
/* 54 */                long jI0000O2 = I0000O(i2);
/* 63 */                long jI00000oIO = iio0lo1i.I00000oIO((int) (jI0000O >>> 32), (int) (jI0000O & 4294967295L), (int) (jI0000O2 >>> 32), (int) (4294967295L & jI0000O2));
/* 67 */                IOo0oO11ll1O iOo0oO11ll1O = this.I010l10O;
/* 69 */                if (iOo0oO11ll1O == null) {
/* 75 */                    this.I010l10O = IOo0oO11ll1O.I00000oIO(jI00000oIO);
/* 78 */                    this.I010l1O = false;
                        } else if (!IOo0oO11ll1O.I0000O(iOo0oO11ll1O.I00000oIO, jI00000oIO)) {
/* 90 */                    this.I010l1O = true;
                        }
/* 92 */                o1iO111i.I0010o(jI00000oIO);
/* 95 */                o1iO111i.I000lI();
/* 118 */               setMeasuredDimension(getRoot().I010I0.I00100l0.I00iOIl, getRoot().I010I0.I00100l0.I00iiI);
/* 121 */               I10OIIo i10OIIo = this.I010ioo;
/* 123 */               if (i10OIIo != null) {
/* 127 */                   Trace.beginSection("AndroidOwner:androidViewMeasure");
/* 160 */                   i10OIIo.measure(View.MeasureSpec.makeMeasureSpec(getRoot().I010I0.I00100l0.I00iOIl, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().I010I0.I00100l0.I00iiI, 1073741824));
/* 163 */                   Trace.endSection();
                        }
                    } finally {
                    }
                }

                @Override
                public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
/* 1 */             if (viewStructure == null || this.I01Io1ilOIIo) {
/* 37 */                return;
                    }
/* 7 */             I001l0I00(viewStructure);
                }

                @Override
                public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
                    OO1iIiOoO0 oO1iIiOoO0;
/* 1 */             int toolType = motionEvent.getToolType(i);
/* 11 */            if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (oO1iIiOoO0 = ((I0liiOI) getPointerIconService()).I00000oIO) == null)) {
/* 61 */                return super.onResolvePointerIcon(motionEvent, i);
                    }
/* 37 */            Context context = getContext();
                    return oO1iIiOoO0 instanceof I0olOlooIO0o ? PointerIcon.getSystemIcon(context, ((I0olOlooIO0o) oO1iIiOoO0).I00000oOI) : PointerIcon.getSystemIcon(context, 1000);
                }

                @Override
                public final void onResume(O0oiOi o0oiOi) {
                    IIoi0i iIoi0iI001IO000;
/* 1 */             O0oil001 o0oil001 = this.I00ilO0;
/* 3 */             if (o0oil001 != null) {
/* 5 */                 O0oiioII1 o0oiioII1 = this.I00ilI0I1;
/* 7 */                 Oi0Oooi oi0Oooi = o0oil001.I00000oIO;
/* 11 */                O1OIiIOOoOO o1OIiIOOoOO = (O1OIiIOOoOO) oi0Oooi.I00iiI;
/* 15 */                if (!o1OIiIOOoOO.I00iOIl || o1OIiIOOoOO.I00iiO) {
/* 77 */                    return;
                        }
                        try {
/* 25 */                    IlIi0Il ilIi0Il = new IlIi0Il(13);
/* 28 */                    ilIi0Il.I00iiI = o0oil001;
/* 30 */                    VarHandle.storeStoreFence();
/* 37 */                    iIoi0iI001IO000 = ((i01l10O) o0oiioII1).I00iOIl.I001IO000(ilIi0Il);
                        } catch (CancellationException unused) {
/* 44 */                    O1OIiIOOoOO o1OIiIOOoOO2 = (O1OIiIOOoOO) oi0Oooi.I00iiI;
/* 48 */                    if (!o1OIiIOOoOO2.I00iiI) {
/* 53 */                        if (o1OIiIOOoOO2.I00iiO) {
/* 57 */                            OO1oioOIl11.I00000oIO("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                                }
/* 60 */                        o1OIiIOOoOO2.I00000oIO();
/* 64 */                        o1OIiIOOoOO2.I00iiO = true;
                            }
/* 66 */                    iIoi0iI001IO000 = null;
                        }
/* 67 */                IIoi0i iIoi0i = o0oil001.I0000O;
/* 69 */                if (iIoi0i != null) {
/* 71 */                    iIoi0i.cancel();
                        }
/* 74 */                o0oil001.I0000O = iIoi0iI001IO000;
                    }
                }

                @Override
                public final void onRtlPropertiesChanged(int i) {
/* 3 */             if (this.I00iiO) {
/* 5 */                 int[] iArr = Ili11o0l.I00000oIO;
/* 17 */                O0iOOoiioO o0iOOoiioO = i != 0 ? i != 1 ? null : O0iOOoiioO.I00iiI : O0iOOoiioO.I00iOIl;
/* 19 */                if (o0iOOoiioO == null) {
/* 21 */                    o0iOOoiioO = O0iOOoiioO.I00iOIl;
                        }
/* 23 */                setLayoutDirection(o0iOOoiioO);
                    }
                }

                @Override
                public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
/* 1 */             IIOOoll iIOOoll = this.I01IoO;
/* 3 */             if (iIOOoll != null) {
/* 5 */                 Oil01I0 semanticsOwner = getSemanticsOwner();
/* 9 */                 Ii00l101O coroutineContext = getCoroutineContext();
/* 19 */                OI110O0 oi110o0 = new OI110O0(new OiOi1iI1oi[16]);
/* 42 */                lO100liolI1.I00000oIO(semanticsOwner.I00000oIO(), 0, new OiOi10iii01(1, oi110o0, OI110O0.class, "add", "add(Ljava/lang/Object;)Z", 8, 0));
/* 60 */                Function1[] function1Arr = {new OiIoloo(21), new OiIoloo(22)};
/* 69 */                IOi10O11O iOi10O11O = new IOi10O11O(0);
/* 72 */                iOi10O11O.I00iiI = function1Arr;
/* 74 */                VarHandle.storeStoreFence();
/* 81 */                Arrays.sort(oi110o0.I00iOIl, 0, oi110o0.I00iiO, iOi10O11O);
/* 84 */                int i = oi110o0.I00iiO;
/* 96 */                OiOi1iI1oi oiOi1iI1oi = (OiOi1iI1oi) (i == 0 ? null : oi110o0.I00iOIl[i - 1]);
/* 98 */                if (oiOi1iI1oi == null) {
/* 408 */                   return;
                        }
/* 101 */               IooO1IOlo iooO1IOlo = oiOi1iI1oi.I0000Il00O;
/* 103 */               IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO(coroutineContext);
/* 109 */               Oil000 oil000 = oiOi1iI1oi.I00000oIO;
/* 111 */               IOl0iiI iOl0iiI = new IOl0iiI();
/* 114 */               iOl0iiI.I00000oIO = oil000;
/* 116 */               iOl0iiI.I00000oOI = iooO1IOlo;
/* 118 */               iOl0iiI.I0000Il00O = iIOOoll;
/* 120 */               iOl0iiI.I0000O = this;
/* 135 */               iOl0iiI.I0000oI00 = new IIOlO1ii(iIOlO1iiI00000oIO.I00iiI.I00ioIO(Iii1i0i0lllo.I00iiI));
/* 139 */               int iI00000oOI = iooO1IOlo.I00000oOI();
/* 145 */               I1oO0Ooo0o0i i1oO0Ooo0o0i = new I1oO0Ooo0o0i(iOl0iiI, null);
/* 148 */               IoI1IiioI ioI1IiioI = new IoI1IiioI();
/* 151 */               ioI1IiioI.I00000oIO = iI00000oOI;
/* 153 */               ioI1IiioI.I0000Il00O = i1oO0Ooo0o0i;
/* 155 */               VarHandle.storeStoreFence();
/* 158 */               iOl0iiI.I0001Ioi1lo = ioI1IiioI;
/* 160 */               VarHandle.storeStoreFence();
/* 163 */               OIIlIII0Ili oIIlIII0Ili = oiOi1iI1oi.I0000O;
/* 169 */               OOo0IO oOo0IOI00IoiI = l0o0IlOil1.I0000Il00O(oIIlIII0Ili).I00IoiI(oIIlIII0Ili, true);
/* 173 */               long jI0000Il00O = iooO1IOlo.I0000Il00O();
/* 204 */               ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, lIiool1i00.I00000oIO(ioooOioll1.I00000oOI(oOo0IOI00IoiI)), new Point((int) (jI0000Il00O >> 32), (int) (jI0000Il00O & 4294967295L)), iOl0iiI);
/* 211 */               scrollCaptureTarget.setScrollBounds(lIiool1i00.I00000oIO(iooO1IOlo));
/* 214 */               consumer.accept(scrollCaptureTarget);
                    }
                }

                @Override
                public final void onScrollChanged() {
/* 1 */             I00IlilI0i0i();
                }

                @Override
                public final void onStop(O0oiOi o0oiOi) {
/* 1 */             O0oil001 o0oil001 = this.I00ilO0;
/* 3 */             if (o0oil001 != null) {
/* 9 */                 O1OIiIOOoOO o1OIiIOOoOO = (O1OIiIOOoOO) o0oil001.I00000oIO.I00iiI;
/* 13 */                if (o1OIiIOOoOO.I00iOIl && !o1OIiIOOoOO.I00iiO) {
/* 19 */                    IIoi0i iIoi0i = o0oil001.I0000O;
/* 21 */                    if (iIoi0i != null) {
/* 23 */                        iIoi0i.cancel();
                            }
/* 27 */                    o0oil001.I0000O = null;
/* 29 */                    return;
                        }
/* 32 */                if (o1OIiIOOoOO.I00iiI) {
/* 77 */                    return;
                        }
/* 37 */                if (!o1OIiIOOoOO.I00iiO) {
/* 41 */                    OO1oioOIl11.I00000oIO("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
                        }
/* 50 */                if (!o1OIiIOOoOO.I00iio.I000OOo1O()) {
/* 54 */                    OO1oioOIl11.I00000oIO("Attempted to start retaining exited values with pending exited values");
                        }
/* 58 */                o1OIiIOOoOO.I00iiO = false;
                    }
                }

                @Override
                public final void onTouchModeChanged(boolean z) {
/* 1 */             IololIiII inputModeManager = getInputModeManager();
/* 9 */             int i = z ? 1 : 2;
/* 10 */            OIooliIO0 oIooliIO0 = inputModeManager.I00000oIO;
/* 14 */            IoloilolollO ioloilolollO = new IoloilolollO();
/* 17 */            ioloilolollO.I00000oIO = i;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            oIooliIO0.setValue(ioloilolollO);
                }

                @Override
                public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
/* 1 */             I0lo1oIo i0lo1oIo = this.I00olI;
/* 3 */             i0lo1oIo.getClass();
/* 22 */            if (O0000Ioio00.I0000O(Looper.getMainLooper().getThread(), Thread.currentThread())) {
/* 24 */                iOIl0o.I00000oIO(i0lo1oIo, longSparseArray);
/* 27 */                return;
                    }
/* 28 */            I0lio1O01i01 i0lio1O01i01 = i0lo1oIo.I00iOIl;
/* 33 */            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(2);
/* 36 */            i0iOo0oioiO.I00iiI = i0lo1oIo;
/* 38 */            i0iOo0oioiO.I00iiO = longSparseArray;
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            i0lio1O01i01.post(i0iOo0oioiO);
                }

                @Override
                public final void onWindowFocusChanged(boolean z) {
/* 2 */             this.I01Io1 = true;
/* 4 */             super.onWindowFocusChanged(z);
                }

                @Override
                public final boolean requestFocus(int i, Rect rect) {
/* 5 */             int i2 = 1;
/* 6 */             if (!isFocused()) {
/* 9 */                 Ili0i1il0l0l ili0i1il0l0lI0000O = Ili11o0l.I0000O(i);
/* 18 */                int i3 = ili0i1il0l0lI0000O != null ? ili0i1il0l0lI0000O.I00000oIO : 7;
/* 19 */                Ili1iIl focusOwner = getFocusOwner();
/* 31 */                OOo0IO oOo0IOI0000Il00O = rect != null ? lIiool1i00.I0000Il00O(rect) : null;
/* 35 */                I0li00iII1I i0li00iII1I = new I0li00iII1I(0);
/* 38 */                i0li00iII1I.I00iiI = i3;
/* 40 */                VarHandle.storeStoreFence();
/* 45 */                Boolean boolI0001Ioi1lo = ((Ili1ioOlo0oO) focusOwner).I0001Ioi1lo(i3, oOo0IOI0000Il00O, i0li00iII1I);
/* 49 */                Boolean bool = Boolean.TRUE;
/* 55 */                if (!O0000Ioio00.I0000O(boolI0001Ioi1lo, bool)) {
/* 58 */                    Ili1iIl focusOwner2 = getFocusOwner();
/* 64 */                    I0li00iII1I i0li00iII1I2 = new I0li00iII1I(i2);
/* 67 */                    i0li00iII1I2.I00iiI = i3;
/* 69 */                    VarHandle.storeStoreFence();
/* 82 */                    if (!O0000Ioio00.I0000O(((Ili1ioOlo0oO) focusOwner2).I0001Ioi1lo(i3, null, i0li00iII1I2), bool)) {
/* 89 */                        if (hasFocus() && (i3 == 1 || i3 == 2)) {
/* 103 */                           return ((Ili1ioOlo0oO) getFocusOwner()).I000OOo1O(i3);
                                }
/* 34 */                        return false;
                            }
                        }
                    }
/* 5 */             return true;
                }

                public void setAccessibilityEventBatchIntervalMillis(long j) {
/* 3 */             this.I00ol1.I00ioIO = j;
                }

                public final void setComposeViewContext(IOl10lI1 iOl10lI1) {
/* 1 */             IOl10lI1 iOl10lI12 = this.I00iOIl;
/* 3 */             if (iOl10lI1 == iOl10lI12) {
/* 5 */                 return;
                    }
/* 10 */            if (isAttachedToWindow()) {
/* 12 */                iOl10lI12.I00000oOI();
/* 15 */                iOl10lI1.I0000Il00O();
                    }
/* 18 */            this.I00iOIl = iOl10lI1;
                }

                public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
/* 1 */             this.I01Io11IiiiO = z;
                }

                public final void setConfiguration(Configuration configuration) {
/* 3 */             this.I010101Oo1lO.setValue(configuration);
                }

                public final void setContentCaptureManager$ui(I0lo1oIo i0lo1oIo) {
/* 1 */             this.I00olI = i0lo1oIo;
                }

                public void setCoroutineContext(Ii00l101O ii00l101O) {
/* 1 */             this.I00lll10 = ii00l101O;
                }

                public final void setFrameEndScheduler$ui(O0oiioII1 o0oiioII1) {
/* 1 */             this.I00ilI0I1 = o0oiioII1;
                }

                public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
/* 1 */             this.I0110o = j;
                }

                public final void setOnReadyForComposition(Function1 function1) {
/* 1 */             getDerivedIsAttached();
/* 8 */             if (isAttachedToWindow() || this.I01Io11IiiiO) {
/* 20 */                function1.invoke(this.I00iOIl);
                    } else {
/* 15 */                this.I011IOil = function1;
                    }
                }

                public final void setPlayNavigationSoundEffect$ui(IlliIl1l11O illiIl1l11O) {
/* 1 */             this.I01Ilioliio = illiIl1l11O;
                }

                public final void m24setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(Iol1IlIII10 iol1IlIII10) {
/* 1 */             this.I00iio = iol1IlIII10;
                }

                public void setUncaughtExceptionHandler(Oi1oiIo0lOl oi1oiIo0lOl) {
/* 3 */             this.I010l1ol111.getClass();
                }

                @Override
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

/* 5 */         public I0lI1I10iIII m25getAutofill() {
/* 6 */             return this.I010II;
                }

/* 5 */         public I0lII0loi m26getAutofillManager() {
/* 6 */             return this.I010OIo1l;
                }

/* 5 */         public I0o11ooo00l1 m27getDragAndDropManager() {
/* 6 */             return this.I00o0iI0io1;
                }

/* 5 */         public OI0l1oli1I getLayoutNodes() {
/* 6 */             return this.I00oIiI10;
                }

                @Override
/* 15 */        public final void addView(View view) {
/* 16 */            addView(view, -1);
                }

                @Override
/* 16 */        public final void addView(View view, int i, int i2) {
/* 17 */            ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
/* 18 */            layoutParamsGenerateDefaultLayoutParams.width = i;
/* 19 */            layoutParamsGenerateDefaultLayoutParams.height = i2;
/* 20 */            addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
                }

                @IiO0I1oi0
/* 19 */        public static void getFontLoader$annotations() {
                }

/* 19 */        public static void getLastMatrixRecalculationAnimationTime$ui$annotations() {
                }

/* 19 */        public static void getPlayNavigationSoundEffect$ui$annotations() {
                }

/* 19 */        public static void m22getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
                }

/* 19 */        public static void getRoot$annotations() {
                }

                @IiO0I1oi0
/* 19 */        public static void getTextInputService$annotations() {
                }

/* 19 */        public static void getWindowInfo$annotations() {
                }

/* 19 */        public Oi1oilO getRootForTest() {
/* 20 */            return this;
                }

/* 19 */        public View getView() {
/* 20 */            return this;
                }

                @Override
/* 20 */        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 21 */            addViewInLayout(view, i, layoutParams, true);
                }

                @Override
/* 21 */        public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
/* 22 */            addViewInLayout(view, -1, layoutParams, true);
                }

                @Override
/* 28 */        public final void onDraw(Canvas canvas) {
                }

/* 28 */        public void setShowLayoutBounds(boolean z) {
                }

/* 28 */        public final void setUncaughtExceptionHandler$ui(Oi1oiIo0lOl oi1oiIo0lOl) {
                }
            }
