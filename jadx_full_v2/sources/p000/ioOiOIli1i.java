            package p000;

            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.graphics.Rect;
            import android.graphics.YuvImage;
            import android.os.Build;
            import androidx.camera.core.ImageProcessingUtil;
            import java.io.BufferedOutputStream;
            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Map;
            
            public abstract class ioOiOIli1i {
                public static Bitmap I00000oIO(IoiO1IO1I1i ioiO1IO1I1i) {
/* 1 */             int format = ioiO1IO1I1i.getFormat();
/* 7 */             if (format == 1) {
/* 120 */               Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O(), Bitmap.Config.ARGB_8888);
/* 134 */               ioiO1IO1I1i.I00111O()[0].I0000oI00().rewind();
/* 157 */               ImageProcessingUtil.I0000oI00(bitmapCreateBitmap, ioiO1IO1I1i.I00111O()[0].I0000oI00(), ioiO1IO1I1i.I00111O()[0].I00000oIO());
/* 168 */               return bitmapCreateBitmap;
                    }
/* 11 */            if (format == 35) {
/* 105 */               return ImageProcessingUtil.I0000Il00O(ioiO1IO1I1i);
                    }
/* 17 */            if (format != 256 && format != 4101) {
/* 50 */                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ioiO1IO1I1i.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
                    }
/* 60 */            if (!I00000oOI(ioiO1IO1I1i.getFormat())) {
/* 101 */               IioIoO10iOiI.I0001Ioi1lo(ioiO1IO1I1i.getFormat(), "Incorrect image format of the input image proxy: ");
/* 59 */                return null;
                    }
/* 68 */            ByteBuffer byteBufferI0000oI00 = ioiO1IO1I1i.I00111O()[0].I0000oI00();
/* 72 */            int iCapacity = byteBufferI0000oI00.capacity();
/* 76 */            byte[] bArr = new byte[iCapacity];
/* 78 */            byteBufferI0000oI00.rewind();
/* 81 */            byteBufferI0000oI00.get(bArr);
/* 84 */            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
/* 88 */            if (bitmapDecodeByteArray != null) {
/* 90 */                return bitmapDecodeByteArray;
                    }
/* 93 */            OoOil11Ol1o.I000OiO("Decode jpeg byte array failed");
/* 59 */            return null;
                }

                public static boolean I00000oOI(int i) {
                    return i == 256 || i == 4101;
                }

                public static byte[] I0000Il00O(IoiO1IO1I1i ioiO1IO1I1i, Rect rect, int i, int i2) {
/* 7 */             if (ioiO1IO1I1i.getFormat() != 35) {
/* 651 */               IioIoO10iOiI.I0001Ioi1lo(ioiO1IO1I1i.getFormat(), "Incorrect image format of the input image proxy: ");
/* 654 */               return null;
                    }
/* 14 */            IoiO11I0o0o1 ioiO11I0o0o1 = ioiO1IO1I1i.I00111O()[0];
/* 21 */            IoiO11I0o0o1 ioiO11I0o0o12 = ioiO1IO1I1i.I00111O()[1];
/* 27 */            int i3 = 2;
/* 28 */            IoiO11I0o0o1 ioiO11I0o0o13 = ioiO1IO1I1i.I00111O()[2];
/* 30 */            ByteBuffer byteBufferI0000oI00 = ioiO11I0o0o1.I0000oI00();
/* 34 */            ByteBuffer byteBufferI0000oI002 = ioiO11I0o0o12.I0000oI00();
/* 38 */            ByteBuffer byteBufferI0000oI003 = ioiO11I0o0o13.I0000oI00();
/* 42 */            byteBufferI0000oI00.rewind();
/* 45 */            byteBufferI0000oI002.rewind();
/* 48 */            byteBufferI0000oI003.rewind();
/* 51 */            int iRemaining = byteBufferI0000oI00.remaining();
/* 66 */            byte[] bArr = new byte[((ioiO1IO1I1i.I0000O() * ioiO1IO1I1i.I0001Ioi1lo()) / 2) + iRemaining];
/* 69 */            int iI0001Ioi1lo = 0;
/* 74 */            for (int i4 = 0; i4 < ioiO1IO1I1i.I0000O(); i4++) {
/* 80 */                byteBufferI0000oI00.get(bArr, iI0001Ioi1lo, ioiO1IO1I1i.I0001Ioi1lo());
/* 87 */                iI0001Ioi1lo += ioiO1IO1I1i.I0001Ioi1lo();
/* 106 */               byteBufferI0000oI00.position(Math.min(iRemaining, ioiO11I0o0o1.I00000oIO() + (byteBufferI0000oI00.position() - ioiO1IO1I1i.I0001Ioi1lo())));
                    }
/* 116 */           int iI0000O = ioiO1IO1I1i.I0000O() / 2;
/* 121 */           int iI0001Ioi1lo2 = ioiO1IO1I1i.I0001Ioi1lo() / 2;
/* 122 */           int iI00000oIO = ioiO11I0o0o13.I00000oIO();
/* 126 */           int iI00000oIO2 = ioiO11I0o0o12.I00000oIO();
/* 130 */           int iI0010I0i = ioiO11I0o0o13.I0010I0i();
/* 134 */           int iI0010I0i2 = ioiO11I0o0o12.I0010I0i();
/* 138 */           byte[] bArr2 = new byte[iI00000oIO];
/* 140 */           byte[] bArr3 = new byte[iI00000oIO2];
/* 142 */           int i5 = 0;
/* 143 */           while (i5 < iI0000O) {
/* 145 */               int i6 = i3;
/* 155 */               byteBufferI0000oI003.get(bArr2, 0, Math.min(iI00000oIO, byteBufferI0000oI003.remaining()));
/* 166 */               byteBufferI0000oI002.get(bArr3, 0, Math.min(iI00000oIO2, byteBufferI0000oI002.remaining()));
/* 170 */               int i7 = 0;
/* 172 */               int i8 = 0;
/* 174 */               for (int i9 = 0; i9 < iI0001Ioi1lo2; i9++) {
/* 176 */                   int i10 = iI0001Ioi1lo + 1;
/* 180 */                   bArr[iI0001Ioi1lo] = bArr2[i7];
/* 182 */                   iI0001Ioi1lo += 2;
/* 186 */                   bArr[i10] = bArr3[i8];
/* 188 */                   i7 += iI0010I0i;
/* 190 */                   i8 += iI0010I0i2;
                        }
/* 195 */               i5++;
/* 197 */               i3 = i6;
                    }
/* 200 */           int i11 = i3;
/* 216 */           YuvImage yuvImage = new YuvImage(bArr, 17, ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O(), null);
/* 221 */           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 226 */           Il1O11[] il1O11Arr = Il1IO1oOioO0.I0000Il00O;
/* 230 */           ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
/* 232 */           Il1IIOoI il1IIOoI = new Il1IIOoI();
/* 237 */           Il1I1I1Io il1I1I1Io = new Il1I1I1Io(1);
/* 240 */           il1I1I1Io.I00000oOI = 0;
/* 242 */           ArrayList list = Collections.list(il1I1I1Io);
/* 246 */           il1IIOoI.I00000oIO = list;
/* 248 */           il1IIOoI.I00000oOI = byteOrder;
/* 250 */           VarHandle.storeStoreFence();
/* 259 */           il1IIOoI.I0000Il00O("Orientation", String.valueOf(1), list);
/* 266 */           il1IIOoI.I0000Il00O("XResolution", "72/1", list);
/* 271 */           il1IIOoI.I0000Il00O("YResolution", "72/1", list);
/* 280 */           il1IIOoI.I0000Il00O("ResolutionUnit", String.valueOf(i11), list);
/* 289 */           il1IIOoI.I0000Il00O("YCbCrPositioning", String.valueOf(1), list);
/* 296 */           il1IIOoI.I0000Il00O("Make", Build.MANUFACTURER, list);
/* 303 */           il1IIOoI.I0000Il00O("Model", Build.MODEL, list);
/* 310 */           if (ioiO1IO1I1i.I00i0oil() != null) {
/* 316 */               ioiO1IO1I1i.I00i0oil().I00000oIO(il1IIOoI);
                    }
/* 321 */           il1IIOoI.I0000O(i2);
/* 334 */           il1IIOoI.I0000Il00O("ImageWidth", String.valueOf(ioiO1IO1I1i.I0001Ioi1lo()), list);
/* 347 */           il1IIOoI.I0000Il00O("ImageLength", String.valueOf(ioiO1IO1I1i.I0000O()), list);
/* 352 */           Il1I1I1lI1O1 il1I1I1lI1O1 = new Il1I1I1lI1O1();
/* 359 */           il1I1I1lI1O1.I00000oIO = Collections.enumeration(list);
/* 361 */           VarHandle.storeStoreFence();
/* 364 */           ArrayList list2 = Collections.list(il1I1I1lI1O1);
/* 378 */           if (!((Map) list2.get(1)).isEmpty()) {
/* 386 */               il1IIOoI.I00000oOI("ExposureProgram", String.valueOf(0), list2);
/* 393 */               il1IIOoI.I00000oOI("ExifVersion", "0230", list2);
/* 400 */               il1IIOoI.I00000oOI("ComponentsConfiguration", Il1IO1oOioO0.I0001Ioi1lo, list2);
/* 409 */               il1IIOoI.I00000oOI("MeteringMode", String.valueOf(0), list2);
/* 418 */               il1IIOoI.I00000oOI("LightSource", String.valueOf(0), list2);
/* 425 */               il1IIOoI.I00000oOI("FlashpixVersion", "0100", list2);
/* 434 */               il1IIOoI.I00000oOI("FocalPlaneResolutionUnit", String.valueOf(i11), list2);
/* 444 */               il1IIOoI.I00000oOI("FileSource", String.valueOf(3), list2);
/* 453 */               il1IIOoI.I00000oOI("SceneType", String.valueOf(1), list2);
/* 462 */               il1IIOoI.I00000oOI("CustomRendered", String.valueOf(0), list2);
/* 471 */               il1IIOoI.I00000oOI("SceneCaptureType", String.valueOf(0), list2);
/* 480 */               il1IIOoI.I00000oOI("Contrast", String.valueOf(0), list2);
/* 489 */               il1IIOoI.I00000oOI("Saturation", String.valueOf(0), list2);
/* 498 */               il1IIOoI.I00000oOI("Sharpness", String.valueOf(0), list2);
                    }
/* 513 */           if (!((Map) list2.get(i11)).isEmpty()) {
/* 519 */               il1IIOoI.I00000oOI("GPSVersionID", "2300", list2);
/* 526 */               il1IIOoI.I00000oOI("GPSSpeedRef", "K", list2);
/* 533 */               il1IIOoI.I00000oOI("GPSTrackRef", "T", list2);
/* 538 */               il1IIOoI.I00000oOI("GPSImgDirectionRef", "T", list2);
/* 543 */               il1IIOoI.I00000oOI("GPSDestBearingRef", "T", list2);
/* 548 */               il1IIOoI.I00000oOI("GPSDestDistanceRef", "K", list2);
                    }
/* 553 */           Il1IO1oOioO0 il1IO1oOioO0 = new Il1IO1oOioO0();
/* 568 */           lII1OI11o1I.I0000oI00("Malformed attributes list. Number of IFDs mismatch.", list2.size() == 4);
/* 571 */           il1IO1oOioO0.I00000oOI = byteOrder;
/* 573 */           il1IO1oOioO0.I00000oIO = list2;
/* 575 */           VarHandle.storeStoreFence();
/* 585 */           Il1O0i il1O0i = new Il1O0i(new BufferedOutputStream(byteArrayOutputStream, 65536));
/* 590 */           il1O0i.I00iiI = new byte[1];
/* 596 */           il1O0i.I00iiO = ByteBuffer.allocate(4);
/* 598 */           il1O0i.I00iio = 0;
/* 600 */           il1O0i.I00iOIl = il1IO1oOioO0;
/* 602 */           VarHandle.storeStoreFence();
/* 630 */           if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, ioiO1IO1I1i.I0001Ioi1lo(), ioiO1IO1I1i.I0000O()) : rect, i, il1O0i)) {
/* 632 */               return byteArrayOutputStream.toByteArray();
                    }
/* 644 */           throw new IoiOo0("YuvImage failed to encode jpeg.");
                }
            }
