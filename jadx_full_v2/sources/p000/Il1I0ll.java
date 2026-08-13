            package p000;

            import android.location.Location;
            import android.util.Log;
            import java.text.ParseException;
            import java.text.SimpleDateFormat;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Locale;
            
            public final class Il1I0ll {
                public static final I0OiiiO I00000oOI = new I0OiiiO(6);
                public static final I0OiiiO I0000Il00O = new I0OiiiO(7);
                public static final I0OiiiO I0000O = new I0OiiiO(8);
                public static final List I0000oI00 = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
                public static final List I0001Ioi1lo = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");
                public Il1Ilio1Ol1 I00000oIO;

                public final int I00000oIO() {
                    switch (this.I00000oIO.I0000O(0, "Orientation")) {
                        case 3:
                        case 4:
/* 20 */                    return 180;
                        case 5:
                        case 8:
/* 17 */                    return 270;
                        case 6:
                        case 7:
/* 14 */                    return 90;
                        default:
/* 3 */                     return 0;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:85:0x01ac, code lost:
                
                    if (r3.equals("M") != false) goto L83;
                 */
                /* JADX WARN: Removed duplicated region for block: B:103:0x01e4  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:128:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:132:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0115 A[Catch: ParseException -> 0x010e, TRY_ENTER, TryCatch #5 {ParseException -> 0x010e, blocks: (B:54:0x0115, B:57:0x012a), top: B:130:0x0113 }] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String toString() throws NumberFormatException {
                    char c;
                    double[] dArr;
                    char c2;
                    Il1Iii0ii1oo il1Iii0ii1ooI0000oI00;
                    double dI0000oI00;
                    boolean z;
                    String str;
                    double d;
                    Il1Iii0ii1oo il1Iii0ii1ooI0000oI002;
                    double dI0000oI002;
                    String strI0000Il00O;
                    String strI0000Il00O2;
                    String strI0000Il00O3;
                    Boolean bool;
                    long time;
                    Integer num;
                    Integer num2;
                    Location location;
                    String strI0000Il00O4;
                    long time2;
                    boolean z2;
/* 1 */             Locale locale = Locale.ENGLISH;
/* 5 */             Il1Ilio1Ol1 il1Ilio1Ol1 = this.I00000oIO;
/* 14 */            Integer numValueOf = Integer.valueOf(il1Ilio1Ol1.I0000O(0, "ImageWidth"));
/* 24 */            Integer numValueOf2 = Integer.valueOf(il1Ilio1Ol1.I0000O(0, "ImageLength"));
/* 32 */            Integer numValueOf3 = Integer.valueOf(I00000oIO());
/* 38 */            int iI0000O = il1Ilio1Ol1.I0000O(0, "Orientation");
/* 55 */            Boolean boolValueOf = Boolean.valueOf(iI0000O == 4 || iI0000O == 5 || iI0000O == 7);
/* 69 */            Boolean boolValueOf2 = Boolean.valueOf(il1Ilio1Ol1.I0000O(0, "Orientation") == 2);
/* 75 */            String strI0000Il00O5 = il1Ilio1Ol1.I0000Il00O("GPSProcessingMethod");
/* 81 */            String strI0000Il00O6 = il1Ilio1Ol1.I0000Il00O("GPSLatitude");
/* 87 */            String strI0000Il00O7 = il1Ilio1Ol1.I0000Il00O("GPSLatitudeRef");
/* 93 */            String strI0000Il00O8 = il1Ilio1Ol1.I0000Il00O("GPSLongitude");
/* 99 */            String strI0000Il00O9 = il1Ilio1Ol1.I0000Il00O("GPSLongitudeRef");
/* 103 */           if (strI0000Il00O6 != null && strI0000Il00O7 != null && strI0000Il00O8 != null && strI0000Il00O9 != null) {
                        try {
/* 119 */                   dArr = new double[]{Il1Ilio1Ol1.I00000oOI(strI0000Il00O6, strI0000Il00O7), Il1Ilio1Ol1.I00000oOI(strI0000Il00O8, strI0000Il00O9)};
/* 125 */                   c2 = 0;
                        } catch (IllegalArgumentException unused) {
/* 130 */                   c = 0;
/* 136 */                   StringBuilder sbI00111O = IIl001iO0Io.I00111O("latValue=", strI0000Il00O6, ", latRef=", strI0000Il00O7, ", lngValue=");
/* 140 */                   sbI00111O.append(strI0000Il00O8);
/* 145 */                   sbI00111O.append(", lngRef=");
/* 148 */                   sbI00111O.append(strI0000Il00O9);
/* 163 */                   Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbI00111O.toString()));
                        }
/* 172 */               il1Iii0ii1ooI0000oI00 = il1Ilio1Ol1.I0000oI00("GPSAltitude");
/* 176 */               if (il1Iii0ii1ooI0000oI00 != null) {
/* 186 */                   dI0000oI00 = -1.0d;
                        } else {
                            try {
/* 181 */                       dI0000oI00 = il1Iii0ii1ooI0000oI00.I0000oI00(il1Ilio1Ol1.I000O01llI0);
                            } catch (NumberFormatException unused2) {
                            }
                        }
/* 188 */               int i = -1;
/* 191 */               int iI0000O2 = il1Ilio1Ol1.I0000O(-1, "GPSAltitudeRef");
/* 199 */               if (dI0000oI00 >= 0.0d || iI0000O2 < 0) {
/* 215 */                   z = true;
/* 216 */                   str = strI0000Il00O5;
/* 218 */                   d = 0.0d;
                        } else {
/* 203 */                   if (iI0000O2 == 1) {
/* 205 */                       z2 = true;
                            } else {
/* 209 */                       i = 1;
/* 210 */                       z2 = true;
                            }
/* 206 */                   str = strI0000Il00O5;
/* 213 */                   d = dI0000oI00 * i;
                            z = z2;
                        }
/* 221 */               il1Iii0ii1ooI0000oI002 = il1Ilio1Ol1.I0000oI00("GPSSpeed");
/* 225 */               if (il1Iii0ii1ooI0000oI002 != null) {
/* 235 */                   dI0000oI002 = 0.0d;
                        } else {
                            try {
/* 230 */                       dI0000oI002 = il1Iii0ii1ooI0000oI002.I0000oI00(il1Ilio1Ol1.I000O01llI0);
                            } catch (NumberFormatException unused3) {
                            }
                        }
/* 238 */               strI0000Il00O = il1Ilio1Ol1.I0000Il00O("GPSSpeedRef");
/* 242 */               boolean z3 = z;
/* 246 */               if (strI0000Il00O == null) {
/* 244 */                   strI0000Il00O = "K";
                        }
/* 253 */               strI0000Il00O2 = il1Ilio1Ol1.I0000Il00O("GPSDateStamp");
/* 259 */               strI0000Il00O3 = il1Ilio1Ol1.I0000Il00O("GPSTimeStamp");
/* 263 */               I0OiiiO i0OiiiO = I0000O;
/* 265 */               long j = -1;
/* 267 */               if (strI0000Il00O2 == null || strI0000Il00O3 != null) {
                            try {
/* 276 */                       if (strI0000Il00O3 != null) {
/* 290 */                           time = ((SimpleDateFormat) I00000oOI.get()).parse(strI0000Il00O2).getTime();
                                } else if (strI0000Il00O2 == null) {
/* 311 */                           time = ((SimpleDateFormat) I0000Il00O.get()).parse(strI0000Il00O3).getTime();
                                } else {
/* 316 */                           bool = boolValueOf2;
                                    try {
/* 334 */                               time = ((SimpleDateFormat) i0OiiiO.get()).parse(IlIi0I0.I000lI(strI0000Il00O2, " ", strI0000Il00O3)).getTime();
                                    } catch (ParseException unused4) {
                                    }
                                }
/* 294 */                       bool = boolValueOf2;
                            } catch (ParseException unused5) {
                            }
                        } else {
/* 271 */                   bool = boolValueOf2;
/* 273 */                   time = -1;
                        }
/* 338 */               if (dArr != null) {
/* 340 */                   num = numValueOf;
/* 341 */                   num2 = numValueOf2;
/* 343 */                   location = null;
                        } else {
/* 350 */                   double[] dArr2 = dArr;
/* 358 */                   Location location2 = new Location(str == null ? "Il1I0ll" : str);
/* 361 */                   num = numValueOf;
/* 362 */                   num2 = numValueOf2;
/* 366 */                   location2.setLatitude(dArr2[c2]);
/* 371 */                   location2.setLongitude(dArr2[z3 ? 1 : 0]);
/* 376 */                   if (d != 0.0d) {
/* 378 */                       location2.setAltitude(d);
                            }
/* 383 */                   if (dI0000oI002 != 0.0d) {
/* 385 */                       int iHashCode = strI0000Il00O.hashCode();
/* 396 */                       if (iHashCode == 75) {
/* 432 */                           strI0000Il00O.equals("K");
                                } else if (iHashCode != 77) {
/* 404 */                           double d2 = (iHashCode == 78 && strI0000Il00O.equals("N")) ? 1.15078d : 0.621371d;
/* 420 */                           dI0000oI002 *= d2;
/* 443 */                           location2.setSpeed((float) (dI0000oI002 / 2.23694d));
                                }
/* 420 */                       dI0000oI002 *= d2;
/* 443 */                       location2.setSpeed((float) (dI0000oI002 / 2.23694d));
                            }
/* 448 */                   if (time != -1) {
/* 450 */                       location2.setTime(time);
                            }
/* 453 */                   location = location2;
                        }
/* 456 */               strI0000Il00O4 = il1Ilio1Ol1.I0000Il00O("DateTimeOriginal");
/* 460 */               if (strI0000Il00O4 != null) {
/* 478 */                   time2 = -1;
                        } else {
                            try {
/* 473 */                       time2 = ((SimpleDateFormat) i0OiiiO.get()).parse(strI0000Il00O4).getTime();
                            } catch (ParseException unused6) {
                            }
                        }
/* 482 */               if (time2 != -1) {
/* 487 */                   String strI0000Il00O10 = il1Ilio1Ol1.I0000Il00O("SubSecTimeOriginal");
/* 491 */                   if (strI0000Il00O10 != null) {
                                try {
/* 493 */                           long j2 = Long.parseLong(strI0000Il00O10);
/* 501 */                           while (j2 > 1000) {
/* 505 */                               j2 /= 10;
                                    }
/* 507 */                           j = time2 + j2;
                                } catch (NumberFormatException unused7) {
                                }
                            } else {
/* 510 */                       j = time2;
                            }
                        }
/* 533 */               return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, numValueOf3, boolValueOf, bool, location, Long.valueOf(j), il1Ilio1Ol1.I0000Il00O("ImageDescription"));
                    }
/* 167 */           c = 0;
/* 169 */           dArr = null;
                    c2 = c;
/* 172 */           il1Iii0ii1ooI0000oI00 = il1Ilio1Ol1.I0000oI00("GPSAltitude");
/* 176 */           if (il1Iii0ii1ooI0000oI00 != null) {
                    }
/* 188 */           int i2 = -1;
/* 191 */           int iI0000O22 = il1Ilio1Ol1.I0000O(-1, "GPSAltitudeRef");
/* 199 */           if (dI0000oI00 >= 0.0d) {
/* 215 */               z = true;
/* 216 */               str = strI0000Il00O5;
/* 218 */               d = 0.0d;
                    }
/* 221 */           il1Iii0ii1ooI0000oI002 = il1Ilio1Ol1.I0000oI00("GPSSpeed");
/* 225 */           if (il1Iii0ii1ooI0000oI002 != null) {
                    }
/* 238 */           strI0000Il00O = il1Ilio1Ol1.I0000Il00O("GPSSpeedRef");
/* 242 */           boolean z32 = z;
/* 246 */           if (strI0000Il00O == null) {
                    }
/* 253 */           strI0000Il00O2 = il1Ilio1Ol1.I0000Il00O("GPSDateStamp");
/* 259 */           strI0000Il00O3 = il1Ilio1Ol1.I0000Il00O("GPSTimeStamp");
/* 263 */           I0OiiiO i0OiiiO2 = I0000O;
/* 265 */           long j3 = -1;
/* 267 */           if (strI0000Il00O2 == null) {
/* 276 */               if (strI0000Il00O3 != null) {
                        }
/* 294 */               bool = boolValueOf2;
                    }
/* 338 */           if (dArr != null) {
                    }
/* 456 */           strI0000Il00O4 = il1Ilio1Ol1.I0000Il00O("DateTimeOriginal");
/* 460 */           if (strI0000Il00O4 != null) {
                    }
/* 482 */           if (time2 != -1) {
                    }
/* 533 */           return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, numValueOf3, boolValueOf, bool, location, Long.valueOf(j3), il1Ilio1Ol1.I0000Il00O("ImageDescription"));
                }
            }
