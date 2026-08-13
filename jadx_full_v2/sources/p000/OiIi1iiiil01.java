            package p000;

            import android.os.Parcel;
            
            public final class OiIi1iiiil01 extends RuntimeException {
                public OiIi1iiiil01(String str, Parcel parcel) {
/* 1 */             int iDataPosition = parcel.dataPosition();
/* 5 */             int iDataSize = parcel.dataSize();
/* 9 */             int length = str.length();
/* 37 */            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
/* 40 */            sb.append(str);
/* 45 */            sb.append(" Parcel: pos=");
/* 48 */            sb.append(iDataPosition);
/* 53 */            sb.append(" size=");
/* 56 */            sb.append(iDataSize);
/* 63 */            super(sb.toString());
                }
            }
