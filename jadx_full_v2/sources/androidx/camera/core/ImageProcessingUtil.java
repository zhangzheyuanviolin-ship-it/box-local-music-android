            package androidx.camera.core;

            import android.graphics.Bitmap;
            import android.media.Image;
            import android.media.ImageWriter;
            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.Locale;
            import p000.I000II;
            import p000.Ioi0ololOi;
            import p000.IoiIoOOoO;
            import p000.IoiIol00lIl;
            import p000.IoiIoli1i0o;
            import p000.IoiO11I0o0o1;
            import p000.IoiO1IO1I1i;
            import p000.IoiO1ilO;
            import p000.OOlli1l1lOlI;
            import p000.OoOil11Ol1o;
            import p000.l11I11lO;
            import p000.lII1OI11o1I;
            
            public abstract class ImageProcessingUtil {
                public static int I00000oIO;

                static {
/* 3 */             System.loadLibrary("image_processing_util_jni");
                }

                public static void I00000oIO(IoiO1IO1I1i ioiO1IO1I1i) {
/* 7 */             if (!I000II(ioiO1IO1I1i)) {
/* 11 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported format for YUV to RGB");
/* 14 */                return;
                    }
/* 15 */            int iI0001Ioi1lo = ioiO1IO1I1i.I0001Ioi1lo();
/* 19 */            int iI0000O = ioiO1IO1I1i.I0000O();
/* 30 */            int iI00000oIO = ioiO1IO1I1i.I00111O()[0].I00000oIO();
/* 41 */            int iI00000oIO2 = ioiO1IO1I1i.I00111O()[1].I00000oIO();
/* 52 */            int iI00000oIO3 = ioiO1IO1I1i.I00111O()[2].I00000oIO();
/* 62 */            int iI0010I0i = ioiO1IO1I1i.I00111O()[0].I0010I0i();
/* 72 */            int iI0010I0i2 = ioiO1IO1I1i.I00111O()[1].I0010I0i();
/* 113 */           if (nativeShiftPixel(ioiO1IO1I1i.I00111O()[0].I0000oI00(), iI00000oIO, ioiO1IO1I1i.I00111O()[1].I0000oI00(), iI00000oIO2, ioiO1IO1I1i.I00111O()[2].I0000oI00(), iI00000oIO3, iI0010I0i, iI0010I0i2, iI0001Ioi1lo, iI0000O, iI0010I0i, iI0010I0i2, iI0010I0i2) != 0) {
/* 117 */               l11I11lO.I00000oIO("ImageProcessingUtil", "One pixel shift for YUV failure");
                    }
                }

                public static IoiO1IO1I1i I00000oOI(OOlli1l1lOlI oOlli1l1lOlI, byte[] bArr) {
/* 12 */            lII1OI11o1I.I00000oOI(oOlli1l1lOlI.I0000Il00O() == 256);
/* 15 */            bArr.getClass();
/* 18 */            Surface surface = oOlli1l1lOlI.getSurface();
/* 22 */            surface.getClass();
/* 31 */            if (nativeWriteJpegToSurface(bArr, surface) != 0) {
/* 35 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Failed to enqueue JPEG image.");
/* 38 */                return null;
                    }
/* 40 */            IoiO1IO1I1i ioiO1IO1I1iI00000oOI = oOlli1l1lOlI.I00000oOI();
/* 44 */            if (ioiO1IO1I1iI00000oOI == null) {
/* 48 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Failed to get acquire JPEG image.");
                    }
/* 106 */           return ioiO1IO1I1iI00000oOI;
                }

                public static Bitmap I0000Il00O(IoiO1IO1I1i ioiO1IO1I1i) {
/* 8 */             if (ioiO1IO1I1i.getFormat() != 35) {
/* 136 */               I000II.I000iOII("Input image format must be YUV_420_888");
/* 7 */                 return null;
                    }
/* 10 */            int iI0001Ioi1lo = ioiO1IO1I1i.I0001Ioi1lo();
/* 14 */            int iI0000O = ioiO1IO1I1i.I0000O();
/* 25 */            int iI00000oIO = ioiO1IO1I1i.I00111O()[0].I00000oIO();
/* 36 */            int iI00000oIO2 = ioiO1IO1I1i.I00111O()[1].I00000oIO();
/* 47 */            int iI00000oIO3 = ioiO1IO1I1i.I00111O()[2].I00000oIO();
/* 57 */            int iI0010I0i = ioiO1IO1I1i.I00111O()[0].I0010I0i();
/* 67 */            int iI0010I0i2 = ioiO1IO1I1i.I00111O()[1].I0010I0i();
/* 81 */            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O(), Bitmap.Config.ARGB_8888);
/* 125 */           if (nativeConvertAndroid420ToBitmap(ioiO1IO1I1i.I00111O()[0].I0000oI00(), iI00000oIO, ioiO1IO1I1i.I00111O()[1].I0000oI00(), iI00000oIO2, ioiO1IO1I1i.I00111O()[2].I0000oI00(), iI00000oIO3, iI0010I0i, iI0010I0i2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iI0001Ioi1lo, iI0000O) == 0) {
/* 127 */               return bitmapCreateBitmap;
                    }
/* 130 */           OoOil11Ol1o.I000OiO("YUV to RGB conversion failed");
/* 7 */             return null;
                }

                public static Ioi0ololOi I0000O(IoiO1IO1I1i ioiO1IO1I1i, IoiO1ilO ioiO1ilO, ByteBuffer byteBuffer, int i, boolean z) {
/* 8 */             if (!I000II(ioiO1IO1I1i)) {
/* 12 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported format for YUV to RGB");
/* 5 */                 return null;
                    }
/* 16 */            System.currentTimeMillis();
/* 23 */            if (!I0001Ioi1lo(i)) {
/* 27 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
/* 5 */                 return null;
                    }
/* 31 */            Surface surface = ioiO1ilO.getSurface();
/* 35 */            int iI0001Ioi1lo = ioiO1IO1I1i.I0001Ioi1lo();
/* 39 */            int iI0000O = ioiO1IO1I1i.I0000O();
/* 50 */            int iI00000oIO = ioiO1IO1I1i.I00111O()[0].I00000oIO();
/* 61 */            int iI00000oIO2 = ioiO1IO1I1i.I00111O()[1].I00000oIO();
/* 72 */            int iI00000oIO3 = ioiO1IO1I1i.I00111O()[2].I00000oIO();
/* 82 */            int iI0010I0i = ioiO1IO1I1i.I00111O()[0].I0010I0i();
/* 92 */            int iI0010I0i2 = ioiO1IO1I1i.I00111O()[1].I0010I0i();
/* 162 */           if (nativeConvertAndroid420ToABGR(ioiO1IO1I1i.I00111O()[0].I0000oI00(), iI00000oIO, ioiO1IO1I1i.I00111O()[1].I0000oI00(), iI00000oIO2, ioiO1IO1I1i.I00111O()[2].I0000oI00(), iI00000oIO3, iI0010I0i, iI0010I0i2, surface, byteBuffer, iI0001Ioi1lo, iI0000O, z ? iI0010I0i : 0, z ? iI0010I0i2 : 0, z ? iI0010I0i2 : 0, i) != 0) {
/* 166 */               l11I11lO.I00000oIO("ImageProcessingUtil", "YUV to RGB conversion failure");
/* 5 */                 return null;
                    }
/* 177 */           if (Log.isLoggable("MH", 3)) {
/* 179 */               Locale locale = Locale.US;
/* 181 */               System.currentTimeMillis();
/* 184 */               l11I11lO.I0000O(3, "ImageProcessingUtil");
                        I00000oIO++;
                    }
/* 192 */           IoiO1IO1I1i ioiO1IO1I1iI00000oOI = ioiO1ilO.I00000oOI();
/* 196 */           if (ioiO1IO1I1iI00000oOI == null) {
/* 200 */               l11I11lO.I00000oIO("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
/* 5 */                 return null;
                    }
/* 206 */           Ioi0ololOi ioi0ololOi = new Ioi0ololOi(ioiO1IO1I1iI00000oOI, 1);
/* 211 */           IoiIoOOoO ioiIoOOoO = new IoiIoOOoO(0);
/* 216 */           ioiIoOOoO.I00iiI = ioiO1IO1I1i;
/* 218 */           VarHandle.storeStoreFence();
/* 221 */           ioi0ololOi.I00000oIO(ioiIoOOoO);
/* 399 */           return ioi0ololOi;
                }

                public static void I0000oI00(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
/* 17 */            nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
                }

                public static boolean I0001Ioi1lo(int i) {
                    return i == 0 || i == 90 || i == 180 || i == 270;
                }

                public static boolean I000II(IoiO1IO1I1i ioiO1IO1I1i) {
                    return ioiO1IO1I1i.getFormat() == 35 && ioiO1IO1I1i.I00111O().length == 3;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Ioi0ololOi I000O01llI0(IoiO1IO1I1i ioiO1IO1I1i, IoiO1ilO ioiO1ilO, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
                    Ioi0ololOi ioi0ololOi;
/* 8 */             if (!I000II(ioiO1IO1I1i)) {
/* 12 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported format for rotate YUV");
/* 5 */                 return null;
                    }
/* 20 */            if (!I0001Ioi1lo(i)) {
/* 24 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
/* 5 */                 return null;
                    }
/* 28 */            if (i > 0) {
/* 30 */                int iI0001Ioi1lo = ioiO1IO1I1i.I0001Ioi1lo();
/* 34 */                int iI0000O = ioiO1IO1I1i.I0000O();
/* 45 */                int iI00000oIO = ioiO1IO1I1i.I00111O()[0].I00000oIO();
/* 56 */                int iI00000oIO2 = ioiO1IO1I1i.I00111O()[1].I00000oIO();
/* 67 */                int iI00000oIO3 = ioiO1IO1I1i.I00111O()[2].I00000oIO();
/* 77 */                int iI0010I0i = ioiO1IO1I1i.I00111O()[1].I0010I0i();
/* 81 */                Image imageDequeueInputImage = imageWriter.dequeueInputImage();
/* 85 */                if (imageDequeueInputImage == null) {
/* 87 */                    ioi0ololOi = null;
                        } else {
/* 217 */                   ioi0ololOi = null;
/* 243 */                   if (nativeRotateYUV(ioiO1IO1I1i.I00111O()[0].I0000oI00(), iI00000oIO, ioiO1IO1I1i.I00111O()[1].I0000oI00(), iI00000oIO2, ioiO1IO1I1i.I00111O()[2].I0000oI00(), iI00000oIO3, iI0010I0i, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, iI0001Ioi1lo, iI0000O, i) == 0) {
/* 248 */                       imageWriter.queueInputImage(imageDequeueInputImage);
/* 251 */                       IoiO1IO1I1i ioiO1IO1I1iI00000oOI = ioiO1ilO.I00000oOI();
/* 255 */                       if (ioiO1IO1I1iI00000oOI == null) {
/* 259 */                           l11I11lO.I00000oIO("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
/* 217 */                           return null;
                                }
/* 265 */                       Ioi0ololOi ioi0ololOi2 = new Ioi0ololOi(ioiO1IO1I1iI00000oOI, 1);
/* 270 */                       IoiIoOOoO ioiIoOOoO = new IoiIoOOoO(1);
/* 275 */                       ioiIoOOoO.I00iiI = ioiO1IO1I1i;
/* 277 */                       VarHandle.storeStoreFence();
/* 280 */                       ioi0ololOi2.I00000oIO(ioiIoOOoO);
/* 283 */                       return ioi0ololOi2;
                            }
                        }
                    }
/* 286 */           l11I11lO.I00000oIO("ImageProcessingUtil", "rotate YUV failure");
/* 965 */           return ioi0ololOi;
                }

                public static Ioi0ololOi I000OOo1O(IoiO1IO1I1i ioiO1IO1I1i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
/* 13 */            if (!I000II(ioiO1IO1I1i)) {
/* 17 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported format for rotate YUV");
/* 11 */                return null;
                    }
/* 25 */            if (!I0001Ioi1lo(i)) {
/* 29 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
/* 11 */                return null;
                    }
/* 36 */            if (i == 0 && ioiO1IO1I1i.I00111O().length == 3 && ioiO1IO1I1i.I00111O()[1].I0010I0i() == 2 && nativeGetYUVImageVUOff(ioiO1IO1I1i.I00111O()[2].I0000oI00(), ioiO1IO1I1i.I00111O()[1].I0000oI00()) == -1) {
/* 11 */                return null;
                    }
/* 87 */            int i2 = i % 180;
/* 97 */            int iI0001Ioi1lo = i2 == 0 ? ioiO1IO1I1i.I0001Ioi1lo() : ioiO1IO1I1i.I0000O();
/* 109 */           int iI0000O = i2 == 0 ? ioiO1IO1I1i.I0000O() : ioiO1IO1I1i.I0001Ioi1lo();
/* 117 */           ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
/* 214 */           int i3 = iI0000O;
/* 245 */           if (nativeRotateYUV(ioiO1IO1I1i.I00111O()[0].I0000oI00(), ioiO1IO1I1i.I00111O()[0].I00000oIO(), ioiO1IO1I1i.I00111O()[1].I0000oI00(), ioiO1IO1I1i.I00111O()[1].I00000oIO(), ioiO1IO1I1i.I00111O()[2].I0000oI00(), ioiO1IO1I1i.I00111O()[2].I00000oIO(), ioiO1IO1I1i.I00111O()[2].I0010I0i(), byteBuffer4, iI0001Ioi1lo, 1, byteBufferNativeNewDirectByteBuffer, iI0001Ioi1lo, 2, byteBuffer5, iI0001Ioi1lo, 2, byteBuffer, byteBuffer2, byteBuffer3, ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O(), i) != 0) {
/* 249 */               l11I11lO.I00000oIO("ImageProcessingUtil", "rotate YUV failure");
/* 11 */                return null;
                    }
/* 259 */           IoiIoli1i0o ioiIoli1i0o = new IoiIoli1i0o(ioiO1IO1I1i);
/* 264 */           IoiIol00lIl ioiIol00lIl = new IoiIol00lIl();
/* 267 */           ioiIol00lIl.I00iiO = iI0001Ioi1lo;
/* 271 */           ioiIol00lIl.I00iiI = byteBuffer4;
/* 273 */           VarHandle.storeStoreFence();
/* 296 */           ioiIoli1i0o.I00iio = new IoiO11I0o0o1[]{ioiIol00lIl, new IoiIol00lIl(iI0001Ioi1lo, byteBufferNativeNewDirectByteBuffer), new IoiIol00lIl(iI0001Ioi1lo, byteBuffer5)};
/* 298 */           ioiIoli1i0o.I00ilI0I1 = iI0001Ioi1lo;
/* 302 */           ioiIoli1i0o.I00ilO0 = i3;
/* 304 */           VarHandle.storeStoreFence();
/* 307 */           return new Ioi0ololOi(ioiIoli1i0o, 1);
                }

                public static void I000OiO(byte[] bArr, Surface surface) {
/* 1 */             surface.getClass();
/* 8 */             if (nativeWriteJpegToSurface(bArr, surface) != 0) {
/* 14 */                l11I11lO.I00000oIO("ImageProcessingUtil", "Failed to enqueue JPEG image.");
                    }
                }

                private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

                private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

                private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

                public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

                public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

                private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

                private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

                private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
            }
