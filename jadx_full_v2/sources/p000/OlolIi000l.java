            package p000;

            import android.app.ActivityOptions;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.Build;
            import android.util.Log;
            import android.view.textclassifier.TextClassification;
            import kotlin.jvm.functions.Function1;
            
            public final class OlolIi000l implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public OlolIi000l(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x02e3  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws PendingIntent.CanceledException {
                    long jFloatToRawIntBits;
                    long j;
                    Oo0il0olo1l oo0il0olo1lI0000O;
                    O0oIlOolIO o0oIlOolIO;
                    I1111OO10i i1111OO10i;
                    IOIli1iI1 iOIli1iI1;
/* 3 */             int i = this.I00iOIl;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 801 */                   Context context = (Context) this.I00iiI;
/* 805 */                   TextClassification textClassification = (TextClassification) this.I00iiO;
/* 807 */                   String text = textClassification.getText();
/* 823 */                   PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                            try {
/* 827 */                       ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
/* 835 */                       if (Build.VERSION.SDK_INT >= 36) {
/* 838 */                           activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                } else {
/* 844 */                           activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                }
/* 851 */                       activity.send(activityOptionsMakeBasic.toBundle());
                                break;
                            } catch (PendingIntent.CanceledException e) {
/* 879 */                       Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                break;
                            }
                        case 1:
/* 795 */                   iOi1II01i0.I0000O((Ii0110) this.I00iiI, null, Ii01I10.I00iio, new Oo0Il1il1ol(0, null, (Function1) this.I00iiO), 1);
                            break;
                        case 2:
/* 540 */                   Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) this.I00iiI;
/* 552 */                   long j2 = ((IooOl0ol01) ((OI10i0Il) this.I00iiO).getValue()).I00000oIO;
/* 554 */                   OIOlIiiioi oIOlIiiioiI000II = oo0IOoOi01.I000II();
/* 558 */                   if (oIOlIiiioiI000II != null) {
/* 560 */                       long j3 = oIOlIiiioiI000II.I00000oIO;
/* 562 */                       I1111OO10i i1111OO10iI000iOII = oo0IOoOi01.I000iOII();
/* 566 */                       if (i1111OO10iI000iOII == null || i1111OO10iI000iOII.I00iiI.length() == 0) {
/* 740 */                           jFloatToRawIntBits = 9205357640488583168L;
                                } else {
/* 584 */                           Io11Oll io11Oll = (Io11Oll) oo0IOoOi01.I0010I0i.getValue();
/* 597 */                           int i2 = io11Oll == null ? -1 : Oo0Ii1OO0Ii.I00000oIO[io11Oll.ordinal()];
/* 599 */                           if (i2 != -1) {
/* 608 */                               if (i2 != 1 && i2 != 2) {
/* 613 */                                   if (i2 != 3) {
/* 626 */                                       I000II.I00000oIO();
                                                break;
                                            } else {
/* 619 */                                       long j4 = oo0IOoOi01.I000l1().I00000oOI;
/* 621 */                                       int i3 = Oo0lI00l.I0000Il00O;
/* 623 */                                       j = j4 & 4294967295L;
                                            }
                                        } else {
/* 635 */                                   long j5 = oo0IOoOi01.I000l1().I00000oOI;
/* 637 */                                   int i4 = Oo0lI00l.I0000Il00O;
/* 639 */                                   j = j5 >> 32;
                                        }
/* 624 */                               int i5 = (int) j;
/* 641 */                               O0oIlOolIO o0oIlOolIO2 = oo0IOoOi01.I0000O;
/* 643 */                               if (o0oIlOolIO2 != null && (oo0il0olo1lI0000O = o0oIlOolIO2.I0000O()) != null && (o0oIlOolIO = oo0IOoOi01.I0000O) != null && (i1111OO10i = (I1111OO10i) o0oIlOolIO.I00000oIO.I00iiI) != null) {
/* 677 */                                   int iI0000Il00O = lIiioliIlo.I0000Il00O(oo0IOoOi01.I00000oOI.I000o00OoI0I(i5), 0, i1111OO10i.I00iiI.length());
/* 687 */                                   float fIntBitsToFloat = Float.intBitsToFloat((int) (oo0il0olo1lI0000O.I0000O(j3) >> 32));
/* 691 */                                   Oo0iil0o0oI oo0iil0o0oI = oo0il0olo1lI0000O.I00000oIO;
/* 693 */                                   OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 695 */                                   int iI0000O = oI0OIIiOi.I0000O(iI0000Il00O);
/* 699 */                                   float fI0001Ioi1lo = oo0iil0o0oI.I0001Ioi1lo(iI0000O);
/* 703 */                                   float fI000II = oo0iil0o0oI.I000II(iI0000O);
/* 715 */                                   float fI00000oOI = lIiioliIlo.I00000oOI(fIntBitsToFloat, Math.min(fI0001Ioi1lo, fI000II), Math.max(fI0001Ioi1lo, fI000II));
/* 725 */                                   if (IooOl0ol01.I0000Il00O(j2, 0L) || Math.abs(fIntBitsToFloat - fI00000oOI) <= ((int) (j2 >> 32)) / 2) {
/* 746 */                                       float fI0001Ioi1lo2 = oI0OIIiOi.I0001Ioi1lo(iI0000O);
/* 773 */                                       jFloatToRawIntBits = (Float.floatToRawIntBits(fI00000oOI) << 32) | (Float.floatToRawIntBits(((oI0OIIiOi.I00000oOI(iI0000O) - fI0001Ioi1lo2) / 2.0f) + fI0001Ioi1lo2) & 4294967295L);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
/* 491 */                   I11110l0o i11110l0o = (I11110l0o) this.I00iiI;
/* 495 */                   I101liloIo1 i101liloIo1 = (I101liloIo1) this.I00iiO;
/* 499 */                   O0ooioI1 o0ooioI1 = (O0ooioI1) i11110l0o.I00000oIO;
/* 503 */                   if (!(o0ooioI1 instanceof O0ooi0ll)) {
/* 526 */                       if ((o0ooioI1 instanceof O0ooi0iOlIOI) && (iOIli1iI1 = ((O0ooi0iOlIOI) o0ooioI1).I0000Il00O) != null) {
/* 534 */                           iOIli1iI1.I00000oIO();
                                    break;
                                }
                            } else {
/* 508 */                       IOIli1iI1 iOIli1iI12 = ((O0ooi0ll) o0ooioI1).I0000Il00O;
/* 510 */                       if (iOIli1iI12 == null) {
                                    try {
/* 520 */                               i101liloIo1.I00000oIO(((O0ooi0ll) o0ooioI1).I00000oIO);
                                        break;
                                    } catch (IllegalArgumentException unused) {
                                        break;
                                    }
                                } else {
/* 512 */                           iOIli1iI12.I00000oIO();
                                    break;
                                }
                            }
                            break;
                        case 4:
/* 460 */                   OoIO11oiiiil ooIO11oiiiil = (OoIO11oiiiil) this.I00iiO;
/* 464 */                   Context context2 = (Context) this.I00iiI;
/* 472 */                   OoIIo0oOI1 ooIIo0oOI1 = (OoIIo0oOI1) ooIO11oiiiil.I00000oOI.getValue();
/* 478 */                   ooIO11oiiiil.I000II(context2, OoIIOoO.I00iOIl, ooIIo0oOI1.I00000oOI);
/* 485 */                   ooIO11oiiiil.I000II(context2, OoIIOoO.I00iiI, ooIIo0oOI1.I00000oIO);
                            break;
                        case 5:
/* 454 */                   ((OoIoI0iii0) this.I00iiI).I000II((O1oIOiI11o0) this.I00iiO);
                            break;
                        case 6:
/* 300 */                   Ool0lIIlll ool0lIIlll = (Ool0lIIlll) this.I00iiI;
/* 304 */                   O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iiO;
/* 306 */                   OlO0OIIl1 olO0OIIl1 = ool0lIIlll.I00000oOI;
/* 308 */                   Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 312 */                   IOoil1iiIilo iOoil1iiIilo = null;
/* 319 */                   Ool0OI ool0OI = obj instanceof Ool0OI ? (Ool0OI) obj : null;
/* 320 */                   if (ool0OI != null) {
/* 356 */                       Bitmap bitmap = ((Ool0l1o1) olO0OIIl1.getValue()).I00000oIO;
/* 358 */                       if (bitmap != null) {
/* 396 */                           if (!((Ool0l1o1) olO0OIIl1.getValue()).I0000Il00O) {
/* 423 */                               olO0OIIl1.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, true, 0.0f, false, false, null, 49));
/* 443 */                               ool0lIIlll.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(ool0lIIlll), IiiIil1lOIO.I00000oIO, null, new OO11OilO(ool0OI, bitmap, ool0lIIlll, iOoil1iiIilo, 28), 2);
                                        break;
                                    }
                                } else {
/* 384 */                           olO0OIIl1.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, false, "Pick an image first", 63));
                                    break;
                                }
                            } else {
/* 346 */                       olO0OIIl1.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl1.getValue(), null, null, false, 0.0f, false, false, "Model not loaded. Try re-initializing.", 63));
                                break;
                            }
                            break;
                        case 7:
/* 221 */                   Ool0lIIlll ool0lIIlll2 = (Ool0lIIlll) this.I00iiO;
/* 226 */                   Context context3 = (Context) this.I00iiI;
/* 228 */                   OlO0OIIl1 olO0OIIl12 = ool0lIIlll2.I00000oOI;
/* 236 */                   Bitmap bitmap2 = ((Ool0l1o1) olO0OIIl12.getValue()).I00000oOI;
/* 238 */                   if (bitmap2 != null && !((Ool0l1o1) olO0OIIl12.getValue()).I0000oI00) {
/* 276 */                       olO0OIIl12.I000lI(null, Ool0l1o1.I00000oIO((Ool0l1o1) olO0OIIl12.getValue(), null, null, false, 0.0f, true, false, null, 47));
/* 279 */                       IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(ool0lIIlll2);
/* 283 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 293 */                       iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new OOl11O0ii0II(context3, ool0lIIlll2, bitmap2, null, 3), 2);
                                break;
                            }
                            break;
                        case 8:
/* 214 */                   ((i001ll1) this.I00iiI).I000II((O1oIOiI11o0) this.I00iiO);
                            break;
                        case 9:
/* 202 */                   ((i00I1il0) ((Oi1ol0llI) this.I00iiI).I00iiI).I00000oOI((Olioo011il1) this.I00iiO);
                            break;
                        case 10:
/* 59 */                    i0I01lo i0i01lo = (i0I01lo) this.I00iiI;
/* 63 */                    O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) this.I00iiO;
/* 65 */                    OlO0OIIl1 olO0OIIl13 = i0i01lo.I00000oOI;
/* 67 */                    Object obj2 = o1oIOiI11o02.I00IlilI0i0i;
/* 78 */                    i0I00l i0i00l = obj2 instanceof i0I00l ? (i0I00l) obj2 : null;
/* 79 */                    if (i0i00l != null) {
/* 121 */                       String string = OlOoOIi0o.I00OIo(((i0I01ii) olO0OIIl13.getValue()).I00000oIO).toString();
/* 129 */                       if (string.length() != 0 && !((i0I01ii) olO0OIIl13.getValue()).I00000oOI) {
/* 168 */                           olO0OIIl13.I000lI(null, i0I01ii.I00000oIO((i0I01ii) olO0OIIl13.getValue(), null, true, "Starting", 0.0f, null, null, false, 1));
/* 187 */                           i0i01lo.I0000O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(i0i01lo), IiiIil1lOIO.I00000oIO, null, new OOl11O0ii0II(i0i00l, string, i0i01lo, null, 5), 2);
                                    break;
                                }
                            } else {
/* 105 */                       olO0OIIl13.I000lI(null, i0I01ii.I00000oIO((i0I01ii) olO0OIIl13.getValue(), null, false, null, 0.0f, null, "Model not loaded — try re-initializing it.", false, 95));
                                break;
                            }
                            break;
                        default:
/* 17 */                    i0I01lo i0i01lo2 = (i0I01lo) this.I00iiO;
/* 22 */                    Context context4 = (Context) this.I00iiI;
/* 32 */                    Bitmap bitmap3 = ((i0I01ii) i0i01lo2.I00000oOI.getValue()).I0000oI00;
/* 34 */                    if (bitmap3 != null) {
/* 37 */                        IOO11li1OoII iOO11li1OoIII00000oIO2 = OooiooIOO.I00000oIO(i0i01lo2);
/* 41 */                        IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 52 */                        iOi1II01i0.I0000O(iOO11li1OoIII00000oIO2, Ii1oo1ooill0.I00iiI, null, new OOl11O0ii0II(context4, i0i01lo2, bitmap3, null, 6), 2);
                                break;
                            }
                            break;
                    }
/* 55 */            return ooiIlOl1iI;
/* 537 */           return ooiIlOl1iI;
/* 882 */           return ooiIlOl1iI;
                }
            }
