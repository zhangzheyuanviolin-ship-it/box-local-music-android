            package p000;

            import android.content.ContentProviderClient;
            import android.content.ContentUris;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.content.pm.Signature;
            import android.content.res.Resources;
            import android.database.Cursor;
            import android.graphics.Typeface;
            import android.net.Uri;
            import android.os.RemoteException;
            import android.os.Trace;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class IliiO10OiIOl {
                public static final O1Il00 I00000oIO = new O1Il00(2);
                public static final I0oloIO0 I00000oOI = new I0oloIO0(1);

                public static IlilOiIoo I00000oIO(Context context, List list) {
/* 3 */             lOo0I0iOi11O.I00000oIO("FontProvider.getFontFamilyResult");
                    try {
/* 8 */                 ArrayList arrayList = new ArrayList();
/* 17 */                for (int i = 0; i < list.size(); i++) {
/* 23 */                    IliiOI0I0 iliiOI0I0 = (IliiOI0I0) list.get(i);
/* 25 */                    String str = iliiOI0I0.I0000oI00;
/* 27 */                    Typeface typefaceI0000oI00 = OoOl10O1o.I0000oI00(str);
/* 31 */                    if (typefaceI0000oI00 == null || OoOl10O1o.I0001Ioi1lo(typefaceI0000oI00) == null) {
/* 95 */                        ProviderInfo providerInfoI00000oOI = I00000oOI(context.getPackageManager(), iliiOI0I0, context.getResources());
/* 99 */                        if (providerInfoI00000oOI == null) {
/* 103 */                           IlilOiIoo ililOiIoo = new IlilOiIoo();
/* 107 */                           ililOiIoo.I00000oIO = 1;
/* 114 */                           ililOiIoo.I00000oOI = Collections.singletonList(null);
/* 116 */                           VarHandle.storeStoreFence();
/* 122 */                           return ililOiIoo;
                                }
/* 129 */                       arrayList.add(I0000Il00O(context, iliiOI0I0, providerInfoI00000oOI.authority));
                            } else {
/* 41 */                        String str2 = iliiOI0I0.I0001Ioi1lo;
/* 43 */                        Ilili1O1io ilili1O1io = new Ilili1O1io();
/* 65 */                        ilili1O1io.I00000oIO = new Uri.Builder().scheme("systemfont").authority(str).build();
/* 67 */                        ilili1O1io.I00000oOI = 0;
/* 71 */                        ilili1O1io.I0000Il00O = 400;
/* 73 */                        ilili1O1io.I0000O = false;
/* 75 */                        ilili1O1io.I0000oI00 = str2;
/* 77 */                        ilili1O1io.I0001Ioi1lo = 0;
/* 83 */                        arrayList.add(new Ilili1O1io[]{ilili1O1io});
                            }
                        }
/* 137 */               IlilOiIoo ililOiIoo2 = new IlilOiIoo();
/* 140 */               ililOiIoo2.I00000oIO = 0;
/* 142 */               ililOiIoo2.I00000oOI = arrayList;
/* 144 */               VarHandle.storeStoreFence();
/* 150 */               return ililOiIoo2;
                    } finally {
/* 152 */               Trace.endSection();
                    }
                }

                public static ProviderInfo I00000oOI(PackageManager packageManager, IliiOI0I0 iliiOI0I0, Resources resources) {
/* 1 */             I0oloIO0 i0oloIO0 = I00000oOI;
/* 3 */             O1Il00 o1Il00 = I00000oIO;
/* 11 */            lOo0I0iOi11O.I00000oIO("FontProvider.getProvider");
                    try {
/* 14 */                List listI00000oOI = iliiOI0I0.I0000O;
/* 16 */                String str = iliiOI0I0.I00000oIO;
/* 18 */                String str2 = iliiOI0I0.I00000oOI;
/* 21 */                if (listI00000oOI == null) {
/* 24 */                    listI00000oOI = iliiOo1000lO.I00000oOI(resources, 0);
                        }
/* 30 */                IliiIOOi iliiIOOi = new IliiIOOi();
/* 33 */                iliiIOOi.I00000oIO = str;
/* 35 */                iliiIOOi.I00000oOI = str2;
/* 37 */                iliiIOOi.I0000Il00O = listI00000oOI;
/* 43 */                ProviderInfo providerInfo = (ProviderInfo) o1Il00.I0000Il00O(iliiIOOi);
/* 45 */                if (providerInfo != null) {
/* 50 */                    return providerInfo;
                        }
/* 51 */                ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
/* 55 */                if (providerInfoResolveContentProvider == null) {
/* 217 */                   throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
                        }
/* 63 */                if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
/* 199 */                   throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
                        }
/* 73 */                Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
/* 77 */                ArrayList arrayList = new ArrayList();
/* 82 */                for (Signature signature : signatureArr) {
/* 90 */                    arrayList.add(signature.toByteArray());
                        }
/* 96 */                Collections.sort(arrayList, i0oloIO0);
/* 104 */               for (int i = 0; i < listI00000oOI.size(); i++) {
/* 114 */                   ArrayList arrayList2 = new ArrayList((Collection) listI00000oOI.get(i));
/* 117 */                   Collections.sort(arrayList2, i0oloIO0);
/* 128 */                   if (arrayList.size() == arrayList2.size()) {
/* 136 */                       for (int i2 = 0; i2 < arrayList.size(); i2++) {
/* 154 */                           if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                        break;
                                    }
                                }
/* 162 */                       o1Il00.I0000O(iliiIOOi, providerInfoResolveContentProvider);
/* 168 */                       return providerInfoResolveContentProvider;
                            }
                        }
/* 169 */               Trace.endSection();
/* 172 */               return null;
                    } finally {
/* 219 */               Trace.endSection();
                    }
                }

                public static Ilili1O1io[] I0000Il00O(Context context, IliiOI0I0 iliiOI0I0, String str) {
                    int i;
                    Uri uriWithAppendedId;
                    Uri uri;
                    boolean z;
/* 5 */             String str2 = iliiOI0I0.I0001Ioi1lo;
/* 11 */            lOo0I0iOi11O.I00000oIO("FontProvider.query");
                    try {
/* 16 */                ArrayList arrayList = new ArrayList();
/* 32 */                Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
/* 55 */                Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
/* 63 */                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
/* 67 */                Cursor cursorQuery = null;
                        try {
/* 82 */                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
/* 88 */                    lOo0I0iOi11O.I00000oIO("ContentQueryWrapper.query");
                            try {
/* 93 */                        String str3 = iliiOI0I0.I0000Il00O;
/* 111 */                       String[] strArr2 = (str2 == null || str2.isBlank()) ? new String[]{str3} : new String[]{str3, "VF"};
/* 116 */                       if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    try {
/* 121 */                               cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                                    } catch (RemoteException e) {
/* 131 */                               Log.w("FontsProvider", "Unable to query the content provider", e);
                                    }
                                }
/* 134 */                       Trace.endSection();
/* 137 */                       if (cursorQuery != null && cursorQuery.getCount() > 0) {
/* 147 */                           int columnIndex = cursorQuery.getColumnIndex("result_code");
/* 153 */                           ArrayList arrayList2 = new ArrayList();
/* 158 */                           int columnIndex2 = cursorQuery.getColumnIndex("_id");
/* 164 */                           int columnIndex3 = cursorQuery.getColumnIndex("file_id");
/* 170 */                           int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
/* 176 */                           int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
/* 182 */                           int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
/* 190 */                           while (cursorQuery.moveToNext()) {
/* 203 */                               int i2 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
/* 211 */                               int i3 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
/* 212 */                               if (columnIndex3 == -1) {
/* 214 */                                   i = i2;
/* 220 */                                   uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                        } else {
/* 226 */                                   i = i2;
/* 232 */                                   uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                        }
/* 246 */                               int i4 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400;
/* 249 */                               if (columnIndex6 != -1) {
/* 255 */                                   uri = uriBuild2;
/* 257 */                                   z = true;
/* 258 */                                   if (cursorQuery.getInt(columnIndex6) == 1) {
                                            }
/* 266 */                                   Ilili1O1io ilili1O1io = new Ilili1O1io();
/* 269 */                                   uriWithAppendedId.getClass();
/* 272 */                                   ilili1O1io.I00000oIO = uriWithAppendedId;
/* 274 */                                   ilili1O1io.I00000oOI = i3;
/* 276 */                                   ilili1O1io.I0000Il00O = i4;
/* 278 */                                   ilili1O1io.I0000O = z;
/* 280 */                                   ilili1O1io.I0000oI00 = str2;
/* 284 */                                   ilili1O1io.I0001Ioi1lo = i;
/* 286 */                                   VarHandle.storeStoreFence();
/* 289 */                                   arrayList2.add(ilili1O1io);
/* 292 */                                   uriBuild2 = uri;
                                        } else {
/* 261 */                                   uri = uriBuild2;
                                        }
/* 263 */                               z = false;
/* 266 */                               Ilili1O1io ilili1O1io2 = new Ilili1O1io();
/* 269 */                               uriWithAppendedId.getClass();
/* 272 */                               ilili1O1io2.I00000oIO = uriWithAppendedId;
/* 274 */                               ilili1O1io2.I00000oOI = i3;
/* 276 */                               ilili1O1io2.I0000Il00O = i4;
/* 278 */                               ilili1O1io2.I0000O = z;
/* 280 */                               ilili1O1io2.I0000oI00 = str2;
/* 284 */                               ilili1O1io2.I0001Ioi1lo = i;
/* 286 */                               VarHandle.storeStoreFence();
/* 289 */                               arrayList2.add(ilili1O1io2);
/* 292 */                               uriBuild2 = uri;
                                    }
/* 295 */                           arrayList = arrayList2;
                                }
/* 296 */                       if (cursorQuery != null) {
/* 298 */                           cursorQuery.close();
                                }
/* 301 */                       if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 303 */                           contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
/* 313 */                       return (Ilili1O1io[]) arrayList.toArray(new Ilili1O1io[0]);
                            } finally {
                            }
                        } catch (Throwable th) {
/* 324 */                   if (cursorQuery != null) {
/* 326 */                       cursorQuery.close();
                            }
/* 329 */                   if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 331 */                       contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
/* 334 */                   throw th;
                        }
                    } finally {
                    }
                }
            }
