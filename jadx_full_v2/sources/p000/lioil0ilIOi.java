            package p000;

            import android.adservices.measurement.MeasurementManager;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.content.pm.Signature;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.os.ext.SdkExtensions;
            import android.text.TextUtils;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.lang.invoke.VarHandle;
            import java.math.BigInteger;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.SecureRandom;
            import java.security.cert.CertificateException;
            import java.security.cert.CertificateFactory;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.Random;
            import java.util.TreeSet;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import java.util.concurrent.atomic.AtomicLong;
            import javax.security.auth.x500.X500Principal;
            
            public final class lioil0ilIOi extends l1i00il00li {
                public static final String[] I00l0I0l0lO1 = {"firebase_", "google_", "ga_"};
                public static final String[] I00l0OO0IO = {"_err"};
                public SecureRandom I00iiO;
                public AtomicLong I00iio;
                public int I00ilI0I1;
                public O1iOlOIiO I00ilO0;
                public Boolean I00io1l;
                public Integer I00ioIO;

                public static String I010l1ol111(boolean z, String str, int i) {
/* 1 */             if (str == null) {
/* 32 */                return null;
                    }
/* 13 */            if (str.codePointCount(0, str.length()) <= i) {
/* 98 */                return str;
                    }
/* 15 */            if (z) {
/* 27 */                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
                    }
/* 32 */            return null;
                }

                public static void I011Ill(i1Il01 i1il01, String str, int i, String str2, String str3, int i2) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             I011lIilI0lo(i, bundle);
/* 13 */            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
/* 21 */                bundle.putString(str2, str3);
                    }
/* 25 */            if (i == 6 || i == 7 || i == 2) {
/* 36 */                bundle.putLong("_el", i2);
                    }
/* 41 */            i1il01.I00000oOI(str, "_err", bundle);
                }

                public static MessageDigest I011Io0I1ioi() throws NoSuchAlgorithmException {
                    MessageDigest messageDigest;
/* 3 */             for (int i = 0; i < 2; i++) {
                        try {
/* 7 */                     messageDigest = MessageDigest.getInstance("MD5");
                        } catch (NoSuchAlgorithmException unused) {
                        }
/* 11 */                if (messageDigest != null) {
/* 14 */                    return messageDigest;
                        }
                    }
/* 18 */            return null;
                }

                public static long I011Ol0(byte[] bArr) {
/* 1 */             lII0I0I000I.I000II(bArr);
/* 4 */             int length = bArr.length;
/* 5 */             int i = 0;
/* 11 */            lII0I0I000I.I000OiO(length > 0);
/* 16 */            long j = 0;
/* 18 */            for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
/* 32 */                j += (bArr[i2] & 255) << i;
/* 33 */                i += 8;
                    }
/* 77 */            return j;
                }

                public static boolean I011iIOio(Context context) {
                    ServiceInfo serviceInfo;
                    try {
/* 4 */                 PackageManager packageManager = context.getPackageManager();
/* 8 */                 if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
/* 24 */                    if (serviceInfo.enabled) {
/* 26 */                        return true;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 3 */             return false;
                }

                public static final boolean I011lIilI0lo(int i, Bundle bundle) {
/* 11 */            if (bundle.getLong("_err") != 0) {
/* 19 */                return false;
                    }
/* 14 */            bundle.putLong("_err", i);
/* 17 */            return true;
                }

                public static boolean I011olOoO(String str, String[] strArr) {
/* 1 */             lII0I0I000I.I000II(strArr);
/* 7 */             for (String str2 : strArr) {
/* 15 */                if (Objects.equals(str, str2)) {
/* 17 */                    return true;
                        }
                    }
/* 4 */             return false;
                }

                public static final boolean I01I01Oolii(String str, String str2) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return false;
                    }
                    return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
                }

                public static boolean I01I1Oo0oll(String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith("_");
                }

                public static byte[] I01IiOO(Parcelable parcelable) {
/* 1 */             if (parcelable == null) {
/* 3 */                 return null;
                    }
/* 5 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 10 */                parcelable.writeToParcel(parcelObtain, 0);
/* 13 */                return parcelObtain.marshall();
                    } finally {
/* 22 */                parcelObtain.recycle();
                    }
                }

                public static ArrayList I01Iol(List list) {
/* 1 */             if (list == null) {
/* 6 */                 return new ArrayList(0);
                    }
/* 16 */            ArrayList arrayList = new ArrayList(list.size());
/* 19 */            Iterator it = list.iterator();
/* 27 */            while (it.hasNext()) {
/* 33 */                iII000ol000 iii000ol000 = (iII000ol000) it.next();
/* 37 */                Bundle bundle = new Bundle();
/* 44 */                bundle.putString("app_id", iii000ol000.I00iOIl);
/* 51 */                bundle.putString("origin", iii000ol000.I00iiI);
/* 58 */                bundle.putLong("creation_timestamp", iii000ol000.I00iio);
/* 67 */                bundle.putString("name", iii000ol000.I00iiO.I00iiI);
/* 72 */                Object objZza = iii000ol000.I00iiO.zza();
/* 76 */                lII0I0I000I.I000II(objZza);
/* 79 */                ll0I11O.I00000oIO(bundle, objZza);
/* 86 */                bundle.putBoolean("active", iii000ol000.I00ilI0I1);
/* 89 */                String str = iii000ol000.I00ilO0;
/* 91 */                if (str != null) {
/* 95 */                    bundle.putString("trigger_event_name", str);
                        }
/* 98 */                ii0oooi0IO0l ii0oooi0io0l = iii000ol000.I00io1l;
/* 100 */               if (ii0oooi0io0l != null) {
/* 106 */                   bundle.putString("timed_out_event_name", ii0oooi0io0l.I00iOIl);
/* 109 */                   ii0il0lOolIo ii0il0loolio = ii0oooi0io0l.I00iiI;
/* 111 */                   if (ii0il0loolio != null) {
/* 119 */                       bundle.putBundle("timed_out_event_params", ii0il0loolio.I0001Ioi1lo());
                            }
                        }
/* 126 */               bundle.putLong("trigger_timeout", iii000ol000.I00ioIO);
/* 129 */               ii0oooi0IO0l ii0oooi0io0l2 = iii000ol000.I00l0I0l0lO1;
/* 131 */               if (ii0oooi0io0l2 != null) {
/* 137 */                   bundle.putString("triggered_event_name", ii0oooi0io0l2.I00iOIl);
/* 140 */                   ii0il0lOolIo ii0il0loolio2 = ii0oooi0io0l2.I00iiI;
/* 142 */                   if (ii0il0loolio2 != null) {
/* 150 */                       bundle.putBundle("triggered_event_params", ii0il0loolio2.I0001Ioi1lo());
                            }
                        }
/* 159 */               bundle.putLong("triggered_timestamp", iii000ol000.I00iiO.I00iiO);
/* 166 */               bundle.putLong("time_to_live", iii000ol000.I00l0OO0IO);
/* 169 */               ii0oooi0IO0l ii0oooi0io0l3 = iii000ol000.I00li1OI;
/* 171 */               if (ii0oooi0io0l3 != null) {
/* 177 */                   bundle.putString("expired_event_name", ii0oooi0io0l3.I00iOIl);
/* 180 */                   ii0il0lOolIo ii0il0loolio3 = ii0oooi0io0l3.I00iiI;
/* 182 */                   if (ii0il0loolio3 != null) {
/* 190 */                       bundle.putBundle("expired_event_params", ii0il0loolio3.I0001Ioi1lo());
                            }
                        }
/* 193 */               arrayList.add(bundle);
                    }
/* 437 */           return arrayList;
                }

                public static boolean I01O10iIoo1O(Context context) {
                    ActivityInfo receiverInfo;
/* 1 */             lII0I0I000I.I000II(context);
                    try {
/* 5 */                 PackageManager packageManager = context.getPackageManager();
/* 9 */                 if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
/* 27 */                    if (receiverInfo.enabled) {
/* 29 */                        return true;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
/* 4 */             return false;
                }

                public static void I01O1I1(lIol0ili1Oi liol0ili1oi, Bundle bundle, boolean z) {
/* 7 */             if (bundle != null && liol0ili1oi != null) {
/* 15 */                if (!bundle.containsKey("_sc") || z) {
/* 22 */                    String str = liol0ili1oi.I00000oIO;
/* 24 */                    if (str != null) {
/* 26 */                        bundle.putString("_sn", str);
                            } else {
/* 30 */                        bundle.remove("_sn");
                            }
/* 33 */                    String str2 = liol0ili1oi.I00000oOI;
/* 35 */                    if (str2 != null) {
/* 37 */                        bundle.putString("_sc", str2);
                            } else {
/* 41 */                        bundle.remove("_sc");
                            }
/* 46 */                    bundle.putLong("_si", liol0ili1oi.I0000Il00O);
/* 49 */                    return;
                        }
/* 20 */                z = false;
                    }
/* 50 */            if (bundle != null && liol0ili1oi == null && z) {
/* 56 */                bundle.remove("_sn");
/* 59 */                bundle.remove("_sc");
/* 62 */                bundle.remove("_si");
                    }
                }

                public static boolean I01OOIlI(String str) {
/* 1 */             lII0I0I000I.I0000O(str);
                    return str.charAt(0) != '_' || str.equals("_ep");
                }

                public static boolean I01Oi01Ilol(Intent intent) {
/* 3 */             String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
/* 13 */            if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
/* 56 */                return true;
                    }
/* 28 */            if (TextUtils.isEmpty(stringExtra)) {
/* 54 */                return false;
                    }
                    try {
/* 36 */                String host = new URL(stringExtra).getHost();
/* 44 */                if (TextUtils.isEmpty(host)) {
/* 54 */                    return false;
                        }
/* 49 */                return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
                    } catch (MalformedURLException unused) {
/* 54 */                return false;
                    }
                }

                public static boolean I01i01OoI(Object obj) {
                    return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
                }

                @Override
                public final boolean I010OIo1l() {
/* 1 */             return true;
                }

                public final boolean I010ioo(String str, String str2, int i, Object obj) {
/* 1 */             if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
/* 87 */                return true;
                    }
/* 36 */            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
/* 35 */                return false;
                    }
/* 48 */            String string = obj.toString();
/* 60 */            if (string.codePointCount(0, string.length()) <= i) {
/* 87 */                return true;
                    }
/* 66 */            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 68 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 83 */            l01o0io1ooo0.I00li1OI.I0000oI00("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
/* 35 */            return false;
                }

                public final void I010l10O(String str, String str2, Bundle bundle, List list, boolean z) {
                    int iI01OooO0o0o;
                    int iI010lI0oi;
/* 7 */             List list2 = list;
/* 11 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 13 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 15 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 17 */            l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 23 */            lioil0ilIOi lioil0ilioi = ((l0olllO1i) iil1iil.I00iOIl).I00l0I0l0lO1;
/* 25 */            l0olllO1i.I0000oI00(lioil0ilioi);
/* 43 */            int i = true != lioil0ilioi.I01Iio10lo(231100000) ? 0 : 35;
/* 53 */            Iterator it = new TreeSet(bundle.keySet()).iterator();
/* 57 */            int i2 = 0;
/* 58 */            boolean z2 = false;
/* 64 */            while (it.hasNext()) {
/* 70 */                String str3 = (String) it.next();
/* 72 */                if (list2 == null || !list2.contains(str3)) {
/* 90 */                    iI01OooO0o0o = !z ? I01OooO0o0o(str3) : 0;
/* 91 */                    if (iI01OooO0o0o == 0) {
/* 93 */                        iI01OooO0o0o = I01i000i0iI(str3);
                            }
                        } else {
/* 81 */                    iI01OooO0o0o = 0;
                        }
/* 97 */                if (iI01OooO0o0o != 0) {
/* 105 */                   I0110o(bundle, iI01OooO0o0o, str3, iI01OooO0o0o == 3 ? str3 : null);
/* 108 */                   bundle.remove(str3);
                        } else {
/* 121 */                   if (I01i01OoI(bundle.get(str3))) {
/* 123 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 132 */                       l01o0io1ooo0.I00li1OI.I0000oI00("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
/* 135 */                       iI010lI0oi = 22;
                            } else {
/* 147 */                       iI010lI0oi = I010lI0oi(str, str3, bundle.get(str3), bundle, list2, z, false);
                            }
/* 151 */                   if (iI010lI0oi != 0 && !"_ev".equals(str3)) {
/* 165 */                       I0110o(bundle, iI010lI0oi, str3, bundle.get(str3));
/* 168 */                       bundle.remove(str3);
                            } else if (I01OOIlI(str3) && !I011olOoO(str3, iO1l1oi.I0000O)) {
/* 186 */                       i2++;
/* 192 */                       if (!I01Iio10lo(231100000)) {
/* 194 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 209 */                           l01o0io1ooo0.I00ioIO.I0000O(l00i1l00olio.I00000oIO(str), "Item array not supported on client's version of Google Play Services (Android Only)", l00i1l00olio.I0000oI00(bundle));
/* 214 */                           I011lIilI0lo(23, bundle);
/* 217 */                           bundle.remove(str3);
                                } else if (i2 > i) {
/* 223 */                           if (!z2) {
/* 225 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 261 */                               l01o0io1ooo0.I00ioIO.I0000O(l00i1l00olio.I00000oIO(str), IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 55), "Item can't contain more than ", i, " item-scoped custom params"), l00i1l00olio.I0000oI00(bundle));
                                    }
/* 266 */                           I011lIilI0lo(28, bundle);
/* 269 */                           bundle.remove(str3);
/* 272 */                           list2 = list;
/* 274 */                           z2 = true;
                                }
                            }
                        }
/* 278 */               list2 = list;
                    }
                }

                public final boolean I010l1O(String str) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 10 */            if (TextUtils.isEmpty(str)) {
/* 42 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 44 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 51 */                l01o0io1ooo0.I00ioIO.I00000oOI("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
/* 9 */                 return false;
                    }
/* 12 */            lII0I0I000I.I000II(str);
/* 21 */            if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
/* 40 */                return true;
                    }
/* 23 */            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 25 */            l0olllO1i.I000II(l01o0io1ooo02);
/* 36 */            l01o0io1ooo02.I00ioIO.I0000Il00O("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", l01O0IO1ooO0.I010ioo(str));
/* 9 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I010lI0oi(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
                    int i;
                    int size;
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             I010II();
/* 17 */            int i2 = 0;
/* 18 */            if (!I01i01OoI(obj)) {
/* 157 */               i = 0;
                    } else {
/* 20 */                if (!z2) {
/* 159 */                   return 21;
                        }
/* 28 */                if (!I011olOoO(str2, iO1l1oi.I0000Il00O)) {
/* 30 */                    return 20;
                        }
/* 33 */                lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 37 */                loliolo1ioI000OOo1O.I010II();
/* 40 */                loliolo1ioI000OOo1O.I010OIo1l();
/* 47 */                if (loliolo1ioI000OOo1O.I010l1ol111()) {
/* 54 */                    lioil0ilIOi lioil0ilioi = ((l0olllO1i) loliolo1ioI000OOo1O.I00iOIl).I00l0I0l0lO1;
/* 56 */                    l0olllO1i.I0000oI00(lioil0ilioi);
/* 66 */                    if (lioil0ilioi.I01IlIoOI() < 200900) {
/* 68 */                        return 25;
                            }
                        }
/* 71 */                boolean z3 = obj instanceof Parcelable[];
/* 73 */                if (z3) {
/* 78 */                    size = ((Parcelable[]) obj).length;
                        } else {
/* 82 */                    if (obj instanceof ArrayList) {
/* 87 */                        size = ((ArrayList) obj).size();
                            }
/* 157 */                   i = 0;
                        }
/* 93 */                if (size > 200) {
/* 95 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 97 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 108 */                   l01o0io1ooo0.I00li1OI.I0000oI00("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
/* 111 */                   i = 17;
/* 113 */                   if (z3) {
/* 116 */                       Parcelable[] parcelableArr = (Parcelable[]) obj;
/* 119 */                       if (parcelableArr.length > 200) {
/* 127 */                           bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                                }
                            } else if (obj instanceof ArrayList) {
/* 136 */                       ArrayList arrayList = (ArrayList) obj;
/* 142 */                       if (arrayList.size() > 200) {
/* 153 */                           bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                                }
                            }
                        }
                    }
/* 166 */           int iMax = 500;
/* 168 */           if (I01I1Oo0oll(str) || I01I1Oo0oll(str2)) {
/* 185 */               l0olllo1i.I00iio.getClass();
/* 190 */               iMax = Math.max(500, Barcode.FORMAT_QR_CODE);
                    } else {
/* 179 */               l0olllo1i.I00iio.getClass();
                    }
/* 198 */           if (!I010ioo("param", str2, iMax, obj)) {
/* 202 */               if (!z2) {
/* 331 */                   return 4;
                        }
/* 206 */               if (obj instanceof Bundle) {
/* 218 */                   I010l10O(str, str2, (Bundle) obj, list, z);
/* 221 */                   return i;
                        }
/* 224 */               if (obj instanceof Parcelable[]) {
/* 227 */                   Parcelable[] parcelableArr2 = (Parcelable[]) obj;
/* 229 */                   int length = parcelableArr2.length;
/* 230 */                   while (i2 < length) {
/* 232 */                       Parcelable parcelable = parcelableArr2[i2];
/* 236 */                       if (!(parcelable instanceof Bundle)) {
/* 238 */                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 240 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 251 */                           l01o0io1ooo02.I00li1OI.I0000O(parcelable.getClass(), "All Parcelable[] elements must be of type Bundle. Value type, name", str2);
/* 331 */                           return 4;
                                }
/* 265 */                       I010l10O(str, str2, (Bundle) parcelable, list, z);
/* 268 */                       i2++;
                            }
                        } else {
/* 273 */                   if (!(obj instanceof ArrayList)) {
/* 331 */                       return 4;
                            }
/* 276 */                   ArrayList arrayList2 = (ArrayList) obj;
/* 278 */                   int size2 = arrayList2.size();
/* 282 */                   while (i2 < size2) {
/* 284 */                       Object obj2 = arrayList2.get(i2);
/* 290 */                       if (!(obj2 instanceof Bundle)) {
/* 292 */                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 294 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 310 */                           l01o0io1ooo03.I00li1OI.I0000O(obj2 != null ? obj2.getClass() : "null", "All ArrayList elements must be of type Bundle. Value type, name", str2);
/* 331 */                           return 4;
                                }
/* 324 */                       I010l10O(str, str2, (Bundle) obj2, list, z);
/* 327 */                       i2++;
                            }
                        }
                    }
/* 330 */           return i;
                }

                public final Object I010o0o0oO(String str, Object obj) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 14 */            int iMax = 500;
/* 16 */            if ("_ev".equals(str)) {
/* 20 */                l0olllo1i.I00iio.getClass();
/* 27 */                return I011lO1liO1O(Math.max(500, Barcode.FORMAT_QR_CODE), obj, true, true);
                    }
/* 36 */            if (I01I1Oo0oll(str)) {
/* 40 */                l0olllo1i.I00iio.getClass();
/* 43 */                iMax = Math.max(500, Barcode.FORMAT_QR_CODE);
                    } else {
/* 50 */                l0olllo1i.I00iio.getClass();
                    }
/* 54 */            return I011lO1liO1O(iMax, obj, false, true);
                }

                public final Bundle I010oio1OO0(String str, Bundle bundle, List list, boolean z) {
                    int iI01OooO0o0o;
/* 7 */             List list2 = list;
/* 11 */            boolean zI011olOoO = I011olOoO(str, iO1l1II0O0.I000II);
/* 15 */            if (bundle == null) {
/* 248 */               return null;
                    }
/* 19 */            Bundle bundle2 = new Bundle(bundle);
/* 25 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 27 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 29 */            l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 35 */            lioil0ilIOi lioil0ilioi = ((l0olllO1i) iil1iil.I00iOIl).I00l0I0l0lO1;
/* 37 */            l0olllO1i.I0000oI00(lioil0ilioi);
/* 53 */            int i = lioil0ilioi.I01Iio10lo(201500000) ? 100 : 25;
/* 65 */            Iterator it = new TreeSet(bundle.keySet()).iterator();
/* 70 */            int i2 = 0;
/* 71 */            boolean z2 = false;
/* 77 */            while (it.hasNext()) {
/* 83 */                String str2 = (String) it.next();
/* 85 */                if (list2 == null || !list2.contains(str2)) {
/* 103 */                   iI01OooO0o0o = !z ? I01OooO0o0o(str2) : 0;
/* 104 */                   if (iI01OooO0o0o == 0) {
/* 106 */                       iI01OooO0o0o = I01i000i0iI(str2);
                            }
                        } else {
/* 94 */                    iI01OooO0o0o = 0;
                        }
/* 110 */               if (iI01OooO0o0o != 0) {
/* 118 */                   I0110o(bundle2, iI01OooO0o0o, str2, iI01OooO0o0o == 3 ? str2 : null);
/* 121 */                   bundle2.remove(str2);
                        } else {
/* 134 */                   int iI010lI0oi = I010lI0oi(str, str2, bundle.get(str2), bundle2, list2, z, zI011olOoO);
/* 140 */                   if (iI010lI0oi == 17) {
/* 144 */                       I0110o(bundle2, 17, str2, Boolean.FALSE);
                            } else if (iI010lI0oi != 0 && !"_ev".equals(str2)) {
/* 169 */                       I0110o(bundle2, iI010lI0oi, iI010lI0oi == 21 ? str : str2, bundle.get(str2));
/* 172 */                       bundle2.remove(str2);
                            }
/* 180 */                   if (I01OOIlI(str2)) {
/* 182 */                       i2++;
/* 184 */                       if (i2 > i) {
/* 186 */                           if (!z2) {
/* 207 */                               String strI00100o1O0lo = IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
/* 211 */                               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 213 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 228 */                               l01o0io1ooo0.I00ioIO.I0000O(l00i1l00olio.I00000oIO(str), strI00100o1O0lo, l00i1l00olio.I0000oI00(bundle));
                                    }
/* 235 */                           I011lIilI0lo(5, bundle2);
/* 238 */                           bundle2.remove(str2);
/* 241 */                           z2 = true;
                                }
                            }
/* 243 */                   list2 = list;
                        }
/* 243 */               list2 = list;
                    }
/* 247 */           return bundle2;
                }

                public final void I01101IOlO(iOlOi1iIii ioloi1iiii, int i) {
/* 5 */             Bundle bundle = (Bundle) ioloi1iiii.I0001Ioi1lo;
/* 14 */            Iterator it = new TreeSet(bundle.keySet()).iterator();
/* 18 */            int i2 = 0;
/* 19 */            boolean z = false;
/* 24 */            while (it.hasNext()) {
/* 30 */                String str = (String) it.next();
/* 36 */                if (I01OOIlI(str) && (i2 = i2 + 1) > i) {
/* 42 */                    if (!z) {
/* 63 */                        String strI00100o1O0lo = IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
/* 69 */                        l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 71 */                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 73 */                        l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 75 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 92 */                        l01o0io1ooo0.I00ioIO.I0000O(l00i1l00olio.I00000oIO((String) ioloi1iiii.I0000O), strI00100o1O0lo, l00i1l00olio.I0000oI00(bundle));
/* 96 */                        I011lIilI0lo(5, bundle);
                            }
/* 99 */                    bundle.remove(str);
/* 102 */                   z = true;
                        }
                    }
                }

                public final void I01101olii(Parcelable[] parcelableArr, int i) {
/* 1 */             lII0I0I000I.I000II(parcelableArr);
/* 7 */             for (Parcelable parcelable : parcelableArr) {
/* 11 */                Bundle bundle = (Bundle) parcelable;
/* 22 */                Iterator it = new TreeSet(bundle.keySet()).iterator();
/* 26 */                int i2 = 0;
/* 27 */                boolean z = false;
/* 32 */                while (it.hasNext()) {
/* 38 */                    String str = (String) it.next();
/* 44 */                    if (I01OOIlI(str) && !I011olOoO(str, iO1l1oi.I0000O) && (i2 = i2 + 1) > i) {
/* 58 */                        if (!z) {
/* 62 */                            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 64 */                            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 66 */                            l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 68 */                            l0olllO1i.I000II(l01o0io1ooo0);
/* 104 */                           l01o0io1ooo0.I00ioIO.I0000O(l00i1l00olio.I00000oOI(str), IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 60), "Param can't contain more than ", i, " item-scoped custom parameters"), l00i1l00olio.I0000oI00(bundle));
                                }
/* 109 */                       I011lIilI0lo(28, bundle);
/* 112 */                       bundle.remove(str);
/* 115 */                       z = true;
                            }
                        }
                    }
                }

                public final void I0110OiO(Bundle bundle, Bundle bundle2) {
/* 1 */             if (bundle2 == null) {
/* 106 */               return;
                    }
/* 16 */            for (String str : bundle2.keySet()) {
/* 28 */                if (!bundle.containsKey(str)) {
/* 34 */                    lioil0ilIOi lioil0ilioi = ((l0olllO1i) this.I00iOIl).I00l0I0l0lO1;
/* 36 */                    l0olllO1i.I0000oI00(lioil0ilioi);
/* 43 */                    lioil0ilioi.I011IOil(bundle, str, bundle2.get(str));
                        }
                    }
                }

                public final void I0110o(Bundle bundle, int i, String str, Object obj) {
/* 5 */             if (I011lIilI0lo(i, bundle)) {
/* 11 */                iIl1iil iil1iil = ((l0olllO1i) this.I00iOIl).I00iio;
/* 22 */                bundle.putString("_ev", I010l1ol111(true, str, 40));
/* 25 */                if (obj != null) {
/* 29 */                    if ((obj instanceof String) || (obj instanceof CharSequence)) {
/* 46 */                        bundle.putLong("_el", obj.toString().length());
                            }
                        }
                    }
                }

                public final int I0111i(String str, Object obj) {
                    return "_ldl".equals(str) ? I010ioo("user property referrer", str, I011lOIoo0l(str), obj) : I010ioo("user property", str, I011lOIoo0l(str), obj) ? 0 : 7;
                }

                public final Object I011IO1I11OI(String str, Object obj) {
                    return "_ldl".equals(str) ? I011lO1liO1O(I011lOIoo0l(str), obj, true, false) : I011lO1liO1O(I011lOIoo0l(str), obj, false, false);
                }

                public final void I011IOil(Bundle bundle, String str, Object obj) {
/* 1 */             if (bundle == null) {
/* 98 */                return;
                    }
/* 6 */             if (obj instanceof Long) {
/* 14 */                bundle.putLong(str, ((Long) obj).longValue());
/* 17 */                return;
                    }
/* 20 */            if (obj instanceof String) {
/* 26 */                bundle.putString(str, String.valueOf(obj));
/* 29 */                return;
                    }
/* 32 */            if (obj instanceof Double) {
/* 40 */                bundle.putDouble(str, ((Double) obj).doubleValue());
/* 43 */                return;
                    }
/* 46 */            if (obj instanceof Bundle[]) {
/* 50 */                bundle.putParcelableArray(str, (Bundle[]) obj);
/* 53 */                return;
                    }
/* 54 */            if (str != null) {
/* 67 */                String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
/* 70 */                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 72 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 74 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 87 */                l01o0io1ooo0.I00li1OI.I0000O(l0olllo1i.I00l0OO0IO.I00000oOI(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
                    }
                }

                public final O1iOlOIiO I011iO() {
                    O1iOiio1OI o1iOiio1OI;
/* 1 */             O1iOlOIiO o1iOlOIiO = this.I00ilO0;
/* 3 */             if (o1iOlOIiO != null) {
/* 110 */               return o1iOlOIiO;
                    }
/* 9 */             Context context = ((l0olllO1i) this.I00iOIl).I00iOIl;
/* 11 */            I0IiIiiIOIO i0IiIiiIOIO = I0IiIiiIOIO.I00000oIO;
/* 13 */            i0IiIiiIOIO.I00000oIO();
/* 21 */            O1iOlOIiO o1iOlOIiO2 = null;
/* 22 */            if (i0IiIiiIOIO.I00000oIO() >= 5) {
/* 32 */                MeasurementManager measurementManager = (MeasurementManager) context.getSystemService(MeasurementManager.class);
/* 34 */                o1iOiio1OI = new O1iOiio1OI();
/* 37 */                o1iOiio1OI.I00000oIO = measurementManager;
/* 39 */                VarHandle.storeStoreFence();
                    } else {
/* 43 */                o1iOiio1OI = null;
                    }
/* 44 */            if (o1iOiio1OI != null) {
/* 48 */                o1iOlOIiO2 = new O1iOlOIiO();
/* 51 */                o1iOlOIiO2.I00000oIO = o1iOiio1OI;
/* 53 */                VarHandle.storeStoreFence();
                    }
/* 56 */            this.I00ilO0 = o1iOlOIiO2;
/* 58 */            return o1iOlOIiO2;
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I011iiii0i() {
                    long j;
                    Integer num;
                    Object e;
/* 1 */             I010II();
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             iooloO1iOil iooloo1ioilI000iOII = l0olllo1i.I000iOII();
/* 12 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 33 */            if (!I01I01Oolii((String) iol1II1ii1i.I00io1l.I00000oIO(null), iooloo1ioilI000iOII.I010l1O())) {
/* 31 */                return 0L;
                    }
/* 43 */            boolean zBooleanValue = false;
/* 44 */            if (SdkExtensions.getExtensionVersion(30) < 4) {
/* 46 */                j = 8;
                    } else {
/* 82 */                j = (SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0) < ((Integer) iol1II1ii1i.I00iOIl.I00000oIO(null)).intValue() ? 16L : 0L;
                    }
/* 89 */            if (!I01I0Iioooo0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
/* 93 */                j |= 2;
                    }
/* 96 */            if (j == 0) {
/* 100 */               if (this.I00io1l != null) {
/* 173 */                   zBooleanValue = this.I00io1l.booleanValue();
/* 177 */                   if (!zBooleanValue) {
/* 179 */                       j = 64;
                            }
                        } else {
/* 102 */                   O1iOlOIiO o1iOlOIiOI011iO = I011iO();
/* 106 */                   if (o1iOlOIiOI011iO != null) {
                                try {
/* 121 */                           num = (Integer) o1iOlOIiOI011iO.I00000oOI().get(10000L, TimeUnit.MILLISECONDS);
/* 123 */                           if (num != null) {
                                        try {
/* 130 */                                   if (num.intValue() == 1) {
/* 132 */                                       zBooleanValue = true;
                                            }
                                        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
/* 134 */                                   e = e2;
/* 147 */                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 154 */                                   l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Measurement manager api exception", e);
/* 159 */                                   this.I00io1l = Boolean.FALSE;
/* 161 */                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 168 */                                   l01o0io1ooo0.I00lll10.I0000Il00O("Measurement manager api status result", num);
/* 173 */                                   zBooleanValue = this.I00io1l.booleanValue();
/* 177 */                                   if (!zBooleanValue) {
                                            }
/* 183 */                                   if (j != 0) {
                                            }
                                        }
                                    }
/* 140 */                           this.I00io1l = Boolean.valueOf(zBooleanValue);
                                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
/* 145 */                           num = null;
/* 146 */                           e = e3;
                                }
/* 161 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 168 */                       l01o0io1ooo0.I00lll10.I0000Il00O("Measurement manager api status result", num);
/* 173 */                       zBooleanValue = this.I00io1l.booleanValue();
                            }
/* 177 */                   if (!zBooleanValue) {
                            }
                        }
                    }
/* 183 */           if (j != 0) {
/* 185 */               return 1L;
                    }
/* 245 */           return j;
                }

                public final Object I011lO1liO1O(int i, Object obj, boolean z, boolean z2) {
/* 1 */             if (obj == null) {
/* 169 */               return null;
                    }
/* 7 */             if ((obj instanceof Long) || (obj instanceof Double)) {
/* 13 */                return obj;
                    }
/* 16 */            if (obj instanceof Integer) {
/* 25 */                return Long.valueOf(((Integer) obj).intValue());
                    }
/* 32 */            if (obj instanceof Byte) {
/* 41 */                return Long.valueOf(((Byte) obj).byteValue());
                    }
/* 48 */            if (obj instanceof Short) {
/* 57 */                return Long.valueOf(((Short) obj).shortValue());
                    }
/* 64 */            if (obj instanceof Boolean) {
/* 80 */                return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                    }
/* 87 */            if (obj instanceof Float) {
/* 95 */                return Double.valueOf(((Float) obj).doubleValue());
                    }
/* 102 */           if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
/* 175 */               return I010l1ol111(z, obj.toString(), i);
                    }
/* 113 */           if (!z2) {
/* 169 */               return null;
                    }
/* 117 */           if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
/* 169 */               return null;
                    }
/* 125 */           ArrayList arrayList = new ArrayList();
/* 132 */           for (Parcelable parcelable : (Parcelable[]) obj) {
/* 138 */               if (parcelable instanceof Bundle) {
/* 142 */                   Bundle bundleI01IO0oio = I01IO0oio((Bundle) parcelable);
/* 150 */                   if (!bundleI01IO0oio.isEmpty()) {
/* 152 */                       arrayList.add(bundleI01IO0oio);
                            }
                        }
                    }
/* 164 */           return arrayList.toArray(new Bundle[arrayList.size()]);
                }

                public final int I011lOIoo0l(String str) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 11 */            if ("_ldl".equals(str)) {
/* 13 */                iIl1iil iil1iil = l0olllo1i.I00iio;
/* 15 */                return Barcode.FORMAT_PDF417;
                    }
/* 24 */            if ("_id".equals(str)) {
/* 26 */                iIl1iil iil1iil2 = l0olllo1i.I00iio;
/* 28 */                return Barcode.FORMAT_QR_CODE;
                    }
/* 37 */            if ("_lgclid".equals(str)) {
/* 39 */                iIl1iil iil1iil3 = l0olllo1i.I00iio;
/* 41 */                return 100;
                    }
/* 44 */            iIl1iil iil1iil4 = l0olllo1i.I00iio;
/* 46 */            return 36;
                }

                public final boolean I01I0Iioooo0(String str) {
/* 1 */             I010II();
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 20 */            if (i01l1OO001.I00000oIO(l0olllo1i.I00iOIl).I00000oIO.checkCallingOrSelfPermission(str) == 0) {
/* 22 */                return true;
                    }
/* 24 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 26 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 33 */            l01o0io1ooo0.I00lli11.I0000Il00O("Permission not granted", str);
/* 36 */            return false;
                }

                public final boolean I01II10(String str, String str2) {
/* 5 */             if (!TextUtils.isEmpty(str2)) {
/* 7 */                 return true;
                    }
/* 13 */            if (TextUtils.isEmpty(str)) {
/* 15 */                return false;
                    }
/* 29 */            return ((l0olllO1i) this.I00iOIl).I00iio.I010ioo("debug.firebase.analytics.app").equals(str);
                }

                public final Bundle I01IO0oio(Bundle bundle) {
/* 3 */             Bundle bundle2 = new Bundle();
/* 6 */             if (bundle != null) {
/* 20 */                for (String str : bundle.keySet()) {
/* 32 */                    Object objI010o0o0oO = I010o0o0oO(str, bundle.get(str));
/* 36 */                    if (objI010o0o0oO == null) {
/* 40 */                        l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 42 */                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 44 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 57 */                        l01o0io1ooo0.I00li1OI.I0000Il00O("Param value can't be null", l0olllo1i.I00l0OO0IO.I00000oOI(str));
                            } else {
/* 61 */                        I011IOil(bundle2, str, objI010o0o0oO);
                            }
                        }
                    }
/* 77 */            return bundle2;
                }

                public final ii0oooi0IO0l I01IO1il(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 13 */            if (I01Olioli(str) != 0) {
/* 68 */                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 70 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 72 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 85 */                l01o0io1ooo0.I00ilO0.I0000Il00O("Invalid conditional property event name", l0olllo1i.I00l0OO0IO.I0000Il00O(str));
/* 88 */                OIiilo1Ool0o.I00100o1O0lo();
/* 5 */                 return null;
                    }
/* 25 */            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
/* 30 */            bundle2.putString("_o", str2);
/* 38 */            Bundle bundleI010oio1OO0 = I010oio1OO0(str, bundle2, Collections.singletonList("_o"), true);
/* 42 */            if (z) {
/* 44 */                bundleI010oio1OO0 = I01IO0oio(bundleI010oio1OO0);
                    }
/* 48 */            lII0I0I000I.I000II(bundleI010oio1OO0);
/* 62 */            return new ii0oooi0IO0l(str, new ii0il0lOolIo(bundleI010oio1OO0), str2, j, j2);
                }

                public final boolean I01Ii0ll10O(Context context, String str) {
                    Signature[] signatureArr;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 9 */             X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
                    try {
/* 18 */                PackageInfo packageInfoI0000Il00O = i01l1OO001.I00000oIO(context).I0000Il00O(64, str);
/* 22 */                if (packageInfoI0000Il00O == null || (signatureArr = packageInfoI0000Il00O.signatures) == null || signatureArr.length <= 0) {
/* 93 */                    return true;
                        }
/* 59 */                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
                    } catch (PackageManager.NameNotFoundException e) {
/* 68 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 70 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 77 */                l01o0io1ooo0.I00ilO0.I0000Il00O("Package name not found", e);
/* 93 */                return true;
                    } catch (CertificateException e2) {
/* 81 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 83 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 90 */                l01o0io1ooo02.I00ilO0.I0000Il00O("Error obtaining certificate", e2);
/* 93 */                return true;
                    }
                }

                public final boolean I01Iio10lo(int i) {
/* 9 */             Boolean bool = ((l0olllO1i) this.I00iOIl).I000OOo1O().I00ilI0I1;
/* 17 */            if (I01IlIoOI() < i / 1000) {
                        return (bool == null || bool.booleanValue()) ? false : true;
                    }
/* 30 */            return true;
                }

                public final int I01IlIoOI() {
/* 1 */             Integer numValueOf = this.I00ioIO;
/* 3 */             if (numValueOf == null) {
/* 7 */                 l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 9 */                 Io0iI1l01il io0iI1l01il = Io0iI1l01il.I00000oOI;
/* 11 */                Context context = l0olllo1i.I00iOIl;
/* 13 */                io0iI1l01il.getClass();
/* 22 */                numValueOf = Integer.valueOf(Io0ii0lOoi.I00000oIO(context) / 1000);
/* 26 */                this.I00ioIO = numValueOf;
                    }
/* 28 */            return numValueOf.intValue();
                }

                public final void I01Ilioliio(Bundle bundle, long j) {
/* 3 */             long j2 = bundle.getLong("_et");
/* 11 */            if (j2 != 0) {
/* 17 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 19 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 30 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Params already contained engagement", Long.valueOf(j2));
                    } else {
/* 34 */                j2 = 0;
                    }
/* 36 */            bundle.putLong("_et", j + j2);
                }

                public final void I01Ilo0i(String str, il0IOO il0ioo) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putString("r", str);
                    try {
/* 11 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 20 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 22 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning string value to wrapper", e);
                    }
                }

                public final void I01Io000(il0IOO il0ioo, long j) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putLong("r", j);
                    try {
/* 11 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 20 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 22 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning long value to wrapper", e);
                    }
                }

                public final void I01Io001O(il0IOO il0ioo, int i) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putInt("r", i);
                    try {
/* 11 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 20 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 22 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning int value to wrapper", e);
                    }
                }

                public final void I01Io1(il0IOO il0ioo, byte[] bArr) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putByteArray("r", bArr);
                    try {
/* 11 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 20 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 22 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning byte array to wrapper", e);
                    }
                }

                public final void I01Io11IiiiO(il0IOO il0ioo, boolean z) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putBoolean("r", z);
                    try {
/* 11 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 20 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 22 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning boolean value to wrapper", e);
                    }
                }

                public final void I01Io1ilOIIo(il0IOO il0ioo, Bundle bundle) {
                    try {
/* 1 */                 il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 10 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 12 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 19 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning bundle value to wrapper", e);
                    }
                }

                public final void I01IoO(il0IOO il0ioo, ArrayList arrayList) {
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putParcelableArrayList("r", arrayList);
                    try {
/* 11 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 20 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 22 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning bundle list to wrapper", e);
                    }
                }

                public final String I01O1lIi() {
/* 3 */             byte[] bArr = new byte[16];
/* 9 */             I01OO1I().nextBytes(bArr);
/* 26 */            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
                }

                public final long I01OIo() {
                    long andIncrement;
                    long j;
/* 1 */             AtomicLong atomicLong = this.I00iio;
/* 11 */            if (atomicLong.get() != 0) {
/* 54 */                AtomicLong atomicLong2 = this.I00iio;
                        synchronized (atomicLong2) {
/* 61 */                    atomicLong2.compareAndSet(-1L, 1L);
/* 64 */                    andIncrement = atomicLong2.getAndIncrement();
                        }
/* 69 */                return andIncrement;
                    }
                    synchronized (atomicLong) {
/* 16 */                long jNanoTime = System.nanoTime();
/* 26 */                ((l0olllO1i) this.I00iOIl).I00li1OI.getClass();
/* 37 */                long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
/* 43 */                int i = this.I00ilI0I1 + 1;
/* 45 */                this.I00ilI0I1 = i;
/* 48 */                j = jNextLong + i;
                    }
/* 50 */            return j;
                }

                public final SecureRandom I01OO1I() {
/* 1 */             I010II();
/* 4 */             SecureRandom secureRandom = this.I00iiO;
/* 6 */             if (secureRandom != null) {
/* 20 */                return secureRandom;
                    }
/* 10 */            SecureRandom secureRandom2 = new SecureRandom();
/* 13 */            this.I00iiO = secureRandom2;
/* 20 */            return secureRandom2;
                }

                public final Bundle I01OOiI1o(Uri uri) {
                    String queryParameter;
                    String queryParameter2;
                    String queryParameter3;
                    String queryParameter4;
                    String queryParameter5;
                    String queryParameter6;
                    String queryParameter7;
                    String queryParameter8;
                    String queryParameter9;
                    l0olllO1i l0olllo1i;
/* 8 */             l0olllO1i l0olllo1i2 = (l0olllO1i) this.I00iOIl;
/* 10 */            if (uri != null) {
                        try {
/* 26 */                    if (uri.isHierarchical()) {
/* 30 */                        queryParameter2 = uri.getQueryParameter("utm_campaign");
/* 36 */                        queryParameter3 = uri.getQueryParameter("utm_source");
/* 42 */                        queryParameter4 = uri.getQueryParameter("utm_medium");
/* 46 */                        queryParameter5 = uri.getQueryParameter("gclid");
/* 50 */                        queryParameter6 = uri.getQueryParameter("gbraid");
/* 56 */                        queryParameter7 = uri.getQueryParameter("utm_id");
/* 60 */                        queryParameter8 = uri.getQueryParameter("dclid");
/* 64 */                        queryParameter9 = uri.getQueryParameter("srsltid");
/* 68 */                        queryParameter = uri.getQueryParameter("sfmc_id");
                            } else {
/* 78 */                        queryParameter = null;
/* 80 */                        queryParameter2 = null;
/* 81 */                        queryParameter3 = null;
/* 82 */                        queryParameter4 = null;
/* 83 */                        queryParameter5 = null;
/* 84 */                        queryParameter6 = null;
/* 85 */                        queryParameter7 = null;
/* 86 */                        queryParameter8 = null;
/* 87 */                        queryParameter9 = null;
                            }
/* 92 */                    if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
/* 149 */                       Bundle bundle = new Bundle();
/* 156 */                       if (TextUtils.isEmpty(queryParameter2)) {
/* 166 */                           l0olllo1i = l0olllo1i2;
                                } else {
/* 158 */                           l0olllo1i = l0olllo1i2;
/* 162 */                           bundle.putString("campaign", queryParameter2);
                                }
/* 172 */                       if (!TextUtils.isEmpty(queryParameter3)) {
/* 176 */                           bundle.putString("source", queryParameter3);
                                }
/* 183 */                       if (!TextUtils.isEmpty(queryParameter4)) {
/* 187 */                           bundle.putString("medium", queryParameter4);
                                }
/* 194 */                       if (!TextUtils.isEmpty(queryParameter5)) {
/* 196 */                           bundle.putString("gclid", queryParameter5);
                                }
/* 203 */                       if (!TextUtils.isEmpty(queryParameter6)) {
/* 205 */                           bundle.putString("gbraid", queryParameter6);
                                }
/* 210 */                       String queryParameter10 = uri.getQueryParameter("gad_source");
/* 218 */                       if (!TextUtils.isEmpty(queryParameter10)) {
/* 220 */                           bundle.putString("gad_source", queryParameter10);
                                }
/* 225 */                       String queryParameter11 = uri.getQueryParameter("utm_term");
/* 233 */                       if (!TextUtils.isEmpty(queryParameter11)) {
/* 237 */                           bundle.putString("term", queryParameter11);
                                }
/* 242 */                       String queryParameter12 = uri.getQueryParameter("utm_content");
/* 250 */                       if (!TextUtils.isEmpty(queryParameter12)) {
/* 254 */                           bundle.putString("content", queryParameter12);
                                }
/* 259 */                       String queryParameter13 = uri.getQueryParameter("aclid");
/* 267 */                       if (!TextUtils.isEmpty(queryParameter13)) {
/* 269 */                           bundle.putString("aclid", queryParameter13);
                                }
/* 274 */                       String queryParameter14 = uri.getQueryParameter("cp1");
/* 282 */                       if (!TextUtils.isEmpty(queryParameter14)) {
/* 284 */                           bundle.putString("cp1", queryParameter14);
                                }
/* 289 */                       String queryParameter15 = uri.getQueryParameter("anid");
/* 297 */                       if (!TextUtils.isEmpty(queryParameter15)) {
/* 299 */                           bundle.putString("anid", queryParameter15);
                                }
/* 306 */                       if (!TextUtils.isEmpty(queryParameter7)) {
/* 310 */                           bundle.putString("campaign_id", queryParameter7);
                                }
/* 317 */                       if (!TextUtils.isEmpty(queryParameter8)) {
/* 319 */                           bundle.putString("dclid", queryParameter8);
                                }
/* 324 */                       String queryParameter16 = uri.getQueryParameter("utm_source_platform");
/* 332 */                       if (!TextUtils.isEmpty(queryParameter16)) {
/* 336 */                           bundle.putString("source_platform", queryParameter16);
                                }
/* 341 */                       String queryParameter17 = uri.getQueryParameter("utm_creative_format");
/* 349 */                       if (!TextUtils.isEmpty(queryParameter17)) {
/* 353 */                           bundle.putString("creative_format", queryParameter17);
                                }
/* 358 */                       String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
/* 366 */                       if (!TextUtils.isEmpty(queryParameter18)) {
/* 370 */                           bundle.putString("marketing_tactic", queryParameter18);
                                }
/* 377 */                       if (!TextUtils.isEmpty(queryParameter9)) {
/* 379 */                           bundle.putString("srsltid", queryParameter9);
                                }
/* 386 */                       if (!TextUtils.isEmpty(queryParameter)) {
/* 390 */                           bundle.putString("sfmc_id", queryParameter);
                                }
/* 405 */                       for (String str : uri.getQueryParameterNames()) {
/* 419 */                           if (str.startsWith("gad_")) {
/* 421 */                               String queryParameter19 = uri.getQueryParameter(str);
/* 429 */                               if (!TextUtils.isEmpty(queryParameter19)) {
/* 431 */                                   bundle.putString(str, queryParameter19);
                                        }
                                    }
                                }
/* 435 */                       l0olllO1i l0olllo1i3 = l0olllo1i;
/* 446 */                       if (l0olllo1i3.I00iio.I01101IOlO(null, iol1II1ii1i.I010lI0oi)) {
/* 481 */                           String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
/* 487 */                           l0olllo1i3.I00iio.getClass();
/* 494 */                           int iMax = Math.max(500, Barcode.FORMAT_QR_CODE);
/* 502 */                           if (string.length() > iMax) {
/* 507 */                               string = I010l1ol111(true, string, iMax - 3);
                                    }
/* 515 */                           if (!TextUtils.isEmpty(string)) {
/* 519 */                               bundle.putString("deep_link_url", string);
                                    }
                                }
/* 522 */                       return bundle;
                            }
                        } catch (UnsupportedOperationException e) {
/* 523 */                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 525 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 532 */                   l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Install referrer url isn't a hierarchical URI", e);
/* 535 */                   return null;
                        }
                    }
/* 143 */           return null;
                }

                public final boolean I01OiO1OI(String str, String str2) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             if (str2 == null) {
/* 8 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 17 */                l01o0io1ooo0.I00ioIO.I0000Il00O("Name is required and can't be null. Type", str);
/* 5 */                 return false;
                    }
/* 25 */            if (str2.length() == 0) {
/* 27 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 29 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 36 */                l01o0io1ooo02.I00ioIO.I0000Il00O("Name is required and can't be empty. Type", str);
/* 5 */                 return false;
                    }
/* 40 */            int iCodePointAt = str2.codePointAt(0);
/* 48 */            if (!Character.isLetter(iCodePointAt)) {
/* 50 */                l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 52 */                l0olllO1i.I000II(l01o0io1ooo03);
/* 59 */                l01o0io1ooo03.I00ioIO.I0000O(str, "Name must start with a letter. Type, name", str2);
/* 5 */                 return false;
                    }
/* 63 */            int length = str2.length();
/* 67 */            int iCharCount = Character.charCount(iCodePointAt);
/* 71 */            while (iCharCount < length) {
/* 73 */                int iCodePointAt2 = str2.codePointAt(iCharCount);
/* 79 */                if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
/* 87 */                    l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 89 */                    l0olllO1i.I000II(l01o0io1ooo04);
/* 96 */                    l01o0io1ooo04.I00ioIO.I0000O(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
/* 5 */                     return false;
                        }
/* 104 */               iCharCount += Character.charCount(iCodePointAt2);
                    }
/* 106 */           return true;
                }

                public final boolean I01Ol1o0(String str, String str2) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             if (str2 == null) {
/* 8 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 17 */                l01o0io1ooo0.I00ioIO.I0000Il00O("Name is required and can't be null. Type", str);
/* 5 */                 return false;
                    }
/* 25 */            if (str2.length() == 0) {
/* 27 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 29 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 36 */                l01o0io1ooo02.I00ioIO.I0000Il00O("Name is required and can't be empty. Type", str);
/* 5 */                 return false;
                    }
/* 40 */            int iCodePointAt = str2.codePointAt(0);
/* 50 */            if (!Character.isLetter(iCodePointAt)) {
/* 52 */                if (iCodePointAt != 95) {
/* 56 */                    l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 58 */                    l0olllO1i.I000II(l01o0io1ooo03);
/* 65 */                    l01o0io1ooo03.I00ioIO.I0000O(str, "Name must start with a letter or _ (underscore). Type, name", str2);
/* 5 */                     return false;
                        }
/* 54 */                iCodePointAt = 95;
                    }
/* 69 */            int length = str2.length();
/* 73 */            int iCharCount = Character.charCount(iCodePointAt);
/* 77 */            while (iCharCount < length) {
/* 79 */                int iCodePointAt2 = str2.codePointAt(iCharCount);
/* 83 */                if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
/* 91 */                    l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 93 */                    l0olllO1i.I000II(l01o0io1ooo04);
/* 100 */                   l01o0io1ooo04.I00ioIO.I0000O(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
/* 5 */                     return false;
                        }
/* 108 */               iCharCount += Character.charCount(iCodePointAt2);
                    }
/* 110 */           return true;
                }

                public final boolean I01OlIoIl(String str, String[] strArr, String[] strArr2, String str2) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             if (str2 == null) {
/* 8 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 17 */                l01o0io1ooo0.I00ioIO.I0000Il00O("Name is required and can't be null. Type", str);
/* 5 */                 return false;
                    }
/* 23 */            for (int i = 0; i < 3; i++) {
/* 33 */                if (str2.startsWith(I00l0I0l0lO1[i])) {
/* 35 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 37 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 44 */                    l01o0io1ooo02.I00ioIO.I0000O(str, "Name starts with reserved prefix. Type, name", str2);
/* 5 */                     return false;
                        }
                    }
/* 51 */            if (strArr == null || !I011olOoO(str2, strArr)) {
/* 80 */                return true;
                    }
/* 59 */            if (strArr2 != null && I011olOoO(str2, strArr2)) {
/* 80 */                return true;
                    }
/* 67 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 69 */            l0olllO1i.I000II(l01o0io1ooo03);
/* 76 */            l01o0io1ooo03.I00ioIO.I0000O(str, "Name is reserved. Type, name", str2);
/* 5 */             return false;
                }

                public final boolean I01OlOoii0(String str, int i, String str2) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             if (str2 == null) {
/* 8 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 17 */                l01o0io1ooo0.I00ioIO.I0000Il00O("Name is required and can't be null. Type", str);
/* 5 */                 return false;
                    }
/* 29 */            if (str2.codePointCount(0, str2.length()) <= i) {
/* 48 */                return true;
                    }
/* 31 */            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 33 */            l0olllO1i.I000II(l01o0io1ooo02);
/* 44 */            l01o0io1ooo02.I00ioIO.I0000oI00("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
/* 5 */             return false;
                }

                public final int I01Olioli(String str) {
/* 8 */             if (!I01Ol1o0("event", str)) {
/* 7 */                 return 2;
                    }
/* 37 */            if (I01OlIoIl("event", iO1l1II0O0.I00000oIO, ((l0olllO1i) this.I00iOIl).I00iio.I01101IOlO(null, iol1II1ii1i.I0110OiO) ? iO1l1II0O0.I0000Il00O : iO1l1II0O0.I00000oOI, str)) {
                        return !I01OlOoii0("event", 40, str) ? 2 : 0;
                    }
/* 39 */            return 13;
                }

                public final boolean I01OoIoio00O(String str) {
                    return ((l0olllO1i) this.I00iOIl).I00iio.I01101IOlO(null, iol1II1ii1i.I0110OiO) ? I011olOoO(str, iO1l1II0O0.I0000oI00) : I011olOoO(str, iO1l1II0O0.I0000O);
                }

                public final int I01OoOi(String str) {
/* 8 */             if (!I01Ol1o0("user property", str)) {
/* 7 */                 return 6;
                    }
/* 18 */            if (!I01OlIoIl("user property", iO1lI0lo110.I00000oIO, null, str)) {
/* 20 */                return 15;
                    }
/* 27 */            iIl1iil iil1iil = ((l0olllO1i) this.I00iOIl).I00iio;
                    return !I01OlOoii0("user property", 24, str) ? 6 : 0;
                }

                public final int I01OooO0o0o(String str) {
/* 8 */             if (!I01OiO1OI("event param", str)) {
/* 7 */                 return 3;
                    }
/* 16 */            if (!I01OlIoIl("event param", null, null, str)) {
/* 18 */                return 14;
                    }
/* 25 */            iIl1iil iil1iil = ((l0olllO1i) this.I00iOIl).I00iio;
                    return !I01OlOoii0("event param", 40, str) ? 3 : 0;
                }

                public final int I01i000i0iI(String str) {
/* 8 */             if (!I01Ol1o0("event param", str)) {
/* 7 */                 return 3;
                    }
/* 16 */            if (!I01OlIoIl("event param", null, null, str)) {
/* 18 */                return 14;
                    }
/* 25 */            iIl1iil iil1iil = ((l0olllO1i) this.I00iOIl).I00iio;
                    return !I01OlOoii0("event param", 40, str) ? 3 : 0;
                }
            }
