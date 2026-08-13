            package p000;

            import android.os.LocaleList;
            import android.os.StrictMode;
            import android.os.SystemClock;
            import android.view.MotionEvent;
            import android.view.View;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            
            public final class I0lOo0io implements IllOOo00lI {
                public final int I00iOIl;
                public I0lio1O01i01 I00iiI;

                public I0lOo0io(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             int i2 = 0;
/* 6 */             I0lio1O01i01 i0lio1O01i01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 244 */                   I10OIIo i10OIIo = i0lio1O01i01.I010ioo;
/* 246 */                   if (i10OIIo != null) {
/* 248 */                       int childCount = i10OIIo.getChildCount();
/* 252 */                       while (i2 < childCount) {
/* 254 */                           View childAt = i10OIIo.getChildAt(i2);
/* 265 */                           I10I1li0 i10I1li0 = childAt instanceof I10I1li0 ? (I10I1li0) childAt : null;
/* 266 */                           if (i10I1li0 != null && i10I1li0.isLayoutRequested()) {
/* 291 */                               i10I1li0.layout(i10I1li0.getLeft(), i10I1li0.getTop(), i10I1li0.getRight(), i10I1li0.getBottom());
                                    }
/* 294 */                           i2++;
                                }
                            }
/* 297 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 160 */                   if (i0lio1O01i01.isAttachedToWindow()) {
/* 165 */                       if (I0lio1O01i01.I01OO1I == null) {
/* 169 */                           I0il01i00i i0il01i00i = new I0il01i00i(1);
/* 172 */                           I0lio1O01i01.I01OO1I = i0il01i00i;
/* 174 */                           StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                                    try {
/* 180 */                               if (I0lio1O01i01.I01O1I1 == null) {
/* 188 */                                   I0lio1O01i01.I01O1I1 = Class.forName("android.os.SystemProperties");
                                        }
/* 190 */                               Method declaredMethod = I0lio1O01i01.I01O1lIi;
/* 192 */                               if (declaredMethod == null) {
/* 196 */                                   StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
/* 199 */                                   Class cls = I0lio1O01i01.I01O1I1;
/* 216 */                                   declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
/* 217 */                                   I0lio1O01i01.I01O1lIi = declaredMethod;
                                        }
/* 219 */                               if (declaredMethod != null) {
/* 225 */                                   declaredMethod.invoke(null, i0il01i00i);
                                        }
                                    } catch (Throwable unused) {
                                    }
/* 228 */                           StrictMode.setVmPolicy(vmPolicy);
                                }
/* 231 */                       OI0oiiIO0 oI0oiiIO0 = I0lio1O01i01.I01OIo;
                                synchronized (oI0oiiIO0) {
/* 234 */                           oI0oiiIO0.I00000oOI(i0lio1O01i01);
                                }
                            }
/* 238 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 150 */                   Boolean bool = (Boolean) i0lio1O01i01.I00o0l1o1o0.getValue();
/* 152 */                   bool.getClass();
/* 155 */                   return bool;
                        case 3:
/* 90 */                    O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(i0lio1O01i01.getConfiguration());
/* 102 */                   if (o11oilII00000oIO.I00000oIO.I00000oIO.isEmpty()) {
/* 108 */                       o11oilII00000oIO = O11oilI.I0000Il00O(LocaleList.getDefault());
                            }
/* 112 */                   int iI00000oOI = o11oilII00000oIO.I00000oOI();
/* 118 */                   ArrayList arrayList = new ArrayList(iI00000oOI);
/* 121 */                   while (i2 < iI00000oOI) {
/* 132 */                       arrayList.add(new O11oOOio1iO(o11oilII00000oIO.I00000oIO(i2)));
/* 135 */                       i2++;
                            }
/* 140 */                   return new O11oiiOIl0O(arrayList);
                        default:
/* 11 */                    MotionEvent motionEvent = i0lio1O01i01.I011olOoO;
/* 13 */                    if (motionEvent != null) {
/* 48 */                        boolean zContains = IOOi1I.I000O01llI0(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
/* 52 */                        MotionEvent motionEvent2 = i0lio1O01i01.I011olOoO;
/* 54 */                        if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
/* 62 */                            i2 = 1;
                                }
/* 63 */                        if (zContains && i2 != 0) {
/* 71 */                            i0lio1O01i01.I01I01Oolii = SystemClock.uptimeMillis();
/* 75 */                            i0lio1O01i01.post(i0lio1O01i01.I01IiOO);
                                }
                            }
/* 80 */                    i0lio1O01i01.I01Io001O.invoke();
/* 83 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
