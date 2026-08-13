            package com.google.mlkit.vision.common.internal;

            import android.graphics.Matrix;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.I01OlIoIl;
            import p000.lO0IioIooIl;
            
            public class VisionImageMetadataParcel extends I01OlIoIl {
                public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new zzg();
                public final int height;
                public final int rotation;
                public final long timestampMillis;
                public final int width;
                public final int zza;

                public VisionImageMetadataParcel(int i, int i2, int i3, long j, int i4) {
/* 4 */             this.width = i;
/* 6 */             this.height = i2;
/* 8 */             this.zza = i3;
/* 10 */            this.timestampMillis = j;
/* 12 */            this.rotation = i4;
                }

                public Matrix getUprightRotationMatrix() {
/* 11 */            return ImageUtils.getInstance().getUprightRotationMatrix(this.width, this.height, this.rotation);
                }

                @Override
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcel);
/* 7 */             int i2 = this.width;
/* 11 */            lO0IioIooIl.I000oI1ioi(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            int i3 = this.height;
/* 20 */            lO0IioIooIl.I000oI1ioi(parcel, 2, 4);
/* 23 */            parcel.writeInt(i3);
/* 26 */            int i4 = this.zza;
/* 29 */            lO0IioIooIl.I000oI1ioi(parcel, 3, 4);
/* 32 */            parcel.writeInt(i4);
/* 35 */            long j = this.timestampMillis;
/* 39 */            lO0IioIooIl.I000oI1ioi(parcel, 4, 8);
/* 42 */            parcel.writeLong(j);
/* 45 */            int i5 = this.rotation;
/* 48 */            lO0IioIooIl.I000oI1ioi(parcel, 5, 4);
/* 51 */            parcel.writeInt(i5);
/* 54 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcel);
                }
            }
