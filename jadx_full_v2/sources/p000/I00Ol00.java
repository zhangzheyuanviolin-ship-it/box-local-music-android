            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.graphics.PorterDuff;
            import android.graphics.Shader;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.Xml;
            import android.widget.ImageView;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.nio.BufferUnderflowException;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            import org.xmlpull.v1.XmlPullParserException;
            
/* 250 */   public final class I00Ol00 implements lOoIoI1Ioii, loII0oIOI1i1, loO1lOoI0oOi, loOIiioiOool, loioOil {
                public final int I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[LOOP:1: B:27:0x00cd->B:33:0x00ef, LOOP_END] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public I00Ol00(IooO11l iooO11l, l0olooIII0o l0olooiii0o) {
                    Object ii1ooo;
/* 3 */             this.I00000oIO = 9;
/* 8 */             I00Ol00 i00Ol00I00000oOI = l0olooiii0o.I00000oOI();
/* 12 */            int i = iooO11l.I00iOIl;
/* 14 */            if (i < 0) {
/* 19 */                Ioll0IliO1l.I0000Il00O("negative nearestRange.first");
                    }
/* 28 */            int iMin = Math.min(iooO11l.I00iiI, i00Ol00I00000oOI.I00000oOI - 1);
/* 32 */            if (iMin < i) {
/* 36 */                this.I0000Il00O = OIOi1iO01.I00000oIO;
/* 41 */                this.I0000O = new Object[0];
/* 43 */                this.I00000oOI = 0;
/* 332 */               return;
                    }
/* 49 */            int i2 = (iMin - i) + 1;
/* 53 */            this.I0000O = new Object[i2];
/* 55 */            this.I00000oOI = i;
/* 59 */            OI0o11I1 oI0o11I1 = new OI0o11I1(i2);
/* 64 */            OI110O0 oi110o0 = (OI110O0) i00Ol00I00000oOI.I0000Il00O;
/* 70 */            if (i < 0 || i >= i00Ol00I00000oOI.I00000oOI) {
/* 97 */                Ioll0IliO1l.I0000oI00("Index " + i + ", size " + i00Ol00I00000oOI.I00000oOI);
                    }
/* 100 */           if (iMin < 0 || iMin >= i00Ol00I00000oOI.I00000oOI) {
/* 127 */               Ioll0IliO1l.I0000oI00("Index " + iMin + ", size " + i00Ol00I00000oOI.I00000oOI);
                    }
/* 130 */           if (iMin < i) {
/* 160 */               Ioll0IliO1l.I00000oIO("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
                    }
/* 163 */           int iI00000oIO = l00OlOI.I00000oIO(i, oi110o0);
/* 173 */           int i3 = ((Iooo1oIo) oi110o0.I00iOIl[iI00000oIO]).I00000oIO;
/* 175 */           while (i3 <= iMin) {
/* 181 */               Iooo1oIo iooo1oIo = (Iooo1oIo) oi110o0.I00iOIl[iI00000oIO];
/* 185 */               Function1 key = iooo1oIo.I0000Il00O.getKey();
/* 189 */               int i4 = iooo1oIo.I00000oIO;
/* 191 */               int iMax = Math.max(i, i4);
/* 200 */               int iMin2 = Math.min(iMin, (iooo1oIo.I00000oOI + i4) - 1);
/* 204 */               if (iMax <= iMin2) {
                            while (true) {
/* 206 */                       if (key == null) {
/* 222 */                           ii1ooo = new Ii1ooo(iMax);
/* 225 */                           oI0o11I1.I000II(iMax, ii1ooo);
/* 236 */                           ((Object[]) this.I0000O)[iMax - this.I00000oOI] = ii1ooo;
/* 240 */                           iMax = iMax == iMin2 ? iMax + 1 : iMax;
                                } else {
/* 214 */                           ii1ooo = key.invoke(Integer.valueOf(iMax - i4));
/* 218 */                           if (ii1ooo == null) {
                                    }
/* 225 */                           oI0o11I1.I000II(iMax, ii1ooo);
/* 236 */                           ((Object[]) this.I0000O)[iMax - this.I00000oOI] = ii1ooo;
/* 240 */                           if (iMax == iMin2) {
                                        break;
                                    }
                                }
                            }
                        }
/* 245 */               i3 += iooo1oIo.I00000oOI;
/* 246 */               iI00000oIO++;
                    }
/* 249 */           this.I0000Il00O = oI0o11I1;
                }

                public static final I00Ol00 I0000O(O1ii0l1iii o1ii0l1iii, String str) {
/* 1 */             Charset charset = IO1IOI.I00000oIO;
/* 3 */             if (o1ii0l1iii != null) {
/* 5 */                 Pattern pattern = O1ii0l1iii.I0000Il00O;
/* 8 */                 Charset charsetI00000oIO = o1ii0l1iii.I00000oIO(null);
/* 12 */                if (charsetI00000oIO == null) {
                            try {
/* 31 */                        o1ii0l1iii = l1IiOI.I00000oIO(o1ii0l1iii + "; charset=utf-8");
                            } catch (IllegalArgumentException unused) {
/* 36 */                        o1ii0l1iii = null;
                            }
                        } else {
/* 38 */                    charset = charsetI00000oIO;
                        }
                    }
/* 39 */            byte[] bytes = str.getBytes(charset);
/* 43 */            int length = bytes.length;
/* 49 */            OollIoI001lo.I0000Il00O(bytes.length, 0L, length);
/* 57 */            I00Ol00 i00Ol00 = new I00Ol00(11, (short) 0);
/* 60 */            i00Ol00.I0000Il00O = o1ii0l1iii;
/* 62 */            i00Ol00.I00000oOI = length;
/* 64 */            i00Ol00.I0000O = bytes;
/* 66 */            VarHandle.storeStoreFence();
/* 106 */           return i00Ol00;
                }

                /* JADX WARN: Code restructure failed: missing block: B:100:0x021e, code lost:
                
                    if (r20 == false) goto L102;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0220, code lost:
                
                    r0 = new p000.IoloOio0I(r1);
                    r0.I00iiI = new int[]{r6, r9, r5};
                    r0.I00iiO = new float[]{0.0f, 0.5f, 1.0f};
                    java.lang.invoke.VarHandle.storeStoreFence();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x0237, code lost:
                
                    r0 = new p000.IoloOio0I(r1);
                    r0.I00iiI = new int[]{r6, r5};
                    r15 = 2;
                    r0.I00iiO = new float[]{0.0f, 1.0f};
                    java.lang.invoke.VarHandle.storeStoreFence();
                    r14 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x024e, code lost:
                
                    if (r12 == r14) goto L114;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0250, code lost:
                
                    if (r12 == r15) goto L113;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:105:0x0252, code lost:
                
                    r17 = (int[]) r0.I00iiI;
                    r18 = (float[]) r0.I00iiO;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x0260, code lost:
                
                    if (r13 == r14) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x0262, code lost:
                
                    if (r13 == r15) goto L110;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x0264, code lost:
                
                    r0 = android.graphics.Shader.TileMode.CLAMP;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:110:0x026f, code lost:
                
                    r0 = android.graphics.Shader.TileMode.MIRROR;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x0272, code lost:
                
                    r0 = android.graphics.Shader.TileMode.REPEAT;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x0275, code lost:
                
                    r12 = new android.graphics.LinearGradient(r22, r25, r26, r16, r17, r18, r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x0279, code lost:
                
                    r12 = new android.graphics.SweepGradient(r8, r10, (int[]) r0.I00iiI, (float[]) r0.I00iiO);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:115:0x028b, code lost:
                
                    if (r24 <= 0.0f) goto L127;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x028d, code lost:
                
                    r1 = (int[]) r0.I00iiI;
                    r22 = (float[]) r0.I00iiO;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:117:0x029a, code lost:
                
                    if (r13 == 1) goto L123;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x029d, code lost:
                
                    if (r13 == 2) goto L122;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:120:0x029f, code lost:
                
                    r0 = android.graphics.Shader.TileMode.CLAMP;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:122:0x02ac, code lost:
                
                    r0 = android.graphics.Shader.TileMode.MIRROR;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:123:0x02af, code lost:
                
                    r0 = android.graphics.Shader.TileMode.REPEAT;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x02b2, code lost:
                
                    r12 = new android.graphics.RadialGradient(r8, r10, r24, r1, r22, r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x02bf, code lost:
                
                    return new p000.I00Ol00(r12, 0, 6, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:128:0x02c7, code lost:
                
                    throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x01d5, code lost:
                
                    r1 = 14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
                
                    if (r11.size() <= 0) goto L97;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
                
                    r0 = new p000.IoloOio0I(r1);
                    r2 = r11.size();
                    r0.I00iiI = new int[r2];
                    r0.I00iiO = new float[r2];
                    r3 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x01ef, code lost:
                
                    if (r3 >= r2) goto L144;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x01f1, code lost:
                
                    ((int[]) r0.I00iiI)[r3] = ((java.lang.Integer) r11.get(r3)).intValue();
                    ((float[]) r0.I00iiO)[r3] = ((java.lang.Float) r7.get(r3)).floatValue();
                    r3 = r3 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x0214, code lost:
                
                    java.lang.invoke.VarHandle.storeStoreFence();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x0218, code lost:
                
                    r0 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:98:0x0219, code lost:
                
                    if (r0 == null) goto L100;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x021b, code lost:
                
                    r14 = 1;
                    r15 = 2;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static I00Ol00 I0000oI00(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    int next;
                    float f;
                    int i2;
                    float f2;
/* 5 */             XmlResourceParser xml = resources.getXml(i);
/* 9 */             AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
/* 21 */            do {
/* 13 */                next = xml.next();
/* 19 */                if (next == 2) {
                            break;
                        }
/* 21 */            } while (next != 1);
/* 24 */            if (next != 2) {
/* 752 */               throw new XmlPullParserException("No start tag found");
                    }
/* 26 */            String name = xml.getName();
/* 30 */            name.getClass();
/* 39 */            int i3 = 6;
/* 40 */            Object obj = null;
/* 41 */            if (!name.equals("gradient")) {
/* 49 */                if (name.equals("selector")) {
/* 51 */                    ColorStateList colorStateListI00000oOI = IOOlOlo.I00000oOI(resources, xml, attributeSetAsAttributeSet, theme);
/* 61 */                    return new I00Ol00(obj, colorStateListI00000oOI.getDefaultColor(), i3, colorStateListI00000oOI);
                        }
/* 94 */                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                    }
/* 95 */            String name2 = xml.getName();
/* 103 */           if (!name2.equals("gradient")) {
/* 744 */               throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                    }
/* 107 */           TypedArray typedArrayI0000O = lOollIIio1O.I0000O(resources, theme, attributeSetAsAttributeSet, OOilIO.I0000oI00);
/* 130 */           float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayI0000O.getFloat(8, 0.0f) : 0.0f;
/* 147 */           float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayI0000O.getFloat(9, 0.0f) : 0.0f;
/* 164 */           float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayI0000O.getFloat(10, 0.0f) : 0.0f;
/* 182 */           float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayI0000O.getFloat(11, 0.0f) : 0.0f;
/* 198 */           float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayI0000O.getFloat(3, 0.0f) : 0.0f;
/* 213 */           float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayI0000O.getFloat(4, 0.0f) : 0.0f;
/* 228 */           int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayI0000O.getInt(2, 0) : 0;
/* 242 */           int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayI0000O.getColor(0, 0) : 0;
/* 254 */           boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
/* 268 */           int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayI0000O.getColor(7, 0) : 0;
/* 285 */           int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayI0000O.getColor(1, 0) : 0;
/* 292 */           if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
/* 294 */               f = f3;
/* 298 */               i2 = typedArrayI0000O.getInt(6, 0);
                    } else {
/* 305 */               f = f3;
/* 307 */               i2 = 0;
                    }
/* 324 */           float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayI0000O.getFloat(5, 0.0f) : 0.0f;
/* 325 */           typedArrayI0000O.recycle();
/* 333 */           int depth = xml.getDepth() + 1;
/* 340 */           ArrayList arrayList = new ArrayList(20);
/* 343 */           float f10 = f9;
/* 347 */           ArrayList arrayList2 = new ArrayList(20);
                    while (true) {
/* 350 */               int next2 = xml.next();
/* 354 */               float f11 = f4;
/* 357 */               if (next2 == 1) {
/* 468 */                   f2 = f5;
                            break;
                        }
/* 359 */               int depth2 = xml.getDepth();
/* 363 */               f2 = f5;
/* 365 */               if (depth2 < depth && next2 == 3) {
                            break;
                        }
/* 371 */               if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
/* 395 */                   TypedArray typedArrayI0000O2 = lOollIIio1O.I0000O(resources, theme, attributeSetAsAttributeSet, OOilIO.I0001Ioi1lo);
/* 400 */                   boolean zHasValue = typedArrayI0000O2.hasValue(0);
/* 405 */                   boolean zHasValue2 = typedArrayI0000O2.hasValue(1);
/* 409 */                   if (!zHasValue || !zHasValue2) {
                                break;
                            }
/* 414 */                   int color4 = typedArrayI0000O2.getColor(0, 0);
/* 419 */                   float f12 = typedArrayI0000O2.getFloat(1, 0.0f);
/* 423 */                   typedArrayI0000O2.recycle();
/* 430 */                   arrayList2.add(Integer.valueOf(color4));
/* 437 */                   arrayList.add(Float.valueOf(f12));
                        }
/* 373 */               f4 = f11;
/* 375 */               f5 = f2;
                    }
/* 467 */           throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }

                public void I00000oIO(int i, O0lOiiillOlo o0lOiiillOlo) {
/* 1 */             if (i < 0) {
/* 6 */                 Ioll0IliO1l.I00000oIO("size should be >=0");
                    }
/* 9 */             if (i == 0) {
/* 11 */                return;
                    }
/* 14 */            int i2 = this.I00000oOI;
/* 16 */            Iooo1oIo iooo1oIo = new Iooo1oIo();
/* 19 */            iooo1oIo.I00000oIO = i2;
/* 21 */            iooo1oIo.I00000oOI = i;
/* 23 */            iooo1oIo.I0000Il00O = o0lOiiillOlo;
/* 25 */            if (i2 < 0) {
/* 30 */                Ioll0IliO1l.I00000oIO("startIndex should be >= 0");
                    }
/* 33 */            if (i <= 0) {
/* 41 */                Ioll0IliO1l.I00000oIO("size should be > 0");
                    }
/* 35 */            VarHandle.storeStoreFence();
                    this.I00000oOI += i;
/* 54 */            ((OI110O0) this.I0000Il00O).I00000oOI(iooo1oIo);
                }

                public void I00000oOI() {
                    IOloIIl1 iOloIIl1;
/* 3 */             ImageView imageView = (ImageView) this.I0000Il00O;
/* 5 */             Drawable drawable = imageView.getDrawable();
/* 9 */             if (drawable != null) {
/* 11 */                int i = IiloO11l.I00000oIO;
                    }
/* 13 */            if (drawable == null || (iOloIIl1 = (IOloIIl1) this.I0000O) == null) {
/* 55 */                return;
                    }
/* 21 */            int[] drawableState = imageView.getDrawableState();
/* 25 */            PorterDuff.Mode mode = I11oo00.I00000oOI;
/* 27 */            Oi0loIIIoI.I000OOo1O(drawable, iOloIIl1, drawableState);
                }

                public OOoli1l I0000Il00O(boolean z) {
                    Ioilo1l ioilo1l;
                    Ioilo1l ioilo1l2;
/* 1 */             if (z && (ioilo1l2 = (Ioilo1l) this.I0000O) != null) {
/* 14 */                throw ioilo1l2.I00000oIO();
                    }
/* 21 */            OOoli1l oOoli1lI00000oIO = OOoli1l.I00000oIO(this.I00000oOI, (Object[]) this.I0000Il00O, this);
/* 25 */            if (!z || (ioilo1l = (Ioilo1l) this.I0000O) == null) {
/* 77 */                return oOoli1lI00000oIO;
                    }
/* 38 */            throw ioilo1l.I00000oIO();
                }

                public Iooo1oIo I0001Ioi1lo(int i) {
/* 1 */             if (i < 0 || i >= this.I00000oOI) {
/* 32 */                Ioll0IliO1l.I0000oI00("Index " + i + ", size " + this.I00000oOI);
                    }
/* 37 */            Iooo1oIo iooo1oIo = (Iooo1oIo) this.I0000O;
/* 39 */            if (iooo1oIo != null) {
/* 41 */                int i2 = iooo1oIo.I00000oIO;
/* 46 */                if (i < iooo1oIo.I00000oOI + i2 && i2 <= i) {
/* 50 */                    return iooo1oIo;
                        }
                    }
/* 53 */            OI110O0 oi110o0 = (OI110O0) this.I0000Il00O;
/* 63 */            Iooo1oIo iooo1oIo2 = (Iooo1oIo) oi110o0.I00iOIl[l00OlOI.I00000oIO(i, oi110o0)];
/* 65 */            this.I0000O = iooo1oIo2;
/* 77 */            return iooo1oIo2;
                }

                public char I000II() throws IOException {
                    try {
/* 9 */                 return (char) ((ByteBuffer) this.I0000Il00O).get();
                    } catch (BufferUnderflowException unused) {
/* 13 */                IioIoO10iOiI.I000OOo1O("Premature end of buffer reached");
/* 16 */                return (char) 0;
                    }
                }

                public int I000O01llI0(Object obj) {
/* 3 */             OI0o11I1 oI0o11I1 = (OI0o11I1) this.I0000Il00O;
/* 5 */             int iI0000O = oI0o11I1.I0000O(obj);
/* 9 */             if (iI0000O >= 0) {
/* 13 */                return oI0o11I1.I0000Il00O[iI0000O];
                    }
/* 16 */            return -1;
                }

                public Object I000OOo1O(int i) {
/* 3 */             Object[] objArr = (Object[]) this.I0000O;
/* 7 */             int i2 = i - this.I00000oOI;
/* 8 */             if (i2 < 0 || i2 >= objArr.length) {
/* 16 */                return null;
                    }
/* 13 */            return objArr[i2];
                }

                public boolean I000OiO(Object obj) {
/* 3 */             IlO1Oi1 ilO1Oi1 = (IlO1Oi1) this.I0000O;
                    return ((((Number) ((O0Io0Io) this.I0000Il00O).get(obj)).intValue() >>> ilO1Oi1.I00000oIO) & ((1 << ilO1Oi1.I00000oOI) - 1)) == ilO1Oi1.I0000Il00O;
                }

                public I00IO1oi11O I000iOII(int i) throws IOException {
                    I00Ol1ll1 ii1011OI;
/* 3 */             byte[][] bArr = (byte[][]) this.I0000O;
/* 5 */             int i2 = this.I00000oOI;
/* 9 */             O0olI000 o0olI000 = (O0olI000) this.I0000Il00O;
/* 13 */            boolean z = false;
/* 14 */            if (o0olI000 instanceof Iol0Il) {
/* 17 */                Iol0Il iol0Il = (Iol0Il) o0olI000;
/* 19 */                iol0Il.I00ilO0 = false;
/* 21 */                iol0Il.I0000Il00O();
                    }
/* 24 */            int iI00100l0 = I00Io1o110i.I00100l0(o0olI000, i);
/* 28 */            int i3 = 1;
/* 36 */            int i4 = 4;
/* 37 */            int i5 = 3;
/* 52 */            int iI000O01llI0 = I00Io1o110i.I000O01llI0(o0olI000, i2, iI00100l0 == 3 || iI00100l0 == 4 || iI00100l0 == 16 || iI00100l0 == 17 || iI00100l0 == 8);
/* 59 */            if (iI000O01llI0 < 0) {
/* 63 */                if ((i & 32) == 0) {
/* 149 */                   IioIoO10iOiI.I000OOo1O("indefinite-length primitive encoding encountered");
/* 56 */                    return null;
                        }
/* 72 */                I00Ol00 i00Ol00 = new I00Ol00(new Iol0Il(o0olI000, i2), i2, bArr);
/* 75 */                int i6 = i & 192;
/* 77 */                if (i6 != 0) {
                            return 64 == i6 ? new I1lio0oiO1(64, iI00100l0, i00Ol00) : new I1lll1Ii(i6, iI00100l0, i00Ol00);
                        }
/* 93 */                if (iI00100l0 == 3) {
/* 143 */                   return new I1lioiiOooli(i00Ol00);
                        }
/* 95 */                if (iI00100l0 == 4) {
/* 137 */                   return new I1ll1oI(i00Ol00);
                        }
/* 97 */                if (iI00100l0 == 8) {
/* 131 */                   return new I1llOOI(i00Ol00);
                        }
/* 99 */                if (iI00100l0 == 16) {
/* 123 */                   I1llOOI i1llOOI = new I1llOOI((int) (z ? 1 : 0));
/* 126 */                   i1llOOI.I00iiI = i00Ol00;
/* 128 */                   return i1llOOI;
                        }
/* 101 */               if (iI00100l0 != 17) {
/* 117 */                   I000II.I000l1("unknown BER object encountered: 0x", Integer.toHexString(iI00100l0));
/* 56 */                    return null;
                        }
/* 105 */               I1llOOI i1llOOI2 = new I1llOOI(i3);
/* 108 */               i1llOOI2.I00iiI = i00Ol00;
/* 110 */               return i1llOOI2;
                    }
/* 155 */           IiIiIOo iiIiIOo = new IiIiIOo(o0olI000, iI000O01llI0, i2);
/* 160 */           if ((i & 224) == 0) {
/* 162 */               if (iI00100l0 == 3) {
/* 221 */                   Ii101ioOoI ii101ioOoI = new Ii101ioOoI();
/* 224 */                   ii101ioOoI.I00iiI = 0;
/* 226 */                   ii101ioOoI.I00iOIl = iiIiIOo;
/* 228 */                   VarHandle.storeStoreFence();
/* 231 */                   return ii101ioOoI;
                        }
/* 164 */               if (iI00100l0 == 4) {
/* 213 */                   I1ll1oI i1ll1oI = new I1ll1oI();
/* 216 */                   i1ll1oI.I00iiI = iiIiIOo;
/* 218 */                   return i1ll1oI;
                        }
/* 166 */               if (iI00100l0 == 8) {
/* 210 */                   throw new I00IlilI0i0i("externals must use constructed encoding (see X.690 8.18)", 0);
                        }
/* 168 */               if (iI00100l0 == 16) {
/* 202 */                   throw new I00IlilI0i0i("sets must use constructed encoding (see X.690 8.11.1/8.12.1)", 0);
                        }
/* 170 */               if (iI00100l0 == 17) {
/* 194 */                   throw new I00IlilI0i0i("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)", 0);
                        }
                        try {
/* 172 */                   return I00Io1o110i.I0000Il00O(iI00100l0, iiIiIOo, bArr);
                        } catch (IllegalArgumentException e) {
/* 186 */                   throw new I00IlilI0i0i("corrupted stream detected", e, 0);
                        }
                    }
/* 236 */           I00Ol00 i00Ol002 = new I00Ol00(iiIiIOo, iiIiIOo.I00iiI, bArr);
/* 240 */           int i7 = i & 192;
/* 242 */           if (i7 != 0) {
/* 246 */               boolean z2 = (i & 32) != 0;
/* 249 */               if (64 != i7) {
/* 291 */                   Ii10IOolO1i1 ii10IOolO1i1 = new Ii10IOolO1i1(i7, iI00100l0, i00Ol002);
/* 294 */                   ii10IOolO1i1.I00iio = z2;
/* 296 */                   VarHandle.storeStoreFence();
/* 299 */                   return ii10IOolO1i1;
                        }
/* 251 */               if (z2) {
/* 282 */                   ii1011OI = I00Ol1ll1.I001i1O0Ol(i7, iI00100l0, i00Ol002.I001IO000());
                        } else {
/* 265 */                   I1lliI1o0l i1lliI1o0l = new I1lliI1o0l(i4, i7, iI00100l0, new Ii0oii1lIil(iiIiIOo.I0000Il00O()), 2);
                            ii1011OI = i1lliI1o0l;
/* 268 */                   if (i7 == 64) {
/* 273 */                       ii1011OI = new Ii1011OI(i1lliI1o0l);
                            }
                        }
/* 286 */               return (Ii1011OI) ii1011OI;
                    }
/* 300 */           if (iI00100l0 == 3) {
/* 351 */               return new I1lioiiOooli(i00Ol002);
                    }
/* 302 */           if (iI00100l0 == 4) {
/* 345 */               return new I1ll1oI(i00Ol002);
                    }
/* 304 */           if (iI00100l0 == 8) {
/* 339 */               return new I1llOOI(i00Ol002);
                    }
/* 306 */           if (iI00100l0 == 16) {
/* 331 */               I1llOOI i1llOOI3 = new I1llOOI(i5);
/* 334 */               i1llOOI3.I00iiI = i00Ol002;
/* 336 */               return i1llOOI3;
                    }
/* 308 */           if (iI00100l0 != 17) {
/* 325 */               I000II.I000l1("unknown DL object encountered: 0x", Integer.toHexString(iI00100l0));
/* 56 */                return null;
                    }
/* 313 */           I1llOOI i1llOOI4 = new I1llOOI(4);
/* 316 */           i1llOOI4.I00iiI = i00Ol002;
/* 318 */           return i1llOOI4;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int I000l1(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
/* 10 */            int i8 = i & 33554431;
/* 14 */            long[] jArr = (long[]) this.I0000Il00O;
/* 16 */            int i9 = this.I00000oOI;
/* 18 */            int i10 = i9 + 3;
/* 20 */            this.I00000oOI = i10;
/* 22 */            int length = jArr.length;
/* 23 */            if (length <= i10) {
/* 27 */                int iMax = Math.max(length * 2, i10);
/* 35 */                this.I0000Il00O = Arrays.copyOf(jArr, iMax);
/* 45 */                this.I0000O = Arrays.copyOf((long[]) this.I0000O, iMax);
                    }
/* 49 */            long[] jArr2 = (long[]) this.I0000Il00O;
/* 67 */            jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
/* 81 */            jArr2[i9 + 1] = (i4 << 32) | (i5 & 4294967295L);
/* 120 */           int i11 = i6 & 33554431;
/* 131 */           jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i11 << 25) | (i & 33554431);
/* 134 */           if (i6 == -1) {
/* 136 */               return i9;
                    }
/* 146 */           if ((i7 != -4) == false) {
/* 165 */               IolioOO1.I0000Il00O("Inserted child " + i8 + " without valid parent index");
                    }
/* 168 */           int i12 = i7 + 2;
/* 170 */           long j = jArr2[i12];
/* 177 */           if (!((33554431 & ((int) j)) == i11)) {
/* 204 */               IolioOO1.I0000Il00O("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
                    }
/* 211 */           int i13 = OOo0OIiO10o1.I00000oOI;
/* 227 */           jArr2[i12] = ((-1151795604700004353L) & j) | (Math.min((i9 - i7) / 3, 1023) << 50);
/* 2739 */          return i9;
                }

                public boolean I000lI() {
                    ColorStateList colorStateList;
                    return ((Shader) this.I0000Il00O) == null && (colorStateList = (ColorStateList) this.I0000O) != null && colorStateList.isStateful();
                }

                public void I000o00OoI0I(AttributeSet attributeSet, int i) {
                    int resourceId;
/* 4 */             ImageView imageView = (ImageView) this.I0000Il00O;
/* 6 */             Context context = imageView.getContext();
/* 10 */            int[] iArr = OOilOli0.I0001Ioi1lo;
/* 12 */            OlilOlOiI olilOlOiII0010I0i = OlilOlOiI.I0010I0i(context, attributeSet, iArr, i);
/* 19 */            TypedArray typedArray = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 21 */            Context context2 = imageView.getContext();
/* 28 */            TypedArray typedArray2 = (TypedArray) olilOlOiII0010I0i.I00iiO;
/* 30 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 35 */            OooiO1oOi1.I00000oOI(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
                    try {
/* 38 */                Drawable drawable = imageView.getDrawable();
/* 43 */                if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = iOO0oOI1Ol.I00000oIO(imageView.getContext(), resourceId)) != null) {
/* 62 */                    imageView.setImageDrawable(drawable);
                        }
/* 69 */                if (drawable != null) {
/* 71 */                    int i2 = IiloO11l.I00000oIO;
                        }
/* 78 */                if (typedArray.hasValue(2)) {
/* 84 */                    imageView.setImageTintList(olilOlOiII0010I0i.I000OiO(2));
                        }
/* 92 */                if (typedArray.hasValue(3)) {
/* 103 */                   imageView.setImageTintMode(IiloO11l.I00000oIO(typedArray.getInt(3, -1), null));
                        }
/* 106 */               olilOlOiII0010I0i.I0010o();
                    } catch (Throwable th) {
/* 110 */               olilOlOiII0010I0i.I0010o();
/* 332 */               throw th;
                    }
                }

                public I00Ol1ll1 I000oI1ioi(int i, int i2) throws IOException {
                    int i3;
                    I1lliI1o0l i1lliI1o0l;
/* 1 */             I00IOO i00iooI001IO000 = I001IO000();
/* 5 */             int i4 = i00iooI001IO000.I00000oOI;
/* 7 */             int i5 = 0;
/* 9 */             if (i4 == 1) {
/* 19 */                i3 = i;
/* 21 */                i1lliI1o0l = new I1lliI1o0l(3, i3, i2, i00iooI001IO000.I0000oI00(0), 0);
                    } else {
/* 29 */                I1llI1Iil i1llI1Iil = I1ll0oOIoOi.I00000oIO;
/* 50 */                i3 = i;
/* 47 */                i1lliI1o0l = new I1lliI1o0l(4, i, i2, i4 < 1 ? I1ll0oOIoOi.I00000oIO : new I1llI1Iil(i00iooI001IO000), 0);
                    }
                    return i3 != 64 ? i1lliI1o0l : new I1lio01I00IO(i1lliI1o0l, i5);
                }

                public Oo1IiOllo0iI I00100l0() {
/* 3 */             Oo1IiOllo0iI oo1IiOllo0iI = (Oo1IiOllo0iI) this.I0000O;
/* 9 */             this.I0000O = I001IIilI0O(oo1IiOllo0iI);
/* 20 */            return oo1IiOllo0iI;
                }

                public boolean I00100o1O0lo(int i) {
/* 3 */             Oo1IiOllo0iI oo1IiOllo0iI = (Oo1IiOllo0iI) this.I0000O;
                    return oo1IiOllo0iI != null && oo1IiOllo0iI.I0000Il00O == i;
                }

                public void I0010I0i(Object obj, Object obj2) {
/* 5 */             int i = (this.I00000oOI + 1) * 2;
/* 9 */             Object[] objArrCopyOf = (Object[]) this.I0000Il00O;
/* 12 */            if (i > objArrCopyOf.length) {
/* 19 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, IoilIilo.I000II(objArrCopyOf.length, i));
/* 23 */                this.I0000Il00O = objArrCopyOf;
                    }
/* 25 */            if (obj == null) {
/* 106 */               throw new NullPointerException("null key in entry: null=" + obj2);
                    }
/* 27 */            if (obj2 == null) {
/* 68 */                throw new NullPointerException("null value in entry: " + obj + "=null");
                    }
/* 29 */            int i2 = this.I00000oOI;
/* 31 */            int i3 = i2 * 2;
/* 33 */            objArrCopyOf[i3] = obj;
/* 37 */            objArrCopyOf[i3 + 1] = obj2;
/* 41 */            this.I00000oOI = i2 + 1;
                }

                public void I0010o(OOoli1l oOoli1l) {
/* 1 */             Set setEntrySet = oOoli1l.entrySet();
/* 12 */            int size = (setEntrySet.size() + this.I00000oOI) * 2;
/* 16 */            Object[] objArr = (Object[]) this.I0000Il00O;
/* 19 */            if (size > objArr.length) {
/* 30 */                this.I0000Il00O = Arrays.copyOf(objArr, IoilIilo.I000II(objArr.length, size));
                    }
/* 34 */            OoiOOoOlo ooiOOoOloI000iOII = ((OOol10IO0O1) setEntrySet).iterator();
                    while (true) {
/* 39 */                IoilOOi ioilOOi = (IoilOOi) ooiOOoOloI000iOII;
/* 45 */                if (!ioilOOi.hasNext()) {
/* 77 */                    return;
                        }
/* 51 */                Map.Entry entry = (Map.Entry) ioilOOi.next();
/* 61 */                I0010I0i(entry.getKey(), entry.getValue());
                    }
                }

                public String I00111O() throws IOException {
/* 3 */             ByteBuffer byteBuffer = (ByteBuffer) this.I0000Il00O;
/* 7 */             StringBuilder sb = new StringBuilder();
/* 14 */            while (byteBuffer.hasRemaining()) {
/* 16 */                byteBuffer.mark();
/* 19 */                char cI000II = I000II();
/* 27 */                if (Character.isWhitespace(cI000II) || cI000II == '(' || cI000II == ')' || cI000II == '<' || cI000II == '>' || cI000II == '[' || cI000II == ']' || cI000II == '{' || cI000II == '}' || cI000II == '/' || cI000II == '%') {
/* 74 */                    byteBuffer.reset();
                            break;
                        }
/* 70 */                sb.append(cI000II);
                    }
/* 81 */            if (sb.length() == 0) {
/* 83 */                return null;
                    }
/* 85 */            return sb.toString();
                }

                /* JADX WARN: Removed duplicated region for block: B:135:0x0222  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x022a  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x023b A[LOOP:3: B:140:0x0235->B:142:0x023b, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0250  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x025d  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x02bf  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x02cb A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:166:0x02cc  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Oo1IiOllo0iI I001IIilI0O(Oo1IiOllo0iI oo1IiOllo0iI) throws IOException {
                    boolean z;
                    char cI000II;
                    Oo1IiOllo0iI oo1IiOllo0iI2;
                    char cI000II2;
                    StringBuilder sb;
                    char cI000II3;
/* 7 */             ByteBuffer byteBuffer = (ByteBuffer) this.I0000Il00O;
/* 819 */           do {
/* 9 */                 z = false;
/* 14 */                while (byteBuffer.hasRemaining()) {
/* 16 */                    char cI000II4 = I000II();
/* 26 */                    if (cI000II4 == '%') {
/* 32 */                        while (byteBuffer.hasRemaining() && (cI000II = I000II()) != '\r' && cI000II != '\n') {
                                }
                            } else {
/* 57 */                        if (cI000II4 == '(') {
/* 61 */                            StringBuilder sb2 = new StringBuilder();
/* 68 */                            while (byteBuffer.hasRemaining()) {
/* 70 */                                char cI000II5 = I000II();
/* 76 */                                if (cI000II5 == '\n' || cI000II5 == '\r') {
/* 236 */                                   sb2.append("\n");
                                        } else if (cI000II5 == '\\') {
/* 129 */                                   char cI000II6 = I000II();
/* 133 */                                   if (cI000II6 == '(') {
/* 184 */                                       sb2.append('(');
                                            } else if (cI000II6 == ')') {
/* 180 */                                       sb2.append(')');
                                            } else if (cI000II6 == '\\') {
/* 176 */                                       sb2.append('\\');
                                            } else if (cI000II6 == 'b') {
/* 172 */                                       sb2.append('\b');
                                            } else if (cI000II6 == 'f') {
/* 168 */                                       sb2.append('\f');
                                            } else if (cI000II6 == 'n' || cI000II6 == 'r') {
/* 164 */                                       sb2.append("\n");
                                            } else if (cI000II6 == 't') {
/* 160 */                                       sb2.append('\t');
                                            }
/* 191 */                                   if (Character.isDigit(cI000II6)) {
                                                try {
/* 220 */                                           sb2.append((char) Integer.parseInt(String.valueOf(new char[]{cI000II6, I000II(), I000II()}), 8));
                                                } catch (NumberFormatException e) {
/* 231 */                                           throw new IOException(e);
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else if (cI000II5 == '(') {
                                            this.I00000oOI++;
/* 125 */                                   sb2.append('(');
                                        } else if (cI000II5 != ')') {
/* 93 */                                    sb2.append(cI000II5);
                                        } else {
/* 99 */                                    if (this.I00000oOI == 0) {
/* 107 */                                       return new Oo1IiOllo0iI(sb2.toString(), 2);
                                            }
/* 111 */                                   sb2.append(')');
                                            this.I00000oOI--;
                                        }
                                    }
/* 241 */                           return null;
                                }
/* 245 */                       boolean z2 = false;
/* 249 */                       if (cI000II4 == ')') {
/* 813 */                           IioIoO10iOiI.I000OOo1O("unexpected closing parenthesis");
/* 247 */                           return null;
                                }
/* 253 */                       if (cI000II4 == '[') {
/* 258 */                           return new Oo1IiOllo0iI(cI000II4, 7);
                                }
/* 264 */                       if (cI000II4 == '{') {
/* 268 */                           return new Oo1IiOllo0iI(cI000II4, 9);
                                }
/* 274 */                       if (cI000II4 == ']') {
/* 278 */                           return new Oo1IiOllo0iI(cI000II4, 8);
                                }
/* 284 */                       if (cI000II4 == '}') {
/* 288 */                           return new Oo1IiOllo0iI(cI000II4, 10);
                                }
/* 296 */                       if (cI000II4 == '/') {
/* 298 */                           String strI00111O = I00111O();
/* 302 */                           if (strI00111O != null) {
/* 307 */                               return new Oo1IiOllo0iI(strI00111O, 4);
                                    }
/* 332 */                           throw new Ii111OoO("Could not read token at position " + byteBuffer.position());
                                }
/* 335 */                       if (cI000II4 == '<') {
/* 341 */                           if (I000II() == cI000II4) {
/* 349 */                               return new Oo1IiOllo0iI("<<", 11);
                                    }
/* 358 */                           byteBuffer.position(byteBuffer.position() - 1);
/* 363 */                           return new Oo1IiOllo0iI(cI000II4, 3);
                                }
/* 369 */                       if (cI000II4 == '>') {
/* 375 */                           if (I000II() == cI000II4) {
/* 381 */                               return new Oo1IiOllo0iI(">>", 12);
                                    }
/* 390 */                           byteBuffer.position(byteBuffer.position() - 1);
/* 395 */                           return new Oo1IiOllo0iI(cI000II4, 3);
                                }
/* 403 */                       if (!Character.isWhitespace(cI000II4)) {
/* 408 */                           if (cI000II4 == 0) {
/* 414 */                               Log.w("PdfBox-Android", "NULL byte in font, skipped");
                                    } else {
/* 423 */                               byteBuffer.position(byteBuffer.position() - 1);
/* 426 */                               byteBuffer.mark();
/* 431 */                               StringBuilder sb3 = new StringBuilder();
/* 434 */                               char cI000II7 = I000II();
/* 442 */                               if (cI000II7 == '+' || cI000II7 == '-') {
/* 446 */                                   sb3.append(cI000II7);
/* 449 */                                   cI000II7 = I000II();
                                        }
/* 457 */                               while (Character.isDigit(cI000II7)) {
/* 459 */                                   sb3.append(cI000II7);
/* 462 */                                   cI000II7 = I000II();
/* 466 */                                   z2 = true;
                                        }
/* 476 */                               if (cI000II7 == '.') {
/* 478 */                                   sb3.append(cI000II7);
/* 481 */                                   cI000II7 = I000II();
                                        } else if (cI000II7 == '#') {
/* 495 */                                   StringBuilder sb4 = new StringBuilder();
/* 498 */                                   cI000II2 = I000II();
/* 504 */                                   sb = sb3;
/* 505 */                                   sb3 = sb4;
/* 545 */                                   if (Character.isDigit(cI000II2)) {
/* 555 */                                       if (cI000II2 != 'e' && cI000II2 != 'E') {
/* 559 */                                           byteBuffer.reset();
                                                }
/* 562 */                                       oo1IiOllo0iI2 = null;
/* 714 */                                       if (oo1IiOllo0iI2 == null) {
/* 716 */                                           return oo1IiOllo0iI2;
                                                }
/* 717 */                                       String strI00111O2 = I00111O();
/* 721 */                                       if (strI00111O2 == null) {
/* 810 */                                           throw new Ii111OoO("Could not read token at position " + byteBuffer.position());
                                                }
/* 729 */                                       if (!strI00111O2.equals("RD") && !strI00111O2.equals("-|")) {
/* 742 */                                           return new Oo1IiOllo0iI(strI00111O2, 3);
                                                }
/* 746 */                                       if (oo1IiOllo0iI == null || oo1IiOllo0iI.I0000Il00O != 6) {
/* 785 */                                           IioIoO10iOiI.I000OOo1O("expected INTEGER before -| or RD");
/* 247 */                                           return null;
                                                }
/* 752 */                                       int iI00000oIO = oo1IiOllo0iI.I00000oIO();
                                                try {
/* 756 */                                           byteBuffer.get();
/* 759 */                                           byte[] bArr = new byte[iI00000oIO];
/* 761 */                                           byteBuffer.get(bArr);
/* 766 */                                           Oo1IiOllo0iI oo1IiOllo0iI3 = new Oo1IiOllo0iI();
/* 769 */                                           oo1IiOllo0iI3.I00000oOI = bArr;
/* 771 */                                           oo1IiOllo0iI3.I0000Il00O = 13;
/* 773 */                                           VarHandle.storeStoreFence();
/* 776 */                                           return oo1IiOllo0iI3;
                                                } catch (BufferUnderflowException unused) {
/* 779 */                                           IioIoO10iOiI.I000OOo1O("Premature end of buffer reached");
/* 247 */                                           return null;
                                                }
                                            }
/* 547 */                                   sb3.append(cI000II2);
/* 550 */                                   cI000II2 = I000II();
/* 570 */                                   while (Character.isDigit(cI000II2)) {
/* 572 */                                       sb3.append(cI000II2);
/* 575 */                                       cI000II2 = I000II();
                                            }
/* 580 */                                   if (cI000II2 != 'E' || cI000II2 == 'e') {
/* 584 */                                       sb3.append(cI000II2);
/* 587 */                                       cI000II3 = I000II();
/* 591 */                                       if (cI000II3 == '-') {
/* 593 */                                           sb3.append(cI000II3);
/* 596 */                                           cI000II3 = I000II();
                                                }
/* 604 */                                       if (Character.isDigit(cI000II3)) {
/* 704 */                                           byteBuffer.reset();
/* 562 */                                           oo1IiOllo0iI2 = null;
/* 714 */                                           if (oo1IiOllo0iI2 == null) {
                                                    }
                                                } else {
/* 606 */                                           sb3.append(cI000II3);
/* 609 */                                           char cI000II8 = I000II();
/* 617 */                                           while (Character.isDigit(cI000II8)) {
/* 619 */                                               sb3.append(cI000II8);
/* 622 */                                               cI000II8 = I000II();
                                                    }
                                                }
                                            }
/* 632 */                                   byteBuffer.position(byteBuffer.position() - 1);
/* 635 */                                   if (sb != null) {
                                                try {
/* 659 */                                           oo1IiOllo0iI2 = new Oo1IiOllo0iI(Integer.toString(Integer.parseInt(sb3.toString(), Integer.parseInt(sb.toString()))), 6);
                                                } catch (NumberFormatException e2) {
/* 692 */                                           throw new IOException("Invalid number '" + sb3.toString() + "'", e2);
                                                }
                                            } else {
/* 700 */                                       oo1IiOllo0iI2 = new Oo1IiOllo0iI(sb3.toString(), 5);
                                            }
/* 714 */                                   if (oo1IiOllo0iI2 == null) {
                                            }
                                        } else if (sb3.length() == 0 || !z2) {
/* 709 */                                   byteBuffer.reset();
/* 562 */                                   oo1IiOllo0iI2 = null;
/* 714 */                                   if (oo1IiOllo0iI2 == null) {
                                            }
                                        } else if (cI000II7 != 'e' && cI000II7 != 'E') {
/* 527 */                                   byteBuffer.position(byteBuffer.position() - 1);
/* 536 */                                   oo1IiOllo0iI2 = new Oo1IiOllo0iI(sb3.toString(), 6);
/* 714 */                                   if (oo1IiOllo0iI2 == null) {
                                            }
                                        }
/* 485 */                               cI000II2 = cI000II7;
/* 486 */                               sb = null;
/* 545 */                               if (Character.isDigit(cI000II2)) {
                                        }
/* 570 */                               while (Character.isDigit(cI000II2)) {
                                        }
/* 580 */                               if (cI000II2 != 'E') {
/* 584 */                                   sb3.append(cI000II2);
/* 587 */                                   cI000II3 = I000II();
/* 591 */                                   if (cI000II3 == '-') {
                                            }
/* 604 */                                   if (Character.isDigit(cI000II3)) {
                                            }
                                        }
/* 714 */                               if (oo1IiOllo0iI2 == null) {
                                        }
                                    }
                                }
/* 405 */                       z = true;
                            }
                        }
/* 819 */           } while (z);
/* 817 */           return null;
                }

                public I00IOO I001IO000() throws IOException {
/* 3 */             O0olI000 o0olI000 = (O0olI000) this.I0000Il00O;
/* 5 */             int i = o0olI000.read();
/* 10 */            if (i < 0) {
/* 14 */                return new I00IOO(0);
                    }
/* 20 */            I00IOO i00ioo = new I00IOO(0, false);
/* 50 */            do {
/* 23 */                I00IO1oi11O i00IO1oi11OI000iOII = I000iOII(i);
/* 37 */                i00ioo.I0000O(i00IO1oi11OI000iOII instanceof IoiolIoO1I0O ? ((IoiolIoO1I0O) i00IO1oi11OI000iOII).I000OiO() : i00IO1oi11OI000iOII.I0000O());
/* 46 */                i = o0olI000.read();
/* 50 */            } while (i >= 0);
/* 55 */            return i00ioo;
                }

                public void I001i1O0Ol(int i, int i2, int i3, long j) {
                    long j2;
                    char c;
                    int i4;
/* 3 */             char c2 = '2';
/* 11 */            if ((((int) (j >> 50)) & 1023) > 0) {
/* 13 */                int i5 = OOo0OIiO10o1.I00000oOI;
/* 15 */                long j3 = -1125899873288193L;
/* 22 */                int i6 = 33554431;
/* 28 */                char c3 = 25;
/* 34 */                long[] jArr = (long[]) this.I0000Il00O;
/* 38 */                long[] jArr2 = (long[]) this.I0000O;
/* 40 */                int i7 = this.I00000oOI;
/* 43 */                jArr2[0] = (j & (-1125899873288193L)) | ((i & 33554431) << 25);
/* 45 */                int i8 = 1;
/* 46 */                while (i8 > 0) {
                            i8--;
/* 50 */                    long j4 = jArr2[i8];
/* 53 */                    int i9 = ((int) j4) & i6;
/* 57 */                    int i10 = ((int) (j4 >> c3)) & i6;
/* 60 */                    int i11 = ((int) (j4 >> c2)) & 1023;
/* 67 */                    int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
/* 68 */                    if (i10 < 0) {
/* 1182 */                      return;
                            }
/* 72 */                    while (i10 < i7 - 2 && i10 <= i12) {
/* 76 */                        int i13 = i10 + 2;
/* 78 */                        long j5 = jArr[i13];
/* 80 */                        char c4 = c2;
/* 82 */                        int i14 = i6;
/* 89 */                        if ((((int) (j5 >> c3)) & i14) == i9) {
/* 91 */                            long j6 = jArr[i10];
/* 93 */                            int i15 = i10 + 1;
/* 95 */                            j2 = j3;
/* 97 */                            long j7 = jArr[i15];
/* 101 */                           c = c3;
/* 103 */                           i4 = i12;
/* 125 */                           jArr[i10] = ((((int) j6) + i3) & 4294967295L) | ((((int) (j6 >> 32)) + i2) << 32);
/* 142 */                           jArr[i15] = ((((int) j7) + i3) & 4294967295L) | ((((int) (j7 >> 32)) + i2) << 32);
/* 155 */                           jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
/* 161 */                           if ((((int) (j5 >> c4)) & 1023) > 0) {
/* 167 */                               int i16 = OOo0OIiO10o1.I00000oOI;
/* 177 */                               jArr2[i8] = (j5 & j2) | (((i10 + 3) & i14) << c);
/* 163 */                               i8++;
                                    }
                                } else {
/* 181 */                           j2 = j3;
/* 183 */                           c = c3;
/* 185 */                           i4 = i12;
                                }
/* 187 */                       i10 += 3;
/* 189 */                       i12 = i4;
/* 191 */                       c3 = c;
/* 193 */                       i6 = i14;
/* 195 */                       c2 = c4;
/* 197 */                       j3 = j2;
                            }
/* 209 */                   c3 = c3;
/* 211 */                   i6 = i6;
/* 213 */                   c2 = c2;
/* 215 */                   j3 = j3;
                        }
                    }
                }

                public void I001i1lo1io(Integer num, iiI10IO0io0I iii10io0io0i) {
/* 3 */             int i = this.I00000oOI + 1;
/* 7 */             Object[] objArrCopyOf = (Object[]) this.I0000Il00O;
/* 9 */             int length = objArrCopyOf.length;
/* 10 */            int i2 = i + i;
/* 11 */            if (i2 > length) {
/* 17 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, liill1Iil1.I00000oIO(length, i2));
/* 21 */                this.I0000Il00O = objArrCopyOf;
                    }
/* 23 */            if (iii10io0io0i == null) {
/* 52 */                IOOlIIilOl0.I000II(IlIi0I0.I000lI("null value in entry: ", num.toString(), "=null"));
/* 106 */               return;
                    }
/* 25 */            int i3 = this.I00000oOI;
/* 27 */            int i4 = i3 + i3;
/* 29 */            objArrCopyOf[i4] = num;
/* 33 */            objArrCopyOf[i4 + 1] = iii10io0io0i;
/* 37 */            this.I00000oOI = i3 + 1;
                }

                public void I001iOo1i0O(Object obj, Object obj2) {
                    switch (this.I00000oIO) {
                        case PoseLandmark.RIGHT_INDEX:
/* 52 */                    int i = this.I00000oOI + 1;
/* 56 */                    Object[] objArrCopyOf = (Object[]) this.I0000Il00O;
/* 58 */                    int length = objArrCopyOf.length;
/* 59 */                    int i2 = i + i;
/* 60 */                    if (i2 > length) {
/* 66 */                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, lioOolIil.I00000oIO(length, i2));
/* 70 */                        this.I0000Il00O = objArrCopyOf;
                            }
/* 72 */                    if (obj == null) {
/* 117 */                       IOOlIIilOl0.I000II("null key in entry: null=".concat(String.valueOf(obj2)));
                                break;
                            } else if (obj2 == null) {
/* 103 */                       IOOlIIilOl0.I000II(IlIi0I0.I000lI("null value in entry: ", obj.toString(), "=null"));
                                break;
                            } else {
/* 76 */                        int i3 = this.I00000oOI;
/* 78 */                        int i4 = i3 + i3;
/* 80 */                        objArrCopyOf[i4] = obj;
/* 84 */                        objArrCopyOf[i4 + 1] = obj2;
/* 88 */                        this.I00000oOI = i3 + 1;
                                break;
                            }
                        default:
/* 8 */                     int i5 = this.I00000oOI + 1;
/* 12 */                    Object[] objArr = (Object[]) this.I0000Il00O;
/* 14 */                    int length2 = objArr.length;
/* 15 */                    int i6 = i5 + i5;
/* 16 */                    if (i6 > length2) {
/* 26 */                        this.I0000Il00O = Arrays.copyOf(objArr, IoilIilo.I000OiO(length2, i6));
                            }
/* 28 */                    ll0iOo11011i.I00000oIO(obj, obj2);
/* 33 */                    Object[] objArr2 = (Object[]) this.I0000Il00O;
/* 35 */                    int i7 = this.I00000oOI;
/* 37 */                    int i8 = i7 + i7;
/* 39 */                    objArr2[i8] = obj;
/* 43 */                    objArr2[i8 + 1] = obj2;
/* 47 */                    this.I00000oOI = i7 + 1;
                            break;
                    }
                }

                public void I001l0I00(String str, IlIII1l ilIII1l) {
/* 3 */             int i = this.I00000oOI + 1;
/* 7 */             Object[] objArrCopyOf = (Object[]) this.I0000Il00O;
/* 9 */             int length = objArrCopyOf.length;
/* 10 */            int i2 = i + i;
/* 11 */            if (i2 > length) {
/* 13 */                if (i2 < 0) {
/* 41 */                    I000II.I000O01llI0("cannot store more than MAX_VALUE elements");
/* 44 */                    return;
                        }
/* 18 */                int iI0000Il00O = length + (length >> 1) + 1;
/* 20 */                if (iI0000Il00O < i2) {
/* 23 */                    iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                        }
/* 27 */                if (iI0000Il00O < 0) {
/* 29 */                    iI0000Il00O = Integer.MAX_VALUE;
                        }
/* 32 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI0000Il00O);
/* 36 */                this.I0000Il00O = objArrCopyOf;
                    }
/* 45 */            int i3 = this.I00000oOI;
/* 47 */            int i4 = i3 + i3;
/* 49 */            objArrCopyOf[i4] = str;
/* 53 */            objArrCopyOf[i4 + 1] = ilIII1l;
/* 57 */            this.I00000oOI = i3 + 1;
                }

                public void I001lIiIIo1O(String str, Object obj) {
                    switch (this.I00000oIO) {
                        case PoseLandmark.RIGHT_PINKY:
/* 114 */                   int i = this.I00000oOI + 1;
/* 118 */                   Object[] objArrCopyOf = (Object[]) this.I0000Il00O;
/* 120 */                   int length = objArrCopyOf.length;
/* 121 */                   int i2 = i + i;
/* 122 */                   if (i2 > length) {
/* 128 */                       objArrCopyOf = Arrays.copyOf(objArrCopyOf, lioOIliIloli.I00000oIO(length, i2));
/* 132 */                       this.I0000Il00O = objArrCopyOf;
                            }
/* 134 */                   if (obj == null) {
/* 159 */                       IOOlIIilOl0.I000II(IlIi0I0.I000lI("null value in entry: ", str.toString(), "=null"));
                                break;
                            } else {
/* 136 */                       int i3 = this.I00000oOI;
/* 138 */                       int i4 = i3 + i3;
/* 140 */                       objArrCopyOf[i4] = str;
/* 144 */                       objArrCopyOf[i4 + 1] = obj;
/* 148 */                       this.I00000oOI = i3 + 1;
                                break;
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 63 */                    int i5 = this.I00000oOI + 1;
/* 67 */                    Object[] objArrCopyOf2 = (Object[]) this.I0000Il00O;
/* 69 */                    int length2 = objArrCopyOf2.length;
/* 70 */                    int i6 = i5 + i5;
/* 71 */                    if (i6 > length2) {
/* 77 */                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, lioOO0I.I00000oIO(length2, i6));
/* 81 */                        this.I0000Il00O = objArrCopyOf2;
                            }
/* 83 */                    if (obj == null) {
/* 108 */                       IOOlIIilOl0.I000II(IlIi0I0.I000lI("null value in entry: ", str.toString(), "=null"));
                                break;
                            } else {
/* 85 */                        int i7 = this.I00000oOI;
/* 87 */                        int i8 = i7 + i7;
/* 89 */                        objArrCopyOf2[i8] = str;
/* 93 */                        objArrCopyOf2[i8 + 1] = obj;
/* 97 */                        this.I00000oOI = i7 + 1;
                                break;
                            }
                        default:
/* 12 */                    int i9 = this.I00000oOI + 1;
/* 16 */                    Object[] objArrCopyOf3 = (Object[]) this.I0000Il00O;
/* 18 */                    int length3 = objArrCopyOf3.length;
/* 19 */                    int i10 = i9 + i9;
/* 20 */                    if (i10 > length3) {
/* 26 */                        objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, IoilIilo.I000OOo1O(length3, i10));
/* 30 */                        this.I0000Il00O = objArrCopyOf3;
                            }
/* 32 */                    if (obj == null) {
/* 57 */                        IOOlIIilOl0.I000II(IlIi0I0.I000lI("null value in entry: ", str.toString(), "=null"));
                                break;
                            } else {
/* 34 */                        int i11 = this.I00000oOI;
/* 36 */                        int i12 = i11 + i11;
/* 38 */                        objArrCopyOf3[i12] = str;
/* 42 */                        objArrCopyOf3[i12 + 1] = obj;
/* 46 */                        this.I00000oOI = i11 + 1;
                                break;
                            }
                    }
                }

                public lOliil I001lllioOl() {
/* 3 */             lOIO0O0 loio0o0 = (lOIO0O0) this.I0000O;
/* 5 */             if (loio0o0 != null) {
/* 55 */                throw loio0o0.I00000oIO();
                    }
/* 13 */            lOliil loliilI0000Il00O = lOliil.I0000Il00O(this.I00000oOI, (Object[]) this.I0000Il00O, this);
/* 19 */            lOIO0O0 loio0o02 = (lOIO0O0) this.I0000O;
/* 21 */            if (loio0o02 == null) {
/* 23 */                return loliilI0000Il00O;
                    }
/* 28 */            throw loio0o02.I00000oIO();
                }

                public byte[] I001lloI() {
/* 1 */             lOOlOoll loolooll = lOOlOoll.I00l0I0l0lO1;
/* 5 */             l1IllOOOo1 l1illoooo1 = (l1IllOOOo1) this.I0000Il00O;
/* 11 */            int i = 0;
/* 16 */            ((IIlOoolol0ll) this.I0000O).I00l0I0l0lO1 = false;
/* 20 */            IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I0000O;
/* 22 */            Boolean bool = Boolean.FALSE;
/* 24 */            iIlOoolol0ll.getClass();
/* 29 */            llOo1oi1 lloo1oi1 = new llOo1oi1();
/* 36 */            lloo1oi1.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 42 */            lloo1oi1.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 48 */            lloo1oi1.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 54 */            lloo1oi1.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 60 */            lloo1oi1.I0000oI00 = (iOloIilioi) iIlOoolol0ll.I00ilO0;
/* 66 */            lloo1oi1.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 68 */            lloo1oi1.I000II = bool;
/* 74 */            lloo1oi1.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 80 */            lloo1oi1.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 86 */            lloo1oi1.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 92 */            lloo1oi1.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 94 */            VarHandle.storeStoreFence();
/* 97 */            l1illoooo1.I00iiI = lloo1oi1;
                    try {
/* 99 */                lo1iloiI1.I000II();
/* 102 */               lOli1l loli1lI000II = l1illoooo1.I000II();
/* 108 */               iiIolOO000 iiioloo000 = new iiIolOO000(i);
/* 113 */               HashMap map = new HashMap();
/* 116 */               iiioloo000.I00000oOI = map;
/* 120 */               HashMap map2 = new HashMap();
/* 123 */               iiioloo000.I0000Il00O = map2;
/* 125 */               iIOo0oiIi1 iioo0oiii1 = iiIolOO000.I0000O;
/* 127 */               VarHandle.storeStoreFence();
/* 130 */               loolooll.configure(iiioloo000);
/* 137 */               HashMap map3 = new HashMap(map);
/* 142 */               HashMap map4 = new HashMap(map2);
/* 147 */               Oo1ol1ll oo1ol1ll = new Oo1ol1ll(12);
/* 150 */               oo1ol1ll.I00iiI = map3;
/* 152 */               oo1ol1ll.I00iiO = map4;
/* 154 */               oo1ol1ll.I00iio = iioo0oiii1;
/* 156 */               VarHandle.storeStoreFence();
/* 159 */               return oo1ol1ll.I00100o1O0lo(loli1lI000II);
                    } catch (UnsupportedEncodingException e) {
/* 245 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

                public byte[] I00II0Ol1O0l(int i) {
/* 7 */             int i2 = 1;
                    switch (this.I00000oIO) {
                        case PoseLandmark.LEFT_HIP:
/* 821 */                   iolOOiI iolooii = iolOOiI.I00l0I0l0lO1;
/* 825 */                   I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I0000Il00O;
/* 841 */                   ((IIlOoolol0ll) this.I0000O).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 845 */                   IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I0000O;
/* 847 */                   Boolean bool = Boolean.FALSE;
/* 851 */                   lOOiIOiIilOo looiioiiiloo = new lOOiIOiIilOo();
/* 858 */                   looiioiiiloo.I00000oIO = (String) iIlOoolol0ll.I00iiI;
/* 864 */                   looiioiiiloo.I00000oOI = (String) iIlOoolol0ll.I00iiO;
/* 870 */                   looiioiiiloo.I0000Il00O = (String) iIlOoolol0ll.I00iio;
/* 876 */                   looiioiiiloo.I0000O = (String) iIlOoolol0ll.I00ilI0I1;
/* 882 */                   looiioiiiloo.I0000oI00 = (iilO0li) iIlOoolol0ll.I00ilO0;
/* 888 */                   looiioiiiloo.I0001Ioi1lo = (String) iIlOoolol0ll.I00io1l;
/* 890 */                   looiioiiiloo.I000II = bool;
/* 896 */                   looiioiiiloo.I000O01llI0 = (Boolean) iIlOoolol0ll.I00ioIO;
/* 902 */                   looiioiiiloo.I000OOo1O = (Boolean) iIlOoolol0ll.I00l0I0l0lO1;
/* 908 */                   looiioiiiloo.I000OiO = (Integer) iIlOoolol0ll.I00l0OO0IO;
/* 914 */                   looiioiiiloo.I000iOII = (Integer) iIlOoolol0ll.I00li1OI;
/* 916 */                   VarHandle.storeStoreFence();
/* 919 */                   i0Oi111ii.I00iiI = looiioiiiloo;
                            try {
/* 921 */                       liIoOiiO1Oi.I000OiO();
/* 924 */                       if (i == 0) {
/* 926 */                           lIO1iOooo1O lio1ioooo1oI00OIo = i0Oi111ii.I00OIo();
/* 932 */                           O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 935 */                           iolooii.configure(o01IiIi1l);
/* 938 */                           o01IiIi1l.I0000O = true;
/* 948 */                           return o01IiIi1l.I00000oIO().I000l1(lio1ioooo1oI00OIo).getBytes("utf-8");
                                }
/* 955 */                       lIO1iOooo1O lio1ioooo1oI00OIo2 = i0Oi111ii.I00OIo();
/* 962 */                       iilI1lI10Ii iili1li10ii = new iilI1lI10Ii(4);
/* 967 */                       HashMap map = new HashMap();
/* 970 */                       iili1li10ii.I00000oOI = map;
/* 974 */                       HashMap map2 = new HashMap();
/* 977 */                       iili1li10ii.I0000Il00O = map2;
/* 979 */                       iIOo0oiIi1 iioo0oiii1 = iIOo0oiIi1.I000OOo1O;
/* 981 */                       VarHandle.storeStoreFence();
/* 984 */                       iolooii.configure(iili1li10ii);
/* 991 */                       HashMap map3 = new HashMap(map);
/* 996 */                       HashMap map4 = new HashMap(map2);
/* 1001 */                      Oo1ol1ll oo1ol1ll = new Oo1ol1ll(18);
/* 1004 */                      oo1ol1ll.I00iiI = map3;
/* 1006 */                      oo1ol1ll.I00iiO = map4;
/* 1008 */                      oo1ol1ll.I00iio = iioo0oiii1;
/* 1010 */                      VarHandle.storeStoreFence();
/* 1013 */                      return oo1ol1ll.I00100l0(lio1ioooo1oI00OIo2);
                            } catch (UnsupportedEncodingException e) {
/* 1023 */                      throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                            }
                        case PoseLandmark.RIGHT_HIP:
                        default:
/* 12 */                    lolOiIoiillI loloiioiilli = lolOiIoiillI.I00o0iI0io1;
/* 16 */                    I0Oi111ii i0Oi111ii2 = (I0Oi111ii) this.I0000Il00O;
/* 32 */                    ((IIlOoolol0ll) this.I0000O).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 36 */                    IIlOoolol0ll iIlOoolol0ll2 = (IIlOoolol0ll) this.I0000O;
/* 38 */                    Boolean bool2 = Boolean.FALSE;
/* 42 */                    loI1IIi loi1iii = new loI1IIi();
/* 49 */                    loi1iii.I00000oIO = (String) iIlOoolol0ll2.I00iiI;
/* 55 */                    loi1iii.I00000oOI = (String) iIlOoolol0ll2.I00iiO;
/* 61 */                    loi1iii.I0000Il00O = (String) iIlOoolol0ll2.I00iio;
/* 67 */                    loi1iii.I0000O = (String) iIlOoolol0ll2.I00ilI0I1;
/* 73 */                    loi1iii.I0000oI00 = (iilOoOO00) iIlOoolol0ll2.I00ilO0;
/* 79 */                    loi1iii.I0001Ioi1lo = (String) iIlOoolol0ll2.I00io1l;
/* 81 */                    loi1iii.I000II = bool2;
/* 87 */                    loi1iii.I000O01llI0 = (Boolean) iIlOoolol0ll2.I00ioIO;
/* 93 */                    loi1iii.I000OOo1O = (Boolean) iIlOoolol0ll2.I00l0I0l0lO1;
/* 99 */                    loi1iii.I000OiO = (Integer) iIlOoolol0ll2.I00l0OO0IO;
/* 105 */                   loi1iii.I000iOII = (Integer) iIlOoolol0ll2.I00li1OI;
/* 107 */                   VarHandle.storeStoreFence();
/* 110 */                   i0Oi111ii2.I00iiI = loi1iii;
                            try {
/* 112 */                       looil0O1Io1.I000oI1ioi();
/* 115 */                       if (i == 0) {
/* 117 */                           liiI0oII0iO liii0oii0ioI00OilO00Il = i0Oi111ii2.I00OilO00Il();
/* 123 */                           O01IiIi1l o01IiIi1l2 = new O01IiIi1l();
/* 126 */                           loloiioiilli.configure(o01IiIi1l2);
/* 129 */                           o01IiIi1l2.I0000O = true;
/* 139 */                           return o01IiIi1l2.I00000oIO().I000l1(liii0oii0ioI00OilO00Il).getBytes("utf-8");
                                }
/* 146 */                       liiI0oII0iO liii0oii0ioI00OilO00Il2 = i0Oi111ii2.I00OilO00Il();
/* 152 */                       iiIolOO000 iiioloo000 = new iiIolOO000(i2);
/* 157 */                       HashMap map5 = new HashMap();
/* 160 */                       iiioloo000.I00000oOI = map5;
/* 164 */                       HashMap map6 = new HashMap();
/* 167 */                       iiioloo000.I0000Il00O = map6;
/* 169 */                       iIOo0oiIi1 iioo0oiii12 = iiIolOO000.I0000oI00;
/* 171 */                       VarHandle.storeStoreFence();
/* 174 */                       loloiioiilli.configure(iiioloo000);
/* 181 */                       HashMap map7 = new HashMap(map5);
/* 186 */                       HashMap map8 = new HashMap(map6);
/* 191 */                       OlilOlOiI olilOlOiI = new OlilOlOiI(20);
/* 194 */                       olilOlOiI.I00iiI = map7;
/* 196 */                       olilOlOiI.I00iiO = map8;
/* 198 */                       olilOlOiI.I00iio = iioo0oiii12;
/* 200 */                       VarHandle.storeStoreFence();
/* 203 */                       return olilOlOiI.I001i1lo1io(liii0oii0ioI00OilO00Il2);
                            } catch (UnsupportedEncodingException e2) {
/* 213 */                       throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e2);
                            }
                        case PoseLandmark.LEFT_KNEE:
/* 618 */                   liIoOiiO1Oi liiooiio1oi = liIoOiiO1Oi.I00ioIO;
/* 622 */                   I0Oi111ii i0Oi111ii3 = (I0Oi111ii) this.I0000Il00O;
/* 639 */                   ((IIlOoolol0ll) this.I0000O).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 643 */                   IIlOoolol0ll iIlOoolol0ll3 = (IIlOoolol0ll) this.I0000O;
/* 645 */                   Boolean bool3 = Boolean.FALSE;
/* 649 */                   lloiOoi0i1ol lloiooi0i1ol = new lloiOoi0i1ol();
/* 656 */                   lloiooi0i1ol.I00000oIO = (String) iIlOoolol0ll3.I00iiI;
/* 662 */                   lloiooi0i1ol.I00000oOI = (String) iIlOoolol0ll3.I00iiO;
/* 668 */                   lloiooi0i1ol.I0000Il00O = (String) iIlOoolol0ll3.I00iio;
/* 674 */                   lloiooi0i1ol.I0000O = (String) iIlOoolol0ll3.I00ilI0I1;
/* 680 */                   lloiooi0i1ol.I0000oI00 = (ii0iO1l) iIlOoolol0ll3.I00ilO0;
/* 686 */                   lloiooi0i1ol.I0001Ioi1lo = (String) iIlOoolol0ll3.I00io1l;
/* 688 */                   lloiooi0i1ol.I000II = bool3;
/* 694 */                   lloiooi0i1ol.I000O01llI0 = (Boolean) iIlOoolol0ll3.I00ioIO;
/* 700 */                   lloiooi0i1ol.I000OOo1O = (Boolean) iIlOoolol0ll3.I00l0I0l0lO1;
/* 706 */                   lloiooi0i1ol.I000OiO = (Integer) iIlOoolol0ll3.I00l0OO0IO;
/* 712 */                   lloiooi0i1ol.I000iOII = (Integer) iIlOoolol0ll3.I00li1OI;
/* 714 */                   VarHandle.storeStoreFence();
/* 717 */                   i0Oi111ii3.I00iiI = lloiooi0i1ol;
                            try {
/* 719 */                       loilIl10Ii.I000lI();
/* 722 */                       if (i == 0) {
/* 724 */                           li0IoOiiO li0iooiioI00OOll1 = i0Oi111ii3.I00OOll1();
/* 730 */                           O01IiIi1l o01IiIi1l3 = new O01IiIi1l();
/* 733 */                           liiooiio1oi.configure(o01IiIi1l3);
/* 736 */                           o01IiIi1l3.I0000O = true;
/* 746 */                           return o01IiIi1l3.I00000oIO().I000l1(li0iooiioI00OOll1).getBytes("utf-8");
                                }
/* 753 */                       li0IoOiiO li0iooiioI00OOll12 = i0Oi111ii3.I00OOll1();
/* 759 */                       iilI1lI10Ii iili1li10ii2 = new iilI1lI10Ii(z ? 1 : 0);
/* 764 */                       HashMap map9 = new HashMap();
/* 767 */                       iili1li10ii2.I00000oOI = map9;
/* 771 */                       HashMap map10 = new HashMap();
/* 774 */                       iili1li10ii2.I0000Il00O = map10;
/* 776 */                       iIOo0oiIi1 iioo0oiii13 = iilI1lI10Ii.I0000O;
/* 778 */                       VarHandle.storeStoreFence();
/* 781 */                       liiooiio1oi.configure(iili1li10ii2);
/* 788 */                       HashMap map11 = new HashMap(map9);
/* 793 */                       HashMap map12 = new HashMap(map10);
/* 798 */                       Oo1ol1ll oo1ol1ll2 = new Oo1ol1ll(13);
/* 801 */                       oo1ol1ll2.I00iiI = map11;
/* 803 */                       oo1ol1ll2.I00iiO = map12;
/* 805 */                       oo1ol1ll2.I00iio = iioo0oiii13;
/* 807 */                       VarHandle.storeStoreFence();
/* 810 */                       return oo1ol1ll2.I0010I0i(li0iooiioI00OOll12);
                            } catch (UnsupportedEncodingException e3) {
/* 820 */                       throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e3);
                            }
                        case PoseLandmark.RIGHT_KNEE:
/* 417 */                   lo1iloiI1 lo1iloii1 = lo1iloiI1.I00l0OO0IO;
/* 421 */                   IOiOol0 iOiOol0 = (IOiOol0) this.I0000Il00O;
/* 437 */                   ((IIlOoolol0ll) this.I0000O).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 441 */                   IIlOoolol0ll iIlOoolol0ll4 = (IIlOoolol0ll) this.I0000O;
/* 443 */                   Boolean bool4 = Boolean.FALSE;
/* 447 */                   lo0II0OI lo0ii0oi = new lo0II0OI();
/* 454 */                   lo0ii0oi.I00000oIO = (String) iIlOoolol0ll4.I00iiI;
/* 460 */                   lo0ii0oi.I00000oOI = (String) iIlOoolol0ll4.I00iiO;
/* 466 */                   lo0ii0oi.I0000Il00O = (String) iIlOoolol0ll4.I00iio;
/* 472 */                   lo0ii0oi.I0000O = (String) iIlOoolol0ll4.I00ilI0I1;
/* 478 */                   lo0ii0oi.I0000oI00 = (ii1loIOIll0) iIlOoolol0ll4.I00ilO0;
/* 484 */                   lo0ii0oi.I0001Ioi1lo = (String) iIlOoolol0ll4.I00io1l;
/* 486 */                   lo0ii0oi.I000II = bool4;
/* 492 */                   lo0ii0oi.I000O01llI0 = (Boolean) iIlOoolol0ll4.I00ioIO;
/* 498 */                   lo0ii0oi.I000OOo1O = (Boolean) iIlOoolol0ll4.I00l0I0l0lO1;
/* 504 */                   lo0ii0oi.I000OiO = (Integer) iIlOoolol0ll4.I00l0OO0IO;
/* 510 */                   lo0ii0oi.I000iOII = (Integer) iIlOoolol0ll4.I00li1OI;
/* 512 */                   VarHandle.storeStoreFence();
/* 515 */                   iOiOol0.I00iiI = lo0ii0oi;
                            try {
/* 517 */                       lolOiIoiillI.I0000oI00();
/* 520 */                       if (i == 0) {
/* 522 */                           li1IOoo li1ioooI00O0o1oo = iOiOol0.I00O0o1oo();
/* 528 */                           O01IiIi1l o01IiIi1l4 = new O01IiIi1l();
/* 531 */                           lo1iloii1.configure(o01IiIi1l4);
/* 534 */                           o01IiIi1l4.I0000O = true;
/* 544 */                           return o01IiIi1l4.I00000oIO().I000l1(li1ioooI00O0o1oo).getBytes("utf-8");
                                }
/* 551 */                       li1IOoo li1ioooI00O0o1oo2 = iOiOol0.I00O0o1oo();
/* 558 */                       iiIolOO000 iiioloo0002 = new iiIolOO000(3);
/* 563 */                       HashMap map13 = new HashMap();
/* 566 */                       iiioloo0002.I00000oOI = map13;
/* 570 */                       HashMap map14 = new HashMap();
/* 573 */                       iiioloo0002.I0000Il00O = map14;
/* 575 */                       iIOo0oiIi1 iioo0oiii14 = iIOo0oiIi1.I000II;
/* 577 */                       VarHandle.storeStoreFence();
/* 580 */                       lo1iloii1.configure(iiioloo0002);
/* 587 */                       HashMap map15 = new HashMap(map13);
/* 592 */                       HashMap map16 = new HashMap(map14);
/* 595 */                       iIolll0O iiolll0o = new iIolll0O();
/* 598 */                       iiolll0o.I00000oIO = map15;
/* 600 */                       iiolll0o.I00000oOI = map16;
/* 602 */                       iiolll0o.I0000Il00O = iioo0oiii14;
/* 604 */                       VarHandle.storeStoreFence();
/* 607 */                       return iiolll0o.I00000oOI(li1ioooI00O0o1oo2);
                            } catch (UnsupportedEncodingException e4) {
/* 617 */                       throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e4);
                            }
                        case 27:
/* 214 */                   loIOiIO1O1 loioiio1o1 = loIOiIO1O1.I00ll1;
/* 218 */                   IOiOol0 iOiOol02 = (IOiOol0) this.I0000Il00O;
/* 235 */                   ((IIlOoolol0ll) this.I0000O).I00l0I0l0lO1 = Boolean.valueOf(1 == (i ^ 1));
/* 239 */                   IIlOoolol0ll iIlOoolol0ll5 = (IIlOoolol0ll) this.I0000O;
/* 241 */                   Boolean bool5 = Boolean.FALSE;
/* 245 */                   lo0II1 lo0ii1 = new lo0II1();
/* 252 */                   lo0ii1.I00000oIO = (String) iIlOoolol0ll5.I00iiI;
/* 258 */                   lo0ii1.I00000oOI = (String) iIlOoolol0ll5.I00iiO;
/* 264 */                   lo0ii1.I0000Il00O = (String) iIlOoolol0ll5.I00iio;
/* 270 */                   lo0ii1.I0000O = (String) iIlOoolol0ll5.I00ilI0I1;
/* 276 */                   lo0ii1.I0000oI00 = (iiI10IO0io0I) iIlOoolol0ll5.I00ilO0;
/* 282 */                   lo0ii1.I0001Ioi1lo = (String) iIlOoolol0ll5.I00io1l;
/* 284 */                   lo0ii1.I000II = bool5;
/* 290 */                   lo0ii1.I000O01llI0 = (Boolean) iIlOoolol0ll5.I00ioIO;
/* 296 */                   lo0ii1.I000OOo1O = (Boolean) iIlOoolol0ll5.I00l0I0l0lO1;
/* 302 */                   lo0ii1.I000OiO = (Integer) iIlOoolol0ll5.I00l0OO0IO;
/* 308 */                   lo0ii1.I000iOII = (Integer) iIlOoolol0ll5.I00li1OI;
/* 310 */                   VarHandle.storeStoreFence();
/* 313 */                   iOiOol02.I00iiI = lo0ii1;
                            try {
/* 315 */                       lolIo0.I00000oIO();
/* 318 */                       if (i == 0) {
/* 320 */                           li1OiO li1oioI00O10llo = iOiOol02.I00O10llo();
/* 326 */                           O01IiIi1l o01IiIi1l5 = new O01IiIi1l();
/* 329 */                           loioiio1o1.configure(o01IiIi1l5);
/* 332 */                           o01IiIi1l5.I0000O = true;
/* 342 */                           return o01IiIi1l5.I00000oIO().I000l1(li1oioI00O10llo).getBytes("utf-8");
                                }
/* 349 */                       li1OiO li1oioI00O10llo2 = iOiOol02.I00O10llo();
/* 355 */                       iio0oIll1 iio0oill1 = new iio0oIll1(z ? 1 : 0);
/* 360 */                       HashMap map17 = new HashMap();
/* 363 */                       iio0oill1.I00000oOI = map17;
/* 367 */                       HashMap map18 = new HashMap();
/* 370 */                       iio0oill1.I0000Il00O = map18;
/* 372 */                       iIOo0oiIi1 iioo0oiii15 = iio0oIll1.I0000O;
/* 374 */                       VarHandle.storeStoreFence();
/* 377 */                       loioiio1o1.configure(iio0oill1);
/* 384 */                       HashMap map19 = new HashMap(map17);
/* 389 */                       HashMap map20 = new HashMap(map18);
/* 394 */                       Oo1ol1ll oo1ol1ll3 = new Oo1ol1ll(14);
/* 397 */                       oo1ol1ll3.I00iiI = map19;
/* 399 */                       oo1ol1ll3.I00iiO = map20;
/* 401 */                       oo1ol1ll3.I00iio = iioo0oiii15;
/* 403 */                       VarHandle.storeStoreFence();
/* 406 */                       return oo1ol1ll3.I0010o(li1oioI00O10llo2);
                            } catch (UnsupportedEncodingException e5) {
/* 416 */                       throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e5);
                            }
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 4:
/* 92 */                    return ((String) this.I0000Il00O) + "-" + ((String) this.I0000O) + "-" + this.I00000oOI;
                        case 13:
/* 13 */                    StringBuilder sb = new StringBuilder();
/* 22 */                    if (((OOiIO0oi) this.I0000Il00O) == OOiIO0oi.HTTP_1_0) {
/* 26 */                        sb.append("HTTP/1.0");
                            } else {
/* 32 */                        sb.append("HTTP/1.1");
                            }
/* 37 */                    sb.append(' ');
/* 42 */                    sb.append(this.I00000oOI);
/* 45 */                    sb.append(' ');
/* 52 */                    sb.append((String) this.I0000O);
/* 55 */                    return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 251 */       public I00Ol00(O0olI000 o0olI000, int i, byte[][] bArr) {
                    this.I00000oIO = 0;
                    this.I0000Il00O = o0olI000;
                    this.I00000oOI = i;
                    this.I0000O = bArr;
                }

/* 252 */       public I00Ol00(Object obj, int i, int i2, Object obj2) {
/* 253 */           this.I00000oIO = i2;
                    this.I0000Il00O = obj;
                    this.I0000O = obj2;
                    this.I00000oOI = i;
                }

/* 253 */       public I00Ol00(I0Oi111ii i0Oi111ii, int i) {
                    this.I00000oIO = 23;
/* 256 */           this.I0000O = new IIlOoolol0ll(6);
                    this.I0000Il00O = i0Oi111ii;
                    liIoOiiO1Oi.I000OiO();
                    this.I00000oOI = i;
                }

/* 256 */       public I00Ol00(I0Oi111ii i0Oi111ii, int i, byte b) {
                    this.I00000oIO = 25;
/* 259 */           this.I0000O = new IIlOoolol0ll(8);
                    this.I0000Il00O = i0Oi111ii;
                    loilIl10Ii.I000lI();
                    this.I00000oOI = i;
                }

/* 259 */       public I00Ol00(I0Oi111ii i0Oi111ii, int i, char c) {
                    this.I00000oIO = 28;
/* 262 */           this.I0000O = new IIlOoolol0ll(11);
                    this.I0000Il00O = i0Oi111ii;
                    looil0O1Io1.I000oI1ioi();
                    this.I00000oOI = i;
                }

/* 262 */       public I00Ol00(IOiOol0 iOiOol0, int i) {
                    this.I00000oIO = 26;
/* 265 */           this.I0000O = new IIlOoolol0ll(9);
                    this.I0000Il00O = iOiOol0;
                    lolOiIoiillI.I0000oI00();
                    this.I00000oOI = i;
                }

/* 265 */       public I00Ol00(IOiOol0 iOiOol0, int i, byte b) {
                    this.I00000oIO = 27;
/* 268 */           this.I0000O = new IIlOoolol0ll(10);
                    this.I0000Il00O = iOiOol0;
                    lolIo0.I00000oIO();
                    this.I00000oOI = i;
                }

/* 268 */       public I00Ol00(O0Io0Io o0Io0Io, IlO1Oi1 ilO1Oi1) {
                    this.I00000oIO = 3;
                    this.I0000Il00O = o0Io0Io;
                    this.I0000O = ilO1Oi1;
/* 270 */           if (ilO1Oi1.I00000oOI == 1 && ilO1Oi1.I0000Il00O == 1) {
/* 273 */               this.I00000oOI = 1 << ilO1Oi1.I00000oIO;
                    } else {
/* 274 */               OIiilo1Ool0o.I0010o(ilO1Oi1, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
                        throw null;
                    }
                }

/* 274 */       public I00Ol00(ImageView imageView) {
                    this.I00000oIO = 2;
/* 276 */           this.I00000oOI = 0;
/* 277 */           this.I0000Il00O = imageView;
                }

/* 277 */       public I00Ol00(int i, short s) {
/* 278 */           this.I00000oIO = i;
                }

/* 278 */       public I00Ol00(byte[] bArr) {
                    this.I00000oIO = 14;
/* 280 */           this.I00000oOI = 0;
/* 281 */           this.I0000Il00O = ByteBuffer.wrap(bArr);
/* 282 */           this.I0000O = I001IIilI0O(null);
                }

/* 282 */       public I00Ol00(char c, int i) {
                    this.I00000oIO = i;
                    switch (i) {
                        case 15:
                            this.I0000Il00O = new Object[8];
                            this.I00000oOI = 0;
                            break;
                        case 16:
                            this.I0000Il00O = new Object[8];
                            this.I00000oOI = 0;
                            break;
                        default:
/* 285 */                   this.I0000Il00O = new OI110O0(new Iooo1oIo[16]);
                            break;
                    }
                }

/* 287 */       public I00Ol00(int i, int i2) {
                    this.I00000oIO = i2;
                    switch (i2) {
                        case PoseLandmark.RIGHT_INDEX:
                            this.I0000Il00O = new Object[i + i];
                            this.I00000oOI = 0;
                            break;
                        case PoseLandmark.LEFT_THUMB:
                        default:
/* 289 */                   this.I0000Il00O = new Object[i * 2];
/* 290 */                   this.I00000oOI = 0;
                            break;
                        case PoseLandmark.RIGHT_THUMB:
                            this.I0000Il00O = new Object[i + i];
                            this.I00000oOI = 0;
                            break;
                    }
                }
            }
