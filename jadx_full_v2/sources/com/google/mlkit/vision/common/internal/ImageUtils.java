            package com.google.mlkit.vision.common.internal;

            import android.content.ContentResolver;
            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.media.Image;
            import android.net.Uri;
            import android.provider.MediaStore;
            import com.google.mlkit.vision.common.InputImage;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            import java.nio.ByteBuffer;
            import p000.Il1Ilio1Ol1;
            import p000.Io0Ool;
            import p000.IoOlilli0ol;
            import p000.O1o01iO0liI0;
            import p000.OIOiOlIO01;
            import p000.Oi010OO0;
            import p000.lII0I0I000I;
            
            public class ImageUtils {
                private static final Io0Ool zza = new Io0Ool("MLKitImageUtils", "");
                private static final ImageUtils zzb = new ImageUtils();

                private ImageUtils() {
                }

                public static ImageUtils getInstance() {
/* 1 */             return zzb;
                }

                public IoOlilli0ol getImageDataWrapper(InputImage inputImage) throws O1o01iO0liI0 {
/* 1 */             int format = inputImage.getFormat();
/* 6 */             if (format == -1) {
/* 60 */                Bitmap bitmapInternal = inputImage.getBitmapInternal();
/* 64 */                lII0I0I000I.I000II(bitmapInternal);
/* 67 */                return OIOiOlIO01.I00O10llo(bitmapInternal);
                    }
/* 10 */            if (format != 17) {
/* 14 */                if (format == 35) {
/* 43 */                    return OIOiOlIO01.I00O10llo(inputImage.getMediaImage());
                        }
/* 19 */                if (format != 842094169) {
/* 38 */                    throw new O1o01iO0liI0(Oi010OO0.I000oI1ioi(inputImage.getFormat(), "Unsupported image format: "), 3);
                        }
                    }
/* 48 */            ByteBuffer byteBuffer = inputImage.getByteBuffer();
/* 52 */            lII0I0I000I.I000II(byteBuffer);
/* 55 */            return OIOiOlIO01.I00O10llo(byteBuffer);
                }

                public int getMobileVisionImageFormat(InputImage inputImage) {
/* 1 */             return inputImage.getFormat();
                }

                public int getMobileVisionImageSize(InputImage inputImage) {
/* 6 */             if (inputImage.getFormat() == -1) {
/* 8 */                 Bitmap bitmapInternal = inputImage.getBitmapInternal();
/* 12 */                lII0I0I000I.I000II(bitmapInternal);
/* 15 */                return bitmapInternal.getAllocationByteCount();
                    }
/* 26 */            if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
/* 70 */                ByteBuffer byteBuffer = inputImage.getByteBuffer();
/* 74 */                lII0I0I000I.I000II(byteBuffer);
/* 77 */                return byteBuffer.limit();
                    }
/* 45 */            if (inputImage.getFormat() != 35) {
/* 44 */                return 0;
                    }
/* 48 */            Image.Plane[] planes = inputImage.getPlanes();
/* 52 */            lII0I0I000I.I000II(planes);
/* 67 */            return (planes[0].getBuffer().limit() * 3) / 2;
                }

                public Matrix getUprightRotationMatrix(int i, int i2, int i3) {
/* 1 */             if (i3 == 0) {
/* 3 */                 return null;
                    }
/* 7 */             Matrix matrix = new Matrix();
/* 18 */            matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
/* 24 */            matrix.postRotate(i3 * 90);
/* 27 */            int i4 = i3 % 2;
/* 33 */            int i5 = i4 != 0 ? i2 : i;
/* 34 */            if (i4 == 0) {
/* 36 */                i = i2;
                    }
/* 41 */            matrix.postTranslate(i5 / 2.0f, i / 2.0f);
/* 215 */           return matrix;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[PHI: r4
                  0x008f: PHI (r4v3 android.graphics.Matrix) = (r4v0 android.graphics.Matrix), (r4v1 android.graphics.Matrix) binds: [B:38:0x008c, B:47:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Bitmap zza(ContentResolver contentResolver, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                    IOException iOException;
                    Il1Ilio1Ol1 il1Ilio1Ol1;
                    Matrix matrix;
                    Bitmap bitmapCreateBitmap;
                    try {
/* 5 */                 Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
/* 9 */                 if (bitmap == null) {
/* 211 */                   throw new IOException("The image Uri could not be resolved.");
                        }
/* 21 */                int iI0000O = 0;
/* 22 */                Matrix matrix2 = null;
/* 23 */                if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                            try {
/* 42 */                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
/* 46 */                        if (inputStreamOpenInputStream != null) {
                                    try {
/* 50 */                                il1Ilio1Ol1 = new Il1Ilio1Ol1(inputStreamOpenInputStream);
                                    } catch (Throwable th) {
                                        try {
/* 57 */                                    inputStreamOpenInputStream.close();
/* 80 */                                    throw th;
                                        } catch (Throwable th2) {
                                            try {
/* 77 */                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
/* 80 */                                        throw th;
                                            } catch (Exception unused) {
/* 80 */                                        throw th;
                                            }
                                        }
                                    }
                                } else {
/* 84 */                            il1Ilio1Ol1 = null;
                                }
/* 85 */                        if (inputStreamOpenInputStream != null) {
                                    try {
/* 87 */                                inputStreamOpenInputStream.close();
                                    } catch (IOException e) {
/* 92 */                                iOException = e;
/* 107 */                               zza.I00000oOI("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
/* 110 */                               if (il1Ilio1Ol1 != null) {
                                        }
/* 122 */                               Matrix matrix3 = new Matrix();
/* 125 */                               int width = bitmap.getWidth();
/* 129 */                               int height = bitmap.getHeight();
                                        switch (iI0000O) {
                                        }
                                        return matrix != null ? bitmap : bitmap;
                                    }
                                }
                            } catch (IOException e2) {
/* 82 */                        iOException = e2;
/* 94 */                        il1Ilio1Ol1 = null;
/* 107 */                       zza.I00000oOI("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), iOException);
/* 110 */                       if (il1Ilio1Ol1 != null) {
                                }
/* 122 */                       Matrix matrix32 = new Matrix();
/* 125 */                       int width2 = bitmap.getWidth();
/* 129 */                       int height2 = bitmap.getHeight();
                                switch (iI0000O) {
                                }
                                if (matrix != null) {
                                }
                            }
/* 110 */                   if (il1Ilio1Ol1 != null) {
/* 116 */                       iI0000O = il1Ilio1Ol1.I0000O(1, "Orientation");
                            }
                        }
/* 122 */               Matrix matrix322 = new Matrix();
/* 125 */               int width22 = bitmap.getWidth();
/* 129 */               int height22 = bitmap.getHeight();
                        switch (iI0000O) {
                            case 2:
/* 181 */                       matrix2 = new Matrix();
/* 184 */                       matrix2.postScale(-1.0f, 1.0f);
/* 144 */                       matrix = matrix2;
                                break;
                            case 3:
/* 174 */                       matrix322.postRotate(180.0f);
/* 177 */                       matrix = matrix322;
                                break;
                            case 4:
/* 168 */                       matrix322.postScale(1.0f, -1.0f);
/* 177 */                       matrix = matrix322;
                                break;
                            case 5:
/* 161 */                       matrix322.postRotate(90.0f);
/* 164 */                       matrix322.postScale(-1.0f, 1.0f);
/* 177 */                       matrix = matrix322;
                                break;
                            case 6:
/* 157 */                       matrix322.postRotate(90.0f);
/* 177 */                       matrix = matrix322;
                                break;
                            case 7:
/* 150 */                       matrix322.postRotate(-90.0f);
/* 153 */                       matrix322.postScale(-1.0f, 1.0f);
/* 177 */                       matrix = matrix322;
                                break;
                            case 8:
/* 146 */                       matrix322.postRotate(-90.0f);
/* 177 */                       matrix = matrix322;
                                break;
                            default:
/* 144 */                       matrix = matrix2;
                                break;
                        }
/* 197 */               if (matrix != null && bitmap != (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width22, height22, matrix, true))) {
/* 199 */                   bitmap.recycle();
/* 202 */                   return bitmapCreateBitmap;
                        }
                    } catch (FileNotFoundException e3) {
/* 224 */               zza.I00000oOI("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e3);
/* 227 */               throw e3;
                    }
                }
            }
