            package p000;

            import android.graphics.Typeface;
            import android.os.LocaleList;
            import android.text.Spannable;
            import android.text.SpannableString;
            import android.text.TextPaint;
            import android.text.TextUtils;
            import android.text.style.BackgroundColorSpan;
            import android.text.style.LeadingMarginSpan;
            import android.text.style.ScaleXSpan;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            
            public abstract class l1o1o11OIIOo {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:131:0x02c4  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x02ce  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x02d3  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x02d8  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x02db  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x02df  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x02e2  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0306  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x0378  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x03a8  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x03ae  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x03b1  */
                /* JADX WARN: Removed duplicated region for block: B:187:0x03c7  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x03d4  */
                /* JADX WARN: Removed duplicated region for block: B:194:0x03e1  */
                /* JADX WARN: Removed duplicated region for block: B:202:0x0409  */
                /* JADX WARN: Removed duplicated region for block: B:204:0x040d  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x0410  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x0417  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x041b  */
                /* JADX WARN: Removed duplicated region for block: B:214:0x0429  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x0475  */
                /* JADX WARN: Removed duplicated region for block: B:259:0x051f  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x0536  */
                /* JADX WARN: Removed duplicated region for block: B:277:0x0562  */
                /* JADX WARN: Removed duplicated region for block: B:286:0x0573  */
                /* JADX WARN: Removed duplicated region for block: B:289:0x05b5  */
                /* JADX WARN: Removed duplicated region for block: B:298:0x05ee  */
                /* JADX WARN: Removed duplicated region for block: B:328:0x0690  */
                /* JADX WARN: Removed duplicated region for block: B:393:0x0838  */
                /* JADX WARN: Removed duplicated region for block: B:404:0x0861  */
                /* JADX WARN: Removed duplicated region for block: B:417:0x08b8  */
                /* JADX WARN: Removed duplicated region for block: B:423:0x08df  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final I0ol0iioI I00000oIO(String str, Oo0lloOiiIOI oo0lloOiiIOI, List list, IiIooOOOI iiIooOOOI, IliO0o11i01 iliO0o11i01, List list2, boolean z) {
                    boolean zBooleanValue;
                    Locale locale;
                    int i;
                    Object obj;
                    long j;
                    long j2;
                    I0ol0iioI i0ol0iioI;
                    boolean z2;
                    boolean z3;
                    OlIIi1oIIOlo olIIi1oIIOlo;
                    float textSize;
                    IiIooOOOI iiIooOOOI2;
                    boolean z4;
                    String str2;
                    CharSequence charSequenceI000II;
                    long j3;
                    OlIIi1oIIOlo olIIi1oIIOlo2;
                    OIoioI0OIiI oIoioI0OIiI;
                    boolean z5;
                    OO1Oi01o0 oO1Oi01o0;
                    O0oo0I00 o0oo0I00;
                    float fI00000oOI;
                    int i2;
                    Oo0OOliO01o oo0OOliO01o;
                    I100o1l i100o1l;
                    IiIooOOOI iiIooOOOI3;
                    List list3;
                    I0ol0iioI i0ol0iioI2;
                    ArrayList arrayList;
                    int size;
                    int i3;
                    I100o1l i100o1l2;
                    int i4;
                    OlIIi1oIIOlo olIIi1oIIOlo3;
                    ArrayList arrayList2;
                    List list4;
                    int size2;
                    int i5;
                    boolean z6;
                    Oo0OOliO01o oo0OOliO01o2;
                    int i6;
                    IiIooOOOI iiIooOOOI4;
                    O0oO0O o0oO0O;
                    int i7;
                    int i8;
                    boolean z7;
                    IiIooOOOI iiIooOOOI5;
                    OIoioI0OIiI oIoioI0OIiI2;
                    int i9;
                    float fI0000O;
                    OO1Il0I1 oO1Il0I1;
                    CharSequence charSequence;
                    OO1Il0I1 oO1Il0I12;
/* 5 */             List list5 = list;
/* 11 */            I0ol0iioI i0ol0iioI3 = new I0ol0iioI();
/* 14 */            i0ol0iioI3.I00iOIl = str;
/* 16 */            i0ol0iioI3.I00iiI = oo0lloOiiIOI;
/* 18 */            i0ol0iioI3.I00iiO = list5;
/* 22 */            i0ol0iioI3.I00iio = list2;
/* 26 */            i0ol0iioI3.I00ilI0I1 = iliO0o11i01;
/* 28 */            i0ol0iioI3.I00ilO0 = iiIooOOOI;
/* 32 */            i0ol0iioI3.I00io1l = z;
/* 36 */            float fI00000oIO = iiIooOOOI.I00000oIO();
/* 41 */            I100o1l i100o1l3 = new I100o1l(1);
/* 44 */            ((TextPaint) i100o1l3).density = fI00000oIO;
/* 48 */            i100o1l3.I00000oOI = OlooIOI0O.I00000oOI;
/* 51 */            i100o1l3.I0000Il00O = 3;
/* 55 */            i100o1l3.I0000O = OioOII0oI.I0000O;
/* 57 */            i0ol0iioI3.I00ioIO = i100o1l3;
/* 59 */            boolean zI00000oOI = I00000oOI(oo0lloOiiIOI);
/* 63 */            OlIIi1oIIOlo olIIi1oIIOlo4 = oo0lloOiiIOI.I00000oIO;
/* 65 */            OIoioI0OIiI oIoioI0OIiI3 = oo0lloOiiIOI.I00000oOI;
/* 67 */            if (zI00000oOI) {
/* 71 */                Oi0Oooi oi0Oooi = Iioo1i0.I00000oIO;
/* 73 */                Oi0Oooi oi0Oooi2 = Iioo1i0.I00000oIO;
/* 77 */                OlO01l1oOil olO01l1oOilI0010I0i = (OlO01l1oOil) oi0Oooi2.I00iiI;
/* 79 */                if (olO01l1oOilI0010I0i == null) {
/* 86 */                    if (IiollO1llli.I0000O()) {
/* 88 */                        olO01l1oOilI0010I0i = oi0Oooi2.I0010I0i();
/* 92 */                        oi0Oooi2.I00iiI = olO01l1oOilI0010I0i;
                            } else {
/* 95 */                        olO01l1oOilI0010I0i = iIO0o0oOo00.I00000oIO;
                            }
                        }
/* 103 */               zBooleanValue = ((Boolean) olO01l1oOilI0010I0i.getValue()).booleanValue();
                    } else {
/* 69 */                zBooleanValue = false;
                    }
/* 107 */           i0ol0iioI3.I00ll1 = zBooleanValue;
/* 109 */           int i10 = oIoioI0OIiI3.I00000oOI;
/* 111 */           O11oiiOIl0O o11oiiOIl0O = olIIi1oIIOlo4.I000iOII;
/* 113 */           IlilIIiIiO ililIIiIiO = olIIi1oIIOlo4.I0000Il00O;
/* 115 */           Ilil10i ilil10i = olIIi1oIIOlo4.I0000O;
/* 122 */           if (i10 != 4) {
/* 126 */               if (i10 != 5) {
/* 130 */                   if (i10 == 1) {
/* 132 */                       i = 0;
                            } else if (i10 == 2) {
/* 136 */                       i = 1;
                            } else {
/* 138 */                       if (i10 != 3 && i10 != 0) {
/* 2662 */                          I000II.I001IO000("Invalid TextDirection.");
/* 119 */                           return null;
                                }
/* 143 */                       if (o11oiiOIl0O == null || (locale = ((O11oOOio1iO) o11oiiOIl0O.I00iOIl.get(0)).I00000oIO) == null) {
/* 158 */                           locale = Locale.getDefault();
                                }
/* 162 */                       int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(locale);
/* 166 */                       i = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                            }
                        }
                    }
/* 171 */           i0ol0iioI3.I00lli11 = i;
/* 174 */           i0ol0iioI3.I00lll10 = -1;
/* 179 */           I0oioiIIlo i0oioiIIlo = new I0oioiIIlo(0);
/* 182 */           i0oioiIIlo.I00iiI = i0ol0iioI3;
/* 184 */           VarHandle.storeStoreFence();
/* 187 */           Oo0l0I oo0l0I = oIoioI0OIiI3.I000OOo1O;
/* 189 */           if (oo0l0I == null) {
/* 191 */               oo0l0I = Oo0l0I.I0000Il00O;
                    }
/* 210 */           i100o1l3.setFlags(oo0l0I.I00000oOI ? i100o1l3.getFlags() | Barcode.FORMAT_ITF : i100o1l3.getFlags() & (-129));
/* 213 */           int i11 = oo0l0I.I00000oIO;
/* 215 */           if (i11 == 1) {
/* 223 */               i100o1l3.setFlags(i100o1l3.getFlags() | 64);
/* 227 */               i100o1l3.setHinting(0);
                    } else if (i11 == 2) {
/* 234 */               i100o1l3.getFlags();
/* 237 */               i100o1l3.setHinting(1);
                    } else if (i11 == 3) {
/* 243 */               i100o1l3.getFlags();
/* 246 */               i100o1l3.setHinting(0);
                    } else {
/* 250 */               i100o1l3.getFlags();
                    }
/* 256 */           int size3 = list5.size();
/* 260 */           int i12 = 0;
                    while (true) {
/* 261 */               if (i12 >= size3) {
/* 282 */                   obj = null;
                            break;
                        }
/* 263 */               obj = list5.get(i12);
/* 275 */               if (((I11110l0o) obj).I00000oIO instanceof OlIIi1oIIOlo) {
                            break;
                        }
/* 278 */               i12++;
                    }
/* 291 */           boolean z8 = obj != null;
/* 292 */           long j4 = olIIi1oIIOlo4.I00000oOI;
/* 294 */           String str3 = olIIi1oIIOlo4.I000II;
/* 296 */           O11oiiOIl0O o11oiiOIl0O2 = olIIi1oIIOlo4.I000iOII;
/* 298 */           Oo0OO1I1i oo0OO1I1i = olIIi1oIIOlo4.I00000oIO;
/* 300 */           Oo0OOlO0 oo0OOlO0 = olIIi1oIIOlo4.I000OiO;
/* 302 */           boolean z9 = z8;
/* 304 */           long j5 = olIIi1oIIOlo4.I000O01llI0;
/* 308 */           long jI0000Il00O = Oo0o1OiIo.I0000Il00O(j4);
/* 330 */           if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 336 */               i100o1l3.setTextSize(iiIooOOOI.I00oO101o(j4));
                    } else if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 355 */               i100o1l3.setTextSize(Oo0o1OiIo.I0000O(j4) * i100o1l3.getTextSize());
                    }
/* 358 */           IliO1o11o iliO1o11o = olIIi1oIIOlo4.I0001Ioi1lo;
/* 360 */           if (iliO1o11o != null || ilil10i != null || ililIIiIiO != null) {
/* 366 */               if (ililIIiIiO == null) {
/* 368 */                   ililIIiIiO = IlilIIiIiO.I00ioIO;
                        }
/* 376 */               Ilil10i ilil10iI00000oIO = Ilil10i.I00000oIO(ilil10i != null ? ilil10i.I00000oIO : 0);
/* 380 */               Ilil10oOo ilil10oOo = olIIi1oIIOlo4.I0000oI00;
/* 400 */               i100o1l3.setTypeface((Typeface) i0oioiIIlo.I000l1(iliO1o11o, ililIIiIiO, ilil10iI00000oIO, Ilil10oOo.I00000oIO(ilil10oOo != null ? ilil10oOo.I00000oIO : 65535)));
                    }
/* 405 */           if (o11oiiOIl0O2 != null) {
/* 407 */               O11oiiOIl0O o11oiiOIl0O3 = O11oiiOIl0O.I00iiO;
/* 419 */               if (!o11oiiOIl0O2.equals(OO1Iii0lOo.I00000oIO.I00111O())) {
/* 427 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(o11oiiOIl0O2, 10));
/* 432 */                   Iterator it = o11oiiOIl0O2.I00iOIl.iterator();
/* 440 */                   while (it.hasNext()) {
/* 450 */                       arrayList3.add(((O11oOOio1iO) it.next()).I00000oIO);
                            }
/* 461 */                   Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
/* 475 */                   i100o1l3.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                        }
                    }
/* 478 */           if (str3 != null && !str3.equals("")) {
/* 490 */               i100o1l3.setFontFeatureSettings(str3);
                    }
/* 493 */           if (oo0OOlO0 != null && !oo0OOlO0.equals(Oo0OOlO0.I0000Il00O)) {
/* 512 */               i100o1l3.setTextScaleX(i100o1l3.getTextScaleX() * oo0OOlO0.I00000oIO);
/* 522 */               i100o1l3.setTextSkewX(i100o1l3.getTextSkewX() + oo0OOlO0.I00000oOI);
                    }
/* 529 */           i100o1l3.I0000O(oo0OO1I1i.I00000oIO());
/* 545 */           i100o1l3.I0000Il00O(oo0OO1I1i.I00000oOI(), 9205357640488583168L, oo0OO1I1i.I0000Il00O());
/* 550 */           i100o1l3.I0001Ioi1lo(olIIi1oIIOlo4.I000o00OoI0I);
/* 555 */           i100o1l3.I000II(olIIi1oIIOlo4.I000lI);
/* 560 */           i100o1l3.I0000oI00(olIIi1oIIOlo4.I00100l0);
/* 577 */           if (!Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j5), 4294967296L) || Oo0o1OiIo.I0000O(j5) == 0.0f) {
/* 587 */               j = j5;
/* 589 */               j2 = 9205357640488583168L;
/* 627 */               if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 8589934592L)) {
/* 633 */                   i100o1l3.setLetterSpacing(Oo0o1OiIo.I0000O(j));
                        }
                    } else {
/* 600 */               float textScaleX = i100o1l3.getTextScaleX() * i100o1l3.getTextSize();
/* 601 */               j = j5;
/* 603 */               float fI00oO101o = iiIooOOOI.I00oO101o(j);
/* 609 */               if (textScaleX != 0.0f) {
/* 615 */                   i100o1l3.setLetterSpacing(fI00oO101o / textScaleX);
                        }
/* 611 */               j2 = 9205357640488583168L;
                    }
/* 636 */           long j6 = olIIi1oIIOlo4.I000l1;
/* 638 */           I1oi0illolii i1oi0illolii = olIIi1oIIOlo4.I000OOo1O;
/* 671 */           boolean z10 = z9 && Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 4294967296L) && Oo0o1OiIo.I0000O(j) != 0.0f;
/* 672 */           long j7 = IOOiio0i.I000o00OoI0I;
/* 678 */           if (!Ooi0i1.I00000oOI(j6, j7)) {
/* 680 */               i0ol0iioI = i0ol0iioI3;
/* 687 */               z2 = Ooi0i1.I00000oOI(j6, IOOiio0i.I000lI) ? false : true;
/* 709 */               z3 = i1oi0illolii == null && Float.compare(i1oi0illolii.I00000oIO, 0.0f) != 0;
/* 710 */               if (!z10 || z2 || z3) {
/* 719 */                   if (!z10) {
/* 724 */                       j = Oo0o1OiIo.I0000Il00O;
                            }
/* 768 */                   olIIi1oIIOlo = new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, j, !z3 ? i1oi0illolii : null, null, null, !z2 ? j6 : j7, null, null, 63103);
                        } else {
/* 716 */                   olIIi1oIIOlo = null;
                        }
/* 773 */               if (olIIi1oIIOlo != null) {
/* 779 */                   int size4 = list5.size() + 1;
/* 783 */                   ArrayList arrayList4 = new ArrayList(size4);
/* 786 */                   int i13 = 0;
/* 787 */                   while (i13 < size4) {
/* 810 */                       arrayList4.add(i13 == 0 ? new I11110l0o(olIIi1oIIOlo, 0, str.length()) : (I11110l0o) list5.get(i13 - 1));
/* 813 */                       i13++;
                            }
/* 816 */                   list5 = arrayList4;
                        }
/* 817 */               textSize = i100o1l3.getTextSize();
/* 821 */               Oo0lloOiiIOI oo0lloOiiIOI2 = i0ol0iioI.I00iiI;
/* 823 */               List list6 = i0ol0iioI.I00iio;
/* 825 */               iiIooOOOI2 = i0ol0iioI.I00ilO0;
/* 827 */               z4 = i0ol0iioI.I00ll1;
/* 829 */               boolean z11 = i0ol0iioI.I00io1l;
/* 831 */               boolean zI00000oIO = i0ol0iioI.I00000oIO();
/* 835 */               I0oillooIio1 i0oillooIio1 = I0oioi.I00000oIO;
/* 837 */               if (z4 || !IiollO1llli.I0000O()) {
/* 889 */                   str2 = str;
/* 891 */                   charSequenceI000II = str2;
                        } else {
/* 845 */                   OO1Oi01o0 oO1Oi01o02 = oo0lloOiiIOI2.I0000Il00O;
/* 860 */                   IioolI0lo0il iioolI0lo0ilI00000oIO = (oO1Oi01o02 == null || (oO1Il0I12 = oO1Oi01o02.I00000oOI) == null) ? null : IioolI0lo0il.I00000oIO(oO1Il0I12.I00000oOI);
/* 882 */                   str2 = str;
/* 884 */                   charSequenceI000II = IiollO1llli.I00000oIO().I000II(0, str.length(), (iioolI0lo0ilI00000oIO != null && iioolI0lo0ilI00000oIO.I00000oIO == 2) ? 1 : 0, str2);
                        }
/* 901 */               if (!list5.isEmpty() && list6.isEmpty()) {
/* 913 */                   j3 = 0;
/* 921 */                   if (O0000Ioio00.I0000O(oo0lloOiiIOI2.I00000oOI.I0000O, Oo0OOliO01o.I0000Il00O) && (oo0lloOiiIOI2.I00000oOI.I0000Il00O & 1095216660480L) == 0) {
/* 933 */                       i100o1l2 = i100o1l3;
                                charSequence = charSequenceI000II;
                            }
/* 2622 */                  i0ol0iioI.I00l0I0l0lO1 = charSequence;
/* 2626 */                  int i14 = i0ol0iioI.I00lli11;
/* 2628 */                  O0iOlIOIl0 o0iOlIOIl0 = new O0iOlIOIl0();
/* 2631 */                  o0iOlIOIl0.I00000oIO = charSequence;
/* 2635 */                  o0iOlIOIl0.I00000oOI = i100o1l2;
/* 2637 */                  o0iOlIOIl0.I0000Il00O = i14;
/* 2641 */                  o0iOlIOIl0.I0000O = Float.NaN;
/* 2643 */                  o0iOlIOIl0.I0000oI00 = Float.NaN;
/* 2645 */                  VarHandle.storeStoreFence();
/* 2648 */                  i0ol0iioI.I00l0OO0IO = o0iOlIOIl0;
/* 2650 */                  VarHandle.storeStoreFence();
/* 2653 */                  return i0ol0iioI;
                        }
/* 937 */               j3 = 0;
/* 948 */               Spannable spannableString = !(charSequenceI000II instanceof Spannable) ? (Spannable) charSequenceI000II : new SpannableString(charSequenceI000II);
/* 952 */               olIIi1oIIOlo2 = oo0lloOiiIOI2.I00000oIO;
/* 954 */               oIoioI0OIiI = oo0lloOiiIOI2.I00000oOI;
/* 966 */               if (O0000Ioio00.I0000O(olIIi1oIIOlo2.I000lI, OlooIOI0O.I0000Il00O)) {
/* 981 */                   z5 = z11;
                        } else {
/* 974 */                   z5 = z11;
/* 977 */                   spannableString.setSpan(I0oioi.I00000oIO, 0, str2.length(), 33);
                        }
/* 983 */               oO1Oi01o0 = oo0lloOiiIOI2.I0000Il00O;
/* 995 */               if (((oO1Oi01o0 != null || (oO1Il0I1 = oO1Oi01o0.I00000oOI) == null) ? false : oO1Il0I1.I00000oIO) || oIoioI0OIiI.I0001Ioi1lo != null) {
/* 1041 */                  boolean z12 = olIIi1oIIOlo2.I000OOo1O == null;
/* 1042 */                  if (!z5 || zI00000oIO || z12) {
/* 1048 */                      o0oo0I00 = oIoioI0OIiI.I0001Ioi1lo;
/* 1050 */                      if (o0oo0I00 == null) {
/* 1052 */                          o0oo0I00 = O0oo0I00.I0000O;
                                }
/* 1056 */                      fI00000oOI = lOO1lI1o.I00000oOI(oIoioI0OIiI.I0000Il00O, textSize, iiIooOOOI2);
/* 1064 */                      if (Float.isNaN(fI00000oOI)) {
/* 1090 */                          int length = (spannableString.length() == 0 || OlOoOIi0o.I001lIiIIo1O(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
/* 1097 */                          int i15 = o0oo0I00.I00000oOI;
/* 1134 */                          i2 = 0;
/* 1135 */                          spannableString.setSpan(new O0oo10OIOO11(fI00000oOI, length, (i15 & 1) > 0, (i15 & 16) > 0, o0oo0I00.I00000oIO, o0oo0I00.I0000Il00O), 0, spannableString.length(), 33);
                                }
/* 1138 */                      oo0OOliO01o = oIoioI0OIiI.I0000O;
/* 1140 */                      if (oo0OOliO01o != null) {
/* 1142 */                          long j8 = oo0OOliO01o.I00000oIO;
/* 1144 */                          int i16 = i2;
/* 1147 */                          long j9 = oo0OOliO01o.I00000oOI;
/* 1151 */                          i100o1l = i100o1l3;
/* 1160 */                          if ((Oo0o1OiIo.I00000oOI(j8, lOlilO1lOIO.I0000O(i16)) && Oo0o1OiIo.I00000oOI(j9, lOlilO1lOIO.I0000O(i16))) || (j8 & 1095216660480L) == j3 || (j9 & 1095216660480L) == j3) {
/* 1178 */                              iiIooOOOI3 = iiIooOOOI2;
                                    } else {
/* 1193 */                              long jI0000Il00O2 = Oo0o1OiIo.I0000Il00O(j8);
/* 1197 */                              list3 = list6;
/* 1199 */                              i0ol0iioI2 = i0ol0iioI;
/* 1210 */                              if (Oo0o1iioOiO.I00000oOI(jI0000Il00O2, 4294967296L)) {
/* 1212 */                                  iiIooOOOI3 = iiIooOOOI2;
/* 1214 */                                  fI0000O = iiIooOOOI3.I00oO101o(j8);
                                        } else {
/* 1229 */                                  iiIooOOOI3 = iiIooOOOI2;
/* 1243 */                                  fI0000O = Oo0o1iioOiO.I00000oOI(jI0000Il00O2, 8589934592L) ? Oo0o1OiIo.I0000O(j8) * textSize : 0.0f;
                                        }
/* 1244 */                              long jI0000Il00O3 = Oo0o1OiIo.I0000Il00O(j9);
/* 1308 */                              spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fI0000O), (int) Math.ceil(Oo0o1iioOiO.I00000oOI(jI0000Il00O3, 4294967296L) ? iiIooOOOI3.I00oO101o(j9) : Oo0o1iioOiO.I00000oOI(jI0000Il00O3, 8589934592L) ? Oo0o1OiIo.I0000O(j9) * textSize : 0.0f)), 0, spannableString.length(), 33);
/* 1322 */                              arrayList = new ArrayList(list5.size());
/* 1326 */                              List list7 = list5;
/* 1328 */                              size = list7.size();
/* 1333 */                              for (i3 = 0; i3 < size; i3++) {
/* 1339 */                                  I11110l0o i11110l0o = (I11110l0o) list5.get(i3);
/* 1341 */                                  Object obj2 = i11110l0o.I00000oIO;
/* 1345 */                                  if (obj2 instanceof OlIIi1oIIOlo) {
/* 1348 */                                      OlIIi1oIIOlo olIIi1oIIOlo5 = (OlIIi1oIIOlo) obj2;
/* 1352 */                                      if (olIIi1oIIOlo5.I0001Ioi1lo != null || olIIi1oIIOlo5.I0000O != null || olIIi1oIIOlo5.I0000Il00O != null || ((OlIIi1oIIOlo) obj2).I0000oI00 != null) {
/* 1369 */                                          arrayList.add(i11110l0o);
                                                }
                                            }
                                        }
/* 1375 */                              IliO1o11o iliO1o11o2 = olIIi1oIIOlo2.I0001Ioi1lo;
/* 1435 */                              OlIIi1oIIOlo olIIi1oIIOlo6 = (iliO1o11o2 != null && olIIi1oIIOlo2.I0000O == null && olIIi1oIIOlo2.I0000Il00O == null && olIIi1oIIOlo2.I0000oI00 == null) ? null : new OlIIi1oIIOlo(0L, 0L, olIIi1oIIOlo2.I0000Il00O, olIIi1oIIOlo2.I0000O, olIIi1oIIOlo2.I0000oI00, iliO1o11o2, null, 0L, null, null, null, 0L, null, null, 65475);
/* 1444 */                              I0illI1iI i0illI1iI = new I0illI1iI(18);
/* 1447 */                              i0illI1iI.I00iiI = spannableString;
/* 1449 */                              i0illI1iI.I00iiO = i0oioiIIlo;
/* 1451 */                              VarHandle.storeStoreFence();
/* 1460 */                              if (arrayList.size() > 1) {
/* 1466 */                                  if (!arrayList.isEmpty()) {
/* 1477 */                                      OlIIi1oIIOlo olIIi1oIIOloI0000O = (OlIIi1oIIOlo) ((I11110l0o) arrayList.get(0)).I00000oIO;
/* 1479 */                                      if (olIIi1oIIOlo6 != null) {
/* 1482 */                                          olIIi1oIIOloI0000O = olIIi1oIIOlo6.I0000O(olIIi1oIIOloI0000O);
                                                }
/* 1510 */                                      i0illI1iI.invoke(olIIi1oIIOloI0000O, Integer.valueOf(((I11110l0o) arrayList.get(0)).I00000oOI), Integer.valueOf(((I11110l0o) arrayList.get(0)).I0000Il00O));
                                            }
/* 1513 */                                  i100o1l2 = i100o1l;
                                        } else {
/* 1519 */                                  int size5 = arrayList.size();
/* 1523 */                                  int i17 = size5 * 2;
/* 1525 */                                  int[] iArr = new int[i17];
/* 1527 */                                  int size6 = arrayList.size();
/* 1531 */                                  int i18 = 0;
/* 1532 */                                  while (i18 < size6) {
/* 1538 */                                      I11110l0o i11110l0o2 = (I11110l0o) arrayList.get(i18);
/* 1544 */                                      iArr[i18] = i11110l0o2.I00000oOI;
/* 1550 */                                      iArr[i18 + size5] = i11110l0o2.I0000Il00O;
/* 1552 */                                      i18++;
/* 1554 */                                      i100o1l = i100o1l;
                                            }
/* 1557 */                                  i100o1l2 = i100o1l;
/* 1560 */                                  if (i17 > 1) {
/* 1562 */                                      Arrays.sort(iArr);
                                            }
/* 1565 */                                  if (i17 == 0) {
/* 2656 */                                      OIiilo1Ool0o.I000II("Array is empty.");
/* 119 */                                       return null;
                                            }
/* 1568 */                                  int i19 = iArr[0];
/* 1571 */                                  int i20 = 0;
/* 1572 */                                  while (i20 < i17) {
/* 1574 */                                      int i21 = iArr[i20];
/* 1576 */                                      if (i21 == i19) {
/* 1578 */                                          i4 = i20;
/* 1580 */                                          olIIi1oIIOlo3 = olIIi1oIIOlo6;
/* 1582 */                                          arrayList2 = arrayList;
/* 1584 */                                          list4 = list7;
                                                } else {
/* 1587 */                                          int size7 = arrayList.size();
/* 1591 */                                          i4 = i20;
/* 1593 */                                          OlIIi1oIIOlo olIIi1oIIOloI0000O2 = olIIi1oIIOlo6;
/* 1594 */                                          int i22 = 0;
/* 1595 */                                          while (i22 < size7) {
/* 1601 */                                              OlIIi1oIIOlo olIIi1oIIOlo7 = olIIi1oIIOlo6;
/* 1605 */                                              I11110l0o i11110l0o3 = (I11110l0o) arrayList.get(i22);
/* 1607 */                                              ArrayList arrayList5 = arrayList;
/* 1609 */                                              int i23 = i11110l0o3.I00000oOI;
/* 1611 */                                              List list8 = list7;
/* 1613 */                                              int i24 = i11110l0o3.I0000Il00O;
/* 1615 */                                              if (i23 != i24 && I111IiO.I00000oOI(i19, i21, i23, i24)) {
/* 1625 */                                                  OlIIi1oIIOlo olIIi1oIIOlo8 = (OlIIi1oIIOlo) i11110l0o3.I00000oIO;
/* 1631 */                                                  olIIi1oIIOloI0000O2 = olIIi1oIIOloI0000O2 == null ? olIIi1oIIOlo8 : olIIi1oIIOloI0000O2.I0000O(olIIi1oIIOlo8);
                                                        }
/* 1635 */                                              i22++;
/* 1637 */                                              arrayList = arrayList5;
/* 1639 */                                              olIIi1oIIOlo6 = olIIi1oIIOlo7;
/* 1641 */                                              list7 = list8;
                                                    }
/* 1644 */                                          olIIi1oIIOlo3 = olIIi1oIIOlo6;
/* 1646 */                                          arrayList2 = arrayList;
/* 1648 */                                          list4 = list7;
/* 1650 */                                          if (olIIi1oIIOloI0000O2 != null) {
/* 1660 */                                              i0illI1iI.invoke(olIIi1oIIOloI0000O2, Integer.valueOf(i19), Integer.valueOf(i21));
                                                    }
/* 1663 */                                          i19 = i21;
                                                }
/* 1664 */                                      i20 = i4 + 1;
/* 1666 */                                      arrayList = arrayList2;
/* 1668 */                                      olIIi1oIIOlo6 = olIIi1oIIOlo3;
/* 1670 */                                      list7 = list4;
                                            }
                                        }
/* 1515 */                              List list9 = list7;
/* 1677 */                              i5 = 0;
/* 1678 */                              z6 = false;
/* 1679 */                              for (size2 = list9.size(); i5 < size2; size2 = i7) {
/* 1685 */                                  I11110l0o i11110l0o4 = (I11110l0o) list5.get(i5);
/* 1687 */                                  Object obj3 = i11110l0o4.I00000oIO;
/* 1691 */                                  if (obj3 instanceof OlIIi1oIIOlo) {
/* 1693 */                                      oIoioI0OIiI2 = oIoioI0OIiI;
/* 1694 */                                      int i25 = i11110l0o4.I00000oOI;
/* 1696 */                                      int i26 = i11110l0o4.I0000Il00O;
/* 1698 */                                      if (i25 < 0 || i25 >= spannableString.length() || i26 <= i25 || i26 > spannableString.length()) {
/* 1714 */                                          i7 = size2;
/* 1716 */                                          i8 = i5;
/* 1717 */                                          z7 = z6;
/* 1719 */                                          iiIooOOOI5 = iiIooOOOI3;
                                                } else {
/* 1723 */                                          OlIIi1oIIOlo olIIi1oIIOlo9 = (OlIIi1oIIOlo) obj3;
/* 1725 */                                          long j10 = olIIi1oIIOlo9.I000O01llI0;
/* 1727 */                                          I1oi0illolii i1oi0illolii2 = olIIi1oIIOlo9.I000OOo1O;
/* 1729 */                                          Oo0OO1I1i oo0OO1I1i2 = olIIi1oIIOlo9.I00000oIO;
/* 1731 */                                          if (i1oi0illolii2 != null) {
/* 1733 */                                              float f = i1oi0illolii2.I00000oIO;
/* 1737 */                                              i7 = size2;
/* 1740 */                                              I1oi100lI i1oi100lI = new I1oi100lI(0);
/* 1743 */                                              i1oi100lI.I00iiI = f;
/* 1745 */                                              VarHandle.storeStoreFence();
/* 1750 */                                              spannableString.setSpan(i1oi100lI, i25, i26, 33);
                                                    } else {
/* 1756 */                                              i7 = size2;
                                                    }
/* 1753 */                                          i8 = i5;
/* 1754 */                                          boolean z13 = z6;
/* 1763 */                                          lOO1lI1o.I0000Il00O(spannableString, oo0OO1I1i2.I00000oIO(), i25, i26);
/* 1766 */                                          III11l1I iII11l1II00000oOI = oo0OO1I1i2.I00000oOI();
/* 1770 */                                          float fI0000Il00O = oo0OO1I1i2.I0000Il00O();
/* 1774 */                                          if (iII11l1II00000oOI != null) {
/* 1778 */                                              if (iII11l1II00000oOI instanceof OlI00IIlOO) {
/* 1784 */                                                  lOO1lI1o.I0000Il00O(spannableString, ((OlI00IIlOO) iII11l1II00000oOI).I00000oIO, i25, i26);
                                                        } else {
/* 1792 */                                                  OioOII0IIoO1 oioOII0IIoO1 = new OioOII0IIoO1();
/* 1795 */                                                  oioOII0IIoO1.I00iOIl = (OioIoiOi) iII11l1II00000oOI;
/* 1797 */                                                  oioOII0IIoO1.I00iiI = fI0000Il00O;
/* 1807 */                                                  oioOII0IIoO1.I00iiO = lOO00IiI0li.I00000oIO(Ol0i1I.I00000oIO(j2));
/* 1813 */                                                  OIOo1iiI oIOo1iiI = new OIOo1iiI(27);
/* 1816 */                                                  oIOo1iiI.I00iiI = oioOII0IIoO1;
/* 1818 */                                                  VarHandle.storeStoreFence();
/* 1825 */                                                  oioOII0IIoO1.I00iio = Ol1llolil.I00000oOI(oIOo1iiI);
/* 1827 */                                                  VarHandle.storeStoreFence();
/* 1832 */                                                  spannableString.setSpan(oioOII0IIoO1, i25, i26, 33);
                                                        }
                                                    }
/* 1835 */                                          OlooIOI0O olooIOI0O = olIIi1oIIOlo9.I000lI;
/* 1837 */                                          if (olooIOI0O != null) {
/* 1839 */                                              int i27 = olooIOI0O.I00000oIO;
/* 1849 */                                              boolean z14 = (i27 | 1) == i27;
/* 1856 */                                              boolean z15 = (i27 | 2) == i27;
/* 1857 */                                              OlooIl olooIl = new OlooIl();
/* 1860 */                                              olooIl.I00000oIO = z14;
/* 1862 */                                              olooIl.I00000oOI = z15;
/* 1864 */                                              VarHandle.storeStoreFence();
/* 1867 */                                              i9 = 33;
/* 1869 */                                              spannableString.setSpan(olooIl, i25, i26, 33);
                                                    } else {
/* 1876 */                                              i9 = 33;
                                                    }
/* 1874 */                                          IiIooOOOI iiIooOOOI6 = iiIooOOOI3;
/* 1881 */                                          lOO1lI1o.I0000O(spannableString, olIIi1oIIOlo9.I00000oOI, iiIooOOOI6, i25, i26);
/* 1884 */                                          String str4 = olIIi1oIIOlo9.I000II;
/* 1886 */                                          if (str4 != null) {
/* 1891 */                                              IliOOlO iliOOlO = new IliOOlO(0);
/* 1894 */                                              iliOOlO.I00iiI = str4;
/* 1896 */                                              VarHandle.storeStoreFence();
/* 1899 */                                              spannableString.setSpan(iliOOlO, i25, i26, i9);
                                                    }
/* 1904 */                                          Oo0OOlO0 oo0OOlO02 = olIIi1oIIOlo9.I000OiO;
/* 1906 */                                          if (oo0OOlO02 != null) {
/* 1915 */                                              spannableString.setSpan(new ScaleXSpan(oo0OOlO02.I00000oIO), i25, i26, i9);
/* 1920 */                                              float f2 = oo0OOlO02.I00000oOI;
/* 1923 */                                              I1oi100lI i1oi100lI2 = new I1oi100lI(1);
/* 1926 */                                              i1oi100lI2.I00iiI = f2;
/* 1928 */                                              VarHandle.storeStoreFence();
/* 1931 */                                              spannableString.setSpan(i1oi100lI2, i25, i26, i9);
                                                    }
/* 1936 */                                          lOO1lI1o.I0000oI00(spannableString, olIIi1oIIOlo9.I000iOII, i25, i26);
/* 1940 */                                          long j11 = olIIi1oIIOlo9.I000l1;
/* 1946 */                                          if (j11 != 16) {
/* 1957 */                                              spannableString.setSpan(new BackgroundColorSpan(iiO01ll11o1l.I000OOo1O(j11)), i25, i26, i9);
                                                    }
/* 1960 */                                          OioOII0oI oioOII0oI = olIIi1oIIOlo9.I000o00OoI0I;
/* 1962 */                                          if (oioOII0oI != null) {
/* 1964 */                                              long j12 = oioOII0oI.I00000oOI;
/* 1968 */                                              iiIooOOOI5 = iiIooOOOI6;
/* 1971 */                                              int iI000OOo1O = iiO01ll11o1l.I000OOo1O(oioOII0oI.I00000oIO);
/* 1977 */                                              z7 = z13;
/* 1982 */                                              float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
/* 1994 */                                              float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
/* 1998 */                                              float f3 = oioOII0oI.I0000Il00O;
/* 2003 */                                              if (f3 == 0.0f) {
/* 2005 */                                                  f3 = Float.MIN_VALUE;
                                                        }
/* 2006 */                                              OioOIOOOl1 oioOIOOOl1 = new OioOIOOOl1();
/* 2009 */                                              oioOIOOOl1.I00000oIO = iI000OOo1O;
/* 2011 */                                              oioOIOOOl1.I00000oOI = fIntBitsToFloat;
/* 2013 */                                              oioOIOOOl1.I0000Il00O = fIntBitsToFloat2;
/* 2015 */                                              oioOIOOOl1.I0000O = f3;
/* 2017 */                                              VarHandle.storeStoreFence();
/* 2020 */                                              i9 = 33;
/* 2022 */                                              spannableString.setSpan(oioOIOOOl1, i25, i26, 33);
                                                    } else {
/* 2026 */                                              iiIooOOOI5 = iiIooOOOI6;
/* 2027 */                                              z7 = z13;
                                                    }
/* 2030 */                                          Iilloo0IOoIo iilloo0IOoIo = olIIi1oIIOlo9.I00100l0;
/* 2032 */                                          if (iilloo0IOoIo != null) {
/* 2036 */                                              IillooIlIO iillooIlIO = new IillooIlIO();
/* 2039 */                                              iillooIlIO.I00iOIl = iilloo0IOoIo;
/* 2041 */                                              VarHandle.storeStoreFence();
/* 2044 */                                              spannableString.setSpan(iillooIlIO, i25, i26, i9);
                                                    }
/* 2088 */                                          z6 = (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j10), 4294967296L) || Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j10), 8589934592L)) ? true : z7;
/* 2090 */                                          i5 = i8 + 1;
/* 2092 */                                          oIoioI0OIiI = oIoioI0OIiI2;
/* 2093 */                                          iiIooOOOI3 = iiIooOOOI5;
                                                }
                                            } else {
/* 2079 */                                      i7 = size2;
/* 2081 */                                      i8 = i5;
/* 2082 */                                      z7 = z6;
/* 2084 */                                      iiIooOOOI5 = iiIooOOOI3;
/* 2085 */                                      oIoioI0OIiI2 = oIoioI0OIiI;
                                            }
/* 2090 */                                  i5 = i8 + 1;
/* 2092 */                                  oIoioI0OIiI = oIoioI0OIiI2;
/* 2093 */                                  iiIooOOOI3 = iiIooOOOI5;
                                        }
/* 2100 */                              IiIooOOOI iiIooOOOI7 = iiIooOOOI3;
/* 2101 */                              OIoioI0OIiI oIoioI0OIiI4 = oIoioI0OIiI;
/* 2103 */                              if (z6) {
/* 2105 */                                  int size8 = list9.size();
/* 2109 */                                  int i28 = 0;
/* 2110 */                                  while (i28 < size8) {
/* 2116 */                                      I11110l0o i11110l0o5 = (I11110l0o) list5.get(i28);
/* 2120 */                                      I1110oO i1110oO = (I1110oO) i11110l0o5.I00000oIO;
/* 2124 */                                      if (i1110oO instanceof OlIIi1oIIOlo) {
/* 2126 */                                          int i29 = i11110l0o5.I00000oOI;
/* 2128 */                                          int i30 = i11110l0o5.I0000Il00O;
/* 2130 */                                          if (i29 < 0 || i29 >= spannableString.length() || i30 <= i29 || i30 > spannableString.length()) {
/* 2146 */                                              iiIooOOOI4 = iiIooOOOI7;
                                                    } else {
/* 2150 */                                              long j13 = ((OlIIi1oIIOlo) i1110oO).I000O01llI0;
/* 2154 */                                              long jI0000Il00O4 = Oo0o1OiIo.I0000Il00O(j13);
/* 2167 */                                              if (Oo0o1iioOiO.I00000oOI(jI0000Il00O4, 4294967296L)) {
/* 2171 */                                                  iiIooOOOI4 = iiIooOOOI7;
/* 2174 */                                                  float fI00oO101o2 = iiIooOOOI4.I00oO101o(j13);
/* 2178 */                                                  O0oO10 o0oO10 = new O0oO10();
/* 2181 */                                                  o0oO10.I00iOIl = fI00oO101o2;
/* 2183 */                                                  VarHandle.storeStoreFence();
                                                            o0oO0O = o0oO10;
                                                        } else {
/* 2187 */                                                  iiIooOOOI4 = iiIooOOOI7;
/* 2197 */                                                  if (Oo0o1iioOiO.I00000oOI(jI0000Il00O4, 8589934592L)) {
/* 2201 */                                                      float fI0000O2 = Oo0o1OiIo.I0000O(j13);
/* 2205 */                                                      O0oO0O o0oO0O2 = new O0oO0O();
/* 2208 */                                                      o0oO0O2.I00iOIl = fI0000O2;
/* 2210 */                                                      VarHandle.storeStoreFence();
                                                                o0oO0O = o0oO0O2;
                                                            } else {
/* 2214 */                                                      o0oO0O = null;
                                                            }
                                                        }
/* 2216 */                                              if (o0oO0O != null) {
/* 2220 */                                                  spannableString.setSpan(o0oO0O, i29, i30, 33);
                                                        }
                                                    }
                                                }
/* 2223 */                                      i28++;
/* 2225 */                                      iiIooOOOI7 = iiIooOOOI4;
                                            }
                                        }
/* 2228 */                              IiIooOOOI iiIooOOOI8 = iiIooOOOI7;
/* 2229 */                              oo0OOliO01o2 = oIoioI0OIiI4.I0000O;
/* 2231 */                              if (oo0OOliO01o2 == null) {
/* 2233 */                                  long j14 = oo0OOliO01o2.I00000oIO;
/* 2235 */                                  long jI0000Il00O5 = Oo0o1OiIo.I0000Il00O(j14);
/* 2272 */                                  float fI00oO101o3 = Oo0o1iioOiO.I00000oOI(jI0000Il00O5, 4294967296L) ? iiIooOOOI8.I00oO101o(j14) : Oo0o1iioOiO.I00000oOI(jI0000Il00O5, 8589934592L) ? Oo0o1OiIo.I0000O(j14) * textSize : 0.0f;
/* 2273 */                                  int size9 = list9.size();
/* 2278 */                                  for (int i31 = 0; i31 < size9; i31++) {
/* 2284 */                                      I11110l0o i11110l0o6 = (I11110l0o) list5.get(i31);
/* 2286 */                                      Object obj4 = i11110l0o6.I00000oIO;
/* 2295 */                                      IIIi00o iIIi00o = obj4 instanceof IIIi00o ? (IIIi00o) obj4 : null;
/* 2297 */                                      if (iIIi00o != null) {
/* 2301 */                                          float fI00000oIO2 = lOO1lI1o.I00000oIO(iIIi00o.I00000oIO, textSize, iiIooOOOI8);
/* 2307 */                                          float fI00000oIO3 = lOO1lI1o.I00000oIO(iIIi00o.I00000oOI, textSize, iiIooOOOI8);
/* 2313 */                                          float fI00000oIO4 = lOO1lI1o.I00000oIO(iIIi00o.I0000Il00O, textSize, iiIooOOOI8);
/* 2321 */                                          if (!Float.isNaN(fI00000oIO2) && !Float.isNaN(fI00000oIO3) && !Float.isNaN(fI00000oIO4)) {
/* 2335 */                                              Iilloo0IOoIo iilloo0IOoIo2 = iIIi00o.I0000O;
/* 2339 */                                              Ii0iOiI ii0iOiI = new Ii0iOiI();
/* 2342 */                                              ii0iOiI.I00iOIl = fI00000oIO2;
/* 2344 */                                              ii0iOiI.I00iiI = fI00000oIO3;
/* 2346 */                                              ii0iOiI.I00iiO = iilloo0IOoIo2;
/* 2349 */                                              int iI000II = O1OooO0IlOo.I000II(fI00000oIO2 + fI00000oIO4);
/* 2353 */                                              ii0iOiI.I00iio = iI000II;
/* 2360 */                                              ii0iOiI.I00ilI0I1 = O1OooO0IlOo.I000II(fI00oO101o3) - iI000II;
/* 2362 */                                              VarHandle.storeStoreFence();
/* 2371 */                                              spannableString.setSpan(ii0iOiI, i11110l0o6.I00000oOI, i11110l0o6.I0000Il00O, 33);
                                                    }
                                                }
                                            }
/* 2381 */                                  int size10 = list3.size();
/* 2385 */                                  int i32 = 0;
/* 2386 */                                  while (i32 < size10) {
/* 2388 */                                      List list10 = list3;
/* 2394 */                                      I11110l0o i11110l0o7 = (I11110l0o) list10.get(i32);
/* 2398 */                                      OO1I0OI0o oO1I0OI0o = (OO1I0OI0o) i11110l0o7.I00000oIO;
/* 2400 */                                      int i33 = i11110l0o7.I00000oOI;
/* 2402 */                                      int i34 = i11110l0o7.I0000Il00O;
/* 2412 */                                      for (Object obj5 : spannableString.getSpans(i33, i34, OoOlI0ii.class)) {
/* 2418 */                                          spannableString.removeSpan((OoOlI0ii) obj5);
                                                }
/* 2426 */                                      long j15 = oO1I0OI0o.I00000oIO;
/* 2428 */                                      long j16 = oO1I0OI0o.I00000oOI;
/* 2430 */                                      float fI0000O3 = Oo0o1OiIo.I0000O(j15);
/* 2436 */                                      long jI0000Il00O6 = Oo0o1OiIo.I0000Il00O(oO1I0OI0o.I00000oIO);
/* 2471 */                                      int i35 = Oo0o1iioOiO.I00000oOI(jI0000Il00O6, 4294967296L) ? 0 : Oo0o1iioOiO.I00000oOI(jI0000Il00O6, 8589934592L) ? 1 : 2;
/* 2472 */                                      float fI0000O4 = Oo0o1OiIo.I0000O(j16);
/* 2476 */                                      long jI0000Il00O7 = Oo0o1OiIo.I0000Il00O(j16);
/* 2511 */                                      int i36 = Oo0o1iioOiO.I00000oOI(jI0000Il00O7, 4294967296L) ? 0 : Oo0o1iioOiO.I00000oOI(jI0000Il00O7, 8589934592L) ? 1 : 2;
/* 2512 */                                      int i37 = oO1I0OI0o.I0000Il00O;
/* 2515 */                                      if (i37 == 1) {
/* 2517 */                                          i6 = 0;
                                                } else if (i37 == 2) {
/* 2522 */                                          i6 = 1;
                                                } else if (i37 == 3) {
/* 2527 */                                          i6 = 2;
                                                } else if (i37 == 4) {
/* 2532 */                                          i6 = 3;
                                                } else if (i37 == 5) {
/* 2537 */                                          i6 = 4;
                                                } else if (i37 == 6) {
/* 2542 */                                          i6 = 5;
                                                } else {
/* 2545 */                                          if (i37 != 7) {
/* 2616 */                                              I000II.I001IO000("Invalid PlaceholderVerticalAlign");
/* 119 */                                               return null;
                                                    }
/* 2547 */                                          i6 = 6;
                                                }
/* 2548 */                                      int i38 = size10;
/* 2549 */                                      list3 = list10;
/* 2567 */                                      float fI00oO101o4 = i35 == 0 ? iiIooOOOI8.I00oO101o(lOlilO1lOIO.I0000oI00(fI0000O3, 4294967296L)) : 0.0f;
/* 2581 */                                      float fI00oO101o5 = i36 == 0 ? iiIooOOOI8.I00oO101o(lOlilO1lOIO.I0000oI00(fI0000O4, 4294967296L)) : 0.0f;
/* 2582 */                                      OO1I0OOolIl0 oO1I0OOolIl0 = new OO1I0OOolIl0();
/* 2585 */                                      oO1I0OOolIl0.I00iOIl = fI0000O3;
/* 2587 */                                      oO1I0OOolIl0.I00iiI = i35;
/* 2589 */                                      oO1I0OOolIl0.I00iiO = fI0000O4;
/* 2591 */                                      oO1I0OOolIl0.I00iio = i36;
/* 2593 */                                      oO1I0OOolIl0.I00ilI0I1 = fI00oO101o4;
/* 2595 */                                      oO1I0OOolIl0.I00ilO0 = fI00oO101o5;
/* 2597 */                                      oO1I0OOolIl0.I00io1l = i6;
/* 2599 */                                      VarHandle.storeStoreFence();
/* 2606 */                                      spannableString.setSpan(oO1I0OOolIl0, i33, i34, 33);
/* 2609 */                                      i32++;
/* 2611 */                                      size10 = i38;
                                            }
/* 2620 */                                  i0ol0iioI = i0ol0iioI2;
                                            charSequence = spannableString;
                                        }
                                    }
                                } else {
/* 1312 */                          i100o1l = i100o1l3;
/* 1313 */                          iiIooOOOI3 = iiIooOOOI2;
                                }
/* 1180 */                      list3 = list6;
/* 1182 */                      i0ol0iioI2 = i0ol0iioI;
/* 1322 */                      arrayList = new ArrayList(list5.size());
/* 1326 */                      List list72 = list5;
/* 1328 */                      size = list72.size();
/* 1333 */                      while (i3 < size) {
                                }
/* 1375 */                      IliO1o11o iliO1o11o22 = olIIi1oIIOlo2.I0001Ioi1lo;
/* 1435 */                      if (iliO1o11o22 != null) {
/* 1444 */                          I0illI1iI i0illI1iI2 = new I0illI1iI(18);
/* 1447 */                          i0illI1iI2.I00iiI = spannableString;
/* 1449 */                          i0illI1iI2.I00iiO = i0oioiIIlo;
/* 1451 */                          VarHandle.storeStoreFence();
/* 1460 */                          if (arrayList.size() > 1) {
                                    }
/* 1515 */                          List list92 = list72;
/* 1677 */                          i5 = 0;
/* 1678 */                          z6 = false;
/* 1679 */                          while (i5 < size2) {
                                    }
/* 2100 */                          IiIooOOOI iiIooOOOI72 = iiIooOOOI3;
/* 2101 */                          OIoioI0OIiI oIoioI0OIiI42 = oIoioI0OIiI;
/* 2103 */                          if (z6) {
                                    }
/* 2228 */                          IiIooOOOI iiIooOOOI82 = iiIooOOOI72;
/* 2229 */                          oo0OOliO01o2 = oIoioI0OIiI42.I0000O;
/* 2231 */                          if (oo0OOliO01o2 == null) {
                                    }
                                }
                            }
/* 2622 */                  i0ol0iioI.I00l0I0l0lO1 = charSequence;
/* 2626 */                  int i142 = i0ol0iioI.I00lli11;
/* 2628 */                  O0iOlIOIl0 o0iOlIOIl02 = new O0iOlIOIl0();
/* 2631 */                  o0iOlIOIl02.I00000oIO = charSequence;
/* 2635 */                  o0iOlIOIl02.I00000oOI = i100o1l2;
/* 2637 */                  o0iOlIOIl02.I0000Il00O = i142;
/* 2641 */                  o0iOlIOIl02.I0000O = Float.NaN;
/* 2643 */                  o0iOlIOIl02.I0000oI00 = Float.NaN;
/* 2645 */                  VarHandle.storeStoreFence();
/* 2648 */                  i0ol0iioI.I00l0OO0IO = o0iOlIOIl02;
/* 2650 */                  VarHandle.storeStoreFence();
/* 2653 */                  return i0ol0iioI;
                        }
/* 1003 */              float fI00000oOI2 = lOO1lI1o.I00000oOI(oIoioI0OIiI.I0000Il00O, textSize, iiIooOOOI2);
/* 1011 */              if (!Float.isNaN(fI00000oOI2)) {
/* 1015 */                  O0olOO0o1iOI o0olOO0o1iOI = new O0olOO0o1iOI();
/* 1018 */                  o0olOO0o1iOI.I00iOIl = fI00000oOI2;
/* 1020 */                  VarHandle.storeStoreFence();
/* 1028 */                  spannableString.setSpan(o0olOO0o1iOI, 0, spannableString.length(), 33);
                        }
/* 1031 */              i2 = 0;
/* 1138 */              oo0OOliO01o = oIoioI0OIiI.I0000O;
/* 1140 */              if (oo0OOliO01o != null) {
                        }
/* 1180 */              list3 = list6;
/* 1182 */              i0ol0iioI2 = i0ol0iioI;
/* 1322 */              arrayList = new ArrayList(list5.size());
/* 1326 */              List list722 = list5;
/* 1328 */              size = list722.size();
/* 1333 */              while (i3 < size) {
                        }
/* 1375 */              IliO1o11o iliO1o11o222 = olIIi1oIIOlo2.I0001Ioi1lo;
/* 1435 */              if (iliO1o11o222 != null) {
                        }
/* 2622 */              i0ol0iioI.I00l0I0l0lO1 = charSequence;
/* 2626 */              int i1422 = i0ol0iioI.I00lli11;
/* 2628 */              O0iOlIOIl0 o0iOlIOIl022 = new O0iOlIOIl0();
/* 2631 */              o0iOlIOIl022.I00000oIO = charSequence;
/* 2635 */              o0iOlIOIl022.I00000oOI = i100o1l2;
/* 2637 */              o0iOlIOIl022.I0000Il00O = i1422;
/* 2641 */              o0iOlIOIl022.I0000O = Float.NaN;
/* 2643 */              o0iOlIOIl022.I0000oI00 = Float.NaN;
/* 2645 */              VarHandle.storeStoreFence();
/* 2648 */              i0ol0iioI.I00l0OO0IO = o0iOlIOIl022;
/* 2650 */              VarHandle.storeStoreFence();
/* 2653 */              return i0ol0iioI;
                    }
/* 692 */           i0ol0iioI = i0ol0iioI3;
/* 709 */           if (i1oi0illolii == null) {
                    }
/* 710 */           if (z10) {
/* 719 */               if (!z10) {
                        }
/* 768 */               olIIi1oIIOlo = new OlIIi1oIIOlo(0L, 0L, null, null, null, null, null, j, !z3 ? i1oi0illolii : null, null, null, !z2 ? j6 : j7, null, null, 63103);
                    }
/* 773 */           if (olIIi1oIIOlo != null) {
                    }
/* 817 */           textSize = i100o1l3.getTextSize();
/* 821 */           Oo0lloOiiIOI oo0lloOiiIOI22 = i0ol0iioI.I00iiI;
/* 823 */           List list62 = i0ol0iioI.I00iio;
/* 825 */           iiIooOOOI2 = i0ol0iioI.I00ilO0;
/* 827 */           z4 = i0ol0iioI.I00ll1;
/* 829 */           boolean z112 = i0ol0iioI.I00io1l;
/* 831 */           boolean zI00000oIO2 = i0ol0iioI.I00000oIO();
/* 835 */           I0oillooIio1 i0oillooIio12 = I0oioi.I00000oIO;
/* 837 */           if (z4) {
/* 889 */               str2 = str;
/* 891 */               charSequenceI000II = str2;
                    }
/* 901 */           if (!list5.isEmpty()) {
/* 937 */               j3 = 0;
/* 948 */               if (!(charSequenceI000II instanceof Spannable)) {
                        }
/* 952 */               olIIi1oIIOlo2 = oo0lloOiiIOI22.I00000oIO;
/* 954 */               oIoioI0OIiI = oo0lloOiiIOI22.I00000oOI;
/* 966 */               if (O0000Ioio00.I0000O(olIIi1oIIOlo2.I000lI, OlooIOI0O.I0000Il00O)) {
                        }
/* 983 */               oO1Oi01o0 = oo0lloOiiIOI22.I0000Il00O;
                        if (oO1Oi01o0 != null) {
/* 995 */                   if ((oO1Oi01o0 != null || (oO1Il0I1 = oO1Oi01o0.I00000oOI) == null) ? false : oO1Il0I1.I00000oIO) {
/* 1041 */                      if (olIIi1oIIOlo2.I000OOo1O == null) {
                                }
/* 1042 */                      if (!z5) {
/* 1048 */                          o0oo0I00 = oIoioI0OIiI.I0001Ioi1lo;
/* 1050 */                          if (o0oo0I00 == null) {
                                    }
/* 1056 */                          fI00000oOI = lOO1lI1o.I00000oOI(oIoioI0OIiI.I0000Il00O, textSize, iiIooOOOI2);
/* 1064 */                          if (Float.isNaN(fI00000oOI)) {
/* 1031 */                              i2 = 0;
                                    }
/* 1138 */                          oo0OOliO01o = oIoioI0OIiI.I0000O;
/* 1140 */                          if (oo0OOliO01o != null) {
                                    }
/* 1180 */                          list3 = list62;
/* 1182 */                          i0ol0iioI2 = i0ol0iioI;
/* 1322 */                          arrayList = new ArrayList(list5.size());
/* 1326 */                          List list7222 = list5;
/* 1328 */                          size = list7222.size();
/* 1333 */                          while (i3 < size) {
                                    }
/* 1375 */                          IliO1o11o iliO1o11o2222 = olIIi1oIIOlo2.I0001Ioi1lo;
/* 1435 */                          if (iliO1o11o2222 != null) {
                                    }
                                }
                            }
                        }
                    }
/* 2622 */          i0ol0iioI.I00l0I0l0lO1 = charSequence;
/* 2626 */          int i14222 = i0ol0iioI.I00lli11;
/* 2628 */          O0iOlIOIl0 o0iOlIOIl0222 = new O0iOlIOIl0();
/* 2631 */          o0iOlIOIl0222.I00000oIO = charSequence;
/* 2635 */          o0iOlIOIl0222.I00000oOI = i100o1l2;
/* 2637 */          o0iOlIOIl0222.I0000Il00O = i14222;
/* 2641 */          o0iOlIOIl0222.I0000O = Float.NaN;
/* 2643 */          o0iOlIOIl0222.I0000oI00 = Float.NaN;
/* 2645 */          VarHandle.storeStoreFence();
/* 2648 */          i0ol0iioI.I00l0OO0IO = o0iOlIOIl0222;
/* 2650 */          VarHandle.storeStoreFence();
/* 2653 */          return i0ol0iioI;
                }

                public static final boolean I00000oOI(Oo0lloOiiIOI oo0lloOiiIOI) {
                    OO1Il0I1 oO1Il0I1;
/* 1 */             OO1Oi01o0 oO1Oi01o0 = oo0lloOiiIOI.I0000Il00O;
/* 16 */            IioolI0lo0il iioolI0lo0ilI00000oIO = (oO1Oi01o0 == null || (oO1Il0I1 = oO1Oi01o0.I00000oOI) == null) ? null : IioolI0lo0il.I00000oIO(oO1Il0I1.I00000oOI);
/* 17 */            boolean z = false;
/* 19 */            if (iioolI0lo0ilI00000oIO != null && iioolI0lo0ilI00000oIO.I00000oIO == 1) {
/* 26 */                z = true;
                    }
/* 27 */            return !z;
                }
            }
