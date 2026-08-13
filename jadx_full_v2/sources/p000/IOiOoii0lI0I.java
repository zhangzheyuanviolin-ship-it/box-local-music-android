            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            
            public final class IOiOoii0lI0I implements OOiO0Il {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public IOiOoii0lI0I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 5 */             boolean z = true;
/* 8 */             boolean z2 = false;
                    switch (this.I00000oIO) {
                        case 0:
/* 136 */                   IOiOol0 iOiOol0 = (IOiOol0) this.I00000oOI;
/* 140 */                   IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) this.I0000Il00O;
/* 142 */                   iOiOol0.getClass();
/* 145 */                   IOiOiIIiii1 iOiOiIIiii1 = iOiIi0Oi.I0001Ioi1lo;
/* 151 */                   I1ii1o0 i1ii1o0 = new I1ii1o0(15, z2);
/* 156 */                   HashSet hashSet = new HashSet();
/* 161 */                   HashSet hashSet2 = new HashSet();
/* 166 */                   HashSet hashSet3 = new HashSet();
/* 171 */                   HashSet hashSet4 = new HashSet();
/* 176 */                   HashSet hashSet5 = new HashSet();
/* 179 */                   Set<IiIooooiilo> set = iOiIi0Oi.I0000Il00O;
/* 181 */                   Set set2 = iOiIi0Oi.I000II;
/* 191 */                   for (IiIooooiilo iiIooooiilo : set) {
/* 199 */                       int i = iiIooooiilo.I0000Il00O;
/* 201 */                       int i2 = iiIooooiilo.I00000oOI;
/* 208 */                       boolean z3 = i == 0 ? z : false;
/* 210 */                       OOiilOlOOI oOiilOlOOI = iiIooooiilo.I00000oIO;
/* 213 */                       if (z3) {
/* 215 */                           if (i2 == 2) {
/* 217 */                               hashSet4.add(oOiilOlOOI);
                                    } else {
/* 221 */                               hashSet.add(oOiilOlOOI);
                                    }
                                } else if (i == 2) {
/* 227 */                           hashSet3.add(oOiilOlOOI);
                                } else if (i2 == 2) {
/* 233 */                           hashSet5.add(oOiilOlOOI);
                                } else {
/* 237 */                           hashSet2.add(oOiilOlOOI);
                                }
/* 240 */                       z = true;
                            }
/* 246 */                   if (!set2.isEmpty()) {
/* 252 */                       hashSet.add(OOiilOlOOI.I00000oIO(OOiiOioO0.class));
                            }
/* 259 */                   i1ii1o0.I00iiI = Collections.unmodifiableSet(hashSet);
/* 265 */                   i1ii1o0.I00iiO = Collections.unmodifiableSet(hashSet2);
/* 267 */                   Collections.unmodifiableSet(hashSet3);
/* 274 */                   i1ii1o0.I00iio = Collections.unmodifiableSet(hashSet4);
/* 280 */                   i1ii1o0.I00ilI0I1 = Collections.unmodifiableSet(hashSet5);
/* 282 */                   i1ii1o0.I00ilO0 = iOiOol0;
/* 284 */                   VarHandle.storeStoreFence();
/* 287 */                   return iOiOiIIiii1.create(i1ii1o0);
                        case 1:
/* 106 */                   Context context = (Context) this.I00000oOI;
/* 110 */                   String str = (String) this.I0000Il00O;
/* 114 */                   Io1Ooo1 io1Ooo1 = new Io1Ooo1();
/* 128 */                   io1Ooo1.I00000oIO = new O00lOo(context, "FirebaseHeartBeat".concat(str));
/* 130 */                   VarHandle.storeStoreFence();
/* 133 */                   return io1Ooo1;
                        default:
/* 14 */                    IlIoliIO ilIoliIO = (IlIoliIO) this.I00000oOI;
/* 18 */                    Context context2 = (Context) this.I0000Il00O;
/* 22 */                    String strI0000Il00O = ilIoliIO.I0000Il00O();
/* 34 */                    Ii11I1l ii11I1l = new Ii11I1l();
/* 37 */                    Context contextCreateDeviceProtectedStorageContext = context2.createDeviceProtectedStorageContext();
/* 47 */                    SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strI0000Il00O), 0);
/* 57 */                    if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
/* 59 */                        z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                            } else {
                                try {
/* 64 */                            PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
/* 68 */                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), Barcode.FORMAT_ITF)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
/* 94 */                                z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
/* 98 */                    ii11I1l.I00000oIO = z;
/* 100 */                   VarHandle.storeStoreFence();
/* 103 */                   return ii11I1l;
                    }
                }
            }
