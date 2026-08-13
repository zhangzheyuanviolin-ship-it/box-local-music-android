            package p000;

            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.time.Duration;
            
            public interface iOi1l1i1O {
                static iO0Io0 zzk(int i) {
/* 3 */             if (i == 27) {
/* 119 */               return iO0Io0.SAPI_PER_APP_BATTERY_USE_QUOTA_EXCEEDED;
                    }
/* 7 */             if (i == 28) {
/* 116 */               return iO0Io0.SAPI_PER_DEVICE_BATTERY_USE_QUOTA_EXCEEDED;
                    }
/* 11 */            if (i == 30) {
/* 113 */               return iO0Io0.SAPI_BACKGROUND_USE_BLOCKED;
                    }
/* 15 */            if (i == 501) {
/* 110 */               return iO0Io0.SAPI_NOT_ENOUGH_DISK_SPACE;
                    }
                    switch (i) {
                        case GenAiException.ErrorCode.INVALID_INPUT_IMAGE:
/* 107 */                   return iO0Io0.SAPI_INVALID_INPUT_IMAGE;
                        case GenAiException.ErrorCode.AICORE_INCOMPATIBLE:
/* 104 */                   return iO0Io0.SAPI_AICORE_INCOMPATIBLE;
                        case -100:
/* 101 */                   return iO0Io0.SAPI_REQUEST_TOO_SMALL;
                        default:
                            switch (i) {
                                case 2:
/* 98 */                            return iO0Io0.SAPI_BAD_DATA;
                                case 3:
/* 95 */                            return iO0Io0.SAPI_BAD_REQUEST;
                                case 4:
/* 92 */                            return iO0Io0.SAPI_REQUEST_PROCESSING_ERROR;
                                case 5:
/* 89 */                            return iO0Io0.SAPI_COMPUTE_ERROR;
                                case 6:
/* 86 */                            return iO0Io0.SAPI_IPC_ERROR;
                                case 7:
/* 83 */                            return iO0Io0.SAPI_CANCELLED;
                                case 8:
/* 80 */                            return iO0Io0.SAPI_NOT_AVAILABLE;
                                case 9:
/* 77 */                            return iO0Io0.SAPI_BUSY;
                                case 10:
/* 74 */                            return iO0Io0.SAPI_SERVICE_PROCESSING_ERROR;
                                case 11:
/* 71 */                            return iO0Io0.SAPI_RESPONSE_PROCESSING_ERROR;
                                case 12:
/* 68 */                            return iO0Io0.SAPI_REQUEST_TOO_LARGE;
                                case 13:
/* 65 */                            return iO0Io0.SAPI_SUSPENDED;
                                case 14:
/* 62 */                            return iO0Io0.SAPI_INTERNAL_ERROR;
                                case 15:
/* 59 */                            return iO0Io0.SAPI_RESPONSE_GENERATION_ERROR;
                                case 16:
/* 56 */                            return iO0Io0.SAPI_NOT_SUPPORTED;
                                case 17:
/* 53 */                            return iO0Io0.SAPI_SUSPENDED_STATELESS;
                                case PoseLandmark.RIGHT_PINKY:
/* 50 */                            return iO0Io0.SAPI_INTERNAL_ERROR_DOUBLE_MODEL_LOAD_ATTEMPT;
                                default:
                                    switch (i) {
                                        case 601:
/* 47 */                                    return iO0Io0.SAPI_BINDING_FAILURE;
                                        case 602:
/* 44 */                                    return iO0Io0.SAPI_SERVICE_DISCONNECTED;
                                        case 603:
/* 41 */                                    return iO0Io0.SAPI_BINDING_DIED;
                                        case GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE:
/* 38 */                                    return iO0Io0.SAPI_NEEDS_SYSTEM_UPDATE;
                                        case 605:
/* 35 */                                    return iO0Io0.SAPI_NULL_BINDING;
                                        case 606:
/* 32 */                                    return iO0Io0.SAPI_FEATURE_NOT_FOUND;
                                        case 607:
/* 29 */                                    return iO0Io0.SAPI_APK_SERVING_GROUP_MISMATCH;
                                        default:
/* 26 */                                    return iO0Io0.UNKNOWN_ERROR;
                                    }
                            }
                    }
                }

                void I00000oIO(int i, int i2);

                void I00000oOI(IOiOol0 iOiOol0, Object obj, Object obj2);

                default void I0000Il00O(IOiOol0 iOiOol0, Object obj, int i, Duration duration) {
/* 204 */           throw new UnsupportedOperationException("Count tokens not supported for this logger");
                }

                default void I0000O(Object obj, int i, int i2) {
/* 1 */             I00000oIO(i, i2);
                }

                default void I0000oI00(int i, int i2) {
/* 37 */            throw new UnsupportedOperationException("Count tokens not supported for this logger");
                }

                default void I0001Ioi1lo(Object obj, int i, int i2) {
/* 1 */             I0000oI00(i, i2);
                }

                void zza();

                void zzc();
            }
