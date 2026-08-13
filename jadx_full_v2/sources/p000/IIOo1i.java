            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.graphics.Bitmap;
            import android.graphics.RectF;
            import android.os.Build;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedInputStream;
            import java.io.File;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.PushbackInputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            
/* 11 */    public class IIOo1i {
                public static final int[] I0000O = {8, 16, 32};
                public static final IIOo1i I0000oI00 = new IIOo1i(true, (String) null, (Exception) null);
                public final int I00000oIO;
                public boolean I00000oOI;
                public Object I0000Il00O;

                public IIOo1i(O1I1OO o1i1oo) {
/* 2 */             this.I00000oIO = 4;
/* 7 */             this.I0000Il00O = o1i1oo;
/* 10 */            this.I00000oOI = true;
                }

                public static void I00000oOI(IIOo110 iIOo110, String str, String str2) throws IOException {
/* 1 */             String str3 = iIOo110.I00000oIO;
/* 7 */             if (str3.equals(str)) {
/* 9 */                 return;
                    }
/* 18 */            IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000oI1ioi("Error : ~", str2, " contains an unexpected operator : ", str3));
                }

                public static IIOo1i I0000Il00O(Context context, IIo0l1 iIo0l1) {
/* 4 */             IIOo1i iIOo1i = new IIOo1i(3);
/* 11 */            boolean z = false;
/* 18 */            iIOo1i.I00000oOI = context.getDeviceId() != 0;
/* 20 */            PackageManager packageManager = context.getPackageManager();
/* 31 */            Integer numI00000oOI = iIo0l1 != null ? iIo0l1.I00000oOI() : null;
/* 34 */            boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
/* 40 */            boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
/* 56 */            boolean z2 = zHasSystemFeature && (numI00000oOI == null || numI00000oOI.intValue() == 1);
/* 57 */            if (zHasSystemFeature2 && (numI00000oOI == null || numI00000oOI.intValue() == 0)) {
/* 67 */                z = true;
                    }
/* 70 */            IIoIii1o1 iIoIii1o1 = new IIoIii1o1();
/* 73 */            iIoIii1o1.I00000oIO = z2;
/* 75 */            iIoIii1o1.I00000oOI = z;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            iIOo1i.I0000Il00O = iIoIii1o1;
/* 82 */            VarHandle.storeStoreFence();
/* 89 */            return iIOo1i;
                }

                public static int I0000O(byte[] bArr) {
/* 4 */             int i = bArr[0] & 255;
                    return bArr.length == 2 ? (i << 8) + (bArr[1] & 255) : i;
                }

                public static BufferedInputStream I0001Ioi1lo(String str) throws IOException {
/* 5 */             if (l1lioOO00.I00000oOI()) {
/* 27 */                return new BufferedInputStream(l1lioOO00.I00000oIO("com/tom_roush/fontbox/resources/cmap/" + str));
                    }
/* 47 */            InputStream resourceAsStream = IIOo1i.class.getResourceAsStream("/com/tom_roush/fontbox/resources/cmap/" + str);
/* 51 */            if (resourceAsStream != null) {
/* 55 */                return new BufferedInputStream(resourceAsStream);
                    }
/* 65 */            IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I000o00OoI0I("Error: Could not find referenced cmap stream ", str));
/* 68 */            return null;
                }

                public static boolean I000II(Set set, IIo0l1 iIo0l1) {
                    try {
/* 8 */                 iIo0l1.I0000Il00O(new LinkedHashSet(set));
/* 11 */                return true;
                    } catch (IllegalArgumentException unused) {
/* 13 */                return false;
                    }
                }

                public static boolean I000O01llI0(int i, boolean z, byte[] bArr) {
/* 2 */             if (i <= 0 || (bArr[i] & 255) != 255) {
/* 26 */                bArr[i] = (byte) (bArr[i] + 1);
/* 1 */                 return true;
                    }
/* 12 */            if (z) {
/* 11 */                return false;
                    }
/* 15 */            bArr[i] = 0;
/* 18 */            I000O01llI0(i - 1, z, bArr);
/* 1 */             return true;
                }

                public static boolean I000OiO(int i) {
                    return i == 37 || i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 123 || i == 125 || i == 40 || i == 41;
                }

                public static boolean I000iOII(int i) {
                    return i == -1 || i == 32 || i == 13 || i == 10;
                }

                public static i01oioio I000l1(Bitmap bitmap) {
/* 18 */            float fMin = Math.min(640.0f / bitmap.getWidth(), 640.0f / bitmap.getHeight());
/* 28 */            int width = (int) (bitmap.getWidth() * fMin);
/* 35 */            int height = (int) (bitmap.getHeight() * fMin);
/* 38 */            int i = (640 - width) / 2;
/* 42 */            int i2 = (640 - height) / 2;
/* 45 */            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
/* 52 */            float[] fArr = new float[1228800];
/* 55 */            for (int i3 = 0; i3 < 1228800; i3++) {
/* 59 */                fArr[i3] = 114.0f;
                    }
/* 66 */            int[] iArr = new int[width * height];
/* 72 */            bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
/* 76 */            for (int i4 = 0; i4 < height; i4++) {
/* 82 */                int i5 = ((i4 + i2) * 640) + i;
/* 84 */                for (int i6 = 0; i6 < width; i6++) {
/* 89 */                    int i7 = iArr[(i4 * width) + i6];
/* 93 */                    int i8 = (i5 + i6) * 3;
/* 100 */                   fArr[i8] = (i7 >> 16) & 255;
/* 109 */                   fArr[i8 + 1] = (i7 >> 8) & 255;
/* 116 */                   fArr[i8 + 2] = i7 & 255;
                        }
                    }
/* 124 */           if (bitmapCreateScaledBitmap != bitmap) {
/* 126 */               bitmapCreateScaledBitmap.recycle();
                    }
/* 131 */           i01oioio i01oioioVar = new i01oioio();
/* 134 */           i01oioioVar.I00000oIO = fArr;
/* 136 */           i01oioioVar.I00000oOI = fMin;
/* 138 */           i01oioioVar.I0000Il00O = i;
/* 140 */           i01oioioVar.I0000O = i2;
/* 142 */           VarHandle.storeStoreFence();
/* 186 */           return i01oioioVar;
                }

                public static String I001i1O0Ol(String str) {
                    Object next;
/* 3 */             File file = new File(str);
/* 10 */            if (file.isFile()) {
/* 12 */                return file.getAbsolutePath();
                    }
/* 23 */            Iterator it = IlIl10.I000l1(file, IlIl0l1lO.I00iOIl).iterator();
                    while (true) {
/* 28 */                I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 35 */                if (!i011lIilI0lo.hasNext()) {
/* 63 */                    next = null;
                            break;
                        }
/* 37 */                next = i011lIilI0lo.next();
/* 42 */                File file2 = (File) next;
/* 48 */                if (file2.isFile() && IlIl10.I0001Ioi1lo(file2).equals("tflite")) {
                            break;
                        }
                    }
/* 64 */            File file3 = (File) next;
/* 66 */            if (file3 == null) {
/* 76 */                Log.e("BoxAssistYolox", "No .tflite at ".concat(str));
                    }
/* 79 */            if (file3 != null) {
/* 81 */                return file3.getAbsolutePath();
                    }
/* 34 */            return null;
                }

                public static IIOo1i I001lllioOl(String str) {
/* 5 */             return new IIOo1i(false, str, (Exception) null);
                }

                public static IIOo1i I001lloI(String str, Exception exc) {
/* 4 */             return new IIOo1i(false, str, exc);
                }

                public void I00000oIO(IIOo0liIi iIOo0liIi, byte[] bArr, int i, byte[] bArr2) {
/* 3 */             for (int i2 = 0; i2 < i; i2++) {
/* 19 */                iIOo0liIi.I00000oIO(new String(bArr2, bArr2.length == 1 ? IO1IOO01oiO.I00000oIO : IO1IOO01oiO.I0000Il00O), bArr);
/* 30 */                if (!I000O01llI0(bArr2.length - 1, this.I00000oOI, bArr2)) {
/* 483 */                   return;
                        }
/* 35 */                I000O01llI0(bArr.length - 1, false, bArr);
                    }
                }

                public List I0000oI00(float[] fArr, i01oioio i01oioioVar, int i, int i2, float f) {
                    float f2;
                    float f3;
                    float fExp;
                    int i3;
                    int i4;
                    float fExp2;
/* 3 */             float[] fArr2 = fArr;
/* 6 */             int length = fArr2.length / 85;
/* 8 */             boolean z = this.I00000oOI;
/* 12 */            int[] iArr = I0000O;
/* 15 */            if (!z) {
/* 18 */                this.I00000oOI = true;
/* 20 */                int length2 = fArr2.length;
/* 22 */                int i5 = 0;
/* 23 */                for (int i6 = 0; i6 < 3; i6++) {
/* 27 */                    int i7 = 640 / iArr[i6];
/* 30 */                    i5 += i7 * i7;
                        }
/* 40 */                StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("YOLOX output floats=", length2, " -> ", length, " anchors x 85 (expected ");
/* 44 */                sbI0010I0i.append(i5);
/* 49 */                sbI0010I0i.append(" anchors for 640px). Verify layout on device.");
/* 58 */                Log.i("BoxAssistYolox", sbI0010I0i.toString());
                    }
/* 61 */            if (length == 0 || fArr2.length % 85 != 0) {
/* 522 */               return Il01100l.I00iOIl;
                    }
/* 72 */            ArrayList arrayList = new ArrayList();
/* 76 */            for (int i8 = 0; i8 < 3; i8++) {
/* 78 */                int i9 = iArr[i8];
/* 80 */                int i10 = 640 / i9;
/* 83 */                for (int i11 = 0; i11 < i10; i11++) {
/* 86 */                    for (int i12 = 0; i12 < i10; i12++) {
/* 90 */                        i01oioil1Ol i01oioil1ol = new i01oioil1Ol();
/* 93 */                        i01oioil1ol.I00000oIO = i12;
/* 95 */                        i01oioil1ol.I00000oOI = i11;
/* 97 */                        i01oioil1ol.I0000Il00O = i9;
/* 99 */                        VarHandle.storeStoreFence();
/* 102 */                       arrayList.add(i01oioil1ol);
                            }
                        }
                    }
/* 116 */           ArrayList arrayList2 = new ArrayList();
/* 123 */           int iMin = Math.min(length, arrayList.size());
/* 127 */           int i13 = 0;
/* 128 */           while (i13 < iMin) {
/* 130 */               int i14 = i13 * 85;
/* 136 */               i01oioil1Ol i01oioil1ol2 = (i01oioil1Ol) arrayList.get(i13);
/* 145 */               float f4 = fArr2[i14] + i01oioil1ol2.I00000oIO;
/* 142 */               float f5 = i01oioil1ol2.I0000Il00O;
/* 147 */               float f6 = f4 * f5;
/* 156 */               float f7 = (fArr2[i14 + 1] + i01oioil1ol2.I00000oOI) * f5;
/* 167 */               float fExp3 = ((float) Math.exp(fArr2[i14 + 2])) * f5;
/* 178 */               float fExp4 = ((float) Math.exp(fArr2[i14 + 3])) * f5;
/* 181 */               float f8 = fArr2[i14 + 4];
/* 188 */               if (f8 < 0.0f || f8 > 1.0f) {
/* 204 */                   f2 = 1.0f;
/* 206 */                   f3 = fExp3;
/* 215 */                   fExp = 1.0f / (((float) Math.exp(-f8)) + 1.0f);
                        } else {
/* 195 */                   fExp = lIiioliIlo.I00000oOI(f8, 0.0f, 1.0f);
/* 199 */                   f2 = 1.0f;
/* 201 */                   f3 = fExp3;
                        }
/* 219 */               if (fExp >= f) {
/* 221 */                   float f9 = 0.0f;
/* 222 */                   float f10 = 0.0f;
/* 224 */                   int i15 = 0;
/* 225 */                   int i16 = 0;
/* 229 */                   while (i15 < 80) {
/* 234 */                       float f11 = fArr2[i14 + 5 + i15];
/* 238 */                       if (f11 < f10 || f11 > f2) {
/* 244 */                           i4 = iMin;
/* 246 */                           float f12 = f2;
/* 271 */                           fExp2 = f12 / (((float) Math.exp(-f11)) + f12);
                                } else {
/* 249 */                           i4 = iMin;
/* 255 */                           fExp2 = lIiioliIlo.I00000oOI(f11, f10, f2);
                                }
/* 275 */                       if (fExp2 > f9) {
/* 277 */                           i16 = i15;
/* 279 */                           f9 = fExp2;
                                }
/* 280 */                       i15++;
/* 282 */                       fArr2 = fArr;
/* 284 */                       iMin = i4;
/* 286 */                       f2 = 1.0f;
/* 288 */                       f10 = 0.0f;
                            }
/* 291 */                   i3 = iMin;
/* 293 */                   float f13 = fExp * f9;
/* 297 */                   if (f13 >= f) {
/* 301 */                       float f14 = f3 / 2.0f;
/* 307 */                       float f15 = i01oioioVar.I0000Il00O;
/* 311 */                       float f16 = i01oioioVar.I00000oOI;
/* 314 */                       float f17 = fExp4 / 2.0f;
/* 317 */                       float f18 = i01oioioVar.I0000O;
/* 324 */                       float f19 = ((f6 + f14) - f15) / f16;
                                float f20 = i;
                                float f21 = i2;
/* 353 */                       RectF rectF = new RectF(lIiioliIlo.I00000oOI(((f6 - f14) - f15) / f16, 0.0f, f20), lIiioliIlo.I00000oOI(((f7 - f17) - f18) / f16, 0.0f, f21), lIiioliIlo.I00000oOI(f19, 0.0f, f20), lIiioliIlo.I00000oOI(((f7 + f17) - f18) / f16, 0.0f, f21));
/* 364 */                       if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
/* 375 */                           List list = II1o1O1O1iIi.I00000oOI;
/* 377 */                           int i17 = i16;
/* 396 */                           String str = (String) ((i17 < 0 || i17 >= list.size()) ? "object" : list.get(i17));
/* 404 */                           float fCenterX = rectF.centerX() / f20;
/* 439 */                           arrayList2.add(new IiOoOOO(str, f13, rectF, IiO0i0O.I00ilI0I1, fCenterX < 0.34f ? "on your left" : fCenterX > 0.66f ? "on your right" : "ahead"));
                                }
                            }
                        } else {
/* 454 */                   i3 = iMin;
                        }
/* 458 */               i13++;
/* 460 */               fArr2 = fArr;
/* 462 */               iMin = i3;
                    }
/* 480 */           ArrayList arrayList3 = new ArrayList(IOOi0Ool1i.I00Ol1ll1(arrayList2, new OiOIlO1OII0(7)));
/* 485 */           ArrayList arrayList4 = new ArrayList();
/* 492 */           while (!arrayList3.isEmpty()) {
/* 499 */               IiOoOOO iiOoOOO = (IiOoOOO) arrayList3.remove(0);
/* 501 */               arrayList4.add(iiOoOOO);
/* 507 */               i01O0010i i01o0010i = new i01O0010i(5);
/* 510 */               i01o0010i.I00iiI = this;
/* 512 */               i01o0010i.I00iiO = iiOoOOO;
/* 514 */               VarHandle.storeStoreFence();
/* 517 */               IOOii0O10Io0.I0010I0i(arrayList3, i01o0010i);
                    }
/* 521 */           return arrayList4;
                }

                public boolean I000OOo1O(LinkedHashSet linkedHashSet, Set set) {
/* 3 */             IIoIii1o1 iIoIii1o1 = (IIoIii1o1) this.I0000Il00O;
/* 8 */             if (!this.I00000oOI) {
/* 10 */                boolean z = iIoIii1o1.I00000oIO;
/* 12 */                boolean z2 = iIoIii1o1.I00000oOI;
/* 14 */                if (z || z2) {
/* 22 */                    boolean zI000II = I000II(linkedHashSet, IIo0l1.I0000Il00O);
/* 28 */                    boolean zI000II2 = I000II(linkedHashSet, IIo0l1.I00000oOI);
/* 32 */                    Set set2 = set;
/* 42 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set2, 10));
/* 45 */                    Iterator it = set2.iterator();
/* 53 */                    while (it.hasNext()) {
/* 65 */                        arrayList.add(((IIllII) it.next()).I00000oIO());
                            }
/* 69 */                    Set setI00iio = IOOi0Ool1i.I00iio(arrayList);
/* 75 */                    ArrayList arrayList2 = new ArrayList();
/* 86 */                    for (Object obj : linkedHashSet) {
/* 107 */                       if (!setI00iio.contains(((IIllOo0) obj).I0010o().I0001Ioi1lo())) {
/* 109 */                           arrayList2.add(obj);
                                }
                            }
/* 113 */                   Set setI00iio2 = IOOi0Ool1i.I00iio(arrayList2);
/* 119 */                   boolean zI000II3 = I000II(setI00iio2, IIo0l1.I0000Il00O);
/* 125 */                   boolean zI000II4 = I000II(setI00iio2, IIo0l1.I00000oOI);
/* 140 */                   boolean z3 = iIoIii1o1.I00000oIO && zI000II && !zI000II3;
/* 149 */                   boolean z4 = z2 && zI000II2 && !zI000II4;
/* 150 */                   if (z3 || z4) {
/* 131 */                       return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public void I000lI() {
/* 2 */             this.I00000oOI = false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:206:0x03ff, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
                
                    r18 = r4;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:164:0x031f  */
                /* JADX WARN: Type inference failed for: r12v12 */
                /* JADX WARN: Type inference failed for: r12v4 */
                /* JADX WARN: Type inference failed for: r12v5, types: [IIOlIlOl] */
                /* JADX WARN: Type inference failed for: r3v0 */
                /* JADX WARN: Type inference failed for: r3v23 */
                /* JADX WARN: Type inference failed for: r3v24 */
                /* JADX WARN: Type inference failed for: r3v31 */
                /* JADX WARN: Type inference failed for: r3v33 */
                /* JADX WARN: Type inference failed for: r3v34 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IIOo0liIi I000o00OoI0I(FilterInputStream filterInputStream) throws IOException {
                    char c;
                    IIOo0liIi iIOo0liIi;
/* 7 */             PushbackInputStream pushbackInputStream = new PushbackInputStream(filterInputStream);
/* 12 */            IIOo0liIi iIOo0liIi2 = new IIOo0liIi();
/* 15 */            byte b = 0;
/* 16 */            iIOo0liIi2.I00000oIO = 0;
/* 18 */            IIOo0liIi iIOo0liIi3 = null;
/* 19 */            iIOo0liIi2.I00000oOI = null;
/* 21 */            iIOo0liIi2.I0000Il00O = null;
/* 23 */            iIOo0liIi2.I0000O = null;
/* 26 */            iIOo0liIi2.I0000oI00 = 4;
/* 33 */            iIOo0liIi2.I000II = new ArrayList();
/* 40 */            iIOo0liIi2.I000O01llI0 = new HashMap();
/* 47 */            iIOo0liIi2.I000OOo1O = new HashMap();
/* 54 */            iIOo0liIi2.I000OiO = new HashMap();
/* 58 */            ArrayList arrayList = new ArrayList();
/* 61 */            iIOo0liIi2.I000iOII = arrayList;
/* 64 */            iIOo0liIi2.I000l1 = -1;
/* 66 */            VarHandle.storeStoreFence();
/* 69 */            Object obj = null;
                    while (true) {
/* 70 */                Object objI000oI1ioi = I000oI1ioi(pushbackInputStream);
/* 74 */                if (objI000oI1ioi == null) {
                            break;
                        }
/* 78 */                if (objI000oI1ioi instanceof IIOo110) {
/* 83 */                    String str = ((IIOo110) objI000oI1ioi).I00000oIO;
/* 91 */                    if (str.equals("endcmap")) {
                                break;
                            }
/* 95 */                    if (obj == null) {
/* 184 */                       c = b;
/* 185 */                       iIOo0liIi = iIOo0liIi3;
                            } else {
/* 103 */                       if (str.equals("usecmap") && (obj instanceof IIOo0oil0IOi)) {
/* 117 */                           IIOo0liIi iIOo0liIiI000o00OoI0I = I000o00OoI0I(I0001Ioi1lo(((IIOo0oil0IOi) obj).I00000oIO));
/* 123 */                           Iterator it = iIOo0liIiI000o00OoI0I.I000II.iterator();
/* 131 */                           while (it.hasNext()) {
/* 137 */                               IOOOiol1I1O iOOOiol1I1O = (IOOOiol1I1O) it.next();
/* 141 */                               iIOo0liIi2.I000II.add(iOOOiol1I1O);
/* 152 */                               iIOo0liIi2.I0001Ioi1lo = Math.max(iIOo0liIi2.I0001Ioi1lo, iOOOiol1I1O.I0000Il00O);
/* 162 */                               iIOo0liIi2.I0000oI00 = Math.min(iIOo0liIi2.I0000oI00, iOOOiol1I1O.I0000Il00O);
                                    }
/* 169 */                           iIOo0liIi2.I000O01llI0.putAll(iIOo0liIiI000o00OoI0I.I000O01llI0);
/* 176 */                           iIOo0liIi2.I000OiO.putAll(iIOo0liIiI000o00OoI0I.I000OiO);
/* 181 */                           arrayList.addAll(iIOo0liIiI000o00OoI0I.I000iOII);
                                } else if (obj instanceof Number) {
/* 201 */                           if (str.equals("begincodespacerange")) {
/* 203 */                               Number number = (Number) obj;
/* 205 */                               int i = b;
                                        while (true) {
/* 210 */                                   if (i >= number.intValue()) {
                                                break;
                                            }
/* 212 */                                   Object objI000oI1ioi2 = I000oI1ioi(pushbackInputStream);
/* 218 */                                   if (objI000oI1ioi2 instanceof IIOo110) {
/* 226 */                                       I00000oOI((IIOo110) objI000oI1ioi2, "endcodespacerange", "codespacerange");
                                                break;
                                            }
/* 232 */                                   if (!(objI000oI1ioi2 instanceof byte[])) {
/* 280 */                                       IioIoO10iOiI.I000OOo1O("start range missing");
/* 283 */                                       return iIOo0liIi3;
                                            }
                                            try {
/* 244 */                                       IOOOiol1I1O iOOOiol1I1O2 = new IOOOiol1I1O((byte[]) objI000oI1ioi2, (byte[]) I000oI1ioi(pushbackInputStream));
/* 247 */                                       int i2 = iOOOiol1I1O2.I0000Il00O;
/* 251 */                                       iIOo0liIi2.I000II.add(iOOOiol1I1O2);
/* 260 */                                       iIOo0liIi2.I0001Ioi1lo = Math.max(iIOo0liIi2.I0001Ioi1lo, i2);
/* 268 */                                       iIOo0liIi2.I0000oI00 = Math.min(iIOo0liIi2.I0000oI00, i2);
/* 270 */                                       i++;
                                            } catch (IllegalArgumentException e) {
/* 279 */                                       throw new IOException(e);
                                            }
                                        }
                                    } else if (str.equals("beginbfchar")) {
/* 293 */                               Number number2 = (Number) obj;
/* 295 */                               int i3 = b;
                                        while (true) {
/* 300 */                                   if (i3 >= number2.intValue()) {
                                                break;
                                            }
/* 302 */                                   Object objI000oI1ioi3 = I000oI1ioi(pushbackInputStream);
/* 308 */                                   if (objI000oI1ioi3 instanceof IIOo110) {
/* 316 */                                       I00000oOI((IIOo110) objI000oI1ioi3, "endbfchar", "bfchar");
                                                break;
                                            }
/* 323 */                                   if (!(objI000oI1ioi3 instanceof byte[])) {
/* 376 */                                       IioIoO10iOiI.I000OOo1O("input code missing");
/* 379 */                                       return iIOo0liIi3;
                                            }
/* 325 */                                   byte[] bArr = (byte[]) objI000oI1ioi3;
/* 327 */                                   Object objI000oI1ioi4 = I000oI1ioi(pushbackInputStream);
/* 333 */                                   if (objI000oI1ioi4 instanceof byte[]) {
/* 335 */                                       byte[] bArr2 = (byte[]) objI000oI1ioi4;
/* 350 */                                       iIOo0liIi2.I00000oIO(new String(bArr2, bArr2.length == 1 ? IO1IOO01oiO.I00000oIO : IO1IOO01oiO.I0000Il00O), bArr);
                                            } else {
/* 356 */                                       if (!(objI000oI1ioi4 instanceof IIOo0oil0IOi)) {
/* 370 */                                           IOOlIIilOl0.I000l1("Error parsing CMap beginbfchar, expected{COSString or COSName} and not ", objI000oI1ioi4);
/* 373 */                                           return iIOo0liIi3;
                                                }
/* 362 */                                       iIOo0liIi2.I00000oIO(((IIOo0oil0IOi) objI000oI1ioi4).I00000oIO, bArr);
                                            }
/* 365 */                                   i3++;
                                        }
                                    } else {
/* 389 */                               if (str.equals("beginbfrange")) {
/* 391 */                                   Number number3 = (Number) obj;
/* 393 */                                   int i4 = b;
                                            while (true) {
/* 398 */                                       if (i4 >= number3.intValue()) {
                                                    break;
                                                }
/* 400 */                                       Object objI000oI1ioi5 = I000oI1ioi(pushbackInputStream);
/* 410 */                                       if (objI000oI1ioi5 instanceof IIOo110) {
/* 414 */                                           I00000oOI((IIOo110) objI000oI1ioi5, "endbfrange", "bfrange");
                                                    break;
                                                }
/* 423 */                                       if (!(objI000oI1ioi5 instanceof byte[])) {
/* 589 */                                           IIOo0liIi iIOo0liIi4 = iIOo0liIi3;
/* 591 */                                           IioIoO10iOiI.I000OOo1O("start code missing");
/* 594 */                                           return iIOo0liIi4;
                                                }
/* 425 */                                       byte[] bArr3 = (byte[]) objI000oI1ioi5;
/* 427 */                                       Object objI000oI1ioi6 = I000oI1ioi(pushbackInputStream);
/* 431 */                                       iIOo0liIi = iIOo0liIi3;
/* 435 */                                       if (objI000oI1ioi6 instanceof IIOo110) {
/* 439 */                                           I00000oOI((IIOo110) objI000oI1ioi6, "endbfrange", "bfrange");
                                                    break;
                                                }
/* 446 */                                       if (!(objI000oI1ioi6 instanceof byte[])) {
/* 585 */                                           IioIoO10iOiI.I000OOo1O("end code missing");
/* 588 */                                           return iIOo0liIi;
                                                }
/* 448 */                                       byte[] bArr4 = (byte[]) objI000oI1ioi6;
/* 451 */                                       int iI0000Il00O = IIOo0liIi.I0000Il00O(bArr3.length, bArr3);
/* 456 */                                       int iI0000Il00O2 = IIOo0liIi.I0000Il00O(bArr4.length, bArr4);
/* 460 */                                       if (iI0000Il00O2 < iI0000Il00O) {
                                                    break;
                                                }
/* 464 */                                       Object objI000oI1ioi7 = I000oI1ioi(pushbackInputStream);
/* 470 */                                       if (objI000oI1ioi7 instanceof List) {
/* 472 */                                           List<byte[]> list = (List) objI000oI1ioi7;
/* 478 */                                           if (!list.isEmpty() && list.size() >= iI0000Il00O2 - iI0000Il00O) {
/* 495 */                                               for (byte[] bArr5 : list) {
/* 516 */                                                   iIOo0liIi2.I00000oIO(new String(bArr5, bArr5.length == 1 ? IO1IOO01oiO.I00000oIO : IO1IOO01oiO.I0000Il00O), bArr3);
/* 521 */                                                   I000O01llI0(bArr3.length - 1, b, bArr3);
                                                        }
                                                    }
                                                } else if (objI000oI1ioi7 instanceof byte[]) {
/* 529 */                                           byte[] bArr6 = (byte[]) objI000oI1ioi7;
/* 532 */                                           if (bArr6.length > 0) {
/* 535 */                                               if (bArr6.length == 2 && iI0000Il00O == 0 && iI0000Il00O2 == 65535 && bArr6[b] == 0 && bArr6[1] == 0) {
/* 555 */                                                   for (int i5 = b; i5 < 256; i5++) {
/* 557 */                                                       byte b2 = (byte) i5;
/* 558 */                                                       bArr3[b] = b2;
/* 560 */                                                       bArr3[1] = b;
/* 562 */                                                       bArr6[b] = b2;
/* 564 */                                                       bArr6[1] = b;
/* 566 */                                                       I00000oIO(iIOo0liIi2, bArr3, Barcode.FORMAT_QR_CODE, bArr6);
                                                            }
                                                        } else {
/* 574 */                                                   I00000oIO(iIOo0liIi2, bArr3, (iI0000Il00O2 - iI0000Il00O) + 1, bArr6);
                                                        }
                                                    }
                                                }
/* 577 */                                       i4++;
/* 579 */                                       iIOo0liIi3 = iIOo0liIi;
                                            }
                                        } else {
/* 595 */                                   iIOo0liIi = iIOo0liIi3;
/* 603 */                                   if (str.equals("begincidchar")) {
/* 605 */                                       Number number4 = (Number) obj;
/* 607 */                                       int i6 = b;
                                                while (true) {
/* 612 */                                           if (i6 >= number4.intValue()) {
                                                        break;
                                                    }
/* 614 */                                           Object objI000oI1ioi8 = I000oI1ioi(pushbackInputStream);
/* 620 */                                           if (objI000oI1ioi8 instanceof IIOo110) {
/* 628 */                                               I00000oOI((IIOo110) objI000oI1ioi8, "endcidchar", "cidchar");
                                                        break;
                                                    }
/* 634 */                                           if (!(objI000oI1ioi8 instanceof byte[])) {
/* 663 */                                               IioIoO10iOiI.I000OOo1O("start code missing");
/* 666 */                                               return iIOo0liIi;
                                                    }
/* 642 */                                           Integer num = (Integer) I000oI1ioi(pushbackInputStream);
/* 644 */                                           num.getClass();
/* 657 */                                           iIOo0liIi2.I000OiO.put(Integer.valueOf(I0000O((byte[]) objI000oI1ioi8)), num);
/* 660 */                                           i6++;
                                                }
                                            } else if (str.equals("begincidrange") && (obj instanceof Integer)) {
/* 681 */                                       int iIntValue = ((Integer) obj).intValue();
/* 685 */                                       int i7 = b;
                                                b = b;
                                                while (true) {
/* 686 */                                           if (i7 >= iIntValue) {
                                                        break;
                                                    }
/* 688 */                                           Object objI000oI1ioi9 = I000oI1ioi(pushbackInputStream);
/* 694 */                                           if (objI000oI1ioi9 instanceof IIOo110) {
/* 702 */                                               I00000oOI((IIOo110) objI000oI1ioi9, "endcidrange", "cidrange");
                                                        break;
                                                    }
/* 710 */                                           if (!(objI000oI1ioi9 instanceof byte[])) {
/* 859 */                                               IioIoO10iOiI.I000OOo1O("start range missing");
/* 862 */                                               return iIOo0liIi;
                                                    }
/* 712 */                                           byte[] bArr7 = (byte[]) objI000oI1ioi9;
/* 714 */                                           int iI0000O = I0000O(bArr7);
/* 722 */                                           byte[] bArr8 = (byte[]) I000oI1ioi(pushbackInputStream);
/* 724 */                                           int iI0000O2 = I0000O(bArr8);
/* 732 */                                           Integer num2 = (Integer) I000oI1ioi(pushbackInputStream);
/* 734 */                                           int iIntValue2 = num2.intValue();
/* 739 */                                           if (bArr7.length > 2 || bArr8.length > 2) {
/* 819 */                                               int i8 = (iI0000O2 + iIntValue2) - iI0000O;
/* 820 */                                               while (iIntValue2 <= i8) {
/* 838 */                                                   iIOo0liIi2.I000OiO.put(Integer.valueOf(I0000O(bArr7)), Integer.valueOf(iIntValue2));
/* 847 */                                                   I000O01llI0(bArr7.length - 1, false, bArr7);
/* 826 */                                                   iIntValue2++;
                                                        }
                                                    } else if (iI0000O2 == iI0000O) {
/* 752 */                                               iIOo0liIi2.I000OiO.put(Integer.valueOf(iI0000O), num2);
                                                    } else {
/* 759 */                                               char c2 = (char) iI0000O;
/* 760 */                                               char c3 = (char) iI0000O2;
/* 775 */                                               ?? r12 = !arrayList.isEmpty() ? (IIOlIlOl) IIl001iO0Io.I000OiO(1, arrayList) : iIOo0liIi;
/* 777 */                                               if (r12 != 0) {
/* 779 */                                                   char c4 = r12.I00000oOI;
/* 783 */                                                   if (c2 == c4 + 1 && iIntValue2 == ((r12.I0000Il00O + c4) - r12.I00000oIO) + 1) {
/* 797 */                                                       r12.I00000oOI = c3;
                                                            } else {
/* 802 */                                                       IIOlIlOl iIOlIlOl = new IIOlIlOl();
/* 805 */                                                       iIOlIlOl.I00000oIO = c2;
/* 807 */                                                       iIOlIlOl.I00000oOI = c3;
/* 809 */                                                       iIOlIlOl.I0000Il00O = iIntValue2;
/* 811 */                                                       VarHandle.storeStoreFence();
/* 814 */                                                       arrayList.add(iIOlIlOl);
                                                            }
                                                        }
                                                    }
/* 852 */                                           i7++;
/* 854 */                                           b = 0;
                                                }
                                            }
                                        }
/* 705 */                               c = b;
                                    }
                                }
/* 184 */                       c = b;
/* 185 */                       iIOo0liIi = iIOo0liIi3;
                            }
                        } else {
/* 863 */                   c = b;
/* 864 */                   iIOo0liIi = iIOo0liIi3;
/* 868 */                   if (objI000oI1ioi instanceof IIOo0oil0IOi) {
/* 873 */                       String str2 = ((IIOo0oil0IOi) objI000oI1ioi).I00000oIO;
/* 881 */                       if ("WMode".equals(str2)) {
/* 883 */                           Object objI000oI1ioi10 = I000oI1ioi(pushbackInputStream);
/* 889 */                           if (objI000oI1ioi10 instanceof Integer) {
/* 897 */                               iIOo0liIi2.I00000oIO = ((Integer) objI000oI1ioi10).intValue();
                                    }
                                } else if ("CMapName".equals(str2)) {
/* 909 */                           Object objI000oI1ioi11 = I000oI1ioi(pushbackInputStream);
/* 915 */                           if (objI000oI1ioi11 instanceof IIOo0oil0IOi) {
/* 921 */                               iIOo0liIi2.I00000oOI = ((IIOo0oil0IOi) objI000oI1ioi11).I00000oIO;
                                    }
                                } else if ("CMapVersion".equals(str2)) {
/* 932 */                           Object objI000oI1ioi12 = I000oI1ioi(pushbackInputStream);
/* 938 */                           if (objI000oI1ioi12 instanceof Number) {
/* 940 */                               objI000oI1ioi12.toString();
                                    } else {
/* 944 */                               boolean z = objI000oI1ioi12 instanceof String;
                                    }
                                } else if ("CMapType".equals(str2)) {
/* 959 */                           boolean z2 = I000oI1ioi(pushbackInputStream) instanceof Integer;
                                } else if ("Registry".equals(str2)) {
/* 970 */                           Object objI000oI1ioi13 = I000oI1ioi(pushbackInputStream);
/* 976 */                           if (objI000oI1ioi13 instanceof String) {
/* 980 */                               iIOo0liIi2.I0000Il00O = (String) objI000oI1ioi13;
                                    }
                                } else if ("Ordering".equals(str2)) {
/* 991 */                           Object objI000oI1ioi14 = I000oI1ioi(pushbackInputStream);
/* 997 */                           if (objI000oI1ioi14 instanceof String) {
/* 1001 */                              iIOo0liIi2.I0000O = (String) objI000oI1ioi14;
                                    }
                                } else if ("Supplement".equals(str2)) {
/* 1016 */                          boolean z3 = I000oI1ioi(pushbackInputStream) instanceof Integer;
                                }
                            }
                        }
/* 1018 */              iIOo0liIi3 = iIOo0liIi;
/* 1020 */              obj = objI000oI1ioi;
/* 1021 */              b = c;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:49:0x00ad, B:51:0x00b3, B:55:0x00ba), top: B:142:0x00ad }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[Catch: NumberFormatException -> 0x00b8, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:49:0x00ad, B:51:0x00b3, B:55:0x00ba), top: B:142:0x00ad }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000oI1ioi(PushbackInputStream pushbackInputStream) throws IOException {
                    int i;
                    String string;
/* 3 */             byte[] bArr = (byte[]) this.I0000Il00O;
/* 5 */             int i2 = pushbackInputStream.read();
                    while (true) {
/* 11 */                if (i2 != 9 && i2 != 32 && i2 != 13 && i2 != 10) {
                            break;
                        }
/* 536 */               i2 = pushbackInputStream.read();
                    }
/* 29 */            if (i2 == -1) {
/* 28 */                return null;
                    }
/* 33 */            if (i2 == 37) {
/* 504 */               StringBuilder sb = new StringBuilder();
/* 508 */               sb.append((char) i2);
/* 511 */               int i3 = pushbackInputStream.read();
/* 515 */               while (i3 != -1 && i3 != 13 && i3 != 10) {
/* 522 */                   sb.append((char) i3);
/* 525 */                   i3 = pushbackInputStream.read();
                        }
/* 530 */               return sb.toString();
                    }
/* 37 */            if (i2 == 40) {
/* 475 */               StringBuilder sb2 = new StringBuilder();
/* 478 */               int i4 = pushbackInputStream.read();
/* 482 */               while (i4 != -1 && i4 != 41) {
/* 489 */                   sb2.append((char) i4);
/* 492 */                   i4 = pushbackInputStream.read();
                        }
/* 497 */               return sb2.toString();
                    }
/* 45 */            if (i2 == 60) {
/* 297 */               int i5 = pushbackInputStream.read();
/* 301 */               if (i5 == 60) {
/* 305 */                   HashMap map = new HashMap();
/* 308 */                   Object objI000oI1ioi = I000oI1ioi(pushbackInputStream);
/* 314 */                   while ((objI000oI1ioi instanceof IIOo0oil0IOi) && !">>".equals(objI000oI1ioi)) {
/* 330 */                       map.put(((IIOo0oil0IOi) objI000oI1ioi).I00000oIO, I000oI1ioi(pushbackInputStream));
/* 333 */                       objI000oI1ioi = I000oI1ioi(pushbackInputStream);
                            }
/* 338 */                   return map;
                        }
/* 341 */               int i6 = 16;
/* 342 */               int i7 = -1;
/* 345 */               while (i5 != -1 && i5 != 62) {
/* 351 */                   if (i5 >= 48 && i5 <= 57) {
                                i = i5 - 48;
                            } else if (i5 >= 65 && i5 <= 70) {
                                i = i5 - 55;
                            } else if (i5 >= 97 && i5 <= 102) {
                                i = i5 - 87;
                            } else {
/* 430 */                       if (!I000iOII(i5)) {
/* 465 */                           throw new IOException("Error: expected hex character and not " + ((char) i5) + ":" + i5);
                                }
/* 432 */                       i5 = pushbackInputStream.read();
                            }
/* 381 */                   int i8 = i * i6;
/* 382 */                   if (i6 == 16) {
/* 384 */                       i7++;
/* 387 */                       if (i7 >= bArr.length) {
/* 413 */                           throw new IOException("cmap token ist larger than buffer size " + bArr.length);
                                }
/* 389 */                       bArr[i7] = 0;
/* 391 */                       i6 = 1;
                            } else {
/* 414 */                       i6 = 16;
                            }
/* 419 */                   bArr[i7] = (byte) (bArr[i7] + i8);
/* 421 */                   i5 = pushbackInputStream.read();
                        }
/* 466 */               int i9 = i7 + 1;
/* 467 */               byte[] bArr2 = new byte[i9];
/* 469 */               System.arraycopy(bArr, 0, bArr2, 0, i9);
/* 472 */               return bArr2;
                    }
/* 47 */            if (i2 == 62) {
/* 288 */               if (pushbackInputStream.read() == 62) {
/* 39 */                    return ">>";
                        }
/* 293 */               IioIoO10iOiI.I000OOo1O("Error: expected the end of a dictionary.");
/* 28 */                return null;
                    }
/* 53 */            if (i2 == 91) {
/* 260 */               ArrayList arrayList = new ArrayList();
/* 263 */               Object objI000oI1ioi2 = I000oI1ioi(pushbackInputStream);
/* 267 */               while (objI000oI1ioi2 != null && !"]".equals(objI000oI1ioi2)) {
/* 275 */                   arrayList.add(objI000oI1ioi2);
/* 278 */                   objI000oI1ioi2 = I000oI1ioi(pushbackInputStream);
                        }
/* 283 */               return arrayList;
                    }
/* 57 */            if (i2 == 93) {
/* 51 */                return "]";
                    }
                    switch (i2) {
                        case 47:
/* 208 */                   StringBuilder sb3 = new StringBuilder();
/* 211 */                   int i10 = pushbackInputStream.read();
/* 219 */                   while (!I000iOII(i10) && !I000OiO(i10)) {
/* 228 */                       sb3.append((char) i10);
/* 231 */                       i10 = pushbackInputStream.read();
                            }
/* 240 */                   if (I000OiO(i10)) {
/* 242 */                       pushbackInputStream.unread(i10);
                            }
/* 247 */                   String string2 = sb3.toString();
/* 251 */                   IIOo0oil0IOi iIOo0oil0IOi = new IIOo0oil0IOi();
/* 254 */                   iIOo0oil0IOi.I00000oIO = string2;
/* 256 */                   return iIOo0oil0IOi;
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
/* 131 */                   StringBuilder sb4 = new StringBuilder();
/* 135 */                   sb4.append((char) i2);
/* 138 */                   int i11 = pushbackInputStream.read();
                            try {
/* 148 */                       while (!I000iOII(i11)) {
/* 150 */                           char c = (char) i11;
/* 155 */                           if (!Character.isDigit(c) && i11 != 46) {
/* 167 */                               pushbackInputStream.unread(i11);
/* 170 */                               string = sb4.toString();
                                        return string.indexOf(46) < 0 ? Double.valueOf(string) : Integer.valueOf(string);
                                    }
/* 159 */                           sb4.append(c);
/* 162 */                           i11 = pushbackInputStream.read();
                                }
                                if (string.indexOf(46) < 0) {
                                }
                            } catch (NumberFormatException e) {
/* 205 */                       throw new IOException(IlIi0I0.I000lI("Invalid number '", string, "'"), e);
                            }
/* 167 */                   pushbackInputStream.unread(i11);
/* 170 */                   string = sb4.toString();
                            break;
                        default:
/* 64 */                    StringBuilder sb5 = new StringBuilder();
/* 68 */                    sb5.append((char) i2);
/* 71 */                    int i12 = pushbackInputStream.read();
/* 79 */                    while (!I000iOII(i12) && !I000OiO(i12) && !Character.isDigit(i12)) {
/* 94 */                        sb5.append((char) i12);
/* 97 */                        i12 = pushbackInputStream.read();
                            }
/* 106 */                   if (I000OiO(i12) || Character.isDigit(i12)) {
/* 114 */                       pushbackInputStream.unread(i12);
                            }
/* 119 */                   String string3 = sb5.toString();
/* 123 */                   IIOo110 iIOo110 = new IIOo110();
/* 126 */                   iIOo110.I00000oIO = string3;
/* 128 */                   return iIOo110;
                    }
                }

                public void I00100l0(byte b) {
/* 10 */            ((O1I1OO) this.I0000Il00O).I001i1O0Ol(String.valueOf(b));
                }

                public void I00100o1O0lo(char c) {
/* 3 */             O1I1OO o1i1oo = (O1I1OO) this.I0000Il00O;
/* 8 */             o1i1oo.I000O01llI0(o1i1oo.I00iiI, 1);
/* 13 */            char[] cArr = (char[]) o1i1oo.I00iiO;
/* 15 */            int i = o1i1oo.I00iiI;
/* 19 */            o1i1oo.I00iiI = i + 1;
/* 21 */            cArr[i] = c;
                }

                public void I0010I0i(int i) {
/* 10 */            ((O1I1OO) this.I0000Il00O).I001i1O0Ol(String.valueOf(i));
                }

                public void I0010o(long j) {
/* 9 */             ((O1I1OO) this.I0000Il00O).I001i1O0Ol(String.valueOf(j));
                }

                public void I00111O(String str) {
/* 5 */             ((O1I1OO) this.I0000Il00O).I001i1O0Ol(str);
                }

                public void I001IIilI0O(short s) {
/* 10 */            ((O1I1OO) this.I0000Il00O).I001i1O0Ol(String.valueOf(s));
                }

                public void I001IO000(String str) {
                    byte b;
/* 3 */             O1I1OO o1i1oo = (O1I1OO) this.I0000Il00O;
/* 13 */            o1i1oo.I000O01llI0(o1i1oo.I00iiI, str.length() + 2);
/* 18 */            char[] cArr = (char[]) o1i1oo.I00iiO;
/* 20 */            int i = o1i1oo.I00iiI;
/* 22 */            int i2 = i + 1;
/* 26 */            cArr[i] = '\"';
/* 28 */            int length = str.length();
/* 33 */            str.getChars(0, length, cArr, i2);
/* 36 */            int i3 = length + i2;
/* 37 */            int i4 = i2;
/* 38 */            while (i4 < i3) {
/* 40 */                char c = cArr[i4];
/* 42 */                byte[] bArr = OlOllioI11o1.I00000oOI;
/* 45 */                if (c < bArr.length && bArr[c] != 0) {
/* 53 */                    int length2 = str.length();
/* 58 */                    for (int i5 = i4 - i2; i5 < length2; i5++) {
/* 60 */                        o1i1oo.I000O01llI0(i4, 2);
/* 63 */                        char cCharAt = str.charAt(i5);
/* 67 */                        byte[] bArr2 = OlOllioI11o1.I00000oOI;
/* 70 */                        if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
/* 80 */                            int i6 = i4 + 1;
/* 83 */                            ((char[]) o1i1oo.I00iiO)[i4] = cCharAt;
/* 85 */                            i4 = i6;
                                } else {
/* 87 */                            if (b == 1) {
/* 91 */                                String str2 = OlOllioI11o1.I00000oIO[cCharAt];
/* 97 */                                o1i1oo.I000O01llI0(i4, str2.length());
/* 108 */                               str2.getChars(0, str2.length(), (char[]) o1i1oo.I00iiO, i4);
/* 115 */                               int length3 = str2.length() + i4;
/* 116 */                               o1i1oo.I00iiI = length3;
/* 118 */                               i4 = length3;
                                    } else {
/* 122 */                               char[] cArr2 = (char[]) o1i1oo.I00iiO;
/* 126 */                               cArr2[i4] = '\\';
/* 131 */                               cArr2[i4 + 1] = (char) b;
/* 133 */                               i4 += 2;
/* 135 */                               o1i1oo.I00iiI = i4;
                                    }
                                }
                            }
/* 151 */                   o1i1oo.I000O01llI0(i4, 1);
/* 160 */                   ((char[]) o1i1oo.I00iiO)[i4] = '\"';
/* 162 */                   o1i1oo.I00iiI = i4 + 1;
/* 164 */                   return;
                        }
/* 165 */               i4++;
                    }
/* 171 */           cArr[i3] = '\"';
/* 173 */           o1i1oo.I00iiI = i3 + 1;
                }

                public void I001l0I00(IIo0ii1Oi iIo0ii1Oi) throws IIoIiOlOIiO {
/* 3 */             IIoIii1o1 iIoIii1o1 = (IIoIii1o1) this.I0000Il00O;
/* 10 */            if (this.I00000oOI) {
/* 16 */                iIo0ii1Oi.I0000Il00O().size();
/* 19 */                l11I11lO.I0000O(3, "CameraValidator");
/* 22 */                return;
                    }
/* 23 */            String str = Build.DEVICE;
/* 25 */            l11I11lO.I0000O(3, "CameraValidator");
/* 30 */            if (iIoIii1o1.I00000oIO) {
                        try {
/* 38 */                    IIo0l1.I0000Il00O.I0000Il00O(iIo0ii1Oi.I0000Il00O());
/* 49 */                    e = null;
                        } catch (RuntimeException e) {
/* 42 */                    e = e;
/* 45 */                    l11I11lO.I0001Ioi1lo("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
                        }
                    } else {
/* 49 */                e = null;
                    }
/* 52 */            if (iIoIii1o1.I00000oOI) {
                        try {
/* 60 */                    IIo0l1.I00000oOI.I0000Il00O(iIo0ii1Oi.I0000Il00O());
                        } catch (RuntimeException e2) {
/* 67 */                    l11I11lO.I0001Ioi1lo("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
/* 70 */                    if (e == null) {
/* 72 */                        e = e2;
                            }
                        }
                    }
/* 73 */            if (e == null) {
/* 75 */                return;
                    }
/* 82 */            int size = iIo0ii1Oi.I0000Il00O().size();
/* 88 */            IIoIiOlOIiO iIoIiOlOIiO = new IIoIiOlOIiO("Expected camera missing from device.", e);
/* 91 */            iIoIiOlOIiO.I00iOIl = size;
/* 93 */            VarHandle.storeStoreFence();
/* 186 */           throw iIoIiOlOIiO;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 7:
                            return this.I00000oOI ? "FALL_THROUGH" : String.valueOf(this.I0000Il00O);
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 12 */        public IIOo1i(int i, Object obj, boolean z) {
/* 13 */            this.I00000oIO = i;
                    this.I0000Il00O = obj;
                    this.I00000oOI = z;
                }

/* 13 */        public IIOo1i(boolean z, String str, Exception exc) {
                    this.I00000oIO = 2;
                    this.I00000oOI = z;
                    this.I0000Il00O = exc;
                }

/* 14 */        public IIOo1i(int i) {
/* 15 */            this.I00000oIO = i;
                }

/* 28 */        public void I001i1lo1io() {
                }

/* 28 */        public void I001iOo1i0O() {
                }

/* 28 */        public void I001lIiIIo1O() {
                }
            }
