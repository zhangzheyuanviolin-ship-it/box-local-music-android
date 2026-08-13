            package com.google.mlkit.genai.prompt;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.content.pm.ProviderInfo;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.net.Uri;
            import android.os.Environment;
            import android.os.ParcelFileDescriptor;
            import android.os.Process;
            import android.system.ErrnoException;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.IioIoO10iOiI;
            import p000.O0ioIllo0i1;
            import p000.OllO00oiil;
            import p000.ii1OOii;
            import p000.lI00l0oo;
            import p000.lI1olo0oIo;
            import p000.lII0llI1O;
            import p000.lOl10OOloi;
            
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0082\u0004J\n\u0010\u0018\u001a\u00020\u000fH\u0096\u0080\u0004J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/google/mlkit/genai/prompt/ImagePart;", "Lcom/google/mlkit/genai/prompt/Part;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "blob", "", "([B)V", "getBitmap", "()Landroid/graphics/Bitmap;", "width", "", "getWidth", "()I", "height", "getHeight", "equals", "", "other", "", "hashCode", "component1", "copy", "toString", "", "Companion", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class ImagePart extends Part {

                public static final Companion INSTANCE = new Companion(null);
                private static final O0ioIllo0i1 zzd = new OllO00oiil(zze.zza);

                private final Bitmap bitmap;
                private final int zzb;
                private final int zzc;

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
                
                    if (r2.I00000oIO == false) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
                
                    if (r2 != false) goto L62;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x0167, code lost:
                
                    if (r5.startsWith(p000.lII0llI1O.I00000oOI(r9)) != false) goto L84;
                 */
                /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[PHI: r4 r5
                  0x005a: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v11 java.lang.String) binds: [B:8:0x003d, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]
                  0x005a: PHI (r5v11 android.content.pm.ProviderInfo) = (r5v10 android.content.pm.ProviderInfo), (r5v12 android.content.pm.ProviderInfo) binds: [B:8:0x003d, B:12:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ImagePart(Uri uri) throws IOException, ErrnoException {
                    File dataDir;
                    InputStream autoCloseInputStream;
                    int i;
/* 9 */             Context context = (Context) zzd.getValue();
/* 11 */            String[] strArr = lII0llI1O.I00000oIO;
/* 13 */            lI1olo0oIo li1olo0oio = lI1olo0oIo.I0000O;
/* 15 */            ContentResolver contentResolver = context.getContentResolver();
/* 19 */            String scheme = uri.getScheme();
/* 30 */            if ("android.resource".equals(scheme)) {
/* 32 */                autoCloseInputStream = contentResolver.openInputStream(uri);
                    } else {
/* 44 */                int i2 = 0;
/* 46 */                if (!"content".equals(scheme)) {
/* 281 */                   if (!"file".equals(scheme)) {
/* 966 */                       throw new FileNotFoundException("Unsupported scheme");
                            }
                            try {
/* 302 */                       ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uri.getPath()).getCanonicalFile()), "r");
                                try {
/* 317 */                           String canonicalPath = new File(uri.getPath()).getCanonicalPath();
/* 321 */                           lII0llI1O.I00000oIO(parcelFileDescriptorOpenFileDescriptor, canonicalPath);
/* 330 */                           if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
/* 340 */                               lOl10OOloi lol10ooloi = li1olo0oio.I0000Il00O;
/* 344 */                               if (lol10ooloi.I00iio > 0) {
/* 587 */                                   lol10ooloi.get(0);
/* 595 */                                   throw new ClassCastException();
                                        }
/* 346 */                               File dataDir2 = context.getDataDir();
/* 350 */                               if (dataDir2 == null) {
/* 384 */                                   if (!canonicalPath.startsWith(lII0llI1O.I00000oOI(Environment.getDataDirectory()))) {
/* 387 */                                       Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
/* 391 */                                       if (contextCreateDeviceProtectedStorageContext == null || (dataDir = contextCreateDeviceProtectedStorageContext.getDataDir()) == null || !canonicalPath.startsWith(lII0llI1O.I00000oOI(dataDir))) {
                                                    try {
/* 410 */                                               String[] strArr2 = lII0llI1O.I00000oIO;
/* 412 */                                               File[] externalFilesDirs = context.getExternalFilesDirs(null);
/* 416 */                                               int length = externalFilesDirs.length;
/* 417 */                                               int i3 = 0;
                                                        while (true) {
/* 418 */                                                   if (i3 < length) {
/* 420 */                                                       File file = externalFilesDirs[i3];
/* 422 */                                                       if (file != null && canonicalPath.startsWith(lII0llI1O.I00000oOI(file))) {
                                                                    break;
                                                                } else {
/* 435 */                                                           i3++;
                                                                }
                                                            } else {
                                                                try {
/* 438 */                                                           String[] strArr3 = lII0llI1O.I00000oIO;
/* 446 */                                                           for (File file2 : context.getExternalCacheDirs()) {
/* 450 */                                                               if (file2 == null || !canonicalPath.startsWith(lII0llI1O.I00000oOI(file2))) {
                                                                        }
                                                                    }
                                                                } catch (NullPointerException e) {
/* 575 */                                                           throw e;
                                                                } catch (Exception e2) {
/* 574 */                                                           throw new RuntimeException(e2);
                                                                }
                                                            }
                                                        }
                                                    } catch (NullPointerException e3) {
/* 586 */                                               throw e3;
                                                    } catch (Exception e4) {
/* 585 */                                               throw new RuntimeException(e4);
                                                    }
                                                }
                                            }
/* 362 */                                   i2 = 1;
/* 468 */                                   if (i2 == li1olo0oio.I00000oIO) {
/* 472 */                                       autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                                            }
                                        }
                                    }
/* 605 */                           throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
                                } catch (FileNotFoundException e5) {
                                    try {
/* 625 */                               parcelFileDescriptorOpenFileDescriptor.close();
/* 633 */                               throw e5;
                                    } catch (IOException e6) {
/* 630 */                               e5.addSuppressed(e6);
/* 633 */                               throw e5;
                                    }
                                } catch (IOException e7) {
/* 610 */                           FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
/* 613 */                           fileNotFoundException.initCause(e7);
                                    try {
/* 616 */                               parcelFileDescriptorOpenFileDescriptor.close();
/* 624 */                               throw fileNotFoundException;
                                    } catch (IOException e8) {
/* 621 */                               fileNotFoundException.addSuppressed(e8);
/* 624 */                               throw fileNotFoundException;
                                    }
                                }
                            } catch (IOException e9) {
/* 639 */                       FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
/* 642 */                       fileNotFoundException2.initCause(e9);
/* 645 */                       throw fileNotFoundException2;
                            }
                        }
/* 48 */                String authority = uri.getAuthority();
/* 56 */                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
/* 62 */                if (providerInfoResolveContentProvider != null) {
/* 91 */                    lOl10OOloi lol10ooloi2 = li1olo0oio.I00000oOI;
/* 93 */                    int i4 = lol10ooloi2.I00iio;
/* 95 */                    int i5 = 0;
                            while (true) {
/* 98 */                        if (i5 >= i4) {
/* 136 */                           i = 3;
                                    break;
                                }
/* 129 */                       i5++;
/* 131 */                       if (((uri.getAuthority().lastIndexOf(64) < 0 || lI00l0oo.I00000oIO(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2) - 1 == 1) {
/* 134 */                           i = 2;
                                    break;
                                }
                            }
/* 139 */                   if (i - 1 != 1) {
/* 147 */                       boolean zEquals = context.getPackageName().equals(providerInfoResolveContentProvider.packageName);
/* 151 */                       boolean z = li1olo0oio.I00000oIO;
/* 153 */                       if (!zEquals) {
/* 158 */                           if (!z) {
/* 172 */                               if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
/* 178 */                                   String[] strArr4 = lII0llI1O.I00000oOI;
/* 180 */                                   int length2 = strArr4.length;
/* 181 */                                   int i6 = 0;
                                            while (true) {
/* 182 */                                       if (i6 >= 2) {
/* 195 */                                           String[] strArr5 = lII0llI1O.I0000Il00O;
/* 197 */                                           int length3 = strArr5.length;
/* 198 */                                           int i7 = 0;
                                                    while (true) {
/* 199 */                                               if (i7 >= 3) {
/* 212 */                                                   String[] strArr6 = lII0llI1O.I00000oIO;
/* 215 */                                                   while (i2 < 7) {
/* 217 */                                                       String str = strArr6[i2];
/* 225 */                                                       char cCharAt = str.charAt(str.length() - 1);
/* 229 */                                                       String str2 = providerInfoResolveContentProvider.packageName;
/* 233 */                                                       if (cCharAt == '.') {
/* 239 */                                                           if (!str2.startsWith(str)) {
/* 248 */                                                               i2++;
                                                                    }
                                                                } else if (!str2.equals(str)) {
/* 248 */                                                           i2++;
                                                                }
                                                            }
                                                        } else if (strArr5[i7].equals(authority)) {
                                                            break;
                                                        } else {
/* 209 */                                                   i7++;
                                                        }
                                                    }
                                                } else if (strArr4[i6].equals(authority)) {
                                                    break;
                                                } else {
/* 192 */                                           i6++;
                                                }
                                            }
                                        }
/* 251 */                               autoCloseInputStream = contentResolver.openInputStream(uri);
/* 255 */                               if (autoCloseInputStream == null) {
/* 266 */                                   throw new FileNotFoundException("Content resolver returned null value.");
                                        }
                                    }
                                }
                            }
/* 274 */                   throw new FileNotFoundException("Can't open content uri.");
                        }
/* 64 */                int iLastIndexOf = authority.lastIndexOf(64);
/* 68 */                if (iLastIndexOf >= 0) {
/* 71 */                    authority = authority.substring(iLastIndexOf + 1);
/* 79 */                    providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
                        }
/* 83 */                if (providerInfoResolveContentProvider == null) {
                        }
                    }
/* 477 */           if (autoCloseInputStream == null) {
/* 545 */               new StringBuilder(String.valueOf(uri).length() + 36);
/* 548 */               uri.toString();
/* 561 */               IioIoO10iOiI.I000OOo1O("Failed to open InputStream for URI: ".concat(String.valueOf(uri)));
/* 564 */               throw null;
                    }
                    try {
/* 479 */               Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(autoCloseInputStream);
/* 483 */               if (bitmapDecodeStream == null) {
/* 508 */                   StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 32);
/* 511 */                   sb.append("Could not decode URI to bitmap: ");
/* 514 */                   sb.append(uri);
/* 524 */                   throw new IllegalArgumentException(sb.toString());
                        }
/* 485 */               autoCloseInputStream.close();
/* 490 */               this(bitmapDecodeStream);
                    } catch (Throwable th) {
                        try {
/* 527 */                   throw th;
                        } catch (Throwable th2) {
/* 529 */                   ii1OOii.I00000oIO(autoCloseInputStream, th);
/* 532 */                   throw th2;
                        }
                    }
                }

                public final Bitmap getBitmap() {
/* 1 */             return this.bitmap;
                }

                public final ImagePart copy(Bitmap bitmap) {
/* 3 */             return new ImagePart(bitmap);
                }

                public boolean equals(Object other) {
/* 1 */             if (this == other) {
/* 3 */                 return true;
                    }
/* 19 */            if (ImagePart.class.equals(other != null ? other.getClass() : null)) {
/* 29 */                return this.bitmap.sameAs(((ImagePart) other).bitmap);
                    }
/* 21 */            return false;
                }

                public final Bitmap getBitmap() {
/* 1 */             return this.bitmap;
                }

                public final int getZzc() {
/* 1 */             return this.zzc;
                }

                public final int getZzb() {
/* 1 */             return this.zzb;
                }

                public int hashCode() {
/* 1 */             Bitmap bitmap = this.bitmap;
/* 22 */            int byteCount = bitmap.getByteCount() + ((bitmap.getHeight() + ((bitmap.getWidth() + 527) * 31)) * 31);
/* 23 */            Bitmap.Config config = bitmap.getConfig();
/* 37 */            return (byteCount * 31) + (config != null ? config.hashCode() : 0);
                }

                public String toString() {
/* 1 */             Bitmap bitmap = this.bitmap;
/* 15 */            StringBuilder sb = new StringBuilder(String.valueOf(bitmap).length() + 18);
/* 20 */            sb.append("ImagePart(bitmap=");
/* 23 */            sb.append(bitmap);
/* 28 */            sb.append(")");
/* 31 */            return sb.toString();
                }

                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/prompt/ImagePart$Companion;", "", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "bytesToBitmap", "Landroid/graphics/Bitmap;", "blob", "", "uriToBitmap", "uri", "Landroid/net/Uri;", "java.com.google.android.libraries.mlkit.granules.genai.prompt_mlkit_genai_prompt"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

/* 4 */             private Companion() {
/* 5 */                 throw null;
                    }
                }

/* 653 */       public ImagePart(Bitmap bitmap) {
/* 654 */           super(null);
                    this.bitmap = bitmap;
                    this.zzb = bitmap.getWidth();
/* 655 */           this.zzc = bitmap.getHeight();
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 655 */       public ImagePart(byte[] bArr) {
/* 656 */           Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (bitmapDecodeByteArray != null) {
/* 657 */               this(bitmapDecodeByteArray);
                    } else {
/* 659 */               I000II.I000iOII("Could not decode byte array to bitmap.");
                        throw null;
                    }
                }
            }
