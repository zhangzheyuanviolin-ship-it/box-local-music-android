            package p000;

            import android.content.res.AssetManager;
            import android.media.MediaMetadataRetriever;
            import android.system.Os;
            import android.system.OsConstants;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedInputStream;
            import java.io.EOFException;
            import java.io.FileDescriptor;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.text.SimpleDateFormat;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TimeZone;
            import java.util.regex.Pattern;
            import java.util.zip.CRC32;
            
            public final class Il1Ilio1Ol1 {
                public static final boolean I000oI1ioi = Log.isLoggable("ExifInterface", 3);
                public static final List I00100l0 = Arrays.asList(1, 6, 3, 8);
                public static final List I00100o1O0lo = Arrays.asList(2, 7, 4, 5);
                public static final int[] I0010I0i = {8, 8, 8};
                public static final int[] I0010o = {8};
                public static final byte[] I00111O = {-1, -40, -1};
                public static final byte[] I001IIilI0O = {102, 116, 121, 112};
                public static final byte[] I001IO000 = {109, 105, 102, 49};
                public static final byte[] I001i1O0Ol = {104, 101, 105, 99};
                public static final byte[] I001i1lo1io = {97, 118, 105, 102};
                public static final byte[] I001iOo1i0O = {97, 118, 105, 115};
                public static final byte[] I001l0I00 = {79, 76, 89, 77, 80, 0};
                public static final byte[] I001lIiIIo1O = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
                public static final byte[] I001lllioOl = {-119, 80, 78, 71, 13, 10, 26, 10};
                public static final byte[] I001lloI = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
                public static final byte[] I00II0Ol1O0l = {82, 73, 70, 70};
                public static final byte[] I00II0oii1o = {87, 69, 66, 80};
                public static final byte[] I00IO1 = {69, 88, 73, 70};
                public static final String[] I00IO1oi11O;
                public static final int[] I00IOO;
                public static final byte[] I00IioO0OiOi;
                public static final Il1Iio0oIiiO I00IlilI0i0i;
                public static final Il1Iio0oIiiO[][] I00Io1lO;
                public static final Il1Iio0oIiiO[] I00Io1o110i;
                public static final HashMap[] I00IoIO0lI;
                public static final HashMap[] I00IoO0;
                public static final Set I00IoiI;
                public static final HashMap I00Iooi00oi;
                public static final Charset I00O0i0ii;
                public static final byte[] I00O0o1oo;
                public static final byte[] I00O10llo;
                public final String I00000oIO;
                public final FileDescriptor I00000oOI;
                public final AssetManager.AssetInputStream I0000Il00O;
                public int I0000O;
                public final boolean I0000oI00;
                public final HashMap[] I0001Ioi1lo;
                public final HashSet I000II;
                public ByteOrder I000O01llI0;
                public boolean I000OOo1O;
                public int I000OiO;
                public int I000iOII;
                public int I000l1;
                public int I000lI;
                public Il1Iii0ii1oo I000o00OoI0I;

                static {
/* 184 */           "VP8X".getBytes(Charset.defaultCharset());
/* 193 */           "VP8L".getBytes(Charset.defaultCharset());
/* 202 */           "VP8 ".getBytes(Charset.defaultCharset());
/* 211 */           "ANIM".getBytes(Charset.defaultCharset());
/* 220 */           "ANMF".getBytes(Charset.defaultCharset());
/* 255 */           I00IO1oi11O = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
/* 264 */           I00IOO = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
/* 271 */           I00IioO0OiOi = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
/* 764 */           Il1Iio0oIiiO[] il1Iio0oIiiOArr = {new Il1Iio0oIiiO("NewSubfileType", 254, 4), new Il1Iio0oIiiO("SubfileType", 255, 4), new Il1Iio0oIiiO(Barcode.FORMAT_QR_CODE, 3, 4, "ImageWidth"), new Il1Iio0oIiiO(257, 3, 4, "ImageLength"), new Il1Iio0oIiiO("BitsPerSample", 258, 3), new Il1Iio0oIiiO("Compression", 259, 3), new Il1Iio0oIiiO("PhotometricInterpretation", 262, 3), new Il1Iio0oIiiO("ImageDescription", 270, 2), new Il1Iio0oIiiO("Make", 271, 2), new Il1Iio0oIiiO("Model", 272, 2), new Il1Iio0oIiiO(273, 3, 4, "StripOffsets"), new Il1Iio0oIiiO("Orientation", 274, 3), new Il1Iio0oIiiO("SamplesPerPixel", 277, 3), new Il1Iio0oIiiO(278, 3, 4, "RowsPerStrip"), new Il1Iio0oIiiO(279, 3, 4, "StripByteCounts"), new Il1Iio0oIiiO("XResolution", 282, 5), new Il1Iio0oIiiO("YResolution", 283, 5), new Il1Iio0oIiiO("PlanarConfiguration", 284, 3), new Il1Iio0oIiiO("ResolutionUnit", 296, 3), new Il1Iio0oIiiO("TransferFunction", 301, 3), new Il1Iio0oIiiO("Software", 305, 2), new Il1Iio0oIiiO("DateTime", 306, 2), new Il1Iio0oIiiO("Artist", 315, 2), new Il1Iio0oIiiO("WhitePoint", 318, 5), new Il1Iio0oIiiO("PrimaryChromaticities", 319, 5), new Il1Iio0oIiiO("SubIFDPointer", 330, 4), new Il1Iio0oIiiO("JPEGInterchangeFormat", 513, 4), new Il1Iio0oIiiO("JPEGInterchangeFormatLength", 514, 4), new Il1Iio0oIiiO("YCbCrCoefficients", 529, 5), new Il1Iio0oIiiO("YCbCrSubSampling", 530, 3), new Il1Iio0oIiiO("YCbCrPositioning", 531, 3), new Il1Iio0oIiiO("ReferenceBlackWhite", 532, 5), new Il1Iio0oIiiO("Copyright", 33432, 2), new Il1Iio0oIiiO("ExifIFDPointer", 34665, 4), new Il1Iio0oIiiO("GPSInfoIFDPointer", 34853, 4), new Il1Iio0oIiiO("SensorTopBorder", 4, 4), new Il1Iio0oIiiO("SensorLeftBorder", 5, 4), new Il1Iio0oIiiO("SensorBottomBorder", 6, 4), new Il1Iio0oIiiO("SensorRightBorder", 7, 4), new Il1Iio0oIiiO("ISO", 23, 3), new Il1Iio0oIiiO("JpgFromRaw", 46, 7), new Il1Iio0oIiiO("Xmp", 700, 1)};
/* 1703 */          Il1Iio0oIiiO[] il1Iio0oIiiOArr2 = {new Il1Iio0oIiiO("ExposureTime", 33434, 5), new Il1Iio0oIiiO("FNumber", 33437, 5), new Il1Iio0oIiiO("ExposureProgram", 34850, 3), new Il1Iio0oIiiO("SpectralSensitivity", 34852, 2), new Il1Iio0oIiiO("PhotographicSensitivity", 34855, 3), new Il1Iio0oIiiO("OECF", 34856, 7), new Il1Iio0oIiiO("SensitivityType", 34864, 3), new Il1Iio0oIiiO("StandardOutputSensitivity", 34865, 4), new Il1Iio0oIiiO("RecommendedExposureIndex", 34866, 4), new Il1Iio0oIiiO("ISOSpeed", 34867, 4), new Il1Iio0oIiiO("ISOSpeedLatitudeyyy", 34868, 4), new Il1Iio0oIiiO("ISOSpeedLatitudezzz", 34869, 4), new Il1Iio0oIiiO("ExifVersion", 36864, 2), new Il1Iio0oIiiO("DateTimeOriginal", 36867, 2), new Il1Iio0oIiiO("DateTimeDigitized", 36868, 2), new Il1Iio0oIiiO("OffsetTime", 36880, 2), new Il1Iio0oIiiO("OffsetTimeOriginal", 36881, 2), new Il1Iio0oIiiO("OffsetTimeDigitized", 36882, 2), new Il1Iio0oIiiO("ComponentsConfiguration", 37121, 7), new Il1Iio0oIiiO("CompressedBitsPerPixel", 37122, 5), new Il1Iio0oIiiO("ShutterSpeedValue", 37377, 10), new Il1Iio0oIiiO("ApertureValue", 37378, 5), new Il1Iio0oIiiO("BrightnessValue", 37379, 10), new Il1Iio0oIiiO("ExposureBiasValue", 37380, 10), new Il1Iio0oIiiO("MaxApertureValue", 37381, 5), new Il1Iio0oIiiO("SubjectDistance", 37382, 5), new Il1Iio0oIiiO("MeteringMode", 37383, 3), new Il1Iio0oIiiO("LightSource", 37384, 3), new Il1Iio0oIiiO("Flash", 37385, 3), new Il1Iio0oIiiO("FocalLength", 37386, 5), new Il1Iio0oIiiO("SubjectArea", 37396, 3), new Il1Iio0oIiiO("MakerNote", 37500, 7), new Il1Iio0oIiiO("UserComment", 37510, 7), new Il1Iio0oIiiO("SubSecTime", 37520, 2), new Il1Iio0oIiiO("SubSecTimeOriginal", 37521, 2), new Il1Iio0oIiiO("SubSecTimeDigitized", 37522, 2), new Il1Iio0oIiiO("FlashpixVersion", 40960, 7), new Il1Iio0oIiiO("ColorSpace", 40961, 3), new Il1Iio0oIiiO(40962, 3, 4, "PixelXDimension"), new Il1Iio0oIiiO(40963, 3, 4, "PixelYDimension"), new Il1Iio0oIiiO("RelatedSoundFile", 40964, 2), new Il1Iio0oIiiO("InteroperabilityIFDPointer", 40965, 4), new Il1Iio0oIiiO("FlashEnergy", 41483, 5), new Il1Iio0oIiiO("SpatialFrequencyResponse", 41484, 7), new Il1Iio0oIiiO("FocalPlaneXResolution", 41486, 5), new Il1Iio0oIiiO("FocalPlaneYResolution", 41487, 5), new Il1Iio0oIiiO("FocalPlaneResolutionUnit", 41488, 3), new Il1Iio0oIiiO("SubjectLocation", 41492, 3), new Il1Iio0oIiiO("ExposureIndex", 41493, 5), new Il1Iio0oIiiO("SensingMethod", 41495, 3), new Il1Iio0oIiiO("FileSource", 41728, 7), new Il1Iio0oIiiO("SceneType", 41729, 7), new Il1Iio0oIiiO("CFAPattern", 41730, 7), new Il1Iio0oIiiO("CustomRendered", 41985, 3), new Il1Iio0oIiiO("ExposureMode", 41986, 3), new Il1Iio0oIiiO("WhiteBalance", 41987, 3), new Il1Iio0oIiiO("DigitalZoomRatio", 41988, 5), new Il1Iio0oIiiO("FocalLengthIn35mmFilm", 41989, 3), new Il1Iio0oIiiO("SceneCaptureType", 41990, 3), new Il1Iio0oIiiO("GainControl", 41991, 3), new Il1Iio0oIiiO("Contrast", 41992, 3), new Il1Iio0oIiiO("Saturation", 41993, 3), new Il1Iio0oIiiO("Sharpness", 41994, 3), new Il1Iio0oIiiO("DeviceSettingDescription", 41995, 7), new Il1Iio0oIiiO("SubjectDistanceRange", 41996, 3), new Il1Iio0oIiiO("ImageUniqueID", 42016, 2), new Il1Iio0oIiiO("CameraOwnerName", 42032, 2), new Il1Iio0oIiiO("BodySerialNumber", 42033, 2), new Il1Iio0oIiiO("LensSpecification", 42034, 5), new Il1Iio0oIiiO("LensMake", 42035, 2), new Il1Iio0oIiiO("LensModel", 42036, 2), new Il1Iio0oIiiO("Gamma", 42240, 5), new Il1Iio0oIiiO("DNGVersion", 50706, 1), new Il1Iio0oIiiO(50720, 3, 4, "DefaultCropSize")};
/* 2079 */          Il1Iio0oIiiO[] il1Iio0oIiiOArr3 = {new Il1Iio0oIiiO("GPSVersionID", 0, 1), new Il1Iio0oIiiO("GPSLatitudeRef", 1, 2), new Il1Iio0oIiiO(2, 5, 10, "GPSLatitude"), new Il1Iio0oIiiO("GPSLongitudeRef", 3, 2), new Il1Iio0oIiiO(4, 5, 10, "GPSLongitude"), new Il1Iio0oIiiO("GPSAltitudeRef", 5, 1), new Il1Iio0oIiiO("GPSAltitude", 6, 5), new Il1Iio0oIiiO("GPSTimeStamp", 7, 5), new Il1Iio0oIiiO("GPSSatellites", 8, 2), new Il1Iio0oIiiO("GPSStatus", 9, 2), new Il1Iio0oIiiO("GPSMeasureMode", 10, 2), new Il1Iio0oIiiO("GPSDOP", 11, 5), new Il1Iio0oIiiO("GPSSpeedRef", 12, 2), new Il1Iio0oIiiO("GPSSpeed", 13, 5), new Il1Iio0oIiiO("GPSTrackRef", 14, 2), new Il1Iio0oIiiO("GPSTrack", 15, 5), new Il1Iio0oIiiO("GPSImgDirectionRef", 16, 2), new Il1Iio0oIiiO("GPSImgDirection", 17, 5), new Il1Iio0oIiiO("GPSMapDatum", 18, 2), new Il1Iio0oIiiO("GPSDestLatitudeRef", 19, 2), new Il1Iio0oIiiO("GPSDestLatitude", 20, 5), new Il1Iio0oIiiO("GPSDestLongitudeRef", 21, 2), new Il1Iio0oIiiO("GPSDestLongitude", 22, 5), new Il1Iio0oIiiO("GPSDestBearingRef", 23, 2), new Il1Iio0oIiiO("GPSDestBearing", 24, 5), new Il1Iio0oIiiO("GPSDestDistanceRef", 25, 2), new Il1Iio0oIiiO("GPSDestDistance", 26, 5), new Il1Iio0oIiiO("GPSProcessingMethod", 27, 7), new Il1Iio0oIiiO("GPSAreaInformation", 28, 7), new Il1Iio0oIiiO("GPSDateStamp", 29, 2), new Il1Iio0oIiiO("GPSDifferential", 30, 3), new Il1Iio0oIiiO("GPSHPositioningError", 31, 5)};
/* 2092 */          Il1Iio0oIiiO[] il1Iio0oIiiOArr4 = {new Il1Iio0oIiiO("InteroperabilityIndex", 1, 2)};
/* 2504 */          Il1Iio0oIiiO[] il1Iio0oIiiOArr5 = {new Il1Iio0oIiiO("NewSubfileType", 254, 4), new Il1Iio0oIiiO("SubfileType", 255, 4), new Il1Iio0oIiiO(Barcode.FORMAT_QR_CODE, 3, 4, "ThumbnailImageWidth"), new Il1Iio0oIiiO(257, 3, 4, "ThumbnailImageLength"), new Il1Iio0oIiiO("BitsPerSample", 258, 3), new Il1Iio0oIiiO("Compression", 259, 3), new Il1Iio0oIiiO("PhotometricInterpretation", 262, 3), new Il1Iio0oIiiO("ImageDescription", 270, 2), new Il1Iio0oIiiO("Make", 271, 2), new Il1Iio0oIiiO("Model", 272, 2), new Il1Iio0oIiiO(273, 3, 4, "StripOffsets"), new Il1Iio0oIiiO("ThumbnailOrientation", 274, 3), new Il1Iio0oIiiO("SamplesPerPixel", 277, 3), new Il1Iio0oIiiO(278, 3, 4, "RowsPerStrip"), new Il1Iio0oIiiO(279, 3, 4, "StripByteCounts"), new Il1Iio0oIiiO("XResolution", 282, 5), new Il1Iio0oIiiO("YResolution", 283, 5), new Il1Iio0oIiiO("PlanarConfiguration", 284, 3), new Il1Iio0oIiiO("ResolutionUnit", 296, 3), new Il1Iio0oIiiO("TransferFunction", 301, 3), new Il1Iio0oIiiO("Software", 305, 2), new Il1Iio0oIiiO("DateTime", 306, 2), new Il1Iio0oIiiO("Artist", 315, 2), new Il1Iio0oIiiO("WhitePoint", 318, 5), new Il1Iio0oIiiO("PrimaryChromaticities", 319, 5), new Il1Iio0oIiiO("SubIFDPointer", 330, 4), new Il1Iio0oIiiO("JPEGInterchangeFormat", 513, 4), new Il1Iio0oIiiO("JPEGInterchangeFormatLength", 514, 4), new Il1Iio0oIiiO("YCbCrCoefficients", 529, 5), new Il1Iio0oIiiO("YCbCrSubSampling", 530, 3), new Il1Iio0oIiiO("YCbCrPositioning", 531, 3), new Il1Iio0oIiiO("ReferenceBlackWhite", 532, 5), new Il1Iio0oIiiO("Copyright", 33432, 2), new Il1Iio0oIiiO("ExifIFDPointer", 34665, 4), new Il1Iio0oIiiO("GPSInfoIFDPointer", 34853, 4), new Il1Iio0oIiiO("DNGVersion", 50706, 1), new Il1Iio0oIiiO(50720, 3, 4, "DefaultCropSize")};
/* 2515 */          I00IlilI0i0i = new Il1Iio0oIiiO("StripOffsets", 273, 3);
/* 2604 */          I00Io1lO = new Il1Iio0oIiiO[][]{il1Iio0oIiiOArr, il1Iio0oIiiOArr2, il1Iio0oIiiOArr3, il1Iio0oIiiOArr4, il1Iio0oIiiOArr5, il1Iio0oIiiOArr, new Il1Iio0oIiiO[]{new Il1Iio0oIiiO("ThumbnailImage", Barcode.FORMAT_QR_CODE, 7), new Il1Iio0oIiiO("CameraSettingsIFDPointer", 8224, 4), new Il1Iio0oIiiO("ImageProcessingIFDPointer", 8256, 4)}, new Il1Iio0oIiiO[]{new Il1Iio0oIiiO("PreviewImageStart", 257, 4), new Il1Iio0oIiiO("PreviewImageLength", 258, 4)}, new Il1Iio0oIiiO[]{new Il1Iio0oIiiO("AspectFrame", 4371, 3)}, new Il1Iio0oIiiO[]{new Il1Iio0oIiiO("ColorSpace", 55, 3)}};
/* 2664 */          I00Io1o110i = new Il1Iio0oIiiO[]{new Il1Iio0oIiiO("SubIFDPointer", 330, 4), new Il1Iio0oIiiO("ExifIFDPointer", 34665, 4), new Il1Iio0oIiiO("GPSInfoIFDPointer", 34853, 4), new Il1Iio0oIiiO("InteroperabilityIFDPointer", 40965, 4), new Il1Iio0oIiiO("CameraSettingsIFDPointer", 8224, 1), new Il1Iio0oIiiO("ImageProcessingIFDPointer", 8256, 1)};
/* 2670 */          I00IoIO0lI = new HashMap[10];
/* 2674 */          I00IoO0 = new HashMap[10];
/* 2701 */          I00IoiI = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
/* 2708 */          I00Iooi00oi = new HashMap();
/* 2712 */          Charset charsetForName = Charset.forName("US-ASCII");
/* 2716 */          I00O0i0ii = charsetForName;
/* 2724 */          I00O0o1oo = "Exif\u0000\u0000".getBytes(charsetForName);
/* 2732 */          I00O10llo = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
/* 2736 */          Locale locale = Locale.US;
/* 2749 */          new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
/* 2765 */          new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
/* 2768 */          int i = 0;
                    while (true) {
/* 2770 */              Il1Iio0oIiiO[][] il1Iio0oIiiOArr6 = I00Io1lO;
/* 2773 */              if (i >= il1Iio0oIiiOArr6.length) {
/* 2830 */                  HashMap map = I00Iooi00oi;
/* 2832 */                  Il1Iio0oIiiO[] il1Iio0oIiiOArr7 = I00Io1o110i;
/* 2844 */                  map.put(Integer.valueOf(il1Iio0oIiiOArr7[0].I00000oIO), 5);
/* 2859 */                  map.put(Integer.valueOf(il1Iio0oIiiOArr7[1].I00000oIO), 1);
/* 2874 */                  map.put(Integer.valueOf(il1Iio0oIiiOArr7[2].I00000oIO), 2);
/* 2889 */                  map.put(Integer.valueOf(il1Iio0oIiiOArr7[3].I00000oIO), 3);
/* 2904 */                  map.put(Integer.valueOf(il1Iio0oIiiOArr7[4].I00000oIO), 7);
/* 2919 */                  map.put(Integer.valueOf(il1Iio0oIiiOArr7[5].I00000oIO), 8);
/* 2924 */                  Pattern.compile(".*[1-9].*");
/* 2929 */                  Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
/* 2934 */                  Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
/* 2939 */                  Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
/* 2942 */                  return;
                        }
/* 2782 */              I00IoIO0lI[i] = new HashMap();
/* 2791 */              I00IoO0[i] = new HashMap();
/* 2798 */              for (Il1Iio0oIiiO il1Iio0oIiiO : il1Iio0oIiiOArr6[i]) {
/* 2812 */                  I00IoIO0lI[i].put(Integer.valueOf(il1Iio0oIiiO.I00000oIO), il1Iio0oIiiO);
/* 2821 */                  I00IoO0[i].put(il1Iio0oIiiO.I00000oOI, il1Iio0oIiiO);
                        }
/* 2827 */              i++;
                    }
                }

                public Il1Ilio1Ol1(InputStream inputStream) throws Throwable {
/* 4 */             Il1Iio0oIiiO[][] il1Iio0oIiiOArr = I00Io1lO;
/* 9 */             this.I0001Ioi1lo = new HashMap[il1Iio0oIiiOArr.length];
/* 17 */            this.I000II = new HashSet(il1Iio0oIiiOArr.length);
/* 21 */            this.I000O01llI0 = ByteOrder.BIG_ENDIAN;
/* 24 */            this.I00000oIO = null;
/* 27 */            this.I0000oI00 = false;
/* 31 */            if (inputStream instanceof AssetManager.AssetInputStream) {
/* 36 */                this.I0000Il00O = (AssetManager.AssetInputStream) inputStream;
/* 38 */                this.I00000oOI = null;
                    } else if (inputStream instanceof FileInputStream) {
/* 46 */                FileInputStream fileInputStream = (FileInputStream) inputStream;
                        try {
/* 56 */                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
/* 59 */                    this.I0000Il00O = null;
/* 65 */                    this.I00000oOI = fileInputStream.getFD();
                        } catch (Exception unused) {
                        }
                    } else {
/* 68 */                this.I0000Il00O = null;
/* 70 */                this.I00000oOI = null;
                    }
/* 72 */            boolean z = this.I0000oI00;
/* 74 */            boolean z2 = I000oI1ioi;
/* 78 */            for (int i = 0; i < il1Iio0oIiiOArr.length; i++) {
                        try {
                            try {
/* 87 */                        this.I0001Ioi1lo[i] = new HashMap();
                            } catch (IOException | UnsupportedOperationException e) {
/* 234 */                       if (z2) {
/* 240 */                           Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                                }
/* 253 */                       I00000oIO();
/* 256 */                       if (!z2) {
/* 437 */                           return;
                                }
                            }
                        } catch (Throwable th) {
/* 244 */                   I00000oIO();
/* 247 */                   if (z2) {
/* 249 */                       I0010o();
                            }
/* 252 */                   throw th;
                        }
                    }
/* 98 */            if (!z) {
/* 104 */               BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
/* 111 */               this.I0000O = I000O01llI0(bufferedInputStream);
/* 113 */               inputStream = bufferedInputStream;
                    }
/* 114 */           int i2 = this.I0000O;
/* 123 */           if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
/* 200 */               Il1Iii0iO il1Iii0iO = new Il1Iii0iO(inputStream);
/* 203 */               int i3 = this.I0000O;
/* 205 */               if (i3 == 4) {
/* 207 */                   I000II(il1Iii0iO, 0, 0);
                        } else if (i3 == 13) {
/* 213 */                   I000OiO(il1Iii0iO);
                        } else if (i3 == 9) {
/* 219 */                   I000iOII(il1Iii0iO);
                        } else if (i3 == 14) {
/* 225 */                   I000oI1ioi(il1Iii0iO);
                        }
                    } else {
/* 134 */               Il1IlIO il1IlIO = new Il1IlIO(inputStream);
/* 137 */               if (!z) {
/* 155 */                   int i4 = this.I0000O;
/* 159 */                   if (i4 == 12 || i4 == 15) {
/* 185 */                       I0001Ioi1lo(il1IlIO);
                            } else if (i4 == 7) {
/* 169 */                       I000OOo1O(il1IlIO);
                            } else if (i4 == 10) {
/* 177 */                       I000lI(il1IlIO);
                            } else {
/* 181 */                       I000l1(il1IlIO);
                            }
                        } else if (!I000o00OoI0I(il1IlIO)) {
/* 145 */                   I00000oIO();
/* 148 */                   if (!z2) {
/* 437 */                       return;
                            }
/* 150 */                   I0010o();
                        }
/* 191 */               il1IlIO.I0000Il00O(this.I000OiO);
/* 194 */               I001i1lo1io(il1IlIO);
                    }
/* 228 */           I00000oIO();
/* 231 */           if (!z2) {
/* 437 */               return;
                    }
/* 150 */           I0010o();
                }

                public static double I00000oOI(String str, String str2) {
                    try {
/* 6 */                 String[] strArrSplit = str.split(",", -1);
/* 13 */                String[] strArrSplit2 = strArrSplit[0].split("/", -1);
/* 38 */                double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
/* 41 */                String[] strArrSplit3 = strArrSplit[1].split("/", -1);
/* 65 */                double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
/* 69 */                String[] strArrSplit4 = strArrSplit[2].split("/", -1);
/* 104 */               double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
/* 111 */               if (!str2.equals(OIlOl1.I00iiI) && !str2.equals("W")) {
/* 128 */                   if (!str2.equals("N") && !str2.equals("E")) {
/* 144 */                       throw new IllegalArgumentException();
                            }
/* 145 */                   return d3;
                        }
/* 146 */               return -d3;
                    } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
/* 332 */               throw new IllegalArgumentException(e);
                    }
                }

                public static ByteOrder I00111O(Il1Iii0iO il1Iii0iO) throws IOException {
/* 1 */             short s = il1Iii0iO.readShort();
/* 7 */             if (s == 18761) {
/* 27 */                return ByteOrder.LITTLE_ENDIAN;
                    }
/* 11 */            if (s == 19789) {
/* 13 */                return ByteOrder.BIG_ENDIAN;
                    }
/* 22 */            I000II.I00111O("Invalid byte order: ", Integer.toHexString(s));
/* 25 */            return null;
                }

                public final void I00000oIO() {
/* 3 */             String strI0000Il00O = I0000Il00O("DateTimeOriginal");
/* 8 */             HashMap[] mapArr = this.I0001Ioi1lo;
/* 10 */            if (strI0000Il00O != null && I0000Il00O("DateTime") == null) {
/* 26 */                mapArr[0].put("DateTime", Il1Iii0ii1oo.I00000oIO(strI0000Il00O));
                    }
/* 37 */            if (I0000Il00O("ImageWidth") == null) {
/* 47 */                mapArr[0].put("ImageWidth", Il1Iii0ii1oo.I00000oOI(0L, this.I000O01llI0));
                    }
/* 56 */            if (I0000Il00O("ImageLength") == null) {
/* 66 */                mapArr[0].put("ImageLength", Il1Iii0ii1oo.I00000oOI(0L, this.I000O01llI0));
                    }
/* 75 */            if (I0000Il00O("Orientation") == null) {
/* 85 */                mapArr[0].put("Orientation", Il1Iii0ii1oo.I00000oOI(0L, this.I000O01llI0));
                    }
/* 94 */            if (I0000Il00O("LightSource") == null) {
/* 105 */               mapArr[1].put("LightSource", Il1Iii0ii1oo.I00000oOI(0L, this.I000O01llI0));
                    }
                }

                public final String I0000Il00O(String str) {
/* 2 */             if (str == null) {
/* 169 */               IOOlIIilOl0.I000II("tag shouldn't be null");
/* 1 */                 return null;
                    }
/* 4 */             Il1Iii0ii1oo il1Iii0ii1ooI0000oI00 = I0000oI00(str);
/* 8 */             if (il1Iii0ii1ooI0000oI00 != null) {
/* 12 */                int i = il1Iii0ii1ooI0000oI00.I00000oIO;
/* 20 */                if (str.equals("GPSTimeStamp")) {
/* 25 */                    if (i != 5 && i != 10) {
/* 45 */                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
/* 1 */                         return null;
                            }
/* 55 */                    Il1IioIIooo[] il1IioIIoooArr = (Il1IioIIooo[]) il1Iii0ii1ooI0000oI00.I000O01llI0(this.I000O01llI0);
/* 57 */                    if (il1IioIIoooArr == null || il1IioIIoooArr.length != 3) {
/* 138 */                       Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(il1IioIIoooArr));
/* 1 */                         return null;
                            }
/* 65 */                    Il1IioIIooo il1IioIIooo = il1IioIIoooArr[0];
/* 75 */                    Integer numValueOf = Integer.valueOf((int) (il1IioIIooo.I00000oIO / il1IioIIooo.I00000oOI));
/* 80 */                    Il1IioIIooo il1IioIIooo2 = il1IioIIoooArr[1];
/* 90 */                    Integer numValueOf2 = Integer.valueOf((int) (il1IioIIooo2.I00000oIO / il1IioIIooo2.I00000oOI));
/* 95 */                    Il1IioIIooo il1IioIIooo3 = il1IioIIoooArr[2];
/* 115 */                   return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (il1IioIIooo3.I00000oIO / il1IioIIooo3.I00000oOI)));
                        }
/* 144 */               boolean zContains = I00IoiI.contains(str);
/* 148 */               ByteOrder byteOrder = this.I000O01llI0;
/* 150 */               if (!zContains) {
/* 162 */                   return il1Iii0ii1ooI0000oI00.I000II(byteOrder);
                        }
                        try {
/* 156 */                   return Double.toString(il1Iii0ii1ooI0000oI00.I0000oI00(byteOrder));
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 1 */             return null;
                }

                public final int I0000O(int i, String str) {
/* 1 */             Il1Iii0ii1oo il1Iii0ii1ooI0000oI00 = I0000oI00(str);
/* 5 */             if (il1Iii0ii1ooI0000oI00 != null) {
                        try {
/* 10 */                    return il1Iii0ii1ooI0000oI00.I0001Ioi1lo(this.I000O01llI0);
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 37 */            return i;
                }

                public final Il1Iii0ii1oo I0000oI00(String str) {
                    Il1Iii0ii1oo il1Iii0ii1oo;
                    int i;
                    Il1Iii0ii1oo il1Iii0ii1oo2;
/* 2 */             if (str == null) {
/* 85 */                IOOlIIilOl0.I000II("tag shouldn't be null");
/* 1 */                 return null;
                    }
/* 10 */            if ("ISOSpeedRatings".equals(str)) {
/* 12 */                str = "PhotographicSensitivity";
                    }
/* 20 */            if ("Xmp".equals(str) && (i = this.I0000O) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (il1Iii0ii1oo2 = this.I000o00OoI0I) != null)) {
/* 48 */                return il1Iii0ii1oo2;
                    }
/* 53 */            for (int i2 = 0; i2 < I00Io1lO.length; i2++) {
/* 63 */                Il1Iii0ii1oo il1Iii0ii1oo3 = (Il1Iii0ii1oo) this.I0001Ioi1lo[i2].get(str);
/* 65 */                if (il1Iii0ii1oo3 != null) {
/* 67 */                    return il1Iii0ii1oo3;
                        }
                    }
/* 75 */            if (!"Xmp".equals(str) || (il1Iii0ii1oo = this.I000o00OoI0I) == null) {
/* 1 */                 return null;
                    }
/* 81 */            return il1Iii0ii1oo;
                }

                public final void I0001Ioi1lo(Il1IlIO il1IlIO) throws IOException {
                    String strExtractMetadata;
                    String strExtractMetadata2;
                    String strExtractMetadata3;
/* 5 */             MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
/* 13 */                    mediaMetadataRetriever.setDataSource(new Il1IOI(il1IlIO));
/* 18 */                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
/* 24 */                    String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
/* 30 */                    String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
/* 36 */                    String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
/* 44 */                    if ("yes".equals(strExtractMetadata6)) {
/* 48 */                        strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
/* 54 */                        strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
/* 60 */                        strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                            } else if ("yes".equals(strExtractMetadata7)) {
/* 81 */                        strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
/* 87 */                        strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
/* 93 */                        strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                            } else {
/* 98 */                        strExtractMetadata = null;
/* 99 */                        strExtractMetadata2 = null;
/* 100 */                       strExtractMetadata3 = null;
                            }
/* 101 */                   HashMap[] mapArr = this.I0001Ioi1lo;
/* 104 */                   if (strExtractMetadata != null) {
/* 120 */                       mapArr[0].put("ImageWidth", Il1Iii0ii1oo.I0000O(Integer.parseInt(strExtractMetadata), this.I000O01llI0));
                            }
/* 123 */                   if (strExtractMetadata2 != null) {
/* 139 */                       mapArr[0].put("ImageLength", Il1Iii0ii1oo.I0000O(Integer.parseInt(strExtractMetadata2), this.I000O01llI0));
                            }
/* 143 */                   if (strExtractMetadata3 != null) {
/* 145 */                       int i = Integer.parseInt(strExtractMetadata3);
/* 179 */                       mapArr[0].put("Orientation", Il1Iii0ii1oo.I0000O(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.I000O01llI0));
                            }
/* 182 */                   if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
/* 186 */                       int i2 = Integer.parseInt(strExtractMetadata4);
/* 190 */                       int i3 = Integer.parseInt(strExtractMetadata5);
/* 194 */                       if (i3 <= 6) {
/* 242 */                           throw new IOException("Invalid exif length");
                                }
/* 197 */                       il1IlIO.I0000Il00O(i2);
/* 200 */                       byte[] bArr = new byte[6];
/* 202 */                       il1IlIO.readFully(bArr);
/* 205 */                       int i4 = i2 + 6;
                                int i5 = i3 - 6;
/* 214 */                       if (!Arrays.equals(bArr, I00O0o1oo)) {
/* 234 */                           throw new IOException("Invalid identifier");
                                }
/* 216 */                       byte[] bArr2 = new byte[i5];
/* 218 */                       il1IlIO.readFully(bArr2);
/* 221 */                       this.I000OiO = i4;
/* 223 */                       I001IIilI0O(0, bArr2);
                            }
/* 245 */                   String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
/* 251 */                   String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
/* 255 */                   if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
/* 259 */                       int i6 = Integer.parseInt(strExtractMetadata8);
/* 263 */                       int i7 = Integer.parseInt(strExtractMetadata9);
                                long j = i6;
/* 268 */                       il1IlIO.I0000Il00O(j);
/* 271 */                       byte[] bArr3 = new byte[i7];
/* 273 */                       il1IlIO.readFully(bArr3);
/* 282 */                       this.I000o00OoI0I = new Il1Iii0ii1oo(j, bArr3, 1, i7);
                            }
                            try {
/* 284 */                       mediaMetadataRetriever.release();
                            } catch (IOException unused) {
                            }
                        } finally {
                        }
                    } catch (RuntimeException e) {
/* 295 */               throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
                
                    r19.I00iiO = r18.I000O01llI0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
                
                    return;
                 */
                /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0066. Please report as an issue. */
                /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[FALL_THROUGH] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0108 A[LOOP:0: B:10:0x0023->B:56:0x0108, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:74:0x010e A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(Il1Iii0iO il1Iii0iO, int i, int i2) throws Throwable {
/* 7 */             boolean z = I000oI1ioi;
/* 9 */             if (z) {
/* 11 */                Objects.toString(il1Iii0iO);
                    }
/* 16 */            il1Iii0iO.I00iiO = ByteOrder.BIG_ENDIAN;
/* 18 */            byte b = il1Iii0iO.readByte();
/* 25 */            if (b != -1) {
/* 315 */               I000II.I00111O("Invalid marker: ", Integer.toHexString(b & 255));
/* 318 */               return;
                    }
/* 33 */            if (il1Iii0iO.readByte() != -40) {
/* 305 */               I000II.I00111O("Invalid marker: ", Integer.toHexString(b & 255));
/* 308 */               return;
                    }
/* 35 */            int i3 = 2;
                    while (true) {
/* 36 */                byte b2 = il1Iii0iO.readByte();
/* 40 */                if (b2 != -1) {
/* 295 */                   I000II.I00111O("Invalid marker:", Integer.toHexString(b2 & 255));
/* 298 */                   return;
                        }
                        while (true) {
/* 42 */                    int i4 = i3 + 1;
/* 44 */                    byte b3 = il1Iii0iO.readByte();
/* 48 */                    if (b3 != -1) {
/* 50 */                        if (z) {
/* 54 */                            Integer.toHexString(b3 & 255);
                                }
/* 59 */                        if (b3 != -39 && b3 != -38) {
/* 67 */                            int unsignedShort = il1Iii0iO.readUnsignedShort();
                                    int i5 = unsignedShort - 2;
/* 73 */                            int i6 = i3 + 4;
/* 75 */                            if (z) {
/* 79 */                                Integer.toHexString(b3 & 255);
                                    }
/* 84 */                            if (i5 < 0) {
/* 275 */                               IioIoO10iOiI.I000OOo1O("Invalid length");
/* 278 */                               return;
                                    }
/* 89 */                            if (b3 != -31) {
/* 92 */                                HashMap[] mapArr = this.I0001Ioi1lo;
/* 95 */                                if (b3 != -2) {
                                            switch (b3) {
                                                default:
                                                    switch (b3) {
                                                        default:
                                                            switch (b3) {
                                                                default:
                                                                    switch (b3) {
                                                                    }
                                                                case -55:
                                                                case -54:
                                                                case -53:
/* 111 */                                                           il1Iii0iO.I00000oIO(1);
/* 135 */                                                           mapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", Il1Iii0ii1oo.I00000oOI(il1Iii0iO.readUnsignedShort(), this.I000O01llI0));
/* 158 */                                                           mapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", Il1Iii0ii1oo.I00000oOI(il1Iii0iO.readUnsignedShort(), this.I000O01llI0));
                                                                    i5 = unsignedShort - 7;
                                                                    break;
                                                            }
                                                        case -59:
                                                        case -58:
                                                        case -57:
                                                            break;
                                                    }
                                                case -64:
                                                case -63:
                                                case -62:
                                                case -61:
                                                    break;
                                            }
/* 263 */                                   if (i5 >= 0) {
/* 271 */                                       IioIoO10iOiI.I000OOo1O("Invalid length");
/* 274 */                                       return;
                                            } else {
/* 265 */                                       il1Iii0iO.I00000oIO(i5);
/* 268 */                                       i3 = i6 + i5;
                                            }
                                        } else {
/* 164 */                                   byte[] bArr = new byte[i5];
/* 166 */                                   il1Iii0iO.readFully(bArr);
/* 175 */                                   if (I0000Il00O("UserComment") == null) {
/* 190 */                                       mapArr[1].put("UserComment", Il1Iii0ii1oo.I00000oIO(new String(bArr, I00O0i0ii)));
                                            }
                                        }
                                    } else {
/* 195 */                               byte[] bArr2 = new byte[i5];
/* 197 */                               il1Iii0iO.readFully(bArr2);
/* 200 */                               int i7 = i6 + i5;
/* 202 */                               byte[] bArr3 = I00O0o1oo;
/* 208 */                               if (ilIlIliilo1i.I00000oOI(bArr2, bArr3)) {
/* 211 */                                   byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i5);
/* 219 */                                   this.I000OiO = i + i6 + bArr3.length;
/* 221 */                                   I001IIilI0O(i2, bArrCopyOfRange);
/* 229 */                                   I001i1lo1io(new Il1Iii0iO(bArrCopyOfRange));
                                        } else {
/* 233 */                                   byte[] bArr4 = I00O10llo;
/* 239 */                                   if (ilIlIliilo1i.I00000oOI(bArr2, bArr4)) {
/* 242 */                                       int length = i6 + bArr4.length;
/* 244 */                                       byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i5);
/* 259 */                                       this.I000o00OoI0I = new Il1Iii0ii1oo(length, bArrCopyOfRange2, 1, bArrCopyOfRange2.length);
                                            }
                                        }
/* 261 */                               i6 = i7;
                                    }
/* 193 */                           i5 = 0;
/* 263 */                           if (i5 >= 0) {
                                    }
                                }
                            } else {
/* 284 */                       i3 = i4;
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:114:0x015b A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:158:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00ef A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0128 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000O01llI0(BufferedInputStream bufferedInputStream) throws Throwable {
                    int i;
                    Il1Iii0iO il1Iii0iO;
                    int i2;
                    Il1Iii0iO il1Iii0iO2;
                    int i3;
                    int i4;
                    long j;
                    byte[] bArr;
                    long j2;
/* 7 */             bufferedInputStream.mark(5000);
/* 10 */            byte[] bArr2 = new byte[5000];
/* 12 */            bufferedInputStream.read(bArr2);
/* 15 */            bufferedInputStream.reset();
/* 18 */            int i5 = 0;
                    while (true) {
/* 19 */                byte[] bArr3 = I00111O;
/* 23 */                if (i5 >= bArr3.length) {
/* 22 */                    return 4;
                        }
/* 29 */                if (bArr2[i5] != bArr3[i5]) {
/* 37 */                    byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
/* 43 */                    for (int i6 = 0; i6 < bytes.length; i6++) {
/* 49 */                        if (bArr2[i6] != bytes[i6]) {
/* 51 */                            Il1Iii0iO il1Iii0iO3 = null;
                                    try {
/* 55 */                                il1Iii0iO = new Il1Iii0iO(bArr2);
                                        try {
                                            try {
/* 58 */                                        j = il1Iii0iO.readInt();
/* 63 */                                        bArr = new byte[4];
/* 65 */                                        il1Iii0iO.readFully(bArr);
                                            } catch (Exception unused) {
/* 107 */                                       i = 0;
                                            }
                                        } catch (Throwable th) {
/* 103 */                                   th = th;
/* 104 */                                   il1Iii0iO3 = il1Iii0iO;
/* 229 */                                   if (il1Iii0iO3 != null) {
/* 231 */                                       il1Iii0iO3.close();
                                            }
/* 234 */                                   throw th;
                                        }
                                    } catch (Exception unused2) {
/* 225 */                               i = 0;
/* 227 */                               il1Iii0iO = null;
                                    } catch (Throwable th2) {
/* 223 */                               th = th2;
                                    }
/* 74 */                            if (Arrays.equals(bArr, I001IIilI0O)) {
/* 90 */                                if (j == 1) {
/* 92 */                                    j = il1Iii0iO.readLong();
/* 96 */                                    j2 = 16;
/* 100 */                                   if (j < 16) {
                                            }
/* 76 */                                    il1Iii0iO.close();
/* 79 */                                    i = 0;
/* 81 */                                    i2 = 0;
                                        } else {
/* 111 */                                   j2 = 8;
                                        }
/* 116 */                               if (j > 5000) {
/* 118 */                                   j = 5000;
                                        }
/* 120 */                               long j3 = j - j2;
/* 123 */                               if (j3 < 8) {
/* 76 */                                    il1Iii0iO.close();
/* 79 */                                    i = 0;
/* 81 */                                    i2 = 0;
                                        } else {
/* 126 */                                   byte[] bArr4 = new byte[4];
/* 130 */                                   boolean z = false;
/* 131 */                                   boolean z2 = false;
/* 132 */                                   boolean z3 = false;
/* 140 */                                   for (long j4 = 0; j4 < j3 / 4; j4++) {
                                                try {
/* 142 */                                           il1Iii0iO.readFully(bArr4);
/* 147 */                                           if (j4 != 1) {
/* 152 */                                               i = 0;
                                                        try {
/* 160 */                                                   if (Arrays.equals(bArr4, I001IO000)) {
/* 162 */                                                       z = true;
                                                            } else if (Arrays.equals(bArr4, I001i1O0Ol)) {
/* 172 */                                                       z2 = true;
                                                            } else if (Arrays.equals(bArr4, I001i1lo1io) || Arrays.equals(bArr4, I001iOo1i0O)) {
/* 190 */                                                       z3 = true;
                                                            }
/* 192 */                                                   if (z) {
/* 194 */                                                       if (z2) {
/* 196 */                                                           il1Iii0iO.close();
/* 199 */                                                           i2 = 12;
                                                                    break;
                                                                }
/* 202 */                                                       if (z3) {
/* 204 */                                                           il1Iii0iO.close();
/* 207 */                                                           i2 = 15;
                                                                    break;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        } catch (Exception unused3) {
/* 235 */                                                   if (il1Iii0iO != null) {
/* 214 */                                                       il1Iii0iO.close();
                                                            }
/* 217 */                                                   i2 = i;
/* 238 */                                                   if (i2 == 0) {
                                                            }
                                                        }
                                                    }
                                                } catch (EOFException unused4) {
/* 212 */                                           i = 0;
                                                }
                                            }
/* 220 */                                   i = 0;
/* 214 */                                   il1Iii0iO.close();
/* 217 */                                   i2 = i;
                                        }
                                    } else {
/* 76 */                                il1Iii0iO.close();
/* 79 */                                i = 0;
/* 81 */                                i2 = 0;
                                    }
/* 238 */                           if (i2 == 0) {
/* 240 */                               return i2;
                                    }
                                    try {
/* 243 */                               il1Iii0iO2 = new Il1Iii0iO(bArr2);
                                    } catch (Exception unused5) {
/* 280 */                               il1Iii0iO2 = null;
                                    } catch (Throwable th3) {
/* 278 */                               th = th3;
                                    }
                                    try {
/* 246 */                               ByteOrder byteOrderI00111O = I00111O(il1Iii0iO2);
/* 250 */                               this.I000O01llI0 = byteOrderI00111O;
/* 252 */                               il1Iii0iO2.I00iiO = byteOrderI00111O;
/* 254 */                               short s = il1Iii0iO2.readShort();
/* 270 */                               i3 = (s == 20306 || s == 21330) ? 1 : i;
/* 271 */                               il1Iii0iO2.close();
                                    } catch (Exception unused6) {
/* 288 */                               if (il1Iii0iO2 != null) {
/* 290 */                                   il1Iii0iO2.close();
                                        }
/* 293 */                               i3 = i;
/* 295 */                               if (i3 == 0) {
                                        }
                                    } catch (Throwable th4) {
/* 275 */                               th = th4;
/* 276 */                               il1Iii0iO3 = il1Iii0iO2;
/* 282 */                               if (il1Iii0iO3 != null) {
/* 284 */                                   il1Iii0iO3.close();
                                        }
/* 287 */                               throw th;
                                    }
/* 295 */                           if (i3 == 0) {
/* 297 */                               return 7;
                                    }
                                    try {
/* 301 */                               Il1Iii0iO il1Iii0iO4 = new Il1Iii0iO(bArr2);
                                        try {
/* 304 */                                   ByteOrder byteOrderI00111O2 = I00111O(il1Iii0iO4);
/* 308 */                                   this.I000O01llI0 = byteOrderI00111O2;
/* 310 */                                   il1Iii0iO4.I00iiO = byteOrderI00111O2;
/* 318 */                                   i4 = il1Iii0iO4.readShort() != 85 ? i : 1;
/* 323 */                                   il1Iii0iO4.close();
                                        } catch (Exception unused7) {
/* 330 */                                   il1Iii0iO3 = il1Iii0iO4;
/* 339 */                                   if (il1Iii0iO3 != null) {
/* 341 */                                       il1Iii0iO3.close();
                                            }
/* 344 */                                   i4 = i;
/* 346 */                                   if (i4 == 0) {
                                            }
                                        } catch (Throwable th5) {
/* 327 */                                   th = th5;
/* 328 */                                   il1Iii0iO3 = il1Iii0iO4;
/* 333 */                                   if (il1Iii0iO3 != null) {
/* 335 */                                       il1Iii0iO3.close();
                                            }
/* 338 */                                   throw th;
                                        }
                                    } catch (Exception unused8) {
                                    } catch (Throwable th6) {
/* 332 */                               th = th6;
                                    }
/* 346 */                           if (i4 == 0) {
/* 348 */                               return 10;
                                    }
/* 351 */                           int i7 = i;
                                    while (true) {
/* 353 */                               byte[] bArr5 = I001lllioOl;
/* 356 */                               if (i7 >= bArr5.length) {
/* 407 */                                   return 13;
                                        }
/* 362 */                               if (bArr2[i7] != bArr5[i7]) {
/* 364 */                                   int i8 = i;
                                            while (true) {
/* 366 */                                       byte[] bArr6 = I00II0Ol1O0l;
/* 369 */                                       if (i8 >= bArr6.length) {
/* 381 */                                           int i9 = i;
                                                    while (true) {
/* 383 */                                               byte[] bArr7 = I00II0oii1o;
/* 386 */                                               if (i9 >= bArr7.length) {
/* 401 */                                                   return 14;
                                                        }
/* 395 */                                               if (bArr2[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                            break;
                                                        }
/* 398 */                                               i9++;
                                                    }
                                                } else {
/* 375 */                                           if (bArr2[i8] != bArr6[i8]) {
                                                        break;
                                                    }
/* 378 */                                           i8++;
                                                }
                                            }
/* 397 */                                   return i;
                                        }
/* 404 */                               i7++;
                                    }
                                }
                            }
/* 416 */                   return 9;
                        }
/* 421 */               i5++;
                    }
                }

                public final void I000OOo1O(Il1IlIO il1IlIO) throws Throwable {
                    int i;
                    int i2;
/* 1 */             I000l1(il1IlIO);
/* 4 */             HashMap[] mapArr = this.I0001Ioi1lo;
/* 15 */            Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) mapArr[1].get("MakerNote");
/* 17 */            if (il1Iii0ii1oo != null) {
/* 23 */                Il1IlIO il1IlIO2 = new Il1IlIO(il1Iii0ii1oo.I0000O);
/* 28 */                il1IlIO2.I00iiO = this.I000O01llI0;
/* 30 */                byte[] bArr = I001l0I00;
/* 33 */                byte[] bArr2 = new byte[bArr.length];
/* 35 */                il1IlIO2.readFully(bArr2);
/* 40 */                il1IlIO2.I0000Il00O(0L);
/* 43 */                byte[] bArr3 = I001lIiIIo1O;
/* 46 */                byte[] bArr4 = new byte[bArr3.length];
/* 48 */                il1IlIO2.readFully(bArr4);
/* 55 */                if (Arrays.equals(bArr2, bArr)) {
/* 59 */                    il1IlIO2.I0000Il00O(8L);
                        } else if (Arrays.equals(bArr4, bArr3)) {
/* 71 */                    il1IlIO2.I0000Il00O(12L);
                        }
/* 75 */                I001IO000(il1IlIO2, 6);
/* 87 */                Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) mapArr[7].get("PreviewImageStart");
/* 97 */                Il1Iii0ii1oo il1Iii0ii1oo3 = (Il1Iii0ii1oo) mapArr[7].get("PreviewImageLength");
/* 99 */                if (il1Iii0ii1oo2 != null && il1Iii0ii1oo3 != null) {
/* 108 */                   mapArr[5].put("JPEGInterchangeFormat", il1Iii0ii1oo2);
/* 115 */                   mapArr[5].put("JPEGInterchangeFormatLength", il1Iii0ii1oo3);
                        }
/* 128 */               Il1Iii0ii1oo il1Iii0ii1oo4 = (Il1Iii0ii1oo) mapArr[8].get("AspectFrame");
/* 130 */               if (il1Iii0ii1oo4 != null) {
/* 138 */                   int[] iArr = (int[]) il1Iii0ii1oo4.I000O01llI0(this.I000O01llI0);
/* 140 */                   if (iArr == null || iArr.length != 4) {
/* 219 */                       Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
/* 437 */                       return;
                            }
/* 148 */                   int i3 = iArr[2];
/* 151 */                   int i4 = iArr[0];
/* 153 */                   if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
/* 437 */                       return;
                            }
/* 163 */                   int i5 = (i3 - i4) + 1;
/* 165 */                   int i6 = (i - i2) + 1;
/* 166 */                   if (i5 < i6) {
/* 168 */                       int i7 = i5 + i6;
/* 169 */                       i6 = i7 - i6;
/* 171 */                       i5 = i7 - i6;
                            }
/* 174 */                   Il1Iii0ii1oo il1Iii0ii1ooI0000O = Il1Iii0ii1oo.I0000O(i5, this.I000O01llI0);
/* 180 */                   Il1Iii0ii1oo il1Iii0ii1ooI0000O2 = Il1Iii0ii1oo.I0000O(i6, this.I000O01llI0);
/* 188 */                   mapArr[0].put("ImageWidth", il1Iii0ii1ooI0000O);
/* 195 */                   mapArr[0].put("ImageLength", il1Iii0ii1ooI0000O2);
                        }
                    }
                }

                public final void I000OiO(Il1Iii0iO il1Iii0iO) throws Throwable {
/* 7 */             if (I000oI1ioi) {
/* 9 */                 Objects.toString(il1Iii0iO);
                    }
/* 14 */            il1Iii0iO.I00iiO = ByteOrder.BIG_ENDIAN;
/* 16 */            int i = il1Iii0iO.I00iiI;
/* 21 */            il1Iii0iO.I00000oIO(I001lllioOl.length);
/* 25 */            boolean z = false;
/* 26 */            boolean z2 = false;
                    while (true) {
/* 27 */                if (z && z2) {
/* 69 */                    return;
                        }
                        try {
/* 31 */                    int i2 = il1Iii0iO.readInt();
/* 35 */                    int i3 = il1Iii0iO.readInt();
/* 39 */                    int i4 = il1Iii0iO.I00iiI;
/* 43 */                    int i5 = i4 + i2 + 4;
/* 45 */                    int i6 = i4 - i;
/* 48 */                    if (i6 == 16 && i3 != 1229472850) {
/* 63 */                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                            }
/* 67 */                    if (i3 == 1229278788) {
/* 69 */                        return;
                            }
/* 74 */                    if (i3 == 1700284774 && !z) {
/* 78 */                        this.I000OiO = i6;
/* 80 */                        byte[] bArr = new byte[i2];
/* 82 */                        il1Iii0iO.readFully(bArr);
/* 85 */                        int i7 = il1Iii0iO.readInt();
/* 91 */                        CRC32 crc32 = new CRC32();
/* 96 */                        crc32.update(i3 >>> 24);
/* 101 */                       crc32.update(i3 >>> 16);
/* 106 */                       crc32.update(i3 >>> 8);
/* 109 */                       crc32.update(i3);
/* 112 */                       crc32.update(bArr);
/* 120 */                       if (((int) crc32.getValue()) != i7) {
/* 172 */                           throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                                }
/* 122 */                       I001IIilI0O(0, bArr);
/* 125 */                       I001lIiIIo1O();
/* 133 */                       I001i1lo1io(new Il1Iii0iO(bArr));
/* 136 */                       z = true;
                            } else if (i3 == 1767135348 && !z2) {
/* 180 */                       byte[] bArr2 = I001lloI;
/* 183 */                       if (i2 >= bArr2.length) {
/* 185 */                           int length = bArr2.length;
/* 186 */                           byte[] bArr3 = new byte[length];
/* 188 */                           il1Iii0iO.readFully(bArr3);
/* 195 */                           if (Arrays.equals(bArr3, bArr2)) {
/* 199 */                               int i8 = il1Iii0iO.I00iiI - i;
/* 200 */                               int i9 = i2 - length;
/* 201 */                               byte[] bArr4 = new byte[i9];
/* 203 */                               il1Iii0iO.readFully(bArr4);
/* 216 */                               this.I000o00OoI0I = new Il1Iii0ii1oo(i8, bArr4, 1, i9);
/* 218 */                               z2 = true;
                                    }
                                }
                            }
/* 222 */                   il1Iii0iO.I00000oIO(i5 - il1Iii0iO.I00iiI);
                        } catch (EOFException e) {
/* 437 */                   throw new IOException("Encountered corrupt PNG file.", e);
                        }
                    }
                }

                public final void I000iOII(Il1Iii0iO il1Iii0iO) throws Throwable {
/* 3 */             if (I000oI1ioi) {
/* 5 */                 Objects.toString(il1Iii0iO);
                    }
/* 10 */            il1Iii0iO.I00000oIO(84);
/* 14 */            byte[] bArr = new byte[4];
/* 16 */            byte[] bArr2 = new byte[4];
/* 18 */            byte[] bArr3 = new byte[4];
/* 20 */            il1Iii0iO.readFully(bArr);
/* 23 */            il1Iii0iO.readFully(bArr2);
/* 26 */            il1Iii0iO.readFully(bArr3);
/* 33 */            int i = ByteBuffer.wrap(bArr).getInt();
/* 41 */            int i2 = ByteBuffer.wrap(bArr2).getInt();
/* 49 */            int i3 = ByteBuffer.wrap(bArr3).getInt();
/* 53 */            byte[] bArr4 = new byte[i2];
/* 59 */            il1Iii0iO.I00000oIO(i - il1Iii0iO.I00iiI);
/* 62 */            il1Iii0iO.readFully(bArr4);
/* 71 */            I000II(new Il1Iii0iO(bArr4), i, 5);
/* 77 */            il1Iii0iO.I00000oIO(i3 - il1Iii0iO.I00iiI);
/* 82 */            il1Iii0iO.I00iiO = ByteOrder.BIG_ENDIAN;
/* 84 */            int i4 = il1Iii0iO.readInt();
/* 90 */            for (int i5 = 0; i5 < i4; i5++) {
/* 92 */                int unsignedShort = il1Iii0iO.readUnsignedShort();
/* 96 */                int unsignedShort2 = il1Iii0iO.readUnsignedShort();
/* 104 */               if (unsignedShort == I00IlilI0i0i.I00000oIO) {
/* 106 */                   short s = il1Iii0iO.readShort();
/* 110 */                   short s2 = il1Iii0iO.readShort();
/* 116 */                   Il1Iii0ii1oo il1Iii0ii1ooI0000O = Il1Iii0ii1oo.I0000O(s, this.I000O01llI0);
/* 122 */                   Il1Iii0ii1oo il1Iii0ii1ooI0000O2 = Il1Iii0ii1oo.I0000O(s2, this.I000O01llI0);
/* 126 */                   HashMap[] mapArr = this.I0001Ioi1lo;
/* 132 */                   mapArr[0].put("ImageLength", il1Iii0ii1ooI0000O);
/* 139 */                   mapArr[0].put("ImageWidth", il1Iii0ii1ooI0000O2);
/* 142 */                   return;
                        }
/* 143 */               il1Iii0iO.I00000oIO(unsignedShort2);
                    }
                }

                public final void I000l1(Il1IlIO il1IlIO) throws Throwable {
/* 1 */             I0010I0i(il1IlIO);
/* 5 */             I001IO000(il1IlIO, 0);
/* 8 */             I001l0I00(il1IlIO, 0);
/* 12 */            I001l0I00(il1IlIO, 5);
/* 16 */            I001l0I00(il1IlIO, 4);
/* 19 */            I001lIiIIo1O();
/* 26 */            if (this.I0000O == 8) {
/* 28 */                HashMap[] mapArr = this.I0001Ioi1lo;
/* 39 */                Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) mapArr[1].get("MakerNote");
/* 41 */                if (il1Iii0ii1oo != null) {
/* 47 */                    Il1IlIO il1IlIO2 = new Il1IlIO(il1Iii0ii1oo.I0000O);
/* 52 */                    il1IlIO2.I00iiO = this.I000O01llI0;
/* 55 */                    il1IlIO2.I00000oIO(6);
/* 60 */                    I001IO000(il1IlIO2, 9);
/* 71 */                    Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) mapArr[9].get("ColorSpace");
/* 73 */                    if (il1Iii0ii1oo2 != null) {
/* 77 */                        mapArr[1].put("ColorSpace", il1Iii0ii1oo2);
                            }
                        }
                    }
                }

                public final void I000lI(Il1IlIO il1IlIO) throws Throwable {
/* 3 */             if (I000oI1ioi) {
/* 5 */                 Objects.toString(il1IlIO);
                    }
/* 8 */             I000l1(il1IlIO);
/* 11 */            HashMap[] mapArr = this.I0001Ioi1lo;
/* 22 */            Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) mapArr[0].get("JpgFromRaw");
/* 24 */            if (il1Iii0ii1oo != null) {
/* 37 */                I000II(new Il1Iii0iO(il1Iii0ii1oo.I0000O), (int) il1Iii0ii1oo.I0000Il00O, 5);
                    }
/* 48 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) mapArr[0].get("ISO");
/* 59 */            Il1Iii0ii1oo il1Iii0ii1oo3 = (Il1Iii0ii1oo) mapArr[1].get("PhotographicSensitivity");
/* 61 */            if (il1Iii0ii1oo2 == null || il1Iii0ii1oo3 != null) {
/* 77 */                return;
                    }
/* 67 */            mapArr[1].put("PhotographicSensitivity", il1Iii0ii1oo2);
                }

                public final boolean I000o00OoI0I(Il1IlIO il1IlIO) throws IOException {
/* 1 */             byte[] bArr = I00O0o1oo;
/* 4 */             byte[] bArr2 = new byte[bArr.length];
/* 6 */             il1IlIO.readFully(bArr2);
/* 14 */            if (!Arrays.equals(bArr2, bArr)) {
/* 20 */                Log.w("ExifInterface", "Given data is not EXIF-only.");
/* 13 */                return false;
                    }
/* 26 */            byte[] bArrCopyOf = new byte[Barcode.FORMAT_UPC_E];
/* 28 */            int i = 0;
                    while (true) {
/* 30 */                if (i == bArrCopyOf.length) {
/* 35 */                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
/* 43 */                int i2 = il1IlIO.I00iOIl.read(bArrCopyOf, i, bArrCopyOf.length - i);
/* 48 */                if (i2 == -1) {
/* 57 */                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
/* 62 */                    this.I000OiO = bArr.length;
/* 64 */                    I001IIilI0O(0, bArrCopyOf2);
/* 67 */                    return true;
                        }
/* 50 */                i += i2;
                        il1IlIO.I00iiI += i2;
                    }
                }

                public final void I000oI1ioi(Il1Iii0iO il1Iii0iO) throws Throwable {
/* 3 */             if (I000oI1ioi) {
/* 5 */                 Objects.toString(il1Iii0iO);
                    }
/* 10 */            il1Iii0iO.I00iiO = ByteOrder.LITTLE_ENDIAN;
/* 15 */            il1Iii0iO.I00000oIO(I00II0Ol1O0l.length);
/* 22 */            int i = il1Iii0iO.readInt() + 8;
/* 24 */            byte[] bArr = I00II0oii1o;
/* 27 */            il1Iii0iO.I00000oIO(bArr.length);
/* 31 */            int length = bArr.length + 8;
                    while (true) {
                        try {
/* 34 */                    byte[] bArr2 = new byte[4];
/* 36 */                    il1Iii0iO.readFully(bArr2);
/* 39 */                    int i2 = il1Iii0iO.readInt();
/* 43 */                    int i3 = length + 8;
/* 51 */                    if (Arrays.equals(I00IO1, bArr2)) {
/* 53 */                        byte[] bArrCopyOfRange = new byte[i2];
/* 55 */                        il1Iii0iO.readFully(bArrCopyOfRange);
/* 58 */                        byte[] bArr3 = I00O0o1oo;
/* 64 */                        if (ilIlIliilo1i.I00000oOI(bArrCopyOfRange, bArr3)) {
/* 67 */                            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                                }
/* 71 */                        this.I000OiO = i3;
/* 74 */                        I001IIilI0O(0, bArrCopyOfRange);
/* 82 */                        I001i1lo1io(new Il1Iii0iO(bArrCopyOfRange));
/* 85 */                        return;
                            }
/* 89 */                    if (i2 % 2 == 1) {
/* 91 */                        i2++;
                            }
/* 93 */                    length = i3 + i2;
/* 94 */                    if (length == i) {
/* 96 */                        return;
                            }
/* 97 */                    if (length > i) {
/* 110 */                       throw new IOException("Encountered WebP file with invalid chunk size");
                            }
/* 99 */                    il1Iii0iO.I00000oIO(i2);
                        } catch (EOFException e) {
/* 168 */                   throw new IOException("Encountered corrupt WebP file.", e);
                        }
                    }
                }

                public final void I00100l0(Il1Iii0iO il1Iii0iO, HashMap map) throws Throwable {
/* 7 */             Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) map.get("JPEGInterchangeFormat");
/* 15 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) map.get("JPEGInterchangeFormatLength");
/* 17 */            if (il1Iii0ii1oo == null || il1Iii0ii1oo2 == null) {
/* 106 */               return;
                    }
/* 23 */            int iI0001Ioi1lo = il1Iii0ii1oo.I0001Ioi1lo(this.I000O01llI0);
/* 29 */            int iI0001Ioi1lo2 = il1Iii0ii1oo2.I0001Ioi1lo(this.I000O01llI0);
/* 36 */            if (this.I0000O == 7) {
/* 40 */                iI0001Ioi1lo += this.I000iOII;
                    }
/* 41 */            if (iI0001Ioi1lo > 0 && iI0001Ioi1lo2 > 0 && this.I00000oIO == null && this.I0000Il00O == null && this.I00000oOI == null) {
/* 59 */                il1Iii0iO.I00000oIO(iI0001Ioi1lo);
/* 62 */                il1Iii0iO.readFully(new byte[iI0001Ioi1lo2]);
                    }
                }

                public final boolean I00100o1O0lo(HashMap map) {
/* 7 */             Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) map.get("ImageLength");
/* 15 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) map.get("ImageWidth");
/* 17 */            if (il1Iii0ii1oo == null || il1Iii0ii1oo2 == null) {
/* 41 */                return false;
                    }
                    return il1Iii0ii1oo.I0001Ioi1lo(this.I000O01llI0) <= 512 && il1Iii0ii1oo2.I0001Ioi1lo(this.I000O01llI0) <= 512;
                }

                public final void I0010I0i(Il1IlIO il1IlIO) throws IOException {
/* 1 */             ByteOrder byteOrderI00111O = I00111O(il1IlIO);
/* 5 */             this.I000O01llI0 = byteOrderI00111O;
/* 7 */             il1IlIO.I00iiO = byteOrderI00111O;
/* 9 */             int unsignedShort = il1IlIO.readUnsignedShort();
/* 13 */            int i = this.I0000O;
/* 16 */            if (i != 7 && i != 10 && unsignedShort != 42) {
/* 33 */                I000II.I00111O("Invalid start code: ", Integer.toHexString(unsignedShort));
/* 36 */                return;
                    }
/* 37 */            int i2 = il1IlIO.readInt();
/* 43 */            if (i2 < 8) {
/* 59 */                IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(i2, "Invalid first Ifd offset: "));
/* 77 */                return;
                    }
                    int i3 = i2 - 8;
/* 47 */            if (i3 > 0) {
/* 49 */                il1IlIO.I00000oIO(i3);
                    }
                }

                public final void I0010o() throws Throwable {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 HashMap[] mapArr = this.I0001Ioi1lo;
/* 5 */                 if (i >= mapArr.length) {
/* 110 */                   return;
                        }
/* 9 */                 mapArr[i].size();
/* 26 */                for (Map.Entry entry : mapArr[i].entrySet()) {
/* 38 */                    Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) entry.getValue();
/* 46 */                    il1Iii0ii1oo.toString();
/* 51 */                    il1Iii0ii1oo.I000II(this.I000O01llI0);
                        }
/* 55 */                i++;
                    }
                }

                public final void I001IIilI0O(int i, byte[] bArr) throws IOException {
/* 3 */             Il1IlIO il1IlIO = new Il1IlIO(bArr);
/* 6 */             I0010I0i(il1IlIO);
/* 9 */             I001IO000(il1IlIO, i);
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001IO000(Il1IlIO il1IlIO, int i) throws IOException {
                    boolean z;
                    HashMap[] mapArr;
                    short s;
                    boolean z2;
                    long j;
                    HashMap[] mapArr2;
                    Il1Iio0oIiiO il1Iio0oIiiO;
                    long j2;
                    int i2;
                    boolean z3;
                    HashMap[] mapArr3;
                    int i3;
                    Il1Iio0oIiiO il1Iio0oIiiO2;
                    int i4;
                    int unsignedShort;
                    long j3;
                    int i5;
/* 5 */             int i6 = i;
/* 9 */             Integer numValueOf = Integer.valueOf(il1IlIO.I00iiI);
/* 13 */            HashSet hashSet = this.I000II;
/* 15 */            hashSet.add(numValueOf);
/* 18 */            short s2 = il1IlIO.readShort();
/* 22 */            if (s2 <= 0) {
/* 900 */               return;
                    }
/* 26 */            short s3 = 0;
                    while (true) {
/* 27 */                z = I000oI1ioi;
/* 29 */                mapArr = this.I0001Ioi1lo;
/* 31 */                if (s3 >= s2) {
                            break;
                        }
/* 33 */                int unsignedShort2 = il1IlIO.readUnsignedShort();
/* 37 */                int unsignedShort3 = il1IlIO.readUnsignedShort();
/* 41 */                int i7 = il1IlIO.readInt();
/* 47 */                short s4 = s3;
/* 52 */                long j4 = il1IlIO.I00iiI + 4;
/* 67 */                Il1Iio0oIiiO il1Iio0oIiiO3 = (Il1Iio0oIiiO) I00IoIO0lI[i6].get(Integer.valueOf(unsignedShort2));
/* 69 */                if (z) {
/* 75 */                    j = 4;
/* 85 */                    s = s2;
/* 94 */                    z2 = z;
/* 106 */                   String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i6), Integer.valueOf(unsignedShort2), il1Iio0oIiiO3 != null ? il1Iio0oIiiO3.I00000oOI : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i7));
                        } else {
/* 110 */                   s = s2;
/* 112 */                   z2 = z;
/* 114 */                   j = 4;
                        }
/* 118 */               if (il1Iio0oIiiO3 != null && unsignedShort3 > 0) {
/* 130 */                   if (unsignedShort3 < I00IOO.length) {
/* 133 */                       int i8 = il1Iio0oIiiO3.I0000Il00O;
/* 135 */                       if (i8 == 7 || unsignedShort3 == 7 || i8 == unsignedShort3 || (i2 = il1Iio0oIiiO3.I0000O) == unsignedShort3 || (((i8 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i8 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i8 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
/* 187 */                           if (unsignedShort3 == 7) {
/* 189 */                               unsignedShort3 = i8;
                                    }
/* 190 */                           mapArr2 = mapArr;
/* 194 */                           il1Iio0oIiiO = il1Iio0oIiiO3;
/* 197 */                           j2 = i7 * r15[unsignedShort3];
/* 212 */                           z3 = j2 >= 0 && j2 <= 2147483647L;
                                } else {
/* 180 */                           if (z2) {
/* 184 */                               String str = I00IO1oi11O[unsignedShort3];
                                    }
/* 120 */                           il1Iio0oIiiO = il1Iio0oIiiO3;
/* 122 */                           mapArr2 = mapArr;
/* 214 */                           j2 = 0;
                                }
                            } else {
/* 120 */                       il1Iio0oIiiO = il1Iio0oIiiO3;
/* 122 */                       mapArr2 = mapArr;
/* 214 */                       j2 = 0;
                            }
                        }
/* 217 */               if (z3) {
/* 228 */                   if (j2 > j) {
/* 230 */                       int i9 = il1IlIO.readInt();
/* 237 */                       if (this.I0000O == 7) {
/* 241 */                           mapArr3 = mapArr2;
/* 243 */                           il1Iio0oIiiO2 = il1Iio0oIiiO;
/* 251 */                           if ("MakerNote".equals(il1Iio0oIiiO2.I00000oOI)) {
/* 253 */                               this.I000iOII = i9;
                                    } else if (i6 == 6 && "ThumbnailImage".equals(il1Iio0oIiiO2.I00000oOI)) {
/* 273 */                               this.I000l1 = i9;
/* 275 */                               this.I000lI = i7;
/* 280 */                               Il1Iii0ii1oo il1Iii0ii1ooI0000O = Il1Iii0ii1oo.I0000O(6, this.I000O01llI0);
/* 286 */                               i3 = unsignedShort2;
/* 291 */                               Il1Iii0ii1oo il1Iii0ii1ooI00000oOI = Il1Iii0ii1oo.I00000oOI(this.I000l1, this.I000O01llI0);
/* 298 */                               i4 = i7;
/* 302 */                               Il1Iii0ii1oo il1Iii0ii1ooI00000oOI2 = Il1Iii0ii1oo.I00000oOI(this.I000lI, this.I000O01llI0);
/* 310 */                               mapArr3[4].put("Compression", il1Iii0ii1ooI0000O);
/* 317 */                               mapArr3[4].put("JPEGInterchangeFormat", il1Iii0ii1ooI00000oOI);
/* 324 */                               mapArr3[4].put("JPEGInterchangeFormatLength", il1Iii0ii1ooI00000oOI2);
/* 336 */                               il1IlIO.I0000Il00O(i9);
                                    }
/* 255 */                           i3 = unsignedShort2;
                                } else {
/* 328 */                           mapArr3 = mapArr2;
/* 330 */                           i3 = unsignedShort2;
/* 332 */                           il1Iio0oIiiO2 = il1Iio0oIiiO;
                                }
/* 257 */                       i4 = i7;
/* 336 */                       il1IlIO.I0000Il00O(i9);
                            } else {
/* 340 */                       mapArr3 = mapArr2;
/* 342 */                       i3 = unsignedShort2;
/* 344 */                       il1Iio0oIiiO2 = il1Iio0oIiiO;
/* 346 */                       i4 = i7;
                            }
/* 358 */                   Integer num = (Integer) I00Iooi00oi.get(Integer.valueOf(i3));
/* 360 */                   if (num != null) {
/* 363 */                       if (unsignedShort3 != 3) {
/* 366 */                           if (unsignedShort3 == 4) {
/* 404 */                               j3 = il1IlIO.readInt() & 4294967295L;
                                    } else if (unsignedShort3 == 8) {
/* 389 */                               unsignedShort = il1IlIO.readShort();
                                    } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
/* 383 */                               unsignedShort = il1IlIO.readInt();
                                    } else {
/* 380 */                               j3 = -1;
                                    }
/* 411 */                           if (z2) {
/* 425 */                               String.format("Offset: %d, tagName: %s", Long.valueOf(j3), il1Iio0oIiiO2.I00000oOI);
                                    }
/* 430 */                           if (j3 > 0 && (((i5 = il1IlIO.I00ilI0I1) == -1 || j3 < i5) && !hashSet.contains(Integer.valueOf((int) j3)))) {
/* 453 */                               il1IlIO.I0000Il00O(j3);
/* 460 */                               I001IO000(il1IlIO, num.intValue());
                                    }
/* 463 */                           il1IlIO.I0000Il00O(j4);
                                } else {
/* 406 */                           unsignedShort = il1IlIO.readUnsignedShort();
                                }
                                j3 = unsignedShort;
/* 411 */                       if (z2) {
                                }
/* 430 */                       if (j3 > 0) {
/* 453 */                           il1IlIO.I0000Il00O(j3);
/* 460 */                           I001IO000(il1IlIO, num.intValue());
                                }
/* 463 */                       il1IlIO.I0000Il00O(j4);
                            } else {
/* 471 */                       int i10 = il1IlIO.I00iiI + this.I000OiO;
/* 473 */                       byte[] bArr = new byte[(int) j2];
/* 475 */                       il1IlIO.readFully(bArr);
/* 489 */                       Il1Iii0ii1oo il1Iii0ii1oo = new Il1Iii0ii1oo(i10, bArr, unsignedShort3, i4);
/* 492 */                       HashMap map = mapArr3[i];
/* 494 */                       String str2 = il1Iio0oIiiO2.I00000oOI;
/* 496 */                       map.put(str2, il1Iii0ii1oo);
/* 505 */                       if ("DNGVersion".equals(str2)) {
/* 508 */                           this.I0000O = 3;
                                }
/* 516 */                       if ((("Make".equals(str2) || "Model".equals(str2)) && il1Iii0ii1oo.I000II(this.I000O01llI0).contains("PENTAX")) || ("Compression".equals(str2) && il1Iii0ii1oo.I0001Ioi1lo(this.I000O01llI0) == 65535)) {
/* 559 */                           this.I0000O = 8;
                                }
/* 566 */                       if (il1IlIO.I00iiI != j4) {
/* 568 */                           il1IlIO.I0000Il00O(j4);
                                }
                            }
                        } else {
/* 219 */                   il1IlIO.I0000Il00O(j4);
                        }
/* 573 */               s3 = (short) (s4 + 1);
/* 574 */               i6 = i;
/* 576 */               s2 = s;
                    }
/* 586 */           int i11 = il1IlIO.readInt();
/* 590 */           if (z) {
/* 602 */               String.format("nextIfdOffset: %d", Integer.valueOf(i11));
                    }
                    long j5 = i11;
/* 608 */           if (j5 <= 0 || hashSet.contains(Integer.valueOf(i11))) {
/* 900 */               return;
                    }
/* 620 */           il1IlIO.I0000Il00O(j5);
/* 630 */           if (mapArr[4].isEmpty()) {
/* 632 */               I001IO000(il1IlIO, 4);
                    } else if (mapArr[5].isEmpty()) {
/* 645 */               I001IO000(il1IlIO, 5);
                    }
                }

                public final void I001i1O0Ol(String str, int i, String str2) {
/* 1 */             HashMap[] mapArr = this.I0001Ioi1lo;
/* 9 */             if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
/* 98 */                return;
                    }
/* 19 */            HashMap map = mapArr[i];
/* 27 */            map.put(str2, (Il1Iii0ii1oo) map.get(str));
/* 32 */            mapArr[i].remove(str);
                }

                public final void I001i1lo1io(Il1Iii0iO il1Iii0iO) throws Throwable {
                    Il1Iii0ii1oo il1Iii0ii1oo;
/* 4 */             HashMap map = this.I0001Ioi1lo[4];
/* 12 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) map.get("Compression");
/* 14 */            if (il1Iii0ii1oo2 == null) {
/* 255 */               I00100l0(il1Iii0iO, map);
/* 437 */               return;
                    }
/* 18 */            int iI0001Ioi1lo = il1Iii0ii1oo2.I0001Ioi1lo(this.I000O01llI0);
/* 24 */            if (iI0001Ioi1lo != 1) {
/* 26 */                if (iI0001Ioi1lo == 6) {
/* 33 */                    I00100l0(il1Iii0iO, map);
/* 36 */                    return;
                        } else if (iI0001Ioi1lo != 7) {
/* 254 */                   return;
                        }
                    }
/* 43 */            Il1Iii0ii1oo il1Iii0ii1oo3 = (Il1Iii0ii1oo) map.get("BitsPerSample");
/* 45 */            if (il1Iii0ii1oo3 != null) {
/* 53 */                int[] iArr = (int[]) il1Iii0ii1oo3.I000O01llI0(this.I000O01llI0);
/* 55 */                int[] iArr2 = I0010I0i;
/* 61 */                if (!Arrays.equals(iArr2, iArr)) {
/* 67 */                    if (this.I0000O != 3 || (il1Iii0ii1oo = (Il1Iii0ii1oo) map.get("PhotometricInterpretation")) == null) {
/* 254 */                       return;
                            }
/* 81 */                    int iI0001Ioi1lo2 = il1Iii0ii1oo.I0001Ioi1lo(this.I000O01llI0);
/* 85 */                    if ((iI0001Ioi1lo2 != 1 || !Arrays.equals(iArr, I0010o)) && (iI0001Ioi1lo2 != 6 || !Arrays.equals(iArr, iArr2))) {
/* 254 */                       return;
                            }
                        }
/* 109 */               Il1Iii0ii1oo il1Iii0ii1oo4 = (Il1Iii0ii1oo) map.get("StripOffsets");
/* 117 */               Il1Iii0ii1oo il1Iii0ii1oo5 = (Il1Iii0ii1oo) map.get("StripByteCounts");
/* 119 */               if (il1Iii0ii1oo4 == null || il1Iii0ii1oo5 == null) {
/* 254 */                   return;
                        }
/* 129 */               long[] jArrI00000oIO = ilIlIliilo1i.I00000oIO(il1Iii0ii1oo4.I000O01llI0(this.I000O01llI0));
/* 139 */               long[] jArrI00000oIO2 = ilIlIliilo1i.I00000oIO(il1Iii0ii1oo5.I000O01llI0(this.I000O01llI0));
/* 145 */               if (jArrI00000oIO == null || jArrI00000oIO.length == 0) {
/* 251 */                   Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
/* 254 */                   return;
                        }
/* 152 */               if (jArrI00000oIO2 == null || jArrI00000oIO2.length == 0) {
/* 245 */                   Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
/* 254 */                   return;
                        }
/* 160 */               if (jArrI00000oIO.length != jArrI00000oIO2.length) {
/* 164 */                   Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
/* 254 */                   return;
                        }
/* 170 */               long j = 0;
/* 173 */               for (long j2 : jArrI00000oIO2) {
/* 177 */                   j += j2;
                        }
/* 182 */               byte[] bArr = new byte[(int) j];
/* 184 */               this.I000OOo1O = true;
/* 187 */               int i = 0;
/* 188 */               int i2 = 0;
/* 190 */               for (int i3 = 0; i3 < jArrI00000oIO.length; i3++) {
/* 194 */                   int i4 = (int) jArrI00000oIO[i3];
/* 197 */                   int i5 = (int) jArrI00000oIO2[i3];
/* 200 */                   if (i3 < jArrI00000oIO.length - 1 && i4 + i5 != jArrI00000oIO[i3 + 1]) {
/* 213 */                       this.I000OOo1O = false;
                            }
/* 215 */                   int i6 = i4 - i;
/* 216 */                   if (i6 < 0) {
/* 254 */                       return;
                            }
                            try {
/* 219 */                       il1Iii0iO.I00000oIO(i6);
/* 222 */                       int i7 = i + i6;
/* 223 */                       byte[] bArr2 = new byte[i5];
/* 225 */                       il1Iii0iO.readFully(bArr2);
/* 228 */                       i = i7 + i5;
/* 229 */                       System.arraycopy(bArr2, 0, bArr, i2, i5);
/* 232 */                       i2 += i5;
                            } catch (EOFException unused) {
/* 254 */                       return;
                            }
                        }
/* 238 */               if (this.I000OOo1O) {
/* 240 */                   long j3 = jArrI00000oIO[0];
                        }
                    }
                }

                public final void I001iOo1i0O(int i, int i2) throws Throwable {
/* 1 */             HashMap[] mapArr = this.I0001Ioi1lo;
/* 9 */             if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
/* 106 */               return;
                    }
/* 28 */            Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) mapArr[i].get("ImageLength");
/* 38 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) mapArr[i].get("ImageWidth");
/* 46 */            Il1Iii0ii1oo il1Iii0ii1oo3 = (Il1Iii0ii1oo) mapArr[i2].get("ImageLength");
/* 54 */            Il1Iii0ii1oo il1Iii0ii1oo4 = (Il1Iii0ii1oo) mapArr[i2].get("ImageWidth");
/* 56 */            if (il1Iii0ii1oo == null || il1Iii0ii1oo2 == null || il1Iii0ii1oo3 == null || il1Iii0ii1oo4 == null) {
/* 106 */               return;
                    }
/* 68 */            int iI0001Ioi1lo = il1Iii0ii1oo.I0001Ioi1lo(this.I000O01llI0);
/* 74 */            int iI0001Ioi1lo2 = il1Iii0ii1oo2.I0001Ioi1lo(this.I000O01llI0);
/* 80 */            int iI0001Ioi1lo3 = il1Iii0ii1oo3.I0001Ioi1lo(this.I000O01llI0);
/* 86 */            int iI0001Ioi1lo4 = il1Iii0ii1oo4.I0001Ioi1lo(this.I000O01llI0);
/* 90 */            if (iI0001Ioi1lo >= iI0001Ioi1lo3 || iI0001Ioi1lo2 >= iI0001Ioi1lo4) {
/* 106 */               return;
                    }
/* 94 */            HashMap map = mapArr[i];
/* 98 */            mapArr[i] = mapArr[i2];
/* 100 */           mapArr[i2] = map;
                }

                public final void I001l0I00(Il1IlIO il1IlIO, int i) throws Throwable {
                    Il1Iii0ii1oo il1Iii0ii1ooI0000O;
                    Il1Iii0ii1oo il1Iii0ii1ooI0000O2;
/* 1 */             HashMap[] mapArr = this.I0001Ioi1lo;
/* 11 */            Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) mapArr[i].get("DefaultCropSize");
/* 21 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) mapArr[i].get("SensorTopBorder");
/* 31 */            Il1Iii0ii1oo il1Iii0ii1oo3 = (Il1Iii0ii1oo) mapArr[i].get("SensorLeftBorder");
/* 41 */            Il1Iii0ii1oo il1Iii0ii1oo4 = (Il1Iii0ii1oo) mapArr[i].get("SensorBottomBorder");
/* 51 */            Il1Iii0ii1oo il1Iii0ii1oo5 = (Il1Iii0ii1oo) mapArr[i].get("SensorRightBorder");
/* 57 */            if (il1Iii0ii1oo != null) {
/* 59 */                int i2 = il1Iii0ii1oo.I00000oIO;
/* 61 */                ByteOrder byteOrder = this.I000O01llI0;
/* 71 */                if (i2 == 5) {
/* 77 */                    Il1IioIIooo[] il1IioIIoooArr = (Il1IioIIooo[]) il1Iii0ii1oo.I000O01llI0(byteOrder);
/* 79 */                    if (il1IioIIoooArr == null || il1IioIIoooArr.length != 2) {
/* 126 */                       Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(il1IioIIoooArr));
/* 129 */                       return;
                            } else {
/* 93 */                        il1Iii0ii1ooI0000O = Il1Iii0ii1oo.I0000Il00O(new Il1IioIIooo[]{il1IioIIoooArr[0]}, this.I000O01llI0);
/* 105 */                       il1Iii0ii1ooI0000O2 = Il1Iii0ii1oo.I0000Il00O(new Il1IioIIooo[]{il1IioIIoooArr[1]}, this.I000O01llI0);
                            }
                        } else {
/* 134 */                   int[] iArr = (int[]) il1Iii0ii1oo.I000O01llI0(byteOrder);
/* 136 */                   if (iArr == null || iArr.length != 2) {
/* 185 */                       Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
/* 188 */                       return;
                            }
/* 146 */                   il1Iii0ii1ooI0000O = Il1Iii0ii1oo.I0000O(iArr[0], this.I000O01llI0);
/* 154 */                   il1Iii0ii1ooI0000O2 = Il1Iii0ii1oo.I0000O(iArr[1], this.I000O01llI0);
                        }
/* 160 */               mapArr[i].put("ImageWidth", il1Iii0ii1ooI0000O);
/* 165 */               mapArr[i].put("ImageLength", il1Iii0ii1ooI0000O2);
/* 168 */               return;
                    }
/* 189 */           if (il1Iii0ii1oo2 != null && il1Iii0ii1oo3 != null && il1Iii0ii1oo4 != null && il1Iii0ii1oo5 != null) {
/* 199 */               int iI0001Ioi1lo = il1Iii0ii1oo2.I0001Ioi1lo(this.I000O01llI0);
/* 205 */               int iI0001Ioi1lo2 = il1Iii0ii1oo4.I0001Ioi1lo(this.I000O01llI0);
/* 211 */               int iI0001Ioi1lo3 = il1Iii0ii1oo5.I0001Ioi1lo(this.I000O01llI0);
/* 217 */               int iI0001Ioi1lo4 = il1Iii0ii1oo3.I0001Ioi1lo(this.I000O01llI0);
/* 221 */               if (iI0001Ioi1lo2 <= iI0001Ioi1lo || iI0001Ioi1lo3 <= iI0001Ioi1lo4) {
/* 332 */                   return;
                        }
/* 229 */               Il1Iii0ii1oo il1Iii0ii1ooI0000O3 = Il1Iii0ii1oo.I0000O(iI0001Ioi1lo2 - iI0001Ioi1lo, this.I000O01llI0);
/* 235 */               Il1Iii0ii1oo il1Iii0ii1ooI0000O4 = Il1Iii0ii1oo.I0000O(iI0001Ioi1lo3 - iI0001Ioi1lo4, this.I000O01llI0);
/* 241 */               mapArr[i].put("ImageLength", il1Iii0ii1ooI0000O3);
/* 246 */               mapArr[i].put("ImageWidth", il1Iii0ii1ooI0000O4);
/* 249 */               return;
                    }
/* 256 */           Il1Iii0ii1oo il1Iii0ii1oo6 = (Il1Iii0ii1oo) mapArr[i].get("ImageLength");
/* 264 */           Il1Iii0ii1oo il1Iii0ii1oo7 = (Il1Iii0ii1oo) mapArr[i].get("ImageWidth");
/* 266 */           if (il1Iii0ii1oo6 == null || il1Iii0ii1oo7 == null) {
/* 278 */               Il1Iii0ii1oo il1Iii0ii1oo8 = (Il1Iii0ii1oo) mapArr[i].get("JPEGInterchangeFormat");
/* 288 */               Il1Iii0ii1oo il1Iii0ii1oo9 = (Il1Iii0ii1oo) mapArr[i].get("JPEGInterchangeFormatLength");
/* 290 */               if (il1Iii0ii1oo8 == null || il1Iii0ii1oo9 == null) {
/* 332 */                   return;
                        }
/* 296 */               int iI0001Ioi1lo5 = il1Iii0ii1oo8.I0001Ioi1lo(this.I000O01llI0);
/* 302 */               int iI0001Ioi1lo6 = il1Iii0ii1oo8.I0001Ioi1lo(this.I000O01llI0);
/* 307 */               il1IlIO.I0000Il00O(iI0001Ioi1lo5);
/* 310 */               byte[] bArr = new byte[iI0001Ioi1lo6];
/* 312 */               il1IlIO.readFully(bArr);
/* 320 */               I000II(new Il1Iii0iO(bArr), iI0001Ioi1lo5, i);
                    }
                }

                public final void I001lIiIIo1O() throws Throwable {
/* 3 */             I001iOo1i0O(0, 5);
/* 7 */             I001iOo1i0O(0, 4);
/* 10 */            I001iOo1i0O(5, 4);
/* 13 */            HashMap[] mapArr = this.I0001Ioi1lo;
/* 24 */            Il1Iii0ii1oo il1Iii0ii1oo = (Il1Iii0ii1oo) mapArr[1].get("PixelXDimension");
/* 34 */            Il1Iii0ii1oo il1Iii0ii1oo2 = (Il1Iii0ii1oo) mapArr[1].get("PixelYDimension");
/* 40 */            if (il1Iii0ii1oo != null && il1Iii0ii1oo2 != null) {
/* 46 */                mapArr[0].put("ImageWidth", il1Iii0ii1oo);
/* 51 */                mapArr[0].put("ImageLength", il1Iii0ii1oo2);
                    }
/* 60 */            if (mapArr[4].isEmpty() && I00100o1O0lo(mapArr[5])) {
/* 72 */                mapArr[4] = mapArr[5];
/* 79 */                mapArr[5] = new HashMap();
                    }
/* 83 */            I00100o1O0lo(mapArr[4]);
/* 90 */            I001i1O0Ol("ThumbnailOrientation", 0, "Orientation");
/* 95 */            I001i1O0Ol("ThumbnailImageLength", 0, "ImageLength");
/* 100 */           I001i1O0Ol("ThumbnailImageWidth", 0, "ImageWidth");
/* 103 */           I001i1O0Ol("ThumbnailOrientation", 5, "Orientation");
/* 106 */           I001i1O0Ol("ThumbnailImageLength", 5, "ImageLength");
/* 109 */           I001i1O0Ol("ThumbnailImageWidth", 5, "ImageWidth");
/* 112 */           I001i1O0Ol("Orientation", 4, "ThumbnailOrientation");
/* 115 */           I001i1O0Ol("ImageLength", 4, "ThumbnailImageLength");
/* 118 */           I001i1O0Ol("ImageWidth", 4, "ThumbnailImageWidth");
                }
            }
