            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.net.Uri;
            import android.text.TextUtils;
            import java.io.File;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.util.ArrayList;
            
            public final class lloo1IloO implements loIo0iiOoi {
                public Context I00000oIO;
                public lo0OOo I00000oOI;
                public Object I0000Il00O;
                public String I0000O;

                @Override
                public final lo1IiOOl1 I00000oIO(Uri uri) throws lo0oIOOIIoIo {
/* 5 */             if (I000O01llI0(uri)) {
/* 29 */                throw new lo0oIOOIIoIo("Android backend cannot perform remote operations without a remote backend");
                    }
/* 15 */            return lo1IiOOl1.I0000Il00O(ll10II0o1.I00000oIO(I000II(uri)));
                }

                @Override
                public final boolean I00000oOI(Uri uri) throws lo0oIOOIIoIo {
/* 5 */             if (I000O01llI0(uri)) {
/* 29 */                throw new lo0oIOOIIoIo("Android backend cannot perform remote operations without a remote backend");
                    }
/* 15 */            return ll10II0o1.I00000oIO(I000II(uri)).exists();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final File I0000Il00O(Uri uri) throws IOException {
                    File externalFilesDir;
                    Account account;
                    String absolutePath;
/* 6 */             if (I000O01llI0(uri)) {
/* 373 */               IioIoO10iOiI.I000OOo1O("operation is not permitted in other authorities.");
/* 5 */                 return null;
                    }
/* 8 */             Context context = this.I00000oIO;
/* 20 */            if (!uri.getScheme().equals("android")) {
/* 370 */               throw new IOO1IOl1O10("Scheme must be 'android'");
                    }
/* 30 */            if (uri.getPathSegments().isEmpty()) {
/* 362 */               throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                    }
/* 40 */            if (!TextUtils.isEmpty(uri.getQuery())) {
/* 346 */               throw new IOO1IOl1O10("Did not expect uri to have query");
                    }
/* 48 */            ArrayList arrayList = new ArrayList(uri.getPathSegments());
/* 56 */            String str = (String) arrayList.get(0);
                    switch (str.hashCode()) {
                        case -1820761141:
/* 241 */                   if (str.equals("external")) {
/* 243 */                       externalFilesDir = context.getExternalFilesDir(null);
/* 263 */                       File file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
/* 270 */                       if (!lIOOli.I000lI(context)) {
                                    synchronized (this.I0000Il00O) {
                                        try {
/* 275 */                                   absolutePath = this.I0000O;
/* 277 */                                   if (absolutePath == null) {
/* 291 */                                       absolutePath = ll101OI1oI.I00000oIO(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
/* 295 */                                       this.I0000O = absolutePath;
                                            }
                                        } finally {
                                        }
                                    }
/* 309 */                           if (!file.getAbsolutePath().startsWith(absolutePath)) {
/* 319 */                               throw new lo0oIOOIIoIo("Cannot access credential-protected data from direct boot");
                                    }
                                }
/* 322 */                       return file;
                            }
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                        case 94416770:
/* 228 */                   if (str.equals("cache")) {
/* 230 */                       externalFilesDir = context.getCacheDir();
/* 263 */                       File file2 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
/* 270 */                       if (!lIOOli.I000lI(context)) {
                                }
/* 322 */                       return file2;
                            }
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                        case 97434231:
/* 215 */                   if (str.equals("files")) {
/* 217 */                       externalFilesDir = ll101OI1oI.I00000oIO(context);
/* 263 */                       File file22 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
/* 270 */                       if (!lIOOli.I000lI(context)) {
                                }
/* 322 */                       return file22;
                            }
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                        case 835260319:
/* 110 */                   if (str.equals("managed")) {
/* 120 */                       File file3 = new File(ll101OI1oI.I00000oIO(context), "managed");
/* 128 */                       if (arrayList.size() >= 3) {
                                    try {
/* 135 */                               String str2 = (String) arrayList.get(2);
/* 137 */                               Account account2 = lloiiI0ii.I00000oIO;
/* 145 */                               if ("shared".equals(str2)) {
/* 147 */                                   account = lloiiI0ii.I00000oIO;
                                        } else {
/* 152 */                                   int iIndexOf = str2.indexOf(58);
/* 165 */                                   ll110IIi0O.I00000oIO(iIndexOf >= 0, "Malformed account", new Object[0]);
/* 179 */                                   account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                                        }
/* 189 */                               if (!lloiiI0ii.I00000oIO.equals(account)) {
/* 199 */                                   throw new IOO1IOl1O10("AccountManager cannot be null");
                                        }
                                    } catch (IllegalArgumentException e) {
/* 206 */                               throw new IOO1IOl1O10(e);
                                    }
                                }
/* 207 */                       externalFilesDir = file3;
/* 263 */                       File file222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
/* 270 */                       if (!lIOOli.I000lI(context)) {
                                }
/* 322 */                       return file222;
                            }
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                        case 988548496:
/* 92 */                    if (str.equals("directboot-cache")) {
/* 98 */                        externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
/* 263 */                       File file2222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
/* 270 */                       if (!lIOOli.I000lI(context)) {
                                }
/* 322 */                       return file2222;
                            }
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                        case 991565957:
/* 74 */                    if (str.equals("directboot-files")) {
/* 80 */                        externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
/* 263 */                       File file22222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
/* 270 */                       if (!lIOOli.I000lI(context)) {
                                }
/* 322 */                       return file22222;
                            }
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                        default:
/* 338 */                   throw new IOO1IOl1O10(String.format("Path must start with a valid logical location: %s", uri));
                    }
                }

                @Override
                public final OutputStream I0000O(Uri uri) {
/* 7 */             return this.I00000oOI.I0000O(I000II(uri));
                }

                @Override
                public final void I0000oI00(Uri uri) throws IOException {
/* 7 */             this.I00000oOI.I0000oI00(I000II(uri));
                }

                @Override
                public final void I0001Ioi1lo(Uri uri, Uri uri2) throws IOException {
/* 11 */            this.I00000oOI.I0001Ioi1lo(I000II(uri), I000II(uri2));
                }

                public final Uri I000II(Uri uri) throws IOException {
/* 5 */             if (I000O01llI0(uri)) {
/* 77 */                throw new IOO1IOl1O10("Operation across authorities is not allowed.");
                    }
/* 7 */             File fileI0000Il00O = I0000Il00O(uri);
/* 30 */            Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
/* 34 */            IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 39 */            ii1oO1IOiI1o.I00000oIO(4, "initialCapacity");
/* 48 */            builderPath.path(fileI0000Il00O.getAbsolutePath());
/* 64 */            return builderPath.encodedFragment(lo1oOOI1101i.I00000oIO(IoillO0OOoo.I000lI(0, new Object[4]))).build();
                }

                public final boolean I000O01llI0(Uri uri) {
                    return (TextUtils.isEmpty(uri.getAuthority()) || this.I00000oIO.getPackageName().equals(uri.getAuthority())) ? false : true;
                }

                @Override
                public final String zzc() {
/* 1 */             return "android";
                }
            }
