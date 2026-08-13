            package p000;

            import android.content.ClipData;
            import android.content.ClipboardManager;
            import android.content.Context;
            import android.os.Parcel;
            import android.text.Annotation;
            import android.text.SpannableString;
            import android.util.Base64;
            import java.util.List;
            
            public final class I0lOl0I0 implements IOO0i0o1O0l {
                public Context I00000oIO;
                public ClipboardManager I00000oOI;

                public final ClipboardManager I00000oIO() {
/* 1 */             ClipboardManager clipboardManager = this.I00000oOI;
/* 3 */             if (clipboardManager != null) {
/* 20 */                return clipboardManager;
                    }
/* 13 */            ClipboardManager clipboardManager2 = (ClipboardManager) this.I00000oIO.getSystemService("clipboard");
/* 15 */            this.I00000oOI = clipboardManager2;
/* 20 */            return clipboardManager2;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(I1111OO10i i1111OO10i) {
                    SpannableString spannableString;
/* 3 */             ClipboardManager clipboardManagerI00000oIO = I00000oIO();
/* 7 */             List list = i1111OO10i.I00iiO;
/* 9 */             List list2 = Il01100l.I00iOIl;
/* 15 */            List list3 = list == null ? list2 : list;
/* 16 */            CharSequence charSequence = i1111OO10i.I00iiI;
/* 22 */            if (!list3.isEmpty()) {
/* 28 */                SpannableString spannableString2 = new SpannableString(charSequence);
/* 33 */                iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 40 */                iiolilo0iiil.I00iOIl = Parcel.obtain();
/* 42 */                if (list == null) {
/* 44 */                    list = list2;
                        }
/* 48 */                int size = list.size();
/* 52 */                int i = 0;
                        SpannableString spannableString3 = spannableString2;
/* 53 */                while (i < size) {
/* 59 */                    I11110l0o i11110l0o = (I11110l0o) list.get(i);
/* 63 */                    OlIIi1oIIOlo olIIi1oIIOlo = (OlIIi1oIIOlo) i11110l0o.I00000oIO;
/* 65 */                    int i2 = i11110l0o.I00000oOI;
/* 67 */                    int i3 = i11110l0o.I0000Il00O;
/* 73 */                    ((Parcel) iiolilo0iiil.I00iOIl).recycle();
/* 80 */                    iiolilo0iiil.I00iOIl = Parcel.obtain();
/* 82 */                    Oo0OO1I1i oo0OO1I1i = olIIi1oIIOlo.I00000oIO;
/* 84 */                    long j = olIIi1oIIOlo.I000l1;
/* 86 */                    long j2 = olIIi1oIIOlo.I000O01llI0;
/* 88 */                    int i4 = i;
/* 90 */                    long j3 = olIIi1oIIOlo.I00000oOI;
/* 92 */                    List list4 = list;
/* 93 */                    int i5 = size;
/* 95 */                    long jI00000oIO = oo0OO1I1i.I00000oIO();
/* 101 */                   long j4 = IOOiio0i.I000o00OoI0I;
/* 108 */                   if (Ooi0i1.I00000oOI(jI00000oIO, j4)) {
/* 134 */                       spannableString = spannableString3;
                            } else {
/* 110 */                       iiolilo0iiil.I00100o1O0lo((byte) 1);
/* 124 */                       spannableString = spannableString3;
/* 130 */                       ((Parcel) iiolilo0iiil.I00iOIl).writeLong(iOIl0I.I00000oIO(olIIi1oIIOlo.I00000oIO.I00000oIO()));
                            }
/* 136 */                   long j5 = Oo0o1OiIo.I0000Il00O;
/* 144 */                   byte b = 2;
/* 145 */                   if (!Oo0o1OiIo.I00000oOI(j3, j5)) {
/* 147 */                       iiolilo0iiil.I00100o1O0lo((byte) 2);
/* 150 */                       iiolilo0iiil.I0010o(j3);
                            }
/* 153 */                   IlilIIiIiO ililIIiIiO = olIIi1oIIOlo.I0000Il00O;
/* 156 */                   if (ililIIiIiO != null) {
/* 158 */                       iiolilo0iiil.I00100o1O0lo((byte) 3);
/* 167 */                       ((Parcel) iiolilo0iiil.I00iOIl).writeInt(ililIIiIiO.I00iOIl);
                            }
/* 170 */                   Ilil10i ilil10i = olIIi1oIIOlo.I0000O;
/* 172 */                   if (ilil10i != null) {
/* 174 */                       int i6 = ilil10i.I00000oIO;
/* 177 */                       iiolilo0iiil.I00100o1O0lo((byte) 4);
/* 188 */                       iiolilo0iiil.I00100o1O0lo((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                            }
/* 191 */                   Ilil10oOo ilil10oOo = olIIi1oIIOlo.I0000oI00;
/* 193 */                   if (ilil10oOo != null) {
/* 195 */                       int i7 = ilil10oOo.I00000oIO;
/* 198 */                       iiolilo0iiil.I00100o1O0lo((byte) 5);
/* 201 */                       if (i7 != 0) {
/* 208 */                           if (i7 == 65535) {
/* 210 */                               b = 1;
                                    } else if (i7 != 1) {
/* 218 */                               b = i7 == 2 ? (byte) 3 : (byte) 0;
                                    }
/* 219 */                           iiolilo0iiil.I00100o1O0lo(b);
                                }
                            }
/* 222 */                   String str = olIIi1oIIOlo.I000II;
/* 224 */                   if (str != null) {
/* 227 */                       iiolilo0iiil.I00100o1O0lo((byte) 6);
/* 234 */                       ((Parcel) iiolilo0iiil.I00iOIl).writeString(str);
                            }
/* 241 */                   if (!Oo0o1OiIo.I00000oOI(j2, j5)) {
/* 244 */                       iiolilo0iiil.I00100o1O0lo((byte) 7);
/* 247 */                       iiolilo0iiil.I0010o(j2);
                            }
/* 250 */                   I1oi0illolii i1oi0illolii = olIIi1oIIOlo.I000OOo1O;
/* 252 */                   if (i1oi0illolii != null) {
/* 254 */                       float f = i1oi0illolii.I00000oIO;
/* 258 */                       iiolilo0iiil.I00100o1O0lo((byte) 8);
/* 261 */                       iiolilo0iiil.I0010I0i(f);
                            }
/* 264 */                   Oo0OOlO0 oo0OOlO0 = olIIi1oIIOlo.I000OiO;
/* 266 */                   if (oo0OOlO0 != null) {
/* 270 */                       iiolilo0iiil.I00100o1O0lo((byte) 9);
/* 275 */                       iiolilo0iiil.I0010I0i(oo0OOlO0.I00000oIO);
/* 280 */                       iiolilo0iiil.I0010I0i(oo0OOlO0.I00000oOI);
                            }
/* 287 */                   if (!Ooi0i1.I00000oOI(j, j4)) {
/* 291 */                       iiolilo0iiil.I00100o1O0lo((byte) 10);
/* 302 */                       ((Parcel) iiolilo0iiil.I00iOIl).writeLong(iOIl0I.I00000oIO(j));
                            }
/* 305 */                   OlooIOI0O olooIOI0O = olIIi1oIIOlo.I000lI;
/* 307 */                   if (olooIOI0O != null) {
/* 311 */                       iiolilo0iiil.I00100o1O0lo((byte) 11);
/* 320 */                       ((Parcel) iiolilo0iiil.I00iOIl).writeInt(olooIOI0O.I00000oIO);
                            }
/* 323 */                   OioOII0oI oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 325 */                   if (oioOII0oI != null) {
/* 329 */                       iiolilo0iiil.I00100o1O0lo((byte) 12);
/* 342 */                       ((Parcel) iiolilo0iiil.I00iOIl).writeLong(iOIl0I.I00000oIO(oioOII0oI.I00000oIO));
/* 345 */                       long j6 = oioOII0oI.I00000oOI;
/* 356 */                       iiolilo0iiil.I0010I0i(Float.intBitsToFloat((int) (j6 >> 32)));
/* 370 */                       iiolilo0iiil.I0010I0i(Float.intBitsToFloat((int) (j6 & 4294967295L)));
/* 375 */                       iiolilo0iiil.I0010I0i(oioOII0oI.I0000Il00O);
                            }
/* 402 */                   SpannableString spannableString4 = spannableString;
/* 404 */                   spannableString4.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) iiolilo0iiil.I00iOIl).marshall(), 0)), i2, i3, 33);
/* 407 */                   i = i4 + 1;
/* 409 */                   spannableString3 = spannableString4;
/* 410 */                   list = list4;
/* 411 */                   size = i5;
                        }
/* 416 */               charSequence = spannableString3;
                    }
/* 423 */           clipboardManagerI00000oIO.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
                }
            }
