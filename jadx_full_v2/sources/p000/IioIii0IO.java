            package p000;

            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.ProviderInfo;
            import android.database.Cursor;
            import android.database.MatrixCursor;
            import android.net.Uri;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
            import dalvik.system.DelegateLastClassLoader;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            
            public final class IioIii0IO {
                public static final Io1Oioii1111 I00000oOI;
                public static final i1O10l1io1iO I0000Il00O;
                public static final l1I0oI I0000O;
                public static final lOOlOoll I0000oI00;
                public static Boolean I0001Ioi1lo = null;
                public static String I000II = null;
                public static boolean I000O01llI0 = false;
                public static int I000OOo1O = -1;
                public static Boolean I000OiO;
                public static final ThreadLocal I000iOII = new ThreadLocal();
                public static final I0OiiiO I000l1 = new I0OiiiO(17);
                public static final o0iOli I000lI = new o0iOli(24);
                public static liiiIiO I000o00OoI0I;
                public static ll0oi0 I000oI1ioi;
                public Context I00000oIO;

                static {
/* 28 */            int i = 26;
/* 33 */            I00000oOI = new Io1Oioii1111(i);
/* 40 */            I0000Il00O = new i1O10l1io1iO(i);
/* 47 */            I0000O = new l1I0oI(i);
/* 54 */            I0000oI00 = new lOOlOoll(i);
                }

                public static int I00000oIO(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
                    try {
/* 18 */                ClassLoader classLoader = context.getApplicationContext().getClassLoader();
/* 34 */                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
/* 37 */                sb.append("com.google.android.gms.dynamite.descriptors.");
/* 40 */                sb.append(str);
/* 43 */                sb.append(".ModuleDescriptor");
/* 50 */                Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
/* 56 */                Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
/* 62 */                Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
/* 75 */                if (l1ioii1I10Io.I00000oIO(declaredField.get(null), str)) {
/* 132 */                   return declaredField2.getInt(null);
                        }
/* 81 */                String strValueOf = String.valueOf(declaredField.get(null));
/* 104 */               StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
/* 107 */               sb2.append("Module descriptor id '");
/* 110 */               sb2.append(strValueOf);
/* 113 */               sb2.append("' didn't match expected id '");
/* 116 */               sb2.append(str);
/* 119 */               sb2.append("'");
/* 126 */               Log.e("DynamiteModule", sb2.toString());
/* 13 */                return 0;
                    } catch (ClassNotFoundException unused) {
/* 167 */               StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
/* 172 */               sb3.append("Local module descriptor class for ");
/* 175 */               sb3.append(str);
/* 180 */               sb3.append(" not found.");
/* 187 */               Log.w("DynamiteModule", sb3.toString());
/* 13 */                return 0;
                    } catch (Exception e) {
/* 151 */               Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
/* 13 */                return 0;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x00cb A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:31:0x00fa, B:108:0x0286, B:109:0x028d, B:112:0x0290, B:113:0x0291, B:114:0x0298, B:131:0x0311, B:132:0x0331, B:115:0x0299, B:117:0x02c1, B:119:0x02d7, B:129:0x0309, B:130:0x0310, B:133:0x0332, B:134:0x0383), top: B:146:0x0042, inners: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IioIii0IO I0000Il00O(Context context, IioIOllO1 iioIOllO1, String str) throws IioI1I1llol1 {
                    IioIii0IO iioIii0IO;
                    int i;
                    Boolean bool;
                    IoOlilli0ol ioOlilli0olI00OI1;
                    ll0oi0 ll0oi0Var;
                    boolean z;
                    IoOlilli0ol ioOlilli0olI00OI12;
/* 25 */            Context applicationContext = context.getApplicationContext();
/* 29 */            if (applicationContext == null) {
/* 1638 */              throw new IioI1I1llol1("null application Context");
                    }
/* 31 */            ThreadLocal threadLocal = I000iOII;
/* 37 */            lOiII1IlOoi loiii1ilooi = (lOiII1IlOoi) threadLocal.get();
/* 41 */            lOiII1IlOoi loiii1ilooi2 = new lOiII1IlOoi();
/* 44 */            threadLocal.set(loiii1ilooi2);
/* 49 */            I0OiiiO i0OiiiO = I000l1;
/* 59 */            Long l = (Long) i0OiiiO.get();
/* 61 */            long jLongValue = l.longValue();
                    try {
/* 77 */                i0OiiiO.set(Long.valueOf(SystemClock.uptimeMillis()));
/* 82 */                IioIO1i iioIO1iI000OOo1O = iioIOllO1.I000OOo1O(context, str, I000lI);
/* 92 */                int i2 = iioIO1iI000OOo1O.I00000oOI;
/* 94 */                int i3 = iioIO1iI000OOo1O.I0000Il00O;
/* 145 */               StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i2).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i3).length());
/* 148 */               sb.append("Considering local module ");
/* 151 */               sb.append(str);
/* 154 */               sb.append(":");
/* 157 */               sb.append(i2);
/* 160 */               sb.append(" and remote module ");
/* 163 */               sb.append(str);
/* 166 */               sb.append(":");
/* 169 */               sb.append(i3);
/* 176 */               Log.i("DynamiteModule", sb.toString());
/* 179 */               int i4 = iioIO1iI000OOo1O.I0000O;
/* 181 */               if (i4 != 0) {
/* 184 */                   if (i4 != -1) {
/* 196 */                       if (i4 == 1 || iioIO1iI000OOo1O.I0000Il00O != 0) {
/* 202 */                           if (i4 != -1) {
/* 216 */                               Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
/* 221 */                               IioIii0IO iioIii0IO2 = new IioIii0IO();
/* 224 */                               iioIii0IO2.I00000oIO = applicationContext;
/* 228 */                               if (jLongValue == 0) {
/* 230 */                                   i0OiiiO.remove();
                                        } else {
/* 234 */                                   i0OiiiO.set(l);
                                        }
/* 237 */                               Cursor cursor = loiii1ilooi2.I00000oIO;
/* 239 */                               if (cursor != null) {
/* 241 */                                   cursor.close();
                                        }
/* 244 */                               threadLocal.set(loiii1ilooi);
/* 247 */                               return iioIii0IO2;
                                    }
/* 249 */                           if (i4 != 1) {
/* 800 */                               StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 36);
/* 805 */                               sb2.append("VersionPolicy returned invalid code:");
/* 808 */                               sb2.append(i4);
/* 818 */                               throw new IioI1I1llol1(sb2.toString());
                                    }
                                    try {
/* 251 */                               i = iioIO1iI000OOo1O.I0000Il00O;
                                    } catch (IioI1I1llol1 e) {
/* 668 */                               String message = e.getMessage();
/* 684 */                               StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 30);
/* 689 */                               sb3.append("Failed to load remote module: ");
/* 692 */                               sb3.append(message);
/* 699 */                               Log.w("DynamiteModule", sb3.toString());
/* 702 */                               int i5 = iioIO1iI000OOo1O.I00000oOI;
/* 704 */                               if (i5 != 0) {
/* 708 */                                   IIi0oIl iIi0oIl = new IIi0oIl();
/* 711 */                                   iIi0oIl.I00iOIl = i5;
/* 713 */                                   VarHandle.storeStoreFence();
/* 726 */                                   if (iioIOllO1.I000OOo1O(context, str, iIi0oIl).I0000O == -1) {
/* 740 */                                       Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
/* 745 */                                       iioIii0IO = new IioIii0IO();
/* 748 */                                       iioIii0IO.I00000oIO = applicationContext;
                                            }
                                        }
/* 785 */                               throw new IioI1I1llol1("Remote load failed. No local fallback found.", e);
                                    }
                                    try {
                                        synchronized (IioIii0IO.class) {
/* 260 */                                   if (!I0000oI00(context)) {
/* 644 */                                       throw new IioI1I1llol1("Remote loading disabled");
                                            }
/* 262 */                                   bool = I0001Ioi1lo;
                                        }
/* 265 */                               if (bool == null) {
/* 634 */                                   throw new IioI1I1llol1("Failed to determine which loading route to use.");
                                        }
/* 272 */                               if (bool.booleanValue()) {
/* 301 */                                   StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i).length());
/* 304 */                                   sb4.append("Selected remote version of ");
/* 307 */                                   sb4.append(str);
/* 310 */                                   sb4.append(", version >= ");
/* 313 */                                   sb4.append(i);
/* 320 */                                   Log.i("DynamiteModule", sb4.toString());
                                            synchronized (IioIii0IO.class) {
/* 324 */                                       ll0oi0Var = I000oI1ioi;
                                            }
/* 327 */                                   if (ll0oi0Var == null) {
/* 449 */                                       throw new IioI1I1llol1("DynamiteLoaderV2 was not cached.");
                                            }
/* 333 */                                   lOiII1IlOoi loiii1ilooi3 = (lOiII1IlOoi) threadLocal.get();
/* 335 */                                   if (loiii1ilooi3 == null || loiii1ilooi3.I00000oIO == null) {
/* 441 */                                       throw new IioI1I1llol1("No result cursor");
                                            }
/* 341 */                                   Context applicationContext2 = context.getApplicationContext();
/* 345 */                                   Cursor cursor2 = loiii1ilooi3.I00000oIO;
/* 348 */                                   OIOiOlIO01.I00O10llo(null);
                                            synchronized (IioIii0IO.class) {
/* 358 */                                       z = I000OOo1O >= 2;
                                            }
/* 360 */                                   if (z) {
/* 370 */                                       ioOlilli0olI00OI12 = ll0oi0Var.I00OIO1(OIOiOlIO01.I00O10llo(applicationContext2), str, i, OIOiOlIO01.I00O10llo(cursor2));
                                            } else {
/* 388 */                                       Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
/* 399 */                                       ioOlilli0olI00OI12 = ll0oi0Var.I00OI1(OIOiOlIO01.I00O10llo(applicationContext2), str, i, OIOiOlIO01.I00O10llo(cursor2));
                                            }
/* 407 */                                   Context context2 = (Context) OIOiOlIO01.I00O0o1oo(ioOlilli0olI00OI12);
/* 409 */                                   if (context2 == null) {
/* 430 */                                       throw new IioI1I1llol1("Failed to get module context");
                                            }
/* 413 */                                   iioIii0IO = new IioIii0IO();
/* 416 */                                   iioIii0IO.I00000oIO = context2;
/* 418 */                                   VarHandle.storeStoreFence();
                                        } else {
/* 480 */                                   StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i).length());
/* 483 */                                   sb5.append("Selected remote version of ");
/* 486 */                                   sb5.append(str);
/* 489 */                                   sb5.append(", version >= ");
/* 492 */                                   sb5.append(i);
/* 499 */                                   Log.i("DynamiteModule", sb5.toString());
/* 502 */                                   liiiIiO liiiiioI000O01llI0 = I000O01llI0(context);
/* 506 */                                   if (liiiiioI000O01llI0 == null) {
/* 626 */                                       throw new IioI1I1llol1("Failed to create IDynamiteLoader.");
                                            }
/* 513 */                                   Parcel parcelI00IoO0 = liiiiioI000O01llI0.I00IoO0(6, liiiiioI000O01llI0.I00Iooi00oi());
/* 517 */                                   int i6 = parcelI00IoO0.readInt();
/* 521 */                                   parcelI00IoO0.recycle();
/* 525 */                                   if (i6 >= 3) {
/* 531 */                                       lOiII1IlOoi loiii1ilooi4 = (lOiII1IlOoi) threadLocal.get();
/* 533 */                                       if (loiii1ilooi4 == null) {
/* 557 */                                           throw new IioI1I1llol1("No cached result cursor holder");
                                                }
/* 545 */                                       ioOlilli0olI00OI1 = liiiiioI000O01llI0.I00OIo(OIOiOlIO01.I00O10llo(context), str, i, OIOiOlIO01.I00O10llo(loiii1ilooi4.I00000oIO));
                                            } else if (i6 == 2) {
/* 564 */                                       Log.w("DynamiteModule", "IDynamite loader version = 2");
/* 571 */                                       ioOlilli0olI00OI1 = liiiiioI000O01llI0.I00OIO1(OIOiOlIO01.I00O10llo(context), str, i);
                                            } else {
/* 580 */                                       Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
/* 587 */                                       ioOlilli0olI00OI1 = liiiiioI000O01llI0.I00OI1(OIOiOlIO01.I00O10llo(context), str, i);
                                            }
/* 591 */                                   Object objI00O0o1oo = OIOiOlIO01.I00O0o1oo(ioOlilli0olI00OI1);
/* 595 */                                   if (objI00O0o1oo == null) {
/* 618 */                                       throw new IioI1I1llol1("Failed to load remote module.");
                                            }
/* 601 */                                   iioIii0IO = new IioIii0IO();
/* 604 */                                   iioIii0IO.I00000oIO = (Context) objI00O0o1oo;
/* 606 */                                   VarHandle.storeStoreFence();
                                        }
/* 777 */                               return iioIii0IO;
                                    } catch (IioI1I1llol1 e2) {
/* 657 */                               throw e2;
                                    } catch (RemoteException e3) {
/* 665 */                               throw new IioI1I1llol1("Failed to load remote module.", e3);
                                    } catch (Throwable th) {
/* 654 */                               throw new IioI1I1llol1("Failed to load remote module.", th);
                                    }
                                }
                            } else if (iioIO1iI000OOo1O.I00000oOI != 0) {
/* 190 */                       i4 = -1;
/* 196 */                       if (i4 == 1) {
                                }
/* 202 */                       if (i4 != -1) {
                                }
                            }
                        }
/* 821 */               int i7 = iioIO1iI000OOo1O.I00000oOI;
/* 823 */               int i8 = iioIO1iI000OOo1O.I0000Il00O;
/* 861 */               StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
/* 866 */               sb6.append("No acceptable module ");
/* 869 */               sb6.append(str);
/* 874 */               sb6.append(" found. Local version is ");
/* 877 */               sb6.append(i7);
/* 882 */               sb6.append(" and remote version is ");
/* 885 */               sb6.append(i8);
/* 890 */               sb6.append(".");
/* 900 */               throw new IioI1I1llol1(sb6.toString());
                    } finally {
/* 903 */               if (jLongValue == 0) {
/* 907 */                   I000l1.remove();
                        } else {
/* 913 */                   I000l1.set(l);
                        }
/* 916 */               Cursor cursor3 = loiii1ilooi2.I00000oIO;
/* 918 */               if (cursor3 != null) {
/* 920 */                   cursor3.close();
                        }
/* 925 */               I000iOII.set(loiii1ilooi);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[Catch: all -> 0x003b, TryCatch #7 {, blocks: (B:10:0x002b, B:12:0x0037, B:49:0x00a5, B:17:0x0040, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:40:0x0084, B:41:0x008c, B:39:0x0076, B:44:0x008f, B:47:0x0092, B:48:0x009c, B:18:0x0043), top: B:143:0x002b, inners: #5 }] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0174  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0177 A[Catch: all -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00d8, blocks: (B:4:0x0006, B:57:0x00cd, B:59:0x00d3, B:67:0x0101, B:97:0x0177, B:105:0x018c, B:123:0x0214, B:124:0x0217, B:118:0x020b, B:65:0x00de, B:126:0x0219, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:55:0x00ca, B:22:0x004d, B:42:0x008d, B:45:0x0090, B:52:0x00a8, B:56:0x00cc, B:54:0x00aa), top: B:138:0x0006, inners: #10, #11 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static int I0000O(Context context, String str, boolean z) {
                    Field declaredField;
                    Throwable th;
                    RemoteException remoteException;
                    int i;
                    Cursor cursor;
                    try {
                        synchronized (IioIii0IO.class) {
/* 8 */                     Boolean bool = I0001Ioi1lo;
/* 10 */                    boolean z2 = true;
/* 11 */                    Cursor cursor2 = null;
/* 13 */                    if (bool == null) {
                                try {
/* 35 */                            declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
/* 173 */                           String string = e.toString();
/* 185 */                           StringBuilder sb = new StringBuilder(string.length() + 30);
/* 188 */                           sb.append("Failed to load module via V2: ");
/* 191 */                           sb.append(string);
/* 198 */                           Log.w("DynamiteModule", sb.toString());
/* 201 */                           bool = Boolean.FALSE;
                                }
                                synchronized (declaredField.getDeclaringClass()) {
/* 48 */                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
/* 54 */                            if (classLoader == ClassLoader.getSystemClassLoader()) {
/* 56 */                                bool = Boolean.FALSE;
                                    } else if (classLoader != null) {
                                        try {
/* 65 */                                    I000II(classLoader);
                                        } catch (IioI1I1llol1 unused) {
                                        }
/* 68 */                                bool = Boolean.TRUE;
                                    } else {
/* 75 */                                if (!I0000oI00(context)) {
/* 12 */                                    return 0;
                                        }
/* 86 */                                if (!I000O01llI0) {
/* 88 */                                    Boolean bool2 = Boolean.TRUE;
/* 94 */                                    if (bool2.equals(null)) {
/* 161 */                                       declaredField.set(null, ClassLoader.getSystemClassLoader());
/* 164 */                                       bool = Boolean.FALSE;
                                            } else {
                                                try {
/* 97 */                                            int iI0001Ioi1lo = I0001Ioi1lo(context, str, z, true);
/* 101 */                                           String str2 = I000II;
/* 103 */                                           if (str2 != null && !str2.isEmpty()) {
/* 112 */                                               ClassLoader classLoaderI0000Il00O = iOoO10.I0000Il00O();
/* 116 */                                               if (classLoaderI0000Il00O == null) {
/* 121 */                                                   String str3 = I000II;
/* 123 */                                                   lII0I0I000I.I000II(str3);
/* 130 */                                                   classLoaderI0000Il00O = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                        }
/* 133 */                                               I000II(classLoaderI0000Il00O);
/* 136 */                                               declaredField.set(null, classLoaderI0000Il00O);
/* 139 */                                               I0001Ioi1lo = bool2;
/* 143 */                                               return iI0001Ioi1lo;
                                                    }
/* 146 */                                           return iI0001Ioi1lo;
                                                } catch (IioI1I1llol1 unused2) {
/* 151 */                                           declaredField.set(null, ClassLoader.getSystemClassLoader());
/* 154 */                                           bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    }
/* 203 */                           I0001Ioi1lo = bool;
                                }
                            }
/* 210 */                   if (bool.booleanValue()) {
                                try {
/* 212 */                           return I0001Ioi1lo(context, str, z, false);
                                } catch (IioI1I1llol1 e2) {
/* 225 */                           String message = e2.getMessage();
/* 241 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
/* 244 */                           sb2.append("Failed to retrieve remote module version: ");
/* 247 */                           sb2.append(message);
/* 254 */                           Log.w("DynamiteModule", sb2.toString());
/* 12 */                            return 0;
                                }
                            }
/* 260 */                   liiiIiO liiiiioI000O01llI0 = I000O01llI0(context);
                            try {
/* 264 */                       if (liiiiioI000O01llI0 == null) {
/* 12 */                            return 0;
                                }
                                try {
/* 273 */                           Parcel parcelI00IoO0 = liiiiioI000O01llI0.I00IoO0(6, liiiiioI000O01llI0.I00Iooi00oi());
/* 277 */                           int i2 = parcelI00IoO0.readInt();
/* 281 */                           parcelI00IoO0.recycle();
/* 285 */                           if (i2 >= 3) {
/* 287 */                               ThreadLocal threadLocal = I000iOII;
/* 293 */                               lOiII1IlOoi loiii1ilooi = (lOiII1IlOoi) threadLocal.get();
/* 295 */                               if (loiii1ilooi != null && (cursor = loiii1ilooi.I00000oIO) != null) {
/* 301 */                                   return cursor.getInt(0);
                                        }
/* 337 */                               Cursor cursor3 = (Cursor) OIOiOlIO01.I00O0o1oo(liiiiioI000O01llI0.I00OIl(OIOiOlIO01.I00O10llo(context), str, z, ((Long) I000l1.get()).longValue()));
/* 339 */                               if (cursor3 != null) {
                                            try {
/* 345 */                                       if (cursor3.moveToFirst()) {
/* 348 */                                           i = cursor3.getInt(0);
/* 352 */                                           if (i <= 0) {
/* 373 */                                               cursor2 = cursor3;
/* 374 */                                               if (cursor2 != null) {
/* 376 */                                                   cursor2.close();
                                                        }
                                                    } else {
/* 358 */                                               lOiII1IlOoi loiii1ilooi2 = (lOiII1IlOoi) threadLocal.get();
/* 360 */                                               if (loiii1ilooi2 == null || loiii1ilooi2.I00000oIO != null) {
/* 369 */                                                   z2 = false;
                                                        } else {
/* 366 */                                                   loiii1ilooi2.I00000oIO = cursor3;
                                                        }
/* 370 */                                               if (!z2) {
                                                        }
/* 374 */                                               if (cursor2 != null) {
                                                        }
                                                    }
                                                }
                                            } catch (RemoteException e3) {
/* 386 */                                       remoteException = e3;
/* 405 */                                       cursor2 = cursor3;
/* 490 */                                       String message2 = remoteException.getMessage();
/* 506 */                                       StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
/* 509 */                                       sb3.append("Failed to retrieve remote module version: ");
/* 512 */                                       sb3.append(message2);
/* 519 */                                       Log.w("DynamiteModule", sb3.toString());
/* 522 */                                       if (cursor2 == null) {
/* 12 */                                            return 0;
                                                }
/* 524 */                                       cursor2.close();
/* 12 */                                        return 0;
                                            } catch (Throwable th2) {
/* 383 */                                       th = th2;
/* 402 */                                       cursor2 = cursor3;
/* 531 */                                       if (cursor2 == null) {
/* 536 */                                           throw th;
                                                }
/* 533 */                                       cursor2.close();
/* 536 */                                       throw th;
                                            }
                                        }
/* 392 */                               Log.w("DynamiteModule", "Failed to retrieve remote module version.");
/* 395 */                               if (cursor3 == null) {
/* 12 */                                    return 0;
                                        }
/* 397 */                               cursor3.close();
/* 12 */                                return 0;
                                    }
/* 410 */                           if (i2 == 2) {
/* 416 */                               Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
/* 419 */                               OIOiOlIO01 oIOiOlIO01I00O10llo = OIOiOlIO01.I00O10llo(context);
/* 423 */                               Parcel parcelI00Iooi00oi = liiiiioI000O01llI0.I00Iooi00oi();
/* 427 */                               iil1OIloI1i.I00000oOI(parcelI00Iooi00oi, oIOiOlIO01I00O10llo);
/* 430 */                               parcelI00Iooi00oi.writeString(str);
/* 433 */                               parcelI00Iooi00oi.writeInt(z ? 1 : 0);
/* 437 */                               Parcel parcelI00IoO02 = liiiiioI000O01llI0.I00IoO0(5, parcelI00Iooi00oi);
/* 441 */                               i = parcelI00IoO02.readInt();
/* 445 */                               parcelI00IoO02.recycle();
                                    } else {
/* 453 */                               Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
/* 456 */                               OIOiOlIO01 oIOiOlIO01I00O10llo2 = OIOiOlIO01.I00O10llo(context);
/* 460 */                               Parcel parcelI00Iooi00oi2 = liiiiioI000O01llI0.I00Iooi00oi();
/* 464 */                               iil1OIloI1i.I00000oOI(parcelI00Iooi00oi2, oIOiOlIO01I00O10llo2);
/* 467 */                               parcelI00Iooi00oi2.writeString(str);
/* 470 */                               parcelI00Iooi00oi2.writeInt(z ? 1 : 0);
/* 473 */                               Parcel parcelI00IoO03 = liiiiioI000O01llI0.I00IoO0(3, parcelI00Iooi00oi2);
/* 477 */                               i = parcelI00IoO03.readInt();
/* 481 */                               parcelI00IoO03.recycle();
                                    }
/* 379 */                           return i;
                                } catch (RemoteException e4) {
/* 487 */                           remoteException = e4;
                                }
                            } catch (Throwable th3) {
/* 485 */                       th = th3;
                            }
                        }
                    } finally {
                    }
                }

                public static boolean I0000oI00(Context context) {
                    ApplicationInfo applicationInfo;
/* 1 */             Boolean bool = Boolean.TRUE;
/* 9 */             if (bool.equals(null) || bool.equals(I000OiO)) {
/* 8 */                 return true;
                    }
/* 25 */            boolean z = false;
/* 26 */            if (I000OiO == null) {
/* 36 */                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
/* 49 */                if (Io0iI1l01il.I00000oOI.I00000oOI(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
/* 63 */                    z = true;
                        }
/* 68 */                I000OiO = Boolean.valueOf(z);
/* 70 */                if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
/* 84 */                    Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
/* 87 */                    I000O01llI0 = true;
                        }
                    }
/* 89 */            if (!z) {
/* 93 */                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
                    }
/* 168 */           return z;
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r3
                  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static int I0001Ioi1lo(Context context, String str, boolean z, boolean z2) throws Throwable {
                    Exception exc;
                    Throwable th;
                    Cursor cursorQuery;
                    MatrixCursor matrixCursor;
                    boolean z3;
                    try {
                        try {
/* 20 */                    boolean z4 = true;
/* 61 */                    Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) I000l1.get()).longValue())).build();
/* 69 */                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
/* 74 */                    boolean z5 = false;
/* 75 */                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                try {
/* 84 */                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                                } catch (RemoteException unused) {
                                } catch (Throwable th2) {
/* 226 */                           contentProviderClientAcquireUnstableContentProviderClient.release();
/* 229 */                           throw th2;
                                }
/* 88 */                        if (cursorQuery != null) {
                                    try {
/* 94 */                                int count = cursorQuery.getCount();
/* 98 */                                int columnCount = cursorQuery.getColumnCount();
/* 108 */                               matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
/* 112 */                               for (int i = 0; i < count; i++) {
/* 118 */                                   if (!cursorQuery.moveToPosition(i)) {
/* 206 */                                       throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                            }
/* 120 */                                   Object[] objArr = new Object[columnCount];
/* 123 */                                   for (int i2 = 0; i2 < columnCount; i2++) {
/* 125 */                                       int type = cursorQuery.getType(i2);
/* 129 */                                       if (type == 0) {
/* 188 */                                           objArr[i2] = null;
                                                } else if (type == 1) {
/* 185 */                                           objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                                } else if (type == 2) {
/* 174 */                                           objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                                } else if (type == 3) {
/* 163 */                                           objArr[i2] = cursorQuery.getString(i2);
                                                } else {
/* 139 */                                           if (type != 4) {
/* 158 */                                               throw new RemoteException("Unknown column type");
                                                    }
/* 145 */                                           objArr[i2] = cursorQuery.getBlob(i2);
                                                }
                                            }
/* 193 */                                   matrixCursor.addRow(objArr);
                                        }
/* 207 */                               cursorQuery.close();
/* 210 */                               contentProviderClientAcquireUnstableContentProviderClient.release();
/* 230 */                               if (matrixCursor != null) {
                                            try {
/* 236 */                                       if (matrixCursor.moveToFirst()) {
/* 238 */                                           int i3 = matrixCursor.getInt(0);
/* 242 */                                           if (i3 > 0) {
                                                        synchronized (IioIii0IO.class) {
                                                            try {
/* 251 */                                                       I000II = matrixCursor.getString(2);
/* 255 */                                                       int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
/* 259 */                                                       if (columnIndex >= 0) {
/* 265 */                                                           I000OOo1O = matrixCursor.getInt(columnIndex);
                                                                }
/* 273 */                                                       int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
/* 277 */                                                       if (columnIndex2 >= 0) {
/* 287 */                                                           z3 = matrixCursor.getInt(columnIndex2) != 0;
/* 288 */                                                           I000O01llI0 = z3;
                                                                } else {
/* 291 */                                                           z3 = false;
                                                                }
                                                            } finally {
                                                            }
                                                        }
/* 299 */                                               lOiII1IlOoi loiii1ilooi = (lOiII1IlOoi) I000iOII.get();
/* 301 */                                               if (loiii1ilooi == null || loiii1ilooi.I00000oIO != null) {
/* 310 */                                                   z4 = false;
                                                        } else {
/* 307 */                                                   loiii1ilooi.I00000oIO = matrixCursor;
                                                        }
/* 311 */                                               z5 = z3;
/* 312 */                                               matrixCursor = z4 ? null : matrixCursor;
                                                    }
/* 325 */                                           if (z2 && z5) {
/* 337 */                                               throw new IioI1I1llol1("forcing fallback to container DynamiteLoader impl");
                                                    }
/* 344 */                                           if (matrixCursor != null) {
/* 346 */                                               matrixCursor.close();
                                                    }
/* 349 */                                           return i3;
                                                }
                                            } catch (Exception e) {
/* 323 */                                       exc = e;
/* 370 */                                       if (exc instanceof IioI1I1llol1) {
/* 407 */                                           throw exc;
                                                }
/* 374 */                                       String message = exc.getMessage();
/* 390 */                                       StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
/* 393 */                                       sb.append("V2 version check failed: ");
/* 396 */                                       sb.append(message);
/* 406 */                                       throw new IioI1I1llol1(sb.toString(), exc);
                                            } catch (Throwable th3) {
/* 320 */                                       th = th3;
/* 365 */                                       matrixCursor = matrixCursor;
/* 408 */                                       if (matrixCursor == null) {
/* 1182 */                                          throw th;
                                                }
/* 410 */                                       matrixCursor.close();
/* 1182 */                                      throw th;
                                            }
                                        }
/* 354 */                               Log.w("DynamiteModule", "Failed to retrieve remote module version.");
/* 364 */                               throw new IioI1I1llol1("Failed to connect to dynamite module ContentResolver.");
                                    } catch (Throwable th4) {
                                        try {
/* 217 */                                   cursorQuery.close();
/* 225 */                                   throw th4;
                                        } catch (Throwable th5) {
/* 222 */                                   th4.addSuppressed(th5);
/* 225 */                                   throw th4;
                                        }
                                    }
                                }
/* 90 */                        contentProviderClientAcquireUnstableContentProviderClient.release();
                            }
/* 77 */                    matrixCursor = null;
/* 230 */                   if (matrixCursor != null) {
                            }
/* 354 */                   Log.w("DynamiteModule", "Failed to retrieve remote module version.");
/* 364 */                   throw new IioI1I1llol1("Failed to connect to dynamite module ContentResolver.");
                        } catch (Throwable th6) {
/* 339 */                   th = th6;
                        }
                    } catch (Exception e2) {
/* 342 */               exc = e2;
                    }
                }

                public static void I000II(ClassLoader classLoader) throws IioI1I1llol1 {
                    try {
/* 9 */                 ll0oi0 ll0oi0Var = null;
/* 18 */                IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
/* 20 */                if (iBinder != null) {
/* 23 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
/* 38 */                    ll0oi0Var = iInterfaceQueryLocalInterface instanceof ll0oi0 ? (ll0oi0) iInterfaceQueryLocalInterface : new ll0oi0(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 10);
                        }
/* 41 */                I000oI1ioi = ll0oi0Var;
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
/* 77 */                throw new IioI1I1llol1("Failed to instantiate dynamite loader", e);
                    }
                }

                public static liiiIiO I000O01llI0(Context context) {
                    liiiIiO liiiiio;
                    synchronized (IioIii0IO.class) {
/* 6 */                 liiiIiO liiiiio2 = I000o00OoI0I;
/* 8 */                 if (liiiiio2 != null) {
/* 11 */                    return liiiiio2;
                        }
                        try {
/* 36 */                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
/* 38 */                    if (iBinder == null) {
/* 40 */                        liiiiio = null;
                            } else {
/* 44 */                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
/* 63 */                        liiiiio = iInterfaceQueryLocalInterface instanceof liiiIiO ? (liiiIiO) iInterfaceQueryLocalInterface : new liiiIiO(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 10);
                            }
/* 66 */                    if (liiiiio != null) {
/* 68 */                        I000o00OoI0I = liiiiio;
/* 71 */                        return liiiiio;
                            }
                        } catch (Exception e) {
/* 74 */                    String message = e.getMessage();
/* 90 */                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
/* 93 */                    sb.append("Failed to load IDynamiteLoader from GmsCore: ");
/* 96 */                    sb.append(message);
/* 103 */                   Log.e("DynamiteModule", sb.toString());
                        }
/* 14 */                return null;
                    }
                }

                public final IBinder I00000oOI(String str) throws IioI1I1llol1 {
                    try {
/* 15 */                return (IBinder) this.I00000oIO.getClassLoader().loadClass(str).newInstance();
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
/* 77 */                throw new IioI1I1llol1("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
                    }
                }
            }
