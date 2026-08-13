            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Handler;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.Rational;
            import android.util.Size;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowInsets;
            import android.widget.FrameLayout;
            import androidx.appcompat.widget.ActionBarContextView;
            import com.box.gallery.GalleryApplication;
            import com.box.gallery.R;
            import com.google.ai.edge.litertlm.Message;
            import com.google.ai.edge.litertlm.MessageCallback;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import java.util.UUID;
            import java.util.WeakHashMap;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
/* 23 */    public final class Oi0Oooi implements O1l0OiO10IoI, OIOloIl1oo1, OIi0011o, MessageCallback, O1ioI1, I0IIOlio, OolIii00oi1, Oi10loIIo1l, OIi0Oi1lOoo, OIOol0, l1O01olIi1, ili0l0oo0 {
                public final int I00iOIl;
                public Object I00iiI;

                public Oi0Oooi(OOi0i0OO0lol oOi0i0OO0lol) {
/* 3 */             this.I00iOIl = 23;
/* 8 */             List list = oOi0i0OO0lol.I00iiO;
/* 14 */            if ((oOi0i0OO0lol.I00iiI & 1) == 1) {
/* 16 */                int i = oOi0i0OO0lol.I00iio;
/* 18 */                List list2 = list;
/* 28 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 35 */                int i2 = 0;
/* 40 */                for (Object obj : list2) {
/* 46 */                    int i3 = i2 + 1;
/* 48 */                    if (i2 < 0) {
/* 91 */                        IOOi1I.I000lI();
/* 95 */                        throw null;
                            }
/* 50 */                    OOi001oo1OOI oOi001oo1OOII000II = (OOi001oo1OOI) obj;
/* 52 */                    if (i2 >= i) {
/* 54 */                        oOi001oo1OOII000II.getClass();
/* 57 */                        OOOoooI oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOII000II);
                                oOOoooII0010o.I00iio |= 2;
/* 67 */                        oOOoooII0010o.I00ilO0 = true;
/* 69 */                        oOi001oo1OOII000II = oOOoooII0010o.I000II();
/* 77 */                        if (!oOi001oo1OOII000II.I00000oOI()) {
/* 85 */                            throw new IOiIIo1l();
                                }
                            }
/* 86 */                    arrayList.add(oOi001oo1OOII000II);
/* 89 */                    i2 = i3;
                        }
/* 96 */                list = arrayList;
                    }
/* 97 */            this.I00iiI = list;
                }

                public Ii0010O01 I00000oIO(Ii0010O01 ii0010O01) {
/* 3 */             if (ii0010O01 instanceof OOollillo01) {
/* 5 */                 return ii0010O01;
                    }
/* 16 */            float f = -((O1Ooi0) this.I00iiI).I0000oI00();
/* 17 */            I0OIIO1o1 i0OIIO1o1 = new I0OIIO1o1();
/* 22 */            while (ii0010O01 instanceof I0OIIO1o1) {
/* 26 */                ii0010O01 = ((I0OIIO1o1) ii0010O01).I00000oIO;
/* 33 */                f += ((I0OIIO1o1) ii0010O01).I00000oOI;
                    }
/* 35 */            i0OIIO1o1.I00000oIO = ii0010O01;
/* 37 */            i0OIIO1o1.I00000oOI = f;
/* 39 */            VarHandle.storeStoreFence();
/* 77 */            return i0OIIO1o1;
                }

                @Override
                public void I00000oOI() {
/* 5 */             ((CountDownLatch) this.I00iiI).countDown();
                }

                @Override
                public void I0000Il00O(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
/* 7 */             ((IO0iOlIO1o) this.I00iiI).I00ilO0.removeCallbacksAndMessages(o1illlIiilIl);
                }

                @Override
                public void I0000O(O1illlIiilIl o1illlIiilIl, boolean z) {
/* 3 */             if (o1illlIiilIl instanceof Oli1l1l0) {
/* 15 */                ((Oli1l1l0) o1illlIiilIl).I001l0I00.I000iOII().I0000Il00O(false);
                    }
/* 22 */            O1l0OiO10IoI o1l0OiO10IoI = ((I0I1ii0i) this.I00iiI).I00ilI0I1;
/* 24 */            if (o1l0OiO10IoI != null) {
/* 26 */                o1l0OiO10IoI.I0000O(o1illlIiilIl, z);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000oI00(IOoilo iOoilo) throws Throwable {
                    OiloO1IOo oiloO1IOo;
/* 3 */             if (iOoilo instanceof OiloO1IOo) {
/* 6 */                 oiloO1IOo = (OiloO1IOo) iOoilo;
/* 8 */                 int i = oiloO1IOo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiloO1IOo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiloO1IOo = new OiloO1IOo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oiloO1IOo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiloO1IOo.I00iiO;
/* 32 */            if (i2 == 0) {
/* 69 */                lIoii1l01l0i.I00000oOI(obj);
/* 77 */                throw null;
                    }
/* 35 */            if (i2 != 1) {
/* 65 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 37 */            lIoii1l01l0i.I00000oOI(obj);
/* 42 */            I1OooIoiIO i1OooIoiIO = (I1OooIoiIO) this.I00iiI;
/* 44 */            OiloO0IOoII1 oiloO0IOoII1 = OiloO0IOoII1.I00iOIl;
/* 46 */            OiloO0IOoII1 oiloO0IOoII12 = OiloO0IOoII1.I00iiI;
/* 48 */            i1OooIoiIO.getClass();
/* 57 */            if (I1OooIoiIO.I00000oOI.compareAndSet(i1OooIoiIO, oiloO0IOoII1, oiloO0IOoII12)) {
/* 59 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 62 */            throw null;
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 5 */             ((CountDownLatch) this.I00iiI).countDown();
                }

                @Override
                public void I000II(long j) {
/* 5 */             ((o0oOOOIlO) this.I00iiI).onDownloadProgress(j);
                }

                @Override
                public void I000O01llI0(ilIoOl iliool) {
/* 16 */            ((o0oOOOIlO) this.I00iiI).onDownloadFailed(new GenAiException(iliool, iliool.I00iOIl, iliool.I0000oI00()));
                }

                @Override
                public i00iooo00li I000OOo1O(View view, i00iooo00li i00iooo00liVar) {
                    boolean z;
                    boolean z2;
                    boolean z3;
/* 3 */             i00iooo00li i00iooo00liVarI00000oOI = i00iooo00liVar;
/* 5 */             i00i1I1 i00i1i1 = i00iooo00liVarI00000oOI.I00000oIO;
/* 11 */            int i = i00i1i1.I000o00OoI0I().I00000oOI;
/* 17 */            I11oi01ll i11oi01ll = (I11oi01ll) this.I00iiI;
/* 19 */            Context context = i11oi01ll.I00ioIO;
/* 25 */            int i2 = i00i1i1.I000o00OoI0I().I00000oOI;
/* 27 */            ActionBarContextView actionBarContextView = i11oi01ll.I00oI0i;
/* 32 */            if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
/* 317 */               z = false;
                    } else {
/* 48 */                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i11oi01ll.I00oI0i.getLayoutParams();
/* 56 */                if (i11oi01ll.I00oI0i.isShown()) {
/* 60 */                    if (i11oi01ll.I011IOil == null) {
/* 67 */                        i11oi01ll.I011IOil = new Rect();
/* 74 */                        i11oi01ll.I011Ill = new Rect();
                            }
/* 76 */                    Rect rect = i11oi01ll.I011IOil;
/* 78 */                    Rect rect2 = i11oi01ll.I011Ill;
/* 104 */                   rect.set(i00i1i1.I000o00OoI0I().I00000oIO, i00i1i1.I000o00OoI0I().I00000oOI, i00i1i1.I000o00OoI0I().I0000Il00O, i00i1i1.I000o00OoI0I().I0000O);
/* 109 */                   OoolllolO.I00000oIO(i11oi01ll.I00olI, rect, rect2);
/* 112 */                   int i3 = rect.top;
/* 114 */                   int i4 = rect.left;
/* 116 */                   int i5 = rect.right;
/* 118 */                   ViewGroup viewGroup = i11oi01ll.I00olI;
/* 120 */                   WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 122 */                   i00iooo00li i00iooo00liVarI00000oIO = OooiIlOI0.I00000oIO(viewGroup);
/* 136 */                   int i6 = i00iooo00liVarI00000oIO == null ? 0 : i00iooo00liVarI00000oIO.I00000oIO.I000o00OoI0I().I00000oIO;
/* 148 */                   int i7 = i00iooo00liVarI00000oIO == null ? 0 : i00iooo00liVarI00000oIO.I00000oIO.I000o00OoI0I().I0000Il00O;
/* 152 */                   if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
/* 163 */                       z3 = false;
                            } else {
/* 165 */                       marginLayoutParams.topMargin = i3;
/* 167 */                       marginLayoutParams.leftMargin = i4;
/* 169 */                       marginLayoutParams.rightMargin = i5;
/* 171 */                       z3 = true;
                            }
/* 172 */                   if (i3 <= 0 || i11oi01ll.I00oliIiO01i != null) {
/* 210 */                       View view2 = i11oi01ll.I00oliIiO01i;
/* 212 */                       if (view2 != null) {
/* 218 */                           ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
/* 220 */                           int i8 = marginLayoutParams2.height;
/* 222 */                           int i9 = marginLayoutParams.topMargin;
/* 224 */                           if (i8 != i9 || marginLayoutParams2.leftMargin != i6 || marginLayoutParams2.rightMargin != i7) {
/* 234 */                               marginLayoutParams2.height = i9;
/* 236 */                               marginLayoutParams2.leftMargin = i6;
/* 238 */                               marginLayoutParams2.rightMargin = i7;
/* 242 */                               i11oi01ll.I00oliIiO01i.setLayoutParams(marginLayoutParams2);
                                    }
                                }
                            } else {
/* 180 */                       View view3 = new View(context);
/* 183 */                       i11oi01ll.I00oliIiO01i = view3;
/* 185 */                       view3.setVisibility(8);
/* 195 */                       FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
/* 198 */                       layoutParams.leftMargin = i6;
/* 200 */                       layoutParams.rightMargin = i7;
/* 206 */                       i11oi01ll.I00olI.addView(i11oi01ll.I00oliIiO01i, -1, layoutParams);
                            }
/* 245 */                   View view4 = i11oi01ll.I00oliIiO01i;
/* 251 */                   boolean z4 = view4 != null;
/* 252 */                   if (z4 && view4.getVisibility() != 0) {
/* 260 */                       View view5 = i11oi01ll.I00oliIiO01i;
/* 285 */                       view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                            }
/* 290 */                   if (!i11oi01ll.I0100i && z4) {
/* 294 */                       i2 = 0;
                            }
/* 295 */                   z = z4;
/* 296 */                   z2 = z3;
                        } else if (marginLayoutParams.topMargin != 0) {
/* 302 */                   marginLayoutParams.topMargin = 0;
/* 304 */                   z = false;
/* 305 */                   z2 = true;
                        } else {
/* 307 */                   z = false;
/* 308 */                   z2 = false;
                        }
/* 309 */               if (z2) {
/* 313 */                   i11oi01ll.I00oI0i.setLayoutParams(marginLayoutParams);
                        }
                    }
/* 318 */           View view6 = i11oi01ll.I00oliIiO01i;
/* 320 */           if (view6 != null) {
/* 328 */               view6.setVisibility(z ? 0 : 8);
                    }
/* 331 */           if (i != i2) {
/* 337 */               int i10 = i00i1i1.I000o00OoI0I().I00000oIO;
/* 343 */               int i11 = i00i1i1.I000o00OoI0I().I0000Il00O;
/* 349 */               int i12 = i00i1i1.I000o00OoI0I().I0000O;
/* 351 */               int i13 = Build.VERSION.SDK_INT;
/* 375 */               i00OOOOi i00ooo1lo = i13 >= 36 ? new i00OOO1lo(i00iooo00liVarI00000oOI) : i13 >= 35 ? new i00OIoI(i00iooo00liVarI00000oOI) : new i00OIl1Io1(i00iooo00liVarI00000oOI);
/* 382 */               i00ooo1lo.I0000oI00(Ioo0l0I.I00000oIO(i10, i2, i11, i12));
/* 385 */               i00iooo00liVarI00000oOI = i00ooo1lo.I00000oOI();
                    }
/* 389 */           WeakHashMap weakHashMap2 = OooiOl0ioo0i.I00000oIO;
/* 391 */           WindowInsets windowInsetsI00000oOI = i00iooo00liVarI00000oOI.I00000oOI();
/* 395 */           if (windowInsetsI00000oOI != null) {
/* 397 */               WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsI00000oOI);
/* 405 */               if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsI00000oOI)) {
/* 407 */                   return i00iooo00li.I0000Il00O(view, windowInsetsOnApplyWindowInsets);
                        }
                    }
/* 900 */           return i00iooo00liVarI00000oOI;
                }

                public Ioi1Io1o I000OiO() {
/* 3 */             Integer numValueOf = Integer.valueOf(Barcode.FORMAT_QR_CODE);
/* 15 */            OI0oiliol10O oI0oiliol10O = (OI0oiliol10O) this.I00iiI;
/* 24 */            Integer num = (Integer) oI0oiliol10O.I00000oOI(Ioi1iI0IiOl.I00ilI0I1, null);
/* 29 */            if (num != null) {
/* 33 */                oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I00100o1O0lo, num);
                    } else {
/* 37 */                Ioi11I1 ioi11I1 = Ioi1Io1o.I001lloI;
/* 39 */                I1ioiI i1ioiI = Ioi1iI0IiOl.I00ilO0;
/* 53 */                if (Objects.equals(oI0oiliol10O.I00000oOI(i1ioiI, null), 2)) {
/* 57 */                    oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 32);
                        } else if (Objects.equals(oI0oiliol10O.I00000oOI(i1ioiI, null), 3)) {
/* 77 */                    oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 32);
/* 82 */                    oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I0010I0i, numValueOf);
                        } else if (Objects.equals(oI0oiliol10O.I00000oOI(i1ioiI, null), 1)) {
/* 108 */                   oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I00100o1O0lo, 4101);
/* 115 */                   oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I0010o, Iio1oiI.I0000Il00O);
                        } else {
/* 121 */                   oI0oiliol10O.I0010I0i(IoiIOIliOIi1.I00100o1O0lo, numValueOf);
                        }
                    }
/* 124 */           Ioi1iI0IiOl ioi1iI0IiOlI00100o1O0lo = I00100o1O0lo();
/* 128 */           IoiIli1i0Oil.I001lllioOl(ioi1iI0IiOlI00100o1O0lo);
/* 133 */           Ioi1Io1o ioi1Io1o = new Ioi1Io1o(ioi1iI0IiOlI00100o1O0lo);
/* 141 */           ioi1Io1o.I0010o = new AtomicReference(null);
/* 144 */           ioi1Io1o.I001IIilI0O = -1;
/* 146 */           ioi1Io1o.I001IO000 = null;
/* 152 */           IIloOI iIloOI = new IIloOI(16);
/* 155 */           iIloOI.I00iiI = ioi1Io1o;
/* 157 */           VarHandle.storeStoreFence();
/* 160 */           ioi1Io1o.I001lllioOl = iIloOI;
/* 164 */           Ioi1iI0IiOl ioi1iI0IiOl = (Ioi1iI0IiOl) ioi1Io1o.I000OOo1O;
/* 166 */           I1ioiI i1ioiI2 = Ioi1iI0IiOl.I00iiI;
/* 172 */           if (ioi1iI0IiOl.I000O01llI0(i1ioiI2)) {
/* 184 */               ioi1Io1o.I0010I0i = ((Integer) ioi1iI0IiOl.I0000O(i1ioiI2)).intValue();
                    } else {
/* 187 */               ioi1Io1o.I0010I0i = 1;
                    }
/* 206 */           ioi1Io1o.I00111O = ((Integer) ioi1iI0IiOl.I00000oOI(Ioi1iI0IiOl.I00l0I0l0lO1, 0)).intValue();
/* 208 */           I1ioiI i1ioiI3 = Ioi1iI0IiOl.I00li1OI;
/* 214 */           Ioi11lOIIO0O ioi11lOIIO0O = (Ioi11lOIIO0O) ioi1iI0IiOl.I00000oOI(i1ioiI3, null);
/* 218 */           OiOOoiOOo oiOOoiOOo = new OiOOoiOOo();
/* 221 */           oiOOoiOOo.I00000oIO = ioi11lOIIO0O;
/* 228 */           oiOOoiOOo.I00000oOI = new Object();
/* 230 */           VarHandle.storeStoreFence();
/* 233 */           ioi1Io1o.I001i1O0Ol = oiOOoiOOo;
/* 235 */           VarHandle.storeStoreFence();
/* 244 */           Size size = (Size) oI0oiliol10O.I00000oOI(IoiIli1i0Oil.I001i1lo1io, null);
/* 246 */           if (size != null) {
/* 261 */               ioi1Io1o.I001IO000 = new Rational(size.getWidth(), size.getHeight());
                    }
/* 277 */           lII1OI11o1I.I0000O("The IO executor can't be null", (Executor) oI0oiliol10O.I00000oOI(O00IOo.I00II0Ol1O0l, O00Ii00o0.I00000oIO()));
/* 280 */           I1ioiI i1ioiI4 = Ioi1iI0IiOl.I00iiO;
/* 288 */           if (oI0oiliol10O.I00iOIl.containsKey(i1ioiI4)) {
/* 294 */               Integer num2 = (Integer) oI0oiliol10O.I0000O(i1ioiI4);
/* 296 */               if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
/* 343 */                   IioIoO10iOiI.I000OiO("The flash mode is not allowed to set: ", num2);
/* 19 */                    return null;
                        }
/* 326 */               if (num2.intValue() == 3 && oI0oiliol10O.I00000oOI(i1ioiI3, null) == null) {
/* 337 */                   I000II.I000iOII("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
/* 19 */                    return null;
                        }
                    }
/* 743 */           return ioi1Io1o;
                }

                @Override
                public void I000iOII(Object obj) {
/* 1 */             I0IIOOO1O i0iiooo1o = (I0IIOOO1O) obj;
/* 5 */             Ill1OlOOl ill1OlOOl = (Ill1OlOOl) this.I00iiI;
/* 13 */            Ill1IIIIO ill1IIIIO = (Ill1IIIIO) ill1OlOOl.I001lloI.pollFirst();
/* 17 */            if (ill1IIIIO == null) {
/* 33 */                Log.w("FragmentManager", "No IntentSenders were started for " + this);
/* 36 */                return;
                    }
/* 37 */            String str = ill1IIIIO.I00iOIl;
/* 39 */            int i = ill1IIIIO.I00iiI;
/* 43 */            Ill0l1 ill0l1I0010o = ill1OlOOl.I0000Il00O.I0010o(str);
/* 47 */            if (ill0l1I0010o != null) {
/* 71 */                ill0l1I0010o.I001IIilI0O(i, i0iiooo1o.I00iOIl, i0iiooo1o.I00iiI);
/* 77 */                return;
                    }
/* 63 */            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                }

                @Override
                public void I000l1(O1illlIiilIl o1illlIiilIl, O1ioIIl o1ioIIl) {
/* 3 */             IO0iOlIO1o iO0iOlIO1o = (IO0iOlIO1o) this.I00iiI;
/* 5 */             Handler handler = iO0iOlIO1o.I00ilO0;
/* 8 */             handler.removeCallbacksAndMessages(null);
/* 11 */            ArrayList arrayList = iO0iOlIO1o.I00ioIO;
/* 13 */            int size = arrayList.size();
/* 17 */            int i = 0;
/* 18 */            int i2 = 0;
                    while (true) {
/* 20 */                if (i2 >= size) {
/* 36 */                    i2 = -1;
                            break;
                        } else if (o1illlIiilIl == ((IO0iO0oo1o01) arrayList.get(i2)).I00000oOI) {
                            break;
                        } else {
/* 33 */                    i2++;
                        }
                    }
/* 37 */            if (i2 == -1) {
/* 39 */                return;
                    }
/* 40 */            int i3 = i2 + 1;
/* 53 */            IO0iO0oo1o01 iO0iO0oo1o01 = i3 < arrayList.size() ? (IO0iO0oo1o01) arrayList.get(i3) : null;
/* 57 */            IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(i);
/* 60 */            iO0iIlI1li.I00ilI0I1 = this;
/* 62 */            iO0iIlI1li.I00iiI = iO0iO0oo1o01;
/* 64 */            iO0iIlI1li.I00iiO = o1ioIIl;
/* 66 */            iO0iIlI1li.I00iio = o1illlIiilIl;
/* 68 */            VarHandle.storeStoreFence();
/* 78 */            handler.postAtTime(iO0iIlI1li, o1illlIiilIl, SystemClock.uptimeMillis() + 200);
                }

                @Override
                public boolean I000lI(O1illlIiilIl o1illlIiilIl) {
/* 3 */             I0I1ii0i i0I1ii0i = (I0I1ii0i) this.I00iiI;
/* 7 */             if (o1illlIiilIl == i0I1ii0i.I00iiO) {
/* 24 */                return false;
                    }
/* 13 */            O1ioIIl o1ioIIl = ((Oli1l1l0) o1illlIiilIl).I001lIiIIo1O;
/* 15 */            O1l0OiO10IoI o1l0OiO10IoI = i0I1ii0i.I00ilI0I1;
/* 17 */            if (o1l0OiO10IoI != null) {
/* 19 */                return o1l0OiO10IoI.I000lI(o1illlIiilIl);
                    }
/* 24 */            return false;
                }

                @Override
                public OI0oiliol10O I000o00OoI0I() {
/* 3 */             return (OI0oiliol10O) this.I00iiI;
                }

                public Ii110ilOil I000oI1ioi() {
/* 5 */             GalleryApplication galleryApplication = (GalleryApplication) this.I00iiI;
/* 7 */             I0oIIIl00 i0oIIIl00 = new I0oIIIl00();
/* 10 */            i0oIIIl00.I00iOIl = galleryApplication;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            Ii110ilOil ii110ilOil = new Ii110ilOil();
/* 20 */            ii110ilOil.I00000oOI = ii110ilOil;
/* 22 */            ii110ilOil.I00000oIO = i0oIIIl00;
/* 29 */            ii110ilOil.I0000Il00O = IlIi0I0.I000O01llI0(ii110ilOil, 2);
/* 36 */            ii110ilOil.I0000O = IlIi0I0.I000O01llI0(ii110ilOil, 1);
/* 43 */            ii110ilOil.I0000oI00 = IlIi0I0.I000O01llI0(ii110ilOil, 4);
/* 50 */            ii110ilOil.I0001Ioi1lo = IlIi0I0.I000O01llI0(ii110ilOil, 3);
/* 57 */            ii110ilOil.I000II = IlIi0I0.I000O01llI0(ii110ilOil, 6);
/* 64 */            ii110ilOil.I000O01llI0 = IlIi0I0.I000O01llI0(ii110ilOil, 5);
/* 72 */            ii110ilOil.I000OOo1O = IlIi0I0.I000O01llI0(ii110ilOil, 8);
/* 79 */            ii110ilOil.I000OiO = IlIi0I0.I000O01llI0(ii110ilOil, 7);
/* 87 */            ii110ilOil.I000iOII = IlIi0I0.I000O01llI0(ii110ilOil, 10);
/* 95 */            ii110ilOil.I000l1 = IlIi0I0.I000O01llI0(ii110ilOil, 9);
/* 102 */           ii110ilOil.I000lI = IlIi0I0.I000O01llI0(ii110ilOil, 0);
/* 110 */           ii110ilOil.I000o00OoI0I = IlIi0I0.I000O01llI0(ii110ilOil, 11);
/* 118 */           ii110ilOil.I000oI1ioi = IlIi0I0.I000O01llI0(ii110ilOil, 13);
/* 126 */           ii110ilOil.I00100l0 = IlIi0I0.I000O01llI0(ii110ilOil, 12);
/* 134 */           ii110ilOil.I00100o1O0lo = IlIi0I0.I000O01llI0(ii110ilOil, 14);
/* 142 */           ii110ilOil.I0010I0i = IlIi0I0.I000O01llI0(ii110ilOil, 15);
/* 150 */           ii110ilOil.I0010o = IlIi0I0.I000O01llI0(ii110ilOil, 16);
/* 158 */           ii110ilOil.I00111O = IlIi0I0.I000O01llI0(ii110ilOil, 18);
/* 166 */           ii110ilOil.I001IIilI0O = IlIi0I0.I000O01llI0(ii110ilOil, 17);
/* 174 */           ii110ilOil.I001IO000 = IlIi0I0.I000O01llI0(ii110ilOil, 20);
/* 182 */           ii110ilOil.I001i1O0Ol = IlIi0I0.I000O01llI0(ii110ilOil, 19);
/* 184 */           VarHandle.storeStoreFence();
/* 245 */           return ii110ilOil;
                }

                public OOi001oo1OOI I00100l0(int i) {
/* 9 */             return (OOi001oo1OOI) ((List) this.I00iiI).get(i);
                }

                public OlO01l1oOil I0010I0i() {
/* 1 */             IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 10 */            if (iiollO1llliI00000oIO.I0000Il00O() == 1) {
/* 14 */                return new IoilI10Iii0I(true);
                    }
/* 20 */            OIooliIO0 oIooliIO0I00000oIO = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 26 */            Ii1olIOi0i ii1olIOi0i = new Ii1olIOi0i();
/* 29 */            ii1olIOi0i.I00iOIl = oIooliIO0I00000oIO;
/* 31 */            ii1olIOi0i.I00iiI = this;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            iiollO1llliI00000oIO.I000O01llI0(ii1olIOi0i);
/* 55 */            return oIooliIO0I00000oIO;
                }

                @Override
                public Ioi1iI0IiOl I00100o1O0lo() {
/* 7 */             OIil0iio0 oIil0iio0I0001Ioi1lo = OIil0iio0.I0001Ioi1lo((OI0oiliol10O) this.I00iiI);
/* 11 */            Ioi1iI0IiOl ioi1iI0IiOl = new Ioi1iI0IiOl();
/* 14 */            ioi1iI0IiOl.I00iOIl = oIil0iio0I0001Ioi1lo;
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return ioi1iI0IiOl;
                }

                public I0oO0iO1l0lo I00111O(IoloOio0I ioloOio0I, I0lio1O01i01 i0lio1O01i01) {
                    int i;
                    long jI00IO1;
                    long j;
                    boolean z;
/* 7 */             O1IOillioo0I o1IOillioo0I = (O1IOillioo0I) this.I00iiI;
/* 13 */            ArrayList arrayList = (ArrayList) ioloOio0I.I00iiI;
/* 19 */            O1IOillioo0I o1IOillioo0I2 = new O1IOillioo0I(arrayList.size());
/* 22 */            int size = arrayList.size();
/* 26 */            int i2 = 0;
/* 27 */            while (i2 < size) {
/* 33 */                OO1il1IIii oO1il1IIii = (OO1il1IIii) arrayList.get(i2);
/* 35 */                long j2 = oO1il1IIii.I00000oIO;
/* 37 */                long j3 = oO1il1IIii.I00000oOI;
/* 43 */                OO1il10 oO1il10 = (OO1il10) o1IOillioo0I.I00000oOI(j2);
/* 45 */                if (oO1il10 == null) {
/* 49 */                    i = i2;
/* 51 */                    j = j3;
/* 47 */                    jI00IO1 = oO1il1IIii.I0000O;
/* 55 */                    z = false;
                        } else {
/* 60 */                    long j4 = oO1il10.I00000oIO;
/* 62 */                    boolean z2 = oO1il10.I0000Il00O;
/* 64 */                    i = i2;
/* 70 */                    jI00IO1 = i0lio1O01i01.I00IO1(oO1il10.I00000oOI);
/* 76 */                    j = j4;
/* 78 */                    z = z2;
                        }
/* 80 */                long j5 = oO1il1IIii.I00000oIO;
/* 86 */                ArrayList arrayList2 = arrayList;
/* 87 */                int i3 = size;
/* 136 */               o1IOillioo0I2.I0000O(j5, new OO1il00lI(j5, oO1il1IIii.I00000oOI, oO1il1IIii.I0000O, oO1il1IIii.I0000oI00, oO1il1IIii.I0001Ioi1lo, j, jI00IO1, z, oO1il1IIii.I000II, oO1il1IIii.I000OOo1O, oO1il1IIii.I000OiO, oO1il1IIii.I000iOII, oO1il1IIii.I000l1, oO1il1IIii.I000lI));
/* 139 */               boolean z3 = oO1il1IIii.I0000oI00;
/* 141 */               if (z3) {
/* 145 */                   long j6 = oO1il1IIii.I0000Il00O;
/* 147 */                   OO1il10 oO1il102 = new OO1il10();
/* 150 */                   oO1il102.I00000oIO = j3;
/* 152 */                   oO1il102.I00000oOI = j6;
/* 154 */                   oO1il102.I0000Il00O = z3;
/* 156 */                   VarHandle.storeStoreFence();
/* 159 */                   o1IOillioo0I.I0000O(j2, oO1il102);
                        } else {
/* 163 */                   o1IOillioo0I.I0000oI00(j2);
                        }
/* 166 */               i2 = i + 1;
/* 168 */               arrayList = arrayList2;
/* 169 */               size = i3;
                    }
/* 176 */           I0oO0iO1l0lo i0oO0iO1l0lo = new I0oO0iO1l0lo(3);
/* 179 */           i0oO0iO1l0lo.I00iiO = o1IOillioo0I2;
/* 181 */           i0oO0iO1l0lo.I00iio = ioloOio0I;
/* 183 */           VarHandle.storeStoreFence();
/* 332 */           return i0oO0iO1l0lo;
                }

                public void I001IIilI0O() {
/* 3 */             I1OooIoiIO i1OooIoiIO = (I1OooIoiIO) this.I00iiI;
/* 5 */             OiloO0IOoII1 oiloO0IOoII1 = OiloO0IOoII1.I00iiO;
/* 7 */             i1OooIoiIO.getClass();
/* 18 */            if (I1OooIoiIO.I00000oOI.getAndSet(i1OooIoiIO, oiloO0IOoII1) == OiloO0IOoII1.I00iiI) {
/* 55 */                throw null;
                    }
                }

                @Override
                public void onDone() {
/* 8 */             ((OOIoO0IIOO0) ((OOIoOo0O) this.I00iiI)).I0001Ioi1lo(null);
                }

                @Override
                public void onError(Throwable th) {
/* 7 */             ((OOIoO0IIOO0) ((OOIoOo0O) this.I00iiI)).I0001Ioi1lo(th);
                }

                @Override
                public void onFailure(Exception exc) {
                    switch (this.I00iOIl) {
                        case 3:
/* 18 */                    Log.e("BgRemover", "Model install failed", exc);
/* 27 */                    ((IIoOoIol0Io0) this.I00iiI).resumeWith(Boolean.FALSE);
                            break;
                        default:
/* 10 */                    ((CountDownLatch) this.I00iiI).countDown();
                            break;
                    }
                }

                @Override
                public void onMessage(Message message) {
/* 11 */            ((OOIoO0IIOO0) ((OOIoOo0O) this.I00iiI)).I000lI(message.toString());
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 30 */                    return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.I00iiI) + ')';
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
/* 20 */            return ((OoIOil1iIO) this.I00iiI).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("proto"), new O1oO0lOoI1(18));
                }

                @Override
                public void zzd() {
/* 5 */             ((o0oOOOIlO) this.I00iiI).onDownloadCompleted();
                }

                @Override
/* 24 */        public void zza(long j) {
/* 25 */            ((o0oOOOIlO) this.I00iiI).onDownloadStarted(j);
                }

/* 99 */        public Oi0Oooi(int i, boolean z) {
/* 100 */           this.I00iOIl = i;
                }

/* 100 */       public Oi0Oooi(LinkedHashSet linkedHashSet) {
                    this.I00iOIl = 0;
                    this.I00iiI = linkedHashSet;
                }

/* 101 */       public Oi0Oooi(Context context) {
                    boolean zIsEmpty;
                    this.I00iOIl = 21;
/* 103 */           SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    this.I00iiI = sharedPreferences;
/* 106 */           File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
/* 107 */           if (file.exists()) {
                        return;
                    }
                    try {
/* 108 */               if (file.createNewFile()) {
                            synchronized (this) {
/* 110 */                       zIsEmpty = sharedPreferences.getAll().isEmpty();
                            }
                            if (zIsEmpty) {
                                return;
                            }
/* 111 */                   Log.i("FirebaseMessaging", "App restored, clearing state");
                            synchronized (this) {
/* 113 */                       sharedPreferences.edit().clear().commit();
                            }
                        }
                    } catch (IOException e) {
/* 116 */               if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 117 */                   e.getMessage();
                        }
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 117 */       public Oi0Oooi(int i) {
/* 118 */           this(OI0oiliol10O.I000OOo1O());
                    this.I00iOIl = i;
                    switch (i) {
                        case PoseLandmark.RIGHT_KNEE:
                            this.I00iiI = new CountDownLatch(1);
                            break;
                        default:
                            break;
                    }
                }

/* 119 */       public Oi0Oooi(OI0oiliol10O oI0oiliol10O) {
                    this.I00iOIl = 12;
/* 121 */           this.I00iiI = oI0oiliol10O;
/* 122 */           I1ioiI i1ioiI = OloIIlI1o10.I00IioO0OiOi;
/* 123 */           Class cls = (Class) oI0oiliol10O.I00000oOI(i1ioiI, null);
/* 124 */           if (cls != null && !cls.equals(Ioi1Io1o.class)) {
/* 125 */               OoOil11Ol1o.I0010o("Invalid target class configuration for ", this, ": ", cls);
                        throw null;
                    }
/* 127 */           oI0oiliol10O.I0010I0i(OolIl0ii1.I00OIl, OolO01iOo0O.I00iOIl);
/* 128 */           oI0oiliol10O.I0010I0i(i1ioiI, Ioi1Io1o.class);
/* 129 */           I1ioiI i1ioiI2 = OloIIlI1o10.I00IOO;
                    if (oI0oiliol10O.I00000oOI(i1ioiI2, null) == null) {
/* 131 */               oI0oiliol10O.I0010I0i(i1ioiI2, Ioi1Io1o.class.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                }
            }
