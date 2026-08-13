            package com.google.mlkit.vision.common;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.media.Image;
            import android.net.Uri;
            import android.os.SystemClock;
            import com.google.mlkit.vision.common.internal.ImageConvertUtils;
            import com.google.mlkit.vision.common.internal.ImageUtils;
            import java.io.IOException;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.nio.ByteBuffer;
            import p000.O1Il10III1O1;
            import p000.l1Iii1;
            import p000.lII0I0I000I;
            import p000.lOI00Ii101I0;
            import p000.lOO1IIO11il1;
            import p000.lOOIo0IlO;
            
/* 20 */    public class InputImage implements O1Il10III1O1 {
                public static final int IMAGE_FORMAT_BITMAP = -1;
                public static final int IMAGE_FORMAT_NV21 = 17;
                public static final int IMAGE_FORMAT_YUV_420_888 = 35;
                public static final int IMAGE_FORMAT_YV12 = 842094169;
                private volatile Bitmap zza;
                private volatile ByteBuffer zzb;
                private volatile zzb zzc;
                private final int zzd;
                private final int zze;
                private final int zzf;
                private final int zzg;
                private final Matrix zzh;

                @Retention(RetentionPolicy.CLASS)
                public @interface ImageFormat {
                }

                private InputImage(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
                    boolean z;
/* 9 */             if (i4 == 842094169) {
/* 16 */                z = true;
                    } else if (i4 == 17) {
/* 15 */                i4 = 17;
/* 16 */                z = true;
                    } else {
/* 18 */                z = false;
                    }
/* 19 */            lII0I0I000I.I00000oOI(z);
/* 22 */            lII0I0I000I.I000II(byteBuffer);
/* 25 */            this.zzb = byteBuffer;
/* 38 */            lII0I0I000I.I00000oIO("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
/* 41 */            byteBuffer.rewind();
/* 44 */            this.zzd = i;
/* 46 */            this.zze = i2;
/* 48 */            zza(i3);
/* 51 */            this.zzf = i3;
/* 53 */            this.zzg = i4;
/* 56 */            this.zzh = null;
                }

                public static InputImage fromBitmap(Bitmap bitmap, int i) {
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             InputImage inputImage = new InputImage(bitmap, i);
/* 25 */            zzc(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i);
/* 89 */            return inputImage;
                }

                public static InputImage fromByteArray(byte[] bArr, int i, int i2, int i3, int i4) {
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             lII0I0I000I.I000II(bArr);
/* 18 */            InputImage inputImage = new InputImage(ByteBuffer.wrap(bArr), i, i2, i3, i4);
/* 28 */            zzc(i4, 2, jElapsedRealtime, i2, i, bArr.length, i3);
/* 21 */            return inputImage;
                }

                public static InputImage fromByteBuffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 12 */            InputImage inputImage = new InputImage(byteBuffer, i, i2, i3, i4);
/* 26 */            zzc(i4, 3, jElapsedRealtime, i2, i, byteBuffer.limit(), i3);
/* 15 */            return inputImage;
                }

                public static InputImage fromFilePath(Context context, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
/* 3 */             lII0I0I000I.I000O01llI0("Please provide a valid Context", context);
/* 8 */             lII0I0I000I.I000O01llI0("Please provide a valid imageUri", uri);
/* 11 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 23 */            Bitmap bitmapZza = ImageUtils.getInstance().zza(context.getContentResolver(), uri);
/* 30 */            InputImage inputImage = new InputImage(bitmapZza, 0);
/* 48 */            zzc(-1, 4, jElapsedRealtime, bitmapZza.getHeight(), bitmapZza.getWidth(), bitmapZza.getAllocationByteCount(), 0);
/* 89 */            return inputImage;
                }

                public static InputImage fromMediaImage(Image image, int i, Matrix matrix) {
/* 14 */            lII0I0I000I.I00000oIO("Only YUV_420_888 is supported now", image.getFormat() == 35);
/* 17 */            return zzb(image, i, matrix);
                }

                private static int zza(int i) {
/* 1 */             boolean z = true;
/* 2 */             if (i != 0 && i != 90 && i != 180) {
/* 14 */                if (i == 270) {
/* 16 */                    i = 270;
                        } else {
/* 18 */                    z = false;
                        }
                    }
/* 21 */            lII0I0I000I.I00000oIO("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
/* 49 */            return i;
                }

                private static InputImage zzb(Image image, int i, Matrix matrix) {
                    Image image2;
                    int i2;
                    int iLimit;
                    InputImage inputImage;
/* 1 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             lII0I0I000I.I000O01llI0("Please provide a valid image", image);
/* 10 */            zza(i);
/* 17 */            boolean z = true;
/* 21 */            if (image.getFormat() != 256 && image.getFormat() != 35) {
/* 32 */                z = false;
                    }
/* 35 */            lII0I0I000I.I00000oIO("Only JPEG and YUV_420_888 are supported now", z);
/* 38 */            Image.Plane[] planes = image.getPlanes();
/* 46 */            if (image.getFormat() == 256) {
/* 58 */                iLimit = image.getPlanes()[0].getBuffer().limit();
/* 75 */                image2 = image;
/* 76 */                i2 = i;
/* 72 */                inputImage = new InputImage(ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i), 0);
                    } else {
/* 82 */                for (Image.Plane plane : planes) {
/* 90 */                    if (plane.getBuffer() != null) {
/* 96 */                        plane.getBuffer().rewind();
                            }
                        }
/* 112 */               image2 = image;
/* 113 */               i2 = i;
/* 115 */               InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i2, matrix);
/* 134 */               iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
/* 136 */               inputImage = inputImage2;
                    }
/* 152 */           zzc(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i2);
/* 215 */           return inputImage;
                }

                private static void zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
/* 1 */             lOI00Ii101I0 loi00ii101i0I00000oIO = lOO1IIO11il1.I00000oIO();
/* 9 */             long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 12 */            lOOIo0IlO looio0ilo = new lOOIo0IlO();
/* 15 */            looio0ilo.I00000oIO = i;
/* 17 */            looio0ilo.I00000oOI = i2;
/* 19 */            looio0ilo.I0000Il00O = i5;
/* 21 */            looio0ilo.I0000O = i3;
/* 23 */            looio0ilo.I0000oI00 = i4;
/* 25 */            looio0ilo.I0001Ioi1lo = jElapsedRealtime;
/* 27 */            looio0ilo.I000II = i6;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            loi00ii101i0I00000oIO.I00000oIO(looio0ilo, l1Iii1.INPUT_IMAGE_CONSTRUCTION);
                }

                public Bitmap getBitmapInternal() {
/* 1 */             return this.zza;
                }

                public ByteBuffer getByteBuffer() {
/* 1 */             return this.zzb;
                }

                public Matrix getCoordinatesMatrix() {
/* 1 */             return this.zzh;
                }

                public int getFormat() {
/* 1 */             return this.zzg;
                }

                public int getHeight() {
/* 1 */             return this.zze;
                }

                public Image getMediaImage() {
/* 3 */             if (this.zzc == null) {
/* 5 */                 return null;
                    }
/* 9 */             return this.zzc.zza();
                }

                public Image.Plane[] getPlanes() {
/* 3 */             if (this.zzc == null) {
/* 5 */                 return null;
                    }
/* 9 */             return this.zzc.zzb();
                }

                public int getRotationDegrees() {
/* 1 */             return this.zzf;
                }

                public int getWidth() {
/* 1 */             return this.zzd;
                }

/* 21 */        public static InputImage fromMediaImage(Image image, int i) {
/* 22 */            return zzb(image, i, null);
                }

/* 58 */        private InputImage(Image image, int i, int i2, int i3, Matrix matrix) {
                    lII0I0I000I.I000II(image);
                    this.zzc = new zzb(image);
                    this.zzd = i;
                    this.zze = i2;
/* 60 */            zza(i3);
                    this.zzf = i3;
                    this.zzg = 35;
                    this.zzh = matrix;
                }

/* 60 */        private InputImage(Bitmap bitmap, int i) {
                    lII0I0I000I.I000II(bitmap);
                    this.zza = bitmap;
/* 62 */            this.zzd = bitmap.getWidth();
/* 63 */            this.zze = bitmap.getHeight();
/* 64 */            zza(i);
                    this.zzf = i;
                    this.zzg = -1;
                    this.zzh = null;
                }
            }
