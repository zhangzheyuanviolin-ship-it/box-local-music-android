            package com.google.mlkit.vision.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.lO0Iil10;
            
            public final class zzg implements Parcelable.Creator {
                @Override
                public final Object createFromParcel(Parcel parcel) {
/* 1 */             int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 8 */             int iI0010I0i = 0;
/* 9 */             int iI0010I0i2 = 0;
/* 10 */            int iI0010I0i3 = 0;
/* 11 */            int iI0010I0i4 = 0;
/* 12 */            long jI0010o = 0;
/* 17 */            while (parcel.dataPosition() < iI001i1O0Ol) {
/* 19 */                int i = parcel.readInt();
/* 23 */                char c = (char) i;
/* 25 */                if (c == 1) {
/* 67 */                    iI0010I0i = lO0Iil10.I0010I0i(i, parcel);
                        } else if (c == 2) {
/* 61 */                    iI0010I0i2 = lO0Iil10.I0010I0i(i, parcel);
                        } else if (c == 3) {
/* 55 */                    iI0010I0i3 = lO0Iil10.I0010I0i(i, parcel);
                        } else if (c == 4) {
/* 49 */                    jI0010o = lO0Iil10.I0010o(i, parcel);
                        } else if (c != 5) {
/* 39 */                    lO0Iil10.I001IO000(i, parcel);
                        } else {
/* 43 */                    iI0010I0i4 = lO0Iil10.I0010I0i(i, parcel);
                        }
                    }
/* 73 */            lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 78 */            return new VisionImageMetadataParcel(iI0010I0i, iI0010I0i2, iI0010I0i3, jI0010o, iI0010I0i4);
                }

                @Override
                public final Object[] newArray(int i) {
/* 1 */             return new VisionImageMetadataParcel[i];
                }
            }
