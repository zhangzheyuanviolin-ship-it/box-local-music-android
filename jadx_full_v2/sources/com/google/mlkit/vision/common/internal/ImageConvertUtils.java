            package com.google.mlkit.vision.common.internal;

            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.YuvImage;
            import android.media.Image;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.nio.ByteBuffer;
            import p000.I000II;
            import p000.O1o01iO0liI0;
            import p000.OooioIOo1;
            import p000.lII0I0I000I;
            
            public class ImageConvertUtils {
                private static final ImageConvertUtils zza = new ImageConvertUtils();

                private ImageConvertUtils() {
                }

                public static ByteBuffer bufferWithBackingArray(ByteBuffer byteBuffer) {
/* 5 */             if (byteBuffer.hasArray()) {
/* 7 */                 return byteBuffer;
                    }
/* 8 */             byteBuffer.rewind();
/* 15 */            byte[] bArr = new byte[byteBuffer.limit()];
/* 17 */            byteBuffer.get(bArr);
/* 20 */            return ByteBuffer.wrap(bArr);
                }

                public static ImageConvertUtils getInstance() {
/* 1 */             return zza;
                }

                public static Bitmap yv12ToBitmap(ByteBuffer byteBuffer, int i, int i2, int i3) throws IllegalAccessException, O1o01iO0liI0, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 10 */            byte[] bArrZzb = zzb(yv12ToNv21Buffer(byteBuffer, true).array(), i, i2);
/* 16 */            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
/* 28 */            return zza(bitmapDecodeByteArray, i3, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                }

                public static ByteBuffer yv12ToNv21Buffer(ByteBuffer byteBuffer, boolean z) {
                    int i;
/* 1 */             byteBuffer.rewind();
/* 4 */             int iLimit = byteBuffer.limit();
/* 8 */             int i2 = iLimit / 6;
/* 17 */            ByteBuffer byteBufferAllocate = z ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
/* 22 */            int i3 = 0;
                    while (true) {
/* 23 */                i = i2 * 4;
/* 25 */                if (i3 >= i) {
                            break;
                        }
/* 31 */                byteBufferAllocate.put(i3, byteBuffer.get(i3));
/* 34 */                i3++;
                    }
/* 39 */            for (int i4 = 0; i4 < i2 + i2; i4++) {
/* 54 */                byteBufferAllocate.put(i + i4, byteBuffer.get((i4 / 2) + ((i4 % 2) * i2) + i));
                    }
/* 89 */            return byteBufferAllocate;
                }

                public static Bitmap zza(Bitmap bitmap, int i, int i2, int i3) {
/* 1 */             if (i == 0) {
/* 4 */                 return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
                    }
/* 11 */            Matrix matrix = new Matrix();
/* 15 */            matrix.postRotate(i);
/* 24 */            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
                }

                private static byte[] zzb(byte[] bArr, int i, int i2) throws IllegalAccessException, O1o01iO0liI0, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 11 */            YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
                    try {
/* 16 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
/* 27 */                    yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
/* 30 */                    byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 34 */                    byteArrayOutputStream.close();
/* 37 */                    return byteArray;
                        } finally {
                        }
                    } catch (IOException e) {
/* 70 */                Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
/* 215 */               throw new O1o01iO0liI0(13, e, "Image conversion error from NV21 format");
                    }
                }

                private static final void zzc(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
/* 1 */             ByteBuffer buffer = plane.getBuffer();
/* 5 */             buffer.rewind();
/* 23 */            int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
/* 24 */            if (rowStride == 0) {
/* 1294 */              return;
                    }
/* 28 */            int i5 = i / (i2 / rowStride);
/* 31 */            int rowStride2 = 0;
/* 32 */            for (int i6 = 0; i6 < rowStride; i6++) {
/* 35 */                int pixelStride = rowStride2;
/* 36 */                for (int i7 = 0; i7 < i5; i7++) {
/* 42 */                    bArr[i3] = buffer.get(pixelStride);
/* 44 */                    i3 += i4;
/* 49 */                    pixelStride += plane.getPixelStride();
                        }
/* 57 */                rowStride2 += plane.getRowStride();
                    }
                }

                public byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
/* 5 */             if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
/* 13 */                return byteBuffer.array();
                    }
/* 18 */            byteBuffer.rewind();
/* 21 */            int iLimit = byteBuffer.limit();
/* 25 */            byte[] bArr = new byte[iLimit];
/* 28 */            byteBuffer.get(bArr, 0, iLimit);
/* 49 */            return bArr;
                }

                public ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
/* 1 */             lII0I0I000I.I000II(byteBuffer);
/* 4 */             int iCapacity = byteBuffer.capacity();
/* 8 */             int iPosition = byteBuffer.position();
/* 23 */            ByteBuffer byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
/* 31 */            byteBufferAllocateDirect.limit(byteBuffer.limit());
/* 40 */            byteBufferAllocateDirect.put((ByteBuffer) byteBuffer.rewind());
/* 43 */            byteBufferAllocateDirect.position(iPosition);
/* 46 */            byteBuffer.position(iPosition);
/* 49 */            return byteBufferAllocateDirect;
                }

                public Bitmap convertJpegToUpRightBitmap(Image image, int i) {
/* 16 */            lII0I0I000I.I00000oIO("Only JPEG is supported now", image.getFormat() == 256);
/* 19 */            Image.Plane[] planes = image.getPlanes();
/* 23 */            if (planes == null || planes.length != 1) {
/* 65 */                I000II.I000iOII("Unexpected image format, JPEG should have exactly 1 image plane");
/* 68 */                return null;
                    }
/* 30 */            ByteBuffer buffer = planes[0].getBuffer();
/* 34 */            buffer.rewind();
/* 37 */            int iRemaining = buffer.remaining();
/* 41 */            byte[] bArr = new byte[iRemaining];
/* 43 */            buffer.get(bArr);
/* 46 */            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
/* 58 */            return zza(bitmapDecodeByteArray, i, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                }

                public ByteBuffer convertToNv21Buffer(InputImage inputImage, boolean z) throws O1o01iO0liI0 {
/* 3 */             int format = inputImage.getFormat();
/* 8 */             if (format != -1) {
/* 12 */                if (format == 17) {
/* 67 */                    if (z) {
/* 69 */                        ByteBuffer byteBuffer = inputImage.getByteBuffer();
/* 73 */                        lII0I0I000I.I000II(byteBuffer);
/* 76 */                        return bufferWithBackingArray(byteBuffer);
                            }
/* 81 */                    ByteBuffer byteBuffer2 = inputImage.getByteBuffer();
/* 85 */                    lII0I0I000I.I000II(byteBuffer2);
/* 88 */                    return byteBuffer2;
                        }
/* 16 */                if (format == 35) {
/* 45 */                    Image.Plane[] planes = inputImage.getPlanes();
/* 49 */                    lII0I0I000I.I000II(planes);
/* 62 */                    return yuv420ThreePlanesToNV21(planes, inputImage.getWidth(), inputImage.getHeight());
                        }
/* 21 */                if (format != 842094169) {
/* 44 */                    throw new O1o01iO0liI0("Unsupported image format", 13);
                        }
/* 23 */                ByteBuffer byteBuffer3 = inputImage.getByteBuffer();
/* 27 */                lII0I0I000I.I000II(byteBuffer3);
/* 30 */                return yv12ToNv21Buffer(byteBuffer3, z);
                    }
/* 89 */            Bitmap bitmapInternal = inputImage.getBitmapInternal();
/* 93 */            lII0I0I000I.I000II(bitmapInternal);
/* 102 */           if (bitmapInternal.getConfig() == Bitmap.Config.HARDWARE) {
/* 110 */               bitmapInternal = bitmapInternal.copy(Bitmap.Config.ARGB_8888, bitmapInternal.isMutable());
                    }
/* 114 */           Bitmap bitmap = bitmapInternal;
/* 115 */           int width = bitmap.getWidth();
/* 119 */           int height = bitmap.getHeight();
/* 123 */           int i = width * height;
/* 125 */           int[] iArr = new int[i];
/* 131 */           bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
/* 142 */           int iCeil = (int) Math.ceil(height / 2.0d);
/* 152 */           int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i;
/* 160 */           ByteBuffer byteBufferAllocate = z ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
/* 165 */           int i2 = 0;
/* 166 */           int i3 = 0;
/* 167 */           for (int i4 = 0; i4 < height; i4++) {
/* 169 */               int i5 = 0;
/* 170 */               while (i5 < width) {
/* 172 */                   int i6 = iArr[i3];
/* 174 */                   int i7 = i6 >> 16;
/* 176 */                   int i8 = i6 >> 8;
/* 180 */                   int i9 = i6 & 255;
/* 181 */                   int i10 = i2 + 1;
/* 183 */                   int i11 = i7 & 255;
/* 184 */                   int i12 = i8 & 255;
/* 204 */                   byteBufferAllocate.put(i2, (byte) Math.min(255, ((((i9 * 25) + ((i12 * 129) + (i11 * 66))) + Barcode.FORMAT_ITF) >> 8) + 16));
/* 209 */                   if (i4 % 2 == 0 && i3 % 2 == 0) {
/* 235 */                       int i13 = ((((i11 * 112) - (i12 * 94)) - (i9 * 18)) + Barcode.FORMAT_ITF) >> 8;
/* 237 */                       int i14 = ((((i11 * (-38)) - (i12 * 74)) + (i9 * 112)) + Barcode.FORMAT_ITF) >> 8;
/* 239 */                       int i15 = i13 + Barcode.FORMAT_ITF;
/* 241 */                       int i16 = i14 + Barcode.FORMAT_ITF;
/* 243 */                       int i17 = i + 1;
/* 250 */                       byteBufferAllocate.put(i, (byte) Math.min(255, i15));
/* 253 */                       i += 2;
/* 260 */                       byteBufferAllocate.put(i17, (byte) Math.min(255, i16));
                            }
/* 263 */                   i3++;
/* 265 */                   i5++;
/* 267 */                   i2 = i10;
                        }
                    }
/* 551 */           return byteBufferAllocate;
                }

                public Bitmap convertToUpRightBitmap(InputImage inputImage) throws O1o01iO0liI0 {
/* 1 */             int format = inputImage.getFormat();
/* 6 */             if (format == -1) {
/* 115 */               Bitmap bitmapInternal = inputImage.getBitmapInternal();
/* 119 */               lII0I0I000I.I000II(bitmapInternal);
/* 134 */               return zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight());
                    }
/* 10 */            if (format == 17) {
/* 91 */                ByteBuffer byteBuffer = inputImage.getByteBuffer();
/* 95 */                lII0I0I000I.I000II(byteBuffer);
/* 110 */               return nv21ToBitmap(byteBuffer, inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
                    }
/* 14 */            if (format == 35) {
/* 55 */                Image.Plane[] planes = inputImage.getPlanes();
/* 59 */                lII0I0I000I.I000II(planes);
/* 86 */                return nv21ToBitmap(yuv420ThreePlanesToNV21(planes, inputImage.getWidth(), inputImage.getHeight()), inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
                    }
/* 19 */            if (format != 842094169) {
/* 54 */                throw new O1o01iO0liI0("Unsupported image format", 13);
                    }
/* 21 */            ByteBuffer byteBuffer2 = inputImage.getByteBuffer();
/* 25 */            lII0I0I000I.I000II(byteBuffer2);
/* 40 */            return yv12ToBitmap(byteBuffer2, inputImage.getWidth(), inputImage.getHeight(), inputImage.getRotationDegrees());
                }

                public Bitmap getUpRightBitmap(InputImage inputImage) {
/* 1 */             Bitmap bitmapInternal = inputImage.getBitmapInternal();
                    return bitmapInternal != null ? zza(bitmapInternal, inputImage.getRotationDegrees(), inputImage.getWidth(), inputImage.getHeight()) : convertToUpRightBitmap(inputImage);
                }

                public Bitmap nv21ToBitmap(ByteBuffer byteBuffer, int i, int i2, int i3) throws IllegalAccessException, O1o01iO0liI0, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 5 */             byte[] bArrZzb = zzb(byteBufferToByteArray(byteBuffer), i, i2);
/* 11 */            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrZzb, 0, bArrZzb.length);
/* 23 */            return zza(bitmapDecodeByteArray, i3, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                }

                public ByteBuffer yuv420ThreePlanesToNV21(Image.Plane[] planeArr, int i, int i2) {
/* 1 */             int i3 = i * i2;
/* 8 */             byte[] bArr = new byte[OooioIOo1.I001i1lo1io(i3, 4, i3)];
/* 13 */            ByteBuffer buffer = planeArr[1].getBuffer();
/* 20 */            ByteBuffer buffer2 = planeArr[2].getBuffer();
/* 24 */            int iPosition = buffer2.position();
/* 28 */            int iLimit = buffer.limit();
/* 34 */            buffer2.position(iPosition + 1);
/* 39 */            buffer.limit(iLimit - 1);
/* 48 */            int i4 = (i3 + i3) / 4;
/* 62 */            boolean z = buffer2.remaining() == i4 + (-2) && buffer2.compareTo(buffer) == 0;
/* 63 */            buffer2.position(iPosition);
/* 66 */            buffer.limit(iLimit);
/* 69 */            if (z) {
/* 77 */                planeArr[0].getBuffer().get(bArr, 0, i3);
/* 82 */                ByteBuffer buffer3 = planeArr[1].getBuffer();
/* 92 */                planeArr[2].getBuffer().get(bArr, i3, 1);
/* 98 */                buffer3.get(bArr, i3 + 1, i4 - 1);
                    } else {
/* 108 */               zzc(planeArr[0], i, i2, bArr, 0, 1);
/* 116 */               zzc(planeArr[1], i, i2, bArr, i3 + 1, 2);
/* 125 */               zzc(planeArr[2], i, i2, bArr, i3, 2);
                    }
/* 128 */           return ByteBuffer.wrap(bArr);
                }
            }
