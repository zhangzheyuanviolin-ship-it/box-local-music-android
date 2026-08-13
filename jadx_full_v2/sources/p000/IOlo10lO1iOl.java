            package p000;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.Arrays;
            
/* 13 */    public final class IOlo10lO1iOl extends I01OlIoIl {
                public final int I00iOIl;
                public final int I00iiI;
                public final PendingIntent I00iiO;
                public final String I00iio;
                public final Integer I00ilI0I1;
                public static final IOlo10lO1iOl I00ilO0 = new IOlo10lO1iOl(0, null, null);
                public static final Parcelable.Creator<IOlo10lO1iOl> CREATOR = new i1I1lI001Io0(1);

                public IOlo10lO1iOl(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = pendingIntent;
/* 10 */            this.I00iio = str;
/* 12 */            this.I00ilI0I1 = num;
                }

                public static String I00000oOI(int i) {
/* 3 */             if (i == 99) {
/* 120 */               return "UNFINISHED";
                    }
/* 7 */             if (i == 1500) {
/* 117 */               return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                    }
                    switch (i) {
                        case -1:
/* 114 */                   return "UNKNOWN";
                        case 0:
/* 111 */                   return "SUCCESS";
                        case 1:
/* 108 */                   return "SERVICE_MISSING";
                        case 2:
/* 105 */                   return "SERVICE_VERSION_UPDATE_REQUIRED";
                        case 3:
/* 102 */                   return "SERVICE_DISABLED";
                        case 4:
/* 99 */                    return "SIGN_IN_REQUIRED";
                        case 5:
/* 96 */                    return "INVALID_ACCOUNT";
                        case 6:
/* 93 */                    return "RESOLUTION_REQUIRED";
                        case 7:
/* 90 */                    return "NETWORK_ERROR";
                        case 8:
/* 87 */                    return "INTERNAL_ERROR";
                        case 9:
/* 84 */                    return "SERVICE_INVALID";
                        case 10:
/* 81 */                    return "DEVELOPER_ERROR";
                        case 11:
/* 78 */                    return "LICENSE_CHECK_FAILED";
                        default:
                            switch (i) {
                                case 13:
/* 75 */                            return "CANCELED";
                                case 14:
/* 72 */                            return "TIMEOUT";
                                case 15:
/* 69 */                            return "INTERRUPTED";
                                case 16:
/* 66 */                            return "API_UNAVAILABLE";
                                case 17:
/* 63 */                            return "SIGN_IN_FAILED";
                                case PoseLandmark.RIGHT_PINKY:
/* 60 */                            return "SERVICE_UPDATING";
                                case PoseLandmark.LEFT_INDEX:
/* 57 */                            return "SERVICE_MISSING_PERMISSION";
                                case PoseLandmark.RIGHT_INDEX:
/* 54 */                            return "RESTRICTED_PROFILE";
                                case PoseLandmark.LEFT_THUMB:
/* 51 */                            return "API_VERSION_UPDATE_REQUIRED";
                                case PoseLandmark.RIGHT_THUMB:
/* 48 */                            return "RESOLUTION_ACTIVITY_NOT_FOUND";
                                case PoseLandmark.LEFT_HIP:
/* 45 */                            return "API_DISABLED";
                                case PoseLandmark.RIGHT_HIP:
/* 42 */                            return "API_DISABLED_FOR_CONNECTION";
                                case PoseLandmark.LEFT_KNEE:
/* 39 */                            return "API_INSTALL_REQUIRED";
                                default:
/* 34 */                            return IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, ")");
                            }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOlo10lO1iOl)) {
/* 7 */                 return false;
                    }
/* 11 */            IOlo10lO1iOl iOlo10lO1iOl = (IOlo10lO1iOl) obj;
                    return this.I00iiI == iOlo10lO1iOl.I00iiI && l1ioii1I10Io.I00000oIO(this.I00iiO, iOlo10lO1iOl.I00iiO) && l1ioii1I10Io.I00000oIO(this.I00iio, iOlo10lO1iOl.I00iio) && l1ioii1I10Io.I00000oIO(this.I00ilI0I1, iOlo10lO1iOl.I00ilI0I1);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.I00iiI), this.I00iiO, this.I00iio, this.I00ilI0I1});
                }

                public final String toString() {
/* 1 */             Iol01110 iol01110I00000oOI = l1ioii1I10Io.I00000oOI(this);
/* 13 */            iol01110I00000oOI.I0000Il00O("statusCode", I00000oOI(this.I00iiI));
/* 20 */            iol01110I00000oOI.I0000Il00O("resolution", this.I00iiO);
/* 27 */            iol01110I00000oOI.I0000Il00O("message", this.I00iio);
/* 34 */            iol01110I00000oOI.I0000Il00O("clientMethodKey", this.I00ilI0I1);
/* 37 */            return iol01110I00000oOI.toString();
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 9 */             lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.I00iOIl);
/* 18 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.I00iiI);
/* 29 */            lO0IioIooIl.I000OOo1O(parcel, 3, this.I00iiO, i);
/* 34 */            lO0IioIooIl.I000OiO(parcel, 4, this.I00iio);
/* 37 */            Integer num = this.I00ilI0I1;
/* 39 */            if (num != null) {
/* 43 */                lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 50 */                parcel.writeInt(num.intValue());
                    }
/* 53 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }

/* 14 */        public IOlo10lO1iOl(int i, PendingIntent pendingIntent, String str) {
/* 15 */            this(1, i, pendingIntent, str, null);
                }
            }
