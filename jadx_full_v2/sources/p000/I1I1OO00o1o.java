            package p000;

            import android.graphics.Typeface;
            import android.os.Handler;
            import android.os.Looper;
            import android.widget.TextView;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.Character;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.text.BreakIterator;
            
/* 27 */    public final class I1I1OO00o1o {
                public final int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;

                public I1I1OO00o1o(int i) {
/* 1 */             this.I00000oIO = i;
                }

                public static int I0000O(int i, int i2) {
/* 9 */             return I0001Ioi1lo(i2) + I000iOII(i);
                }

                public static int I0000oI00(int i, int i2) {
/* 9 */             return I0001Ioi1lo(i2) + I000iOII(i);
                }

                public static int I0001Ioi1lo(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return I000OOo1O(i);
                    }
/* 8 */             return 10;
                }

                public static int I000II(int i, I01Ilioliio i01Ilioliio) {
/* 9 */             return I000O01llI0(i01Ilioliio) + I000iOII(i);
                }

                public static int I000O01llI0(I01Ilioliio i01Ilioliio) {
/* 1 */             int iI0000Il00O = i01Ilioliio.I0000Il00O();
/* 9 */             return I000OOo1O(iI0000Il00O) + iI0000Il00O;
                }

                public static int I000OOo1O(int i) {
/* 3 */             if ((i & (-128)) == 0) {
/* 5 */                 return 1;
                    }
/* 9 */             if ((i & (-16384)) == 0) {
/* 11 */                return 2;
                    }
/* 16 */            if (((-2097152) & i) == 0) {
/* 18 */                return 3;
                    }
                    return (i & (-268435456)) == 0 ? 4 : 5;
                }

                public static int I000OiO(long j) {
/* 8 */             if (((-128) & j) == 0) {
/* 10 */                return 1;
                    }
/* 17 */            if (((-16384) & j) == 0) {
/* 19 */                return 2;
                    }
/* 27 */            if (((-2097152) & j) == 0) {
/* 29 */                return 3;
                    }
/* 37 */            if (((-268435456) & j) == 0) {
/* 39 */                return 4;
                    }
/* 49 */            if (((-34359738368L) & j) == 0) {
/* 51 */                return 5;
                    }
/* 61 */            if (((-4398046511104L) & j) == 0) {
/* 63 */                return 6;
                    }
/* 70 */            if (((-562949953421312L) & j) == 0) {
/* 72 */                return 7;
                    }
/* 79 */            if (((-72057594037927936L) & j) == 0) {
/* 81 */                return 8;
                    }
                    return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
                }

                public static int I000iOII(int i) {
/* 3 */             return I000OOo1O(i << 3);
                }

                public static I1I1OO00o1o I00111O(OutputStream outputStream, int i) {
/* 6 */             I1I1OO00o1o i1I1OO00o1o = new I1I1OO00o1o(1);
/* 9 */             i1I1OO00o1o.I0000oI00 = outputStream;
/* 11 */            i1I1OO00o1o.I0000O = new byte[i];
/* 14 */            i1I1OO00o1o.I0000Il00O = 0;
/* 16 */            i1I1OO00o1o.I00000oOI = i;
/* 18 */            VarHandle.storeStoreFence();
/* 37 */            return i1I1OO00o1o;
                }

                public void I00000oIO(int i) {
/* 7 */             Handler handler = new Handler(Looper.getMainLooper());
/* 13 */            I1010Iil i1010Iil = new I1010Iil(4);
/* 16 */            i1010Iil.I00iiO = this;
/* 18 */            i1010Iil.I00iiI = i;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            handler.post(i1010Iil);
                }

                public void I00000oOI(Typeface typeface) {
/* 7 */             Handler handler = new Handler(Looper.getMainLooper());
/* 14 */            Io11iII11ll io11iII11ll = new Io11iII11ll(16);
/* 17 */            io11iII11ll.I00iiI = this;
/* 19 */            io11iII11ll.I00iiO = typeface;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            handler.post(io11iII11ll);
                }

                public void I0000Il00O(int i) {
/* 1 */             int i2 = this.I00000oOI;
/* 3 */             int i3 = this.I0000Il00O;
/* 5 */             boolean z = false;
/* 6 */             if (i <= i3 && i2 <= i) {
/* 10 */                z = true;
                    }
/* 11 */            if (z) {
/* 77 */                return;
                    }
/* 19 */            StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Invalid offset: ", i, ". Valid range is [", i2, " , ");
/* 23 */            sbI0010I0i.append(i3);
/* 28 */            sbI0010I0i.append("]");
/* 35 */            Ioliol.I00000oIO(sbI0010I0i.toString());
                }

                public void I000l1() throws IOException {
/* 1 */             I001iOo1i0O();
                }

                public int I000lI() {
/* 3 */             IOOOi1 iOOOi1 = (IOOOi1) this.I0000oI00;
/* 7 */             String str = (String) this.I0000O;
/* 9 */             if (iOOOi1 == null) {
/* 11 */                return str.length();
                    }
/* 33 */            return (iOOOi1.I00000oOI - iOOOi1.I0000Il00O()) + (str.length() - (this.I0000Il00O - this.I00000oOI));
                }

                public boolean I000o00OoI0I(int i) {
/* 3 */             CharSequence charSequence = (CharSequence) this.I0000O;
/* 8 */             int i2 = this.I00000oOI + 1;
/* 11 */            if (i > this.I0000Il00O || i2 > i) {
/* 62 */                return false;
                    }
/* 23 */            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
/* 26 */                int i3 = i - 1;
/* 35 */                if (!Character.isSurrogate(charSequence.charAt(i3))) {
/* 42 */                    if (!IiollO1llli.I0000O()) {
/* 62 */                        return false;
                            }
/* 44 */                    IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 52 */                    if (iiollO1llliI00000oIO.I0000Il00O() != 1 || iiollO1llliI00000oIO.I00000oOI(i3, charSequence) == -1) {
/* 62 */                        return false;
                            }
                        }
                    }
/* 7 */             return true;
                }

                public boolean I000oI1ioi(int i) {
/* 3 */             int i2 = this.I00000oOI + 1;
/* 7 */             if (i > this.I0000Il00O || i2 > i) {
/* 24 */                return false;
                    }
/* 19 */            return liIO11loi.I00000oIO(Character.codePointBefore((CharSequence) this.I0000O, i));
                }

                public boolean I00100l0(int i) {
/* 1 */             I0000Il00O(i);
/* 12 */            if (!((BreakIterator) this.I0000oI00).isBoundary(i)) {
/* 64 */                return false;
                    }
/* 18 */            if (I0010I0i(i) && I0010I0i(i - 1) && I0010I0i(i + 1)) {
/* 64 */                return false;
                    }
                    return i <= 0 || i >= ((CharSequence) this.I0000O).length() - 1 || !(I00100o1O0lo(i) || I00100o1O0lo(i + 1));
                }

                public boolean I00100o1O0lo(int i) {
/* 3 */             CharSequence charSequence = (CharSequence) this.I0000O;
                    int i2 = i - 1;
/* 11 */            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
/* 15 */            Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
/* 21 */            if (O0000Ioio00.I0000O(unicodeBlockOf, unicodeBlock) && O0000Ioio00.I0000O(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
/* 69 */                return true;
                    }
                    return O0000Ioio00.I0000O(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && O0000Ioio00.I0000O(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
                }

                public boolean I0010I0i(int i) {
/* 3 */             CharSequence charSequence = (CharSequence) this.I0000O;
/* 5 */             int i2 = this.I00000oOI;
/* 9 */             if (i >= this.I0000Il00O || i2 > i) {
/* 60 */                return false;
                    }
/* 22 */            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
/* 40 */                if (!IiollO1llli.I0000O()) {
/* 60 */                    return false;
                        }
/* 42 */                IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 50 */                if (iiollO1llliI00000oIO.I0000Il00O() != 1 || iiollO1llliI00000oIO.I00000oOI(i, charSequence) == -1) {
/* 60 */                    return false;
                        }
                    }
/* 21 */            return true;
                }

                public boolean I0010o(int i) {
/* 1 */             int i2 = this.I00000oOI;
/* 5 */             if (i >= this.I0000Il00O || i2 > i) {
/* 22 */                return false;
                    }
/* 17 */            return liIO11loi.I00000oIO(Character.codePointAt((CharSequence) this.I0000O, i));
                }

                public int I001IIilI0O(int i) {
/* 1 */             I0000Il00O(i);
/* 8 */             int iFollowing = ((BreakIterator) this.I0000oI00).following(i);
                    return (I0010I0i(iFollowing + (-1)) && I0010I0i(iFollowing) && !I00100o1O0lo(iFollowing)) ? I001IIilI0O(iFollowing) : iFollowing;
                }

                public void I001i1O0Ol(Typeface typeface) {
/* 1 */             int i = this.I00000oOI;
/* 4 */             int i2 = 0;
/* 5 */             if (i != -1) {
/* 16 */                typeface = I1I1ii.I00000oIO(typeface, i, (this.I0000Il00O & 2) != 0);
                    }
/* 22 */            I1I1loi i1I1loi = (I1I1loi) this.I0000oI00;
/* 26 */            WeakReference weakReference = (WeakReference) this.I0000O;
/* 30 */            if (i1I1loi.I000lI) {
/* 32 */                i1I1loi.I000l1 = typeface;
/* 38 */                TextView textView = (TextView) weakReference.get();
/* 40 */                if (textView != null) {
/* 42 */                    boolean zIsAttachedToWindow = textView.isAttachedToWindow();
/* 46 */                    int i3 = i1I1loi.I000OiO;
/* 48 */                    if (!zIsAttachedToWindow) {
/* 68 */                        textView.setTypeface(typeface, i3);
/* 77 */                        return;
                            }
/* 52 */                    I1I1Oi0iil i1I1Oi0iil = new I1I1Oi0iil(i2);
/* 55 */                    i1I1Oi0iil.I00iiO = textView;
/* 57 */                    i1I1Oi0iil.I00iio = typeface;
/* 59 */                    i1I1Oi0iil.I00iiI = i3;
/* 61 */                    VarHandle.storeStoreFence();
/* 64 */                    textView.post(i1I1Oi0iil);
                        }
                    }
                }

                public int I001i1lo1io(int i) {
/* 1 */             I0000Il00O(i);
/* 8 */             int iPreceding = ((BreakIterator) this.I0000oI00).preceding(i);
                    return (I0010I0i(iPreceding) && I000o00OoI0I(iPreceding) && !I00100o1O0lo(iPreceding)) ? I001i1lo1io(iPreceding) : iPreceding;
                }

                public void I001iOo1i0O() throws IOException {
/* 12 */            ((OutputStream) this.I0000oI00).write((byte[]) this.I0000O, 0, this.I0000Il00O);
/* 15 */            this.I0000Il00O = 0;
                }

                public void I001l0I00(int i, int i2, String str) {
/* 1 */             if (i > i2) {
/* 26 */                Ioliol.I00000oIO("start index must be less than or equal to end index: " + i + " > " + i2);
                    }
/* 29 */            if (i < 0) {
/* 46 */                Ioliol.I00000oIO("start must be non-negative, but was " + i);
                    }
/* 51 */            IOOOi1 iOOOi1 = (IOOOi1) this.I0000oI00;
/* 54 */            if (iOOOi1 == null) {
/* 64 */                int iMax = Math.max(255, str.length() + Barcode.FORMAT_ITF);
/* 68 */                char[] cArr = new char[iMax];
/* 72 */                int iMin = Math.min(i, 64);
/* 85 */                int iMin2 = Math.min(((String) this.I0000O).length() - i2, 64);
/* 93 */                int i3 = i - iMin;
/* 95 */                ((String) this.I0000O).getChars(i3, i, cArr, 0);
/* 102 */               int i4 = iMax - iMin2;
/* 104 */               int i5 = iMin2 + i2;
/* 105 */               ((String) this.I0000O).getChars(i2, i5, cArr, i4);
/* 112 */               str.getChars(0, str.length(), cArr, iMin);
/* 121 */               int length = str.length() + iMin;
/* 123 */               IOOOi1 iOOOi12 = new IOOOi1(3);
/* 126 */               iOOOi12.I00000oOI = iMax;
/* 128 */               iOOOi12.I0000oI00 = cArr;
/* 130 */               iOOOi12.I0000Il00O = length;
/* 132 */               iOOOi12.I0000O = i4;
/* 134 */               this.I0000oI00 = iOOOi12;
/* 136 */               this.I00000oOI = i3;
/* 138 */               this.I0000Il00O = i5;
/* 140 */               return;
                    }
/* 141 */           int i6 = this.I00000oOI;
/* 143 */           int i7 = i - i6;
/* 145 */           int i8 = i2 - i6;
/* 147 */           if (i7 < 0 || i8 > iOOOi1.I00000oOI - iOOOi1.I0000Il00O()) {
/* 317 */               this.I0000O = toString();
/* 320 */               this.I0000oI00 = null;
/* 323 */               this.I00000oOI = -1;
/* 325 */               this.I0000Il00O = -1;
/* 327 */               I001l0I00(i, i2, str);
/* 408 */               return;
                    }
/* 166 */           int length2 = str.length() - (i8 - i7);
/* 171 */           if (length2 > iOOOi1.I0000Il00O()) {
/* 178 */               int iI0000Il00O = length2 - iOOOi1.I0000Il00O();
/* 179 */               int i9 = iOOOi1.I00000oOI;
/* 187 */               do {
/* 181 */                   i9 *= 2;
/* 187 */               } while (i9 - iOOOi1.I00000oOI < iI0000Il00O);
/* 190 */               char[] cArr2 = new char[i9];
/* 198 */               System.arraycopy((char[]) iOOOi1.I0000oI00, 0, cArr2, 0, iOOOi1.I0000Il00O);
/* 201 */               int i10 = iOOOi1.I00000oOI;
/* 203 */               int i11 = iOOOi1.I0000O;
/* 205 */               int i12 = i10 - i11;
/* 206 */               int i13 = i9 - i12;
/* 214 */               System.arraycopy((char[]) iOOOi1.I0000oI00, i11, cArr2, i13, (i12 + i11) - i11);
/* 217 */               iOOOi1.I0000oI00 = cArr2;
/* 219 */               iOOOi1.I00000oOI = i9;
/* 221 */               iOOOi1.I0000O = i13;
                    }
/* 223 */           int i14 = iOOOi1.I0000Il00O;
/* 225 */           if (i7 < i14 && i8 <= i14) {
/* 229 */               int i15 = i14 - i8;
/* 232 */               char[] cArr3 = (char[]) iOOOi1.I0000oI00;
/* 237 */               System.arraycopy(cArr3, i8, cArr3, iOOOi1.I0000O - i15, i15);
/* 240 */               iOOOi1.I0000Il00O = i7;
                        iOOOi1.I0000O -= i15;
                    } else if (i7 >= i14 || i8 < i14) {
/* 266 */               int iI0000Il00O2 = iOOOi1.I0000Il00O() + i7;
/* 271 */               int iI0000Il00O3 = iOOOi1.I0000Il00O() + i8;
/* 272 */               int i16 = iOOOi1.I0000O;
/* 274 */               int i17 = iI0000Il00O2 - i16;
/* 277 */               char[] cArr4 = (char[]) iOOOi1.I0000oI00;
/* 281 */               System.arraycopy(cArr4, i16, cArr4, iOOOi1.I0000Il00O, i17);
/* 286 */               i7 = iOOOi1.I0000Il00O + i17;
/* 288 */               iOOOi1.I0000Il00O = i7;
/* 290 */               iOOOi1.I0000O = iI0000Il00O3;
                    } else {
/* 257 */               iOOOi1.I0000O = iOOOi1.I0000Il00O() + i8;
/* 259 */               iOOOi1.I0000Il00O = i7;
                    }
/* 300 */           str.getChars(0, str.length(), (char[]) iOOOi1.I0000oI00, i7);
/* 310 */           iOOOi1.I0000Il00O = str.length() + iOOOi1.I0000Il00O;
                }

                public void I001lIiIIo1O(int i, int i2) throws IOException {
/* 2 */             I00IoIO0lI(i, 0);
/* 5 */             I001lloI(i2);
                }

                public void I001lllioOl(int i, int i2) throws IOException {
/* 2 */             I00IoIO0lI(i, 0);
/* 5 */             I001lloI(i2);
                }

                public void I001lloI(int i) throws IOException {
/* 1 */             if (i >= 0) {
/* 3 */                 I00Io1lO(i);
                    } else {
/* 8 */                 I00Io1o110i(i);
                    }
                }

                public void I00II0Ol1O0l(int i, I01Ilioliio i01Ilioliio) throws IOException {
/* 2 */             I00IoIO0lI(i, 2);
/* 5 */             I00II0oii1o(i01Ilioliio);
                }

                public void I00II0oii1o(I01Ilioliio i01Ilioliio) throws IOException {
/* 5 */             I00Io1lO(i01Ilioliio.I0000Il00O());
/* 8 */             i01Ilioliio.I0001Ioi1lo(this);
                }

                public void I00IO1(int i) throws IOException {
/* 1 */             byte b = (byte) i;
/* 6 */             if (this.I0000Il00O == this.I00000oOI) {
/* 8 */                 I001iOo1i0O();
                    }
/* 13 */            byte[] bArr = (byte[]) this.I0000O;
/* 15 */            int i2 = this.I0000Il00O;
/* 19 */            this.I0000Il00O = i2 + 1;
/* 21 */            bArr[i2] = b;
                }

                public void I00IO1oi11O(IIOII1 iioii1) throws IOException {
/* 1 */             int size = iioii1.size();
/* 5 */             int i = this.I00000oOI;
/* 7 */             int i2 = this.I0000Il00O;
/* 9 */             int i3 = i - i2;
/* 13 */            byte[] bArr = (byte[]) this.I0000O;
/* 16 */            if (i3 >= size) {
/* 18 */                iioii1.I0000oI00(0, bArr, i2, size);
                        this.I0000Il00O += size;
/* 26 */                return;
                    }
/* 27 */            iioii1.I0000oI00(0, bArr, i2, i3);
/* 30 */            int i4 = size - i3;
/* 31 */            this.I0000Il00O = i;
/* 33 */            I001iOo1i0O();
/* 36 */            if (i4 <= i) {
/* 38 */                iioii1.I0000oI00(i3, bArr, 0, i4);
/* 41 */                this.I0000Il00O = i4;
/* 65 */                return;
                    }
/* 46 */            OutputStream outputStream = (OutputStream) this.I0000oI00;
/* 48 */            if (i3 < 0) {
/* 86 */                I000II.I000OOo1O("Source offset < 0: ", 30, i3);
/* 168 */               return;
                    }
/* 50 */            if (i4 < 0) {
/* 78 */                I000II.I000OOo1O("Length < 0: ", 23, i4);
/* 81 */                return;
                    }
/* 52 */            int i5 = i3 + i4;
/* 58 */            if (i5 > iioii1.size()) {
/* 70 */                I000II.I000OOo1O("Source end offset exceeded: ", 39, i5);
                    } else if (i4 > 0) {
/* 62 */                iioii1.I00111O(outputStream, i3, i4);
                    }
                }

                public void I00IOO(byte[] bArr) throws IOException {
/* 1 */             int length = bArr.length;
/* 2 */             int i = this.I00000oOI;
/* 4 */             int i2 = this.I0000Il00O;
/* 6 */             int i3 = i - i2;
/* 10 */            byte[] bArr2 = (byte[]) this.I0000O;
/* 13 */            if (i3 >= length) {
/* 15 */                System.arraycopy(bArr, 0, bArr2, i2, length);
                        this.I0000Il00O += length;
/* 23 */                return;
                    }
/* 24 */            System.arraycopy(bArr, 0, bArr2, i2, i3);
/* 27 */            int i4 = length - i3;
/* 28 */            this.I0000Il00O = i;
/* 30 */            I001iOo1i0O();
/* 33 */            if (i4 > i) {
/* 45 */                ((OutputStream) this.I0000oI00).write(bArr, i3, i4);
                    } else {
/* 35 */                System.arraycopy(bArr, i3, bArr2, 0, i4);
/* 38 */                this.I0000Il00O = i4;
                    }
                }

                public void I00IioO0OiOi(int i) throws IOException {
/* 3 */             I00IO1(i & 255);
/* 10 */            I00IO1((i >> 8) & 255);
/* 17 */            I00IO1((i >> 16) & 255);
/* 24 */            I00IO1((i >> 24) & 255);
                }

                public void I00IlilI0i0i(long j) throws IOException {
/* 4 */             I00IO1(((int) j) & 255);
/* 14 */            I00IO1(((int) (j >> 8)) & 255);
/* 24 */            I00IO1(((int) (j >> 16)) & 255);
/* 34 */            I00IO1(((int) (j >> 24)) & 255);
/* 44 */            I00IO1(((int) (j >> 32)) & 255);
/* 54 */            I00IO1(((int) (j >> 40)) & 255);
/* 64 */            I00IO1(((int) (j >> 48)) & 255);
/* 73 */            I00IO1(((int) (j >> 56)) & 255);
                }

                public void I00Io1lO(int i) throws IOException {
/* 3 */             while ((i & (-128)) != 0) {
/* 13 */                I00IO1((i & 127) | Barcode.FORMAT_ITF);
/* 16 */                i >>>= 7;
                    }
/* 5 */             I00IO1(i);
                }

                public void I00Io1o110i(long j) throws IOException {
/* 8 */             while (((-128) & j) != 0) {
/* 20 */                I00IO1((((int) j) & 127) | Barcode.FORMAT_ITF);
/* 24 */                j >>>= 7;
                    }
/* 11 */            I00IO1((int) j);
                }

                public void I00IoIO0lI(int i, int i2) {
/* 4 */             I00Io1lO((i << 3) | i2);
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 2:
/* 13 */                    IOOOi1 iOOOi1 = (IOOOi1) this.I0000oI00;
/* 17 */                    String str = (String) this.I0000O;
/* 19 */                    if (iOOOi1 == null) {
/* 71 */                        return str;
                            }
/* 24 */                    StringBuilder sb = new StringBuilder();
/* 30 */                    sb.append((CharSequence) str, 0, this.I00000oOI);
/* 39 */                    sb.append((char[]) iOOOi1.I0000oI00, 0, iOOOi1.I0000Il00O);
/* 44 */                    char[] cArr = (char[]) iOOOi1.I0000oI00;
/* 46 */                    int i = iOOOi1.I0000O;
/* 51 */                    sb.append(cArr, i, iOOOi1.I00000oOI - i);
/* 56 */                    String str2 = (String) this.I0000O;
/* 64 */                    sb.append((CharSequence) str2, this.I0000Il00O, str2.length());
/* 67 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 28 */        public void I001IO000(int i) {
                }
            }
