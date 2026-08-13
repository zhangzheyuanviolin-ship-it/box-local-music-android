            package androidx.core.content;

            import android.content.ContentProvider;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.content.res.XmlResourceParser;
            import android.database.Cursor;
            import android.database.MatrixCursor;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Environment;
            import android.os.ParcelFileDescriptor;
            import android.text.TextUtils;
            import android.webkit.MimeTypeMap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Map;
            import org.xmlpull.v1.XmlPullParserException;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IioIoO10iOiI;
            import p000.IlIi000IOo;
            
/* 12 */    public class FileProvider extends ContentProvider {
                public static final String[] I00ilI0I1 = {"_display_name", "_size"};
                public static final File I00ilO0 = new File("/");
                public static final HashMap I00io1l = new HashMap();
                public final Object I00iOIl;
                public final int I00iiI;
                public String I00iiO;
                public IlIi000IOo I00iio;

                public FileProvider(int i) {
/* 9 */             this.I00iOIl = new Object();
/* 11 */            this.I00iiI = i;
                }

                public static IlIi000IOo I00000oOI(int i, Context context, String str) {
                    IlIi000IOo ilIi000IOoI0000O;
/* 1 */             HashMap map = I00io1l;
                    synchronized (map) {
                        try {
/* 8 */                     ilIi000IOoI0000O = (IlIi000IOo) map.get(str);
/* 10 */                    if (ilIi000IOoI0000O == null) {
                                try {
                                    try {
/* 12 */                                ilIi000IOoI0000O = I0000O(i, context, str);
/* 16 */                                map.put(str, ilIi000IOoI0000O);
                                    } catch (IOException e) {
/* 39 */                                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                                    }
                                } catch (XmlPullParserException e2) {
/* 30 */                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                                }
                            }
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
/* 41 */            return ilIi000IOoI0000O;
                }

                public static Uri I0000Il00O(Context context, String str, File file) throws IOException {
/* 2 */             IlIi000IOo ilIi000IOoI00000oOI = I00000oOI(0, context, str);
                    try {
/* 7 */                 String canonicalPath = file.getCanonicalPath();
/* 21 */                Map.Entry entry = null;
/* 28 */                for (Map.Entry entry2 : ilIi000IOoI00000oOI.I00000oOI.entrySet()) {
/* 42 */                    String path = ((File) entry2.getValue()).getPath();
/* 62 */                    if (I0000oI00(canonicalPath).startsWith(I0000oI00(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
/* 86 */                        entry = entry2;
                            }
                        }
/* 88 */                if (entry == null) {
/* 191 */                   I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Failed to find configured root that contains ", canonicalPath));
/* 6 */                     return null;
                        }
/* 96 */                String path2 = ((File) entry.getValue()).getPath();
/* 180 */               return new Uri.Builder().scheme("content").authority(ilIi000IOoI00000oOI.I00000oIO).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
                    } catch (IOException unused) {
/* 197 */               IioIoO10iOiI.I000OiO("Failed to resolve canonical path for ", file);
/* 6 */                 return null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static IlIi000IOo I0000O(int i, Context context, String str) throws XmlPullParserException, IOException {
                    File externalStorageDirectory;
/* 3 */             IlIi000IOo ilIi000IOo = new IlIi000IOo();
/* 11 */            ilIi000IOo.I00000oOI = new HashMap();
/* 13 */            ilIi000IOo.I00000oIO = str;
/* 15 */            VarHandle.storeStoreFence();
/* 24 */            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, Barcode.FORMAT_ITF);
/* 29 */            if (providerInfoResolveContentProvider == null) {
/* 264 */               I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Couldn't find meta-data for provider with authority ", str));
/* 28 */                return null;
                    }
/* 36 */            if (providerInfoResolveContentProvider.metaData == null && i != 0) {
/* 42 */                Bundle bundle = new Bundle(1);
/* 45 */                providerInfoResolveContentProvider.metaData = bundle;
/* 47 */                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
                    }
/* 54 */            XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
/* 58 */            if (xmlResourceParserLoadXmlMetaData == null) {
/* 254 */               I000II.I000iOII("Missing android.support.FILE_PROVIDER_PATHS meta-data");
/* 28 */                return null;
                    }
                    while (true) {
/* 60 */                int next = xmlResourceParserLoadXmlMetaData.next();
/* 64 */                if (next == 1) {
/* 251 */                   return ilIi000IOo;
                        }
/* 67 */                if (next == 2) {
/* 69 */                    String name = xmlResourceParserLoadXmlMetaData.getName();
/* 75 */                    String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
/* 81 */                    String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
/* 92 */                    if ("root-path".equals(name)) {
/* 94 */                        externalStorageDirectory = I00ilO0;
                            } else if ("files-path".equals(name)) {
/* 105 */                       externalStorageDirectory = context.getFilesDir();
                            } else if ("cache-path".equals(name)) {
/* 118 */                       externalStorageDirectory = context.getCacheDir();
                            } else if ("external-path".equals(name)) {
/* 131 */                       externalStorageDirectory = Environment.getExternalStorageDirectory();
                            } else if ("external-files-path".equals(name)) {
/* 144 */                       File[] externalFilesDirs = context.getExternalFilesDirs(null);
/* 190 */                       externalStorageDirectory = externalFilesDirs.length > 0 ? externalFilesDirs[0] : null;
                            } else if ("external-cache-path".equals(name)) {
/* 162 */                       File[] externalCacheDirs = context.getExternalCacheDirs();
/* 167 */                       if (externalCacheDirs.length > 0) {
/* 169 */                           externalStorageDirectory = externalCacheDirs[0];
                                }
                            } else if ("external-media-path".equals(name)) {
/* 180 */                       File[] externalMediaDirs = context.getExternalMediaDirs();
/* 185 */                       if (externalMediaDirs.length > 0) {
/* 187 */                           externalStorageDirectory = externalMediaDirs[0];
                                }
                            }
/* 191 */                   if (externalStorageDirectory == null) {
                                continue;
                            } else {
/* 197 */                       String str2 = new String[]{attributeValue2}[0];
/* 199 */                       if (str2 != null) {
/* 203 */                           externalStorageDirectory = new File(externalStorageDirectory, str2);
                                }
/* 211 */                       if (TextUtils.isEmpty(attributeValue)) {
/* 247 */                           I000II.I000iOII("Name must not be empty");
/* 28 */                            return null;
                                }
                                try {
/* 219 */                           ilIi000IOo.I00000oOI.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                                } catch (IOException e) {
/* 244 */                           throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e);
                                }
                            }
                        }
                    }
                }

                public static String I0000oI00(String str) {
                    return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
                }

                public final IlIi000IOo I00000oIO() {
                    IlIi000IOo ilIi000IOoI00000oOI;
                    synchronized (this.I00iOIl) {
                        try {
/* 8 */                     if (this.I00iiO == null) {
/* 38 */                        throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                            }
/* 10 */                    ilIi000IOoI00000oOI = this.I00iio;
/* 12 */                    if (ilIi000IOoI00000oOI == null) {
/* 22 */                        ilIi000IOoI00000oOI = I00000oOI(this.I00iiI, getContext(), this.I00iiO);
/* 26 */                        this.I00iio = ilIi000IOoI00000oOI;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 32 */            return ilIi000IOoI00000oOI;
                }

                @Override
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 1 */             super.attachInfo(context, providerInfo);
/* 6 */             if (providerInfo.exported) {
/* 106 */               throw new SecurityException("Provider must not be exported");
                    }
/* 10 */            if (!providerInfo.grantUriPermissions) {
/* 72 */                throw new SecurityException("Provider must grant uri permissions");
                    }
/* 12 */            String str = providerInfo.authority;
/* 14 */            if (str == null || str.trim().isEmpty()) {
/* 64 */                throw new SecurityException("Provider must have a non-empty authority");
                    }
/* 35 */            String str2 = providerInfo.authority.split(";")[0];
                    synchronized (this.I00iOIl) {
/* 40 */                this.I00iiO = str2;
                    }
/* 43 */            HashMap map = I00io1l;
                    synchronized (map) {
/* 46 */                map.remove(str2);
                    }
                }

                @Override
                public final int delete(Uri uri, String str, String[] strArr) {
                    return I00000oIO().I00000oIO(uri).delete() ? 1 : 0;
                }

                @Override
                public final String getType(Uri uri) throws IOException {
/* 5 */             File fileI00000oIO = I00000oIO().I00000oIO(uri);
/* 15 */            int iLastIndexOf = fileI00000oIO.getName().lastIndexOf(46);
/* 19 */            if (iLastIndexOf < 0) {
/* 42 */                return "application/octet-stream";
                    }
/* 35 */            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileI00000oIO.getName().substring(iLastIndexOf + 1));
                    return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
                }

                @Override
                public final String getTypeAnonymous(Uri uri) {
/* 1 */             return "application/octet-stream";
                }

                @Override
                public final Uri insert(Uri uri, ContentValues contentValues) {
/* 37 */            throw new UnsupportedOperationException("No external inserts");
                }

                @Override
                public final boolean onCreate() {
/* 1 */             return true;
                }

                @Override
                public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
                    int i;
/* 5 */             File fileI00000oIO = I00000oIO().I00000oIO(uri);
/* 15 */            if ("r".equals(str)) {
/* 17 */                i = 268435456;
                    } else if ("w".equals(str) || "wt".equals(str)) {
/* 81 */                i = 738197504;
                    } else if ("wa".equals(str)) {
/* 45 */                i = 704643072;
                    } else if ("rw".equals(str)) {
/* 56 */                i = 939524096;
                    } else {
/* 65 */                if (!"rwt".equals(str)) {
/* 76 */                    I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Invalid mode: ", str));
/* 79 */                    return null;
                        }
/* 67 */                i = 1006632960;
                    }
/* 83 */            return ParcelFileDescriptor.open(fileI00000oIO, i);
                }

                @Override
                public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws IOException {
                    int i;
/* 5 */             File fileI00000oIO = I00000oIO().I00000oIO(uri);
/* 11 */            String queryParameter = uri.getQueryParameter("displayName");
/* 15 */            if (strArr == null) {
/* 17 */                strArr = I00ilI0I1;
                    }
/* 20 */            String[] strArr3 = new String[strArr.length];
/* 23 */            Object[] objArr = new Object[strArr.length];
/* 28 */            int i2 = 0;
/* 29 */            for (String str3 : strArr) {
/* 39 */                if ("_display_name".equals(str3)) {
/* 41 */                    strArr3[i2] = "_display_name";
/* 43 */                    i = i2 + 1;
/* 53 */                    objArr[i2] = queryParameter == null ? fileI00000oIO.getName() : queryParameter;
                        } else if ("_size".equals(str3)) {
/* 65 */                    strArr3[i2] = "_size";
/* 67 */                    i = i2 + 1;
/* 77 */                    objArr[i2] = Long.valueOf(fileI00000oIO.length());
                        }
/* 55 */                i2 = i;
                    }
/* 83 */            String[] strArr4 = new String[i2];
/* 85 */            System.arraycopy(strArr3, 0, strArr4, 0, i2);
/* 88 */            Object[] objArr2 = new Object[i2];
/* 90 */            System.arraycopy(objArr, 0, objArr2, 0, i2);
/* 96 */            MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
/* 99 */            matrixCursor.addRow(objArr2);
/* 399 */           return matrixCursor;
                }

                @Override
                public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
/* 204 */           throw new UnsupportedOperationException("No external updates");
                }

/* 13 */        public FileProvider() {
/* 14 */            this(0);
                }
            }
