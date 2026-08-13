            package p000;

            import com.google.mlkit.genai.common.GenAiException;
            import java.math.RoundingMode;
            import java.time.Duration;
            
            public final class ilIoOl extends Exception {
                public final int I00iOIl;
                public final iiO010lI1iO I00iiI;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0059  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ilIoOl(int i, int i2, String str, Throwable th, iiO010lI1iO iio010li1io) {
/* 2 */             String str2 = "UNKNOWN";
/* 32 */            String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? "UNKNOWN" : "METADATA_ERROR" : "CONNECTION_ERROR" : "PREPARATION_ERROR" : "INFERENCE_ERROR" : "DOWNLOAD_ERROR";
/* 38 */            if (i2 == 18 || i2 == 20) {
/* 36 */                str2 = "INTERNAL_ERROR";
                    } else if (i2 == 501) {
/* 128 */               str2 = "NOT_ENOUGH_DISK_SPACE";
                    } else if (i2 != 29) {
/* 54 */                if (i2 != 30) {
                            switch (i2) {
                                case 2:
/* 122 */                           str2 = "BAD_DATA";
                                    break;
                                case 3:
/* 119 */                           str2 = "BAD_REQUEST";
                                    break;
                                case 4:
/* 116 */                           str2 = "REQUEST_PROCESSING_ERROR";
                                    break;
                                case 5:
/* 113 */                           str2 = "COMPUTE_ERROR";
                                    break;
                                case 6:
/* 110 */                           str2 = "IPC_ERROR";
                                    break;
                                case 7:
/* 107 */                           str2 = "CANCELLED";
                                    break;
                                case 8:
/* 104 */                           str2 = "NOT_AVAILABLE";
                                    break;
                                case 9:
/* 101 */                           str2 = "BUSY";
                                    break;
                                case 10:
/* 98 */                            str2 = "SERVICE_PROCESSING_ERROR";
                                    break;
                                case 11:
/* 95 */                            str2 = "RESPONSE_PROCESSING_ERROR";
                                    break;
                                case 12:
/* 92 */                            str2 = "REQUEST_TOO_LARGE";
                                    break;
                                default:
                                    switch (i2) {
                                        case 14:
                                            break;
                                        case 15:
/* 87 */                                    str2 = "RESPONSE_GENERATION_ERROR";
                                            break;
                                        case 16:
/* 84 */                                    str2 = "NOT_SUPPORTED";
                                            break;
                                        default:
                                            switch (i2) {
                                                case 601:
/* 81 */                                            str2 = "BINDING_FAILURE";
                                                    break;
                                                case 602:
/* 78 */                                            str2 = "SERVICE_DISCONNECTED";
                                                    break;
                                                case 603:
/* 75 */                                            str2 = "BINDING_DIED";
                                                    break;
                                                case GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE:
/* 72 */                                            str2 = "NEEDS_SYSTEM_UPDATE";
                                                    break;
                                                case 605:
/* 69 */                                            str2 = "NULL_BINDING";
                                                    break;
                                                case 606:
/* 66 */                                            str2 = "FEATURE_NOT_FOUND";
                                                    break;
                                            }
                                    }
                            }
                        } else {
/* 125 */                   str2 = "BACKGROUND_USE_BLOCKED";
                        }
                    }
/* 174 */           super("AICore failed with error type " + i + "-" + str3 + " and error code " + i2 + "-" + str2 + ": " + str, th);
/* 177 */           this.I00iOIl = i2;
/* 179 */           this.I00iiI = iio010li1io;
                }

                public static ilIoOl I00000oIO(int i, Exception exc, String str) {
/* 8 */             return new ilIoOl(1, i, str, exc, null);
                }

                public static ilIoOl I00000oOI(int i, Exception exc, String str) {
/* 8 */             return new ilIoOl(2, i, str, exc, null);
                }

                public static ilIoOl I0000Il00O(int i, Exception exc, String str) {
/* 8 */             return new ilIoOl(3, i, str, exc, null);
                }

                public static ilIoOl I0000O(String str, Throwable th, int i) {
/* 8 */             return new ilIoOl(4, i, str, th, null);
                }

                public final Duration I0000oI00() {
                    iioOoiIo1 iioooiio1;
/* 1 */             iiO010lI1iO iio010li1io = this.I00iiI;
/* 3 */             if (iio010li1io == null || (iioooiio1 = iio010li1io.I00iOIl) == null) {
/* 55 */                return Duration.ZERO;
                    }
/* 9 */             double d = iioooiio1.I00ilO0;
/* 16 */            if (d >= 9.223372036854776E18d) {
/* 18 */                return li0OIIoI.I00000oOI;
                    }
/* 25 */            if (d <= -9.223372036854776E18d) {
/* 27 */                return li0OIIoI.I00000oIO;
                    }
/* 30 */            Duration duration = li0OIIoI.I00000oIO;
/* 32 */            RoundingMode roundingMode = RoundingMode.FLOOR;
/* 34 */            long jI00000oIO = li01o0OiI0l.I00000oIO(d);
/* 50 */            return Duration.ofSeconds(jI00000oIO, li01o0OiI0l.I00000oIO((d - jI00000oIO) * 1.0E9d));
                }
            }
