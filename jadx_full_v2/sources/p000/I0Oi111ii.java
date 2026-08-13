            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.Shader;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Base64;
            import android.util.Log;
            import com.box.gallery.R;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedOutputStream;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.nio.ByteBuffer;
            import java.nio.charset.StandardCharsets;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.text.Normalizer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Scanner;
            import java.util.TimeZone;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
/* 567 */   public final class I0Oi111ii implements OlOO0oIio01, I111ioIIo01, I11I1001I, i0Ii0I1ll, o0lOOi0l1II {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                /* JADX WARN: Finally extract failed */
                public I0Oi111ii(File file, File file2, File file3) throws IOException {
/* 3 */             this.I00iOIl = 9;
/* 16 */            this.I00iiI = new HashMap(160000);
/* 23 */            this.I00iiO = new HashMap(160000);
/* 30 */            this.I00iio = new LinkedHashMap();
/* 34 */            ArrayList arrayList = new ArrayList();
/* 43 */            int i = 1;
/* 47 */            Iterator it = new IooO11l(33, 126, 1).iterator();
/* 56 */            while (((IooO10lI) it).I00iiO) {
/* 69 */                arrayList.add(Integer.valueOf(((IooIlO1) it).nextInt()));
                    }
/* 82 */            Iterator it2 = new IooO11l(161, 172, 1).iterator();
/* 91 */            while (((IooO10lI) it2).I00iiO) {
/* 104 */               arrayList.add(Integer.valueOf(((IooIlO1) it2).nextInt()));
                    }
/* 117 */           Iterator it3 = new IooO11l(174, 255, 1).iterator();
/* 126 */           while (((IooO10lI) it3).I00iiO) {
/* 139 */               arrayList.add(Integer.valueOf(((IooIlO1) it3).nextInt()));
                    }
/* 145 */           ArrayList arrayList2 = new ArrayList(arrayList);
/* 150 */           int i2 = 0;
/* 153 */           for (int i3 = 0; i3 < 256; i3++) {
/* 163 */               if (!arrayList.contains(Integer.valueOf(i3))) {
/* 169 */                   arrayList.add(Integer.valueOf(i3));
/* 178 */                   arrayList2.add(Integer.valueOf(i2 + Barcode.FORMAT_QR_CODE));
/* 181 */                   i2++;
                        }
                    }
/* 186 */           String[] strArr = new String[Barcode.FORMAT_QR_CODE];
/* 189 */           for (int i4 = 0; i4 < 256; i4++) {
/* 193 */               strArr[i4] = "";
                    }
/* 198 */           int size = arrayList.size();
/* 203 */           for (int i5 = 0; i5 < size; i5++) {
/* 230 */               strArr[((Number) arrayList.get(i5)).intValue()] = String.valueOf((char) ((Number) arrayList2.get(i5)).intValue());
                    }
/* 235 */           this.I00ilI0I1 = strArr;
/* 243 */           this.I00ilO0 = Pattern.compile("(?i:'s|'t|'re|'ve|'m|'ll|'d)|[^\\r\\n\\p{L}\\p{N}]?\\p{L}+|\\p{N}| ?[^\\p{IsWhite_Space}\\p{L}\\p{N}]+[\\r\\n]*|\\p{IsWhite_Space}*[\\r\\n]+|\\p{IsWhite_Space}+(?!\\P{IsWhite_Space})|\\p{IsWhite_Space}+");
/* 261 */           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), IO1IOI.I00000oIO), 8192);
                    try {
/* 270 */               Iterator it4 = ((IOo0i10) lOliOoIi.I00000oIO(bufferedReader)).iterator();
/* 274 */               int i6 = 0;
/* 280 */               while (it4.hasNext()) {
/* 282 */                   Object next = it4.next();
/* 286 */                   int i7 = i6 + 1;
/* 288 */                   if (i6 < 0) {
/* 309 */                       IOOi1I.I000lI();
/* 312 */                       throw null;
                            }
/* 300 */                   ((HashMap) this.I00iiI).put((String) next, Integer.valueOf(i6));
/* 303 */                   i6 = i7;
                        }
/* 313 */               bufferedReader.close();
/* 330 */               bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), IO1IOI.I00000oIO), 8192);
                        try {
/* 339 */                   Iterator it5 = ((IOo0i10) lOliOoIi.I00000oIO(bufferedReader)).iterator();
/* 343 */                   int i8 = 0;
/* 349 */                   while (it5.hasNext()) {
/* 351 */                       Object next2 = it5.next();
/* 355 */                       int i9 = i8 + 1;
/* 357 */                       if (i8 < 0) {
/* 406 */                           IOOi1I.I000lI();
/* 409 */                           throw null;
                                }
/* 359 */                       String str = (String) next2;
/* 365 */                       if (str.length() > 0) {
/* 369 */                           int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(str, ' ', 0, 6);
/* 396 */                           ((HashMap) this.I00iiO).put(new OIoi0IIoi(str.substring(0, iI001i1O0Ol), str.substring(iI001i1O0Ol + 1)), Integer.valueOf(i8));
                                }
/* 404 */                       i8 = i9;
                            }
/* 410 */                   bufferedReader.close();
/* 427 */                   bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), IO1IOI.I00000oIO), 8192);
                            try {
/* 436 */                       Iterator it6 = ((IOo0i10) lOliOoIi.I00000oIO(bufferedReader)).iterator();
/* 444 */                       while (it6.hasNext()) {
/* 450 */                           String str2 = (String) it6.next();
/* 456 */                           if (str2.length() > 0) {
/* 458 */                               int iI001i1O0Ol2 = OlOoOIi0o.I001i1O0Ol(str2, '\t', 0, 6);
/* 492 */                               ((LinkedHashMap) this.I00iio).put(str2.substring(0, iI001i1O0Ol2), Integer.valueOf(Integer.parseInt(OlOoOIi0o.I00OIo(str2.substring(iI001i1O0Ol2 + 1)).toString())));
                                    }
                                }
/* 499 */                       bufferedReader.close();
/* 545 */                       this.I00io1l = Pattern.compile(IOOi0Ool1i.I00IlilI0i0i(IOOi0Ool1i.I00Ol1ll1(((LinkedHashMap) this.I00iio).keySet(), new IliIiio1(27)), "|", null, null, new OOii01Ioi1(i), 30));
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
/* 555 */                       throw th;
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
/* 562 */                   throw th2;
                        } finally {
                        }
                    }
                }

                public static boolean I000l1(int[] iArr, int i) {
/* 4 */             for (int i2 : iArr) {
/* 8 */                 if (i2 == i) {
/* 10 */                    return true;
                        }
                    }
/* 2 */             return false;
                }

                public static ColorStateList I00100l0(Context context, int i) {
/* 4 */             int iI0000Il00O = Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlHighlight);
/* 11 */            int iI00000oOI = Oo0oil0li0I.I00000oOI(context, R.attr.colorButtonNormal);
/* 15 */            int[] iArr = Oo0oil0li0I.I00000oOI;
/* 17 */            int[] iArr2 = Oo0oil0li0I.I0000O;
/* 19 */            int iI00000oOI2 = IOOliIoI1l.I00000oOI(iI0000Il00O, i);
/* 41 */            return new ColorStateList(new int[][]{iArr, iArr2, Oo0oil0li0I.I0000Il00O, Oo0oil0li0I.I0001Ioi1lo}, new int[]{iI00000oOI, iI00000oOI2, IOOliIoI1l.I00000oOI(iI0000Il00O, i), i});
                }

                public static List I001iOo1i0O(I0Oi111ii i0Oi111ii, O0OIoll1 o0OIoll1, O1iioIi0010 o1iioIi0010, Boolean bool, boolean z, int i) {
/* 9 */             boolean z2 = (i & 4) == 0;
/* 12 */            if ((i & 16) != 0) {
/* 14 */                bool = null;
                    }
/* 27 */            return i0Oi111ii.I001i1lo1io(o0OIoll1, o1iioIi0010, z2, false, bool, (i & 32) != 0 ? false : z);
                }

                public static O1iioIi0010 I001l0I00(I01Ilioliio i01Ilioliio, OI1IlOlol oI1IlOlol, Oi0Oooi oi0Oooi, int i, boolean z) {
                    O0IIO0lO o0IIO0lO;
/* 4 */             if (i01Ilioliio instanceof OOOiIOiii) {
/* 6 */                 Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 10 */                O0I1Ii1l0 o0I1Ii1l0I00000oIO = O0IO00o0OI0.I00000oIO((OOOiIOiii) i01Ilioliio, oI1IlOlol, oi0Oooi);
/* 14 */                if (o0I1Ii1l0I00000oIO != null) {
/* 28 */                    return new O1iioIi0010(o0I1Ii1l0I00000oIO.I00000oOI.concat(o0I1Ii1l0I00000oIO.I0000Il00O));
                        }
                    } else if (i01Ilioliio instanceof OOOll1o0) {
/* 36 */                Il1lll0iI il1lll0iI2 = O0IO00o0OI0.I00000oIO;
/* 40 */                O0I1Ii1l0 o0I1Ii1l0I0000Il00O = O0IO00o0OI0.I0000Il00O((OOOll1o0) i01Ilioliio, oI1IlOlol, oi0Oooi);
/* 44 */                if (o0I1Ii1l0I0000Il00O != null) {
/* 58 */                    return new O1iioIi0010(o0I1Ii1l0I0000Il00O.I00000oOI.concat(o0I1Ii1l0I0000Il00O.I0000Il00O));
                        }
                    } else if ((i01Ilioliio instanceof OOOo0i11Ol) && (o0IIO0lO = (O0IIO0lO) lIOIiol1IoI.I00000oIO((Io000liOIo) i01Ilioliio, O0IIoOIiII0O.I0000O)) != null) {
/* 80 */                int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i);
/* 85 */                if (iI001lIiIIo1O == 1) {
/* 164 */                   return iO1oioO0olo.I00000oIO((OOOo0i11Ol) i01Ilioliio, oI1IlOlol, oi0Oooi, true, true, z);
                        }
/* 88 */                if (iI001lIiIIo1O != 2) {
/* 91 */                    if (iI001lIiIIo1O != 3 || (o0IIO0lO.I00iiI & 8) != 8) {
/* 3 */                         return null;
                            }
/* 101 */                   O0III0iooOOi o0III0iooOOi = o0IIO0lO.I00ilO0;
/* 121 */                   return new O1iioIi0010(oI1IlOlol.getString(o0III0iooOOi.I00iiO).concat(oI1IlOlol.getString(o0III0iooOOi.I00iio)));
                        }
/* 130 */               if (o0IIO0lO.I000OOo1O()) {
/* 132 */                   O0III0iooOOi o0III0iooOOi2 = o0IIO0lO.I00ilI0I1;
/* 152 */                   return new O1iioIi0010(oI1IlOlol.getString(o0III0iooOOi2.I00iiO).concat(oI1IlOlol.getString(o0III0iooOOi2.I00iio)));
                        }
                    }
/* 3 */             return null;
                }

                public static LayerDrawable I001lllioOl(Oi0loIIIoI oi0loIIIoI, Context context, int i) throws Resources.NotFoundException {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
/* 5 */             int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
/* 12 */            Drawable drawableI0000O = oi0loIIIoI.I0000O(context, R.drawable.abc_star_black_48dp);
/* 19 */            Drawable drawableI0000O2 = oi0loIIIoI.I0000O(context, R.drawable.abc_star_half_black_48dp);
/* 26 */            if ((drawableI0000O instanceof BitmapDrawable) && drawableI0000O.getIntrinsicWidth() == dimensionPixelSize && drawableI0000O.getIntrinsicHeight() == dimensionPixelSize) {
/* 40 */                bitmapDrawable = (BitmapDrawable) drawableI0000O;
/* 48 */                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                    } else {
/* 54 */                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
/* 60 */                Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 63 */                drawableI0000O.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
/* 66 */                drawableI0000O.draw(canvas);
/* 71 */                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
/* 76 */                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                    }
/* 82 */            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
/* 87 */            if ((drawableI0000O2 instanceof BitmapDrawable) && drawableI0000O2.getIntrinsicWidth() == dimensionPixelSize && drawableI0000O2.getIntrinsicHeight() == dimensionPixelSize) {
/* 101 */               bitmapDrawable3 = (BitmapDrawable) drawableI0000O2;
                    } else {
/* 106 */               Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
/* 112 */               Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
/* 115 */               drawableI0000O2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
/* 118 */               drawableI0000O2.draw(canvas2);
/* 123 */               bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                    }
/* 139 */           LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
/* 144 */           layerDrawable.setId(0, android.R.id.background);
/* 150 */           layerDrawable.setId(1, android.R.id.secondaryProgress);
/* 156 */           layerDrawable.setId(2, android.R.id.progress);
/* 408 */           return layerDrawable;
                }

                public static void I00IoiI(Drawable drawable, int i, PorterDuff.Mode mode) {
                    PorterDuffColorFilter porterDuffColorFilterI0001Ioi1lo;
/* 1 */             Drawable drawableMutate = drawable.mutate();
/* 5 */             if (mode == null) {
/* 7 */                 mode = I11oo00.I00000oOI;
                    }
/* 9 */             PorterDuff.Mode mode2 = I11oo00.I00000oOI;
                    synchronized (I11oo00.class) {
/* 14 */                porterDuffColorFilterI0001Ioi1lo = Oi0loIIIoI.I0001Ioi1lo(i, mode);
                    }
/* 19 */            drawableMutate.setColorFilter(porterDuffColorFilterI0001Ioi1lo);
                }

                public void I00000oIO(String str, String str2) {
/* 3 */             HashMap map = (HashMap) this.I00io1l;
/* 5 */             if (map != null) {
/* 7 */                 map.put(str, str2);
                    } else {
/* 13 */                I000II.I001IO000("Property \"autoMetadata\" has not been set");
                    }
                }

                @Override
                public List I00000oOI(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol) {
/* 3 */             return I00IioO0OiOi(o0OIoll1, oOOo0i11Ol, I00ilO0.I00iiI);
                }

                @Override
                public Object I0000Il00O() {
/* 5 */             Object objI0000Il00O = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 19 */            i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00iiO));
/* 26 */            Object objI0000Il00O2 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 40 */            i0IOo0i0 i0ioo0i02 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00ilI0I1));
/* 47 */            Object objI0000Il00O3 = ((i0IOo0i0) this.I00ilO0).I0000Il00O();
/* 67 */            i0OI1IOoili1 i0oi1iooili1 = (i0OI1IOoili1) ((i0IOo0i0) this.I00io1l).I0000Il00O();
/* 69 */            i0O1oI1l0l i0o1oi1l0l = new i0O1oI1l0l();
/* 72 */            i0o1oi1l0l.I00000oIO = (i0Il00O1) objI0000Il00O;
/* 74 */            i0o1oi1l0l.I0000oI00 = i0ioo0i0;
/* 76 */            i0o1oi1l0l.I00000oOI = (i0O1I1o) objI0000Il00O2;
/* 78 */            i0o1oi1l0l.I0001Ioi1lo = i0ioo0i02;
/* 80 */            i0o1oi1l0l.I0000Il00O = (i0O0oOiO11) objI0000Il00O3;
/* 82 */            i0o1oi1l0l.I0000O = i0oi1iooili1;
/* 84 */            VarHandle.storeStoreFence();
/* 110 */           return i0o1oi1l0l;
                }

                @Override
                public synchronized void I0000O(ByteBuffer byteBuffer, byte[] bArr) {
/* 14 */            if (byteBuffer.remaining() != ((I0OiI1) this.I00io1l).I0000oI00()) {
/* 152 */               throw new InvalidAlgorithmParameterException("Invalid header length");
                    }
/* 28 */            if (byteBuffer.get() != ((I0OiI1) this.I00io1l).I0000oI00()) {
/* 144 */               throw new GeneralSecurityException("Invalid ciphertext");
                    }
/* 33 */            this.I00ilO0 = new byte[7];
/* 41 */            byte[] bArr2 = new byte[((I0OiI1) this.I00io1l).I00000oIO];
/* 43 */            byteBuffer.get(bArr2);
/* 50 */            byteBuffer.get((byte[]) this.I00ilO0);
/* 55 */            I0OiI1 i0OiI1 = (I0OiI1) this.I00io1l;
/* 66 */            byte[] bArrI00000oIO = iloIiOoiI.I00000oIO(i0OiI1.I0001Ioi1lo, i0OiI1.I000II, bArr2, bArr, i0OiI1.I00000oIO + 32);
/* 84 */            this.I00iiI = new SecretKeySpec(bArrI00000oIO, 0, ((I0OiI1) this.I00io1l).I00000oIO, "AES");
/* 88 */            I0OiI1 i0OiI12 = (I0OiI1) this.I00io1l;
/* 99 */            this.I00iiO = new SecretKeySpec(bArrI00000oIO, i0OiI12.I00000oIO, 32, i0OiI12.I00000oOI);
/* 113 */           this.I00iio = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/CTR/NoPadding");
/* 117 */           I0OiI1 i0OiI13 = (I0OiI1) this.I00io1l;
/* 119 */           Il0O1l0i il0O1l0i = Il0O1l0i.I0000Il00O;
/* 131 */           this.I00ilI0I1 = (Mac) il0O1l0i.I00000oIO.I00IO1oi11O(i0OiI13.I00000oOI);
                }

                @Override
                public List I0000oI00(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i) {
/* 30 */            return I00IOO(o0OIoll1, i01Ilioliio, i, i01Ilioliio instanceof OOOll1o0 ? ((OOOll1o0) i01Ilioliio).I00o0iI0io1.size() : i01Ilioliio instanceof OOOo0i11Ol ? ((OOOo0i11Ol) i01Ilioliio).I00o0iI0io1.size() : 0);
                }

                @Override
                public synchronized void I0001Ioi1lo(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
/* 2 */             int iPosition = byteBuffer.position();
/* 11 */            byte[] bArrI000OOo1O = I0OiI1.I000OOo1O((byte[]) this.I00ilO0, i, z);
/* 15 */            int iRemaining = byteBuffer.remaining();
/* 23 */            int i2 = ((I0OiI1) this.I00io1l).I0000Il00O;
/* 25 */            if (iRemaining < i2) {
/* 149 */               throw new GeneralSecurityException("Ciphertext too short");
                    }
/* 28 */            int i3 = (iRemaining - i2) + iPosition;
/* 29 */            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
/* 33 */            byteBufferDuplicate.limit(i3);
/* 36 */            ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
/* 40 */            byteBufferDuplicate2.position(i3);
/* 51 */            ((Mac) this.I00ilI0I1).init((SecretKeySpec) this.I00iiO);
/* 58 */            ((Mac) this.I00ilI0I1).update(bArrI000OOo1O);
/* 65 */            ((Mac) this.I00ilI0I1).update(byteBufferDuplicate);
/* 82 */            byte[] bArrCopyOf = Arrays.copyOf(((Mac) this.I00ilI0I1).doFinal(), ((I0OiI1) this.I00io1l).I0000Il00O);
/* 92 */            byte[] bArr = new byte[((I0OiI1) this.I00io1l).I0000Il00O];
/* 94 */            byteBufferDuplicate2.get(bArr);
/* 101 */           if (!MessageDigest.isEqual(bArr, bArrCopyOf)) {
/* 141 */               throw new GeneralSecurityException("Tag mismatch");
                    }
/* 103 */           byteBuffer.limit(i3);
/* 120 */           ((Cipher) this.I00iio).init(1, (SecretKeySpec) this.I00iiI, new IvParameterSpec(bArrI000OOo1O));
/* 127 */           ((Cipher) this.I00iio).doFinal(byteBuffer, byteBuffer2);
                }

                @Override
                public Object I000II(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol, O0iIl1 o0iIl1) {
/* 8 */             return I00IO1oi11O(o0OIoll1, oOOo0i11Ol, 3, o0iIl1, I00ilI0I1.I00iiI);
                }

                @Override
                public ArrayList I000O01llI0(OOi001oo1OOI oOi001oo1OOI, OI1IlOlol oI1IlOlol) {
/* 1 */             List list = oOi001oo1OOI.I00oI0i;
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 16 */            Iterator it = list.iterator();
/* 24 */            while (it.hasNext()) {
/* 40 */                arrayList.add(((IIlio101Io) this.I00ilO0).I00lli11((OOOi000ooO) it.next(), oI1IlOlol));
                    }
/* 106 */           return arrayList;
                }

                @Override
                public ArrayList I000OOo1O(OOi0O1i1lOi oOi0O1i1lOi, OI1IlOlol oI1IlOlol) {
/* 1 */             List list = oOi0O1i1lOi.I00li1OI;
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 16 */            Iterator it = list.iterator();
/* 24 */            while (it.hasNext()) {
/* 40 */                arrayList.add(((IIlio101Io) this.I00ilO0).I00lli11((OOOi000ooO) it.next(), oI1IlOlol));
                    }
/* 106 */           return arrayList;
                }

                @Override
                public List I000OiO(O0OIoll1 o0OIoll1, OOOl0lIlIoil oOOl0lIlIoil) {
/* 41 */            return I001iOo1i0O(this, o0OIoll1, new O1iioIi0010(IIlIOloOOO.I000oI1ioi('#', ((OI1IlOlol) o0OIoll1.I00000oOI).getString(oOOl0lIlIoil.I00iio), IOIOoo.I00000oOI(((OOi1111IO0) o0OIoll1).I000II.I00000oOI()))), null, false, 60);
                }

                @Override
                public Object I000iOII(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol, O0iIl1 o0iIl1) {
/* 8 */             return I00IO1oi11O(o0OIoll1, oOOo0i11Ol, 2, o0iIl1, I00ilI0I1.I00iiO);
                }

                public I1l0Ioi01 I000lI() {
/* 10 */            String strConcat = ((String) this.I00iiI) == null ? " transportName" : "";
/* 16 */            if (((Il01oOi) this.I00iio) == null) {
/* 20 */                strConcat = strConcat.concat(" encodedPayload");
                    }
/* 28 */            if (((Long) this.I00ilI0I1) == null) {
/* 32 */                strConcat = strConcat.concat(" eventMillis");
                    }
/* 40 */            if (((Long) this.I00ilO0) == null) {
/* 44 */                strConcat = strConcat.concat(" uptimeMillis");
                    }
/* 52 */            if (((HashMap) this.I00io1l) == null) {
/* 56 */                strConcat = strConcat.concat(" autoMetadata");
                    }
/* 64 */            if (!strConcat.isEmpty()) {
/* 125 */               I000II.I001IO000("Missing required properties:".concat(strConcat));
/* 128 */               return null;
                    }
/* 70 */            String str = (String) this.I00iiI;
/* 74 */            Integer num = (Integer) this.I00iiO;
/* 78 */            Il01oOi il01oOi = (Il01oOi) this.I00iio;
/* 84 */            long jLongValue = ((Long) this.I00ilI0I1).longValue();
/* 92 */            long jLongValue2 = ((Long) this.I00ilO0).longValue();
/* 98 */            HashMap map = (HashMap) this.I00io1l;
/* 100 */           I1l0Ioi01 i1l0Ioi01 = new I1l0Ioi01();
/* 103 */           i1l0Ioi01.I00000oIO = str;
/* 105 */           i1l0Ioi01.I00000oOI = num;
/* 107 */           i1l0Ioi01.I0000Il00O = il01oOi;
/* 109 */           i1l0Ioi01.I0000O = jLongValue;
/* 111 */           i1l0Ioi01.I0000oI00 = jLongValue2;
/* 113 */           i1l0Ioi01.I0001Ioi1lo = map;
/* 115 */           VarHandle.storeStoreFence();
/* 118 */           return i1l0Ioi01;
                }

                @Override
                public List I000o00OoI0I(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i, int i2, OOi0iiO0iOi oOi0iiO0iOi) {
/* 1 */             return I00IOO(o0OIoll1, i01Ilioliio, i, i2);
                }

                public IIi100 I000oI1ioi() {
/* 3 */             IIi100 iIi100 = (IIi100) this.I00io1l;
/* 5 */             if (iIi100 != null) {
/* 20 */                return iIi100;
                    }
/* 11 */            IIi100 iIi100I00000oIO = iOiiO0.I00000oIO((Io1Io0OOi011) this.I00iio);
/* 15 */            this.I00io1l = iIi100I00000oIO;
/* 20 */            return iIi100I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public List I00100o1O0lo(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i, int i2, OOi0iiO0iOi oOi0iiO0iOi) {
/* 1 */             boolean z = i01Ilioliio instanceof OOOll1o0;
/* 3 */             int i3 = 0;
/* 30 */            int size = z ? ((OOOll1o0) i01Ilioliio).I00o0iI0io1.size() : i01Ilioliio instanceof OOOo0i11Ol ? ((OOOo0i11Ol) i01Ilioliio).I00o0iI0io1.size() : 0;
/* 36 */            if (z) {
/* 41 */                int i4 = ((OOOll1o0) i01Ilioliio).I00iiO;
/* 45 */                if ((i4 & 32) == 32 || (i4 & 64) == 64) {
/* 51 */                    i3 = 1;
                        }
                    } else if (i01Ilioliio instanceof OOOo0i11Ol) {
/* 60 */                int i5 = ((OOOo0i11Ol) i01Ilioliio).I00iiO;
/* 64 */                if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                        }
                    } else {
/* 73 */                if (!(i01Ilioliio instanceof OOOiIOiii)) {
/* 399 */                   throw new UnsupportedOperationException("Unsupported message: " + i01Ilioliio.getClass());
                        }
/* 76 */                OOi1111IO0 oOi1111IO0 = (OOi1111IO0) o0OIoll1;
/* 82 */                if (oOi1111IO0.I000O01llI0 == OOOi0O.ENUM_CLASS) {
/* 84 */                    i3 = 2;
                        } else if (oOi1111IO0.I000OOo1O) {
                        }
                    }
/* 93 */            return I00IOO(o0OIoll1, i01Ilioliio, i, size + i3 + i2);
                }

                public IOo0i1 I0010I0i(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 5 */             IOo0i1 iOo0i1I000OiO = looil0O1Io1.I000OiO((OI0011) this.I00iio, obj);
/* 9 */             if (iOo0i1I000OiO != null) {
/* 106 */               return iOo0i1I000OiO;
                    }
/* 21 */            String str = "Unsupported annotation argument: " + oI1Iio0ii1;
/* 29 */            Il0ool10 il0ool10 = new Il0ool10(OoiIlOl1iI.I00000oIO);
/* 32 */            il0ool10.I00000oOI = str;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            return il0ool10;
                }

                @Override
                public List I0010o(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol) {
/* 3 */             return I00IioO0OiOi(o0OIoll1, oOOo0i11Ol, I00ilO0.I00iiO);
                }

                public int[] I00111O(String str) {
/* 11 */            ArrayList arrayList = new ArrayList((str.length() / 3) + 8);
/* 18 */            Matcher matcher = ((Pattern) this.I00io1l).matcher(str);
/* 22 */            int iEnd = 0;
/* 27 */            while (matcher.find()) {
/* 33 */                if (matcher.start() > iEnd) {
/* 43 */                    I001IIilI0O(str.substring(iEnd, matcher.start()), arrayList);
                        }
/* 58 */                arrayList.add(O1Oii0O0loo.I00000oOI(matcher.group(), (LinkedHashMap) this.I00iio));
/* 61 */                iEnd = matcher.end();
                    }
/* 70 */            if (iEnd < str.length()) {
/* 76 */                I001IIilI0O(str.substring(iEnd), arrayList);
                    }
/* 79 */            return IOOi0Ool1i.I00iIO(arrayList);
                }

                public void I001IIilI0O(String str, ArrayList arrayList) {
                    int iIntValue;
/* 11 */            Matcher matcher = ((Pattern) this.I00ilO0).matcher(Normalizer.normalize(str, Normalizer.Form.NFC));
/* 19 */            while (matcher.find()) {
/* 27 */                byte[] bytes = matcher.group().getBytes(IO1IOI.I00000oIO);
/* 34 */                StringBuilder sb = new StringBuilder(bytes.length);
/* 40 */                for (byte b : bytes) {
/* 52 */                    sb.append(((String[]) this.I00ilI0I1)[b & 255]);
                        }
/* 58 */                String string = sb.toString();
/* 68 */                ArrayList arrayList2 = new ArrayList(string.length());
/* 76 */                for (int i = 0; i < string.length(); i++) {
/* 86 */                    arrayList2.add(String.valueOf(string.charAt(i)));
                        }
/* 94 */                ArrayList arrayList3 = new ArrayList(arrayList2);
/* 102 */               while (arrayList3.size() > 1) {
/* 108 */                   int size = arrayList3.size() - 1;
/* 109 */                   int i2 = Integer.MAX_VALUE;
/* 112 */                   int i3 = -1;
/* 113 */                   int i4 = 0;
/* 114 */                   while (i4 < size) {
/* 126 */                       int i5 = i4 + 1;
/* 139 */                       Integer num = (Integer) ((HashMap) this.I00iiO).get(new OIoi0IIoi(arrayList3.get(i4), arrayList3.get(i5)));
/* 141 */                       if (num != null && (iIntValue = num.intValue()) < i2) {
/* 149 */                           i3 = i4;
/* 150 */                           i2 = iIntValue;
                                }
/* 151 */                       i4 = i5;
                            }
/* 153 */                   if (i3 < 0) {
                                break;
                            }
/* 155 */                   Object obj = arrayList3.get(i3);
/* 159 */                   int i6 = i3 + 1;
/* 161 */                   Object obj2 = arrayList3.get(i6);
/* 167 */                   StringBuilder sb2 = new StringBuilder();
/* 170 */                   sb2.append(obj);
/* 173 */                   sb2.append(obj2);
/* 180 */                   arrayList3.set(i3, sb2.toString());
/* 183 */                   arrayList3.remove(i6);
                        }
/* 187 */               Iterator it = arrayList3.iterator();
/* 195 */               while (it.hasNext()) {
/* 201 */                   String str2 = (String) it.next();
/* 211 */                   Integer num2 = (Integer) ((HashMap) this.I00iiI).get(str2);
/* 213 */                   if (num2 == null) {
/* 227 */                       I000II.I001IO000(IlIi0I0.I000lI("BPE piece not in vocab: '", str2, "'"));
/* 332 */                       return;
                            }
/* 215 */                   arrayList.add(num2);
                        }
                    }
                }

                @Override
                public ArrayList I001IO000(OOi1111IO0 oOi1111IO0) {
/* 3 */             OlI1o0ooI olI1o0ooI = (OlI1o0ooI) oOi1111IO0.I0000O;
/* 13 */            O0iIIIiiO o0iIIIiiO = olI1o0ooI instanceof O0iIIIiiO ? (O0iIIIiiO) olI1o0ooI : null;
/* 19 */            OOoOI1lIOi oOoOI1lIOi = o0iIIIiiO != null ? o0iIIIiiO.I00iOIl : null;
/* 20 */            if (oOoOI1lIOi == null) {
/* 80 */                OIiilo1Ool0o.I00100l0("Class for loading annotations is not found: ", oOi1111IO0.I000II.I00000oIO());
/* 7 */                 return null;
                    }
/* 25 */            ArrayList arrayList = new ArrayList(1);
/* 36 */            for (Annotation annotation : oOoOI1lIOi.I00000oIO.getDeclaredAnnotations()) {
/* 46 */                Class clsI001l0I00 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00();
/* 59 */                IOiOol0 iOiOol0I00IO1 = I00IO1(OOo1Io0I0.I00000oIO(clsI001l0I00), new OOo1Il01OliO(annotation), arrayList);
/* 63 */                if (iOiOol0I00IO1 != null) {
/* 65 */                    lIl1l0IO.I0000Il00O(iOiOol0I00IO1, annotation, clsI001l0I00);
                        }
                    }
/* 71 */            return arrayList;
                }

                @Override
                public List I001i1O0Ol(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i) {
/* 2 */             if (i == 2) {
/* 8 */                 return I00IioO0OiOi(o0OIoll1, (OOOo0i11Ol) i01Ilioliio, I00ilO0.I00iOIl);
                    }
/* 22 */            O1iioIi0010 o1iioIi0010I001l0I00 = I001l0I00(i01Ilioliio, (OI1IlOlol) o0OIoll1.I00000oOI, (Oi0Oooi) o0OIoll1.I0000Il00O, i, false);
                    return o1iioIi0010I001l0I00 == null ? Il01100l.I00iOIl : I001iOo1i0O(this, o0OIoll1, o1iioIi0010I001l0I00, null, false, 60);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public List I001i1lo1io(O0OIoll1 o0OIoll1, O1iioIi0010 o1iioIi0010, boolean z, boolean z2, Boolean bool, boolean z3) {
                    List list;
/* 16 */            OOoOI1lIOi oOoOI1lIOiI00000oIO = iO1oilio0i.I00000oIO(o0OIoll1, z, z2, bool, z3, (OOoOIoio1i) this.I00iiI, (O1lili011o) this.I00io1l);
/* 20 */            if (oOoOI1lIOiI00000oIO == null) {
/* 25 */                if (o0OIoll1 instanceof OOi1111IO0) {
/* 32 */                    OlI1o0ooI olI1o0ooI = (OlI1o0ooI) ((OOi1111IO0) o0OIoll1).I0000O;
/* 41 */                    O0iIIIiiO o0iIIIiiO = olI1o0ooI instanceof O0iIIIiiO ? (O0iIIIiiO) olI1o0ooI : null;
/* 47 */                    oOoOI1lIOiI00000oIO = o0iIIIiiO != null ? o0iIIIiiO.I00iOIl : null;
                        }
                    }
                    return (oOoOI1lIOiI00000oIO == null || (list = (List) ((I11Ilo0I) ((O1I00llOi) this.I00iiO).invoke(oOoOI1lIOiI00000oIO)).I00000oIO.get(o1iioIi0010)) == null) ? Il01100l.I00iOIl : list;
                }

                public int I001lIiIIo1O() {
                    int iI000oI1ioi;
/* 1 */             lOllIO.I00000oIO();
/* 15 */            lII1OI11o1I.I0000oI00("The ImageReader is not initialized.", ((OOlli1l1lOlI) this.I00iiO) != null);
/* 20 */            OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) this.I00iiO;
                    synchronized (oOlli1l1lOlI.I00iiO) {
/* 35 */                iI000oI1ioi = ((IoiO1ilO) oOlli1l1lOlI.I00iio).I000oI1ioi() - oOlli1l1lOlI.I00iOIl;
                    }
/* 37 */            return iI000oI1ioi;
                }

                public ColorStateList I001lloI(Context context, int i) {
/* 4 */             if (i == R.drawable.abc_edit_text_material) {
/* 9 */                 return iOI10i0I11.I00000oOI(context, R.color.abc_tint_edittext);
                    }
/* 17 */            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
/* 22 */                return iOI10i0I11.I00000oOI(context, R.color.abc_tint_switch_track);
                    }
/* 31 */            if (i != R.drawable.abc_switch_thumb_material) {
/* 128 */               if (i == R.drawable.abc_btn_default_mtrl_shape) {
/* 137 */                   return I00100l0(context, Oo0oil0li0I.I0000Il00O(context, R.attr.colorButtonNormal));
                        }
/* 145 */               if (i == R.drawable.abc_btn_borderless_material) {
/* 147 */                   return I00100l0(context, 0);
                        }
/* 155 */               if (i == R.drawable.abc_btn_colored_material) {
/* 164 */                   return I00100l0(context, Oo0oil0li0I.I0000Il00O(context, R.attr.colorAccent));
                        }
/* 172 */               if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
/* 252 */                   return iOI10i0I11.I00000oOI(context, R.color.abc_tint_spinner);
                        }
/* 188 */               if (I000l1((int[]) this.I00iiO, i)) {
/* 193 */                   return Oo0oil0li0I.I0000O(context, R.attr.colorControlNormal);
                        }
/* 206 */               if (I000l1((int[]) this.I00ilO0, i)) {
/* 211 */                   return iOI10i0I11.I00000oOI(context, R.color.abc_tint_default);
                        }
/* 224 */               if (I000l1((int[]) this.I00io1l, i)) {
/* 229 */                   return iOI10i0I11.I00000oOI(context, R.color.abc_tint_btn_checkable);
                        }
/* 237 */               if (i == R.drawable.abc_seekbar_thumb_material) {
/* 242 */                   return iOI10i0I11.I00000oOI(context, R.color.abc_tint_seek_thumb);
                        }
/* 247 */               return null;
                    }
/* 34 */            int[][] iArr = new int[3][];
/* 36 */            int[] iArr2 = new int[3];
/* 41 */            ColorStateList colorStateListI0000O = Oo0oil0li0I.I0000O(context, R.attr.colorSwitchThumbNormal);
/* 50 */            if (colorStateListI0000O == null || !colorStateListI0000O.isStateful()) {
/* 91 */                iArr[0] = Oo0oil0li0I.I00000oOI;
/* 97 */                iArr2[0] = Oo0oil0li0I.I00000oOI(context, R.attr.colorSwitchThumbNormal);
/* 101 */               iArr[1] = Oo0oil0li0I.I0000oI00;
/* 107 */               iArr2[1] = Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlActivated);
/* 111 */               iArr[2] = Oo0oil0li0I.I0001Ioi1lo;
/* 117 */               iArr2[2] = Oo0oil0li0I.I0000Il00O(context, R.attr.colorSwitchThumbNormal);
                    } else {
/* 58 */                int[] iArr3 = Oo0oil0li0I.I00000oOI;
/* 60 */                iArr[0] = iArr3;
/* 66 */                iArr2[0] = colorStateListI0000O.getColorForState(iArr3, 0);
/* 70 */                iArr[1] = Oo0oil0li0I.I0000oI00;
/* 76 */                iArr2[1] = Oo0oil0li0I.I0000Il00O(context, R.attr.colorControlActivated);
/* 80 */                iArr[2] = Oo0oil0li0I.I0001Ioi1lo;
/* 86 */                iArr2[2] = colorStateListI0000O.getDefaultColor();
                    }
/* 121 */           return new ColorStateList(iArr, iArr2);
                }

                public boolean I00II0Ol1O0l(IOIOill iOIOill) {
                    OOoOI1lIOi oOoOI1lIOiI00000oIO;
/* 6 */             if (iOIOill.I0000oI00() != null && O0000Ioio00.I0000O(iOIOill.I0001Ioi1lo().I00000oOI(), "Container") && (oOoOI1lIOiI00000oIO = l0ll0oli1l.I00000oIO((OOoOIoio1i) this.I00iiI, iOIOill, (O1lili011o) this.I00io1l)) != null) {
/* 39 */                LinkedHashSet linkedHashSet = OlIIo0.I00000oIO;
/* 49 */                boolean z = false;
/* 51 */                for (Annotation annotation : oOoOI1lIOiI00000oIO.I00000oIO.getDeclaredAnnotations()) {
/* 75 */                    if (OOo1Io0I0.I00000oIO(((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00()).equals(O0I00o0.I00000oOI)) {
/* 77 */                        z = true;
                            }
                        }
/* 81 */                if (z) {
/* 50 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                public IOiOol0 I00II0oii1o(IOIOill iOIOill, OlI1o0ooI olI1o0ooI, List list) {
/* 9 */             OI000ilOol oI000ilOolI0000Il00O = ilOOOOloO.I0000Il00O((OI0011) this.I00iio, iOIOill, (o01l1ioOo0) this.I00ilI0I1);
/* 16 */            IOiOol0 iOiOol0 = new IOiOol0(4);
/* 19 */            iOiOol0.I00iio = this;
/* 21 */            iOiOol0.I00ilI0I1 = oI000ilOolI0000Il00O;
/* 23 */            iOiOol0.I00ilO0 = iOIOill;
/* 25 */            iOiOol0.I00io1l = list;
/* 27 */            iOiOol0.I00ioIO = olI1o0ooI;
/* 29 */            iOiOol0.I00iiO = this;
/* 36 */            iOiOol0.I00iiI = new HashMap();
/* 38 */            VarHandle.storeStoreFence();
/* 98 */            return iOiOol0;
                }

                public IOiOol0 I00IO1(IOIOill iOIOill, OOo1Il01OliO oOo1Il01OliO, List list) {
/* 7 */             if (OlIIo0.I00000oIO.contains(iOIOill)) {
/* 9 */                 return null;
                    }
/* 11 */            return I00II0oii1o(iOIOill, oOo1Il01OliO, list);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00IO1oi11O(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol, int i, O0iIl1 o0iIl1, IlliIl1l11O illiIl1l11O) {
                    Object objInvoke;
/* 26 */            OOoOI1lIOi oOoOI1lIOiI00000oIO = iO1oilio0i.I00000oIO(o0OIoll1, true, true, IlO1il.I001lllioOl.I0000oI00(oOOo0i11Ol.I00iio), O0IO00o0OI0.I0000O(oOOo0i11Ol), (OOoOIoio1i) this.I00iiI, (O1lili011o) this.I00io1l);
/* 31 */            if (oOoOI1lIOiI00000oIO == null) {
/* 35 */                if (o0OIoll1 instanceof OOi1111IO0) {
/* 42 */                    OlI1o0ooI olI1o0ooI = (OlI1o0ooI) ((OOi1111IO0) o0OIoll1).I0000O;
/* 51 */                    O0iIIIiiO o0iIIIiiO = olI1o0ooI instanceof O0iIIIiiO ? (O0iIIIiiO) olI1o0ooI : null;
/* 57 */                    oOoOI1lIOiI00000oIO = o0iIIIiiO != null ? o0iIIIiiO.I00iOIl : null;
                        }
                    }
/* 58 */            if (oOoOI1lIOiI00000oIO != null) {
/* 65 */                O1lili011o o1lili011o = (O1lili011o) oOoOI1lIOiI00000oIO.I00000oOI.I0000O;
/* 67 */                O1lili011o o1lili011o2 = IiOlOOll.I0000oI00;
/* 87 */                O1iioIi0010 o1iioIi0010I001l0I00 = I001l0I00(oOOo0i11Ol, (OI1IlOlol) o0OIoll1.I00000oOI, (Oi0Oooi) o0OIoll1.I0000Il00O, i, o1lili011o.I00000oIO(o1lili011o2.I00000oOI, o1lili011o2.I0000Il00O, o1lili011o2.I0000O));
/* 91 */                if (o1iioIi0010I001l0I00 != null && (objInvoke = illiIl1l11O.invoke(((O1I00llOi) this.I00iiO).invoke(oOoOI1lIOiI00000oIO), o1iioIi0010I001l0I00)) != null) {
/* 113 */                   if (OoillIolOoll.I00000oIO(o0iIl1)) {
/* 115 */                       objInvoke = (IOo0i1) objInvoke;
/* 119 */                       if (objInvoke instanceof IIOIIi1l11iO) {
/* 133 */                           return new Ooi010II(((Number) ((IIOIIi1l11iO) objInvoke).I00000oIO).byteValue());
                                }
/* 139 */                       if (objInvoke instanceof Ol01Il11oii) {
/* 153 */                           return new Ooi010II(((Number) ((Ol01Il11oii) objInvoke).I00000oIO).shortValue());
                                }
/* 159 */                       if (objInvoke instanceof IooOlil01il) {
/* 173 */                           return new Ooi010II(((Number) ((IooOlil01il) objInvoke).I00000oIO).intValue());
                                }
/* 179 */                       if (objInvoke instanceof O1IOl11I) {
/* 193 */                           return new Ooi010II(((Number) ((O1IOl11I) objInvoke).I00000oIO).longValue());
                                }
                            }
/* 399 */                   return objInvoke;
                        }
                    }
/* 30 */            return null;
                }

                public List I00IOO(O0OIoll1 o0OIoll1, I01Ilioliio i01Ilioliio, int i, int i2) {
/* 10 */            O1iioIi0010 o1iioIi0010I001l0I00 = I001l0I00(i01Ilioliio, (OI1IlOlol) o0OIoll1.I00000oOI, (Oi0Oooi) o0OIoll1.I0000Il00O, i, false);
/* 14 */            if (o1iioIi0010I001l0I00 == null) {
/* 16 */                return Il01100l.I00iOIl;
                    }
/* 49 */            return I001iOo1i0O(this, o0OIoll1, new O1iioIi0010(o1iioIi0010I001l0I00.I00000oIO + '@' + i2), null, false, 60);
                }

                public List I00IioO0OiOi(O0OIoll1 o0OIoll1, OOOo0i11Ol oOOo0i11Ol, I00ilO0 i00ilO0) {
/* 3 */             Oi0Oooi oi0Oooi = (Oi0Oooi) o0OIoll1.I0000Il00O;
/* 9 */             Boolean boolI000II = IlO1il.I001lllioOl.I0000oI00(oOOo0i11Ol.I00iio);
/* 13 */            boolean zI0000O = O0IO00o0OI0.I0000O(oOOo0i11Ol);
/* 17 */            I00ilO0 i00ilO02 = I00ilO0.I00iOIl;
/* 21 */            OI1IlOlol oI1IlOlol = (OI1IlOlol) o0OIoll1.I00000oOI;
/* 23 */            if (i00ilO0 == i00ilO02) {
/* 21 */                O1iioIi0010 o1iioIi0010I00000oIO = iO1oioO0olo.I00000oIO(oOOo0i11Ol, oI1IlOlol, oi0Oooi, (40 & 8) == 0, (40 & 16) == 0, true);
/* 31 */                if (o1iioIi0010I00000oIO != null) {
/* 38 */                    return I001iOo1i0O(this, o0OIoll1, o1iioIi0010I00000oIO, boolI000II, zI0000O, 8);
                        }
                    } else {
/* 21 */                O1iioIi0010 o1iioIi0010I00000oIO2 = iO1oioO0olo.I00000oIO(oOOo0i11Ol, oI1IlOlol, oi0Oooi, (40 & 8) == 0, (40 & 16) == 0, true);
/* 51 */                if (o1iioIi0010I00000oIO2 != null) {
/* 68 */                    if (OlOoOIi0o.I000oI1ioi(o1iioIi0010I00000oIO2.I00000oIO, "$delegate", false) == (i00ilO0 == I00ilO0.I00iiO)) {
/* 77 */                        return I001i1lo1io(o0OIoll1, o1iioIi0010I00000oIO2, true, true, boolI000II, zI0000O);
                            }
                        }
                    }
/* 70 */            return Il01100l.I00iOIl;
                }

                public I1ii1o0 I00IlilI0i0i() {
/* 4 */             I1ii1o0 i1ii1o0 = new I1ii1o0(false);
/* 12 */            i1ii1o0.I00ilO0 = new LinkedHashMap();
/* 18 */            i1ii1o0.I00iiI = (IoOi01OlIl1o) this.I00iiI;
/* 24 */            i1ii1o0.I00iiO = (String) this.I00iiO;
/* 30 */            i1ii1o0.I00ilI0I1 = (I00Ol00) this.I00ilI0I1;
/* 34 */            Map map = (Map) this.I00ilO0;
/* 54 */            i1ii1o0.I00ilO0 = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
/* 64 */            i1ii1o0.I00iio = ((Io1Io0OOi011) this.I00iio).I000OOo1O();
/* 110 */           return i1ii1o0;
                }

                public void I00Io1lO(IoiO1IO1I1i ioiO1IO1I1i) {
                    OOIo1Iiiil oOIo1Iiiil;
                    OOIo1Iiiil oOIo1Iiiil2;
/* 1 */             lOllIO.I00000oIO();
/* 10 */            if (((OOIo1Iiiil) this.I00iiI) == null) {
/* 26 */                l11I11lO.I0000oI00("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + ioiO1IO1I1i);
/* 29 */                ioiO1IO1I1i.close();
/* 32 */                return;
                    }
/* 37 */            Olo0o1II0 olo0o1II0I00000oOI = ioiO1IO1I1i.I00i0oil().I00000oOI();
/* 55 */            if (((Integer) olo0o1II0I00000oOI.I00000oIO.get(((OOIo1Iiiil) this.I00iiI).I000O01llI0)) == null) {
/* 91 */                l11I11lO.I0000oI00("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + ((OOIo1Iiiil) this.I00iiI).I00000oIO + ", ImageProxy tagBundle keys = " + olo0o1II0I00000oOI.I00000oIO.keySet());
/* 94 */                ioiO1IO1I1i.close();
/* 97 */                return;
                    }
/* 98 */            lOllIO.I00000oIO();
/* 103 */           I1lII0lO i1lII0lO = (I1lII0lO) this.I00ilI0I1;
/* 105 */           Objects.requireNonNull(i1lII0lO);
/* 108 */           IioO0ilo1Ii iioO0ilo1Ii = i1lII0lO.I00000oIO;
/* 112 */           OOIo1Iiiil oOIo1Iiiil3 = (OOIo1Iiiil) this.I00iiI;
/* 116 */           I1lIII10oIl i1lIII10oIl = new I1lIII10oIl();
/* 120 */           if (oOIo1Iiiil3 != null) {
/* 122 */               i1lIII10oIl.I00000oIO = oOIo1Iiiil3;
/* 124 */               i1lIII10oIl.I00000oOI = ioiO1IO1I1i;
/* 126 */               VarHandle.storeStoreFence();
                    } else {
/* 132 */               IOOlIIilOl0.I000II("Null processingRequest");
/* 135 */               i1lIII10oIl = null;
                    }
/* 136 */           iioO0ilo1Ii.accept(i1lIII10oIl);
/* 141 */           OOIo1Iiiil oOIo1Iiiil4 = (OOIo1Iiiil) this.I00iiI;
/* 145 */           I1ioOiOI i1ioOiOI = (I1ioOiOI) this.I00ilO0;
/* 160 */           boolean z = i1ioOiOI != null && i1ioOiOI.I000O01llI0.size() > 1;
/* 161 */           if (z && (oOIo1Iiiil2 = (OOIo1Iiiil) this.I00iiI) != null) {
/* 175 */               oOIo1Iiiil2.I00000oOI.I00000oOI(ioiO1IO1I1i.getFormat());
                    }
/* 178 */           if (!z || ((oOIo1Iiiil = (OOIo1Iiiil) this.I00iiI) != null && oOIo1Iiiil.I00000oOI.I00000oIO())) {
/* 194 */               this.I00iiI = null;
                    }
/* 214 */           l11I11lO.I0000Il00O("ProcessingRequest", "onImageCaptured: request ID = " + oOIo1Iiiil4.I00000oIO);
/* 220 */           if (oOIo1Iiiil4.I000iOII != -1) {
/* 224 */               oOIo1Iiiil4.I00000oIO(100);
                    }
/* 227 */           Oi0Oi10I oi0Oi10I = oOIo1Iiiil4.I000II;
/* 229 */           oi0Oi10I.getClass();
/* 232 */           lOllIO.I00000oIO();
/* 237 */           if (oi0Oi10I.I000II) {
/* 239 */               return;
                    }
/* 242 */           if (!oi0Oi10I.I000O01llI0) {
/* 244 */               lOllIO.I00000oIO();
/* 249 */               if (!oi0Oi10I.I000II && !oi0Oi10I.I000O01llI0) {
/* 256 */                   oi0Oi10I.I000O01llI0 = true;
                        }
                    }
/* 260 */           oi0Oi10I.I0000oI00.I00000oOI(null);
                }

                public void I00Io1o110i(OOIo1Iiiil oOIo1Iiiil) {
/* 1 */             lOllIO.I00000oIO();
/* 19 */            lII1OI11o1I.I0000oI00("only one capture stage is supported.", oOIo1Iiiil.I000OOo1O.size() == 1);
/* 31 */            lII1OI11o1I.I0000oI00("Too many acquire images. Close image to be able to process next.", I001lIiIIo1O() > 0);
/* 34 */            this.I00iiI = oOIo1Iiiil;
/* 36 */            IIiOiI0il iIiOiI0il = oOIo1Iiiil.I000OiO;
/* 41 */            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(6);
/* 44 */            i1I0i0Ilo1Oi.I00iiO = this;
/* 46 */            i1I0i0Ilo1Oi.I00iiI = oOIo1Iiiil;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            iIllIoiiIO.I00000oIO(iIiOiI0il, i1I0i0Ilo1Oi, Iii11l.I00000oIO());
                }

                public void I00IoIO0lI(I1lO01OlllO i1lO01OlllO) {
                    int i;
                    boolean z;
/* 1 */             lOllIO.I00000oIO();
/* 6 */             OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) this.I00iiI;
/* 8 */             if (oOIo1Iiiil == null || (i = oOIo1Iiiil.I00000oIO) != i1lO01OlllO.I00000oIO) {
/* 168 */               return;
                    }
/* 16 */            Ioi1lIO ioi1lIO = i1lO01OlllO.I00000oOI;
/* 34 */            l11I11lO.I0001Ioi1lo("ProcessingRequest", "onCaptureFailure: request ID = " + i, ioi1lIO);
/* 37 */            Oi0Oi10I oi0Oi10I = oOIo1Iiiil.I000II;
/* 39 */            I1lO0I0 i1lO0I0 = oi0Oi10I.I00000oIO;
/* 41 */            lOllIO.I00000oIO();
/* 46 */            if (oi0Oi10I.I000II) {
/* 168 */               return;
                    }
/* 49 */            lOllIO.I00000oIO();
/* 52 */            int i2 = i1lO0I0.I00000oIO;
/* 54 */            if (i2 > 0) {
/* 56 */                z = true;
/* 58 */                i1lO0I0.I00000oIO = i2 - 1;
                    } else {
/* 61 */                z = false;
                    }
/* 62 */            if (!z) {
/* 64 */                lOllIO.I00000oIO();
/* 67 */                I1lO0I0 i1lO0I02 = oi0Oi10I.I00000oIO;
/* 69 */                Executor executor = i1lO0I02.I0000Il00O;
/* 75 */                Io11iII11ll io11iII11ll = new Io11iII11ll(19);
/* 78 */                io11iII11ll.I00iiI = i1lO0I02;
/* 80 */                io11iII11ll.I00iiO = ioi1lIO;
/* 82 */                VarHandle.storeStoreFence();
/* 85 */                executor.execute(io11iII11ll);
                    }
/* 88 */            oi0Oi10I.I00000oIO();
/* 93 */            oi0Oi10I.I0000oI00.I0000O(ioi1lIO);
/* 96 */            if (z) {
/* 98 */                Olo1I1 olo1I1 = oi0Oi10I.I00000oOI;
/* 100 */               lOllIO.I00000oIO();
/* 106 */               l11I11lO.I0000O(3, "TakePictureManagerImpl");
/* 111 */               olo1I1.I00iOIl.addFirst(i1lO0I0);
/* 114 */               olo1I1.I0000Il00O();
                    }
                }

                public void I00IoO0(String str, Bundle bundle, boolean z) {
                    String str2;
                    String strEncodeToString;
                    boolean zI0000oI00;
                    int i;
/* 5 */             bundle.putString("scope", "*");
/* 10 */            bundle.putString("sender", str);
/* 15 */            bundle.putString("subtype", str);
/* 22 */            IlIoliIO ilIoliIO = (IlIoliIO) this.I00iiI;
/* 24 */            ilIoliIO.I00000oIO();
/* 31 */            bundle.putString("gmp_app_id", ilIoliIO.I0000Il00O.I00000oOI);
/* 48 */            bundle.putString("gmsv", Integer.toString(((I101oOiOiI) this.I00iiO).I0000O()));
/* 59 */            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
/* 72 */            bundle.putString("app_ver", ((I101oOiOiI) this.I00iiO).I00000oOI());
/* 79 */            I101oOiOiI i101oOiOiI = (I101oOiOiI) this.I00iiO;
                    synchronized (i101oOiOiI) {
                        try {
/* 86 */                    if (((String) i101oOiOiI.I0000oI00) == null) {
/* 88 */                        i101oOiOiI.I000O01llI0();
                            }
/* 97 */                    str2 = (String) i101oOiOiI.I0000oI00;
                        } finally {
                        }
                    }
/* 100 */           bundle.putString("app_ver_name", str2);
/* 107 */           IlIoliIO ilIoliIO2 = (IlIoliIO) this.I00iiI;
/* 109 */           ilIoliIO2.I00000oIO();
                    try {
/* 130 */               strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ilIoliIO2.I00000oOI.getBytes()), 11);
                    } catch (NoSuchAlgorithmException unused) {
/* 135 */               strEncodeToString = "[HASH-ERROR]";
                    }
/* 137 */           bundle.putString("firebase-app-name-hash", strEncodeToString);
/* 140 */           if (z) {
/* 146 */               IlIoliIO ilIoliIO3 = (IlIoliIO) this.I00iiI;
/* 148 */               ilIoliIO3.I00000oIO();
/* 155 */               bundle.putString("Goog-Api-Key", ilIoliIO3.I0000Il00O.I00000oIO);
                    }
                    try {
/* 174 */               String str3 = ((I1l0o01O0) lOio0o.I00000oIO(((IlO01o11oOOO) ((IlO0Ii1Il00o) this.I00io1l)).I0000O())).I00000oIO;
/* 180 */               if (TextUtils.isEmpty(str3)) {
/* 194 */                   Log.w("FirebaseMessaging", "FIS auth token is empty");
                        } else {
/* 184 */                   bundle.putString("Goog-Firebase-Installations-Auth", str3);
                        }
                    } catch (InterruptedException | ExecutionException e) {
/* 202 */               Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
                    }
/* 223 */           bundle.putString("appid", (String) lOio0o.I00000oIO(((IlO01o11oOOO) ((IlO0Ii1Il00o) this.I00io1l)).I0000Il00O()));
/* 230 */           bundle.putString("cliv", "fcm-25.1.1");
/* 241 */           Io1OoiO io1OoiO = (Io1OoiO) ((OOiO0Il) this.I00ilO0).get();
/* 251 */           IiIO0i100IO iiIO0i100IO = (IiIO0i100IO) ((OOiO0Il) this.I00ilI0I1).get();
/* 253 */           if (io1OoiO == null || iiIO0i100IO == null) {
/* 349 */               return;
                    }
/* 257 */           Ii1oil ii1oil = (Ii1oil) io1OoiO;
                    synchronized (ii1oil) {
/* 260 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 270 */               Io1Ooo1 io1Ooo1 = (Io1Ooo1) ii1oil.I00000oIO.get();
                        synchronized (io1Ooo1) {
/* 273 */                   zI0000oI00 = io1Ooo1.I0000oI00(jCurrentTimeMillis);
                        }
/* 279 */               if (zI0000oI00) {
                            synchronized (io1Ooo1) {
/* 286 */                       String strI00000oOI = Io1Ooo1.I00000oOI(System.currentTimeMillis());
/* 290 */                       O00lOo o00lOo = io1Ooo1.I00000oIO;
/* 296 */                       IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(16);
/* 299 */                       iiioilIl1Il.I00iiI = io1Ooo1;
/* 301 */                       iiioilIl1Il.I00iiO = strI00000oOI;
/* 303 */                       VarHandle.storeStoreFence();
/* 306 */                       o00lOo.I00000oIO(iiioilIl1Il);
                            }
/* 311 */                   i = 3;
                        } else {
/* 317 */                   i = 1;
                        }
                    }
/* 318 */           if (i != 1) {
/* 330 */               bundle.putString("Firebase-Client-Log-Type", Integer.toString(IIlIOloOOO.I001lIiIIo1O(i)));
/* 339 */               bundle.putString("Firebase-Client", iiIO0i100IO.I00000oIO());
                    }
                }

                public void I00Iooi00oi(Olil0III olil0III) {
/* 3 */             lO0I0Io.I00000oIO(olil0III, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
/* 33 */            lO0I0Io.I00000oIO(olil0III, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((IioliO10l) this.I00iiO).I00000oOI) + "')");
                }

                public I011IO1I11OI I00O0i0ii() {
                    AtomicLong atomicLong;
                    long j;
                    int i;
                    ListenableFuture listenableFuture;
/* 1 */             Executor executor = Iii11Ooi.I00iOIl;
/* 5 */             Oio0llilli oio0llilli = (Oio0llilli) this.I00io1l;
/* 11 */            if (oio0llilli.isDone()) {
/* 245 */               return oio0llilli;
                    }
/* 43 */            do {
/* 15 */                atomicLong = (AtomicLong) this.I00iiO;
/* 17 */                j = atomicLong.get();
/* 26 */                i = (int) (j >>> 32);
/* 43 */            } while (!atomicLong.compareAndSet(j, ((((int) j) + 1) & 4294967295L) | (i << 32)));
/* 47 */            AtomicReference atomicReference = (AtomicReference) this.I00ilI0I1;
/* 51 */            Oio0llilli oio0llilli2 = new Oio0llilli();
/* 58 */            ListenableFuture listenableFuture2 = (ListenableFuture) atomicReference.getAndSet(oio0llilli2);
/* 60 */            if (listenableFuture2 == null) {
/* 67 */                O1I1OO o1i1oo = new O1I1OO(17, (byte) 0);
/* 70 */                o1i1oo.I00iiO = this;
/* 72 */                o1i1oo.I00iiI = i;
/* 74 */                VarHandle.storeStoreFence();
/* 77 */                i000IO i000ioI00000oIO = o0iOII1liI.I00000oIO(o1i1oo);
/* 83 */                OoIlol ooIlol = new OoIlol();
/* 91 */                ooIlol.I00l0I0l0lO1 = new OoIlliloii0(ooIlol, i000ioI00000oIO);
/* 93 */                executor.execute(ooIlol);
                        listenableFuture = ooIlol;
                    } else {
/* 99 */                o011OO0i0OlO o011oo0i0olo = new o011OO0i0OlO();
/* 102 */               o011oo0i0olo.I00000oIO = this;
/* 104 */               o011oo0i0olo.I00000oOI = i;
/* 106 */               VarHandle.storeStoreFence();
/* 109 */               ll10Ii1io1I ll10ii1io1iI00000oOI = o0iOII1liI.I00000oOI(o011oo0i0olo);
/* 115 */               OilOi0I1 oilOi0I1 = (OilOi0I1) this.I00ilO0;
/* 117 */               int i2 = I00ll1.I00ll1;
/* 123 */               I00l0OO0IO i00l0OO0IO = new I00l0OO0IO(listenableFuture2, Throwable.class, ll10ii1io1iI00000oOI);
/* 130 */               listenableFuture2.addListener(i00l0OO0IO, l1i0oIO0.I00000oOI(oilOi0I1, i00l0OO0IO));
/* 133 */               listenableFuture = i00l0OO0IO;
                    }
/* 134 */           oio0llilli2.I000o00OoI0I(listenableFuture);
/* 139 */           o01IliI1I o01ilii1i = new o01IliI1I();
/* 142 */           o01ilii1i.I00ioIO = this;
/* 144 */           o01ilii1i.I00l0I0l0lO1 = i;
/* 146 */           VarHandle.storeStoreFence();
/* 153 */           O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(21);
/* 156 */           o10oO1IiI1.I00iiI = this;
/* 158 */           o10oO1IiI1.I00iiO = oio0llilli2;
/* 160 */           o10oO1IiI1.I00iio = o01ilii1i;
/* 162 */           VarHandle.storeStoreFence();
/* 165 */           oio0llilli2.addListener(o10oO1IiI1, executor);
/* 245 */           return o01ilii1i;
                }

                public void I00O0o1oo(String str) {
/* 17 */            ll110IIi0O.I00000oIO(lo01OlOIIoo.I00000oIO.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
/* 34 */            ll110IIi0O.I00000oIO(!lo01OlOIIoo.I0000Il00O.contains(str), "Module name is reserved and cannot be used: %s", str);
/* 37 */            this.I00iio = str;
                }

                public void I00O10llo(String str) {
/* 7 */             if (str.startsWith("/")) {
/* 10 */                str = str.substring(1);
                    }
/* 14 */            Pattern pattern = lo01OlOIIoo.I00000oIO;
/* 16 */            this.I00ilO0 = str;
                }

                public Uri I00OI1() {
                    String strI0010I0i;
/* 3 */             String str = (String) this.I00iiO;
/* 7 */             String str2 = (String) this.I00iio;
/* 9 */             Account account = lloiiI0ii.I00000oIO;
/* 13 */            Account account2 = (Account) this.I00ilI0I1;
/* 35 */            ll110IIi0O.I00000oIO(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
/* 55 */            ll110IIi0O.I00000oIO(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
/* 73 */            ll110IIi0O.I00000oIO(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
/* 82 */            if (lloiiI0ii.I00000oIO.equals(account2)) {
/* 84 */                strI0010I0i = "shared";
                    } else {
/* 87 */                String str3 = account2.type;
/* 89 */                String str4 = account2.name;
/* 116 */               strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
                    }
/* 122 */           String str5 = (String) this.I00ilO0;
/* 153 */           StringBuilder sb = new StringBuilder(strI0010I0i.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
/* 158 */           IIl001iO0Io.I001lIiIIo1O(sb, "/", str, "/", str2);
/* 204 */           return new Uri.Builder().scheme("android").authority((String) this.I00iiI).path(IIl001iO0Io.I00100o1O0lo(sb, "/", strI0010I0i, "/", str5)).encodedFragment(lo1oOOI1101i.I00000oIO(((IoilOI) this.I00io1l).I000l1())).build();
                }

                public iO0O0li111 I00OIO1() {
/* 3 */             iO0O0li111 io0o0li111 = new iO0O0li111();
/* 10 */            io0o0li111.I00000oIO = (iOOlIOiOl) this.I00iiI;
/* 16 */            io0o0li111.I00000oOI = (iO0O00) this.I00iiO;
/* 22 */            io0o0li111.I0000Il00O = (iOIiOil) this.I00iio;
/* 28 */            io0o0li111.I0000O = (iOIi0li1l) this.I00ilI0I1;
/* 34 */            io0o0li111.I0000oI00 = (iOIOloiliO) this.I00ilO0;
/* 40 */            io0o0li111.I0001Ioi1lo = (iOIOoO0) this.I00io1l;
/* 42 */            VarHandle.storeStoreFence();
/* 55 */            return io0o0li111;
                }

                public I011IO1I11OI I00OIl(int i) {
                    AtomicReference atomicReference;
                    o01OIIIoi o01oiiioi;
                    Executor executor;
/* 3 */             AtomicLong atomicLong = (AtomicLong) this.I00iiO;
/* 13 */            if (((int) (atomicLong.get() >>> 32)) > i) {
/* 15 */                IoiiOIo1i ioiiOIo1i = IoiiOIo1i.I00ioIO;
                        return ioiiOIo1i != null ? ioiiOIo1i : new IoiiOIo1i();
                    }
/* 28 */            o01OIIIoi o01oiiioi2 = new o01OIIIoi();
/* 31 */            o01oiiioi2.I00ioIO = i;
/* 33 */            VarHandle.storeStoreFence();
/* 68 */            do {
/* 38 */                atomicReference = (AtomicReference) this.I00iio;
/* 44 */                o01oiiioi = (o01OIIIoi) atomicReference.get();
/* 46 */                if (o01oiiioi != null && o01oiiioi.I00ioIO > i) {
/* 53 */                    IoiiOIo1i ioiiOIo1i2 = IoiiOIo1i.I00ioIO;
                            return ioiiOIo1i2 != null ? ioiiOIo1i2 : new IoiiOIo1i();
                        }
/* 68 */            } while (!atomicReference.compareAndSet(o01oiiioi, o01oiiioi2));
/* 77 */            if (((int) (atomicLong.get() >>> 32)) > i) {
/* 80 */                o01oiiioi2.cancel(true);
/* 84 */                atomicReference.compareAndSet(o01oiiioi2, null);
/* 87 */                return o01oiiioi2;
                    }
/* 90 */            liOO1i1 lioo1i1 = (liOO1i1) this.I00iiI;
/* 94 */            I1OlOl11O0 i1OlOl11O0 = (I1OlOl11O0) lioo1i1.I00iiI;
/* 96 */            if (i1OlOl11O0 == null || (executor = (Executor) lioo1i1.I00iiO) == null) {
/* 132 */               o01oiiioi2.I000o00OoI0I((Oio0llilli) this.I00io1l);
/* 168 */               return o01oiiioi2;
                    }
/* 105 */           i000IO i000ioI00000oIO = o0iOII1liI.I00000oIO(i1OlOl11O0);
/* 111 */           OoIlol ooIlol = new OoIlol();
/* 119 */           ooIlol.I00l0I0l0lO1 = new OoIlliloii0(ooIlol, i000ioI00000oIO);
/* 121 */           executor.execute(ooIlol);
/* 124 */           o01oiiioi2.I000o00OoI0I(ooIlol);
/* 127 */           return o01oiiioi2;
                }

                public lIO1iOooo1O I00OIo() {
/* 3 */             lIO1iOooo1O lio1ioooo1o = new lIO1iOooo1O();
/* 10 */            lio1ioooo1o.I00000oIO = (lOOiIOiIilOo) this.I00iiI;
/* 16 */            lio1ioooo1o.I00000oOI = (lIIl0IOioI) this.I00iiO;
/* 22 */            lio1ioooo1o.I0000Il00O = (lIIO1i1Oo01O) this.I00iio;
/* 28 */            lio1ioooo1o.I0000O = (lIli10) this.I00ilI0I1;
/* 34 */            lio1ioooo1o.I0000oI00 = (lIo0010ol) this.I00ilO0;
/* 40 */            lio1ioooo1o.I0001Ioi1lo = (ilO0o0olO0) this.I00io1l;
/* 42 */            VarHandle.storeStoreFence();
/* 55 */            return lio1ioooo1o;
                }

                public li0IoOiiO I00OOll1() {
/* 3 */             li0IoOiiO li0iooiio = new li0IoOiiO();
/* 10 */            li0iooiio.I00000oIO = (lloiOoi0i1ol) this.I00iiI;
/* 16 */            li0iooiio.I00000oOI = (lOoo11) this.I00iiO;
/* 22 */            li0iooiio.I0000Il00O = (lOolIoOl0) this.I00iio;
/* 28 */            li0iooiio.I0000O = (ll0il0ioIl) this.I00ilI0I1;
/* 34 */            li0iooiio.I0000oI00 = (ll0I0l1O1OOl) this.I00ilO0;
/* 40 */            li0iooiio.I0001Ioi1lo = (il1l1lo0i00) this.I00io1l;
/* 42 */            VarHandle.storeStoreFence();
/* 55 */            return li0iooiio;
                }

                public liiI0oII0iO I00OilO00Il() {
/* 3 */             liiI0oII0iO liii0oii0io = new liiI0oII0iO();
/* 10 */            liii0oii0io.I00000oIO = (loI1IIi) this.I00iiI;
/* 16 */            liii0oii0io.I00000oOI = (liOll1O) this.I00iiO;
/* 22 */            liii0oii0io.I0000Il00O = (liOi0IoI0i) this.I00iio;
/* 28 */            liii0oii0io.I0000O = (lloolo1) this.I00ilI0I1;
/* 34 */            liii0oii0io.I0000oI00 = (lloiiiOi10) this.I00ilO0;
/* 40 */            liii0oii0io.I0001Ioi1lo = (io0011OOloo) this.I00io1l;
/* 42 */            VarHandle.storeStoreFence();
/* 55 */            return liii0oii0io;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 10:
/* 13 */                    Map map = (Map) this.I00ilO0;
/* 19 */                    StringBuilder sb = new StringBuilder("Request{method=");
/* 26 */                    sb.append((String) this.I00iiO);
/* 31 */                    sb.append(", url=");
/* 38 */                    sb.append((IoOi01OlIl1o) this.I00iiI);
/* 43 */                    Io1Io0OOi011 io1Io0OOi011 = (Io1Io0OOi011) this.I00iio;
/* 49 */                    if (io1Io0OOi011.size() != 0) {
/* 53 */                        sb.append(", headers=[");
/* 56 */                        Iterator it = io1Io0OOi011.iterator();
/* 60 */                        int i = 0;
                                while (true) {
/* 62 */                            I01I0Iioooo0 i01I0Iioooo0 = (I01I0Iioooo0) it;
/* 68 */                            if (i01I0Iioooo0.hasNext()) {
/* 70 */                                Object next = i01I0Iioooo0.next();
/* 74 */                                int i2 = i + 1;
/* 76 */                                if (i < 0) {
/* 108 */                                   IOOi1I.I000lI();
/* 112 */                                   throw null;
                                        }
/* 78 */                                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) next;
/* 82 */                                String str = (String) oIoi0IIoi.I00iOIl;
/* 86 */                                String str2 = (String) oIoi0IIoi.I00iiI;
/* 88 */                                if (i > 0) {
/* 92 */                                    sb.append(", ");
                                        }
/* 95 */                                sb.append(str);
/* 100 */                               sb.append(':');
/* 103 */                               sb.append(str2);
/* 106 */                               i = i2;
                                    } else {
/* 115 */                               sb.append(']');
                                    }
                                }
                            }
/* 122 */                   if (!map.isEmpty()) {
/* 126 */                       sb.append(", tags=");
/* 129 */                       sb.append(map);
                            }
/* 134 */                   sb.append('}');
/* 137 */                   return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:153:0x044e  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[LOOP:0: B:19:0x00c4->B:21:0x00ca, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean zza() throws JSONException, NoSuchAlgorithmException, PackageManager.NameNotFoundException, o0io0il {
                    String strI00000oIO;
                    Iterator it;
                    InputStream errorStream;
                    o0iO1llOoO o0io1llooo;
                    JSONObject jSONObject;
                    JSONArray jSONArray;
                    PackageInfo packageInfo;
                    byte[] bArrI00000oIO;
/* 5 */             loOill110Ol looill110ol = loOill110Ol.NO_CONNECTION;
/* 7 */             loOill110Ol looill110ol2 = loOill110Ol.RPC_RETURNED_MALFORMED_RESULT;
/* 13 */            I00IOO i00ioo = ((o01oIol1O) this.I00iio).I0000oI00;
/* 17 */            o0ilO10O o0ilo10o = (o0ilO10O) this.I00io1l;
                    try {
/* 21 */                HttpURLConnection httpURLConnectionI00000oIO = o0ilo10o.I0000O.I00000oIO();
/* 25 */                o0iIO0oO0O00 o0iio0oo0o00 = o0ilo10o.I0000O;
/* 27 */                o01l1ioOo0 o01l1iooo0 = o0ilo10o.I0000Il00O;
/* 39 */                lII0I0I000I.I000OiO(((IioiI0IIIIO) o01l1iooo0.I00iio) != null);
/* 50 */                String str = ((o01Il0IOli) ((IioiI0IIIIO) o01l1iooo0.I00iio).I00000oOI).I00000oIO;
/* 54 */                String str2 = (String) this.I00iiI;
/* 58 */                Date date = (Date) this.I00iiO;
/* 60 */                String str3 = o0ilo10o.I000OiO;
/* 62 */                o0l101oi1li1 o0l101oi1li1Var = o0iio0oo0o00.I0000O;
/* 68 */                httpURLConnectionI00000oIO.setDoOutput(true);
/* 75 */                httpURLConnectionI00000oIO.setConnectTimeout(5000);
/* 78 */                httpURLConnectionI00000oIO.setReadTimeout(5000);
/* 84 */                httpURLConnectionI00000oIO.setRequestProperty("If-None-Match", null);
/* 91 */                httpURLConnectionI00000oIO.setRequestProperty("X-Goog-Api-Key", o0iio0oo0o00.I00000oOI);
/* 94 */                Context context = o0iio0oo0o00.I00000oIO;
/* 102 */               httpURLConnectionI00000oIO.setRequestProperty("X-Android-Package", context.getPackageName());
                        try {
/* 109 */                   bArrI00000oIO = iOO0100o.I00000oIO(context, context.getPackageName());
                        } catch (PackageManager.NameNotFoundException e) {
/* 157 */                   Log.e("MLKitRemoteConfigFetch", "No such package: ".concat(String.valueOf(context.getPackageName())), e);
                        }
/* 113 */               if (bArrI00000oIO == null) {
/* 131 */                   Log.e("MLKitRemoteConfigFetch", "Could not get fingerprint hash for package: " + context.getPackageName());
/* 134 */                   strI00000oIO = null;
/* 163 */                   httpURLConnectionI00000oIO.setRequestProperty("X-Android-Cert", strI00000oIO);
/* 170 */                   httpURLConnectionI00000oIO.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
/* 177 */                   httpURLConnectionI00000oIO.setRequestProperty("Content-Type", "application/json");
/* 182 */                   httpURLConnectionI00000oIO.setRequestProperty("Accept", "application/json");
/* 185 */                   iiiiIIllo iiiiiillo = iiiiIIllo.I00io1l;
/* 193 */                   it = ((iiOoi0oll01I) iiiiiillo.entrySet()).iterator();
/* 201 */                   while (it.hasNext()) {
/* 207 */                       Map.Entry entry = (Map.Entry) it.next();
/* 225 */                       httpURLConnectionI00000oIO.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
/* 228 */                       context = context;
                            }
/* 231 */                   Context context2 = context;
/* 238 */                   if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
/* 249 */                       Iterator<Map.Entry<String, List<String>>> it2 = httpURLConnectionI00000oIO.getRequestProperties().entrySet().iterator();
/* 257 */                       while (it2.hasNext()) {
/* 259 */                           Map.Entry<String, List<String>> next = it2.next();
/* 265 */                           String key = next.getKey();
/* 275 */                           Iterator<Map.Entry<String, List<String>>> it3 = it2;
/* 283 */                           if (!liool1o110.I00000oIO(key).contains("api-key") && !liool1o110.I00000oIO(key).contains("android-cert")) {
/* 311 */                               for (String str4 : next.getValue()) {
                                        }
                                    }
/* 320 */                           it2 = it3;
                                }
                            }
/* 326 */                   HashMap map = new HashMap();
/* 329 */                   if (str != null) {
/* 1110 */                      throw new o0io0il("Fetch failed: Firebase instance id is null.");
                            }
/* 333 */                   map.put("appInstanceId", str);
/* 338 */                   map.put("appInstanceIdToken", str2);
/* 345 */                   map.put("appId", "1:722550545529:android:82c62205f0ef0ea96608a8");
/* 356 */                   Locale locale = context2.getResources().getConfiguration().locale;
/* 364 */                   map.put("countryCode", locale.getCountry());
/* 373 */                   map.put("languageCode", locale.toString());
/* 384 */                   map.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
/* 397 */                   map.put("timeZone", TimeZone.getDefault().getID());
                            try {
/* 409 */                       packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
/* 418 */                   String str5 = packageInfo != null ? packageInfo.versionName : null;
/* 435 */                   String str6 = str5 + "-MLKit-" + str3;
/* 441 */                   "APP_VERSION: ".concat(str6);
/* 446 */                   map.put("appVersion", str6);
/* 455 */                   map.put("packageName", context2.getPackageName());
/* 462 */                   map.put("sdkVersion", "o:a:mlkit:1.0.0");
/* 472 */                   map.put("analyticsUserProperties", new JSONObject(iiiiiillo));
/* 477 */                   JSONObject jSONObject2 = new JSONObject(map);
/* 485 */                   if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
/* 490 */                       JSONObject jSONObject3 = new JSONObject();
/* 493 */                       Iterator<String> itKeys = jSONObject2.keys();
/* 501 */                       while (itKeys.hasNext()) {
/* 503 */                           String next2 = itKeys.next();
                                    try {
/* 513 */                               jSONObject3.put(next2, jSONObject2.get(next2));
                                    } catch (JSONException e2) {
/* 520 */                               IoOOl0iOl1io.I000l1("shallowCopyJsonObject: concurrent mutation?", e2);
/* 523 */                               return false;
                                    }
                                }
/* 526 */                       jSONObject3.remove("appInstanceIdToken");
/* 535 */                       "HTTP Request Body: ".concat(jSONObject3.toString());
                            }
/* 544 */                   byte[] bytes = jSONObject2.toString().getBytes(StandardCharsets.UTF_8);
/* 550 */                   o01oIol1O o01oiol1o = new o01oIol1O();
/* 553 */                   o01oiol1o.I0000Il00O();
                            try {
/* 562 */                       "Connecting: ".concat(String.valueOf(httpURLConnectionI00000oIO));
                                try {
/* 566 */                           httpURLConnectionI00000oIO.setFixedLengthStreamingMode(bytes.length);
/* 575 */                           BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionI00000oIO.getOutputStream());
/* 578 */                           bufferedOutputStream.write(bytes);
/* 581 */                           bufferedOutputStream.flush();
/* 584 */                           bufferedOutputStream.close();
/* 587 */                           httpURLConnectionI00000oIO.connect();
/* 590 */                           int responseCode = httpURLConnectionI00000oIO.getResponseCode();
                                    try {
/* 594 */                               o01oiol1o.I0001Ioi1lo = responseCode;
/* 598 */                               loOill110Ol looill110ol3 = loOill110Ol.RPC_ERROR;
/* 600 */                               if (responseCode != 200) {
/* 904 */                                   o01oiol1o.I00000oIO(looill110ol3);
/* 907 */                                   i00ioo.I000l1(looill110ol3);
/* 915 */                                   if (Log.isLoggable("MLKitRemoteConfigFetch", 4)) {
/* 933 */                                       for (Map.Entry<String, List<String>> entry2 : httpURLConnectionI00000oIO.getHeaderFields().entrySet()) {
/* 955 */                                           for (String str7 : entry2.getValue()) {
/* 994 */                                               Log.i("MLKitRemoteConfigFetch", "HTTP Response Header: " + entry2.getKey() + ": " + str7);
                                                    }
                                                }
                                            }
/* 1003 */                                  if (Log.isLoggable("MLKitRemoteConfigFetch", 5) && (errorStream = httpURLConnectionI00000oIO.getErrorStream()) != null) {
/* 1018 */                                      Scanner scannerUseDelimiter = new Scanner(errorStream).useDelimiter("\\A");
/* 1026 */                                      if (scannerUseDelimiter.hasNext()) {
/* 1042 */                                          Log.w("MLKitRemoteConfigFetch", "HTTP Error Stream: ".concat(String.valueOf(scannerUseDelimiter.next())));
                                                }
                                            }
                                            try {
/* 1054 */                                      throw new o0io0il(httpURLConnectionI00000oIO.getResponseMessage());
                                            } catch (IOException e3) {
/* 1063 */                                      throw new o0io0il("<error reading HTTP response>", e3);
                                            }
                                        }
/* 607 */                               if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
/* 626 */                                   for (Map.Entry<String, List<String>> entry3 : httpURLConnectionI00000oIO.getHeaderFields().entrySet()) {
/* 648 */                                       for (String str8 : entry3.getValue()) {
/* 656 */                                           entry3.getKey();
                                                }
                                            }
                                        }
/* 668 */                               httpURLConnectionI00000oIO.getHeaderField("ETag");
                                        try {
/* 684 */                                   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionI00000oIO.getInputStream(), StandardCharsets.UTF_8));
/* 689 */                                   StringBuilder sb = new StringBuilder();
                                            while (true) {
/* 692 */                                       int i = bufferedReader.read();
/* 697 */                                       if (i == -1) {
                                                    break;
                                                }
/* 700 */                                       sb.append((char) i);
                                            }
/* 716 */                                   JSONObject jSONObject4 = new JSONObject(sb.toString());
/* 719 */                                   jSONObject4.toString();
/* 722 */                                   httpURLConnectionI00000oIO.disconnect();
/* 737 */                                   if (jSONObject4.get("state").equals("NO_CHANGE")) {
/* 744 */                                       o0io1llooo = new o0iO1llOoO(null);
                                            } else {
                                                try {
/* 753 */                                           JSONObject jSONObject5 = new JSONObject();
/* 756 */                                           int i2 = o0i1ol0.I0000O;
/* 760 */                                           JSONArray jSONArray2 = new JSONArray();
                                                    try {
/* 765 */                                               jSONObject = jSONObject4.getJSONObject("entries");
                                                    } catch (JSONException unused2) {
/* 770 */                                               jSONObject = null;
                                                    }
/* 771 */                                           if (jSONObject != null) {
                                                        try {
/* 779 */                                                   jSONObject5 = new JSONObject(jSONObject.toString());
                                                        } catch (JSONException unused3) {
                                                        }
                                                    }
                                                    try {
/* 785 */                                               jSONArray = jSONObject4.getJSONArray("experimentDescriptions");
                                                    } catch (JSONException unused4) {
/* 790 */                                               jSONArray = null;
                                                    }
/* 791 */                                           if (jSONArray != null) {
                                                        try {
/* 799 */                                                   jSONArray2 = new JSONArray(jSONArray.toString());
                                                        } catch (JSONException unused5) {
                                                        }
                                                    }
/* 810 */                                           o0io1llooo = new o0iO1llOoO(new o0i1ol0(jSONObject5, date, jSONArray2));
                                                } catch (JSONException e4) {
/* 860 */                                           loOill110Ol looill110ol4 = loOill110Ol.RPC_RETURNED_INVALID_RESULT;
/* 862 */                                           o01oiol1o.I00000oIO(looill110ol4);
/* 865 */                                           i00ioo.I000l1(looill110ol4);
/* 875 */                                           throw new o0io0il("Fetch failed: fetch response could not be parsed.", e4);
                                                }
                                            }
/* 814 */                                   o01oiol1o.I00000oOI();
/* 817 */                                   o0l101oi1li1Var.getClass();
/* 822 */                                   o0l101oi1li1Var.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_FRC_FETCH, o01oiol1o);
/* 827 */                                   o0i1ol0 o0i1ol0Var = (o0i1ol0) o0io1llooo.I00000oIO;
/* 829 */                                   this.I00ilO0 = o0i1ol0Var;
/* 831 */                                   JSONObject jSONObject6 = o0i1ol0Var.I00000oOI;
                                            try {
/* 837 */                                       this.I00ilI0I1 = o0ilO10O.I0000Il00O(jSONObject6);
/* 33 */                                        return true;
                                            } catch (JSONException e5) {
/* 841 */                                       i00ioo.I000l1(looill110ol2);
/* 854 */                                       Log.e("MLKit RemoteConfigRestC", "Fetched remote config setting has invalid format: ".concat(String.valueOf(jSONObject6)), e5);
/* 523 */                                       return false;
                                            }
                                        } catch (IOException e6) {
/* 876 */                                   o01oiol1o.I00000oIO(looill110ol3);
/* 879 */                                   i00ioo.I000l1(looill110ol3);
/* 889 */                                   throw new o0io0il("The client had an error while calling the backend!", e6);
                                        } catch (JSONException e7) {
/* 890 */                                   o01oiol1o.I00000oIO(looill110ol2);
/* 893 */                                   i00ioo.I000l1(looill110ol2);
/* 903 */                                   throw new o0io0il("Error parsing the server output", e7);
                                        }
                                    } catch (Throwable th) {
/* 1064 */                              httpURLConnectionI00000oIO.disconnect();
/* 1067 */                              throw th;
                                    }
                                } catch (IOException e8) {
/* 1069 */                          o01oiol1o.I00000oIO(looill110ol);
/* 1072 */                          i00ioo.I000l1(looill110ol);
/* 1090 */                          throw new o0io0il("Error connecting to ".concat(String.valueOf(httpURLConnectionI00000oIO)), e8);
                                }
                            } catch (Throwable th2) {
/* 1091 */                      o01oiol1o.I00000oOI();
/* 1094 */                      o0l101oi1li1Var.getClass();
/* 1099 */                      o0l101oi1li1Var.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_FRC_FETCH, o01oiol1o);
/* 1102 */                      throw th2;
                            }
                        }
/* 138 */               strI00000oIO = iIo0Ioi1lIl.I00000oIO(bArrI00000oIO);
/* 163 */               httpURLConnectionI00000oIO.setRequestProperty("X-Android-Cert", strI00000oIO);
/* 170 */               httpURLConnectionI00000oIO.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
/* 177 */               httpURLConnectionI00000oIO.setRequestProperty("Content-Type", "application/json");
/* 182 */               httpURLConnectionI00000oIO.setRequestProperty("Accept", "application/json");
/* 185 */               iiiiIIllo iiiiiillo2 = iiiiIIllo.I00io1l;
/* 193 */               it = ((iiOoi0oll01I) iiiiiillo2.entrySet()).iterator();
/* 201 */               while (it.hasNext()) {
                        }
/* 231 */               Context context22 = context;
/* 238 */               if (Log.isLoggable("MLKitRemoteConfigFetch", 3)) {
                        }
/* 326 */               HashMap map2 = new HashMap();
/* 329 */               if (str != null) {
                        }
                    } catch (o0iolOlII11I e9) {
/* 1114 */              Log.e("MLKit RemoteConfigRestC", "Creating HTTP connection to remote config service failed", e9);
/* 1117 */              i00ioo.I000l1(looill110ol);
/* 523 */               return false;
                    }
                }

/* 568 */       public I0Oi111ii(o0ilO10O o0ilo10o, String str, Date date, o01oIol1O o01oiol1o) {
                    this.I00iOIl = 20;
                    this.I00io1l = o0ilo10o;
                    this.I00iiI = str;
                    this.I00iiO = date;
                    this.I00iio = o01oiol1o;
                }

/* 569 */       public I0Oi111ii(I1OlOl11O0 i1OlOl11O0) {
                    this.I00iOIl = 19;
/* 571 */           this.I00iiO = new AtomicLong(-9223372034707292160L);
/* 572 */           this.I00iio = new AtomicReference(null);
/* 573 */           this.I00ilI0I1 = new AtomicReference(null);
/* 574 */           Iii11Ooi iii11Ooi = Iii11Ooi.I00iOIl;
                    this.I00ilO0 = l1i0oIO0.I00000oIO(iii11Ooi);
/* 576 */           Oio0llilli oio0llilli = new Oio0llilli();
/* 577 */           this.I00io1l = oio0llilli;
/* 578 */           liOO1i1 lioo1i1 = new liOO1i1(13);
                    lioo1i1.I00iiI = i1OlOl11O0;
/* 579 */           lioo1i1.I00iiO = iii11Ooi;
/* 580 */           this.I00iiI = lioo1i1;
/* 581 */           oio0llilli.addListener(lioo1i1, iii11Ooi);
                }

/* 581 */       public I0Oi111ii(int i) {
/* 582 */           this.I00iOIl = i;
                }
            }
