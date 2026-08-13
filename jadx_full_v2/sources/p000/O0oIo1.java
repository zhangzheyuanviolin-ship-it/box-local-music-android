            package p000;

            import android.graphics.Rect;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.LocaleList;
            import android.view.View;
            import android.view.inputmethod.DeleteGesture;
            import android.view.inputmethod.DeleteRangeGesture;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InsertGesture;
            import android.view.inputmethod.JoinOrSplitGesture;
            import android.view.inputmethod.RemoveSpaceGesture;
            import android.view.inputmethod.SelectGesture;
            import android.view.inputmethod.SelectRangeGesture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public final class O0oIo1 {
                public View I00000oIO;
                public IoloOio0I I00000oOI;
                public Function1 I0000Il00O;
                public Function1 I0000O;
                public O0oIlOolIO I0000oI00;
                public Oo0IOoOi01 I0001Ioi1lo;
                public Oooii1o1 I000II;
                public Oo0OI01Il I000O01llI0;
                public IoiiO1O1 I000OOo1O;
                public ArrayList I000OiO;
                public O0ioIllo0i1 I000iOII;
                public Rect I000l1;
                public O0oIIi I000lI;

                /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[PHI: r15
                  0x00a5: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00a3, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OOo010ill I00000oIO(EditorInfo editorInfo) {
                    int i;
                    int i2;
/* 5 */             Oo0OI01Il oo0OI01Il = this.I000O01llI0;
/* 9 */             String str = oo0OI01Il.I00000oIO.I00iiI;
/* 11 */            long j = oo0OI01Il.I00000oOI;
/* 13 */            IoiiO1O1 ioiiO1O1 = this.I000OOo1O;
/* 15 */            int i3 = ioiiO1O1.I0000oI00;
/* 17 */            int i4 = ioiiO1O1.I0000O;
/* 19 */            boolean z = ioiiO1O1.I00000oIO;
/* 25 */            int i5 = 3;
/* 28 */            if (i3 == 1) {
/* 34 */                i = z ? 6 : 0;
                    } else if (i3 == 0) {
/* 38 */                i = 1;
                    } else if (i3 == 2) {
/* 42 */                i = 2;
                    } else if (i3 == 6) {
/* 46 */                i = 5;
                    } else if (i3 == 5) {
/* 50 */                i = 7;
                    } else if (i3 == 3) {
/* 54 */                i = 3;
                    } else if (i3 == 4) {
/* 58 */                i = 4;
                    } else {
/* 60 */                if (i3 != 7) {
/* 602 */                   I000II.I001IO000("invalid ImeAction");
/* 598 */                   return null;
                        }
                    }
/* 63 */            editorInfo.imeOptions = i;
/* 65 */            O11oiiOIl0O o11oiiOIl0O = ioiiO1O1.I0001Ioi1lo;
/* 75 */            if (O0000Ioio00.I0000O(o11oiiOIl0O, O11oiiOIl0O.I00iiO)) {
/* 78 */                editorInfo.hintLocales = null;
                    } else {
/* 87 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(o11oiiOIl0O, 10));
/* 92 */                Iterator it = o11oiiOIl0O.I00iOIl.iterator();
/* 100 */               while (it.hasNext()) {
/* 110 */                   arrayList.add(((O11oOOio1iO) it.next()).I00000oIO);
                        }
/* 121 */               Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
/* 135 */               editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                    }
/* 137 */           int i6 = 16;
/* 143 */           if (i4 == 1) {
/* 145 */               i2 = 1;
                    } else if (i4 == 2) {
                        editorInfo.imeOptions |= Integer.MIN_VALUE;
/* 145 */               i2 = 1;
                    } else if (i4 == 3) {
/* 161 */               i2 = 2;
                    } else if (i4 == 4) {
/* 166 */               i2 = i5;
                    } else {
/* 169 */               i2 = 17;
/* 172 */               if (i4 != 5) {
/* 177 */                   if (i4 == 6) {
/* 179 */                       i2 = 33;
                            } else if (i4 == 7) {
/* 186 */                       i2 = 129;
                            } else {
/* 190 */                       i5 = 18;
/* 192 */                       if (i4 != 8) {
/* 197 */                           if (i4 == 9) {
/* 199 */                               i2 = 8194;
                                    } else if (i4 == 10) {
/* 205 */                               i2 = 145;
                                    } else if (i4 == 11) {
/* 213 */                               i2 = 113;
                                    } else if (i4 == 12) {
/* 221 */                               i2 = 97;
                                    } else if (i4 == 13) {
/* 228 */                               i2 = 49;
                                    } else if (i4 == 14) {
/* 235 */                               i2 = 65;
                                    } else if (i4 == 15) {
/* 242 */                               i2 = 81;
                                    } else if (i4 == 16) {
/* 247 */                               i2 = 177;
                                    } else if (i4 == 17) {
/* 252 */                               i2 = 193;
                                    } else if (i4 == 18) {
/* 257 */                               i2 = 4;
                                    } else {
/* 261 */                               i2 = 20;
/* 263 */                               if (i4 != 19) {
/* 266 */                                   if (i4 == 20) {
/* 268 */                                       i2 = 36;
                                            } else if (i4 == 21) {
/* 275 */                                       i2 = 4098;
                                            } else if (i4 == 22) {
/* 282 */                                       i2 = 12290;
                                            } else if (i4 == 23) {
/* 287 */                                       i2 = 8210;
                                            } else if (i4 == 24) {
/* 294 */                                       i2 = 4114;
                                            } else {
/* 299 */                                       if (i4 != 25) {
/* 592 */                                           I000II.I001IO000("Invalid Keyboard Type");
/* 595 */                                           return null;
                                                }
/* 301 */                                       i2 = 12306;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 303 */           editorInfo.inputType = i2;
/* 305 */           if (!z && (i2 & 15) == 1) {
/* 313 */               i2 |= 131072;
/* 314 */               editorInfo.inputType = i2;
/* 318 */               if (ioiiO1O1.I0000oI00 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
/* 329 */           if ((i2 & 15) == 1) {
/* 331 */               int i7 = ioiiO1O1.I00000oOI;
/* 333 */               if (i7 == 1) {
/* 335 */                   i2 |= Barcode.FORMAT_AZTEC;
/* 337 */                   editorInfo.inputType = i2;
                        } else if (i7 == 2) {
/* 342 */                   i2 |= 8192;
/* 344 */                   editorInfo.inputType = i2;
                        } else if (i7 == 3) {
/* 350 */                   i2 |= 16384;
/* 352 */                   editorInfo.inputType = i2;
                        }
/* 356 */               if (ioiiO1O1.I0000Il00O) {
/* 361 */                   i2 |= 32768;
/* 362 */                   editorInfo.inputType = i2;
                        }
/* 368 */               if (Build.VERSION.SDK_INT >= 37) {
/* 373 */                   editorInfo.inputType = 2097152 | i2;
                        }
                    }
/* 375 */           int i8 = Oo0lI00l.I0000Il00O;
/* 382 */           editorInfo.initialSelStart = (int) (j >> 32);
/* 391 */           editorInfo.initialSelEnd = (int) (j & 4294967295L);
/* 394 */           editorInfo.setInitialSurroundingSubText(str, 0);
                    editorInfo.imeOptions |= 33554432;
/* 409 */           if (i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
/* 435 */               if (Build.VERSION.SDK_INT >= 35) {
/* 437 */                   Iioi1Oi0ll.I00000oOI(editorInfo, false);
                        }
/* 440 */               Bundle bundle = editorInfo.extras;
/* 442 */               if (bundle == null) {
/* 446 */                   bundle = new Bundle();
/* 449 */                   editorInfo.extras = bundle;
                        }
/* 451 */               bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                    } else {
/* 457 */               if (Build.VERSION.SDK_INT >= 35) {
/* 459 */                   Iioi1Oi0ll.I00000oOI(editorInfo, true);
                        }
/* 462 */               Bundle bundle2 = editorInfo.extras;
/* 464 */               if (bundle2 == null) {
/* 468 */                   bundle2 = new Bundle();
/* 471 */                   editorInfo.extras = bundle2;
                        }
/* 473 */               bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
/* 498 */               editorInfo.setSupportedHandwritingGestures(IOOi1I.I000O01llI0(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
/* 509 */               editorInfo.setSupportedHandwritingGesturePreviews(I1IoiO1l.I00IlilI0i0i(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
                    }
/* 512 */           O0oIi0i o0oIi0i = O0oIi1.I00000oIO;
/* 518 */           if (IiollO1llli.I0000O()) {
/* 525 */               IiollO1llli.I00000oIO().I000OOo1O(editorInfo);
                    }
/* 528 */           Oo0OI01Il oo0OI01Il2 = this.I000O01llI0;
/* 532 */           boolean z2 = this.I000OOo1O.I0000Il00O;
/* 536 */           O1OIll00i o1OIll00i = new O1OIll00i(i6);
/* 539 */           o1OIll00i.I00iiI = this;
/* 541 */           VarHandle.storeStoreFence();
/* 544 */           O0oIlOolIO o0oIlOolIO = this.I0000oI00;
/* 546 */           Oo0IOoOi01 oo0IOoOi01 = this.I0001Ioi1lo;
/* 548 */           Oooii1o1 oooii1o1 = this.I000II;
/* 552 */           OOo010ill oOo010ill = new OOo010ill();
/* 555 */           oOo010ill.I00000oIO = o1OIll00i;
/* 557 */           oOo010ill.I00000oOI = z2;
/* 559 */           oOo010ill.I0000Il00O = o0oIlOolIO;
/* 561 */           oOo010ill.I0000O = oo0IOoOi01;
/* 563 */           oOo010ill.I0000oI00 = oooii1o1;
/* 565 */           oOo010ill.I000II = oo0OI01Il2;
/* 572 */           oOo010ill.I000OiO = new ArrayList();
/* 574 */           oOo010ill.I000iOII = true;
/* 576 */           VarHandle.storeStoreFence();
/* 586 */           this.I000OiO.add(new WeakReference(oOo010ill));
/* 589 */           return oOo010ill;
                }
            }
