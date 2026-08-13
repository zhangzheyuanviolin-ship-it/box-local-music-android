            package p000;

            import android.os.RemoteException;
            import com.google.mlkit.genai.common.GenAiException;
            
            public final class iOiI1oOo1l extends Exception {
                public final int I00iOIl;

                /* JADX WARN: Illegal instructions before constructor call */
                public iOiI1oOo1l(int i, int i2, String str, Throwable th) {
                    String str2;
/* 19 */            String str3 = i != 1 ? i != 2 ? i != 3 ? "CONNECTION_ERROR" : "PREPARATION_ERROR" : "INFERENCE_ERROR" : "DOWNLOAD_ERROR";
/* 23 */            if (i2 == 15) {
/* 99 */                str2 = "RESPONSE_GENERATION_ERROR";
                    } else if (i2 == 16) {
/* 96 */                str2 = "NOT_SUPPORTED";
                    } else if (i2 != 501) {
                        switch (i2) {
                            case 2:
/* 90 */                        str2 = "BAD_DATA";
                                break;
                            case 3:
/* 87 */                        str2 = "BAD_REQUEST";
                                break;
                            case 4:
/* 84 */                        str2 = "REQUEST_PROCESSING_ERROR";
                                break;
                            case 5:
/* 81 */                        str2 = "COMPUTE_ERROR";
                                break;
                            case 6:
/* 78 */                        str2 = "IPC_ERROR";
                                break;
                            case 7:
/* 75 */                        str2 = "CANCELLED";
                                break;
                            case 8:
/* 72 */                        str2 = "NOT_AVAILABLE";
                                break;
                            case 9:
/* 69 */                        str2 = "BUSY";
                                break;
                            case 10:
/* 66 */                        str2 = "SERVICE_PROCESSING_ERROR";
                                break;
                            case 11:
/* 63 */                        str2 = "RESPONSE_PROCESSING_ERROR";
                                break;
                            case 12:
/* 60 */                        str2 = "REQUEST_TOO_LARGE";
                                break;
                            default:
                                switch (i2) {
                                    case 601:
/* 57 */                                str2 = "BINDING_FAILURE";
                                        break;
                                    case 602:
/* 54 */                                str2 = "SERVICE_DISCONNECTED";
                                        break;
                                    case 603:
/* 51 */                                str2 = "BINDING_DIED";
                                        break;
                                    case GenAiException.ErrorCode.NEEDS_SYSTEM_UPDATE:
/* 48 */                                str2 = "NEEDS_SYSTEM_UPDATE";
                                        break;
                                    case 605:
/* 45 */                                str2 = "NULL_BINDING";
                                        break;
                                    case 606:
/* 42 */                                str2 = "FEATURE_NOT_FOUND";
                                        break;
                                    default:
/* 39 */                                str2 = "UNKNOWN";
                                        break;
                                }
                        }
                    } else {
/* 93 */                str2 = "NOT_ENOUGH_DISK_SPACE";
                    }
/* 145 */           super("AICore failed with error type " + i + "-" + str3 + " and error code " + i2 + "-" + str2 + ": " + str, th);
/* 148 */           this.I00iOIl = i2;
                }

                public static iOiI1oOo1l I00000oIO(String str, Throwable th, int i) {
/* 4 */             return new iOiI1oOo1l(4, i, str, th);
                }

                public static iOiI1oOo1l I00000oOI(int i, String str, RemoteException remoteException) {
/* 4 */             return new iOiI1oOo1l(1, i, str, remoteException);
                }

                public static iOiI1oOo1l I0000Il00O(int i, Exception exc, String str) {
/* 4 */             return new iOiI1oOo1l(3, i, str, exc);
                }
            }
