            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Build;
            import android.telephony.TelephonyManager;
            import android.util.SparseArray;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.util.Calendar;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.TimeZone;
            
            public final class IO0ll11OOI implements OoIOiIl10ioo {
                public I0IIiO0iI I00000oIO;
                public ConnectivityManager I00000oOI;
                public Context I0000Il00O;
                public URL I0000O;
                public IOO0l0i0Oo I0000oI00;
                public IOO0l0i0Oo I0001Ioi1lo;
                public int I000II;

                public static URL I00000oOI(String str) {
                    try {
/* 3 */                 return new URL(str);
                    } catch (MalformedURLException e) {
/* 29 */                throw new IllegalArgumentException(IIl001iO0Io.I000o00OoI0I("Invalid url: ", str), e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I1l0Ioi01 I00000oIO(I1l0Ioi01 i1l0Ioi01) {
                    int type;
                    int subtype;
                    HashMap map;
/* 1 */             Context context = this.I0000Il00O;
/* 5 */             NetworkInfo activeNetworkInfo = this.I00000oOI.getActiveNetworkInfo();
/* 9 */             I0Oi111ii i0Oi111iiI0000Il00O = i1l0Ioi01.I0000Il00O();
/* 13 */            int i = Build.VERSION.SDK_INT;
/* 17 */            HashMap map2 = (HashMap) i0Oi111iiI0000Il00O.I00io1l;
/* 22 */            if (map2 == null) {
/* 280 */               I000II.I001IO000("Property \"autoMetadata\" has not been set");
/* 19 */                return null;
                    }
/* 30 */            map2.put("sdk-version", String.valueOf(i));
/* 37 */            i0Oi111iiI0000Il00O.I00000oIO("model", Build.MODEL);
/* 44 */            i0Oi111iiI0000Il00O.I00000oIO("hardware", Build.HARDWARE);
/* 51 */            i0Oi111iiI0000Il00O.I00000oIO("device", Build.DEVICE);
/* 58 */            i0Oi111iiI0000Il00O.I00000oIO("product", Build.PRODUCT);
/* 65 */            i0Oi111iiI0000Il00O.I00000oIO("os-uild", Build.ID);
/* 72 */            i0Oi111iiI0000Il00O.I00000oIO("manufacturer", Build.MANUFACTURER);
/* 79 */            i0Oi111iiI0000Il00O.I00000oIO("fingerprint", Build.FINGERPRINT);
/* 82 */            Calendar.getInstance();
/* 101 */           long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
/* 106 */           HashMap map3 = (HashMap) i0Oi111iiI0000Il00O.I00io1l;
/* 108 */           if (map3 == null) {
/* 276 */               I000II.I001IO000("Property \"autoMetadata\" has not been set");
/* 19 */                return null;
                    }
/* 116 */           map3.put("tz-offset", String.valueOf(offset));
/* 119 */           int i2 = -1;
/* 120 */           if (activeNetworkInfo == null) {
/* 122 */               SparseArray sparseArray = OIIO0Iilo1O0.I00iOIl;
/* 124 */               type = -1;
                    } else {
/* 126 */               type = activeNetworkInfo.getType();
                    }
/* 132 */           HashMap map4 = (HashMap) i0Oi111iiI0000Il00O.I00io1l;
/* 134 */           if (map4 == null) {
/* 272 */               I000II.I001IO000("Property \"autoMetadata\" has not been set");
/* 19 */                return null;
                    }
/* 142 */           map4.put("net-type", String.valueOf(type));
/* 146 */           if (activeNetworkInfo != null) {
/* 152 */               subtype = activeNetworkInfo.getSubtype();
/* 156 */               if (subtype == -1) {
/* 158 */                   SparseArray sparseArray2 = OIIO00i1.I00iOIl;
/* 160 */                   subtype = 100;
                        } else if (((OIIO00i1) OIIO00i1.I00iOIl.get(subtype)) == null) {
                        }
/* 175 */               map = (HashMap) i0Oi111iiI0000Il00O.I00io1l;
/* 177 */               if (map != null) {
/* 268 */                   I000II.I001IO000("Property \"autoMetadata\" has not been set");
/* 19 */                    return null;
                        }
/* 185 */               map.put("mobile-subtype", String.valueOf(subtype));
/* 198 */               i0Oi111iiI0000Il00O.I00000oIO("country", Locale.getDefault().getCountry());
/* 211 */               i0Oi111iiI0000Il00O.I00000oIO("locale", Locale.getDefault().getLanguage());
/* 228 */               i0Oi111iiI0000Il00O.I00000oIO("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        try {
/* 243 */                   i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
/* 251 */                   l11I1i.I00000oOI("CctTransportBackend", "Unable to find version code for package", e);
                        }
/* 260 */               i0Oi111iiI0000Il00O.I00000oIO("application_build", Integer.toString(i2));
/* 263 */               return i0Oi111iiI0000Il00O.I000lI();
                    }
/* 148 */           SparseArray sparseArray3 = OIIO00i1.I00iOIl;
/* 150 */           subtype = 0;
/* 175 */           map = (HashMap) i0Oi111iiI0000Il00O.I00io1l;
/* 177 */           if (map != null) {
                    }
                }
            }
