            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.net.Uri;
            import android.os.Bundle;
            import android.util.AttributeSet;
            import android.view.View;
            import java.io.EOFException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.Proxy;
            import java.net.Socket;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.WeakHashMap;
            
/* 51 */    public class I11l01l implements Il111ol {
                public final int I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;

                public I11l01l(String str, O01IIOOIO o01iiooio) {
/* 2 */             this.I00000oIO = 5;
/* 7 */             this.I0000Il00O = o01iiooio;
/* 12 */            o00io0IiOOo0 o00io0iiooo0 = new o00io0IiOOo0(2);
/* 15 */            o00io0iiooo0.I00iiO = o01iiooio;
/* 21 */            o00io0iiooo0.I00iio = new Object[8];
/* 23 */            int[] iArr = new int[8];
/* 27 */            for (int i = 0; i < 8; i++) {
/* 29 */                iArr[i] = -1;
                    }
/* 34 */            o00io0iiooo0.I00ilI0I1 = iArr;
/* 36 */            o00io0iiooo0.I00iiI = -1;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            this.I0000O = o00io0iiooo0;
/* 48 */            this.I0001Ioi1lo = new StringBuilder();
/* 50 */            this.I000II = str;
                }

                public static void I001IO000(I11l01l i11l01l, String str, int i, String str2, int i2) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = i11l01l.I00000oOI;
                    }
/* 10 */            if ((i2 & 4) != 0) {
/* 12 */                str2 = null;
                    }
/* 13 */            i11l01l.I001IIilI0O(str, i, str2);
/* 966 */           throw null;
                }

                @Override
                public OlI1ii I00000oIO(Oi1001l0Il oi1001l0Il) {
/* 5 */             if (!IoIoIiooolI1.I00000oIO(oi1001l0Il)) {
/* 9 */                 return I001lloI(0L);
                    }
/* 18 */            String strI00000oOI = oi1001l0Il.I00ilO0.I00000oOI("Transfer-Encoding");
/* 23 */            if (strI00000oOI == null) {
/* 25 */                strI00000oOI = null;
                    }
/* 36 */            if ("chunked".equalsIgnoreCase(strI00000oOI)) {
/* 42 */                IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) oi1001l0Il.I00iOIl.I00iiI;
/* 46 */                if (this.I00000oOI == 4) {
/* 48 */                    this.I00000oOI = 5;
/* 52 */                    return new IoIIollO0o(this, ioOi01OlIl1o);
                        }
/* 58 */                OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 22 */                return null;
                    }
/* 62 */            long jI000OiO = OollIoI001lo.I000OiO(oi1001l0Il);
/* 70 */            if (jI000OiO != -1) {
/* 72 */                return I001lloI(jI000OiO);
                    }
/* 79 */            if (this.I00000oOI != 4) {
/* 98 */                OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 22 */                return null;
                    }
/* 81 */            this.I00000oOI = 5;
/* 87 */            ((OOll1O) this.I0000O).I000OOo1O();
/* 92 */            return new IoIO0o01(this);
                }

                @Override
                public void I00000oOI() {
/* 5 */             ((IIIIiol) this.I0001Ioi1lo).flush();
                }

                @Override
                public long I0000Il00O(Oi1001l0Il oi1001l0Il) {
/* 5 */             if (!IoIoIiooolI1.I00000oIO(oi1001l0Il)) {
/* 7 */                 return 0L;
                    }
/* 14 */            String strI00000oOI = oi1001l0Il.I00ilO0.I00000oOI("Transfer-Encoding");
/* 18 */            if (strI00000oOI == null) {
/* 20 */                strI00000oOI = null;
                    }
/* 27 */            if ("chunked".equalsIgnoreCase(strI00000oOI)) {
/* 29 */                return -1L;
                    }
/* 32 */            return OollIoI001lo.I000OiO(oi1001l0Il);
                }

                @Override
                public Ol0i0olI I0000O(I0Oi111ii i0Oi111ii, long j) {
/* 3 */             IIIIiol iIIIiol = (IIIIiol) this.I0001Ioi1lo;
/* 26 */            if ("chunked".equalsIgnoreCase(((Io1Io0OOi011) i0Oi111ii.I00iio).I00000oOI("Transfer-Encoding"))) {
/* 30 */                if (this.I00000oOI != 1) {
/* 58 */                    OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 21 */                    return null;
                        }
/* 32 */                this.I00000oOI = 2;
/* 36 */                IoIIoOilI111 ioIIoOilI111 = new IoIIoOilI111();
/* 39 */                ioIIoOilI111.I00iiO = this;
/* 50 */                ioIIoOilI111.I00iOIl = new Ill01o0lI0l(iIIIiol.timeout());
/* 52 */                VarHandle.storeStoreFence();
/* 55 */                return ioIIoOilI111;
                    }
/* 66 */            if (j == -1) {
/* 104 */               I000II.I001IO000("Cannot stream a request body without chunked encoding or a known content length!");
/* 21 */                return null;
                    }
/* 70 */            if (this.I00000oOI != 1) {
/* 98 */                OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 21 */                return null;
                    }
/* 72 */            this.I00000oOI = 2;
/* 76 */            IoIO01o0l ioIO01o0l = new IoIO01o0l();
/* 79 */            ioIO01o0l.I00iiO = this;
/* 90 */            ioIO01o0l.I00iOIl = new Ill01o0lI0l(iIIIiol.timeout());
/* 92 */            VarHandle.storeStoreFence();
/* 95 */            return ioIO01o0l;
                }

                @Override
                public Oi10001 I0000oI00(boolean z) throws IOException {
/* 3 */             Io1OIO1l0o io1OIO1l0o = (Io1OIO1l0o) this.I000II;
/* 5 */             int i = this.I00000oOI;
/* 10 */            if (i != 1 && i != 2 && i != 3) {
/* 22 */                OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 8 */                 return null;
                    }
                    try {
/* 32 */                String strI00IoO0 = ((IIIIlO11I0lO) io1OIO1l0o.I00iiO).I00IoO0(io1OIO1l0o.I00iiI);
                        io1OIO1l0o.I00iiI -= strI00IoO0.length();
/* 46 */                I00Ol00 i00Ol00I00000oIO = lOOiill.I00000oIO(strI00IoO0);
/* 50 */                int i2 = i00Ol00I00000oIO.I00000oOI;
/* 54 */                Oi10001 oi10001 = new Oi10001();
/* 61 */                oi10001.I00000oOI = (OOiIO0oi) i00Ol00I00000oIO.I0000Il00O;
/* 63 */                oi10001.I0000Il00O = i2;
/* 69 */                oi10001.I0000O = (String) i00Ol00I00000oIO.I0000O;
/* 79 */                oi10001.I0001Ioi1lo = io1OIO1l0o.I0000O().I000OOo1O();
/* 83 */                if (z && i2 == 100) {
/* 8 */                     return null;
                        }
/* 88 */                if (i2 == 100) {
/* 90 */                    this.I00000oOI = 3;
/* 92 */                    return oi10001;
                        }
/* 97 */                if (102 > i2 || i2 >= 200) {
/* 107 */                   this.I00000oOI = 4;
/* 109 */                   return oi10001;
                        }
/* 103 */               this.I00000oOI = 3;
/* 105 */               return oi10001;
                    } catch (EOFException e) {
/* 186 */               throw new IOException("unexpected end of stream on ".concat(((OOll1O) this.I0000O).I00000oIO.I00000oIO.I000O01llI0.I0001Ioi1lo()), e);
                    }
                }

                @Override
                public OOll1O I0001Ioi1lo() {
/* 3 */             return (OOll1O) this.I0000O;
                }

                @Override
                public void I000II() {
/* 5 */             ((IIIIiol) this.I0001Ioi1lo).flush();
                }

                @Override
                public void I000O01llI0(I0Oi111ii i0Oi111ii) {
/* 9 */             Proxy.Type type = ((OOll1O) this.I0000O).I00000oIO.I00000oOI.type();
/* 15 */            StringBuilder sb = new StringBuilder();
/* 22 */            sb.append((String) i0Oi111ii.I00iiO);
/* 27 */            sb.append(' ');
/* 32 */            IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111ii.I00iiI;
/* 36 */            if (ioOi01OlIl1o.I000OOo1O || type != Proxy.Type.HTTP) {
/* 46 */                String strI00000oOI = ioOi01OlIl1o.I00000oOI();
/* 50 */                String strI0000O = ioOi01OlIl1o.I0000O();
/* 54 */                if (strI0000O != null) {
/* 58 */                    strI00000oOI = IIlIOloOOO.I000oI1ioi('?', strI00000oOI, strI0000O);
                        }
/* 62 */                sb.append(strI00000oOI);
                    } else {
/* 42 */                sb.append(ioOi01OlIl1o);
                    }
/* 67 */            sb.append(" HTTP/1.1");
/* 78 */            I00O0i0ii((Io1Io0OOi011) i0Oi111ii.I00iio, sb.toString());
                }

                public int I000OOo1O(int i, CharSequence charSequence) {
/* 1 */             int i2 = i + 4;
/* 7 */             if (i2 < charSequence.length()) {
/* 69 */                ((StringBuilder) this.I0001Ioi1lo).append((char) (I001i1O0Ol(i + 3, charSequence) + (I001i1O0Ol(i, charSequence) << 12) + (I001i1O0Ol(i + 1, charSequence) << 8) + (I001i1O0Ol(i + 2, charSequence) << 4)));
/* 89 */                return i2;
                    }
/* 9 */             this.I00000oOI = i;
/* 15 */            if (i2 < charSequence.length()) {
/* 19 */                return I000OOo1O(this.I00000oOI, charSequence);
                    }
/* 29 */            I001IO000(this, "Unexpected EOF during unicode escape", 0, null, 6);
/* 32 */            throw null;
                }

                public void I000OiO() {
/* 3 */             View view = (View) this.I0000Il00O;
/* 5 */             Drawable background = view.getBackground();
/* 9 */             if (background != null) {
/* 15 */                if (((IOloIIl1) this.I0000oI00) != null) {
/* 19 */                    IOloIIl1 iOloIIl1 = (IOloIIl1) this.I000II;
/* 21 */                    if (iOloIIl1 == null) {
/* 25 */                        iOloIIl1 = new IOloIIl1();
/* 28 */                        this.I000II = iOloIIl1;
                            }
/* 31 */                    iOloIIl1.I0000Il00O = null;
/* 34 */                    iOloIIl1.I00000oOI = false;
/* 36 */                    iOloIIl1.I0000O = null;
/* 38 */                    iOloIIl1.I00000oIO = false;
/* 40 */                    WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 42 */                    ColorStateList backgroundTintList = view.getBackgroundTintList();
/* 47 */                    if (backgroundTintList != null) {
/* 49 */                        iOloIIl1.I00000oOI = true;
/* 51 */                        iOloIIl1.I0000Il00O = backgroundTintList;
                            }
/* 53 */                    PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
/* 57 */                    if (backgroundTintMode != null) {
/* 59 */                        iOloIIl1.I00000oIO = true;
/* 61 */                        iOloIIl1.I0000O = backgroundTintMode;
                            }
/* 65 */                    if (iOloIIl1.I00000oOI || iOloIIl1.I00000oIO) {
/* 71 */                        int[] drawableState = view.getDrawableState();
/* 75 */                        PorterDuff.Mode mode = I11oo00.I00000oOI;
/* 77 */                        Oi0loIIIoI.I000OOo1O(background, iOloIIl1, drawableState);
/* 80 */                        return;
                            }
                        }
/* 83 */                IOloIIl1 iOloIIl12 = (IOloIIl1) this.I0001Ioi1lo;
/* 85 */                if (iOloIIl12 != null) {
/* 87 */                    int[] drawableState2 = view.getDrawableState();
/* 91 */                    PorterDuff.Mode mode2 = I11oo00.I00000oOI;
/* 93 */                    Oi0loIIIoI.I000OOo1O(background, iOloIIl12, drawableState2);
                        } else {
/* 99 */                    IOloIIl1 iOloIIl13 = (IOloIIl1) this.I0000oI00;
/* 101 */                   if (iOloIIl13 != null) {
/* 103 */                       int[] drawableState3 = view.getDrawableState();
/* 107 */                       PorterDuff.Mode mode3 = I11oo00.I00000oOI;
/* 109 */                       Oi0loIIIoI.I000OOo1O(background, iOloIIl13, drawableState3);
                            }
                        }
                    }
                }

                public boolean I000iOII() {
/* 1 */             int i = this.I00000oOI;
/* 5 */             if (i == -1) {
/* 4 */                 return false;
                    }
/* 10 */            String str = (String) this.I000II;
/* 16 */            while (i < str.length()) {
/* 18 */                char cCharAt = str.charAt(i);
/* 24 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
/* 39 */                    this.I00000oOI = i;
                            return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
                        }
/* 60 */                i++;
                    }
/* 63 */            this.I00000oOI = i;
/* 4 */             return false;
                }

                public void I000l1(int i, String str) {
/* 3 */             String str2 = (String) this.I000II;
/* 17 */            if (str2.length() - i < str.length()) {
/* 80 */                I001IO000(this, "Unexpected end of boolean literal", 0, null, 6);
/* 89 */                throw null;
                    }
/* 19 */            int length = str.length();
/* 24 */            for (int i2 = 0; i2 < length; i2++) {
/* 38 */                if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
/* 66 */                    I001IO000(this, "Expected valid boolean literal prefix, but had '" + I0010o() + '\'', 0, null, 6);
/* 69 */                    throw null;
                        }
                    }
/* 75 */            this.I00000oOI = str.length() + i;
                }

                public String I000lI() {
                    String string;
/* 3 */             StringBuilder sb = (StringBuilder) this.I0001Ioi1lo;
/* 7 */             String str = (String) this.I000II;
/* 11 */            I00100l0('\"');
/* 14 */            int i = this.I00000oOI;
/* 17 */            int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, '\"', i, 4);
/* 23 */            if (iI001i1O0Ol == -1) {
/* 25 */                I0010o();
/* 28 */                int i2 = this.I00000oOI;
/* 58 */                I001IO000(this, IlIi0I0.I000lI("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
/* 61 */                throw null;
                    }
/* 62 */            int i3 = i;
/* 63 */            while (i3 < iI001i1O0Ol) {
/* 71 */                if (str.charAt(i3) == '\\') {
/* 73 */                    int iI00IioO0OiOi = this.I00000oOI;
/* 75 */                    char cCharAt = str.charAt(i3);
/* 80 */                    boolean z = false;
/* 82 */                    while (cCharAt != '\"') {
/* 86 */                        if (cCharAt == '\\') {
/* 88 */                            sb.append((CharSequence) str, iI00IioO0OiOi, i3);
/* 93 */                            int iI00IioO0OiOi2 = I00IioO0OiOi(i3 + 1);
/* 98 */                            if (iI00IioO0OiOi2 == -1) {
/* 166 */                               I001IO000(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
/* 169 */                               throw null;
                                    }
/* 100 */                           int iI000OOo1O = iI00IioO0OiOi2 + 1;
/* 102 */                           char cCharAt2 = str.charAt(iI00IioO0OiOi2);
/* 108 */                           if (cCharAt2 == 'u') {
/* 110 */                               iI000OOo1O = I000OOo1O(iI000OOo1O, str);
                                    } else {
/* 122 */                               char c = cCharAt2 < 'u' ? IO11Iool0.I00000oIO[cCharAt2] : (char) 0;
/* 123 */                               if (c == 0) {
/* 160 */                                   I001IO000(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
/* 163 */                                   throw null;
                                        }
/* 125 */                               sb.append(c);
                                    }
/* 128 */                           iI00IioO0OiOi = I00IioO0OiOi(iI000OOo1O);
/* 132 */                           if (iI00IioO0OiOi == -1) {
/* 137 */                               I001IO000(this, "Unexpected EOF", iI00IioO0OiOi, null, 4);
/* 140 */                               throw null;
                                    }
                                } else {
/* 170 */                           i3++;
/* 176 */                           if (i3 >= str.length()) {
/* 178 */                               sb.append((CharSequence) str, iI00IioO0OiOi, i3);
/* 181 */                               iI00IioO0OiOi = I00IioO0OiOi(i3);
/* 185 */                               if (iI00IioO0OiOi == -1) {
/* 188 */                                   I001IO000(this, "Unexpected EOF", iI00IioO0OiOi, null, 4);
/* 191 */                                   throw null;
                                        }
                                    } else {
                                        continue;
/* 192 */                               cCharAt = str.charAt(i3);
                                    }
                                }
/* 134 */                       i3 = iI00IioO0OiOi;
/* 135 */                       z = true;
/* 192 */                       cCharAt = str.charAt(i3);
                            }
/* 197 */                   if (z) {
/* 208 */                       sb.append((CharSequence) str, iI00IioO0OiOi, i3);
/* 211 */                       String string2 = sb.toString();
/* 215 */                       sb.setLength(0);
/* 218 */                       string = string2;
                            } else {
/* 203 */                       string = str.subSequence(iI00IioO0OiOi, i3).toString();
                            }
/* 220 */                   this.I00000oOI = i3 + 1;
/* 222 */                   return string;
                        }
/* 223 */               i3++;
                    }
/* 229 */           this.I00000oOI = iI001i1O0Ol + 1;
/* 231 */           return str.substring(i, iI001i1O0Ol);
                }

                public byte I000o00OoI0I() {
/* 3 */             String str = (String) this.I000II;
/* 5 */             int i = this.I00000oOI;
/* 10 */            while (i != -1 && i < str.length()) {
/* 18 */                int i2 = i + 1;
/* 20 */                char cCharAt = str.charAt(i);
/* 26 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
/* 39 */                    this.I00000oOI = i2;
/* 41 */                    return iOI0IO0iio0o.I00000oIO(cCharAt);
                        }
/* 46 */                i = i2;
                    }
/* 52 */            this.I00000oOI = str.length();
/* 8 */             return (byte) 10;
                }

                public byte I000oI1ioi(byte b) {
/* 3 */             String str = (String) this.I000II;
/* 5 */             byte bI000o00OoI0I = I000o00OoI0I();
/* 9 */             if (bI000o00OoI0I == b) {
/* 186 */               return bI000o00OoI0I;
                    }
/* 11 */            String strI00000oOI = iOI0IO0iio0o.I00000oOI(b);
/* 15 */            int i = this.I00000oOI;
/* 22 */            int i2 = i > 0 ? i - 1 : i;
/* 55 */            I001IO000(this, Oi010OO0.I001IO000("Expected ", strI00000oOI, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
/* 58 */            throw null;
                }

                public void I00100l0(char c) {
/* 1 */             int i = this.I00000oOI;
/* 5 */             if (i == -1) {
/* 57 */                I00Iooi00oi(c);
/* 186 */               throw null;
                    }
/* 9 */             String str = (String) this.I000II;
/* 15 */            while (i < str.length()) {
/* 17 */                int i2 = i + 1;
/* 19 */                char cCharAt = str.charAt(i);
/* 25 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
/* 40 */                    this.I00000oOI = i2;
/* 42 */                    if (cCharAt == c) {
/* 44 */                        return;
                            }
/* 45 */                    I00Iooi00oi(c);
/* 48 */                    throw null;
                        }
/* 49 */                i = i2;
                    }
/* 51 */            this.I00000oOI = -1;
/* 53 */            I00Iooi00oi(c);
/* 56 */            throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:100:0x0168, code lost:
                
                    I001IO000(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
                
                    I001IO000(r22, "Numeric value overflow", 0, null, 6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x0188, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0189, code lost:
                
                    p000.I000II.I00000oIO();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
                
                    return 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x018d, code lost:
                
                    r10 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x018f, code lost:
                
                    if (r14 == false) goto L109;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x0191, code lost:
                
                    return r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:110:0x0196, code lost:
                
                    if (r10 == Long.MIN_VALUE) goto L113;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x0199, code lost:
                
                    return -r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x019a, code lost:
                
                    I001IO000(r22, "Numeric value overflow", 0, null, 6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:114:0x019f, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:115:0x01a0, code lost:
                
                    I001IO000(r22, "Expected numeric literal", r12, null, 4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x01a6, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
                
                    I001IO000(r22, p000.IIlIOloOOO.I000oI1ioi(r15, "Unexpected symbol '", "' in numeric literal"), r12, null, 4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0107, code lost:
                
                    if (r12 == r1) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
                
                    r3 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
                
                    r3 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
                
                    if (r1 == r12) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x010e, code lost:
                
                    if (r14 == false) goto L75;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0112, code lost:
                
                    if (r1 == (r12 - 1)) goto L74;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x0118, code lost:
                
                    if (r20 == false) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
                
                    if (r3 == false) goto L82;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:0x0122, code lost:
                
                    if (r2.charAt(r12) != '\"') goto L80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
                
                    r12 = r12 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x0127, code lost:
                
                    I001IO000(r22, "Expected closing quotation mark", r12, null, 4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x012f, code lost:
                
                    I001IO000(r22, "EOF", 0, null, 6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x0136, code lost:
                
                    r22.I00000oOI = r12;
                    r1 = r16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
                
                    if (r21 == false) goto L106;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x013c, code lost:
                
                    r1 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x013f, code lost:
                
                    if (r11 != false) goto L89;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x0141, code lost:
                
                    r3 = java.lang.Math.pow(10.0d, -r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x0149, code lost:
                
                    if (r11 != true) goto L104;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x014b, code lost:
                
                    r3 = java.lang.Math.pow(10.0d, r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x0150, code lost:
                
                    r1 = r1 * r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
                
                    if (r1 > 9.223372036854776E18d) goto L102;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x015b, code lost:
                
                    if (r1 < (-9.223372036854776E18d)) goto L102;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x0163, code lost:
                
                    if (java.lang.Math.floor(r1) != r1) goto L100;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0165, code lost:
                
                    r10 = (long) r1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public long I00100o1O0lo() {
                    boolean z;
                    boolean z2;
                    boolean z3;
/* 7 */             int iI00IioO0OiOi = I00IioO0OiOi(I00IoO0());
/* 13 */            String str = (String) this.I000II;
/* 24 */            if (iI00IioO0OiOi < str.length() && iI00IioO0OiOi != -1) {
/* 35 */                if (str.charAt(iI00IioO0OiOi) == '\"') {
/* 37 */                    iI00IioO0OiOi++;
/* 43 */                    if (iI00IioO0OiOi == str.length()) {
/* 47 */                        I001IO000(this, "EOF", 0, null, 6);
/* 50 */                        throw null;
                            }
/* 45 */                    z = true;
                        } else {
/* 51 */                    z = false;
                        }
/* 52 */                int i = iI00IioO0OiOi;
/* 53 */                boolean z4 = false;
/* 54 */                boolean z5 = false;
/* 55 */                boolean z6 = false;
/* 56 */                long j = 0;
/* 58 */                long j2 = 0;
                        while (true) {
/* 68 */                    if (i == str.length()) {
/* 260 */                       z2 = z;
/* 262 */                       z3 = z5;
                                break;
                            }
/* 70 */                    char cCharAt = str.charAt(i);
/* 80 */                    if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
/* 87 */                        z2 = z;
/* 119 */                       if (cCharAt == '-' && z5) {
/* 123 */                           if (i == iI00IioO0OiOi) {
/* 138 */                               I001IO000(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
/* 141 */                               throw null;
                                    }
/* 125 */                           i++;
/* 127 */                           z = z2;
/* 134 */                           z4 = false;
                                } else if (cCharAt != '+' || !z5) {
/* 170 */                           z3 = z5;
/* 175 */                           if (cCharAt != '-') {
/* 202 */                               if (iOI0IO0iio0o.I00000oIO(cCharAt) != 0) {
                                            break;
                                        }
/* 204 */                               int i2 = i + 1;
                                        int i3 = cCharAt - '0';
/* 208 */                               if (i3 < 0 || i3 >= 10) {
                                            break;
                                        }
/* 216 */                               if (z3) {
/* 220 */                                   j = (j * 10) + i3;
                                        } else {
/* 236 */                                   j2 = (j2 * 10) - i3;
/* 240 */                                   if (j2 > 0) {
/* 246 */                                       I001IO000(this, "Numeric value overflow", 0, null, 6);
/* 249 */                                       throw null;
                                            }
                                        }
/* 221 */                               i = i2;
/* 222 */                               z = z2;
/* 224 */                               z5 = z3;
                                    } else {
/* 177 */                               if (i != iI00IioO0OiOi) {
/* 194 */                                   I001IO000(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
/* 197 */                                   throw null;
                                        }
/* 179 */                               i++;
/* 182 */                               z = z2;
/* 184 */                               z5 = z3;
/* 190 */                               z6 = true;
                                    }
                                } else {
/* 149 */                           if (i == iI00IioO0OiOi) {
/* 166 */                               I001IO000(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
/* 169 */                               throw null;
                                    }
/* 151 */                           i++;
/* 153 */                           z = z2;
/* 160 */                           z4 = true;
                                }
                            } else {
/* 93 */                        if (i == iI00IioO0OiOi) {
/* 111 */                           I001IO000(this, IIlIOloOOO.I000oI1ioi(cCharAt, "Unexpected symbol '", "' in numeric literal"), i, null, 4);
/* 114 */                           throw null;
                                }
/* 95 */                        i++;
/* 102 */                       z4 = true;
/* 103 */                       z5 = true;
                            }
                        }
                    } else {
/* 427 */               I001IO000(this, "EOF", 0, null, 6);
/* 541 */               throw null;
                    }
                }

                public String I0010I0i() {
/* 3 */             String str = (String) this.I0000oI00;
/* 5 */             if (str == null) {
/* 11 */                return I000lI();
                    }
/* 8 */             this.I0000oI00 = null;
/* 10 */            return str;
                }

                public String I0010o() {
                    String string;
/* 3 */             StringBuilder sb = (StringBuilder) this.I0001Ioi1lo;
/* 7 */             String str = (String) this.I000II;
/* 11 */            String str2 = (String) this.I0000oI00;
/* 14 */            if (str2 != null) {
/* 16 */                this.I0000oI00 = null;
/* 18 */                return str2;
                    }
/* 19 */            int iI00IoO0 = I00IoO0();
/* 27 */            if (iI00IoO0 >= str.length() || iI00IoO0 == -1) {
/* 150 */               I001IO000(this, "EOF", iI00IoO0, null, 4);
/* 541 */               throw null;
                    }
/* 36 */            byte bI00000oIO = iOI0IO0iio0o.I00000oIO(str.charAt(iI00IoO0));
/* 41 */            if (bI00000oIO == 1) {
/* 43 */                return I0010I0i();
                    }
/* 49 */            if (bI00000oIO != 0) {
/* 143 */               I001IO000(this, "Expected beginning of the string, but got " + str.charAt(iI00IoO0), 0, null, 6);
/* 146 */               throw null;
                    }
/* 51 */            boolean z = false;
/* 60 */            while (iOI0IO0iio0o.I00000oIO(str.charAt(iI00IoO0)) == 0) {
/* 62 */                iI00IoO0++;
/* 68 */                if (iI00IoO0 >= str.length()) {
/* 72 */                    sb.append((CharSequence) str, this.I00000oOI, iI00IoO0);
/* 75 */                    int iI00IioO0OiOi = I00IioO0OiOi(iI00IoO0);
/* 79 */                    if (iI00IioO0OiOi == -1) {
/* 81 */                        this.I00000oOI = iI00IoO0;
/* 83 */                        sb.append((CharSequence) str, 0, 0);
/* 86 */                        String string2 = sb.toString();
/* 90 */                        sb.setLength(0);
/* 93 */                        return string2;
                            }
/* 94 */                    iI00IoO0 = iI00IioO0OiOi;
/* 95 */                    z = true;
                        }
                    }
/* 97 */            int i = this.I00000oOI;
/* 99 */            if (z) {
/* 110 */               sb.append((CharSequence) str, i, iI00IoO0);
/* 113 */               String string3 = sb.toString();
/* 117 */               sb.setLength(0);
/* 120 */               string = string3;
                    } else {
/* 105 */               string = str.subSequence(i, iI00IoO0).toString();
                    }
/* 121 */           this.I00000oOI = iI00IoO0;
/* 123 */           return string;
                }

                public String I00111O() {
/* 1 */             String strI0010o = I0010o();
/* 11 */            if (!O0000Ioio00.I0000O(strI0010o, "null") || ((String) this.I000II).charAt(this.I00000oOI - 1) == '\"') {
/* 113 */               return strI0010o;
                    }
/* 35 */            I001IO000(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
/* 38 */            throw null;
                }

                public void I001IIilI0O(String str, int i, String str2) {
/* 215 */           throw new O01Io1OOi(l0I0OO0.I00000oOI(i, str, ((o00io0IiOOo0) this.I0000O).I0000Il00O(), str2, ((O01IIOOIO) this.I0000Il00O).I000OOo1O ? l0I0OO0.I0000oI00(i, (String) this.I000II).toString() : null));
                }

                public int I001i1O0Ol(int i, CharSequence charSequence) {
/* 1 */             char cCharAt = charSequence.charAt(i);
/* 7 */             if ('0' <= cCharAt && cCharAt < ':') {
/* 13 */                return cCharAt - '0';
                    }
/* 17 */            if ('a' <= cCharAt && cCharAt < 'g') {
/* 23 */                return cCharAt - 'W';
                    }
/* 28 */            if ('A' <= cCharAt && cCharAt < 'G') {
/* 34 */                return cCharAt - '7';
                    }
/* 48 */            I001IO000(this, IIlIOloOOO.I000oI1ioi(cCharAt, "Invalid toHexChar char '", "' in unicode escape"), 0, null, 6);
/* 89 */            throw null;
                }

                public ColorStateList I001i1lo1io() {
/* 3 */             IOloIIl1 iOloIIl1 = (IOloIIl1) this.I0001Ioi1lo;
/* 5 */             if (iOloIIl1 != null) {
/* 9 */                 return (ColorStateList) iOloIIl1.I0000Il00O;
                    }
/* 12 */            return null;
                }

                public PorterDuff.Mode I001iOo1i0O() {
/* 3 */             IOloIIl1 iOloIIl1 = (IOloIIl1) this.I0001Ioi1lo;
/* 5 */             if (iOloIIl1 != null) {
/* 9 */                 return (PorterDuff.Mode) iOloIIl1.I0000O;
                    }
/* 12 */            return null;
                }

                public boolean I001l0I00() {
                    return this.I00000oOI < ((List) this.I0000oI00).size() || !((ArrayList) this.I000II).isEmpty();
                }

                public void I001lIiIIo1O(AttributeSet attributeSet, int i) {
                    ColorStateList colorStateListI000II;
/* 3 */             View view = (View) this.I0000Il00O;
/* 5 */             Context context = view.getContext();
/* 9 */             int[] iArr = OOilOli0.I001iOo1i0O;
/* 11 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, iArr, i);
/* 18 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 22 */            View view2 = (View) this.I0000Il00O;
/* 24 */            Context context2 = view2.getContext();
/* 31 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 33 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 38 */            OooiO1oOi1.I00000oOI(view2, context2, iArr, attributeSet, typedArray2, i, 0);
                    try {
/* 47 */                if (typedArray.hasValue(0)) {
/* 53 */                    this.I00000oOI = typedArray.getResourceId(0, -1);
/* 57 */                    I11oo00 i11oo00 = (I11oo00) this.I0000O;
/* 59 */                    Context context3 = view.getContext();
/* 63 */                    int i2 = this.I00000oOI;
                            synchronized (i11oo00) {
/* 68 */                        colorStateListI000II = i11oo00.I00000oIO.I000II(context3, i2);
                            }
/* 73 */                    if (colorStateListI000II != null) {
/* 75 */                        I00Io1lO(colorStateListI000II);
                            }
                        }
/* 91 */                if (typedArray.hasValue(1)) {
/* 97 */                    view.setBackgroundTintList(olilOlOiII0010I0i.I000OiO(1));
                        }
/* 105 */               if (typedArray.hasValue(2)) {
/* 116 */                   view.setBackgroundTintMode(IiloO11l.I00000oIO(typedArray.getInt(2, -1), null));
                        }
/* 119 */               olilOlOiII0010I0i.I0010o();
                    } catch (Throwable th) {
/* 123 */               olilOlOiII0010I0i.I0010o();
/* 551 */               throw th;
                    }
                }

                public OI1il00IOO I001lllioOl(String str) {
                    OI1iiIoI0OOi oI1iiIoI0OOi;
/* 3 */             OllO00oiil ollO00oiil = (OllO00oiil) this.I000II;
/* 5 */             if (ollO00oiil == null || (oI1iiIoI0OOi = (OI1iiIoI0OOi) ollO00oiil.getValue()) == null) {
/* 80 */                return null;
                    }
/* 16 */            int i = OI1ilOI1ioo0.I00ilI0I1;
/* 24 */            Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
/* 32 */            Bundle bundleI0000Il00O = oI1iiIoI0OOi.I0000Il00O(uri, (LinkedHashMap) this.I0000oI00);
/* 36 */            if (bundleI0000Il00O == null) {
/* 80 */                return null;
                    }
/* 76 */            return new OI1il00IOO((OI1ilOI1ioo0) this.I0000Il00O, bundleI0000Il00O, oI1iiIoI0OOi.I000l1, IOOi0Ool1i.I00IO1oi11O(uri.getPathSegments(), Uri.parse(oI1iiIoI0OOi.I00000oIO).getPathSegments()).size(), false, -1);
                }

                public IoIIoloIoOI0 I001lloI(long j) {
/* 4 */             if (this.I00000oOI == 4) {
/* 7 */                 this.I00000oOI = 5;
/* 11 */                return new IoIIoloIoOI0(this, j);
                    }
/* 19 */            OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 22 */            return null;
                }

                public void I00II0Ol1O0l() {
/* 2 */             this.I00000oOI = -1;
/* 5 */             I00Io1lO(null);
/* 8 */             I000OiO();
                }

                public void I00II0oii1o(int i) {
                    ColorStateList colorStateListI000II;
/* 1 */             this.I00000oOI = i;
/* 5 */             I11oo00 i11oo00 = (I11oo00) this.I0000O;
/* 7 */             if (i11oo00 != null) {
/* 13 */                Context context = ((View) this.I0000Il00O).getContext();
                        synchronized (i11oo00) {
/* 20 */                    colorStateListI000II = i11oo00.I00000oIO.I000II(context, i);
                        }
                    } else {
/* 29 */                colorStateListI000II = null;
                    }
/* 30 */            I00Io1lO(colorStateListI000II);
/* 33 */            I000OiO();
                }

                public String I00IO1(String str, boolean z) {
/* 1 */             int i = this.I00000oOI;
                    try {
/* 9 */                 if (I000o00OoI0I() == 6 && O0000Ioio00.I0000O(I00IOO(z), str)) {
/* 27 */                    this.I0000oI00 = null;
/* 34 */                    if (I000o00OoI0I() == 5) {
/* 37 */                        return I00IOO(z);
                            }
                        }
/* 3 */                 return null;
                    } finally {
/* 47 */                this.I00000oOI = i;
/* 49 */                this.I0000oI00 = null;
                    }
                }

                public byte I00IO1oi11O() {
/* 3 */             String str = (String) this.I000II;
/* 5 */             int i = this.I00000oOI;
                    while (true) {
/* 7 */                 int iI00IioO0OiOi = I00IioO0OiOi(i);
/* 14 */                if (iI00IioO0OiOi == -1) {
/* 44 */                    this.I00000oOI = iI00IioO0OiOi;
/* 12 */                    return (byte) 10;
                        }
/* 16 */                char cCharAt = str.charAt(iI00IioO0OiOi);
/* 22 */                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
/* 34 */                    this.I00000oOI = iI00IioO0OiOi;
/* 36 */                    return iOI0IO0iio0o.I00000oIO(cCharAt);
                        }
/* 41 */                i = iI00IioO0OiOi + 1;
                    }
                }

                public String I00IOO(boolean z) {
                    String strI0010I0i;
/* 1 */             byte bI00IO1oi11O = I00IO1oi11O();
/* 6 */             if (z) {
/* 8 */                 if (bI00IO1oi11O != 1 && bI00IO1oi11O != 0) {
/* 20 */                    return null;
                        }
/* 13 */                strI0010I0i = I0010o();
                    } else {
/* 18 */                if (bI00IO1oi11O != 1) {
/* 20 */                    return null;
                        }
/* 22 */                strI0010I0i = I0010I0i();
                    }
/* 26 */            this.I0000oI00 = strI0010I0i;
/* 49 */            return strI0010I0i;
                }

                public int I00IioO0OiOi(int i) {
/* 9 */             if (i < ((String) this.I000II).length()) {
/* 11 */                return i;
                    }
/* 12 */            return -1;
                }

                public void I00IlilI0i0i(IoI1O1i1 ioI1O1i1) {
/* 5 */             int iI001l0I00 = I1IoiO1l.I001l0I00((IoI1O1i1[]) this.I0000Il00O, ioI1O1i1);
/* 9 */             if (iI001l0I00 >= 0) {
/* 13 */                IoI1O1i1[] ioI1O1i1Arr = (IoI1O1i1[]) this.I0000Il00O;
/* 15 */                int i = iI001l0I00 + 1;
/* 19 */                I1IoiO1l.I000iOII(ioI1O1i1Arr, iI001l0I00, ioI1O1i1Arr, i, this.I00000oOI);
/* 24 */                IoI1O1i1[] ioI1O1i1Arr2 = (IoI1O1i1[]) this.I0000Il00O;
/* 26 */                int i2 = this.I00000oOI;
/* 31 */                ioI1O1i1Arr2[i2 - 1] = null;
/* 35 */                float[] fArr = (float[]) this.I0000O;
/* 38 */                System.arraycopy(fArr, i, fArr, iI001l0I00, i2 - i);
/* 43 */                byte[] bArr = (byte[]) this.I0000oI00;
/* 47 */                I1IoiO1l.I000OOo1O(bArr, iI001l0I00, bArr, i, this.I00000oOI);
                        this.I00000oOI--;
                    }
                }

                public void I00Io1lO(ColorStateList colorStateList) {
/* 1 */             if (colorStateList != null) {
/* 5 */                 IOloIIl1 iOloIIl1 = (IOloIIl1) this.I0000oI00;
/* 7 */                 if (iOloIIl1 == null) {
/* 11 */                    iOloIIl1 = new IOloIIl1();
/* 14 */                    this.I0000oI00 = iOloIIl1;
                        }
/* 16 */                iOloIIl1.I0000Il00O = colorStateList;
/* 19 */                iOloIIl1.I00000oOI = true;
                    } else {
/* 23 */                this.I0000oI00 = null;
                    }
/* 25 */            I000OiO();
                }

                public void I00Io1o110i(ColorStateList colorStateList) {
/* 3 */             IOloIIl1 iOloIIl1 = (IOloIIl1) this.I0001Ioi1lo;
/* 5 */             if (iOloIIl1 == null) {
/* 9 */                 iOloIIl1 = new IOloIIl1();
/* 12 */                this.I0001Ioi1lo = iOloIIl1;
                    }
/* 14 */            iOloIIl1.I0000Il00O = colorStateList;
/* 17 */            iOloIIl1.I00000oOI = true;
/* 19 */            I000OiO();
                }

                public void I00IoIO0lI(PorterDuff.Mode mode) {
/* 3 */             IOloIIl1 iOloIIl1 = (IOloIIl1) this.I0001Ioi1lo;
/* 5 */             if (iOloIIl1 == null) {
/* 9 */                 iOloIIl1 = new IOloIIl1();
/* 12 */                this.I0001Ioi1lo = iOloIIl1;
                    }
/* 14 */            iOloIIl1.I0000O = mode;
/* 17 */            iOloIIl1.I00000oIO = true;
/* 19 */            I000OiO();
                }

                public int I00IoO0() {
                    char cCharAt;
/* 1 */             int i = this.I00000oOI;
/* 4 */             if (i == -1) {
/* 6 */                 return i;
                    }
/* 9 */             String str = (String) this.I000II;
/* 15 */            while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
/* 37 */                i++;
                    }
/* 40 */            this.I00000oOI = i;
/* 113 */           return i;
                }

                public boolean I00IoiI() {
/* 1 */             int iI00IoO0 = I00IoO0();
/* 7 */             String str = (String) this.I000II;
/* 14 */            if (iI00IoO0 >= str.length() || iI00IoO0 == -1 || str.charAt(iI00IoO0) != ',') {
/* 13 */                return false;
                    }
                    this.I00000oOI++;
/* 30 */            return true;
                }

                public void I00Iooi00oi(char c) {
/* 3 */             String str = (String) this.I000II;
/* 5 */             int i = this.I00000oOI;
/* 8 */             if (i > 0 && c == '\"') {
                        try {
/* 16 */                    this.I00000oOI = i - 1;
/* 18 */                    String strI0010o = I0010o();
/* 22 */                    this.I00000oOI = i;
/* 30 */                    if (O0000Ioio00.I0000O(strI0010o, "null")) {
/* 41 */                        I001IIilI0O("Expected string literal but 'null' literal was found", this.I00000oOI - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
/* 44 */                        throw null;
                            }
                        } catch (Throwable th) {
/* 46 */                    this.I00000oOI = i;
/* 48 */                    throw th;
                        }
                    }
/* 53 */            String strI00000oOI = iOI0IO0iio0o.I00000oOI(iOI0IO0iio0o.I00000oIO(c));
/* 57 */            int i2 = this.I00000oOI;
/* 64 */            int i3 = i2 > 0 ? i2 - 1 : i2;
/* 96 */            I001IO000(this, Oi010OO0.I001IO000("Expected ", strI00000oOI, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
/* 186 */           throw null;
                }

                public void I00O0i0ii(Io1Io0OOi011 io1Io0OOi011, String str) {
/* 3 */             IIIIiol iIIIiol = (IIIIiol) this.I0001Ioi1lo;
/* 7 */             if (this.I00000oOI != 0) {
/* 64 */                OIiilo1Ool0o.I00000oOI(this.I00000oOI, "state: ");
/* 89 */                return;
                    }
/* 15 */            iIIIiol.I00OilO00Il(str).I00OilO00Il("\r\n");
/* 18 */            int size = io1Io0OOi011.size();
/* 23 */            for (int i = 0; i < size; i++) {
/* 47 */                iIIIiol.I00OilO00Il(io1Io0OOi011.I0000O(i)).I00OilO00Il(": ").I00OilO00Il(io1Io0OOi011.I000OiO(i)).I00OilO00Il("\r\n");
                    }
/* 53 */            iIIIiol.I00OilO00Il("\r\n");
/* 57 */            this.I00000oOI = 1;
                }

                @Override
                public void cancel() throws IOException {
/* 5 */             Socket socket = ((OOll1O) this.I0000O).I00000oOI;
/* 7 */             if (socket != null) {
/* 9 */                 OollIoI001lo.I0000oI00(socket);
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 5:
/* 15 */                    StringBuilder sb = new StringBuilder("JsonReader(source='");
/* 22 */                    sb.append(this.I000II);
/* 27 */                    sb.append("', currentPosition=");
/* 34 */                    return Oi010OO0.I001i1lo1io(sb, this.I00000oOI, ')');
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 52 */        public I11l01l(View view) {
                    this.I00000oIO = 0;
/* 54 */            this.I00000oOI = -1;
/* 55 */            this.I0000Il00O = view;
/* 56 */            this.I0000O = I11oo00.I00000oIO();
                }

/* 56 */        public I11l01l(OIOlo0OloOi oIOlo0OloOi, OOll1O oOll1O, OOliO0 oOliO0, OOliIlo01o oOliIlo01o) {
                    this.I00000oIO = 1;
/* 58 */            this.I0000Il00O = oIOlo0OloOi;
/* 59 */            this.I0000O = oOll1O;
/* 60 */            this.I0000oI00 = oOliO0;
/* 61 */            this.I0001Ioi1lo = oOliIlo01o;
/* 63 */            Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(0);
                    io1OIO1l0o.I00iiO = oOliO0;
/* 64 */            io1OIO1l0o.I00iiI = 262144L;
/* 65 */            VarHandle.storeStoreFence();
                    this.I000II = io1OIO1l0o;
                }

/* 65 */        public I11l01l(int i) {
/* 66 */            this.I00000oIO = i;
                }

/* 66 */        public I11l01l() {
                    this.I00000oIO = 4;
/* 68 */            this.I0000Il00O = new IoI1O1i1[32];
/* 69 */            this.I0000O = new float[32];
/* 70 */            this.I0000oI00 = new byte[32];
/* 71 */            OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 73 */            this.I0001Ioi1lo = new OI10IIO();
/* 75 */            this.I000II = new OI10IIO();
                }
            }
