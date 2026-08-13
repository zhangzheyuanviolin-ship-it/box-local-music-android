            package com.google.android.gms.common.api;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Arrays;
            import p000.I01OlIoIl;
            import p000.IOlo10lO1iOl;
            import p000.Iol01110;
            import p000.Oi010OO0;
            import p000.iiiilIIoIi;
            import p000.l1ioii1I10Io;
            import p000.lO0IioIooIl;
            
            public final class Status extends I01OlIoIl implements ReflectedParcelable {
                public static final Parcelable.Creator<Status> CREATOR = new iiiilIIoIi(28);
                public final int I00iOIl;
                public final String I00iiI;
                public final PendingIntent I00iiO;
                public final IOlo10lO1iOl I00iio;

                public Status(int i, String str, PendingIntent pendingIntent, IOlo10lO1iOl iOlo10lO1iOl) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = str;
/* 8 */             this.I00iiO = pendingIntent;
/* 10 */            this.I00iio = iOlo10lO1iOl;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof Status)) {
/* 3 */                 return false;
                    }
/* 7 */             Status status = (Status) obj;
                    return this.I00iOIl == status.I00iOIl && l1ioii1I10Io.I00000oIO(this.I00iiI, status.I00iiI) && l1ioii1I10Io.I00000oIO(this.I00iiO, status.I00iiO) && l1ioii1I10Io.I00000oIO(this.I00iio, status.I00iio);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.I00iOIl), this.I00iiI, this.I00iiO, this.I00iio});
                }

                public final String toString() {
/* 1 */             Iol01110 iol01110I00000oOI = l1ioii1I10Io.I00000oOI(this);
/* 5 */             String strI00100l0 = this.I00iiI;
/* 7 */             if (strI00100l0 == null) {
/* 11 */                int i = this.I00iOIl;
                        switch (i) {
                            case -1:
/* 95 */                        strI00100l0 = "SUCCESS_CACHE";
                                break;
                            case 0:
/* 92 */                        strI00100l0 = "SUCCESS";
                                break;
                            case 1:
                            case 9:
                            case 11:
                            case 12:
                            default:
/* 33 */                        strI00100l0 = Oi010OO0.I00100l0(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                                break;
                            case 2:
/* 89 */                        strI00100l0 = "SERVICE_VERSION_UPDATE_REQUIRED";
                                break;
                            case 3:
/* 86 */                        strI00100l0 = "SERVICE_DISABLED";
                                break;
                            case 4:
/* 83 */                        strI00100l0 = "SIGN_IN_REQUIRED";
                                break;
                            case 5:
/* 80 */                        strI00100l0 = "INVALID_ACCOUNT";
                                break;
                            case 6:
/* 77 */                        strI00100l0 = "RESOLUTION_REQUIRED";
                                break;
                            case 7:
/* 74 */                        strI00100l0 = "NETWORK_ERROR";
                                break;
                            case 8:
/* 71 */                        strI00100l0 = "INTERNAL_ERROR";
                                break;
                            case 10:
/* 68 */                        strI00100l0 = "DEVELOPER_ERROR";
                                break;
                            case 13:
/* 65 */                        strI00100l0 = "ERROR";
                                break;
                            case 14:
/* 62 */                        strI00100l0 = "INTERRUPTED";
                                break;
                            case 15:
/* 59 */                        strI00100l0 = "TIMEOUT";
                                break;
                            case 16:
/* 56 */                        strI00100l0 = "CANCELED";
                                break;
                            case 17:
/* 53 */                        strI00100l0 = "API_NOT_CONNECTED";
                                break;
                            case PoseLandmark.RIGHT_PINKY:
/* 50 */                        strI00100l0 = "DEAD_CLIENT";
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 47 */                        strI00100l0 = "REMOTE_EXCEPTION";
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 44 */                        strI00100l0 = "CONNECTION_SUSPENDED_DURING_CALL";
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 41 */                        strI00100l0 = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 38 */                        strI00100l0 = "RECONNECTION_TIMED_OUT";
                                break;
                        }
                    }
/* 99 */            iol01110I00000oOI.I0000Il00O("statusCode", strI00100l0);
/* 106 */           iol01110I00000oOI.I0000Il00O("resolution", this.I00iiO);
/* 109 */           return iol01110I00000oOI.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 20 */            lO0IioIooIl.I000OiO(parcel, 2, this.I00iiI);
/* 26 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 31 */            lO0IioIooIl.I000OOo1O(parcel, 4, this.I00iio, i);
/* 34 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
