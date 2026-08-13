            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.ByteOrder;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Map;
            
            public final class Il1IO1oOioO0 {
                public static final Il1O11[] I0000Il00O;
                public static final Il1O11[][] I0000O;
                public static final HashSet I0000oI00;
                public static final String I0001Ioi1lo;
                public ArrayList I00000oIO;
                public ByteOrder I00000oOI;

                static {
/* 152 */           Il1O11[] il1O11Arr = {new Il1O11(Barcode.FORMAT_QR_CODE, 3, 4, "ImageWidth"), new Il1O11(257, 3, 4, "ImageLength"), new Il1O11("Make", 271, 2), new Il1O11("Model", 272, 2), new Il1O11("Orientation", 274, 3), new Il1O11("XResolution", 282, 5), new Il1O11("YResolution", 283, 5), new Il1O11("ResolutionUnit", 296, 3), new Il1O11("Software", 305, 2), new Il1O11("DateTime", 306, 2), new Il1O11("YCbCrPositioning", 531, 3), new Il1O11("SubIFDPointer", 330, 4), new Il1O11("ExifIFDPointer", 34665, 4), new Il1O11("GPSInfoIFDPointer", 34853, 4)};
/* 618 */           Il1O11[] il1O11Arr2 = {new Il1O11("ExposureTime", 33434, 5), new Il1O11("FNumber", 33437, 5), new Il1O11("ExposureProgram", 34850, 3), new Il1O11("PhotographicSensitivity", 34855, 3), new Il1O11("SensitivityType", 34864, 3), new Il1O11("ExifVersion", 36864, 2), new Il1O11("DateTimeOriginal", 36867, 2), new Il1O11("DateTimeDigitized", 36868, 2), new Il1O11("ComponentsConfiguration", 37121, 7), new Il1O11("ShutterSpeedValue", 37377, 10), new Il1O11("ApertureValue", 37378, 5), new Il1O11("BrightnessValue", 37379, 10), new Il1O11("ExposureBiasValue", 37380, 10), new Il1O11("MaxApertureValue", 37381, 5), new Il1O11("MeteringMode", 37383, 3), new Il1O11("LightSource", 37384, 3), new Il1O11("Flash", 37385, 3), new Il1O11("FocalLength", 37386, 5), new Il1O11("SubSecTime", 37520, 2), new Il1O11("SubSecTimeOriginal", 37521, 2), new Il1O11("SubSecTimeDigitized", 37522, 2), new Il1O11("FlashpixVersion", 40960, 7), new Il1O11("ColorSpace", 40961, 3), new Il1O11(40962, 3, 4, "PixelXDimension"), new Il1O11(40963, 3, 4, "PixelYDimension"), new Il1O11("InteroperabilityIFDPointer", 40965, 4), new Il1O11("FocalPlaneResolutionUnit", 41488, 3), new Il1O11("SensingMethod", 41495, 3), new Il1O11("FileSource", 41728, 7), new Il1O11("SceneType", 41729, 7), new Il1O11("CustomRendered", 41985, 3), new Il1O11("ExposureMode", 41986, 3), new Il1O11("WhiteBalance", 41987, 3), new Il1O11("SceneCaptureType", 41990, 3), new Il1O11("Contrast", 41992, 3), new Il1O11("Saturation", 41993, 3), new Il1O11("Sharpness", 41994, 3)};
/* 760 */           Il1O11[] il1O11Arr3 = {new Il1O11("GPSVersionID", 0, 1), new Il1O11("GPSLatitudeRef", 1, 2), new Il1O11(2, 5, 10, "GPSLatitude"), new Il1O11("GPSLongitudeRef", 3, 2), new Il1O11(4, 5, 10, "GPSLongitude"), new Il1O11("GPSAltitudeRef", 5, 1), new Il1O11("GPSAltitude", 6, 5), new Il1O11("GPSTimeStamp", 7, 5), new Il1O11("GPSSpeedRef", 12, 2), new Il1O11("GPSTrackRef", 14, 2), new Il1O11("GPSImgDirectionRef", 16, 2), new Il1O11("GPSDestBearingRef", 23, 2), new Il1O11("GPSDestDistanceRef", 25, 2)};
/* 804 */           I0000Il00O = new Il1O11[]{new Il1O11("SubIFDPointer", 330, 4), new Il1O11("ExifIFDPointer", 34665, 4), new Il1O11("GPSInfoIFDPointer", 34853, 4), new Il1O11("InteroperabilityIFDPointer", 40965, 4)};
/* 823 */           I0000O = new Il1O11[][]{il1O11Arr, il1O11Arr2, il1O11Arr3, new Il1O11[]{new Il1O11("InteroperabilityIndex", 1, 2)}};
/* 838 */           I0000oI00 = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
/* 853 */           I0001Ioi1lo = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
                }

                public final Map I00000oIO(int i) {
/* 11 */            lII1OI11o1I.I0000Il00O(i, 0, 4, IIlIOloOOO.I00100l0("Invalid IFD index: ", i, ". Index should be between [0, EXIF_TAGS.length] "));
/* 20 */            return (Map) this.I00000oIO.get(i);
                }
            }
