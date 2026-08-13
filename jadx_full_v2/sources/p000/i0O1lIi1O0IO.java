            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.text.TextUtils;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.EnumSet;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.TreeMap;
            import java.util.TreeSet;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentSkipListMap;
            
/* 15 */    public final class i0O1lIi1O0IO implements i0Ii0I1ll, OIi0Oi1lOoo, l1O01olIi1, iooOIOOo1, OliiillO, o0I0i0loIlO, IIiOOIoi0 {
                public final int I00iOIl;
                public Object I00iiI;

                public i0O1lIi1O0IO() {
/* 2 */             this.I00iOIl = 4;
/* 14 */            this.I00iiI = new EnumMap(l1iioiool.class);
                }

                public static String I00000oIO(Class cls) {
/* 1 */             int modifiers = cls.getModifiers();
/* 9 */             if (Modifier.isInterface(modifiers)) {
/* 17 */                return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
                    }
/* 26 */            if (!Modifier.isAbstract(modifiers)) {
/* 52 */                return null;
                    }
/* 28 */            String name = cls.getName();
/* 47 */            return IIlIOloOOO.I0010I0i(new StringBuilder(name.length() + 225), "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ", name, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class");
                }

                public static i0O1lIi1O0IO I000II(String str) {
/* 25 */            l1iIoO01 l1iioo01I0000oI00 = (TextUtils.isEmpty(str) || str.length() > 1) ? l1iIoO01.UNINITIALIZED : l1ioIO011Oo.I0000oI00(str.charAt(0));
/* 30 */            i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(7);
/* 33 */            i0o1lii1o0io.I00iiI = l1iioo01I0000oI00;
/* 35 */            VarHandle.storeStoreFence();
/* 77 */            return i0o1lii1o0io;
                }

                public boolean I00000oOI() {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiI;
                    try {
                        return i01l1OO001.I00000oIO(l0olllo1i.I00iOIl).I0000Il00O(Barcode.FORMAT_ITF, "com.android.vending").versionCode >= 80837300;
                    } catch (Exception e) {
/* 31 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 33 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 40 */                l01o0io1ooo0.I00lll10.I0000Il00O("Failed to retrieve Play Store version for Install Referrer", e);
/* 5 */                 return false;
                    }
                }

                @Override
                public Object I0000Il00O() {
/* 11 */            i0Il00O1 i0il00o1 = (i0Il00O1) ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 13 */            i0O1l1o1O i0o1l1o1o = new i0O1l1o1O();
/* 16 */            i0o1l1o1o.I00000oIO = i0il00o1;
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return i0o1l1o1o;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public lo11I0lO I0000O(o0IOi0io1iOo o0ioi0io1ioo, boolean z) throws NoSuchMethodException, SecurityException {
                    iili011O1 iili011o1;
                    String string;
                    lo11I0lO iIlIi0lIii;
/* 1 */             Map map = Collections.EMPTY_MAP;
/* 3 */             Type type = o0ioi0io1ioo.I00000oOI;
/* 5 */             Class cls = o0ioi0io1ioo.I00000oIO;
/* 11 */            lo11I0lO lo11i0lo = null;
/* 12 */            if (map.get(type) != null) {
/* 371 */               OIiilo1Ool0o.I00000oIO();
/* 11 */                return null;
                    }
/* 18 */            if (map.get(cls) != null) {
/* 367 */               OIiilo1Ool0o.I00000oIO();
/* 11 */                return null;
                    }
/* 26 */            if (EnumSet.class.isAssignableFrom(cls)) {
/* 32 */                i11I1Ili i11i1ili = new i11I1Ili(11);
/* 35 */                i11i1ili.I00iiI = type;
/* 37 */                VarHandle.storeStoreFence();
                        iili011o1 = i11i1ili;
                    } else if (cls == EnumMap.class) {
/* 48 */                iili011O1 iili011o12 = new iili011O1(5);
/* 51 */                iili011o12.I00iiI = type;
/* 53 */                VarHandle.storeStoreFence();
                        iili011o1 = iili011o12;
                    } else {
/* 57 */                iili011o1 = null;
                    }
/* 58 */            if (iili011o1 != null) {
/* 60 */                return iili011o1;
                    }
/* 63 */            ll10OO0Illl1.I00000oIO(Collections.EMPTY_LIST);
/* 75 */            if (Modifier.isAbstract(cls.getModifiers())) {
/* 77 */                iIlIi0lIii = null;
                    } else {
                        try {
/* 79 */                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
/* 83 */                    ll1I00l ll1i00l = o01l0i.I00000oIO;
                            try {
/* 86 */                        declaredConstructor.setAccessible(true);
/* 89 */                        string = null;
                            } catch (Exception e) {
/* 92 */                        String strI0000O = o01l0i.I0000O(declaredConstructor);
/* 96 */                        int length = strI0000O.length();
/* 100 */                       String message = e.getMessage();
/* 104 */                       String strI0000oI00 = o01l0i.I0000oI00(e);
/* 126 */                       StringBuilder sb = new StringBuilder(length + 145 + String.valueOf(message).length() + strI0000oI00.length());
/* 133 */                       IIl001iO0Io.I001lIiIIo1O(sb, "Failed making constructor '", strI0000O, "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ", message);
/* 136 */                       sb.append(strI0000oI00);
/* 139 */                       string = sb.toString();
                            }
/* 143 */                   if (string != null) {
/* 147 */                       iIlIi0lIii = new IIlIi0lIii(string, 3);
                            } else {
/* 155 */                       i1Il01 i1il01 = new i1Il01(10);
/* 158 */                       i1il01.I00iiI = declaredConstructor;
/* 160 */                       VarHandle.storeStoreFence();
/* 163 */                       iIlIi0lIii = i1il01;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
/* 164 */           if (iIlIi0lIii != null) {
/* 366 */               return iIlIi0lIii;
                    }
/* 172 */           boolean z2 = false;
/* 173 */           if (Collection.class.isAssignableFrom(cls)) {
/* 181 */               if (cls.isAssignableFrom(ArrayList.class)) {
/* 183 */                   lo11i0lo = O1oO0lOoI1.I00o0l1o1o0;
                        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
/* 195 */                   lo11i0lo = iOl0lOIi11.I00o0l1o1o0;
                        } else if (cls.isAssignableFrom(TreeSet.class)) {
/* 207 */                   lo11i0lo = iolOOiI.I00o101lO;
                        } else if (cls.isAssignableFrom(ArrayDeque.class)) {
/* 218 */                   lo11i0lo = Io1Oioii1111.I00ll1;
                        }
                    } else if (Map.class.isAssignableFrom(cls)) {
/* 235 */               if (cls.isAssignableFrom(lo0olliO11.class)) {
/* 239 */                   if (type instanceof ParameterizedType) {
/* 244 */                       Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
/* 249 */                       if (actualTypeArguments.length != 0 && iO1lo1I1iI.I00000oOI(actualTypeArguments[0]) == String.class) {
                                }
                            }
/* 262 */                   lo11i0lo = i1O10l1io1iO.I00o0iI0io1;
                        } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
/* 273 */                   lo11i0lo = i1i0olI.I00o0iI0io1;
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
/* 284 */                   lo11i0lo = iOloo0O0O.I00oI0i;
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
/* 295 */                   lo11i0lo = i1O01Ill.I00o101lO;
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
/* 306 */                   lo11i0lo = i1O01oOIoI0I.I00oooO;
                        }
                    }
/* 308 */           if (lo11i0lo != null) {
/* 310 */               return lo11i0lo;
                    }
/* 311 */           String strI00000oIO = I00000oIO(cls);
/* 315 */           if (strI00000oIO != null) {
/* 319 */               return new IIlIi0lIii(strI00000oIO, 3);
                    }
/* 323 */           if (!z) {
/* 325 */               String strValueOf = String.valueOf(cls);
/* 350 */               return new IIlIi0lIii(IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 90), "Unable to create instance of ", strValueOf, "; Register an InstanceCreator or a TypeAdapter for this type."), 3);
                    }
/* 358 */           Oi1ol0llI oi1ol0llI = new Oi1ol0llI(28, z2);
/* 361 */           oi1ol0llI.I00iiI = cls;
/* 363 */           VarHandle.storeStoreFence();
/* 366 */           return oi1ol0llI;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0000oI00(l1iioiool l1iioioolVar, int i) {
                    iIloio1i iiloio1i;
/* 3 */             if (i == -30) {
/* 31 */                iiloio1i = iIloio1i.TCF;
                    } else if (i == -20) {
/* 28 */                iiloio1i = iIloio1i.API;
                    } else if (i == -10) {
/* 25 */                iiloio1i = iIloio1i.MANIFEST;
                    } else if (i != 0) {
/* 22 */                iiloio1i = i != 30 ? iIloio1i.UNSET : iIloio1i.INITIALIZATION;
                    }
/* 37 */            ((EnumMap) this.I00iiI).put((EnumMap) l1iioioolVar, (l1iioiool) iiloio1i);
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 13 */            ((OloIlI0ll) ((i0OI1l1Oo) this.I00iiI).I00iOIl).I00000oIO.I00100l0();
                }

                public void I000O01llI0(l1iioiool l1iioioolVar, iIloio1i iiloio1i) {
/* 5 */             ((EnumMap) this.I00iiI).put((EnumMap) l1iioioolVar, (l1iioiool) iiloio1i);
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */             o1I0I0O o1i0i0o = (o1I0I0O) this.I00iiI;
/* 15 */            OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(o1i0i0o.I000II, null, null, new o1111I(o1i0i0o, iIiOOI, null, 0), 3);
/* 22 */            o10iioooOi0 o10iiooooi0 = new o10iioooOi0(2);
/* 25 */            o10iiooooi0.I00iiI = olIl0iI0000O;
/* 27 */            VarHandle.storeStoreFence();
/* 32 */            iIiOOI.I00000oIO(o10iiooooi0, o1i0i0o.I0001Ioi1lo);
/* 35 */            return "clearCaches";
                }

                @Override
                public Object get() {
/* 7 */             Context context = (Context) ((I0Oi111ii) this.I00iiI).I00iiI;
/* 9 */             Object obj = lIlIo1.I000OiO;
                    try {
/* 22 */                return OIiiIl0iO.I0000Il00O(context.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                    } catch (PackageManager.NameNotFoundException unused) {
/* 27 */                return I00iIi0i1o.I00iOIl;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 4:
/* 22 */                    StringBuilder sb = new StringBuilder("1");
/* 31 */                    for (l1iioiool l1iioioolVar : l1iioiool.values()) {
/* 43 */                        iIloio1i iiloio1i = (iIloio1i) ((EnumMap) this.I00iiI).get(l1iioioolVar);
/* 45 */                        if (iiloio1i == null) {
/* 47 */                            iiloio1i = iIloio1i.UNSET;
                                }
/* 51 */                        sb.append(iiloio1i.I00iOIl);
                            }
/* 57 */                    return sb.toString();
                        case 12:
/* 13 */                    return Collections.EMPTY_MAP.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
/* 20 */            return ((OoIOil1iIO) this.I00iiI).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("json"), new Io1Oioii1111(18));
                }

                @Override
                public o0O110 mo31zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 9 */                 o0I0i0loIlO o0i0i0loilo = ((o0I0i0loIlO[]) this.I00iiI)[i];
/* 15 */                if (o0i0i0loilo.zzc(cls)) {
/* 17 */                    return o0i0i0loilo.mo31zzb(cls);
                        }
                    }
/* 35 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 38 */            return null;
                }

                @Override
                public boolean zzc(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 16 */                if (((o0I0i0loIlO[]) this.I00iiI)[i].zzc(cls)) {
/* 18 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

/* 16 */        public i0O1lIi1O0IO(boolean z) {
/* 17 */            this.I00iOIl = 4;
                }

/* 17 */        public i0O1lIi1O0IO(int i) {
/* 18 */            this.I00iOIl = i;
                }

                @Override
/* 24 */        public void zza(Throwable th) {
/* 25 */            ilIoii01i ilioii01i = (ilIoii01i) this.I00iiI;
                    synchronized (ilioii01i.I0001Ioi1lo) {
/* 28 */                ilioii01i.I000O01llI0 = null;
                    }
                }

                @Override
/* 39 */        public void zzb(Object obj) {
                }
            }
