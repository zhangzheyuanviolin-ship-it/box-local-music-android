            package p000;

            import android.app.Activity;
            import android.app.ActivityManager;
            import android.app.KeyguardManager;
            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.Color;
            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.media.AudioAttributes;
            import android.media.RingtoneManager;
            import android.net.ConnectivityManager;
            import android.net.Network;
            import android.net.NetworkCapabilities;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Process;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import androidx.core.graphics.drawable.IconCompat;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.nio.ByteBuffer;
            import java.security.AlgorithmParameters;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.Key;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import java.util.concurrent.Callable;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.concurrent.locks.ReentrantLock;
            import javax.crypto.Cipher;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONException;
            
/* 69 */    public final class IoIlOo1o0IIl implements I01l1o, Ol1iiOol0, I1I1oI, i0I0OoIIOO01, IIiOOIoi0, OIOiOoiIil1I, OOIOIIOIii1, OIIO0loiI, IOOI0i0Io {
                public static final Object I00ilI0I1 = new Object();
                public static loo00iO11 I00ilO0;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public IoIlOo1o0IIl(byte[] bArr) throws GeneralSecurityException {
/* 3 */             this.I00iOIl = 23;
/* 9 */             Oolo11o0IIio.I00000oIO(bArr.length);
/* 16 */            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
/* 19 */            this.I00iiI = secretKeySpec;
/* 26 */            if (!Oi010OO0.I0000oI00(1)) {
/* 66 */                IioIoO10iOiI.I000oI1ioi("Can not use AES-CMAC in FIPS-mode.");
/* 77 */                throw null;
                    }
/* 38 */            Cipher cipher = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/ECB/NoPadding");
/* 40 */            cipher.init(1, secretKeySpec);
/* 51 */            byte[] bArrI00000oIO = iOIOoI1.I00000oIO(cipher.doFinal(new byte[16]));
/* 55 */            this.I00iiO = bArrI00000oIO;
/* 61 */            this.I00iio = iOIOoI1.I00000oIO(bArrI00000oIO);
                }

                public static final IoIlOo1o0IIl I00111O(O0OOo0iol0I o0OOo0iol0I) throws GeneralSecurityException {
/* 6 */             if (o0OOo0iol0I.I001lIiIIo1O() <= 0) {
/* 177 */               IioIoO10iOiI.I000oI1ioi("empty keyset");
/* 5 */                 return null;
                    }
/* 14 */            ArrayList arrayList = new ArrayList(o0OOo0iol0I.I001lIiIIo1O());
/* 29 */            for (O0OOlOII0l0 o0OOlOII0l0 : o0OOo0iol0I.I001lllioOl()) {
/* 37 */                o0OOlOII0l0.getClass();
                        try {
                            try {
/* 92 */                        l0il1i0011O l0il1i0011oI00000oIO = OI10IIoI.I00000oOI.I00000oIO(OOi1OoI0loOi.I00000oIO(o0OOlOII0l0.I001iOo1i0O().I001lIiIIo1O(), o0OOlOII0l0.I001iOo1i0O().I001lllioOl(), o0OOlOII0l0.I001iOo1i0O().I001l0I00(), o0OOlOII0l0.I001lIiIIo1O(), o0OOlOII0l0.I001lIiIIo1O() == OIl1lli.RAW ? null : Integer.valueOf(o0OOlOII0l0.I001l0I00())));
/* 102 */                       int iOrdinal = o0OOlOII0l0.I001lllioOl().ordinal();
/* 107 */                       if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
/* 123 */                           throw new GeneralSecurityException("Unknown key status");
                                }
/* 124 */                       O0OOoIii10o o0OOoIii10o = new O0OOoIii10o();
/* 127 */                       o0OOoIii10o.I00000oIO = l0il1i0011oI00000oIO;
/* 129 */                       VarHandle.storeStoreFence();
/* 132 */                       arrayList.add(o0OOoIii10o);
                            } catch (GeneralSecurityException unused) {
/* 136 */                       arrayList.add(null);
                            }
                        } catch (GeneralSecurityException e) {
/* 150 */                   throw new IOiIIo1l("Creating a protokey serialization failed", e, 9);
                        }
                    }
/* 151 */           List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 160 */           IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(16, false);
/* 163 */           ioIlOo1o0IIl.I00iiI = o0OOo0iol0I;
/* 165 */           ioIlOo1o0IIl.I00iiO = listUnmodifiableList;
/* 169 */           ioIlOo1o0IIl.I00iio = OI00il1O.I00000oOI;
/* 171 */           VarHandle.storeStoreFence();
/* 174 */           return ioIlOo1o0IIl;
                }

                public static final IoIlOo1o0IIl I00IioO0OiOi(Oi1ol0llI oi1ol0llI, I0Ooii0oll i0Ooii0oll) throws GeneralSecurityException, IOException {
/* 2 */             byte[] bArr = new byte[0];
/* 6 */             ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) oi1ol0llI.I00iiI;
                    try {
/* 12 */                Il0Iiol1o il0Iiol1oI001lIiIIo1O = Il0Iiol1o.I001lIiIIo1O(byteArrayInputStream, Il1llO11O.I00000oIO());
/* 16 */                byteArrayInputStream.close();
/* 30 */                if (il0Iiol1oI001lIiIIo1O.I001iOo1i0O().size() == 0) {
/* 75 */                    IioIoO10iOiI.I000oI1ioi("empty keyset");
/* 27 */                    return null;
                        }
                        try {
/* 48 */                    O0OOo0iol0I o0OOo0iol0II00IO1 = O0OOo0iol0I.I00IO1(i0Ooii0oll.I00000oOI(il0Iiol1oI001lIiIIo1O.I001iOo1i0O().I000OiO(), bArr), Il1llO11O.I00000oIO());
/* 56 */                    if (o0OOo0iol0II00IO1.I001lIiIIo1O() > 0) {
/* 58 */                        return I00111O(o0OOo0iol0II00IO1);
                            }
/* 68 */                    throw new GeneralSecurityException("empty keyset");
                        } catch (O000oiiiOI0 unused) {
/* 71 */                    IioIoO10iOiI.I000oI1ioi("invalid keyset, corrupted key material");
/* 27 */                    return null;
                        }
                    } catch (Throwable th) {
/* 80 */                byteArrayInputStream.close();
/* 106 */               throw th;
                    }
                }

                public static void I00Io1lO(File file, File file2) {
/* 7 */             if (file2.isDirectory() && !file2.delete()) {
/* 29 */                Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
                    }
/* 36 */            if (file.renameTo(file2)) {
/* 106 */               return;
                    }
/* 60 */            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
                }

                @Override
                public float I00000oIO() {
/* 5 */             IIlo0i0ll iIlo0i0ll = ((IIloIoOOiO0l) this.I00iiI).I00000oOI;
/* 7 */             CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
/* 11 */            Object objValueOf = Float.valueOf(1.0f);
/* 17 */            Object objI0000O = ((IIioli) iIlo0i0ll).I0000O(key);
/* 21 */            if (objI0000O != null) {
/* 24 */                objValueOf = objI0000O;
                    }
/* 25 */            Float f = (Float) objValueOf;
/* 27 */            float fFloatValue = f.floatValue();
/* 50 */            if (Math.abs(fFloatValue) >= Math.ulp(Math.abs(fFloatValue)) * 2.0d) {
/* 84 */                return f.floatValue();
                    }
/* 59 */            if (l11I11lO.I0000O(5, "CXCP")) {
/* 80 */                Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
                    }
/* 9 */             return 1.0f;
                }

                @Override
                public void I00000oOI(Executor executor, OIOiOllolii oIOiOllolii) {
                    synchronized (((HashMap) this.I00iiO)) {
/* 10 */                boolean zIsEmpty = ((HashMap) this.I00iiO).isEmpty();
/* 18 */                ((HashMap) this.I00iiO).put(oIOiOllolii, executor);
/* 21 */                if (zIsEmpty) {
/* 23 */                    ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 30 */                    O110lOoo1O o110lOoo1O = new O110lOoo1O(1);
/* 33 */                    o110lOoo1O.I00iiI = this;
/* 35 */                    VarHandle.storeStoreFence();
/* 40 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(o110lOoo1O);
                        } else {
/* 47 */                    Io11iII11ll io11iII11ll = new Io11iII11ll(5);
/* 50 */                    io11iII11ll.I00iiI = this;
/* 52 */                    io11iII11ll.I00iiO = oIOiOllolii;
/* 54 */                    VarHandle.storeStoreFence();
/* 57 */                    executor.execute(io11iII11ll);
                        }
                    }
                }

                @Override
                public boolean I0000Il00O() {
/* 3 */             ConnectivityManager connectivityManager = (ConnectivityManager) this.I00iiI;
/* 12 */            for (Network network : connectivityManager.getAllNetworks()) {
/* 16 */                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
/* 20 */                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
/* 30 */                    return true;
                        }
                    }
/* 10 */            return false;
                }

                @Override
                public float I0000O() {
/* 1 */             return 1.0f;
                }

                @Override
                public byte[] I0000oI00(int i, byte[] bArr) throws GeneralSecurityException {
                    byte[] bArrI0000O;
/* 3 */             if (i > 16) {
/* 332 */               throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
                    }
/* 11 */            if (!Oi010OO0.I0000oI00(1)) {
/* 133 */               IioIoO10iOiI.I000oI1ioi("Can not use AES-CMAC in FIPS-mode.");
/* 10 */                return null;
                    }
/* 23 */            Cipher cipher = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/ECB/NoPadding");
/* 29 */            cipher.init(1, (SecretKeySpec) this.I00iiI);
/* 42 */            int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
/* 50 */            if (iMax * 16 == bArr.length) {
/* 59 */                bArrI0000O = iOiiIOilI1.I0000Il00O(bArr, (iMax - 1) * 16, (byte[]) this.I00iiO, 0, 16);
                    } else {
/* 68 */                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
/* 73 */                if (bArrCopyOfRange.length >= 16) {
/* 127 */                   I000II.I000iOII("x must be smaller than a block.");
/* 10 */                    return null;
                        }
/* 75 */                byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
/* 82 */                bArrCopyOf[bArrCopyOfRange.length] = Byte.MIN_VALUE;
/* 88 */                bArrI0000O = iOiiIOilI1.I0000O(bArrCopyOf, (byte[]) this.I00iio);
                    }
/* 92 */            byte[] bArrDoFinal = new byte[16];
/* 97 */            for (int i2 = 0; i2 < iMax - 1; i2++) {
/* 105 */               bArrDoFinal = cipher.doFinal(iOiiIOilI1.I0000Il00O(bArrDoFinal, 0, bArr, i2 * 16, 16));
                    }
/* 120 */           return Arrays.copyOf(cipher.doFinal(iOiiIOilI1.I0000O(bArrI0000O, bArrDoFinal)), i);
                }

                @Override
                public ArrayList I0001Ioi1lo(int i) {
/* 3 */             IOOIO1lI1ll iOOIO1lI1ll = (IOOIO1lI1ll) this.I00iiI;
/* 19 */            Integer num = (Integer) ((Io0OiI0l0Iio) this.I00iiO).I000OiO.get(Integer.valueOf(i));
/* 21 */            if (num == null) {
/* 39 */                Log.w("PdfBox-Android", "Trying to un-substitute a never-before-seen gid: " + i);
                    } else {
/* 43 */                i = num.intValue();
                    }
/* 47 */            return iOOIO1lI1ll.I0001Ioi1lo(i);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
                /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList, java.util.List] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int I000II(int i) {
                    String str;
                    String str2;
                    Collection<Io0OO1lo1> collectionValues;
/* 5 */             int iI000II = ((IOOIO1lI1ll) this.I00iiI).I000II(i);
/* 9 */             HashMap map = OIi1Ool.I00000oIO;
/* 14 */            if (i < 0 || i > 1114111) {
/* 470 */               I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid codepoint: "));
/* 11 */                return 0;
                    }
/* 21 */            if (i < 0 || i > 1114111) {
/* 462 */               I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid codepoint: "));
/* 11 */                return 0;
                    }
/* 29 */            int i2 = 2;
/* 30 */            if (Character.getType(i) == 0) {
/* 32 */                str = "Unknown";
                    } else {
/* 37 */                int iBinarySearch = Arrays.binarySearch(OIi1Ool.I00000oOI, i);
/* 41 */                if (iBinarySearch < 0) {
/* 44 */                    iBinarySearch = (-iBinarySearch) - 2;
                        }
/* 47 */                str = OIi1Ool.I0000Il00O[iBinarySearch];
                    }
/* 55 */            String[] strArr = (String[]) OIi1Ool.I00000oIO.get(str);
/* 59 */            Io0OiI0l0Iio io0OiI0l0Iio = (Io0OiI0l0Iio) this.I00iiO;
/* 63 */            List list = (List) this.I00iio;
/* 65 */            HashMap map2 = io0OiI0l0Iio.I000OOo1O;
/* 68 */            if (iI000II == -1) {
/* 67 */                return -1;
                    }
/* 79 */            Integer num = (Integer) map2.get(Integer.valueOf(iI000II));
/* 81 */            if (num != null) {
/* 83 */                return num.intValue();
                    }
/* 90 */            if (strArr.length == 1) {
/* 92 */                String str3 = strArr[0];
/* 100 */               if (!"Inherited".equals(str3) && (!"DFLT".equals(str3) || io0OiI0l0Iio.I0001Ioi1lo.containsKey(str3))) {
/* 141 */                   int length = strArr.length;
/* 142 */                   int i3 = 0;
                            while (true) {
/* 143 */                       if (i3 >= length) {
/* 162 */                           str2 = strArr[0];
                                    break;
                                }
/* 145 */                       String str4 = strArr[i3];
/* 153 */                       if (io0OiI0l0Iio.I0001Ioi1lo.containsKey(str4)) {
/* 155 */                           io0OiI0l0Iio.I000iOII = str4;
/* 157 */                           str2 = str4;
                                    break;
                                }
/* 159 */                       i3++;
                            }
                        } else {
/* 118 */                   str2 = io0OiI0l0Iio.I000iOII;
/* 120 */                   if (str2 == null) {
/* 136 */                       str2 = (String) io0OiI0l0Iio.I0001Ioi1lo.keySet().iterator().next();
/* 138 */                       io0OiI0l0Iio.I000iOII = str2;
                            }
                        }
                    }
/* 164 */           ?? arrayList = Collections.EMPTY_LIST;
/* 172 */           Io0OiI01l1io io0OiI01l1io = (Io0OiI01l1io) io0OiI0l0Iio.I0001Ioi1lo.get(str2);
/* 174 */           if (io0OiI01l1io == null) {
/* 205 */               collectionValues = arrayList;
                    } else if (io0OiI01l1io.I00000oIO == null) {
/* 182 */               collectionValues = io0OiI01l1io.I00000oOI.values();
                    } else {
/* 195 */               ArrayList arrayList2 = new ArrayList(io0OiI01l1io.I00000oOI.values());
/* 200 */               arrayList2.add(io0OiI01l1io.I00000oIO);
/* 203 */               collectionValues = arrayList2;
                    }
/* 210 */           if (!collectionValues.isEmpty()) {
/* 216 */               arrayList = new ArrayList();
/* 227 */               for (Io0OO1lo1 io0OO1lo1 : collectionValues) {
/* 235 */                   int i4 = io0OO1lo1.I00000oIO;
/* 240 */                   if (i4 != 65535) {
/* 242 */                       Io0OIllo0o0[] io0OIllo0o0Arr = io0OiI0l0Iio.I000II;
/* 245 */                       if (i4 < io0OIllo0o0Arr.length) {
/* 249 */                           arrayList.add(io0OIllo0o0Arr[i4]);
                                }
                            }
/* 256 */                   for (int i5 : io0OO1lo1.I00000oOI) {
/* 260 */                       Io0OIllo0o0[] io0OIllo0o0Arr2 = io0OiI0l0Iio.I000II;
/* 263 */                       if (i5 < io0OIllo0o0Arr2.length && (list == null || list.contains(io0OIllo0o0Arr2[i5].I00000oIO))) {
/* 281 */                           arrayList.add(io0OiI0l0Iio.I000II[i5]);
                                }
                            }
                        }
/* 287 */               Iterator it = arrayList.iterator();
                        while (true) {
/* 295 */                   if (!it.hasNext()) {
                                break;
                            }
/* 311 */                   if (((Io0OIllo0o0) it.next()).I00000oIO.equals("vrt2")) {
/* 313 */                       Iterator it2 = arrayList.iterator();
/* 321 */                       while (it2.hasNext()) {
/* 337 */                           if (((Io0OIllo0o0) it2.next()).I00000oIO.equals("vert")) {
/* 339 */                               it2.remove();
                                    }
                                }
                            }
                        }
/* 343 */               if (list != null && arrayList.size() > 1) {
/* 353 */                   II1liooilI iI1liooilI = new II1liooilI(i2);
/* 356 */                   iI1liooilI.I00iiI = list;
/* 358 */                   VarHandle.storeStoreFence();
/* 361 */                   Collections.sort(arrayList, iI1liooilI);
                        }
                    }
/* 364 */           Iterator it3 = arrayList.iterator();
/* 368 */           int iI0001Ioi1lo = iI000II;
/* 373 */           while (it3.hasNext()) {
/* 389 */               for (int i6 : (int[]) ((Io0OIllo0o0) it3.next()).I00000oOI.I00iiI) {
/* 395 */                   IOOOi1 iOOOi1 = io0OiI0l0Iio.I000O01llI0[i6];
/* 399 */                   if (iOOOi1.I00000oOI == 1) {
/* 404 */                       IOOOI0[] ioooi0Arr = (IOOOI0[]) iOOOi1.I0000oI00;
/* 406 */                       int length2 = ioooi0Arr.length;
/* 407 */                       int i7 = 0;
                                while (true) {
/* 408 */                           if (i7 >= length2) {
                                        break;
                                    }
/* 410 */                           IOOOI0 ioooi0 = ioooi0Arr[i7];
/* 416 */                           int iI00000oIO = ((IO0i1l1Io) ioooi0.I00000oOI).I00000oIO(iI0001Ioi1lo);
/* 420 */                           if (iI00000oIO >= 0) {
/* 422 */                               iI0001Ioi1lo = ioooi0.I0001Ioi1lo(iI0001Ioi1lo, iI00000oIO);
                                        break;
                                    }
/* 427 */                           i7++;
                                }
                            }
                        }
                    }
/* 441 */           map2.put(Integer.valueOf(iI000II), Integer.valueOf(iI0001Ioi1lo));
/* 454 */           io0OiI0l0Iio.I000OiO.put(Integer.valueOf(iI0001Ioi1lo), Integer.valueOf(iI000II));
/* 457 */           return iI0001Ioi1lo;
                }

                @Override
                public float I000O01llI0(float f, float f2) {
/* 1 */             return 0.0f;
                }

                @Override
                public void I000OOo1O(OIOiOllolii oIOiOllolii) {
                    synchronized (((HashMap) this.I00iiO)) {
/* 10 */                ((HashMap) this.I00iiO).remove(oIOiOllolii);
/* 21 */                if (((HashMap) this.I00iiO).isEmpty()) {
/* 23 */                    ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 30 */                    O110lOoo1O o110lOoo1O = new O110lOoo1O(0);
/* 33 */                    o110lOoo1O.I00iiI = this;
/* 35 */                    VarHandle.storeStoreFence();
/* 40 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(o110lOoo1O);
                        }
                    }
                }

                @Override
                public float I000OiO(float f) {
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) this.I00iiI;
/* 5 */             float fI0001Ioi1lo = i0l1OOl1l10.I0001Ioi1lo();
/* 21 */            Object objI000O01llI0 = I0l0lIoOIoIi.I000O01llI0(i0l1OOl1l10.I0000Il00O(), fI0001Ioi1lo, f, (Function1) this.I00iiO, (I0l0OlI000O) this.I00iio);
/* 39 */            if (!((Boolean) ((Function1) i0l1OOl1l10.I00000oIO).invoke(objI000O01llI0)).booleanValue()) {
/* 46 */                objI000O01llI0 = ((OIooliIO0) i0l1OOl1l10.I000O01llI0).getValue();
                    }
/* 58 */            return i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(objI000O01llI0) - fI0001Ioi1lo;
                }

                public I0OOi0 I000iOII() {
/* 3 */             Integer num = (Integer) this.I00iiI;
/* 6 */             if (num == null) {
/* 65 */                IioIoO10iOiI.I000oI1ioi("key size not set");
/* 5 */                 return null;
                    }
/* 12 */            if (((Integer) this.I00iiO) == null) {
/* 59 */                IioIoO10iOiI.I000oI1ioi("tag size not set");
/* 5 */                 return null;
                    }
/* 18 */            if (((I0OOO1l0IoO) this.I00iio) == null) {
/* 53 */                IioIoO10iOiI.I000oI1ioi("variant not set");
/* 5 */                 return null;
                    }
/* 22 */            int iIntValue = num.intValue();
/* 30 */            int iIntValue2 = ((Integer) this.I00iiO).intValue();
/* 36 */            I0OOO1l0IoO i0OOO1l0IoO = (I0OOO1l0IoO) this.I00iio;
/* 38 */            I0OOi0 i0OOi0 = new I0OOi0();
/* 41 */            i0OOi0.I00000oIO = iIntValue;
/* 43 */            i0OOi0.I00000oOI = iIntValue2;
/* 45 */            i0OOi0.I0000Il00O = i0OOO1l0IoO;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            return i0OOi0;
                }

                public I0OolIi1Oi1 I000l1() throws GeneralSecurityException {
                    O1OIll00i o1OIll00i;
/* 3 */             I0i000lio i0i000lio = (I0i000lio) this.I00iiI;
/* 6 */             if (i0i000lio == null || (o1OIll00i = (O1OIll00i) this.I00iiO) == null) {
/* 159 */               IioIoO10iOiI.I000oI1ioi("Cannot build without parameters and/or key material");
/* 5 */                 return null;
                    }
/* 23 */            if (i0i000lio.I00000oIO != ((IIOIlli0IO) o1OIll00i.I00iiI).I00000oIO.length) {
/* 153 */               IioIoO10iOiI.I000oI1ioi("Key size mismatch");
/* 5 */                 return null;
                    }
/* 25 */            I0OooiI1I i0OooiI1I = i0i000lio.I0000O;
/* 27 */            I0OooiI1I i0OooiI1I2 = I0OooiI1I.I00ilI0I1;
/* 29 */            if (i0OooiI1I != i0OooiI1I2 && ((Integer) this.I00iio) == null) {
/* 40 */                IioIoO10iOiI.I000oI1ioi("Cannot create key without ID requirement with parameters with ID requirement");
/* 5 */                 return null;
                    }
/* 44 */            if (i0OooiI1I == i0OooiI1I2 && ((Integer) this.I00iio) != null) {
/* 147 */               IioIoO10iOiI.I000oI1ioi("Cannot create key with ID requirement with parameters without ID requirement");
/* 5 */                 return null;
                    }
/* 54 */            if (i0OooiI1I == i0OooiI1I2) {
/* 58 */                IIOIlli0IO.I00000oIO(new byte[0]);
                    } else if (i0OooiI1I == I0OooiI1I.I00iio) {
/* 91 */                IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.I00iio).intValue()).array());
                    } else {
/* 97 */                if (i0OooiI1I != I0OooiI1I.I00iiO) {
/* 141 */                   IoOOl0iOl1io.I0010I0i("Unknown AesGcmParameters.Variant: ", ((I0i000lio) this.I00iiI).I0000O);
/* 5 */                     return null;
                        }
/* 124 */               IIOIlli0IO.I00000oIO(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.I00iio).intValue()).array());
                    }
/* 129 */           return new I0OolIi1Oi1();
                }

                @Override
                public Rect I000lI() {
/* 3 */             Rect rect = (Rect) this.I00iiO;
                    return rect == null ? (Rect) this.I00iio : rect;
                }

                public void I000o00OoI0I(OlioOil olioOil, Map.Entry entry) {
/* 5 */             OlioOil olioOil2 = (OlioOil) entry.getValue();
/* 7 */             Objects.toString(olioOil2);
/* 13 */            l11I11lO.I0000O(3, "SurfaceProcessorNode");
/* 67 */            IO0oo1I0oIO iO0oo1I0oIOI0000Il00O = olioOil2.I0000Il00O(((I1l1llI1) entry.getKey()).I0000Il00O, I1lIol0O.I00000oIO(olioOil.I000II.I00000oIO, ((I1l1llI1) entry.getKey()).I0000O, olioOil.I0000Il00O ? (IIllOo0) this.I00iiO : null, ((I1l1llI1) entry.getKey()).I0001Ioi1lo, ((I1l1llI1) entry.getKey()).I000II), null);
/* 75 */            OlOO1i11110 olOO1i11110 = new OlOO1i11110(28);
/* 78 */            olOO1i11110.I00iiO = this;
/* 80 */            olOO1i11110.I00iiI = olioOil2;
/* 82 */            VarHandle.storeStoreFence();
/* 89 */            iIllIoiiIO.I00000oIO(iO0oo1I0oIOI0000Il00O, olOO1i11110, O1OIIoio0i1.I0000O());
                }

                public Cipher I000oI1ioi() throws IIOlio1ol, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
                    AlgorithmParameters algorithmParameters;
/* 3 */             Key key = (Key) this.I00iiO;
/* 7 */             Il0o10 il0o10 = (Il0o10) this.I00iio;
/* 11 */            I0ioOiiIO0 i0ioOiiIO0 = (I0ioOiiIO0) this.I00iiI;
/* 15 */            Cipher cipherI00000oIO = il0o10.I00000oIO(i0ioOiiIO0.I00iOIl);
/* 19 */            I00IO1oi11O i00IO1oi11O = i0ioOiiIO0.I00iiI;
/* 21 */            I00O0i0ii i00O0i0ii = i0ioOiiIO0.I00iOIl;
/* 23 */            String str = i00O0i0ii.I00iOIl;
/* 28 */            if (i00IO1oi11O == null || (i00IO1oi11O instanceof Ii0oIIl)) {
/* 170 */               if (str.equals(IIOlOI.I00000oIO.I00iOIl) || str.equals(IIOlillOiOo.I00000oIO) || str.equals("1.3.6.1.4.1.188.7.1.1.2") || str.equals("1.2.840.113533.7.66.10")) {
/* 208 */                   cipherI00000oIO.init(2, key, new IvParameterSpec(new byte[8]));
/* 245 */                   return cipherI00000oIO;
                        }
/* 195 */               cipherI00000oIO.init(2, key);
/* 198 */               return cipherI00000oIO;
                    }
                    try {
/* 40 */                String str2 = (String) Il0o10.I00000oIO.get(i00O0i0ii);
/* 42 */                if (str2 != null) {
                            try {
/* 44 */                        algorithmParameters = AlgorithmParameters.getInstance(str2);
                            } catch (NoSuchAlgorithmException unused) {
                            }
/* 55 */                    HashSet hashSet = IIOo0iOIo.I00000oIO;
                            try {
                                try {
/* 67 */                            algorithmParameters.init(i00IO1oi11O.I0000O().I000iOII(), "ASN.1");
                                } catch (IOException e) {
/* 96 */                            throw new IIOlio1ol("error encoding algorithm parameters.", e);
                                }
                            } catch (Exception unused2) {
/* 79 */                        algorithmParameters.init(i00IO1oi11O.I0000O().I000iOII());
                            }
/* 82 */                    cipherI00000oIO.init(2, key, algorithmParameters);
                        } else {
/* 51 */                    algorithmParameters = AlgorithmParameters.getInstance(i00O0i0ii.I00iOIl);
/* 55 */                    HashSet hashSet2 = IIOo0iOIo.I00000oIO;
/* 67 */                    algorithmParameters.init(i00IO1oi11O.I0000O().I000iOII(), "ASN.1");
/* 82 */                    cipherI00000oIO.init(2, key, algorithmParameters);
                        }
                    } catch (NoSuchAlgorithmException e2) {
/* 105 */               if (!str.equals(IIOlOI.I00000oIO.I00iOIl) && !str.equals(IIOlillOiOo.I00000oIO) && !str.equals("1.3.6.1.4.1.188.7.1.1.2") && !str.equals(IIOlillOiOo.I00000oOI) && !str.equals(IIOlillOiOo.I0000Il00O) && !str.equals(IIOlillOiOo.I0000O)) {
/* 146 */                   throw e2;
                        }
/* 158 */               cipherI00000oIO.init(2, key, new IvParameterSpec(I00O0o1oo.I001i1O0Ol(i00IO1oi11O).I00iOIl));
                    }
/* 161 */           return cipherI00000oIO;
                }

                @Override
                public IiIOI1ol0o I00100l0(Ool1lo ool1lo) {
/* 3 */             List listSingletonList = Collections.singletonList(CaptureRequest.SCALER_CROP_REGION);
/* 7 */             Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 9 */             return ool1lo.I000OOo1O(listSingletonList);
                }

                public void I00100o1O0lo(FileOutputStream fileOutputStream) throws IOException {
/* 3 */             File file = (File) this.I00iiO;
                    try {
/* 11 */                fileOutputStream.getFD().sync();
                    } catch (IOException unused) {
/* 17 */                Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
/* 20 */                fileOutputStream.close();
                    } catch (IOException e) {
/* 27 */                Log.e("AtomicFile", "Failed to close file output stream", e);
                    }
/* 34 */            if (file.delete()) {
/* 77 */                return;
                    }
/* 50 */            Log.e("AtomicFile", "Failed to delete new file " + file);
                }

                @Override
                public IiIOI1ol0o I0010I0i(Ool1lo ool1lo) {
/* 3 */             Rect rect = (Rect) this.I00iio;
/* 26 */            if (Math.abs(1.0f) < Math.ulp(Math.abs(1.0f)) * 2.0d && l11I11lO.I0000O(5, "CXCP")) {
/* 39 */                Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
                    }
/* 47 */            float fWidth = rect.width() / 1.0f;
/* 53 */            float fHeight = rect.height() / 1.0f;
/* 62 */            float fWidth2 = (rect.width() - fWidth) / 2.0f;
/* 69 */            float fHeight2 = (rect.height() - fHeight) / 2.0f;
/* 78 */            Rect rect2 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
/* 81 */            this.I00iiO = rect2;
/* 89 */            return Ool1lo.I0000O(ool1lo, Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, rect2));
                }

                public void I0010o(FileOutputStream fileOutputStream) throws IOException {
                    try {
/* 7 */                 fileOutputStream.getFD().sync();
                    } catch (IOException unused) {
/* 13 */                Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
/* 16 */                fileOutputStream.close();
                    } catch (IOException e) {
/* 23 */                Log.e("AtomicFile", "Failed to close file output stream", e);
                    }
/* 34 */            I00Io1lO((File) this.I00iiO, (File) this.I00iiI);
                }

                public int I001IIilI0O() {
/* 11 */            if (I001i1lo1io().I00000oIO.isEmpty()) {
/* 13 */                return -1;
                    }
/* 37 */            long j = ((O1iOii1) IOOi0Ool1i.I001lllioOl(I001i1lo1io().I00000oIO)).I00000oIO - I001i1lo1io().I000O01llI0;
/* 42 */            if (j < 0) {
/* 44 */                j = 0;
                    }
/* 45 */            return (int) j;
                }

                public boolean I001IO000() {
/* 13 */            return !I001i1lo1io().I00000oIO.isEmpty();
                }

                public int I001i1O0Ol() {
/* 11 */            if (I001i1lo1io().I00000oIO.isEmpty()) {
/* 13 */                return -1;
                    }
/* 37 */            long j = ((O1iOii1) IOOi0Ool1i.I00Io1o110i(I001i1lo1io().I00000oIO)).I00000oIO + I001i1lo1io().I000O01llI0;
/* 45 */            long jI001lllioOl = I001lllioOl() - 1;
/* 48 */            if (j > jI001lllioOl) {
/* 50 */                j = jI001lllioOl;
                    }
/* 51 */            return (int) j;
                }

                public OIoI1lIli I001i1lo1io() {
/* 3 */             OIoI1lIli oIoI1lIli = (OIoI1lIli) this.I00iiO;
/* 5 */             if (oIoI1lIli != null) {
/* 7 */                 return oIoI1lIli;
                    }
/* 10 */            O0000Ioio00.I000OOo1O("layoutInfo");
/* 20 */            throw null;
                }

                public int I001iOo1i0O() {
/* 11 */            if (I001i1lo1io().I00000oIO.isEmpty()) {
/* 13 */                return 0;
                    }
/* 50 */            return Math.abs(((((O1iOii1) IOOi0Ool1i.I00Io1o110i(I001i1lo1io().I00000oIO)).I000OiO + I001i1lo1io().I00000oOI) + I001i1lo1io().I0000Il00O) - I001i1lo1io().I000II);
                }

                public int I001l0I00() {
/* 12 */            if (I001i1lo1io().I00000oIO.isEmpty()) {
/* 11 */                return 0;
                    }
/* 36 */            int i = ((O1iOii1) IOOi0Ool1i.I001lllioOl(I001i1lo1io().I00000oIO)).I000OiO + (-I001i1lo1io().I0001Ioi1lo);
/* 41 */            return Math.abs(i <= 0 ? i : 0);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I001lIiIIo1O(Class cls) throws GeneralSecurityException {
                    Class clsI00000oIO;
                    Object objI0000Il00O;
                    Object objI00000oOI;
                    HashMap map;
/* 5 */             AtomicReference atomicReference = OOoiolOO0i.I00000oIO;
                    try {
/* 17 */                map = ((OOIiIl1oiiIo) OI0oolioiO.I00000oOI.I00000oIO.get()).I00000oOI;
                    } catch (GeneralSecurityException unused) {
                    }
/* 23 */            if (map.containsKey(cls)) {
/* 31 */                clsI00000oIO = ((OOIil101I0I) map.get(cls)).I00000oIO();
/* 46 */                if (clsI00000oIO != null) {
/* 1261 */                  throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
                        }
/* 50 */                List list = (List) this.I00iiO;
/* 54 */                O0OOo0iol0I o0OOo0iol0I = (O0OOo0iol0I) this.I00iiI;
/* 56 */                int i = OollIoO0.I00000oIO;
/* 58 */                int iI001lloI = o0OOo0iol0I.I001lloI();
/* 66 */                Iterator it = o0OOo0iol0I.I001lllioOl().iterator();
/* 72 */                int i2 = 0;
/* 73 */                boolean z = false;
/* 74 */                boolean z2 = true;
                        while (true) {
/* 75 */                    boolean zHasNext = it.hasNext();
/* 79 */                    O0OIII11 o0oiii11 = O0OIII11.ENABLED;
/* 81 */                    if (!zHasNext) {
/* 226 */                       if (i2 == 0) {
/* 487 */                           IioIoO10iOiI.I000oI1ioi("keyset must contain at least one ENABLED key");
/* 224 */                           return null;
                                }
/* 228 */                       if (!z && !z2) {
/* 235 */                           IioIoO10iOiI.I000oI1ioi("keyset doesn't contain a valid primary key");
/* 224 */                           return null;
                                }
/* 243 */                       iOliil ioliil = new iOliil(9);
/* 251 */                       ioliil.I00iiO = new ConcurrentHashMap();
/* 253 */                       ioliil.I00iiI = clsI00000oIO;
/* 255 */                       OI00il1O oI00il1O = OI00il1O.I00000oOI;
/* 257 */                       VarHandle.storeStoreFence();
/* 264 */                       ioliil.I00ilI0I1 = (OI00il1O) this.I00iio;
/* 271 */                       for (int i3 = 0; i3 < o0OOo0iol0I.I001lIiIIo1O(); i3++) {
/* 273 */                           O0OOlOII0l0 o0OOlOII0l0I001l0I00 = o0OOo0iol0I.I001l0I00(i3);
/* 285 */                           if (o0OOlOII0l0I001l0I00.I001lllioOl().equals(o0oiii11)) {
                                        try {
/* 287 */                                   O0O1ioi11l0 o0O1ioi11l0I001iOo1i0O = o0OOlOII0l0I001l0I00.I001iOo1i0O();
/* 291 */                                   AtomicReference atomicReference2 = OOoiolOO0i.I00000oIO;
/* 301 */                                   objI0000Il00O = OOoiolOO0i.I0000Il00O(o0O1ioi11l0I001iOo1i0O.I001lIiIIo1O(), o0O1ioi11l0I001iOo1i0O.I001lllioOl(), clsI00000oIO);
                                        } catch (GeneralSecurityException e) {
/* 317 */                                   if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
/* 332 */                                       throw e;
                                            }
/* 333 */                                   objI0000Il00O = null;
                                        }
/* 339 */                               if (list.get(i3) != null) {
                                            try {
/* 349 */                                       objI00000oOI = OOoiolOO0i.I00000oOI(((O0OOoIii10o) list.get(i3)).I00000oIO, clsI00000oIO);
                                            } catch (GeneralSecurityException unused2) {
                                            }
/* 364 */                                   if (o0OOlOII0l0I001l0I00.I001l0I00() != o0OOo0iol0I.I001lloI()) {
/* 366 */                                       ioliil.I000l1(objI00000oOI, objI0000Il00O, o0OOlOII0l0I001l0I00, true);
                                            } else {
/* 370 */                                       ioliil.I000l1(objI00000oOI, objI0000Il00O, o0OOlOII0l0I001l0I00, false);
                                            }
                                        } else {
/* 354 */                                   objI00000oOI = null;
/* 364 */                                   if (o0OOlOII0l0I001l0I00.I001l0I00() != o0OOo0iol0I.I001lloI()) {
                                            }
                                        }
                                    }
                                }
/* 378 */                       ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ioliil.I00iiO;
/* 380 */                       if (concurrentHashMap == null) {
/* 481 */                           I000II.I001IO000("build cannot be called twice");
/* 224 */                           return null;
                                }
/* 386 */                       OOIiiiO oOIiiiO = (OOIiiiO) ioliil.I00iio;
/* 390 */                       OI00il1O oI00il1O2 = (OI00il1O) ioliil.I00ilI0I1;
/* 394 */                       Class cls2 = (Class) ioliil.I00iiI;
/* 398 */                       IOO000ilo iOO000ilo = new IOO000ilo(25);
/* 401 */                       iOO000ilo.I00iiI = concurrentHashMap;
/* 403 */                       iOO000ilo.I00iiO = oOIiiiO;
/* 405 */                       iOO000ilo.I00iio = oI00il1O2;
/* 407 */                       VarHandle.storeStoreFence();
/* 412 */                       ioliil.I00iiO = null;
/* 414 */                       AtomicReference atomicReference3 = OOoiolOO0i.I00000oIO;
/* 426 */                       HashMap map2 = ((OOIiIl1oiiIo) OI0oolioiO.I00000oOI.I00000oIO.get()).I00000oOI;
/* 432 */                       if (!map2.containsKey(cls)) {
/* 475 */                           IoOOl0iOl1io.I001i1O0Ol("No wrapper found for ", cls);
/* 473 */                           return null;
                                }
/* 438 */                       OOIil101I0I oOIil101I0I = (OOIil101I0I) map2.get(cls);
/* 448 */                       if (cls2.equals(oOIil101I0I.I00000oIO()) && oOIil101I0I.I00000oIO().equals(cls2)) {
/* 460 */                           return oOIil101I0I.I0000Il00O(iOO000ilo);
                                }
/* 467 */                       IioIoO10iOiI.I000oI1ioi("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
/* 470 */                       return null;
                            }
/* 87 */                    O0OOlOII0l0 o0OOlOII0l0 = (O0OOlOII0l0) it.next();
/* 95 */                    if (o0OOlOII0l0.I001lllioOl() == o0oiii11) {
/* 102 */                       if (!o0OOlOII0l0.I001lloI()) {
/* 223 */                           throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(o0OOlOII0l0.I001l0I00())));
                                }
/* 110 */                       if (o0OOlOII0l0.I001lIiIIo1O() == OIl1lli.UNKNOWN_PREFIX) {
/* 199 */                           throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(o0OOlOII0l0.I001l0I00())));
                                }
/* 118 */                       if (o0OOlOII0l0.I001lllioOl() == O0OIII11.UNKNOWN_STATUS) {
/* 175 */                           throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(o0OOlOII0l0.I001l0I00())));
                                }
/* 124 */                       if (o0OOlOII0l0.I001l0I00() == iI001lloI) {
/* 126 */                           if (z) {
/* 132 */                               IioIoO10iOiI.I000oI1ioi("keyset contains multiple primary keys");
/* 89 */                                return null;
                                    }
/* 128 */                           z = true;
                                }
/* 146 */                       if (o0OOlOII0l0.I001iOo1i0O().I001l0I00() != O0O1ii.ASYMMETRIC_PUBLIC) {
/* 148 */                           z2 = false;
                                }
/* 149 */                       i2++;
                            }
                        }
                    } else {
/* 40 */                OIiilo1Ool0o.I000oI1ioi(cls, "No input primitive class for ", " available");
/* 43 */                clsI00000oIO = null;
/* 46 */                if (clsI00000oIO != null) {
                        }
                    }
                }

                public int I001lllioOl() {
/* 11 */            return ((Number) ((OIoIiI0O) this.I00iiI).invoke()).intValue();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0298  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x02a6  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x02e5  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x02e9  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x0352  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0354  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x0382  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x03b1  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x03ca  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x03ed  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x03fe  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x0400  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0427  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x0435  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x0437  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x0461  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x046f  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x0471  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0490  */
                /* JADX WARN: Removed duplicated region for block: B:187:0x049c  */
                /* JADX WARN: Removed duplicated region for block: B:190:0x04ad  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x04b7  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x04e4  */
                /* JADX WARN: Removed duplicated region for block: B:204:0x04ee  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x04f8  */
                /* JADX WARN: Removed duplicated region for block: B:211:0x050e  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:244:0x0524 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
                /* JADX WARN: Type inference failed for: r0v111 */
                /* JADX WARN: Type inference failed for: r0v169 */
                /* JADX WARN: Type inference failed for: r0v170 */
                /* JADX WARN: Type inference failed for: r0v88, types: [int] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean I001lloI() throws JSONException, PackageManager.NameNotFoundException {
                    IoiI0l1IiIlo ioiI0l1IiIlo;
                    Bundle bundle;
                    int i;
                    int i2;
                    int identifier;
                    String strI00II0Ol1O0l;
                    Uri defaultUri;
                    String strI00II0Ol1O0l2;
                    Intent launchIntentForPackage;
                    PendingIntent activity;
                    PendingIntent broadcast;
                    String strI00II0Ol1O0l3;
                    Integer numValueOf;
                    String strI00II0Ol1O0l4;
                    Integer numI001i1O0Ol;
                    Integer numI001i1O0Ol2;
                    Integer numI001i1O0Ol3;
                    Long lI001lllioOl;
                    long[] jArrI00II0oii1o;
                    int[] iArrI001iOo1i0O;
                    ?? r0;
                    String strI00II0Ol1O0l5;
                    IconCompat iconCompat;
                    IconCompat iconCompat2;
                    boolean z;
                    String string;
                    ApplicationInfo applicationInfo;
/* 14 */            if (((iiOlilo0IIIl) this.I00iio).I00111O("gcm.n.noui")) {
/* 13 */                return true;
                    }
/* 19 */            FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.I00iiO;
/* 34 */            if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
/* 37 */                int iMyPid = Process.myPid();
/* 49 */                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
/* 53 */                if (runningAppProcesses != null) {
/* 55 */                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
/* 63 */                        if (!it.hasNext()) {
                                    break;
                                }
/* 65 */                        ActivityManager.RunningAppProcessInfo next = it.next();
/* 73 */                        if (next.pid == iMyPid) {
/* 79 */                            if (next.importance == 100) {
/* 33 */                                return false;
                                    }
                                }
                            }
                        }
                    }
/* 88 */            String strI00II0Ol1O0l6 = ((iiOlilo0IIIl) this.I00iio).I00II0Ol1O0l("gcm.n.image");
/* 98 */            if (TextUtils.isEmpty(strI00II0Ol1O0l6)) {
/* 100 */               ioiI0l1IiIlo = null;
                    } else {
                        try {
/* 106 */                   URL url = new URL(strI00II0Ol1O0l6);
/* 109 */                   ioiI0l1IiIlo = new IoiI0l1IiIlo();
/* 112 */                   ioiI0l1IiIlo.I00iOIl = url;
/* 114 */                   VarHandle.storeStoreFence();
                        } catch (MalformedURLException unused) {
/* 132 */                   Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strI00II0Ol1O0l6);
                        }
                    }
/* 136 */           int i3 = 2;
/* 137 */           if (ioiI0l1IiIlo != null) {
/* 141 */               ExecutorService executorService = (ExecutorService) this.I00iiI;
/* 145 */               OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 150 */               Io11iII11ll io11iII11ll = new Io11iII11ll(i3);
/* 153 */               io11iII11ll.I00iiI = ioiI0l1IiIlo;
/* 155 */               io11iII11ll.I00iiO = oloIlI0ll;
/* 157 */               VarHandle.storeStoreFence();
/* 164 */               ioiI0l1IiIlo.I00iiI = executorService.submit(io11iII11ll);
/* 168 */               ioiI0l1IiIlo.I00iiO = oloIlI0ll.I00000oIO;
                    }
/* 173 */           FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.I00iiO;
/* 178 */           iiOlilo0IIIl iiolilo0iiil = (iiOlilo0IIIl) this.I00iio;
/* 180 */           AtomicInteger atomicInteger = IOi0l000iiI.I00000oIO;
                    try {
/* 194 */               applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), Barcode.FORMAT_ITF);
                    } catch (PackageManager.NameNotFoundException e) {
/* 219 */               Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
                    }
/* 198 */           if (applicationInfo != null) {
/* 200 */               bundle = applicationInfo.metaData;
/* 202 */               if (bundle == null) {
/* 222 */                   bundle = Bundle.EMPTY;
                        }
                    }
/* 204 */           Bundle bundle2 = bundle;
/* 227 */           String strI00II0Ol1O0l7 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.android_channel_id");
/* 248 */           if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
/* 250 */               i = 1;
/* 252 */               strI00II0Ol1O0l7 = null;
                    } else {
/* 261 */               NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
/* 267 */               if (TextUtils.isEmpty(strI00II0Ol1O0l7)) {
/* 302 */                   strI00II0Ol1O0l7 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
/* 310 */                   if (TextUtils.isEmpty(strI00II0Ol1O0l7)) {
/* 316 */                       if (notificationManager.getNotificationChannel(strI00II0Ol1O0l7) == null) {
/* 321 */                           Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                                }
/* 275 */                       i = 1;
                            } else {
/* 327 */                       Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                            }
/* 330 */                   strI00II0Ol1O0l7 = "fcm_fallback_notification_channel";
/* 336 */                   if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") != null) {
/* 348 */                       i = 1;
/* 352 */                       int identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
/* 356 */                       if (identifier2 == 0) {
/* 360 */                           Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
/* 363 */                           string = "Misc";
                                } else {
/* 366 */                           string = firebaseMessagingService2.getString(identifier2);
                                }
/* 375 */                       notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                            } else {
/* 275 */                       i = 1;
                            }
                        } else {
/* 273 */                   if (notificationManager.getNotificationChannel(strI00II0Ol1O0l7) == null) {
/* 297 */                       Log.w("FirebaseMessaging", "Notification Channel requested (" + strI00II0Ol1O0l7 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
/* 302 */                       strI00II0Ol1O0l7 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
/* 310 */                       if (TextUtils.isEmpty(strI00II0Ol1O0l7)) {
                                }
/* 330 */                       strI00II0Ol1O0l7 = "fcm_fallback_notification_channel";
/* 336 */                       if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") != null) {
                                }
                            }
/* 275 */                   i = 1;
                        }
                    }
/* 378 */           AtomicInteger atomicInteger2 = IOi0l000iiI.I00000oIO;
/* 380 */           String packageName = firebaseMessagingService2.getPackageName();
/* 384 */           Resources resources = firebaseMessagingService2.getResources();
/* 388 */           PackageManager packageManager = firebaseMessagingService2.getPackageManager();
/* 394 */           OIO0oiOO oIO0oiOO = new OIO0oiOO(firebaseMessagingService2, strI00II0Ol1O0l7);
/* 399 */           String strI001lloI = iiolilo0iiil.I001lloI(resources, packageName, "gcm.n.title");
/* 407 */           if (!TextUtils.isEmpty(strI001lloI)) {
/* 413 */               oIO0oiOO.I0000oI00 = OIO0oiOO.I0000Il00O(strI001lloI);
                    }
/* 417 */           String strI001lloI2 = iiolilo0iiil.I001lloI(resources, packageName, "gcm.n.body");
/* 425 */           if (!TextUtils.isEmpty(strI001lloI2)) {
/* 431 */               oIO0oiOO.I0001Ioi1lo = OIO0oiOO.I0000Il00O(strI001lloI2);
/* 435 */               OIO0oiIOo1 oIO0oiIOo1 = new OIO0oiIOo1();
/* 442 */               oIO0oiIOo1.I00iiI = OIO0oiOO.I0000Il00O(strI001lloI2);
/* 444 */               oIO0oiOO.I0000oI00(oIO0oiIOo1);
                    }
/* 449 */           String strI00II0Ol1O0l8 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.icon");
/* 457 */           if (TextUtils.isEmpty(strI00II0Ol1O0l8)) {
/* 504 */               i2 = 2;
                    } else {
/* 461 */               identifier = resources.getIdentifier(strI00II0Ol1O0l8, "drawable", packageName);
/* 465 */               if (identifier != 0 || (identifier = resources.getIdentifier(strI00II0Ol1O0l8, "mipmap", packageName)) != 0) {
/* 467 */                   i2 = 2;
/* 548 */                   oIO0oiOO.I001IIilI0O.icon = identifier;
/* 552 */                   strI00II0Ol1O0l = iiolilo0iiil.I00II0Ol1O0l("gcm.n.sound2");
/* 560 */                   if (TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 564 */                       strI00II0Ol1O0l = iiolilo0iiil.I00II0Ol1O0l("gcm.n.sound");
                            }
/* 572 */                   if (!TextUtils.isEmpty(strI00II0Ol1O0l)) {
/* 574 */                       defaultUri = null;
                            } else if ("default".equals(strI00II0Ol1O0l) || resources.getIdentifier(strI00II0Ol1O0l, "raw", packageName) == 0) {
/* 619 */                       defaultUri = RingtoneManager.getDefaultUri(i2);
                            } else {
/* 614 */                       defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strI00II0Ol1O0l);
                            }
/* 624 */                   char c = 4;
/* 625 */                   if (defaultUri != null) {
/* 627 */                       Notification notification = oIO0oiOO.I001IIilI0O;
/* 629 */                       notification.sound = defaultUri;
/* 631 */                       notification.audioStreamType = -1;
/* 651 */                       notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                            }
/* 655 */                   strI00II0Ol1O0l2 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.click_action");
/* 663 */                   if (TextUtils.isEmpty(strI00II0Ol1O0l2)) {
/* 667 */                       launchIntentForPackage = new Intent(strI00II0Ol1O0l2);
/* 670 */                       launchIntentForPackage.setPackage(packageName);
/* 675 */                       launchIntentForPackage.setFlags(268435456);
                            } else {
/* 681 */                       String strI00II0Ol1O0l9 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.link_android");
/* 689 */                       if (TextUtils.isEmpty(strI00II0Ol1O0l9)) {
/* 693 */                           strI00II0Ol1O0l9 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.link");
                                }
/* 708 */                       Uri uri = !TextUtils.isEmpty(strI00II0Ol1O0l9) ? Uri.parse(strI00II0Ol1O0l9) : null;
/* 709 */                       if (uri != null) {
/* 715 */                           launchIntentForPackage = new Intent("android.intent.action.VIEW");
/* 718 */                           launchIntentForPackage.setPackage(packageName);
/* 721 */                           launchIntentForPackage.setData(uri);
                                } else {
/* 725 */                           launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
/* 729 */                           if (launchIntentForPackage == null) {
/* 733 */                               Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                }
                            }
/* 740 */                   if (launchIntentForPackage != null) {
/* 744 */                       activity = null;
                            } else {
/* 748 */                       launchIntentForPackage.addFlags(67108864);
/* 755 */                       Bundle bundle3 = (Bundle) iiolilo0iiil.I00iOIl;
/* 757 */                       Bundle bundle4 = new Bundle(bundle3);
/* 772 */                       for (String str : bundle3.keySet()) {
/* 778 */                           char c2 = c;
/* 790 */                           if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
/* 808 */                               bundle4.remove(str);
                                    }
/* 811 */                           c = c2;
                                }
/* 817 */                       launchIntentForPackage.putExtras(bundle4);
/* 824 */                       if (iiolilo0iiil.I00111O("google.c.a.e")) {
/* 832 */                           launchIntentForPackage.putExtra("gcm.n.analytics_data", iiolilo0iiil.I00IioO0OiOi());
                                }
/* 839 */                       activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                            }
/* 843 */                   oIO0oiOO.I000II = activity;
/* 893 */                   broadcast = iiolilo0iiil.I00111O("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(iiolilo0iiil.I00IioO0OiOi())), 1140850688);
/* 897 */                   if (broadcast != null) {
/* 901 */                       oIO0oiOO.I001IIilI0O.deleteIntent = broadcast;
                            }
/* 905 */                   strI00II0Ol1O0l3 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.color");
/* 913 */                   if (TextUtils.isEmpty(strI00II0Ol1O0l3)) {
                                try {
/* 919 */                           numValueOf = Integer.valueOf(Color.parseColor(strI00II0Ol1O0l3));
                                } catch (IllegalArgumentException unused2) {
/* 943 */                           Log.w("FirebaseMessaging", "Color is invalid: " + strI00II0Ol1O0l3 + ". Notification will use default color.");
                                }
                            } else {
/* 948 */                       int i4 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
/* 952 */                       if (i4 != 0) {
                                    try {
/* 958 */                               numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i4));
                                    } catch (Resources.NotFoundException unused3) {
/* 965 */                               Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                } else {
/* 968 */                           numValueOf = null;
                                }
                            }
/* 969 */                   if (numValueOf != null) {
/* 975 */                       oIO0oiOO.I00100o1O0lo = numValueOf.intValue();
                            }
/* 987 */                   oIO0oiOO.I0000O(16, !iiolilo0iiil.I00111O("gcm.n.sticky"));
/* 996 */                   oIO0oiOO.I000oI1ioi = iiolilo0iiil.I00111O("gcm.n.local_only");
/* 1000 */                  strI00II0Ol1O0l4 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.ticker");
/* 1004 */                  if (strI00II0Ol1O0l4 != null) {
/* 1012 */                      oIO0oiOO.I001IIilI0O.tickerText = OIO0oiOO.I0000Il00O(strI00II0Ol1O0l4);
                            }
/* 1016 */                  numI001i1O0Ol = iiolilo0iiil.I001i1O0Ol("gcm.n.notification_priority");
/* 1021 */                  if (numI001i1O0Ol == null) {
/* 1023 */                      numI001i1O0Ol = null;
                            } else if (numI001i1O0Ol.intValue() < -2 || numI001i1O0Ol.intValue() > i2) {
/* 1058 */                      Log.w("FirebaseMessaging", "notificationPriority is invalid " + numI001i1O0Ol + ". Skipping setting notificationPriority.");
/* 1023 */                      numI001i1O0Ol = null;
                            }
/* 1062 */                  if (numI001i1O0Ol != null) {
/* 1068 */                      oIO0oiOO.I000OiO = numI001i1O0Ol.intValue();
                            }
/* 1072 */                  numI001i1O0Ol2 = iiolilo0iiil.I001i1O0Ol("gcm.n.visibility");
/* 1076 */                  if (numI001i1O0Ol2 == null) {
/* 1078 */                      numI001i1O0Ol2 = null;
                            } else if (numI001i1O0Ol2.intValue() < -1 || numI001i1O0Ol2.intValue() > i) {
/* 1116 */                      Log.w("NotificationParams", "visibility is invalid: " + numI001i1O0Ol2 + ". Skipping setting visibility.");
/* 1078 */                      numI001i1O0Ol2 = null;
                            }
/* 1120 */                  if (numI001i1O0Ol2 != null) {
/* 1126 */                      oIO0oiOO.I0010I0i = numI001i1O0Ol2.intValue();
                            }
/* 1130 */                  numI001i1O0Ol3 = iiolilo0iiil.I001i1O0Ol("gcm.n.notification_count");
/* 1134 */                  if (numI001i1O0Ol3 == null) {
/* 1136 */                      numI001i1O0Ol3 = null;
                            } else if (numI001i1O0Ol3.intValue() < 0) {
/* 1163 */                      Log.w("FirebaseMessaging", "notificationCount is invalid: " + numI001i1O0Ol3 + ". Skipping setting notificationCount.");
/* 1136 */                      numI001i1O0Ol3 = null;
                            }
/* 1167 */                  if (numI001i1O0Ol3 != null) {
/* 1173 */                      oIO0oiOO.I000OOo1O = numI001i1O0Ol3.intValue();
                            }
/* 1175 */                  lI001lllioOl = iiolilo0iiil.I001lllioOl();
/* 1179 */                  if (lI001lllioOl != null) {
/* 1182 */                      oIO0oiOO.I000iOII = true;
/* 1190 */                      oIO0oiOO.I001IIilI0O.when = lI001lllioOl.longValue();
                            }
/* 1192 */                  jArrI00II0oii1o = iiolilo0iiil.I00II0oii1o();
/* 1196 */                  if (jArrI00II0oii1o != null) {
/* 1200 */                      oIO0oiOO.I001IIilI0O.vibrate = jArrI00II0oii1o;
                            }
/* 1202 */                  iArrI001iOo1i0O = iiolilo0iiil.I001iOo1i0O();
/* 1206 */                  if (iArrI001iOo1i0O != null) {
/* 1208 */                      int i5 = iArrI001iOo1i0O[0];
/* 1212 */                      int i6 = iArrI001iOo1i0O[1];
/* 1216 */                      int i7 = iArrI001iOo1i0O[2];
/* 1218 */                      Notification notification2 = oIO0oiOO.I001IIilI0O;
/* 1220 */                      notification2.ledARGB = i5;
/* 1222 */                      notification2.ledOnMS = i6;
/* 1224 */                      notification2.ledOffMS = i7;
/* 1237 */                      notification2.flags = ((i6 == 0 || i7 == 0) ? 0 : 1) | ((-2) & notification2.flags);
                            }
/* 1241 */                  boolean zI00111O = iiolilo0iiil.I00111O("gcm.n.default_sound");
                            boolean z2 = zI00111O;
/* 1251 */                  if (iiolilo0iiil.I00111O("gcm.n.default_vibrate_timings")) {
/* 1253 */                      z2 = (zI00111O ? 1 : 0) | 2;
                            }
                            r0 = z2;
/* 1261 */                  if (iiolilo0iiil.I00111O("gcm.n.default_light_settings")) {
/* 1263 */                      r0 = (z2 ? 1 : 0) | 4;
                            }
/* 1265 */                  Notification notification3 = oIO0oiOO.I001IIilI0O;
/* 1267 */                  notification3.defaults = r0;
/* 1271 */                  if ((r0 & 4) != 0) {
                                notification3.flags |= 1;
                            }
/* 1283 */                  strI00II0Ol1O0l5 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.tag");
/* 1291 */                  if (TextUtils.isEmpty(strI00II0Ol1O0l5)) {
/* 1309 */                      strI00II0Ol1O0l5 = "FCM-Notification:" + SystemClock.uptimeMillis();
                            }
/* 1293 */                  String str2 = strI00II0Ol1O0l5;
/* 1314 */                  if (ioiI0l1IiIlo != null) {
                                try {
/* 1317 */                          o0IiOl o0iiol = ioiI0l1IiIlo.I00iiO;
/* 1319 */                          lII0I0I000I.I000II(o0iiol);
/* 1330 */                          Bitmap bitmap = (Bitmap) lOio0o.I00000oOI(o0iiol, 5L, TimeUnit.SECONDS);
/* 1332 */                          if (bitmap == null) {
/* 1334 */                              iconCompat = null;
                                    } else {
/* 1339 */                              iconCompat = new IconCompat(1);
/* 1342 */                              iconCompat.I00000oOI = bitmap;
                                    }
/* 1344 */                          oIO0oiOO.I000O01llI0 = iconCompat;
/* 1348 */                          OIO0o1ll oIO0o1ll = new OIO0o1ll();
/* 1351 */                          if (bitmap == null) {
/* 1353 */                              iconCompat2 = null;
/* 1354 */                              z = true;
                                    } else {
/* 1358 */                              z = true;
/* 1359 */                              iconCompat2 = new IconCompat(1);
/* 1362 */                              iconCompat2.I00000oOI = bitmap;
                                    }
/* 1364 */                          oIO0o1ll.I00iiI = iconCompat2;
/* 1367 */                          oIO0o1ll.I00iiO = null;
/* 1369 */                          oIO0o1ll.I00iio = z;
/* 1371 */                          oIO0oiOO.I0000oI00(oIO0o1ll);
                                } catch (InterruptedException unused4) {
/* 1389 */                          Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
/* 1392 */                          ioiI0l1IiIlo.close();
/* 1399 */                          Thread.currentThread().interrupt();
                                } catch (ExecutionException e2) {
/* 1421 */                          Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                                } catch (TimeoutException unused5) {
/* 1380 */                          Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
/* 1383 */                          ioiI0l1IiIlo.close();
                                }
                            }
/* 1425 */                  Log.isLoggable("FirebaseMessaging", 3);
/* 1444 */                  ((NotificationManager) ((FirebaseMessagingService) this.I00iiO).getSystemService("notification")).notify(str2, 0, oIO0oiOO.I00000oOI());
/* 1447 */                  return true;
                        }
/* 481 */               i2 = 2;
/* 500 */               Log.w("FirebaseMessaging", "Icon resource " + strI00II0Ol1O0l8 + " not found. Notification will use default icon.");
                    }
/* 508 */           int i8 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
/* 512 */           if (i8 == 0) {
                        try {
/* 519 */                   i8 = packageManager.getApplicationInfo(packageName, 0).icon;
                        } catch (PackageManager.NameNotFoundException e3) {
/* 535 */                   Log.w("FirebaseMessaging", "Couldn't get own application info: " + e3);
                        }
                    }
/* 545 */           identifier = i8 != 0 ? i8 : 17301651;
/* 548 */           oIO0oiOO.I001IIilI0O.icon = identifier;
/* 552 */           strI00II0Ol1O0l = iiolilo0iiil.I00II0Ol1O0l("gcm.n.sound2");
/* 560 */           if (TextUtils.isEmpty(strI00II0Ol1O0l)) {
                    }
/* 572 */           if (!TextUtils.isEmpty(strI00II0Ol1O0l)) {
                    }
/* 624 */           char c3 = 4;
/* 625 */           if (defaultUri != null) {
                    }
/* 655 */           strI00II0Ol1O0l2 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.click_action");
/* 663 */           if (TextUtils.isEmpty(strI00II0Ol1O0l2)) {
                    }
/* 740 */           if (launchIntentForPackage != null) {
                    }
/* 843 */           oIO0oiOO.I000II = activity;
/* 893 */           if (iiolilo0iiil.I00111O("google.c.a.e")) {
                    }
/* 897 */           if (broadcast != null) {
                    }
/* 905 */           strI00II0Ol1O0l3 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.color");
/* 913 */           if (TextUtils.isEmpty(strI00II0Ol1O0l3)) {
                    }
/* 969 */           if (numValueOf != null) {
                    }
/* 987 */           oIO0oiOO.I0000O(16, !iiolilo0iiil.I00111O("gcm.n.sticky"));
/* 996 */           oIO0oiOO.I000oI1ioi = iiolilo0iiil.I00111O("gcm.n.local_only");
/* 1000 */          strI00II0Ol1O0l4 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.ticker");
/* 1004 */          if (strI00II0Ol1O0l4 != null) {
                    }
/* 1016 */          numI001i1O0Ol = iiolilo0iiil.I001i1O0Ol("gcm.n.notification_priority");
/* 1021 */          if (numI001i1O0Ol == null) {
                    }
/* 1062 */          if (numI001i1O0Ol != null) {
                    }
/* 1072 */          numI001i1O0Ol2 = iiolilo0iiil.I001i1O0Ol("gcm.n.visibility");
/* 1076 */          if (numI001i1O0Ol2 == null) {
                    }
/* 1120 */          if (numI001i1O0Ol2 != null) {
                    }
/* 1130 */          numI001i1O0Ol3 = iiolilo0iiil.I001i1O0Ol("gcm.n.notification_count");
/* 1134 */          if (numI001i1O0Ol3 == null) {
                    }
/* 1167 */          if (numI001i1O0Ol3 != null) {
                    }
/* 1175 */          lI001lllioOl = iiolilo0iiil.I001lllioOl();
/* 1179 */          if (lI001lllioOl != null) {
                    }
/* 1192 */          jArrI00II0oii1o = iiolilo0iiil.I00II0oii1o();
/* 1196 */          if (jArrI00II0oii1o != null) {
                    }
/* 1202 */          iArrI001iOo1i0O = iiolilo0iiil.I001iOo1i0O();
/* 1206 */          if (iArrI001iOo1i0O != null) {
                    }
/* 1241 */          boolean zI00111O2 = iiolilo0iiil.I00111O("gcm.n.default_sound");
                    boolean z22 = zI00111O2;
/* 1251 */          if (iiolilo0iiil.I00111O("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z22;
/* 1261 */          if (iiolilo0iiil.I00111O("gcm.n.default_light_settings")) {
                    }
/* 1265 */          Notification notification32 = oIO0oiOO.I001IIilI0O;
/* 1267 */          notification32.defaults = r0;
/* 1271 */          if ((r0 & 4) != 0) {
                    }
/* 1283 */          strI00II0Ol1O0l5 = iiolilo0iiil.I00II0Ol1O0l("gcm.n.tag");
/* 1291 */          if (TextUtils.isEmpty(strI00II0Ol1O0l5)) {
                    }
/* 1293 */          String str22 = strI00II0Ol1O0l5;
/* 1314 */          if (ioiI0l1IiIlo != null) {
                    }
/* 1425 */          Log.isLoggable("FirebaseMessaging", 3);
/* 1444 */          ((NotificationManager) ((FirebaseMessagingService) this.I00iiO).getSystemService("notification")).notify(str22, 0, oIO0oiOO.I00000oOI());
/* 1447 */          return true;
                }

                public void I00II0Ol1O0l(IoIo10lOo1 ioIo10lOo1, Function1 function1) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiO;
/* 13 */            Function1 function12 = (Function1) linkedHashMap.get(ioIo10lOo1.getKey());
/* 15 */            I1OoollI1Il1 key = ioIo10lOo1.getKey();
/* 22 */            IoIlOo ioIlOo = new IoIlOo(0);
/* 25 */            ioIlOo.I00iiI = function12;
/* 27 */            ioIlOo.I00iiO = function1;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            linkedHashMap.put(key, ioIlOo);
/* 37 */            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.I00iiI;
/* 47 */            if (linkedHashMap2.containsKey(ioIo10lOo1.getKey())) {
/* 49 */                return;
                    }
/* 50 */            I1OoollI1Il1 key2 = ioIo10lOo1.getKey();
/* 58 */            Iil1olo iil1olo = new Iil1olo(22);
/* 61 */            iil1olo.I00iiI = ioIo10lOo1;
/* 63 */            VarHandle.storeStoreFence();
/* 66 */            linkedHashMap2.put(key2, iil1olo);
                }

                public void I00II0oii1o(I01l1111 i01l1111) {
/* 4 */             Log.isLoggable("MlKitAccLogger", 3);
/* 7 */             int i = i01l1111.I00iOIl;
/* 11 */            if (i == 1) {
/* 13 */                IIlOoolol0ll iIlOoolol0llI00IoiI = I00IoiI();
/* 19 */                iIlOoolol0llI00IoiI.I00ioIO = loolO1Oi1.CANNOT_ACCESS_STORAGE;
/* 29 */                I00Iooi00oi(null, ii01IlIiIo.I001lIiIIo1O(iIlOoolol0llI00IoiI.I001i1O0Ol()));
                    } else if (i == 2) {
/* 36 */                IIlOoolol0ll iIlOoolol0llI00IoiI2 = I00IoiI();
/* 42 */                iIlOoolol0llI00IoiI2.I00ioIO = loolO1Oi1.CANNOT_GET_SYSTEM_INFO;
/* 46 */                Integer numValueOf = Integer.valueOf(i01l1111.I00iiI);
/* 52 */                loo1ilOi loo1iloi = new loo1ilOi();
/* 57 */                loo1iloi.I00000oIO = loo0iOOI0.OPEN_GL;
/* 59 */                loo1iloi.I00000oOI = numValueOf;
/* 61 */                VarHandle.storeStoreFence();
/* 68 */                iIlOoolol0llI00IoiI2.I00io1l = ii01IlIiIo.I001lIiIIo1O(loo1iloi);
/* 78 */                I00Iooi00oi(null, ii01IlIiIo.I001lIiIIo1O(iIlOoolol0llI00IoiI2.I001i1O0Ol()));
                    }
                }

                public void I00IO1(Network network, boolean z) {
                    OoiIlOl1iI ooiIlOl1iI;
                    boolean z2;
/* 5 */             Network[] allNetworks = ((ConnectivityManager) this.I00iiI).getAllNetworks();
/* 9 */             int length = allNetworks.length;
/* 10 */            boolean z3 = false;
/* 11 */            int i = 0;
                    while (true) {
/* 12 */                if (i >= length) {
                            break;
                        }
/* 14 */                Network network2 = allNetworks[i];
/* 21 */                if (O0000Ioio00.I0000O(network2, network)) {
/* 23 */                    z2 = z;
                        } else {
/* 29 */                    NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.I00iiI).getNetworkCapabilities(network2);
/* 45 */                    z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
                        }
/* 46 */                if (z2) {
/* 48 */                    z3 = true;
                            break;
                        }
/* 50 */                i++;
                    }
/* 55 */            OllO11Iooi ollO11Iooi = (OllO11Iooi) this.I00iiO;
/* 65 */            if (((OOllOII) ollO11Iooi.I00iiI.get()) != null) {
/* 67 */                ollO11Iooi.I00iio = z3;
/* 69 */                ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    } else {
/* 72 */                ooiIlOl1iI = null;
                    }
/* 73 */            if (ooiIlOl1iI == null) {
/* 75 */                ollO11Iooi.I00000oIO();
                    }
                }

                public void I00IO1oi11O(Activity activity, i00lliOilOo i00llioiloo) {
/* 3 */             WeakHashMap weakHashMap = (WeakHashMap) this.I00iio;
/* 7 */             ReentrantLock reentrantLock = (ReentrantLock) this.I00iiO;
/* 9 */             reentrantLock.lock();
                    try {
/* 22 */                if (i00llioiloo.equals((i00lliOilOo) weakHashMap.get(activity))) {
/* 27 */                    return;
                        }
/* 34 */                reentrantLock.unlock();
/* 47 */                Iterator it = ((Ol0I1O) ((iiOlilo0IIIl) this.I00iiI).I00iOIl).I00000oOI.iterator();
/* 55 */                while (it.hasNext()) {
/* 61 */                    Ol0I1101 ol0I1101 = (Ol0I1101) it.next();
/* 69 */                    if (O0000Ioio00.I0000O(ol0I1101.I00000oIO, activity)) {
/* 72 */                        ol0I1101.I0000O = i00llioiloo;
/* 76 */                        ol0I1101.I00000oOI.getClass();
/* 81 */                        ol0I1101.I0000Il00O.accept(i00llioiloo);
                            }
                        }
                    } finally {
/* 87 */                reentrantLock.unlock();
                    }
                }

                public void I00IOO(O0oOOiI0 o0oOOiI0) {
/* 3 */             OillOl1i oillOl1i = (OillOl1i) this.I00iio;
/* 5 */             if (oillOl1i != null) {
/* 7 */                 oillOl1i.run();
                    }
/* 14 */            O0oiiOll0O1 o0oiiOll0O1 = (O0oiiOll0O1) this.I00iiI;
/* 16 */            OillOl1i oillOl1i2 = new OillOl1i();
/* 19 */            oillOl1i2.I00iOIl = o0oiiOll0O1;
/* 21 */            oillOl1i2.I00iiI = o0oOOiI0;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            this.I00iio = oillOl1i2;
/* 32 */            ((Handler) this.I00iiO).postAtFrontOfQueue(oillOl1i2);
                }

                public byte[] I00IlilI0i0i() throws IOException {
/* 3 */             File file = (File) this.I00iiO;
/* 7 */             File file2 = (File) this.I00iiI;
/* 11 */            File file3 = (File) this.I00iio;
/* 17 */            if (file3.exists()) {
/* 19 */                I00Io1lO(file3, file2);
                    }
/* 26 */            if (file.exists() && file2.exists() && !file.delete()) {
/* 56 */                Log.e("AtomicFile", "Failed to delete outdated new file " + file);
                    }
/* 61 */            FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
/* 68 */                byte[] bArr = new byte[fileInputStream.available()];
/* 71 */                int i = 0;
                        while (true) {
/* 74 */                    int i2 = fileInputStream.read(bArr, i, bArr.length - i);
/* 78 */                    if (i2 <= 0) {
/* 83 */                        return bArr;
                            }
/* 84 */                    i += i2;
/* 85 */                    int iAvailable = fileInputStream.available();
/* 91 */                    if (iAvailable > bArr.length - i) {
/* 94 */                        byte[] bArr2 = new byte[iAvailable + i];
/* 96 */                        System.arraycopy(bArr, 0, bArr2, 0, i);
/* 99 */                        bArr = bArr2;
                            }
                        }
                    } finally {
/* 102 */               fileInputStream.close();
                    }
                }

                public List I00Io1o110i(int i, IlliIl1l11O illiIl1l11O) {
/* 5 */             long j = I001i1lo1io().I001IIilI0O;
/* 10 */            O0llioI1 o0llioI1 = (O0llioI1) this.I00iio;
/* 12 */            if (o0llioI1 == null) {
/* 41 */                O0000Ioio00.I000OOo1O("state");
/* 106 */               throw null;
                    }
/* 18 */            O1lIIi o1lIIi = new O1lIIi(16);
/* 21 */            o1lIIi.I00iiI = illiIl1l11O;
/* 23 */            o1lIIi.I00iiO = this;
/* 25 */            VarHandle.storeStoreFence();
/* 34 */            return Collections.singletonList(o0llioI1.I00000oIO(i, j, true, o1lIIi));
                }

                public void I00IoIO0lI(int i) {
/* 3 */             if (i != 16 && i != 32) {
/* 31 */                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
                    }
/* 36 */            this.I00iiI = Integer.valueOf(i);
                }

                public FileOutputStream I00IoO0() throws IOException {
/* 3 */             File file = (File) this.I00iiO;
/* 7 */             File file2 = (File) this.I00iio;
/* 13 */            if (file2.exists()) {
/* 19 */                I00Io1lO(file2, (File) this.I00iiI);
                    }
                    try {
/* 24 */                return new FileOutputStream(file);
                    } catch (FileNotFoundException unused) {
/* 36 */                if (!file.getParentFile().mkdirs()) {
/* 67 */                    IOOlIIilOl0.I000l1("Failed to create directory for ", file);
/* 70 */                    return null;
                        }
                        try {
/* 40 */                    return new FileOutputStream(file);
                        } catch (FileNotFoundException e) {
/* 64 */                    throw new IOException("Failed to create new file " + file, e);
                        }
                    }
                }

                public synchronized IIlOoolol0ll I00IoiI() {
                    IIlOoolol0ll iIlOoolol0ll;
                    loo00iO11 loo00io11;
/* 6 */             iIlOoolol0ll = new IIlOoolol0ll(14);
/* 20 */            iIlOoolol0ll.I00l0OO0IO = Long.valueOf(SystemClock.elapsedRealtimeNanos() / 1000);
/* 26 */            iIlOoolol0ll.I00iiI = (lollOoOoo) this.I00iiO;
                    synchronized (I00ilI0I1) {
/* 33 */                if (I00ilO0 == null) {
                            try {
/* 35 */                        iil0il1000i0 iil0il1000i0VarI00000oIO = iolO10I.I00000oIO();
/* 39 */                        String str = iil0il1000i0VarI00000oIO.I0000oI00;
/* 41 */                        String str2 = iil0il1000i0VarI00000oIO.I00000oIO;
/* 43 */                        String str3 = iil0il1000i0VarI00000oIO.I00000oOI;
/* 47 */                        loo00iO11 loo00io112 = new loo00iO11();
/* 50 */                        loo00io112.I00000oIO = str2;
/* 52 */                        loo00io112.I00000oOI = str;
/* 54 */                        loo00io112.I0000Il00O = str3;
/* 56 */                        VarHandle.storeStoreFence();
/* 59 */                        I00ilO0 = loo00io112;
                            } catch (il11lI | RuntimeException e) {
/* 67 */                        loo00iO11 loo00io113 = new loo00iO11();
/* 71 */                        loo00io113.I00000oIO = null;
/* 73 */                        loo00io113.I00000oOI = null;
/* 75 */                        loo00io113.I0000Il00O = null;
/* 77 */                        VarHandle.storeStoreFence();
/* 80 */                        I00ilO0 = loo00io113;
/* 85 */                        Log.isLoggable("MlKitAccLogger", 3);
/* 97 */                        int i = e instanceof il11lI ? ((il11lI) e).I00iOIl : -1;
/* 98 */                        IIlOoolol0ll iIlOoolol0llI00IoiI = I00IoiI();
/* 104 */                       iIlOoolol0llI00IoiI.I00ioIO = loolO1Oi1.CANNOT_GET_SYSTEM_INFO;
/* 106 */                       loo0iOOI0 loo0iooi0 = loo0iOOI0.OPEN_GL;
/* 108 */                       Integer numValueOf = Integer.valueOf(i);
/* 114 */                       loo1ilOi loo1iloi = new loo1ilOi();
/* 117 */                       loo1iloi.I00000oIO = loo0iooi0;
/* 119 */                       loo1iloi.I00000oOI = numValueOf;
/* 121 */                       VarHandle.storeStoreFence();
/* 128 */                       iIlOoolol0llI00IoiI.I00io1l = ii01IlIiIo.I001lIiIIo1O(loo1iloi);
/* 138 */                       I00Iooi00oi(null, ii01IlIiIo.I001lIiIIo1O(iIlOoolol0llI00IoiI.I001i1O0Ol()));
                            }
                        }
/* 141 */               loo00io11 = I00ilO0;
                    }
/* 144 */           iIlOoolol0ll.I00iiO = loo00io11;
/* 150 */           iIlOoolol0ll.I00iio = (lool1O1l11io) this.I00iio;
/* 153 */           return iIlOoolol0ll;
                }

                public void I00Iooi00oi(I01l10Oi i01l10Oi, iiOOi1OolOlO iiooi1oololo) {
/* 5 */             IOiOol0 iOiOol0 = new IOiOol0(14);
/* 8 */             if (i01l10Oi != null) {
/* 12 */                lo1I1l1Oo1I1 lo1i1l1oo1i1Zzb = ((PoseDetectorOptionsBase) i01l10Oi).zzb();
/* 18 */                lo0O0OO1i lo0o0oo1i = new lo0O0OO1i();
/* 22 */                lo0o0oo1i.I00000oIO = null;
/* 24 */                lo0o0oo1i.I00000oOI = null;
/* 26 */                lo0o0oo1i.I0000Il00O = lo1i1l1oo1i1Zzb;
/* 28 */                lo0o0oo1i.I0000O = null;
/* 30 */                lo0o0oo1i.I0000oI00 = null;
/* 32 */                lo0o0oo1i.I0001Ioi1lo = null;
/* 34 */                VarHandle.storeStoreFence();
/* 37 */                iOiOol0.I00ilI0I1 = lo0o0oo1i;
                    }
/* 39 */            iOiOol0.I00io1l = iiooi1oololo;
/* 43 */            o0OIl1o1i0Oi o0oil1o1i0oi = (o0OIl1o1i0Oi) this.I00iiI;
/* 55 */            o0oil1o1i0oi.I00000oOI(o0Oll1li.I00000oOI(iOiOol0), lioiiIOoil.PIPELINE_ACCELERATION_ANALYTICS, o0oil1o1i0oi.I0000Il00O());
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */             I0lil01 i0lil01 = new I0lil01(8);
/* 8 */             i0lil01.I00iiI = this;
/* 10 */            VarHandle.storeStoreFence();
/* 17 */            iIiOOI.I00000oIO(i0lil01, Iii11l.I00000oIO());
/* 26 */            ((Io11o0) this.I00iio).I00iOIl.set(iIiOOI);
/* 47 */            return "HandlerScheduledFuture-" + ((Callable) this.I00iiO).toString();
                }

                @Override
                public void shutdown() {
/* 9 */             ((ConnectivityManager) this.I00iiI).unregisterNetworkCallback((OOllio0oI) this.I00iio);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 16:
/* 19 */                    return OollIoO0.I00000oIO((O0OOo0iol0I) this.I00iiI).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 70 */        public IoIlOo1o0IIl(Object obj, Object obj2, Object obj3, int i) {
/* 71 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                    this.I00iio = obj3;
                }

/* 71 */        public IoIlOo1o0IIl(int i, boolean z) {
/* 72 */            this.I00iOIl = i;
                }

/* 72 */        public IoIlOo1o0IIl(int i) {
                    this.I00iOIl = i;
                    switch (i) {
                        case 13:
/* 79 */                    this.I00iiI = new OI10I1IoI0Ol();
                            break;
                        default:
/* 74 */                    this.I00iiI = new LinkedHashMap();
/* 75 */                    this.I00iiO = new LinkedHashMap();
/* 76 */                    this.I00iio = new LinkedHashMap();
/* 77 */                    int i2 = OO1Oi1i.I00000oIO;
                            break;
                    }
                }

/* 79 */        public IoIlOo1o0IIl(File file) {
                    this.I00iOIl = 6;
/* 81 */            this.I00iiI = file;
/* 82 */            this.I00iiO = new File(file.getPath() + ".new");
/* 83 */            this.I00iio = new File(file.getPath() + ".bak");
                }
            }
